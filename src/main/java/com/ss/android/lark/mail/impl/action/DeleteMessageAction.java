package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;

public class DeleteMessageAction extends MessageMailAction {
    public static final Parcelable.Creator<DeleteMessageAction> CREATOR = new Parcelable.Creator<DeleteMessageAction>() {
        /* class com.ss.android.lark.mail.impl.action.DeleteMessageAction.C417791 */

        /* renamed from: a */
        public DeleteMessageAction[] newArray(int i) {
            return new DeleteMessageAction[i];
        }

        /* renamed from: a */
        public DeleteMessageAction createFromParcel(Parcel parcel) {
            return new DeleteMessageAction(parcel);
        }
    };

    /* renamed from: a */
    private boolean f106069a;

    /* renamed from: b */
    private boolean f106070b;

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: b */
    public int mo150246b() {
        return 0;
    }

    /* renamed from: e */
    public boolean mo150267e() {
        return this.f106070b;
    }

    /* renamed from: f */
    public boolean mo150268f() {
        return this.f106069a;
    }

    /* renamed from: a */
    public void mo150265a(boolean z) {
        this.f106070b = z;
    }

    /* renamed from: b */
    public void mo150266b(boolean z) {
        this.f106069a = z;
    }

    private DeleteMessageAction(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        mailThread.mo151706e(mo150245a());
        return 0;
    }

    public DeleteMessageAction(String str, String str2) {
        super(str, str2);
        this.f106070b = true;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        if ("DRAFT".equals(str)) {
            if (mo150268f()) {
                return AbsChangeMailAction.OP.UPDATE;
            }
            return AbsChangeMailAction.OP.DELETE;
        } else if (mo150267e()) {
            return AbsChangeMailAction.OP.UPDATE;
        } else {
            return AbsChangeMailAction.OP.DELETE;
        }
    }
}
