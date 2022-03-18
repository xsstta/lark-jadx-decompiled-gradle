package com.ss.android.lark.p1786d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.p1786d.C36421a;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.d.l */
public class C36447l {

    /* renamed from: a */
    final C36421a.AbstractC36427f f94013a;

    /* renamed from: b */
    int f94014b;

    /* renamed from: c */
    volatile int f94015c;

    /* renamed from: d */
    final ConcurrentLinkedQueue<View> f94016d = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public void mo134328a() {
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f94016d;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.clear();
        }
    }

    /* renamed from: a */
    public View mo134327a(Context context) {
        if (this.f94016d.isEmpty()) {
            return this.f94013a.mo134292a(context);
        }
        return this.f94016d.poll();
    }

    public C36447l(C36421a.AbstractC36427f fVar, int i) {
        this.f94013a = fVar;
        this.f94014b = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m143622a(View view, ViewGroup viewGroup) {
        this.f94015c--;
        if (view != null) {
            this.f94016d.offer(view);
        }
    }

    /* renamed from: a */
    public void mo134329a(C36421a aVar, ViewGroup viewGroup) {
        int size = (this.f94014b - this.f94016d.size()) - this.f94015c;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                aVar.mo134287a(this.f94013a, viewGroup, new C36421a.AbstractC36424c() {
                    /* class com.ss.android.lark.p1786d.$$Lambda$l$NOukqei8jdzRSYZsZItZsXnv9C8 */

                    @Override // com.ss.android.lark.p1786d.C36421a.AbstractC36424c
                    public final void onCreateFinished(View view, ViewGroup viewGroup) {
                        C36447l.this.m143622a((C36447l) view, (View) viewGroup);
                    }
                });
                this.f94015c++;
            }
        }
    }
}
