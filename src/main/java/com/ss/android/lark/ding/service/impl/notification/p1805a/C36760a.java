package com.ss.android.lark.ding.service.impl.notification.p1805a;

import android.content.Context;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.dto.C36636a;
import com.ss.android.lark.ding.p1803a.AbstractC36620b;
import com.ss.android.lark.ding.service.impl.C36685b;
import com.ss.android.lark.utils.p2908e.C57823a;

/* renamed from: com.ss.android.lark.ding.service.impl.notification.a.a */
public class C36760a {

    /* renamed from: a */
    private IDingModuleDependency.AbstractC36631h f94461a;

    /* renamed from: b */
    private Context f94462b;

    /* renamed from: com.ss.android.lark.ding.service.impl.notification.a.a$a */
    private static class C36762a {

        /* renamed from: a */
        public static final C36760a f94464a = new C36760a();
    }

    /* renamed from: a */
    public static C36760a m145011a() {
        return C36762a.f94464a;
    }

    /* renamed from: b */
    public void mo135453b() {
        C36685b.m144766a().mo135292a((AbstractC36620b) new AbstractC36620b() {
            /* class com.ss.android.lark.ding.service.impl.notification.p1805a.C36760a.C367611 */

            @Override // com.ss.android.lark.ding.p1803a.AbstractC36620b
            /* renamed from: a */
            public void mo135094a(C36636a aVar, MessageInfo messageInfo) {
                if (aVar != null) {
                    C36760a.this.mo135452a(aVar.mo135177e(), aVar.mo135172b());
                }
            }
        });
    }

    private C36760a() {
        this.f94461a = C36618a.m144492a().mo135102g();
        this.f94462b = C36618a.m144492a().mo135096a();
    }

    /* renamed from: a */
    public void mo135452a(String str, String str2) {
        if (str != null && str2 != null && str.equals(this.f94461a.mo135154a())) {
            C57823a.m224448a(this.f94462b).mo196174a(((int) (Long.parseLong(str2) % 10002)) * UpdateDialogStatusCode.SHOW);
        }
    }
}
