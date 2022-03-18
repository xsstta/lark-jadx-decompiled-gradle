package com.ss.android.vc.meeting.module.p3117d;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.irtc.AbstractC61030i;

/* renamed from: com.ss.android.vc.meeting.module.d.a */
public class C61599a implements AbstractC61030i {

    /* renamed from: a */
    private String f154538a = "";

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: d */
    public void mo210661d() {
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: a */
    public void mo210658a() {
        C60700b.m235851b(this.f154538a, "[onBeginRender]", "onBeginRender");
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: b */
    public void mo210659b() {
        C60700b.m235851b(this.f154538a, "[onEndRender]", "onEndRender");
    }

    @Override // com.ss.android.vc.irtc.AbstractC61030i
    /* renamed from: c */
    public void mo210660c() {
        C60700b.m235851b(this.f154538a, "[onVideoFrameSizeChanged]", "onVideoFrameSizeChanged");
    }

    public C61599a(String str) {
        if (str != null) {
            this.f154538a = str;
        }
    }
}
