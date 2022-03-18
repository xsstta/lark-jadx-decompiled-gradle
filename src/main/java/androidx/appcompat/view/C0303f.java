package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.view.menu.MenuItemC0328i;
import androidx.appcompat.widget.C0427af;
import androidx.appcompat.widget.C0460p;
import androidx.core.p026a.p027a.AbstractMenuC0707a;
import androidx.core.view.AbstractC0894b;
import androidx.core.view.C0907i;
import com.larksuite.suite.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.view.f */
public class C0303f extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f887a;

    /* renamed from: b */
    static final Class<?>[] f888b;

    /* renamed from: c */
    final Object[] f889c;

    /* renamed from: d */
    final Object[] f890d;

    /* renamed from: e */
    Context f891e;

    /* renamed from: f */
    private Object f892f;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.f$b */
    public class C0305b {

        /* renamed from: A */
        private String f896A;

        /* renamed from: B */
        private String f897B;

        /* renamed from: C */
        private CharSequence f898C;

        /* renamed from: D */
        private CharSequence f899D;

        /* renamed from: E */
        private ColorStateList f900E;

        /* renamed from: F */
        private PorterDuff.Mode f901F;

        /* renamed from: a */
        AbstractC0894b f902a;

        /* renamed from: c */
        private Menu f904c;

        /* renamed from: d */
        private int f905d;

        /* renamed from: e */
        private int f906e;

        /* renamed from: f */
        private int f907f;

        /* renamed from: g */
        private int f908g;

        /* renamed from: h */
        private boolean f909h;

        /* renamed from: i */
        private boolean f910i;

        /* renamed from: j */
        private boolean f911j;

        /* renamed from: k */
        private int f912k;

        /* renamed from: l */
        private int f913l;

        /* renamed from: m */
        private CharSequence f914m;

        /* renamed from: n */
        private CharSequence f915n;

        /* renamed from: o */
        private int f916o;

        /* renamed from: p */
        private char f917p;

        /* renamed from: q */
        private int f918q;

        /* renamed from: r */
        private char f919r;

        /* renamed from: s */
        private int f920s;

        /* renamed from: t */
        private int f921t;

        /* renamed from: u */
        private boolean f922u;

        /* renamed from: v */
        private boolean f923v;

        /* renamed from: w */
        private boolean f924w;

        /* renamed from: x */
        private int f925x;

        /* renamed from: y */
        private int f926y;

        /* renamed from: z */
        private String f927z;

        /* renamed from: d */
        public boolean mo1189d() {
            return this.f911j;
        }

        /* renamed from: a */
        public void mo1184a() {
            this.f905d = 0;
            this.f906e = 0;
            this.f907f = 0;
            this.f908g = 0;
            this.f909h = true;
            this.f910i = true;
        }

        /* renamed from: b */
        public void mo1186b() {
            this.f911j = true;
            m1206a(this.f904c.add(this.f905d, this.f912k, this.f913l, this.f914m));
        }

        /* renamed from: c */
        public SubMenu mo1188c() {
            this.f911j = true;
            SubMenu addSubMenu = this.f904c.addSubMenu(this.f905d, this.f912k, this.f913l, this.f914m);
            m1206a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        private char m1204a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        public void mo1185a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0303f.this.f891e.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842960, 16843156, 16843230, 16843231, 16843232});
            this.f905d = obtainStyledAttributes.getResourceId(1, 0);
            this.f906e = obtainStyledAttributes.getInt(3, 0);
            this.f907f = obtainStyledAttributes.getInt(4, 0);
            this.f908g = obtainStyledAttributes.getInt(5, 0);
            this.f909h = obtainStyledAttributes.getBoolean(2, true);
            this.f910i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m1206a(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f922u).setVisible(this.f923v).setEnabled(this.f924w);
            boolean z2 = false;
            if (this.f921t >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f915n).setIcon(this.f916o);
            int i = this.f925x;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f897B != null) {
                if (!C0303f.this.f891e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0304a(C0303f.this.mo1181a(), this.f897B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f921t >= 2) {
                if (menuItem instanceof C0326h) {
                    ((C0326h) menuItem).mo1466a(true);
                } else if (menuItem instanceof MenuItemC0328i) {
                    ((MenuItemC0328i) menuItem).mo1522a(true);
                }
            }
            String str = this.f927z;
            if (str != null) {
                menuItem.setActionView((View) m1205a(str, C0303f.f887a, C0303f.this.f889c));
                z2 = true;
            }
            int i2 = this.f926y;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0894b bVar = this.f902a;
            if (bVar != null) {
                C0907i.m4359a(menuItem, bVar);
            }
            C0907i.m4363a(menuItem, this.f898C);
            C0907i.m4365b(menuItem, this.f899D);
            C0907i.m4364b(menuItem, this.f917p, this.f918q);
            C0907i.m4360a(menuItem, this.f919r, this.f920s);
            PorterDuff.Mode mode = this.f901F;
            if (mode != null) {
                C0907i.m4362a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f900E;
            if (colorStateList != null) {
                C0907i.m4361a(menuItem, colorStateList);
            }
        }

        /* renamed from: b */
        public void mo1187b(AttributeSet attributeSet) {
            C0427af a = C0427af.m1777a(C0303f.this.f891e, attributeSet, new int[]{16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText});
            this.f912k = a.mo2491g(2, 0);
            this.f913l = (a.mo2474a(5, this.f906e) & -65536) | (a.mo2474a(6, this.f907f) & 65535);
            this.f914m = a.mo2484c(7);
            this.f915n = a.mo2484c(8);
            this.f916o = a.mo2491g(0, 0);
            this.f917p = m1204a(a.mo2486d(9));
            this.f918q = a.mo2474a(16, 4096);
            this.f919r = m1204a(a.mo2486d(10));
            this.f920s = a.mo2474a(20, 4096);
            if (a.mo2492g(11)) {
                this.f921t = a.mo2478a(11, false) ? 1 : 0;
            } else {
                this.f921t = this.f908g;
            }
            this.f922u = a.mo2478a(3, false);
            this.f923v = a.mo2478a(4, this.f909h);
            boolean z = true;
            this.f924w = a.mo2478a(1, this.f910i);
            this.f925x = a.mo2474a(21, -1);
            this.f897B = a.mo2486d(12);
            this.f926y = a.mo2491g(13, 0);
            this.f927z = a.mo2486d(15);
            String d = a.mo2486d(14);
            this.f896A = d;
            if (d == null) {
                z = false;
            }
            if (z && this.f926y == 0 && this.f927z == null) {
                this.f902a = (AbstractC0894b) m1205a(d, C0303f.f888b, C0303f.this.f890d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f902a = null;
            }
            this.f898C = a.mo2484c(17);
            this.f899D = a.mo2484c(22);
            if (a.mo2492g(19)) {
                this.f901F = C0460p.m2058a(a.mo2474a(19, -1), this.f901F);
            } else {
                this.f901F = null;
            }
            if (a.mo2492g(18)) {
                this.f900E = a.mo2488e(18);
            } else {
                this.f900E = null;
            }
            a.mo2482b();
            this.f911j = false;
        }

        public C0305b(Menu menu) {
            this.f904c = menu;
            mo1184a();
        }

        /* renamed from: a */
        private <T> T m1205a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0303f.this.f891e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f887a = clsArr;
        f888b = clsArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo1181a() {
        if (this.f892f == null) {
            this.f892f = m1201a(this.f891e);
        }
        return this.f892f;
    }

    public C0303f(Context context) {
        super(context);
        this.f891e = context;
        Object[] objArr = {context};
        this.f889c = objArr;
        this.f890d = objArr;
    }

    /* renamed from: a */
    private Object m1201a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return m1201a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.f$a */
    public static class MenuItem$OnMenuItemClickListenerC0304a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f893a = {MenuItem.class};

        /* renamed from: b */
        private Object f894b;

        /* renamed from: c */
        private Method f895c;

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f895c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f895c.invoke(this.f894b, menuItem)).booleanValue();
                }
                this.f895c.invoke(this.f894b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public MenuItem$OnMenuItemClickListenerC0304a(Object obj, String str) {
            this.f894b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f895c = cls.getMethod(str, f893a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC0707a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f891e.getResources().getLayout(i);
            m1202a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m1202a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C0305b bVar = new C0305b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo1184a();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo1189d()) {
                                if (bVar.f902a == null || !bVar.f902a.mo1580c()) {
                                    bVar.mo1186b();
                                } else {
                                    bVar.mo1188c();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo1185a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo1187b(attributeSet);
                    } else if (name3.equals("menu")) {
                        m1202a(xmlPullParser, attributeSet, bVar.mo1188c());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }
}
