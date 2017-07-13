package com.example.sanyogghoshas.justjava; /**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.sanyogghoshas.justjava.R;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    int i=0;
    int j=0;

    public void submitOrder(View view){
        displayor("ORDER IS PLACED");
        j=j1;


    }

    public void submitAdd(View view) {

        if(j == 1){


            i=0;
        }
        if (i == 0){
            i=0;

        }
        i=i+1;
        display(i);
        displaya((5)*i);
    }

    public void submitMinus(View view){

        i=i-1;
        if(j == 1){


            i=0;
        }
        if (i == -1){
                 i=0;

        }


        display(i);
        displaya((5)*i);
    }
    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayor(String anumber) {
        TextView priceadTextView = (TextView) findViewById(R.id.pricead_text_view);
        priceadTextView.setText("" + anumber);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitay_text_view);
        quantityTextView.setText("" + number);
    }

    private void displaya(int numbera){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("" + numbera);


    }
}