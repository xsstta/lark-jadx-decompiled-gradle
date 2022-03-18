package com.ss.android.lark.search.impl.func.chatinside.detail;

import android.graphics.Bitmap;
import android.util.Pair;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.search.impl.func.chatinside.cache.ChatInsideFilterCacheBean;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53443a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53447b;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.AbstractC53452d;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;
import com.ss.android.lark.search.impl.func.chatinside.p2607a.C53407b;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53540b;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.d */
public class C53473d extends BasePresenter<AbstractC53452d.AbstractC53453a, AbstractC53452d.AbstractC53455b, AbstractC53452d.AbstractC53455b.AbstractC53456a> {

    /* renamed from: a */
    public BaseChatInsideSearchView f132114a;

    /* renamed from: b */
    private int f132115b;

    /* renamed from: c */
    private AbstractC53443a f132116c;

    /* renamed from: d */
    private AbstractC53452d.AbstractC53455b.AbstractC53456a f132117d;

    /* renamed from: e */
    private boolean f132118e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.d$a */
    public interface AbstractC53475a<T> {
        Pair<List<String>, List<String>> getPickedChatterDataPair(List<T> list);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m207067j();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f132117d = null;
    }

    /* renamed from: i */
    private AbstractC53452d.AbstractC53453a.AbstractC53454a m207066i() {
        return C53427b.m206882a(this.f132115b, this.f132116c, this.f132114a);
    }

    /* renamed from: a */
    public void mo182580a() {
        if (this.f132118e) {
            this.f132118e = false;
            this.f132117d.mo182533a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC53452d.AbstractC53455b.AbstractC53456a createViewDelegate() {
        AbstractC53447b a = C53486e.m207132a(this.f132115b, this.f132116c, this.f132114a);
        this.f132117d = a;
        return a;
    }

    /* renamed from: c */
    public void mo182584c() {
        ((AbstractC53452d.AbstractC53455b) getView()).mo182491g();
    }

    /* renamed from: d */
    public void mo182585d() {
        ((AbstractC53452d.AbstractC53455b) getView()).mo182492h();
    }

    /* renamed from: e */
    public String mo182586e() {
        AbstractC53452d.AbstractC53455b.AbstractC53456a aVar = this.f132117d;
        if (aVar != null) {
            return aVar.mo182545g();
        }
        return "";
    }

    /* renamed from: f */
    public String mo182587f() {
        return ((AbstractC53452d.AbstractC53455b) getView()).mo182493i();
    }

    /* renamed from: g */
    public String mo182588g() {
        AbstractC53452d.AbstractC53455b.AbstractC53456a aVar = this.f132117d;
        if (aVar != null) {
            return aVar.mo182544f();
        }
        return "";
    }

    /* renamed from: h */
    public int mo182589h() {
        AbstractC53452d.AbstractC53455b.AbstractC53456a aVar = this.f132117d;
        if (aVar != null) {
            return aVar.mo182546h();
        }
        return -1;
    }

    /* renamed from: k */
    private void m207068k() {
        AbstractC53452d.AbstractC53455b.AbstractC53456a aVar = this.f132117d;
        if (aVar != null) {
            aVar.mo182536a(((AbstractC53452d.AbstractC53453a) getModel()).mo182515b(), false);
        }
    }

    /* renamed from: l */
    private void m207069l() {
        BaseChatInsideSearchView baseChatInsideSearchView = this.f132114a;
        if (baseChatInsideSearchView instanceof AbstractC53541c) {
            ((AbstractC53541c) baseChatInsideSearchView).mo182570a(!this.f132116c.mo182525k());
        }
    }

    /* renamed from: j */
    private void m207067j() {
        C53407b h = ((AbstractC53452d.AbstractC53453a) getModel()).mo182522h();
        if (h == null) {
            this.f132118e = true;
            return;
        }
        this.f132116c.mo182509a(h.mo182435f(), h.mo182434e());
        this.f132114a.mo182483a(h.mo182435f(), h.mo182434e());
        if (h instanceof ChatInsideFilterCacheBean) {
            m207063a((ChatInsideFilterCacheBean) h);
        }
        this.f132116c.mo182513a(h.mo182436g());
        this.f132116c.mo182516b(h.mo182437h());
    }

    /* renamed from: a */
    public void mo182581a(List<ChatChatter> list) {
        m207064a(list, $$Lambda$IvSTiBmFqA3LWbDNAbm3SckcO4.INSTANCE, 1);
    }

    /* renamed from: b */
    public void mo182583b(List<BasePickViewData> list) {
        m207064a(list, $$Lambda$y8mXUjdhHznkKIR8oRjvhN1Q8H4.INSTANCE, 3);
    }

    /* renamed from: a */
    private void m207063a(ChatInsideFilterCacheBean aVar) {
        List<String> list;
        AbstractC53443a aVar2 = this.f132116c;
        if (aVar2 instanceof AbstractC53540b) {
            ((AbstractC53540b) aVar2).mo182555a(aVar);
        }
        BaseChatInsideSearchView baseChatInsideSearchView = this.f132114a;
        if (baseChatInsideSearchView instanceof AbstractC53541c) {
            ((AbstractC53541c) baseChatInsideSearchView).mo182569a(aVar);
        }
        if (!CollectionUtils.isEmpty(aVar.mo182426b())) {
            aVar.mo182422a();
            List<String> b = aVar.mo182426b();
            boolean isEmpty = aVar.mo182422a().messageCreatorIds.isEmpty();
            NetSearchRequest.Filter a = aVar.mo182422a();
            if (!isEmpty) {
                list = a.messageCreatorIds;
            } else {
                list = a.docCreatorIds;
            }
            m207065a(b, list);
        }
    }

    /* renamed from: a */
    private void m207065a(List<String> list, List<String> list2) {
        ((AbstractC53452d.AbstractC53453a) getModel()).mo182511a(list, list2, UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f), new UIGetDataCallback(new IGetDataCallback<List<Bitmap>>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.C53473d.C534741 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<Bitmap> list) {
                if (C53473d.this.f132114a instanceof AbstractC53541c) {
                    ((AbstractC53541c) C53473d.this.f132114a).mo182571b(list);
                }
            }
        }));
    }

    public C53473d(AbstractC53443a aVar, BaseChatInsideSearchView baseChatInsideSearchView, int i) {
        this.f132115b = i;
        setModel(aVar);
        setView(baseChatInsideSearchView);
        this.f132116c = aVar;
        this.f132114a = baseChatInsideSearchView;
        aVar.mo182504a(m207066i());
        baseChatInsideSearchView.setViewDelegate(createViewDelegate());
    }

    /* renamed from: a */
    private <T> void m207064a(List<T> list, AbstractC53475a<T> aVar, int i) {
        Pair<List<String>, List<String>> pickedChatterDataPair = aVar.getPickedChatterDataPair(list);
        if (CollectionUtils.isEmpty(list)) {
            BaseChatInsideSearchView baseChatInsideSearchView = this.f132114a;
            if (baseChatInsideSearchView instanceof AbstractC53541c) {
                ((AbstractC53541c) baseChatInsideSearchView).mo182568a(i);
            }
        } else {
            m207065a((List) pickedChatterDataPair.first, (List) pickedChatterDataPair.second);
        }
        AbstractC53443a aVar2 = this.f132116c;
        if (aVar2 instanceof AbstractC53540b) {
            ((AbstractC53540b) aVar2).mo182558a((List) pickedChatterDataPair.first);
            ((AbstractC53540b) this.f132116c).mo182560b((List) pickedChatterDataPair.second);
        }
        m207069l();
        m207068k();
    }
}
