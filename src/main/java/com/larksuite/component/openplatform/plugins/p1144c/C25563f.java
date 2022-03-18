package com.larksuite.component.openplatform.plugins.p1144c;

import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;

/* renamed from: com.larksuite.component.openplatform.plugins.c.f */
public class C25563f {

    /* renamed from: a */
    private final AbstractC25561d f62186a;

    /* renamed from: b */
    private final JSONObject f62187b;

    /* renamed from: c */
    private final AbstractC25904o f62188c;

    /* renamed from: d */
    private final String f62189d;

    /* renamed from: e */
    private final AbstractC25566b f62190e;

    /* renamed from: f */
    private final PopupWindow f62191f;

    /* renamed from: g */
    private final FrameLayout f62192g;

    /* renamed from: com.larksuite.component.openplatform.plugins.c.f$b */
    public interface AbstractC25566b {
        void ready();
    }

    /* renamed from: a */
    public FrameLayout mo88706a() {
        return this.f62192g;
    }

    /* renamed from: b */
    public PopupWindow mo88707b() {
        return this.f62191f;
    }

    /* renamed from: c */
    public AbstractC25561d mo88708c() {
        return this.f62186a;
    }

    /* renamed from: d */
    public JSONObject mo88709d() {
        return this.f62187b;
    }

    /* renamed from: e */
    public AbstractC25904o mo88710e() {
        return this.f62188c;
    }

    /* renamed from: f */
    public String mo88711f() {
        return this.f62189d;
    }

    /* renamed from: g */
    public AbstractC25566b mo88712g() {
        return this.f62190e;
    }

    /* renamed from: com.larksuite.component.openplatform.plugins.c.f$a */
    public static class C25565a {

        /* renamed from: a */
        public AbstractC25561d f62193a;

        /* renamed from: b */
        public JSONObject f62194b;

        /* renamed from: c */
        public AbstractC25904o f62195c;

        /* renamed from: d */
        public String f62196d;

        /* renamed from: e */
        public AbstractC25566b f62197e;

        /* renamed from: f */
        public PopupWindow f62198f;

        /* renamed from: g */
        public FrameLayout f62199g;

        /* renamed from: a */
        public C25563f mo88720a() {
            return new C25563f(this);
        }

        /* renamed from: a */
        public C25565a mo88713a(FrameLayout frameLayout) {
            this.f62199g = frameLayout;
            return this;
        }

        /* renamed from: a */
        public C25565a mo88714a(PopupWindow popupWindow) {
            this.f62198f = popupWindow;
            return this;
        }

        /* renamed from: a */
        public C25565a mo88715a(JSONObject jSONObject) {
            this.f62194b = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C25565a mo88716a(AbstractC25561d dVar) {
            this.f62193a = dVar;
            return this;
        }

        /* renamed from: a */
        public C25565a mo88717a(AbstractC25566b bVar) {
            this.f62197e = bVar;
            return this;
        }

        /* renamed from: a */
        public C25565a mo88718a(AbstractC25904o oVar) {
            this.f62195c = oVar;
            return this;
        }

        /* renamed from: a */
        public C25565a mo88719a(String str) {
            this.f62196d = str;
            return this;
        }
    }

    private C25563f(C25565a aVar) {
        this.f62186a = aVar.f62193a;
        this.f62187b = aVar.f62194b;
        this.f62188c = aVar.f62195c;
        this.f62189d = aVar.f62196d;
        this.f62190e = aVar.f62197e;
        this.f62191f = aVar.f62198f;
        this.f62192g = aVar.f62199g;
    }
}
