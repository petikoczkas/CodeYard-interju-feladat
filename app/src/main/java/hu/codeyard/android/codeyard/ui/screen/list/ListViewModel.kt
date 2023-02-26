package hu.codeyard.android.codeyard.ui.screen.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.codeyard.android.codeyard.data.api.model.Result
import hu.codeyard.android.codeyard.ui.PersonPresenter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val personPresenter: PersonPresenter
) : ViewModel() {

    private val _people = MutableStateFlow(emptyList<Result>())
    val people: StateFlow<List<Result>>
        get() = _people

    init {
        viewModelScope.launch {
            _people.value = personPresenter.loadPeople()
        }
    }
}