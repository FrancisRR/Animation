package com.francis.animation.enterexitanimation

import android.content.Intent
import android.os.Bundle
import com.francis.animation.R
import com.francis.animation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_enter_animation.*

class EnterAnimation : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_animation)
        toolbar(true, "Enter")
        btExit.setOnClickListener {
            val intent = Intent(this, ExitAnimation::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}
