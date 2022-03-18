package com.ss.android.lark.watermark;

import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.mysterious.MysteriousWatermarkInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/watermark/WatermarkInfoFactory;", "", "()V", "createDefaultWatermarkInfo", "Lcom/ss/android/lark/watermark/dto/WatermarkInfo;", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.d */
public final class WatermarkInfoFactory {

    /* renamed from: a */
    public static final WatermarkInfoFactory f143279a = new WatermarkInfoFactory();

    private WatermarkInfoFactory() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final WatermarkInfo m225977a() {
        return new MysteriousWatermarkInfo();
    }
}
