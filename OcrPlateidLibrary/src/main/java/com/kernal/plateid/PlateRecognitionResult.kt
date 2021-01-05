package com.kernal.plateid

sealed class PlateRecognitionResult {

    data class Success(val plate: String, val base64Data: String) : PlateRecognitionResult()

    data class Error(val message: String) : PlateRecognitionResult()
}
