package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.suite.R;
import com.ss.android.lark.openapi.jsapi.entity.NotificationAlert;

public class AlertHandlerV2 extends AbstractInjectJSApiHandler<NotificationAlert> implements Parcelable {
    public static final Parcelable.Creator<AlertHandlerV2> CREATOR = new Parcelable.Creator<AlertHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.AlertHandlerV2.C297252 */

        /* renamed from: a */
        public AlertHandlerV2[] newArray(int i) {
            return new AlertHandlerV2[i];
        }

        /* renamed from: a */
        public AlertHandlerV2 createFromParcel(Parcel parcel) {
            return new AlertHandlerV2(parcel);
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

    public AlertHandlerV2() {
    }

    protected AlertHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NotificationAlert notificationAlert, final AbstractC25832c cVar) {
        new C25639g(mo91997u()).mo89237b(notificationAlert.getTitle()).mo89242c(notificationAlert.getMessage()).mo89225a(R.id.lkui_dialog_btn_right, notificationAlert.getButtonName(), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.AlertHandlerV2.DialogInterface$OnClickListenerC297241 */

            public void onClick(DialogInterface dialogInterface, int i) {
                cVar.mo91902a("");
            }
        }).mo89239c();
    }
}
