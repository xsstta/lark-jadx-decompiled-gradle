package com.bytedance.ee.bear.document.back;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/document/back/BackPrePagePlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "TAG", "", "getBridgeHandlers", "", "handlersHolder", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BackPrePagePlugin extends DocumentPlugin {
    public final String TAG = "BackPrePagePlugin";

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.util.backPrePage", new C5672a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "kotlin.jvm.PlatformType", "handle"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.back.BackPrePagePlugin$a */
    static final class C5672a<T> implements AbstractC7945d<Object> {

        /* renamed from: a */
        final /* synthetic */ BackPrePagePlugin f16032a;

        C5672a(BackPrePagePlugin backPrePagePlugin) {
            this.f16032a = backPrePagePlugin;
        }

        @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
        public final void handle(Object obj, AbstractC7947h hVar) {
            C13479a.m54764b(this.f16032a.TAG, "back pre page");
            C6095s sVar = (C6095s) this.f16032a.getHost();
            Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
            sVar.mo19564f().onBackPressed();
        }
    }
}
