package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.mbc;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {

    /* renamed from: a */
    private maa f58541a;

    /* access modifiers changed from: package-private */
    public static class maa extends DeferredLifecycleHelper<mab> {

        /* renamed from: f */
        private ViewGroup f58542f;

        /* renamed from: g */
        private Context f58543g;

        /* renamed from: h */
        private OnDelegateCreatedListener<mab> f58544h;

        /* renamed from: i */
        private HuaweiMapOptions f58545i;

        /* renamed from: j */
        private List<OnMapReadyCallback> f58546j = new ArrayList();

        /* renamed from: k */
        private boolean f58547k = false;

        /* renamed from: l */
        private int f58548l = 0;

        /* renamed from: m */
        private boolean f58549m = false;

        maa(ViewGroup viewGroup, Context context, HuaweiMapOptions huaweiMapOptions) {
            this.f58542f = viewGroup;
            this.f58543g = context;
            this.f58545i = huaweiMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public man mo83746a(mag mag, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return mag.mo83892b(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo83747a(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() == null) {
                this.f58546j.add(onMapReadyCallback);
            } else {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            mab.m86184a(this.f58543g);
            this.f58544h = onDelegateCreatedListener;
            if (onDelegateCreatedListener != null && getDelegate() == null) {
                MapsInitializer.initialize(this.f58543g);
                man man = null;
                try {
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.f58543g);
                    if (isHmsAvailable != 0) {
                        mcq.m86889e("MapView", "Hms is unavailable, state is : ".concat(String.valueOf(isHmsAvailable)));
                    }
                    if (TextUtils.isEmpty(MapClientIdentify.getApiKey())) {
                        MapClientIdentify.m86146a(mab.m86186c(this.f58543g));
                    }
                    if (TextUtils.isEmpty(MapClientIdentify.getAppId())) {
                        MapClientIdentify.m86150b(mab.m86185b(this.f58543g));
                    }
                    mag a = mbv.m86514a(this.f58543g);
                    if (a != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b = mbv.m86517b(this.f58543g);
                        mapClientIdentify.mo83714a(this.f58543g, a);
                        int i = this.f58548l;
                        if (i < 2 && b != null) {
                            this.f58548l = i + 1;
                            man = mo83746a(a, b, this.f58545i);
                        }
                        if (man == null) {
                            mcq.m86888d("MapView", "init: mIMapViewDelegate is null");
                            return;
                        }
                        mcq.m86887c("MapView", "sdk MapView constructor mIMapViewDelegate:".concat(String.valueOf(man)));
                        man.mo83991a(ObjectWrapper.wrap(this.f58543g));
                        this.f58544h.onDelegateCreated(new mab(this.f58542f, man));
                        for (OnMapReadyCallback onMapReadyCallback : this.f58546j) {
                            ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
                        }
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements MapLifecycleDelegate {

        /* renamed from: a */
        private ViewGroup f58550a;

        /* renamed from: b */
        private man f58551b;

        /* renamed from: c */
        private View f58552c;

        /* renamed from: d */
        private boolean f58553d;

        public mab(ViewGroup viewGroup, man man) {
            this.f58550a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
            this.f58551b = (man) Preconditions.checkNotNull(man);
        }

        /* renamed from: a */
        private static void m86161a() {
            MapsInitializer.initialize(null);
            MapClientIdentify.m86145a((Context) null);
            mbv.m86515a();
        }

        @Override // com.huawei.hms.maps.MapLifecycleDelegate
        public final void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.f58551b.mo83992a(new mbc.maa() {
                    /* class com.huawei.hms.maps.MapView.mab.BinderC236891 */

                    @Override // com.huawei.hms.maps.mbc
                    /* renamed from: a */
                    public final void mo83734a(mai mai) {
                        onMapReadyCallback.onMapReady(new HuaweiMap(mai));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                this.f58551b.mo83990a(a);
                mbw.m86521a(a);
                this.f58552c = (View) ObjectWrapper.unwrap(this.f58551b.mo83989a());
                this.f58550a.removeAllViews();
                this.f58550a.addView(this.f58552c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView prohibited on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.f58551b.mo83993b();
                if (!this.f58553d) {
                    mcq.m86886b("MapView", "clearResource in onDestroy method");
                    m86161a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView prohibited on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate prohibited on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.f58551b.mo83995c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            Activity activity;
            try {
                this.f58551b.mo83996d();
                if ((MapClientIdentify.m86148b() instanceof Activity) && (activity = (Activity) MapClientIdentify.m86148b()) != null && activity.isFinishing()) {
                    mcq.m86886b("MapView", "clearResource in onPause method");
                    m86161a();
                    this.f58553d = true;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                mcq.m86886b("MapView", "MapView:onResume");
                this.f58551b.mo83997e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            Bundle a = mbw.m86521a(bundle);
            try {
                this.f58551b.mo83994b(a);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.f58551b.mo83998f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.f58551b.mo83999g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public MapView(Context context) {
        this(context, null, 0);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m86158a(context, attributeSet != null ? HuaweiMapOptions.createFromAttributes(context, attributeSet) : null);
    }

    public MapView(Context context, HuaweiMapOptions huaweiMapOptions) {
        super(context);
        m86158a(context, huaweiMapOptions);
    }

    /* renamed from: a */
    private void m86158a(Context context, HuaweiMapOptions huaweiMapOptions) {
        this.f58541a = new maa(this, context, huaweiMapOptions);
        setClickable(true);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mcq.m86886b("MapView", "getMapAsync: ");
        this.f58541a.mo83747a(onMapReadyCallback);
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        MapClientIdentify.m86144a(System.currentTimeMillis());
        mbv.m86519c(getContext());
        mbv.m86518b();
        try {
            this.f58541a.onCreate(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f58541a.onDestroy();
        HmsUtil.setRepeatFlag(true);
    }

    public final void onEnterAmbient(Bundle bundle) {
        mcq.m86886b("MapView", "onEnterAmbient");
    }

    public final void onExitAmbient() {
        mcq.m86886b("MapView", "onExitAmbient");
    }

    public final void onLowMemory() {
        this.f58541a.onLowMemory();
    }

    public void onPause() {
        mcq.m86886b("MapView", "onPause");
        this.f58541a.onPause();
    }

    public void onResume() {
        this.f58541a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f58541a.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f58541a.onStart();
    }

    public void onStop() {
        this.f58541a.onStop();
    }
}
