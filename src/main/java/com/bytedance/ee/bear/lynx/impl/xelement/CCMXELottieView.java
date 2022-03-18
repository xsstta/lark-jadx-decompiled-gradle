package com.bytedance.ee.bear.lynx.impl.xelement;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxUI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xelement/CCMXELottieView;", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "Lcom/bytedance/ee/bear/lynx/impl/xelement/CCMLynxLottieView;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "ASSETS_SCHEME", "", "ccmLynxLottieView", "createView", "Landroid/content/Context;", "setAutoplay", "", "autoplay", "", "setLocalSrc", "srcUrl", "setLoop", "loop", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CCMXELottieView extends LynxUI<CCMLynxLottieView> {

    /* renamed from: a */
    private CCMLynxLottieView f23865a;

    /* renamed from: b */
    private final String f23866b = "appAsset";

    @LynxProp(name = "autoplay")
    public final void setAutoplay(boolean z) {
        CCMLynxLottieView aVar = this.f23865a;
        if (aVar != null) {
            aVar.setAutoplay$lynx_impl_release(z);
        }
    }

    @LynxProp(name = "loop")
    public final void setLoop(boolean z) {
        CCMLynxLottieView aVar = this.f23865a;
        if (aVar != null) {
            aVar.setLoop$lynx_impl_release(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CCMXELottieView(AbstractC26684l lVar) {
        super(lVar);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public CCMLynxLottieView mo33942b(Context context) {
        if (context == null) {
            return null;
        }
        CCMLynxLottieView aVar = new CCMLynxLottieView(context);
        this.f23865a = aVar;
        return aVar;
    }

    @LynxProp(name = "src-local")
    public final void setLocalSrc(String str) {
        CCMLynxLottieView aVar;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (Intrinsics.areEqual(this.f23866b, scheme) && !TextUtils.isEmpty(host) && (aVar = this.f23865a) != null) {
                aVar.setAnimationAsset$lynx_impl_release(host);
            }
        }
    }
}
