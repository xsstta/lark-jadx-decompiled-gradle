package com.ss.android.lark.calendar.p1430a.p1431a;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;

/* renamed from: com.ss.android.lark.calendar.a.a.ai */
public interface AbstractC30040ai {
    /* renamed from: a */
    void mo108199a(Context context, String str);

    /* renamed from: a */
    void mo108200a(Context context, String str, String str2);

    /* renamed from: a */
    void mo108201a(GetAdminSettingsResponse getAdminSettingsResponse, String str);

    /* renamed from: a */
    void mo108202a(String str, String str2, String str3, String str4, String str5, String str6, CalendarEvent.Source source, String str7, IGetDataCallback<CalendarPstnDetailInfo> iGetDataCallback);

    /* renamed from: b */
    void mo108203b(Context context, String str);
}
