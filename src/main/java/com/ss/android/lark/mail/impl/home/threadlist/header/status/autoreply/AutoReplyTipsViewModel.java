package com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply;

import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyState;", "()V", "defaultState", "updateAutoReplyStatus", "", "item", "Lcom/ss/android/lark/mail/impl/entity/EmailAutoReply;", "updateIsMultiSelect", "isMultiSelect", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.c */
public final class AutoReplyTipsViewModel extends JackViewModel<AutoReplyState> {
    public AutoReplyTipsViewModel() {
        initialize(new Function1<AutoReplyState, AutoReplyState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply.AutoReplyTipsViewModel.C426501 */
            final /* synthetic */ AutoReplyTipsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final AutoReplyState invoke(AutoReplyState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public AutoReplyState defaultState() {
        return new AutoReplyState(false, 0, 0, false);
    }

    public final void updateAutoReplyStatus(EmailAutoReply emailAutoReply) {
        Intrinsics.checkParameterIsNotNull(emailAutoReply, "item");
        setState(new C42651a(emailAutoReply));
    }

    public final void updateIsMultiSelect(boolean z) {
        setState(new C42652b(z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.c$b */
    public static final class C42652b extends Lambda implements Function1<AutoReplyState, AutoReplyState> {
        final /* synthetic */ boolean $isMultiSelect;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42652b(boolean z) {
            super(1);
            this.$isMultiSelect = z;
        }

        public final AutoReplyState invoke(AutoReplyState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            return AutoReplyState.m170077a(aVar, false, 0, 0, this.$isMultiSelect, 7, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.a.c$a */
    public static final class C42651a extends Lambda implements Function1<AutoReplyState, AutoReplyState> {
        final /* synthetic */ EmailAutoReply $item;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42651a(EmailAutoReply emailAutoReply) {
            super(1);
            this.$item = emailAutoReply;
        }

        public final AutoReplyState invoke(AutoReplyState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            return new AutoReplyState(this.$item.mo151132a(), this.$item.mo151133b(), this.$item.mo151134c(), aVar.mo153248d());
        }
    }
}
