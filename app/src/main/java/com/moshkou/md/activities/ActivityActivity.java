package com.moshkou.md.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.moshkou.md.R;
import com.moshkou.md.adapters.ActivityAdapter;
import com.moshkou.md.adapters.ListMultiTypeItemAdapter;
import com.moshkou.md.configs.Enumerates;
import com.moshkou.md.helpers.Utils;
import com.moshkou.md.models.BaseDataModel;
import com.moshkou.md.models.ContactModel;

import java.util.ArrayList;
import java.util.List;

public class ActivityActivity extends AppCompatActivity {


    private final Context context = this;

    private RecyclerView recyclerView;

    private List<BaseDataModel> data = new ArrayList<>();
    private ActivityAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ActivityAdapter(context, data);
        recyclerView.setAdapter(adapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        // TODO: just for test
        for (int i = 0; i < 11; i++) {
            data.add(new BaseDataModel("" + i * 234, "title " + i, "description asdasda sdasd asd das dasd as dads ads " + i, "location " + i, "12.02.2022", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTV-XL-dvaC-cblm2rqA7am9z2-54v_mGnaLDokhZQqEJbXFduZng", null, null));
        }
    }
}