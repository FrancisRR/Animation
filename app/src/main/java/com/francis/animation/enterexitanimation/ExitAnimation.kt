package com.francis.animation.enterexitanimation

import android.os.Bundle
import com.francis.animation.R
import com.francis.animation.base.BaseActivity

class ExitAnimation : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit_animation)
        toolbar(true,"Exit")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}
