package com.example.yangyankai.t;

import android.animation.LayoutTransition;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = (LinearLayout) findViewById(R.id.mLayout);
//        addOne();
//        addTwo();
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOne();
            }
        });
    }

    private void addTwo() {
        FrameLayout framelayout = new FrameLayout(this);
        TextView text = new TextView(this);//
        text.setText("动态添加布局和控件");
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT //创建保存布局参数的对象
        );
        params.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;//设置居中显示
        text.setLayoutParams(params);//设置布局参数
        framelayout.addView(text);//将元素添加到布局管理器中
        mLayout.addView(framelayout);
    }

    public void addOne() {

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        //调用addView()方法增加一个TextView到线性布局中
        TextView textView = new TextView(this);
        textView.setText("java 代码动态添加");
        textView.setBackgroundColor(Color.RED);
//        LayoutTransition mTransitioner = new LayoutTransition();
        LayoutTransition transition = new LayoutTransition();
//        transition.setAnimator(LayoutTransition.CHANGE_APPEARING,
//                transition.getAnimator(LayoutTransition.CHANGE_APPEARING));
//        transition.setAnimator(LayoutTransition.APPEARING,
//                null);
//        transition.setAnimator(LayoutTransition.DISAPPEARING,
//                null);
//        transition.setAnimator(LayoutTransition.CHANGE_DISAPPEARING,
//                null);
//        mGridLayout.setLayoutTransition(transition);
        mLayout.setLayoutTransition(transition);

        mLayout.addView(textView, p);
//        mLayout.animate();
    }
}
