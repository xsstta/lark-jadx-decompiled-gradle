package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ViewModelStoreOwner;
import dagger.hilt.C68109a;
import dagger.hilt.android.AbstractC68111a;
import dagger.hilt.android.C68119b;
import dagger.hilt.android.internal.C68127b;
import dagger.hilt.android.internal.p3448a.AbstractC68122b;
import dagger.hilt.android.p3447a.AbstractC68114b;
import dagger.hilt.internal.AbstractC68167b;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;

/* access modifiers changed from: package-private */
/* renamed from: dagger.hilt.android.internal.managers.b */
public final class C68147b implements AbstractC68167b<AbstractC68114b> {

    /* renamed from: a */
    private final C1144ai f171385a;

    /* renamed from: b */
    private volatile AbstractC68114b f171386b;

    /* renamed from: c */
    private final Object f171387c = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.b$a */
    public interface AbstractC68149a {
        /* renamed from: f */
        AbstractC68122b mo102455f();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$c */
    public interface AbstractC68151c {
        /* renamed from: b */
        AbstractC68111a mo102469b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dagger.hilt.android.internal.managers.b$b */
    public static final class C68150b extends AbstractC1142af {
        private final AbstractC68114b component;

        /* access modifiers changed from: package-private */
        public AbstractC68114b getComponent() {
            return this.component;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC1142af
        public void onCleared() {
            super.onCleared();
            ((C68152d) ((AbstractC68151c) C68109a.m264750a(this.component, AbstractC68151c.class)).mo102469b()).mo237050a();
        }

        C68150b(AbstractC68114b bVar) {
            this.component = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dagger.hilt.android.internal.managers.b$d */
    public static final class C68152d implements AbstractC68111a {

        /* renamed from: a */
        private final Set<AbstractC68111a.AbstractC68112a> f171390a = new HashSet();

        /* renamed from: b */
        private boolean f171391b = false;

        @Inject
        C68152d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo237050a() {
            C68127b.m264767b();
            this.f171391b = true;
            for (AbstractC68111a.AbstractC68112a aVar : this.f171390a) {
                aVar.mo237038a();
            }
        }
    }

    /* renamed from: b */
    private AbstractC68114b m264791b() {
        return ((C68150b) this.f171385a.mo6005a(C68150b.class)).getComponent();
    }

    /* renamed from: a */
    public AbstractC68114b generatedComponent() {
        if (this.f171386b == null) {
            synchronized (this.f171387c) {
                if (this.f171386b == null) {
                    this.f171386b = m264791b();
                }
            }
        }
        return this.f171386b;
    }

    C68147b(ComponentActivity componentActivity) {
        this.f171385a = m264790a(componentActivity, componentActivity);
    }

    /* renamed from: a */
    private C1144ai m264790a(ViewModelStoreOwner viewModelStoreOwner, final Context context) {
        return new C1144ai(viewModelStoreOwner, new C1144ai.AbstractC1146b() {
            /* class dagger.hilt.android.internal.managers.C68147b.C681481 */

            @Override // androidx.lifecycle.C1144ai.AbstractC1146b
            public <T extends AbstractC1142af> T create(Class<T> cls) {
                return new C68150b(((AbstractC68149a) C68119b.m264753a(context, AbstractC68149a.class)).mo102455f().mo102467b());
            }
        });
    }
}
