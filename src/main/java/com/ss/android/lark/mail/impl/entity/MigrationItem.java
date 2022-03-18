package com.ss.android.lark.mail.impl.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0015\u001a\u00020\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/MigrationItem;", "", "stage", "Lcom/ss/android/lark/mail/impl/entity/MigrationStage;", "progress", "", "isPush", "", "(Lcom/ss/android/lark/mail/impl/entity/MigrationStage;IZ)V", "()Z", "getProgress", "()I", "getStage", "()Lcom/ss/android/lark/mail/impl/entity/MigrationStage;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "isDone", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.entity.m */
public final class MigrationItem {

    /* renamed from: a */
    private final MigrationStage f107111a;

    /* renamed from: b */
    private final int f107112b;

    /* renamed from: c */
    private final boolean f107113c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MigrationItem)) {
            return false;
        }
        MigrationItem mVar = (MigrationItem) obj;
        return Intrinsics.areEqual(this.f107111a, mVar.f107111a) && this.f107112b == mVar.f107112b && this.f107113c == mVar.f107113c;
    }

    public int hashCode() {
        MigrationStage migrationStage = this.f107111a;
        int hashCode = (((migrationStage != null ? migrationStage.hashCode() : 0) * 31) + this.f107112b) * 31;
        boolean z = this.f107113c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    /* renamed from: b */
    public final MigrationStage mo151996b() {
        return this.f107111a;
    }

    /* renamed from: c */
    public final int mo151997c() {
        return this.f107112b;
    }

    /* renamed from: a */
    public final boolean mo151995a() {
        if (this.f107111a.ordinal() > MigrationStage.IN_PROGRESS.ordinal() || (this.f107111a == MigrationStage.IN_PROGRESS && 100 == this.f107112b)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MigrationItem(stage=" + this.f107111a + ", progress=" + this.f107112b + ", isPush=" + this.f107113c + ')';
    }

    public MigrationItem(MigrationStage migrationStage, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(migrationStage, "stage");
        this.f107111a = migrationStage;
        this.f107112b = i;
        this.f107113c = z;
    }
}
