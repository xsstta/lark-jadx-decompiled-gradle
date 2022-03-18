package com.ss.android.lark.widget.listener;

import android.os.SystemClock;
import android.view.View;

/* renamed from: com.ss.android.lark.widget.listener.d */
public abstract class AbstractView$OnClickListenerC58543d implements View.OnClickListener {

    /* renamed from: a */
    private long f144515a;

    /* renamed from: b */
    private long f144516b;

    /* renamed from: c */
    private int f144517c;

    /* renamed from: d */
    private int f144518d;

    /* renamed from: a */
    public abstract void mo195842a(View view);

    public AbstractView$OnClickListenerC58543d() {
        this.f144515a = 660;
        this.f144517c = 5;
        this.f144517c = 5;
        this.f144515a = 660;
    }

    public void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f144516b = uptimeMillis;
        if (uptimeMillis - this.f144516b < this.f144515a) {
            int i = this.f144518d + 1;
            this.f144518d = i;
            if (i >= 4) {
                this.f144518d = 0;
                mo195842a(view);
                return;
            }
            return;
        }
        this.f144518d = 0;
    }
}
