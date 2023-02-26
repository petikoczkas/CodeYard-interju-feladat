package hu.codeyard.android.codeyard.data.api

import hu.codeyard.android.codeyard.data.api.model.Person
import retrofit2.http.GET

interface PersonAPI {
    @GET("?results=20")
    suspend fun getPeople(): Person
}