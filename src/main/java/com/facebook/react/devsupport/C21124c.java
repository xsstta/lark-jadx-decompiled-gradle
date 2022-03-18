package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.common.JavascriptException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* renamed from: com.facebook.react.devsupport.c */
public class C21124c extends WebSocketListener {

    /* renamed from: a */
    private WebSocket f51509a;

    /* renamed from: b */
    private AbstractC21125a f51510b;

    /* renamed from: c */
    private final AtomicInteger f51511c = new AtomicInteger();

    /* renamed from: d */
    private final ConcurrentHashMap<Integer, AbstractC21125a> f51512d = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.react.devsupport.c$a */
    public interface AbstractC21125a {
        /* renamed from: a */
        void mo71794a(String str);

        /* renamed from: a */
        void mo71795a(Throwable th);
    }

    /* renamed from: a */
    public void mo71814a() {
        WebSocket webSocket = this.f51509a;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.f51509a = null;
        }
    }

    /* renamed from: a */
    private void m76793a(int i, String str) {
        WebSocket webSocket = this.f51509a;
        if (webSocket == null) {
            m76794a(i, new IllegalStateException("WebSocket connection no longer valid"));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            m76794a(i, e);
        }
    }

    /* renamed from: b */
    private void m76796b(int i, String str) {
        AbstractC21125a aVar = this.f51512d.get(Integer.valueOf(i));
        if (aVar != null) {
            this.f51512d.remove(Integer.valueOf(i));
            aVar.mo71794a(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        this.f51509a = webSocket;
        ((AbstractC21125a) C21045a.m76676a(this.f51510b)).mo71794a((String) null);
        this.f51510b = null;
    }

    /* renamed from: a */
    private void m76794a(int i, Throwable th) {
        AbstractC21125a aVar = this.f51512d.get(Integer.valueOf(i));
        if (aVar != null) {
            this.f51512d.remove(Integer.valueOf(i));
            aVar.mo71795a(th);
        }
    }

    /* renamed from: a */
    private void m76795a(String str, Throwable th) {
        FLog.m76575e("JSDebuggerWebSocketClient", "Error occurred, shutting down websocket connection: " + str, th);
        mo71814a();
        AbstractC21125a aVar = this.f51510b;
        if (aVar != null) {
            aVar.mo71795a(th);
            this.f51510b = null;
        }
        for (AbstractC21125a aVar2 : this.f51512d.values()) {
            aVar2.mo71795a(th);
        }
        this.f51512d.clear();
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        Integer num = null;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            String str2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (JsonToken.NULL == jsonReader.peek()) {
                    jsonReader.skipValue();
                } else if ("replyID".equals(nextName)) {
                    num = Integer.valueOf(jsonReader.nextInt());
                } else if ("result".equals(nextName)) {
                    str2 = jsonReader.nextString();
                } else if ("error".equals(nextName)) {
                    String nextString = jsonReader.nextString();
                    m76795a(nextString, new JavascriptException(nextString));
                }
            }
            if (num != null) {
                m76796b(num.intValue(), str2);
            }
        } catch (IOException e) {
            if (0 != 0) {
                m76794a(num.intValue(), e);
            } else {
                m76795a("Parsing response message from websocket failed", e);
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        this.f51509a = null;
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        m76795a("Websocket exception", th);
    }

    /* renamed from: a */
    public void mo71815a(String str, String str2, AbstractC21125a aVar) {
        int andIncrement = this.f51511c.getAndIncrement();
        this.f51512d.put(Integer.valueOf(andIncrement), aVar);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("id").value((long) andIncrement).name("method").value(str);
            stringWriter.append((CharSequence) ",\"arguments\":").append((CharSequence) str2);
            jsonWriter.endObject().close();
            m76793a(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            m76794a(andIncrement, e);
        }
    }

    /* renamed from: a */
    public void mo71816a(String str, HashMap<String, String> hashMap, AbstractC21125a aVar) {
        int andIncrement = this.f51511c.getAndIncrement();
        this.f51512d.put(Integer.valueOf(andIncrement), aVar);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter beginObject = new JsonWriter(stringWriter).beginObject().name("id").value((long) andIncrement).name("method").value("executeApplicationScript").name("url").value(str).name("inject").beginObject();
            for (String str2 : hashMap.keySet()) {
                beginObject.name(str2).value(hashMap.get(str2));
            }
            beginObject.endObject().endObject().close();
            m76793a(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            m76794a(andIncrement, e);
        }
    }
}
