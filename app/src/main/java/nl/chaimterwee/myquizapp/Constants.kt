package nl.chaimterwee.myquizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // Q1
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Armenia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        // Q2
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Andorra",
            "Armenia",
            "Australia",
            "Austria",
            3
        )
        questionsList.add(que2)

        // Q3
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "France",
            "Belgium",
            "Iceland",
            3
        )
        questionsList.add(que3)

        // Q4
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Maldives",
            "Fiji",
            "New Zealand",
            "Iceland",
            2
        )
        questionsList.add(que4)

        // Q5
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Bulgaria",
            "South Africa",
            "Peru",
            "Brazil",
            4
        )
        questionsList.add(que5)

        // Q6
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Switzerland",
            "Denmark",
            "Austria",
            "Finland",
            2
        )
        questionsList.add(que6)

        // Q7
        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Pakistan",
            "Afghanistan",
            "India",
            "Belarus",
            3
        )
        questionsList.add(que7)

        // Q8
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Syria",
            "Lebanon",
            "Israel",
            1
        )
        questionsList.add(que8)

        return questionsList
    }
}