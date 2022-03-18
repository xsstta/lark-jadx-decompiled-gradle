package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import dagger.hilt.C68109a;
import dagger.hilt.android.internal.p3448a.AbstractC68121a;
import dagger.hilt.android.p3447a.AbstractC68114b;
import dagger.hilt.internal.AbstractC68167b;

/* renamed from: dagger.hilt.android.internal.managers.a */
public class C68145a implements AbstractC68167b<Object> {

    /* renamed from: a */
    protected final Activity f171381a;

    /* renamed from: b */
    private volatile Object f171382b;

    /* renamed from: c */
    private final Object f171383c = new Object();

    /* renamed from: d */
    private final AbstractC68167b<AbstractC68114b> f171384d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    public interface AbstractC68146a {
        /* renamed from: a */
        AbstractC68121a mo102468a();
    }

    @Override // dagger.hilt.internal.AbstractC68167b
    public Object generatedComponent() {
        if (this.f171382b == null) {
            synchronized (this.f171383c) {
                if (this.f171382b == null) {
                    this.f171382b = mo237047a();
                }
            }
        }
        return this.f171382b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo237047a() {
        if (this.f171381a.getApplication() instanceof AbstractC68167b) {
            return ((AbstractC68146a) C68109a.m264750a(this.f171384d, AbstractC68146a.class)).mo102468a().mo102459b(this.f171381a).mo102458b();
        }
        if (Application.class.equals(this.f171381a.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + this.f171381a.getApplication().getClass());
    }

    public C68145a(Activity activity) {
        this.f171381a = activity;
        this.f171384d = new C68147b((ComponentActivity) activity);
    }
}
