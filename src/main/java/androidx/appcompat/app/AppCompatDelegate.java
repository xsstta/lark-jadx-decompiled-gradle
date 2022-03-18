package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ak;
import androidx.collection.C0513a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class AppCompatDelegate {

    /* renamed from: a */
    private static int f598a = -100;

    /* renamed from: b */
    private static final C0513a<WeakReference<AppCompatDelegate>> f599b = new C0513a<>();

    /* renamed from: c */
    private static final Object f600c = new Object();

    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    /* renamed from: a */
    public abstract ActionBar mo801a();

    /* renamed from: a */
    public abstract AbstractC0297b mo802a(AbstractC0297b.AbstractC0298a aVar);

    /* renamed from: a */
    public void mo803a(int i) {
    }

    /* renamed from: a */
    public void mo804a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo805a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo806a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo807a(View view);

    /* renamed from: a */
    public abstract void mo808a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo809a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo810a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo812b();

    /* renamed from: b */
    public abstract <T extends View> T mo813b(int i);

    /* renamed from: b */
    public abstract void mo814b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo815b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo816c();

    /* renamed from: c */
    public abstract void mo817c(int i);

    /* renamed from: c */
    public abstract void mo818c(Bundle bundle);

    /* renamed from: d */
    public abstract void mo819d();

    /* renamed from: d */
    public abstract boolean mo820d(int i);

    /* renamed from: e */
    public abstract void mo821e();

    /* renamed from: f */
    public abstract void mo822f();

    /* renamed from: g */
    public abstract void mo823g();

    /* renamed from: h */
    public abstract ActionBarDrawerToggle.AbstractC0219a mo824h();

    /* renamed from: i */
    public abstract void mo825i();

    /* renamed from: j */
    public abstract boolean mo826j();

    /* renamed from: k */
    public int mo827k() {
        return -100;
    }

    AppCompatDelegate() {
    }

    /* renamed from: l */
    public static int m732l() {
        return f598a;
    }

    /* renamed from: m */
    private static void mo848m() {
        synchronized (f600c) {
            Iterator<WeakReference<AppCompatDelegate>> it = f599b.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.mo826j();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m728a(boolean z) {
        ak.m1859a(z);
    }

    /* renamed from: b */
    public Context mo811b(Context context) {
        mo804a(context);
        return context;
    }

    /* renamed from: b */
    static void m729b(AppCompatDelegate appCompatDelegate) {
        synchronized (f600c) {
            m730c(appCompatDelegate);
        }
    }

    /* renamed from: a */
    static void m727a(AppCompatDelegate appCompatDelegate) {
        synchronized (f600c) {
            m730c(appCompatDelegate);
            f599b.add(new WeakReference<>(appCompatDelegate));
        }
    }

    /* renamed from: e */
    public static void m731e(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f598a != i) {
            f598a = i;
            mo848m();
        }
    }

    /* renamed from: c */
    private static void m730c(AppCompatDelegate appCompatDelegate) {
        synchronized (f600c) {
            Iterator<WeakReference<AppCompatDelegate>> it = f599b.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public static AppCompatDelegate m725a(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    /* renamed from: a */
    public static AppCompatDelegate m726a(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }
}
