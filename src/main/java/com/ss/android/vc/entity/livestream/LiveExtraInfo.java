package com.ss.android.vc.entity.livestream;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/entity/livestream/LiveExtraInfo;", "Ljava/io/Serializable;", "()V", "onlineUsersCount", "", "getOnlineUsersCount", "()I", "setOnlineUsersCount", "(I)V", "toString", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LiveExtraInfo implements Serializable {
    private int onlineUsersCount;

    public final int getOnlineUsersCount() {
        return this.onlineUsersCount;
    }

    public String toString() {
        return "onlineUsersCount=" + this.onlineUsersCount;
    }

    public final void setOnlineUsersCount(int i) {
        this.onlineUsersCount = i;
    }
}
