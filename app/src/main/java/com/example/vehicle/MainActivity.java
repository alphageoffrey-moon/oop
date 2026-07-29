package com.example.vehicle;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etBrand;
    private Button btnCar;
    private Button btnMotorcycle;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBrand = findViewById(R.id.etBrand);
        btnCar = findViewById(R.id.btnCar);
        btnMotorcycle = findViewById(R.id.btnMotorcycle);
        txtResult = findViewById(R.id.txtResult);

        btnCar.setOnClickListener(view -> showVehicle(new Car(getBrandInput())));
        btnMotorcycle.setOnClickListener(view -> showVehicle(new Motorcycle(getBrandInput())));
    }

    private String getBrandInput() {
        return etBrand.getText().toString().trim();
    }

    private void showVehicle(Vehicle vehicle) {
        if (vehicle.getBrand().isEmpty()) {
            etBrand.setError("Please enter vehicle brand");
            txtResult.setText("");
            return;
        }

        /*
         * This is polymorphism:
         * The variable type is Vehicle, but the real object can be Car or Motorcycle.
         * Java automatically calls the correct move() method for that object.
         */
        String output = vehicle.getInfo() + "\n" + vehicle.move();
        txtResult.setText(output);
    }
}
