package com.example.ls.lsn20_propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int index;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                *//*
                //位移动画
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                button.setAnimation(animation);
                TranslateAnimation translateAnimation=new TranslateAnimation(0,200,0,200);
                AlphaAnimation translateAnimation=new AlphaAnimation(0.5f,1f);
                translateAnimation.setDuration(3000);
                translateAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                translateAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                translateAnimation.setFillAfter(true);
                *//*

               *//*
                //渐变动画
                AlphaAnimation alphaAnimation=new AlphaAnimation(0.5f,1f);
                alphaAnimation.setDuration(3000);
                alphaAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                alphaAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                alphaAnimation.setFillAfter(true);
                button.startAnimation(alphaAnimation);*//*

               *//*
               * //旋转动画
               * public RotateAnimation(float fromDegrees, float toDegrees) {
               *
                RotateAnimation rotateAnimation=new RotateAnimation(0,90);
                rotateAnimation.setDuration(3000);
                rotateAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                rotateAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                rotateAnimation.setFillAfter(true);
                button.startAnimation(rotateAnimation);*//*

               *//*
               * 缩放动画
               *
               *
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 0.7f, 0.5f, 0.7f);
                scaleAnimation.setDuration(3000);
                scaleAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                scaleAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                scaleAnimation.setFillAfter(true);
                button.startAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation=new AlphaAnimation(0.5f,1f);
                alphaAnimation.setDuration(3000);
                alphaAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                alphaAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                alphaAnimation.setFillAfter(true);
                button.startAnimation(alphaAnimation);

                RotateAnimation rotateAnimation=new RotateAnimation(0,90);
                rotateAnimation.setDuration(3000);
                rotateAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                rotateAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                rotateAnimation.setFillAfter(true);
                button.startAnimation(rotateAnimation);

                ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 0.7f, 0.5f, 0.7f);
                scaleAnimation.setDuration(3000);
                scaleAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                scaleAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                scaleAnimation.setFillAfter(true);
                button.startAnimation(scaleAnimation);

                //动画集合
                AnimationSet animationSet=new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(rotateAnimation);
                animationSet.addAnimation(scaleAnimation);


                animationSet.setDuration(2000);
                animationSet.setRepeatMode(AnimationSet.INFINITE);
                animationSet.setRepeatCount(AnimationSet.INFINITE);

                CameryAnimation cameryAnimation=new CameryAnimation(10f,101f, CameryAnimation.Mode.Z);
                cameryAnimation.start();
                cameryAnimation.setDuration(3000);
                cameryAnimation.setRepeatMode(TranslateAnimation.INFINITE);
                cameryAnimation.setRepeatCount(TranslateAnimation.INFINITE);
                cameryAnimation.setFillAfter(true);
                button.setAnimation(cameryAnimation);
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);*//*
            }
        });*/

    }

    public void buttontrans(View view) {
     /*   index += 100;
        view.setTranslationX(index);
        view.setTranslationY(index);
        Random random=new Random(1);
        view.setAlpha(random.nextFloat());*/

        /*//方法一：
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "translationX", 0f, 300f);
        objectAnimator.setDuration(4000);
        objectAnimator.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator.start();


        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(view, "translationY", 0f, 300f);
        objectAnimator1.setDuration(7000);
        objectAnimator1.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator1.start();


        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleX", 0.2f, 1f);
        objectAnimator2.setDuration(6000);
        objectAnimator2.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator2.start();

        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(view, "scaleY", 0.2f, 1f);
        objectAnimator3.setDuration(6000);
        objectAnimator3.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator3.start();

        ObjectAnimator objectAnimator4=ObjectAnimator.ofFloat(view,"alpha",0.5f,1f);
        objectAnimator4.setDuration(6000);
        objectAnimator4.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator4.start();
*/

/*-----------------------------------------------------------------------------------------------------------------------------------------------------*/
        //2.----------------多个动画同时执行--方法1：设置动画监听，开始第一
        //方法1：
     /*   ObjectAnimator animator = ObjectAnimator.ofFloat(button, "haha", 0f, 100f);//没有这个属性的时候，就是valueanimator
        animator.setDuration(300);
        //设置动画监听
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                //动画在执行的过程当中，不断地调用此方法
//				animation.getAnimatedFraction()//百分比
                //得到duration时间内 values当中的某一个中间值。0f~100f
                float value = (float) animation.getAnimatedValue();//
                button.setScaleX(0.5f + value / 200);//0.5~1
                button.setScaleY(0.5f + value / 200);//0.5~1
            }
        });
        animator.start();*/

/*---------------------------------------------------------------------------------------------------*/
/*        ValueAnimator valueAnimator=ValueAnimator.ofFloat(0f,200f);
        valueAnimator.setDuration(200);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                //				//动画在执行的过程当中，不断地调用此方法
////			animation.getAnimatedFraction()//百分比
//			//得到duration时间内 values当中的某一个中间值。0f~100f
                float value = (float) animation.getAnimatedValue();//
                button.setScaleX(0.5f + value / 200);//0.5~1
                button.setScaleY(0.5f + value / 200);//0.5~1
            }
        });

        valueAnimator.start();*/

        //3）方法3
        //float... values:代表关键帧的值
		PropertyValuesHolder holder1 = PropertyValuesHolder.ofFloat("alpha", 1f,0.7f,1f);
		PropertyValuesHolder holder2 = PropertyValuesHolder.ofFloat("scaleX", 1f,0.7f,1f);
		PropertyValuesHolder holder3 = PropertyValuesHolder.ofFloat("scaleY", 1f,0.7f,1f);
//		PropertyValuesHolder holder3 = PropertyValuesHolder.ofFloat("translationX", 0f,300f);

		ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(button, holder1,holder2,holder3);
		animator.setDuration(1000);
		animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				// TODO Auto-generated method stub
				float animatedValue = (float) animation.getAnimatedValue();
				float animatedFraction = animation.getAnimatedFraction();
				long playTime = animation.getCurrentPlayTime();

				System.out.println("animatedValue:"+animatedValue+",  playTime:"+playTime);
			}
		});
		//animator.start();
