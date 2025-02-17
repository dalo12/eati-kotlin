package edu.eati25.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform