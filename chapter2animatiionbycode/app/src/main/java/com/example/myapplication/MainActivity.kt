package com.example.myapplication

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Animator.AnimatorListener{
    override fun onAnimationRepeat(animation: Animator?) {
        Toast.makeText(this,"Animation Repeated",Toast.LENGTH_LONG).show()
    }

    override fun onAnimationEnd(animation: Animator?) {

        Toast.makeText(this,"Animation Ended",Toast.LENGTH_LONG).show()
    }

    override fun onAnimationCancel(animation: Animator?) {

        Toast.makeText(this,"animation Cnacelled",Toast.LENGTH_LONG).show()
    }

    override fun onAnimationStart(animation: Animator?) {
        Toast.makeText(this,"animation Start",Toast.LENGTH_LONG).show()
    }

    var  activityMainBinding:ActivityMainBinding?=null
    var  fadeAnimator:ObjectAnimator? = null
    var  rotateAnimator:ObjectAnimator? = null
    var  scaleAnimator: ObjectAnimator? = null
    var  tranistion: ObjectAnimator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    }
     fun rotate(v: View)
    {
        rotateAnimator = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"rotationX",0f,180f)
        rotateAnimator!!.apply {
            duration = 1500
            repeatCount =1
            repeatMode = ValueAnimator.REVERSE
            start()
            addListener(this@MainActivity)
        }


    }

    fun fade(v:View)
    {
        fadeAnimator = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"alpha",1.0f,0.0f)
        fadeAnimator!!.apply {
            duration = 1000
            repeatCount =1
            repeatMode = ValueAnimator.REVERSE
            start()
            addListener(this@MainActivity)
        }

    }
    fun scale(v:View)
    {
        scaleAnimator = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"scaleX",1.0f,2.0f)
        scaleAnimator!!.apply {
            repeatCount =1
            duration = 1500
            repeatMode = ValueAnimator.REVERSE
            start()
            addListener(this@MainActivity)
        }

    }
    fun transition(v:View)
    {
        tranistion = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"translationX",0f,200f)
        tranistion!!.apply {
            repeatMode = ValueAnimator.REVERSE
            duration = 1500
            repeatCount =1
            start()
            addListener(this@MainActivity)

        }

    }
}
