package com.ss.android.lark.share_group;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.navigation.Navigation;

/* renamed from: com.ss.android.lark.share_group.h */
public class C54834h {
    /* renamed from: a */
    private static Bundle m212696a(Message message) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_message", message);
        m212695a(bundle, message);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212702a(Bundle bundle) {
        C54832g gVar = new C54832g();
        gVar.setArguments(bundle);
        C36512a.m144041a().mo134762a(gVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
    }

    /* renamed from: a */
    public static void m212699a(Context context, Message message) {
        m212698a(context, m212696a(message));
    }

    /* renamed from: a */
    private static Bundle m212695a(Bundle bundle, Message message) {
        String str;
        Chat chat;
        if (message == null || !(message.getContent() instanceof ShareGroupChatContent) || (chat = ((ShareGroupChatContent) message.getContent()).getChat()) == null) {
            str = null;
        } else {
            str = chat.getId();
        }
        if (str == null) {
            str = "";
        }
        bundle.putString("params__chat_id", str);
        return bundle;
    }

    /* renamed from: a */
    private static void m212698a(Context context, Bundle bundle) {
        if (DesktopUtil.m144301a(context)) {
            Navigation.from(context).openActivity(C54832g.class.getName(), new Navigation.AbstractC57856b(bundle) {
                /* class com.ss.android.lark.share_group.$$Lambda$h$ERoiB6riZSP_8tz61rrtDcJmRvg */
                public final /* synthetic */ Bundle f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57856b
                public final void onOpenPage() {
                    C54834h.m212702a(this.f$0);
                }
            });
        } else {
            C29990c.m110930b().mo134523V().mo134434a(context, bundle, 18);
        }
    }

    /* renamed from: a */
    private static Bundle m212697a(Message message, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_message", message);
        bundle.putBoolean("params_is_from_recommend_group", z);
        bundle.putBoolean("params_could_apply", z2);
        m212695a(bundle, message);
        return bundle;
    }

    /* renamed from: a */
    public static void m212700a(Context context, Message message, boolean z, boolean z2) {
        m212698a(context, m212697a(message, z, z2));
    }

    /* renamed from: a */
    public static void m212701a(Context context, String str, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("params__chat_id", str);
        bundle.putBoolean("params_is_from_recommend_group", z);
        bundle.putBoolean("params_could_apply", z2);
        m212698a(context, bundle);
    }
}
