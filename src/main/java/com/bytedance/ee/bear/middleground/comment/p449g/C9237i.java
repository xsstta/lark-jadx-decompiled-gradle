package com.bytedance.ee.bear.middleground.comment.p449g;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.bytedance.ee.bear.middleground.comment.g.i */
public class C9237i {
    /* renamed from: a */
    public static void m38343a(final RecyclerView recyclerView, final View.OnLongClickListener onLongClickListener) {
        if (recyclerView != null && onLongClickListener != null) {
            recyclerView.setOnTouchListener(new View.OnTouchListener(new GestureDetector(recyclerView.getContext(), new GestureDetector.SimpleOnGestureListener() {
                /* class com.bytedance.ee.bear.middleground.comment.p449g.C9237i.C92381 */

                public void onLongPress(MotionEvent motionEvent) {
                    onLongClickListener.onLongClick(recyclerView);
                }
            })) {
                /* class com.bytedance.ee.bear.middleground.comment.p449g.$$Lambda$i$cQLihnlIGXsmBz0SgqOy9uq44p0 */
                public final /* synthetic */ GestureDetector f$0;

                {
                    this.f$0 = r1;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C9237i.m38344a(this.f$0, view, motionEvent);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m38344a(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        if (view instanceof RecyclerView) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }
}
