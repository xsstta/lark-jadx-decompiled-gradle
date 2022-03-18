package com.ss.android.vc.meeting.module.multi.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class InMeetingViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f157364a;

    /* renamed from: b */
    private AbstractC62529a f157365b;

    /* renamed from: com.ss.android.vc.meeting.module.multi.viewpager.InMeetingViewPager$a */
    public interface AbstractC62529a {
        /* renamed from: a */
        void mo216171a(boolean z);
    }

    /* renamed from: a */
    public boolean mo216225a() {
        return this.f157364a;
    }

    public InMeetingViewPager(Context context) {
        super(context);
    }

    public void setTouchListener(AbstractC62529a aVar) {
        this.f157365b = aVar;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f157364a = true;
            AbstractC62529a aVar = this.f157365b;
            if (aVar != null) {
                aVar.mo216171a(true);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f157364a = false;
            AbstractC62529a aVar2 = this.f157365b;
            if (aVar2 != null) {
                aVar2.mo216171a(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InMeetingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
