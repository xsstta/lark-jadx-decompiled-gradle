package com.ss.android.lark.mm.module.player.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.videoshop.mediaview.SimpleMediaView;

public class MmSimpleMediaView extends SimpleMediaView {

    /* renamed from: d */
    private float f117236d;

    /* renamed from: e */
    private long f117237e;

    /* renamed from: f */
    private AbstractC46592a f117238f;

    /* renamed from: g */
    private int f117239g;

    /* renamed from: com.ss.android.lark.mm.module.player.core.MmSimpleMediaView$a */
    public interface AbstractC46592a {
        /* renamed from: a */
        void mo163652a(float f);

        /* renamed from: b */
        void mo163653b(float f);
    }

    /* renamed from: a */
    public void mo163648a() {
    }

    /* renamed from: a */
    public void mo163649a(long j) {
    }

    /* renamed from: n */
    private void m184238n() {
        this.f117239g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public void setListener(AbstractC46592a aVar) {
        this.f117238f = aVar;
    }

    public MmSimpleMediaView(Context context) {
        this(context, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0 != 3) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.player.core.MmSimpleMediaView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public MmSimpleMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmSimpleMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.lkui_N1000));
        m184238n();
    }
}
