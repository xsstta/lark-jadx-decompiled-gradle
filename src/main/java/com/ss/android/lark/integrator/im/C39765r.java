package com.ss.android.lark.integrator.im;

import android.app.Activity;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.ui.p1673c.AbstractC34033a;
import com.ss.android.lark.dependency.ap;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.dependency.AbstractC39580x;
import com.ss.android.lark.integrator.im.dependency.C39567i;
import com.ss.android.lark.integrator.im.dependency.C39569k;
import com.ss.android.lark.integrator.im.dependency.C39581y;
import com.ss.android.lark.phone.p2459a.AbstractC51337a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.integrator.im.r */
class C39765r implements AbstractC39580x {
    C39765r() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39580x
    /* renamed from: a */
    public ap mo143693a() {
        return new C39567i();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39580x
    /* renamed from: b */
    public AbstractC38037a.AbstractC38039aa mo143695b() {
        return new C39569k();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39580x
    /* renamed from: c */
    public AbstractC51337a.AbstractC51340c mo143696c() {
        return new C39581y();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39580x
    /* renamed from: a */
    public void mo143694a(Activity activity, String str) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).startVoIpActivityCheckPermission(activity, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39580x
    /* renamed from: a */
    public AbstractC34033a mo143692a(Activity activity, Chat chat, Chatter chatter) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).getChatTitleBarRightView(activity, chat, chatter);
    }
}
