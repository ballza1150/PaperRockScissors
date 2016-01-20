package th.ac.krirk.ball.ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }   // Main Method

    private void bindWidget() {
        paperImageView = (ImageView) findViewById(R.id.imvpaper);
        rockImageView = (ImageView) findViewById(R.id.imvrock);
        scissorImageView = (ImageView) findViewById(R.id.imvscissors);
        playImageView = (ImageView) findViewById(R.id.imvplayer);
        androidImageView = (ImageView) findViewById(R.id.imvAndroid);

    }

}    // Main Class นี้คือคลาสหลัก
