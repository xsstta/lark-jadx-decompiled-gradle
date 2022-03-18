package com.bytedance.ttnet.tnc;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.tnc.a */
public class C20777a {

    /* renamed from: a */
    public boolean f50925a;

    /* renamed from: b */
    public boolean f50926b = true;

    /* renamed from: c */
    public Map<String, Integer> f50927c;

    /* renamed from: d */
    public int f50928d = 10;

    /* renamed from: e */
    public int f50929e = 3;

    /* renamed from: f */
    public int f50930f = 3;

    /* renamed from: g */
    public int f50931g = 10;

    /* renamed from: h */
    public int f50932h = 3;

    /* renamed from: i */
    public int f50933i = 3;

    /* renamed from: j */
    public int f50934j = 900;

    /* renamed from: k */
    public int f50935k = SmEvents.EVENT_NW;

    /* renamed from: l */
    public String f50936l;

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f50925a);
        sb.append(" probeEnable: ");
        sb.append(this.f50926b);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f50927c;
        if (map != null) {
            i = map.size();
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(" reqTo: ");
        sb.append(this.f50928d);
        sb.append("#");
        sb.append(this.f50929e);
        sb.append("#");
        sb.append(this.f50930f);
        sb.append(" reqErr: ");
        sb.append(this.f50931g);
        sb.append("#");
        sb.append(this.f50932h);
        sb.append("#");
        sb.append(this.f50933i);
        sb.append(" updateInterval: ");
        sb.append(this.f50934j);
        sb.append(" updateRandom: ");
        sb.append(this.f50935k);
        sb.append(" httpBlack: ");
        sb.append(this.f50936l);
        return sb.toString();
    }
}
