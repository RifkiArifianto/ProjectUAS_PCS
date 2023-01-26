package com.aplikasi.tokosi04.response.transaksi

data class TransaksiResponsePost(
    val `data`: TransaksiData,
    val message: String,
    val successs: Boolean
)

data class TransaksiData(
    val `transaksi`: Transaksi,
)