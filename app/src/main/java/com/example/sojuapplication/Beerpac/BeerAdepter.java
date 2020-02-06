package com.example.sojuapplication.Beerpac;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sojuapplication.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class BeerAdepter extends RecyclerView.Adapter<BeerAdepter.ViewHolder> {

    private ArrayList<Item> mData = null ;

    Context context;
    List<Item> items;

    private int item_layout;
// 아이템 뷰를 저장하는 뷰홀더 클래스.


    // 생성자에서 데이터 리스트 객체를 전달받음.
    public BeerAdepter(Context context, List<Item> items, int item_layout) {
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.beeritem, null);
        return new ViewHolder(v);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Item item = items.get(position);

        //Drawable drawable = ContextCompat.getDrawable(context, item.getImage());
        holder.title.setText(item.getTitle());
        holder.contents.setText(item.getContents()); // User -> User_Name
        holder.image.setImageResource(item.getImage()); // How_Cloth -> Cody_ID
        holder.image.setBackgroundResource(R.drawable.imageback);


        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SelectfoodbeerActivity.class);
                intent.putExtra("id",item.getID());
                //Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), item.getImage());
                //ByteArrayOutputStream baos = new ByteArrayOutputStream();
                //bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                //byte[] b = baos.toByteArray();

                intent.putExtra("image",item.getImage());
                intent.putExtra("title",item.getTitle());
                context.startActivity(intent.addFlags(FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title,contents;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
            contents = (TextView) itemView.findViewById(R.id.contents);
            image = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.title);
            cardview = (CardView) itemView.findViewById(R.id.cardview);
        }
    }
}
