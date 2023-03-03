package com.multiplatforge.chatgpt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform