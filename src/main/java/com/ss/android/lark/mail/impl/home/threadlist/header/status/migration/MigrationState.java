package com.ss.android.lark.mail.impl.home.threadlist.header.status.migration;

import com.larksuite.arch.jack.State;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationState;", "Lcom/larksuite/arch/jack/State;", "migrationItem", "Lcom/ss/android/lark/mail/impl/entity/MigrationItem;", "(Lcom/ss/android/lark/mail/impl/entity/MigrationItem;)V", "getMigrationItem", "()Lcom/ss/android/lark/mail/impl/entity/MigrationItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.b.a */
public final class MigrationState implements State {

    /* renamed from: a */
    private final MigrationItem f108549a;

    /* renamed from: a */
    public final MigrationState mo153262a(MigrationItem mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "migrationItem");
        return new MigrationState(mVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MigrationState) && Intrinsics.areEqual(this.f108549a, ((MigrationState) obj).f108549a);
        }
        return true;
    }

    public int hashCode() {
        MigrationItem mVar = this.f108549a;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MigrationState(migrationItem=" + this.f108549a + ")";
    }

    /* renamed from: a */
    public final MigrationItem mo153261a() {
        return this.f108549a;
    }

    public MigrationState(MigrationItem mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "migrationItem");
        this.f108549a = mVar;
    }
}
