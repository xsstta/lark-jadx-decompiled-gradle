package com.ss.android.lark.mail.impl.home.threadlist.header.filter;

import com.larksuite.arch.jack.State;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterState;", "Lcom/larksuite/arch/jack/State;", "show", "", "(Z)V", "getShow", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.filter.b */
public final class FilterState implements State {

    /* renamed from: a */
    private final boolean f108591a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FilterState) && this.f108591a == ((FilterState) obj).f108591a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f108591a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "FilterState(show=" + this.f108591a + ")";
    }

    /* renamed from: a */
    public final boolean mo153308a() {
        return this.f108591a;
    }

    public FilterState(boolean z) {
        this.f108591a = z;
    }
}
