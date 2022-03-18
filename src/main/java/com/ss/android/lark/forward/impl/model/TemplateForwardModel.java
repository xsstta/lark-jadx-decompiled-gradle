package com.ss.android.lark.forward.impl.model;

import android.content.Intent;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.impl.model.p1902a.C38432c;
import com.ss.android.lark.forward.impl.model.p1902a.RunnableC38430a;
import com.ss.android.lark.forward.impl.model.p1903b.C38438a;
import com.ss.android.lark.forward.impl.p1899a.AbstractC38410a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateForwardModel extends AbstractC38427a implements AbstractC38410a.AbstractC38412b {

    /* renamed from: a */
    public final Map<Integer, List<SearchBaseInfo>> f98787a = new HashMap();

    /* renamed from: b */
    private final ForwardTemplate f98788b;

    /* renamed from: c */
    private final boolean f98789c = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LOAD_DATA_TYPE {
    }

    /* renamed from: f */
    private List<SearchBaseInfo> m151537f() {
        return this.f98787a.get(0);
    }

    /* renamed from: e */
    public List<SearchBaseInfo> mo140975e() {
        return this.f98787a.get(1);
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: c */
    public String mo140938c() {
        ForwardHitPoint g;
        ForwardTemplate forwardTemplate = this.f98788b;
        if (forwardTemplate == null || (g = forwardTemplate.mo140594g()) == null) {
            return null;
        }
        return g.mo140782a();
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38412b
    /* renamed from: d */
    public List<SearchBaseInfo> mo140940d() {
        List<SearchBaseInfo> list;
        List<SearchBaseInfo> list2;
        if (CollectionUtils.isEmpty(m151537f())) {
            list = new ArrayList<>();
        } else {
            list = m151537f();
        }
        if (CollectionUtils.isEmpty(mo140975e())) {
            list2 = new ArrayList<>();
        } else {
            list2 = mo140975e();
        }
        return C38438a.m151566a(list, list2, false);
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38412b
    /* renamed from: a */
    public void mo140939a(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        m151534c(iGetDataCallback);
    }

    /* renamed from: b */
    public void mo140974b(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        m151536e(iGetDataCallback);
    }

    public TemplateForwardModel(ForwardTemplate forwardTemplate) {
        this.f98788b = forwardTemplate;
    }

    /* renamed from: d */
    private IGetDataCallback<List<SearchBaseInfo>> m151535d(final IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        return (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<List<SearchBaseInfo>>() {
            /* class com.ss.android.lark.forward.impl.model.TemplateForwardModel.C384251 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                TemplateForwardModel.this.f98787a.put(1, new ArrayList());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<SearchBaseInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size() && (CollectionUtils.isEmpty(TemplateForwardModel.this.mo140975e()) || TemplateForwardModel.this.mo140975e().size() < 20); i++) {
                    arrayList.add(list.get(i));
                }
                TemplateForwardModel.this.f98787a.put(1, arrayList);
                TemplateForwardModel.this.mo140974b(iGetDataCallback);
            }
        });
    }

    /* renamed from: c */
    private void m151534c(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        C57865c.m224576a(new RunnableC38430a(new C38432c(this.f98788b.mo140590d()), m151535d(iGetDataCallback)));
    }

    /* renamed from: e */
    private void m151536e(IGetDataCallback<List<SearchBaseInfo>> iGetDataCallback) {
        List<SearchBaseInfo> list = this.f98787a.get(1);
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(C38438a.m151566a(new ArrayList(), list, false));
        }
    }

    @Override // com.ss.android.lark.forward.impl.model.AbstractC38427a, com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: a */
    public void mo140934a(SearchBaseInfo searchBaseInfo, boolean z) {
        super.mo140934a(searchBaseInfo, z);
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: a */
    public void mo140935a(List<ForwardTarget> list, final IGetDataCallback<C38437b> iGetDataCallback) {
        C384262 r0 = new AbstractC38405a.AbstractC38406a() {
            /* class com.ss.android.lark.forward.impl.model.TemplateForwardModel.C384262 */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
            /* renamed from: a */
            public void mo140599a(int i, Intent intent) {
                Log.m165389i("TemplateForwardModel", "on executor forward success");
                C38437b bVar = new C38437b();
                bVar.mo140985a(i);
                bVar.mo140986a(intent);
                iGetDataCallback.onSuccess(bVar);
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
            /* renamed from: a */
            public void mo140601a(String str, boolean z) {
                Log.m165389i("TemplateForwardModel", "on executor forward failed");
                iGetDataCallback.onError((ErrorResult) new ForwardErrorResult(str, z));
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a
            /* renamed from: a */
            public void mo140600a(String str, String str2, boolean z) {
                Log.m165389i("TemplateForwardModel", "on executor forward failed");
                iGetDataCallback.onError((ErrorResult) new ForwardErrorResult(str, str2, z));
            }
        };
        StringBuffer stringBuffer = new StringBuffer();
        if (!CollectionUtils.isEmpty(list)) {
            for (ForwardTarget forwardTarget : list) {
                stringBuffer.append(forwardTarget.mo140565a());
                stringBuffer.append("-");
                stringBuffer.append(forwardTarget.mo140567b());
                stringBuffer.append(". ");
            }
        }
        Log.m165389i("TemplateForwardModel", "will calling executor process forward , target data : " + stringBuffer.toString());
        this.f98788b.mo140588b().onForward(list, this.f98788b.mo140595h(), r0);
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.AbstractC38410a.AbstractC38411a
    /* renamed from: a */
    public void mo140936a(List<SearchBaseInfo> list, boolean z, IGetDataCallback<List<ForwardTarget>> iGetDataCallback) {
        if (z) {
            mo140977b(list, iGetDataCallback);
        } else {
            mo140978c(list, iGetDataCallback);
        }
    }
}
