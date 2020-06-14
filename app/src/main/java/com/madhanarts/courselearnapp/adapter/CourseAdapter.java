package com.madhanarts.courselearnapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.madhanarts.courselearnapp.R;
import com.madhanarts.courselearnapp.model.PlayList;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<PlayList> playLists;

    public CourseAdapter(Context context, List<PlayList> playList)
    {

        this.context = context;
        this.playLists = playList;

    }


    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.course_list_row_items, parent, false);

        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

        holder.contentNumber.setText(playLists.get(position).getContentNumber());
        holder.contentTime.setText(playLists.get(position).getContentTime());
        holder.contentTitle.setText(playLists.get(position).getContentTitle());

    }

    @Override
    public int getItemCount() {
        return playLists.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder
    {

        TextView contentNumber, contentTime, contentTitle;


        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            contentNumber = itemView.findViewById(R.id.content_number);
            contentTime = itemView.findViewById(R.id.content_time);
            contentTitle = itemView.findViewById(R.id.content_title);

        }

    }

}
