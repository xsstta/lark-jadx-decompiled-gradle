package com.ss.android.lark.mail.impl.home.threadlist.header.status.network;

import com.larksuite.arch.jack.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkState;", "Lcom/larksuite/arch/jack/State;", "networkEnable", "", "(Z)V", "getNetworkEnable", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c.a */
public final class NetworkState implements State {

    /* renamed from: a */
    private final boolean f108568a;

    /* renamed from: a */
    public final NetworkState mo153276a(boolean z) {
        return new NetworkState(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NetworkState) && this.f108568a == ((NetworkState) obj).f108568a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f108568a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "NetworkState(networkEnable=" + this.f108568a + ")";
    }

    /* renamed from: a */
    public final boolean mo153277a() {
        return this.f108568a;
    }

    public NetworkState(boolean z) {
        this.f108568a = z;
    }
}
