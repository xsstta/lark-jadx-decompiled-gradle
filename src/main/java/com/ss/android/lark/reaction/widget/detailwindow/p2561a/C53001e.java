package com.ss.android.lark.reaction.widget.detailwindow.p2561a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.detailwindow.a.e */
public class C53001e {

    /* renamed from: a */
    private C53002b.AbstractC53004a f130931a;

    /* renamed from: b */
    private ReactionDetailViewModel f130932b;

    /* renamed from: a */
    public List<DetailUserInfo> mo181039a() {
        ReactionDetailViewModel reactionDetailViewModel = this.f130932b;
        if (reactionDetailViewModel == null) {
            return new ArrayList();
        }
        return reactionDetailViewModel.getUserInfoList();
    }

    /* renamed from: b */
    public int mo181042b() {
        ReactionDetailViewModel reactionDetailViewModel = this.f130932b;
        if (reactionDetailViewModel == null) {
            return 0;
        }
        return reactionDetailViewModel.getTotalCount();
    }

    /* renamed from: a */
    public void mo181041a(ReactionDetailViewModel reactionDetailViewModel) {
        this.f130932b = reactionDetailViewModel;
    }

    public C53001e(C53002b.AbstractC53004a aVar) {
        this.f130931a = aVar;
    }

    /* renamed from: a */
    public void mo181040a(IGetDataCallback<ReactionDetailViewModel> iGetDataCallback) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(iGetDataCallback) {
            /* class com.ss.android.lark.reaction.widget.detailwindow.p2561a.$$Lambda$e$YD7qDtQS9jSEerTQeiCbbnk44 */
            public final /* synthetic */ IGetDataCallback f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C53001e.this.m205268b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m205268b(IGetDataCallback iGetDataCallback) {
        ReactionDetailViewModel reactionDetailViewModel;
        C53002b.AbstractC53004a aVar = this.f130931a;
        if (aVar == null || (reactionDetailViewModel = this.f130932b) == null) {
            iGetDataCallback.onError(new ErrorResult("Fetcher is null or currentViewModel is null"));
            return;
        }
        ReactionDetailViewModel a = aVar.mo166647a(reactionDetailViewModel.getReactionKey());
        if (a == null || !CollectionUtils.isNotEmpty(a.getUserInfoList())) {
            iGetDataCallback.onError(new ErrorResult("Failed to load reaction detail"));
            return;
        }
        this.f130932b.setUserInfoList(a.getUserInfoList());
        iGetDataCallback.onSuccess(this.f130932b);
    }
}
