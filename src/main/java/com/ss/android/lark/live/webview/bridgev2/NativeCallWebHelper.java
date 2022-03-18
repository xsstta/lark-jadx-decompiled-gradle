package com.ss.android.lark.live.webview.bridgev2;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper;", "", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "changeContainerMode", "", "event", "Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$Event;", "changeContainerModeV2", "mode", "Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$ContainerMode;", "sendData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "ContainerMode", "ContainerModeChangeParam", "ContainerOrientation", "ContainerOrientationChangeParam", "Data", "Event", "Message", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NativeCallWebHelper {

    /* renamed from: a */
    public static final Companion f105580a = new Companion(null);

    /* renamed from: b */
    private final WebView f105581b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$ContainerMode;", "", "v", "", "(Ljava/lang/String;II)V", "getV", "()I", "Unknown", "Normal", "Mini", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ContainerMode {
        Unknown(0),
        Normal(1),
        Mini(2);
        

        /* renamed from: v */
        private final int f105582v;

        public final int getV() {
            return this.f105582v;
        }

        private ContainerMode(int i) {
            this.f105582v = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$ContainerOrientation;", "", "v", "", "(Ljava/lang/String;II)V", "getV", "()I", "Unknown", "Vertical", "Horizontal", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ContainerOrientation {
        Unknown(0),
        Vertical(1),
        Horizontal(2);
        

        /* renamed from: v */
        private final int f105583v;

        public final int getV() {
            return this.f105583v;
        }

        private ContainerOrientation(int i) {
            this.f105583v = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$Event;", "", "v", "", "(Ljava/lang/String;II)V", "getV", "()I", "Unknown", "SwitchNormalMode", "SwitchMiniMode", "ContainerModeChange", "ContainerOrientationChange", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Event {
        Unknown(0),
        SwitchNormalMode(1),
        SwitchMiniMode(2),
        ContainerModeChange(3),
        ContainerOrientationChange(4);
        

        /* renamed from: v */
        private final int f105584v;

        public final int getV() {
            return this.f105584v;
        }

        private Event(int i) {
            this.f105584v = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$Companion;", "", "()V", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.NativeCallWebHelper$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$ContainerModeChangeParam;", "", "mode", "", "(Ljava/lang/Integer;)V", "getMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.NativeCallWebHelper$b */
    public static final class ContainerModeChangeParam {
        @JSONField(name = "mode")

        /* renamed from: a */
        private final Integer f105585a;

        public ContainerModeChangeParam(Integer num) {
            this.f105585a = num;
        }
    }

    public NativeCallWebHelper(WebView webView) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        this.f105581b = webView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.NativeCallWebHelper$e */
    public static final class C41533e<T> implements ValueCallback<String> {

        /* renamed from: a */
        public static final C41533e f105591a = new C41533e();

        C41533e() {
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            C45855f.m181664c("NativeCallWebHelper", "[sendData2] callback " + str);
        }
    }

    /* renamed from: a */
    public final void mo149444a(ContainerMode containerMode) {
        Intrinsics.checkParameterIsNotNull(containerMode, "mode");
        mo149445a(new Data(Event.ContainerModeChange.getV(), new ContainerModeChangeParam(Integer.valueOf(containerMode.getV()))));
    }

    /* renamed from: a */
    public final void mo149445a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        StringCompanionObject mVar = StringCompanionObject.f173215a;
        String format = String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s);", Arrays.copyOf(new Object[]{JSON.toJSONString(new Message(null, null, obj, 3, null))}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        C45855f.m181664c("NativeCallWebHelper", "[sendData] data: " + format);
        this.f105581b.evaluateJavascript(format, C41533e.f105591a);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$Data;", "", "liveEvent", "", "params", "(ILjava/lang/Object;)V", "getLiveEvent", "()I", "getParams", "()Ljava/lang/Object;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.NativeCallWebHelper$c */
    public static final class Data {
        @JSONField(name = "live_event")

        /* renamed from: a */
        private final int f105586a;
        @JSONField(name = "params")

        /* renamed from: b */
        private final Object f105587b;

        public Data(int i, Object obj) {
            this.f105586a = i;
            this.f105587b = obj;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/NativeCallWebHelper$Message;", "", "callbackID", "", "callbackType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCallbackID", "()Ljava/lang/String;", "getCallbackType", "getData", "()Ljava/lang/Object;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.NativeCallWebHelper$d */
    public static final class Message {
        @JSONField(name = "callbackID")

        /* renamed from: a */
        private final String f105588a;
        @JSONField(name = "callbackType")

        /* renamed from: b */
        private final String f105589b;
        @JSONField(name = Constants.ScionAnalytics.MessageType.DATA_MESSAGE)

        /* renamed from: c */
        private final Object f105590c;

        public Message(String str, String str2, Object obj) {
            Intrinsics.checkParameterIsNotNull(str, "callbackID");
            Intrinsics.checkParameterIsNotNull(str2, "callbackType");
            this.f105588a = str;
            this.f105589b = str2;
            this.f105590c = obj;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Message(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "lark_vc_live_bridge" : str, (i & 2) != 0 ? "continued" : str2, obj);
        }
    }
}
