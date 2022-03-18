package com.bytedance.ug.sdk.share.impl.p919c;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ug.sdk.share.api.entity.C20817b;
import com.bytedance.ug.sdk.share.api.entity.TokenInfoBean;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20797a;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20798b;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20799c;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20800d;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20801e;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20802f;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20803g;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20804h;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20805i;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20806a;
import com.bytedance.ug.sdk.share.api.p916c.AbstractC20808c;
import com.bytedance.ug.sdk.share.impl.network.p930b.RunnableC20869c;
import com.bytedance.ug.sdk.share.impl.p923g.C20834a;
import com.bytedance.ug.sdk.share.impl.p923g.C20839c;
import com.bytedance.ug.sdk.share.impl.p928j.C20851b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.share.impl.c.a */
public class C20826a {

    /* renamed from: a */
    private AbstractC20802f f50980a;

    /* renamed from: b */
    private AbstractC20798b f50981b;

    /* renamed from: c */
    private AbstractC20797a f50982c;

    /* renamed from: d */
    private AbstractC20801e f50983d;

    /* renamed from: e */
    private AbstractC20799c f50984e;

    /* renamed from: f */
    private AbstractC20805i f50985f;

    /* renamed from: g */
    private AbstractC20804h f50986g;

    /* renamed from: h */
    private AbstractC20803g f50987h;

    /* renamed from: i */
    private AbstractC20800d f50988i;

    /* renamed from: j */
    private boolean f50989j;

    /* renamed from: k */
    private boolean f50990k;

    /* renamed from: l */
    private boolean f50991l;

    /* renamed from: m */
    private boolean f50992m;

    /* renamed from: n */
    private boolean f50993n;

    /* renamed from: o */
    private boolean f50994o;

    /* renamed from: p */
    private boolean f50995p;

    /* renamed from: com.bytedance.ug.sdk.share.impl.c.a$1 */
    class C208271 {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ug.sdk.share.impl.c.a$a */
    public static class C20828a {

        /* renamed from: a */
        public static C20826a f50996a = new C20826a(null);
    }

    /* renamed from: a */
    public static C20826a m75837a() {
        return C20828a.f50996a;
    }

    /* renamed from: c */
    public boolean mo70299c() {
        return this.f50995p;
    }

    /* renamed from: k */
    public boolean mo70307k() {
        return this.f50993n;
    }

    /* renamed from: l */
    public boolean mo70308l() {
        return this.f50994o;
    }

    /* renamed from: a */
    public boolean mo70296a(AbstractC20808c cVar) {
        AbstractC20804h hVar = this.f50986g;
        if (hVar != null) {
            return hVar.mo70086a(cVar);
        }
        return false;
    }

    /* renamed from: a */
    public void mo70295a(boolean z, String str, String str2) {
        AbstractC20804h hVar = this.f50986g;
        if (hVar != null) {
            hVar.mo70084a(z, str, str2);
        }
    }

    private C20826a() {
        this.f50989j = true;
        this.f50990k = true;
        this.f50991l = true;
        this.f50992m = true;
    }

    /* renamed from: o */
    private AbstractC20800d m75841o() {
        AbstractC20800d a = C20839c.m75889a();
        if (a != null) {
            return a;
        }
        return this.f50988i;
    }

    /* renamed from: b */
    public String mo70297b() {
        AbstractC20802f fVar = this.f50980a;
        if (fVar != null) {
            return fVar.mo70080a();
        }
        return null;
    }

    /* renamed from: d */
    public String mo70300d() {
        AbstractC20797a aVar = this.f50982c;
        if (aVar != null) {
            return aVar.mo70069a();
        }
        return null;
    }

    /* renamed from: e */
    public String mo70301e() {
        AbstractC20797a aVar = this.f50982c;
        if (aVar != null) {
            return aVar.mo70070b();
        }
        return null;
    }

    /* renamed from: f */
    public String mo70302f() {
        Activity g = mo70303g();
        if (g != null) {
            return g.getPackageName();
        }
        return null;
    }

    /* renamed from: g */
    public Activity mo70303g() {
        AbstractC20801e eVar;
        Activity a = C20851b.m75907a();
        if (a != null || (eVar = this.f50983d) == null) {
            return a;
        }
        return eVar.mo70078a();
    }

