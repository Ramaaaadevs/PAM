package id.ac.itera.tugas1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform