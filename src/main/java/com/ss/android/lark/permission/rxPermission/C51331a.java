package com.ss.android.lark.permission.rxPermission;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.lark.permission.C51325d;
import io.reactivex.AbstractC69007p;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.permission.rxPermission.a */
public class C51331a {

    /* renamed from: a */
    static final Object f127832a = new Object();

    /* renamed from: b */
    RxPermissionsFragment f127833b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo176920a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public <T> AbstractC69007p<T, Boolean> mo176919a(final String... strArr) {
        return new AbstractC69007p<T, Boolean>() {
            /* class com.ss.android.lark.permission.rxPermission.C51331a.C513321 */

            @Override // io.reactivex.AbstractC69007p
            /* renamed from: a */
            public ObservableSource<Boolean> mo50572a(Observable<T> observable) {
                return C51331a.this.mo176918a((Observable<?>) observable, strArr).buffer(strArr.length).flatMap(new Function<List<C51325d>, ObservableSource<Boolean>>() {
                    /* class com.ss.android.lark.permission.rxPermission.C51331a.C513321.C513331 */

                    /* renamed from: a */
                    public ObservableSource<Boolean> apply(List<C51325d> list) throws Exception {
                        if (list.isEmpty()) {
                            return Observable.empty();
                        }
                        for (C51325d dVar : list) {
                            if (!dVar.f127818b) {
                                return Observable.just(false);
                            }
                        }
                        return Observable.just(true);
                    }
                });
            }
        };
    }

    /* renamed from: b */
    public <T> AbstractC69007p<T, C51325d> mo176922b(final String... strArr) {
        return new AbstractC69007p<T, C51325d>() {
            /* class com.ss.android.lark.permission.rxPermission.C51331a.C513342 */

            @Override // io.reactivex.AbstractC69007p
            /* renamed from: a */
            public ObservableSource<C51325d> mo50572a(Observable<T> observable) {
                return C51331a.this.mo176918a((Observable<?>) observable, strArr);
            }
        };
    }

    public C51331a(Activity activity) {
        this.f127833b = m199098a(activity);
    }

    /* renamed from: b */
    private RxPermissionsFragment m199100b(Activity activity) {
        return (RxPermissionsFragment) activity.getFragmentManager().findFragmentByTag("RxPermissions");
    }

    /* renamed from: c */
    public Observable<Boolean> mo176924c(String... strArr) {
        return Observable.just(f127832a).compose(mo176919a(strArr));
    }

    /* renamed from: d */
    public Observable<C51325d> mo176925d(String... strArr) {
        return Observable.just(f127832a).compose(mo176922b(strArr));
    }

    /* renamed from: g */
    private Observable<?> m199101g(String... strArr) {
        for (String str : strArr) {
            if (!this.f127833b.mo176914d(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(f127832a);
    }

    /* renamed from: b */
    public boolean mo176923b(String str) {
        if (!mo176920a() || !this.f127833b.mo176912b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private RxPermissionsFragment m199098a(Activity activity) {
        boolean z;
        RxPermissionsFragment b = m199100b(activity);
        if (b == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return b;
        }
        RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(rxPermissionsFragment, "RxPermissions").commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return rxPermissionsFragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo176927f(String[] strArr) {
        RxPermissionsFragment rxPermissionsFragment = this.f127833b;
        rxPermissionsFragment.mo176915e("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f127833b.mo176909a(strArr);
    }

    /* renamed from: a */
    public boolean mo176921a(String str) {
        if (!mo176920a() || this.f127833b.mo176911a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Observable<C51325d> mo176926e(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f127833b.mo176915e("Requesting permission " + str);
            if (mo176921a(str)) {
                arrayList.add(Observable.just(new C51325d(str, true, false)));
            } else if (mo176923b(str)) {
                arrayList.add(Observable.just(new C51325d(str, false, false)));
            } else {
                C68296b<C51325d> c = this.f127833b.mo176913c(str);
                if (c == null) {
                    arrayList2.add(str);
                    c = C68296b.m265052a();
                    this.f127833b.mo176908a(str, c);
                }
                arrayList.add(c);
            }
        }
        if (!arrayList2.isEmpty()) {
            mo176927f((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    /* renamed from: a */
    private Observable<?> m199099a(Observable<?> observable, Observable<?> observable2) {
        if (observable == null) {
            return Observable.just(f127832a);
        }
        return Observable.merge(observable, observable2);
    }

    /* renamed from: a */
    public Observable<C51325d> mo176918a(Observable<?> observable, final String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m199099a(observable, m199101g(strArr)).flatMap(new Function<Object, Observable<C51325d>>() {
                /* class com.ss.android.lark.permission.rxPermission.C51331a.C513353 */

                /* renamed from: a */
                public Observable<C51325d> apply(Object obj) throws Exception {
                    return C51331a.this.mo176926e(strArr);
                }
            });
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }
}
