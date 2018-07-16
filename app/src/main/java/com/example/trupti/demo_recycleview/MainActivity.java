package com.example.trupti.demo_recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //0
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);


        // 1this is data fro recycler view
        Dataiteam itemsData[] = { new Dataiteam("Help",R.drawable.ic_android_black_24dp),
                new Dataiteam("Delete",R.drawable.ic_android_black_24dp),
                new Dataiteam("Cloud",R.drawable.ic_android_black_24dp),
                new Dataiteam("Favorite",R.drawable.ic_android_black_24dp),
                new Dataiteam("Like",R.drawable.ic_android_black_24dp),
                new Dataiteam("Rating",R.drawable.ic_android_black_24dp)};

        // 2. set layoutManger
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        // 3. create an adapter
        MyAdapter mAdapter = new MyAdapter(itemsData);
        // 4. set adapter
        recyclerView.setAdapter(mAdapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());




      /*  *//* recyclerview one*//* first type
        recyclerViewone.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));


        recyclerViewone.setAdapter(mAdapter);
        recyclerViewone.setItemAnimator(new DefaultItemAnimator());*/



        /*  recyclerview one*/ //second type

      //0
        RecyclerView recyclerViewone=(RecyclerView)findViewById(R.id.rvone);

        //1
        Dataiteam itemsDataone[] = { new Dataiteam("Help",R.drawable.ic_arrow_drop_down_circle_black_24dp),
                new Dataiteam("Delete",R.drawable.ic_arrow_drop_down_circle_black_24dp),
                new Dataiteam("Cloud",R.drawable.ic_arrow_drop_down_circle_black_24dp),
                new Dataiteam("Favorite",R.drawable.ic_arrow_drop_down_circle_black_24dp),
                new Dataiteam("Like",R.drawable.ic_arrow_drop_down_circle_black_24dp),
                new Dataiteam("Rating",R.drawable.ic_arrow_drop_down_circle_black_24dp)};

        recyclerViewone.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        // 3. create an adapter
        MyAdapterone mAdapterone = new MyAdapterone(itemsDataone);
        // 4. set adapter
        recyclerViewone.setAdapter(mAdapterone);
        // 5. set item animator to DefaultAnimator
        recyclerViewone.setItemAnimator(new DefaultItemAnimator());




          /*  recyclerview two first type*/
          RecyclerView recyclerviewtwo=(RecyclerView)findViewById(R.id.rvtwo);

        recyclerviewtwo.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));


        recyclerviewtwo.setAdapter(mAdapterone);
        recyclerviewtwo.setItemAnimator(new DefaultItemAnimator());




         /*  recyclerview three first type*/
        RecyclerView recyclerviewthree=(RecyclerView)findViewById(R.id.rvthree);

        recyclerviewthree.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));


        recyclerviewthree.setAdapter(mAdapterone);
        recyclerviewthree.setItemAnimator(new DefaultItemAnimator());







    }
}
