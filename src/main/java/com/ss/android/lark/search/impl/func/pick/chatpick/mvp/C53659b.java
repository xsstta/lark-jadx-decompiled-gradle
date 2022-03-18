package com.ss.android.lark.search.impl.func.pick.chatpick.mvp;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.impl.func.pick.chatpick.C53642a;
import com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.b */
public class C53659b extends BaseModel implements AbstractC53655a.AbstractC53656a {

    /* renamed from: a */
    private final Map<String, BasePickViewData> f132438a = new LinkedHashMap();

    /* renamed from: b */
    private final C53642a f132439b;

    /* renamed from: c */
    private final int f132440c;

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53656a
    /* renamed from: b */
    public int mo182983b() {
        return this.f132440c;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53656a
    /* renamed from: a */
    public List<BasePickViewData> mo182980a() {
        return new ArrayList(this.f132438a.values());
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53656a
    /* renamed from: a */
    public void mo182981a(final IGetDataCallback<List<BasePickViewData>> iGetDataCallback) {
        this.f132439b.mo182964a(getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<List<BasePickViewData>>() {
            /* class com.ss.android.lark.search.impl.func.pick.chatpick.mvp.C53659b.C536601 */

            /* renamed from: a */
            public void onSuccess(List<BasePickViewData> list) {
                iGetDataCallback.onSuccess(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        }));
    }

    public C53659b(Bundle bundle) {
        int intValue = ((Integer) bundle.get("message/filter/pick_chat_type")).intValue();
        this.f132440c = intValue;
        this.f132439b = new C53642a(60, intValue);
        m207709a(bundle);
    }

    /* renamed from: a */
    private void m207709a(Bundle bundle) {
        List<BasePickViewData> list = (List) bundle.get("message/filter/picked_chat");
        if (!CollectionUtils.isEmpty(list)) {
            for (BasePickViewData basePickViewData : list) {
                this.f132438a.put(basePickViewData.getBusinessId(), basePickViewData);
            }
        }
    }

    @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53656a
    /* renamed from: a */
    public void mo182982a(BasePickViewData basePickViewData, boolean z) {
        String businessId = basePickViewData.getBusinessId();
        if (z && !this.f132438a.containsKey(businessId)) {
            this.f132438a.put(businessId, basePickViewData);
        } else if (!z && this.f132438a.containsKey(businessId)) {
            this.f132438a.remove(businessId);
        }
    }
}
