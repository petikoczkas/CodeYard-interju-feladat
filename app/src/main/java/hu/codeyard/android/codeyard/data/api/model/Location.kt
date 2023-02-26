package hu.codeyard.android.codeyard.data.api.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Location(
    @Json(name = "country")
    val country: String,
    @Json(name = "city")
    val city: String,
) : Parcelable