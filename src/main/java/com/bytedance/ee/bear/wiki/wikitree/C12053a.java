package com.bytedance.ee.bear.wiki.wikitree;

import android.view.View;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.a */
public final class C12053a {

    /* renamed from: a */
    private boolean f32545a = true;

    /* renamed from: b */
    private boolean f32546b = true;

    /* renamed from: c */
    private ArrayList<View> f32547c;

    /* renamed from: d */
    private AbstractC12055a f32548d;

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.a$a */
    public interface AbstractC12055a {
        /* renamed from: a */
        void mo46171a(View view);

        /* renamed from: b */
        void mo46172b(View view);
    }

    /* renamed from: a */
    private void m49922a() {
        Iterator<View> it = this.f32547c.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.wiki.wikitree.C12053a.C120541 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C12053a.this.mo46168a(view);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo46168a(View view) {
        if (!this.f32545a) {
            C13479a.m54764b("Wiki_ActionWrapper", "ActionWrapper.performAction(), unClickableClick...");
            this.f32548d.mo46172b(view);
            return;
        }
        this.f32548d.mo46171a(view);
    }

    /* renamed from: b */
    public void mo46170b(boolean z) {
        this.f32545a = z;
        ArrayList<View> arrayList = this.f32547c;
        if (arrayList != null) {
            if (!z) {
                Iterator<View> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().setAlpha(0.5f);
                }
            } else if (this.f32546b) {
                Iterator<View> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    View next = it2.next();
                    next.setEnabled(true);
                    next.setAlpha(1.0f);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo46169a(boolean z) {
        this.f32546b = z;
        ArrayList<View> arrayList = this.f32547c;
        if (arrayList != null) {
            if (!z) {
                Iterator<View> it = arrayList.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    next.setEnabled(false);
                    next.setAlpha(0.5f);
                }
                return;
            }
            Iterator<View> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                View next2 = it2.next();
                next2.setEnabled(true);
                if (this.f32545a) {
                    next2.setAlpha(1.0f);
                }
            }
        }
    }

    public C12053a(ArrayList<View> arrayList, AbstractC12055a aVar) {
        this.f32547c = arrayList;
        this.f32548d = aVar;
        m49922a();
    }
}
