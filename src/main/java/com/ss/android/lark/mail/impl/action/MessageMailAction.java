package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.text.TextUtils;
import com.ss.android.lark.mail.impl.entity.MailThread;

public abstract class MessageMailAction extends AbsChangeMailAction {

    /* renamed from: a */
    private final String f106077a;

    /* renamed from: g */
    public String mo150292g() {
        return this.f106077a;
    }

    public MessageMailAction(String str, String str2) {
        super(str);
        this.f106077a = str2;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f106077a);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        if (mailThread == null || !TextUtils.equals(mailThread.mo151676a(), mo150292g())) {
            return null;
        }
        mo150234a(mailThread);
        return new C41814a(i, mailThread, mo150235a(mailThread, str));
    }
}
