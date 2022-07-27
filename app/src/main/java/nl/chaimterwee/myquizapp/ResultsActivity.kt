package nl.chaimterwee.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {
    private var tvScore: TextView? = null
    private var tvUsername: TextView? = null
    private var btnFinish: Button? = null
    private var mUsername: String? = null
    private var mTotalQuestions: String? = null
    private var mCorrectAnswers: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        mUsername = intent.getStringExtra(Constants.USER_NAME)
        mTotalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        mCorrectAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        tvScore = findViewById(R.id.tv_score)
        tvUsername = findViewById(R.id.tv_username)
        btnFinish = findViewById(R.id.btn_finish)

        tvUsername?.text = mUsername
        tvScore?.text = "Your score is $mCorrectAnswers out of $mTotalQuestions"

        btnFinish?.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}