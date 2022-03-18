package com.ss.android.lark.member_manage.impl.atselector.model.p2256a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.C44895d;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.statistics.AtSelectPerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.model.a.b */
public class C45004b {

    /* renamed from: a */
    String f113958a;

    /* renamed from: b */
    IGroupMemberManageModuleDependency.IChatDependency f113959b = GroupMemberManageModule.m177902a().getChatDependency();

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.model.a.b$a */
    public class C45006a {

        /* renamed from: a */
        IGetDataCallback<List<BaseAtBean>> f113962a;

        /* renamed from: c */
        private boolean f113964c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo159244a() {
            return this.f113964c;
        }

        /* renamed from: a */
        public void mo159243a(String str) {
            Chat b = C45004b.this.f113959b.mo143763b(str);
            if (b == null) {
                Log.m165383e("RecommendDataLoader", "cannot get chat when at someone. chatid: " + str);
                AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159939b();
                return;
            }
            boolean z = false;
            C44895d a = C45004b.this.f113959b.mo143745a(str, (String) null, C53234a.m205877a(), false);
            if (a.f113669b.size() == 0) {
                this.f113964c = true;
            } else {
                if (b.getMemberCount() > a.f113669b.size()) {
                    z = true;
                }
                this.f113964c = z;
            }
            this.f113962a.onSuccess(new C45003a(b, a.f113668a, a.f113669b, a.f113671d, a.f113672e).mo159240a());
        }

        public C45006a(IGetDataCallback<List<BaseAtBean>> iGetDataCallback) {
            this.f113962a = iGetDataCallback;
        }
    }

    public C45004b(String str) {
        this.f113958a = str;
    }

    /* renamed from: a */
    public void mo159241a(final IGetDataCallback<List<BaseAtBean>> iGetDataCallback) {
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.lark.member_manage.impl.atselector.model.p2256a.C45004b.RunnableC450051 */

            public void run() {
                C45006a aVar = new C45006a(iGetDataCallback);
                AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159941d();
                aVar.mo159243a(C45004b.this.f113958a);
                AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159938a(aVar.mo159244a());
                if (aVar.mo159244a()) {
                    new C45007b(iGetDataCallback).mo159245a(C45004b.this.f113958a);
                    return;
                }
                AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159942e();
                new C45007b(null).mo159245a(C45004b.this.f113958a);
            }
        });
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.model.a.b$b */
    public class C45007b {

        /* renamed from: a */
        IGetDataCallback<List<BaseAtBean>> f113965a;

        /* renamed from: a */
        public void mo159245a(String str) {
            final Chat a = C45004b.this.f113959b.mo143743a(str);
            C45004b.this.f113959b.mo143755a(str, null, C53234a.m205877a(), true, new IGetDataCallback<C44895d>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.model.p2256a.C45004b.C45007b.C450081 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159936a();
                    if (C45007b.this.f113965a != null) {
                        C45007b.this.f113965a.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(C44895d dVar) {
                    AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159942e();
                    if (C45007b.this.f113965a != null) {
                        C45007b.this.f113965a.onSuccess(new C45003a(a, dVar.f113668a, dVar.f113669b, dVar.f113671d, dVar.f113672e).mo159240a());
                    }
                }
            });
        }

        public C45007b(IGetDataCallback<List<BaseAtBean>> iGetDataCallback) {
            this.f113965a = iGetDataCallback;
        }
    }
}
