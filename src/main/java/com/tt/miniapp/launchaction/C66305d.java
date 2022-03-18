package com.tt.miniapp.launchaction;

import android.app.Activity;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;

/* renamed from: com.tt.miniapp.launchaction.d */
public class C66305d extends AbstractC66304c {
    public C66305d(FragmentActivity fragmentActivity, IAppContext iAppContext) {
        super(fragmentActivity, iAppContext);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.launchaction.AbstractC66304c
    /* renamed from: a */
    public ViewStub mo231757a(Activity activity, boolean z) {
        if (z) {
            return (ViewStub) activity.findViewById(R.id.microapp_m_app_notification_custom_stub);
        }
        return (ViewStub) activity.findViewById(R.id.microapp_m_app_notification_stub);
    }
}
