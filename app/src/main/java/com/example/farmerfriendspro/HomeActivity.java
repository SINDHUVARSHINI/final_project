package com.example.farmerfriendspro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {

    RadioButton alluvial,lateric,red,sandy,black;
    RadioGroup soilselection1;
    ImageButton ChangeLang;
    ImageButton gn,jute,scane,to,coffee,rice,wheat,car,tom,cot,chil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ChangeLang = findViewById(R.id.changMyLang);
        ChangeLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showChangeLanguageDialog();
            }
        });

        final RadioButton alluvial=findViewById(R.id.alluvial);
        final RadioButton lateric=findViewById(R.id.lateric);
        final RadioButton red=findViewById(R.id.red);
        final RadioButton sandy=findViewById(R.id.sandy);
        final RadioButton black=findViewById(R.id.black);
        final RadioGroup soilselection1=findViewById(R.id.soilselection1);
        gn=findViewById(R.id.Groundnut);
        jute=findViewById(R.id.jute);
        scane=findViewById(R.id.scane);
        to=findViewById(R.id.tobacco);
        coffee=findViewById(R.id.coffee);
        rice=findViewById(R.id.rice);
        wheat=findViewById(R.id.wheat);
        car=findViewById(R.id.carrot);
        tom=findViewById(R.id.tomato);
        cot=findViewById(R.id.cotton);
        chil=findViewById(R.id.chilli);
        gn.setVisibility(View.GONE);
        jute.setVisibility(View.GONE);
        scane.setVisibility(View.GONE);
        to.setVisibility(View.GONE);
        coffee.setVisibility(View.GONE);
        rice.setVisibility(View.GONE);
        wheat.setVisibility(View.GONE);
        car.setVisibility(View.GONE);
        tom.setVisibility(View.GONE);
        cot.setVisibility(View.GONE);
        chil.setVisibility(View.GONE);
        soilselection1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.alluvial){
                    gn.setVisibility(View.VISIBLE);
                    jute.setVisibility(View.VISIBLE);
                    scane.setVisibility(View.VISIBLE);
                    to.setVisibility(View.GONE);
                    coffee.setVisibility(View.GONE);
                    rice.setVisibility(View.GONE);
                    wheat.setVisibility(View.GONE);
                    car.setVisibility(View.GONE);
                    tom.setVisibility(View.GONE);
                    cot.setVisibility(View.GONE);
                    chil.setVisibility(View.GONE);
                }
                else if(checkedId==R.id.lateric){
                    gn.setVisibility(View.GONE);
                    jute.setVisibility(View.GONE);
                    scane.setVisibility(View.GONE);
                    to.setVisibility(View.VISIBLE);
                    coffee.setVisibility(View.VISIBLE);
                    rice.setVisibility(View.GONE);
                    wheat.setVisibility(View.GONE);
                    car.setVisibility(View.GONE);
                    tom.setVisibility(View.GONE);
                    cot.setVisibility(View.GONE);
                    chil.setVisibility(View.GONE);
                }
                else if(checkedId==R.id.red){
                    gn.setVisibility(View.GONE);
                    jute.setVisibility(View.GONE);
                    scane.setVisibility(View.GONE);
                    to.setVisibility(View.GONE);
                    coffee.setVisibility(View.GONE);
                    rice.setVisibility(View.VISIBLE);
                    wheat.setVisibility(View.VISIBLE);
                    car.setVisibility(View.GONE);
                    tom.setVisibility(View.GONE);
                    cot.setVisibility(View.GONE);
                    chil.setVisibility(View.GONE);                }
                else if(checkedId==R.id.sandy){
                    gn.setVisibility(View.GONE);
                    jute.setVisibility(View.GONE);
                    scane.setVisibility(View.GONE);
                    to.setVisibility(View.GONE);
                    coffee.setVisibility(View.GONE);
                    rice.setVisibility(View.GONE);
                    wheat.setVisibility(View.GONE);
                    car.setVisibility(View.VISIBLE);
                    tom.setVisibility(View.VISIBLE);
                    cot.setVisibility(View.GONE);
                    chil.setVisibility(View.GONE);
                }
                else if(checkedId==R.id.black){
                    gn.setVisibility(View.GONE);
                    jute.setVisibility(View.GONE);
                    scane.setVisibility(View.GONE);
                    to.setVisibility(View.GONE);
                    coffee.setVisibility(View.GONE);
                    rice.setVisibility(View.GONE);
                    wheat.setVisibility(View.GONE);
                    car.setVisibility(View.GONE);
                    tom.setVisibility(View.GONE);
                    cot.setVisibility(View.VISIBLE);
                    chil.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    public void groundnut(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void jute(View view){
        Intent intent=new Intent(this,JuteActivity.class);
        startActivity(intent);
    }
    public void sugar(View view){
        Intent intent=new Intent(this,ScaneActivity.class);
        startActivity(intent);
    }
    public void tobaco(View view){
        Intent intent=new Intent(this,tobaccoActivity.class);
        startActivity(intent);
    }
    public void coffee(View view){
        Intent intent=new Intent(this,CoffeeActivity.class);
        startActivity(intent);
    }
    public void rice(View view){
        Intent intent=new Intent(this,CoffeeActivity.class);
        startActivity(intent);
    }
    public void wheat(View view){
        Intent intent=new Intent(this,RiceActivity.class);
        startActivity(intent);
    }
    public void carrot(View view){
        Intent intent=new Intent(this,CarrotActivity.class);
        startActivity(intent);
    }
    public void tomato(View view){
        Intent intent=new Intent(this,TomatoActivity.class);
        startActivity(intent);
    }
    public void cotton(View view){
        Intent intent=new Intent(this,CottonActivity.class);
        startActivity(intent);
    }
    public void chilli(View view){
        Intent intent=new Intent(this,ChilliActivity.class);
        startActivity(intent);
    }
    private void showChangeLanguageDialog() {
        final String[] listItems ={"తెలుగు","English","हिंदी"};
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(HomeActivity.this);
        mBuilder.setTitle("Choose Language......");
        mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i==0)
                {
                    setLocale("te");
                    recreate();
                }
                else if(i==1)
                {
                    setLocale("en");
                    recreate();
                }
                else if(i==2)
                {

                    setLocale("hi");
                    recreate();

                }
                dialogInterface.dismiss();
            }
        });
        AlertDialog mDialog = mBuilder.create();
        mDialog.show();

    }

    private void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale ;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();


    }
    public void loadLocale()
    {
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang","");
        setLocale(language);
    }

}