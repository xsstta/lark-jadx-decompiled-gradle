package com.ss.android.lark.mail.impl.home.threadlist.header.status.migration;

import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationState;", "()V", "defaultState", "updateMigrationStatus", "", "newMigrationItem", "Lcom/ss/android/lark/mail/impl/entity/MigrationItem;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.c */
public final class MigrationTipsViewModel extends JackViewModel<MigrationState> {
    public MigrationTipsViewModel() {
        initialize(new Function1<MigrationState, MigrationState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.status.migration.MigrationTipsViewModel.C426571 */
            final /* synthetic */ MigrationTipsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final MigrationState invoke(MigrationState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public MigrationState defaultState() {
        return new MigrationState(new MigrationItem(MigrationStage.INVALID, 0, false));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.c$a */
    public static final class C42658a extends Lambda implements Function1<MigrationState, MigrationState> {
        final /* synthetic */ MigrationItem $newMigrationItem;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42658a(MigrationItem mVar) {
            super(1);
            this.$newMigrationItem = mVar;
        }

        public final MigrationState invoke(MigrationState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            return aVar.mo153262a(this.$newMigrationItem);
        }
    }

    public final void updateMigrationStatus(MigrationItem mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "newMigrationItem");
        setState(new C42658a(mVar));
    }
}
