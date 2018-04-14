package com.example.pcx.edusend;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mComtext;
    private List<Book> mData;

    public RecyclerViewAdapter(Context mComtext, List<Book> mData) {
        this.mComtext = mComtext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mComtext);
        view = mInflater.inflate(R.layout.cardview_item_book,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumpnail());
        holder.cardView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passing data to the book activity
                Intent intent = new Intent(mComtext,Book_Activity.class);
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("cate",mData.get(position).getCategory());
                intent.putExtra("Description",mData.get(position).getDescrip());
                intent.putExtra("Thumbnail",mData.get(position).getThumpnail());
                //Start The Activity
                mComtext.startActivity(intent);


            }
        });
        //Set Click Listener




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView0 ;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_book_title = (TextView) itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.book_img_id);
            cardView0 = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }
}
