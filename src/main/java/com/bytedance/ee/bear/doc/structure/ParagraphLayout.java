package com.bytedance.ee.bear.doc.structure;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;

public class ParagraphLayout extends LinearLayout {

    /* renamed from: a */
    private int f15703a;

    /* renamed from: b */
    private boolean f15704b;

    /* renamed from: c */
    private int f15705c;

    /* renamed from: d */
    private int f15706d = -1;

    /* renamed from: e */
    private AbstractC5519a f15707e;

    /* renamed from: com.bytedance.ee.bear.doc.structure.ParagraphLayout$a */
    public interface AbstractC5519a {
        void doAction(float f);
    }

    public void setOnActionDownListener(AbstractC5519a aVar) {
        this.f15707e = aVar;
    }

    public ParagraphLayout(Context context) {
        super(context);
        m22431a(context);
    }

    /* renamed from: a */
    private void m22431a(Context context) {
        this.f15705c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.structure.ParagraphLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public ParagraphLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m22431a(context);
    }

    public ParagraphLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22431a(context);
    }
}
