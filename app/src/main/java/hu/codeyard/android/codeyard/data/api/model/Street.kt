package hu.codeyard.android.codeyard.data.api.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Street(
    @Json(name = "name")
    val name: String,
    @Json(name = "number")
    val number: Int
)