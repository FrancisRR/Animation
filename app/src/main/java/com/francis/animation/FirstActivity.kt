package com.francis.animation

import android.os.Bundle
import com.francis.animation.base.BaseActivity

class FirstActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        toolbar(true, "Second screen")
    }


}
