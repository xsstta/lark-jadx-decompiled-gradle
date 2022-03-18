package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class StickyRecyclerView extends CommonRecyclerView {
    /* renamed from: a */
    private void m248524a() {
        setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public StickyRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void draw(Canvas canvas) {
        setVerticalScrollBarEnabled(false);
        super.draw(canvas);
        setVerticalScrollBarEnabled(true);
        super.onDrawScrollBars(canvas);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248524a();
    }
}
