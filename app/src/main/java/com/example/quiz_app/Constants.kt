package com.example.quiz_app

object Constants {
    fun questions(): ArrayList<Question> {
        var questionList = ArrayList<Question>()

        questionList.add(
            Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Australia",
                "Argentina",
                "Denmark",
                "Brazil",
                2,
            ),
        )

        questionList.add(
            Question(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "Australia",
                "Argentina",
                "Denmark",
                "Brazil",
                4,
            ),
        )
        questionList.add(
            Question(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                "Australia",
                "Argentina",
                "Denmark",
                "Brazil",
                1,
            ),
        )

        questionList.add(
            Question(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                "Australia",
                "Argentina",
                "Denmark",
                "Brazil",
                3,
            ),
        )


        return questionList
    }
}