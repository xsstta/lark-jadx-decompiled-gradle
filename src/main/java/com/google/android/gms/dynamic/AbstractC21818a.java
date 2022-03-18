package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.internal.C21743d;
import com.google.android.gms.dynamic.AbstractC21820b;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class AbstractC21818a<T extends AbstractC21820b> {

    /* renamed from: a */
    private T f53227a;

    /* renamed from: b */
    private Bundle f53228b;

    /* renamed from: c */
    private LinkedList<AbstractC21819a> f53229c;

    /* renamed from: d */
    private final AbstractC21821c<T> f53230d = new C21822d(this);

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.dynamic.a$a */
    public interface AbstractC21819a {
        /* renamed from: a */
        int mo73890a();

        /* renamed from: a */
        void mo73891a(AbstractC21820b bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73881a(AbstractC21821c<T> cVar);

    /* renamed from: a */
    public T mo73877a() {
        return this.f53227a;
    }

    /* renamed from: a */
    private final void m79104a(int i) {
        while (!this.f53229c.isEmpty() && this.f53229c.getLast().mo73890a() >= i) {
            this.f53229c.removeLast();
        }
    }

    /* renamed from: a */
    private final void m79105a(Bundle bundle, AbstractC21819a aVar) {
        T t = this.f53227a;
        if (t != null) {
            aVar.mo73891a(t);
            return;
        }
        if (this.f53229c == null) {
            this.f53229c = new LinkedList<>();
        }
        this.f53229c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f53228b;
            if (bundle2 == null) {
                this.f53228b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo73881a(this.f53230d);
    }

    /* renamed from: a */
    public void mo73878a(Activity activity, Bundle bundle, Bundle bundle2) {
        m79105a(bundle2, new C21823e(this, activity, bundle, bundle2));
    }

    /* renamed from: a */
    public void mo73879a(Bundle bundle) {
        m79105a(bundle, new C21824f(this, bundle));
    }

    /* renamed from: a */
    public View mo73876a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        m79105a(bundle, new C21825g(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f53227a == null) {
            mo73880a(frameLayout);
        }
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73880a(FrameLayout frameLayout) {
        m79107b(frameLayout);
    }

    /* renamed from: b */
    public static void m79107b(FrameLayout frameLayout) {
        C21608a a = C21608a.m78228a();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = a.isGooglePlayServicesAvailable(context);
        String c = C21743d.m78971c(context, isGooglePlayServicesAvailable);
        String e = C21743d.m78973e(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = a.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new View$OnClickListenerC21826h(context, errorResolutionIntent));
        }
    }

    /* renamed from: b */
    public void mo73882b() {
        m79105a((Bundle) null, new C21827i(this));
    }

    /* renamed from: c */
    public void mo73884c() {
        m79105a((Bundle) null, new C21828j(this));
    }

    /* renamed from: d */
    public void mo73885d() {
        T t = this.f53227a;
        if (t != null) {
            t.mo73898c();
        } else {
            m79104a(5);
        }
    }

    /* renamed from: e */
    public void mo73886e() {
        T t = this.f53227a;
        if (t != null) {
            t.mo73899d();
        } else {
            m79104a(4);
        }
    }

    /* renamed from: f */
    public void mo73887f() {
        T t = this.f53227a;
        if (t != null) {
            t.mo73900e();
        } else {
            m79104a(2);
        }
    }

    /* renamed from: g */
    public void mo73888g() {
        T t = this.f53227a;
        if (t != null) {
            t.mo73901f();
        } else {
            m79104a(1);
        }
    }

    /* renamed from: b */
    public void mo73883b(Bundle bundle) {
        T t = this.f53227a;
        if (t != null) {
            t.mo73897b(bundle);
            return;
        }
        Bundle bundle2 = this.f53228b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    /* renamed from: h */
    public void mo73889h() {
        T t = this.f53227a;
        if (t != null) {
            t.mo73902g();
        }
    }
}
