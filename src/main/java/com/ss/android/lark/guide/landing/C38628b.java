package com.ss.android.lark.guide.landing;

import android.app.Activity;
import android.graphics.Bitmap;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.landing.general.C38630a;
import com.ss.android.lark.guide.landing.vc.VcWelcomeActivity;
import com.ss.android.lark.utils.PackageChannelManager;

/* renamed from: com.ss.android.lark.guide.landing.b */
public class C38628b implements AbstractC38627a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.landing.b$a */
    public static class C38629a {

        /* renamed from: a */
        public static C38628b f99303a = new C38628b();
    }

    /* renamed from: a */
    public static AbstractC38627a m152454a() {
        return C38629a.f99303a;
    }

    @Override // com.ss.android.lark.guide.landing.AbstractC38627a
    /* renamed from: a */
    public void mo141518a(Bitmap bitmap) {
        VcWelcomeActivity.m152515a(C38548a.m152027a().mo141251b(), bitmap);
    }

    @Override // com.ss.android.lark.guide.landing.AbstractC38627a
    /* renamed from: a */
    public boolean mo141519a(Activity activity) {
        if (PackageChannelManager.isKABuildPackage(activity)) {
            return false;
        }
        return C38630a.m152458a(activity);
    }
}
