package com.ss.android.lark.member_manage.impl.atselector;

import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIDelayGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.C44895d;
import com.ss.android.lark.member_manage.impl.atselector.C44962a;
import com.ss.android.lark.member_manage.impl.atselector.C44972b;
import com.ss.android.lark.member_manage.impl.atselector.bean.AtSelectInitData;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44978b;
import com.ss.android.lark.member_manage.impl.atselector.bean.LabelAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.SearchBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.WantAtMemBean;
import com.ss.android.lark.member_manage.impl.atselector.model.C44999a;
import com.ss.android.lark.member_manage.impl.statistics.MessageHitPoint;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.search.widget.dependency.SearchWidgetModuleDependency;
import com.ss.android.lark.searchcommon.reporter.SearchConsistencyReporter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.a */
public class C44962a extends BasePresenter<C44972b.AbstractC44973a, C44972b.AbstractC44975b, C44972b.AbstractC44975b.AbstractC44976a> {

    /* renamed from: a */
    C44972b.AbstractC44975b f113849a;

    /* renamed from: b */
    C44972b.AbstractC44973a f113850b;

    /* renamed from: c */
    IGroupMemberManageModuleDependency.AbstractC44878a f113851c = GroupMemberManageModule.m177902a().getAccountDependency();

    /* renamed from: d */
    public String f113852d = "";

    /* renamed from: e */
    public String f113853e = "";

    /* renamed from: f */
    public int f113854f;

    /* renamed from: g */
    public int f113855g;

