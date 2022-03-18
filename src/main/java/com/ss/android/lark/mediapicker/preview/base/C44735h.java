package com.ss.android.lark.mediapicker.preview.base;

import android.content.Intent;
import com.ss.android.lark.mediapicker.entity.C44680a;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.p2241a.AbstractC44615a;
import com.ss.android.lark.mediapicker.preview.base.AbstractC44726b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.h */
public class C44735h {

    /* renamed from: a */
    public final AbstractC44726b.AbstractC44727a f113332a;

    /* renamed from: b */
    public final AbstractC44726b.AbstractC44728b f113333b;

    /* renamed from: b */
    public boolean mo158452b() {
        return this.f113333b.mo158424c();
    }

    /* renamed from: e */
    public boolean mo158455e() {
        return this.f113333b.mo158426d();
    }

    /* renamed from: a */
    public void mo158450a() {
        this.f113333b.mo158421b(this.f113332a.mo158433b());
    }

    /* renamed from: c */
    public ArrayList<LocalMedia> mo158453c() {
        return new ArrayList<>(this.f113332a.mo158428a());
    }

    /* renamed from: d */
    public ArrayList<LocalMedia> mo158454d() {
        return new ArrayList<>(this.f113332a.mo158435c());
    }

    /* renamed from: com.ss.android.lark.mediapicker.preview.base.h$a */
    public class C44736a implements AbstractC44726b.AbstractC44728b.AbstractC44729a {
        public C44736a() {
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: a */
        public void mo158440a(EditInfo editInfo) {
            C44735h.this.f113332a.mo158429a(editInfo);
            C44735h.this.f113333b.mo158416a(editInfo);
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: d */
        public LocalMedia mo158444d(int i) {
            return C44735h.this.f113332a.mo158437d(i);
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: e */
        public int mo158445e(int i) {
            return C44735h.this.f113332a.mo158438e(i);
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: a */
        public void mo158441a(boolean z) {
            C44735h.this.f113333b.mo158418a(C44735h.this.f113332a.mo158428a());
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: b */
        public boolean mo158442b(int i) {
            boolean a = C44735h.this.f113332a.mo158432a(i, new AbstractC44615a() {
                /* class com.ss.android.lark.mediapicker.preview.base.C44735h.C44736a.C447371 */

                @Override // com.ss.android.lark.mediapicker.p2241a.AbstractC44615a
                /* renamed from: a */
                public void mo158123a(C44680a aVar) {
                    C44735h.this.f113333b.mo158414a(aVar.f113230a);
                }
            });
            C44735h.this.f113333b.mo158418a(C44735h.this.f113332a.mo158428a());
            return a;
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: a */
        public void mo158439a(int i) {
            List<LocalMedia> a = C44735h.this.f113332a.mo158428a();
            List<LocalMedia> c = C44735h.this.f113332a.mo158435c();
            if (a.size() > 0) {
                C44735h.this.f113333b.mo158419a(a, c);
                return;
            }
            mo158442b(i);
            C44735h.this.f113333b.mo158419a(C44735h.this.f113332a.mo158428a(), c);
        }

        @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b.AbstractC44729a
        /* renamed from: c */
        public void mo158443c(int i) {
            C44735h.this.f113333b.mo158420a(C44735h.this.f113332a.mo158431a(i));
            C44735h.this.f113333b.mo158422b(C44735h.this.f113332a.mo158434b(i));
            C44735h.this.f113333b.mo158423c(C44735h.this.f113332a.mo158436c(i));
        }
    }

    public C44735h(AbstractC44726b.AbstractC44727a aVar, AbstractC44726b.AbstractC44728b bVar) {
        this.f113332a = aVar;
        this.f113333b = bVar;
        bVar.mo158417a(new C44736a());
    }

    /* renamed from: a */
    public void mo158451a(int i, int i2, Intent intent) {
        this.f113333b.mo158402a(i, i2, intent);
    }
}
