package com.ss.android.lark.reaction.widget.flowlayout.p2562a;

import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.reaction.widget.flowlayout.a.a */
public class C53061a {

    /* renamed from: a */
    public String f131133a;

    /* renamed from: b */
    public int f131134b;

    /* renamed from: c */
    public List<C53062b> f131135c;

    public int hashCode() {
        return Objects.hash(this.f131133a, Integer.valueOf(this.f131134b), this.f131135c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53061a)) {
            return false;
        }
        C53061a aVar = (C53061a) obj;
        if (this.f131134b != aVar.f131134b || !Objects.equals(this.f131133a, aVar.f131133a) || !Objects.equals(this.f131135c, aVar.f131135c)) {
            return false;
        }
        return true;
    }
}
