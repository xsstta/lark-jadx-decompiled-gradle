package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

public class ForwardMailAction extends ComposeMailAction {
    public static final Parcelable.Creator<ForwardMailAction> CREATOR = new Parcelable.Creator<ForwardMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.ForwardMailAction.C417851 */

        /* renamed from: a */
        public ForwardMailAction[] newArray(int i) {
            return new ForwardMailAction[i];
        }

        /* renamed from: a */
        public ForwardMailAction createFromParcel(Parcel parcel) {
            return new ForwardMailAction(parcel);
        }
    };

    private ForwardMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public ForwardMailAction(String str) {
        super(str);
    }

    public ForwardMailAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.action.ComposeMailAction
    /* renamed from: a */
    public MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft) {
        mailDraft.mo151337c(mailDraft.mo151352h().replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'"));
        return mailDraft;
    }
}
