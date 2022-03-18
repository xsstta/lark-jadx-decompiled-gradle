package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

public class ReplyMailAction extends ComposeMailAction {
    public static final Parcelable.Creator<ReplyMailAction> CREATOR = new Parcelable.Creator<ReplyMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.ReplyMailAction.C418061 */

        /* renamed from: a */
        public ReplyMailAction[] newArray(int i) {
            return new ReplyMailAction[i];
        }

        /* renamed from: a */
        public ReplyMailAction createFromParcel(Parcel parcel) {
            return new ReplyMailAction(parcel);
        }
    };

    private ReplyMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public ReplyMailAction(String str) {
        super(str);
    }

    public ReplyMailAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.action.ComposeMailAction
    /* renamed from: a */
    public MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft) {
        mailDraft.mo151337c(mailDraft.mo151352h().replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'"));
        return mailDraft;
    }
}
