package example.official.reshan.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhD19006_Activity3 extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phd19006_activity3);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lv1);

        list = new ArrayList<>();
        list.add("C");
        list.add("Python");
        list.add("C#");
        list.add("C++");
        list.add("Go");
        list.add("PHP");
        list.add("HTML");
        list.add("Alpha");
        list.add("Java");
        list.add("Kotlin");
        list.add("Forton");
        list.add("Pascal");
        list.add("Julia");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(getApplicationContext(), "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
