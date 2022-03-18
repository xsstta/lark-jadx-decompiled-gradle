package com.ss.android.lark.feed.app.model;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.feed.interfaces.AbstractC38116z;
import com.ss.android.lark.feed.interfaces.IDeviceNotifyListener;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.model.c */
public class C37708c {
    /* renamed from: a */
    public int mo138221a() {
        return C37268c.m146766b().mo139200s().mo139314a().size();
    }

    /* renamed from: b */
    public int mo138224b() {
        ListIterator<TenantInfo> listIterator = C37268c.m146766b().mo139200s().mo139314a().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            TenantInfo next = listIterator.next();
            if (next.isNewUser() && !next.isCurrentUser()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo138222a(IDeviceNotifyListener iDeviceNotifyListener) {
        C37268c.m146766b().mo139177a(iDeviceNotifyListener);
    }

    /* renamed from: a */
    public void mo138223a(final AbstractC38116z zVar) {
        C37268c.m146766b().mo139200s().mo139315a(new IGetDataCallback<Map<String, Integer>>() {
            /* class com.ss.android.lark.feed.app.model.C37708c.C377091 */

            /* renamed from: a */
            public void onSuccess(Map<String, Integer> map) {
                Log.m165379d("FeedModule_ExtraLoader", "pull tenant badge success: " + map);
                zVar.mo138505a(map);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                zVar.mo138505a(Collections.emptyMap());
                Log.m165397w("FeedModule_ExtraLoader", "pull tenant badge count error, " + errorResult.getDebugMsg());
            }
        });
    }
}
