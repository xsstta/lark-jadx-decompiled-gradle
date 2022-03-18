package com.ss.android.lark.contact;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29543ag;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.feat.C35410a;
import com.ss.android.lark.contact.feat.p1745d.C35466d;
import com.ss.android.lark.contact.impl.p1754d.C35787a;
import com.ss.android.lark.contact.impl.p1761f.C35881a;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.p1761f.C35887c;
import com.ss.android.lark.contact.impl.p1761f.C35890d;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.impl.p1761f.C35923g;
import com.ss.android.lark.contact.impl.setting.C35989a;
import com.ss.android.lark.contact.impl.setting.service.PrivacyService;
import com.ss.android.lark.contact.impl.setting.service.entity.C36067c;
import com.ss.android.lark.contact.impl.setting.service.entity.WayToFindMeSettingItem;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.contact.p1733b.C35360a;
import com.ss.android.lark.contact.p1734c.AbstractC35385c;
import com.ss.android.lark.contact.p1735d.AbstractC35386a;
import com.ss.android.lark.contact.p1735d.AbstractC35387b;
import com.ss.android.lark.contact.p1735d.AbstractC35388c;
import com.ss.android.lark.contact.p1735d.AbstractC35389d;
import com.ss.android.lark.contact.p1735d.AbstractC35390e;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.setting.export.AbstractC54125a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.a */
public class C35358a {

    /* renamed from: a */
    public static String f91400a = "selectedMember";

    /* renamed from: b */
    public static String f91401b = "selectedMembersId";

    /* renamed from: c */
    public static String f91402c = "param_chatter_ids_for_calendar";

    /* renamed from: d */
    public static String f91403d = "param_chat_ids_for_calendar";

    /* renamed from: e */
    public static String f91404e = "param_emails_for_calendar";

    /* renamed from: f */
    public static String f91405f = "param_meeting_chat_ids_for_calendar";

    /* renamed from: g */
    public static String f91406g = "param_no_collaboration_permission_list_for_calendar";

    /* renamed from: h */
    public static String f91407h = "param_contacts_for_calendar";

    /* renamed from: i */
    private static volatile AbstractC35361b f91408i;

    /* renamed from: a */
    public static AbstractC35361b m138143a() {
        return f91408i;
    }

    /* renamed from: k */
    public static Map<String, Boolean> m138144k() {
        return C35360a.m138164a();
    }

    /* renamed from: b */
    public AbstractC35388c mo130130b() {
        return C35883b.m140625a();
    }

    /* renamed from: c */
    public AbstractC35386a mo130134c() {
        return C35881a.m140622a();
    }

    /* renamed from: d */
    public AbstractC35390e mo130135d() {
        return C35923g.m140762a();
    }

    /* renamed from: e */
    public AbstractC35389d mo130136e() {
        return C35906e.m140678a();
    }

    /* renamed from: f */
    public ContactMobileApi mo130137f() {
        return C35887c.m140652a();
    }

    /* renamed from: g */
    public AbstractC35387b mo130138g() {
        return C35410a.m138447a();
    }

    /* renamed from: h */
    public boolean mo130139h() {
        return C35466d.m138738a();
    }

    /* renamed from: i */
    public boolean mo130140i() {
        return C35466d.m138739b();
    }

    /* renamed from: j */
    public List<AbstractNotification> mo130141j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35787a());
        return arrayList;
    }

    public C35358a(AbstractC35361b bVar) {
        f91408i = bVar;
    }

    /* renamed from: a */
    public void mo130127a(IGetDataCallback iGetDataCallback) {
        PrivacyService.m141400a().mo132586d(iGetDataCallback);
    }

    /* renamed from: a */
    public List<AbstractC54125a> mo130124a(Activity activity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35989a(activity));
        return arrayList;
    }

    /* renamed from: b */
    public void mo130131b(final IGetDataCallback<String> iGetDataCallback) {
        PrivacyService.m141400a().mo132575a(new IGetDataCallback<C36067c>() {
            /* class com.ss.android.lark.contact.C35358a.C353591 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(C36067c cVar) {
                String str;
                Iterator<WayToFindMeSettingItem> it = cVar.mo132620a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    WayToFindMeSettingItem next = it.next();
                    if (next.mo132608e() && next.mo132604a() == WayToFindMeSettingItem.FindMeType.MOBILE) {
                        str = next.mo132605b();
                        break;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(str);
                        return;
                    }
                    return;
                }
                IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                if (iGetDataCallback2 != null) {
                    iGetDataCallback2.onError(new ErrorResult("no phoneNumber provide"));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo130125a(Context context) {
        f91408i.mo130158e().mo130222d(context);
    }

    /* renamed from: b */
    public void mo130132b(AbstractC29543ag agVar) {
        if (agVar != null) {
            C35890d.m140654a().mo132123b(agVar);
        }
    }

    /* renamed from: b */
    public void mo130133b(AbstractC35385c cVar) {
        if (cVar != null) {
            C35890d.m140654a().mo132125b(cVar);
        }
    }

    /* renamed from: a */
    public void mo130128a(AbstractC29543ag agVar) {
        if (agVar != null) {
            C35890d.m140654a().mo132117a(agVar);
        }
    }

    /* renamed from: a */
    public void mo130129a(AbstractC35385c cVar) {
        if (cVar != null) {
            C35890d.m140654a().mo132119a(cVar);
        }
    }

    /* renamed from: a */
    public void mo130126a(Context context, String str, String str2, String str3, int i) {
        C35883b.m140625a().mo132107a(context, str, str2, str3, i);
    }
}
