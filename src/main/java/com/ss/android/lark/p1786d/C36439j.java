package com.ss.android.lark.p1786d;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.C0905g;
import com.by.inflate_lib.AbstractC2604b;
import com.by.inflate_lib.C2606c;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.ss.android.lark.d.j */
public class C36439j extends LayoutInflater {

    /* renamed from: a */
    private static Looper f93986a = Looper.getMainLooper();

    /* renamed from: b */
    private LayoutInflater f93987b;

    /* renamed from: c */
    private C36442b f93988c = new C36442b();

    /* renamed from: d */
    private volatile C36441a f93989d;

    /* renamed from: e */
    private volatile Context f93990e;

    /* renamed from: com.ss.android.lark.d.j$b */
    private static class C36442b {
        private C36442b() {
        }

        /* renamed from: a */
        public View mo134314a(int i, ViewGroup viewGroup, boolean z, Context context) {
            AbstractC2604b a = C2606c.m10964a(i);
            if (a == null) {
                return null;
            }
            try {
                return a.mo11274a(context, viewGroup, z);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    private static boolean m143594c() {
        if (f93986a == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C36441a m143592b() {
        if (this.f93989d == null) {
            m143593c(getContext());
        }
        return this.f93989d;
    }

    /* renamed from: a */
    public Context mo134307a() {
        if (this.f93990e == null) {
            m143593c(getContext());
        }
        return this.f93990e;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.d.j$a */
    public static class C36441a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f93991a = {"android.widget.", "android.webkit.", "android.app."};

        /* renamed from: b */
        private final C36439j f93992b;

        public LayoutInflater cloneInContext(Context context) {
            return this.f93992b.cloneInContext(context);
        }

        public C36441a(Context context, C36439j jVar) {
            super(context);
            this.f93992b = jVar;
            if (context instanceof AppCompatActivity) {
                AppCompatDelegate delegate = ((AppCompatActivity) context).getDelegate();
                if (delegate instanceof LayoutInflater.Factory2) {
                    C0905g.m4353a(this, (LayoutInflater.Factory2) delegate);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View view = null;
            for (String str2 : f93991a) {
                try {
                    view = createView(str, str2, attributeSet);
                    if (view != null) {
                        break;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            if (view == null) {
                return super.onCreateView(str, attributeSet);
            }
            return view;
        }
    }

    /* renamed from: a */
    public static LayoutInflater m143590a(Context context) {
        return new C36439j(context, m143591b(context));
    }

    /* renamed from: b */
    private static LayoutInflater m143591b(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("real_layout_inflater");
        if (layoutInflater == null) {
            return LayoutInflater.from(context);
        }
        return layoutInflater;
    }

    public LayoutInflater cloneInContext(Context context) {
        return new C36439j(context, this.f93987b.cloneInContext(context));
    }

    /* renamed from: c */
    private void m143593c(Context context) {
        this.f93990e = new C36437h(C36431c.m143577a(context.getApplicationContext()));
        this.f93989d = new C36441a(this.f93990e, this);
    }

    @Override // android.view.LayoutInflater
    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        return super.inflate(xmlPullParser, viewGroup);
    }

    protected C36439j(Context context, LayoutInflater layoutInflater) {
        super(context);
        this.f93987b = layoutInflater;
        if (f93986a != Looper.myLooper()) {
            m143593c(context);
        }
    }

    @Override // android.view.LayoutInflater
    public View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        if (m143594c()) {
            return this.f93987b.inflate(xmlPullParser, viewGroup, z);
        }
        return m143592b().inflate(xmlPullParser, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public View inflate(int i, ViewGroup viewGroup, boolean z) {
        if (m143594c()) {
            View a = this.f93988c.mo134314a(i, viewGroup, z, getContext());
            if (a == null) {
                return this.f93987b.inflate(i, viewGroup, z);
            }
            return a;
        }
        View a2 = this.f93988c.mo134314a(i, viewGroup, z, mo134307a());
        if (a2 == null) {
            return m143592b().inflate(i, viewGroup, z);
        }
        return a2;
    }
}
