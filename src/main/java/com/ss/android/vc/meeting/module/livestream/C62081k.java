package com.ss.android.vc.meeting.module.livestream;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.livestream.C60943c;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.entity.response.C60957ad;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.vc.meeting.module.livestream.k */
public class C62081k {

    /* renamed from: a */
    public static C60943c f155963a = C62075j.m242558h();

    /* renamed from: a */
    public static void m242570a(final AbstractC63598b bVar) {
        C60943c cVar = f155963a;
        if (cVar == null || cVar.f152538g == null) {
            C62075j.m242548a(new AbstractC63598b<C60943c>() {
                /* class com.ss.android.vc.meeting.module.livestream.C62081k.C620821 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235851b("PolicyMsgUtil", "[getAuthCheckboxText]", "fail");
                }

                /* renamed from: a */
                public void onSuccess(C60943c cVar) {
                    C62081k.f155963a = C62075j.m242558h();
                    if (C62081k.f155963a != null && C62081k.f155963a.f152538g != null) {
                        C62081k.m242571a(bVar, C62081k.f155963a.f152537f);
                    }
                }
            });
        } else {
            m242571a(bVar, f155963a.f152538g);
        }
    }

    /* renamed from: b */
    public static void m242572b(final AbstractC63598b bVar) {
        C60943c cVar = f155963a;
        if (cVar == null || cVar.f152537f == null) {
            C62075j.m242548a(new AbstractC63598b<C60943c>() {
                /* class com.ss.android.vc.meeting.module.livestream.C62081k.C620832 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("PolicyMsgUtil", "[getAuthPopupText]", "fail");
                }

                /* renamed from: a */
                public void onSuccess(C60943c cVar) {
                    C62081k.f155963a = C62075j.m242558h();
                    if (C62081k.f155963a != null && C62081k.f155963a.f152537f != null) {
                        C62081k.m242571a(bVar, C62081k.f155963a.f152537f);
                    }
                }
            });
        } else {
            m242571a(bVar, f155963a.f152537f);
        }
    }

    /* renamed from: a */
    public static void m242571a(final AbstractC63598b bVar, final C60957ad adVar) {
        VcBizSender.m249194a(adVar.f152637a, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.livestream.C62081k.C620843 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("PolicyMsgUtil", "[getAuthPageText3]", "[start live fail], getLivePolicyI18nTemplate error");
                bVar.onError(eVar);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    C60700b.m235851b("PolicyMsgUtil", "[getAuthPageText]", "[start live fail], getLivePolicyI18nTemplate is empty");
                    return;
                }
                C60700b.m235851b("PolicyMsgUtil", "[getAuthPageText2]", "[start live success]");
                bVar.onSuccess(C62081k.m242569a(str, adVar));
            }
        });
    }

    /* renamed from: a */
    public static MsgWithUrlInfo m242569a(String str, C60957ad adVar) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            C60700b.m235851b("PolicyMsgUtil", "[parseText]", "template is empty");
            str = "";
        }
        Matcher matcher = Pattern.compile("\\[\\[.*?\\]\\]").matcher(str);
        String str2 = str;
        while (matcher.find()) {
            String group = matcher.group();
            String[] split = str.substring(matcher.start() + 2, matcher.end() - 2).split(":");
            String str3 = split[0];
            str2 = str2.replace(group, "@@" + split[1] + "@@");
            arrayList.add(adVar.f152638b.get(str3).f152639a);
        }
        return MsgWithUrlInfo.m237107b(str2, arrayList);
    }
}
