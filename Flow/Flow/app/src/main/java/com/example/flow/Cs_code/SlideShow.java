package com.example.flow.Cs_code;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.flow.R;

public class SlideShow extends PagerAdapter {

    RecyclerView.LayoutManager layoutcontroller;
    Context context;
    LayoutInflater LayoutFlater;
    View Slide;

    public int[] Slides = {
            //generate a list for the images to be shown
            R.drawable.slide_show1,
            R.drawable.slide_show2,
            R.drawable.slide_show3

    };

    public SlideShow(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Slides.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //return super.instantiateItem(container, position);
        LayoutFlater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Slide = LayoutFlater.inflate(R.layout.fragment_home, container, false);

        //ImageView IV = Slide.findViewById(R.id.Img_Slide);
        //IV.setImageResource(Slides[position]);

       // container.addView(IV);
        return 0;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);

        container.removeView((LinearLayout)object);
    }
}
