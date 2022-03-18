package com.ss.android.lark.browser.biz.basic.jsapi.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class GoBackHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GoBackHandlerV2> CREATOR = new Parcelable.Creator<GoBackHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.GoBackHandlerV2.C297031 */

        /* renamed from: a */
        public GoBackHandlerV2[] newArray(int i) {
            return new GoBackHandlerV2[i];
        }

        /* renamed from: a */
        public GoBackHandlerV2 createFromParcel(Parcel parcel) {
            return new GoBackHandlerV2(parcel);
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

    public GoBackHandlerV2() {
    }

    protected GoBackHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    private void m109892a(AbstractC25832c cVar, int i) {
        if (cVar != null) {
            cVar.mo91902a("{" + "\"code\":" + String.valueOf(i) + "}");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        Log.m165389i("GoBackHandlerV2", "invoke api");
        if (mo91999w().mo67314g() == null) {
            Log.m165389i("GoBackHandlerV2", "webview is null");
            m109892a(cVar, 1);
            return;
        }
        if (mo91999w().mo67314g().canGoBack()) {
            Log.m165389i("GoBackHandlerV2", "webview goback");
            mo91999w().mo67314g().goBack();
        } else if (mo91997u() == null) {
            Log.m165389i("GoBackHandlerV2", "activity is null");
            m109892a(cVar, 1);
            return;
        } else {
            mo91997u().finish();
        }
        m109892a(cVar, 0);
    }
}
