package se.thorsell.catdex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnViewCats;
    private Button btnNewCat;
    private Button btnViewACat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        // Buttons
        btnViewCats = findViewById(R.id.btnViewCats);
        btnNewCat = findViewById(R.id.btnCreateCat);
        btnViewACat = findViewById(R.id.btnViewACat);

        // view cats click event
        btnViewCats.setOnClickListener(view -> {
            // Launching a cat activity
            Intent i = new Intent(getApplicationContext(), SearchActivity.class);
            startActivity(i);
        });

        // new cat click event
        btnNewCat.setOnClickListener(view -> {
            // Launching create new cat activity
            Intent i = new Intent(getApplicationContext(), NewCatActivity.class);
            startActivity(i);
        });

        // new view a cat click event
        btnViewACat.setOnClickListener(view -> {
            // Launching view a cat activity.
            Intent i = new Intent(getApplicationContext(), ACatActivity.class);
            startActivity(i);
        });
    }
}