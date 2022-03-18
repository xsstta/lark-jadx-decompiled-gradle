package com.ss.android.lark.integrator.core.p2016a;

import android.content.Context;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.integrator.core.a.a */
public class C39351a implements AbstractC44136a.AbstractC44139aa {
    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44139aa
    /* renamed from: a */
    public void mo143221a(Context context, String str) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).openJoinMeetingPage(context, "meeting_link_join", str);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44139aa
    /* renamed from: b */
    public void mo143224b(Context context, String str, String str2) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).simplifyOpenInMeetingPage(str, str2);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44139aa
    /* renamed from: a */
    public void mo143222a(Context context, String str, String str2) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).joinInterviewGroupMeeting(context, str, str2);
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44139aa
    /* renamed from: a */
    public boolean mo143223a(Context context, String str, String str2, String str3, String str4) {
        return ((IVCApi) ApiUtils.getApi(IVCApi.class)).openXiaoMiVoip(context, str, str2, str3, str4);
    }
}
