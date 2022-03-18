package com.ss.android.lark.integrator.core;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.core.dependency.AbstractC36121f;
import com.ss.android.lark.helpdesk_api.IHelpdeskApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.core.g */
public class C39368g implements AbstractC36121f {
    @Override // com.ss.android.lark.core.dependency.AbstractC36121f
    /* renamed from: a */
    public Map<? extends String, ? extends AbstractC29186b> mo132778a(Context context) {
        return ((IHelpdeskApi) ApiUtils.getApi(IHelpdeskApi.class)).getAppLinkHandlers(context);
    }
}
