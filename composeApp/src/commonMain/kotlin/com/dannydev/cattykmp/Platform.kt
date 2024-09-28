package com.dannydev.cattykmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform