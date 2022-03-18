package com.ss.android.lark.contact.impl.contacts_home;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29563j;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1747b.C35497a;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.impl.viewdata.C36077a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.contacts_home.c */
public class C35667c extends BasePresenter<AbstractC35680f.AbstractC35681a, AbstractC35680f.AbstractC35683b, AbstractC35680f.AbstractC35683b.AbstractC35684a> {

    /* renamed from: a */
    public AbstractC29563j.AbstractC29564a f92268a;

    /* renamed from: b */
    public List<String> f92269b;

    /* renamed from: c */
    public List<String> f92270c;

    /* renamed from: d */
    private C35674b f92271d;

    /* renamed from: e */
    private C35671a f92272e;

    /* renamed from: f */
    private boolean f92273f;

    /* renamed from: g */
    private CallbackManager f92274g;

    /* renamed from: h */
    private AbstractC35361b.AbstractC35376o f92275h = C35358a.m138143a().mo130163h();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC35680f.AbstractC35683b.AbstractC35684a createViewDelegate() {
        C35674b bVar = new C35674b();
        this.f92271d = bVar;
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC35680f.AbstractC35681a.AbstractC35682a mo131416a() {
        C35671a aVar = new C35671a();
        this.f92272e = aVar;
        return aVar;
    }

    /* renamed from: d */
    public void mo131424d() {
        ((AbstractC35680f.AbstractC35683b) getView()).mo131367b(true);
        Statistics.sendEvent("invite_people_entry_contacts_view");
    }

    /* renamed from: e */
    public ITitleInfo mo131426e() {
        return ((AbstractC35680f.AbstractC35683b) getView()).mo131372f();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        CallbackManager callbackManager = this.f92274g;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
            this.f92274g = null;
        }
        this.f92272e = null;
        this.f92271d = null;
        super.destroy();
    }

