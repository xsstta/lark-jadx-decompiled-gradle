package com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.ss.android.lark.banner.export.broadcast.C29481a;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.c */
public class View$OnAttachStateChangeListenerC35527c implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private ViewTreeObserver.OnWindowFocusChangeListener f91831a;

    /* renamed from: b */
    private LifecycleObserver f91832b;

    /* renamed from: c */
    public FragmentActivity f91833c;

    /* renamed from: d */
    private View f91834d;

    /* renamed from: e */
    private Context f91835e;

    /* renamed from: c */
    private void m138948c() {
        View view = this.f91834d;
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: b */
    public void mo130970b() {
        View view = this.f91834d;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo130963a() {
        C29481a.m108561a(C35358a.m138143a().mo130143a(), "ContactsPermission");
    }

    public void onViewDetachedFromWindow(View view) {
        mo130971b(this.f91834d);
    }

    /* renamed from: a */
    public boolean mo130969a(Context context) {
        if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
        if (mo130969a(this.f91835e)) {
            mo130963a();
            mo130970b();
            return;
        }
        m138947a(this.f91834d, this.f91835e);
    }

    /* renamed from: b */
    public void mo130971b(View view) {
        FragmentActivity fragmentActivity = this.f91833c;
        if (fragmentActivity != null) {
            if (this.f91832b != null) {
                fragmentActivity.getLifecycle().removeObserver(this.f91832b);
            }
        } else if (this.f91831a != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnWindowFocusChangeListener(this.f91831a);
            }
        }
    }

    /* renamed from: a */
    public void mo130968a(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null && !mo130969a(context)) {
            this.f91834d = view;
            this.f91835e = context;
            Activity a = ViewUtils.m224142a(view);
            if (a instanceof FragmentActivity) {
                this.f91833c = (FragmentActivity) a;
            }
            m138948c();
        }
    }

    /* renamed from: a */
    private void m138947a(final View view, final Context context) {
        if (this.f91833c != null) {
            if (this.f91832b == null) {
                this.f91832b = new DetectContactPermissionHelper$1(this, context);
            }
            this.f91833c.getLifecycle().addObserver(this.f91832b);
            return;
        }
        if (this.f91831a == null) {
            this.f91831a = new ViewTreeObserver.OnWindowFocusChangeListener() {
                /* class com.ss.android.lark.contact.impl.contacts_banner.ug_banner.permission.View$OnAttachStateChangeListenerC35527c.ViewTreeObserver$OnWindowFocusChangeListenerC355281 */

                public void onWindowFocusChanged(boolean z) {
                    if (z && View$OnAttachStateChangeListenerC35527c.this.mo130969a(context)) {
                        View$OnAttachStateChangeListenerC35527c.this.mo130963a();
                        View$OnAttachStateChangeListenerC35527c.this.mo130971b(view);
                        View$OnAttachStateChangeListenerC35527c.this.mo130970b();
                    }
                }
            };
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnWindowFocusChangeListener(this.f91831a);
        }
    }
}
