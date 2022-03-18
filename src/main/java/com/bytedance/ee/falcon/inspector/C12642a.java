package com.bytedance.ee.falcon.inspector;

import android.util.Log;
import com.bytedance.ee.falcon.inspector.json.C12653a;
import com.bytedance.ee.falcon.inspector.jsonrpc.JsonRpcException;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.C12659b;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.C12662c;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.C12663d;
import com.bytedance.ee.falcon.inspector.protocol.AbstractC12688a;
import com.bytedance.ee.falcon.inspector.utils.C12701b;
import com.bytedance.ee.falcon.inspector.utils.MessageHandlingException;
import com.lark.falcon.engine.inspect.AbstractC24012c;
import com.lark.falcon.engine.inspect.p1062a.p1064b.AbstractC24000g;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.inspector.a */
public class C12642a implements AbstractC24012c {

    /* renamed from: a */
    private final C12653a f33871a = new C12653a();

    /* renamed from: b */
    private final Map<AbstractC24000g, C12659b> f33872b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private C12651c f33873c;

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: a */
    public void mo48000a(AbstractC24000g gVar) {
        this.f33872b.put(gVar, new C12659b(this.f33871a, gVar));
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: b */
    public void mo48003b(AbstractC24000g gVar) {
        C12659b remove = this.f33872b.remove(gVar);
        if (remove != null) {
            remove.mo48033b();
        }
    }

    /* renamed from: a */
    public void mo48001a(List<AbstractC12688a> list) {
        this.f33873c = new C12651c(this.f33871a, list);
    }

    /* renamed from: a */
    private boolean m52416a(C12659b bVar, String str) throws IOException, MessageHandlingException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("method")) {
            return m52417a(bVar, jSONObject);
        }
        if (jSONObject.has("result")) {
            Log.d("FalconInspectSession", "not implement");
            return false;
        }
        throw new MessageHandlingException("Improper JSON-RPC message: " + str);
    }

    /* renamed from: a */
    private boolean m52417a(C12659b bVar, JSONObject jSONObject) {
        String str;
        C12662c cVar = (C12662c) this.f33871a.mo48027a((Object) jSONObject, C12662c.class);
        try {
            JSONObject a = this.f33873c.mo48024a(bVar, cVar.f33906b, cVar.f33907c);
            Log.d("FalconInspectSession", "handleRemoteRequest :" + a.toString());
            if (cVar.f33905a == null) {
                return true;
            }
            C12663d dVar = new C12663d();
            dVar.f33908a = cVar.f33905a.longValue();
            dVar.f33909b = a;
            try {
                str = ((JSONObject) this.f33871a.mo48027a(dVar, JSONObject.class)).toString();
            } catch (OutOfMemoryError e) {
                dVar.f33909b = null;
                dVar.f33910c = (JSONObject) this.f33871a.mo48027a((Object) e.getMessage(), JSONObject.class);
                str = ((JSONObject) this.f33871a.mo48027a(dVar, JSONObject.class)).toString();
            }
            bVar.mo48031a().mo86163a(str);
            return true;
        } catch (JsonRpcException unused) {
            return false;
        }
    }

    @Override // com.lark.falcon.engine.inspect.AbstractC24012c
    /* renamed from: a */
    public boolean mo48002a(AbstractC24000g gVar, String str) {
        try {
            C12659b bVar = this.f33872b.get(gVar);
            C12701b.m52567a(bVar);
            return m52416a(bVar, str);
        } catch (Throwable th) {
            Log.e("FalconInspectSession", "Throwable", th);
            return false;
        }
    }
}
