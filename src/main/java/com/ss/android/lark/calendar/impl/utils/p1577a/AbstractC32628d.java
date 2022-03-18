package com.ss.android.lark.calendar.impl.utils.p1577a;

import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.ss.android.lark.calendar.impl.utils.a.d */
public abstract class AbstractC32628d implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private long f83723a;

    /* renamed from: a */
    public abstract void mo115154a(AdapterView<?> adapterView, View view, int i, long j);

    /* renamed from: b */
    public boolean mo115543b(AdapterView<?> adapterView, View view, int i, long j) {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (mo115543b(adapterView, view, i, j)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f83723a > 1000) {
                mo115154a(adapterView, view, i, j);
                this.f83723a = uptimeMillis;
                return;
            }
            return;
        }
        mo115154a(adapterView, view, i, j);
    }
}
