package com.ss.android.lark.p1820e;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.e.c */
public class C36913c {

    /* renamed from: b */
    private static Map<String, C36913c> f94904b = new HashMap();

    /* renamed from: a */
    public AbstractC36916a f94905a;

    /* renamed from: c */
    private final HashMap<String, WeakReference<AbstractC36916a>> f94906c = new HashMap<>();

    /* renamed from: d */
    private final String f94907d;

    /* renamed from: e */
    private Disposable f94908e;

    /* renamed from: com.ss.android.lark.e.c$a */
    public interface AbstractC36916a {
        /* renamed from: a */
        C36894a.AbstractC36896a mo122663a();

        /* renamed from: b */
        String mo122664b();

        /* renamed from: c */
        int mo122665c();

        /* renamed from: d */
        int mo122666d();

        /* renamed from: e */
        String mo122667e();
    }

    /* renamed from: c */
    public AbstractC36916a mo136290c() {
        return this.f94905a;
    }

    /* renamed from: d */
    private void m145736d() {
        Iterator<Map.Entry<String, WeakReference<AbstractC36916a>>> it = this.f94906c.entrySet().iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC36916a> value = it.next().getValue();
            if (value == null || value.get() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public void mo136289b() {
        mo136286a();
        this.f94906c.clear();
        f94904b.remove(this.f94907d);
    }

    /* renamed from: a */
    public void mo136286a() {
        Disposable disposable = this.f94908e;
        if (disposable != null) {
            disposable.dispose();
            this.f94908e = null;
        }
    }

    private C36913c(String str) {
        this.f94907d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m145735b(AbstractC36916a aVar) throws Exception {
        if (aVar == null || TextUtils.isEmpty(aVar.mo122664b())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Observable<Void> mo136285a(AbstractC36916a aVar) {
        return Observable.create(new ObservableOnSubscribe(aVar) {
            /* class com.ss.android.lark.p1820e.$$Lambda$c$j4ZJC1fV5rda7C_1cEnbK1oHdIA */
            public final /* synthetic */ C36913c.AbstractC36916a f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C36913c.this.m145733a((C36913c) this.f$1, (C36913c.AbstractC36916a) observableEmitter);
            }
        });
    }

    /* renamed from: a */
    public static C36913c m145732a(Context context) {
        String obj = context.toString();
        if (!f94904b.containsKey(obj)) {
            f94904b.put(obj, new C36913c(obj));
        }
        return f94904b.get(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC36916a m145734b(String str) throws Exception {
        WeakReference<AbstractC36916a> weakReference = this.f94906c.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public float mo136284a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return C36894a.m145605a().mo136203b(str);
    }

    /* renamed from: a */
    public void mo136288a(List<String> list) {
        m145736d();
        this.f94908e = Observable.fromIterable(list).map(new Function() {
            /* class com.ss.android.lark.p1820e.$$Lambda$c$z8xthhPa_E_uI64P3ARfOMU1jmM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C36913c.this.m145734b((String) obj);
            }
        }).filter($$Lambda$c$PNS5qb1E503hAnQDnFOZXHTeugE.INSTANCE).concatMap(new Function<AbstractC36916a, ObservableSource<Void>>() {
            /* class com.ss.android.lark.p1820e.C36913c.C369141 */

            /* renamed from: a */
            public ObservableSource<Void> apply(AbstractC36916a aVar) throws Exception {
                return C36913c.this.mo136285a(aVar);
            }
        }).subscribe();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m145733a(final AbstractC36916a aVar, final ObservableEmitter observableEmitter) throws Exception {
        String b = aVar.mo122664b();
        final C36894a.AbstractC36896a a = aVar.mo122663a();
        C36894a a2 = C36894a.m145605a();
        if (a2.mo136202a(b)) {
            Disposable disposable = this.f94908e;
            if (disposable != null) {
                disposable.dispose();
            }
            a2.mo136205c();
            observableEmitter.onComplete();
            return;
        }
        a2.mo136198a(aVar, new C36894a.AbstractC36896a() {
            /* class com.ss.android.lark.p1820e.C36913c.C369152 */

            @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
            /* renamed from: b */
            public void mo122675b() {
                a.mo122675b();
            }

            @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
            /* renamed from: c */
            public void mo122676c() {
                a.mo122676c();
            }

            @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
            /* renamed from: a */
            public void mo122673a() {
                a.mo122673a();
                C36913c.this.f94905a = aVar;
            }

            @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
            /* renamed from: d */
            public void mo122677d() {
                a.mo122677d();
                observableEmitter.onComplete();
                C36913c.this.f94905a = null;
            }

            @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
            /* renamed from: e */
            public void mo122678e() {
                a.mo122678e();
                C36913c.this.f94905a = null;
            }

            @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
            /* renamed from: a */
            public void mo122674a(float f) {
                a.mo122674a(f);
            }
        });
    }

    /* renamed from: a */
    public void mo136287a(String str, AbstractC36916a aVar) {
        this.f94906c.put(str, new WeakReference<>(aVar));
    }
}
