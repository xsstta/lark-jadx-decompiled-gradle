package com.ss.android.photoeditor.ve.service;

import android.content.Context;
import com.ss.android.photoeditor.ve.p3018e.C59902f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/photoeditor/ve/service/VEImageService;", "Lcom/ss/android/photoeditor/ve/service/IVeImageService;", "()V", "initPaintResource", "", "context", "Landroid/content/Context;", "isResAvailable", "", "resourceName", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.d.a */
public final class VEImageService {
    /* renamed from: a */
    public void mo203977a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!m232441a(context, "Brush2D_Simple_2")) {
            C59902f.m232474a(context, "Brush2D_Simple_2");
        }
        if (!m232441a(context, "Brush2D_Mosiac_2")) {
            C59902f.m232474a(context, "Brush2D_Mosiac_2");
        }
        if (!m232441a(context, "Brush2D_Mosiac_Guass_2")) {
            C59902f.m232474a(context, "Brush2D_Mosiac_Guass_2");
        }
        if (!m232441a(context, "Sticker_Rect_Mosaic")) {
            C59902f.m232474a(context, "Sticker_Rect_Mosaic");
        }
        if (!m232441a(context, "Sticker_Rect_Guass")) {
            C59902f.m232474a(context, "Sticker_Rect_Guass");
        }
    }

    /* renamed from: a */
    private final boolean m232441a(Context context, String str) {
        return C59902f.m232480a(C59902f.m232472a(context) + str);
    }
}
