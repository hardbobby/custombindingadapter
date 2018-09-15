package hardian2geek.recyclerviewdatabinding.recyclerview.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import hardian2geek.recyclerviewdatabinding.R;
import hardian2geek.recyclerviewdatabinding.databinding.ItemCourseBinding;
import hardian2geek.recyclerviewdatabinding.Model.Course;
import hardian2geek.recyclerviewdatabinding.recyclerview.CourseViewHolder;

/**
 * Created by HR_21 on 9/15/2018.
 */
public class CourseAdapter extends RecyclerView.Adapter<CourseViewHolder> {

    List<Course> courseList;
    Context mContext;

    public CourseAdapter(List<Course> courses,Context context){
        this.courseList = courses;
        this.mContext = context;
    }



    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCourseBinding itemCourseBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_course,parent,false);
        return new CourseViewHolder(itemCourseBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

        Course course = courseList.get(position);
        holder.itemCourseBinding.setCourseItem(course);

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
}
