package com.bytedance.ee.bear.drive.loader.model;

import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.core.model.AbstractC6950d;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.loader.model.c */
public class C7090c {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.model.c$a */
    public static class C7091a implements AbstractC6949c<C7086a> {

        /* renamed from: a */
        private C7086a f19105a;

        /* renamed from: p */
        public C7086a mo27371a() {
            return this.f19105a;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: d */
        public String mo27374d() {
            return this.f19105a.mo27351r();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: j */
        public String mo27380j() {
            return this.f19105a.mo27333d();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: k */
        public String mo27381k() {
            return this.f19105a.mo27343j();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: l */
        public String mo27382l() {
            return this.f19105a.mo27339f();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: m */
        public int mo27383m() {
            return this.f19105a.mo27345l();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: n */
        public List<Integer> mo27398n() {
            return mo27376f();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: b */
        public String mo27372b() {
            return this.f19105a.mo27322a().f18785a;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: c */
        public String mo27373c() {
            return this.f19105a.mo27322a().mo27364g();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: e */
        public String mo27375e() {
            return this.f19105a.mo27322a().f19098q;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: g */
        public long mo27377g() {
            return this.f19105a.mo27322a().f18787c;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: h */
        public int mo27378h() {
            return this.f19105a.mo27322a().mo27360c();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: i */
        public boolean mo27379i() {
            return this.f19105a.mo27322a().mo27362e();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: f */
        public List<Integer> mo27376f() {
            return (List) C13657b.m55418a(this.f19105a.mo27325b(), new ArrayList(0));
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: o */
        public AbstractC6950d.C6951a mo27399o() {
            return new AbstractC6950d.C6951a(((Integer) C13657b.m55418a((Object) Integer.valueOf(this.f19105a.mo27329c()), (Object) -1)).intValue(), (String) C13657b.m55418a(this.f19105a.mo27333d(), ""));
        }

        public C7091a(C7086a aVar) {
            this.f19105a = aVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: b */
        public void mo27391b(String str) {
            this.f19105a.mo27327b(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: c */
        public void mo27393c(String str) {
            this.f19105a.mo27337e(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: e */
        public void mo27397e(String str) {
            this.f19105a.mo27334d(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27384a(int i) {
            this.f19105a.mo27331c(i);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: d */
        public void mo27395d(String str) {
            this.f19105a.mo27319a(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27385a(long j) {
            this.f19105a.mo27323a(j);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: b */
        public void mo27392b(boolean z) {
            this.f19105a.mo27328b(z);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: c */
        public void mo27394c(boolean z) {
            this.f19105a.mo27335d(z);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: d */
        public void mo27396d(boolean z) {
            this.f19105a.mo27332c(z);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27386a(AbstractC6950d.C6951a aVar) {
            this.f19105a.mo27319a(aVar.f18799b);
            this.f19105a.mo27318a(aVar.f18798a);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27387a(String str) {
            this.f19105a.mo27330c(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27388a(List<Integer> list) {
            this.f19105a.mo27320a(list);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27389a(Map<String, String> map) {
            this.f19105a.mo27321a(map);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27390a(boolean z) {
            this.f19105a.mo27324a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.model.c$b */
    public static class C7092b implements AbstractC6949c<C7088b> {

        /* renamed from: a */
        private C7088b f19106a;

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: e */
        public String mo27375e() {
            return "";
        }

        /* renamed from: p */
        public C7088b mo27371a() {
            return this.f19106a;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: d */
        public String mo27374d() {
            return this.f19106a.mo27351r();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: j */
        public String mo27380j() {
            return this.f19106a.mo27333d();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: k */
        public String mo27381k() {
            return this.f19106a.mo27343j();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: l */
        public String mo27382l() {
            return this.f19106a.mo27339f();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: m */
        public int mo27383m() {
            return this.f19106a.mo27345l();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: n */
        public List<Integer> mo27398n() {
            return mo27376f();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: b */
        public String mo27372b() {
            return this.f19106a.mo27322a().f18785a;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: g */
        public long mo27377g() {
            return this.f19106a.mo27322a().f18787c;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: h */
        public int mo27378h() {
            return this.f19106a.mo27322a().mo27360c();
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: i */
        public boolean mo27379i() {
            return this.f19106a.mo27322a().f18791g;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: c */
        public String mo27373c() {
            return (String) C13657b.m55418a(this.f19106a.mo27322a().mo27364g(), "");
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6949c
        /* renamed from: f */
        public List<Integer> mo27376f() {
            return (List) C13657b.m55418a(this.f19106a.mo27325b(), new ArrayList(0));
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: o */
        public AbstractC6950d.C6951a mo27399o() {
            return new AbstractC6950d.C6951a(((Integer) C13657b.m55418a((Object) Integer.valueOf(this.f19106a.mo27329c()), (Object) -1)).intValue(), (String) C13657b.m55418a(this.f19106a.mo27333d(), ""));
        }

        public C7092b(C7088b bVar) {
            this.f19106a = bVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: b */
        public void mo27391b(String str) {
            this.f19106a.mo27327b(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: c */
        public void mo27393c(String str) {
            this.f19106a.mo27337e(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: e */
        public void mo27397e(String str) {
            this.f19106a.mo27334d(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27384a(int i) {
            this.f19106a.mo27331c(i);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: c */
        public void mo27394c(boolean z) {
            this.f19106a.mo27335d(z);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: d */
        public void mo27395d(String str) {
            this.f19106a.mo27319a(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27385a(long j) {
            this.f19106a.mo27323a(j);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: b */
        public void mo27392b(boolean z) {
            this.f19106a.mo27328b(z);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: d */
        public void mo27396d(boolean z) {
            this.f19106a.mo27332c(z);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27386a(AbstractC6950d.C6951a aVar) {
            this.f19106a.mo27319a(aVar.f18799b);
            this.f19106a.mo27318a(aVar.f18798a);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27387a(String str) {
            this.f19106a.mo27330c(str);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27388a(List<Integer> list) {
            this.f19106a.mo27320a(list);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27389a(Map<String, String> map) {
            this.f19106a.mo27321a(map);
        }

        @Override // com.bytedance.ee.bear.drive.core.model.AbstractC6950d
        /* renamed from: a */
        public void mo27390a(boolean z) {
            this.f19106a.mo27324a(z);
        }
    }

    /* renamed from: a */
    public static <F extends AbstractC6946a> AbstractC6949c<F> m28237a(F f) {
        if (f instanceof C7086a) {
            return new C7091a((C7086a) f);
        }
        if (f instanceof C7088b) {
            return new C7092b((C7088b) f);
        }
        throw new IllegalArgumentException("Not support fm type, fm=" + f);
    }
}
