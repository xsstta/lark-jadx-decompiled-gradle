package com.ss.android.lark.mail.impl.home.threadlist.header.status.storage;

import com.bytedance.lark.pb.email.client.v1.StorageLimitNotify;
import com.larksuite.arch.jack.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageState;", "Lcom/larksuite/arch/jack/State;", "capacityLimitItem", "Lcom/bytedance/lark/pb/email/client/v1/StorageLimitNotify;", "(Lcom/bytedance/lark/pb/email/client/v1/StorageLimitNotify;)V", "getCapacityLimitItem", "()Lcom/bytedance/lark/pb/email/client/v1/StorageLimitNotify;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.c */
public final class StorageState implements State {

    /* renamed from: a */
    private final StorageLimitNotify f108586a;

    /* renamed from: a */
    public final StorageState mo153300a(StorageLimitNotify storageLimitNotify) {
        Intrinsics.checkParameterIsNotNull(storageLimitNotify, "capacityLimitItem");
        return new StorageState(storageLimitNotify);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StorageState) && Intrinsics.areEqual(this.f108586a, ((StorageState) obj).f108586a);
        }
        return true;
    }

    public int hashCode() {
        StorageLimitNotify storageLimitNotify = this.f108586a;
        if (storageLimitNotify != null) {
            return storageLimitNotify.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "StorageState(capacityLimitItem=" + this.f108586a + ")";
    }

    /* renamed from: a */
    public final StorageLimitNotify mo153299a() {
        return this.f108586a;
    }

    public StorageState(StorageLimitNotify storageLimitNotify) {
        Intrinsics.checkParameterIsNotNull(storageLimitNotify, "capacityLimitItem");
        this.f108586a = storageLimitNotify;
    }
}
