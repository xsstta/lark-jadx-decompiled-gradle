package com.ss.android.lark.mail.impl.home.p2178a;

import com.ss.android.lark.mail.impl.entity.C42087a;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mail.impl.home.a.d */
public class C42368d {

    /* renamed from: a */
    public C42087a f107849a;

    /* renamed from: b */
    public int f107850b;

    /* renamed from: c */
    public boolean f107851c;

    public int hashCode() {
        return Objects.hash(this.f107849a, Integer.valueOf(this.f107850b), Boolean.valueOf(this.f107851c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42368d dVar = (C42368d) obj;
        if (this.f107850b == dVar.f107850b && this.f107851c == dVar.f107851c && Objects.equals(this.f107849a, dVar.f107849a)) {
            return true;
        }
        return false;
    }
}
