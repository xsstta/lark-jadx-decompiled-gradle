package com.bytedance.ee.bear.photopicker.photo;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;

public class MediaPickerViewLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    public void mo39832a() {
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        if (findLastVisibleItemPosition >= 0) {
            m43500a(findViewByPosition(findLastVisibleItemPosition));
            int i = findLastVisibleItemPosition - 1;
            if (i >= 0) {
                m43501b(findViewByPosition(i));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        mo39832a();
    }

    /* renamed from: a */
    private void m43500a(View view) {
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.v_selected_region);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                int width = relativeLayout.getWidth();
                int width2 = view.getWidth() - width;
                int i = rect.right;
                if (i < width) {
                    relativeLayout.offsetLeftAndRight(-((int) relativeLayout.getX()));
                } else {
                    relativeLayout.offsetLeftAndRight(Math.min(width2, i - width) - ((int) relativeLayout.getX()));
                }
            }
        }
    }

    /* renamed from: b */
    private void m43501b(View view) {
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.v_selected_region);
            relativeLayout.offsetLeftAndRight(((view.getWidth() - relativeLayout.getWidth()) - ((ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams()).rightMargin) - ((int) relativeLayout.getX()));
        }
    }

    public MediaPickerViewLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public MediaPickerViewLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
