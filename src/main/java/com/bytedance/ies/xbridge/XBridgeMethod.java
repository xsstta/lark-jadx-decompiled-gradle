package com.bytedance.ies.xbridge;

import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001b\u001c\u001d\u001eJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0012\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0013H\u0016J\u0012\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0016\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeMethod;", "", "access", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "getAccess", "()Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "callback", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "provideParamModel", "Ljava/lang/Class;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "provideResultModel", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "release", "setProviderFactory", "contextProviderFactory", "Lcom/bytedance/ies/xbridge/model/context/XContextProviderFactory;", "Access", "Callback", "Companion", "JsEventDelegate", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface XBridgeMethod {

    /* renamed from: b */
    public static final Companion f37980b = Companion.f37981a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", "", "invoke", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.XBridgeMethod$a */
    public interface Callback {
        /* renamed from: a */
        void mo33972a(Map<String, Object> map);
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.XBridgeMethod$c */
    public static final class C14429c {
        /* renamed from: a */
        public static void m58208a(XBridgeMethod xBridgeMethod) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeMethod$JsEventDelegate;", "", "sendJsEvent", "", "eventName", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.XBridgeMethod$d */
    public interface JsEventDelegate {
        /* renamed from: a */
        void mo33965a(String str, XReadableMap hVar);
    }

    /* renamed from: a */
    String mo33973a();

    /* renamed from: a */
    void mo52923a(XContextProviderFactory cVar);

    /* renamed from: a */
    void mo33975a(XReadableMap hVar, Callback aVar, XBridgePlatformType xBridgePlatformType);

    /* renamed from: b */
    void mo33998b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PUBLIC", "PRIVATE", "PROTECT", "SECURE", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Access {
        PUBLIC("public"),
        PRIVATE("private"),
        PROTECT("protect"),
        SECURE("secure");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        private Access(String str) {
            this.value = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeMethod$Companion;", "", "()V", "CANCELLED", "", "FAIL", "INVALID_PARAM", "INVALID_RESULT", "OPERATION_TIMEOUT", "PARAM_CODE", "", "PARAM_DATA", "PARAM_MSG", "SUCCESS", "UNAUTHORIZED", "UNAUTHORIZED_ACCESS", "UNKNOWN_ERROR", "UNREGISTERED", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.XBridgeMethod$b */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f37981a = new Companion();

        private Companion() {
        }
    }
}
