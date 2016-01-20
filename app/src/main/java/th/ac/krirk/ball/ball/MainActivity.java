package th.ac.krirk.ball.ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private ImageView paperImageView, rockImageView,
            scissorImageView, playImageView , androidImageView;
    private TextView showTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Bind Widget
        bindWidget();

        //Paper Controller
        paperController();

        // Rock controller
        rockController();

        // Scissor controller
        scissorController();

    }   // Main Method

    private void scissorController() {

        scissorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changePlay(3);

            }
        });

    }

    private void rockController() {
        rockImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changePlay(2);

            }
        });
    }

    private void paperController() {

        paperImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intNumber = 1;
                changePlay(intNumber);
            }
        });

    } // ขอบเขต paperController

    private void changePlay(int intNumber) {

        Log.d("test", "ค่าที่ได้รับ = " + intNumber);

    }  //  changePlay

    private void bindWidget() {
        paperImageView = (ImageView) findViewById(R.id.imvpaper);
        rockImageView = (ImageView) findViewById(R.id.imvrock);
        scissorImageView = (ImageView) findViewById(R.id.imvscissors);
        playImageView = (ImageView) findViewById(R.id.imvplayer);
        androidImageView = (ImageView) findViewById(R.id.imvAndroid);
        showTextView = (TextView) findViewById(R.id.txtshow);

    }

}    // Main Class นี้คือคลาสหลัก
