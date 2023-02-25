package hu.codeyard.android.codeyard.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "city")
    val city: String,
    @Json(name = "street")
    val street: Street,
)