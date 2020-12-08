package dev.unclejay.beforeandafter;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void callMonty(View view) {
        /* Find a reference to the ImageView in the Layout. Change the image. */
        ImageView afterImage = (ImageView) findViewById(R.id.beforeMonty_ImageView);
        afterImage.setImageResource(R.drawable.after_monty);

        /* Find a reference to the TextView in the layout. Change the text. */
        TextView afterText = (TextView) findViewById(R.id.beforeMonty_TextView);
        afterText.setText("I'm clean again\n\nThanks Monty!!!");

        /* Hide the button now that we're all clean again */
        Button callMontyButton = (Button) findViewById(R.id.callMontyButton);
        callMontyButton.setVisibility(View.GONE);
    }
}