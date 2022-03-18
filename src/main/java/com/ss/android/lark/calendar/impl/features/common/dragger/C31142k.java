package com.ss.android.lark.calendar.impl.features.common.dragger;

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
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.DragTargetOptionBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.k */
public class C31142k {

    /* renamed from: a */
    protected int f78659a;

    /* renamed from: b */
    protected int f78660b;

    /* renamed from: c */
    protected float f78661c;

    /* renamed from: d */
    protected float f78662d;

    /* renamed from: e */
    protected int f78663e;

    /* renamed from: f */
    protected int f78664f;

    /* renamed from: g */
    public Window.Callback f78665g;

    /* renamed from: h */
    protected C31140i f78666h;

    /* renamed from: i */
    protected View f78667i;

    /* renamed from: j */
    protected C31139h f78668j;

    /* renamed from: k */
    protected C31139h f78669k = DragTargetOptionBuilder.m114600a(DragTargetOptionBuilder.Style.LONG_PRESS_NO_DRAG_EXIT_HINT);

    /* renamed from: l */
    private Window f78670l;

    /* renamed from: m */
    private ViewGroup f78671m;

    /* renamed from: n */
    private View f78672n;

    /* renamed from: o */
    private View f78673o;

    /* renamed from: p */
    private boolean f78674p;

    /* renamed from: q */
    private Rect f78675q;

    /* renamed from: r */
    private C31136e f78676r;

    /* renamed from: s */
    private List<C31151c> f78677s = new ArrayList();

    /* renamed from: t */
    private HashMap<View, C31139h> f78678t = new HashMap<>();

    /* renamed from: u */
    private List<View> f78679u = new ArrayList();

    /* renamed from: v */
    private HashMap<Class<? extends AbstractC31134c>, List<AbstractC31152l>> f78680v = new HashMap<>();

    /* renamed from: w */
    private Window$CallbackC31149a f78681w;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.k$b */
    public class C31150b {

        /* renamed from: b */
        private Object f78694b;

        /* renamed from: a */
        public Object mo112824a() {
            return this.f78694b;
        }

        /* renamed from: a */
        private Reflect m116282a(View view) {
            return Reflect.m116206a(view).mo112740a("getListenerInfo");
        }

