package com.example.easyfindhostel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class FemaleActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private static final String[] paths = {"Choose an Area ", "Framgate", "Uttara", "Mirpur"};

    private ListView listView;
    private String[] hostel_name,farmgate_name,uttara_name,mirpur_name;
    private String[] hostel_address,farmagate_address,uttara_address,mirpur_address;
    private int[] hostel_image={R.drawable.one,R.drawable.two, R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};
    private int[] farmgate_image={R.drawable.one,R.drawable.two};
    private int[] uttara_image={ R.drawable.three,R.drawable.four};
    private int[] mirpur_image={R.drawable.five,R.drawable.six};
   private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);

        this.setTitle("Female Hostel");

        hostel_name=getResources().getStringArray(R.array.female_hostel_name);
        hostel_address=getResources().getStringArray(R.array.female_hostel_address);
        farmgate_name=getResources().getStringArray(R.array.female_farmgate_name);
        farmagate_address=getResources().getStringArray(R.array.female_farmgate_address);
        uttara_name=getResources().getStringArray(R.array.female_uttara_name);
        uttara_address=getResources().getStringArray(R.array.female_uttara_address);
        mirpur_name=getResources().getStringArray(R.array.female_mirpur_name);
        mirpur_address=getResources().getStringArray(R.array.female_mirpur_address);

        listView=findViewById(R.id.listview_id);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FemaleActivity.this,
                android.R.layout.simple_spinner_item, paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        this.finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position)
        {
            case 0:
                customAdapter=new CustomAdapter(this,hostel_name,hostel_address,hostel_image);
                listView.setAdapter(customAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value_name = hostel_name[position];
                        String value_address = hostel_address[position];
                        int value_image=hostel_image[position];
                        Intent intent=new Intent(FemaleActivity.this,DetailsActivity.class);
                        intent.putExtra("name",value_name);
                        intent.putExtra("address",value_address);
                        intent.putExtra("image",value_image);
                        startActivity(intent);
                    }
                });
                break;
            case 1:
                customAdapter=new CustomAdapter(this,farmgate_name,farmagate_address,farmgate_image);
                listView.setAdapter(customAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value_name = farmgate_name[position];
                        String value_address = farmagate_address[position];
                        int value_image=farmgate_image[position];
                        Intent intent=new Intent(FemaleActivity.this,DetailsActivity.class);
                        intent.putExtra("name",value_name);
                        intent.putExtra("address",value_address);
                        intent.putExtra("image",value_image);
                        startActivity(intent);
                    }
                });
                break;
            case 2:
                customAdapter=new CustomAdapter(this,uttara_name,uttara_address,uttara_image);
                listView.setAdapter(customAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value_name = uttara_name[position];
                        String value_address = uttara_address[position];
                        int value_image=uttara_image[position];
                        Intent intent=new Intent(FemaleActivity.this,DetailsActivity.class);
                        intent.putExtra("name",value_name);
                        intent.putExtra("address",value_address);
                        intent.putExtra("image",value_image);
                        startActivity(intent);
                    }
                });
                break;
            case 3:
                customAdapter=new CustomAdapter(this,mirpur_name,mirpur_address,mirpur_image);
                listView.setAdapter(customAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value_name = mirpur_name[position];
                        String value_address = mirpur_address[position];
                        int value_image=mirpur_image[position];
                        Intent intent=new Intent(FemaleActivity.this,DetailsActivity.class);
                        intent.putExtra("name",value_name);
                        intent.putExtra("address",value_address);
                        intent.putExtra("image",value_image);
                        startActivity(intent);
                    }
                });
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}