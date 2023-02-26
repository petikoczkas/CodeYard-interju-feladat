package hu.codeyard.android.codeyard.data.api.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Result(
    @Json(name = "cell")
    val cell: String,
    @Json(name = "email")
    val email: String,
    @Json(name = "location")
    val location: Location,
    @Json(name = "name")
    val name: Name,
    @Json(name = "phone")
    val phone: String,
    @Json(name = "picture")
    val picture: Picture,
) : Parcelable