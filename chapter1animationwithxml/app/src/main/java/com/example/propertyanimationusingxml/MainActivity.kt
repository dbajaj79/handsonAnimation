package com.example.propertyanimationusingxml

import android.animation.Animator
import android.animation.AnimatorInflater
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.propertyanimationusingxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var activityMainBinding:ActivityMainBinding? = null
    var fadAnimator:Animator ? = null
    var scaleAnimator:Animator? = null
    var rotateAnimation: Animator? = null
    var tranistionAnimator:Animator? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)

    }

    fun fade(v: View)
    {
        fadAnimator = AnimatorInflater.loadAnimator(this,R.animator.alphaanimation)
        fadAnimator!!.apply {
            setTarget(activityMainBinding!!.imageCompass)
            start()
        }
            Toast.makeText(this,"I am in Fade",Toast.LENGTH_LONG).show()
    }
    fun rotate(v:View)
    {
        rotateAnimation = AnimatorInflater.loadAnimator(this,R.animator.rotate)
        rotateAnimation!!.apply {
            setTarget(activityMainBinding!!.imageCompass)
            start()
        }
        Toast.makeText(this,"I am in Rotate",Toast.LENGTH_LONG).show()
    }
    fun scale(v:View)
    {
        scaleAnimator = AnimatorInflater.loadAnimator(this,R.animator.scaleanimation)
        scaleAnimator!!.apply {
            setTarget(activityMainBinding!!.imageCompass)
            start()

        }
        Toast.makeText(this,"I am in Scale",Toast.LENGTH_LONG).show()
    }
    fun  transition(v:View)
    {
        tranistionAnimator = AnimatorInflater.loadAnimator(this,R.animator.transition)
        tranistionAnimator!!.apply {
            setTarget(activityMainBinding!!.imageCompass)
            start()
        }
        Toast.makeText(this,"I am in Transition",Toast.LENGTH_LONG).show()
    }
}
