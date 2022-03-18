package com.ss.android.vc.meeting.bytertc;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.bytertc.g */
public class C61235g {

    /* renamed from: a */
    private Map<String, C61236a> f153397a = new HashMap();

    /* renamed from: a */
    public void mo211776a() {
        C60735ab.m236014c();
        this.f153397a.clear();
    }

    /* renamed from: com.ss.android.vc.meeting.bytertc.g$a */
    public static class C61236a {

        /* renamed from: a */
        public String f153398a;

        /* renamed from: b */
        public String f153399b;

        public String toString() {
            return "VcRtcScreenStream{mStreamId='" + this.f153398a + '\'' + ", mRtcJoinId='" + this.f153399b + '}';
        }
    }

    /* renamed from: a */
    public String mo211775a(String str) {
        C61236a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = this.f153397a.get(str)) != null) {
            return aVar.f153398a;
        }
        return "";
    }

    /* renamed from: a */
    public void mo211777a(String str, String str2) {
        C60735ab.m236014c();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C60700b.m235851b("VcRtcScreenStreamManager", "[addNewStream]", "Info is empty");
            return;
        }
        if (this.f153397a.containsKey(str)) {
            C60700b.m235851b("VcRtcScreenStreamManager", "[addNewStream]", "Add stream repeatedly: " + this.f153397a.get(str));
        }
        C61236a aVar = new C61236a();
        aVar.f153399b = str;
        aVar.f153398a = str2;
        this.f153397a.put(str, aVar);
    }

    /* renamed from: b */
    public void mo211778b(String str, String str2) {
        C60735ab.m236014c();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C60700b.m235864f("VcRtcScreenStreamManager", "[removeNewStream]", "info is empty");
        } else if (!this.f153397a.containsKey(str)) {
            C60700b.m235851b("VcRtcScreenStreamManager", "[removeStream2]", "Remove a stream that doesn't exist, deviceId is " + str + ", streamId is " + str2);
        } else {
            this.f153397a.remove(str);
            C60700b.m235851b("VcRtcScreenStreamManager", "[removeStream3]", "DeviceId is " + str + ", streamId is " + str2);
        }
    }
}
