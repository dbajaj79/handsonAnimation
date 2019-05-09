package com.example.chapter3animationusingxmlandcode

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.chapter3animationusingxmlandcode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var activityMainBinding: ActivityMainBinding? = null
    var fadeXAnimation: Animator? = null
    var fadePAnimation: ObjectAnimator? = null
    var rotateXAnimator: Animator? = null
    var rotatePObjectAnimator: ObjectAnimator? = null
    var scaleXAnimator: Animator? = null
    var scalePObjectAnimator: ObjectAnimator? = null
    var translateXAnimator: Animator? = null
    var translatePObjectAnimator: ObjectAnimator? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    fun fadeX(v: View) {
            fadeXAnimation = AnimatorInflater.loadAnimator(this,R.animator.fade)
            fadeXAnimation!!.setTarget(activityMainBinding!!.imageTest)
            fadeXAnimation!!.apply {
                start()
            }
    }

    fun fadeP(v: View) {
        fadePAnimation = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest, "alpha", 1.0f, 0f)
        fadePAnimation!!.apply {

            duration = 1500
            repeatCount = 1
            repeatMode = ValueAnimator.REVERSE
            start()
        }

    }

    fun rotateX(v: View) {
        rotateXAnimator = AnimatorInflater.loadAnimator(this,R.animator.rotate)
        rotateXAnimator!!.setTarget(activityMainBinding!!.imageTest)
        rotateXAnimator!!.apply {
            start()
        }
    }

    fun rotateP(v: View) {
            rotatePObjectAnimator = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"rotationX",0f,180f)
            rotatePObjectAnimator!!.apply {
                duration = 1500
                repeatMode = ValueAnimator.REVERSE
                repeatCount =1
                start()
            }
    }

    fun scaleX(v: View) {
        scaleXAnimator = AnimatorInflater.loadAnimator(this,R.animator.scale)
        scaleXAnimator!!.setTarget(activityMainBinding!!.imageTest)
        scaleXAnimator!!.apply {
            start()
        }

    }

    fun scaleP(v: View) {
        scalePObjectAnimator = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"scaleX",1f,3f)
        scalePObjectAnimator!!.apply {
            duration = 1500
            repeatCount = 1
            repeatMode = ValueAnimator.REVERSE
            start()
        }

    }

    fun translateX(v: View) {
        translateXAnimator = AnimatorInflater.loadAnimator(this,R.animator.translate)
        translateXAnimator!!.setTarget(activityMainBinding!!.imageTest)
        translateXAnimator!!.apply {
            start()
        }

    }

    fun translateP(v: View) {
            translatePObjectAnimator = ObjectAnimator.ofFloat(activityMainBinding!!.imageTest,"translationX",0f,200f)
            translatePObjectAnimator!!.apply {
                duration = 1500
                repeatMode = ValueAnimator.REVERSE
                repeatCount = 1
                start()
            }

    }

}
