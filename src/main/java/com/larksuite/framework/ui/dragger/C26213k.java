package com.larksuite.framework.ui.dragger;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.framework.ui.dragger.k */
public class C26213k {

    /* renamed from: a */
    public Window.Callback f64724a;

    /* renamed from: b */
    private int f64725b;

    /* renamed from: c */
    private int f64726c;

    /* renamed from: d */
    private float f64727d;

    /* renamed from: e */
    private float f64728e;

    /* renamed from: f */
    private Window f64729f;

    /* renamed from: g */
    private ViewGroup f64730g;

    /* renamed from: h */
    private C26208i f64731h;

    /* renamed from: i */
    private View f64732i;

    /* renamed from: j */
    private C26207h f64733j;

    /* renamed from: k */
    private View f64734k;

    /* renamed from: l */
    private View f64735l;

    /* renamed from: m */
    private boolean f64736m;

    /* renamed from: n */
    private Rect f64737n;

    /* renamed from: o */
    private C26204e f64738o;

    /* renamed from: p */
    private List<C26220c> f64739p = new ArrayList();

    /* renamed from: q */
    private HashMap<View, C26207h> f64740q = new HashMap<>();

    /* renamed from: r */
    private List<View> f64741r = new ArrayList();

    /* renamed from: s */
    private HashMap<Class<? extends AbstractC26202c>, List<AbstractC26221l>> f64742s = new HashMap<>();

    /* renamed from: t */
    private Window$CallbackC26218a f64743t;

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.framework.ui.dragger.k$b */
    public class C26219b {

        /* renamed from: b */
        private Object f64754b;

        /* renamed from: a */
        public Object mo93269a() {
            return this.f64754b;
        }

        /* renamed from: a */
        private Reflect m94833a(View view) {
            return Reflect.m94754a(view).mo93183a("getListenerInfo");
        }

        public C26219b(View view, String str) {
            this.f64754b = m94833a(view).mo93186a(str, new Class[0]);
        }
    }

    /* renamed from: a */
    public void mo93233a() {
        mo93239c();
        this.f64739p.clear();
        this.f64740q.clear();
        this.f64741r.clear();
        this.f64742s.clear();
        this.f64743t = null;
    }

