package com.google.android.gms.maps;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* renamed from: com.google.android.gms.maps.g */
public class C22013g {

    /* renamed from: a */
    private final IStreetViewPanoramaDelegate f53520a;

    /* renamed from: com.google.android.gms.maps.g$a */
    public interface AbstractC22014a {
        /* renamed from: a */
        void mo74529a(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* renamed from: com.google.android.gms.maps.g$b */
    public interface AbstractC22015b {
        /* renamed from: a */
        void mo74530a(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    /* renamed from: com.google.android.gms.maps.g$c */
    public interface AbstractC22016c {
        /* renamed from: a */
        void mo74531a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* renamed from: com.google.android.gms.maps.g$d */
    public interface AbstractC22017d {
        /* renamed from: a */
        void mo74532a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    public C22013g(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.f53520a = (IStreetViewPanoramaDelegate) Preconditions.checkNotNull(iStreetViewPanoramaDelegate, "delegate");
    }
}
