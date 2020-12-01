package com.mingle.chatapp.data.remote.sources

import com.google.gson.annotations.SerializedName

data class VerticleMovieData(
    @SerializedName("photos")
    val photos : Photos
)

data class Photos(
    @SerializedName("page")
    val page : Int,
    @SerializedName("pages")
    val pages : Int,
    @SerializedName("perpage")
    val perpage : Int,
    @SerializedName("total")
    val total : String,
    @SerializedName("photo")
    val photo : List<Photo>
)

data class Photo(
    @SerializedName("id")
    val id : String,
    @SerializedName("owner")
    val owner : String,
    @SerializedName("secret")
    val secret : String,
    @SerializedName("server")
    val server : String,
    @SerializedName("farm")
    val farm : String,
    @SerializedName("title")
    val title : String,
    @SerializedName("ispublic")
    val ispublic : String,
    @SerializedName("isfriend")
    val isfriend : String,
    @SerializedName("isfamily")
    val isfamily : String
)

data class VerticalDataRequest(val page: Int, val per_page: Int)
