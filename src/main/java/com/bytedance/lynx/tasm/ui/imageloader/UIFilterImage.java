package com.bytedance.lynx.tasm.ui.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import com.bytedance.lynx.tasm.ui.imageloader.C19899c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.utils.C26960n;
import com.lynx.tasm.utils.ColorUtils;
import java.lang.ref.WeakReference;

public class UIFilterImage extends UIImage<C19907d> {

    /* renamed from: a */
    int f48604a;

    /* renamed from: b */
    int f48605b;

    /* renamed from: c */
    int f48606c;

    /* renamed from: d */
    int f48607d;

    /* renamed from: e */
    int f48608e;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lynx.tasm.ui.imageloader.UIImage
    /* renamed from: d */
    public C19899c.AbstractC19906c mo53300d() {
        final WeakReference weakReference = new WeakReference(this);
        return new C19899c.AbstractC19906c() {
            /* class com.bytedance.lynx.tasm.ui.imageloader.UIFilterImage.C198931 */

            @Override // com.bytedance.lynx.tasm.ui.imageloader.C19899c.AbstractC19906c
            /* renamed from: a */
            public Bitmap mo67408a(Bitmap bitmap) {
                if (weakReference.get() == null) {
                    return bitmap;
                }
                UIFilterImage uIFilterImage = (UIFilterImage) weakReference.get();
                return C19907d.m72630a(bitmap, new RectF((float) uIFilterImage.f66203I, (float) uIFilterImage.f66202H, (float) uIFilterImage.f66204J, (float) uIFilterImage.f66205K), new RectF((float) uIFilterImage.f66245z, (float) uIFilterImage.f66196B, (float) uIFilterImage.f66195A, (float) uIFilterImage.f66197C), uIFilterImage);
            }
        };
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lynx.tasm.ui.imageloader.UIImage
    /* renamed from: e */
    public String mo53301e() {
        return super.mo53301e() + "_lynx_" + this.f48608e + "_lynx_" + this.f48607d + "_lynx_" + this.f48606c + "_lynx_" + this.f48604a + "_lynx_" + this.f48605b;
    }

    public UIFilterImage(AbstractC26684l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C19907d mo67405c(Context context) {
        return new C19907d(context);
    }

    @LynxProp(name = "blur-radius")
    public void setBlurRadius(String str) {
        UIBody n = this.f66239t.mo94692n();
        this.f48608e = Math.round(C26960n.m97979a(str, n.ad(), this.f66206L, (float) n.mo94937T(), (float) n.mo94938U(), this.f66239t.mo94672b()));
    }

    @LynxProp(name = "drop-shadow")
    public void setDropShadow(String str) {
        if (str == null) {
            this.f48604a = 0;
            this.f48605b = 0;
            this.f48606c = 0;
            this.f48607d = 0;
            return;
        }
        String[] split = str.split(" +");
        try {
            if (split.length == 4) {
                UIBody n = this.f66239t.mo94692n();
                this.f48604a = Math.round(C26960n.m97978a(split[0], n.ad(), this.f66206L, (float) n.mo94937T(), (float) n.mo94938U(), BitmapDescriptorFactory.HUE_RED, this.f66239t.mo94672b()));
                this.f48605b = Math.round(C26960n.m97978a(split[1], n.ad(), this.f66206L, (float) n.mo94937T(), (float) n.mo94938U(), BitmapDescriptorFactory.HUE_RED, this.f66239t.mo94672b()));
                this.f48606c = ColorUtils.m97896a(split[3]);
                this.f48607d = Math.round(C26960n.m97978a(split[2], n.ad(), this.f66206L, (float) n.mo94937T(), (float) n.mo94938U(), BitmapDescriptorFactory.HUE_RED, this.f66239t.mo94672b()));
            }
        } catch (Exception unused) {
        }
    }
}
