package com.example.task02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvProductList = findViewById(R.id.rv_ProductList);
        setAdapter(rvProductList);
        //create menu filtres
        LinearLayout filtres = findViewById(R.id.filtres);
        for(ModelProductShort.ProductCategory category : ModelProductShort.ProductCategory.values()) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                280,
                100
        );
        params.setMargins(7, 17, 7, 17);

             ContextThemeWrapper newContext = new ContextThemeWrapper(this, R.style.ButtonFiltres_Theme_Task02);
            ToggleButton b = new androidx.appcompat.widget.AppCompatToggleButton(newContext);
            b.setTextOn(category.toString());
            b.setTextOff(category.toString());
            b.setLayoutParams(params);
            b.setBackgroundResource(R.drawable.rounded_corner);
            StateListAnimator st = AnimatorInflater.loadStateListAnimator(this, R.animator.anim_shadow);
            b.setStateListAnimator(st);
     //       b.
            b.setChecked(false);
            filtres.addView(b);
        }

    }
    private void setAdapter(RecyclerView recyclerView){
        List<ModelProductShort> modelProductList = new ArrayList<>();
        AdapterProductList adapterProductList = new AdapterProductList(modelProductList, this);
        recyclerView.setAdapter(adapterProductList);
        ModelProductShort modelProductShort = new ModelProductShort(" Пицца рарита", 345, ModelProductShort.ProductCategory.Пицца, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Кока кола", 55, ModelProductShort.ProductCategory.Напитки, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Пица Барселона", 155, ModelProductShort.ProductCategory.Пицца, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Пица Марго", 155, ModelProductShort.ProductCategory.Пицца, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Пончик", 155, ModelProductShort.ProductCategory.Десерты, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Пица чикарето", 155, ModelProductShort.ProductCategory.Пицца, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Чизкейк", 155, ModelProductShort.ProductCategory.Десерты, 1);
        modelProductList.add(modelProductShort);
        modelProductShort = new ModelProductShort(" Мохито", 155, ModelProductShort.ProductCategory.Напитки, 1);
        modelProductList.add(modelProductShort);
    }
}