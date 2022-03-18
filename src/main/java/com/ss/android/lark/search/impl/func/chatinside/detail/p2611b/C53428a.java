package com.ss.android.lark.search.impl.func.chatinside.detail.p2611b;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.C53428a;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.chatinside.p2608b.C53411a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.b.a */
public class C53428a extends AbstractC53443a implements AbstractC53434e {

    /* renamed from: i */
    protected NetSearchRequest.Filter.C53951a f132037i;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: n */
    public String mo182463n() {
        return "link";
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: q */
    public void mo182464q() {
        m206883a(C26279i.m95159b(), "0");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: a */
    public void mo182459a() {
        this.f132037i = NetSearchRequest.Filter.newBuilder().mo184520a(mo182524j());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: c */
    public SearchContext mo182462c(String str) {
        SearchContext c = super.mo182462c(str);
        c.mo184400b(Scene.Type.SEARCH_LINK);
        NetSearchRequest.Filter a = this.f132037i.mo184522a();
        c.mo184401b(a.lastMessageId);
        c.mo184389a(a.lastCreateTime);
        return c;
    }

    public C53428a(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    private void m206883a(long j, String str) {
        this.f132037i.mo184526c(j).mo184519a(str);
    }

    /* renamed from: a */
    public void mo182475a(SearchResponse searchResponse, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback) {
        mo182506a(searchResponse);
        iGetDataCallback.onSuccess(C53411a.m206839a(searchResponse));
        if (!searchResponse.isEmpty()) {
            List<SearchBaseInfo> infoList = searchResponse.getInfoList();
            SearchBaseInfo searchBaseInfo = infoList.get(infoList.size() - 1);
            if (searchBaseInfo instanceof SearchLinkInfo) {
                SearchLinkInfo searchLinkInfo = (SearchLinkInfo) searchBaseInfo;
                m206883a(searchLinkInfo.getCreateTime(), searchLinkInfo.getId());
            }
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: b */
    public void mo182461b(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        m206884a(aVar.f131929a, aVar.f131932d, aVar.f131930b, aVar.f131931c, iGetDataCallback, z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: a */
    public void mo182460a(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        m206884a(aVar.f131929a, aVar.f131932d, aVar.f131930b, aVar.f131931c, iGetDataCallback, z);
    }

    /* renamed from: a */
    private void m206884a(String str, String str2, int i, int i2, final IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        C534291 r3 = new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.C53428a.C534291 */

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                UICallbackExecutor.post(new Runnable(searchResponse, iGetDataCallback) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.$$Lambda$a$1$NySDe4WiJpSLGMuqi5tClHqWdUA */
                    public final /* synthetic */ SearchResponse f$1;
                    public final /* synthetic */ IGetDataCallback f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C53428a.C534291.lambda$NySDe4WiJpSLGMuqi5tClHqWdUA(C53428a.C534291.this, this.f$1, this.f$2);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.post(new Runnable(errorResult) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2611b.$$Lambda$a$1$C0Pi8_VcsSA9glxvfA7rM8Dhmo */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C53428a.C534291.m270945lambda$C0Pi8_VcsSA9glxvfA7rM8Dhmo(IGetDataCallback.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m206893a(SearchResponse searchResponse, IGetDataCallback iGetDataCallback) {
                C53428a.this.mo182475a(searchResponse, iGetDataCallback);
            }
        };
        if (z) {
            this.f132062g.mo181874b(str2, mo182462c(str), r3);
        } else {
            this.f132062g.mo181873a(str2, mo182462c(str), r3);
        }
    }
}
