package com.tt.miniapp.launchaction;

import android.app.Activity;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.webapp.C13802g;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.ss.android.lark.log.Log;

/* renamed from: com.tt.miniapp.launchaction.g */
public class C66310g extends AbstractC66304c {

    /* renamed from: a */
    private WebAppContainerDelegate f167350a;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.launchaction.AbstractC66304c
    /* renamed from: a */
    public boolean mo231759a() {
        boolean a = C13802g.m55926a().mo50866b().mo50838a("openplatform.gadget.notice.enable");
        Log.m165389i("WebAppTopNotification", "isFgOpen = " + a);
        return a;
    }

    public C66310g(WebAppContainerDelegate webAppContainerDelegate) {
        super((FragmentActivity) webAppContainerDelegate.mo50999c(), webAppContainerDelegate.mo51007e());
        this.f167350a = webAppContainerDelegate;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.launchaction.AbstractC66304c
    /* renamed from: a */
    public ViewStub mo231757a(Activity activity, boolean z) {
        return this.f167350a.mo51021s();
    }
}
