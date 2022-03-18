package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import dagger.hilt.C68109a;
import dagger.hilt.android.internal.managers.C68162k;
import dagger.hilt.android.internal.p3448a.AbstractC68123c;
import dagger.hilt.internal.AbstractC68167b;
import dagger.hilt.internal.C68169d;

/* renamed from: dagger.hilt.android.internal.managers.g */
public class C68157g implements AbstractC68167b<Object> {

    /* renamed from: a */
    private volatile Object f171395a;

    /* renamed from: b */
    private final Object f171396b = new Object();

    /* renamed from: c */
    private final Fragment f171397c;

    /* renamed from: dagger.hilt.android.internal.managers.g$a */
    public interface AbstractC68158a {
        /* renamed from: b */
        AbstractC68123c mo102464b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo237052a(Fragment fragment) {
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public Object generatedComponent() {
        if (this.f171395a == null) {
            synchronized (this.f171396b) {
                if (this.f171395a == null) {
                    this.f171395a = m264803a();
                }
            }
        }
        return this.f171395a;
    }

    /* renamed from: a */
    private Object m264803a() {
        C68169d.m264814a(this.f171397c.getHost(), "Hilt Fragments must be attached before creating the component.");
        C68169d.m264815a(this.f171397c.getHost() instanceof AbstractC68167b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f171397c.getHost().getClass());
        mo237052a(this.f171397c);
        return ((AbstractC68158a) C68109a.m264750a(this.f171397c.getHost(), AbstractC68158a.class)).mo102464b().mo102475b(this.f171397c).mo102474b();
    }

    public C68157g(Fragment fragment) {
        this.f171397c = fragment;
    }

    /* renamed from: a */
    public static final Context m264800a(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: a */
    public static ContextWrapper m264801a(Context context, Fragment fragment) {
        return new C68162k.C68163a(context, fragment);
    }

    /* renamed from: a */
    public static ContextWrapper m264802a(LayoutInflater layoutInflater, Fragment fragment) {
        return new C68162k.C68163a(layoutInflater, fragment);
    }
}
