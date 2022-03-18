package com.bytedance.common.wschannel.channel.impl.ok.ws;

import com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.RealWebSocket;
import okio.ByteString;

public class CustomHeartBeatRealWebSocket implements CustomHeartBeatWebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final long ioLimitLength;
    private final String key;
    public WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private RealWebSocket.Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    /* access modifiers changed from: package-private */
    public final class CancelRunnable implements Runnable {
        public void run() {
            CustomHeartBeatRealWebSocket.this.cancel();
        }

        CancelRunnable() {
        }
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    public void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r2 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.writePong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Message) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r2 = r4.data;
        r0 = okio.C69705k.m267589a(r0.newMessageSink(r4.formatOpcode, (long) r2.size()));
        r0.mo244532b(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r12.queueSize -= (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r4 = (com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.Close) r4;
        r0.writeClose(r4.code, r4.reason);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r1 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r0 = r12.listener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        r0.onClosed(r12, r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        okhttp3.internal.Util.closeQuietly(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        okhttp3.internal.Util.closeQuietly(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean writeOneFrame() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.writeOneFrame():boolean");
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String str) throws IOException {
        WebSocketListener webSocketListener = this.listener;
        if (webSocketListener != null) {
            webSocketListener.onMessage(this, str);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatWebSocket
    public void sendPing(ByteString byteString) {
        if (byteString == null) {
            byteString = ByteString.EMPTY;
        }
        writePingFrame(byteString);
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString byteString) throws IOException {
        WebSocketListener webSocketListener = this.listener;
        if (webSocketListener != null) {
            webSocketListener.onMessage(this, byteString);
        }
    }

    @Override // okhttp3.WebSocket
    public boolean send(String str) {
        Objects.requireNonNull(str, "text == null");
        return send(ByteString.encodeUtf8(str), 1);
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString byteString) {
        this.receivedPongCount++;
        this.awaitingPong = false;
        WebSocketListener webSocketListener = this.listener;
        if (webSocketListener != null) {
            webSocketListener.onPong(this, byteString);
        }
    }

    @Override // okhttp3.WebSocket
    public boolean send(ByteString byteString) {
        Objects.requireNonNull(byteString, "bytes == null");
        return send(byteString, 2);
    }

    public void connect(OkHttpClient okHttpClient) {
        final Request build = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(okHttpClient, build);
        this.call = newWebSocketCall;
        newWebSocketCall.enqueue(new Callback() {
            /* class com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.C36562 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                CustomHeartBeatRealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    CustomHeartBeatRealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    RealWebSocket.Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        if (CustomHeartBeatRealWebSocket.this.listener != null) {
                            CustomHeartBeatRealWebSocket.this.listener.onOpen(CustomHeartBeatRealWebSocket.this, response);
                        }
                        CustomHeartBeatRealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        CustomHeartBeatRealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        CustomHeartBeatRealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (ProtocolException e2) {
                    CustomHeartBeatRealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString byteString) {
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(byteString);
                runWriter();
                this.receivedPingCount++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong"), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0.writePing(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        failWebSocket(r6, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writePingFrame(okio.ByteString r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.failed     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0034 }
            return
        L_0x0007:
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketWriter r0 = r5.writer     // Catch:{ all -> 0x0034 }
            boolean r1 = r5.awaitingPong     // Catch:{ all -> 0x0034 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r5.sentPingCount     // Catch:{ all -> 0x0034 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r5.sentPingCount     // Catch:{ all -> 0x0034 }
            r4 = 1
            int r3 = r3 + r4
            r5.sentPingCount = r3     // Catch:{ all -> 0x0034 }
            r5.awaitingPong = r4     // Catch:{ all -> 0x0034 }
            monitor-exit(r5)     // Catch:{ all -> 0x0034 }
            r3 = 0
            if (r1 == r2) goto L_0x0029
            java.net.SocketTimeoutException r6 = new java.net.SocketTimeoutException
            java.lang.String r0 = "sent ping but didn't receive pong"
            r6.<init>(r0)
            r5.failWebSocket(r6, r3)
            return
        L_0x0029:
            if (r0 == 0) goto L_0x0033
            r0.writePing(r6)     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            r5.failWebSocket(r6, r3)
        L_0x0033:
            return
        L_0x0034:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.writePingFrame(okio.ByteString):void");
    }

    /* access modifiers changed from: package-private */
    public void checkResponse(Response response) throws ProtocolException {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    String base64 = ByteString.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                    if (!base64.equals(header3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
                    }
                    return;
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
    }

    /* access modifiers changed from: package-private */
    public static final class Message {
        final ByteString data;
        final int formatOpcode;

        Message(int i, ByteString byteString) {
            this.formatOpcode = i;
            this.data = byteString;
        }
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, String str) {
        return close(i, str, 60000);
    }

    public void closeQuietly(int i, String str) {
        this.listener = null;
        try {
            close(i, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = r3.listener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r1 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        r1.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void failWebSocket(java.lang.Exception r4, okhttp3.Response r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            return
        L_0x0007:
            r0 = 1
            r3.failed = r0     // Catch:{ all -> 0x002f }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch:{ all -> 0x002f }
            r1 = 0
            r3.streams = r1     // Catch:{ all -> 0x002f }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0017
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x002f }
        L_0x0017:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x001e
            r1.shutdown()     // Catch:{ all -> 0x002f }
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0026
            r1.onFailure(r3, r4, r5)     // Catch:{ all -> 0x002a }
        L_0x0026:
            okhttp3.internal.Util.closeQuietly(r0)
            return
        L_0x002a:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly(r0)
            throw r4
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    public void initReaderAndWriter(String str, RealWebSocket.Streams streams2) throws IOException {
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.client, streams2.sink, this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new WebSocketReader(streams2.client, streams2.source, this, this.ioLimitLength);
    }

    private synchronized boolean send(ByteString byteString, int i) {
        if (!this.failed) {
            if (!this.enqueuedClose) {
                if (this.queueSize + ((long) byteString.size()) > 16777216) {
                    close(CommonCode.StatusCode.API_CLIENT_EXPIRED, null);
                    return false;
                }
                this.queueSize += (long) byteString.size();
                this.messageAndCloseQueue.add(new Message(i, byteString));
                runWriter();
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.impl.ok.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, String str) {
        RealWebSocket.Streams streams2;
        if (i != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    streams2 = null;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        RealWebSocket.Streams streams3 = this.streams;
                        this.streams = streams2;
                        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.executor.shutdown();
                        streams2 = streams3;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                WebSocketListener webSocketListener = this.listener;
                if (webSocketListener != null) {
                    webSocketListener.onClosing(this, i, str);
                    if (streams2 != null) {
                        this.listener.onClosed(this, i, str);
                    }
                }
            } finally {
                Util.closeQuietly(streams2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final ByteString reason;

        Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }
    }

    public static CustomHeartBeatRealWebSocket create(Request request, long j, WebSocketListener webSocketListener) {
        return new CustomHeartBeatRealWebSocket(request, j, webSocketListener, new Random());
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean close(int i, String str, long j) {
        WebSocketProtocol.validateCloseCode(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.encodeUtf8(str);
            if (((long) byteString.size()) > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.failed) {
            if (!this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i, byteString, j));
                runWriter();
                return true;
            }
        }
        return false;
    }

    public CustomHeartBeatRealWebSocket(Request request, long j, WebSocketListener webSocketListener, Random random2) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random2;
            this.ioLimitLength = j;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            this.key = ByteString.of(bArr).base64();
            this.writerRunnable = new Runnable() {
                /* class com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatRealWebSocket.RunnableC36551 */

                public void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            CustomHeartBeatRealWebSocket.this.failWebSocket(e, null);
                            return;
                        }
                    } while (CustomHeartBeatRealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }
}
