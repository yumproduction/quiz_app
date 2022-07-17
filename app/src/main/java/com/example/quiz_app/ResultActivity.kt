package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val userName = intent.getStringExtra(Constants.USER_NAME)
        val correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        val totalScore = intent.getStringExtra(Constants.TOTAL_SCORE)

        tv_name.text = userName
        tv_score.text = "Your score is $correctAnswers out of $totalScore"

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}