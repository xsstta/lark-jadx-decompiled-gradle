package com.ss.android.lark.ding.service.impl.controller;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIDelayGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.ding.service.impl.controller.C36731g;
import com.ss.android.lark.ding.service.impl.controller.C36752j;
import com.ss.android.lark.ding.service.impl.controller.DingView;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.g */
public class C36731g extends BasePresenter<C36752j.AbstractC36753a, C36752j.AbstractC36755b, C36752j.AbstractC36755b.AbstractC36756a> {
    /* renamed from: c */
    private C36752j.AbstractC36753a.AbstractC36754a m144919c() {
        return new C36752j.AbstractC36753a.AbstractC36754a() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367321 */

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: a */
            public void mo135409a() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.controller.$$Lambda$g$1$H8a2vA0AHatuqG_50GMZvXnjpe0 */

                    public final void run() {
                        C36731g.C367321.this.m144927d();
                    }
                });
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: b */
            public void mo135413b() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.controller.$$Lambda$g$1$je3McGp9GxnYb_klY0sZbFHyqE */

                    public final void run() {
                        C36731g.C367321.this.m144925c();
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m144925c() {
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135330a();
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m144927d() {
                List<Chatter> d = ((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135398d();
                ArrayList arrayList = new ArrayList();
                for (Chatter chatter : d) {
                    arrayList.add(new Contact(chatter.getId(), chatter.getAvatarKey(), chatter.getLocalizedName()));
                }
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135338a(arrayList, 1);
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: c */
            public void mo135416c(String str) {
                UICallbackExecutor.execute(new Runnable(str) {
                    /* class com.ss.android.lark.ding.service.impl.controller.$$Lambda$g$1$ZJAjn9ey3ZVYMzMu2mty9edSWd4 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C36731g.C367321.this.m144929f(this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: d */
            public void mo135417d(String str) {
                UICallbackExecutor.execute(new Runnable(str) {
                    /* class com.ss.android.lark.ding.service.impl.controller.$$Lambda$g$1$g5vVO_9X1FtkkThGchqYDDlsi4 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C36731g.C367321.this.m144928e(this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m144928e(String str) {
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135335a(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m144929f(String str) {
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                C36618a.m144492a().mo135104i().mo135143d(str);
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: a */
            public void mo135410a(final DingStatus dingStatus) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367321.RunnableC367331 */

                    public void run() {
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                        if (CollectionUtils.isNotEmpty(dingStatus.getInvisibleChatterIds())) {
                            ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135335a(UIHelper.getString(R.string.Lark_Group_UnableViewBuzzMessageChatHistoryOff));
                        }
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135332a(((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135396c(), dingStatus);
                    }
                });
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: b */
            public void mo135414b(final String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367321.RunnableC367364 */

                    public void run() {
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135345c(str);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m144926c(boolean z) {
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135347d(z);
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: a */
            public void mo135411a(final String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367321.RunnableC367353 */

                    public void run() {
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135342b(str);
                    }
                });
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: b */
            public void mo135415b(boolean z) {
                UICallbackExecutor.execute(new Runnable(z) {
                    /* class com.ss.android.lark.ding.service.impl.controller.$$Lambda$g$1$kSR41qjVON8Px7DBv0kwvViTO4 */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C36731g.C367321.this.m144926c((C36731g.C367321) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36753a.AbstractC36754a
            /* renamed from: a */
            public void mo135412a(final boolean z) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367321.RunnableC367342 */

                    public void run() {
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135343b(z);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C36752j.AbstractC36755b.AbstractC36756a createViewDelegate() {
        return new C36743a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m144920d();
    }

    /* renamed from: d */
    private void m144920d() {
        ((C36752j.AbstractC36753a) getModel()).mo135388a(new UIDelayGetDataCallback(new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367372 */

            /* renamed from: a */
            public void onSuccess(Void r1) {
                C36731g.this.mo135408b();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205900d("DingPresenter", errorResult.toString());
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135330a();
            }
        }, LocationRequest.PRIORITY_INDOOR));
    }

    /* renamed from: b */
    public void mo135408b() {
        ((C36752j.AbstractC36755b) getView()).mo135333a(((C36752j.AbstractC36753a) getModel()).mo135396c(), ((C36752j.AbstractC36753a) getModel()).mo135398d(), ((C36752j.AbstractC36753a) getModel()).mo135399e());
        ((C36752j.AbstractC36753a) getModel()).mo135395b(new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367383 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135339a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("DingPresenter", errorResult.toString());
            }
        }));
        if (((C36752j.AbstractC36753a) getModel()).mo135399e()) {
            ((C36752j.AbstractC36753a) getModel()).mo135390a(((C36752j.AbstractC36753a) getModel()).mo135393b(), new UIGetDataCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367394 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C53241h.m205894a("DingPresenter", errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    if (chatter != null) {
                        ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135337a(((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135398d());
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ding.service.impl.controller.g$a */
    public class C36743a implements C36752j.AbstractC36755b.AbstractC36756a {
        private C36743a() {
        }

        @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b.AbstractC36756a
        /* renamed from: a */
        public void mo135428a(int i, boolean z, List<Chatter> list, List<Chatter> list2) {
            C36731g.this.mo135407a(i, z, true, list, list2);
        }

        @Override // com.ss.android.lark.ding.service.impl.controller.C36752j.AbstractC36755b.AbstractC36756a
        /* renamed from: b */
        public void mo135429b(int i, boolean z, List<Chatter> list, List<Chatter> list2) {
            C36731g.this.mo135407a(i, z, false, list, list2);
        }
    }

    /* renamed from: a */
    public void mo135406a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == 1) {
            ((C36752j.AbstractC36755b) getView()).mo135330a();
        }
    }

    /* renamed from: a */
    private void m144918a(final int i, final boolean z, boolean z2) {
        if (!z2) {
            ((C36752j.AbstractC36753a) getModel()).mo135387a(i, z);
        } else {
            ((C36752j.AbstractC36753a) getModel()).mo135390a(((C36752j.AbstractC36753a) getModel()).mo135393b(), new UIGetDataCallback(new IGetDataCallback<Chatter>() {
                /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367405 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C53241h.m205894a("DingPresenter", errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(Chatter chatter) {
                    if (chatter != null) {
                        if (chatter.getAccessInfo().isInacessUrgentByExecutives()) {
                            ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                            ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135342b(UIHelper.mustacheFormat((int) R.string.Lark_Chat_ExecutiveModeBuzz, "chatter_name", ((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135394b(chatter)));
                        } else if (!((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135392a(chatter)) {
                            ((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135387a(i, z);
                        } else {
                            ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135346c(false);
                            ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135336a(((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135394b(chatter), new DialogInterface.OnClickListener() {
                                /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367405.DialogInterface$OnClickListenerC367411 */

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    ((C36752j.AbstractC36753a) C36731g.this.getModel()).mo135387a(i, z);
                                }
                            }, new DialogInterface.OnClickListener() {
                                /* class com.ss.android.lark.ding.service.impl.controller.C36731g.C367405.DialogInterface$OnClickListenerC367422 */

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    ((C36752j.AbstractC36755b) C36731g.this.getView()).mo135330a();
                                }
                            });
                        }
                    }
                }
            }));
        }
    }

    public C36731g(Context context, DingView.AbstractC36705a aVar, Message message, List<String> list, boolean z) {
        C36725f fVar = new C36725f(context, list, message, z);
        DingView dingView = new DingView(context, aVar);
        setModel(fVar);
        setView(dingView);
        dingView.setViewDelegate(createViewDelegate());
        fVar.mo135389a(m144919c());
    }

    /* renamed from: a */
    public void mo135407a(int i, boolean z, boolean z2, List<Chatter> list, List<Chatter> list2) {
        if (list.size() <= 0 || list2.size() <= 0) {
            m144918a(i, z2, z);
        } else {
            ((C36752j.AbstractC36753a) getModel()).mo135386a(i, list, list2, z2);
        }
    }
}
