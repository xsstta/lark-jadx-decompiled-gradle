package com.bytedance.ee.bear.document.selection;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.ee.bear.browser.view.AbstractC4963a;
import com.bytedance.ee.bear.browser.view.C4965c;
import com.bytedance.ee.bear.browser.view.C4966d;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.selection.C6142h;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.selection.h */
public class C6142h extends C4966d implements DocBridgeWebViewV2.AbstractC5605c {

    /* renamed from: p */
    static final /* synthetic */ boolean f17090p = true;

    /* renamed from: q */
    private static final int f17091q = (ViewConfiguration.getLongPressTimeout() - 100);

    /* renamed from: A */
    private boolean f17092A;

    /* renamed from: B */
    private int f17093B = C13749l.m55738a(5);

    /* renamed from: C */
    private ValueCallback<String> f17094C = new ValueCallback() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$ifvmjwq6ob1xhH_XVauLVHgZGAo */

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(Object obj) {
            C6142h.this.m24801d((C6142h) ((String) obj));
        }
    };

    /* renamed from: D */
    private float f17095D = 0.2f;

    /* renamed from: E */
    private float f17096E = 0.8f;

    /* renamed from: F */
    private GestureDetector f17097F;

    /* renamed from: G */
    private ImageView f17098G;

    /* renamed from: H */
    private ImageView f17099H;

    /* renamed from: I */
    private int[] f17100I = new int[2];

    /* renamed from: J */
    private C6147a f17101J;

    /* renamed from: K */
    private Runnable f17102K = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.C6142h.RunnableC61431 */

        public void run() {
            if (C6142h.this.f17122m != null) {
                C6142h.this.mo24771a("cancelDefaultLongPress");
                C6142h.this.mo24777d().onTouchEvent(C6142h.this.f17122m);
            }
        }
    };

    /* renamed from: L */
    private Runnable f17103L = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$qehzq_dWjYEGLY4OgWWxsvgPc1Y */

        public final void run() {
            C6142h.this.m24809r();
        }
    };

    /* renamed from: M */
    private float f17104M;

    /* renamed from: N */
    private float f17105N;

    /* renamed from: O */
    private int[] f17106O = new int[2];

    /* renamed from: P */
    private boolean f17107P;

    /* renamed from: Q */
    private AbstractC6148b f17108Q;

    /* renamed from: R */
    private Runnable f17109R = new Runnable() {
        /* class com.bytedance.ee.bear.document.selection.C6142h.RunnableC61442 */

        public void run() {
            if (Build.VERSION.SDK_INT >= 23 && C6142h.this.f17117h != null) {
                C6142h.this.f17117h.invalidateContentRect();
            }
        }
    };

    /* renamed from: a */
    public ActionMode.Callback f17110a;

    /* renamed from: b */
    public boolean f17111b;

    /* renamed from: c */
    public boolean f17112c = f17090p;

    /* renamed from: d */
    public boolean f17113d = f17090p;

    /* renamed from: e */
    public boolean f17114e = f17090p;

    /* renamed from: f */
    public boolean f17115f;

    /* renamed from: g */
    public ImageView f17116g;

    /* renamed from: h */
    protected ActionMode f17117h;

    /* renamed from: i */
    public Point f17118i = new Point();

    /* renamed from: j */
    public Point f17119j = new Point();

    /* renamed from: k */
    public int f17120k;

    /* renamed from: l */
    public AbstractC5233x f17121l;

    /* renamed from: m */
    public MotionEvent f17122m;

    /* renamed from: n */
    public ValueAnimator f17123n;

    /* renamed from: o */
    public Rect f17124o = new Rect();

    /* renamed from: r */
    private boolean f17125r = f17090p;

    /* renamed from: s */
    private boolean f17126s;

    /* renamed from: t */
    private AbstractC4963a f17127t;

    /* renamed from: u */
    private int f17128u;

    /* renamed from: v */
    private int f17129v;

    /* renamed from: w */
    private int f17130w;

    /* renamed from: x */
    private int f17131x;

    /* renamed from: y */
    private int f17132y;

    /* renamed from: z */
    private boolean f17133z;

    /* renamed from: com.bytedance.ee.bear.document.selection.h$b */
    public interface AbstractC6148b {
        /* renamed from: a */
        void mo24803a(String str);
    }

    /* renamed from: a */
    public void mo24771a(String... strArr) {
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
    /* renamed from: a */
    public void mo19640a(AbstractC4963a aVar) {
        this.f17127t = aVar;
        int scaledTouchSlop = ViewConfiguration.get(mo24788k()).getScaledTouchSlop();
        this.f17131x = scaledTouchSlop;
        this.f17132y = scaledTouchSlop * scaledTouchSlop;
        this.f17101J = new C6147a();
        this.f17097F = new GestureDetector(mo24788k(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.document.selection.C6142h.C61453 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m24843a() {
                C6142h.this.mo24785h();
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (C6142h.this.f17111b && C6142h.this.f17114e) {
                    C6142h.this.mo24771a("onDoubleTap");
                    C6142h.this.f17124o.setEmpty();
                    C6142h.this.mo24782f();
                    C6142h.this.mo24777d().postDelayed(new Runnable() {
                        /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$3$ZHpUvC1xEbd7VFn40LGQxa6a0A */

                        public final void run() {
                            C6142h.C61453.this.m24843a();
                        }
                    }, 100);
                }
                return false;
            }

            public void onLongPress(MotionEvent motionEvent) {
                if (C6142h.this.f17111b && C6142h.this.f17112c) {
                    C6142h.this.mo24771a("onLongPress");
                    C6142h.this.f17124o.setEmpty();
                    C6142h.this.mo24782f();
                    C6142h.this.mo24784g();
                }
            }

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (!C6142h.this.f17111b || !C6142h.this.f17113d) {
                    return false;
                }
                C6142h.this.mo24771a("onSingleTapUp");
                boolean j = C6142h.this.mo24787j();
                if (j) {
                    C6142h.this.mo24786i();
                }
                if (C6142h.this.f17117h != null) {
                    C6142h.this.f17117h.finish();
                }
                if (!j || !C6142h.this.mo24789l()) {
                    return false;
                }
                return C6142h.f17090p;
            }
        });
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
    /* renamed from: a */
    public View[] mo19642a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f17098G = new ImageView(mo24788k());
        this.f17116g = new ImageView(mo24788k());
        $$Lambda$h$70ua0ph7xcxxQC0U1d6lxSo4ynI r2 = new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$70ua0ph7xcxxQC0U1d6lxSo4ynI */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C6142h.this.m24795a(view, motionEvent);
            }
        };
        this.f17098G.setOnTouchListener(r2);
        this.f17116g.setOnTouchListener(r2);
        m24803i(false);
        return new View[]{this.f17098G, this.f17116g};
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m24795a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17099H = (ImageView) view;
        }
        this.f17104M = motionEvent.getRawX();
        this.f17105N = motionEvent.getRawY();
        m24805n();
        int i = this.f17106O[1];
        int i2 = (int) this.f17104M;
        int rawY = ((int) motionEvent.getRawY()) - i;
        boolean z = false;
        int max = Math.max(0, rawY);
        boolean z2 = view == this.f17098G ? f17090p : false;
        if (action == 1 || action == 3) {
            z = f17090p;
        }
        m24797b(i2, max, z2, z);
        return f17090p;
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
    /* renamed from: a */
    public boolean mo19641a(MotionEvent motionEvent) {
        if (motionEvent == this.f17122m) {
            return false;
        }
        int action = motionEvent.getAction();
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        WebView d = mo24777d();
        if (action == 0) {
            this.f17128u = round;
            this.f17129v = round2;
            this.f17130w = d.getScrollY();
            this.f17092A = false;
            d.getLocationInWindow(this.f17106O);
            m24811t();
            if (this.f17111b && this.f17112c) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                this.f17122m = obtain;
                obtain.setAction(3);
                d.removeCallbacks(this.f17102K);
                d.postDelayed(this.f17102K, (long) f17091q);
            }
        } else if (action == 2) {
            int i = round - this.f17128u;
            int i2 = round2 - this.f17129v;
            if ((i * i) + (i2 * i2) > this.f17132y) {
                d.removeCallbacks(this.f17102K);
            }
            if (this.f17111b && this.f17125r && !this.f17133z && d.getScrollY() == this.f17130w && Math.abs(round - this.f17128u) > this.f17131x && Math.abs(round - this.f17128u) > Math.abs(round2 - this.f17129v) && Math.abs(round2 - this.f17129v) < this.f17131x) {
                this.f17124o.setEmpty();
                mo24782f();
                mo24786i();
                m24786a(this.f17128u, this.f17129v, f17090p);
                this.f17133z = f17090p;
            }
        }
        if (this.f17133z) {
            m24803i(false);
            m24786a(round, round2, false);
        }
        boolean z = (!this.f17133z || !this.f17092A) ? false : f17090p;
        if (z) {
            m24788a(round2, (action == 1 || action == 3) ? f17090p : false, false);
        }
        if (action == 1 || action == 3) {
            m24811t();
            if (this.f17133z) {
                m24802h(false);
                this.f17133z = false;
            }
        }
        if (this.f17097F.onTouchEvent(motionEvent) || z) {
            return f17090p;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
    /* renamed from: a */
    public ActionMode.Callback mo19637a(ActionMode.Callback callback) {
        if (!this.f17111b) {
            return null;
        }
        if (callback == this.f17101J || this.f17126s) {
            mo24771a("prepare action mode from custom");
            return this.f17101J;
        }
        List<ViewGroup> u = m24812u();
        C13479a.m54775e("SelectionOld", "prepare action mode from sys,handle size:" + u.size());
        if (u.size() == 1) {
            m24789a(new Runnable() {
                /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$m9aUWpHUu0dcuV0lIlmprq88nA */

                public final void run() {
                    C6142h.this.m24807p();
                }
            });
        } else if (u.size() == 2) {
            m24793a(u);
        }
        return this.f17101J;
    }

    /* renamed from: a */
    public C6142h mo24768a(boolean z) {
        C13479a.m54764b("SelectionOld", "setEnableCustomSelection:" + z);
        if (!m24800c()) {
            C13479a.m54758a("SelectionOld", "Enable custom selection when not match necessary condition");
            return this;
        }
        this.f17111b = z;
        return this;
    }

    /* renamed from: a */
    public void mo24770a(String str) {
        C13479a.m54764b("SelectionOld", "showActionMode:" + str);
        try {
            m24794a(new JSONObject(str).getJSONObject("position"), this.f17124o);
            mo24777d().post(new Runnable() {
                /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$m9aUWpHUu0dcuV0lIlmprq88nA */

                public final void run() {
                    C6142h.this.m24807p();
                }
            });
        } catch (Throwable th) {
            C13479a.m54761a("SelectionOld", th);
        }
    }

    /* renamed from: a */
    private void m24794a(JSONObject jSONObject, Rect rect) throws JSONException {
        rect.set(m24785a(jSONObject.getDouble("left")), m24785a(jSONObject.getDouble("top")), m24785a(jSONObject.getDouble("right")), m24785a(jSONObject.getDouble("bottom")));
        if (rect.right - rect.left < 10) {
            rect.right = rect.left + 10;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m24813v() {
        m24810s();
        m24814w();
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
    /* renamed from: b */
    public void mo19643b() {
        super.mo19643b();
        m24806o();
    }

    /* renamed from: c */
    static boolean m24800c() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        return m24804m() ^ f17090p;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m24807p() {
        m24798b(new Runnable() {
            /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$uvv0Ricr1W3U4US0anUggq73QlQ */

            public final void run() {
                C6142h.this.m24814w();
            }
        });
    }

    /* renamed from: t */
    private void m24811t() {
        MotionEvent motionEvent = this.f17122m;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f17122m = null;
        }
    }

    /* renamed from: d */
    public WebView mo24777d() {
        return (WebView) this.f17127t.getHostView();
    }

    /* renamed from: e */
    public void mo24780e() {
        C13479a.m54764b("SelectionOld", "closeActionMode");
        ActionMode actionMode = this.f17117h;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    /* renamed from: i */
    public void mo24786i() {
        mo24771a("jsClearSelectionExcludeCursor");
        m24791a("javascript:window.lark.biz.selection.clearSelectionExcludeCursor", (com.alibaba.fastjson.JSONObject) null);
    }

    /* renamed from: k */
    public Context mo24788k() {
        return mo24777d().getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.document.selection.h$a */
    public class C6147a extends ActionMode.Callback2 {

        /* renamed from: b */
        private LinkedHashMap<String, String> f17139b = new LinkedHashMap<>();

        /* renamed from: c */
        private LinkedHashMap<String, String> f17140c = new LinkedHashMap<>();

        /* renamed from: d */
        private final C6126c f17141d;

        /* renamed from: a */
        private boolean m24844a() {
            ClipboardManager clipboardManager = (ClipboardManager) C6142h.this.mo24788k().getSystemService(ClipboardManager.class);
            if (clipboardManager == null || clipboardManager.hasPrimaryClip()) {
                return false;
            }
            return C6142h.f17090p;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            if (C6142h.this.f17110a != null) {
                C6142h.this.f17110a.onDestroyActionMode(actionMode);
            }
        }

        C6147a() {
            this.f17141d = new C6126c(C6142h.this.mo24777d(), 1, "SelectionOld");
        }

        /* renamed from: a */
        private boolean m24845a(Menu menu) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < menu.size(); i++) {
                if (menu.getItem(i).getGroupId() == 0) {
                    arrayList.add(menu.getItem(i));
                }
            }
            if (arrayList.size() != this.f17139b.size()) {
                return C6142h.f17090p;
            }
            int i2 = 0;
            for (Map.Entry<String, String> entry : this.f17139b.entrySet()) {
                if (!entry.getValue().contentEquals(((MenuItem) arrayList.get(i2)).getTitle())) {
                    return C6142h.f17090p;
                }
                i2++;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24797a(String str) throws JSONException {
            this.f17140c.clear();
            JSONArray jSONArray = new JSONObject(str).getJSONArray("items");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.f17140c.put(jSONObject.getString("id"), jSONObject.getString("text"));
            }
            if (this.f17140c.containsKey("PASTE") && m24844a()) {
                this.f17140c.remove("PASTE");
            }
            this.f17139b.clear();
            this.f17139b.putAll(this.f17140c);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (C6142h.this.f17110a != null) {
                C6142h.this.f17110a.onCreateActionMode(actionMode, menu);
            }
            if (C6142h.this.f17115f) {
                this.f17141d.mo24706a(menu, C6142h.this.f17121l, actionMode);
            }
            C6142h.this.f17117h = actionMode;
            return C6142h.f17090p;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (C6142h.this.f17110a != null) {
                C6142h.this.f17110a.onActionItemClicked(actionMode, menuItem);
            }
            boolean z = false;
            int groupId = menuItem.getGroupId();
            if (groupId == 0) {
                CharSequence title = menuItem.getTitle();
                Iterator<Map.Entry<String, String>> it = this.f17139b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (title.equals(next.getValue())) {
                        C6142h.this.mo24776c(next.getKey());
                        z = C6142h.f17090p;
                        break;
                    }
                }
            } else if (groupId == 1 && C6142h.this.f17115f) {
                C6142h.this.f17121l.mo21079a("intent_menu_item_clicked", new HashMap());
                z = this.f17141d.mo24703a(menuItem).booleanValue();
            }
            actionMode.finish();
            return z;
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (C6142h.this.f17110a != null) {
                C6142h.this.f17110a.onPrepareActionMode(actionMode, menu);
            }
            if (!m24845a(menu)) {
                return false;
            }
            menu.removeGroup(0);
            C6142h.this.mo24771a("menu updated");
            int i = 0;
            for (String str : this.f17139b.values()) {
                menu.add(0, 0, i, str);
                i++;
            }
            return C6142h.f17090p;
        }

        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            if (!C6142h.this.f17124o.isEmpty()) {
                rect.set(C6142h.this.f17124o);
                rect.offset(0, -C6142h.this.mo24777d().getScrollY());
                return;
            }
            int i = C6142h.this.f17118i.x;
            int i2 = C6142h.this.f17118i.y;
            int i3 = C6142h.this.f17119j.x;
            int i4 = C6142h.this.f17119j.y;
            if (i > i3) {
                i3 = i;
                i = i3;
            }
            if (i2 > i4) {
                i4 = i2;
                i2 = i4;
            }
            rect.set(i, i2, i3, i4);
            rect.offset(0, -C6142h.this.mo24777d().getScrollY());
            rect.top -= C6142h.this.f17120k;
            rect.bottom += C6142h.this.f17116g.getHeight();
        }
    }

    /* renamed from: o */
    private void m24806o() {
        mo24782f();
        this.f17117h = null;
        WebView d = mo24777d();
        d.removeCallbacks(this.f17103L);
        d.removeCallbacks(this.f17102K);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m24809r() {
        if (mo24787j()) {
            m24798b(new Runnable() {
                /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$Bof9wMeYhyNtPU8_5BXDfttmv4 */

                public final void run() {
                    C6142h.this.m24813v();
                }
            });
        } else {
            mo24782f();
        }
    }

    /* renamed from: m */
    private static boolean m24804m() {
        String[] strArr = {Build.BOARD, Build.PRODUCT, Build.DISPLAY};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                String lowerCase = str.toLowerCase();
                if (lowerCase.contains("flyme") || lowerCase.contains("meizu")) {
                    return f17090p;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    private void m24805n() {
        ImageView imageView = this.f17099H;
        imageView.setX(this.f17104M - ((float) (imageView.getWidth() / 2)));
        WebView d = mo24777d();
        int i = this.f17106O[1];
        ImageView imageView2 = this.f17099H;
        imageView2.setY(Math.max((float) BitmapDescriptorFactory.HUE_RED, ((this.f17105N - ((float) i)) - ((float) (imageView2.getHeight() / 2))) + ((float) d.getScrollY())));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m24814w() {
        if (Build.VERSION.SDK_INT < 23) {
            C13479a.m54764b("SelectionOld", "api lower than 23 can not startActionMode");
            return;
        }
        mo24777d().startActionMode(this.f17101J, 1);
        HashMap hashMap = new HashMap();
        hashMap.put("enable_intent_menu_item", Boolean.valueOf(this.f17115f));
        this.f17121l.mo21079a("start_action_mode", hashMap);
    }

    /* renamed from: f */
    public void mo24782f() {
        m24803i(false);
        ActionMode actionMode = this.f17117h;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f17118i.set(0, 0);
        this.f17119j.set(0, 0);
    }

    /* renamed from: g */
    public void mo24784g() {
        mo24771a("jsLongPressSelect");
        String format = String.format(Locale.US, "javascript:window.lark.biz.selection.longPressSelect", new Object[0]);
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("x", (Object) Float.valueOf(m24784a(this.f17128u)));
        jSONObject.put("y", (Object) Float.valueOf(m24784a(this.f17129v)));
        m24791a(format, jSONObject);
    }

    /* renamed from: j */
    public boolean mo24787j() {
        if (this.f17119j.y > this.f17118i.y) {
            return f17090p;
        }
        if (this.f17119j.y != this.f17118i.y || this.f17119j.x <= this.f17118i.x) {
            return false;
        }
        return f17090p;
    }

    /* renamed from: l */
    public boolean mo24789l() {
        this.f17098G.getLocationInWindow(this.f17100I);
        int[] iArr = this.f17100I;
        int i = iArr[1];
        this.f17116g.getLocationInWindow(iArr);
        int i2 = this.f17100I[1];
        if (i <= 0 || i2 >= mo24777d().getHeight()) {
            return false;
        }
        return f17090p;
    }

    /* renamed from: s */
    private void m24810s() {
        int i = this.f17118i.x;
        int i2 = this.f17118i.y;
        int i3 = this.f17119j.x;
        int i4 = this.f17119j.y;
        this.f17098G.setX((float) ((int) (((float) i) - (((float) this.f17098G.getWidth()) * 0.75f))));
        this.f17098G.setY((float) i2);
        this.f17116g.setX((float) ((int) (((float) i3) - (((float) this.f17098G.getWidth()) * 0.25f))));
        this.f17116g.setY((float) i4);
        m24803i(f17090p);
    }

    /* renamed from: h */
    public void mo24785h() {
        mo24771a("jsDoubleClick");
        String format = String.format(Locale.US, "javascript:window.lark.biz.selection.doubleClick", new Object[0]);
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("x", (Object) Float.valueOf(m24784a(this.f17128u)));
        jSONObject.put("y", (Object) Float.valueOf(m24784a(this.f17129v)));
        m24791a(format, jSONObject);
    }

    /* renamed from: u */
    private List<ViewGroup> m24812u() {
        ArrayList arrayList = new ArrayList();
        try {
            WindowManager windowManager = (WindowManager) mo24788k().getSystemService("window");
            if (!f17090p) {
                if (windowManager == null) {
                    throw new AssertionError();
                }
            }
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, null);
            Method method = cls.getMethod("getViewRootNames", new Class[0]);
            Method method2 = cls.getMethod("getRootView", String.class);
            String[] strArr = (String[]) method.invoke(invoke, null);
            if (strArr == null) {
                return arrayList;
            }
            for (String str : strArr) {
                if (str.startsWith("PopupWindow")) {
                    View view = (View) method2.invoke(invoke, str);
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        if (viewGroup.getChildCount() == 1 && "PopupTouchHandleDrawable".equals(viewGroup.getChildAt(0).getClass().getSimpleName())) {
                            arrayList.add(viewGroup);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C13479a.m54761a("SelectionOld", th);
        }
    }

    /* renamed from: a */
    public void mo24769a(float f) {
        this.f17096E = f;
    }

    /* renamed from: b */
    public void mo24773b(ActionMode.Callback callback) {
        this.f17110a = callback;
    }

    /* renamed from: a */
    private float m24784a(int i) {
        return (float) C13749l.m55749b(i);
    }

    /* renamed from: a */
    private int m24785a(double d) {
        return C13749l.m55737a((float) d);
    }

    /* renamed from: b */
    private void m24798b(Runnable runnable) {
        mo24771a("jsGetActionModeMenu");
        m24792a("javascript:window.lark.biz.navigation.requestCustomContextMenu", (com.alibaba.fastjson.JSONObject) null, new ValueCallback(runnable) {
            /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$eFm_pAdd0wbXsfW8BUJxpAIS5A */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C6142h.this.m24790a((C6142h) this.f$1, (Runnable) ((String) obj));
            }
        });
    }

    /* renamed from: c */
    public C6142h mo24775c(boolean z) {
        C13479a.m54764b("SelectionOld", "setEnableLongPress:" + z);
        this.f17112c = z;
        return this;
    }

    /* renamed from: d */
    public C6142h mo24778d(boolean z) {
        C13479a.m54764b("SelectionOld", "setEnableSingleTap:" + z);
        this.f17113d = z;
        return this;
    }

    /* renamed from: e */
    public C6142h mo24779e(boolean z) {
        C13479a.m54764b("SelectionOld", "setEnableDoubleTap:" + z);
        this.f17114e = z;
        return this;
    }

    /* renamed from: f */
    public C6142h mo24781f(boolean z) {
        C13479a.m54764b("SelectionOld", "setMindnoteSpecial:" + z);
        this.f17126s = z;
        return this;
    }

    /* renamed from: g */
    public C6142h mo24783g(boolean z) {
        C13479a.m54764b("SelectionOld", "setEnableTextIntentItem" + z);
        this.f17115f = z;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m24801d(String str) {
        if (!this.f17092A && Math.abs(mo24777d().getScrollY() - this.f17130w) < this.f17093B && "true".equalsIgnoreCase(str)) {
            this.f17092A = f17090p;
        }
    }

    /* renamed from: h */
    private void m24802h(boolean z) {
        mo24771a("jsDragFinish");
        this.f17107P = false;
        String format = String.format("javascript:window.lark.biz.selection.dragFinish", new Object[0]);
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("isDragCaret", (Object) Boolean.valueOf(z));
        m24791a(format, jSONObject);
    }

    /* renamed from: i */
    private void m24803i(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        this.f17098G.setVisibility(i);
        if (this.f17098G.getDrawable() == null) {
            this.f17098G.setImageDrawable(C4965c.m20576a(mo24788k()));
        }
        this.f17116g.setVisibility(i);
        if (this.f17116g.getDrawable() == null) {
            this.f17116g.setImageDrawable(C4965c.m20578b(mo24788k()));
        }
    }

    C6142h(AbstractC5233x xVar) {
        this.f17121l = xVar;
    }

    /* renamed from: c */
    public void mo24776c(String str) {
        mo24771a("jsOnActionModeMenuItemClick:" + str);
        String format = String.format(Locale.US, "javascript:window.lark.biz.navigation.onContextMenuClick", new Object[0]);
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("id", (Object) str);
        m24791a(format, jSONObject);
        HashMap hashMap = new HashMap();
        hashMap.put("menu_id", str);
        hashMap.put("enable_intent_menu_item", Boolean.valueOf(this.f17115f));
        this.f17121l.mo21079a("js_menu_item_clicked", hashMap);
        AbstractC6148b bVar = this.f17108Q;
        if (bVar != null) {
            bVar.mo24803a(str);
        }
    }

    /* renamed from: a */
    private void m24789a(Runnable runnable) {
        mo24771a("jsGetCursorBounds");
        m24792a("javascript:window.lark.biz.selection.getCursorBounds", (com.alibaba.fastjson.JSONObject) null, new ValueCallback(runnable) {
            /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$kntM87vEb7dn33npfqyhc5oVM8 */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C6142h.this.m24799b(this.f$1, (String) obj);
            }
        });
    }

    /* renamed from: b */
    public C6142h mo24772b(boolean z) {
        C13479a.m54764b("SelectionOld", "setEnableSlide:" + z);
        this.f17125r = z;
        return this;
    }

    @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
    /* renamed from: b */
    public void mo19644b(AbstractC4963a aVar) {
        m24806o();
    }

    /* renamed from: b */
    public void mo24774b(String str) {
        if (this.f17111b) {
            boolean z = false;
            mo24771a("onSelectionChanged:", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int a = m24785a(jSONObject.getDouble("lineHeight"));
                int a2 = m24785a(jSONObject.getDouble("startLeft"));
                int a3 = m24785a(jSONObject.getDouble("startBottom"));
                int a4 = m24785a(jSONObject.getDouble("endRight"));
                int a5 = m24785a(jSONObject.getDouble("endBottom"));
                this.f17120k = a;
                this.f17118i.set(a2, a3);
                this.f17119j.set(a4, a5);
                if (!this.f17107P) {
                    WebView d = mo24777d();
                    if (a == 0 && a2 == 0 && a4 == 0 && a5 == 0) {
                        z = f17090p;
                    }
                    if (this.f17126s && !z) {
                        m24789a(new Runnable() {
                            /* class com.bytedance.ee.bear.document.selection.$$Lambda$h$m9aUWpHUu0dcuV0lIlmprq88nA */

                            public final void run() {
                                C6142h.this.m24807p();
                            }
                        });
                    }
                    d.removeCallbacks(this.f17103L);
                    d.postDelayed(this.f17103L, 30);
                }
            } catch (Throwable th) {
                C13479a.m54761a("SelectionOld", th);
            }
        }
    }

    /* renamed from: a */
    private void m24793a(List<ViewGroup> list) {
        WindowManager windowManager = (WindowManager) mo24788k().getSystemService("window");
        if (f17090p || windowManager != null) {
            for (ViewGroup viewGroup : list) {
                viewGroup.setVisibility(4);
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24799b(Runnable runnable, String str) {
        mo24771a("jsCursorBounds:" + str);
        try {
            m24794a(new JSONObject(str), this.f17124o);
            runnable.run();
        } catch (Throwable th) {
            C13479a.m54761a("SelectionOld", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24790a(Runnable runnable, String str) {
        mo24771a("jsMenu:" + str);
        try {
            this.f17101J.mo24797a(str);
            runnable.run();
        } catch (Throwable th) {
            C13479a.m54761a("SelectionOld", th);
        }
    }

    /* renamed from: a */
    private void m24791a(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        m24792a(str, jSONObject, (ValueCallback<String>) null);
    }

    /* renamed from: a */
    private void m24786a(int i, int i2, boolean z) {
        m24796b(i, i2, z);
        ActionMode actionMode = this.f17117h;
        if (actionMode != null) {
            actionMode.hide(300);
            this.f17117h.invalidateContentRect();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24787a(int i, boolean z, ValueAnimator valueAnimator) {
        int a = C13749l.m55738a(6);
        WebView d = mo24777d();
        if (d.canScrollVertically(i)) {
            if (i <= 0) {
                a = -a;
            }
            d.scrollBy(0, a);
            if (z) {
                m24805n();
                return;
            }
            return;
        }
        valueAnimator.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24788a(int r5, boolean r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.selection.C6142h.m24788a(int, boolean, boolean):void");
    }

    /* renamed from: b */
    private void m24796b(int i, int i2, boolean z) {
        String str;
        mo24771a("jsUpdateSelection start?" + z);
        this.f17107P = f17090p;
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("x", (Object) Float.valueOf(m24784a(i)));
        jSONObject.put("y", (Object) Float.valueOf(m24784a(i2)));
        ValueCallback<String> valueCallback = null;
        if (z) {
            str = String.format(Locale.US, "javascript:window.lark.biz.selection.dragSelectionStart", new Object[0]);
        } else {
            str = String.format(Locale.US, "javascript:window.lark.biz.selection.dragSelectionEnd", new Object[0]);
            if (this.f17133z) {
                valueCallback = this.f17094C;
            }
        }
        m24792a(str, jSONObject, valueCallback);
    }

    /* renamed from: a */
    private void m24792a(String str, com.alibaba.fastjson.JSONObject jSONObject, ValueCallback<String> valueCallback) {
        C11755a.m48726a(mo24777d(), str, jSONObject, valueCallback);
    }

    /* renamed from: b */
    private void m24797b(int i, int i2, boolean z, boolean z2) {
        m24786a(i, i2, z);
        m24788a(i2, z2, f17090p);
        if (z2) {
            m24802h(f17090p);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocBridgeWebViewV2.AbstractC5605c
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT >= 23 && (actionMode = this.f17117h) != null && actionMode.getType() == 1) {
            this.f17117h.hide(500);
            C13742g.m55710c(this.f17109R);
            C13742g.m55706a(this.f17109R, 200);
        }
    }
}
