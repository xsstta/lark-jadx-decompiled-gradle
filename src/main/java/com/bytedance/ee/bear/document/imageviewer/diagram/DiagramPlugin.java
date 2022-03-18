package com.bytedance.ee.bear.document.imageviewer.diagram;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.imageviewer.diagram.DiagramData;
import com.bytedance.ee.bear.document.imageviewer.diagram.DiagramViewModel;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPluginV2;", "()V", "mDiagramViewModel", "Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToUIContainer", "host", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromUIContainer", "registerDiagramBase64DataRequestListener", "listener", "Lcom/bytedance/ee/bear/contract/imageviewer/delegate/DiagramDataDelegate$DiagramBase64DataRequestListener;", "requestDiagramSVGData", "uuid", "index", "", "Lcom/bytedance/ee/bear/contract/imageviewer/delegate/DiagramDataDelegate$DiagramSVGDataRequestListener;", "unregisterDiagramBase64DataRequestListener", "Companion", "DiagramBase64DataHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DiagramPlugin extends DocumentPluginV2 {
    public static final Companion Companion = new Companion(null);
    public DiagramViewModel mDiagramViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramPlugin$Companion;", "", "()V", "REQUEST_DIAGRAM_SVG_DATA", "", "SEND_DIAGRAM_BASE64_DATA", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.DiagramPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void unregisterDiagramBase64DataRequestListener() {
        DiagramViewModel aVar = this.mDiagramViewModel;
        if (aVar != null) {
            aVar.unregisterDiagramBase64DataRequestListener();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramPlugin$DiagramBase64DataHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramData$Base64Data;", "(Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.DiagramPlugin$b */
    private final class DiagramBase64DataHandler implements AbstractC7945d<DiagramData.Base64Data> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DiagramBase64DataHandler() {
        }

        /* renamed from: a */
        public void handle(DiagramData.Base64Data base64Data, AbstractC7947h hVar) {
            String str;
            String str2;
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append("JS send diagram base64 data, uuid = ");
            String str4 = null;
            if (base64Data != null) {
                str = base64Data.getUuid();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" , result = ");
            if (base64Data != null) {
                str2 = base64Data.getResult();
            } else {
                str2 = null;
            }
            sb.append(str2);
            C13479a.m54764b("DiagramPlugin", sb.toString());
            DiagramViewModel aVar = DiagramPlugin.this.mDiagramViewModel;
            if (aVar != null) {
                if (base64Data != null) {
                    str3 = base64Data.getUuid();
                } else {
                    str3 = null;
                }
                if (base64Data != null) {
                    str4 = base64Data.getBase64String();
                }
                aVar.notifyDiagramBase64DataResult(str3, str4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/document/imageviewer/diagram/DiagramPlugin$onAttachToUIContainer$1", "Lcom/bytedance/ee/bear/document/imageviewer/diagram/DiagramViewModel$Delegate;", "onRequestDiagramSVGData", "", "uuid", "", "index", "", "listener", "Lcom/bytedance/ee/bear/contract/imageviewer/delegate/DiagramDataDelegate$DiagramSVGDataRequestListener;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.DiagramPlugin$c */
    public static final class C5854c implements DiagramViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ DiagramPlugin f16394a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5854c(DiagramPlugin diagramPlugin) {
            this.f16394a = diagramPlugin;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/document/imageviewer/diagram/DiagramPlugin$onAttachToUIContainer$1$onRequestDiagramSVGData$1", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "onCallBack", "", "param", "Lcom/alibaba/fastjson/JSONObject;", "Lcom/bytedance/ee/util/io/NonProguard;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.imageviewer.diagram.DiagramPlugin$c$a */
        public static final class C5855a implements AbstractC7947h {

            /* renamed from: a */
            final /* synthetic */ AbstractC5181a.AbstractC5183b f16395a;

            /* renamed from: b */
            final /* synthetic */ String f16396b;

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17188a(JSONObject jSONObject) {
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17189a(NonProguard nonProguard) {
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17190a(String str) {
                AbstractC5181a.AbstractC5183b bVar;
                try {
                    DiagramData.SVGData sVGData = (DiagramData.SVGData) JSON.parseObject(str, DiagramData.SVGData.class);
                    if (TextUtils.equals(sVGData.getResult(), "1") && !TextUtils.isEmpty(sVGData.getSvgString()) && (bVar = this.f16395a) != null) {
                        bVar.onDataReceived(this.f16396b, sVGData.getSvgString());
                    }
                } catch (Exception e) {
                    C13479a.m54758a("DiagramPlugin", "parse SVGData failed: " + e.getMessage());
                }
            }

            C5855a(AbstractC5181a.AbstractC5183b bVar, String str) {
                this.f16395a = bVar;
                this.f16396b = str;
            }
        }

        @Override // com.bytedance.ee.bear.document.imageviewer.diagram.DiagramViewModel.Delegate
        /* renamed from: a */
        public void mo23535a(String str, int i, AbstractC5181a.AbstractC5183b bVar) {
            C13479a.m54764b("DiagramPlugin", "request diagram svg data, uuid = " + C13598b.m55191a(str));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((Object) "uuid", (Object) str);
            jSONObject2.put((Object) "index", (Object) Integer.valueOf(i));
            this.f16394a.dispatchBridgeMsg("window.lark.biz.util.requestDiagramSVGData", jSONObject, new C5855a(bVar, str));
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.util.sendDiagramBase64Data", new DiagramBase64DataHandler());
    }

    public final void registerDiagramBase64DataRequestListener(AbstractC5181a.AbstractC5182a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        DiagramViewModel aVar2 = this.mDiagramViewModel;
        if (aVar2 != null) {
            aVar2.registerDiagramBase64DataRequestListener(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        DiagramViewModel aVar = this.mDiagramViewModel;
        if (aVar != null) {
            aVar.setDelegate(null);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        DiagramViewModel aVar = (DiagramViewModel) viewModel(DiagramViewModel.class);
        this.mDiagramViewModel = aVar;
        if (aVar != null) {
            aVar.setDelegate(new C5854c(this));
        }
    }

    public final void requestDiagramSVGData(String str, int i, AbstractC5181a.AbstractC5183b bVar) {
        DiagramViewModel aVar = this.mDiagramViewModel;
        if (aVar != null) {
            aVar.requestDiagramSVGData(str, i, bVar);
        }
    }
}
