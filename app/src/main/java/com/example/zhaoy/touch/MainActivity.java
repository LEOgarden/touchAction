package com.example.zhaoy.touch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView show;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inintView();
        setListener();
    }

    private void setListener() {
        relativeLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.v("action_down","执行");
                        show.setText("起始位置:"+"("+motionEvent.getX()+","+motionEvent.getY()+")");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.v("action_move","执行");
                        show.setText("移动中坐标为:"+"("+motionEvent.getX()+","+motionEvent.getY()+")");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.v("action_up","执行");
                        show.setText("最后位置为:"+"("+motionEvent.getX()+","+motionEvent.getY()+")");
                        break;
                }
                return true;
            }
        });
    }

    private void inintView() {
        show = (TextView) findViewById(R.id.show);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

    }
}
