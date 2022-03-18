package com.ss.android.lark.browser.biz.basic.jsapi.util;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.biz.basic.jsapi.p1414a.C29656b;
import com.ss.android.lark.browser.biz.basic.jsapi.p1414a.p1415a.AbstractC29655a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;

public class SavePageSnapshotHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<SavePageSnapshotHandlerV2> CREATOR = new Parcelable.Creator<SavePageSnapshotHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.SavePageSnapshotHandlerV2.C297462 */

        /* renamed from: a */
        public SavePageSnapshotHandlerV2[] newArray(int i) {
            return new SavePageSnapshotHandlerV2[i];
        }

        /* renamed from: a */
        public SavePageSnapshotHandlerV2 createFromParcel(Parcel parcel) {
            return new SavePageSnapshotHandlerV2(parcel);
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

    public SavePageSnapshotHandlerV2() {
    }

    protected SavePageSnapshotHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public void mo107138a(final File file) {
        AbstractC68307f.m265083a((Object) true).mo237985a(LarkRxSchedulers.io()).mo238020d(new Function<Boolean, File>() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.util.SavePageSnapshotHandlerV2.C297484 */

            /* renamed from: a */
            public File apply(Boolean bool) throws Exception {
                File file = new File(C57881t.m224651w(SavePageSnapshotHandlerV2.this.mo91997u()), C26279i.m95152a("yyyyMMddHHmmss") + ".jpg");
                if (!file.exists()) {
                    file.createNewFile();
                }
                C26311p.m95271a(file, file);
                C26311p.m95268a(SavePageSnapshotHandlerV2.this.mo91997u(), file.getAbsolutePath());
                return file;
            }
        }).mo237985a(LarkRxSchedulers.mainThread()).mo238018d(new Consumer<File>() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.util.SavePageSnapshotHandlerV2.C297473 */

            /* renamed from: a */
            public void accept(File file) throws Exception {
                LKUIToast.show(SavePageSnapshotHandlerV2.this.mo91997u(), (int) R.string.Lark_UsageReport_SaveSuccessfully);
            }
        });
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        C29656b.m109747a(mo91999w().mo67314g(), new AbstractC29655a() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.util.SavePageSnapshotHandlerV2.C297451 */

            @Override // com.ss.android.lark.browser.biz.basic.jsapi.p1414a.p1415a.AbstractC29655a
            /* renamed from: a */
            public void mo106897a() {
            }

            @Override // com.ss.android.lark.browser.biz.basic.jsapi.p1414a.p1415a.AbstractC29655a
            /* renamed from: a */
            public void mo106899a(File file) {
                SavePageSnapshotHandlerV2.this.mo107138a(file);
            }

            @Override // com.ss.android.lark.browser.biz.basic.jsapi.p1414a.p1415a.AbstractC29655a
            /* renamed from: a */
            public void mo106898a(int i, String str) {
                LKUIToast.show(SavePageSnapshotHandlerV2.this.mo91997u(), C57582a.m223604a((Context) SavePageSnapshotHandlerV2.this.mo91997u(), (int) R.string.Lark_UsageReport_SaveFailed));
            }
        });
    }
}
