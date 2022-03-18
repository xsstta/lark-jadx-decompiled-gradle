package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/ReadThreadListMailAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "threadId", "", "fromLabelId", "isRead", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "threadIds", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getFromLabelId", "()Ljava/lang/String;", "()Z", "getThreadIds", "()Ljava/util/List;", "describeContents", "", "getSuccessTip", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReadThreadListMailAction extends MoveThreadListAction {
    public static final Parcelable.Creator CREATOR = new C41804a();

    /* renamed from: a */
    private final List<String> f106138a;

    /* renamed from: b */
    private final String f106139b;

    /* renamed from: c */
    private final boolean f106140c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.ReadThreadListMailAction$a */
    public static class C41804a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ReadThreadListMailAction(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReadThreadListMailAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.f106138a);
        parcel.writeString(this.f106139b);
        parcel.writeInt(this.f106140c ? 1 : 0);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106139b;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: f */
    public List<String> mo150252f() {
        return this.f106138a;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        if (this.f106140c) {
            if (mo150252f().size() <= 1) {
                return "";
            }
            String a = C43819s.m173684a((int) R.string.Mail_ThreadAction_ReadToast);
            Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…l_ThreadAction_ReadToast)");
            String a2 = C43819s.m173684a((int) R.string.Mail_Notification_Multi_Thread_Read);
            Intrinsics.checkExpressionValueIsNotNull(a2, "StringUtils.getString(R.…cation_Multi_Thread_Read)");
            return mo150293a(a, a2);
        } else if (mo150252f().size() <= 1) {
            String a3 = C43819s.m173684a((int) R.string.Mail_ThreadAction_UnreadToast);
            Intrinsics.checkExpressionValueIsNotNull(a3, "StringUtils.getString(R.…ThreadAction_UnreadToast)");
            return a3;
        } else {
            String a4 = C43819s.m173684a((int) R.string.Mail_ThreadAction_UnreadToast);
            Intrinsics.checkExpressionValueIsNotNull(a4, "StringUtils.getString(R.…ThreadAction_UnreadToast)");
            String a5 = C43819s.m173684a((int) R.string.Mail_Notification_Multi_Thread_Unread);
            Intrinsics.checkExpressionValueIsNotNull(a5, "StringUtils.getString(R.…tion_Multi_Thread_Unread)");
            return mo150293a(a4, a5);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReadThreadListMailAction(String str, String str2, boolean z) {
        this(CollectionsKt.listOf(str), str2, z);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "fromLabelId");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReadThreadListMailAction(java.util.List<java.lang.String> r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "threadIds"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "fromLabelId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "UNREAD"
            if (r5 != 0) goto L_0x0013
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L_0x0017
        L_0x0013:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0017:
            if (r5 == 0) goto L_0x001e
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L_0x0022
        L_0x001e:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0022:
            r2.<init>(r3, r4, r1, r0)
            r2.f106138a = r3
            r2.f106139b = r4
            r2.f106140c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.action.ReadThreadListMailAction.<init>(java.util.List, java.lang.String, boolean):void");
    }
}
