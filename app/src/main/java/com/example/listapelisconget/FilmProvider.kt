package com.example.listapelisconget

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(
                film = "Encanto",
                photo="https://lumiere-a.akamaihd.net/v1/images/encanto_ka_las_pay1_92ad7410.jpeg"
            ),
            Film(
                film = "Inside out",
                photo="https://lumiere-a.akamaihd.net/v1/images/homepage_hero_mobile_insideout_streetmessageupdate_span_0aea4bd0.jpeg"
            ),
            Film(
                film = "Frozen 2",
                photo="https://lumiere-a.akamaihd.net/v1/images/image_07f1aaf3.jpeg"
            ),
            Film(
                film = "Luca",
                photo="https://lumiere-a.akamaihd.net/v1/images/sdk_latam_payoff_localized_bpo_6e4f16c1.jpeg?region=0%2C0%2C2100%2C3000"
            ),
            Film(
                film = "Avatar",
                photo="https://i.blogs.es/4b382c/avatardvd/450_1000.jpg"
            ),
        )
    }
}