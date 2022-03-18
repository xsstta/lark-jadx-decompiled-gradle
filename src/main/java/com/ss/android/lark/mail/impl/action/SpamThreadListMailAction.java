package com.ss.android.lark.mail.impl.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0019\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/SpamThreadListMailAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "threadIds", "", "", "fromLabelId", "removeLabelIds", "reportType", "Ljava/lang/Integer;", "messageID", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getFromLabelId", "()Ljava/lang/String;", "getMessageID", "getRemoveLabelIds", "()Ljava/util/List;", "getReportType", "()Ljava/lang/Integer;", "getThreadIds", "describeContents", "", "getSuccessTip", "processMessage", "", "result", "Lcom/ss/android/lark/mail/impl/action/ActionResultCallback;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SpamThreadListMailAction extends MoveThreadListAction {
    public static final Parcelable.Creator CREATOR = new C41810a();

    /* renamed from: a */
    private final List<String> f106147a;

    /* renamed from: b */
    private final String f106148b;

    /* renamed from: c */
    private final List<String> f106149c;

    /* renamed from: d */
    private final Integer f106150d;

    /* renamed from: e */
    private final String f106151e;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.SpamThreadListMailAction$a */
    public static class C41810a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new SpamThreadListMailAction(parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpamThreadListMailAction[i];
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeStringList(this.f106147a);
        parcel.writeString(this.f106148b);
        parcel.writeStringList(this.f106149c);
        parcel.writeInt(this.f106150d.intValue());
        parcel.writeString(this.f106151e);
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106148b;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: f */
    public List<String> mo150252f() {
        return this.f106147a;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: g */
    public List<String> mo150253g() {
        return this.f106149c;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsMailAction
    /* renamed from: c */
    public String mo150247c() {
        String a = C43819s.m173684a((int) R.string.Mail_ThreadAction_SpamToast);
        Intrinsics.checkExpressionValueIsNotNull(a, "StringUtils.getString(R.…l_ThreadAction_SpamToast)");
        String a2 = C43819s.m173684a((int) R.string.Mail_Notification_Multi_Thread_Spam);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StringUtils.getString(R.…cation_Multi_Thread_Spam)");
        return mo150293a(a, a2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/action/SpamThreadListMailAction$processMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/email/client/v1/MailMutMultiLabelResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.SpamThreadListMailAction$b */
    public static final class C41811b implements IGetDataCallback<MailMutMultiLabelResponse> {

        /* renamed from: a */
        final /* synthetic */ SpamThreadListMailAction f106152a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41815b f106153b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f106153b.mo150377b();
        }

        /* renamed from: a */
        public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
            Intrinsics.checkParameterIsNotNull(mailMutMultiLabelResponse, "response");
            this.f106152a.mo150294b(mailMutMultiLabelResponse.uuid);
            this.f106153b.mo150376a();
        }

        C41811b(SpamThreadListMailAction spamThreadListMailAction, AbstractC41815b bVar) {
            this.f106152a = spamThreadListMailAction;
            this.f106153b = bVar;
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "result");
        if (!StringsKt.isBlank(mo150249e())) {
            C42176e.m168344a().mo152226a(mo150252f(), mo150249e(), mo150262h(), mo150253g(), this.f106150d.intValue(), this.f106151e, new C41811b(this, bVar));
            return;
        }
        bVar.mo150376a();
        Log.m165383e("MoveThreadListAction", "processMessage fail in action: " + this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamThreadListMailAction(List<String> list, String str, List<String> list2, Integer num, String str2) {
        super(list, str, CollectionsKt.listOf("SPAM"), list2);
        Intrinsics.checkParameterIsNotNull(list, "threadIds");
        Intrinsics.checkParameterIsNotNull(str, "fromLabelId");
        Intrinsics.checkParameterIsNotNull(list2, "removeLabelIds");
        Intrinsics.checkParameterIsNotNull(num, "reportType");
        Intrinsics.checkParameterIsNotNull(str2, "messageID");
        this.f106147a = list;
        this.f106148b = str;
        this.f106149c = list2;
        this.f106150d = num;
        this.f106151e = str2;
    }
}
