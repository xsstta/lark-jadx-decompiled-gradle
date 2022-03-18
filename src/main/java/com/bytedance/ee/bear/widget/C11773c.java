package com.bytedance.ee.bear.widget;

import android.text.SpannableStringBuilder;
import com.bytedance.ee.bear.at.AbstractC4246j;
import com.bytedance.ee.bear.p398i.AbstractC7828b;
import com.bytedance.ee.bear.p398i.AbstractC7831c;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.widget.c */
public class C11773c extends AbstractC7831c {

    /* renamed from: a */
    private WeakReference<AbstractC4246j> f31661a;

    /* renamed from: a */
    private void m48819a(SpannableStringBuilder spannableStringBuilder) {
    }

    /* renamed from: a */
    private void m48818a() {
        AbstractC4246j jVar = this.f31661a.get();
        if (jVar != null) {
            jVar.mo16677b();
        }
    }

    /* renamed from: b */
    private void m48821b() {
        AbstractC4246j jVar = this.f31661a.get();
        if (jVar != null) {
            jVar.mo16676a();
        }
    }

    public C11773c(AbstractC4246j jVar) {
        this.f31661a = new WeakReference<>(jVar);
    }

    @Override // com.bytedance.ee.bear.p398i.AbstractC7828b
    /* renamed from: a */
    public void mo30598a(SpannableStringBuilder spannableStringBuilder, AbstractC7828b.C7829a aVar) {
        C13479a.m54772d("AtEditor", "afterAtContentChanged: " + aVar);
        AbstractC7828b.C7829a.C7830a[] d = aVar.mo30606d();
        if (!(d == null || d.length == 0)) {
            m48818a();
            C13479a.m54772d("AtEditor", "afterAtContentChanged: before modified.");
            m48819a(spannableStringBuilder);
            int a = aVar.mo30599a();
            for (AbstractC7828b.C7829a.C7830a aVar2 : d) {
                boolean z = true;
                if (a == 1 || a == 3) {
                    AbstractC10466g a2 = aVar2.mo30608a();
                    if (a != 1) {
                        z = false;
                    }
                    m48820a(spannableStringBuilder, a2, z);
                }
            }
            C13479a.m54772d("AtEditor", "afterAtContentChanged: after modified.");
            m48819a(spannableStringBuilder);
            m48821b();
        }
    }

    /* renamed from: a */
    private void m48820a(SpannableStringBuilder spannableStringBuilder, AbstractC10466g gVar, boolean z) {
        C13479a.m54772d("AtEditor", "modifyOrDeleteOneSpan: delete or modify");
        if (!gVar.mo39745e()) {
            int spanStart = spannableStringBuilder.getSpanStart(gVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(gVar);
            if (spanStart >= 0 && spanEnd > spanStart) {
                C10462b[] bVarArr = (C10462b[]) spannableStringBuilder.getSpans(spanStart, spanEnd, C10462b.class);
                for (C10462b bVar : bVarArr) {
                    spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(bVar), spannableStringBuilder.getSpanEnd(bVar));
                }
            }
            if (z) {
                int spanStart2 = spannableStringBuilder.getSpanStart(gVar);
                int spanEnd2 = spannableStringBuilder.getSpanEnd(gVar);
                if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                    spannableStringBuilder.delete(spanStart2, spanEnd2);
                }
            }
            spannableStringBuilder.removeSpan(gVar);
        }
    }
}
