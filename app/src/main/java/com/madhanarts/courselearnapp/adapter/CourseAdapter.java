package com.madhanarts.courselearnapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.madhanarts.courselearnapp.R;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<String> courseList;

    public CourseAdapter(Context context, List<String> playList)
    {

        this.context = context;
        this.courseList = playList;

    }


    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.course_list_row_items, parent, false);

        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

        holder.contentNumber.setText(courseList.get(0));
        holder.contentTime.setText(courseList.get(1));
        holder.contentName.setText(courseList.get(2));

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder
    {

        TextView contentNumber, contentTime, contentName;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            contentNumber = itemView.findViewById(R.id.content_number);
            contentTime = itemView.findViewById(R.id.content_time);
            contentName = itemView.findViewById(R.id.course_name);



        }

    }

}
