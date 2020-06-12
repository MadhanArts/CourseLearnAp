package com.madhanarts.courselearnapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.madhanarts.courselearnapp.CoursePage;
import com.madhanarts.courselearnapp.MainActivity;
import com.madhanarts.courselearnapp.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context context;
    List<String> categoryList;

    public CategoryAdapter(Context context, List<String> categoryList)
    {
        this.context = context;
        this.categoryList = categoryList;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.category_row_item, parent, false);

        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.categoryName.setText(categoryList.get(0));
        holder.totalCategory.setText(categoryList.get(1));

        //Glide.with(context).load(categoryList.get(position).getImage()).into(holder.categoryImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, CoursePage.class);

                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {

        return categoryList.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder
    {
        ImageView categoryImage;
        TextView categoryName, totalCategory;


        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.course_image);
            categoryName = itemView.findViewById(R.id.course_name);
            totalCategory = itemView.findViewById(R.id.total_course);


        }
    }

}
