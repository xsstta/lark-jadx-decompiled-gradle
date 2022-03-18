package com.ss.android.vc.p3074c;

import android.content.Context;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.vc.meeting.module.liveroom.LandingPageActivity;

/* renamed from: com.ss.android.vc.c.b */
public class C60691b extends AbstractC60692c {
    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    public C60691b(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (context == null) {
            context = this.f151821a;
        }
        LandingPageActivity.m242279a(context);
        return true;
    }
}
