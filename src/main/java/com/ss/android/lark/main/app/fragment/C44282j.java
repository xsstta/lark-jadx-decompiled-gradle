package com.ss.android.lark.main.app.fragment;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.C0517d;
import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.C44331k;
import com.ss.android.lark.maincore.AbstractC44552i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.main.app.fragment.j */
public class C44282j {

    /* renamed from: a */
    public Context f112294a;

    /* renamed from: b */
    public C44331k f112295b;

    /* renamed from: c */
    public AbstractC44283a f112296c;

    /* renamed from: d */
    public int f112297d;

    /* renamed from: e */
    private final C44284b f112298e = new C44284b(13);

    /* renamed from: com.ss.android.lark.main.app.fragment.j$a */
    public interface AbstractC44283a {

        /* renamed from: com.ss.android.lark.main.app.fragment.j$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC44283a aVar, String str, int i) {
            }
        }

        /* renamed from: a */
        void mo157341a(String str, int i);

        /* renamed from: a */
        void mo157342a(List<String> list, int i);
    }

    /* renamed from: a */
    public void mo157364a() {
        this.f112298e.mo157371c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.fragment.j$b */
    public class C44284b extends C0517d<String, AbstractC44552i.AbstractC44555c> {

        /* renamed from: b */
        private String f112300b;

        /* renamed from: c */
        private JSONObject f112301c;

        /* renamed from: d */
        private List<String> f112302d = new ArrayList();

        /* renamed from: b */
        public void mo157370b() {
            this.f112300b = C44282j.this.f112295b.mo157465e();
            if (C44282j.this.f112296c != null) {
                C44282j.this.f112296c.mo157341a(this.f112300b, C44282j.this.f112297d);
            }
        }

        /* renamed from: c */
        public void mo157371c() {
            if (this.f112302d.size() > 0 && C44282j.this.f112296c != null) {
                C44282j.this.f112296c.mo157342a(this.f112302d, C44282j.this.f112297d);
            }
            JSONObject jSONObject = this.f112301c;
            if (jSONObject != null) {
                ApmAgent.monitorEvent("main_trim_tab", jSONObject, null, null);
            }
            this.f112301c = null;
            this.f112302d.clear();
        }

        public C44284b(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo2978a(boolean z, String str, AbstractC44552i.AbstractC44555c cVar, AbstractC44552i.AbstractC44555c cVar2) {
            super.mo2978a(z, (Object) str, (Object) cVar, (Object) cVar2);
            if (z && cVar != null && !TextUtils.isEmpty(this.f112300b)) {
                if (this.f112300b.equals(str)) {
                    if (C26284k.m95186b(C44282j.this.f112294a)) {
                        throw new RuntimeException("ERROR: Trimming current tab!");
                    }
                } else if (C44282j.this.f112295b.mo157463d(str)) {
                    Log.m165389i("TabLowMemoryRecycler", "onTrimMemory " + str);
                    C44282j.this.f112295b.mo157459b(str);
                    cVar.mo103434s();
                    this.f112302d.add(str);
                    if (this.f112301c == null) {
                        this.f112301c = new JSONObject();
                    }
                    try {
                        this.f112301c.put(str, 1);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo157366a(AbstractC44283a aVar) {
        this.f112296c = aVar;
    }

    /* renamed from: b */
    public void mo157368b(int i) {
        this.f112298e.mo2977a(i);
    }

    /* renamed from: a */
    public void mo157365a(int i) {
        this.f112297d = i;
        this.f112298e.mo157370b();
    }

    /* renamed from: a */
    public void mo157367a(AbstractC44552i.AbstractC44555c cVar) {
        if (!DesktopUtil.m144301a(this.f112294a)) {
            if (cVar instanceof AbstractC44552i) {
                this.f112298e.mo2975a(((AbstractC44552i) cVar).mo31311b(), cVar);
            }
        } else if (cVar instanceof AbstractC36553a) {
            this.f112298e.mo2975a(((AbstractC36553a) cVar).mo31311b(), cVar);
        }
    }

    public C44282j(Context context, C44331k kVar) {
        this.f112294a = context;
        this.f112295b = kVar;
    }
}
