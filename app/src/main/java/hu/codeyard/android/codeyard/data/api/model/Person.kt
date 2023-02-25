package hu.codeyard.android.codeyard.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Person(
    @Json(name = "results")
    val results: List<Result>
)