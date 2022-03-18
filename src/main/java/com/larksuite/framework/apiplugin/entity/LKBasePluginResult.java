package com.larksuite.framework.apiplugin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LKBasePluginResult implements Parcelable {
    public static final Parcelable.Creator<LKBasePluginResult> CREATOR = new Parcelable.Creator<LKBasePluginResult>() {
        /* class com.larksuite.framework.apiplugin.entity.LKBasePluginResult.C259391 */

        /* renamed from: a */
        public LKBasePluginResult[] newArray(int i) {
            return new LKBasePluginResult[i];
        }

        /* renamed from: a */
        public LKBasePluginResult createFromParcel(Parcel parcel) {
            return new LKBasePluginResult(parcel);
        }
    };

    /* renamed from: b */
    public static final LKBasePluginResult f64237b = new LKBasePluginResult(false, null, null, Integer.MIN_VALUE, null);

    /* renamed from: c */
    public static final LKBasePluginResult f64238c = new LKBasePluginResult(true, null, null, Integer.MIN_VALUE, null);

    /* renamed from: a */
    protected boolean f64239a;

    /* renamed from: d */
    private JSONObject f64240d;

    /* renamed from: e */
    private AbstractC25903n f64241e;

    /* renamed from: f */
    private int f64242f = Integer.MIN_VALUE;

    /* renamed from: g */
    private List<AbstractC25940a.C25941a> f64243g;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public AbstractC25903n mo92265a() {
        return this.f64241e;
    }

    /* renamed from: b */
    public List<AbstractC25940a.C25941a> mo92266b() {
        return this.f64243g;
    }

    /* renamed from: c */
    public int mo92267c() {
        return this.f64242f;
    }

    /* renamed from: d */
    public boolean mo92268d() {
        return this.f64239a;
    }

    /* renamed from: e */
    public JSONObject mo92270e() {
        return this.f64240d;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LKBasePluginResult{mResult=");
        JSONObject jSONObject = this.f64240d;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(", mErrorCode=");
        sb.append(this.f64242f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: com.larksuite.framework.apiplugin.entity.LKBasePluginResult$a */
    public static abstract class AbstractC25940a<T extends AbstractC25940a<T>> {

        /* renamed from: a */
        public JSONObject f64244a;

        /* renamed from: b */
        public AbstractC25903n f64245b;

        /* renamed from: c */
        public int f64246c = Integer.MIN_VALUE;

        /* renamed from: d */
        public List<C25941a> f64247d;

        /* renamed from: com.larksuite.framework.apiplugin.entity.LKBasePluginResult$a$a */
        public static class C25941a<T> {
            @JSONField(name = "key")

            /* renamed from: a */
            public String f64248a;
            @JSONField(serialize = false)

            /* renamed from: b */
            public T f64249b;
            @JSONField(name = "base64")

            /* renamed from: c */
            public String f64250c;
        }

        /* renamed from: a */
        public T mo92277a(int i) {
            this.f64246c = i;
            return this;
        }

        /* renamed from: a */
        public T mo92278a(AbstractC25903n nVar) {
            this.f64245b = nVar;
            return this;
        }

        /* renamed from: a */
        public T mo92280a(JSONObject jSONObject) {
            this.f64244a = jSONObject;
            return this;
        }

        /* renamed from: a */
        public T mo92279a(List<C25941a> list) {
            if (this.f64247d == null) {
                this.f64247d = new ArrayList();
            }
            this.f64247d.addAll(list);
            return this;
        }
    }

    protected LKBasePluginResult(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f64239a = z;
        this.f64242f = parcel.readInt();
        String readString = parcel.readString();
        if (!TextUtils.isEmpty(readString)) {
            try {
                this.f64240d = new JSONObject(readString);
            } catch (JSONException e) {
                Log.m165384e("LKBasePluginResult", "JSONException", e);
                this.f64240d = new JSONObject();
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeByte(this.f64239a ? (byte) 1 : 0);
        parcel.writeInt(this.f64242f);
        JSONObject jSONObject = this.f64240d;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
    }

    public LKBasePluginResult(boolean z, JSONObject jSONObject, AbstractC25903n nVar, int i, List<AbstractC25940a.C25941a> list) {
        this.f64239a = z;
        this.f64240d = jSONObject;
        this.f64242f = i;
        this.f64241e = nVar;
        this.f64243g = list;
    }
}
