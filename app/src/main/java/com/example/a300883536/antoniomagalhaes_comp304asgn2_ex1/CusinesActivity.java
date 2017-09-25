package com.example.a300883536.antoniomagalhaes_comp304asgn2_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CusinesActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cusines);

        radioGroup = (RadioGroup) findViewById(R.id.rdb_cusines_group);
        button = (Button) findViewById(R.id.btn_enter_cusine);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                Intent intent = new Intent(CusinesActivity.this, FoodMenuActivity.class);
                intent.putExtra("cusine_type_id", selectedId);
                startActivity(intent);
            }
        });

    }
}
