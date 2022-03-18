package com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b;

import android.content.Context;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.p343a.C6901a;
import com.bytedance.ee.bear.facade.common.C7667e;

/* renamed from: com.bytedance.ee.bear.drive.common.mvpframeworks.app.b.c */
public abstract class AbstractC6904c extends C7667e {

    /* renamed from: a */
    private C6901a f18677a;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        C6901a aVar = this.f18677a;
        if (aVar == null || aVar.getBaseContext() != context) {
            this.f18677a = new C6901a(context, this);
        }
    }
}
