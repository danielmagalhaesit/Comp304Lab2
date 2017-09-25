package com.example.a300883536.antoniomagalhaes_comp304asgn2_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FoodMenuActivity extends AppCompatActivity {

    private static final int MENU_ITEM_ITEM_1 = 1;
    private static final int MENU_ITEM_ITEM_2 = 2;
    private static final int MENU_ITEM_ITEM_3 = 3;
    private static final int MENU_ITEM_ITEM_4 = 4;

    private Intent intent;
    private int idCusine;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);


        intent = getIntent();
        idCusine = intent.getIntExtra("cusine_type_id", 0);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        setUpMenu(idCusine, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case MENU_ITEM_ITEM_1:
            {

            }
            case MENU_ITEM_ITEM_2:
            {

            }
            case MENU_ITEM_ITEM_3:
            {

            }
            case MENU_ITEM_ITEM_4:
            {

            }
        }

        return true;
    }

    private void setUpMenu(int cusineTypeId, Menu menu){

        switch (cusineTypeId){
            case R.id.rdb_american:
            {
                menu.clear();
                menu.add(Menu.NONE, MENU_ITEM_ITEM_1, Menu.NONE, getResources().getString(R.string.mc_donalds));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_2, Menu.NONE, getResources().getString(R.string.outback));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_3, Menu.NONE, getResources().getString(R.string.subway));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_4, Menu.NONE, getResources().getString(R.string.pizza_hut));
                break;
            }
            case R.id.rdb_chinese:
            {
                menu.clear();
                menu.add(Menu.NONE, MENU_ITEM_ITEM_1, Menu.NONE, getResources().getString(R.string.pf_changs));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_2, Menu.NONE, getResources().getString(R.string.teriaky));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_3, Menu.NONE, getResources().getString(R.string.ho_jan));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_4, Menu.NONE, getResources().getString(R.string.moto));
                break;
            }
            case R.id.rdb_brazilian:
            {
                menu.clear();
                menu.add(Menu.NONE, MENU_ITEM_ITEM_1, Menu.NONE, getResources().getString(R.string.mata));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_2, Menu.NONE, getResources().getString(R.string.toro));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_3, Menu.NONE, getResources().getString(R.string.rodeo));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_4, Menu.NONE, getResources().getString(R.string.copacabana));
                break;
            }
            case R.id.rdb_mexican:
            {
                menu.clear();
                menu.add(Menu.NONE, MENU_ITEM_ITEM_1, Menu.NONE, getResources().getString(R.string.taco_bell));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_2, Menu.NONE, getResources().getString(R.string.el_passo));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_3, Menu.NONE, getResources().getString(R.string.guacamole));
                menu.add(Menu.NONE, MENU_ITEM_ITEM_4, Menu.NONE, getResources().getString(R.string.pico_de_galo));
                break;
            }
        }

    }

}
