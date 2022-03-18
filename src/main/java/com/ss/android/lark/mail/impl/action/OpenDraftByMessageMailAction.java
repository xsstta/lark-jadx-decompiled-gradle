package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42149z;

public class OpenDraftByMessageMailAction extends DraftMailAction {
    public static final Parcelable.Creator<OpenDraftByMessageMailAction> CREATOR = new Parcelable.Creator<OpenDraftByMessageMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.OpenDraftByMessageMailAction.C417941 */

        /* renamed from: a */
        public OpenDraftByMessageMailAction[] newArray(int i) {
            return new OpenDraftByMessageMailAction[i];
        }

        /* renamed from: a */
        public OpenDraftByMessageMailAction createFromParcel(Parcel parcel) {
            return new OpenDraftByMessageMailAction(parcel);
        }
    };

    private OpenDraftByMessageMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public OpenDraftByMessageMailAction(String str) {
        super(str);
    }

    @Override // com.ss.android.lark.mail.impl.action.ComposeMailAction, com.ss.android.lark.mail.impl.action.DraftMailAction
    /* renamed from: a */
    public MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft) {
        return C42149z.m168217a(mailMessage, mailDraft);
    }

    public OpenDraftByMessageMailAction(String str, String str2) {
        super(str, str2);
    }
}
