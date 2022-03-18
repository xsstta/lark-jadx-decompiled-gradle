package com.tt.option.p3380a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import org.json.JSONObject;

/* renamed from: com.tt.option.a.b */
public abstract class AbstractC67595b {

    /* renamed from: a */
    protected String f170424a;

    /* renamed from: b */
    protected AbstractC67596a f170425b;

    /* renamed from: c */
    protected View f170426c;

    /* renamed from: com.tt.option.a.b$a */
    public interface AbstractC67596a {
    }

    /* renamed from: b */
    public abstract int mo234793b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract View mo234794b(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo234796d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo234798f() {
    }

    /* renamed from: g */
    public boolean mo234799g() {
        return false;
    }

    /* renamed from: a */
    public String mo234791a() {
        return this.f170424a;
    }

    /* renamed from: c */
    public void mo234795c() {
        mo234796d();
    }

    /* renamed from: e */
    public final void mo234797e() {
        mo234798f();
        View view = this.f170426c;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f170426c);
            }
            this.f170426c = null;
        }
        this.f170425b = null;
    }

    /* renamed from: a */
    public static JSONObject m263097a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(Uri.parse(str).getQueryParameter("bottom_bar"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo234792a(ViewGroup viewGroup) {
        View b = mo234794b(viewGroup);
        this.f170426c = b;
        if (b != null) {
            ViewParent parent = b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f170426c);
            }
            viewGroup.addView(this.f170426c, -1, -1);
        }
        if (this.f170426c != null) {
            return true;
        }
        return false;
    }
}
