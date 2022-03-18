package com.bytedance.ee.bear.doc.positionkeeper;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/doc/positionkeeper/PositionKeeperPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "enableKeepPosition", "", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "Companion", "GetPositionKeeperHandler", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PositionKeeperPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public boolean enableKeepPosition = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/doc/positionkeeper/PositionKeeperPlugin$Companion;", "", "()V", "GET_POSITION_KEEPER_STATUS", "", "SET_POSITION_KEEPER", "TAG", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.positionkeeper.PositionKeeperPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/doc/positionkeeper/PositionKeeperPlugin$GetPositionKeeperHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Ljava/lang/Void;", "(Lcom/bytedance/ee/bear/doc/positionkeeper/PositionKeeperPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.positionkeeper.PositionKeeperPlugin$b */
    private final class GetPositionKeeperHandler implements AbstractC7945d<Void> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public GetPositionKeeperHandler() {
        }

        /* renamed from: a */
        public void handle(Void r3, AbstractC7947h hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "callback");
            C13479a.m54764b("PositionKeeperPlugin", "getPositionKeeperStatus");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", (Object) Boolean.valueOf(PositionKeeperPlugin.this.enableKeepPosition));
            hVar.mo17188a(jSONObject);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.util.getPositionKeeperStatus", new GetPositionKeeperHandler());
    }

    public void onAttachToHost(C6095s sVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        super.onAttachToHost((C4943e) sVar);
        if (getDocViewModel().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        this.enableKeepPosition = !z;
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) sVar, nVar);
    }
}
