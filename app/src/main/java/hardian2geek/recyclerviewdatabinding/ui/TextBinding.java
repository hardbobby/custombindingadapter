package hardian2geek.recyclerviewdatabinding.ui;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by HR_21 on 9/15/2018.
 */
public class TextBinding {

    @BindingAdapter(value ={"bind:setPlanStart","bind:setPlanEnd"})
    public static void setTypeCourse(TextView textView, String planStart,String planEnd){
        textView.setText(String.format("%s - %s", planStart, planEnd));
    }
}