        public C31150b(View view, String str) {
            this.f78694b = m116282a(view).mo112743a(str, new Class[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo111198a(View view, MotionEvent motionEvent, View.OnTouchListener onTouchListener) {
        return mo112789b(view, motionEvent, onTouchListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo112786a(Class<? extends AbstractC31134c> cls, AbstractC31134c cVar) {
        List<AbstractC31152l> list = this.f78680v.get(cls);
        if (list != null) {
            for (AbstractC31152l lVar : list) {
                lVar.onDragEvent(cVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.k$a */
    public class Window$CallbackC31149a implements Window.Callback {
        public void onAttachedToWindow() {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onAttachedToWindow();
            }
        }

        public void onContentChanged() {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onContentChanged();
            }
        }

        public void onDetachedFromWindow() {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onDetachedFromWindow();
            }
        }

        public boolean onSearchRequested() {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onSearchRequested();
            }
            return false;
        }

        Window$CallbackC31149a() {
        }

        public void onActionModeFinished(ActionMode actionMode) {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onActionModeFinished(actionMode);
            }
        }

        public void onActionModeStarted(ActionMode actionMode) {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onActionModeStarted(actionMode);
            }
        }

        public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onWindowAttributesChanged(layoutParams);
            }
        }

        public void onWindowFocusChanged(boolean z) {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onWindowFocusChanged(z);
            }
        }

        public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.dispatchGenericMotionEvent(motionEvent);
            }
            return false;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.dispatchKeyEvent(keyEvent);
            }
            return false;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.dispatchKeyShortcutEvent(keyEvent);
            }
            return false;
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }
            return false;
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (C31142k.this.f78665g != null) {
                z = C31142k.this.f78665g.dispatchTouchEvent(motionEvent);
            } else {
                z = false;
            }
            C31142k.this.mo112784a(motionEvent);
            return z;
        }

        public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.dispatchTrackballEvent(motionEvent);
            }
            return false;
        }

        public View onCreatePanelView(int i) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onCreatePanelView(i);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onWindowStartingActionMode(callback);
            }
            return null;
        }

        public boolean onSearchRequested(SearchEvent searchEvent) {
            if (!C31153m.m116284a() || C31142k.this.f78665g == null) {
                return false;
            }
            return C31142k.this.f78665g.onSearchRequested(searchEvent);
        }

        public void onPanelClosed(int i, Menu menu) {
            if (C31142k.this.f78665g != null) {
                C31142k.this.f78665g.onPanelClosed(i, menu);
            }
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onMenuItemSelected(i, menuItem);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onMenuOpened(i, menu);
            }
            return false;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!C31153m.m116284a() || C31142k.this.f78665g == null) {
                return null;
            }
            return C31142k.this.f78665g.onWindowStartingActionMode(callback, i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            if (C31142k.this.f78665g != null) {
                return C31142k.this.f78665g.onPreparePanel(i, view, menu);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.k$6 */
    public static /* synthetic */ class C311486 {

        /* renamed from: a */
        static final /* synthetic */ int[] f78691a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction[] r0 = com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.C311486.f78691a = r0
                com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction r1 = com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction.LONG_PRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.C311486.f78691a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction r1 = com.ss.android.lark.calendar.impl.features.common.dragger.DragTriggerAction.TOUCH_DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.C311486.<clinit>():void");
        }
    }

    /* renamed from: c */
    public void mo111201c() {
        mo112791d();
        this.f78677s.clear();
        this.f78678t.clear();
        this.f78679u.clear();
        this.f78680v.clear();
        this.f78681w = null;
    }

    /* renamed from: d */
    public void mo112791d() {
        for (C31151c cVar : this.f78677s) {
            cVar.f78695a.setOnTouchListener(cVar.f78696b);
            cVar.f78695a.setOnLongClickListener(cVar.f78697c);
        }
        this.f78674p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo112794e() {
        Window window = this.f78670l;
        if (window == null) {
            return true;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof Window$CallbackC31149a) {
            return false;
        }
        this.f78665g = callback;
        if (this.f78681w == null) {
            this.f78681w = new Window$CallbackC31149a();
        }
        this.f78670l.setCallback(this.f78681w);
        return true;
    }

    /* renamed from: d */
    public void mo112792d(View view) {
        this.f78672n = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo111197a(View view) {
        mo112795f(view);
        return true;
    }

    /* renamed from: b */
    public C31142k mo112788b(View view) {
        if (!this.f78679u.contains(view)) {
            this.f78679u.add(view);
        }
        return this;
    }

    /* renamed from: c */
    private void m116259c(MotionEvent motionEvent) {
        C31140i iVar = this.f78666h;
        if (iVar != null) {
            this.f78671m.removeView(iVar);
        }
        Window window = this.f78670l;
        if (window != null) {
            window.setCallback(this.f78665g);
        }
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        mo112786a(C31133b.class, mo111199b(mo112781a(round, round2), motionEvent, mo112787b(round, round2)));
        this.f78673o = null;
        this.f78672n = null;
        this.f78667i = null;
        this.f78666h = null;
        this.f78676r = null;
    }

    /* renamed from: h */
    private void m116261h(View view) {
        this.f78667i = view;
        C31139h hVar = this.f78678t.get(view);
        this.f78668j = hVar;
        if (hVar != null && hVar.mo112768b()) {
            C31140i iVar = new C31140i(this.f78671m, C31141j.m116253a(this.f78667i, 0), this.f78663e, this.f78664f);
            this.f78666h = iVar;
            iVar.mo112772a(this.f78661c, this.f78662d);
            this.f78666h.setAlpha(hVar.mo112770d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo112793e(View view) {
        final View.OnTouchListener onTouchListener = (View.OnTouchListener) new C31150b(view, "mOnTouchListener").mo112824a();
        this.f78677s.add(new C31151c(view, onTouchListener, (View.OnLongClickListener) new C31150b(view, "mOnLongClickListener").mo112824a()));
        if (this.f78669k.mo112763a() == DragTriggerAction.LONG_PRESS) {
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.View$OnTouchListenerC311464 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return C31142k.this.mo111198a(view, motionEvent, onTouchListener);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.View$OnLongClickListenerC311475 */

                public boolean onLongClick(View view) {
                    return C31142k.this.mo111197a(view);
                }
            });
        }
    }

    /* renamed from: f */
    public void mo112795f(View view) {
        if (mo112794e()) {
            this.f78667i = view;
            m116261h(view);
            int round = Math.round(this.f78661c);
            int round2 = Math.round(this.f78662d);
            View b = mo112787b(round, round2);
            Point a = mo112781a(round, round2);
            mo112786a(C31138g.class, new C31138g((float) a.x, (float) a.y, this.f78661c, this.f78662d, this.f78659a, this.f78660b, this.f78667i, this.f78666h, b));
        }
    }

    public C31142k(Window window) {
        if (window != null) {
            this.f78670l = window;
            this.f78671m = (ViewGroup) window.getDecorView();
            this.f78674p = true;
            this.f78675q = new Rect();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private void m116257a(boolean z) {
        int i;
        C31140i iVar = this.f78666h;
        if (iVar != null) {
            if (z) {
                i = this.f78668j.mo112769c();
            } else {
                i = 0;
            }
            iVar.setColor(i);
        }
    }

    /* renamed from: g */
    private void m116260g(final View view) {
        final View.OnTouchListener onTouchListener = (View.OnTouchListener) new C31150b(view, "mOnTouchListener").mo112824a();
        final View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) new C31150b(view, "mOnLongClickListener").mo112824a();
        this.f78677s.add(new C31151c(view, onTouchListener, onLongClickListener));
        int i = C311486.f78691a[this.f78678t.get(view).mo112763a().ordinal()];
        if (i == 1) {
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.View$OnTouchListenerC311431 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return true;
                    }
                    C31142k.this.mo112785a(view, motionEvent);
                    return true;
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.View$OnLongClickListenerC311442 */

                public boolean onLongClick(View view) {
                    C31142k.this.mo112795f(view);
                    View.OnLongClickListener onLongClickListener = onLongClickListener;
                    if (onLongClickListener != null) {
                        return onLongClickListener.onLongClick(view);
                    }
                    return false;
                }
            });
        } else if (i == 2) {
            view.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.calendar.impl.features.common.dragger.C31142k.View$OnTouchListenerC311453 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean b = C31142k.this.mo112789b(view, motionEvent, onTouchListener);
                    C31142k.this.mo112795f(view);
                    return b;
                }
            });
        }
    }

    /* renamed from: c */
    public C31142k mo112790c(View view) {
        if (view != null && this.f78678t.containsKey(view)) {
            Iterator<C31151c> it = this.f78677s.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C31151c next = it.next();
                if (next.f78695a == view) {
                    next.f78695a.setOnTouchListener(next.f78696b);
                    next.f78695a.setOnLongClickListener(next.f78697c);
                    it.remove();
                    break;
                }
            }
            this.f78678t.remove(view);
        }
        return this;
    }

    /* renamed from: b */
    private void m116258b(MotionEvent motionEvent) {
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        Point point = new Point(round, round2);
        C31140i iVar = this.f78666h;
        if (iVar != null) {
            iVar.mo112773a(round, round2);
        }
        View b = mo112787b(round, round2);
        if (b != null) {
            Point a = mo112781a(point.x, point.y);
            if (this.f78673o != b) {
                m116255a(motionEvent, a);
                C31135d dVar = new C31135d((float) a.x, (float) a.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f78663e, this.f78664f, this.f78667i, this.f78666h, b);
                C31136e eVar = this.f78676r;
                if (eVar != null) {
                    dVar.mo112752a(eVar.mo112760l());
                }
                mo112786a(C31135d.class, dVar);
            } else {
                m116256a(motionEvent, b, a);
            }
            m116257a(false);
        } else if (this.f78673o != null) {
            m116255a(motionEvent, point);
            m116257a(true);
        } else {
            m116256a(motionEvent, b, point);
        }
        this.f78673o = b;
    }

    /* renamed from: a */
    public void mo112784a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                m116258b(motionEvent);
                return;
            } else if (action != 3) {
                return;
            }
        }
        m116259c(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Point mo112781a(int i, int i2) {
        Point point = new Point(i, i2);
        View view = this.f78672n;
        if (view != null) {
            C31132a.m116223b(view, this.f78671m, point);
        }
        return point;
    }

    /* renamed from: a */
    private void m116255a(MotionEvent motionEvent, Point point) {
        if (this.f78673o != null) {
            mo112786a(C31137f.class, new C31137f((float) point.x, (float) point.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f78663e, this.f78664f, this.f78667i, this.f78666h, this.f78673o));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo112787b(int i, int i2) {
        List<View> list = this.f78679u;
        for (int i3 = 0; i3 < list.size(); i3++) {
            View view = list.get(i3);
            if (C31132a.m116222a(view, this.f78671m).contains(i, i2)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C31142k mo112782a(View view, C31139h hVar) {
        if (this.f78678t.containsKey(view)) {
            return this;
        }
        this.f78678t.put(view, hVar);
        m116260g(view);
        return this;
    }

    /* renamed from: a */
    public <T extends AbstractC31134c> C31142k mo112783a(Class<? extends T> cls, AbstractC31152l<T> lVar) {
        List<AbstractC31152l> list = this.f78680v.get(cls);
        if (list == null) {
            list = new ArrayList<>();
            this.f78680v.put(cls, list);
        }
        if (!list.contains(lVar)) {
            list.add(lVar);
        }
        return this;
    }

    /* renamed from: a */
    public void mo112785a(View view, MotionEvent motionEvent) {
        this.f78661c = motionEvent.getRawX();
        this.f78662d = motionEvent.getRawY();
        this.f78659a = Math.round(motionEvent.getX());
        int round = Math.round(motionEvent.getY());
        this.f78660b = round;
        this.f78663e = this.f78659a;
        this.f78664f = round;
    }

    /* renamed from: a */
    private void m116256a(MotionEvent motionEvent, View view, Point point) {
        C31136e a = mo111194a(point, motionEvent, view);
        C31136e eVar = this.f78676r;
        if (eVar != null) {
            a.mo112752a(eVar.mo112760l());
        }
        this.f78676r = a;
        mo112786a(C31136e.class, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C31133b mo111199b(Point point, MotionEvent motionEvent, View view) {
        return new C31133b((float) point.x, (float) point.y, motionEvent.getRawX(), motionEvent.getRawY(), this.f78663e, this.f78664f, this.f78667i, this.f78666h, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo112789b(View view, MotionEvent motionEvent, View.OnTouchListener onTouchListener) {
        if (motionEvent.getAction() == 0) {
            mo112785a(view, motionEvent);
        }
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C31136e mo111194a(Point point, MotionEvent motionEvent, View view) {
        return new C31136e((float) point.x, (float) point.y, (float) Math.round(motionEvent.getRawX()), (float) Math.round(motionEvent.getRawY()), this.f78663e, this.f78664f, this.f78667i, this.f78666h, view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.k$c */
    public class C31151c {

        /* renamed from: a */
        View f78695a;

        /* renamed from: b */
        View.OnTouchListener f78696b;

        /* renamed from: c */
        View.OnLongClickListener f78697c;

        public C31151c(View view, View.OnTouchListener onTouchListener, View.OnLongClickListener onLongClickListener) {
            this.f78695a = view;
            this.f78696b = onTouchListener;
            this.f78697c = onLongClickListener;
        }
    }
}
