package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.huawei.hms.maps.mbn;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    private StreetViewDeferredLifecycleHelper f58588a;

    static class StreetViewDeferredLifecycleHelper extends DeferredLifecycleHelper<StreetViewLifecycleDelegate> {

        /* renamed from: f */
        boolean f58589f = false;

        /* renamed from: g */
        private ViewGroup f58590g;

        /* renamed from: h */
        private Context f58591h;

        /* renamed from: i */
        private OnDelegateCreatedListener<StreetViewLifecycleDelegate> f58592i;

        /* renamed from: j */
        private StreetViewPanoramaOptions f58593j;

        /* renamed from: k */
        private List<OnStreetViewPanoramaReadyCallback> f58594k = new ArrayList();

        StreetViewDeferredLifecycleHelper(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f58590g = viewGroup;
            this.f58591h = context;
            this.f58593j = streetViewPanoramaOptions;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener<StreetViewLifecycleDelegate> onDelegateCreatedListener) {
            if (!this.f58589f) {
                int i = 1;
                this.f58589f = true;
                this.f58592i = onDelegateCreatedListener;
                if (onDelegateCreatedListener != null && getDelegate() == null) {
                    MapsInitializer.initialize(this.f58591h);
                    try {
                        int isHmsAvailable = HmsUtil.isHmsAvailable(this.f58591h);
                        if (isHmsAvailable != 0) {
                            mcq.m86889e("StreetViewPanoramaView", "hmsState check failed: ".concat(String.valueOf(isHmsAvailable)));
                        }
                        mag a = mbv.m86514a(this.f58591h);
                        if (a == null) {
                            while (a == null && i < 30) {
                                try {
                                    mcq.m86886b("StreetViewPanoramaView", "sdk waitTime : " + i + "onCreateView :" + a);
                                    i++;
                                    a = mbv.m86514a(this.f58591h);
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    mcq.m86889e("StreetViewPanoramaView", " InterruptedException: " + e.getMessage());
                                }
                            }
                            mcq.m86887c("StreetViewPanoramaView", "sdk MapView loop creator:".concat(String.valueOf(a)));
                        }
                        if (a != null) {
                            MapClientIdentify mapClientIdentify = new MapClientIdentify();
                            Context b = mbv.m86517b(this.f58591h);
                            mapClientIdentify.mo83714a(this.f58591h, a);
                            mbs a2 = a.mo83889a(ObjectWrapper.wrap(b), this.f58593j);
                            mcq.m86887c("StreetViewPanoramaView", "sdk MapView constructor streetViewPanoramaViewDelegate:".concat(String.valueOf(a2)));
                            if (a2 == null) {
                                mcq.m86888d("StreetViewPanoramaView", "init: streetViewPanoramaViewDelegate is null");
                                return;
                            }
                            this.f58592i.onDelegateCreated(new StreetViewLifecycleDelegate(this.f58590g, a2));
                            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f58594k) {
                                ((StreetViewLifecycleDelegate) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                            }
                        }
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                }
            }
        }

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                ((StreetViewLifecycleDelegate) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.f58594k.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class StreetViewLifecycleDelegate implements StreetLifecycleDelegate {

        /* renamed from: a */
        private ViewGroup f58595a;

        /* renamed from: b */
        private mbs f58596b;

        /* renamed from: c */
        private View f58597c;

        public StreetViewLifecycleDelegate(ViewGroup viewGroup, mbs mbs) {
            this.f58595a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
            this.f58596b = (mbs) Preconditions.checkNotNull(mbs);
        }

        @Override // com.huawei.hms.maps.StreetLifecycleDelegate
        public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.f58596b.mo84078a(new mbn.maa() {
                    /* class com.huawei.hms.maps.StreetViewPanoramaView.StreetViewLifecycleDelegate.BinderC236951 */

                    public void onStreetViewPanoramaReadyCallback(mbq mbq) {
                        onStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(new StreetViewPanorama(mbq));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onCreate(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                this.f58596b.mo84077a(a);
                mbw.m86521a(a);
                this.f58597c = (View) ObjectWrapper.unwrap(this.f58596b.mo84076a());
                this.f58595a.removeAllViews();
                this.f58595a.addView(this.f58597c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.f58596b.mo84079b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.f58596b.mo84081c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.f58596b.mo84082d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                mcq.m86886b("StreetViewPanoramaView", "MapView:onResume");
                this.f58596b.mo84083e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a = mbw.m86521a(bundle);
                this.f58596b.mo84080b(a);
                mbw.m86521a(a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                mcq.m86886b("StreetViewPanoramaView", "MapView:onStart");
                this.f58596b.mo84084f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.f58596b.mo84085g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.f58588a = new StreetViewDeferredLifecycleHelper(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.f58588a = new StreetViewDeferredLifecycleHelper(this, context, streetViewPanoramaOptions);
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        mcq.m86886b("StreetViewPanoramaView", "getStreetViewPanoramaAsync");
        this.f58588a.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        mcq.m86886b("StreetViewPanoramaView", "onCreate");
        this.f58588a.onCreate(bundle);
    }

    public final void onDestroy() {
        mcq.m86886b("StreetViewPanoramaView", "onDestroy");
        this.f58588a.onDestroy();
    }

    public final void onLowMemory() {
        mcq.m86886b("StreetViewPanoramaView", "onLowMemory");
        this.f58588a.onLowMemory();
    }

    public final void onPause() {
        mcq.m86886b("StreetViewPanoramaView", "onPause");
        this.f58588a.onPause();
    }

    public final void onResume() {
        mcq.m86886b("StreetViewPanoramaView", "onResume");
        this.f58588a.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        mcq.m86886b("StreetViewPanoramaView", "onSaveInstanceState");
        this.f58588a.onSaveInstanceState(bundle);
    }
}
