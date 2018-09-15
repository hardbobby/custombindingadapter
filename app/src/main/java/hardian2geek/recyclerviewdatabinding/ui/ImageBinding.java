package hardian2geek.recyclerviewdatabinding.ui;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import hardian2geek.recyclerviewdatabinding.R;

/**
 * Created by HR_21 on 9/15/2018.
 */
public class ImageBinding {

    @BindingAdapter(value ={"bind:setImage"})
    public static void setTypeCourse(ImageView imageView,String courseType){
        switch (courseType){
            case "PSY":
                imageView.setImageResource(R.drawable.ic_psych);
                break;
            case "MAT":
                imageView.setImageResource(R.drawable.ic_math);
                break;
            case "BIO":
                imageView.setImageResource(R.drawable.ic_bio);
                break;
            case "CHE":
                imageView.setImageResource(R.drawable.ic_ches);
                break;
            default:
                imageView.setImageResource(R.drawable.ic_test);
                break;
        }
    }
}
