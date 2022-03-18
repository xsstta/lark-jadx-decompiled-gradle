package com.ss.android.lark.integrator.im;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chat.entity.p1665e.AbstractC33988a;
import com.ss.android.lark.dependency.ao;
import com.ss.android.lark.integrator.im.dependency.C39559b;
import com.ss.android.lark.integrator.im.dependency.C39566h;
import com.ss.android.lark.integrator.im.dependency.ICalendarDependency;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.integrator.im.b */
class C39430b implements ICalendarDependency {
    C39430b() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: b */
    public com.ss.android.lark.dependency.ICalendarDependency mo143316b() {
        return new C39559b();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: c */
    public ao mo143319c() {
        return new C39566h();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public void mo143310a() {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).triggerQuitMeetingEvent();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: b */
    public boolean mo143318b(int i) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isMettingOrganizer(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public boolean mo143314a(int i) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isMettingNoRole(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: b */
    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo143317b(Context context, AbstractC33988a<T> aVar) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).createTodoPinHolderView(context, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo143309a(Context context, AbstractC33988a<T> aVar) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).createCalendarPinHolderView(context, aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public void mo143313a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).transferToChat(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public boolean mo143315a(Chat chat, ChatChatter chatChatter) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isSupportFindTime(chat, chatChatter);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public void mo143312a(Context context, Chat chat, ChatChatter chatChatter) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).gotoFindTimeActivity(context, chat, chatChatter);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public AbstractC33978b mo143308a(Activity activity, String str, String str2, AbstractC33980d dVar) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarMeetingForChatSetting(activity, str, str2, dVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.ICalendarDependency
    /* renamed from: a */
    public void mo143311a(Activity activity, String str, boolean z, String str2, ArrayList<String> arrayList, long j, long j2, boolean z2, int i) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startFindTimeActivity(activity, str, z, str2, arrayList, j, j2, z2, i);
    }
}
