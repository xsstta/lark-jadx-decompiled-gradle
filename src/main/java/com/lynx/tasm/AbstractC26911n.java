package com.lynx.tasm;

import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.AbstractC26674h;
import javax.xml.transform.Transformer;

/* renamed from: com.lynx.tasm.n */
public abstract class AbstractC26911n implements AbstractC26674h {
    /* renamed from: a */
    public void mo11457a() {
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h
    /* renamed from: a */
    public void mo53708a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC26674h.AbstractC26675a aVar) {
    }

    /* renamed from: a */
    public void mo11458a(LynxPerfMetric lynxPerfMetric) {
    }

    /* renamed from: a */
    public void mo11459a(C26906i iVar) {
    }

    /* renamed from: a */
    public void mo95736a(C26912a aVar) {
    }

    /* renamed from: a */
    public void mo95737a(C26913b bVar) {
    }

    /* renamed from: a */
    public void mo11460a(String str) {
    }

    /* renamed from: a */
    public void mo53709a(String str, String str2, int i) {
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h
    /* renamed from: b */
    public String mo33934b(String str) {
        return null;
    }

    /* renamed from: b */
    public void mo11461b() {
    }

    /* renamed from: b */
    public void mo50245b(LynxPerfMetric lynxPerfMetric) {
    }

    /* renamed from: b */
    public void mo87260b(C26906i iVar) {
    }

    /* renamed from: b */
    public void mo95738b(C26913b bVar) {
    }

    /* renamed from: c */
    public void mo11462c() {
    }

    /* renamed from: c */
    public void mo87261c(C26906i iVar) {
    }

    /* renamed from: c */
    public void mo50246c(String str) {
    }

    /* renamed from: d */
    public void mo11463d() {
    }

    /* renamed from: d */
    public void mo87262d(C26906i iVar) {
    }

    /* renamed from: d */
    public void mo50247d(String str) {
    }

    /* renamed from: e */
    public void mo11464e() {
    }

    /* renamed from: f */
    public void mo53710f() {
    }

    /* renamed from: com.lynx.tasm.n$a */
    public static class C26912a {

        /* renamed from: a */
        public final boolean f66829a;

        /* renamed from: b */
        public final long f66830b;

        /* renamed from: c */
        public final long f66831c;

        public String toString() {
            return String.format("FlushInfo is sync:" + this.f66829a + ", begin timing:" + this.f66830b + ", end timing:" + this.f66831c, new Object[0]);
        }

        public C26912a(boolean z, long j, long j2) {
            this.f66829a = z;
            this.f66830b = j;
            this.f66831c = j2;
        }
    }

    /* renamed from: com.lynx.tasm.n$b */
    public static class C26913b {

        /* renamed from: a */
        public View f66832a;

        /* renamed from: b */
        public String f66833b;

        /* renamed from: c */
        public String f66834c;

        public String toString() {
            return String.format("ViewInfo @%d view %s, name %s, monitor-name %s", Integer.valueOf(hashCode()), this.f66832a.getClass().getSimpleName(), this.f66833b, this.f66834c);
        }

        public C26913b(View view, String str, String str2) {
            this.f66832a = view;
            this.f66833b = str;
            this.f66834c = str2;
        }
    }
}
