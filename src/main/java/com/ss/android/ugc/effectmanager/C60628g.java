package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60562b;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60567g;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60568h;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60569i;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60571k;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60573m;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60574n;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60576p;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60577q;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60578r;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60580t;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.effectmanager.g */
public class C60628g {

    /* renamed from: a */
    private Map<String, AbstractC60567g> f151611a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<String, AbstractC60561a> f151612b = new ConcurrentHashMap();

    /* renamed from: c */
    private Map<String, AbstractC60569i> f151613c = new ConcurrentHashMap();

    /* renamed from: d */
    private Map<String, AbstractC60568h> f151614d;

    /* renamed from: e */
    private Map<String, AbstractC60570j> f151615e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, AbstractC60576p> f151616f = new ConcurrentHashMap();

    /* renamed from: g */
    private Map<String, AbstractC60571k> f151617g = new ConcurrentHashMap();

    /* renamed from: h */
    private Map<String, AbstractC60580t> f151618h = new ConcurrentHashMap();

    /* renamed from: i */
    private Map<String, AbstractC60577q> f151619i = new ConcurrentHashMap();

    /* renamed from: j */
    private Map<String, AbstractC60574n> f151620j;

    /* renamed from: k */
    private Map<String, AbstractC60562b> f151621k;

    /* renamed from: l */
    private Map<String, AbstractC60566f> f151622l;

    /* renamed from: m */
    private Map<String, AbstractC60573m> f151623m;

    /* renamed from: n */
    private Map<String, AbstractC60578r> f151624n = new ConcurrentHashMap();

    /* renamed from: o */
    private Map<String, Object> f151625o;

    /* renamed from: p */
    private Map<String, IEffectPlatformBaseListener> f151626p = new ConcurrentHashMap();

    /* renamed from: B */
    public void mo208021B(String str) {
        Map<String, AbstractC60574n> map = this.f151620j;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: D */
    public void mo208023D(String str) {
        Map<String, AbstractC60562b> map = this.f151621k;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: F */
    public void mo208025F(String str) {
        Map<String, IEffectPlatformBaseListener> map = this.f151626p;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: b */
    public void mo208030b(String str) {
        Map<String, AbstractC60573m> map = this.f151623m;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: d */
    public void mo208032d(String str) {
        Map<String, AbstractC60566f> map = this.f151622l;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: f */
    public void mo208034f(String str) {
        Map<String, AbstractC60568h> map = this.f151614d;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: h */
    public void mo208036h(String str) {
        Map<String, AbstractC60570j> map = this.f151615e;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: j */
    public void mo208038j(String str) {
        Map<String, AbstractC60567g> map = this.f151611a;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: l */
    public void mo208040l(String str) {
        Map<String, AbstractC60561a> map = this.f151612b;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: n */
    public void mo208042n(String str) {
        Map<String, AbstractC60578r> map = this.f151624n;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: p */
    public void mo208044p(String str) {
        Map<String, AbstractC60567g> map = this.f151611a;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: r */
    public void mo208046r(String str) {
        Map<String, Object> map = this.f151625o;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: t */
    public void mo208048t(String str) {
        Map<String, AbstractC60576p> map = this.f151616f;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: v */
    public void mo208050v(String str) {
        Map<String, AbstractC60571k> map = this.f151617g;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: A */
    public AbstractC60574n mo208020A(String str) {
        Map<String, AbstractC60574n> map = this.f151620j;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: C */
    public AbstractC60562b mo208022C(String str) {
        Map<String, AbstractC60562b> map = this.f151621k;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: E */
    public <T> IEffectPlatformBaseListener<T> mo208024E(String str) {
        Map<String, IEffectPlatformBaseListener> map = this.f151626p;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: a */
    public AbstractC60573m mo208026a(String str) {
        Map<String, AbstractC60573m> map = this.f151623m;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: c */
    public AbstractC60566f mo208031c(String str) {
        Map<String, AbstractC60566f> map = this.f151622l;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: e */
    public AbstractC60568h mo208033e(String str) {
        Map<String, AbstractC60568h> map = this.f151614d;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: g */
    public AbstractC60570j mo208035g(String str) {
        Map<String, AbstractC60570j> map = this.f151615e;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: i */
    public AbstractC60569i mo208037i(String str) {
        Map<String, AbstractC60569i> map = this.f151613c;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: k */
    public AbstractC60561a mo208039k(String str) {
        Map<String, AbstractC60561a> map = this.f151612b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: m */
    public AbstractC60578r mo208041m(String str) {
        Map<String, AbstractC60578r> map = this.f151624n;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: o */
    public AbstractC60567g mo208043o(String str) {
        Map<String, AbstractC60567g> map = this.f151611a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: q */
    public Object mo208045q(String str) {
        Map<String, Object> map = this.f151625o;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: s */
    public AbstractC60576p mo208047s(String str) {
        Map<String, AbstractC60576p> map = this.f151616f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: u */
    public AbstractC60571k mo208049u(String str) {
        Map<String, AbstractC60571k> map = this.f151617g;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: w */
    public AbstractC60577q mo208051w(String str) {
        Map<String, AbstractC60577q> map = this.f151619i;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: x */
    public void mo208052x(String str) {
        Map<String, AbstractC60577q> map = this.f151619i;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: y */
    public AbstractC60580t mo208053y(String str) {
        Map<String, AbstractC60580t> map = this.f151618h;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: z */
    public void mo208054z(String str) {
        Map<String, AbstractC60580t> map = this.f151618h;
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: a */
    public void mo208027a(String str, AbstractC60561a aVar) {
        if (aVar != null) {
            if (this.f151612b == null) {
                this.f151612b = new ConcurrentHashMap();
            }
            this.f151612b.put(str, aVar);
        }
    }

    /* renamed from: a */
    public void mo208028a(String str, AbstractC60566f fVar) {
        if (fVar != null) {
            if (this.f151622l == null) {
                this.f151622l = new ConcurrentHashMap();
            }
            this.f151622l.put(str, fVar);
        }
    }

    /* renamed from: a */
    public void mo208029a(String str, AbstractC60570j jVar) {
        if (jVar != null) {
            if (this.f151615e == null) {
                this.f151615e = new ConcurrentHashMap();
            }
            this.f151615e.put(str, jVar);
        }
    }
}
