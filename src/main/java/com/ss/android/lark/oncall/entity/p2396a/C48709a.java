package com.ss.android.lark.oncall.entity.p2396a;

import com.bytedance.lark.pb.basic.v1.Oncall;
import com.bytedance.lark.pb.helpdesk.v1.OncallTag;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.oncall.entity.a.a */
public class C48709a {
    /* renamed from: a */
    public static OnCallTag m191937a(OncallTag oncallTag) {
        return new OnCallTag(oncallTag.id, oncallTag.name);
    }

    /* renamed from: a */
    public static List<OnCall> m191938a(List<Oncall> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<Oncall, OnCall>() {
            /* class com.ss.android.lark.oncall.entity.p2396a.C48709a.C487101 */

            /* renamed from: a */
            public OnCall get(Oncall oncall) {
                return C48709a.m191936a(oncall);
            }
        });
    }

    /* renamed from: b */
    public static List<OnCallTag> m191939b(List<OncallTag> list) {
        ArrayList arrayList = new ArrayList();
        for (OncallTag oncallTag : list) {
            arrayList.add(m191937a(oncallTag));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static OnCall m191936a(Oncall oncall) {
        OnCall onCall = new OnCall();
        onCall.setId(oncall.id);
        onCall.setAvatarKey(oncall.avatar_key);
        onCall.setDescription(oncall.description);
        onCall.setName(oncall.name);
        onCall.setPhoneNumber(oncall.phone_number);
        onCall.setNeedReportLocation(oncall.report_location.booleanValue());
        return onCall;
    }
}
