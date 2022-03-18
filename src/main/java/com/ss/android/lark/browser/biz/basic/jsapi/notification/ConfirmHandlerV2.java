package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.openapi.jsapi.entity.NotificationConfirm;

public class ConfirmHandlerV2 extends AbstractInjectJSApiHandler<NotificationConfirm> implements Parcelable {
    public static final Parcelable.Creator<ConfirmHandlerV2> CREATOR = new Parcelable.Creator<ConfirmHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ConfirmHandlerV2.C297283 */

        /* renamed from: a */
        public ConfirmHandlerV2[] newArray(int i) {
            return new ConfirmHandlerV2[i];
        }

        /* renamed from: a */
        public ConfirmHandlerV2 createFromParcel(Parcel parcel) {
            return new ConfirmHandlerV2(parcel);
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

    public ConfirmHandlerV2() {
    }

    protected ConfirmHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NotificationConfirm notificationConfirm, final AbstractC25832c cVar) {
        if (notificationConfirm != null && !CollectionUtils.isEmpty(notificationConfirm.getButtonLabels())) {
            C25639g gVar = new C25639g(mo91997u());
            gVar.mo89237b(notificationConfirm.getTitle()).mo89242c(notificationConfirm.getMessage());
            if (notificationConfirm.getButtonLabels().size() >= 2) {
                gVar.mo89225a(R.id.lkui_dialog_btn_right, notificationConfirm.getButtonLabels().get(1), new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ConfirmHandlerV2.DialogInterface$OnClickListenerC297261 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        cVar.mo91902a("{\"buttonIndex\":1}");
                    }
                });
            }
            gVar.mo89225a(R.id.lkui_dialog_btn_left, notificationConfirm.getButtonLabels().get(0), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.ConfirmHandlerV2.DialogInterface$OnClickListenerC297272 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    cVar.mo91902a("{\"buttonIndex\":0}");
                }
            }).mo89239c();
        }
    }
}
