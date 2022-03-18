package com.ss.android.lark.browser.biz.basic.jsapi.util;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.suite.R;
import com.ss.android.lark.openapi.jsapi.entity.CopyText;

public class CopyTextHandlerV2 extends AbstractInjectJSApiHandler<CopyText> implements Parcelable {
    public static final Parcelable.Creator<CopyTextHandlerV2> CREATOR = new Parcelable.Creator<CopyTextHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.CopyTextHandlerV2.C297381 */

        /* renamed from: a */
        public CopyTextHandlerV2[] newArray(int i) {
            return new CopyTextHandlerV2[i];
        }

        /* renamed from: a */
        public CopyTextHandlerV2 createFromParcel(Parcel parcel) {
            return new CopyTextHandlerV2(parcel);
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

    public CopyTextHandlerV2() {
    }

    protected CopyTextHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(CopyText copyText, AbstractC25832c cVar) {
        String str;
        if (copyText == null) {
            str = "";
        } else {
            str = copyText.getText();
        }
        ((ClipboardManager) mo91997u().getSystemService("clipboard")).setText(str);
        LKUIToast.show(mo91997u(), mo91997u().getResources().getString(R.string.Lark_Legacy_CopyReady));
    }
}
