package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\nHÖ\u0001J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0019\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/PushDeleteThreadAction;", "Lcom/ss/android/lark/mail/impl/action/PushThreadAction;", "threadId", "", "labelId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabelId", "()Ljava/lang/String;", "getThreadId", "changeStatus", "", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "describeContents", "fetchOPInLabel", "Lcom/ss/android/lark/mail/impl/action/AbsChangeMailAction$OP;", "processMessage", "", "result", "Lcom/ss/android/lark/mail/impl/action/ActionResultCallback;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PushDeleteThreadAction extends PushThreadAction {
    public static final Parcelable.Creator CREATOR = new C41796a();

    /* renamed from: b */
    private final String f106109b;

    /* renamed from: c */
    private final String f106110c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.PushDeleteThreadAction$a */
    public static class C41796a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new PushDeleteThreadAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushDeleteThreadAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.PushThreadAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106109b);
        parcel.writeString(this.f106110c);
    }

    @Override // com.ss.android.lark.mail.impl.action.PushThreadAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        if (bVar != null) {
            bVar.mo150376a();
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.PushThreadAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        return AbsChangeMailAction.OP.DELETE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushDeleteThreadAction(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "labelId");
        this.f106109b = str;
        this.f106110c = str2;
    }
}
