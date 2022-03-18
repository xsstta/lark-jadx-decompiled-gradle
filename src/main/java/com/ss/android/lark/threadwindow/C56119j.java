package com.ss.android.lark.threadwindow;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33102ad;
import com.ss.android.lark.chat.core.model.AbstractC33959e;
import com.ss.android.lark.chat.core.model.AbstractC33961f;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.p2704r.C54984a;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threadwindow.AbstractC56050c;
import com.ss.android.lark.threadwindow.C56119j;
import com.ss.android.lark.threadwindow.ThreadWindowView;
import com.ss.android.lark.threadwindow.view.ThreadWindowUIModel;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.threadwindow.j */
public class C56119j extends BasePresenter<AbstractC56050c.AbstractC56051a, AbstractC56050c.AbstractC56053b, AbstractC56050c.AbstractC56053b.AbstractC56054a> {

    /* renamed from: a */
    public boolean f138826a;

    /* renamed from: b */
    public final Context f138827b;

    /* renamed from: c */
    public final C56049b f138828c;

    /* renamed from: d */
    public int f138829d = -1;

    /* renamed from: e */
    public final Map<Integer, Boolean> f138830e = new HashMap();

    /* renamed from: f */
    public final UIModelInterceptorFactory f138831f;

    /* renamed from: g */
    public final IGetDataCallback f138832g = new IGetDataCallback<Object>() {
        /* class com.ss.android.lark.threadwindow.C56119j.C561201 */

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190914b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190914b();
        }
    };

    /* renamed from: h */
    public final AbstractC33961f<ThreadMessageVO> f138833h = new AbstractC33961f<ThreadMessageVO>() {
        /* class com.ss.android.lark.threadwindow.C56119j.C561273 */

        @Override // com.ss.android.lark.chat.core.model.AbstractC33961f
        /* renamed from: a */
        public List<ThreadMessageVO> mo124080a(List<ThreadMessageVO> list) {
            int f = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191144f();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ThreadMessageVO threadMessageVO = list.get(i);
                if (threadMessageVO.mo121718z() == f && !threadMessageVO.mo121695c() && threadMessageVO.mo121710r() != Message.Type.SYSTEM) {
                    threadMessageVO.mo121682a(true);
                }
                arrayList.add(threadMessageVO);
            }
            return arrayList;
        }
    };

    /* renamed from: i */
    private final IGetDataCallback<AbstractC33964i<ThreadInfo>> f138834i = new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
        /* class com.ss.android.lark.threadwindow.C56119j.C561284 */

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190891a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190891a();
            Log.m165382e("load special position failed");
        }
    };

    /* renamed from: j */
    private final IGetDataCallback<AbstractC33964i<ThreadInfo>> f138835j = new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
        /* class com.ss.android.lark.threadwindow.C56119j.C561295 */

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190891a();
            ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191141e(0);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190891a();
            ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191141e(0);
            Log.m165382e("load first screen data failed");
        }
    };

    /* renamed from: d */
    public void mo191436d() {
        this.f138826a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.lark.threadwindow.j$b */
    public static class C56144b implements AbstractC33959e<ThreadInfo, ThreadMessageVO> {

        /* renamed from: a */
        private final String f138869a;

        /* renamed from: b */
        private final int f138870b;

        /* renamed from: c */
        private final boolean f138871c;

        /* renamed from: d */
        private final boolean f138872d;

        /* renamed from: e */
        private final boolean f138873e;

        /* renamed from: f */
        private final boolean f138874f;

        /* renamed from: a */
        public int mo191456a() {
            return this.f138870b;
        }

        /* renamed from: a */
        public ThreadMessageVO mo122490a(ThreadInfo threadInfo, int i) {
            String str;
            String str2 = this.f138869a;
            int i2 = this.f138870b;
            boolean z = this.f138871c;
            boolean z2 = this.f138872d;
            if (this.f138873e) {
                str = "community_channel";
            } else {
                str = "chat";
            }
            return ThreadMessageVO.m126877a(threadInfo, str2, i2, z, z2, str, this.f138874f);
        }

        public C56144b(String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f138869a = str;
            this.f138870b = i;
            this.f138871c = z;
            this.f138872d = z2;
            this.f138873e = z3;
            this.f138874f = z4;
        }
    }

    /* renamed from: h */
    private AbstractC56050c.AbstractC56051a.AbstractC56052a m218740h() {
        return new AbstractC56050c.AbstractC56051a.AbstractC56052a() {
            /* class com.ss.android.lark.threadwindow.C56119j.AnonymousClass10 */

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191167a(ThreadInfo threadInfo) {
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.C56119j.AnonymousClass10.RunnableC561211 */

                    public void run() {
                        if (C56145l.m218886a()) {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190922c();
                        } else {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190942o();
                        }
                    }
                }, 200);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191170a(String str) {
                UICallbackExecutor.execute(new Runnable(str) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$F4vhnfwq1jhn3ESiYhu9h6qDMHc */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218760d((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191171a(boolean z) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$qxKVJpWQhMePo8Q32Bc5S5O2A8 */

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218767l();
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191169a(TranslateState translateState) {
                if (translateState != null && C56119j.this.f138826a) {
                    UICallbackExecutor.execute(new Runnable(translateState) {
                        /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$YM0PUHciOV0UM4_1Ps4TKa0DaGI */
                        public final /* synthetic */ TranslateState f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C56119j.AnonymousClass10.this.m218754b((C56119j.AnonymousClass10) this.f$1);
                        }
                    });
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191168a(TopicGroup topicGroup) {
                UICallbackExecutor.execute(new Runnable(topicGroup) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$l6xDieRTnh3ZdIpMJOgVIevVy1k */
                    public final /* synthetic */ TopicGroup f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218753b((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public /* synthetic */ void m218765j() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190939l();
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public /* synthetic */ void m218766k() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190938k();
            }

            /* access modifiers changed from: private */
            /* renamed from: l */
            public /* synthetic */ void m218767l() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190936i();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public /* synthetic */ void m218768m() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190935h();
            }

            /* access modifiers changed from: private */
            /* renamed from: n */
            public /* synthetic */ void m218769n() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190931e();
            }

            /* access modifiers changed from: private */
            /* renamed from: o */
            public /* synthetic */ void m218770o() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190928d();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191159a() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$QP_8Ydy8tfEYCT4s7tEvpPv4Q */

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218770o();
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: g */
            public void mo191183g() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190941n();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: h */
            public int mo191184h() {
                return ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190949v();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: i */
            public void mo191185i() {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.C56119j.AnonymousClass10.RunnableC561255 */

                    public void run() {
                        C33955c<ThreadMessageVO, ThreadInfo> a = C56119j.this.f138828c.mo191104a(0);
                        if (a != null) {
                            a.mo124066a();
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: c */
            public void mo191177c() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$bHLXWL2lNSznTdKnlRoSu1hod08 */

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218768m();
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: e */
            public void mo191181e() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$5ByQuWEFZ1gjyzVGhpNiXE1yV9o */

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218765j();
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: f */
            public int mo191182f() {
                return ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190940m();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: b */
            public void mo191172b() {
                Log.m165389i("ThreadWindowPresenter", "onMissingDataReturned");
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$EHSqGmJRnWXSfcNVMOn530uAkj8 */

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218769n();
                    }
                }, 500);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: d */
            public void mo191180d() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$4fSidFRjQlnWd5WphmbCwU7YaJ4 */

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218766k();
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m218755c(Chat chat) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190918b(chat);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m218757d(int i) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190920b(UIHelper.getString(i));
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m218761e(int i) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190920b(UIHelper.getString(i));
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m218763f(int i) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190892a(i);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m218753b(TopicGroup topicGroup) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190904a(topicGroup);
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m218756c(String str) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m218758d(ErrorResult errorResult) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190924c(errorResult);
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void m218762e(ErrorResult errorResult) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190917b(errorResult);
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public /* synthetic */ void m218764f(ErrorResult errorResult) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(errorResult.getDisplayMsg());
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191160a(int i) {
                UICallbackExecutor.execute(new Runnable(i) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$z3DhZ1pgqGE0rnGzBKaiNoo_G6c */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218763f((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m218754b(TranslateState translateState) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190905a(translateState);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m218759d(Chat chat) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190899a(chat);
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public /* synthetic */ void m218760d(String str) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190920b(str);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: c */
            public void mo191178c(int i) {
                UICallbackExecutor.execute(new Runnable(i) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$AkjW0Hyf1ETdS41DhbopvqeUA */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218757d((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191163a(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable(errorResult) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$lyLHkYPfivKV4ycejGmjhhwJI */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218764f((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: b */
            public void mo191173b(int i) {
                UICallbackExecutor.execute(new Runnable(i) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$NWYPQTsWEfLAsb7acf96f12TfY0 */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218761e((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: c */
            public void mo191179c(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable(errorResult) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$od3Z_QhLSRmw5MCjEeOJQZ4iBR0 */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218758d((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191164a(AbstractC33964i<ThreadInfo> iVar) {
                Log.m165379d("ThreadWindowPresenter", "onDataStoreInitReady");
                ArrayList arrayList = new ArrayList();
                arrayList.add(C56119j.this.f138831f.mo191458a(0));
                C33955c<ThreadMessageVO, ThreadInfo> a = C56119j.this.f138828c.mo191105a(iVar, new C56144b(((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190801a(), 0, ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191157s(), ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191158t(), ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190947t(), ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190948u()), arrayList);
                a.mo124068a(C56119j.this.f138833h);
                a.mo124067a(new C33955c.AbstractC33957b<ThreadMessageVO>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.AnonymousClass10.C561233 */

                    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
                    public void onChanged(List<ThreadMessageVO> list) {
                        Log.m165379d("ThreadWindowPresenter", "mDataListPipeline:onChanged");
                        UICallbackExecutor.execute(new Runnable(list) {
                            /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$3$8BiLXfCMKfawy5quwu7b7WWaAlM */
                            public final /* synthetic */ List f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C56119j.AnonymousClass10.C561233.this.m218798a(this.f$1);
                            }
                        });
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m218798a(List list) {
                        boolean z = false;
                        if (C56119j.this.f138830e.get(0) != null && C56119j.this.f138830e.get(0).booleanValue()) {
                            AbstractC56050c.AbstractC56053b bVar = (AbstractC56050c.AbstractC56053b) C56119j.this.getView();
                            if (((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191130c() == -1) {
                                z = true;
                            }
                            bVar.mo190913a(z, list);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: b */
            public void mo191174b(ErrorResult errorResult) {
                UICallbackExecutor.execute(new Runnable(errorResult) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$_vHH2V7qZjZvUYRNx7ziocUlJo */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218762e((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191165a(Chat chat) {
                UICallbackExecutor.execute(new Runnable(chat) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$sQIfkeGNmxMWMO40lr27OGgex4Y */
                    public final /* synthetic */ Chat f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218759d((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: b */
            public void mo191175b(Chat chat) {
                UICallbackExecutor.execute(new Runnable(chat) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$AOds9Q5A_GrkeT0P8s3XrAa3hg */
                    public final /* synthetic */ Chat f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218755c((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191166a(final MessageInfo messageInfo) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.C56119j.AnonymousClass10.RunnableC561222 */

                    public void run() {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190902a(messageInfo);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: b */
            public void mo191176b(String str) {
                UICallbackExecutor.execute(new Runnable(str) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$JZTGYgf0QVbyJpG5euN0KyIcy5E */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.this.m218756c((C56119j.AnonymousClass10) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m218752b(Context context, boolean z) {
                C29990c.m110930b().mo134520S().mo134704a(context, z);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191162a(Context context, boolean z) {
                UICallbackExecutor.execute(new Runnable(context, z) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$o9Nq_2tuHI4iikc1_Wy9NDED3M */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.AnonymousClass10.m218752b(this.f$0, this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56051a.AbstractC56052a
            /* renamed from: a */
            public void mo191161a(final int i, AbstractC33964i<ThreadInfo> iVar) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C56119j.this.f138831f.mo191458a(i));
                C56119j.this.f138828c.mo191105a(iVar, new C56144b(((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190801a(), i, ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191157s(), ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191158t(), ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190947t(), ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190948u()), arrayList).mo124067a(new C33955c.AbstractC33957b<ThreadMessageVO>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.AnonymousClass10.C561244 */

                    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
                    public void onChanged(List<ThreadMessageVO> list) {
                        UICallbackExecutor.execute(new Runnable(i, list) {
                            /* class com.ss.android.lark.threadwindow.$$Lambda$j$10$4$4ZppRlmzBpe8eYrsy33uEqfUQ4 */
                            public final /* synthetic */ int f$1;
                            public final /* synthetic */ List f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C56119j.AnonymousClass10.C561244.this.m218799a(this.f$1, this.f$2);
                            }
                        });
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m218799a(int i, List list) {
                        boolean z;
                        if (C56119j.this.f138830e.get(Integer.valueOf(i)) != null && C56119j.this.f138830e.get(Integer.valueOf(i)).booleanValue()) {
                            AbstractC56050c.AbstractC56053b bVar = (AbstractC56050c.AbstractC56053b) C56119j.this.getView();
                            if (((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191130c() == -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bVar.mo190896a(i, z, list);
                        }
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC56050c.AbstractC56053b.AbstractC56054a createViewDelegate() {
        return new AbstractC56050c.AbstractC56053b.AbstractC56054a() {
            /* class com.ss.android.lark.threadwindow.C56119j.C561328 */

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public boolean mo191211a() {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191140d();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191199a(String str, Chat chat, boolean z, boolean z2, int i) {
                C56119j.this.mo191431a(str, chat, z, z2, true, 0, i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191198a(String str, Chat chat, int i) {
                C56119j.this.mo191431a(str, chat, false, false, true, 0, i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191195a(String str, int i, Chat chat, int i2) {
                C56119j.this.mo191431a(str, chat, false, false, false, i, i2);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191194a(String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190802a(str, new UIGetDataCallback(new IGetDataCallback<Void>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561364 */

                    /* renamed from: a */
                    public void onSuccess(Void r1) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (errorResult.getErrorCode() == 4047) {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190927c(errorResult.getDisplayMsg());
                        } else if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(errorResult.getDisplayMsg());
                        }
                    }
                }));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191196a(String str, int i, AbstractC36459ag.AbstractC36460a aVar) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190800a(str, i);
                if (a != null) {
                    MessageInfo messageInfo = new MessageInfo(a.mo126021c(), a.mo126011a());
                    messageInfo.setPin(a.getPin());
                    ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190903a(messageInfo, aVar);
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191200a(String str, String str2, int i) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190813b(str, str2, i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191205a(String str, List<GroupRecallEntity> list) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (GroupRecallEntity groupRecallEntity : list) {
                    arrayList2.add(groupRecallEntity);
                }
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191118a(str, arrayList, arrayList2, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561386 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190915b(R.string.Lark_Group_RevokeSuccess);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190930d(errorResult.getDisplayMsg());
                    }
                }));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191206a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191117a(str, list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191208a(String str, boolean z, int i) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190806a(str, z);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191207a(String str, boolean z) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191128b(str, z);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public boolean mo191212a(int i) {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191129b(i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191210a(List<String> list, int i) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191120a(list, i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191202a(String str, String str2, Message.SourceType sourceType) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191115a(str, str2, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561419 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190932e(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("ThreadWindowPresenter", "preview File in drive fail: " + errorResult.getMessage());
                    }
                }));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191203a(String str, final String str2, String str3, Message.SourceType sourceType) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191116a(str, str2, str3, sourceType, new UIGetDataCallback(new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561342 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191126b(str2, 2);
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
                        Log.m165383e("ThreadWindowPresenter", "Failed to save to Drive");
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        if ("success".equals(str)) {
                            Log.m165389i("ThreadWindowPresenter", "save file success, messageId: " + str2);
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(UIHelper.getString(R.string.Lark_Legacy_SavedFileToDrive));
                            ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191126b(str2, 0);
                            return;
                        }
                        ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191126b(str2, 2);
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
                        Log.m165397w("ThreadWindowPresenter", "Failed to save file to drive! result: " + str + "  messageId: " + str2);
                    }
                }));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191197a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191139d(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191209a(List<String> list) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191119a(list);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191201a(String str, String str2, int i, String str3, int i2) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190800a(str, i);
                if (a != null) {
                    int b = C54984a.m213523b();
                    Message c = a.mo126021c();
                    MessageHitPoint.f135779d.mo187531a(c.getId(), Integer.valueOf(c.getType().getNumber()), c.getChatId(), str2, Integer.valueOf(i2), b, a.mo126028j());
                    if (!C35249h.m137636a(a.getReactionInfoList(), str2, ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190801a()) && a.mo126028j() != null) {
                        ThreadTopicHitPoint.f135906a.mo187719a("reaction", str, "-1", -1, str3, a.mo126028j().getId());
                    }
                    ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190804a(str, str2, i);
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191204a(String str, String str2, boolean z) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190805a(str, str2, z);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: c */
            public boolean mo191219c() {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191143e();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: h */
            public boolean mo191233h() {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191150l();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: i */
            public void mo191234i() {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191151m();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: k */
            public int mo191236k() {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191130c();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: m */
            public void mo191238m() {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191153o();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: b */
            public void mo191213b() {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191110a(new UIGetDataCallback(C56119j.this.f138832g));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: d */
            public void mo191221d() {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191125b(new UIGetDataCallback(C56119j.this.f138832g));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: f */
            public void mo191227f() {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191133c(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561331 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(errorResult.getDisplayMsg());
                        }
                        Log.m165382e(errorResult.toString());
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: g */
            public boolean mo191231g() {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191149k();
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: j */
            public void mo191235j() {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190925c(((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191146h());
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: l */
            public void mo191237l() {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191154p();
                C56119j.this.f138829d = -1;
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: e */
            public void mo191224e() {
                String i = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191147i();
                RichText j = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191148j();
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190900a(((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191146h(), i, j, ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191158t());
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: d */
            public void mo191223d(String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190812b(str);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: f */
            public void mo191229f(String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191124b(C56119j.this.f138827b, str);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: g */
            public void mo191230g(String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191132c(C56119j.this.f138827b, str);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: c */
            public boolean mo191220c(int i) {
                return ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191135c(i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: e */
            public void mo191226e(String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191134c(str, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561408 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165382e(errorResult.toString());
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190932e(str);
                    }
                });
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: b */
            public void mo191214b(int i) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191131c(i, new UIGetDataCallback(new C56143a(i)));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: d */
            public void mo191222d(int i) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191137d(i, new UIGetDataCallback(new C56143a(i)));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: f */
            public void mo191228f(int i) {
                Log.m165389i("ThreadWindowPresenter", "tab " + i + " is selected");
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191136d(i);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: h */
            public void mo191232h(String str) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190809a(str);
                if (a != null) {
                    C29990c.m110930b().mo134520S().mo134700a(C56119j.this.f138827b, a.getMessage(), false);
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191188a(Context context) {
                ArrayList arrayList = new ArrayList();
                Chat h = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191146h();
                if (!TextUtils.isEmpty(h.getAvatarKey())) {
                    arrayList.add(h.getAvatarKey());
                } else {
                    arrayList.add(C57881t.m224629c(context, h.getId() + ".jpg"));
                }
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190912a(((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191152n(), h, arrayList);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: b */
            public void mo191215b(String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191127b(str, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561375 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190915b(R.string.Lark_Group_RevokeExpireToast);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190930d(errorResult.getDisplayMsg());
                    }
                }));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: c */
            public void mo191217c(String str) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190809a(str);
                if (a != null && a.mo126021c().getType() == Message.Type.MERGE_FORWARD) {
                    Message c = a.mo126021c();
                    if (!a.isShowMessageOriginContent()) {
                        Content translateContent = a.getTranslateContent(a.isShowMessageOriginContent());
                        Message clone = c.clone();
                        if (clone != null) {
                            clone.setMessageContent(translateContent);
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190919b(clone);
                            return;
                        }
                    }
                    ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190919b(c);
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: e */
            public void mo191225e(int i) {
                Log.m165389i("ThreadWindowPresenter", "tab " + i + " is created");
                C56119j.this.mo191429a(i);
                C56119j.this.mo191428a();
                C56119j.this.f138830e.put(Integer.valueOf(i), true);
                C56119j jVar = C56119j.this;
                jVar.f138829d = ((AbstractC56050c.AbstractC56053b) jVar.getView()).mo190940m();
                Log.m165389i("ThreadWindowPresenter", "tab " + i + " is loaded");
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public Message mo191186a(String str, int i) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190800a(str, i);
                if (a != null) {
                    return a.mo126021c();
                }
                return null;
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191187a(final int i, final boolean z) {
                if (((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191121a(i)) {
                    ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190895a(i, false);
                    return;
                }
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190933f();
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191106a(i, new UIGetDataCallback(new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561353 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m218862a() {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190911a(false);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190934g();
                    }

                    /* renamed from: a */
                    public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190934g();
                        if (z) {
                            UICallbackExecutor.executeDelayed(new Runnable() {
                                /* class com.ss.android.lark.threadwindow.$$Lambda$j$8$3$gsN_3V1LvcnSXkINC7ZePiN87BU */

                                public final void run() {
                                    C56119j.C561328.C561353.this.m218862a();
                                }
                            }, 200);
                        } else {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190895a(i, true);
                        }
                    }
                }));
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: c */
            public void mo191218c(String str, int i) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190800a(str, i);
                if (a != null && a.mo126021c().getType() == Message.Type.FOLDER) {
                    ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190926c(a.mo126021c());
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: b */
            public void mo191216b(String str, int i) {
                ThreadInfo a = ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190800a(str, i);
                if (a != null && a.mo126021c().getType() == Message.Type.FILE) {
                    ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190901a(a.mo126021c());
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191192a(AbsMessageVO aVar, int i) {
                ThreadWindowUIModel dVar = C56119j.this.f138831f.mo191459a().get(Integer.valueOf(i));
                if (dVar != null) {
                    dVar.mo191492a(aVar.mo121681a(), false);
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191193a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191112a(sticker, iGetDataCallback);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191189a(Context context, View view, String str) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191108a(context, str);
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191190a(Context context, boolean z, boolean z2) {
                C561397 r0 = new AbstractC44896a() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561328.C561397 */

                    @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                    /* renamed from: b */
                    public void mo128966b() {
                    }

                    @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                    /* renamed from: a */
                    public void mo128963a() {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190945r();
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(UIHelper.getString(R.string.Lark_Legacy_RequestSentApprovalPendingToast));
                    }

                    @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                    /* renamed from: a */
                    public void mo128965a(String str) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190944q();
                    }

                    @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                    /* renamed from: a */
                    public void mo128964a(ErrorResult errorResult) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190898a(errorResult);
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190946s();
                    }

                    @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                    /* renamed from: b */
                    public void mo128967b(ErrorResult errorResult) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190946s();
                        if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190908a(errorResult.getDisplayMsg());
                        }
                        Log.m165382e(errorResult.toString());
                    }
                };
                if (z2) {
                    ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191109a(context, z, r0);
                } else {
                    ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191107a(context, r0);
                }
            }

            @Override // com.ss.android.lark.threadwindow.AbstractC56050c.AbstractC56053b.AbstractC56054a
            /* renamed from: a */
            public void mo191191a(View view, String str, boolean z, int i) {
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo190811a(str, z, i);
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m218738f();
    }

    /* renamed from: f */
    private void m218738f() {
        ((AbstractC56050c.AbstractC56051a) getModel()).mo191138d(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.threadwindow.C56119j.C561306 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (C56119j.this.getView() != null) {
                    ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190907a(bool);
                }
            }
        });
    }

    /* renamed from: e */
    public void mo191437e() {
        ((AbstractC56050c.AbstractC56053b) getView()).mo190943p();
    }

    /* renamed from: a */
    public void mo191428a() {
        ((AbstractC56050c.AbstractC56051a) getModel()).mo191142e(new UIGetDataCallback(new IGetDataCallback<List<MessageInfo>>() {
            /* class com.ss.android.lark.threadwindow.C56119j.C561317 */

            /* renamed from: a */
            public void onSuccess(List<MessageInfo> list) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190910a(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190910a(new ArrayList());
            }
        }));
    }

    /* renamed from: c */
    public void mo191435c() {
        this.f138826a = true;
        ((AbstractC56050c.AbstractC56053b) getView()).mo190937j();
    }

    /* renamed from: i */
    private void m218741i() {
        if (((AbstractC56050c.AbstractC56051a) getModel()).mo191145g()) {
            final int lastThreadPosition = ((AbstractC56050c.AbstractC56051a) getModel()).mo191146h().getLastThreadPosition();
            if (((AbstractC56050c.AbstractC56051a) getModel()).mo191121a(lastThreadPosition)) {
                ((AbstractC56050c.AbstractC56053b) getView()).mo190895a(lastThreadPosition, false);
            } else {
                ((AbstractC56050c.AbstractC56051a) getModel()).mo191106a(lastThreadPosition, new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
                    /* class com.ss.android.lark.threadwindow.C56119j.C561262 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165382e("load special position failed");
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m218800a(int i) {
                        ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190895a(i, true);
                    }

                    /* renamed from: a */
                    public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                        UICallbackExecutor.execute(new Runnable(lastThreadPosition) {
                            /* class com.ss.android.lark.threadwindow.$$Lambda$j$2$Kn1x2JBBIfRfC6Zr2RFD9ih7pw */
                            public final /* synthetic */ int f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C56119j.C561262.this.m218800a((C56119j.C561262) this.f$1);
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: g */
    private void m218739g() {
        int c = ((AbstractC56050c.AbstractC56051a) getModel()).mo191130c();
        if (c > -1) {
            ((AbstractC56050c.AbstractC56051a) getModel()).mo191106a(c, new UIGetDataCallback(this.f138834i));
        } else {
            ((AbstractC56050c.AbstractC56051a) getModel()).mo191111a(new UIGetDataCallback(this.f138835j), ((AbstractC56050c.AbstractC56053b) getView()).mo190949v());
        }
        ((AbstractC56050c.AbstractC56051a) getModel()).mo191156r();
        ((AbstractC56050c.AbstractC56051a) getModel()).mo191122b();
    }

    /* renamed from: com.ss.android.lark.threadwindow.j$a */
    private class C56143a implements IGetDataCallback<AbstractC33964i<ThreadInfo>> {

        /* renamed from: b */
        private final int f138868b;

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190893a(this.f138868b, 0);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190893a(this.f138868b, 0);
        }

        public C56143a(int i) {
            this.f138868b = i;
        }
    }

    /* renamed from: c */
    private void m218737c(final int i) {
        ((AbstractC56050c.AbstractC56051a) getModel()).mo191123b(i, new IGetDataCallback<AbstractC33964i<ThreadInfo>>() {
            /* class com.ss.android.lark.threadwindow.C56119j.C561429 */

            /* renamed from: a */
            public void onSuccess(AbstractC33964i<ThreadInfo> iVar) {
                UICallbackExecutor.execute(new Runnable(i) {
                    /* class com.ss.android.lark.threadwindow.$$Lambda$j$9$MfO9Pwd46p_mr3ZVZzMZZhriquE */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C56119j.C561429.this.m218874a((C56119j.C561429) this.f$1);
                    }
                });
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191141e(i);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190891a();
                ((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191141e(i);
                Log.m165382e("load first screen data failed");
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m218874a(int i) {
                boolean z;
                AbstractC56050c.AbstractC56053b bVar = (AbstractC56050c.AbstractC56053b) C56119j.this.getView();
                if (((AbstractC56050c.AbstractC56051a) C56119j.this.getModel()).mo191130c() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.mo190896a(i, z, C56119j.this.f138828c.mo191104a(i).mo124071b());
                ((AbstractC56050c.AbstractC56053b) C56119j.this.getView()).mo190894a(0, i, true);
            }
        });
    }

    /* renamed from: a */
    public void mo191430a(ThreadTopic threadTopic) {
        ((AbstractC56050c.AbstractC56051a) getModel()).mo190810a(threadTopic);
    }

    /* renamed from: b */
    private void m218735b(int i) {
        if (i != 1001 && ((AbstractC56050c.AbstractC56051a) getModel()).mo191155q()) {
            m218737c(i);
        }
    }

    /* renamed from: a */
    public void mo191429a(int i) {
        Log.m165379d("ThreadWindowPresenter", "loadData" + i);
        if (i == 0) {
            m218739g();
        } else {
            m218735b(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m218736b(String str, RichText richText) {
        ((AbstractC56050c.AbstractC56051a) getModel()).mo191113a(str, richText);
    }

    /* renamed from: a */
    public void mo191432a(String str, RichText richText) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(str, richText) {
            /* class com.ss.android.lark.threadwindow.$$Lambda$j$k4Xvo_8_BDlfyS0CvE23djItck */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ RichText f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C56119j.this.m218736b(this.f$1, this.f$2);
            }
        });
    }

    public C56119j(Activity activity, C56094g gVar, ThreadWindowView.AbstractC56006a aVar) {
        this.f138827b = activity;
        C56101i iVar = new C56101i(gVar, C33102ad.from(aVar.mo191001b()), aVar.mo190994a());
        ThreadWindowView threadWindowView = new ThreadWindowView(activity, aVar, gVar.f138711d, gVar.f138712e, gVar.f138714g, gVar.f138708a);
        this.f138831f = new UIModelInterceptorFactory(iVar);
        this.f138828c = new C56049b();
        setModel(iVar);
        setView(threadWindowView);
        threadWindowView.setViewDelegate(createViewDelegate());
        iVar.mo191388a(m218740h());
    }

    /* renamed from: a */
    public void mo191433a(String str, RichText richText, boolean z) {
        if (!C59035h.m229210a(richText)) {
            m218741i();
            ((AbstractC56050c.AbstractC56051a) getModel()).mo191114a(str, richText, z);
            ThreadTopicHitPoint.Companion aVar = ThreadTopicHitPoint.f135906a;
            boolean t = ((AbstractC56050c.AbstractC56051a) getModel()).mo191158t();
            boolean isPublic = ((AbstractC56050c.AbstractC56051a) getModel()).mo191146h().isPublic();
            aVar.mo187714a(t ? 1 : 0, "chat", isPublic ? 1 : 0, z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo191431a(String str, Chat chat, boolean z, boolean z2, boolean z3, int i, int i2) {
        int i3;
        ThreadInfo a = ((AbstractC56050c.AbstractC56051a) getModel()).mo190800a(str, i2);
        if (a != null) {
            if (!z3 && CollectionUtils.isNotEmpty(a.mo126023e())) {
                List<MessageInfo> e = a.mo126023e();
                if (i < e.size()) {
                    i3 = e.get(i).getMessage().getThreadPosition();
                    ((AbstractC56050c.AbstractC56053b) getView()).mo190909a(str, a.mo126018b(), chat, z, z2, z3, i3);
                    return;
                }
            }
            i3 = 0;
            ((AbstractC56050c.AbstractC56053b) getView()).mo190909a(str, a.mo126018b(), chat, z, z2, z3, i3);
            return;
        }
        Log.m165383e("ThreadWindow", "startThreadDetailActivity threadInfo == null , threadid=" + str + ",topicTabType=" + i2);
    }
}
