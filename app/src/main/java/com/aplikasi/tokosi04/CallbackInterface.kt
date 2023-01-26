package com.aplikasi.tokosi04

import com.aplikasi.tokosi04.response.cart.Cart

interface CallbackInterface {
    fun passResultCallback(total:String, cart:ArrayList<Cart>)
}