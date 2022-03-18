package com.ss.android.lark.threadtab.p2758b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.chat.api.service.AbstractC32906j;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.chat.service.impl.C34146aa;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.p2392o.AbstractC48707q;

/* renamed from: com.ss.android.lark.threadtab.b.a */
public abstract class AbstractC55978a extends BaseModel implements AbstractC48707q, AbstractC55981b {

    /* renamed from: a */
    protected final AbstractC36474h f138331a;

    /* renamed from: b */
    protected final AbstractC36450aa f138332b;

    /* renamed from: c */
    protected final AbstractC32906j f138333c = C34146aa.m132620b();

    /* renamed from: d */
    protected final AbstractC34230k f138334d = C32881i.m126556a();

    /* renamed from: e */
    protected final IInnerMessageService f138335e = C32848e.m126401b();

    /* renamed from: f */
    protected final AbstractC34296k f138336f = C32821b.m126120a();

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public abstract ThreadInfo mo190800a(String str, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo190803a(String str, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar, int i);

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public String mo190801a() {
        return this.f138332b.mo134394a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C29990c.m110930b().mo134524W().mo134468a(this);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C29990c.m110930b().mo134524W().mo134470b(this);
    }

    public AbstractC55978a() {
        AbstractC36474h b = C29990c.m110930b();
        this.f138331a = b;
        this.f138332b = b.mo134515N();
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public void mo190802a(String str, final IGetDataCallback<Void> iGetDataCallback) {
        this.f138334d.mo106487b(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.threadtab.p2758b.AbstractC55978a.C559791 */

            /* renamed from: a */
            public void onSuccess(Void r2) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(r2);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public void mo190806a(String str, boolean z) {
        ThreadStateInfo.ThreadState threadState;
        AbstractC34230k kVar = this.f138334d;
        if (z) {
            threadState = ThreadStateInfo.ThreadState.CLOSED;
        } else {
            threadState = ThreadStateInfo.ThreadState.OPEN;
        }
        kVar.mo121352a(str, threadState, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.threadtab.p2758b.AbstractC55978a.C559802 */

            /* renamed from: a */
            public void onSuccess(Void r1) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        });
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public void mo190804a(String str, String str2, int i) {
        ThreadInfo a = mo190800a(str, i);
        if (a != null) {
            boolean a2 = C35249h.m137636a(a.getReactionInfoList(), str2, this.f138332b.mo134394a());
            this.f138333c.mo121409a(a.mo126021c().getId(), str2, a2, null);
            if (!a2) {
                C35234b.m137579e().mo121401a(str2);
            }
        }
    }

    @Override // com.ss.android.lark.threadtab.p2758b.AbstractC55981b
    /* renamed from: a */
    public void mo190805a(String str, String str2, boolean z) {
        this.f138333c.mo121409a(str, str2, z, null);
    }
}
