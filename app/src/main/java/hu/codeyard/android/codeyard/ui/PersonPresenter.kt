package hu.codeyard.android.codeyard.ui

import hu.codeyard.android.codeyard.data.api.PersonInteractor
import hu.codeyard.android.codeyard.data.api.model.Result
import javax.inject.Inject

class PersonPresenter @Inject constructor(
    private val personInteractor: PersonInteractor
) {
    suspend fun loadPeople(): List<Result> {
        return personInteractor.getPeople()
    }
}