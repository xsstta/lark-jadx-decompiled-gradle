package com.tt.miniapp.view;

import android.app.LocalActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabWidget;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapphost.util.C67590h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class TabHost extends FrameLayout implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a */
    public FrameLayout f169299a;

    /* renamed from: b */
    protected int f169300b;

    /* renamed from: c */
    protected LocalActivityManager f169301c;

    /* renamed from: d */
    private TabWidget f169302d;

    /* renamed from: e */
    private List<C67147f> f169303e;

    /* renamed from: f */
    private List<C67147f> f169304f;

    /* renamed from: g */
    private View f169305g;

    /* renamed from: h */
    private AbstractC67145d f169306h;

    /* renamed from: i */
    private View.OnKeyListener f169307i;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.TabHost$a */
    public interface AbstractC67142a {
        /* renamed from: a */
        View mo233495a();

        /* renamed from: b */
        void mo233496b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.TabHost$c */
    public interface AbstractC67144c {
        /* renamed from: a */
        View mo233497a();
    }

    /* renamed from: com.tt.miniapp.view.TabHost$d */
    public interface AbstractC67145d {
        /* renamed from: a */
        void mo232384a(String str);
    }

    /* renamed from: com.tt.miniapp.view.TabHost$e */
    public interface AbstractC67146e {
        /* renamed from: a */
        View mo233447a(String str);
    }

    public void onTouchModeChanged(boolean z) {
    }

    /* renamed from: com.tt.miniapp.view.TabHost$f */
    public class C67147f {

        /* renamed from: a */
        public final String f169314a;

        /* renamed from: b */
        public AbstractC67144c f169315b;

        /* renamed from: c */
        public AbstractC67142a f169316c;

        /* renamed from: a */
        public String mo233500a() {
            return this.f169314a;
        }

        /* renamed from: a */
        public C67147f mo233498a(View view) {
            this.f169315b = new C67148g(view);
            return this;
        }

        /* renamed from: a */
        public C67147f mo233499a(AbstractC67146e eVar) {
            this.f169316c = new C67143b(this.f169314a, eVar);
            return this;
        }

        private C67147f(String str) {
            this.f169314a = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.TabHost$g */
    public class C67148g implements AbstractC67144c {

        /* renamed from: b */
        private final View f169319b;

        @Override // com.tt.miniapp.view.TabHost.AbstractC67144c
        /* renamed from: a */
        public View mo233497a() {
            return this.f169319b;
        }

        private C67148g(View view) {
            this.f169319b = view;
        }
    }

    public int getCurrentTab() {
        return this.f169300b;
    }

    public View getCurrentView() {
        return this.f169305g;
    }

    public FrameLayout getTabContentView() {
        return this.f169299a;
    }

    public List<C67147f> getTabSpecs() {
        return this.f169303e;
    }

    public TabWidget getTabWidget() {
        return this.f169302d;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.TabHost$b */
    public class C67143b implements AbstractC67142a {

        /* renamed from: b */
        private View f169311b;

        /* renamed from: c */
        private final CharSequence f169312c;

        /* renamed from: d */
        private AbstractC67146e f169313d;

        @Override // com.tt.miniapp.view.TabHost.AbstractC67142a
        /* renamed from: b */
        public void mo233496b() {
            this.f169311b.setVisibility(8);
        }

        @Override // com.tt.miniapp.view.TabHost.AbstractC67142a
        /* renamed from: a */
        public View mo233495a() {
            if (this.f169311b == null) {
                this.f169311b = this.f169313d.mo233447a(this.f169312c.toString());
            }
            this.f169311b.setVisibility(0);
            return this.f169311b;
        }

        public C67143b(CharSequence charSequence, AbstractC67146e eVar) {
            this.f169312c = charSequence;
            this.f169313d = eVar;
        }
    }

    public CharSequence getAccessibilityClassName() {
        return android.widget.TabHost.class.getName();
    }

    /* renamed from: a */
    private void mo233423a() {
        setFocusableInTouchMode(true);
        setDescendantFocusability(262144);
        this.f169300b = -1;
        this.f169305g = null;
    }

    /* renamed from: e */
    private void m261753e() {
        AbstractC67145d dVar = this.f169306h;
        if (dVar != null) {
            dVar.mo232384a(getCurrentTabTag());
        }
    }

    public String getCurrentTabTag() {
        int i = this.f169300b;
        if (i < 0 || i >= this.f169303e.size()) {
            return null;
        }
        return this.f169303e.get(this.f169300b).mo233500a();
    }

    public View getCurrentTabView() {
        int i = this.f169300b;
        if (i < 0 || i >= this.f169303e.size()) {
            return null;
        }
        return this.f169302d.getChildTabViewAt(this.f169300b);
    }

    /* renamed from: d */
    private void m261752d() {
        this.f169302d.removeAllViews();
        for (C67147f fVar : this.f169304f) {
            View a = fVar.f169315b.mo233497a();
            a.setOnKeyListener(this.f169307i);
            this.f169302d.addView(a);
        }
    }

    private int getTabWidgetLocation() {
        if (this.f169302d.getOrientation() != 1) {
            if (this.f169299a.getTop() < this.f169302d.getTop()) {
                return 3;
            }
            return 1;
        } else if (this.f169299a.getLeft() < this.f169302d.getLeft()) {
            return 2;
        } else {
            return 0;
        }
    }

    /* renamed from: b */
    public void mo233476b() {
        TabWidget tabWidget = (TabWidget) findViewById(16908307);
        this.f169302d = tabWidget;
        if (tabWidget != null) {
            this.f169307i = new View.OnKeyListener() {
                /* class com.tt.miniapp.view.TabHost.View$OnKeyListenerC671401 */

                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (!(KeyEvent.isModifierKey(i) || i == 61 || i == 62 || i == 66)) {
                        switch (i) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                break;
                            default:
                                TabHost.this.f169299a.requestFocus(2);
                                return TabHost.this.f169299a.dispatchKeyEvent(keyEvent);
                        }
                    }
                    return false;
                }
            };
            try {
                Class<?> cls = Class.forName("android.widget.TabWidget$OnTabSelectionChanged");
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                    /* class com.tt.miniapp.view.TabHost.C671412 */

                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                        if (method.getName().equals("onTabSelectionChanged")) {
                            int intValue = ((Integer) objArr[0]).intValue();
                            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                            TabHost.this.setCurrentTab(intValue);
                            if (booleanValue) {
                                TabHost.this.f169299a.requestFocus(2);
                            }
                        }
                        return null;
                    }
                });
                Method declaredMethod = this.f169302d.getClass().getDeclaredMethod("setTabSelectionListener", cls);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f169302d, newProxyInstance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(16908305);
            this.f169299a = frameLayout;
            if (frameLayout == null) {
                throw new RuntimeException("Your TabHost must have a FrameLayout whose id attribute is 'android.R.id.tabcontent'");
            }
            return;
        }
        throw new RuntimeException("Your TabHost must have a TabWidget whose id attribute is 'android.R.id.tabs'");
    }

    /* renamed from: c */
    public void mo233478c() {
        List<C67147f> list = this.f169303e;
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52830i("TabHost", "resizeTabItems ignore : no tab bar items");
            return;
        }
        int d = C67590h.m263090d(getContext()) / this.f169303e.size();
        if (d <= 0) {
            AppBrandLogger.m52830i("TabHost", "resizeTabItems ignore : " + d);
            return;
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.microapp_m_tab_diver_height) + getResources().getDimensionPixelOffset(R.dimen.microapp_m_tab_item_height);
        for (int i = 0; i < this.f169303e.size(); i++) {
            if (!(this.f169303e.get(i).f169315b == null || this.f169303e.get(i).f169315b.mo233497a() == null)) {
                this.f169303e.get(i).f169315b.mo233497a().setLayoutParams(new LinearLayout.LayoutParams(d, dimensionPixelOffset));
            }
        }
    }

    public void setOnTabChangedListener(AbstractC67145d dVar) {
        this.f169306h = dVar;
    }

    public void dispatchWindowFocusChanged(boolean z) {
        View view = this.f169305g;
        if (view != null) {
            view.dispatchWindowFocusChanged(z);
        }
    }

    public void setup(LocalActivityManager localActivityManager) {
        mo233476b();
        this.f169301c = localActivityManager;
    }

    public TabHost(Context context) {
        super(context);
        this.f169303e = new ArrayList(2);
        this.f169304f = new ArrayList(2);
        this.f169300b = -1;
        this.f169305g = null;
        this.f169301c = null;
        mo233423a();
    }

    /* renamed from: c */
    public C67147f mo233477c(String str) {
        if (str != null) {
            return new C67147f(str);
        }
        throw new IllegalArgumentException("tag must be non-null");
    }

    /* renamed from: a */
    public void mo233474a(C67147f fVar) {
        if (fVar.f169315b == null) {
            throw new IllegalArgumentException("you must specify a way to create the tab indicator.");
        } else if (fVar.f169316c != null) {
            View a = fVar.f169315b.mo233497a();
            a.setOnKeyListener(this.f169307i);
            if (fVar.f169315b instanceof C67148g) {
                this.f169302d.setStripEnabled(false);
            }
            this.f169302d.addView(a);
            this.f169303e.add(fVar);
            this.f169304f.add(fVar);
        } else {
            throw new IllegalArgumentException("you must specify a way to create the tab content");
        }
    }

    public void setCurrentTabByTag(String str) {
        int size = this.f169303e.size();
        for (int i = 0; i < size; i++) {
            if (this.f169303e.get(i).mo233500a().equals(str)) {
                setCurrentTab(i);
                return;
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view;
        int i;
        int i2;
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0 && (view = this.f169305g) != null && view.hasFocus()) {
            int tabWidgetLocation = getTabWidgetLocation();
            int i3 = 2;
            if (tabWidgetLocation == 0) {
                i2 = 21;
                i = 17;
                i3 = 1;
            } else if (tabWidgetLocation == 2) {
                i2 = 22;
                i = 66;
                i3 = 3;
            } else if (tabWidgetLocation != 3) {
                i2 = 19;
                i = 33;
            } else {
                i2 = 20;
                i = 130;
                i3 = 4;
            }
            if (keyEvent.getKeyCode() == i2 && this.f169305g.findFocus().focusSearch(i) == null) {
                this.f169302d.getChildTabViewAt(this.f169300b).requestFocus();
                playSoundEffect(i3);
                return true;
            }
        }
        return dispatchKeyEvent;
    }

    public void setCurrentTab(int i) {
        int i2;
        if (i >= 0 && i < this.f169303e.size() && i != (i2 = this.f169300b)) {
            if (i2 != -1) {
                this.f169303e.get(i2).f169316c.mo233496b();
            }
            this.f169300b = i;
            this.f169302d.focusCurrentTab(this.f169300b);
            View a = this.f169303e.get(i).f169316c.mo233495a();
            this.f169305g = a;
            if (a.getParent() == null) {
                this.f169299a.addView(this.f169305g, new ViewGroup.LayoutParams(-1, -1));
            }
            if (!this.f169302d.hasFocus()) {
                this.f169305g.requestFocus();
            }
            m261753e();
        }
    }

    /* renamed from: d */
    public boolean mo233479d(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("TabHost", "removeTab tag is empty");
            return false;
        }
        int size = this.f169303e.size();
        int size2 = this.f169303e.size();
        this.f169302d.setCurrentTab(0);
        int i = -1;
        for (int i2 = 0; i2 < size2; i2++) {
            C67147f fVar = this.f169303e.get(i2);
            if (fVar != null && TextUtils.equals(str, fVar.f169314a)) {
                i = i2;
            }
        }
        if (i == -1) {
            AppBrandLogger.m52830i("TabHost", "removeTab removeIndex == -1,return");
            return false;
        } else if (i >= size - 1) {
            this.f169302d.removeViewAt(i);
            int i3 = this.f169300b;
            if (i3 > i) {
                this.f169300b = i3 - 1;
            }
            this.f169303e.remove(i);
            mo233478c();
            return true;
        } else {
            int tabCount = this.f169302d.getTabCount();
            int tabCount2 = this.f169302d.getTabCount() - 1;
            ArrayList arrayList = new ArrayList();
            for (int i4 = tabCount - 1; i4 >= i; i4--) {
                this.f169302d.removeViewAt(i4);
                if (i4 != i) {
                    arrayList.add(this.f169303e.get(i4).f169314a);
                }
            }
            int i5 = this.f169300b;
            if (i5 > i) {
                this.f169300b = i5 - 1;
            }
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                boolean z = false;
                for (int i7 = 0; i7 < this.f169303e.size(); i7++) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        } else if (this.f169303e.get(i7).f169314a.equals(arrayList.get(i8))) {
                            View a = this.f169303e.get(i7).f169315b.mo233497a();
                            a.setOnKeyListener(this.f169307i);
                            this.f169302d.addView(a);
                            arrayList.remove(i8);
                            z = true;
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
            this.f169303e.remove(i);
            mo233478c();
            if (this.f169302d.getTabCount() == tabCount2) {
                return true;
            }
            AppBrandLogger.m52829e("TabHost", "Some errors have occurred in remove tab widget");
            return false;
        }
    }

    public TabHost(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842883);
    }

    /* renamed from: b */
    private void m261751b(int i, C67147f fVar) {
        if (i > this.f169303e.size()) {
            this.f169303e.add(fVar);
        } else {
            this.f169303e.add(i, fVar);
        }
        if (i >= this.f169304f.size()) {
            this.f169304f.add(fVar);
        } else {
            this.f169304f.add(i, fVar);
        }
        mo233478c();
        int i2 = this.f169300b;
        if (i2 >= i) {
            this.f169300b = i2 + 1;
        }
    }

    /* renamed from: a */
    public boolean mo233475a(int i, C67147f fVar) {
        if (fVar.f169315b == null) {
            throw new IllegalArgumentException("you must specify a way to create the tab indicator.");
        } else if (fVar.f169316c != null) {
            View a = fVar.f169315b.mo233497a();
            a.setOnKeyListener(this.f169307i);
            if (fVar.f169315b instanceof C67148g) {
                this.f169302d.setStripEnabled(false);
            }
            if (i >= this.f169302d.getTabCount()) {
                this.f169302d.addView(a);
                m261751b(i, fVar);
                return true;
            }
            try {
                int tabCount = this.f169302d.getTabCount();
                int tabCount2 = this.f169302d.getTabCount() + 1;
                ArrayList arrayList = new ArrayList();
                for (int i2 = tabCount - 1; i2 >= i; i2--) {
                    this.f169302d.removeViewAt(i2);
                    arrayList.add(this.f169303e.get(i2).f169314a);
                }
                for (int i3 = 0; i3 < tabCount2 - i; i3++) {
                    if (i3 != 0) {
                        int i4 = 0;
                        boolean z = false;
                        while (true) {
                            if (i4 >= this.f169303e.size()) {
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList.size()) {
                                    break;
                                } else if (this.f169303e.get(i4).f169314a.equals(arrayList.get(i5))) {
                                    View a2 = this.f169303e.get(i4).f169315b.mo233497a();
                                    a2.setOnKeyListener(this.f169307i);
                                    this.f169302d.addView(a2);
                                    arrayList.remove(i5);
                                    z = true;
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            if (z) {
                                break;
                            }
                            i4++;
                        }
                    } else {
                        View a3 = fVar.f169315b.mo233497a();
                        a3.setOnKeyListener(this.f169307i);
                        this.f169302d.addView(a3);
                    }
                }
                if (this.f169302d.getTabCount() == tabCount2) {
                    m261751b(i, fVar);
                    return true;
                }
                m261752d();
                AppBrandLogger.m52829e("TabHost", "Some errors have occurred in adding tab widget");
                return false;
            } catch (Exception e) {
                m261752d();
                AppBrandLogger.stacktrace(6, "TabHost", e.getStackTrace());
                return false;
            }
        } else {
            throw new IllegalArgumentException("you must specify a way to create the tab content");
        }
    }

    public TabHost(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TabHost(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        this.f169303e = new ArrayList(2);
        this.f169304f = new ArrayList(2);
        this.f169300b = -1;
        this.f169305g = null;
        this.f169301c = null;
        mo233423a();
    }
}
