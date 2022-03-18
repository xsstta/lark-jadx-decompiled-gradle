package com.tt.miniapp.feedback.entrance.image;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.util.C67045l;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tt.miniapp.feedback.entrance.image.d */
public class C66151d implements AbstractC66150c {
    @Override // com.tt.miniapp.feedback.entrance.image.AbstractC66150c
    /* renamed from: a */
    public void mo231378a(Context context, Integer num, ImageView imageView) {
        imageView.setImageDrawable(context.getDrawable(num.intValue()));
    }

    @Override // com.tt.miniapp.feedback.entrance.image.AbstractC66150c
    /* renamed from: a */
    public void mo231379a(Context context, String str, ImageView imageView) {
        try {
            imageView.setImageBitmap(C67045l.m261298a(C67045l.m261299a(new File(str), ImageUploadView.m258975a(context, 84.0f), ImageUploadView.m258975a(context, 84.0f))));
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "tma_ImageLoaderUtil", e.getStackTrace());
        }
    }
}
