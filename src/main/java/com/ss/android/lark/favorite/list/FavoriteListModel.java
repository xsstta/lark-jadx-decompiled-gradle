package com.ss.android.lark.favorite.list;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.preview.IPreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewCache;
import com.ss.android.lark.chat.api.service.impl.PreviewPush;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.PreviewUpdater;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.p1812a.C36864a;
import com.ss.android.lark.favorite.detail.C37189a;
import com.ss.android.lark.favorite.list.C37225d;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FavoriteListModel extends BaseModel implements C37225d.AbstractC37226a {

    /* renamed from: a */
    AbstractC36474h f95571a = C29990c.m110930b();

    /* renamed from: b */
    public C37225d.AbstractC37226a.AbstractC37227a f95572b;

    /* renamed from: c */
    public List<FavoriteMessageInfo> f95573c = new ArrayList();

    /* renamed from: d */
    public long f95574d = 0;

    /* renamed from: e */
    public boolean f95575e = true;

    /* renamed from: f */
    private final IPreviewCache.PreviewCacheObserver f95576f = new IPreviewCache.PreviewCacheObserver() {
        /* class com.ss.android.lark.favorite.list.$$Lambda$FavoriteListModel$GbjsYFEKPabrKAwtMbHsRmz3HD8 */

        @Override // com.ss.android.lark.biz.im.api.preview.IPreviewCache.PreviewCacheObserver
        public final void onCacheChanged(Map map) {
            FavoriteListModel.lambda$GbjsYFEKPabrKAwtMbHsRmz3HD8(FavoriteListModel.this, map);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.favorite.list.FavoriteListModel$a */
    public interface AbstractC37207a<T> {
        /* renamed from: a */
        void mo136883a();

        /* renamed from: a */
        void mo136884a(String str);

        /* renamed from: a */
        void mo136885a(List<T> list);
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a
    /* renamed from: a */
    public boolean mo136876a() {
        return this.f95575e;
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a
    /* renamed from: b */
    public void mo136877b() {
        this.f95574d = 0;
        this.f95573c.clear();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (DesktopUtil.m144301a(this.f95571a.mo134528a())) {
            EventBus.getDefault().register(this);
        }
        PreviewCache.f84447c.mo121325a().mo121322a(this.f95576f);
        PreviewPush.f84455b.mo121331a().mo121328a(this.f95576f);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        if (DesktopUtil.m144301a(this.f95571a.mo134528a())) {
            EventBus.getDefault().unregister(this);
        }
        C36894a.m145605a().mo136207d();
        PreviewCache.f84447c.mo121325a().mo121324b(this.f95576f);
        PreviewPush.f84455b.mo121331a().mo121330b(this.f95576f);
    }

    /* renamed from: a */
    public void mo136875a(C37225d.AbstractC37226a.AbstractC37227a aVar) {
        this.f95572b = aVar;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFavoriteDelete(C37189a aVar) {
        this.f95572b.mo136906a(mo136872a(aVar.f95559a));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m146531a(Map<String, ? extends ArrayList<String>> map) {
        final Map<String, Map<String, UrlPreviewEntity>> a = PreviewCache.f84447c.mo121325a().mo121320a(map);
        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable() {
            /* class com.ss.android.lark.favorite.list.FavoriteListModel.RunnableC372031 */

            public void run() {
                for (FavoriteMessageInfo favoriteMessageInfo : FavoriteListModel.this.f95573c) {
                    Message sourceMessage = favoriteMessageInfo.getSourceMessage();
                    String id = sourceMessage.getId();
                    if (sourceMessage.getType() == Message.Type.MERGE_FORWARD) {
                        for (Message message : ((MergeForwardContent) sourceMessage.getContent()).getMessages()) {
                            if (a.containsKey(message.getId())) {
                                PreviewUpdater.m129594a(message, (Map) a.get(message.getId()));
                            }
                        }
                    } else if (a.containsKey(id)) {
                        PreviewUpdater.m129594a(favoriteMessageInfo.getSourceMessage(), (Map) a.get(id));
                    }
                }
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.favorite.list.FavoriteListModel.RunnableC372031.RunnableC372041 */

                    public void run() {
                        FavoriteListModel.this.f95572b.mo136907b(FavoriteListModel.this.f95573c);
                    }
                });
            }
        }, 400);
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a
    /* renamed from: a */
    public List<FavoriteMessageInfo> mo136872a(String str) {
        Iterator<FavoriteMessageInfo> it = this.f95573c.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(str)) {
                it.remove();
            }
        }
        return this.f95573c;
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a
    /* renamed from: a */
    public void mo136874a(final AbstractC37207a<FavoriteMessageInfo> aVar) {
        C29990c.m110930b().mo134522U().mo134618a(this.f95574d, 20, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<C36864a>() {
            /* class com.ss.android.lark.favorite.list.FavoriteListModel.C372063 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC37207a aVar = aVar;
                if (aVar != null) {
                    aVar.mo136884a(errorResult.getDisplayMsg());
                }
            }

            /* renamed from: a */
            public void onSuccess(C36864a aVar) {
                List<FavoriteMessageInfo> a = aVar.mo136020a();
                FavoriteListModel.this.f95575e = aVar.mo136021b();
                if (!CollectionUtils.isEmpty(a) || FavoriteListModel.this.f95574d != 0 || FavoriteListModel.this.f95575e) {
                    if (FavoriteListModel.this.f95575e) {
                        FavoriteListModel.this.f95574d = aVar.mo136022c();
                    }
                    FavoriteListModel.this.f95573c.addAll(a);
                    AbstractC37207a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo136885a(FavoriteListModel.this.f95573c);
                        return;
                    }
                    return;
                }
                AbstractC37207a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.mo136883a();
                }
            }
        }));
    }

    @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a
    /* renamed from: a */
    public void mo136873a(final FavoriteMessageInfo favoriteMessageInfo, final IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        C29990c.m110930b().mo134522U().mo134619a(Collections.singletonList(favoriteMessageInfo.getId()), new IGetDataCallback<List<FavoriteMessageInfo>>() {
            /* class com.ss.android.lark.favorite.list.FavoriteListModel.C372052 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<FavoriteMessageInfo> list) {
                FavoriteListModel favoriteListModel = FavoriteListModel.this;
                favoriteListModel.f95573c = favoriteListModel.mo136872a(favoriteMessageInfo.getId());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(FavoriteListModel.this.f95573c);
                }
            }
        });
    }
}
