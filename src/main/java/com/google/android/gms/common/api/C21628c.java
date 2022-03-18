package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21615d;
import com.google.android.gms.common.api.internal.AbstractC21673h;
import com.google.android.gms.common.api.internal.AbstractC21675j;
import com.google.android.gms.common.api.internal.AbstractC21677l;
import com.google.android.gms.common.api.internal.AbstractC21679n;
import com.google.android.gms.common.api.internal.C21644a;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.common.api.internal.C21684s;
import com.google.android.gms.common.api.internal.bd;
import com.google.android.gms.common.api.internal.cc;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.c */
public class C21628c<O extends C21611a.AbstractC21615d> {

    /* renamed from: a */
    protected final C21661c f52565a;

    /* renamed from: b */
    private final Context f52566b;

    /* renamed from: c */
    private final C21611a<O> f52567c;

    /* renamed from: d */
    private final O f52568d;

    /* renamed from: e */
    private final cc<O> f52569e;

    /* renamed from: f */
    private final Looper f52570f;

    /* renamed from: g */
    private final int f52571g;

    /* renamed from: h */
    private final AbstractC21631d f52572h;

    /* renamed from: i */
    private final AbstractC21675j f52573i;

    /* renamed from: com.google.android.gms.common.api.c$a */
    public static class C21629a {

        /* renamed from: a */
        public static final C21629a f52574a = new C21630a().mo73260a();

        /* renamed from: b */
        public final AbstractC21675j f52575b;

        /* renamed from: c */
        public final Looper f52576c;

        /* renamed from: com.google.android.gms.common.api.c$a$a */
        public static class C21630a {

            /* renamed from: a */
            private AbstractC21675j f52577a;

            /* renamed from: b */
            private Looper f52578b;

            /* renamed from: a */
            public C21630a mo73259a(AbstractC21675j jVar) {
                Preconditions.checkNotNull(jVar, "StatusExceptionMapper must not be null.");
                this.f52577a = jVar;
                return this;
            }

            /* renamed from: a */
            public C21630a mo73258a(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.f52578b = looper;
                return this;
            }

            /* renamed from: a */
            public C21629a mo73260a() {
                if (this.f52577a == null) {
                    this.f52577a = new C21644a();
                }
                if (this.f52578b == null) {
                    this.f52578b = Looper.getMainLooper();
                }
                return new C21629a(this.f52577a, this.f52578b);
            }
        }

        private C21629a(AbstractC21675j jVar, Account account, Looper looper) {
            this.f52575b = jVar;
            this.f52576c = looper;
        }
    }

