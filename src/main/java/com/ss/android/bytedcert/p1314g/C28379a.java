package com.ss.android.bytedcert.p1314g;

import com.ss.android.bytedcert.net.BDResponse;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.g.a */
public class C28379a {

    /* renamed from: a */
    public boolean f71342a;

    /* renamed from: b */
    public boolean f71343b;

    /* renamed from: c */
    public boolean f71344c;

    /* renamed from: d */
    public boolean f71345d;

    /* renamed from: e */
    public boolean f71346e;

    /* renamed from: f */
    public boolean f71347f;

    /* renamed from: g */
    public boolean f71348g;

    /* renamed from: h */
    public boolean f71349h;

    /* renamed from: i */
    public boolean f71350i;

    public C28379a(BDResponse bDResponse) {
        JSONObject optJSONObject;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (bDResponse != null) {
            try {
                if (bDResponse.success && bDResponse.jsonData != null && (optJSONObject = bDResponse.jsonData.optJSONObject("actions")) != null) {
                    boolean z9 = false;
                    if (optJSONObject.optInt("ocr", 0) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f71342a = z;
                    if (optJSONObject.optInt("live_detect", 0) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f71343b = z2;
                    if (optJSONObject.optInt("veri_two_element", 0) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f71344c = z3;
                    if (optJSONObject.optInt("veri_three_element_mobile", 0) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f71345d = z4;
                    if (optJSONObject.optInt("veri_face_compare", 0) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.f71346e = z5;
                    if (optJSONObject.optInt("veri_manual_check", 0) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.f71347f = z6;
                    if (optJSONObject.optInt("auth_two_element", 0) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.f71348g = z7;
                    if (optJSONObject.optInt("auth_three_element_mobile", 0) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.f71349h = z8;
                    this.f71350i = optJSONObject.optInt("auth_face_compare", 0) != 0 ? true : z9;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
