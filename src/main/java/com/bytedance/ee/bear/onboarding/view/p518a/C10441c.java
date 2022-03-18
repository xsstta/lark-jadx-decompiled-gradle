package com.bytedance.ee.bear.onboarding.view.p518a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.airbnb.lottie.AbstractC1780b;
import com.airbnb.lottie.C1806f;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.DeviceUtils;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.bytedance.ee.bear.onboarding.view.a.c */
public class C10441c implements AbstractC10440b {

    /* renamed from: a */
    private String f28036a;

    /* renamed from: b */
    private String f28037b;

    @Override // com.bytedance.ee.bear.onboarding.view.p518a.AbstractC10440b
    /* renamed from: a */
    public void mo39708a(BearLottieView bearLottieView) {
        if (!TextUtils.isEmpty(this.f28037b)) {
            try {
                bearLottieView.setAnimation(new FileInputStream(new File(this.f28036a)), null);
                bearLottieView.setImageAssetDelegate(new AbstractC1780b(bearLottieView) {
                    /* class com.bytedance.ee.bear.onboarding.view.p518a.$$Lambda$c$Mb2FzOjxxTnpS5Npy9zv9UKLXdc */
                    public final /* synthetic */ BearLottieView f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.airbnb.lottie.AbstractC1780b
                    public final Bitmap fetchBitmap(C1806f fVar) {
                        return C10441c.this.m43363a(this.f$1, fVar);
                    }
                });
            } catch (Exception e) {
                C13479a.m54759a("LocalFileLottieAnimLoader", "show lottie error: ", e);
                e.printStackTrace();
            }
        }
    }

    public C10441c(String str, String str2) {
        this.f28036a = str;
        this.f28037b = str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Bitmap m43363a(BearLottieView bearLottieView, C1806f fVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = DeviceUtils.getScreenDensityDpi(bearLottieView.getContext());
        return BitmapFactory.decodeFile(this.f28037b + File.separator + fVar.mo9107d(), options);
    }
}