    /* renamed from: f */
    public void mo131427f() {
        ((AbstractC35680f.AbstractC35681a) getModel()).mo131406a(this.f92274g.wrapAndAddGetDataCallback(new IGetDataCallback<GetAdminPermissionInfoResponse>() {
            /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C356703 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("ContactsHomePresenter", "check user admin permission failed : " + errorResult);
                ContactHitPoint.m140796c(false);
            }

            /* renamed from: a */
            public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                boolean z = false;
                if (getAdminPermissionInfoResponse == null) {
                    Log.m165383e("ContactsHomePresenter", "check user admin permission onSuccess, response is null");
                } else if (getAdminPermissionInfoResponse.misSuperAdministrator.booleanValue() || getAdminPermissionInfoResponse.misDepartmentAdministrator.booleanValue()) {
                    z = true;
                }
                ContactHitPoint.m140796c(z);
            }
        }));
    }

    /* renamed from: g */
    private void m139619g() {
        ((AbstractC35680f.AbstractC35683b) getView()).mo131364b();
        C35497a.m138870a(((AbstractC35680f.AbstractC35681a) getModel()).mo131412b(), (IGetDataCallback) this.f92274g.wrapAndAddCallback(new UIGetDataCallback(new IGetDataCallback<AbstractC35936a.C35939c>() {
            /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C356681 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131370d();
                ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131371e();
            }

            /* renamed from: a */
            public void onSuccess(AbstractC35936a.C35939c cVar) {
                ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131370d();
                List<C36077a> a = C35667c.this.mo131417a(C35497a.m138868a(cVar));
                C35667c.this.mo131421b(a);
                ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131361a(a);
                Set<String> f = cVar.mo132235f();
                f.addAll(C35667c.this.f92269b);
                ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131362a(f);
                ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131366b(C35667c.this.f92270c);
            }
        })));
    }

    /* renamed from: c */
    public void mo131422c() {
        boolean z;
        if (!this.f92275h.mo130229a() || this.f92273f) {
            z = false;
        } else {
            z = true;
        }
        ((AbstractC35680f.AbstractC35683b) getView()).mo131354a();
        ((AbstractC35680f.AbstractC35683b) getView()).mo131363a(z);
        ((AbstractC35680f.AbstractC35681a) getModel()).mo131405a();
        if (z) {
            m139619g();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        boolean z;
        super.create();
        this.f92274g = new CallbackManager();
        if (!this.f92275h.mo130229a() || this.f92273f) {
            z = false;
        } else {
            z = true;
        }
        ((AbstractC35680f.AbstractC35683b) getView()).mo131363a(z);
        if (z) {
            m139619g();
        }
    }

    /* renamed from: a */
    public void mo131418a(AbstractC29563j.AbstractC29564a aVar) {
        this.f92268a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.c$a */
    public class C35671a implements AbstractC35680f.AbstractC35681a.AbstractC35682a {
        private C35671a() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a.AbstractC35682a
        /* renamed from: a */
        public void mo131432a(final int i) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C35671a.RunnableC356732 */

                public void run() {
                    ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131355a(i);
                }
            });
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35681a.AbstractC35682a
        /* renamed from: a */
        public void mo131433a(Chatter chatter, String str, boolean z) {
            final C36077a a = C35497a.m138866a(chatter, str, z);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C35671a.RunnableC356721 */

                public void run() {
                    ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131365b(a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.c$b */
    public class C35674b implements AbstractC35680f.AbstractC35683b.AbstractC35684a {
        public C35674b() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b.AbstractC35684a
        /* renamed from: a */
        public void mo131436a(final C36077a aVar) {
            ((AbstractC35680f.AbstractC35681a) C35667c.this.getModel()).mo131410a(aVar.f93246d, aVar.f93247e, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C35674b.C356762 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131359a(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131360a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_DeleteFail)));
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b.AbstractC35684a
        /* renamed from: a */
        public void mo131437a(String str) {
            ((AbstractC35680f.AbstractC35681a) C35667c.this.getModel()).mo131409a(str, new UIGetDataCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C35674b.C356751 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    if (chatter != null) {
                        ((AbstractC35680f.AbstractC35683b) C35667c.this.getView()).mo131357a(chatter);
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b.AbstractC35684a
        /* renamed from: a */
        public void mo131438a(String str, final boolean z) {
            ((AbstractC35680f.AbstractC35681a) C35667c.this.getModel()).mo131409a(str, new UIGetDataCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C35674b.C356773 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    if (chatter != null && C35667c.this.f92268a != null) {
                        C35667c.this.f92268a.onItemSelected(chatter, z);
                    }
                }
            }));
        }
    }

    /* renamed from: b */
    public List<C36077a> mo131421b(List<C36077a> list) {
        Collections.sort(list, new Comparator<C36077a>() {
            /* class com.ss.android.lark.contact.impl.contacts_home.C35667c.C356692 */

            /* renamed from: a */
            public int compare(C36077a aVar, C36077a aVar2) {
                return aVar.f93249g.compareTo(aVar2.f93249g);
            }
        });
        return list;
    }

    /* renamed from: a */
    public void mo131419a(boolean z) {
        ((AbstractC35680f.AbstractC35683b) getView()).mo131369c(z);
    }

    /* renamed from: c */
    public void mo131423c(List<String> list) {
        this.f92269b = list;
        ((AbstractC35680f.AbstractC35683b) getView()).mo131362a(new HashSet(this.f92269b));
    }

    /* renamed from: d */
    public void mo131425d(List<String> list) {
        this.f92270c = list;
        ((AbstractC35680f.AbstractC35683b) getView()).mo131366b(this.f92270c);
    }

    /* renamed from: a */
    public List<C36077a> mo131417a(List<C36077a> list) {
        ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
        Log.m165389i("ContactsHomePresenter", "contact count before duplicate：" + list.size() + ", contact count after duplicate：" + arrayList.size());
        if (arrayList.size() != list.size()) {
            String str = "removeDuplicate size:" + (list.size() - arrayList.size());
            Log.m165385e("ContactsHomePresenter", str, new Exception(str), true);
        }
        return arrayList;
    }

    public C35667c(AbstractC35680f.AbstractC35681a aVar, AbstractC35680f.AbstractC35683b bVar, boolean z, List<String> list) {
        super(aVar, bVar);
        aVar.mo131408a(mo131416a());
        this.f92273f = z;
        this.f92270c = list;
    }
}
