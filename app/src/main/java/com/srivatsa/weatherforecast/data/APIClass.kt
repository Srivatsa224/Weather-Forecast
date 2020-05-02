package com.srivatsa.weatherforecast.data
import android.app.DownloadManager
import android.location.Location
import com.google.gson.annotations.SerializedName

class APIClass {
    val current: Current,
    val location: Location,
    val request: DownloadManager.Request
}




