package com.ss.android.lark.forward.impl.view.p1905a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.impl.model.C38437b;
import com.ss.android.lark.forward.impl.model.ForwardErrorResult;
import com.ss.android.lark.forward.impl.p1899a.AbstractC38410a;
import com.ss.android.lark.forward.impl.p1899a.C38413b;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.forward.impl.statistics.ForwardHitPoint;
import com.ss.android.lark.forward.impl.statistics.favourite.ForwardHitPointNew;
import com.ss.android.lark.forward.impl.view.p1905a.C38451b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.view.a.b */
public class C38451b extends AbstractC38450a {

    /* renamed from: c */
    C38413b.AbstractC38416b f98861c;

    /* renamed from: d */
    AbstractC38410a.AbstractC38412b f98862d;

    /* renamed from: e */
    public final ForwardTemplate f98863e;

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a.AbstractC38415a
    /* renamed from: a */
    public void mo140956a(final List<SearchBaseInfo> list, final String str) {
        AppreciablePerformance.f98815c.mo140993a("sdk_cost");
        this.f98862d.mo140936a(list, this.f98863e.mo140590d().mo140826d(), this.f98862d.mo140937b().wrapAndAddGetDataCallback(new IGetDataCallback<List<ForwardTarget>>() {
            /* class com.ss.android.lark.forward.impl.view.p1905a.C38451b.C384521 */

            /* renamed from: a */
            public void onSuccess(List<ForwardTarget> list) {
                C38451b bVar = C38451b.this;
                bVar.mo141037a(bVar.f98863e.mo140594g(), list, list, str);
                C38451b bVar2 = C38451b.this;
                bVar2.mo141038a(list, list, bVar2.f98863e.mo140594g().mo140782a());
                AppreciablePerformance.f98815c.mo140995b("sdk_cost");
                C38451b.this.f98861c.mo140960f(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Message message;
                boolean z;
                int i;
                int i2;
                String str;
                int errorCode = errorResult.getErrorCode();
                if (errorCode == 4052) {
                    C38364a.m151054a().mo140442d().mo140500f(errorResult.getDisplayMsg());
                } else if (260000 > errorCode || errorCode > 260007) {
                    C38451b.this.f98861c.mo140944a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChatViewForwardingFailed)), false);
                } else {
                    Log.m165379d("TemplateForwardViewDelegate", "no toast due to be block");
                }
                Bundle h = C38451b.this.f98863e.mo140595h();
                Chat chat = null;
                if (h != null) {
                    message = (Message) h.getSerializable("key_message");
                } else {
                    message = null;
                }
                if (message != null) {
                    chat = C38364a.m151054a().mo140442d().mo140469a(message.getChatId());
                }
                AppreciablePerformance.Companion aVar = AppreciablePerformance.f98815c;
                int errorCode2 = errorResult.getErrorCode();
                String debugMsg = errorResult.getDebugMsg();
                if (message == null || !message.isSecret()) {
                    z = false;
                } else {
                    z = true;
                }
                if (message != null) {
                    i = message.getType().getNumber();
                } else {
                    i = 0;
                }
                if (chat != null) {
                    i2 = chat.getType().getNumber();
                } else {
                    i2 = 0;
                }
                int size = list.size();
                if (message == null) {
                    str = "";
                } else {
                    str = message.getId();
                }
                aVar.mo140992a(errorCode2, debugMsg, z, i, i2, 1, size, str);
            }
        }));
    }

    /* renamed from: a */
    public void mo141038a(List<SearchBaseInfo> list, List<ForwardTarget> list2, String str) {
        if (!(CollectionUtils.isEmpty(list) || CollectionUtils.isEmpty(list2) || list.size() != list2.size())) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ForwardTarget forwardTarget = list2.get(i);
                if (forwardTarget.mo140565a() == 0) {
                    ForwardHitPoint.f98819a.mo140999a(forwardTarget.mo140567b(), str);
                }
            }
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a.AbstractC38415a
    /* renamed from: a */
    public void mo140955a(final List<ForwardTarget> list) {
        this.f98862d.mo140935a(list, new IGetDataCallback<C38437b>() {
            /* class com.ss.android.lark.forward.impl.view.p1905a.C38451b.C384532 */

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m151680b(C38437b bVar) {
                C38451b.this.f98861c.mo140942a(bVar);
            }

            /* renamed from: a */
            public void onSuccess(C38437b bVar) {
                UICallbackExecutor.execute(new Runnable(bVar) {
                    /* class com.ss.android.lark.forward.impl.view.p1905a.$$Lambda$b$2$JkIctymkLwEoSBUDS0WfCjegpI4 */
                    public final /* synthetic */ C38437b f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C38451b.C384532.lambda$JkIctymkLwEoSBUDS0WfCjegpI4(C38451b.C384532.this, this.f$1);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Chat chat;
                boolean z;
                int i;
                int i2;
                String str;
                String string = UIHelper.getString(R.string.Lark_Legacy_ChatViewForwardingFailed);
                Message message = (Message) C38451b.this.f98863e.mo140595h().getSerializable("key_message");
                if (message != null) {
                    chat = C38364a.m151054a().mo140442d().mo140469a(message.getChatId());
                } else {
                    chat = null;
                }
                AppreciablePerformance.Companion aVar = AppreciablePerformance.f98815c;
                int errorCode = errorResult.getErrorCode();
                String debugMsg = errorResult.getDebugMsg();
                if (message == null || !message.isSecret()) {
                    z = false;
                } else {
                    z = true;
                }
                if (message != null) {
                    i = message.getType().getNumber();
                } else {
                    i = 0;
                }
                if (chat != null) {
                    i2 = chat.getType().getNumber();
                } else {
                    i2 = 0;
                }
                int size = list.size();
                if (message != null) {
                    str = message.getId();
                } else {
                    str = "";
                }
                aVar.mo140992a(errorCode, debugMsg, z, i, i2, 1, size, str);
                if (!(errorResult instanceof ForwardErrorResult)) {
                    C38451b.this.f98861c.mo140944a(errorResult.getDisplayMsg(string), false);
                    return;
                }
                ForwardErrorResult forwardErrorResult = (ForwardErrorResult) errorResult;
                if (!TextUtils.isEmpty(forwardErrorResult.getMessage())) {
                    string = forwardErrorResult.getMessage();
                }
                if (forwardErrorResult.isIsDialog()) {
                    UICallbackExecutor.execute(new Runnable(forwardErrorResult, string) {
                        /* class com.ss.android.lark.forward.impl.view.p1905a.$$Lambda$b$2$Y1VodC4FSCifE3nGDlQtEPyxmQ */
                        public final /* synthetic */ ForwardErrorResult f$1;
                        public final /* synthetic */ String f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C38451b.C384532.m270548lambda$Y1VodC4FSCifE3nGDlQtEPyxmQ(C38451b.C384532.this, this.f$1, this.f$2);
                        }
                    });
                } else {
                    C38451b.this.f98861c.mo140944a(string, forwardErrorResult.isWillClose());
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m151679a(ForwardErrorResult forwardErrorResult, String str) {
                C38451b.this.f98861c.mo140943a(forwardErrorResult.getTitle(), str, forwardErrorResult.isWillClose());
            }
        });
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a.AbstractC38415a
    /* renamed from: b */
    public boolean mo140957b(int i) {
        if (i <= this.f98862d.mo140933a().size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m151669a(SearchChatterInfo searchChatterInfo) {
        if (searchChatterInfo.getDeniedReason() == DeniedReason.BLOCKED.getValue()) {
            this.f98861c.mo140949c();
            return true;
        } else if (searchChatterInfo.getDeniedReason() != DeniedReason.BE_BLOCKED.getValue()) {
            return false;
        } else {
            this.f98861c.mo140951d();
            return true;
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a.AbstractC38415a
    /* renamed from: a */
    public void mo140952a(int i) {
        List<SearchBaseInfo> a = this.f98862d.mo140933a();
        if (i != 1 || CollectionUtils.isEmpty(a)) {
            this.f98861c.mo140941a();
            this.f98861c.mo140945a(a);
            return;
        }
        this.f98861c.mo140950c(a);
        ForwardHitPointNew.f98834a.mo141017a("confirm", "none");
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a.AbstractC38415a
    /* renamed from: a */
    public void mo140953a(SearchBaseInfo searchBaseInfo) {
        if (!(searchBaseInfo instanceof SearchChatterInfo) || !m151669a((SearchChatterInfo) searchBaseInfo)) {
            this.f98861c.mo140950c(Collections.singletonList(searchBaseInfo));
            ForwardHitPointNew.f98834a.mo141017a("confirm", "none");
            m151668a(true, searchBaseInfo);
        }
    }

    /* renamed from: a */
    private void m151668a(boolean z, SearchBaseInfo searchBaseInfo) {
        String str;
        if (searchBaseInfo.getHeaderId() == 1) {
            str = "recent";
        } else {
            str = "search";
        }
        String a = this.f98863e.mo140594g().mo140782a();
        if (z) {
            ForwardHitPoint.f98819a.mo140998a(str, 0, a);
        } else {
            ForwardHitPoint.f98819a.mo141000b(str, 0, a);
        }
    }

    @Override // com.ss.android.lark.forward.impl.p1899a.C38413b.AbstractC38414a.AbstractC38415a
    /* renamed from: a */
    public void mo140954a(SearchBaseInfo searchBaseInfo, boolean z) {
        if (!(searchBaseInfo instanceof SearchChatterInfo) || !m151669a((SearchChatterInfo) searchBaseInfo)) {
            this.f98862d.mo140934a(searchBaseInfo, z);
            this.f98861c.mo140948b(this.f98862d.mo140933a());
            this.f98861c.mo140959e(this.f98862d.mo140940d());
            m151668a(false, searchBaseInfo);
        }
    }

    public C38451b(C38413b.AbstractC38416b bVar, AbstractC38410a.AbstractC38412b bVar2, ForwardTemplate forwardTemplate) {
        super(bVar, bVar2);
        this.f98861c = bVar;
        this.f98862d = bVar2;
        this.f98863e = forwardTemplate;
    }

    /* renamed from: a */
    public void mo141037a(com.ss.android.lark.forward.dto.template.ForwardHitPoint forwardHitPoint, List<SearchBaseInfo> list, List<ForwardTarget> list2, String str) {
        if (!CollectionUtils.isEmpty(list) && !CollectionUtils.isEmpty(list2) && list.size() == list2.size()) {
            new ForwardHitPoint.MessageForwardParam.Builder().mo141006a(forwardHitPoint.mo140791d()).mo141008b(list2).mo141005a(str).mo141003a(forwardHitPoint.mo140789c()).mo141004a(forwardHitPoint.mo140787b()).mo141007a().mo141001a();
        }
    }
}
