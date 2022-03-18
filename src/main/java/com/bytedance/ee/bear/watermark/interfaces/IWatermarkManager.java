package com.bytedance.ee.bear.watermark.interfaces;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.service.C10917c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J&\u0010\u0006\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u001c\u0010\u0018\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J \u0010\u0019\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/watermark/interfaces/IWatermarkManager;", "", "addGlobalWatermarkForDialog", "", "dialog", "Landroid/app/Dialog;", "addWatermarkForDialog", "frameLayout", "Landroid/widget/FrameLayout;", "token", "", ShareHitPoint.f121869d, "addWatermarkToBitmapIfNeed", "bitmap", "Landroid/graphics/Bitmap;", "callback", "Lcom/ss/android/lark/watermark/core/IAttachToBitmapCallback;", "detachWatermark", "init", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "context", "Landroid/content/Context;", "pullWatermarkConfig", "updateTokenAndType", "updateWatermarkForActivity", "activity", "Landroid/app/Activity;", "updateWatermarkForActivityWithoutToken", "updateWatermarkInfo", "watermarkInfo", "Lcom/ss/android/lark/watermark/dto/WatermarkInfo;", "watermark-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.s.a.a */
public interface IWatermarkManager {
    /* renamed from: a */
    void mo40643a(Activity activity);

    /* renamed from: a */
    void mo40644a(Dialog dialog);

    /* renamed from: a */
    void mo40645a(Bitmap bitmap, IAttachToBitmapCallback iAttachToBitmapCallback);

    /* renamed from: a */
    void mo40646a(FrameLayout frameLayout);

    /* renamed from: a */
    void mo40647a(C10917c cVar, Context context);

    /* renamed from: a */
    void mo40648a(WatermarkInfo watermarkInfo);

    /* renamed from: a */
    void mo40649a(String str, String str2);

    /* renamed from: a */
    void mo40650a(String str, String str2, Activity activity);

    /* renamed from: a */
    void mo40651a(String str, String str2, Dialog dialog);

    /* renamed from: b */
    void mo40652b(Dialog dialog);

    /* renamed from: b */
    void mo40653b(FrameLayout frameLayout);

    /* renamed from: b */
    void mo40654b(String str, String str2);
}
