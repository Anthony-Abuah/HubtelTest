package com.example.hubteltest.view_model

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hubteltest.repository.TransactionsRepository
import com.example.hubteltest.util.Resource
import com.example.hubteltest.view_model.state.TransactionsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TransactionsViewModel @Inject constructor(
    private val transactionsRepository: TransactionsRepository
): ViewModel() {


    private val _transactionsState = mutableStateOf(TransactionsState())
    val transactionsState: State<TransactionsState> = _transactionsState


    fun getAllTransactions() = viewModelScope.launch {
        transactionsRepository.getAllTransactions().onEach { response ->
            when (response) {
                is Resource.Success -> {
                    _transactionsState.value = _transactionsState.value.copy(
                        transactions = response.data ?: emptyFlow(),
                        isLoading = false
                    )
                }
                is Resource.Error -> {
                    _transactionsState.value = _transactionsState.value.copy(
                        transactions = response.data ?: emptyFlow(),
                        isLoading = true
                    )
                }
                is Resource.Loading -> {
                    _transactionsState.value = _transactionsState.value.copy(
                        transactions = response.data ?: emptyFlow(),
                        isLoading = true
                    )
                }

            }
        }
    }
}