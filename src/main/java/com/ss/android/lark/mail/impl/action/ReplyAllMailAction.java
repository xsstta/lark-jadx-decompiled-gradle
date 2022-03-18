package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

public class ReplyAllMailAction extends ComposeMailAction {
    public static final Parcelable.Creator<ReplyAllMailAction> CREATOR = new Parcelable.Creator<ReplyAllMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.ReplyAllMailAction.C418051 */

        /* renamed from: a */
        public ReplyAllMailAction[] newArray(int i) {
            return new ReplyAllMailAction[i];
        }

        /* renamed from: a */
        public ReplyAllMailAction createFromParcel(Parcel parcel) {
            return new ReplyAllMailAction(parcel);
        }
    };

    private ReplyAllMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public ReplyAllMailAction(String str) {
        super(str);
    }

    public ReplyAllMailAction(String str, String str2) {
        super(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.action.ComposeMailAction
    /* renamed from: a */
    public MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft) {
        mailDraft.mo151337c(mailDraft.mo151352h().replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'"));
        return mailDraft;
    }
}
