package com.bytedance.ee.falcon.openplugin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class FalconApiCallResult implements Parcelable {
    public static final Parcelable.Creator<FalconApiCallResult> CREATOR = new Parcelable.Creator<FalconApiCallResult>() {
        /* class com.bytedance.ee.falcon.openplugin.entity.FalconApiCallResult.C127121 */

        /* renamed from: a */
        public FalconApiCallResult[] newArray(int i) {
            return new FalconApiCallResult[i];
        }

        /* renamed from: a */
        public FalconApiCallResult createFromParcel(Parcel parcel) {
            return new FalconApiCallResult(parcel);
        }
    };

    /* renamed from: a */
    private final JSONObject f34033a;

    /* renamed from: b */
    private final String f34034b;

    /* renamed from: c */
    private final boolean f34035c;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f34034b;
    }

    /* renamed from: com.bytedance.ee.falcon.openplugin.entity.FalconApiCallResult$a */
    public static class C12713a {

        /* renamed from: a */
        private final boolean f34036a;

        /* renamed from: b */
        private final String f34037b;

        /* renamed from: c */
        private final String f34038c;

        /* renamed from: d */
        private String f34039d;

        /* renamed from: e */
        private JSONObject f34040e;

        /* renamed from: f */
        private int f34041f;

        public String toString() {
            Log.m165383e("ApiCallResult", "pls do not use Builder toString");
            return mo48142a().toString();
        }

        /* renamed from: a */
        public FalconApiCallResult mo48142a() {
            JSONObject jSONObject = this.f34040e;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            boolean z = false;
            try {
                if (jSONObject.has(ApiHandler.API_CALLBACK_ERRMSG)) {
                    Log.m165389i("ApiCallResult", "has errMsg event:" + this.f34037b);
                    String string = jSONObject.getString(ApiHandler.API_CALLBACK_ERRMSG);
                    if (string.contains(this.f34037b + ":" + this.f34038c)) {
                        Log.m165389i("ApiCallResult", "success buildErrMsg");
                        z = true;
                    } else if (TextUtils.isEmpty(this.f34039d)) {
                        this.f34039d = string;
                    } else {
                        this.f34039d += string;
                    }
                }
                if (!z) {
                    Log.m165389i("ApiCallResult", "append errMsg");
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, m52625a(this.f34037b, this.f34038c, this.f34039d));
                }
                if (this.f34041f != 0) {
                    Log.m165389i("ApiCallResult", "errCode:" + this.f34041f);
                    jSONObject.put("errCode", this.f34041f);
                }
                Log.m165389i("ApiCallResult", "errMsg:" + jSONObject.get(ApiHandler.API_CALLBACK_ERRMSG));
            } catch (Exception e) {
                Log.m165384e("ApiCallResult", "build", e);
            }
            return new FalconApiCallResult(jSONObject, this.f34036a);
        }

        /* renamed from: a */
        public C12713a mo48140a(int i) {
            this.f34041f = i;
            return this;
        }

        /* renamed from: c */
        public C12713a mo48143c(String str) {
            this.f34039d = str;
            return this;
        }

        /* renamed from: a */
        public static C12713a m52623a(String str) {
            return new C12713a(str, "ok");
        }

        /* renamed from: b */
        public static C12713a m52626b(String str) {
            return new C12713a(str, "fail");
        }

        /* renamed from: a */
        public C12713a mo48141a(JSONObject jSONObject) {
            this.f34040e = jSONObject;
            return this;
        }

        private C12713a(String str, String str2) {
            boolean z;
            this.f34037b = str;
            this.f34038c = str2;
            if (str2 == "fail") {
                z = true;
            } else {
                z = false;
            }
            this.f34036a = z;
        }

        /* renamed from: a */
        public static C12713a m52624a(String str, String str2, int i) {
            return new C12713a(str, "fail").mo48143c(str2).mo48140a(i);
        }

        /* renamed from: a */
        private static String m52625a(String str, String str2, String str3) {
            if (TextUtils.isEmpty(str3)) {
                return str + ":" + str2;
            }
            return str + ":" + str2 + " " + str3;
        }
    }

    protected FalconApiCallResult(Parcel parcel) {
        JSONObject jSONObject;
        String readString = parcel.readString();
        if (readString == null) {
            Log.m165379d("ApiCallResult", "empty result");
            readString = "";
        }
        try {
            jSONObject = new JSONObject(readString);
        } catch (JSONException e) {
            JSONObject jSONObject2 = new JSONObject();
            Log.m165384e("ApiCallResult", readString, e);
            jSONObject = jSONObject2;
        }
        this.f34034b = readString;
        this.f34033a = jSONObject;
        this.f34035c = readString.contains(":fail");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34034b);
    }

    private FalconApiCallResult(JSONObject jSONObject, boolean z) {
        this.f34033a = jSONObject;
        this.f34034b = jSONObject.toString();
        this.f34035c = z;
    }
}
