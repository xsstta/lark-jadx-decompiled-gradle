package com.ss.android.vc.meeting.module.follow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.ss.android.vc.common.p3077b.C60700b;

public class FollowContentViewControlContainer extends FrameLayout {

    /* renamed from: a */
    private IFollowContainerEventProcessor f154919a;

    public FollowContentViewControlContainer(Context context) {
        super(context);
    }

    public void setInterceptChecker(IFollowContainerEventProcessor iFollowContainerEventProcessor) {
        this.f154919a = iFollowContainerEventProcessor;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 8) {
            this.f154919a.mo213912n();
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f154919a.mo213912n();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            C60700b.m235864f("FollowFragmentContainer", "[dispatchTouchEvent]", "Exception: " + e.getMessage());
            return false;
        }
    }

    public FollowContentViewControlContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowContentViewControlContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
