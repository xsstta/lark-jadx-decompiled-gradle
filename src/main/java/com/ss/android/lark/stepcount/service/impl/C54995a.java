package com.ss.android.lark.stepcount.service.impl;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.stepcount.dto.DayStepInfo;
import com.ss.android.lark.stepcount.p2713b.C54990a;
import com.ss.android.lark.stepcount.service.AbstractC54994a;
import com.ss.android.lark.util.share_preference.C57744a;

/* renamed from: com.ss.android.lark.stepcount.service.impl.a */
public class C54995a implements AbstractC54994a {

    /* renamed from: d */
    private static C54995a f135927d = new C54995a();

    /* renamed from: a */
    private boolean f135928a;

    /* renamed from: b */
    private C54990a f135929b;

    /* renamed from: c */
    private boolean f135930c = C57744a.m224104a().getBoolean("key_step_count_authorized", false);

    /* renamed from: b */
    public static C54995a m213613b() {
        return f135927d;
    }

    /* renamed from: d */
    public boolean mo187803d() {
        return this.f135930c;
    }

    private C54995a() {
    }

    @Override // com.ss.android.lark.stepcount.service.AbstractC54994a
    /* renamed from: a */
    public void mo187799a() {
        if (this.f135930c) {
            this.f135928a = false;
            if (this.f135929b != null) {
                Log.m165389i("StepCountService", " unregister StepCount ");
                this.f135929b.mo187775b();
            }
        }
    }

    /* renamed from: c */
    public int mo187802c() {
        C54990a aVar = this.f135929b;
        if (aVar != null) {
            return aVar.mo187773a();
        }
        DayStepInfo dayStepInfo = (DayStepInfo) C57744a.m224104a().getJSONObject("key_step_count_day", DayStepInfo.class);
        if (dayStepInfo != null) {
            return dayStepInfo.getStepCount() + dayStepInfo.getErrCount();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo187801a(boolean z) {
        this.f135930c = z;
        C57744a.m224104a().putBoolean("key_step_count_authorized", z);
    }

    @Override // com.ss.android.lark.stepcount.service.AbstractC54994a
    /* renamed from: a */
    public void mo187800a(Context context) {
        if (this.f135930c && !this.f135928a) {
            Log.m165383e("StepCountService", " register StepCount ");
            this.f135929b = new C54990a(context);
            this.f135928a = true;
        }
    }
}
