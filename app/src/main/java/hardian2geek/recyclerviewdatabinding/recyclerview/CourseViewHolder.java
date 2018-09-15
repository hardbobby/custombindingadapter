package hardian2geek.recyclerviewdatabinding.recyclerview;

import android.support.v7.widget.RecyclerView;


import hardian2geek.recyclerviewdatabinding.databinding.ItemCourseBinding;

/**
 * Created by HR_21 on 9/15/2018.
 */
public class CourseViewHolder extends RecyclerView.ViewHolder {
    public ItemCourseBinding itemCourseBinding;

    public CourseViewHolder(ItemCourseBinding itemCourseBinding) {
        super(itemCourseBinding.getRoot());
        this.itemCourseBinding = itemCourseBinding;
    }
}
