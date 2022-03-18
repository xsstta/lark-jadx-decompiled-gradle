package com.bytedance.ee.bear.atbottombar;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.atfinder.AbstractC4269d;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.atbottombar.c */
public class C4258c {

    /* renamed from: a */
    public List<View$OnKeyListenerC4262a> f12809a = new ArrayList();

    /* renamed from: b */
    public int f12810b;

    /* renamed from: c */
    private final List<C4255a> f12811c;

    /* renamed from: a */
    public List<View$OnKeyListenerC4262a> mo16717a() {
        return this.f12809a;
    }

    /* renamed from: com.bytedance.ee.bear.atbottombar.c$a */
    class C4259a implements AbstractC4269d {

        /* renamed from: b */
        private String f12813b;

        /* renamed from: c */
        private AbstractC4269d f12814c;

        /* renamed from: d */
        private View$OnKeyListenerC4262a f12815d;

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16703a() {
            AbstractC4269d dVar = this.f12814c;
            if (dVar != null) {
                dVar.mo16703a();
            }
            this.f12813b = null;
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16704a(AtFinderResultList atFinderResultList) {
            AbstractC4269d dVar = this.f12814c;
            if (dVar != null) {
                dVar.mo16704a(atFinderResultList);
            }
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: b */
        public void mo16706b(String str) {
            AbstractC4269d dVar = this.f12814c;
            if (dVar != null) {
                dVar.mo16706b(str);
            }
            this.f12813b = null;
        }

        /* renamed from: a */
        public void mo16724a(View$OnKeyListenerC4262a aVar) {
            if (aVar != null) {
                this.f12815d = aVar;
                aVar.mo16782a(this);
            }
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16705a(String str) {
            boolean z;
            AbstractC4269d dVar = this.f12814c;
            if (dVar != null) {
                dVar.mo16705a(str);
            }
            View$OnKeyListenerC4262a aVar = C4258c.this.f12809a.get(C4258c.this.f12810b);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f12813b)) {
                z = true;
            } else {
                z = false;
            }
            if (this.f12815d == aVar && !z && this.f12813b.length() < str.length()) {
                C13479a.m54764b("AtFinderCallbackWrapper", "onEmptyResult: closeAtFinder");
                C4258c.this.mo16723c();
            }
            this.f12813b = str;
        }

        public C4259a(AbstractC4269d dVar) {
            this.f12814c = dVar;
        }
    }

    /* renamed from: b */
    public C4255a mo16722b() {
        return this.f12811c.get(this.f12810b);
    }

    /* renamed from: c */
    public void mo16723c() {
        for (View$OnKeyListenerC4262a aVar : this.f12809a) {
            aVar.mo16790c();
        }
    }

    /* renamed from: a */
    public void mo16718a(int i) {
        this.f12810b = i;
    }

    /* renamed from: a */
    public void mo16719a(AbstractC4269d dVar) {
        for (View$OnKeyListenerC4262a aVar : this.f12809a) {
            new C4259a(dVar).mo16724a(aVar);
        }
    }

    /* renamed from: a */
    public void mo16720a(C4520c cVar) {
        for (int i = 0; i < this.f12809a.size(); i++) {
            this.f12809a.get(i).mo16783a(cVar);
            this.f12811c.get(i).mo16715b().mo45018a(cVar);
        }
    }

    /* renamed from: a */
    public void mo16721a(boolean z) {
        for (View$OnKeyListenerC4262a aVar : this.f12809a) {
            aVar.mo16786a(z);
        }
    }

    public C4258c(List<C4255a> list, Fragment fragment, C4520c cVar) {
        this.f12811c = list;
        for (C4255a aVar : list) {
            this.f12809a.add(aVar.mo16713a(fragment, cVar));
        }
    }
}
