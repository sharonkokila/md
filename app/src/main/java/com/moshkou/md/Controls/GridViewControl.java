package com.moshkou.md.Controls;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class GridViewControl extends GridView {

    public GridViewControl(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridViewControl(Context context) {
        super(context);
    }

    public GridViewControl(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}