    /* renamed from: h */
    private C44965b f113856h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.a$b */
    public class C44965b implements C44972b.AbstractC44975b.AbstractC44976a {
        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: c */
        public boolean mo159108c() {
            return false;
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: d */
        public void mo159109d() {
            C44962a.this.f113849a.mo159139a(C44962a.this.f113850b.mo159128c());
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: e */
        public void mo159111e() {
            C44962a.this.f113849a.mo159139a(C44962a.this.f113850b.mo159129d());
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: a */
        public void mo159101a() {
            ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159121a(new IGetDataCallback<List<BaseAtBean>>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C44965b.C449661 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    GroupMemberManageModule.m177902a().getChatDependency().mo143768b(false);
                }

                /* renamed from: a */
                public void onSuccess(List<BaseAtBean> list) {
                    ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159139a(list);
                    GroupMemberManageModule.m177902a().getChatDependency().mo143768b(false);
                }
            });
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: b */
        public void mo159105b() {
            m178330c(((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159133h());
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: f */
        public void mo159112f() {
            for (String str : new HashSet(C44962a.this.f113850b.mo159119a().keySet())) {
                Map<String, BaseAtBean> a = C44962a.this.f113850b.mo159119a();
                C44962a.this.f113850b.mo159126b(a.get(str));
            }
        }

        private C44965b() {
        }

        /* renamed from: b */
        private void m178328b(final String str) {
            C57865c.m224574a(new C57865c.AbstractC57873d<List<ChatChatter>>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C44965b.C449672 */

                /* renamed from: a */
                public List<ChatChatter> produce() {
                    return new ArrayList(((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159125b().values());
                }
            }, new C57865c.AbstractC57871b<List<ChatChatter>>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C44965b.C449683 */

                /* renamed from: a */
                public void consume(List<ChatChatter> list) {
                    ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159143b(str, list);
                }
            });
        }

        /* renamed from: c */
        private void m178330c(String str) {
            GroupMemberManageModule.m177902a().getChatDependency().mo143761a(true);
            C449694 r0 = new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C44965b.C449694 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    GroupMemberManageModule.m177902a().getChatDependency().mo143761a(false);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    GroupMemberManageModule.m177902a().getChatDependency().mo143761a(false);
                }
            };
            C44962a.this.mo159097a(str);
            SearchConsistencyReporter.f133153a.mo183820a(C44962a.this.f113853e, 0);
            m178329b(str, r0);
            m178326a(str, r0);
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: d */
        public void mo159110d(BaseAtBean baseAtBean) {
            C44962a.this.f113849a.mo159141a(C44962a.this.f113850b.mo159126b(baseAtBean), false);
            C44962a.this.f113849a.mo159144b(C44962a.this.f113850b.mo159130e());
            C44962a.this.f113849a.mo159145c(C44962a.this.f113850b.mo159131f());
        }

        /* renamed from: a */
        private void m178327a(Map<String, BaseAtBean> map) {
            boolean z;
            String str;
            String str2;
            boolean z2;
            for (BaseAtBean baseAtBean : map.values()) {
                if (!(baseAtBean.getType() == 3 || baseAtBean.getType() == 1)) {
                    if (baseAtBean instanceof SearchBean) {
                        z = ((SearchBean) baseAtBean).isOutChatUser();
                    } else {
                        z = false;
                    }
                    String h = ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159133h();
                    if (baseAtBean instanceof WantAtMemBean) {
                        WantAtMemBean wantAtMemBean = (WantAtMemBean) baseAtBean;
                        String searchLocation = wantAtMemBean.getSearchLocation();
                        str = wantAtMemBean.getGuessType();
                        str2 = searchLocation;
                    } else {
                        str2 = "";
                        str = str2;
                    }
                    MessageHitPoint.Companion aVar = MessageHitPoint.f114608a;
                    if (baseAtBean.getType() == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    aVar.mo159948a(z2, baseAtBean.getId(), C44962a.this.f113851c.mo143795b(), z, !TextUtils.isEmpty(h), str2, str);
                }
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: b */
        public void mo159106b(BaseAtBean baseAtBean) {
            C44962a.this.f113849a.mo159141a(C44962a.this.f113850b.mo159126b(baseAtBean), false);
            C44962a.this.f113849a.mo159144b(C44962a.this.f113850b.mo159130e());
            C44962a.this.f113849a.mo159145c(C44962a.this.f113850b.mo159131f());
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: c */
        public void mo159107c(BaseAtBean baseAtBean) {
            boolean z;
            String str;
            String str2;
            boolean z2;
            if (baseAtBean instanceof SearchBean) {
                z = ((SearchBean) baseAtBean).isOutChatUser();
            } else {
                z = false;
            }
            String h = ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159133h();
            if (baseAtBean instanceof WantAtMemBean) {
                WantAtMemBean wantAtMemBean = (WantAtMemBean) baseAtBean;
                String searchLocation = wantAtMemBean.getSearchLocation();
                str = wantAtMemBean.getGuessType();
                str2 = searchLocation;
            } else {
                str2 = "";
                str = str2;
            }
            MessageHitPoint.Companion aVar = MessageHitPoint.f114608a;
            if (baseAtBean.getType() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.mo159948a(z2, baseAtBean.getId(), C44962a.this.f113851c.mo143795b(), z, !TextUtils.isEmpty(h), str2, str);
            C44962a.this.f113850b.mo159120a(baseAtBean);
            m178328b(h);
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: a */
        public void mo159102a(int i) {
            if (i != 1 || ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159119a().isEmpty()) {
                ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159140a(((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159119a());
                return;
            }
            m178327a(((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159119a());
            m178328b(C44962a.this.f113850b.mo159133h());
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: a */
        public void mo159103a(BaseAtBean baseAtBean) {
            C44962a.this.f113849a.mo159141a(C44962a.this.f113850b.mo159120a(baseAtBean), true);
            C44962a.this.f113849a.mo159144b(C44962a.this.f113850b.mo159130e());
            C44962a.this.f113849a.mo159145c(C44962a.this.f113850b.mo159131f());
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44975b.AbstractC44976a
        /* renamed from: a */
        public void mo159104a(String str) {
            if (C44962a.this.f113850b != null) {
                C44962a.this.f113850b.mo159132g();
                m178330c(str);
            }
        }

        /* renamed from: b */
        private void m178329b(final String str, final IGetDataCallback<Boolean> iGetDataCallback) {
            ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159127b(str, C44962a.this.f113853e, new UIGetDataCallback(new IGetDataCallback<C44895d>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C44965b.C449716 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    SearchWidgetModuleDependency.m208514b(C44962a.this.f113852d);
                    C44962a.this.f113854f = 3;
                    if (3 == C44962a.this.f113855g) {
                        ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159137a(str);
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(C44895d dVar) {
                    if (TextUtils.equals(C44962a.this.f113853e, dVar.f113673f)) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(true);
                        }
                        List<BaseAtBean> a = C44962a.this.mo159095a(dVar.f113669b, dVar.f113670c, true);
                        C44962a.this.mo159098a(a, ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159119a());
                        if (CollectionUtils.isEmpty(a)) {
                            SearchWidgetModuleDependency.m208513a(C44962a.this.f113852d);
                            C44962a.this.f113854f = 2;
                            if (2 == C44962a.this.f113855g || 3 == C44962a.this.f113855g) {
                                ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159142b(str);
                            }
                        } else {
                            C44962a.this.f113854f = 1;
                            ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159138a(str, a);
                        }
                        ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159124a(dVar.f113673f, a);
                    }
                }
            }));
        }

        /* renamed from: a */
        private void m178326a(final String str, final IGetDataCallback<Boolean> iGetDataCallback) {
            int i;
            C449705 r0 = new IGetDataCallback<C44895d>() {
                /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C44965b.C449705 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    SearchWidgetModuleDependency.m208515c(C44962a.this.f113852d);
                    C44962a.this.f113855g = 3;
                    if (3 == C44962a.this.f113854f) {
                        ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159137a(str);
                    }
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(C44895d dVar) {
                    if (TextUtils.equals(C44962a.this.f113853e, dVar.f113673f) && 1 != C44962a.this.f113854f) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onSuccess(true);
                        }
                        List<BaseAtBean> a = C44962a.this.mo159096a(dVar.f113669b, false);
                        C44962a.this.mo159098a(a, ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159119a());
                        if (CollectionUtils.isEmpty(a)) {
                            C44962a.this.f113855g = 2;
                            if (3 == C44962a.this.f113854f || 2 == C44962a.this.f113854f) {
                                ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159142b(str);
                            }
                        } else {
                            C44962a.this.f113855g = 1;
                            ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159138a(str, a);
                        }
                        ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159124a(dVar.f113673f, a);
                    }
                }
            };
            if (NetworkUtils.isNetworkAvailableFast(UIHelper.getContext())) {
                i = 1000;
            } else {
                i = LocationRequest.PRIORITY_INDOOR;
            }
            ((C44972b.AbstractC44973a) C44962a.this.getModel()).mo159123a(str, C44962a.this.f113853e, new UIDelayGetDataCallback(r0, i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C44972b.AbstractC44975b.AbstractC44976a createViewDelegate() {
        C44965b bVar = new C44965b();
        this.f113856h = bVar;
        return bVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f113849a = null;
        this.f113850b = null;
        this.f113856h = null;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C48211b.m190251a().mo168689b("loadRecommendData");
        ((C44972b.AbstractC44973a) getModel()).mo159121a(new IGetDataCallback<List<BaseAtBean>>() {
            /* class com.ss.android.lark.member_manage.impl.atselector.C44962a.C449631 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C48211b.m190251a().mo168691c("loadRecommendData");
                GroupMemberManageModule.m177902a().getChatDependency().mo143768b(false);
            }

            /* renamed from: a */
            public void onSuccess(List<BaseAtBean> list) {
                C48211b.m190251a().mo168691c("loadRecommendData");
                ((C44972b.AbstractC44975b) C44962a.this.getView()).mo159139a(list);
                GroupMemberManageModule.m177902a().getChatDependency().mo143768b(false);
            }
        });
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.a$a */
    public class C44964a implements C44972b.AbstractC44973a.AbstractC44974a {
        public C44964a() {
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a.AbstractC44974a
        /* renamed from: a */
        public void mo159100a(List<BaseAtBean> list, boolean z) {
            UICallbackExecutor.execute(new Runnable(list, z) {
                /* class com.ss.android.lark.member_manage.impl.atselector.$$Lambda$a$a$0CpdWQf3CJh_GifJu9YMD4T4 */
                public final /* synthetic */ List f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C44962a.C44964a.this.m178324b(this.f$1, this.f$2);
                }
            });
        }

        /* access modifiers changed from: private */
        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.lark.member_manage.impl.atselector.b$b */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m178324b(List list, boolean z) {
            if (C44962a.this.f113849a != null) {
                List<BaseAtBean> list2 = list;
                if (C44962a.this.f113849a.mo159136a() != 1) {
                    C44972b.AbstractC44973a aVar = C44962a.this.f113850b;
                    if (z) {
                        list2 = aVar.mo159129d();
                    } else {
                        list2 = aVar.mo159128c();
                    }
                }
                C44962a.this.f113849a.mo159139a(list2);
            }
        }
    }

    /* renamed from: a */
    public void mo159097a(String str) {
        this.f113854f = 0;
        this.f113855g = 0;
        this.f113852d = str;
        this.f113853e = C53234a.m205877a();
        Log.m165379d("AtPresenter", "searchKey: " + this.f113852d + " requestID: " + this.f113853e);
    }

    /* renamed from: a */
    public void mo159098a(List<BaseAtBean> list, Map<String, BaseAtBean> map) {
        for (BaseAtBean baseAtBean : list) {
            baseAtBean.setSelected(map.containsKey(baseAtBean.getId()));
        }
    }

    public C44962a(AtSelectInitData atSelectInitData, C44972b.AbstractC44975b bVar) {
        this.f113849a = bVar;
        bVar.setViewDelegate(new C44965b());
        C44999a aVar = new C44999a(atSelectInitData);
        this.f113850b = aVar;
        aVar.mo159122a(new C44964a());
        setModel(this.f113850b);
        setView(this.f113849a);
    }

    /* renamed from: a */
    public List<BaseAtBean> mo159096a(List<ChatChatter> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            if (z) {
                arrayList.add(new LabelAtBean(UIHelper.getString(R.string.Lark_Chat_AtChatMember)));
                LabelAtBean labelAtBean = new LabelAtBean(UIHelper.getString(R.string.Lark_Chat_AtChatMemberNoResults));
                labelAtBean.setBgColorResId(R.color.bg_body);
                labelAtBean.setTextSize(16);
                labelAtBean.setHeight(UIHelper.dp2px(68.0f));
                arrayList.add(labelAtBean);
            }
            return arrayList;
        }
        arrayList.add(new LabelAtBean(UIHelper.getString(R.string.Lark_Chat_AtChatMember)));
        Chat j = ((C44972b.AbstractC44973a) getModel()).mo159135j();
        for (ChatChatter chatChatter : list) {
            arrayList.add(new SearchBean(C44978b.m178402a(j, chatChatter)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<BaseAtBean> mo159095a(List<ChatChatter> list, List<ChatChatter> list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(mo159096a(list, CollectionUtils.isNotEmpty(list2)));
        }
        if (!CollectionUtils.isEmpty(list2) && arrayList.size() < 10) {
            if (((C44972b.AbstractC44973a) getModel()).mo159134i()) {
                arrayList.add(new LabelAtBean(UIHelper.getString(R.string.Lark_Chat_AtNonChatMember), UIHelper.getString(R.string.Lark_Groups_MentionNonMembereTips)));
            } else {
                arrayList.add(new LabelAtBean(UIHelper.getString(R.string.Lark_Chat_AtNonChatMember), UIHelper.getString(R.string.Lark_Chat_AtNonChatMemberDescription)));
            }
            Chat j = ((C44972b.AbstractC44973a) getModel()).mo159135j();
            for (ChatChatter chatChatter : list2) {
                SearchBean searchBean = new SearchBean(C44978b.m178402a(j, chatChatter));
                searchBean.setOutChatUser(true);
                arrayList.add(searchBean);
            }
        }
        return arrayList;
    }
}
