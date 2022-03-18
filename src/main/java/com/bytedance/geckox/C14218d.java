package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.p757a.p758a.C14194a;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14278a;
import com.bytedance.geckox.statistic.AbstractC14328a;
import com.bytedance.geckox.utils.C14350a;
import com.bytedance.geckox.utils.C14373o;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.geckox.d */
public class C14218d {

    /* renamed from: a */
    private final Context f37395a;

    /* renamed from: b */
    private final Executor f37396b;

    /* renamed from: c */
    private final Executor f37397c;

    /* renamed from: d */
    private final AbstractC14328a f37398d;

    /* renamed from: e */
    private AbstractC14280c f37399e;

    /* renamed from: f */
    private final List<String> f37400f;

    /* renamed from: g */
    private final List<String> f37401g;

    /* renamed from: h */
    private final C14194a f37402h;

    /* renamed from: i */
    private Long f37403i;

    /* renamed from: j */
    private final String f37404j;

    /* renamed from: k */
    private String f37405k;

    /* renamed from: l */
    private final String f37406l;

    /* renamed from: m */
    private final String f37407m;

    /* renamed from: n */
    private final String f37408n;

    /* renamed from: o */
    private final File f37409o;

    /* renamed from: p */
    private final boolean f37410p;

    /* renamed from: q */
    private final boolean f37411q;

    /* renamed from: r */
    private final boolean f37412r;

    /* renamed from: s */
    private final int f37413s;

    /* renamed from: t */
    private final AbstractC14221b f37414t;

    /* renamed from: com.bytedance.geckox.d$b */
    public interface AbstractC14221b {
        /* renamed from: a */
        boolean mo52168a();

        /* renamed from: b */
        String mo52169b();

        /* renamed from: c */
        Map<String, String> mo52170c();

        /* renamed from: d */
        String mo52171d();

        /* renamed from: e */
        String mo52172e();

        /* renamed from: f */
        String mo52173f();
    }

    /* renamed from: a */
    public Context mo52133a() {
        return this.f37395a;
    }

    /* renamed from: b */
    public C14194a mo52136b() {
        return this.f37402h;
    }

    /* renamed from: c */
    public boolean mo52137c() {
        return this.f37410p;
    }

    /* renamed from: d */
    public List<String> mo52138d() {
        return this.f37401g;
    }

    /* renamed from: e */
    public List<String> mo52139e() {
        return this.f37400f;
    }

    /* renamed from: g */
    public Executor mo52141g() {
        return this.f37396b;
    }

    /* renamed from: h */
    public Executor mo52142h() {
        return this.f37397c;
    }

    /* renamed from: i */
    public AbstractC14280c mo52143i() {
        return this.f37399e;
    }

    /* renamed from: j */
    public String mo52144j() {
        return this.f37406l;
    }

    /* renamed from: l */
    public String mo52146l() {
        return this.f37408n;
    }

    /* renamed from: m */
    public String mo52147m() {
        return this.f37407m;
    }

    /* renamed from: n */
    public File mo52148n() {
        return this.f37409o;
    }

    /* renamed from: o */
    public String mo52149o() {
        return this.f37404j;
    }

    /* renamed from: p */
    public String mo52150p() {
        return this.f37405k;
    }

    /* renamed from: q */
    public boolean mo52151q() {
        return this.f37411q;
    }

    /* renamed from: r */
    public boolean mo52152r() {
        return this.f37412r;
    }

    /* renamed from: s */
    public AbstractC14221b mo52153s() {
        return this.f37414t;
    }

    /* renamed from: k */
    public long mo52145k() {
        return this.f37403i.longValue();
    }

    /* renamed from: f */
    public String mo52140f() {
        return this.f37400f.get(0);
    }

    /* renamed from: com.bytedance.geckox.d$a */
    public static class C14220a {

        /* renamed from: a */
        public AbstractC14280c f37415a;

        /* renamed from: b */
        public List<String> f37416b;

        /* renamed from: c */
        public List<String> f37417c;

        /* renamed from: d */
        public Context f37418d;

        /* renamed from: e */
        public Executor f37419e;

        /* renamed from: f */
        public AbstractC14328a f37420f;

        /* renamed from: g */
        public boolean f37421g = true;

        /* renamed from: h */
        public C14194a f37422h;

        /* renamed from: i */
        public Long f37423i;

        /* renamed from: j */
        public String f37424j;

        /* renamed from: k */
        public String f37425k;

        /* renamed from: l */
        public String f37426l;

        /* renamed from: m */
        public File f37427m;

        /* renamed from: n */
        public String f37428n;

        /* renamed from: o */
        public String f37429o;

