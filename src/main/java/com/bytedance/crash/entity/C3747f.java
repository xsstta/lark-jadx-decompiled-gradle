package com.bytedance.crash.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.f */
public class C3747f {

    /* renamed from: a */
    public int f11541a;

    /* renamed from: b */
    public int f11542b;

    /* renamed from: c */
    public long f11543c;

    /* renamed from: d */
    public long f11544d;

    /* renamed from: e */
    public long f11545e;

    /* renamed from: f */
    public boolean f11546f;

    /* renamed from: g */
    public String f11547g;

    /* renamed from: h */
    public String f11548h;

    /* renamed from: i */
    public String f11549i;

    /* renamed from: j */
    public String f11550j;

    /* renamed from: a */
    public JSONObject mo15256a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", this.f11547g);
            jSONObject.put("cpuDuration", this.f11545e);
            jSONObject.put("duration", this.f11544d);
            jSONObject.put("tick", this.f11543c);
            jSONObject.put(ShareHitPoint.f121869d, this.f11542b);
            jSONObject.put("count", this.f11541a);
            String str = this.f11548h;
            if (str != null) {
                jSONObject.put("block_stack", str);
                jSONObject.put("block_uuid", this.f11550j);
            }
            String str2 = this.f11549i;
            if (str2 != null) {
                jSONObject.put("sblock_stack", str2);
                jSONObject.put("sblock_uuid", this.f11550j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        int i = this.f11542b;
        if (i == 0) {
            return "[[[ IDLE  ]]] cost " + this.f11543c + " tick , mDuration：" + this.f11544d + ",cpuTime:" + this.f11545e;
        } else if (i == 1) {
            return "[[[ Long IDLE  ]]] cost " + this.f11543c + " tick , mDuration：" + this.f11544d + ",cpuTime:" + this.f11545e;
        } else if (i == 2) {
            return "[[[  1 msg  ]]] cost " + this.f11543c + " tick , mDuration：" + this.f11544d + ",cpuTime:" + this.f11545e + ", msg:" + this.f11547g;
        } else if (i == 3) {
            return "[[[ 1 msg + IDLE  ]]] cost " + this.f11543c + " tick , mDuration：" + this.f11544d + ",cpuTime:" + this.f11545e;
        } else if (i == 4) {
            return "[[[ " + (this.f11541a - 1) + " msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than " + (this.f11543c - 1) + "tick ,, mDuration：" + this.f11544d + "cpuTime:" + this.f11545e + " msg:" + this.f11547g;
        } else if (i == 5) {
            return "[[[ " + this.f11541a + " msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than" + (this.f11543c - 1) + " ticks, , mDuration：" + this.f11544d + "cpuTime:" + this.f11545e;
        } else if (i == 6) {
            return "[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than" + (this.f11543c - 1) + ", , mDuration：" + this.f11544d + "cpuTime:" + this.f11545e;
        } else if (i == 7) {
            return "[[[ " + this.f11541a + " msgs + IDLE  ]]] cost 1 tick , mDuration：" + this.f11544d + " cost cpuTime:" + this.f11545e;
        } else if (i == 8) {
            return "[[[ 1 msgs ]]] cost " + this.f11543c + " ticks , mDuration：" + this.f11544d + " cost cpuTime:" + this.f11545e + " msg:" + this.f11547g;
        } else if (i == 9) {
            return "[[[ " + this.f11541a + " msgs ]]] cost 1 tick , mDuration：" + this.f11544d + " cost cpuTime:" + this.f11545e;
        } else {
            return "=========   UNKNOW =========  Type:" + this.f11542b + " cost ticks " + this.f11543c + " msgs:" + this.f11541a;
        }
    }
}
