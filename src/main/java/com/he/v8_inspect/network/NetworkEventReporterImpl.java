package com.he.v8_inspect.network;

import android.os.SystemClock;
import com.he.v8_inspect.console.CLog;
import com.he.v8_inspect.network.NetworkEventReporter;
import com.he.v8_inspect.protocol.module.Console;
import com.he.v8_inspect.protocol.module.Network;
import com.he.v8_inspect.protocol.module.Page;
import com.he.v8_inspect.server.websocket.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkEventReporterImpl implements NetworkEventReporter {
    private static NetworkEventReporter sInstance;
    private final AtomicInteger mNextRequestId = new AtomicInteger(0);
    @Nullable
    private ResourceTypeHelper mResourceTypeHelper;

    private static long stethoNow() {
        return SystemClock.elapsedRealtime();
    }

    private NetworkEventReporterImpl() {
    }

    @Nullable
    private NetworkPeerManager getPeerManagerIfEnabled() {
        NetworkPeerManager instanceOrNull = NetworkPeerManager.getInstanceOrNull();
        if (instanceOrNull == null || !instanceOrNull.hasRegisteredPeers()) {
            return null;
        }
        return instanceOrNull;
    }

    @Nonnull
    private ResourceTypeHelper getResourceTypeHelper() {
        if (this.mResourceTypeHelper == null) {
            this.mResourceTypeHelper = new ResourceTypeHelper();
        }
        return this.mResourceTypeHelper;
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public boolean isEnabled() {
        if (getPeerManagerIfEnabled() != null) {
            return true;
        }
        return false;
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public String nextRequestId() {
        return String.valueOf(this.mNextRequestId.getAndIncrement());
    }

    public static synchronized NetworkEventReporter get() {
        NetworkEventReporter networkEventReporter;
        synchronized (NetworkEventReporterImpl.class) {
            if (sInstance == null) {
                sInstance = new NetworkEventReporterImpl();
            }
            networkEventReporter = sInstance;
        }
        return networkEventReporter;
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void responseReadFinished(String str) {
        loadingFinished(str);
    }

    @Nullable
    private String getContentType(NetworkEventReporter.InspectorHeaders inspectorHeaders) {
        return inspectorHeaders.firstHeaderValue("Content-Type");
    }

    private static Network.WebSocketFrame convertFrame(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) {
        Network.WebSocketFrame webSocketFrame = new Network.WebSocketFrame();
        webSocketFrame.opcode = inspectorWebSocketFrame.opcode();
        webSocketFrame.mask = inspectorWebSocketFrame.mask();
        webSocketFrame.payloadData = inspectorWebSocketFrame.payloadData();
        return webSocketFrame;
    }

    private void loadingFinished(String str) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.LoadingFinishedParams loadingFinishedParams = new Network.LoadingFinishedParams();
            loadingFinishedParams.requestId = str;
            loadingFinishedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFinished", loadingFinishedParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketClosed(String str) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketClosedParams webSocketClosedParams = new Network.WebSocketClosedParams();
            webSocketClosedParams.requestId = str;
            webSocketClosedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketClosed", webSocketClosedParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketFrameReceived(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketFrameReceivedParams webSocketFrameReceivedParams = new Network.WebSocketFrameReceivedParams();
            webSocketFrameReceivedParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketFrameReceivedParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameReceived", webSocketFrameReceivedParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketFrameSent(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketFrameSentParams webSocketFrameSentParams = new Network.WebSocketFrameSentParams();
            webSocketFrameSentParams.requestId = inspectorWebSocketFrame.requestId();
            webSocketFrameSentParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketFrameSentParams.response = convertFrame(inspectorWebSocketFrame);
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameSent", webSocketFrameSentParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketWillSendHandshakeRequest(NetworkEventReporter.InspectorWebSocketRequest inspectorWebSocketRequest) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketWillSendHandshakeRequestParams webSocketWillSendHandshakeRequestParams = new Network.WebSocketWillSendHandshakeRequestParams();
            webSocketWillSendHandshakeRequestParams.requestId = inspectorWebSocketRequest.id();
            webSocketWillSendHandshakeRequestParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketWillSendHandshakeRequestParams.wallTime = ((double) System.currentTimeMillis()) / 1000.0d;
            Network.WebSocketRequest webSocketRequest = new Network.WebSocketRequest();
            webSocketRequest.headers = formatHeadersAsJSON(inspectorWebSocketRequest);
            webSocketWillSendHandshakeRequestParams.request = webSocketRequest;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketWillSendHandshakeRequest", webSocketWillSendHandshakeRequestParams);
        }
    }

    private static JSONObject formatHeadersAsJSON(NetworkEventReporter.InspectorHeaders inspectorHeaders) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < inspectorHeaders.headerCount(); i++) {
            String headerName = inspectorHeaders.headerName(i);
            String headerValue = inspectorHeaders.headerValue(i);
            try {
                if (jSONObject.has(headerName)) {
                    jSONObject.put(headerName, jSONObject.getString(headerName) + "\n" + headerValue);
                } else {
                    jSONObject.put(headerName, headerValue);
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return jSONObject;
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void responseHeadersReceived(NetworkEventReporter.InspectorResponse inspectorResponse) {
        String str;
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.Response response = new Network.Response();
            response.url = inspectorResponse.url();
            response.status = inspectorResponse.statusCode();
            response.statusText = inspectorResponse.reasonPhrase();
            response.headers = formatHeadersAsJSON(inspectorResponse);
            String contentType = getContentType(inspectorResponse);
            if (contentType != null) {
                str = getResourceTypeHelper().stripContentExtras(contentType);
            } else {
                str = "application/octet-stream";
            }
            response.mimeType = str;
            response.connectionReused = inspectorResponse.connectionReused();
            response.connectionId = inspectorResponse.connectionId();
            response.fromDiskCache = Boolean.valueOf(inspectorResponse.fromDiskCache());
            Network.ResponseReceivedParams responseReceivedParams = new Network.ResponseReceivedParams();
            responseReceivedParams.requestId = inspectorResponse.requestId();
            responseReceivedParams.frameId = "1";
            responseReceivedParams.loaderId = "1";
            responseReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            responseReceivedParams.response = response;
            responseReceivedParams.type = determineResourceType(initAsyncPrettyPrinterForResponse(inspectorResponse, peerManagerIfEnabled), contentType, getResourceTypeHelper());
            peerManagerIfEnabled.sendNotificationToPeers("Network.responseReceived", responseReceivedParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketHandshakeResponseReceived(NetworkEventReporter.InspectorWebSocketResponse inspectorWebSocketResponse) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketHandshakeResponseReceivedParams webSocketHandshakeResponseReceivedParams = new Network.WebSocketHandshakeResponseReceivedParams();
            webSocketHandshakeResponseReceivedParams.requestId = inspectorWebSocketResponse.requestId();
            webSocketHandshakeResponseReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            Network.WebSocketResponse webSocketResponse = new Network.WebSocketResponse();
            webSocketResponse.headers = formatHeadersAsJSON(inspectorWebSocketResponse);
            webSocketResponse.headersText = null;
            if (inspectorWebSocketResponse.requestHeaders() != null) {
                webSocketResponse.requestHeaders = formatHeadersAsJSON(inspectorWebSocketResponse.requestHeaders());
                webSocketResponse.requestHeadersText = null;
            }
            webSocketResponse.status = inspectorWebSocketResponse.statusCode();
            webSocketResponse.statusText = inspectorWebSocketResponse.reasonPhrase();
            webSocketHandshakeResponseReceivedParams.response = webSocketResponse;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketHandshakeResponseReceived", webSocketHandshakeResponseReceivedParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void requestWillBeSent(NetworkEventReporter.InspectorRequest inspectorRequest) {
        int i;
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.Request request = new Network.Request();
            request.url = inspectorRequest.url();
            request.method = inspectorRequest.method();
            request.headers = formatHeadersAsJSON(inspectorRequest);
            request.postData = readBodyAsString(peerManagerIfEnabled, inspectorRequest);
            String friendlyName = inspectorRequest.friendlyName();
            Integer friendlyNameExtra = inspectorRequest.friendlyNameExtra();
            Network.Initiator initiator = new Network.Initiator();
            initiator.type = Network.InitiatorType.SCRIPT;
            initiator.stackTrace = new ArrayList();
            List<Console.CallFrame> list = initiator.stackTrace;
            if (friendlyNameExtra != null) {
                i = friendlyNameExtra.intValue();
            } else {
                i = 0;
            }
            list.add(new Console.CallFrame(friendlyName, friendlyName, i, 0));
            Network.RequestWillBeSentParams requestWillBeSentParams = new Network.RequestWillBeSentParams();
            requestWillBeSentParams.requestId = inspectorRequest.id();
            requestWillBeSentParams.frameId = "1";
            requestWillBeSentParams.loaderId = "1";
            requestWillBeSentParams.documentURL = inspectorRequest.url();
            requestWillBeSentParams.request = request;
            requestWillBeSentParams.timestamp = ((double) stethoNow()) / 1000.0d;
            requestWillBeSentParams.initiator = initiator;
            requestWillBeSentParams.redirectResponse = null;
            requestWillBeSentParams.type = Page.ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.requestWillBeSent", requestWillBeSentParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void httpExchangeFailed(String str, String str2) {
        loadingFailed(str, str2);
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void responseReadFailed(String str, String str2) {
        loadingFailed(str, str2);
    }

    @Nullable
    private static AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(NetworkEventReporter.InspectorResponse inspectorResponse, NetworkPeerManager networkPeerManager) {
        AsyncPrettyPrinter createPrettyPrinterForResponse = createPrettyPrinterForResponse(inspectorResponse, networkPeerManager.getAsyncPrettyPrinterRegistry());
        if (createPrettyPrinterForResponse != null) {
            networkPeerManager.getResponseBodyFileManager().associateAsyncPrettyPrinterWithId(inspectorResponse.requestId(), createPrettyPrinterForResponse);
        }
        return createPrettyPrinterForResponse;
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketCreated(String str, String str2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketCreatedParams webSocketCreatedParams = new Network.WebSocketCreatedParams();
            webSocketCreatedParams.requestId = str;
            webSocketCreatedParams.url = str2;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketCreated", webSocketCreatedParams);
        }
    }

    @Nullable
    static AsyncPrettyPrinter createPrettyPrinterForResponse(NetworkEventReporter.InspectorResponse inspectorResponse, @Nullable AsyncPrettyPrinterRegistry asyncPrettyPrinterRegistry) {
        if (asyncPrettyPrinterRegistry == null) {
            return null;
        }
        int headerCount = inspectorResponse.headerCount();
        for (int i = 0; i < headerCount; i++) {
            AsyncPrettyPrinterFactory lookup = asyncPrettyPrinterRegistry.lookup(inspectorResponse.headerName(i));
            if (lookup != null) {
                return lookup.getInstance(inspectorResponse.headerName(i), inspectorResponse.headerValue(i));
            }
        }
        return null;
    }

    private void loadingFailed(String str, String str2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.LoadingFailedParams loadingFailedParams = new Network.LoadingFailedParams();
            loadingFailedParams.requestId = str;
            loadingFailedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            loadingFailedParams.errorText = str2;
            loadingFailedParams.type = Page.ResourceType.OTHER;
            peerManagerIfEnabled.sendNotificationToPeers("Network.loadingFailed", loadingFailedParams);
        }
    }

    @Nullable
    private static String readBodyAsString(NetworkPeerManager networkPeerManager, NetworkEventReporter.InspectorRequest inspectorRequest) {
        try {
            byte[] body = inspectorRequest.body();
            if (body != null) {
                return new String(body, Utf8Charset.INSTANCE);
            }
            return null;
        } catch (IOException | OutOfMemoryError e) {
            Console.MessageLevel messageLevel = Console.MessageLevel.WARNING;
            Console.MessageSource messageSource = Console.MessageSource.NETWORK;
            CLog.writeToConsole(networkPeerManager, messageLevel, messageSource, "Could not reproduce POST body: " + e);
            return null;
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void webSocketFrameError(String str, String str2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.WebSocketFrameErrorParams webSocketFrameErrorParams = new Network.WebSocketFrameErrorParams();
            webSocketFrameErrorParams.requestId = str;
            webSocketFrameErrorParams.timestamp = ((double) stethoNow()) / 1000.0d;
            webSocketFrameErrorParams.errorMessage = str2;
            peerManagerIfEnabled.sendNotificationToPeers("Network.webSocketFrameError", webSocketFrameErrorParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void dataSent(String str, int i, int i2) {
        dataReceived(str, i, i2);
    }

    private static Page.ResourceType determineResourceType(AsyncPrettyPrinter asyncPrettyPrinter, String str, ResourceTypeHelper resourceTypeHelper) {
        if (asyncPrettyPrinter != null) {
            return asyncPrettyPrinter.getPrettifiedType().getResourceType();
        }
        if (str != null) {
            return resourceTypeHelper.determineResourceType(str);
        }
        return Page.ResourceType.OTHER;
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public void dataReceived(String str, int i, int i2) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Network.DataReceivedParams dataReceivedParams = new Network.DataReceivedParams();
            dataReceivedParams.requestId = str;
            dataReceivedParams.timestamp = ((double) stethoNow()) / 1000.0d;
            dataReceivedParams.dataLength = i;
            dataReceivedParams.encodedDataLength = i2;
            peerManagerIfEnabled.sendNotificationToPeers("Network.dataReceived", dataReceivedParams);
        }
    }

    @Override // com.he.v8_inspect.network.NetworkEventReporter
    public InputStream interpretResponseStream(String str, @Nullable String str2, @Nullable String str3, @Nullable InputStream inputStream, ResponseHandler responseHandler) {
        NetworkPeerManager peerManagerIfEnabled = getPeerManagerIfEnabled();
        if (peerManagerIfEnabled != null) {
            Page.ResourceType resourceType = null;
            if (inputStream == null) {
                responseHandler.onEOF();
                return null;
            }
            if (str2 != null) {
                resourceType = getResourceTypeHelper().determineResourceType(str2);
            }
            boolean z = false;
            if (resourceType != null && resourceType == Page.ResourceType.IMAGE) {
                z = true;
            }
            try {
                return DecompressionHelper.teeInputWithDecompression(peerManagerIfEnabled, str, inputStream, peerManagerIfEnabled.getResponseBodyFileManager().openResponseBodyFile(str, z), str3, responseHandler);
            } catch (IOException unused) {
                Console.MessageLevel messageLevel = Console.MessageLevel.ERROR;
                Console.MessageSource messageSource = Console.MessageSource.NETWORK;
                CLog.writeToConsole(peerManagerIfEnabled, messageLevel, messageSource, "Error writing response body data for request #" + str);
            }
        }
        return inputStream;
    }
}
