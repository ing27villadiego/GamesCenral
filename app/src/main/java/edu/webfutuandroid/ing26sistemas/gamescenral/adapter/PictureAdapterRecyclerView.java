package edu.webfutuandroid.ing26sistemas.gamescenral.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.webfutuandroid.ing26sistemas.gamescenral.R;
import edu.webfutuandroid.ing26sistemas.gamescenral.model.Picture;

/**
 * Created by ing26sistemas on 22/10/17.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.nameCard.setText(picture.getNameCard());
        holder.citynameCard.setText(picture.getCitynameCard());
        Picasso.with(activity).load(picture.getPicture()).into(holder.pictureCard);


    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder {

        private ImageView pictureCard;
        private TextView nameCard;
        private TextView citynameCard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            pictureCard   = itemView.findViewById(R.id.pictureCard);
            nameCard      = itemView.findViewById(R.id.nameCard);
            citynameCard  = itemView.findViewById(R.id.citynameCard);


        }
    }


}
