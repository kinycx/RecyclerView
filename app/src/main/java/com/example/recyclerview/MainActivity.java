package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    //Creo le stesse liste che ho creato nell'Adapter perchè le andremo a passare all'Adapter
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started");

        initImageBitmaps();
    }


    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://66.media.tumblr.com/3aa413e500a255741c9f22c5441e6d8a/tumblr_pyubpjS2af1xoyw8po1_1280.png");
        mNames.add("Duck Souls");

        mImageUrls.add("https://66.media.tumblr.com/c29ff41282793d597beed65e261b8bee/tumblr_nde4q97oCO1tdhr8ro1_500.jpg");
        mNames.add("Finn");

        mImageUrls.add("https://66.media.tumblr.com/e15379b390cd5a3784fc302662a78b56/tumblr_ooo7x2hvM31u8rczxo4_540.jpg");
        mNames.add("Faggot");

        mImageUrls.add("https://66.media.tumblr.com/8e5b659cde2bf0ac2183d329103d56d1/tumblr_ng6t0zsD6c1qizg97o1_540.jpg");
        mNames.add("catto");

        mImageUrls.add("https://66.media.tumblr.com/7929355027509a222bc4c4c845548577/tumblr_n6lnmcNx731qa3kooo1_540.jpg");
        mNames.add("catto spaghetti");

        mImageUrls.add("https://66.media.tumblr.com/e6bbdce23a3c330218a290711d9edf95/tumblr_nb3b0sHA1D1qewacoo1_500.jpg");
        mNames.add("pags");

        mImageUrls.add("https://66.media.tumblr.com/440d074d7fbbbf48109846ddc8a799ea/tumblr_mo7qmcoi151rb3l2vo1_540.jpg");
        mNames.add("Fry1");

        mImageUrls.add("https://66.media.tumblr.com/12bb106e09aae39c685ecf54fbc37e00/tumblr_mo7qmcoi151rb3l2vo2_540.jpg");
        mNames.add("Fry2");

        mImageUrls.add("https://66.media.tumblr.com/9f0907c8b5d1c49f258349866bdc948d/tumblr_mo7qmcoi151rb3l2vo3_540.jpg");
        mNames.add("Fry2");

        mImageUrls.add("https://66.media.tumblr.com/e8f2260a92fc170002ebf14e44c84ef1/tumblr_mo7qmcoi151rb3l2vo4_540.jpg");
        mNames.add("Fry3");

        mImageUrls.add("https://66.media.tumblr.com/db0e609c133ecaeb655af21b264f9aab/tumblr_mo7qmcoi151rb3l2vo6_540.jpg");
        mNames.add("Fry4");

        mImageUrls.add("https://66.media.tumblr.com/2c552c32f8a23e2f1f0e30dc9020dcbe/tumblr_mo7qmcoi151rb3l2vo7_540.jpg");
        mNames.add("Fry5");

        mImageUrls.add("https://66.media.tumblr.com/44b0f1e36b4e44dbfa1bdd07a32c6d00/tumblr_mo7qmcoi151rb3l2vo8_540.jpg");
        mNames.add("Fry6");

        mImageUrls.add("https://66.media.tumblr.com/d654d24db78ef10669b7e68da6a9d076/tumblr_mo7qmcoi151rb3l2vo9_540.jpg");
        mNames.add("Fry7");

        mImageUrls.add("https://66.media.tumblr.com/17c79d3b22b252a6588b9c0f60e6268b/tumblr_mo7qmcoi151rb3l2vo10_540.jpg");
        mNames.add("Fry8");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerView");

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
