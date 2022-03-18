package com.ss.android.lark.favorite.list;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.favorite.detail.C37190b;
import com.ss.android.lark.favorite.list.FavoriteListView;
import com.ss.android.lark.mergeforward.C45275c;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;

/* renamed from: com.ss.android.lark.favorite.list.b */
public class C37217b extends BaseFragment {

    /* renamed from: a */
    public View f95599a;

    /* renamed from: b */
    public Activity f95600b;

    /* renamed from: c */
    private C37219c f95601c;

    /* renamed from: d */
    private FavoriteListView.AbstractC37216a f95602d = new FavoriteListView.AbstractC37216a() {
        /* class com.ss.android.lark.favorite.list.C37217b.C372181 */

        @Override // com.ss.android.lark.favorite.list.FavoriteListView.AbstractC37216a
        /* renamed from: a */
        public void mo136898a(FavoriteListView favoriteListView) {
            ButterKnife.bind(favoriteListView, C37217b.this.f95599a);
        }

        @Override // com.ss.android.lark.favorite.list.FavoriteListView.AbstractC37216a
        /* renamed from: a */
        public void mo136896a(FavoriteMessageInfo favoriteMessageInfo) {
            C37190b.m146498a(C37217b.this.f95600b, favoriteMessageInfo, 1);
        }

        @Override // com.ss.android.lark.favorite.list.FavoriteListView.AbstractC37216a
        /* renamed from: b */
        public void mo136899b(FavoriteMessageInfo favoriteMessageInfo) {
            IForwardDependency E = C29990c.m110930b().mo134506E();
            E.mo134369a(C37217b.this.f95600b, favoriteMessageInfo, E.mo134366a(), "click", false, 2304);
        }

        @Override // com.ss.android.lark.favorite.list.FavoriteListView.AbstractC37216a
        /* renamed from: a */
        public void mo136897a(MergeForwardContent mergeForwardContent, FavoriteMessageInfo favoriteMessageInfo) {
            C45275c.m179791a(C37217b.this.f95600b, C37217b.this, mergeForwardContent, favoriteMessageInfo, 1, 2, favoriteMessageInfo.getSourceMessage().getChatId());
        }
    };

    /* renamed from: a */
    public void mo136900a() {
        C37219c cVar = this.f95601c;
        if (cVar != null) {
            cVar.mo136905d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PerfChatPerformanceMonitor.m213457a((ErrorResult) null);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        C36913c.m145732a(this.f95600b).mo136286a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C37219c cVar = this.f95601c;
        if (cVar != null) {
            cVar.destroy();
        }
        C36913c.m145732a(this.f95600b).mo136289b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C37219c cVar = new C37219c(this.f95600b, this.f95602d);
        this.f95601c = cVar;
        cVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f95601c.mo136902a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f95599a = layoutInflater.inflate(R.layout.fragment_lark_save_favorite, viewGroup, false);
        this.f95600b = getActivity();
        return this.f95599a;
    }
}
