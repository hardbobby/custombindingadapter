package hardian2geek.recyclerviewdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

import hardian2geek.recyclerviewdatabinding.databinding.ActivityMainBinding;
import hardian2geek.recyclerviewdatabinding.recyclerview.Adapter.CourseAdapter;
import hardian2geek.recyclerviewdatabinding.Model.Course;

public class MainActivity extends AppCompatActivity {

    CourseAdapter courseAdapter;
    List<Course> courseList = new ArrayList<>();;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        courseAdapter = new CourseAdapter(courseList,MainActivity.this);
        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.recyclerView.setAdapter(courseAdapter);
        mainBinding.toolbar.setTitle("Recycler View Custom Adapter");
        setColorBar(R.color.blueBar);
        prepareData();
    }

    void prepareData(){
        Course course = new Course("1","PSY","Psychic","08.00","09.00",false);
        courseList.add(course);
        course = new Course("2","BIO","Biologi","09.00","10.00",false);
        courseList.add(course);
        course = new Course("3","MAT","Mathematic","10.00","11.00",false);
        courseList.add(course);
        course = new Course("4","CHE","Chemistry","12.00","12.00",false);
        courseList.add(course);
        course = new Course("5","EXM","Biology Exams","12.00","13.00",false);
        courseList.add(course);
        course = new Course("6","EXM","Mock Exams","13.00","14.00",false);
        courseList.add(course);
        course = new Course("7","BIO","Biology","14.00","15.00",false);
        courseList.add(course);
        course = new Course("8","MAT","Mathematics","15.00","16.00",false);
        courseList.add(course);
        course = new Course("9","CHE","Chemistry","16.00","17.00",false);
        courseList.add(course);
        courseAdapter.notifyDataSetChanged();

    }


    public void setColorBar(int colorID){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this , colorID));
        }
    }
}
