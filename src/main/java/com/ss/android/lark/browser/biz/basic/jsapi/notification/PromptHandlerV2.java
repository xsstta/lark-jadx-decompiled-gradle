package com.ss.android.lark.browser.biz.basic.jsapi.notification;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.NotificationPrompt;

public class PromptHandlerV2 extends AbstractInjectJSApiHandler<NotificationPrompt> implements Parcelable {
    public static final Parcelable.Creator<PromptHandlerV2> CREATOR = new Parcelable.Creator<PromptHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.PromptHandlerV2.C297323 */

        /* renamed from: a */
        public PromptHandlerV2[] newArray(int i) {
            return new PromptHandlerV2[i];
        }

        /* renamed from: a */
        public PromptHandlerV2 createFromParcel(Parcel parcel) {
            return new PromptHandlerV2(parcel);
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

    public PromptHandlerV2() {
    }

    protected PromptHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NotificationPrompt notificationPrompt, final AbstractC25832c cVar) {
        C25639g gVar = new C25639g(mo91997u());
        gVar.mo89237b(notificationPrompt.getTitle());
        gVar.mo89242c(notificationPrompt.getMessage());
        LinearLayout linearLayout = new LinearLayout(mo91997u());
        linearLayout.setOrientation(1);
        LayoutInflater.from(mo91997u()).inflate(R.layout.lkui_dialog_default_content_message_layout, (ViewGroup) linearLayout, true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = UIUtils.getDimens(mo91997u(), R.dimen.dp_18);
        layoutParams.rightMargin = UIUtils.getDimens(mo91997u(), R.dimen.dp_18);
        layoutParams.bottomMargin = UIUtils.getDimens(mo91997u(), R.dimen.dp_4);
        final EditText editText = new EditText(mo91997u());
        editText.setSingleLine();
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        gVar.mo89236b(linearLayout);
        if (CollectionUtils.isEmpty(notificationPrompt.getButtonLabels())) {
            Log.m165397w("PromptHandlerV2", "prompt getButtonLabels empty.");
            cVar.mo91904b("{\"errorMsg\": \"params Error\"}");
            return;
        }
        gVar.mo89225a(R.id.lkui_dialog_btn_left, notificationPrompt.getButtonLabels().get(0), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.PromptHandlerV2.DialogInterface$OnClickListenerC297301 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                AbstractC25832c cVar = cVar;
                cVar.mo91902a("{\"value\":\"" + obj + "\",\"buttonIndex\":0}");
            }
        });
        gVar.mo89225a(R.id.lkui_dialog_btn_right, notificationPrompt.getButtonLabels().get(1), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.browser.biz.basic.jsapi.notification.PromptHandlerV2.DialogInterface$OnClickListenerC297312 */

            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                AbstractC25832c cVar = cVar;
                cVar.mo91902a("{\"value\":\"" + obj + "\",\"buttonIndex\":1}");
            }
        });
        gVar.mo89239c();
    }
}
