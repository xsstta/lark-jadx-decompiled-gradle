package com.bytedance.ee.bear.drive.core.model;

import android.util.SparseArray;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p702e.C13656a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.core.model.b */
public abstract class AbstractC6947b {

    /* renamed from: a */
    public final String f18785a;

    /* renamed from: b */
    protected volatile String f18786b;

    /* renamed from: c */
    public final long f18787c;

    /* renamed from: d */
    public final List<Integer> f18788d;

    /* renamed from: e */
    protected volatile int f18789e;

    /* renamed from: f */
    public final String f18790f;

    /* renamed from: g */
    public final boolean f18791g;

    /* renamed from: h */
    public final String f18792h;

    /* renamed from: i */
    public final SparseArray<PreviewMeta> f18793i;

    /* renamed from: j */
    public final String f18794j;

    /* renamed from: k */
    protected volatile String f18795k;

    /* renamed from: l */
    protected volatile int f18796l;

    /* renamed from: a */
    public String mo27358a() {
        return this.f18786b;
    }

    /* renamed from: b */
    public long mo27359b() {
        return this.f18787c;
    }

    /* renamed from: c */
    public int mo27360c() {
        return this.f18789e;
    }

    /* renamed from: d */
    public String mo27361d() {
        return this.f18790f;
    }

    /* renamed from: e */
    public boolean mo27362e() {
        return this.f18791g;
    }

    /* renamed from: f */
    public String mo27363f() {
        return this.f18792h;
    }

    /* renamed from: g */
    public String mo27364g() {
        return this.f18795k;
    }

    /* renamed from: h */
    public int mo27365h() {
        return this.f18796l;
    }

    /* renamed from: i */
    public String mo27366i() {
        return this.f18794j;
    }

    /* renamed from: j */
    public C6948a mo27367j() {
        return new C6948a();
    }

    public String toString() {
        return "AbsMeta{, size=" + this.f18787c + ", availablePreviewType=" + this.f18788d + ", previewStatus=" + this.f18789e + ", mimeType='" + this.f18790f + '\'' + ", webOffice=" + this.f18791g + ", ext='" + this.f18795k + '\'' + '}';
    }

    /* renamed from: com.bytedance.ee.bear.drive.core.model.b$a */
    public class C6948a {
        public C6948a() {
        }

        /* renamed from: a */
        public void mo27369a(int i) {
            C13479a.m54764b("DriveComponent", "Meta Builder#setPreviewStatus() status=" + i + " srcStatus=" + AbstractC6947b.this.f18789e);
            AbstractC6947b.this.f18789e = i;
        }

        /* renamed from: a */
        public void mo27370a(String str) {
            C13479a.m54764b("DriveComponent", "Meta Builder#setName() name=" + C13598b.m55197d(str) + " srcName=" + C13598b.m55197d(AbstractC6947b.this.f18786b));
            AbstractC6947b.this.f18786b = str;
            AbstractC6947b.this.f18795k = (String) C13657b.m55418a(C13672c.m55481b(str), "");
        }
    }

    public AbstractC6947b(String str, String str2, long j, int[] iArr, int i, String str3, boolean z, String str4, SparseArray<PreviewMeta> sparseArray) {
        this.f18785a = str == null ? "" : str;
        this.f18786b = str2;
        this.f18787c = j;
        this.f18788d = Collections.unmodifiableList(C13656a.m55417a(iArr));
        this.f18789e = i;
        this.f18790f = str3;
        this.f18791g = z;
        this.f18795k = (String) C13657b.m55418a(C13672c.m55481b(str2), "");
        this.f18792h = str4;
        this.f18793i = sparseArray;
        this.f18794j = C6952e.m27607a(sparseArray);
    }
}
