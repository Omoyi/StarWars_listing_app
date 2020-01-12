package com.example.star_wars;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.HeroHolder> {
   private ArrayList<StarConstructor> stars;
   private Context context;

    public Adapter(ArrayList<StarConstructor> stars, Context context) {
        this.stars = stars;
        this.context = context;
    }

    @NonNull
    @Override
    public HeroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.new_hero,parent,false);
      return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroHolder holder, final int position) {

        StarConstructor hero=stars.get(position);

        holder.heroName.setText(hero.getName());

        holder.heroId.setText(hero.getHairColor());
        Glide.with(context)
                .load(hero.getImage())
                .into(holder.heroImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=stars.get(position).getName();
                String image=stars.get(position).getImage();
                String id=Integer.toString(stars.get(position).getId());
                List<String> aff=stars.get(position).getAffiliations();
                List<String> masters=stars.get(position).getMasters();
                List<String> app=stars.get(position).getApprentices();
                String gender=stars.get(position).getGender();
                String height=Integer.toString(stars.get(position).getHeight());
                String born=stars.get(position).getBornLocation();
                String wiki=(stars.get(position).getWiki());
                String homeWorld=stars.get(position).getHomeworld();
                String eyeColor=stars.get(position).getEyeColor();


                Intent intent=new Intent(context,Details.class);
                intent.putExtra("image",image);
                intent.putExtra("id",id);
                intent.putExtra("name",name);
                intent.putExtra("gender",gender);
                intent.putExtra("height",height);
                intent.putExtra("birthPlace",born);
                intent.putExtra("wiki",wiki);
                intent.putExtra("homeWorld",homeWorld);
                intent.putExtra("eyeColor",eyeColor);
                intent.putStringArrayListExtra("aff",(ArrayList<String>)aff);
                intent.putStringArrayListExtra("mast",(ArrayList<String>)masters);
                intent.putStringArrayListExtra("app",(ArrayList<String>)app);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        if(this.stars==null)

        return 0;
        return stars.size();
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
