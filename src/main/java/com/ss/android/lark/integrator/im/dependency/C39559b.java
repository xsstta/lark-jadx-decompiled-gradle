package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33977a;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33979c;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.dependency.ICalendarDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.dependency.b */
public class C39559b implements ICalendarDependency {
    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: c */
    public String mo134344c(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getShareCalendarMessageTitle(message);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: d */
    public String mo134345d(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarTitle(message);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public Content mo134336a(com.bytedance.lark.pb.basic.v1.Content content) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getShareCalendarEventContent(content);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: b */
    public String mo134343b(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarCardReplyDigest(message);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public boolean mo134341a(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isEnableRSVPCalendarType(message);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: b */
    public Content mo134342b(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getGeneralContent(entity, content);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public Content mo134337a(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarContent(entity, content);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public String mo134338a(Context context, Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarBotMessageTitle(context, message);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public void mo134340a(Context context, String str, List<String> list) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).startEventEditActivity(context, str, list);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public AbstractC33977a mo134335a(Activity activity, String str, String str2, AbstractC33979c cVar) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarMeetingForChatWindow(activity, str, str2, cVar);
    }

    @Override // com.ss.android.lark.dependency.ICalendarDependency
    /* renamed from: a */
    public void mo134339a(Activity activity, String str, boolean z, long j, long j2, String str2, ArrayList<String> arrayList, boolean z2, ICalendarDependency.Scene scene) {
        int i;
        ICalendarApi iCalendarApi = (ICalendarApi) ApiUtils.getApi(ICalendarApi.class);
        if (scene != null) {
            i = scene.getNumber();
        } else {
            i = ICalendarDependency.Scene.FREEBUSY.getNumber();
        }
        iCalendarApi.startArrangeMeeting(activity, str, z, j, j2, str2, arrayList, z2, i);
    }
}
