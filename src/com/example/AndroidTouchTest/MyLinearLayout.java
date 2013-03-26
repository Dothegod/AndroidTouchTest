package com.example.AndroidTouchTest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created with IntelliJ IDEA.
 * User: dothegod
 * Date: 3/24/13
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyLinearLayout extends LinearLayout {
    private final String TAG = "MyLinearLayout";

    public MyLinearLayout(Context context, AttributeSet attrs) {

        super(context, attrs);

        Log.d(TAG, TAG);

        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();

                switch (action) {

                    case MotionEvent.ACTION_DOWN:

                        Log.d(TAG, "onTouch action:ACTION_DOWN");

                        break;

                    case MotionEvent.ACTION_MOVE:

                        Log.d(TAG, "onTouch action:ACTION_MOVE");

                        break;

                    case MotionEvent.ACTION_UP:

                        Log.d(TAG, "onTouch action:ACTION_UP");

                        break;

                    case MotionEvent.ACTION_CANCEL:

                        Log.d(TAG, "onTouch action:ACTION_CANCEL");

                        break;

                }
                boolean flag = false;
                Log.d(TAG, "onTouch action: FORCE SET flag " + (flag == true? "true":"false"));
                return flag;
            }
        });

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "dispatchTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "dispatchTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "dispatchTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "dispatchTouchEvent action:ACTION_CANCEL");

                break;

        }
        boolean flag = super.dispatchTouchEvent(ev);
        Log.d(TAG, "dispatchTouchEvent action: flag " + (flag == true? "true":"false"));
//        flag = true;
//        Log.d(TAG, "dispatchTouchEvent action: FORCE SET flag " + (flag == true? "true":"false"));
        return flag;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "onInterceptTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "onInterceptTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "onInterceptTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "onInterceptTouchEvent action:ACTION_CANCEL");

                break;

        }

        boolean flag = super.onInterceptTouchEvent(ev);
        Log.d(TAG, "onInterceptTouchEvent action: flag " + (flag == true? "true":"false"));
//        flag = true;
//        Log.d(TAG, "onInterceptTouchEvent action: FORCE SET flag " + (flag == true? "true":"false"));
        return flag;

    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        int action = ev.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                Log.d(TAG, "---onTouchEvent action:ACTION_DOWN");

                break;

            case MotionEvent.ACTION_MOVE:

                Log.d(TAG, "---onTouchEvent action:ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:

                Log.d(TAG, "---onTouchEvent action:ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:

                Log.d(TAG, "---onTouchEvent action:ACTION_CANCEL");

                break;

        }

        boolean flag = super.onTouchEvent(ev);
        Log.d(TAG, "---onTouchEvent action: flag " + (flag == true? "true":"false"));
//        flag = true;
//        Log.d(TAG, "---onTouchEvent action: FORCE SET flag " + (flag == true? "true":"false"));
        return flag;
    }

}