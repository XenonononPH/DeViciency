package com.example.deviciency;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private boolean a = false;
    private boolean b1 = false;
    private boolean b2 = false;
    private boolean b3 = false;
    private boolean b5 = false;
    private boolean b6 = false;
    private boolean b7 = false;
    private boolean b9 = false;
    private boolean b12 = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean k = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ba = findViewById(R.id.A);
        final Button bb1 = findViewById(R.id.B1);
        final Button bb2 = findViewById(R.id.B2);
        final Button bb3 = findViewById(R.id.B3);
        final Button bb5 = findViewById(R.id.B5);
        final Button bb6 = findViewById(R.id.B6);
        final Button bb7 = findViewById(R.id.B7);
        final Button bb9 = findViewById(R.id.B9);
        final Button bb12 = findViewById(R.id.B12);
        final Button bc = findViewById(R.id.C);
        final Button bd = findViewById(R.id.D);
        final Button be = findViewById(R.id.E);
        final Button bk = findViewById(R.id.K);

        ba.setBackgroundTintList(getColorStateList(R.color.button));
        bb1.setBackgroundTintList(getColorStateList(R.color.button));
        bb2.setBackgroundTintList(getColorStateList(R.color.button));
        bb3.setBackgroundTintList(getColorStateList(R.color.button));
        bb5.setBackgroundTintList(getColorStateList(R.color.button));
        bb6.setBackgroundTintList(getColorStateList(R.color.button));
        bb7.setBackgroundTintList(getColorStateList(R.color.button));
        bb9.setBackgroundTintList(getColorStateList(R.color.button));
        bb12.setBackgroundTintList(getColorStateList(R.color.button));
        bc.setBackgroundTintList(getColorStateList(R.color.button));
        bd.setBackgroundTintList(getColorStateList(R.color.button));
        be.setBackgroundTintList(getColorStateList(R.color.button));
        bk.setBackgroundTintList(getColorStateList(R.color.button));

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ba.isSelected()) {
                    ba.setSelected(true);
                    ba.setBackgroundTintList(getColorStateList(R.color.press));
                    a = true;
                    //Toast.makeText(getApplicationContext(), "A is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    ba.setSelected(false);
                    ba.setBackgroundTintList(getColorStateList(R.color.button));
                    a = false;
                    //Toast.makeText(getApplicationContext(), "A is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb1.isSelected()) {
                    bb1.setSelected(true);
                    bb1.setBackgroundTintList(getColorStateList(R.color.press));
                    b1 = true;
                    //Toast.makeText(getApplicationContext(), "B1 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb1.setSelected(false);
                    bb1.setBackgroundTintList(getColorStateList(R.color.button));
                    b1 = false;
                    //Toast.makeText(getApplicationContext(), "B1 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb2.isSelected()) {
                    bb2.setSelected(true);
                    bb2.setBackgroundTintList(getColorStateList(R.color.press));
                    b2 = true;
                    //Toast.makeText(getApplicationContext(), "B2 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb2.setSelected(false);
                    bb2.setBackgroundTintList(getColorStateList(R.color.button));
                    b2 = false;
                    //Toast.makeText(getApplicationContext(), "B2 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb3.isSelected()) {
                    bb3.setSelected(true);
                    bb3.setBackgroundTintList(getColorStateList(R.color.press));
                    b3 = true;
                    //Toast.makeText(getApplicationContext(), "B3 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb3.setSelected(false);
                    bb3.setBackgroundTintList(getColorStateList(R.color.button));
                    b3 = false;
                    //Toast.makeText(getApplicationContext(), "B3 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb5.isSelected()) {
                    bb5.setSelected(true);
                    bb5.setBackgroundTintList(getColorStateList(R.color.press));
                    b5 = true;
                    //Toast.makeText(getApplicationContext(), "B5 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb5.setSelected(false);
                    bb5.setBackgroundTintList(getColorStateList(R.color.button));
                    b5 = false;
                    //Toast.makeText(getApplicationContext(), "B5 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb6.isSelected()) {
                    bb6.setSelected(true);
                    bb6.setBackgroundTintList(getColorStateList(R.color.press));
                    b6 = true;
                    //Toast.makeText(getApplicationContext(), "B6 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb6.setSelected(false);
                    bb6.setBackgroundTintList(getColorStateList(R.color.button));
                    b6 = false;
                    //Toast.makeText(getApplicationContext(), "B6 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb7.isSelected()) {
                    bb7.setSelected(true);
                    bb7.setBackgroundTintList(getColorStateList(R.color.press));
                    b7 = true;
                    //Toast.makeText(getApplicationContext(), "B7 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb7.setSelected(false);
                    bb7.setBackgroundTintList(getColorStateList(R.color.button));
                    b7 = false;
                    //Toast.makeText(getApplicationContext(), "B7 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb9.isSelected()) {
                    bb9.setSelected(true);
                    bb9.setBackgroundTintList(getColorStateList(R.color.press));
                    b9 = true;
                    //Toast.makeText(getApplicationContext(), "B9 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb9.setSelected(false);
                    bb9.setBackgroundTintList(getColorStateList(R.color.button));
                    b9 = false;
                    //Toast.makeText(getApplicationContext(), "b9 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bb12.isSelected()) {
                    bb12.setSelected(true);
                    bb12.setBackgroundTintList(getColorStateList(R.color.press));
                    b12 = true;
                    //Toast.makeText(getApplicationContext(), "B12 is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bb12.setSelected(false);
                    bb12.setBackgroundTintList(getColorStateList(R.color.button));
                    b12 = false;
                    //Toast.makeText(getApplicationContext(), "B12 is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bc.isSelected()) {
                    bc.setSelected(true);
                    bc.setBackgroundTintList(getColorStateList(R.color.press));
                    c = true;
                    //Toast.makeText(getApplicationContext(), "C is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bc.setSelected(false);
                    bc.setBackgroundTintList(getColorStateList(R.color.button));
                    c = false;
                    //Toast.makeText(getApplicationContext(), "C is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bd.isSelected()) {
                    bd.setSelected(true);
                    bd.setBackgroundTintList(getColorStateList(R.color.press));
                    d = true;
                    //Toast.makeText(getApplicationContext(), "D is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bd.setSelected(false);
                    bd.setBackgroundTintList(getColorStateList(R.color.button));
                    d = false;
                    //Toast.makeText(getApplicationContext(), "D is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!be.isSelected()) {
                    be.setSelected(true);
                    be.setBackgroundTintList(getColorStateList(R.color.press));
                    e = true;
                    //Toast.makeText(getApplicationContext(), "E is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    be.setSelected(false);
                    be.setBackgroundTintList(getColorStateList(R.color.button));
                    e = false;
                    //Toast.makeText(getApplicationContext(), "E is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bk.isSelected()) {
                    bk.setSelected(true);
                    bk.setBackgroundTintList(getColorStateList(R.color.press));
                    k = true;
                    //Toast.makeText(getApplicationContext(), "K is selected.", Toast.LENGTH_SHORT).show();
                }
                else{
                    bk.setSelected(false);
                    bk.setBackgroundTintList(getColorStateList(R.color.button));
                    k = false;
                    //Toast.makeText(getApplicationContext(), "K is unselected.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final TextView set = findViewById(R.id.answer);
        final ImageView ima = findViewById(R.id.show);
        Button btn = findViewById(R.id.Sub);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.blank);
                    set.setText("");
                    Toast.makeText(getApplicationContext(), "Please select a button.", Toast.LENGTH_SHORT).show();
                }
                else if (a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.va);
                    set.setText("Carrot");
                }
                else if (!a && b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb1);
                    set.setText("Edamame");
                }
                else if (!a && !b1 && b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb2);
                    set.setText("Milk");
                }
                else if (!a && !b1 && !b2 && b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb3);
                    set.setText("Chicken");
                }
                else if (!a && !b1 && !b2 && !b3 && b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb5);
                    set.setText("Avocado");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && b6 && !b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb6);
                    set.setText("Banana");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && b7 && !b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb7);
                    set.setText("Egg");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb9);
                    set.setText("Whole Wheat Bread");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb12);
                    set.setText("Beef Liver");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vcorange);
                    set.setText("Orange");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && d && !e && !k){
                    ima.setImageResource(R.drawable.vd);
                    set.setText("Tofu");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && e && !k){
                    ima.setImageResource(R.drawable.ve);
                    set.setText("Almond");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && !c && !d && !e && k){
                    ima.setImageResource(R.drawable.vk);
                    set.setText("Cabbage");
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && b9 && !b12 && c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vc);
                    set.setText("Strawberry");
                    //B9 & C
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && b12 && !c && d && !e && !k){
                    ima.setImageResource(R.drawable.vd);
                    set.setText("Tofu");
                    //B12 & D
                }
                else if (!a && b1 && !b2 && !b3 && !b5 && !b6 && !b7 && b9 && !b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb9);
                    set.setText("Whole Wheat Bread");
                    //B1 & B9
                }
                else if (!a && b1 && b2 && !b3 && b5 && !b6 && !b7 && !b9 && b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb2);
                    set.setText("Milk");
                    //B1 & B2 & B5 & B12
                }
                else if (!a && !b1 && b2 && b3 && b5 && b6 && !b7 && !b9 && b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb3);
                    set.setText("Chicken");
                    //B2 & B3 & B5 & B6 & B12
                }
                else if (!a && !b1 && b2 && !b3 && b5 && !b6 && b7 && b9 && b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb7);
                    set.setText("Egg");
                    //B2 & B5 & B7 & B9 & B12
                }
                else if (!a && b1 && b2 && b3 && b5 && b6 && b7 && b9 && b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb12);
                    set.setText("Beef Liver");
                    //All B
                }
                else if (!a && !b1 && !b2 && !b3 && !b5 && !b6 && !b7 && !b9 && !b12 && c && !d && e && !k){
                    ima.setImageResource(R.drawable.vce);
                    set.setText("Kiwi");
                    //C & E
                }
                else if (a && b1 && b2 && b3 && b5 && b6 && b7 && b9 && b12 && !c && !d && !e && !k){
                    ima.setImageResource(R.drawable.vb12);
                    set.setText("Beef Liver");
                    //A & ALL B
                }
                else if (!a && b1 && !b2 && !b3 && !b5 && !b6 && !b7 && b9 && !b12 && !c && !d && !e && k){
                    ima.setImageResource(R.drawable.vb1b9k);
                    set.setText("Asparagus");
                    //B1 & B9 & K
                }
                else if (a && b1 && b2 && b3 && b5 && b6 && b7 && b9 && b12 && c && d && e && k){
                    ima.setImageResource(R.drawable.vm);
                    set.setText("Centrum");
                    //ALL
                }
                else{
                    ima.setImageResource(R.drawable.blank);
                    set.setText("");
                    Toast.makeText(getApplicationContext(), "Not found in archive.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button cle = findViewById(R.id.clr);
        cle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba.setSelected(false);
                bb1.setSelected(false);
                bb2.setSelected(false);
                bb3.setSelected(false);
                bb5.setSelected(false);
                bb6.setSelected(false);
                bb7.setSelected(false);
                bb9.setSelected(false);
                bb12.setSelected(false);
                bc.setSelected(false);
                bd.setSelected(false);
                be.setSelected(false);
                bk.setSelected(false);

                a = false;
                b1 = false;
                b2 = false;
                b3 = false;
                b5 = false;
                b6 = false;
                b7 = false;
                b9 = false;
                b12 = false;
                c = false;
                d = false;
                e = false;
                k = false;

                ba.setBackgroundTintList(getColorStateList(R.color.button));
                bb1.setBackgroundTintList(getColorStateList(R.color.button));
                bb2.setBackgroundTintList(getColorStateList(R.color.button));
                bb3.setBackgroundTintList(getColorStateList(R.color.button));
                bb5.setBackgroundTintList(getColorStateList(R.color.button));
                bb6.setBackgroundTintList(getColorStateList(R.color.button));
                bb7.setBackgroundTintList(getColorStateList(R.color.button));
                bb9.setBackgroundTintList(getColorStateList(R.color.button));
                bb12.setBackgroundTintList(getColorStateList(R.color.button));
                bc.setBackgroundTintList(getColorStateList(R.color.button));
                bd.setBackgroundTintList(getColorStateList(R.color.button));
                be.setBackgroundTintList(getColorStateList(R.color.button));
                bk.setBackgroundTintList(getColorStateList(R.color.button));

                ima.setImageResource(R.drawable.blank);
                set.setText("");
            }
        });
        ImageButton in = findViewById(R.id.ins);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, instructions.class));
            }
        });
    }
}