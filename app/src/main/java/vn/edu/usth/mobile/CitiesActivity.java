package vn.edu.usth.mobile;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import com.google.android.material.button.MaterialButton;

public class CitiesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        MaterialButton flightNumberButton = findViewById(R.id.button_flight_number);
        flightNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitiesActivity.this, FlightNumberActivity.class);
                startActivity(intent);
            }
        });

        MaterialButton searchFlightButton = findViewById(R.id.search_flight_button);
        searchFlightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitiesActivity.this, FlightDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
