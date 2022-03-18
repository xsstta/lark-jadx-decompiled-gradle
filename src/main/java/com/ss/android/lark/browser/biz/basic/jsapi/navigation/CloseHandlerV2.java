package com.ss.android.lark.browser.biz.basic.jsapi.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class CloseHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<CloseHandlerV2> CREATOR = new Parcelable.Creator<CloseHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.CloseHandlerV2.C297021 */

        /* renamed from: a */
        public CloseHandlerV2[] newArray(int i) {
            return new CloseHandlerV2[i];
        }

        /* renamed from: a */
        public CloseHandlerV2 createFromParcel(Parcel parcel) {
            return new CloseHandlerV2(parcel);
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

    public CloseHandlerV2() {
    }

    protected CloseHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        String str;
        Log.m165389i("CloseHandlerV2", "invoke api");
        if (mo91997u() != null) {
            mo91997u().finish();
        } else {
            Log.m165389i("CloseHandlerV2", "activity is null ");
        }
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append("\"code\":");
            if (mo91997u() == null) {
                str = "1";
            } else {
                str = "0";
            }
            sb.append(str);
            sb.append("}");
            cVar.mo91902a(sb.toString());
        }
    }
}
