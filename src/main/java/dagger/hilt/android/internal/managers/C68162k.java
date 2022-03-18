package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1168n;
import dagger.hilt.C68109a;
import dagger.hilt.android.internal.C68120a;
import dagger.hilt.android.internal.p3448a.AbstractC68124d;
import dagger.hilt.android.internal.p3448a.AbstractC68126f;
import dagger.hilt.internal.AbstractC68167b;
import dagger.hilt.internal.C68169d;

/* renamed from: dagger.hilt.android.internal.managers.k */
public final class C68162k implements AbstractC68167b<Object> {

    /* renamed from: a */
    private volatile Object f171398a;

    /* renamed from: b */
    private final Object f171399b;

    /* renamed from: c */
    private final boolean f171400c;

    /* renamed from: d */
    private final View f171401d;

    /* renamed from: dagger.hilt.android.internal.managers.k$b */
    public interface AbstractC68164b {
        /* renamed from: c */
        AbstractC68124d mo102465c();
    }

    /* renamed from: dagger.hilt.android.internal.managers.k$c */
    public interface AbstractC68165c {
        /* renamed from: e */
        AbstractC68126f mo102482e();
    }

    /* renamed from: dagger.hilt.android.internal.managers.k$a */
    public static final class C68163a extends ContextWrapper {

        /* renamed from: a */
        public Fragment f171402a;

        /* renamed from: b */
        public LayoutInflater f171403b;

        /* renamed from: c */
        public LayoutInflater f171404c;

        /* renamed from: d */
        private final AbstractC1168n f171405d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Fragment mo237053a() {
            C68169d.m264814a(this.f171402a, "The fragment has already been destroyed.");
            return this.f171402a;
        }

        @Override // android.content.Context, android.content.ContextWrapper
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f171404c == null) {
                if (this.f171403b == null) {
                    this.f171403b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f171404c = this.f171403b.cloneInContext(this);
            }
            return this.f171404c;
        }

        C68163a(Context context, Fragment fragment) {
            super((Context) C68169d.m264813a(context));
            ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
            this.f171405d = viewComponentManager$FragmentContextWrapper$1;
            this.f171403b = null;
            Fragment fragment2 = (Fragment) C68169d.m264813a(fragment);
            this.f171402a = fragment2;
            fragment2.getLifecycle().addObserver(viewComponentManager$FragmentContextWrapper$1);
        }

        C68163a(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) C68169d.m264813a(((LayoutInflater) C68169d.m264813a(layoutInflater)).getContext()));
            ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
            this.f171405d = viewComponentManager$FragmentContextWrapper$1;
            this.f171403b = layoutInflater;
            Fragment fragment2 = (Fragment) C68169d.m264813a(fragment);
            this.f171402a = fragment2;
            fragment2.getLifecycle().addObserver(viewComponentManager$FragmentContextWrapper$1);
        }
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public Object generatedComponent() {
        if (this.f171398a == null) {
            synchronized (this.f171399b) {
                if (this.f171398a == null) {
                    this.f171398a = m264809a();
                }
            }
        }
        return this.f171398a;
    }

    /* renamed from: a */
    private Object m264809a() {
        AbstractC68167b<?> a = m264808a(false);
        if (this.f171400c) {
            return ((AbstractC68165c) C68109a.m264750a(a, AbstractC68165c.class)).mo102482e().mo102495b(this.f171401d).mo102494b();
        }
        return ((AbstractC68164b) C68109a.m264750a(a, AbstractC68164b.class)).mo102465c().mo102486b(this.f171401d).mo102485b();
    }

    /* renamed from: a */
    private AbstractC68167b<?> m264808a(boolean z) {
        if (this.f171400c) {
            Context a = m264807a(C68163a.class, z);
            if (a instanceof C68163a) {
                return (AbstractC68167b) ((C68163a) a).mo237053a();
            }
            if (z) {
                return null;
            }
            Context a2 = m264807a(AbstractC68167b.class, z);
            C68169d.m264815a(!(a2 instanceof AbstractC68167b), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f171401d.getClass(), a2.getClass().getName());
        } else {
            Context a3 = m264807a(AbstractC68167b.class, z);
            if (a3 instanceof AbstractC68167b) {
                return (AbstractC68167b) a3;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.f171401d.getClass()));
    }

    /* renamed from: a */
    private static Context m264806a(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: a */
    private Context m264807a(Class<?> cls, boolean z) {
        Context a = m264806a(this.f171401d.getContext(), cls);
        if (a != C68120a.m264754a(a.getApplicationContext())) {
            return a;
        }
        C68169d.m264815a(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f171401d.getClass());
        return null;
    }
}
