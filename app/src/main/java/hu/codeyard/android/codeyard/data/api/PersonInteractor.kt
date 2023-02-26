package hu.codeyard.android.codeyard.data.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import hu.codeyard.android.codeyard.data.api.model.Result
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class PersonInteractor @Inject constructor() {

    private val personAPI: PersonAPI

    init {
        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://randomuser.me/api/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()

        this.personAPI = retrofit.create(PersonAPI::class.java)
    }

    suspend fun getPeople(): List<Result> {
        return personAPI.getPeople().results
    }
}