package com.ss.android.lark.integrator.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.core.dependency.AbstractC36118c;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.offlinepush.OfflinePushClickHandler;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.ss.android.lark.integrator.core.c */
class C39363c implements AbstractC36118c {
    C39363c() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132739a(String str, IGetDataCallback<String> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getChatterIdByCalendarId(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132737a(TextView textView, TextView textView2, GifImageView gifImageView, Content content) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).bindViewWithShareMsg(textView, textView2, gifImageView, content);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132738a(CalendarForwardData calendarForwardData, String str, IGetDataCallback<Void> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).eventTransfer(calendarForwardData.getCalendarId(), calendarForwardData.getKey(), calendarForwardData.getOriginalTime(), str, Boolean.valueOf(calendarForwardData.isQuit()), iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public boolean mo132744a(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).calendarFilterOuterForForward(message);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public boolean mo132745a(String str) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isValidateEmail(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132741a(String str, String str2, Long l, Context context, Long l2, Long l3) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startCalendarEventDetailActivity(str, str2, l, context, l2, l3);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public boolean mo132743a(Uri uri, Context context) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).checkIfNeedGoImportGooglePage(uri, context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132742a(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).shareMomentsPost(list, str, i, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132740a(String str, String str2, IGetDataCallback<SearchResponse> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).searchCalendarEvent(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: b */
    public int mo132746b() {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getShareCalendarEventCode();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: c */
    public void mo132750c() {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).triggerQuitMeetingEvent();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: d */
    public boolean mo132752d() {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isInviteEmailEnable();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: e */
    public void mo132753e() {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).hitpointEmailAttendeeEnter();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: f */
    public void mo132754f() {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).hitpointEmailAttendeeInvate();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: g */
    public String mo132755g() {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getOpenCalendarFromNoticeKey();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: h */
    public boolean mo132756h() {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isTransferOptimize();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132731a() {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).sendOnClickShareForward();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public Content mo132730a(CalendarForwardData calendarForwardData) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).wrapShareCalendarEventContent(calendarForwardData.getSourceData());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: b */
    public List<String> mo132747b(String str) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).splitEmail(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132732a(Activity activity) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startCalendarSettingActivity(activity);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: c */
    public Intent mo132749c(String str) {
        Intent calendarIntentForWsChannelOfflinePush = ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarIntentForWsChannelOfflinePush(str);
        if (calendarIntentForWsChannelOfflinePush != null) {
            return calendarIntentForWsChannelOfflinePush;
        }
        Intent a = C36149a.m142162a().mo157098b().mo105697a(LarkContext.getApplication(), ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarPageName());
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).packageLaunchCalendarTransPageIntent(bundle, str);
            a.putExtras(bundle);
        }
        return a;
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132734a(Context context) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).initForCalendarRust(context);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public Intent mo132729a(ArrayList<String> arrayList, boolean z) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getShareCalendarEventResult(arrayList, z);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: c */
    public void mo132751c(String str, IGetDataCallback<String> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).updateProfileBackground(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: b */
    public void mo132748b(String str, IGetDataCallback<Integer> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getEventSettingRole(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132733a(Activity activity, String str) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startCalendarArrangeLookActivity(activity, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132735a(final Context context, final String str) {
        final Intent a = C36149a.m142162a().mo157098b().mo105697a(LarkContext.getApplication(), ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarPageName());
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("user_id");
            String optString2 = jSONObject.optString("extra_str");
            if (!TextUtils.isEmpty(optString2)) {
                Bundle bundle = new Bundle();
                ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).packageCalendarOfflinePushNotice(bundle, optString2);
                bundle.putString("user_id", optString);
                a.putExtras(bundle);
            }
        } catch (JSONException e) {
            Log.m165383e("CalendarDependencyImpl", "notification click catch = " + e);
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.integrator.core.C39363c.RunnableC393641 */

            public void run() {
                OfflinePushClickHandler.m201275a(context, a, str);
            }
        });
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36118c
    /* renamed from: a */
    public void mo132736a(Context context, String str, String str2) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startCalendarSearchActivity(context, str, str2);
    }
}
