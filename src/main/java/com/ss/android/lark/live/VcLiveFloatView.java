package com.ss.android.lark.live;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;

public class VcLiveFloatView extends FrameLayout {

    /* renamed from: a */
    private ViewGroup f105439a;

    /* renamed from: b */
    private AbstractC41472a f105440b;

    /* renamed from: com.ss.android.lark.live.VcLiveFloatView$a */
    public interface AbstractC41472a {
        void onClose();
    }

    /* renamed from: a */
    private void m164569a() {
        LayoutInflater.from(getContext()).inflate(R.layout.vc_live_float_window, (ViewGroup) this, true);
        this.f105439a = (ViewGroup) findViewById(R.id.flContainer);
        findViewById(R.id.v_close_delegate).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.live.$$Lambda$VcLiveFloatView$rmc2GhRe45kT6jYZXqPFFNjJc5k */

            public final void onClick(View view) {
                VcLiveFloatView.lambda$rmc2GhRe45kT6jYZXqPFFNjJc5k(VcLiveFloatView.this, view);
            }
        });
    }

    public void setCloseListener(AbstractC41472a aVar) {
        this.f105440b = aVar;
    }

    public VcLiveFloatView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m164570c(View view) {
        AbstractC41472a aVar = this.f105440b;
        if (aVar != null) {
            aVar.onClose();
        }
    }

    /* renamed from: a */
    public void mo149263a(View view) {
        this.f105439a.addView(view, -1, -1);
    }

    /* renamed from: b */
    public void mo149264b(View view) {
        this.f105439a.removeView(view);
    }

    public VcLiveFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VcLiveFloatView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public VcLiveFloatView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m164569a();
    }
}
