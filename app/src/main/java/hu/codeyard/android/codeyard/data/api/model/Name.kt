package hu.codeyard.android.codeyard.data.api.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Name(
    @Json(name = "first")
    val first: String,
    @Json(name = "last")
    val last: String,
    @Json(name = "title")
    val title: String
) : Parcelable