package com.ss.android.lark.mail.impl.home.threadlist.header.outbox;

import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.mail.impl.home.p2182b.C42437b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxState;", "()V", "defaultState", "hideOutbox", "", "setLabelId", "newLabelId", "", "showOutbox", "outboxCountItem", "Lcom/ss/android/lark/mail/impl/home/entity/OutboxCountItem;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.c */
public final class OutboxHeaderViewModel extends JackViewModel<OutboxState> {
    public final void hideOutbox() {
        setState(C42644a.INSTANCE);
    }

    public OutboxHeaderViewModel() {
        initialize(new Function1<OutboxState, OutboxState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.outbox.OutboxHeaderViewModel.C426431 */
            final /* synthetic */ OutboxHeaderViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final OutboxState invoke(OutboxState dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public OutboxState defaultState() {
        return new OutboxState(false, 0, 0, 0, "");
    }

    public final void setLabelId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "newLabelId");
        setState(new C42645b(str));
    }

    public final void showOutbox(C42437b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "outboxCountItem");
        setState(new C42646c(bVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.c$a */
    public static final class C42644a extends Lambda implements Function1<OutboxState, OutboxState> {
        public static final C42644a INSTANCE = new C42644a();

        C42644a() {
            super(1);
        }

        public final OutboxState invoke(OutboxState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return OutboxState.m170061a(dVar, false, 0, 0, 0, null, 30, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.c$b */
    public static final class C42645b extends Lambda implements Function1<OutboxState, OutboxState> {
        final /* synthetic */ String $newLabelId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42645b(String str) {
            super(1);
            this.$newLabelId = str;
        }

        public final OutboxState invoke(OutboxState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return OutboxState.m170061a(dVar, false, 0, 0, 0, this.$newLabelId, 15, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.a.c$c */
    public static final class C42646c extends Lambda implements Function1<OutboxState, OutboxState> {
        final /* synthetic */ C42437b $outboxCountItem;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42646c(C42437b bVar) {
            super(1);
            this.$outboxCountItem = bVar;
        }

        public final OutboxState invoke(OutboxState dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            return OutboxState.m170061a(dVar, true, this.$outboxCountItem.mo152722a(), this.$outboxCountItem.mo152726b(), this.$outboxCountItem.mo152728c(), null, 16, null);
        }
    }
}
