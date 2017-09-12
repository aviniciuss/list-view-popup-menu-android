package com.example.avinicius.listviewpopupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Anderson Vinicius", "avinicius.adorno@gmail.com"));
        people.add(new Person("Rogerio Amado", "rogerio.amado@gmail.com"));
        people.add(new Person("Barbara Regina", "barbara.adorno@gmail.com"));
        people.add(new Person("Gabrielly", "gaby.adorno@gmail.com"));
        people.add(new Person("John Lock", "johnlock@gmail.com"));
        people.add(new Person("Carlos Ferreira", "carlos.ferreira@gmail.com"));
        people.add(new Person("Filipe Jonson", "filipe.jonson@gmail.com"));
        people.add(new Person("Gabriel Silva", "gabriel.silva@gmail.com"));
        people.add(new Person("Regiane Brawn", "regi.brawn@gmail.com"));
        people.add(new Person("Jóse Almeida", "jose.almeida@gmail.com"));
        people.add(new Person("Eduardo Ribeiro", "edurado.ribeiro@gmail.com"));
        people.add(new Person("Jeandro Couto", "jeandro.couto@gmail.com"));
        people.add(new Person("Luis Carlos", "luis.carlos@gmail.com"));
        people.add(new Person("André filho", "andre.filho@gmail.com"));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ListAdapter(this, people));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ImageView imageView = view.findViewById(R.id.more);
                Log.i("Script", imageView.getId()+"");
            }
        });
    }
}
