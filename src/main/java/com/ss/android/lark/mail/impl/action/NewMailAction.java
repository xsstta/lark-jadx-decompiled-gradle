package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

public class NewMailAction extends ComposeMailAction {
    public static final Parcelable.Creator<NewMailAction> CREATOR = new Parcelable.Creator<NewMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.NewMailAction.C417891 */

        /* renamed from: a */
        public NewMailAction[] newArray(int i) {
            return new NewMailAction[i];
        }

        /* renamed from: a */
        public NewMailAction createFromParcel(Parcel parcel) {
            return new NewMailAction(parcel);
        }
    };

    @Override // com.ss.android.lark.mail.impl.action.ComposeMailAction
    /* renamed from: a */
    public MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft) {
        return mailDraft;
    }

    private NewMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public NewMailAction(String str) {
        super(str);
    }

    public NewMailAction(String str, String str2) {
        super(str, str2);
    }
}
