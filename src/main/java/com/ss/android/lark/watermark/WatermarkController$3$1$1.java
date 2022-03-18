package com.ss.android.lark.watermark;

import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.watermark.C58222b;

class WatermarkController$3$1$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ C58222b.C582345.RunnableC582351 f143152a;

    WatermarkController$3$1$1(C58222b.C582345.RunnableC582351 r1) {
        this.f143152a = r1;
    }

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            C58222b.this.mo197249a(r9);
        }
    }
}
