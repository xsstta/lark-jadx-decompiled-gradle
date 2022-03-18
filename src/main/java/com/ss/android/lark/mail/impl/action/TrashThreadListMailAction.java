package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.service.C43383h;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.undo.DeleteUndoProcess;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/TrashThreadListMailAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "threadIds", "", "", "fromLabelId", "removeLabelIds", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getFromLabelId", "()Ljava/lang/String;", "getRemoveLabelIds", "()Ljava/util/List;", "getThreadIds", "describeContents", "", "getSuccessTip", "showSuccessTip", "", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TrashThreadListMailAction extends MoveThreadListAction {
    public static final Parcelable.Creator CREATOR = new C41813a();

    /* renamed from: a */
    private final List<String> f106156a;

    /* renamed from: b */
    private final String f106157b;

    /* renamed from: c */
    private final List<String> f106158c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.TrashThreadListMailAction$a */
    public static class C41813a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new TrashThreadListMailAction(parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrashThreadListMailAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.f106156a);
        parcel.writeString(this.f106157b);
        parcel.writeStringList(this.f106158c);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106157b;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: f */
    public List<String> mo150252f() {
        return this.f106156a;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: g */
    public List<String> mo150253g() {
        return this.f106158c;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        String a = C43819s.m173684a((int) R.string.Mail_ThreadAction_TrashToast);
        Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…_ThreadAction_TrashToast)");
        String a2 = C43819s.m173684a((int) R.string.Mail_Notification_Multi_Thread_Trash);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StringUtils.getString(R.…ation_Multi_Thread_Trash)");
        return mo150293a(a, a2);
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
    public TrashThreadListMailAction(List<String> list, String str, List<String> list2) {
        super(list, str, CollectionsKt.listOf("TRASH"), list2);
        Intrinsics.checkParameterIsNotNull(list, "threadIds");
        Intrinsics.checkParameterIsNotNull(str, "fromLabelId");
        Intrinsics.checkParameterIsNotNull(list2, "removeLabelIds");
        this.f106156a = list;
        this.f106157b = str;
        this.f106158c = list2;
    }
}
