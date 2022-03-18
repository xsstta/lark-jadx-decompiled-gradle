package com.huawei.hms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.model.RuntimeRemoteException;

public class TextureMapView extends MapView {

    /* renamed from: a */
    private maa f58630a;

    public static class maa extends MapView.maa {
        maa(ViewGroup viewGroup, Context context, HuaweiMapOptions huaweiMapOptions) {
            super(viewGroup, context, huaweiMapOptions);
        }

        /* access modifiers changed from: protected */
        @Override // com.huawei.hms.maps.MapView.maa
        /* renamed from: a */
        public final man mo83746a(mag mag, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                Log.i("TextureMapView", "createDelegateRemote: ");
                return mag.mo83896d(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.huawei.hms.feature.dynamic.OnDelegateCreatedListener] */
        @Override // com.huawei.hms.maps.MapView.maa, com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final /* bridge */ /* synthetic */ void createDelegate(OnDelegateCreatedListener<MapView.mab> onDelegateCreatedListener) {
            super.createDelegate(onDelegateCreatedListener);
        }
    }

    public TextureMapView(Context context) {
        super(context);
        this.f58630a = new maa(this, context, null);
    }

    public TextureMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58630a = new maa(this, context, HuaweiMapOptions.createFromAttributes(context, attributeSet));
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58630a = new maa(this, context, HuaweiMapOptions.createFromAttributes(context, attributeSet));
    }

    public TextureMapView(Context context, HuaweiMapOptions huaweiMapOptions) {
        super(context, huaweiMapOptions);
        this.f58630a = new maa(this, context, huaweiMapOptions);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        this.f58630a.mo83747a(onMapReadyCallback);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58630a.onCreate(bundle);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onDestroy() {
        this.f58630a.onDestroy();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onPause() {
        this.f58630a.onPause();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onResume() {
        this.f58630a.onResume();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onSaveInstanceState(Bundle bundle) {
        this.f58630a.onSaveInstanceState(bundle);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onStart() {
        this.f58630a.onStart();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onStop() {
        this.f58630a.onStop();
    }
}
