package com.nixie.gamegate.commons;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.nixie.gamegate.adapters.RvMainAdapter;

/**
 * Created by Phase1 on 9/29/2017.
 */

public class Util {

    private Activity activity;

    public Util(Activity activity) {
        BaseDomain.activity = activity;
        this.activity       = activity;
    }

    public Util(){
        this.activity = BaseDomain.activity;
    }

    /**
     * Manage transition of activities
     * @param Class of destination
     * @return returns true if activity can transition else, false
     */
    public boolean start(Class destination) {
        if ( this.activity != null ) {
            Intent intent = new Intent(this.activity, destination);
            this.activity.startActivity(intent);
            return true;
        } else {
            return false;
        }
    }

    public boolean setRecyclerViewAdapter(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        if ( this.activity != null ) {
            LinearLayoutManager mLayoutManager = new LinearLayoutManager(this.activity);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setAdapter(adapter);
            return true;
        } else {
            return false;
        }
    }
}
