package NguyenDinhKhai.BaiKT3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> listData;
    ArrayAdapter adapter;
    EditText vt, gt;
    Button btnThem, btnSua, btnXoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        vt = (EditText) findViewById(R.id.vitri);
        gt = (EditText) findViewById(R.id.giatri);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnSua = (Button) findViewById(R.id.btnSua);
        btnXoa = (Button) findViewById(R.id.btnXoa);

        listData = new ArrayList<>();
        listData.add("Content");
        listData.add("Graphics");
        listData.add("Hardware");
        listData.add("Media");
        listData.add("NFC");
        listData.add("OS");
        listData.add("Preference");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                
            }
        });
    }
}