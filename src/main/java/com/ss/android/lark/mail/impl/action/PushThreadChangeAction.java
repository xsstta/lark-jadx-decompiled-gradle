package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0014HÖ\u0001J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0006\u0010\u001a\u001a\u00020\u0007J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014HÖ\u0001R \u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/PushThreadChangeAction;", "Lcom/ss/android/lark/mail/impl/action/PushThreadAction;", "threadId", "", "labelId", "(Ljava/lang/String;Ljava/lang/String;)V", "hasUpdatedLastMessageTime", "", "hasUpdatedLastMessageTime$annotations", "()V", "getHasUpdatedLastMessageTime", "()Z", "setHasUpdatedLastMessageTime", "(Z)V", "getLabelId", "()Ljava/lang/String;", "labelIds", "", "getThreadId", "changeStatus", "", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "describeContents", "fetchOPInLabel", "Lcom/ss/android/lark/mail/impl/action/AbsChangeMailAction$OP;", "hasDraftChange", "insertItem", "Lcom/ss/android/lark/mail/impl/action/ActionResult;", "setLabelListChange", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PushThreadChangeAction extends PushThreadAction {
    public static final Parcelable.Creator CREATOR = new C41802a();

    /* renamed from: b */
    private boolean f106132b;

    /* renamed from: c */
    private List<String> f106133c = CollectionsKt.emptyList();

    /* renamed from: d */
    private final String f106134d;

    /* renamed from: e */
    private final String f106135e;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.PushThreadChangeAction$a */
    public static class C41802a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new PushThreadChangeAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushThreadChangeAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106134d);
        parcel.writeString(this.f106135e);
    }

    /* renamed from: a */
    public final PushThreadChangeAction mo150338a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "labelIds");
        this.f106133c = list;
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.action.PushThreadAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        if (!mo150336g()) {
            long n = mailThread.mo151719n();
            MailThread e = mo150334e();
            if (e == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(e, "pushMailThread!!");
            if (n != e.mo151719n()) {
                z = true;
            } else {
                z = false;
            }
            this.f106132b = z;
            super.mo150234a(mailThread);
            if (mailThread.mo151725t() == PermissionCode.NONE) {
                mailThread.mo151708f("");
            }
        }
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150237a(String str) {
        if (TextUtils.equals(this.f106135e, str)) {
            return new C41814a(-1, mo150334e(), AbsChangeMailAction.OP.INSERT);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushThreadChangeAction(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "labelId");
        this.f106134d = str;
        this.f106135e = str2;
    }

    @Override // com.ss.android.lark.mail.impl.action.PushThreadAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public AbsChangeMailAction.OP mo150235a(MailThread mailThread, String str) {
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        if (mo150336g()) {
            return AbsChangeMailAction.OP.DELETE;
        }
        if (this.f106132b) {
            return AbsChangeMailAction.OP.DELETE_AND_INSERT;
        }
        return AbsChangeMailAction.OP.UPDATE;
    }
}
