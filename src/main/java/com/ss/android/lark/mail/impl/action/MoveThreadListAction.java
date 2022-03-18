package com.ss.android.lark.mail.impl.action;

import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\bB7\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0004J$\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "Lcom/ss/android/lark/mail/impl/action/AbsChangeMailAction;", "threadId", "", "fromLabelId", "toLabelIds", "", "removeLabelIds", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "threadIds", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFromLabelId", "()Ljava/lang/String;", "getRemoveLabelIds", "()Ljava/util/List;", "requestId", "getRequestId", "setRequestId", "(Ljava/lang/String;)V", "getThreadIds", "getToLabelIds", "changeStatus", "", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "getCountingTip", "singularTip", "pluralTip", "handleItem", "Lcom/ss/android/lark/mail/impl/action/ActionResult;", "position", "labelId", "processMessage", "", "result", "Lcom/ss/android/lark/mail/impl/action/ActionResultCallback;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class MoveThreadListAction extends AbsChangeMailAction {

    /* renamed from: a */
    private String f106082a;

    /* renamed from: b */
    private final List<String> f106083b;

    /* renamed from: c */
    private final String f106084c;

    /* renamed from: d */
    private final List<String> f106085d;

    /* renamed from: e */
    private final List<String> f106086e;

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

    /* renamed from: e */
    public String mo150249e() {
        return this.f106084c;
    }

    /* renamed from: f */
    public List<String> mo150252f() {
        return this.f106083b;
    }

    /* renamed from: g */
    public List<String> mo150253g() {
        return this.f106086e;
    }

    /* renamed from: h */
    public List<String> mo150262h() {
        return this.f106085d;
    }

    /* renamed from: i */
    public final String mo150295i() {
        return this.f106082a;
    }

    /* renamed from: b */
    public final void mo150294b(String str) {
        this.f106082a = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/action/MoveThreadListAction$processMessage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/email/client/v1/MailMutMultiLabelResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.action.MoveThreadListAction$a */
    public static final class C41786a implements IGetDataCallback<MailMutMultiLabelResponse> {

        /* renamed from: a */
        final /* synthetic */ MoveThreadListAction f106087a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41815b f106088b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f106088b.mo150377b();
        }

        /* renamed from: a */
        public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
            Intrinsics.checkParameterIsNotNull(mailMutMultiLabelResponse, "response");
            this.f106087a.mo150294b(mailMutMultiLabelResponse.uuid);
            this.f106088b.mo150376a();
        }

        C41786a(MoveThreadListAction moveThreadListAction, AbstractC41815b bVar) {
            this.f106087a = moveThreadListAction;
            this.f106088b = bVar;
        }
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(AbstractC41815b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "result");
        if (!StringsKt.isBlank(mo150249e())) {
            C42176e.m168344a().mo152226a(mo150252f(), mo150249e(), mo150262h(), mo150253g(), -1, (String) null, new C41786a(this, bVar));
            return;
        }
        bVar.mo150376a();
        Log.m165383e("MoveThreadListAction", "processMessage fail in action: " + this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo150293a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "singularTip");
        Intrinsics.checkParameterIsNotNull(str2, "pluralTip");
        int size = mo150252f().size();
        if (size > 1) {
            return StringsKt.replace$default(str2, "{{num}}", String.valueOf(size), false, 4, (Object) null);
        }
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MoveThreadListAction(String str, String str2, List<String> list, List<String> list2) {
        this(CollectionsKt.listOf(str), str2, list, list2);
        Intrinsics.checkParameterIsNotNull(str, "threadId");
        Intrinsics.checkParameterIsNotNull(str2, "fromLabelId");
        Intrinsics.checkParameterIsNotNull(list, "toLabelIds");
        Intrinsics.checkParameterIsNotNull(list2, "removeLabelIds");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MoveThreadListAction(java.util.List<java.lang.String> r4, java.lang.String r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7) {
        /*
            r3 = this;
            java.lang.String r0 = "threadIds"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "fromLabelId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "toLabelIds"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "removeLabelIds"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            int r0 = r4.size()
            java.lang.String r1 = ""
            r2 = 1
            if (r0 != r2) goto L_0x0025
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            r3.<init>(r0)
            r3.f106083b = r4
            r3.f106084c = r5
            r3.f106085d = r6
            r3.f106086e = r7
            r3.f106082a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.action.MoveThreadListAction.<init>(java.util.List, java.lang.String, java.util.List, java.util.List):void");
    }
}
