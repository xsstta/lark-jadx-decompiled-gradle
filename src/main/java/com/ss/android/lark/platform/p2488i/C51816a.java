package com.ss.android.lark.platform.p2488i;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.download.AbstractC36841b;
import com.ss.android.lark.download.C36840a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.i.a */
public class C51816a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.i.a$a */
    public static class C51818a {

        /* renamed from: a */
        public static final AbstractC36841b f128773a = C51816a.m200874a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C36840a m200873a() {
        return new C36840a(C51818a.f128773a);
    }

    /* renamed from: a */
    public static AbstractC36841b m200874a(Context context) {
        return new AbstractC36841b() {
            /* class com.ss.android.lark.platform.p2488i.C51816a.C518171 */

            @Override // com.ss.android.lark.download.AbstractC36841b
            /* renamed from: a */
            public boolean mo135985a(String str, boolean z) {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).checkVideoDownloadAuthorization(str, z);
            }

            @Override // com.ss.android.lark.download.AbstractC36841b
            /* renamed from: a */
            public void mo135984a(Context context, int i, DialogInterface.OnDismissListener onDismissListener) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).onCheckedAuthorizationFailed(context, i, onDismissListener);
            }
        };
    }
}
