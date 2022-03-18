package com.ss.android.lark.apihandler.basic.jsapi.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.apihandler.basic.jsapi.p1350a.C28721b;
import com.ss.android.lark.apihandler.basic.jsapi.p1350a.p1351a.AbstractC28720a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;

public class SharePageSnapshotHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<SharePageSnapshotHandlerV2> CREATOR = new Parcelable.Creator<SharePageSnapshotHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.util.SharePageSnapshotHandlerV2.C288192 */

        /* renamed from: a */
        public SharePageSnapshotHandlerV2[] newArray(int i) {
            return new SharePageSnapshotHandlerV2[i];
        }

        /* renamed from: a */
        public SharePageSnapshotHandlerV2 createFromParcel(Parcel parcel) {
            return new SharePageSnapshotHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public SharePageSnapshotHandlerV2() {
    }

    protected SharePageSnapshotHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public void mo102399a(File file) {
        Uri fromFile = Uri.fromFile(file);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", fromFile);
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        try {
            mo91997u().startActivity(Intent.createChooser(intent, UIUtils.getString(mo91997u(), R.string.Lark_UsageReport_Share)));
        } catch (Exception e) {
            Log.m165382e(e.toString());
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        C28721b.m105297a(mo91999w().mo67314g(), new AbstractC28720a() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.util.SharePageSnapshotHandlerV2.C288171 */

            @Override // com.ss.android.lark.apihandler.basic.jsapi.p1350a.p1351a.AbstractC28720a
            /* renamed from: a */
            public void mo102134a() {
            }

            @Override // com.ss.android.lark.apihandler.basic.jsapi.p1350a.p1351a.AbstractC28720a
            /* renamed from: a */
            public void mo102136a(final File file) {
                SharePageSnapshotHandlerV2.this.mo91999w().mo67314g().postDelayed(new Runnable() {
                    /* class com.ss.android.lark.apihandler.basic.jsapi.util.SharePageSnapshotHandlerV2.C288171.RunnableC288181 */

                    public void run() {
                        SharePageSnapshotHandlerV2.this.mo102399a(file);
                    }
                }, 50);
            }

            @Override // com.ss.android.lark.apihandler.basic.jsapi.p1350a.p1351a.AbstractC28720a
            /* renamed from: a */
            public void mo102135a(int i, String str) {
                LKUIToast.show(SharePageSnapshotHandlerV2.this.mo91997u(), UIHelper.getString(R.string.Lark_UsageReport_ShareFailed));
            }
        });
    }
}