        /* renamed from: p */
        public boolean f37430p;

        /* renamed from: q */
        public boolean f37431q;

        /* renamed from: r */
        public int f37432r = 1;

        /* renamed from: s */
        public AbstractC14221b f37433s;

        /* renamed from: t */
        private Executor f37434t;

        /* renamed from: a */
        public C14218d mo52162a() {
            return new C14218d(this);
        }

        /* renamed from: a */
        public C14220a mo52155a(AbstractC14280c cVar) {
            this.f37415a = cVar;
            return this;
        }

        /* renamed from: b */
        public C14220a mo52163b(String str) {
            this.f37425k = str;
            return this;
        }

        /* renamed from: c */
        public C14220a mo52166c(String str) {
            this.f37426l = str;
            return this;
        }

        /* renamed from: d */
        public C14220a mo52167d(String str) {
            this.f37428n = str;
            return this;
        }

        /* renamed from: a */
        public C14220a mo52154a(long j) {
            this.f37423i = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public C14220a mo52164b(Executor executor) {
            this.f37419e = executor;
            return this;
        }

        public C14220a(Context context) {
            this.f37418d = context.getApplicationContext();
        }

        /* renamed from: a */
        public C14220a mo52156a(AbstractC14328a aVar) {
            this.f37420f = aVar;
            return this;
        }

        /* renamed from: b */
        public C14220a mo52165b(String... strArr) {
            if (strArr != null && strArr.length >= 1) {
                this.f37416b = Arrays.asList(strArr);
            }
            return this;
        }

        /* renamed from: a */
        public C14220a mo52157a(File file) {
            this.f37427m = file;
            return this;
        }

        /* renamed from: a */
        public C14220a mo52158a(String str) {
            this.f37424j = str;
            return this;
        }

        /* renamed from: a */
        public C14220a mo52159a(Executor executor) {
            this.f37434t = executor;
            return this;
        }

        /* renamed from: a */
        public C14220a mo52160a(boolean z) {
            this.f37421g = z;
            return this;
        }

        /* renamed from: a */
        public C14220a mo52161a(String... strArr) {
            if (strArr != null && strArr.length >= 1) {
                this.f37417c = Arrays.asList(strArr);
            }
            return this;
        }
    }

    /* renamed from: a */
    public void mo52134a(long j) {
        this.f37403i = Long.valueOf(j);
    }

    /* renamed from: a */
    public void mo52135a(AbstractC14280c cVar) {
        this.f37399e = cVar;
    }

    private C14218d(C14220a aVar) {
        Context context = aVar.f37418d;
        this.f37395a = context;
        if (context != null) {
            List<String> list = aVar.f37416b;
            this.f37400f = list;
            List<String> list2 = aVar.f37417c;
            this.f37401g = list2;
            this.f37402h = aVar.f37422h;
            this.f37403i = aVar.f37423i;
            if (TextUtils.isEmpty(aVar.f37424j)) {
                this.f37404j = C14350a.m57807a(context);
            } else {
                this.f37404j = aVar.f37424j;
            }
            this.f37405k = aVar.f37425k;
            this.f37407m = aVar.f37428n;
            this.f37408n = aVar.f37429o;
            if (aVar.f37427m == null) {
                this.f37409o = new File(context.getFilesDir(), "gecko_offline_res_x");
            } else {
                this.f37409o = aVar.f37427m;
            }
            String str = aVar.f37426l;
            this.f37406l = str;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("host is null");
            } else if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("accessKey is empty");
            } else if (list2 == null || list2.isEmpty()) {
                throw new IllegalArgumentException("local accessKey is empty");
            } else if (!list2.containsAll(list)) {
                throw new IllegalArgumentException("local accessKey must contain accessKey");
            } else if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("appId is null");
            } else if (!TextUtils.isEmpty(this.f37405k)) {
                this.f37396b = C14373o.m57855a().mo52493d();
                if (aVar.f37419e == null) {
                    this.f37397c = C14373o.m57855a().mo52492c();
                } else {
                    this.f37397c = aVar.f37419e;
                }
                if (aVar.f37415a == null) {
                    this.f37399e = new C14278a();
                } else {
                    this.f37399e = aVar.f37415a;
                }
                this.f37398d = aVar.f37420f;
                this.f37410p = aVar.f37421g;
                this.f37411q = aVar.f37430p;
                this.f37412r = aVar.f37431q;
                this.f37413s = aVar.f37432r;
                this.f37414t = aVar.f37433s;
            } else {
                throw new IllegalArgumentException("deviceId key empty");
            }
        } else {
            throw new IllegalArgumentException("context == null");
        }
    }
}
