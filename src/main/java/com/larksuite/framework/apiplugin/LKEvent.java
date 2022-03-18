package com.larksuite.framework.apiplugin;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.apiplugin.annotation.LKIncludeWithFailData;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.core.C25923b;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25893d;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25898i;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25901l;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1177c.C25918b;
import com.larksuite.framework.apiplugin.p1178d.C25936b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class LKEvent implements Parcelable {
    public static final Parcelable.Creator<LKEvent> CREATOR = new Parcelable.Creator<LKEvent>() {
        /* class com.larksuite.framework.apiplugin.LKEvent.C258871 */

        /* renamed from: a */
        public LKEvent[] newArray(int i) {
            return new LKEvent[i];
        }

        /* renamed from: a */
        public LKEvent createFromParcel(Parcel parcel) {
            return new LKEvent(parcel);
        }
    };

    /* renamed from: a */
    private String f64041a;

    /* renamed from: b */
    private JSONObject f64042b;

    /* renamed from: c */
    private AbstractC25891b f64043c;

    /* renamed from: d */
    private int f64044d;

    /* renamed from: e */
    private Context f64045e;

    /* renamed from: f */
    private JSONObject f64046f;

    /* renamed from: g */
    private AbstractC25894e f64047g;

    /* renamed from: h */
    private AbstractC25893d f64048h;

    /* renamed from: i */
    private AbstractC25898i f64049i;

    /* renamed from: j */
    private AbstractC25901l f64050j;

    /* renamed from: k */
    private Object f64051k;

    /* renamed from: l */
    private Map<String, Object> f64052l;

    /* renamed from: m */
    private AbstractC25905b f64053m;

    /* renamed from: n */
    private AbstractC25890a f64054n;

    /* renamed from: o */
    private EventSourceEnv f64055o;

    /* renamed from: p */
    private AbstractC25895f f64056p;

    /* renamed from: q */
    private boolean f64057q;

    /* renamed from: r */
    private LKBasePluginResult.AbstractC25940a.C25941a f64058r;

    /* renamed from: s */
    private Bundle f64059s;

    /* renamed from: t */
    private Map<String, Object> f64060t;

    public enum EventSourceEnv {
        APP_ENV,
        BIZ_ENV
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public Bundle mo92129b() {
        return this.f64059s;
    }

    /* renamed from: c */
    public AbstractC25895f mo92134c() {
        return this.f64056p;
    }

    /* renamed from: d */
    public AbstractC25905b mo92136d() {
        return this.f64053m;
    }

    /* renamed from: e */
    public Object mo92138e() {
        return this.f64051k;
    }

    /* renamed from: f */
    public Map<String, Object> mo92139f() {
        return this.f64060t;
    }

    /* renamed from: g */
    public Map<String, Object> mo92140g() {
        return this.f64052l;
    }

    /* renamed from: h */
    public EventSourceEnv mo92141h() {
        return this.f64055o;
    }

    /* renamed from: j */
    public AbstractC25898i mo92143j() {
        return this.f64049i;
    }

    /* renamed from: k */
    public int mo92144k() {
        return this.f64044d;
    }

    /* renamed from: l */
    public Context mo92145l() {
        return this.f64045e;
    }

    /* renamed from: m */
    public String mo92146m() {
        return this.f64041a;
    }

    /* renamed from: n */
    public JSONObject mo92147n() {
        return this.f64042b;
    }

    /* renamed from: o */
    public AbstractC25901l mo92148o() {
        return this.f64050j;
    }

    /* renamed from: p */
    public LKBasePluginResult.AbstractC25940a.C25941a mo92149p() {
        return this.f64058r;
    }

    /* renamed from: r */
    public AbstractC25891b mo92151r() {
        return this.f64043c;
    }

    /* renamed from: s */
    public JSONObject mo92152s() {
        return this.f64046f;
    }

    /* renamed from: v */
    public LKPluginHandleResult mo92155v() {
        return LKPluginHandleResult.f64251d;
    }

    /* renamed from: a */
    public boolean mo92128a() {
        return this.f64057q;
    }

    /* renamed from: a */
    public void mo92125a(Object obj) {
        ILogger w = m93726w();
        if (w != null) {
            w.mo92222d("LKEvent", "setFindServiceContext");
        } else {
            Log.m165379d("LKEvent", "setFindServiceContext");
        }
        this.f64051k = obj;
    }

    /* renamed from: a */
    public void mo92126a(String str, Object obj) {
        ILogger w = m93726w();
        if (w != null) {
            w.mo92222d("LKEvent", "add CommonParams key:" + str + " value:" + obj);
        } else {
            Log.m165379d("LKEvent", "add CommonParams key:" + str + " value:" + obj);
        }
        this.f64052l.put(str, obj);
    }

    /* renamed from: a */
    public void mo92127a(JSONObject jSONObject) {
        if (this.f64047g != null) {
            m93725c(jSONObject);
            this.f64047g.mo48104a(this.f64044d, jSONObject);
        }
    }

    /* renamed from: a */
    public void mo92124a(LKPluginHandleResult lKPluginHandleResult) {
        AbstractC25893d dVar = this.f64048h;
        if (dVar != null) {
            dVar.callback(this.f64044d, lKPluginHandleResult);
        }
    }

    /* renamed from: com.larksuite.framework.apiplugin.LKEvent$a */
    public static class C25888a {

        /* renamed from: a */
        public String f64061a;

        /* renamed from: b */
        public JSONObject f64062b;

        /* renamed from: c */
        public Context f64063c;

        /* renamed from: d */
        public int f64064d = -1;

        /* renamed from: e */
        public AbstractC25901l f64065e;

        /* renamed from: f */
        public AbstractC25891b f64066f;

        /* renamed from: g */
        public OPTrace f64067g;

        /* renamed from: h */
        public boolean f64068h;

        /* renamed from: i */
        public LKBasePluginResult.AbstractC25940a.C25941a f64069i;

        /* renamed from: j */
        public Bundle f64070j;

        /* renamed from: a */
        public LKEvent mo92171a() {
            return new LKEvent(this);
        }

        /* renamed from: a */
        public C25888a mo92161a(int i) {
            this.f64064d = i;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92162a(Context context) {
            this.f64063c = context;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92163a(Bundle bundle) {
            this.f64070j = bundle;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92164a(AbstractC25891b bVar) {
            this.f64066f = bVar;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92165a(AbstractC25901l lVar) {
            this.f64065e = lVar;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92166a(LKBasePluginResult.AbstractC25940a.C25941a aVar) {
            this.f64069i = aVar;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92167a(OPTrace oPTrace) {
            this.f64067g = oPTrace;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92168a(String str) {
            this.f64061a = str;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92169a(JSONObject jSONObject) {
            this.f64062b = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C25888a mo92170a(boolean z) {
            this.f64068h = z;
            return this;
        }
    }

    /* renamed from: q */
    public boolean mo92150q() {
        if (this.f64050j != null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private ILogger m93726w() {
        AbstractC25895f fVar = this.f64056p;
        if (fVar != null) {
            return fVar.mo92190b();
        }
        return null;
    }

    /* renamed from: i */
    public AbstractC25890a mo92142i() {
        if (this.f64054n == null) {
            this.f64054n = C25923b.m93869a();
        }
        return this.f64054n;
    }

    /* renamed from: t */
    public void mo92153t() {
        mo92127a(new JSONObject());
    }

    /* renamed from: u */
    public LKPluginHandleResult mo92154u() {
        return ((LKPluginHandleResult.C25942a) new LKPluginHandleResult.C25942a().mo92277a(Integer.MIN_VALUE)).mo92282a(true).mo92283a();
    }

    /* renamed from: a */
    public void mo92117a(Context context) {
        this.f64045e = context;
    }

    /* renamed from: a */
    public LKPluginHandleResult mo92115a(AbstractC25903n nVar) {
        return mo92114a(Integer.MIN_VALUE, nVar);
    }

    /* renamed from: b */
    public LKPluginHandleResult mo92131b(JSONObject jSONObject) {
        m93725c(jSONObject);
        return mo92130b(Integer.MIN_VALUE, jSONObject);
    }

    /* renamed from: a */
    public void mo92118a(EventSourceEnv eventSourceEnv) {
        this.f64055o = eventSourceEnv;
    }

    protected LKEvent(Parcel parcel) {
        boolean z;
        this.f64041a = parcel.readString();
        this.f64044d = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f64057q = z;
        String readString = parcel.readString();
        if (!TextUtils.isEmpty(readString)) {
            Object parse = JSON.parse(readString);
            if (parse instanceof Map) {
                this.f64052l = (Map) parse;
            }
        }
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable instanceof EventSourceEnv) {
            this.f64055o = (EventSourceEnv) readSerializable;
        }
        this.f64056p = new C25918b();
        String readString2 = parcel.readString();
        try {
            if (!TextUtils.isEmpty(readString2)) {
                this.f64042b = new JSONObject(readString2);
            }
        } catch (JSONException e) {
            Log.m165384e("LKEvent", "JSONException", e);
        }
        if (this.f64042b == null) {
            this.f64042b = new JSONObject();
            Log.m165389i("LKEvent", "event params is empty!");
        }
        this.f64059s = parcel.readBundle(getClass().getClassLoader());
    }

    /* renamed from: c */
    private void m93725c(JSONObject jSONObject) {
        JSONObject jSONObject2 = this.f64046f;
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator<String> keys = this.f64046f.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.put(next, this.f64046f.get(next));
                } catch (JSONException e) {
                    ILogger w = m93726w();
                    if (w != null) {
                        w.mo92223e("LKEvent", "JSONException", e);
                    } else {
                        Log.m165384e("LKEvent", "JSONException", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo92119a(AbstractC25890a aVar) {
        ILogger w = m93726w();
        if (w != null) {
            w.mo92224i("LKEvent", "setAsyncHandleEventExecutor");
        } else {
            Log.m165389i("LKEvent", "setAsyncHandleEventExecutor");
        }
        this.f64054n = aVar;
    }

    private LKEvent(C25888a aVar) {
        this.f64057q = aVar.f64068h;
        this.f64056p = new C25918b(aVar.f64067g);
        this.f64046f = new JSONObject();
        this.f64041a = aVar.f64061a;
        this.f64042b = aVar.f64062b;
        this.f64045e = aVar.f64063c;
        int i = aVar.f64064d;
        this.f64044d = i;
        if (i == -1) {
            this.f64044d = new Random().nextInt();
        }
        this.f64050j = aVar.f64065e;
        this.f64052l = new HashMap();
        this.f64060t = new HashMap();
        mo92120a(aVar.f64066f);
        this.f64058r = aVar.f64069i;
        this.f64059s = aVar.f64070j;
    }

    /* renamed from: a */
    public void mo92120a(AbstractC25891b bVar) {
        this.f64043c = bVar;
        if (bVar != null) {
            this.f64053m = bVar.mo92184v();
            if (this.f64045e == null) {
                this.f64045e = this.f64043c.mo49749b();
            }
        }
        ILogger w = m93726w();
        if (w != null) {
            w.mo92222d("LKEvent", "setSourceNode");
            return;
        }
        Log.m165379d("LKEvent", "setSourceNode");
    }

    /* renamed from: a */
    public void mo92121a(AbstractC25893d dVar) {
        this.f64048h = dVar;
    }

    /* renamed from: b */
    public void mo92132b(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (obj != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(ApiHandler.API_CALLBACK_ERRMSG, C25906a.f64080j.f64117J);
                if (obj instanceof C25921b) {
                    LKIncludeWithFailData lKIncludeWithFailData = (LKIncludeWithFailData) obj.getClass().getAnnotation(LKIncludeWithFailData.class);
                    C25921b bVar = (C25921b) obj;
                    JSONObject jSONObject4 = new JSONObject(JSON.toJSONString(bVar));
                    if (bVar.mIsArrayBuffer && bVar.getArrayBuffers() != null) {
                        LKPluginHandleResult.C25942a aVar = new LKPluginHandleResult.C25942a();
                        if (bVar.mErrorCode != Integer.MIN_VALUE && lKIncludeWithFailData == null) {
                            jSONObject4 = C25936b.m93906a(bVar);
                        }
                        ((LKPluginHandleResult.C25942a) aVar.mo92280a(jSONObject4)).mo92282a(bVar.isCease()).mo92279a(bVar.getArrayBuffers());
                        if (bVar.mErrorCode != Integer.MIN_VALUE) {
                            aVar.mo92277a(bVar.mErrorCode);
                        }
                        mo92124a(aVar.mo92283a());
                    } else if (bVar.mErrorCode != Integer.MIN_VALUE) {
                        ILogger w = m93726w();
                        if (w != null) {
                            w.mo92224i("LKEvent", "errorCode:" + bVar.mErrorCode + " eventName:" + this.f64041a);
                        } else {
                            Log.m165389i("LKEvent", "errorCode:" + bVar.mErrorCode + " eventName:" + this.f64041a);
                        }
                        if (lKIncludeWithFailData != null) {
                            mo92116a(bVar.mErrorCode, jSONObject4);
                            return;
                        }
                        mo92116a(bVar.mErrorCode, C25936b.m93906a(bVar));
                    } else {
                        jSONObject4.remove("innerCode");
                        mo92127a(jSONObject4);
                    }
                } else {
                    if (obj instanceof JSONObject) {
                        jSONObject = (JSONObject) obj;
                    } else {
                        if (obj instanceof Map) {
                            jSONObject2 = new JSONObject((Map) obj);
                        } else {
                            if (obj instanceof String) {
                                obj = JSON.parseObject((String) obj);
                            }
                            jSONObject2 = new JSONObject(JSON.toJSONString(obj));
                        }
                        jSONObject = jSONObject2;
                    }
                    mo92127a(jSONObject);
                }
            } catch (JSONException e) {
                ILogger w2 = m93726w();
                if (w2 != null) {
                    w2.mo92223e("LKEvent", "JSONException", e);
                } else {
                    Log.m165384e("LKEvent", "JSONException", e);
                }
                mo92116a(C25906a.f64080j.f64115H, jSONObject3);
            } catch (com.alibaba.fastjson.JSONException e2) {
                ILogger w3 = m93726w();
                if (w3 != null) {
                    w3.mo92223e("LKEvent", "fast JSONException", e2);
                } else {
                    Log.m165384e("LKEvent", "fast JSONException", e2);
                }
                mo92116a(C25906a.f64080j.f64115H, jSONObject3);
            }
        } else {
            ILogger w4 = m93726w();
            if (w4 != null) {
                w4.mo92224i("LKEvent", "result is null");
            } else {
                Log.m165389i("LKEvent", "result is null");
            }
            mo92153t();
        }
    }

    /* renamed from: a */
    public void mo92122a(AbstractC25894e eVar) {
        this.f64047g = eVar;
    }

    /* renamed from: a */
    public void mo92123a(AbstractC25898i iVar) {
        this.f64049i = iVar;
    }

    /* renamed from: b */
    public void mo92133b(String str, Object obj) {
        this.f64060t.put(str, obj);
    }

    /* renamed from: a */
    public void mo92116a(int i, JSONObject jSONObject) {
        if (this.f64047g != null) {
            m93725c(jSONObject);
            this.f64047g.mo48103a(this.f64044d, i, jSONObject);
        }
    }

    /* renamed from: a */
    public LKPluginHandleResult mo92114a(int i, AbstractC25903n nVar) {
        return ((LKPluginHandleResult.C25942a) ((LKPluginHandleResult.C25942a) new LKPluginHandleResult.C25942a().mo92278a(nVar)).mo92277a(i)).mo92282a(true).mo92283a();
    }

    /* renamed from: b */
    public LKPluginHandleResult mo92130b(int i, JSONObject jSONObject) {
        return ((LKPluginHandleResult.C25942a) ((LKPluginHandleResult.C25942a) new LKPluginHandleResult.C25942a().mo92280a(jSONObject)).mo92277a(i)).mo92282a(true).mo92283a();
    }

    /* renamed from: c */
    public void mo92135c(String str, Object obj) {
        try {
            this.f64046f.put(str, obj);
        } catch (JSONException e) {
            ILogger w = m93726w();
            if (w != null) {
                w.mo92223e("LKEvent", "JSONException", e);
                return;
            }
            Log.m165384e("LKEvent", "JSONException", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f64041a);
        parcel.writeInt(this.f64044d);
        parcel.writeByte(this.f64057q ? (byte) 1 : 0);
        Map<String, Object> map = this.f64052l;
        String str2 = "";
        if (map != null) {
            str = JSON.toJSONString(map);
        } else {
            str = str2;
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.f64055o);
        JSONObject jSONObject = this.f64042b;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        parcel.writeString(str2);
        parcel.writeBundle(this.f64059s);
    }
}
