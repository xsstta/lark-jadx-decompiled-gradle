package com.ss.android.lark.integrator.calendar.dependency;

import android.graphics.Bitmap;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.IQrCodeDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalQrCodeDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IQrCodeDependency;", "()V", "encodeQRCode", "Landroid/graphics/Bitmap;", "content", "", "qrcodeWidth", "", "qrcodeHeight", "storkeWidth", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.z */
public final class CalQrCodeDependency implements IQrCodeDependency {
    @Override // com.ss.android.lark.calendar.dependency.idependency.IQrCodeDependency
    /* renamed from: a */
    public Bitmap mo108170a(String str, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).encodeQRCode(str, i, i2, i3);
    }
}
