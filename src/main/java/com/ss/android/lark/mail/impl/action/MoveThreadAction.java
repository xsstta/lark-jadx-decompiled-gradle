package com.ss.android.lark.mail.impl.action;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.entity.MailThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mail/impl/action/MoveThreadAction;", "Lcom/ss/android/lark/mail/impl/action/MoveThreadListAction;", "threadId", "", "fromLabelId", "toLabelIds", "", "withoutRemoveLabel", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getFromLabelId", "()Ljava/lang/String;", "getThreadId", "getToLabelIds", "()Ljava/util/List;", "getWithoutRemoveLabel", "()Z", "changeStatus", "", "item", "Lcom/ss/android/lark/mail/impl/entity/MailThread;", "handleItem", "Lcom/ss/android/lark/mail/impl/action/ActionResult;", "position", "labelId", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class MoveThreadAction extends MoveThreadListAction {

    /* renamed from: a */
    private final String f106078a;

    /* renamed from: b */
    private final String f106079b;

    /* renamed from: c */
    private final List<String> f106080c;

    /* renamed from: d */
    private final boolean f106081d;

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        Intrinsics.checkParameterIsNotNull(mailThread, "item");
        return 0;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: e */
    public String mo150249e() {
        return this.f106079b;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction
    /* renamed from: h */
    public List<String> mo150262h() {
        return this.f106080c;
    }

    @Override // com.ss.android.lark.mail.impl.action.MoveThreadListAction, com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public C41814a mo150236a(MailThread mailThread, int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "labelId");
        if (mailThread == null || !TextUtils.equals(mailThread.mo151676a(), mo150245a())) {
            return null;
        }
        mo150234a(mailThread);
        return new C41814a(i, mailThread, mo150235a(mailThread, str));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MoveThreadAction(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5, boolean r6) {
        /*
            r2 = this;
            java.lang.String r0 = "threadId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "fromLabelId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "toLabelIds"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            if (r6 == 0) goto L_0x0013
            r0 = r5
            goto L_0x0017
        L_0x0013:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0017:
            if (r6 == 0) goto L_0x001e
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x001f
        L_0x001e:
            r1 = r5
        L_0x001f:
            r2.<init>(r3, r4, r0, r1)
            r2.f106078a = r3
            r2.f106079b = r4
            r2.f106080c = r5
            r2.f106081d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.action.MoveThreadAction.<init>(java.lang.String, java.lang.String, java.util.List, boolean):void");
    }
}
