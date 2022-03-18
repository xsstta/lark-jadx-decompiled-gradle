package com.ss.android.lark.core.p1765c;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.collaboration.ContactCollaborationModule;
import com.ss.android.lark.collaboration.p1730a.AbstractC35340a;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;

/* renamed from: com.ss.android.lark.core.c.a */
public class C36096a {

    /* renamed from: com.ss.android.lark.core.c.a$a */
    public static class C36098a {

        /* renamed from: a */
        public static final AbstractC35340a f93278a = C36096a.m141509a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static ContactCollaborationModule m141510a() {
        return new ContactCollaborationModule(C36098a.f93278a);
    }

    /* renamed from: a */
    public static AbstractC35340a m141509a(Context context) {
        return new AbstractC35340a() {
            /* class com.ss.android.lark.core.p1765c.C36096a.C360971 */

            @Override // com.ss.android.lark.collaboration.p1730a.AbstractC35340a
            /* renamed from: a */
            public boolean mo130066a(String str, boolean z) {
                return C37239a.m146648b().mo136952a(str, z);
            }

            @Override // com.ss.android.lark.collaboration.p1730a.AbstractC35340a
            /* renamed from: a */
            public void mo130065a(List<String> list, String str, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback) {
                C36099a.m141515a().mo130136e().mo130280a(list, str, contactSource, iGetDataCallback);
            }

            @Override // com.ss.android.lark.collaboration.p1730a.AbstractC35340a
            /* renamed from: a */
            public void mo130063a(Context context, ImageView imageView, String str, String str2, LoadParams loadParams) {
                C51854a.m201094a().mo142158a(context, imageView, str, str2, loadParams);
            }

            @Override // com.ss.android.lark.collaboration.p1730a.AbstractC35340a
            /* renamed from: a */
            public void mo130064a(Context context, Contact contact, String str, int i, int i2, C36516a<?> aVar) {
                AbstractC36232b.m142703a().mo178821b().mo105575a(context, contact.mo130406a(), contact.mo130408c(), new ContactSource.C29531a().mo104726a(i).mo104727a(contact.mo130408c()).mo104733f(str).mo104728a(), i2, aVar);
            }
        };
    }
}
