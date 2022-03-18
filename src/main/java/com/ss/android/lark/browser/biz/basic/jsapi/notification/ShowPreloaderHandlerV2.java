package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.NotificationPreloader;
import com.ss.android.lark.ui.C57603e;

public class ShowPreloaderHandlerV2 extends AbstractInjectJSApiHandler<NotificationPreloader> implements Parcelable {
    public static final Parcelable.Creator<ShowPreloaderHandlerV2> CREATOR = new Parcelable.Creator<ShowPreloaderHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ShowPreloaderHandlerV2.C297331 */

        /* renamed from: a */
        public ShowPreloaderHandlerV2[] newArray(int i) {
            return new ShowPreloaderHandlerV2[i];
        }

        /* renamed from: a */
        public ShowPreloaderHandlerV2 createFromParcel(Parcel parcel) {
            return new ShowPreloaderHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private C57603e f74444a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public ShowPreloaderHandlerV2() {
    }

    protected ShowPreloaderHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        if (mo91995c("PRELOADER_HANDLER_V2_COMMON_LOADING_MANAGER") == null) {
            C57603e eVar = new C57603e(mo91997u());
            this.f74444a = eVar;
            mo91992a("PRELOADER_HANDLER_V2_COMMON_LOADING_MANAGER", eVar);
            return;
        }
        this.f74444a = (C57603e) mo91995c("PRELOADER_HANDLER_V2_COMMON_LOADING_MANAGER");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NotificationPreloader notificationPreloader, AbstractC25832c cVar) {
        if (notificationPreloader != null) {
            this.f74444a.mo195583a(notificationPreloader.isShowIcon(), notificationPreloader.getText());
        } else {
            this.f74444a.mo195582a();
        }
    }
}
