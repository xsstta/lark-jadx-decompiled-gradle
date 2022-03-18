package com.ss.android.lark.integrator.calendar.dependency;

import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.api.entity.CalendarNotice;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30059z;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.y */
public class C39226y implements AbstractC30059z {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30059z
    /* renamed from: a */
    public void mo108293a(CalendarNotice calendarNotice, String str, String str2, String str3) {
        calendarNotice.messageId = str;
        calendarNotice.content = str2;
        calendarNotice.title = str3;
        calendarNotice.type = UpdateDialogStatusCode.DISMISS;
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).pushNotice(calendarNotice);
    }
}