/*----------------------------------------------------------------------------*/
		//4)方法4：-----------------动画集合--------------------
		ObjectAnimator animator1 = ObjectAnimator.ofFloat(button,"alpha", 1f,0.7f,1f);
		ObjectAnimator animator2 = ObjectAnimator.ofFloat(button,"scaleX", 1f,0.7f,1f);
		ObjectAnimator animator3 = ObjectAnimator.ofFloat(button,"scaleY", 1f,0.7f,1f);

		AnimatorSet animatorSet = new AnimatorSet();
		animatorSet.setDuration(500);
//		animatorSet.play(anim);//执行当个动画
//		animatorSet.playTogether(animator1,animator2,animator3);//同时执行
		animatorSet.playSequentially(animator1,animator2,animator3);//依次执行动画
		//animatorSet.start();




		/*-------------------------------------------------------------------------------*/


		ValueAnimator valueAnimator=new ValueAnimator();
		valueAnimator.setDuration(4000);
		valueAnimator.setObjectValues(new PointF(0,0));//起点坐标
        //估值器：====定义计算规则
		valueAnimator.setEvaluator(new TypeEvaluator<PointF>() {
			@Override
			public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
				//拿到每一个时间点的坐标：
				//x
				PointF pointF=new PointF();
				//x=vt
				pointF.x=100f*fraction*4;//初始速度*执行的百分比
				pointF.y=0.5f*100f*(fraction*4)*(fraction*4);//为了30明显我把g设置成


				return pointF;
			}

		});

		valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				//得到此事件点的坐标
				PointF pointF= (PointF) animation.getAnimatedValue();


				button.setX(pointF.x);
				button.setY(pointF.y);
			}
		});

		valueAnimator.start();


		ObjectAnimator oa = ObjectAnimator.ofFloat(button, "translationY", 0f,1100f);
		oa.setDuration(500);
		//设置加速器---
//		oa.setInterpolator(new AccelerateInterpolator(5));
//		oa.setInterpolator(new AccelerateDecelerateInterpolator());
//		oa.setInterpolator(new AnticipateInterpolator(8));
//		oa.setInterpolator(new OvershootInterpolator());
//		oa.setInterpolator(new CycleInterpolator(4));
		oa.setInterpolator(new BounceInterpolator());

		oa.start();

    }



}
