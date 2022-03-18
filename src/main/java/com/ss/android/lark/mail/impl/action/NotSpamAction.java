package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse;
import com.bytedance.lark.pb.email.client.v1.ReportType;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0019\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/NotSpamAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadAction;", "threadId", "", "fromLabelId", "toLabelId", "withoutRemoveLabel", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getFromLabelId", "()Ljava/lang/String;", "getThreadId", "getToLabelId", "getWithoutRemoveLabel", "()Z", "describeContents", "", "getSuccessTip", "processMessage", "", "result", "Lcom/ss/android/lark/mail/impl/action/ActionResultCallback;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NotSpamAction extends MoveThreadAction {
    public static final Parcelable.Creator CREATOR = new C41790a();

    /* renamed from: a */
    private final String f106096a;

    /* renamed from: b */
    private final String f106097b;

    /* renamed from: c */
    private final String f106098c;

    /* renamed from: d */
    private final boolean f106099d;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.NotSpamAction$a */
    public static class C41790a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new NotSpamAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NotSpamAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f106096a);
        parcel.writeString(this.f106097b);
        parcel.writeString(this.f106098c);
        parcel.writeInt(this.f106099d ? 1 : 0);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction, com.ss.android.lark.mail.impl.action.MoveThreadAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106097b;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        String a = C43819s.m173684a((int) R.string.Mail_ThreadAction_NotSpamToast2);
        Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…readAction_NotSpamToast2)");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/action/NotSpamAction$processMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/email/client/v1/MailMutMultiLabelResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.NotSpamAction$b */
    public static final class C41791b implements IGetDataCallback<MailMutMultiLabelResponse> {

        /* renamed from: a */
        final /* synthetic */ NotSpamAction f106100a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41815b f106101b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f106101b.mo150377b();
        }

        /* renamed from: a */
        public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
            Intrinsics.checkParameterIsNotNull(mailMutMultiLabelResponse, "response");
            this.f106100a.mo150294b(mailMutMultiLabelResponse.uuid);
            this.f106101b.mo150376a();
        }

        C41791b(NotSpamAction notSpamAction, AbstractC41815b bVar) {
            this.f106100a = notSpamAction;
            this.f106101b = bVar;
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "result");
        if (!StringsKt.isBlank(mo150249e())) {
            C42176e.m168344a().mo152226a(mo150252f(), mo150249e(), mo150262h(), mo150253g(), ReportType.HAM.getValue(), (String) null, new C41791b(this, bVar));
            return;
        }
        bVar.mo150376a();
        Log.m165383e("MoveThreadListAction", "processMessage fail in action: " + this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotSpamAction(String str, String str2, String str3, boolean z) {
        super(str, str2, CollectionsKt.listOf(str3), z);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "fromLabelId");
        Intrinsics.checkParameterIsNotNull(str3, "toLabelId");
        this.f106096a = str;
        this.f106097b = str2;
        this.f106098c = str3;
        this.f106099d = z;
    }
}
