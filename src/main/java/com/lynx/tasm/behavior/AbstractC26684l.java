package com.lynx.tasm.behavior;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.jsbridge.C26507b;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.C26888f;
import com.lynx.tasm.C26906i;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.fontface.FontFace;
import com.lynx.tasm.utils.C26946c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.l */
public abstract class AbstractC26684l extends ContextWrapper implements AbstractC26672f {

    /* renamed from: a */
    private LayoutInflater f66013a;

    /* renamed from: b */
    private AbstractC26674h f66014b;

    /* renamed from: c */
    private JavaOnlyMap f66015c;

    /* renamed from: d */
    private ReadableMap f66016d;

    /* renamed from: e */
    private EventEmitter f66017e;

    /* renamed from: f */
    private C26737t f66018f;

    /* renamed from: g */
    private C26888f f66019g;

    /* renamed from: h */
    private WeakReference<JSProxy> f66020h;

    /* renamed from: i */
    private UIBody f66021i;

    /* renamed from: j */
    private Map<String, FontFace> f66022j;

    /* renamed from: k */
    private WeakReference<C26690o> f66023k;

    /* renamed from: l */
    private WeakReference<C26689n> f66024l;

    /* renamed from: m */
    private String f66025m;

    /* renamed from: n */
    private AbstractC26911n f66026n;

    /* renamed from: o */
    private WeakReference<Context> f66027o;

    /* renamed from: p */
    private WeakReference<LynxView> f66028p;

    /* renamed from: q */
    private WeakReference<C26694q> f66029q;

    /* renamed from: r */
    private DisplayMetrics f66030r;

    /* renamed from: s */
    private boolean f66031s;

    @Override // com.lynx.tasm.behavior.AbstractC26672f
    /* renamed from: a */
    public abstract void mo94207a(Exception exc);

    /* renamed from: b */
    public DisplayMetrics mo94672b() {
        return this.f66030r;
    }

    /* renamed from: c */
    public AbstractC26674h mo94677c() {
        return this.f66014b;
    }

    /* renamed from: d */
    public AbstractC26911n mo94678d() {
        return this.f66026n;
    }

    /* renamed from: g */
    public C26737t mo94684g() {
        return this.f66018f;
    }

    /* renamed from: i */
    public EventEmitter mo94687i() {
        return this.f66017e;
    }

    /* renamed from: j */
    public C26888f mo94688j() {
        return this.f66019g;
    }

    /* renamed from: m */
    public String mo94691m() {
        return this.f66025m;
    }

    /* renamed from: n */
    public UIBody mo94692n() {
        return this.f66021i;
    }

    /* renamed from: a */
    public boolean mo94671a() {
        return this.f66031s;
    }

    /* renamed from: a */
    public void mo94668a(AbstractC26911n nVar) {
        this.f66026n = nVar;
    }

    /* renamed from: a */
    public void mo94669a(String str) {
        AbstractC26911n nVar = this.f66026n;
        if (nVar != null) {
            nVar.mo11459a(new C26906i(str, 301));
        }
    }

    /* renamed from: a */
    public void mo94663a(C26737t tVar) {
        this.f66018f = tVar;
    }

    /* renamed from: a */
    public void mo94664a(LynxBaseUI lynxBaseUI) {
        C26737t tVar = this.f66018f;
        if (tVar != null) {
            tVar.mo94913a(lynxBaseUI);
        }
    }

    /* renamed from: a */
    public void mo94667a(C26888f fVar) {
        this.f66019g = fVar;
    }

    /* renamed from: a */
    public void mo94666a(JSProxy jSProxy) {
        this.f66020h = new WeakReference<>(jSProxy);
    }

    /* renamed from: a */
    public void mo94670a(String str, JavaOnlyArray javaOnlyArray) {
        C26507b b = mo94673b("GlobalEventEmitter");
        if (b != null) {
            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
            javaOnlyArray2.pushString(str);
            javaOnlyArray2.pushArray(javaOnlyArray);
            if (b != null) {
                b.mo93988a("emit", javaOnlyArray2);
            } else {
                LLog.m96429e(LynxKitALogDelegate.f38587a, "sendGlobalEvent error, can't get GlobalEventEmitter");
            }
        }
    }

    /* renamed from: a */
    public void mo94665a(UIBody uIBody) {
        this.f66021i = uIBody;
    }

    /* renamed from: a */
    public void mo94662a(C26694q qVar) {
        this.f66029q = new WeakReference<>(qVar);
    }

    /* renamed from: h */
    public void mo94686h() {
        C26737t tVar = this.f66018f;
        if (tVar != null) {
            tVar.mo94912a();
        }
    }

    /* renamed from: e */
    public Context mo94680e() {
        return this.f66027o.get();
    }

    /* renamed from: f */
    public LynxView mo94682f() {
        return this.f66028p.get();
    }

