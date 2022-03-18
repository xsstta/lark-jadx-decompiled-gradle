package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/DiscardMultiDraftsAction;", "Lcom/ss/android/lark/mail/impl/action/AbsChangeMailAction;", "threadIds", "", "", "fromLabelId", "(Ljava/util/List;Ljava/lang/String;)V", "getFromLabelId", "()Ljava/lang/String;", "getThreadIds", "()Ljava/util/List;", "changeStatus", "", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "getSuccessTip", "handleItem", "Lcom/ss/android/lark/mail/impl/action/ActionResult;", "position", "labelId", "processMessage", "", "result", "Lcom/ss/android/lark/mail/impl/action/ActionResultCallback;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DiscardMultiDraftsAction extends AbsChangeMailAction {
    public static final Parcelable.Creator CREATOR = new C41782a();

    /* renamed from: a */
    private final List<String> f106074a;

    /* renamed from: b */
    private final String f106075b;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.DiscardMultiDraftsAction$a */
    public static class C41782a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new DiscardMultiDraftsAction(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscardMultiDraftsAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "labelId");
        return null;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.f106074a);
        parcel.writeString(this.f106075b);
    }

    /* renamed from: e */
    public List<String> mo150279e() {
        return this.f106074a;
    }

    /* renamed from: f */
    public String mo150280f() {
        return this.f106075b;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        String a = C43819s.m173684a((int) R.string.Mail_Toast_DiscardMultiDraftsSuccess);
        Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…iscardMultiDraftsSuccess)");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/action/DiscardMultiDraftsAction$processMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/email/client/v1/MailDeleteMultiDraftResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "mailDeleteMultiDraftResponse", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.DiscardMultiDraftsAction$b */
    public static final class C41783b implements IGetDataCallback<MailDeleteMultiDraftResponse> {

        /* renamed from: a */
        final /* synthetic */ AbstractC41815b f106076a;

        C41783b(AbstractC41815b bVar) {
            this.f106076a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(MailDeleteMultiDraftResponse mailDeleteMultiDraftResponse) {
            Intrinsics.checkParameterIsNotNull(mailDeleteMultiDraftResponse, "mailDeleteMultiDraftResponse");
            this.f106076a.mo150376a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f106076a.mo150377b();
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "result");
        C42176e.m168344a().mo152216a(mo150280f(), mo150279e(), new C41783b(bVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscardMultiDraftsAction(List<String> list, String str) {
        super("");
        Intrinsics.checkParameterIsNotNull(list, "threadIds");
        Intrinsics.checkParameterIsNotNull(str, "fromLabelId");
        this.f106074a = list;
        this.f106075b = str;
    }
}
