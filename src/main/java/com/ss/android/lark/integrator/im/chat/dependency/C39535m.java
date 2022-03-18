package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.biz.core.api.FilePickerLaunchParams;
import com.ss.android.lark.dependency.AbstractC36506t;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.integrator.im.C39603g;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.m */
class C39535m implements AbstractC36506t {
    C39535m() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36506t
    /* renamed from: a */
    public String mo134708a() {
        return C39603g.m157159a().getCoreDependency().mo143393S();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36506t
    /* renamed from: a */
    public void mo134709a(Activity activity, C36516a aVar, int i, long j, long j2, String str, String str2, boolean z) {
        FilePickerLaunchParams fVar = new FilePickerLaunchParams(activity, i);
        fVar.mo105742b(j);
        fVar.mo105737a(j2);
        fVar.mo105743b(str);
        fVar.mo105738a(str2);
        fVar.mo105739a(z);
        C39603g.m157159a().getCoreDependency().mo143428a(activity, fVar, aVar, DesktopUtil.m144301a((Context) activity));
    }
}
