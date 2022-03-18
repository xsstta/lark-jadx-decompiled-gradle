package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J$\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0019\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/PushInvalidCacheAction;", "Lcom/ss/android/lark/mail/impl/action/PushThreadAction;", "threadId", "", "labelId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabelId", "()Ljava/lang/String;", "getThreadId", "describeContents", "", "fetchOPInLabel", "Lcom/ss/android/lark/mail/impl/action/AbsChangeMailAction$OP;", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "handleItem", "Lcom/ss/android/lark/mail/impl/action/ActionResult;", "position", "processMessage", "", "result", "Lcom/ss/android/lark/mail/impl/action/ActionResultCallback;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PushInvalidCacheAction extends PushThreadAction {
    public static final Parcelable.Creator CREATOR = new C41797a();

    /* renamed from: b */
    private final String f106111b;

    /* renamed from: c */
    private final String f106112c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.PushInvalidCacheAction$a */
    public static class C41797a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new PushInvalidCacheAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushInvalidCacheAction[i];
        }
    }

    public PushInvalidCacheAction() {
        this(null, null, 3, null);
    }

    @Override // com.ss.android.lark.mail.impl.action.PushThreadAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "labelId");
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106111b);
        parcel.writeString(this.f106112c);
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
        return AbsChangeMailAction.OP.UNKNOWN;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushInvalidCacheAction(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "labelId");
        this.f106111b = str;
        this.f106112c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PushInvalidCacheAction(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