    protected C21628c(Context context, C21611a<O> aVar, Looper looper) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(aVar, "Api must not be null.");
        Preconditions.checkNotNull(looper, "Looper must not be null.");
        Context applicationContext = context.getApplicationContext();
        this.f52566b = applicationContext;
        this.f52567c = aVar;
        this.f52568d = null;
        this.f52570f = looper;
        this.f52569e = cc.m78610a(aVar);
        this.f52572h = new bd(this);
        C21661c a = C21661c.m78523a(applicationContext);
        this.f52565a = a;
        this.f52571g = a.mo73422c();
        this.f52573i = new C21644a();
    }

    public C21628c(Activity activity, C21611a<O> aVar, O o, C21629a aVar2) {
        Preconditions.checkNotNull(activity, "Null activity is not permitted.");
        Preconditions.checkNotNull(aVar, "Api must not be null.");
        Preconditions.checkNotNull(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        this.f52566b = applicationContext;
        this.f52567c = aVar;
        this.f52568d = o;
        this.f52570f = aVar2.f52576c;
        cc<O> a = cc.m78611a(aVar, o);
        this.f52569e = a;
        this.f52572h = new bd(this);
        C21661c a2 = C21661c.m78523a(applicationContext);
        this.f52565a = a2;
        this.f52571g = a2.mo73422c();
        this.f52573i = aVar2.f52575b;
        if (!(activity instanceof GoogleApiActivity)) {
            C21684s.m78767a(activity, a2, (cc<?>) a);
        }
        a2.mo73415a((C21628c<?>) this);
    }

    public C21628c(Context context, C21611a<O> aVar, O o, C21629a aVar2) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(aVar, "Api must not be null.");
        Preconditions.checkNotNull(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f52566b = applicationContext;
        this.f52567c = aVar;
        this.f52568d = o;
        this.f52570f = aVar2.f52576c;
        this.f52569e = cc.m78611a(aVar, o);
        this.f52572h = new bd(this);
        C21661c a = C21661c.m78523a(applicationContext);
        this.f52565a = a;
        this.f52571g = a.mo73422c();
        this.f52573i = aVar2.f52575b;
        a.mo73415a((C21628c<?>) this);
    }

    public C21628c(Activity activity, C21611a<O> aVar, O o, AbstractC21675j jVar) {
        this(activity, (C21611a) aVar, (C21611a.AbstractC21615d) o, new C21629a.C21630a().mo73259a(jVar).mo73258a(activity.getMainLooper()).mo73260a());
    }

    public C21628c(Context context, C21611a<O> aVar, O o, AbstractC21675j jVar) {
        this(context, aVar, o, new C21629a.C21630a().mo73259a(jVar).mo73260a());
    }

    /* renamed from: a */
    private final <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T m78262a(int i, T t) {
        t.mo73318h();
        this.f52565a.mo73416a(this, i, t);
        return t;
    }

    /* renamed from: a */
    private final <TResult, A extends C21611a.AbstractC21613b> Task<TResult> m78263a(int i, AbstractC21677l<A, TResult> lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f52565a.mo73417a(this, i, lVar, taskCompletionSource, this.f52573i);
        return taskCompletionSource.getTask();
    }

    /* renamed from: a */
    public <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73244a(T t) {
        return (T) m78262a(0, t);
    }

    /* renamed from: a */
    public <TResult, A extends C21611a.AbstractC21613b> Task<TResult> mo73248a(AbstractC21677l<A, TResult> lVar) {
        return m78263a(0, lVar);
    }

    /* renamed from: b */
    public <A extends C21611a.AbstractC21613b, T extends C21655b.AbstractC21656a<? extends AbstractC21641i, A>> T mo73249b(T t) {
        return (T) m78262a(1, t);
    }

    /* renamed from: a */
    public <A extends C21611a.AbstractC21613b, T extends AbstractC21673h<A, ?>, U extends AbstractC21679n<A, ?>> Task<Void> mo73247a(T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.mo73489a(), "Listener has already been released.");
        Preconditions.checkNotNull(u.mo73496a(), "Listener has already been released.");
        Preconditions.checkArgument(t.mo73489a().equals(u.mo73496a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f52565a.mo73413a(this, t, u);
    }

    /* renamed from: a */
    public Task<Boolean> mo73246a(C21668f.C21669a<?> aVar) {
        Preconditions.checkNotNull(aVar, "Listener key cannot be null.");
        return this.f52565a.mo73412a(this, aVar);
    }

    /* renamed from: a */
    public C21611a.AbstractC21622f mo73243a(Looper looper, C21661c.C21662a<O> aVar) {
        return this.f52567c.mo73221b().mo72954a(this.f52566b, looper, mo73257j().mo73701a(), this.f52568d, aVar, aVar);
    }

    /* renamed from: c */
    public final C21611a<O> mo73250c() {
        return this.f52567c;
    }

    /* renamed from: d */
    public O mo73251d() {
        return this.f52568d;
    }

    /* renamed from: e */
    public final cc<O> mo73252e() {
        return this.f52569e;
    }

    /* renamed from: f */
    public final int mo73253f() {
        return this.f52571g;
    }

    /* renamed from: g */
    public AbstractC21631d mo73254g() {
        return this.f52572h;
    }

    /* renamed from: h */
    public Looper mo73255h() {
        return this.f52570f;
    }

    /* renamed from: i */
    public Context mo73256i() {
        return this.f52566b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C21740c.C21741a mo73257j() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        C21740c.C21741a aVar = new C21740c.C21741a();
        O o = this.f52568d;
        if (!(o instanceof C21611a.AbstractC21615d.AbstractC21617b) || (a2 = ((C21611a.AbstractC21615d.AbstractC21617b) o).mo73225a()) == null) {
            O o2 = this.f52568d;
            account = o2 instanceof C21611a.AbstractC21615d.AbstractC21616a ? ((C21611a.AbstractC21615d.AbstractC21616a) o2).mo73224a() : null;
        } else {
            account = a2.mo73031d();
        }
        C21740c.C21741a a3 = aVar.mo73698a(account);
        O o3 = this.f52568d;
        if (!(o3 instanceof C21611a.AbstractC21615d.AbstractC21617b) || (a = ((C21611a.AbstractC21615d.AbstractC21617b) o3).mo73225a()) == null) {
            set = Collections.emptySet();
        } else {
            set = a.mo73040k();
        }
        return a3.mo73700a(set).mo73702b(this.f52566b.getClass().getName()).mo73699a(this.f52566b.getPackageName());
    }

    /* renamed from: a */
    public zace mo73245a(Context context, Handler handler) {
        return new zace(context, handler, mo73257j().mo73701a());
    }
}
