package com.example.a300883536.antoniomagalhaes_comp304asgn2_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class FoodMenuActivity extends AppCompatActivity {

    private static final int MENU_ITEM_ITEM_1 = 1;
    private static final int MENU_ITEM_ITEM_2 = 2;
    private static final int MENU_ITEM_ITEM_3 = 3;
    private static final int MENU_ITEM_ITEM_4 = 4;

    private Intent intent;
    private int idCusine;

    private String menuFirstItem;
    private String menuSecondItem;
    private String menuThirdItem;

    private String ingredientFirstItem;
    private String ingredientSecondItem;
    private String ingredientThirdItem;

    private View firstFood;
    private View secondFood;
    private View thirdFood;

    private TextView firstFoodTV;
    private TextView secondFoodTV;
    private TextView thirdFoodTV;

    private TextView firstIgredientsTV;
    private TextView secondIngredientsTV;
    private TextView thirdIngredientsTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        firstFood = findViewById(R.id.first_item);
        secondFood = findViewById(R.id.second_item);
        thirdFood = findViewById(R.id.third_item);

        firstFoodTV = (TextView) firstFood.findViewById(R.id.food_item);
        firstIgredientsTV = (TextView) firstFood.findViewById(R.id.food_ingredients);

        secondFoodTV = (TextView) secondFood.findViewById(R.id.food_item);
        secondIngredientsTV = (TextView) secondFood.findViewById(R.id.food_ingredients);

        thirdFoodTV = (TextView) thirdFood.findViewById(R.id.food_item);
        thirdIngredientsTV = (TextView) thirdFood.findViewById(R.id.food_ingredients);

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
        setUpFood(item.getItemId());

        return true;
    }

    private void setUpMenu(int cusineTypeId, Menu menu){

        switch (cusineTypeId){
            case R.id.rdb_american:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.mc_donalds, Menu.NONE, getResources().getString(R.string.mc_donalds));
                menu.add(Menu.NONE, R.string.outback, Menu.NONE, getResources().getString(R.string.outback));
                menu.add(Menu.NONE, R.string.subway, Menu.NONE, getResources().getString(R.string.subway));
                menu.add(Menu.NONE, R.string.pizza_hut, Menu.NONE, getResources().getString(R.string.pizza_hut));
                break;
            }
            case R.id.rdb_chinese:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.pf_changs, Menu.NONE, getResources().getString(R.string.pf_changs));
                menu.add(Menu.NONE, R.string.teriaky, Menu.NONE, getResources().getString(R.string.teriaky));
                menu.add(Menu.NONE, R.string.ho_jan, Menu.NONE, getResources().getString(R.string.ho_jan));
                menu.add(Menu.NONE, R.string.moto, Menu.NONE, getResources().getString(R.string.moto));
                break;
            }
            case R.id.rdb_brazilian:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.mata, Menu.NONE, getResources().getString(R.string.mata));
                menu.add(Menu.NONE, R.string.toro, Menu.NONE, getResources().getString(R.string.toro));
                menu.add(Menu.NONE, R.string.rodeo, Menu.NONE, getResources().getString(R.string.rodeo));
                menu.add(Menu.NONE, R.string.copacabana, Menu.NONE, getResources().getString(R.string.copacabana));
                break;
            }
            case R.id.rdb_mexican:
            {
                menu.clear();
                menu.add(Menu.NONE, R.string.taco_bell, Menu.NONE, getResources().getString(R.string.taco_bell));
                menu.add(Menu.NONE, R.string.el_passo, Menu.NONE, getResources().getString(R.string.el_passo));
                menu.add(Menu.NONE, R.string.guadalarrara, Menu.NONE, getResources().getString(R.string.guadalarrara));
                menu.add(Menu.NONE, R.string.pico_de_galo, Menu.NONE, getResources().getString(R.string.pico_de_galo));
                break;
            }
        }

    }

    private void setUpFood(int idRestaurant){
        switch (idRestaurant) {
            case R.string.mc_donalds: {
                menuFirstItem = getResources().getString(R.string.big_mac);
                menuSecondItem = getResources().getString(R.string.mc_chicken);
                menuThirdItem = getResources().getString(R.string.mc_fish);

                ingredientFirstItem = getResources().getString(R.string.big_mac_ingredients);
                ingredientSecondItem = getResources().getString(R.string.mc_chicken_ingredients);
                ingredientThirdItem = getResources().getString(R.string.mc_fish_ingredients);
                break;
            }
            case R.string.subway: {
                menuFirstItem = getResources().getString(R.string.meetballs);
                menuSecondItem = getResources().getString(R.string.roustbeef);
                menuThirdItem = getResources().getString(R.string.teriaky_chicken);

                ingredientFirstItem = getResources().getString(R.string.meetballs_ingredients);
                ingredientSecondItem = getResources().getString(R.string.roustbeef_ingredients);
                ingredientThirdItem = getResources().getString(R.string.teriaky_chicken_ingredients);
                break;
            }
            case R.string.outback: {
                menuFirstItem = getResources().getString(R.string.onion);
                menuSecondItem = getResources().getString(R.string.chicken_wings);
                menuThirdItem = getResources().getString(R.string.ribs);

                ingredientFirstItem = getResources().getString(R.string.onion_ingredients);
                ingredientSecondItem = getResources().getString(R.string.chicken_wings_ingredients);
                ingredientThirdItem = getResources().getString(R.string.ribs_ingredients);
                break;
            }
            case R.string.pizza_hut: {
                menuFirstItem = getResources().getString(R.string.peperoni);
                menuSecondItem = getResources().getString(R.string.canadian);
                menuThirdItem = getResources().getString(R.string.chicken_pesto);

                ingredientFirstItem = getResources().getString(R.string.peperoni_ingredients);
                ingredientSecondItem = getResources().getString(R.string.canadian_ingredients);
                ingredientThirdItem = getResources().getString(R.string.chicken_pesto_ingredients);
                break;
            }
            case R.string.pf_changs:
            case R.string.teriaky:
            case R.string.ho_jan:
            case R.string.moto: {
                menuFirstItem = getResources().getString(R.string.beef_chop);
                menuSecondItem = getResources().getString(R.string.chicken_chop);
                menuThirdItem = getResources().getString(R.string.pork_chop);

                ingredientFirstItem = getResources().getString(R.string.beef_chop_ingredients);
                ingredientSecondItem = getResources().getString(R.string.chicken_chop_ingredients);
                ingredientThirdItem = getResources().getString(R.string.pork_chop_ingredients);
                break;
            }
            case R.string.mata:
            case R.string.toro:
            case R.string.rodeo:
            case R.string.copacabana: {
                menuFirstItem = getResources().getString(R.string.picanha);
                menuSecondItem = getResources().getString(R.string.feijoada);
                menuThirdItem = getResources().getString(R.string.muqueca);

                ingredientFirstItem = getResources().getString(R.string.picanha_ingredients);
                ingredientSecondItem = getResources().getString(R.string.feijoada_ingredients);
                ingredientThirdItem = getResources().getString(R.string.muqueca_ingredients);
                break;
            }
            case R.string.taco_bell:
            case R.string.el_passo:
            case R.string.guadalarrara:
            case R.string.pico_de_galo: {
                menuFirstItem = getResources().getString(R.string.beef_tacos);
                menuSecondItem = getResources().getString(R.string.chicken_tacos);
                menuThirdItem = getResources().getString(R.string.pork_tacos);

                ingredientFirstItem = getResources().getString(R.string.beef_tacos_ingredients);
                ingredientSecondItem = getResources().getString(R.string.chicken_tacos_ingredients);
                ingredientThirdItem = getResources().getString(R.string.pork_tacos_ingredients);
                break;
            }
        }

        firstFoodTV.setText(menuFirstItem);
        firstIgredientsTV.setText(ingredientFirstItem);
        secondFoodTV.setText(menuSecondItem);
        secondIngredientsTV.setText(ingredientSecondItem);
        thirdFoodTV.setText(menuThirdItem);
        thirdIngredientsTV.setText(ingredientThirdItem);
    }

}
