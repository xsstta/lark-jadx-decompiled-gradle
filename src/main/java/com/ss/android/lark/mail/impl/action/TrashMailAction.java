package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.undo.DeleteUndoProcess;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nHÖ\u0001J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/TrashMailAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "threadId", "", "fromLabelId", "(Ljava/lang/String;Ljava/lang/String;)V", "getFromLabelId", "()Ljava/lang/String;", "getThreadId", "describeContents", "", "getSuccessTip", "showSuccessTip", "", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TrashMailAction extends MoveThreadListAction {
    public static final Parcelable.Creator CREATOR = new C41812a();

    /* renamed from: a */
    private final String f106154a;

    /* renamed from: b */
    private final String f106155b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.TrashMailAction$a */
    public static class C41812a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new TrashMailAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrashMailAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106154a);
        parcel.writeString(this.f106155b);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106155b;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        String a = C43819s.m173684a((int) R.string.Mail_ThreadAction_TrashToast);
        Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…_ThreadAction_TrashToast)");
        return a;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: d */
    public void mo150248d() {
        String i = mo150295i();
        if (i != null) {
            C43383h.m172311a().mo155143a(new DeleteUndoProcess(i, mo150247c()));
        } else {
            super.mo150248d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrashMailAction(String str, String str2) {
        super(CollectionsKt.listOf(str), str2, CollectionsKt.listOf("TRASH"), CollectionsKt.emptyList());
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "fromLabelId");
        this.f106154a = str;
        this.f106155b = str2;
    }
}
