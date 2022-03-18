package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.entity.MailThread;

public class AbsChangeMailAction extends AbsMailAction {
    public static final Parcelable.Creator<AbsChangeMailAction> CREATOR = new Parcelable.Creator<AbsChangeMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.AbsChangeMailAction.C417741 */

        /* renamed from: a */
        public AbsChangeMailAction[] newArray(int i) {
            return new AbsChangeMailAction[0];
        }

        /* renamed from: a */
        public AbsChangeMailAction createFromParcel(Parcel parcel) {
            return new AbsChangeMailAction(parcel);
        }
    };

    public enum OP {
        UNKNOWN,
        UPDATE,
        INSERT,
        DELETE,
        DELETE_AND_INSERT
    }

    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        return 0;
    }

    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        return null;
    }

    /* renamed from: a */
    public C41814a mo150237a(String str) {
        return null;
    }

    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    public int describeContents() {
        return 0;
    }

    public AbsChangeMailAction(Parcel parcel) {
        super(parcel);
    }

    public AbsChangeMailAction(String str) {
        super(str);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public OP mo150235a(MailThread mailThread, String str) {
        return OP.DELETE;
    }

    /* renamed from: a */
    public static void m165925a(MailThread mailThread, MailThread mailThread2) {
        mailThread2.mo151690b(mailThread.mo151716k());
        mailThread2.mo151678a(mailThread.mo151686b());
        mailThread2.mo151681a(mailThread.mo151691c());
        mailThread2.mo151683a(mailThread.mo151696d());
        mailThread2.mo151688b(mailThread.mo151702e());
        mailThread2.mo151693c(mailThread.mo151707f());
        mailThread2.mo151698d(mailThread.mo151710g());
        mailThread2.mo151687b(mailThread.mo151717l());
        mailThread2.mo151692c(mailThread.mo151719n());
        mailThread2.mo151684a(mailThread.mo151715j());
        mailThread2.mo151694c(mailThread.mo151721p());
        mailThread2.mo151699d(mailThread.mo151722q());
        mailThread2.mo151704e(mailThread.mo151723r());
        mailThread2.mo151679a(mailThread.mo151725t());
        mailThread2.mo151700d(mailThread.mo151726u());
        mailThread2.mo151705e(mailThread.mo151727v());
        mailThread2.mo151689b(mailThread.mo151720o());
        mailThread2.mo151703e(mailThread.mo151732z());
        mailThread2.mo151697d(mailThread.mo151731y());
    }
}
