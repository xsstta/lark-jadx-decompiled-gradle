package com.ss.android.lark.calendar.impl.features.common.widget.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class MutableScrollView extends ScrollView {

    /* renamed from: a */
    public boolean f79054a;

    /* renamed from: b */
    protected AbstractC31234a f79055b;

    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView$a */
    public interface AbstractC31234a {
        /* renamed from: a */
        void mo112682a(int i, int i2);

        /* renamed from: a */
        void mo112683a(ScrollView scrollView);

        /* renamed from: a */
        boolean mo112684a();

        /* renamed from: b */
        void mo112685b();
    }

    /* renamed from: a */
    public void mo113346a() {
        this.f79054a = true;
    }

    /* renamed from: b */
    public void mo113348b() {
        this.f79054a = false;
    }

    /* renamed from: c */
    private void mo113352c() {
        this.f79054a = true;
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.scrollview.MutableScrollView.View$OnTouchListenerC312331 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return !MutableScrollView.this.f79054a;
            }
        });
    }

    public void setOnScrollChangedListener(AbstractC31234a aVar) {
        this.f79055b = aVar;
    }

    public MutableScrollView(Context context) {
        super(context);
        mo113352c();
    }

    /* renamed from: a */
    public void mo113347a(int i, int i2) {
        scrollTo(i, i2);
    }

    public MutableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo113352c();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        AbstractC31234a aVar = this.f79055b;
        if (aVar != null && !aVar.mo112684a()) {
            this.f79055b.mo112683a(this);
            this.f79055b.mo112682a(i, i2);
            this.f79055b.mo112683a(null);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }
}
