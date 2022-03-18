package com.ss.android.appcenter.common.bannerview.p1289a;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;

/* renamed from: com.ss.android.appcenter.common.bannerview.a.a */
public class C28133a {

    /* renamed from: a */
    private final C28135c f70462a;

    /* renamed from: a */
    private void m102919a() {
        this.f70462a.mo100166a(Color.parseColor("#8C6C6D72"), Color.parseColor("#8C18171C"));
        this.f70462a.mo100169b(10, 10);
        this.f70462a.mo100168b(0);
        this.f70462a.mo100179f(0);
        this.f70462a.mo100181g(0);
        this.f70462a.mo100189k(0);
        this.f70462a.mo100164a((float) 10);
        this.f70462a.mo100183h(5);
    }

    /* renamed from: b */
    private void m102920b() {
        this.f70462a.mo100165a(3000);
        this.f70462a.mo100170b(true);
        this.f70462a.mo100167a(true);
        this.f70462a.mo100172c(0);
        this.f70462a.mo100175d(IByteRtcError.BRERR_INVALID_TOKEN);
        this.f70462a.mo100177e(IByteRtcError.BRERR_INVALID_TOKEN);
        this.f70462a.mo100185i(0);
        this.f70462a.mo100187j(0);
    }

    public C28133a(C28135c cVar) {
        this.f70462a = cVar;
    }

    /* renamed from: a */
    public void mo100155a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            m102920b();
            m102919a();
        }
    }
}
