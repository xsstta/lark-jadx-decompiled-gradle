package com.bytedance.ee.bear.drive.view.preview.imageviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.log.C13479a;

public class DrivePreviewViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f19662a = true;

    public void setEnableSwipe(boolean z) {
        this.f19662a = z;
    }

    public DrivePreviewViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f19662a || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            C13479a.m54772d("DrivePhotoViewPager", "onInterceptTouchEvent " + e.getMessage());
            return false;
        }
    }

    public DrivePreviewViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
