package com.bytedance.ee.bear.document.offline.offlinestorage;

import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.C6026d;

/* renamed from: com.bytedance.ee.bear.document.offline.offlinestorage.f */
public class C5968f {

    /* renamed from: a */
    private int f16718a;

    /* renamed from: b */
    private String f16719b;

    /* renamed from: c */
    private String f16720c;

    /* renamed from: d */
    private String f16721d;

    /* renamed from: e */
    private Long f16722e = Long.valueOf(System.currentTimeMillis());

    /* renamed from: f */
    private Long f16723f = Long.valueOf(System.currentTimeMillis());

    /* renamed from: g */
    private boolean f16724g = false;

    /* renamed from: h */
    private String f16725h;

    /* renamed from: i */
    private String f16726i;

    /* renamed from: j */
    private String f16727j;

    /* renamed from: k */
    private String f16728k;

    /* renamed from: l */
    private String f16729l;

    /* renamed from: m */
    private String f16730m;

    /* renamed from: n */
    private String f16731n;

    /* renamed from: o */
    private int f16732o;

    /* renamed from: p */
    private C6026d f16733p;

    /* renamed from: q */
    private int f16734q;

    /* renamed from: a */
    public String mo24124a() {
        return this.f16719b;
    }

    /* renamed from: b */
    public String mo24130b() {
        return this.f16726i;
    }

    /* renamed from: c */
    public String mo24134c() {
        return this.f16728k;
    }

    /* renamed from: d */
    public String mo24137d() {
        return this.f16720c;
    }

    /* renamed from: e */
    public Long mo24139e() {
        return this.f16722e;
    }

    /* renamed from: f */
    public Long mo24141f() {
        return this.f16723f;
    }

    /* renamed from: g */
    public String mo24143g() {
        return this.f16729l;
    }

    /* renamed from: h */
    public String mo24145h() {
        return this.f16730m;
    }

    /* renamed from: j */
    public String mo24149j() {
        return this.f16725h;
    }

    /* renamed from: k */
    public int mo24151k() {
        return this.f16732o;
    }

    /* renamed from: l */
    public C6026d mo24152l() {
        return this.f16733p;
    }

    /* renamed from: m */
    public String mo24153m() {
        return this.f16731n;
    }

    /* renamed from: n */
    public int mo24154n() {
        return this.f16718a;
    }

    /* renamed from: o */
    public String mo24155o() {
        return this.f16727j;
    }

    /* renamed from: q */
    public String mo24157q() {
        return this.f16721d;
    }

    /* renamed from: i */
    public boolean mo24148i() {
        return this.f16724g;
    }

    /* renamed from: p */
    public boolean mo24156p() {
        if (this.f16734q == 1) {
            return true;
        }
        return false;
    }

    public C5968f() {
    }

    public String toString() {
        return "ResourceData{id=" + this.f16718a + ", update_time=" + this.f16722e + ", access_time=" + this.f16723f + ", isNeedSync=" + this.f16724g + ", config='" + this.f16725h + '\'' + ", type='" + this.f16726i + '\'' + ", dataType='" + this.f16734q + '\'' + ", subblock_preload_status='" + this.f16732o + '\'' + '}';
    }

    /* renamed from: i */
    public void mo24147i(String str) {
        this.f16727j = str;
    }

    /* renamed from: a */
    public void mo24125a(int i) {
        this.f16732o = i;
    }

    /* renamed from: b */
    public void mo24131b(int i) {
        this.f16718a = i;
    }

    /* renamed from: c */
    public void mo24135c(int i) {
        this.f16734q = i;
    }

    /* renamed from: d */
    public void mo24138d(String str) {
        this.f16720c = str;
    }

    /* renamed from: e */
    public void mo24140e(String str) {
        this.f16729l = str;
    }

    /* renamed from: f */
    public void mo24142f(String str) {
        this.f16730m = str;
    }

    /* renamed from: g */
    public void mo24144g(String str) {
        this.f16725h = str;
    }

    /* renamed from: h */
    public void mo24146h(String str) {
        this.f16731n = str;
    }

    /* renamed from: j */
    public void mo24150j(String str) {
        this.f16721d = str;
    }

    /* renamed from: a */
    public void mo24126a(C6026d dVar) {
        this.f16733p = dVar;
    }

    /* renamed from: b */
    public void mo24132b(Long l) {
        this.f16723f = l;
    }

    /* renamed from: c */
    public void mo24136c(String str) {
        this.f16728k = str;
    }

    /* renamed from: a */
    public void mo24127a(Long l) {
        this.f16722e = l;
    }

    /* renamed from: b */
    public void mo24133b(String str) {
        this.f16726i = str;
    }

    /* renamed from: a */
    public void mo24128a(String str) {
        this.f16719b = str;
    }

    public C5968f(C5968f fVar) {
        this.f16718a = fVar.f16718a;
        this.f16719b = fVar.f16719b;
        this.f16720c = fVar.f16720c;
        this.f16721d = fVar.f16721d;
        this.f16722e = fVar.f16722e;
        this.f16723f = fVar.f16723f;
        this.f16724g = fVar.f16724g;
        this.f16725h = fVar.f16725h;
        this.f16726i = fVar.f16726i;
        this.f16727j = fVar.f16727j;
        this.f16728k = fVar.f16728k;
        this.f16729l = fVar.f16729l;
        this.f16730m = fVar.f16730m;
        this.f16731n = fVar.f16731n;
        this.f16734q = fVar.f16734q;
        this.f16732o = fVar.f16732o;
        this.f16733p = fVar.f16733p;
    }

    /* renamed from: a */
    public void mo24129a(boolean z) {
        this.f16724g = z;
    }

    public C5968f(String str, String str2) {
        this.f16719b = str;
        this.f16728k = str2;
    }
}
