package sg.edu.rp.c346.id21017809.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etColour;
    Button btnAdd;
    ListView lvColour;
    EditText etIndexElement;
    ArrayAdapter<String> aaColour;
    ArrayList <String> alColours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etColour = findViewById(R.id.editTextNewColour);
        btnAdd = findViewById(R.id.buttonAdd);
        etIndexElement = findViewById(R.id.editTextIndexElement);
        lvColour = findViewById(R.id.listViewColour);

        alColours = new ArrayList<String> ();                             //data
        alColours.add("Red");
        alColours.add("Orange");
        //where to display         // how ''                           //where ''

        aaColour = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alColours);

        lvColour.setAdapter(aaColour);
        lvColour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colour = etColour.getText().toString();
                //alColours.add(colour);
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos, colour);
                aaColour.notifyDataSetChanged();
            }
        });

    }
}