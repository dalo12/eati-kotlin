package edu.eati25.kmp.movies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform