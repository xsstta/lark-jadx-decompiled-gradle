package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/PushUpdateThreadAction;", "Lcom/ss/android/lark/mail/impl/action/PushThreadAction;", "threadId", "", "labelId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabelId", "()Ljava/lang/String;", "getThreadId", "describeContents", "", "insertItem", "Lcom/ss/android/lark/mail/impl/action/ActionResult;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PushUpdateThreadAction extends PushThreadAction {
    public static final Parcelable.Creator CREATOR = new C41803a();

    /* renamed from: b */
    private final String f106136b;

    /* renamed from: c */
    private final String f106137c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.PushUpdateThreadAction$a */
    public static class C41803a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new PushUpdateThreadAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushUpdateThreadAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106136b);
        parcel.writeString(this.f106137c);
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150237a(String str) {
        if (TextUtils.equals(this.f106137c, str)) {
            return new C41814a(-1, mo150334e(), AbsChangeMailAction.OP.INSERT);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushUpdateThreadAction(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "labelId");
        this.f106136b = str;
        this.f106137c = str2;
    }
}