    /* renamed from: h */
    public void mo70304h() {
        AbstractC20800d o = m75841o();
        if (o != null) {
            o.mo70077a();
        }
    }

    /* renamed from: i */
    public boolean mo70305i() {
        if (!this.f50989j || !m75840n()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo70306j() {
        if (!this.f50992m || !m75839m()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m75839m() {
        JSONObject c;
        AbstractC20797a aVar = this.f50982c;
        if (aVar == null || (c = aVar.mo70071c()) == null) {
            return true;
        }
        return c.optBoolean("enable_text_token", true);
    }

    /* renamed from: n */
    private boolean m75840n() {
        JSONObject c;
        AbstractC20797a aVar = this.f50982c;
        if (aVar == null || (c = aVar.mo70071c()) == null) {
            return true;
        }
        return c.optBoolean("enable_album_parse", true);
    }

    /* synthetic */ C20826a(C208271 r1) {
        this();
    }

    /* renamed from: a */
    public int mo70285a(Throwable th) {
        AbstractC20802f fVar = this.f50980a;
        if (fVar != null) {
            return fVar.mo70079a(th);
        }
        return -1;
    }

    /* renamed from: a */
    public SharedPreferences mo70286a(String str) {
        AbstractC20803g gVar = this.f50987h;
        if (gVar != null) {
            return gVar.mo70082a(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo70292a(Runnable runnable) {
        AbstractC20798b bVar = this.f50981b;
        if (bVar != null) {
            bVar.mo70072a(runnable);
        } else {
            RunnableC20869c.m75930a(runnable);
        }
    }

    /* renamed from: b */
    public boolean mo70298b(Activity activity, TokenInfoBean tokenInfoBean) {
        AbstractC20804h hVar = this.f50986g;
        if (hVar == null || !hVar.mo70085a(activity, tokenInfoBean)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private AbstractC20808c m75838c(Activity activity, TokenInfoBean tokenInfoBean) {
        ArrayList<AbstractC20806a> b = C20834a.m75876a().mo70311b();
        if (b == null || b.size() <= 0) {
            return null;
        }
        Iterator<AbstractC20806a> it = b.iterator();
        while (it.hasNext()) {
            AbstractC20806a next = it.next();
            if (next.mo70089a(tokenInfoBean)) {
                return next.mo70088a(activity);
            }
        }
        return null;
    }

    /* renamed from: a */
    public AbstractC20808c mo70287a(Activity activity, TokenInfoBean tokenInfoBean) {
        AbstractC20808c a;
        AbstractC20808c c = m75838c(activity, tokenInfoBean);
        if (c != null) {
            return c;
        }
        AbstractC20805i iVar = this.f50985f;
        if (iVar != null && (a = iVar.mo70087a(activity, tokenInfoBean)) != null) {
            return a;
        }
        AbstractC20805i b = C20839c.m75891b();
        if (b != null) {
            return b.mo70087a(activity, tokenInfoBean);
        }
        return null;
    }

    /* renamed from: a */
    public String mo70288a(int i, String str) throws Exception {
        AbstractC20802f fVar = this.f50980a;
        if (fVar != null) {
            return fVar.mo70081a(i, str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo70291a(AbstractC20808c cVar, TokenInfoBean tokenInfoBean) {
        AbstractC20804h hVar = this.f50986g;
        if (hVar != null) {
            hVar.mo70083a(cVar, tokenInfoBean);
        }
    }

    /* renamed from: a */
    public void mo70293a(String str, C20817b bVar) {
        AbstractC20799c cVar = this.f50984e;
        if (cVar != null) {
            cVar.mo70075a(str, bVar);
        }
    }

    /* renamed from: a */
    public void mo70294a(String str, JSONObject jSONObject) {
        AbstractC20799c cVar = this.f50984e;
        if (cVar != null) {
            cVar.mo70076a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public void mo70289a(int i, String str, String str2) {
        AbstractC20799c cVar = this.f50984e;
        if (cVar != null) {
            cVar.mo70073a(i, str, str2);
        }
    }

    /* renamed from: a */
    public void mo70290a(Context context, String str, JSONObject jSONObject, List<String> list, List<String> list2) {
        AbstractC20799c cVar = this.f50984e;
        if (cVar != null) {
            cVar.mo70074a(context, str, jSONObject, list, list2);
        }
    }
}
