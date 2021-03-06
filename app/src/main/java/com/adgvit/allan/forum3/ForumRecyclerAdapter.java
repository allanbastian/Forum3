package com.adgvit.allan.forum3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allan on 29-08-2017.
 */

public class ForumRecyclerAdapter extends RecyclerView.Adapter<ForumRecyclerAdapter.MyViewHolder>{
    LayoutInflater inflater;
    List<Item> data = new ArrayList<>();

    public ForumRecyclerAdapter(Context context, List<Item> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item current = data.get(position);
        holder.cardView.setVisibility(View.VISIBLE);
        holder.doubt.setText(current.question);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView doubt;
        ImageButton upVote;

        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card);
            doubt = (TextView) itemView.findViewById(R.id.ques);
                upVote = (ImageButton) itemView.findViewById(R.id.upVote);
        }
    }
}
