package com.ss.android.lark.mail.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mail/impl/ExternalUseConstant;", "", "()V", "getLabelIdInbox", "", "getLabelIdShare", "getNoticeJumpAccountId", "getNoticeJumpLabelId", "getNoticeJumpMessageId", "getNoticeJumpState", "getNoticeJumpTarget", "getNoticeJumpTargetValue", "getNoticeJumpThreadId", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.a */
public final class ExternalUseConstant {

    /* renamed from: a */
    public static final Lazy f106054a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C41771b.INSTANCE);

    /* renamed from: b */
    public static final Companion f106055b = new Companion(null);

    /* renamed from: a */
    public final String mo150220a() {
        return "INBOX";
    }

    /* renamed from: b */
    public final String mo150221b() {
        return "SHARE";
    }

    /* renamed from: c */
    public final String mo150222c() {
        return "mail_message_id";
    }

    /* renamed from: d */
    public final String mo150223d() {
        return "mail_thread_id";
    }

    /* renamed from: e */
    public final String mo150224e() {
        return "mail_label_id";
    }

    /* renamed from: f */
    public final String mo150225f() {
        return "mail_jump_target";
    }

    /* renamed from: g */
    public final String mo150226g() {
        return "MessageList";
    }

    /* renamed from: h */
    public final String mo150227h() {
        return "mail_jump_state";
    }

    /* renamed from: i */
    public final String mo150228i() {
        return "mail_account_id";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mail/impl/ExternalUseConstant$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/mail/impl/ExternalUseConstant;", "getInstance", "()Lcom/ss/android/lark/mail/impl/ExternalUseConstant;", "instance$delegate", "Lkotlin/Lazy;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.a$a */
    public static final class Companion {
        /* renamed from: a */
        public final ExternalUseConstant mo150229a() {
            Lazy lazy = ExternalUseConstant.f106054a;
            Companion aVar = ExternalUseConstant.f106055b;
            return (ExternalUseConstant) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/ExternalUseConstant;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.a$b */
    static final class C41771b extends Lambda implements Function0<ExternalUseConstant> {
        public static final C41771b INSTANCE = new C41771b();

        C41771b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExternalUseConstant invoke() {
            return new ExternalUseConstant();
        }
    }
}
