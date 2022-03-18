package com.ss.android.lark.favorite.list;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.favorite.list.C37225d;
import com.ss.android.lark.favorite.list.FavoriteListModel;
import com.ss.android.lark.favorite.list.FavoriteListView;
import com.ss.android.lark.statistics.favourite.FavouriteHitPoint;
import java.util.List;

/* renamed from: com.ss.android.lark.favorite.list.c */
public class C37219c extends BasePresenter<C37225d.AbstractC37226a, C37225d.AbstractC37228b, C37225d.AbstractC37228b.AbstractC37229a> {

    /* renamed from: a */
    FavoriteListView.AbstractC37216a f95604a;

    /* renamed from: b */
    Context f95605b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.favorite.list.c$b */
    public class C37223b implements C37225d.AbstractC37228b.AbstractC37229a {
        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b.AbstractC37229a
        /* renamed from: b */
        public void mo136910b() {
            C37219c.this.mo136904c();
        }

        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b.AbstractC37229a
        /* renamed from: a */
        public boolean mo136909a() {
            return ((C37225d.AbstractC37226a) C37219c.this.getModel()).mo136876a();
        }

        private C37223b() {
        }

        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b.AbstractC37229a
        /* renamed from: a */
        public void mo136908a(FavoriteMessageInfo favoriteMessageInfo) {
            C37219c.this.f95604a.mo136899b(favoriteMessageInfo);
        }

        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b.AbstractC37229a
        /* renamed from: b */
        public void mo136911b(FavoriteMessageInfo favoriteMessageInfo) {
            ((C37225d.AbstractC37226a) C37219c.this.getModel()).mo136873a(favoriteMessageInfo, new UIGetDataCallback(new IGetDataCallback<List<FavoriteMessageInfo>>() {
                /* class com.ss.android.lark.favorite.list.C37219c.C37223b.C372241 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Legacy_SaveBoxDeleteFail);
                }

                /* renamed from: a */
                public void onSuccess(List<FavoriteMessageInfo> list) {
                    LKUIToast.show(C29990c.m110930b().mo134528a(), (int) R.string.Lark_Legacy_SaveBoxDeleteSuccess);
                    ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136891a(list);
                }
            }));
            FavouriteHitPoint.f135705a.mo187478a();
        }

        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37228b.AbstractC37229a
        /* renamed from: c */
        public void mo136912c(FavoriteMessageInfo favoriteMessageInfo) {
            Message sourceMessage = favoriteMessageInfo.getSourceMessage();
            if (sourceMessage != null) {
                int i = C372212.f95607a[sourceMessage.getType().ordinal()];
                if (i == 1) {
                    C37219c.this.f95604a.mo136897a((MergeForwardContent) favoriteMessageInfo.getSourceMessage().getContent(), favoriteMessageInfo);
                } else if (i == 2 || i == 3) {
                    C37219c.this.f95604a.mo136896a(favoriteMessageInfo);
                } else if (!DesktopUtil.m144307b()) {
                    C37219c.this.f95604a.mo136896a(favoriteMessageInfo);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C37225d.AbstractC37228b.AbstractC37229a createViewDelegate() {
        return new C37223b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C37225d.AbstractC37226a.AbstractC37227a mo136903b() {
        return new C37222a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo136904c();
    }

    /* renamed from: c */
    public void mo136904c() {
        ((C37225d.AbstractC37226a) getModel()).mo136874a(new FavoriteListModel.AbstractC37207a<FavoriteMessageInfo>() {
            /* class com.ss.android.lark.favorite.list.C37219c.C372201 */

            @Override // com.ss.android.lark.favorite.list.FavoriteListModel.AbstractC37207a
            /* renamed from: a */
            public void mo136883a() {
                ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136892b();
                ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136886a();
            }

            @Override // com.ss.android.lark.favorite.list.FavoriteListModel.AbstractC37207a
            /* renamed from: a */
            public void mo136884a(String str) {
                ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136892b();
                if (TextUtils.isEmpty(str)) {
                    str = C37219c.this.f95605b.getResources().getString(R.string.Lark_Legacy_NetError);
                }
                ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136890a(str);
            }

            @Override // com.ss.android.lark.favorite.list.FavoriteListModel.AbstractC37207a
            /* renamed from: a */
            public void mo136885a(List<FavoriteMessageInfo> list) {
                ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136892b();
                ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136891a(list);
            }
        });
    }

    /* renamed from: d */
    public void mo136905d() {
        ((C37225d.AbstractC37226a) getModel()).mo136877b();
        mo136904c();
    }

    /* renamed from: com.ss.android.lark.favorite.list.c$2 */
    static /* synthetic */ class C372212 {

        /* renamed from: a */
        static final /* synthetic */ int[] f95607a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.chat.entity.message.Message$Type[] r0 = com.ss.android.lark.chat.entity.message.Message.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.favorite.list.C37219c.C372212.f95607a = r0
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.MERGE_FORWARD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.favorite.list.C37219c.C372212.f95607a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.TEXT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.favorite.list.C37219c.C372212.f95607a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.POST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.favorite.list.C37219c.C372212.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.favorite.list.c$a */
    public class C37222a implements C37225d.AbstractC37226a.AbstractC37227a {
        private C37222a() {
        }

        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a.AbstractC37227a
        /* renamed from: a */
        public void mo136906a(List<FavoriteMessageInfo> list) {
            ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136891a(list);
        }

        @Override // com.ss.android.lark.favorite.list.C37225d.AbstractC37226a.AbstractC37227a
        /* renamed from: b */
        public void mo136907b(List<FavoriteMessageInfo> list) {
            ((C37225d.AbstractC37228b) C37219c.this.getView()).mo136895b(list);
        }
    }

    public C37219c(Activity activity, FavoriteListView.AbstractC37216a aVar) {
        this.f95604a = aVar;
        this.f95605b = activity;
        FavoriteListView favoriteListView = new FavoriteListView(activity, aVar);
        FavoriteListModel favoriteListModel = new FavoriteListModel();
        setModel(favoriteListModel);
        setView(favoriteListView);
        favoriteListView.setViewDelegate(createViewDelegate());
        favoriteListModel.mo136875a(mo136903b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo136902a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            if (i == 1 || i == 2 || i == 2304) {
                String stringExtra = intent.getStringExtra("params_favorites");
                if (!TextUtils.isEmpty(stringExtra)) {
                    ((C37225d.AbstractC37228b) getView()).mo136891a(((C37225d.AbstractC37226a) getModel()).mo136872a(stringExtra));
                }
            }
        }
    }
}
