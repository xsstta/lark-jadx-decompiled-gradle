package com.bytedance.ee.bear.imageviewer;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.drive.AbstractC6317a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.imageviewer.d */
public class C7845d {
    /* renamed from: a */
    public static AbstractC68307f<ImageData> m31395a(ImageData imageData) {
        return AbstractC68307f.m265083a("").mo238004b(C11678b.m48480d()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$d$lK6S3vvH9RcNqaNopiImOPOPsS8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7845d.lambda$lK6S3vvH9RcNqaNopiImOPOPsS8(ImageData.this, (String) obj);
            }
        });
    }

    /* renamed from: a */
    public static void m31396a(ImageData.Image image) {
        String str;
        if (image == null) {
            str = "";
        } else {
            str = image.getRealSrc();
        }
        if (image != null && !TextUtils.isEmpty(str)) {
            AbstractC6317a aVar = (AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class);
            if (aVar.mo20411b(str)) {
                String e = aVar.mo20414e(str);
                if (!TextUtils.isEmpty(e)) {
                    C13479a.m54764b("ImageUrlConverter", "convertRealPath(): localImage = " + C13598b.m55197d(e));
                    image.setOriginalSrc(e);
                }
            } else if (aVar.mo20412c(str)) {
                String g = aVar.mo20416g(str);
                if (TextUtils.isEmpty(g)) {
                    g = aVar.mo20416g(image.getSrc());
                    C13479a.m54764b("ImageUrlConverter", "convertRealPath(): netImage src = " + C13598b.m55197d(image.getSrc()));
                }
                if (!TextUtils.isEmpty(g)) {
                    image.setSrc(g);
                    return;
                }
                C13479a.m54775e("ImageUrlConverter", "convertRealPath() netImage  " + str + " is not foud ...");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ImageData m31394a(ImageData imageData, String str) throws Exception {
        m31396a(imageData.getImage());
        List<ImageData.Image> imageList = imageData.getImageList();
        if (imageList != null && !imageList.isEmpty()) {
            for (ImageData.Image image : imageList) {
                m31396a(image);
            }
        }
        return imageData;
    }
}
