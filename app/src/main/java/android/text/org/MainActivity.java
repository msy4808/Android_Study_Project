package android.text.org;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(myIntent);
            }
        });
    }
    public void onButtonClicked2(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-1111"));
        startActivity(myIntent);
    }
    public void onButtonClicked3(View v) {
        Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
        startActivity(myIntent);
    }
}