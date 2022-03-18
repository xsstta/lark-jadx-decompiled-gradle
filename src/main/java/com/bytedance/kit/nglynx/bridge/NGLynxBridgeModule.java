package com.bytedance.kit.nglynx.bridge;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010J\u0012\u0010\u0013\u001a\u00020\f*\u00020\f2\u0006\u0010\u0011\u001a\u00020\n¨\u0006\u0015"}, d2 = {"Lcom/bytedance/kit/nglynx/bridge/NGLynxBridgeModule;", "Lcom/lynx/jsbridge/LynxModule;", "context", "Landroid/content/Context;", "param", "", "(Landroid/content/Context;Ljava/lang/Object;)V", "call", "", "func", "", "params", "Lcom/lynx/react/bridge/ReadableMap;", "callback", "Lcom/lynx/react/bridge/Callback;", "optBoolean", "", "key", "default", "optMap", "Companion", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NGLynxBridgeModule extends LynxModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/kit/nglynx/bridge/NGLynxBridgeModule$Companion;", "", "()V", "KEY_DATA", "", "KEY_USE_UI_THREAD", "NAME", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.bridge.NGLynxBridgeModule$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NGLynxBridgeModule(Context context, Object obj) {
        super(context, obj);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(obj, "param");
    }

    public final ReadableMap optMap(ReadableMap readableMap, String str) {
        Intrinsics.checkParameterIsNotNull(readableMap, "$this$optMap");
        Intrinsics.checkParameterIsNotNull(str, "key");
        try {
            if (!readableMap.hasKey(str)) {
                return new JavaOnlyMap();
            }
            ReadableMap map = readableMap.getMap(str);
            Intrinsics.checkExpressionValueIsNotNull(map, "this.getMap(key)");
            return map;
        } catch (Exception unused) {
            return new JavaOnlyMap();
        }
    }

    public final boolean optBoolean(ReadableMap readableMap, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(readableMap, "$this$optBoolean");
        Intrinsics.checkParameterIsNotNull(str, "key");
        try {
            if (readableMap.hasKey(str)) {
                return readableMap.getBoolean(str);
            }
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    @LynxMethod
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        Intrinsics.checkParameterIsNotNull(str, "func");
        Intrinsics.checkParameterIsNotNull(readableMap, "params");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        if (!TextUtils.isEmpty(str)) {
            if (readableMap.hasKey(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                readableMap = optMap(readableMap, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            optBoolean(readableMap, "useUIThread", true);
        }
    }
}
