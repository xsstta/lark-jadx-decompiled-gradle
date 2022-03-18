package com.bytedance.ee.bear.document.selection;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.view.DecorateWebViewV2;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13611g;
import com.bytedance.ee.util.p701d.C13614b;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.lynx.webview.internal.C20011y;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.C26326z;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.bytedance.ee.bear.document.selection.e */
public abstract class AbstractView$OnTouchListenerC6130e<V extends View> implements View.OnTouchListener, DecorateWebViewV2.AbstractC4961a, AbstractC10549e {

    /* renamed from: A */
    private boolean f17041A;

    /* renamed from: B */
    private Runnable f17042B = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$BPq_EJacONyFrY7KN3Z6SUYYtrA */

        public final void run() {
            AbstractView$OnTouchListenerC6130e.this.mo24734l();
        }
    };

    /* renamed from: a */
    protected DocBridgeWebViewV2 f17043a;

    /* renamed from: b */
    protected int f17044b;

    /* renamed from: c */
    protected ActionMode f17045c;

    /* renamed from: d */
    protected ActionMode.Callback f17046d;

    /* renamed from: e */
    public ActionMode.Callback f17047e;

    /* renamed from: f */
    public ValueAnimator f17048f;

    /* renamed from: g */
    public List<ContextMenuItem> f17049g = new ArrayList();

    /* renamed from: h */
    public LinkedHashMap<String, String> f17050h = new LinkedHashMap<>();

    /* renamed from: i */
    public LinkedHashMap<String, String> f17051i = new LinkedHashMap<>();

    /* renamed from: j */
    protected Rect f17052j = new Rect();

    /* renamed from: k */
    public AbstractC5233x f17053k;

    /* renamed from: l */
    public boolean f17054l;

    /* renamed from: m */
    public boolean f17055m;

    /* renamed from: n */
    protected boolean f17056n;

    /* renamed from: o */
    public boolean f17057o = false;

    /* renamed from: p */
    protected int[] f17058p = new int[2];

    /* renamed from: q */
    protected List<V> f17059q = new ArrayList();

    /* renamed from: r */
    protected List<V> f17060r = new ArrayList();

    /* renamed from: s */
    protected boolean f17061s = true;

    /* renamed from: t */
    private float f17062t = 0.13f;

    /* renamed from: u */
    private float f17063u = 0.87f;

    /* renamed from: v */
    private GestureDetector f17064v;

    /* renamed from: w */
    private boolean f17065w;

    /* renamed from: x */
    private boolean f17066x;

    /* renamed from: y */
    private int f17067y;

    /* renamed from: z */
    private boolean f17068z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.document.selection.e$b */
    public interface AbstractC6134b {
        /* renamed from: a */
        ActionMode.Callback mo24751a(ActionMode.Callback callback);

        /* renamed from: a */
        void mo24752a(LinkedHashMap<String, String> linkedHashMap);

        /* renamed from: a */
        boolean mo24753a();
    }

    /* renamed from: b */
    private String m24715b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "touchend" : "touchmove" : "touchend" : "touchstart";
    }

    /* renamed from: j */
    public void mo24732j() {
        this.f17061s = false;
    }

    /* renamed from: k */
    public void mo24733k() {
        this.f17061s = true;
    }

    /* renamed from: l */
    public abstract void mo24734l();

    /* renamed from: m */
    public abstract boolean mo24735m();

    /* renamed from: n */
    public abstract void mo24736n();

    /* renamed from: o */
    public abstract boolean mo24737o();

    /* renamed from: p */
    public abstract ActionMode mo24740p();

    /* renamed from: a */
    public void mo24719a(DocBridgeWebViewV2 docBridgeWebViewV2) {
        this.f17043a = docBridgeWebViewV2;
        this.f17041A = C4211a.m17514a().mo16536a("spacekit.mobile.force_show_selection_enable", true);
        C13479a.m54764b("SelectionNewBase", "FG enableForceCallActionMode = " + this.f17041A);
        this.f17064v = new GestureDetector(mo24731i(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.C61311 */

            public void onLongPress(MotionEvent motionEvent) {
                C13479a.m54772d("SelectionNewBase", "onLongPress");
                AbstractView$OnTouchListenerC6130e.this.mo24733k();
                AbstractView$OnTouchListenerC6130e.this.mo24717a(motionEvent.getX(), motionEvent.getY());
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                C13479a.m54772d("SelectionNewBase", "onSingleTapUp");
                if (!AbstractView$OnTouchListenerC6130e.this.f17054l && AbstractView$OnTouchListenerC6130e.this.f17055m) {
                    C13479a.m54764b("SelectionNewBase", "onSingleTapUp onClearSelection");
                    AbstractView$OnTouchListenerC6130e.this.mo24730h();
                    AbstractView$OnTouchListenerC6130e.this.mo24728f();
                    return false;
                } else if (AbstractView$OnTouchListenerC6130e.this.f17052j.isEmpty()) {
                    return false;
                } else {
                    C13479a.m54764b("SelectionNewBase", "onSingleTapUp finishActionMode");
                    AbstractView$OnTouchListenerC6130e.this.mo24726d();
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public void mo24715a() {
        C13742g.m55710c(this.f17042B);
        C13742g.m55706a(this.f17042B, 100);
    }

    /* renamed from: a */
    public void mo24721a(boolean z) {
        this.f17057o = z;
    }

    /* renamed from: a */
    public void mo24720a(String str, int i) {
        ContextMenuItem contextMenuItem;
        C13479a.m54764b("SelectionNewBase", "jsOnActionModeMenuItemClick:" + str);
        Iterator<ContextMenuItem> it = this.f17049g.iterator();
        while (true) {
            if (!it.hasNext()) {
                contextMenuItem = null;
                break;
            }
            contextMenuItem = it.next();
            if (str.equals(contextMenuItem.id)) {
                break;
            }
        }
        String format = String.format(Locale.US, "javascript:window.lark.biz.navigation.onContextMenuClick", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) str);
        if (contextMenuItem != null) {
            jSONObject.put("text", (Object) contextMenuItem.text);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, contextMenuItem.data);
            m24718b(contextMenuItem.id, i);
        }
        m24712a(format, jSONObject);
    }

    /* renamed from: a */
    public void mo24717a(float f, float f2) {
        this.f17052j.setEmpty();
        this.f17051i.clear();
        String format = String.format(Locale.US, "javascript:window.lark.biz.selection.sheetLongPress", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) Float.valueOf(m24706a((int) f)));
        jSONObject.put("y", (Object) Float.valueOf(m24706a((int) f2)));
        m24712a(format, jSONObject);
    }

    /* renamed from: a */
    public void mo24718a(MotionEvent motionEvent, boolean z) {
        int action = motionEvent.getAction();
        this.f17043a.getLocationInWindow(this.f17058p);
        m24710a(motionEvent.getRawX(), motionEvent.getRawY() - ((float) this.f17058p[1]), z, action);
    }

    /* renamed from: q */
    private void mo24755q() {
        this.f17068z = false;
        mo24729g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Context mo24731i() {
        return this.f17043a.getContext();
    }

    /* renamed from: r */
    private void m24723r() {
        ValueAnimator valueAnimator = this.f17048f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17048f = null;
        }
    }

    /* renamed from: h */
    public void mo24730h() {
        C13479a.m54764b("SelectionNewBase", "jsClearSelectionExcludeCursor");
        m24712a("javascript:window.lark.biz.selection.clearSelectionExcludeCursor", (JSONObject) null);
    }

    @JavascriptInterface
    public void closeActionMode() {
        C13479a.m54764b("SelectionNewBase", "closeActionMode");
        mo24726d();
        this.f17051i.clear();
        this.f17052j.setEmpty();
    }

    /* renamed from: d */
    public void mo24726d() {
        if (this.f17045c != null) {
            C13479a.m54764b("SelectionNewBase", "finishActionMode");
            this.f17045c.finish();
            this.f17045c = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo24728f() {
        C13479a.m54764b("SelectionNewBase", "onClearSelection");
        this.f17056n = false;
        closeActionMode();
        m24723r();
    }

    /* renamed from: s */
    private void m24724s() {
        if (this.f17041A && !C20011y.m73013k() && C13611g.m55252a(mo24731i()) >= 84) {
            C13479a.m54764b("SelectionNewBase", "force call #startActionMode when using system webView (ChromeVersion ≥ 84)");
            m24713a("javascript:window.lark.biz.selection.getCursorBounds", (JSONObject) null, new ValueCallback() {
                /* class com.bytedance.ee.bear.document.selection.$$Lambda$e$5Fgfo17CDo8F6JXtA3b93Bod1B8 */

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    AbstractView$OnTouchListenerC6130e.this.m24719c((AbstractView$OnTouchListenerC6130e) ((String) obj));
                }
            });
        }
    }

    /* renamed from: g */
    public void mo24729g() {
        C13479a.m54764b("SelectionNewBase", "jsGetActionModeMenu " + this.f17051i);
        m24713a("javascript:window.lark.biz.navigation.requestCustomContextMenu", (JSONObject) null, new ValueCallback() {
            /* class com.bytedance.ee.bear.document.selection.$$Lambda$e$X2ysBh4grzphT_uQStRgcCGFhNY */

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                AbstractView$OnTouchListenerC6130e.this.m24721d((String) obj);
            }
        });
    }

    /* renamed from: e */
    public void mo24727e() {
        C13479a.m54764b("SelectionNewBase", "onUpdatedSelection " + this.f17068z + " actionMode " + this.f17045c);
        this.f17067y = 0;
        m24723r();
        this.f17043a.setEnableOverScrollBy(true);
        mo24715a();
        if (this.f17045c != null && ((AbstractC6134b) this.f17046d).mo24753a()) {
            C13479a.m54764b("SelectionNewBase", "onUpdatedSelection actionMode.invalidate actionMode " + this.f17045c);
            this.f17045c.invalidate();
        }
        if (this.f17068z) {
            mo24724c();
            this.f17068z = false;
        }
    }

    /* renamed from: b */
    public void mo24722b() {
        C13479a.m54764b("SelectionNewBase", "detach");
        this.f17043a.setEnableOverScrollBy(true);
        closeActionMode();
        m24723r();
        mo24736n();
    }

    /* renamed from: c */
    public void mo24724c() {
        mo24726d();
        this.f17045c = mo24740p();
        HashMap hashMap = new HashMap();
        hashMap.put("enable_intent_menu_item", Boolean.valueOf(this.f17057o));
        this.f17053k.mo21079a("start_action_mode", hashMap);
    }

    /* renamed from: com.bytedance.ee.bear.document.selection.e$a */
    public class C6133a {

        /* renamed from: b */
        private LinkedHashMap<String, String> f17072b = new LinkedHashMap<>();

        /* renamed from: c */
        private final C6126c f17073c;

        /* renamed from: a */
        public boolean mo24747a() {
            int i;
            if (!(AbstractView$OnTouchListenerC6130e.this.f17045c == null || AbstractView$OnTouchListenerC6130e.this.f17045c.getMenu() == null)) {
                Menu menu = AbstractView$OnTouchListenerC6130e.this.f17045c.getMenu();
                if (m24750a(menu)) {
                    C13479a.m54764b("SelectionNewBase", "need update menu");
                    menu.removeGroup(0);
                    menu.removeGroup(1);
                    if (this.f17072b.containsKey("OPEN_LINK")) {
                        menu.clear();
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i2 = 0;
                    for (String str : this.f17072b.values()) {
                        menu.add(i, 0, i2, str);
                        i2++;
                    }
                    return true;
                }
                C13479a.m54764b("SelectionNewBase", "need not update menu");
            }
            return false;
        }

        public C6133a() {
            this.f17073c = new C6126c(AbstractView$OnTouchListenerC6130e.this.f17043a, 2, "SelectionNewBase");
        }

        /* renamed from: a */
        private boolean m24750a(Menu menu) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < menu.size(); i++) {
                if (menu.getItem(i).getGroupId() == 0 || menu.getItem(i).getGroupId() == 1) {
                    arrayList.add(menu.getItem(i));
                }
            }
            if (arrayList.size() != this.f17072b.size()) {
                return true;
            }
            int i2 = 0;
            for (Map.Entry<String, String> entry : this.f17072b.entrySet()) {
                if (!entry.getValue().contentEquals(((MenuItem) arrayList.get(i2)).getTitle())) {
                    return true;
                }
                i2++;
            }
            return false;
        }

        /* renamed from: a */
        public void mo24745a(ActionMode actionMode) {
            C13479a.m54764b("SelectionNewBase", "onDestroyActionMode actionMode " + AbstractView$OnTouchListenerC6130e.this.f17045c + " mode " + actionMode);
            if (AbstractView$OnTouchListenerC6130e.this.f17047e != null) {
                AbstractView$OnTouchListenerC6130e.this.f17047e.onDestroyActionMode(actionMode);
            }
            if (!(AbstractView$OnTouchListenerC6130e.this.f17045c == null || AbstractView$OnTouchListenerC6130e.this.f17045c == actionMode)) {
                AbstractView$OnTouchListenerC6130e.this.f17045c.finish();
            }
            AbstractView$OnTouchListenerC6130e.this.f17049g.clear();
            this.f17072b.clear();
            AbstractView$OnTouchListenerC6130e.this.f17050h.clear();
            AbstractView$OnTouchListenerC6130e.this.f17045c = null;
        }

        /* renamed from: a */
        public void mo24746a(LinkedHashMap<String, String> linkedHashMap) {
            boolean z;
            if (this.f17072b.equals(linkedHashMap)) {
                C13479a.m54764b("SelectionNewBase", "menu not change, return");
                return;
            }
            this.f17072b.clear();
            this.f17072b.putAll(linkedHashMap);
            if (AbstractView$OnTouchListenerC6130e.this.f17045c == null && !C26326z.m95340d() && AbstractView$OnTouchListenerC6130e.this.mo24737o()) {
                C13479a.m54764b("SelectionNewBase", "start action mode by hand");
                AbstractView$OnTouchListenerC6130e eVar = AbstractView$OnTouchListenerC6130e.this;
                eVar.f17045c = eVar.f17043a.startActionMode(AbstractView$OnTouchListenerC6130e.this.f17046d);
            }
            if (AbstractView$OnTouchListenerC6130e.this.f17045c == null || !m24750a(AbstractView$OnTouchListenerC6130e.this.f17045c.getMenu())) {
                z = false;
            } else {
                z = true;
            }
            C13479a.m54764b("SelectionNewBase", "updateMenuItems, actionMode = " + AbstractView$OnTouchListenerC6130e.this.f17045c + ", needInvalidate = " + z);
            if (z) {
                AbstractView$OnTouchListenerC6130e.this.f17045c.invalidate();
            }
        }

        /* renamed from: b */
        public boolean mo24750b(ActionMode actionMode, Menu menu) {
            C13479a.m54764b("SelectionNewBase", "onPrepareActionMode");
            if (AbstractView$OnTouchListenerC6130e.this.f17047e != null) {
                AbstractView$OnTouchListenerC6130e.this.f17047e.onPrepareActionMode(actionMode, menu);
            }
            if (!AbstractView$OnTouchListenerC6130e.this.f17051i.isEmpty()) {
                this.f17072b.clear();
                this.f17072b.putAll(AbstractView$OnTouchListenerC6130e.this.f17051i);
            } else {
                AbstractView$OnTouchListenerC6130e.this.mo24729g();
            }
            return mo24747a();
        }

        /* renamed from: a */
        public boolean mo24748a(ActionMode actionMode, Menu menu) {
            C13479a.m54764b("SelectionNewBase", "onCreateActionMode actionMode " + AbstractView$OnTouchListenerC6130e.this.f17045c + " mode " + actionMode);
            if (AbstractView$OnTouchListenerC6130e.this.f17047e != null) {
                AbstractView$OnTouchListenerC6130e.this.f17047e.onCreateActionMode(actionMode, menu);
            }
            if (!(AbstractView$OnTouchListenerC6130e.this.f17045c == null || AbstractView$OnTouchListenerC6130e.this.f17045c == actionMode)) {
                AbstractView$OnTouchListenerC6130e.this.f17045c.finish();
            }
            menu.clear();
            if (AbstractView$OnTouchListenerC6130e.this.f17057o) {
                this.f17073c.mo24706a(menu, AbstractView$OnTouchListenerC6130e.this.f17053k, actionMode);
            }
            AbstractView$OnTouchListenerC6130e.this.f17045c = actionMode;
            return true;
        }

        /* renamed from: a */
        public boolean mo24749a(ActionMode actionMode, MenuItem menuItem) {
            if (AbstractView$OnTouchListenerC6130e.this.f17047e != null) {
                AbstractView$OnTouchListenerC6130e.this.f17047e.onActionItemClicked(actionMode, menuItem);
            }
            int groupId = menuItem.getGroupId();
            boolean z = true;
            boolean z2 = false;
            if (groupId == 0 || groupId == 1) {
                CharSequence title = menuItem.getTitle();
                Iterator<Map.Entry<String, String>> it = this.f17072b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (title.equals(next.getValue())) {
                        String key = next.getKey();
                        z2 = "SELECT_ALL".equals(key);
                        AbstractView$OnTouchListenerC6130e.this.mo24720a(key, menuItem.getGroupId());
                        break;
                    }
                }
                AbstractView$OnTouchListenerC6130e.this.f17056n = z2;
                AbstractView$OnTouchListenerC6130e.this.f17051i.clear();
                AbstractView$OnTouchListenerC6130e.this.f17052j.setEmpty();
                if (z2) {
                    C13479a.m54764b("SelectionNewBase", "click item select all");
                    C13742g.m55706a(new Runnable() {
                        /* class com.bytedance.ee.bear.document.selection.$$Lambda$e$a$8RQ5zq0d6NSTAFceOJ3nJJcyWyM */

                        public final void run() {
                            AbstractView$OnTouchListenerC6130e.this.mo24724c();
                        }
                    }, 200);
                }
                z2 = z;
            } else if (groupId == 2 && AbstractView$OnTouchListenerC6130e.this.f17057o) {
                z2 = this.f17073c.mo24703a(menuItem).booleanValue();
                AbstractView$OnTouchListenerC6130e.this.f17053k.mo21079a("intent_menu_item_clicked", new HashMap());
            }
            actionMode.finish();
            return z2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24716a(float f) {
        this.f17063u = f;
    }

    /* renamed from: b */
    public void mo24723b(ActionMode.Callback callback) {
        this.f17047e = callback;
    }

    /* renamed from: a */
    private float m24706a(int i) {
        return (float) C13749l.m55749b(i);
    }

    /* renamed from: a */
    private int m24707a(double d) {
        return C13749l.m55737a((float) d);
    }

    /* renamed from: b */
    private void m24716b(float f) {
        this.f17043a.setEnableOverScrollBy(false);
        if (m24720c(f)) {
            this.f17068z = true;
        }
    }

    /* renamed from: a */
    private LinkedHashMap<String, String> m24708a(String str) {
        return m24709a(str, this.f17050h);
    }

    /* renamed from: b */
    private void m24717b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        this.f17053k.mo21079a("link_menu_item_clicked", hashMap);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m24719c(String str) {
        C13479a.m54767c("jsCursorBounds: " + str);
        try {
            m24714a(new org.json.JSONObject(str), this.f17052j);
            this.f17045c = mo24740p();
        } catch (Throwable th) {
            C13479a.m54761a("SelectionNewBase", th);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m24721d(String str) {
        C13479a.m54764b("SelectionNewBase", "jsMenu:" + str);
        ((AbstractC6134b) this.f17046d).mo24752a(m24708a(str));
    }

    @JavascriptInterface
    public void showActionMode(String str) {
        C13479a.m54764b("SelectionNewBase", "showActionMode:" + str);
        try {
            m24714a(new org.json.JSONObject(str).getJSONObject("position"), this.f17052j);
            m24709a(str, this.f17051i);
            mo24724c();
        } catch (Throwable th) {
            C13479a.m54759a("SelectionNewBase", "showActionMode exception ", th);
        }
    }

    AbstractView$OnTouchListenerC6130e(AbstractC5233x xVar) {
        this.f17053k = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0.canScrollVertically(-1) != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24720c(float r8) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.m24720c(float):boolean");
    }

    @JavascriptInterface
    public void onSelectionChanged(boolean z) {
        C13479a.m54764b("SelectionNewBase", "onSelectionChanged hasSelectionData: " + z + " mHasSelectionData " + this.f17054l + " actionMode " + this.f17045c);
        boolean m = mo24735m();
        StringBuilder sb = new StringBuilder();
        sb.append("onNewSelection intercept sys drag success?");
        sb.append(m);
        C13479a.m54764b("SelectionNewBase", sb.toString());
        if (!m) {
            C13479a.m54775e("SelectionNewBase", "Intercept drag handle touch fail !");
        }
        boolean z2 = this.f17054l;
        if (!z2 && z) {
            mo24755q();
        } else if (z2 && !z) {
            mo24728f();
        }
        this.f17054l = z;
        this.f17055m = true;
        if (z && this.f17065w) {
            this.f17066x = true;
        }
        if (z) {
            m24724s();
        }
    }

    @Override // com.bytedance.ee.bear.browser.view.DecorateWebViewV2.AbstractC4961a
    /* renamed from: a */
    public ActionMode.Callback mo19632a(ActionMode.Callback callback) {
        return ((AbstractC6134b) this.f17046d).mo24751a(callback);
    }

    /* renamed from: com.bytedance.ee.bear.document.selection.e$c */
    public class View$OnTouchListenerC6135c implements View.OnTouchListener {

        /* renamed from: a */
        protected String f17074a = "SelectionHandlerTouchListener";

        /* renamed from: b */
        protected boolean f17075b;

        public View$OnTouchListenerC6135c(boolean z) {
            this.f17075b = z;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return false;
                        }
                    }
                }
                AbstractView$OnTouchListenerC6130e.this.mo24727e();
            }
            AbstractView$OnTouchListenerC6130e.this.mo24718a(motionEvent, this.f17075b);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r3 != 3) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
        /*
            r2 = this;
            android.view.GestureDetector r3 = r2.f17064v
            r3.onTouchEvent(r4)
            int r3 = r4.getAction()
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x002e
            if (r3 == r0) goto L_0x0022
            r0 = 2
            if (r3 == r0) goto L_0x0016
            r4 = 3
            if (r3 == r4) goto L_0x0022
            goto L_0x0035
        L_0x0016:
            boolean r3 = r2.f17066x
            if (r3 == 0) goto L_0x0035
            float r3 = r4.getY()
            r2.m24716b(r3)
            goto L_0x0035
        L_0x0022:
            boolean r3 = r2.f17066x
            if (r3 == 0) goto L_0x0029
            r2.mo24727e()
        L_0x0029:
            r2.f17065w = r1
            r2.f17066x = r1
            goto L_0x0035
        L_0x002e:
            r2.m24723r()
            r2.f17065w = r0
            r2.f17066x = r1
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.selection.AbstractView$OnTouchListenerC6130e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private void m24718b(String str, int i) {
        C13479a.m54764b("SelectionNewBase", "report id " + str);
        if (i != 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("menu_id", str);
            hashMap.put("enable_intent_menu_item", Boolean.valueOf(this.f17057o));
            this.f17053k.mo21079a("js_menu_item_clicked", hashMap);
        } else if (str.equals("OPEN_LINK")) {
            m24717b("openlink");
        } else if (str.equals("COPY_LINK")) {
            m24717b("copylink");
        } else if (str.equals("CUT_LINK")) {
            m24717b("cutlink");
        } else if (str.equals("COMMENT_LINK")) {
            m24717b("commentlink");
        }
    }

    /* renamed from: a */
    private LinkedHashMap<String, String> m24709a(String str, LinkedHashMap<String, String> linkedHashMap) {
        try {
            linkedHashMap.clear();
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                C13479a.m54775e("SelectionNewBase", "parseMenus: " + str);
                return linkedHashMap;
            }
            this.f17049g.clear();
            JSONArray jSONArray = parseObject.getJSONArray("items");
            if (jSONArray == null) {
                C13479a.m54775e("SelectionNewBase", "parseMenus: " + str);
                return linkedHashMap;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                ContextMenuItem contextMenuItem = new ContextMenuItem();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                contextMenuItem.id = jSONObject.getString("id");
                contextMenuItem.text = jSONObject.getString("text");
                if (jSONObject.containsKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    contextMenuItem.data = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                }
                if (!"PASTE".equals(contextMenuItem.id) || !C13614b.m55260a(this.f17043a.getContext())) {
                    this.f17049g.add(contextMenuItem);
                    linkedHashMap.put(contextMenuItem.id, contextMenuItem.text);
                }
            }
            return linkedHashMap;
        } catch (Throwable unused) {
            C13479a.m54775e("SelectionNewBase", "parseMenus:" + str);
        }
    }

    /* renamed from: a */
    private void m24712a(String str, JSONObject jSONObject) {
        m24713a(str, jSONObject, (ValueCallback<String>) null);
    }

    /* renamed from: a */
    private void m24714a(org.json.JSONObject jSONObject, Rect rect) throws JSONException {
        rect.set(m24707a(jSONObject.getDouble("left")), m24707a(jSONObject.getDouble("top")), m24707a(jSONObject.getDouble("right")), m24707a(jSONObject.getDouble("bottom")));
        if (rect.right - rect.left < 10) {
            rect.right = rect.left + 10;
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        this.f17044b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m24711a(WebView webView, int i, ValueAnimator valueAnimator) {
        int a = C13749l.m55738a(4);
        if (webView.canScrollVertically(i)) {
            if (i <= 0) {
                a = -a;
            }
            webView.scrollBy(0, a);
            return;
        }
        valueAnimator.cancel();
    }

    /* renamed from: a */
    private void m24713a(String str, JSONObject jSONObject, ValueCallback<String> valueCallback) {
        C11755a.m48726a(this.f17043a, str, jSONObject, valueCallback);
    }

    /* renamed from: a */
    private void m24710a(float f, float f2, boolean z, int i) {
        String str;
        String format = String.format(Locale.US, "javascript:window.lark.biz.selection.SelectionHandlerTouchEvent", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, (Object) m24715b(i));
        if (z) {
            str = "start";
        } else {
            str = "end";
        }
        jSONObject.put("target", (Object) str);
        jSONObject.put("clientX", (Object) Float.valueOf(m24706a((int) f)));
        jSONObject.put("clientY", (Object) Float.valueOf(m24706a((int) f2)));
        m24712a(format, jSONObject);
    }
}
