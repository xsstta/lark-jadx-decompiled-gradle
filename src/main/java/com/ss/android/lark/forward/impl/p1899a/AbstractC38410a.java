package com.ss.android.lark.forward.impl.p1899a;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.impl.model.C38437b;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.a.a */
public interface AbstractC38410a {

    /* renamed from: com.ss.android.lark.forward.impl.a.a$a */
    public interface AbstractC38411a extends IModel {
        /* renamed from: a */
        SearchBaseInfo mo140932a(String str);

        /* renamed from: a */
        List<SearchBaseInfo> mo140933a();

        /* renamed from: a */
        void mo140934a(SearchBaseInfo searchBaseInfo, boolean z);

        /* renamed from: a */
        void mo140935a(List<ForwardTarget> list, IGetDataCallback<C38437b> iGetDataCallback);

        /* renamed from: a */
        void mo140936a(List<SearchBaseInfo> list, boolean z, IGetDataCallback<List<ForwardTarget>> iGetDataCallback);

        /* renamed from: b */
        CallbackManager mo140937b();

        /* renamed from: c */
        String mo140938c();
    }

    /* renamed from: com.ss.android.lark.forward.impl.a.a$b */
    public interface AbstractC38412b extends AbstractC38411a {
        /* renamed from: a */
        void mo140939a(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback);

        /* renamed from: d */
        List<SearchBaseInfo> mo140940d();
    }
}
