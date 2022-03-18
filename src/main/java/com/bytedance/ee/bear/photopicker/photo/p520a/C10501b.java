package com.bytedance.ee.bear.photopicker.photo.p520a;

import android.content.Context;
import com.bytedance.ee.bear.photopicker.photo.ErrorResult;
import com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.a.b */
public class C10501b {

    /* renamed from: a */
    public final AbstractC10513d.AbstractC10517b f28243a;

    /* renamed from: b */
    public final AbstractC10513d.AbstractC10514a f28244b;

    /* renamed from: b */
    public List<Photo> mo39873b() {
        return this.f28244b.mo39861a();
    }

    /* renamed from: c */
    public void mo39875c() {
        this.f28244b.mo39867b();
    }

    /* renamed from: d */
    public void mo39876d() {
        this.f28243a.mo39885a();
    }

    /* renamed from: e */
    public boolean mo39877e() {
        return this.f28243a.mo39894b();
    }

    /* renamed from: a */
    public void mo39870a() {
        this.f28243a.mo39893b(this.f28244b.mo39861a());
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.b$b */
    public class C10504b implements AbstractC10513d.AbstractC10517b.AbstractC10518a {
        @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10518a
        /* renamed from: a */
        public void mo39879a() {
            List<Photo> a = C10501b.this.f28244b.mo39861a();
            if (a != null && !a.isEmpty()) {
                C10501b.this.f28243a.mo39893b(a);
            }
        }

        @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10518a
        /* renamed from: b */
        public void mo39881b() {
            C10501b.this.f28244b.mo39867b();
            C10501b.this.f28243a.mo39889a(C10501b.this.f28244b.mo39861a());
        }

        public C10504b() {
        }

        @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b.AbstractC10518a
        /* renamed from: a */
        public boolean mo39880a(Photo photo) {
            boolean a = C10501b.this.f28244b.mo39866a(photo, new AbstractC10513d.AbstractC10514a.AbstractC10515a() {
                /* class com.bytedance.ee.bear.photopicker.photo.p520a.C10501b.C10504b.C105051 */

                @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a.AbstractC10515a
                /* renamed from: a */
                public void mo39882a(ErrorResult errorResult) {
                    C10501b.this.f28243a.mo39887a(errorResult.f28192a);
                }
            });
            C10501b.this.f28243a.mo39889a(C10501b.this.f28244b.mo39861a());
            return a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.b$a */
    public static class C10503a implements AbstractC10513d.AbstractC10514a.AbstractC10516b {

        /* renamed from: a */
        private final WeakReference<AbstractC10513d.AbstractC10517b> f28245a;

        private C10503a(AbstractC10513d.AbstractC10517b bVar) {
            this.f28245a = new WeakReference<>(bVar);
        }

        @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10514a.AbstractC10516b
        /* renamed from: a */
        public void mo39878a(List<Photo> list, List<Photo> list2) {
            if (this.f28245a.get() != null) {
                this.f28245a.get().mo39890a(list, list2);
            }
        }
    }

    /* renamed from: b */
    public void mo39874b(Context context) {
        this.f28244b.mo39868b(context, new C10503a(this.f28243a));
    }

    /* renamed from: a */
    public void mo39871a(Context context) {
        this.f28244b.mo39863a(context, new C10503a(this.f28243a));
    }

    public C10501b(AbstractC10513d.AbstractC10517b bVar, AbstractC10513d.AbstractC10514a aVar) {
        this.f28243a = bVar;
        this.f28244b = aVar;
        bVar.mo39888a(new C10504b());
    }

    /* renamed from: a */
    public void mo39872a(boolean z, List<Photo> list) {
        this.f28243a.mo39892a(z);
        this.f28243a.mo39889a(this.f28244b.mo39862a(list));
    }
}
