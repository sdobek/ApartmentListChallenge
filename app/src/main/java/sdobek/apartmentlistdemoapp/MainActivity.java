package sdobek.apartmentlistdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList();
        list.add("Amy");
        list.add("Ben");
        list.add("Caleb");
        list.add("Don");
        ApartmentListUtil.splitList(list);
        
        list = new ArrayList();
        list.add("Amy");
        list.add("Ben");
        list.add("Caleb");
        list.add("Don");
        list.add("Emily");
        list.add("Frank");
        ApartmentListUtil.splitList(list);

        list = new ArrayList();
        list.add("Amy");
        list.add("Ben");
        list.add("Caleb");
        list.add("Don");
        list.add("Emily");
        list.add("Frank");
        list.add("Ken");
        list.add("Salem");
        list.add("Ron");
        list.add("Izzy");
        list.add("Tank");
        ApartmentListUtil.splitList(list);
    }
}
