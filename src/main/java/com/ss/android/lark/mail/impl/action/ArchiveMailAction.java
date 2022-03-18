package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/ArchiveMailAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadAction;", "threadId", "", "fromLabelId", "toLabelId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromLabelId", "()Ljava/lang/String;", "getThreadId", "getToLabelId", "describeContents", "", "fetchOPInLabel", "Lcom/ss/android/lark/mail/impl/action/AbsChangeMailAction$OP;", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "labelId", "getSuccessTip", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ArchiveMailAction extends MoveThreadAction {
    public static final Parcelable.Creator CREATOR = new C41775a();

    /* renamed from: a */
    private final String f106058a;

    /* renamed from: b */
    private final String f106059b;

    /* renamed from: c */
    private final String f106060c;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.ArchiveMailAction$a */
    public static class C41775a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ArchiveMailAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ArchiveMailAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106058a);
        parcel.writeString(this.f106059b);
        parcel.writeString(this.f106060c);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction, com.ss.android.lark.mail.impl.action.MoveThreadAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106059b;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        String a = C43819s.m173684a((int) R.string.Mail_ThreadAction_ArchiveToast);
        Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…hreadAction_ArchiveToast)");
        return a;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        Intrinsics.checkParameterIsNotNull(str, "labelId");
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        String q = f.mo155129q();
        MailLabelEntity c = C43374f.m172264f().mo155117c(mo150249e());
        if (c == null || (c.mo151529m() && !CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"FLAGGED", "SENT", "DRAFT"}), q))) {
            return AbsChangeMailAction.OP.DELETE;
        }
        return AbsChangeMailAction.OP.DELETE_AND_INSERT;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArchiveMailAction(String str, String str2, String str3) {
        super(str, str2, CollectionsKt.listOf(str3), true);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "fromLabelId");
        Intrinsics.checkParameterIsNotNull(str3, "toLabelId");
        this.f106058a = str;
        this.f106059b = str2;
        this.f106060c = str3;
    }
}
