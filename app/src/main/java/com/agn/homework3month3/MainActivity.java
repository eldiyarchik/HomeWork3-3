package com.agn.homework3month3;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.agn.homework3month3.reciclerView.ResturentAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Resturant> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        ResturentAdapter adapter = new ResturentAdapter(this, list);
        recyclerView.setAdapter(adapter);
        initData();
    }

    private void initData() {
        list.add(new Resturant("Лагман", "мясо, лапша", "199som"));
        list.add(new Resturant("Плов", "мясо, рис", "175som"));
        list.add(new Resturant("Манты", "тесто, мясо , картошка", "183som"));
        list.add(new Resturant("Мясо", "мясо, картошка", "649som"));
        list.add(new Resturant("Суп", "мясо, гречка", "200som"));
        list.add(new Resturant("Борщь", "мясо, капуста", "50som"));
    }
}