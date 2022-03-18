package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.NotificationToast;

public class ToastHandlerV2 extends AbstractInjectJSApiHandler<NotificationToast> implements Parcelable {
    public static final Parcelable.Creator<ToastHandlerV2> CREATOR = new Parcelable.Creator<ToastHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ToastHandlerV2.C297341 */

        /* renamed from: a */
        public ToastHandlerV2[] newArray(int i) {
            return new ToastHandlerV2[i];
        }

        /* renamed from: a */
        public ToastHandlerV2 createFromParcel(Parcel parcel) {
            return new ToastHandlerV2(parcel);
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

    public ToastHandlerV2() {
    }

    protected ToastHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NotificationToast notificationToast, AbstractC25832c cVar) {
        LKUIToast.show(mo91997u(), notificationToast.getText());
    }
}
