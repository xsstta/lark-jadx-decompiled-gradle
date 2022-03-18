package com.he.v8_inspect.protocol.module;

import android.content.Context;
import com.he.v8_inspect.json.JsonProperty;
import com.he.v8_inspect.json.JsonValue;
import com.he.v8_inspect.jsonrpc.JsonRpcException;
import com.he.v8_inspect.jsonrpc.JsonRpcResult;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcError;
import com.he.v8_inspect.jsonrpc.protocol.JsonRpcPeer;
import com.he.v8_inspect.network.AsyncPrettyPrinterInitializer;
import com.he.v8_inspect.network.NetworkPeerManager;
import com.he.v8_inspect.network.ResponseBodyData;
import com.he.v8_inspect.network.ResponseBodyFileManager;
import com.he.v8_inspect.protocol.ChromeDevtoolsDomain;
import com.he.v8_inspect.protocol.ChromeDevtoolsMethod;
import com.he.v8_inspect.protocol.module.Console;
import com.he.v8_inspect.protocol.module.Page;
import com.he.v8_inspect.utils.Util;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Network implements ChromeDevtoolsDomain {
    private final NetworkPeerManager mNetworkPeerManager;
    private final ResponseBodyFileManager mResponseBodyFileManager;

    public static class DataReceivedParams {
        @JsonProperty(required = true)
        public int dataLength;
        @JsonProperty(required = true)
        public int encodedDataLength;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class Initiator {
        @JsonProperty
        public List<Console.CallFrame> stackTrace;
        @JsonProperty(required = true)
        public InitiatorType type;
    }

    public static class LoadingFailedParams {
        @JsonProperty(required = true)
        public String errorText;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty
        public Page.ResourceType type;
    }

    public static class LoadingFinishedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class Request {
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty(required = true)
        public String method;
        @JsonProperty
        public String postData;
        @JsonProperty(required = true)
        public String url;
    }

    public static class RequestWillBeSentParams {
        @JsonProperty(required = true)
        public String documentURL;
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public Initiator initiator;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty
        public Response redirectResponse;
        @JsonProperty(required = true)
        public Request request;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty
        public Page.ResourceType type;
    }

    public static class ResourceTiming {
        @JsonProperty(required = true)
        public double connectionEnd;
        @JsonProperty(required = true)
        public double connectionStart;
        @JsonProperty(required = true)
        public double dnsEnd;
        @JsonProperty(required = true)
        public double dnsStart;
        @JsonProperty(required = true)
        public double proxyEnd;
        @JsonProperty(required = true)
        public double proxyStart;
        @JsonProperty(required = true)
        public double receivedHeadersEnd;
        @JsonProperty(required = true)
        public double requestTime;
        @JsonProperty(required = true)
        public double sendEnd;
        @JsonProperty(required = true)
        public double sendStart;
        @JsonProperty(required = true)
        public double sslEnd;
        @JsonProperty(required = true)
        public double sslStart;
    }

    public static class Response {
        @JsonProperty(required = true)
        public int connectionId;
        @JsonProperty(required = true)
        public boolean connectionReused;
        @JsonProperty(required = true)
        public Boolean fromDiskCache;
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty
        public String headersText;
        @JsonProperty(required = true)
        public String mimeType;
        @JsonProperty
        public JSONObject requestHeaders;
        @JsonProperty
        public String requestHeadersTest;
        @JsonProperty(required = true)
        public int status;
        @JsonProperty(required = true)
        public String statusText;
        @JsonProperty
        public ResourceTiming timing;
        @JsonProperty(required = true)
        public String url;
    }

    public static class ResponseReceivedParams {
        @JsonProperty(required = true)
        public String frameId;
        @JsonProperty(required = true)
        public String loaderId;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public Response response;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty(required = true)
        public Page.ResourceType type;
    }

    public static class WebSocketClosedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class WebSocketCreatedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public String url;
    }

    public static class WebSocketFrame {
        @JsonProperty(required = true)
        public boolean mask;
        @JsonProperty(required = true)
        public int opcode;
        @JsonProperty(required = true)
        public String payloadData;
    }

    public static class WebSocketFrameErrorParams {
        @JsonProperty(required = true)
        public String errorMessage;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class WebSocketFrameReceivedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketFrame response;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class WebSocketFrameSentParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketFrame response;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class WebSocketHandshakeResponseReceivedParams {
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public WebSocketResponse response;
        @JsonProperty(required = true)
        public double timestamp;
    }

    public static class WebSocketRequest {
        @JsonProperty(required = true)
        public JSONObject headers;
    }

    public static class WebSocketResponse {
        @JsonProperty(required = true)
        public JSONObject headers;
        @JsonProperty
        public String headersText;
        @JsonProperty
        public JSONObject requestHeaders;
        @JsonProperty
        public String requestHeadersText;
        @JsonProperty(required = true)
        public int status;
        @JsonProperty(required = true)
        public String statusText;
    }

    public static class WebSocketWillSendHandshakeRequestParams {
        @JsonProperty(required = true)
        public WebSocketRequest request;
        @JsonProperty(required = true)
        public String requestId;
        @JsonProperty(required = true)
        public double timestamp;
        @JsonProperty(required = true)
        public double wallTime;
    }

    @ChromeDevtoolsMethod
    public void setUserAgentOverride(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
    }

    /* access modifiers changed from: private */
    public static class GetResponseBodyResponse implements JsonRpcResult {
        @JsonProperty(required = true)
        public boolean base64Encoded;
        @JsonProperty(required = true)
        public String body;

        private GetResponseBodyResponse() {
        }
    }

    public enum InitiatorType {
        PARSER("parser"),
        SCRIPT("script"),
        OTHER("other");
        
        private final String mProtocolValue;

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }

        private InitiatorType(String str) {
            this.mProtocolValue = str;
        }
    }

    public Network(Context context) {
        NetworkPeerManager orCreateInstance = NetworkPeerManager.getOrCreateInstance(context);
        this.mNetworkPeerManager = orCreateInstance;
        this.mResponseBodyFileManager = orCreateInstance.getResponseBodyFileManager();
    }

    public void setPrettyPrinterInitializer(AsyncPrettyPrinterInitializer asyncPrettyPrinterInitializer) {
        Util.throwIfNull(asyncPrettyPrinterInitializer);
        this.mNetworkPeerManager.setPrettyPrinterInitializer(asyncPrettyPrinterInitializer);
    }

    private GetResponseBodyResponse readResponseBody(String str) throws IOException, JsonRpcException {
        GetResponseBodyResponse getResponseBodyResponse = new GetResponseBodyResponse();
        try {
            ResponseBodyData readFile = this.mResponseBodyFileManager.readFile(str);
            getResponseBodyResponse.body = readFile.data;
            getResponseBodyResponse.base64Encoded = readFile.base64Encoded;
            return getResponseBodyResponse;
        } catch (OutOfMemoryError e) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, e.toString(), null));
        }
    }

    @ChromeDevtoolsMethod
    public void disable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        this.mNetworkPeerManager.removePeer(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public void enable(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) {
        this.mNetworkPeerManager.addPeer(jsonRpcPeer);
    }

    @ChromeDevtoolsMethod
    public JsonRpcResult getResponseBody(JsonRpcPeer jsonRpcPeer, JSONObject jSONObject) throws JsonRpcException {
        try {
            return readResponseBody(jSONObject.getString("requestId"));
        } catch (IOException e) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, e.toString(), null));
        } catch (JSONException e2) {
            throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, e2.toString(), null));
        }
    }
}
