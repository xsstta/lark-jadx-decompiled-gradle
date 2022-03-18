package com.ss.android.lark.favorite.detail;

import android.app.Activity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.favorite.detail.C37198e;
import com.ss.android.lark.favorite.detail.FavoriteDetailView;
import com.ss.android.lark.statistics.favourite.FavouriteHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.favorite.detail.d */
public class C37193d extends BasePresenter<C37198e.AbstractC37199a, C37198e.AbstractC37201b, C37198e.AbstractC37201b.AbstractC37202a> {
    /* renamed from: b */
    private C37198e.AbstractC37199a.AbstractC37200a m146505b() {
        return new C37195a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C37198e.AbstractC37201b.AbstractC37202a createViewDelegate() {
        return new C37196b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.favorite.detail.d$b */
    public class C37196b implements C37198e.AbstractC37201b.AbstractC37202a {
        @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b.AbstractC37202a
        /* renamed from: a */
        public void mo136860a() {
            ((C37198e.AbstractC37201b) C37193d.this.getView()).mo136846a(((C37198e.AbstractC37199a) C37193d.this.getModel()).mo136857b());
        }

        @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37201b.AbstractC37202a
        /* renamed from: b */
        public void mo136861b() {
            ((C37198e.AbstractC37199a) C37193d.this.getModel()).mo136855a(new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.favorite.detail.C37193d.C37196b.C371971 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C37198e.AbstractC37201b) C37193d.this.getView()).mo136853b(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxDeleteFail)));
                }

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    ((C37198e.AbstractC37201b) C37193d.this.getView()).mo136853b(UIHelper.getString(R.string.Lark_Legacy_SaveBoxDeleteSuccess));
                    ((C37198e.AbstractC37201b) C37193d.this.getView()).mo136848a(((C37198e.AbstractC37199a) C37193d.this.getModel()).mo136857b().getId());
                }
            }));
            FavouriteHitPoint.f135705a.mo187478a();
        }

        private C37196b() {
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        boolean z;
        super.create();
        C37198e.AbstractC37199a aVar = (C37198e.AbstractC37199a) getModel();
        C37198e.AbstractC37201b bVar = (C37198e.AbstractC37201b) getView();
        if (aVar.mo136857b().getSourceMessage().getType() != Message.Type.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        bVar.mo136850a(z);
        bVar.mo136849a(aVar.mo136854a());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.favorite.detail.d$a */
    public class C37195a implements C37198e.AbstractC37199a.AbstractC37200a {
        private C37195a() {
        }
    }

    public C37193d(FavoriteDetailView.AbstractC37188a aVar, Activity activity, FavoriteMessageInfo favoriteMessageInfo) {
        FavoriteDetailView favoriteDetailView = new FavoriteDetailView(aVar, activity);
        C37191c cVar = new C37191c(favoriteMessageInfo);
        setView(favoriteDetailView);
        setModel(cVar);
        favoriteDetailView.setViewDelegate(createViewDelegate());
        cVar.mo136856a(m146505b());
    }
}
