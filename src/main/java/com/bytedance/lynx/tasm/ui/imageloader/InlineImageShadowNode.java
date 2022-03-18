package com.bytedance.lynx.tasm.ui.imageloader;

import android.graphics.drawable.Drawable;
import com.bytedance.lynx.tasm.ui.imageloader.C19899c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.behavior.shadow.C26707h;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.behavior.ui.image.C26785a;
import java.lang.ref.WeakReference;

public class InlineImageShadowNode extends AbsInlineImageShadowNode {

    /* renamed from: a */
    String f48598a;

    /* renamed from: b */
    String f48599b;

    /* renamed from: c */
    C19898b f48600c;

    /* renamed from: q */
    private void m72587q() {
        C19899c.AbstractC19905b bVar;
        float a = mo94788e().mo94820a();
        float b = mo94788e().mo94821b();
        if (this.f48598a != null && a > BitmapDescriptorFactory.HUE_RED && b > BitmapDescriptorFactory.HUE_RED && (bVar = C19899c.f48629a) != null) {
            final WeakReference weakReference = new WeakReference(this);
            final String str = this.f48598a;
            bVar.mo53858a(mo94810m(), "InlineImage_" + a + " " + b + this.f48599b, this.f48598a, a, b, null, new C19899c.AbstractC19904a() {
                /* class com.bytedance.lynx.tasm.ui.imageloader.InlineImageShadowNode.C198921 */

                @Override // com.bytedance.lynx.tasm.ui.imageloader.C19899c.AbstractC19904a
                /* renamed from: a */
                public void mo67403a(Drawable drawable, Throwable th) {
                    InlineImageShadowNode inlineImageShadowNode = (InlineImageShadowNode) weakReference.get();
                    if (inlineImageShadowNode != null) {
                        if (InlineImageShadowNode.this.f48598a == null) {
                            if (str != null) {
                                return;
                            }
                        } else if (!InlineImageShadowNode.this.f48598a.equals(str)) {
                            return;
                        }
                        inlineImageShadowNode.f48600c.f48628a.mo67421a(drawable);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public C19898b mo67400b() {
        float a = mo94788e().mo94820a();
        float b = mo94788e().mo94821b();
        this.f48600c = new C19898b((int) Math.ceil((double) a), (int) Math.ceil((double) b), mo94788e().mo94822c());
        C26707h n = mo94811n();
        if (n != null) {
            this.f48600c.mo95469a(n.f66103a, n.f66104b);
        }
        this.f48600c.f48628a.mo67422a(this.f48599b);
        m72587q();
        return this.f48600c;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public void setMode(String str) {
        this.f48599b = str;
        C19898b bVar = this.f48600c;
        if (bVar != null) {
            bVar.f48628a.mo67422a(this.f48599b);
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode
    public void setSource(String str) {
        this.f48598a = C26785a.m97218a(mo94810m(), str);
        m72587q();
    }
}
