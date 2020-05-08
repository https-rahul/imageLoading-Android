package application.rahul.imageloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.testingImage);

        Picasso.get().load("https://raw.githubusercontent.com/https-rahul/netCheck-Android/master/yes.png").networkPolicy(NetworkPolicy.OFFLINE).into(imageView, new Callback() {
            @Override
            public void onSuccess() {
//                Picasso.get().load("https://raw.githubusercontent.com/https-rahul/netCheck-Android/master/yes.png").into(imageView);

            }

            @Override
            public void onError(Exception e) {
                Picasso.get().load("https://raw.githubusercontent.com/https-rahul/netCheck-Android/master/yes.png").into(imageView);
            }
        });
    }
}
