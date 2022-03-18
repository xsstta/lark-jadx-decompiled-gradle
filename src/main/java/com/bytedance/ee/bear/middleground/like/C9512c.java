package com.bytedance.ee.bear.middleground.like;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.middleground.like.c */
public class C9512c {

    /* renamed from: a */
    public List<C9513a> f25547a = new ArrayList();

    /* renamed from: b */
    public boolean f25548b = true;

    /* renamed from: com.bytedance.ee.bear.middleground.like.c$a */
    public static class C9513a {

        /* renamed from: a */
        public String f25549a;

        /* renamed from: b */
        public String f25550b;

        /* renamed from: c */
        public String f25551c;

        /* renamed from: d */
        public String f25552d;

        /* renamed from: e */
        public String f25553e;

        /* renamed from: f */
        public String f25554f;

        /* renamed from: g */
        public long f25555g;

        public int hashCode() {
            return Objects.hash(this.f25549a, this.f25550b, this.f25551c, this.f25552d, this.f25553e, this.f25554f, Long.valueOf(this.f25555g));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9513a aVar = (C9513a) obj;
            if (this.f25555g != aVar.f25555g || !Objects.equals(this.f25549a, aVar.f25549a) || !Objects.equals(this.f25550b, aVar.f25550b) || !Objects.equals(this.f25551c, aVar.f25551c) || !Objects.equals(this.f25552d, aVar.f25552d) || !Objects.equals(this.f25553e, aVar.f25553e) || !Objects.equals(this.f25554f, aVar.f25554f)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo36388a(C9513a aVar) {
        this.f25547a.add(aVar);
    }
}
