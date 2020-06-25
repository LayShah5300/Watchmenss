package com.example.watchmenss;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class purposeofv extends AppCompatActivity {

    int preSelectedIndex = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purposeofv);



        ListView listView = (ListView)findViewById(R.id.listView);
        final List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(false,"Friend"));
        users.add(new UserModel(false,"Relative"));
        users.add(new UserModel(false,"Repair & Services"));
        users.add(new UserModel(false,"Delivery Person"));
        users.add(new UserModel(false,"Postman"));
        users.add(new UserModel(false,"Others"));

        final CustomAdapter adapter = new CustomAdapter(this,users);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                UserModel model = users.get(i);
                model.setSelected(true);
                users.set(i,model);

                if(preSelectedIndex > -1 && preSelectedIndex!=i)
                {
                    UserModel preRecord = users.get(preSelectedIndex);
                    preRecord.setSelected(false);

                    users.set(preSelectedIndex,preRecord);
                }
                preSelectedIndex = i;
                adapter.updateRecords(users);
            }
        });
    }
}