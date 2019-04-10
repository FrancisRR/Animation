package com.francis.animation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.view.View
import com.francis.animation.base.BaseActivity
import com.francis.animation.enterexitanimation.EnterAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar(true, "First screen")


        imageView.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            val pair1 = Pair<View, String>(imageView, "imageTran")
            val pair2 = Pair<View, String>(tvName, "textanimation")
            val actOpt = ActivityOptions.makeSceneTransitionAnimation(this, pair1, pair2).toBundle()
            startActivity(intent, actOpt)
        }


        btEnterExit.setOnClickListener {
            val intent = Intent(this, EnterAnimation::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }
}
