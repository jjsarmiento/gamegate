package com.nixie.gamegate.adapters;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nixie.gamegate.R;
import com.nixie.gamegate.commons.BaseDomain;
import com.nixie.gamegate.commons.Util;
import com.nixie.gamegate.models.CardMain;

import java.util.ArrayList;

/**
 * Created by Phase1 on 9/29/2017.
 */

public class RvMainAdapter extends RecyclerView.Adapter<RvMainAdapter.RvMainViewHolder>{

    Util util;
    ArrayList<CardMain> cardMainArrayList;

    public RvMainAdapter(ArrayList<CardMain> cardMainArrayList) {
        this.cardMainArrayList = cardMainArrayList;
        util = new Util();
    }

    @Override
    public RvMainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_main, parent, false);
        final RvMainViewHolder rvMainViewHolder = new RvMainViewHolder(v);
        return rvMainViewHolder;
    }

    @Override
    public void onBindViewHolder(RvMainViewHolder holder, int position) {
        holder.tvTitle.setText(BaseDomain.cardMainList.get(position).getTitle());
        holder.tvContent.setText(BaseDomain.cardMainList.get(position).getContentShort());
        holder.ivHeadImg.setImageResource(BaseDomain.cardMainList.get(position).getUrlImg());
    }

    @Override
    public int getItemCount() {
        return cardMainArrayList.size();
    }

    public static class RvMainViewHolder extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener {

        private Util vhUtil;
        protected ImageView ivHeadImg;
        protected TextView tvTitle;
        protected TextView tvContent;
        protected Toolbar tbMenu;

        public RvMainViewHolder(View v) {
            super(v);
            this.vhUtil = new Util();
            tvTitle = v.findViewById(R.id.tv_title);
            tvContent = v.findViewById(R.id.tv_content);
            tbMenu = v.findViewById(R.id.tb_menu);
            ivHeadImg = v.findViewById(R.id.iv_headimg);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
