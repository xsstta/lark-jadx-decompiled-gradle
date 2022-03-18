package com.facebook.react.modules.websocket;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.C21215c;
import com.facebook.react.modules.network.C21217e;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

@ReactModule(hasConstants = false, name = "WebSocketModule")
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public final Map<Integer, AbstractC21262a> mContentHandlers = new ConcurrentHashMap();
    private C21217e mCookieHandler;
    private ReactContext mReactContext;
    public final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap();

    /* renamed from: com.facebook.react.modules.websocket.WebSocketModule$a */
    public interface AbstractC21262a {
        /* renamed from: a */
        void mo71908a(String str, WritableMap writableMap);

        /* renamed from: a */
        void mo71909a(ByteString byteString, WritableMap writableMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        this.mCookieHandler = new C21217e(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list == null) {
                return null;
            }
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    @ReactMethod
    public void ping(int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(ByteString.EMPTY);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDefaultOrigin(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    public void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    public void setContentHandler(int i, AbstractC21262a aVar) {
        if (aVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), aVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    @ReactMethod
    public void send(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public void sendBinary(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(ByteString.decodeBase64(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void sendBinary(ByteString byteString, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public void close(int i, String str, int i2) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.close(i, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i2));
                this.mContentHandlers.remove(Integer.valueOf(i2));
            } catch (Exception e) {
                FLog.m76575e("ReactNative", "Could not close WebSocket connection for id " + i2, e);
            }
        }
    }

    @ReactMethod
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, final int i) {
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String a = C21215c.m76970a(this.mCookieHandler, url.build().url());
        if (a != null) {
            url.addHeader("Cookie", a);
        }
        if (readableMap == null || !readableMap.hasKey("headers") || !readableMap.getType("headers").equals(ReadableType.Map)) {
            url.addHeader("origin", getDefaultOrigin(str));
        } else {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            if (!map.hasKey("origin")) {
                url.addHeader("origin", getDefaultOrigin(str));
            }
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    url.addHeader(nextKey, map.getString(nextKey));
                } else {
                    FLog.m76614w("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String trim = readableArray.getString(i2).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb.append(trim);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                url.addHeader("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        build.newWebSocket(url.build(), new WebSocketListener() {
            /* class com.facebook.react.modules.websocket.WebSocketModule.C212611 */

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString(ShareHitPoint.f121869d, "text");
                AbstractC21262a aVar = WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.mo71908a(str, createMap);
                } else {
                    createMap.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("protocol", response.header("Sec-WebSocket-Protocol", ""));
                WebSocketModule.this.sendEvent("websocketOpen", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, ByteString byteString) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString(ShareHitPoint.f121869d, "binary");
                AbstractC21262a aVar = WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.mo71909a(byteString, createMap);
                } else {
                    createMap.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, byteString.base64());
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosing(WebSocket webSocket, int i, String str) {
                webSocket.close(i, str);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i, String str) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putInt("code", i);
                createMap.putString("reason", str);
                WebSocketModule.this.sendEvent("websocketClosed", createMap);
            }
        });
        build.dispatcher().executorService().shutdown();
    }
}
