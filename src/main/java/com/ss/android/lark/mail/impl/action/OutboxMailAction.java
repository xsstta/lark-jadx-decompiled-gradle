package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;

public class OutboxMailAction extends ThreadMailAction {
    public static final Parcelable.Creator<OutboxMailAction> CREATOR = new Parcelable.Creator<OutboxMailAction>() {
        /* class com.ss.android.lark.mail.impl.action.OutboxMailAction.C417951 */

        /* renamed from: a */
        public OutboxMailAction[] newArray(int i) {
            return new OutboxMailAction[i];
        }

        /* renamed from: a */
        public OutboxMailAction createFromParcel(Parcel parcel) {
            return new OutboxMailAction(parcel);
        }
    };

    /* renamed from: a */
    private boolean f106107a;

    /* renamed from: b */
    private MailThread f106108b;

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: b */
    public int mo150246b() {
        return 0;
    }

    private OutboxMailAction(Parcel parcel) {
        this(parcel.readString(), m165934a(parcel));
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        if (!this.f106107a) {
            bVar.mo150376a();
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150237a(String str) {
        MailThread mailThread;
        if (!"OUTBOX".equals(str) || !this.f106107a || (mailThread = this.f106108b) == null) {
            return null;
        }
        return new C41814a(-1, mailThread, AbsChangeMailAction.OP.INSERT);
    }

    public OutboxMailAction(String str, boolean z) {
        super(str);
        this.f106107a = z;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        m165933a(parcel, this.f106107a);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        if (!"OUTBOX".equals(str)) {
            return AbsChangeMailAction.OP.UNKNOWN;
        }
        if (this.f106107a) {
            return AbsChangeMailAction.OP.UNKNOWN;
        }
        return AbsChangeMailAction.OP.DELETE;
    }
}
