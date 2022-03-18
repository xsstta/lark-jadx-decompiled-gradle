package com.bytedance.ee.bear.drive.core.model;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.core.model.a */
public abstract class AbstractC6946a {

    /* renamed from: a */
    protected final AbstractC6947b f18767a;

    /* renamed from: b */
    private List<Integer> f18768b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    private int f18769c = -1;

    /* renamed from: d */
    private String f18770d;

    /* renamed from: e */
    private LinkedHashMap<String, String> f18771e = new LinkedHashMap<>();

    /* renamed from: f */
    private String f18772f;

    /* renamed from: g */
    private String f18773g;

    /* renamed from: h */
    private boolean f18774h = false;

    /* renamed from: i */
    private String f18775i;

    /* renamed from: j */
    private boolean f18776j = false;

    /* renamed from: k */
    private int f18777k = -1;

    /* renamed from: l */
    private boolean f18778l;

    /* renamed from: m */
    private boolean f18779m;

    /* renamed from: n */
    private int f18780n = -1;

    /* renamed from: o */
    private int f18781o;

    /* renamed from: p */
    private String f18782p;

    /* renamed from: q */
    private boolean f18783q;

    /* renamed from: r */
    private long f18784r;

    /* renamed from: b */
    public List<Integer> mo27325b() {
        return this.f18768b;
    }

    /* renamed from: c */
    public int mo27329c() {
        return this.f18769c;
    }

    /* renamed from: d */
    public String mo27333d() {
        return this.f18770d;
    }

    /* renamed from: e */
    public LinkedHashMap<String, String> mo27336e() {
        return this.f18771e;
    }

    /* renamed from: f */
    public String mo27339f() {
        return this.f18772f;
    }

    /* renamed from: g */
    public String mo27340g() {
        return this.f18773g;
    }

    /* renamed from: h */
    public boolean mo27341h() {
        return this.f18774h;
    }

    /* renamed from: i */
    public long mo27342i() {
        return this.f18784r;
    }

    /* renamed from: j */
    public String mo27343j() {
        return this.f18775i;
    }

    /* renamed from: k */
    public boolean mo27344k() {
        return this.f18776j;
    }

    /* renamed from: l */
    public int mo27345l() {
        return this.f18777k;
    }

    /* renamed from: n */
    public boolean mo27347n() {
        return this.f18779m;
    }

    /* renamed from: o */
    public int mo27348o() {
        return this.f18780n;
    }

    /* renamed from: p */
    public int mo27349p() {
        return this.f18781o;
    }

    /* renamed from: q */
    public boolean mo27350q() {
        return this.f18783q;
    }

    /* renamed from: r */
    public String mo27351r() {
        return this.f18782p;
    }

    /* renamed from: s */
    public String mo27352s() {
        return this.f18767a.mo27361d();
    }

    /* renamed from: t */
    public String mo27353t() {
        return this.f18767a.mo27366i();
    }

    /* renamed from: m */
    public boolean mo27346m() {
        if (this.f18778l || mo27344k()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC6947b mo27322a() {
        return this.f18767a;
    }

    /* renamed from: u */
    public boolean mo27355u() {
        String d = this.f18767a.mo27361d();
        String i = this.f18767a.mo27366i();
        if (!TextUtils.isEmpty(d) && TextUtils.equals(d, i)) {
            return true;
        }
        String g = this.f18767a.mo27364g();
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(i);
        if (TextUtils.isEmpty(g) || !TextUtils.equals(g, extensionFromMimeType)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public void mo27357w() {
        boolean remove = this.f18768b.remove(Integer.valueOf(this.f18769c));
        C13479a.m54764b("DriveComponent", "removeFailedSupportPreviewType serverPreviewType: " + this.f18769c + "  ret: " + remove);
    }

    public String toString() {
        return "AbsFileModel{meta=" + this.f18767a + ", serverSupportPreviewType=" + this.f18768b + ", serverPreviewType=" + this.f18769c + ", previewExt='" + this.f18770d + '\'' + ", videoPreviewUrls=" + this.f18771e + ", extra='" + this.f18772f + '\'' + ", isStreaming=" + this.f18774h + ", hasCache=" + this.f18776j + ", cachedType=" + this.f18777k + ", isDownloadedFile=" + this.f18778l + ", isCacheFileModel=" + this.f18779m + '}';
    }

    /* renamed from: v */
    public C7553d mo27356v() {
        LinkedHashMap<String, String> e = mo27336e();
        if (C13657b.m55422a(e) && !TextUtils.isEmpty(mo27340g())) {
            e = new LinkedHashMap<>();
            e.put("", mo27340g());
        }
        return new C7553d(mo27322a().mo27358a(), mo27333d(), mo27343j(), mo27322a().f18787c, e, mo27339f(), mo27348o(), mo27341h(), mo27342i(), mo27346m(), mo27322a().mo27364g(), mo27351r()).mo29486f(mo27322a().f18792h).mo29477b(mo27349p()).mo29478b(mo27322a().f18785a).mo29475a(mo27350q());
    }

    /* renamed from: a */
    public AbstractC6946a mo27318a(int i) {
        this.f18769c = i;
        return this;
    }

    /* renamed from: a */
    public AbstractC6946a mo27319a(String str) {
        this.f18770d = str;
        return this;
    }

    /* renamed from: b */
    public void mo27326b(int i) {
        this.f18777k = i;
    }

    /* renamed from: c */
    public AbstractC6946a mo27330c(String str) {
        this.f18773g = str;
        return this;
    }

    /* renamed from: d */
    public void mo27334d(String str) {
        this.f18775i = str;
    }

    /* renamed from: e */
    public void mo27337e(String str) {
        this.f18782p = str;
    }

    /* renamed from: a */
    public AbstractC6946a mo27320a(List<Integer> list) {
        this.f18768b = list;
        return this;
    }

    /* renamed from: b */
    public void mo27327b(String str) {
        this.f18772f = str;
    }

    /* renamed from: c */
    public void mo27331c(int i) {
        this.f18781o = i;
    }

    /* renamed from: d */
    public void mo27335d(boolean z) {
        this.f18779m = z;
    }

    /* renamed from: e */
    public void mo27338e(boolean z) {
        this.f18783q = z;
    }

    /* renamed from: a */
    public AbstractC6946a mo27321a(Map<String, String> map) {
        this.f18771e.clear();
        if (map != null) {
            this.f18771e.putAll(map);
        }
        return this;
    }

    /* renamed from: b */
    public void mo27328b(boolean z) {
        this.f18776j = z;
    }

    /* renamed from: c */
    public void mo27332c(boolean z) {
        this.f18778l = z;
    }

    public AbstractC6946a(AbstractC6947b bVar) {
        this.f18767a = bVar;
        this.f18768b.addAll(bVar.f18788d);
        if (!this.f18768b.contains(-2)) {
            this.f18768b.add(-2);
        }
        this.f18780n = bVar.f18789e;
    }

    /* renamed from: a */
    public void mo27323a(long j) {
        this.f18784r = j;
    }

    /* renamed from: a */
    public void mo27324a(boolean z) {
        this.f18774h = z;
    }
}
