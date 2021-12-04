package casa.assuncao.kotlinrecyclerview

import casa.assuncao.kotlinrecyclerview.models.Live

class DataSource {

    companion object {

        fun createDataSet() : ArrayList<Live> {

            val list = ArrayList<Live>()

            list.add(
                Live(
                    "Zé Felipe e Marcynho Sensação",
                    "Revoada No Colchão (Videoclipe Oficial)",
                    "http://i3.ytimg.com/vi/0jnZreO4Dvs?t=10/hqdefault.jpg",
                    "https://youtu.be/0jnZreO4Dvs?t=10"
                )
            )

            list.add(
                Live(
                    "Zé Felipe e Os Barões Da Pisadinha",
                    "Senta Danada (Videoclipe Oficial)",
                    "http://i3.ytimg.com/vi/kI5mmq5QIz4/hqdefault.jpg",
                    "https://www.youtube.com/watch?v=kI5mmq5QIz4&ab_channel=Z%C3%A9Felipe"
                )
            )

            list.add(
                Live(
                    "Zé Felipe e MC Danny",
                    "Toma Toma Vapo Vapo (Videoclipe Oficial)",
                    "http://i3.ytimg.com/vi/ey6H_cBy-OQ/maxresdefault.jpg",
                    "https://youtu.be/ey6H_cBy-OQ"
                )
            )

            list.add(
                Live(
                    "Zé Felipe e Virginia",
                    "Revoada No Colchão (Videoclipe Oficial)",
                    "http://i3.ytimg.com/vi/ey6H_cBy-OQ/hqdefault.jpg",
                    "https://youtu.be/0jnZreO4Dvs?t=10"
                )
            )

            list.add(
                Live(
                    "Zé Felipe e Gusttavo Lima",
                    "Esquece De Me Esquecer (Videoclipe Oficial)",
                    " http://i3.ytimg.com/vi/Xo4cNdbwLlk/hqdefault.jpg ",
                    "https://youtu.be/Xo4cNdbwLlk"
                )
            )

            list.add(
                Live(
                    "Zé Felipe e Gusttavo Lima",
                    "Tiro Certo (Videoclipe Oficial)",
                    " http://i3.ytimg.com/vi/7LmTa4Pg7Fs/hqdefault.jpg ",
                    "https://youtu.be/7LmTa4Pg7Fs"
                )
            )

        return list
        }
    }
}