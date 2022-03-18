package com.ss.android.lark.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.util.TouchUtils;

public class PullDownRecyclerView extends RecyclerView {

    /* renamed from: a */
    public AbstractC58966a f146113a;

    /* renamed from: com.ss.android.lark.widget.recyclerview.PullDownRecyclerView$a */
    public interface AbstractC58966a {
        /* renamed from: a */
        void mo145869a(MotionEvent motionEvent);

        /* renamed from: b */
        void mo145870b(MotionEvent motionEvent);
    }

    public void setOnPullDownListener(AbstractC58966a aVar) {
        this.f146113a = aVar;
    }

    public PullDownRecyclerView(Context context) {
        this(context, null);
    }

    public PullDownRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PullDownRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TouchUtils.m230143a(this, new TouchUtils.AbstractView$OnTouchListenerC59251a() {
            /* class com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.C589651 */

            @Override // com.ss.android.lark.widget.util.TouchUtils.AbstractView$OnTouchListenerC59251a
            /* renamed from: a */
            public boolean mo197773a(View view, int i, int i2, MotionEvent motionEvent) {
                return false;
            }

            @Override // com.ss.android.lark.widget.util.TouchUtils.AbstractView$OnTouchListenerC59251a
            /* renamed from: a */
            public boolean mo197772a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent) {
                if (PullDownRecyclerView.this.canScrollVertically(-1) || i != 8 || PullDownRecyclerView.this.f146113a == null) {
                    return false;
                }
                PullDownRecyclerView.this.f146113a.mo145869a(motionEvent);
                return true;
            }

            @Override // com.ss.android.lark.widget.util.TouchUtils.AbstractView$OnTouchListenerC59251a
            /* renamed from: b */
            public boolean mo197774b(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, MotionEvent motionEvent) {
                if (!PullDownRecyclerView.this.canScrollVertically(-1) && i == 8 && PullDownRecyclerView.this.f146113a != null) {
                    PullDownRecyclerView.this.f146113a.mo145870b(motionEvent);
                }
                return false;
            }
        });
    }
}
