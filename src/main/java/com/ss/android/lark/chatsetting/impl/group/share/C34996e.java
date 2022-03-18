package com.ss.android.lark.chatsetting.impl.group.share;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.dto.ChatLinkTokenResponse;
import com.ss.android.lark.chatsetting.impl.group.share.C34996e;
import com.ss.android.lark.chatsetting.impl.group.share.C35006i;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.e */
public class C34996e extends BasePresenter<C35006i.AbstractC35007a, C35006i.AbstractC35008b, C35006i.AbstractC35008b.AbstractC35009a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C35006i.AbstractC35008b.AbstractC35009a createViewDelegate() {
        return new C35006i.AbstractC35008b.AbstractC35009a() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.C34996e.C349971 */

            @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b.AbstractC35009a
            /* renamed from: d */
            public Chat mo128985d() {
                return ((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128969a();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b.AbstractC35009a
            /* renamed from: e */
            public int mo128986e() {
                return ((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128975d();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b.AbstractC35009a
            /* renamed from: f */
            public int mo128987f() {
                return ((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128976e();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b.AbstractC35009a
            /* renamed from: a */
            public String mo128982a() {
                return GroupHitPoint.f90519a.mo129217b(((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128969a());
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b.AbstractC35009a
            /* renamed from: b */
            public boolean mo128983b() {
                return ((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128969a().isEdu();
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b.AbstractC35009a
            /* renamed from: c */
            public void mo128984c() {
                ((C35006i.AbstractC35008b) C34996e.this.getView()).mo128949b(((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128969a().getId());
            }
        };
    }

    /* renamed from: b */
    public void mo128981b() {
        ((C35006i.AbstractC35007a) getModel()).mo128974c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C35006i.AbstractC35008b) getView()).mo128944a(((C35006i.AbstractC35007a) getModel()).mo128969a());
        ((C35006i.AbstractC35007a) getModel()).mo128972b(new UIGetDataCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.C34996e.C349982 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                ((C35006i.AbstractC35008b) C34996e.this.getView()).mo128947a(str);
            }
        }));
    }

    /* renamed from: a */
    public void mo128979a(int i) {
        if (((C35006i.AbstractC35007a) getModel()).mo128971a(i)) {
            mo128980a(true);
        }
    }

    /* renamed from: a */
    public void mo128980a(boolean z) {
        Log.m165379d("GroupShareLinkPresenter", "retrieveToken");
        if (z || !((C35006i.AbstractC35007a) getModel()).mo128973b()) {
            ((C35006i.AbstractC35008b) getView()).mo128948a(true, false);
            ((C35006i.AbstractC35007a) getModel()).mo128970a(new IGetDataCallback<ChatLinkTokenResponse>() {
                /* class com.ss.android.lark.chatsetting.impl.group.share.C34996e.C349993 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m136281a() {
                    ((C35006i.AbstractC35008b) C34996e.this.getView()).mo128948a(false, true);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.chatsetting.impl.group.share.$$Lambda$e$3$zCMW10d93EEr8Sc0utJWB1y2yQ */

                        public final void run() {
                            C34996e.C349993.this.m136281a();
                        }
                    });
                }

                /* renamed from: a */
                public void onSuccess(ChatLinkTokenResponse chatLinkTokenResponse) {
                    UICallbackExecutor.execute(new Runnable(chatLinkTokenResponse) {
                        /* class com.ss.android.lark.chatsetting.impl.group.share.$$Lambda$e$3$oRcleW92_rSdp50COjstlEWKIQ */
                        public final /* synthetic */ ChatLinkTokenResponse f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C34996e.C349993.this.m136282b(this.f$1);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m136282b(ChatLinkTokenResponse chatLinkTokenResponse) {
                    ((C35006i.AbstractC35008b) C34996e.this.getView()).mo128948a(false, false);
                    ((C35006i.AbstractC35008b) C34996e.this.getView()).mo128945a(chatLinkTokenResponse, ((C35006i.AbstractC35007a) C34996e.this.getModel()).mo128975d());
                }
            });
        }
    }

    public C34996e(C35006i.AbstractC35007a aVar, C35006i.AbstractC35008b bVar) {
        super(aVar, bVar);
    }
}
