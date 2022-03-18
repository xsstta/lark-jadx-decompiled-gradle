package com.lynx.tasm;

import android.content.Context;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.behavior.AbstractC26674h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.xml.transform.Transformer;

/* renamed from: com.lynx.tasm.o */
public class C26931o extends AbstractC26911n {

    /* renamed from: a */
    private CopyOnWriteArrayList<AbstractC26911n> f66871a = new CopyOnWriteArrayList<>();

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo53709a(String str, String str2, int i) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo53709a(str, str2, i);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11457a() {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11457a();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: c */
    public void mo11462c() {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11462c();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: d */
    public void mo11463d() {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11463d();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: e */
    public void mo11464e() {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11464e();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: f */
    public void mo53710f() {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo53710f();
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo11461b() {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11461b();
        }
    }

    /* renamed from: b */
    public void mo95772b(AbstractC26911n nVar) {
        this.f66871a.remove(nVar);
    }

    /* renamed from: a */
    public void mo95771a(AbstractC26911n nVar) {
        if (!this.f66871a.contains(nVar)) {
            this.f66871a.add(nVar);
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public String mo33934b(String str) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            String b = it.next().mo33934b(str);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: c */
    public void mo87261c(C26906i iVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo87261c(iVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: d */
    public void mo87262d(C26906i iVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo87262d(iVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11458a(LynxPerfMetric lynxPerfMetric) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11458a(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo50245b(LynxPerfMetric lynxPerfMetric) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo50245b(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: c */
    public void mo50246c(String str) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo50246c(str);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: d */
    public void mo50247d(String str) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo50247d(str);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11459a(C26906i iVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11459a(iVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo87260b(C26906i iVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo87260b(iVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo95736a(AbstractC26911n.C26912a aVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo95736a(aVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo95738b(AbstractC26911n.C26913b bVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo95738b(bVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo95737a(AbstractC26911n.C26913b bVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo95737a(bVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11460a(String str) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo11460a(str);
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo53708a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC26674h.AbstractC26675a aVar) {
        Iterator<AbstractC26911n> it = this.f66871a.iterator();
        while (it.hasNext()) {
            it.next().mo53708a(context, str, str2, f, f2, transformer, aVar);
        }
    }
}
