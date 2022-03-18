package com.bytedance.ee.bear.document.multitask;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.slideback.SlideFrameLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/document/multitask/MultiTaskPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "TAG", "", "disableMultiTaskSlide", "", "enableMultiTaskSlide", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MultiTaskPlugin extends DocumentPlugin {
    private final String TAG = "MultiTaskPlugin";

    public final void disableMultiTaskSlide() {
        View view;
        C13479a.m54764b(this.TAG, "disableMultiTaskSlide()...");
        FragmentActivity activity = getActivity();
        ViewParent viewParent = null;
        if (activity != null) {
            view = activity.findViewById(16908290);
        } else {
            view = null;
        }
        if (view != null) {
            viewParent = view.getParent();
        }
        if (viewParent instanceof SlideFrameLayout) {
            C13479a.m54764b(this.TAG, "SlideFrameLayout exist, setCanSlide = false");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((SlideFrameLayout) parent).setSlideable(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.slideback.SlideFrameLayout");
        }
    }

    public final void enableMultiTaskSlide() {
        View view;
        C13479a.m54764b(this.TAG, "enableMultiTaskSlide()...");
        FragmentActivity activity = getActivity();
        ViewParent viewParent = null;
        if (activity != null) {
            view = activity.findViewById(16908290);
        } else {
            view = null;
        }
        if (view != null) {
            viewParent = view.getParent();
        }
        if (viewParent instanceof SlideFrameLayout) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((SlideFrameLayout) parent).setSlideable(true);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.slideback.SlideFrameLayout");
        }
    }
}
