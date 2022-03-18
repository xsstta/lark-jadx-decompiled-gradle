package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0010H\u0017J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/CustomLabelThreadListMailAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "threadIds", "", "", "fromLabelId", "toLabelIds", "removeLabelIds", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFromLabelId", "()Ljava/lang/String;", "getRemoveLabelIds", "()Ljava/util/List;", "getThreadIds", "getToLabelIds", "describeContents", "", "getActionTip", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CustomLabelThreadListMailAction extends MoveThreadListAction {
    public static final Parcelable.Creator CREATOR = new C41778a();

    /* renamed from: a */
    private final List<String> f106065a;

    /* renamed from: b */
    private final String f106066b;

    /* renamed from: c */
    private final List<String> f106067c;

    /* renamed from: d */
    private final List<String> f106068d;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.CustomLabelThreadListMailAction$a */
    public static class C41778a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new CustomLabelThreadListMailAction(parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomLabelThreadListMailAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: b */
    public int mo150246b() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.f106065a);
        parcel.writeString(this.f106066b);
        parcel.writeStringList(this.f106067c);
        parcel.writeStringList(this.f106068d);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106066b;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: f */
    public List<String> mo150252f() {
        return this.f106065a;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: g */
    public List<String> mo150253g() {
        return this.f106068d;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: h */
    public List<String> mo150262h() {
        return this.f106067c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomLabelThreadListMailAction(List<String> list, String str, List<String> list2, List<String> list3) {
        super(list, str, list2, list3);
        Intrinsics.checkParameterIsNotNull(list, "threadIds");
        Intrinsics.checkParameterIsNotNull(str, "fromLabelId");
        Intrinsics.checkParameterIsNotNull(list2, "toLabelIds");
        Intrinsics.checkParameterIsNotNull(list3, "removeLabelIds");
        this.f106065a = list;
        this.f106066b = str;
        this.f106067c = list2;
        this.f106068d = list3;
    }
}
