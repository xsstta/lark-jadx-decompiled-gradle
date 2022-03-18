package com.bytedance.ee.bear.middleground.like;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.empty.C7692e;
import com.bytedance.ee.bear.middleground.like.C9512c;
import com.bytedance.ee.bear.middleground.like.C9532f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

public class LikeViewModel extends AbstractC1142af {
    private AccountService.Account mAccount;
    private C1177w<Integer> mCount = new C1177w<>();
    private String mDocToken;
    private C7692e mEmptySource;
    private C1177w<C9512c> mLikeList = new C1177w<>();
    private C1177w<LoadingMoreState> mLoadingMoreState = new C1177w<>();
    private Disposable mPullCountDisposable;
    private Disposable mPullDisposable;
    private C9532f mPuller;
    private int mRefType = -1;

    public LiveData<Integer> count() {
        return this.mCount;
    }

    public LiveData<C9512c> items() {
        return this.mLikeList;
    }

    public LiveData<LoadingMoreState> loadMoreState() {
        return this.mLoadingMoreState;
    }

    private void pullCount() {
        if (C9536g.m39375a().mo36383b()) {
            Disposable disposable = this.mPullCountDisposable;
            if (disposable != null) {
                disposable.dispose();
            }
            C13479a.m54764b("LikeViewModel", "pullCount: begin pull count for like list");
            this.mPullCountDisposable = this.mPuller.mo36509a().mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeViewModel$982XxKJkk9QOJpd7UWHUG01ZtIg */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LikeViewModel.this.lambda$pullCount$4$LikeViewModel((C9532f.C9533a) obj);
                }
            }, $$Lambda$LikeViewModel$BB3Y8uFsUhmf494CGZergVEg1I.INSTANCE);
        }
    }

    public void pull() {
        String str;
        Disposable disposable = this.mPullDisposable;
        if (disposable != null) {
            disposable.dispose();
            this.mPullDisposable = null;
        }
        C9512c b = this.mLikeList.mo5927b();
        if (b == null || b.f25547a.isEmpty()) {
            str = "0";
        } else {
            str = b.f25547a.get(b.f25547a.size() - 1).f25549a;
        }
        if (C9536g.m39375a().mo36383b()) {
            if (!TextUtils.equals(str, "0")) {
                this.mLoadingMoreState.mo5929b(new LoadingMoreState(1, null));
            } else {
                this.mEmptySource.mo30163g();
                AbstractC68307f.m265083a("").mo238019d(300, TimeUnit.MILLISECONDS).mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeViewModel$BlI1Lt3MHy_vaKXqau1I65ra0Rg */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        LikeViewModel.this.lambda$pull$0$LikeViewModel((String) obj);
                    }
                }, $$Lambda$LikeViewModel$fXw6rlu0wAdwu8NmjosideKxv0w.INSTANCE);
            }
            if (b == null) {
                b = new C9512c();
            }
            C13479a.m54764b("LikeViewModel", "pull: begin pull like list start id = " + str);
            this.mPullDisposable = this.mPuller.mo36510a(str, 20).mo238001b(new Consumer(b, str) {
                /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeViewModel$9WndWLnzTvIOUZUGt4HDwsjMWA */
                public final /* synthetic */ C9512c f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LikeViewModel.this.lambda$pull$2$LikeViewModel(this.f$1, this.f$2, (C9532f.C9534b) obj);
                }
            }, new Consumer(b) {
                /* class com.bytedance.ee.bear.middleground.like.$$Lambda$LikeViewModel$CHTcRUP6Xg8D5rJ6MFY1m_gWHW4 */
                public final /* synthetic */ C9512c f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    LikeViewModel.this.lambda$pull$3$LikeViewModel(this.f$1, (Throwable) obj);
                }
            });
        } else if (!TextUtils.equals(str, "0")) {
            this.mLoadingMoreState.mo5929b(new LoadingMoreState(2, new IOException("no network")));
        } else {
            this.mEmptySource.mo30160a((Throwable) new IOException("no network"));
        }
    }

    public /* synthetic */ void lambda$pull$0$LikeViewModel(String str) throws Exception {
        if (this.mPullDisposable != null) {
            this.mEmptySource.mo30162f();
        }
    }

    public /* synthetic */ void lambda$pullCount$4$LikeViewModel(C9532f.C9533a aVar) throws Exception {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("pullCount: result = ");
        if (aVar != null) {
            obj = Integer.valueOf(aVar.count);
        } else {
            obj = "";
        }
        sb.append(obj);
        C13479a.m54764b("LikeViewModel", sb.toString());
        this.mCount.mo5929b(Integer.valueOf(calculateCount(aVar)));
    }

    private int calculateCount(C9532f.C9533a aVar) {
        int i;
        if (this.mCount.mo5927b() == null) {
            i = 0;
        } else {
            i = this.mCount.mo5927b().intValue();
        }
        if (aVar != null) {
            i = aVar.count;
            C13479a.m54772d("LikeViewModel", "calculateCount: result count = " + i);
        }
        C9512c b = this.mLikeList.mo5927b();
        if (b == null || b.f25548b) {
            return i;
        }
        int size = b.f25547a.size();
        C13479a.m54772d("LikeViewModel", "calculateCount: list count = " + size);
        return size;
    }

    public static class LoadingMoreState {

        /* renamed from: a */
        public int f25537a;

        /* renamed from: b */
        public Throwable f25538b;

        public @interface LoadMoreState {
        }

        LoadingMoreState(int i, Throwable th) {
            this.f25537a = i;
            this.f25538b = th;
        }
    }

    public /* synthetic */ void lambda$pull$3$LikeViewModel(C9512c cVar, Throwable th) throws Exception {
        this.mLikeList.mo5929b(cVar);
        if (cVar.f25547a.isEmpty()) {
            this.mEmptySource.mo30160a(th);
        } else {
            LoadingMoreState loadingMoreState = new LoadingMoreState(2, th);
            this.mLoadingMoreState.mo5929b(loadingMoreState);
            this.mLoadingMoreState.mo5929b(loadingMoreState);
        }
        this.mPullDisposable = null;
        C13479a.m54759a("LikeViewModel", "accept: pull more error", th);
    }

    private void fillLikeList(C9532f.C9534b bVar, C9512c cVar) {
        List<C9532f.C9535c> likeUsers = bVar.getLikeUsers();
        if (likeUsers != null) {
            for (C9532f.C9535c cVar2 : likeUsers) {
                C9512c.C9513a aVar = new C9512c.C9513a();
                aVar.f25549a = cVar2.f25592a;
                aVar.f25553e = cVar2.f25595d;
                aVar.f25554f = cVar2.f25596e;
                aVar.f25551c = cVar2.f25594c;
                aVar.f25552d = cVar2.f25597f;
                aVar.f25555g = cVar2.f25598g;
                aVar.f25550b = cVar2.f25593b;
                if (this.mAccount == null || !aVar.f25550b.equals(this.mAccount.f14584a)) {
                    cVar.mo36388a(aVar);
                } else {
                    cVar.f25547a.add(0, aVar);
                }
            }
        }
        cVar.f25548b = bVar.hasMore();
    }

    public /* synthetic */ void lambda$pull$2$LikeViewModel(C9512c cVar, String str, C9532f.C9534b bVar) throws Exception {
        fillLikeList(bVar, cVar);
        this.mLikeList.mo5929b(cVar);
        this.mEmptySource.mo30161b(cVar.f25547a.size());
        if (!TextUtils.equals("0", str)) {
            this.mLoadingMoreState.mo5929b(new LoadingMoreState(3, null));
        }
        this.mCount.mo5929b(Integer.valueOf(calculateCount(null)));
        this.mPullDisposable = null;
        C13479a.m54764b("LikeViewModel", "pull: end pull like list count = " + cVar.f25547a.size() + ", hasMore = " + cVar.f25548b);
    }

    public void attach(C10917c cVar, C7692e eVar, String str, int i) {
        this.mAccount = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (!TextUtils.equals(this.mDocToken, str) || this.mRefType != i) {
            this.mEmptySource = eVar;
            this.mDocToken = str;
            this.mRefType = i;
            this.mPuller = new C9532f(cVar, str, i);
            this.mLikeList.mo5929b(new C9512c());
            this.mLoadingMoreState.mo5929b(new LoadingMoreState(0, null));
            pull();
            pullCount();
        }
    }
}
