package com.example.star_wars;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.HeroHolder> {
   private ArrayList<StarConstructor> mData;
   private Context mActivity;

    public Adapter(ArrayList<StarConstructor> mData, Context mActivity) {
        this.mData = mData;
        this.mActivity = mActivity;
    }

    @NonNull
    @Override
    public HeroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.new_hero,parent,false);
      return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroHolder holder, final int position) {

        StarConstructor hero=mData.get(position);

        holder.heroName.setText(hero.getName());

        holder.heroId.setText(hero.getBornLocation());
        Glide.with(mActivity)
                .load(hero.getImage())
                .into(holder.heroImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mData.get(position).getName();
                String image=mData.get(position).getImage();
                String bornLocation=mData.get(position).getBornLocation();
//                String bornLocation=Integer.toString(mData.get(position).getBornLocation());
                List<String> aff=mData.get(position).getAffiliations();


                Intent intent=new Intent(mActivity,Details.class);
                intent.putExtra("bornLocation",bornLocation);
                intent.putExtra("name",name);
                intent.putExtra("image",image);
                intent.putStringArrayListExtra("aff",(ArrayList<String>)aff);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mActivity.startActivity(intent);

            }
        });
    }


    @Override
    public int getItemCount() {
        if(this.mData==null)

        return 0;
        return mData.size();
    }

    public class HeroHolder extends RecyclerView.ViewHolder{


        de.hdodenhof.circleimageview.CircleImageView heroImage;
        TextView heroName;
        TextView heroId;
        public HeroHolder(@NonNull View itemView) {
            super(itemView);
            heroImage=(de.hdodenhof.circleimageview.CircleImageView) itemView.findViewById(R.id.heroImage);
            heroName=(TextView) itemView.findViewById(R.id.heroName);
            heroId=(TextView)itemView.findViewById(R.id.heroId);
        }
    }
}
