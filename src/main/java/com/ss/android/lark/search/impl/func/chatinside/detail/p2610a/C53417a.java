package com.ss.android.lark.search.impl.func.chatinside.detail.p2610a;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.entity.C53385a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53417a;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.chatinside.p2608b.C53411a;
import com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53342a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a.a */
public class C53417a extends AbstractC53443a implements AbstractC53424f {

    /* renamed from: i */
    private AbstractC53342a f132030i;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: a */
    public void mo182459a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: n */
    public String mo182463n() {
        return "file";
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: q */
    public void mo182464q() {
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C53258a.m205939a().mo181747b(this.f132030i);
        this.f132058c = null;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f132030i = new AbstractC53342a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.$$Lambda$a$LzML2IEW0ZBYjTbQm5uVyu3bfwk */

            @Override // com.ss.android.lark.search.impl.p2592b.p2594b.AbstractC53342a
            public final void onPushMessage(MessageInfo messageInfo) {
                C53417a.this.m206862a((C53417a) messageInfo);
            }
        };
        C53258a.m205939a().mo181740a(this.f132030i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a
    /* renamed from: c */
    public SearchContext mo182462c(String str) {
        SearchContext c = super.mo182462c(str);
        if (C53258a.m205939a().mo181745a("messenger.message_folder_receive")) {
            c.mo184400b(Scene.Type.SEARCH_FILE_AND_FOLDER);
        } else {
            c.mo184400b(Scene.Type.SEARCH_FILE);
        }
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m206862a(MessageInfo messageInfo) {
        if (TextUtils.equals(mo182521g(), messageInfo.getMessage().getChatId()) && messageInfo.getMessage().getType() == Message.Type.FILE && (this.f132058c instanceof C53419b)) {
            ((C53419b) this.f132058c).mo182466a((FileContent) messageInfo.getMessage().getContent());
        }
    }

    public C53417a(String str, int i) {
        super(str, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: a */
    public void mo182460a(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        m206863a(aVar.f131929a, aVar.f131932d, aVar.f131930b, aVar.f131931c, iGetDataCallback, z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d.AbstractC53453a
    /* renamed from: b */
    public void mo182461b(C53385a aVar, IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        m206863a(aVar.f131929a, aVar.f131932d, aVar.f131930b, aVar.f131931c, iGetDataCallback, z);
    }

    /* renamed from: a */
    private void m206863a(String str, String str2, int i, int i2, final IGetDataCallback<ChatInsideSearchResponse> iGetDataCallback, boolean z) {
        C534181 r3 = new IGetDataCallback<SearchResponse>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53417a.C534181 */

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                UICallbackExecutor.post(new Runnable(searchResponse, iGetDataCallback) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.$$Lambda$a$1$KoDr1_8gtXGmPcDlXRnz0RjQhow */
                    public final /* synthetic */ SearchResponse f$1;
                    public final /* synthetic */ IGetDataCallback f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C53417a.C534181.this.m206871a((C53417a.C534181) this.f$1, (SearchResponse) this.f$2);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                UICallbackExecutor.post(new Runnable(errorResult) {
                    /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.$$Lambda$a$1$ykiTaFHvz3irjMM8rTmf2qMzp3w */
                    public final /* synthetic */ ErrorResult f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        IGetDataCallback.this.onError((IGetDataCallback) this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m206871a(SearchResponse searchResponse, IGetDataCallback iGetDataCallback) {
                C53417a.this.mo182506a(searchResponse);
                ChatInsideSearchResponse a = C53411a.m206839a(searchResponse);
                for (SearchBaseInfo searchBaseInfo : a.getSearchItems()) {
                    if (searchBaseInfo instanceof SearchMessageInfo) {
                        ((SearchMessageInfo) searchBaseInfo).setBinderByFile(true);
                    } else {
                        Log.m165383e("LarkSearch.Search.ChatInsideSearchFileModel", "wtf!!! Impossible!!!");
                    }
                }
                iGetDataCallback.onSuccess(a);
            }
        };
        if (z) {
            this.f132062g.mo181874b(str2, mo182462c(str), r3);
        } else {
            this.f132062g.mo181873a(str2, mo182462c(str), r3);
        }
    }
}
