package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14278a;
import com.bytedance.geckox.statistic.AbstractC14328a;
import com.bytedance.geckox.utils.C14350a;

public class GeckoGlobalConfig {

    /* renamed from: a */
    private final Context f37303a;

    /* renamed from: b */
    private final AbstractC14328a f37304b;

    /* renamed from: c */
    private final AbstractC14280c f37305c;

    /* renamed from: d */
    private final Long f37306d;

    /* renamed from: e */
    private final String f37307e;

    /* renamed from: f */
    private String f37308f;

    /* renamed from: g */
    private final String f37309g;

    /* renamed from: h */
    private final ENVType f37310h;

    /* renamed from: i */
    private final String f37311i;

    /* renamed from: j */
    private final AbstractC14188b f37312j;

    /* renamed from: com.bytedance.geckox.GeckoGlobalConfig$b */
    public interface AbstractC14188b {
        /* renamed from: a */
        Pair<String, String> mo52051a(boolean z);
    }

    public enum ENVType {
        BOE(1),
        DEV(1),
        PROD(2);
        
        private int val;

        public int getVal() {
            return this.val;
        }

        private ENVType(int i) {
            this.val = i;
        }
    }

    /* renamed from: a */
    public Context mo52033a() {
        return this.f37303a;
    }

    /* renamed from: b */
    public AbstractC14280c mo52034b() {
        return this.f37305c;
    }

    /* renamed from: c */
    public String mo52035c() {
        return this.f37309g;
    }

    /* renamed from: e */
    public String mo52037e() {
        return this.f37307e;
    }

    /* renamed from: f */
    public ENVType mo52038f() {
        return this.f37310h;
    }

    /* renamed from: g */
    public AbstractC14328a mo52039g() {
        return this.f37304b;
    }

    /* renamed from: h */
    public String mo52040h() {
        return this.f37308f;
    }

    /* renamed from: i */
    public String mo52041i() {
        return this.f37311i;
    }

    /* renamed from: j */
    public AbstractC14188b mo52042j() {
        return this.f37312j;
    }

    /* renamed from: d */
    public long mo52036d() {
        return this.f37306d.longValue();
    }

    /* renamed from: com.bytedance.geckox.GeckoGlobalConfig$a */
    public static class C14187a {

        /* renamed from: a */
        public AbstractC14280c f37313a;

        /* renamed from: b */
        public Context f37314b;

        /* renamed from: c */
        public AbstractC14328a f37315c;

        /* renamed from: d */
        public Long f37316d;

        /* renamed from: e */
        public String f37317e;

        /* renamed from: f */
        public String f37318f;

        /* renamed from: g */
        public String f37319g;

        /* renamed from: h */
        public ENVType f37320h;

        /* renamed from: i */
        public String f37321i;

        /* renamed from: j */
        public AbstractC14188b f37322j;

        /* renamed from: a */
        public GeckoGlobalConfig mo52048a() {
            return new GeckoGlobalConfig(this);
        }

        /* renamed from: a */
        public C14187a mo52045a(ENVType eNVType) {
            this.f37320h = eNVType;
            return this;
        }

        /* renamed from: b */
        public C14187a mo52049b(String str) {
            this.f37318f = str;
            return this;
        }

        /* renamed from: c */
        public C14187a mo52050c(String str) {
            this.f37319g = str;
            return this;
        }

        /* renamed from: a */
        public C14187a mo52044a(long j) {
            this.f37316d = Long.valueOf(j);
            return this;
        }

        public C14187a(Context context) {
            this.f37314b = context.getApplicationContext();
        }

        /* renamed from: a */
        public C14187a mo52046a(AbstractC14328a aVar) {
            this.f37315c = aVar;
            return this;
        }

        /* renamed from: a */
        public C14187a mo52047a(String str) {
            this.f37317e = str;
            return this;
        }
    }

    private GeckoGlobalConfig(C14187a aVar) {
        Context context = aVar.f37314b;
        this.f37303a = context;
        if (context != null) {
            this.f37306d = aVar.f37316d;
            if (TextUtils.isEmpty(aVar.f37317e)) {
                this.f37307e = C14350a.m57807a(context);
            } else {
                this.f37307e = aVar.f37317e;
            }
            this.f37308f = aVar.f37318f;
            String str = aVar.f37319g;
            this.f37309g = str;
            this.f37311i = aVar.f37321i;
            ENVType eNVType = aVar.f37320h;
            this.f37310h = eNVType;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("host is required");
            } else if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("appId is required");
            } else if (TextUtils.isEmpty(this.f37308f)) {
                throw new IllegalArgumentException("deviceId key is required");
            } else if (eNVType != null) {
                if (aVar.f37313a == null) {
                    this.f37305c = new C14278a();
                } else {
                    this.f37305c = aVar.f37313a;
                }
                this.f37304b = aVar.f37315c;
                this.f37312j = aVar.f37322j;
            } else {
                throw new IllegalArgumentException("env is required");
            }
        } else {
            throw new IllegalArgumentException("context is required");
        }
    }
}
