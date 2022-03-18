package com.ss.android.lark.mediapicker.album.base;

import android.content.Context;
import androidx.loader.p045a.AbstractC1181a;
import com.ss.android.lark.mediapicker.album.base.AbstractC44653g;
import com.ss.android.lark.mediapicker.entity.C44680a;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44615a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.b */
public class C44627b {

    /* renamed from: a */
    public final AbstractC44653g.AbstractC44655b f113117a;

    /* renamed from: b */
    public final AbstractC44653g.AbstractC44654a f113118b;

    /* renamed from: b */
    public List<LocalMedia> mo158182b() {
        return this.f113118b.mo158163a();
    }

    /* renamed from: c */
    public List<LocalMedia> mo158184c() {
        return this.f113118b.mo158170b();
    }

    /* renamed from: d */
    public void mo158185d() {
        this.f113118b.mo158174d();
    }

    /* renamed from: e */
    public void mo158186e() {
        this.f113117a.mo158225b();
    }

    /* renamed from: f */
    public boolean mo158187f() {
        return this.f113117a.mo158228c();
    }

    /* renamed from: com.ss.android.lark.mediapicker.album.base.b$b */
    public class C44630b implements AbstractC44653g.AbstractC44655b.AbstractC44656a {
        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44656a
        /* renamed from: a */
        public void mo158189a() {
            List<LocalMedia> a = C44627b.this.f113118b.mo158163a();
            if (a != null && !a.isEmpty()) {
                C44627b.this.f113117a.mo158221a(a, C44627b.this.f113118b.mo158170b());
            }
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44656a
        /* renamed from: b */
        public void mo158191b() {
            C44627b.this.f113118b.mo158174d();
            C44627b.this.f113117a.mo158220a(C44627b.this.f113118b.mo158163a());
        }

        public C44630b() {
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b.AbstractC44656a
        /* renamed from: a */
        public boolean mo158190a(LocalMedia localMedia) {
            boolean a = C44627b.this.f113118b.mo158169a(localMedia, new AbstractC44615a() {
                /* class com.ss.android.lark.mediapicker.album.base.C44627b.C44630b.C446311 */

                @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44615a
                /* renamed from: a */
                public void mo158123a(C44680a aVar) {
                    C44627b.this.f113117a.mo158142a(aVar.f113230a);
                }
            });
            C44627b.this.f113117a.mo158220a(C44627b.this.f113118b.mo158163a());
            C44627b.this.f113117a.mo158226b(C44627b.this.f113118b.mo158163a());
            return a;
        }
    }

    /* renamed from: a */
    public void mo158176a() {
        this.f113117a.mo158221a(this.f113118b.mo158163a(), this.f113118b.mo158170b());
    }

    /* renamed from: com.ss.android.lark.mediapicker.album.base.b$a */
    private static class C44629a implements AbstractC44658h {

        /* renamed from: a */
        private final WeakReference<AbstractC44653g.AbstractC44655b> f113119a;

        private C44629a(AbstractC44653g.AbstractC44655b bVar) {
            this.f113119a = new WeakReference<>(bVar);
        }

        @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44658h
        /* renamed from: a */
        public void mo158188a(List<LocalMediaFolder> list, List<LocalMedia> list2, List<LocalMedia> list3) {
            if (this.f113119a.get() != null) {
                this.f113119a.get().mo158223a(list, list2, list3);
            }
        }
    }

    /* renamed from: a */
    private void m177033a(List<LocalMedia> list) {
        if (!(list == null || list.isEmpty())) {
            for (LocalMedia localMedia : list) {
                this.f113118b.mo158166a(new EditInfo(localMedia.getId(), localMedia.getPath()));
            }
            this.f113117a.mo158227b(this.f113118b.mo158173c(), this.f113118b.mo158163a());
        }
    }

    /* renamed from: a */
    public void mo158178a(EditInfo editInfo) {
        this.f113118b.mo158166a(editInfo);
        this.f113117a.mo158227b(this.f113118b.mo158173c(), this.f113118b.mo158163a());
    }

    /* renamed from: a */
    public void mo158179a(LocalMedia localMedia) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(localMedia);
        this.f113118b.mo158174d();
        this.f113117a.mo158221a(arrayList, this.f113118b.mo158170b());
    }

    /* renamed from: a */
    public void mo158180a(boolean z, List<LocalMedia> list) {
        mo158181a(z, list, null);
    }

    public C44627b(AbstractC44653g.AbstractC44655b bVar, AbstractC44653g.AbstractC44654a aVar) {
        this.f113117a = bVar;
        this.f113118b = aVar;
        bVar.mo158219a(new C44630b());
    }

    /* renamed from: a */
    public void mo158177a(AbstractC1181a aVar, Context context) {
        this.f113118b.mo158164a(aVar, context, new C44629a(this.f113117a));
    }

    /* renamed from: b */
    public void mo158183b(AbstractC1181a aVar, Context context) {
        this.f113118b.mo158172b(aVar, context, new C44629a(this.f113117a));
    }

    /* renamed from: a */
    public void mo158181a(boolean z, List<LocalMedia> list, List<LocalMedia> list2) {
        this.f113117a.mo158224a(z);
        m177033a(list2);
        this.f113118b.mo158171b(list);
        this.f113117a.mo158220a(this.f113118b.mo158171b(list));
    }
}
