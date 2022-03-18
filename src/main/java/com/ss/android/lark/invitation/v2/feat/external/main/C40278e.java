package com.ss.android.lark.invitation.v2.feat.external.main;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalService;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.InviteExternalContactActivity;
import com.ss.android.lark.invitation.v2.feat.external.contact.v2.InviteExternalContactV2Activity;
import com.ss.android.lark.invitation.v2.feat.external.guide.InviteExternalGuideActivity;
import com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a;
import com.ss.android.lark.invitation.v2.feat.external.main.C40278e;
import com.ss.android.lark.invitation.v2.feat.external.search.InviteExternalSearchActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.e */
public class C40278e extends BasePresenter<AbstractC40268a.AbstractC40269a, AbstractC40268a.AbstractC40271b, AbstractC40268a.AbstractC40271b.AbstractC40272a> {

    /* renamed from: a */
    public String f102341a;

    /* renamed from: b */
    public String f102342b;

    /* renamed from: c */
    public String f102343c;

    /* renamed from: d */
    public int f102344d;

    /* renamed from: e */
    private boolean f102345e;

    /* renamed from: c */
    private AbstractC40268a.AbstractC40269a.AbstractC40270a m159629c() {
        return new AbstractC40268a.AbstractC40269a.AbstractC40270a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$e$SDLDWmdKwDRK5qYnNpjSQHbASWE */

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40269a.AbstractC40270a
            public final void updateAddMeSetting(boolean z) {
                C40278e.this.m159628b(z);
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC40268a.AbstractC40271b.AbstractC40272a createViewDelegate() {
        return new AbstractC40268a.AbstractC40271b.AbstractC40272a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.C40278e.C402802 */

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b.AbstractC40272a
            /* renamed from: d */
            public void mo146079d() {
                C40278e.this.mo146083a();
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b.AbstractC40272a
            /* renamed from: a */
            public void mo146076a() {
                C40147z.m159160a().openF2fGroupPage(((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146070a());
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b.AbstractC40272a
            /* renamed from: c */
            public void mo146078c() {
                InviteExternalSearchActivity.m159709a(((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146070a(), C40278e.this.f102342b, C40278e.this.f102343c);
            }

            @Override // com.ss.android.lark.invitation.v2.feat.external.main.AbstractC40268a.AbstractC40271b.AbstractC40272a
            /* renamed from: b */
            public void mo146077b() {
                if (C40147z.m159160a().getContactDependency().mo145580a()) {
                    InviteExternalContactV2Activity.m159460a(((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146070a(), C40278e.this.f102342b, C40278e.this.f102343c, C40278e.this.f102341a);
                } else {
                    InviteExternalContactActivity.m159405a(((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146070a(), C40278e.this.f102342b, C40278e.this.f102343c, C40278e.this.f102341a);
                }
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo146083a();
    }

    /* renamed from: d */
    private void m159631d() {
        this.f102344d++;
        ((AbstractC40268a.AbstractC40271b) getView()).mo146074b();
        InviteExternalService.m159379a(((AbstractC40268a.AbstractC40271b) getView()).mo146070a(), new ApiUtils.AbstractC57748a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$e$LLK0KgtNuph1DAK_YTVtoPVhY */

            @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
            public final void consume(Object obj) {
                C40278e.this.m159627a((C40278e) ((C40219a) obj));
            }
        });
    }

    /* renamed from: a */
    public void mo146083a() {
        if (this.f102345e || UserSP.getInstance().getBoolean("is_invite_external_guided")) {
            m159631d();
            return;
        }
        m159631d();
        this.f102344d++;
        ((AbstractC40268a.AbstractC40269a) getModel()).mo146080a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.C40278e.C402791 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m159636a() {
                ((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146075c();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165386e("InvitationModule", errorResult);
                C40278e eVar = C40278e.this;
                int i = eVar.f102344d - 1;
                eVar.f102344d = i;
                if (i == 0) {
                    ((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146075c();
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C40278e eVar = C40278e.this;
                int i = eVar.f102344d - 1;
                eVar.f102344d = i;
                if (i == 0) {
                    ViewUtils.m224149a(new Runnable() {
                        /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$e$1$w5TkpZV6EXKGpUxpn2Cm1RUtbQQ */

                        public final void run() {
                            C40278e.C402791.this.m159636a();
                        }
                    }, 600);
                }
                if (bool.booleanValue()) {
                    InviteExternalGuideActivity.f102295a.mo146008a(((AbstractC40268a.AbstractC40271b) C40278e.this.getView()).mo146070a(), C40278e.this.f102341a);
                }
                UserSP.getInstance().putBoolean("is_invite_external_guided", true);
            }
        });
    }

    /* renamed from: a */
    public void mo146084a(String str) {
        this.f102341a = str;
    }

    /* renamed from: a */
    public void mo146085a(boolean z) {
        this.f102345e = z;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m159628b(boolean z) {
        UICallbackExecutor.execute(new Runnable(z) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$e$JqmftKGjtQd1uj5UDzwMkP8JtIw */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C40278e.this.m159630c(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m159630c(boolean z) {
        ((AbstractC40268a.AbstractC40271b) getView()).mo146073a(!z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m159627a(C40219a aVar) {
        int i = this.f102344d - 1;
        this.f102344d = i;
        if (i == 0) {
            ((AbstractC40268a.AbstractC40271b) getView()).mo146075c();
        }
        if (aVar == null) {
            ((AbstractC40268a.AbstractC40271b) getView()).mo146072a(UIHelper.getString(R.string.Lark_Legacy_LoadFailedRetryTip));
        } else if (aVar.f102188a != null) {
            ((AbstractC40268a.AbstractC40271b) getView()).mo146072a(aVar.f102188a.getDisplayMsg());
        } else {
            this.f102342b = aVar.mo145912b();
            this.f102343c = aVar.mo145914c();
            ((AbstractC40268a.AbstractC40271b) getView()).mo146071a(aVar);
        }
    }

    public C40278e(AbstractC40268a.AbstractC40269a aVar, AbstractC40268a.AbstractC40271b bVar) {
        super(aVar, bVar);
        bVar.setViewDelegate(createViewDelegate());
        aVar.mo146069a(m159629c());
    }
}
