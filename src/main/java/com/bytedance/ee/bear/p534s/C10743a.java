package com.bytedance.ee.bear.p534s;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.ss.android.lark.watermark.core.IAttachToBitmapCallback;
import com.ss.android.lark.watermark.dto.WatermarkInfo;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.s.a */
public class C10743a implements IWatermarkManager {
    C10743a() {
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40643a(Activity activity) {
        WatermarkManager.m44552a(activity);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: b */
    public void mo40653b(FrameLayout frameLayout) {
        WatermarkManager.m44560b(frameLayout);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40646a(FrameLayout frameLayout) {
        WatermarkManager.m44554a(frameLayout);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40644a(Dialog dialog) {
        Window window;
        if (dialog == null) {
            window = null;
        } else {
            window = dialog.getWindow();
        }
        if (window != null && window.getDecorView() != null && (window.getDecorView() instanceof FrameLayout)) {
            mo40646a((FrameLayout) dialog.getWindow().getDecorView());
        }
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: b */
    public void mo40652b(Dialog dialog) {
        Window window;
        if (dialog == null) {
            window = null;
        } else {
            window = dialog.getWindow();
        }
        if (window != null && window.getDecorView() != null && (window.getDecorView() instanceof FrameLayout)) {
            WatermarkManager.m44563d((FrameLayout) dialog.getWindow().getDecorView());
        }
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40648a(WatermarkInfo watermarkInfo) {
        WatermarkManager.m44556a(watermarkInfo);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40645a(Bitmap bitmap, IAttachToBitmapCallback iAttachToBitmapCallback) {
        WatermarkManager.m44553a(bitmap, iAttachToBitmapCallback);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: b */
    public void mo40654b(String str, String str2) {
        WatermarkManager.m44561b(str, str2);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40647a(C10917c cVar, Context context) {
        WatermarkManager.m44555a(cVar, context);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40649a(String str, String str2) {
        WatermarkManager.m44557a(str, str2);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40650a(String str, String str2, Activity activity) {
        WatermarkManager.m44558a(str, str2, activity);
    }

    @Override // com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager
    /* renamed from: a */
    public void mo40651a(String str, String str2, Dialog dialog) {
        Window window;
        mo40649a(str, str2);
        if (dialog == null) {
            window = null;
        } else {
            window = dialog.getWindow();
        }
        if (window != null && window.getDecorView() != null && (window.getDecorView() instanceof FrameLayout)) {
            mo40646a((FrameLayout) dialog.getWindow().getDecorView());
        }
    }
}
