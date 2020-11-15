package com.example.easyfindhostel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView details_image;
    private int image_value;
    private TextView details_name,details_address;
    private String name_value,address_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        this.setTitle("Hostel Details");

        details_image=findViewById(R.id.details_image_view);
        details_name=findViewById(R.id.details_name_txtid);
        details_address=findViewById(R.id.details_description_txtid);

        Bundle bundle=getIntent().getExtras();
        {
            if (bundle!=null)
            {
                image_value=bundle.getInt("image");
                name_value=bundle.getString("name");
                address_value=bundle.getString("address");

            }
        }

        details_image.setImageResource(image_value);
        details_address.setText(address_value);
        details_name.setText(name_value);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        this.finish();
        return super.onOptionsItemSelected(item);
    }

}