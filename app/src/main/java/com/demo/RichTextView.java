package com.demo;

import android.animation.LayoutTransition;
import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * Created by shiming on 2017/8/7.
 * 需要滚动，嵌套
 */

public class RichTextView  extends NestedScrollView {

    private LayoutInflater mInflater;
    private LinearLayout mLinearLayout;

    public RichTextView(Context context) {
        this(context,null);
    }

    public RichTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RichTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = LayoutInflater.from(context);
        mLinearLayout = new LinearLayout(context);
        mLinearLayout.setVerticalGravity(LinearLayout.VERTICAL);
        //布局会不断的变化，所以需要过渡的动画，替换掉，我们的gone 或者是 show
        LayoutTransition layoutTransition = new LayoutTransition();
        mLinearLayout.setLayoutTransition(layoutTransition);
        layoutTransition.addTransitionListener(new LayoutTransition.TransitionListener() {
            @Override
            public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {

            }

            @Override
            public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {

            }
        });
    }
}
