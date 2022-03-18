package com.ss.android.lark.search.impl.func.chatinside.detail.p2612c;

import android.text.TextUtils;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import java.util.Date;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.c.c */
public class C53466c extends AbstractC53447b<SearchMessageInfo> implements AbstractC53470e {

    /* renamed from: c */
    public final C53463b f132107c;

    /* renamed from: d */
    private final ISearchModuleDependency.AbstractC53326l f132108d = C53258a.m205939a().mo181763l();

    /* renamed from: e */
    private final C53458a f132109e;

    /* renamed from: f */
    private final ISearchModuleDependency.AbstractC53317e f132110f = C53258a.m205939a().mo181756f();

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b, com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53455b.AbstractC53456a
    /* renamed from: a */
    public void mo182533a() {
        this.f132107c.mo182470d();
    }

    /* renamed from: i */
    public void mo182577i() {
        this.f132109e.mo182563t();
        this.f132107c.mo182572j();
        mo182542d();
        String b = this.f132109e.mo182515b();
        if (TextUtils.isEmpty(b)) {
            this.f132107c.mo182488c();
            UICallbackExecutor.post(new Runnable() {
                /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53466c.RunnableC534671 */

                public void run() {
                    C53466c.this.f132107c.mo182470d();
                }
            });
            return;
        }
        mo182536a(b, false);
    }

    /* renamed from: a */
    public void mo182576a(Date date, Date date2) {
        this.f132109e.mo182557a(date, date2);
        mo182536a(this.f132109e.mo182515b(), false);
    }

    public C53466c(C53458a aVar, C53463b bVar) {
        super(aVar, bVar);
        this.f132109e = aVar;
        this.f132107c = bVar;
    }

    /* renamed from: a */
    public void mo182574a(BaseFragment baseFragment, int i) {
        this.f132108d.mo181773a(baseFragment, this.f132109e.mo182521g(), this.f132109e.mo182561r(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182472b(final SearchMessageInfo searchMessageInfo, int i) {
        this.f132110f.mo181783a(searchMessageInfo.getChatId(), new C25975i(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53466c.C534682 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LarkSearch.Search.ChatInsideSearchMsgViewDelegate", "get Chat error! " + errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat == null) {
                    return;
                }
                if (chat.isThread()) {
                    C53466c.this.f132107c.mo182487b(searchMessageInfo.getThreadId(), searchMessageInfo.getMessageThreadPosition());
                } else {
                    C53466c.this.f132107c.mo182482a(searchMessageInfo.getChatId(), searchMessageInfo.getPosition());
                }
            }
        }));
    }
}
