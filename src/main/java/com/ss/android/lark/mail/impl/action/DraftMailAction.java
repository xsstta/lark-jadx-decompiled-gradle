package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;

public class DraftMailAction extends ComposeMailAction {
    public static final Parcelable.Creator<DraftMailAction> CREATOR = new Parcelable.Creator<DraftMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.DraftMailAction.C417841 */

        /* renamed from: a */
        public DraftMailAction[] newArray(int i) {
            return new DraftMailAction[i];
        }

        /* renamed from: a */
        public DraftMailAction createFromParcel(Parcel parcel) {
            return new DraftMailAction(parcel);
        }
    };

    @Override // com.ss.android.lark.mail.impl.action.ComposeMailAction
    /* renamed from: a */
    public MailDraft mo150260a(MailMessage mailMessage, MailDraft mailDraft) {
        return mailDraft;
    }

    private DraftMailAction(Parcel parcel) {
        this(parcel.readString());
    }

    public DraftMailAction(String str) {
        super(str);
    }

    public DraftMailAction(String str, String str2) {
        super(str, str2);
    }
}
