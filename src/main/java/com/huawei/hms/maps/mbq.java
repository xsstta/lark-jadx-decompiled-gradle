package com.huawei.hms.maps;

import android.os.IInterface;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewPanoramaLocation;
import com.huawei.hms.maps.model.StreetViewPanoramaOrientation;

public interface mbq extends IInterface {
    /* renamed from: a */
    StreetViewPanoramaCamera mo84055a();

    /* renamed from: b */
    boolean mo84056b();

    /* renamed from: c */
    boolean mo84057c();

    /* renamed from: d */
    boolean mo84058d();

    /* renamed from: e */
    boolean mo84059e();

    /* renamed from: f */
    IObjectWrapper mo84060f();

    /* renamed from: g */
    StreetViewPanoramaOrientation mo84061g();

    /* renamed from: h */
    StreetViewPanoramaLocation mo84062h();
}
