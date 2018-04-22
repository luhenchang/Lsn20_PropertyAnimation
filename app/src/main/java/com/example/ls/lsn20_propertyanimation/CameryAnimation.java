package com.example.ls.lsn20_propertyanimation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by 路很长~ on 2018/4/19.
 */
public class CameryAnimation extends Animation {

    // Camera实例可以用于计算三维变换并且生成可应用于，例如，画布上的矩阵(matrix)。
    private Camera mCamera;
    private float mCenterX;
    private float mCenterY;
    private Mode mMode;

    public CameryAnimation( float centerX, float centerY,
                            Mode mode) {
        mCenterX = centerX;
        mCenterY = centerY;
        mMode = mode;
    }

    /**
     * initialize这是一个回调函数告诉Animation目标View的大小参数，
     * 在这里可以初始化一些相关的参数，例如设置动画持续时间、设置 Interpolator、 设置动画的参考点等。
     */
    @Override
    public void initialize( int width, int height, int parentWidth, int parentHeight)
    {
        super.initialize(width, height, parentWidth, parentHeight);
        mCamera = new Camera();
    }

    /**
     * applyTransformation 在动画过程中 会不断的调用 每次调用参数interpolatedTime值都会变化，
     * 该参数从0渐变为1，当该参数为1时表明动画结束。
     */

    @Override
    protected void applyTransformation( float interpolatedTime,
                                        Transformation t) {
        float deg = 0.0F + 360.0F * interpolatedTime;
        // Matrix类拥有一个3x3矩阵变换坐标。(The Matrix class holds a 3x3 matrix for transforming coordinates).
        Matrix matrix = t.getMatrix();
        mCamera.save();
        if ( mMode == Mode. X)
            // 绕x轴应用旋转变换(Applies a rotation transform around the X axis)。
            mCamera.rotateX(deg);
        if ( mMode == Mode. Y)
            mCamera.rotateY(deg);
        if ( mMode == Mode. Z)
            mCamera.rotateZ(deg);
        // 计算当前转换(transformation)所对应的矩阵(matrix)并且把它copy到所提供的矩阵对象中(matrix object)
        mCamera.getMatrix(matrix);
        mCamera.restore();
        // 旋转变换前平移图片使图片中心于基准点中心重合（基准点中心就是图片左上角的位置）
        matrix.preTranslate(- mCenterX, - mCenterY);
        // 旋转变换后将图片移回原来位置
        matrix.postTranslate( mCenterX, mCenterY);

    }

    public enum Mode {
        X, Y, Z;
    }
}