    /* renamed from: a */
    public boolean mo93236a(View view, View.OnLongClickListener onLongClickListener) {
        mo93241d(view);
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(view);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo93235a(View view, MotionEvent motionEvent, View.OnTouchListener onTouchListener) {
        if (motionEvent.getAction() == 0) {
            m94817d(motionEvent);
        }
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo93234a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                m94815b(motionEvent);
                return;
            } else if (action != 3) {
                return;
            }
        }
        m94816c(motionEvent);
    }

    /* renamed from: d */
    public boolean mo93242d() {
        if (this.f64732i != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.framework.ui.dragger.k$a */
    public class Window$CallbackC26218a implements Window.Callback {
        public void onAttachedToWindow() {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onAttachedToWindow();
            }
        }

        public void onContentChanged() {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onContentChanged();
            }
        }

        public void onDetachedFromWindow() {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onDetachedFromWindow();
            }
        }

        public boolean onSearchRequested() {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onSearchRequested();
            }
            return false;
        }

        Window$CallbackC26218a() {
        }

        public void onActionModeFinished(ActionMode actionMode) {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onActionModeFinished(actionMode);
            }
        }

        public void onActionModeStarted(ActionMode actionMode) {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onActionModeStarted(actionMode);
            }
        }

        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onWindowAttributesChanged(layoutParams);
            }
        }

        public void onWindowFocusChanged(boolean z) {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onWindowFocusChanged(z);
            }
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.dispatchGenericMotionEvent(motionEvent);
            }
            return false;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.dispatchKeyEvent(keyEvent);
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.dispatchKeyShortcutEvent(keyEvent);
            }
            return false;
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }
            return false;
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (C26213k.this.f64724a != null) {
                z = C26213k.this.f64724a.dispatchTouchEvent(motionEvent);
            } else {
                z = false;
            }
            C26213k.this.mo93234a(motionEvent);
            return z;
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.dispatchTrackballEvent(motionEvent);
            }
            return false;
        }

        public View onCreatePanelView(int i) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onCreatePanelView(i);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onWindowStartingActionMode(callback);
            }
            return null;
        }

        public boolean onSearchRequested(SearchEvent searchEvent) {
            if (!C26222m.m94837b() || C26213k.this.f64724a == null) {
                return false;
            }
            return C26213k.this.f64724a.onSearchRequested(searchEvent);
        }

        public void onPanelClosed(int i, Menu menu) {
            if (C26213k.this.f64724a != null) {
                C26213k.this.f64724a.onPanelClosed(i, menu);
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onMenuItemSelected(i, menuItem);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onMenuOpened(i, menu);
            }
            return false;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C26222m.m94837b() || C26213k.this.f64724a == null) {
                return null;
            }
            return C26213k.this.f64724a.onWindowStartingActionMode(callback, i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            if (C26213k.this.f64724a != null) {
                return C26213k.this.f64724a.onPreparePanel(i, view, menu);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.framework.ui.dragger.k$4 */
    public static /* synthetic */ class C262174 {

        /* renamed from: a */
        static final /* synthetic */ int[] f64751a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.larksuite.framework.ui.dragger.DragTriggerAction[] r0 = com.larksuite.framework.ui.dragger.DragTriggerAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.framework.ui.dragger.C26213k.C262174.f64751a = r0
                com.larksuite.framework.ui.dragger.DragTriggerAction r1 = com.larksuite.framework.ui.dragger.DragTriggerAction.LONG_PRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.framework.ui.dragger.C26213k.C262174.f64751a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.framework.ui.dragger.DragTriggerAction r1 = com.larksuite.framework.ui.dragger.DragTriggerAction.TOUCH_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.ui.dragger.C26213k.C262174.<clinit>():void");
        }
    }

    /* renamed from: c */
    public void mo93239c() {
        for (C26220c cVar : this.f64739p) {
            cVar.f64755a.setOnTouchListener(cVar.f64756b);
            cVar.f64755a.setOnLongClickListener(cVar.f64757c);
        }
        this.f64736m = false;
    }

    /* renamed from: b */
    public void mo93238b() {
        if (!this.f64736m) {
            this.f64739p.clear();
            for (Map.Entry<View, C26207h> entry : this.f64740q.entrySet()) {
                m94818e(entry.getKey());
            }
        }
        this.f64736m = true;
    }

    /* renamed from: c */
    public void mo93240c(View view) {
        this.f64734k = view;
    }

    public C26213k(Window window) {
        if (window != null) {
            this.f64729f = window;
            this.f64730g = (ViewGroup) window.getDecorView();
            this.f64736m = true;
            this.f64737n = new Rect();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    private void m94817d(MotionEvent motionEvent) {
        this.f64725b = Math.round(motionEvent.getX());
        this.f64726c = Math.round(motionEvent.getY());
        this.f64727d = motionEvent.getRawX();
        this.f64728e = motionEvent.getRawY();
    }

    /* renamed from: f */
    private void m94819f(View view) {
        this.f64732i = view;
        C26207h hVar = this.f64740q.get(view);
        this.f64733j = hVar;
        if (hVar != null && hVar.mo93215b()) {
            C26208i iVar = new C26208i(this.f64730g, C26212j.m94807a(this.f64732i, 0), this.f64725b, this.f64726c);
            this.f64731h = iVar;
            iVar.mo93219a(this.f64727d, this.f64728e);
            this.f64731h.setAlpha(hVar.mo93217d());
        }
    }

    /* renamed from: c */
    private void m94816c(MotionEvent motionEvent) {
        C26208i iVar = this.f64731h;
        if (iVar != null) {
            this.f64730g.removeView(iVar);
        }
        Window window = this.f64729f;
        if (window != null) {
            window.setCallback(this.f64724a);
        }
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        View b = m94814b(round, round2);
        Point a = m94809a(round, round2);
        m94812a(C26201b.class, new C26201b((float) a.x, (float) a.y, motionEvent.getRawX(), motionEvent.getRawY(), this.f64725b, this.f64726c, this.f64732i, this.f64731h, b));
        this.f64735l = null;
        this.f64734k = null;
        this.f64732i = null;
        this.f64731h = null;
        this.f64738o = null;
    }

    /* renamed from: e */
    private void m94818e(final View view) {
        final View.OnTouchListener onTouchListener = (View.OnTouchListener) new C26219b(view, "mOnTouchListener").mo93269a();
        final View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) new C26219b(view, "mOnLongClickListener").mo93269a();
        this.f64739p.add(new C26220c(view, onTouchListener, onLongClickListener));
        int i = C262174.f64751a[this.f64740q.get(view).mo93210a().ordinal()];
        if (i == 1) {
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.larksuite.framework.ui.dragger.C26213k.View$OnTouchListenerC262141 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return C26213k.this.mo93235a(view, motionEvent, onTouchListener);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.larksuite.framework.ui.dragger.C26213k.View$OnLongClickListenerC262152 */

                public boolean onLongClick(View view) {
                    return C26213k.this.mo93236a(view, onLongClickListener);
                }
            });
        } else if (i == 2) {
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.larksuite.framework.ui.dragger.C26213k.View$OnTouchListenerC262163 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a = C26213k.this.mo93235a(view, motionEvent, onTouchListener);
                    C26213k.this.mo93241d(view);
                    return a;
                }
            });
        }
    }

    /* renamed from: b */
    public C26213k mo93237b(View view) {
        if (view != null && this.f64740q.containsKey(view)) {
            Iterator<C26220c> it = this.f64739p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C26220c next = it.next();
                if (next.f64755a == view) {
                    next.f64755a.setOnTouchListener(next.f64756b);
                    next.f64755a.setOnLongClickListener(next.f64757c);
                    it.remove();
                    break;
                }
            }
            this.f64740q.remove(view);
        }
        return this;
    }

    /* renamed from: d */
    public void mo93241d(View view) {
        Window window = this.f64729f;
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof Window$CallbackC26218a)) {
                this.f64724a = callback;
                if (this.f64743t == null) {
                    this.f64743t = new Window$CallbackC26218a();
                }
                this.f64729f.setCallback(this.f64743t);
            } else {
                return;
            }
        }
        this.f64732i = view;
        m94819f(view);
        int round = Math.round(this.f64727d);
        int round2 = Math.round(this.f64728e);
        View b = m94814b(round, round2);
        Point a = m94809a(round, round2);
        m94812a(C26206g.class, new C26206g((float) a.x, (float) a.y, this.f64727d, this.f64728e, this.f64725b, this.f64726c, this.f64732i, this.f64731h, b));
    }

    /* renamed from: a */
    private void m94813a(boolean z) {
        int i;
        C26208i iVar = this.f64731h;
        if (iVar != null) {
            if (z) {
                i = this.f64733j.mo93216c();
            } else {
                i = 0;
            }
            iVar.setColor(i);
        }
    }

    /* renamed from: b */
    private void m94815b(MotionEvent motionEvent) {
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        Point point = new Point(round, round2);
        C26208i iVar = this.f64731h;
        if (iVar != null) {
            iVar.mo93220a(round, round2);
        }
        View b = m94814b(round, round2);
        if (b != null) {
            Point a = m94809a(point.x, point.y);
            if (this.f64735l != b) {
                m94810a(motionEvent, a);
                C26203d dVar = new C26203d((float) a.x, (float) a.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f64725b, this.f64726c, this.f64732i, this.f64731h, b);
                C26204e eVar = this.f64738o;
                if (eVar != null) {
                    dVar.mo93195a(eVar.mo93204k());
                }
                m94812a(C26203d.class, dVar);
            } else {
                m94811a(motionEvent, b, a);
            }
            m94813a(false);
        } else if (this.f64735l != null) {
            m94810a(motionEvent, point);
            m94813a(true);
        } else {
            m94811a(motionEvent, b, point);
        }
        this.f64735l = b;
    }

    /* renamed from: a */
    public C26213k mo93230a(View view) {
        if (!this.f64741r.contains(view)) {
            this.f64741r.add(view);
        }
        return this;
    }

    /* renamed from: a */
    private Point m94809a(int i, int i2) {
        Point point = new Point(i, i2);
        View view = this.f64734k;
        if (view != null) {
            C26200a.m94771b(view, this.f64730g, point);
        }
        return point;
    }

    /* renamed from: a */
    private void m94812a(Class<? extends AbstractC26202c> cls, AbstractC26202c cVar) {
        List<AbstractC26221l> list = this.f64742s.get(cls);
        if (list != null) {
            for (AbstractC26221l lVar : list) {
                lVar.mo93270a(cVar);
            }
        }
    }

    /* renamed from: a */
    private void m94810a(MotionEvent motionEvent, Point point) {
        if (this.f64735l != null) {
            m94812a(C26205f.class, new C26205f((float) point.x, (float) point.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f64725b, this.f64726c, this.f64732i, this.f64731h, this.f64735l));
        }
    }

    /* renamed from: b */
    private View m94814b(int i, int i2) {
        List<View> list = this.f64741r;
        for (int i3 = 0; i3 < list.size(); i3++) {
            View view = list.get(i3);
            if (C26200a.m94770a(view, this.f64730g).contains(i, i2)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C26213k mo93231a(View view, C26207h hVar) {
        if (this.f64740q.containsKey(view)) {
            return this;
        }
        this.f64740q.put(view, hVar);
        m94818e(view);
        return this;
    }

    /* renamed from: a */
    public <T extends AbstractC26202c> C26213k mo93232a(Class<? extends T> cls, AbstractC26221l<T> lVar) {
        List<AbstractC26221l> list = this.f64742s.get(cls);
        if (list == null) {
            list = new ArrayList<>();
            this.f64742s.put(cls, list);
        }
        if (!list.contains(lVar)) {
            list.add(lVar);
        }
        return this;
    }

    /* renamed from: a */
    private void m94811a(MotionEvent motionEvent, View view, Point point) {
        C26204e eVar = new C26204e((float) point.x, (float) point.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f64725b, this.f64726c, this.f64732i, this.f64731h, view);
        C26204e eVar2 = this.f64738o;
        if (eVar2 != null) {
            eVar.mo93195a(eVar2.mo93204k());
        }
        this.f64738o = eVar;
        m94812a(C26204e.class, eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.framework.ui.dragger.k$c */
    public class C26220c {

        /* renamed from: a */
        View f64755a;

        /* renamed from: b */
        View.OnTouchListener f64756b;

        /* renamed from: c */
        View.OnLongClickListener f64757c;

        public C26220c(View view, View.OnTouchListener onTouchListener, View.OnLongClickListener onLongClickListener) {
            this.f64755a = view;
            this.f64756b = onTouchListener;
            this.f64757c = onLongClickListener;
        }
    }
}
