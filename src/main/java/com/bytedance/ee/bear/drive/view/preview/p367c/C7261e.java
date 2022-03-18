package com.bytedance.ee.bear.drive.view.preview.p367c;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.drive.common.DriveNetUtils;
import com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.c.e */
public class C7261e {

    /* renamed from: a */
    private Context f19465a;

    public C7261e(Context context) {
        this.f19465a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m29032a(C7555f fVar, View view) {
        fVar.liveInnerReload().mo5926a((Void) null);
    }

    /* renamed from: a */
    public FailedToRetryView mo28363a(LifecycleOwner lifecycleOwner, C7555f fVar, boolean z) {
        String string = this.f19465a.getString(R.string.Drive_Drive_LoadingFail);
        if (C4211a.m17514a().mo16536a("ccm.drive.network_level_retry_enable", true) && (DriveNetUtils.m27237a() || DriveNetUtils.m27238b())) {
            string = this.f19465a.getResources().getString(R.string.CreationMobile_Common_NoInternet);
        }
        return mo28364a(lifecycleOwner, fVar, z, string);
    }

    /* renamed from: a */
    public FailedToRetryView mo28364a(LifecycleOwner lifecycleOwner, C7555f fVar, boolean z, String str) {
        FailedToRetryView failedToRetryView = new FailedToRetryView(this.f19465a);
        failedToRetryView.mo28991a(fVar, lifecycleOwner);
        failedToRetryView.setPlaceHolderText(str);
        failedToRetryView.setRetryClickListener(new FailedToRetryView.AbstractC7431a() {
            /* class com.bytedance.ee.bear.drive.view.preview.p367c.$$Lambda$e$kzRTNll7KXAuuqNHZ6YBHkbS7CA */

            @Override // com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView.AbstractC7431a
            public final void onRetryClick(View view) {
                C7261e.m29032a(C7555f.this, view);
            }
        });
        failedToRetryView.mo28989a(z);
        failedToRetryView.mo28993c();
        return failedToRetryView;
    }
}