    /* renamed from: k */
    public C26689n mo94689k() {
        return this.f66024l.get();
    }

    /* renamed from: l */
    public Long mo94690l() {
        JSProxy jSProxy = this.f66020h.get();
        if (jSProxy != null) {
            return Long.valueOf(jSProxy.mo95660a());
        }
        return null;
    }

    /* renamed from: a */
    public void mo94657a(EventEmitter eventEmitter) {
        this.f66017e = eventEmitter;
    }

    /* renamed from: a */
    public void mo94658a(LynxView lynxView) {
        this.f66028p = new WeakReference<>(lynxView);
    }

    /* renamed from: b */
    public void mo94675b(ReadableMap readableMap) {
        this.f66016d = readableMap;
    }

    /* renamed from: a */
    public LynxBaseUI mo94652a(int i) {
        C26690o oVar = this.f66023k.get();
        if (oVar != null) {
            return oVar.mo94708a(i);
        }
        return null;
    }

    /* renamed from: b */
    public C26507b mo94673b(String str) {
        JSProxy jSProxy;
        WeakReference<JSProxy> weakReference = this.f66020h;
        if (weakReference == null || (jSProxy = weakReference.get()) == null) {
            return null;
        }
        return jSProxy.mo95661a(str);
    }

    /* renamed from: c */
    public ReadableMap mo94676c(String str) {
        JavaOnlyMap javaOnlyMap = this.f66015c;
        if (javaOnlyMap != null && javaOnlyMap.hasKey(str)) {
            return this.f66015c.getMap(str);
        }
        return null;
    }

    /* renamed from: d */
    public Map mo94679d(String str) {
        ReadableMap readableMap;
        ReadableMap readableMap2 = this.f66016d;
        if (readableMap2 == null) {
            return null;
        }
        if (readableMap2.hasKey(str)) {
            readableMap = this.f66016d.getMap(str);
        } else {
            readableMap = null;
        }
        if (readableMap != null) {
            return readableMap.toArrayMap();
        }
        return null;
    }

    /* renamed from: f */
    public void mo94683f(String str) {
        LLog.m96429e("LynxContext", "setTemplateUrl: " + str);
        this.f66025m = str;
    }

    /* renamed from: b */
    public ShadowNode mo94674b(int i) {
        C26694q qVar = this.f66029q.get();
        if (qVar != null) {
            return qVar.mo94766a(i);
        }
        return null;
    }

    /* renamed from: e */
    public FontFace mo94681e(String str) {
        String a = C26946c.m97910a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        synchronized (C26946c.class) {
            if (this.f66022j == null) {
                this.f66022j = new HashMap();
            }
            FontFace fontFace = this.f66022j.get(a);
            if (fontFace != null) {
                return fontFace;
            }
            FontFace a2 = C26946c.m97909a(this, a);
            if (a2 != null) {
                this.f66022j.put(a, a2);
            }
            return a2;
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f66013a == null) {
            this.f66013a = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f66013a;
    }

    /* renamed from: a */
    public void mo94656a(ReadableMap readableMap) {
        if (this.f66015c == null) {
            this.f66015c = new JavaOnlyMap();
        }
        this.f66015c.merge(readableMap);
    }

    /* renamed from: a */
    public void mo94659a(AbstractC26674h hVar) {
        this.f66014b = hVar;
    }

    /* renamed from: a */
    public void mo94660a(C26689n nVar) {
        this.f66024l = new WeakReference<>(nVar);
    }

    /* renamed from: a */
    public void mo94661a(C26690o oVar) {
        this.f66023k = new WeakReference<>(oVar);
    }

    /* renamed from: a */
    public void mo94654a(int i, int i2) {
        this.f66030r.widthPixels = i;
        this.f66030r.heightPixels = i2;
    }

    public AbstractC26684l(Context context, DisplayMetrics displayMetrics) {
        super(context);
        this.f66027o = new WeakReference<>(context);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.f66030r = displayMetrics2;
        displayMetrics2.setTo(displayMetrics);
    }

    /* renamed from: a */
    public LynxBaseUI mo94653a(String str, LynxBaseUI lynxBaseUI) {
        C26690o oVar = this.f66023k.get();
        if (oVar != null) {
            return oVar.mo94712a(str, lynxBaseUI);
        }
        return null;
    }

    /* renamed from: a */
    public void mo94655a(int i, ReadableArray readableArray, String str, ReadableMap readableMap, Callback callback) {
        C26690o oVar = this.f66023k.get();
        if (oVar != null) {
            oVar.mo94722a(i, readableArray, str, readableMap, callback);
            LLog.m96425c("UIContext", "invokeUIMethod finish" + str + " callback: " + callback);
            return;
        }
        LLog.m96429e("UIContext", "invokeUIMethod owner is null");
    }
}
