package com.ss.android.lark.feed.app.team.hidded_chat_list;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.feed.app.team.LargeDataHolder;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListAdapter;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020(H\u0014J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\fH\u0016J\u0018\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020#2\u0006\u0010-\u001a\u00020\fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00190\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b\u001e\u0010\u001fR;\u0010!\u001a\"\u0012\f\u0012\n \u000f*\u0004\u0018\u00010#0# \u000f*\u000b\u0012\u0002\b\u0003\u0018\u00010\"¨\u0006\u00010\"¨\u0006\u00018BX\u0002¢\u0006\f\n\u0004\b&\u0010\t\u001a\u0004\b$\u0010%¨\u00061"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter$Dependency;", "()V", "adapter", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter;", "getAdapter", "()Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "chatUpdateObserver", "Landroidx/lifecycle/Observer;", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "recyclerViewSwipeManager", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "getRecyclerViewSwipeManager", "()Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "recyclerViewSwipeManager$delegate", "showChatErrorObserver", "Lkotlin/Pair;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "showChatSuccessObserver", "viewModel", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel;", "getViewModel", "()Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel;", "viewModel$delegate", "wrappedAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getWrappedAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "wrappedAdapter$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openChat", "chat", "setChatVisible", "viewHolder", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class HiddenChatListActivity extends BaseFragmentActivity implements HiddenChatListAdapter.Dependency {

    /* renamed from: a */
    public static final Companion f97155a = new Companion(null);

    /* renamed from: b */
    private final Lazy f97156b = LazyKt.lazy(new C37881d(this));

    /* renamed from: c */
    private final Lazy f97157c = LazyKt.lazy(new C37885h(this));

    /* renamed from: d */
    private final Lazy f97158d = LazyKt.lazy(C37882e.INSTANCE);

    /* renamed from: e */
    private final Lazy f97159e = LazyKt.lazy(new C37879b(this));

    /* renamed from: f */
    private final Lazy f97160f = LazyKt.lazy(new C37886i(this));

    /* renamed from: g */
    private final AbstractC1178x<C37874d> f97161g = new C37884g(this);

    /* renamed from: h */
    private final AbstractC1178x<Pair<C37874d, ErrorResult>> f97162h = new C37883f(this);

    /* renamed from: i */
    private final AbstractC1178x<C37874d> f97163i = new C37880c(this);

    /* renamed from: f */
    private final RecyclerView m149075f() {
        return (RecyclerView) this.f97156b.getValue();
    }

    /* renamed from: g */
    private final HiddenChatListViewModel m149076g() {
        return (HiddenChatListViewModel) this.f97157c.getValue();
    }

    /* renamed from: h */
    private final RecyclerView.Adapter<RecyclerView.ViewHolder> m149077h() {
        return (RecyclerView.Adapter) this.f97160f.getValue();
    }

    /* renamed from: a */
    public Context mo138778a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final C23289c mo138779a() {
        return (C23289c) this.f97158d.getValue();
    }

    /* renamed from: a */
    public void mo138780a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m149072a(this, context);
    }

    /* renamed from: b */
    public final HiddenChatListAdapter mo138783b() {
        return (HiddenChatListAdapter) this.f97159e.getValue();
    }

    /* renamed from: c */
    public Resources mo138784c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m149070a(this, configuration);
    }

    /* renamed from: d */
    public void mo138786d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo138787e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m149074c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m149071a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m149073b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListActivity$Companion;", "", "()V", "INTENT_CHAT_LIST_KEY", "", "TAG", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/RecyclerViewSwipeManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$e */
    static final class C37882e extends Lambda implements Function0<C23289c> {
        public static final C37882e INSTANCE = new C37882e();

        C37882e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C23289c invoke() {
            return new C23289c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$b */
    static final class C37879b extends Lambda implements Function0<HiddenChatListAdapter> {
        final /* synthetic */ HiddenChatListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37879b(HiddenChatListActivity hiddenChatListActivity) {
            super(0);
            this.this$0 = hiddenChatListActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HiddenChatListAdapter invoke() {
            return new HiddenChatListAdapter(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$d */
    static final class C37881d extends Lambda implements Function0<RecyclerView> {
        final /* synthetic */ HiddenChatListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37881d(HiddenChatListActivity hiddenChatListActivity) {
            super(0);
            this.this$0 = hiddenChatListActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) this.this$0.findViewById(R.id.recycler_view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$h */
    static final class C37885h extends Lambda implements Function0<HiddenChatListViewModel> {
        final /* synthetic */ HiddenChatListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37885h(HiddenChatListActivity hiddenChatListActivity) {
            super(0);
            this.this$0 = hiddenChatListActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HiddenChatListViewModel invoke() {
            return (HiddenChatListViewModel) new C1144ai(this.this$0).mo6005a(HiddenChatListViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u000b\u0012\u0002\b\u0003\u0018\u00010\u0001¨\u0006\u00010\u0001¨\u0006\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$i */
    static final class C37886i extends Lambda implements Function0<RecyclerView.Adapter<RecyclerView.ViewHolder>> {
        final /* synthetic */ HiddenChatListActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37886i(HiddenChatListActivity hiddenChatListActivity) {
            super(0);
            this.this$0 = hiddenChatListActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView.Adapter<RecyclerView.ViewHolder> invoke() {
            return this.this$0.mo138779a().mo80800a(this.this$0.mo138783b());
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        HiddenChatListViewModel g = m149076g();
        g.getShowChatSuccessLiveData().mo5928b(this.f97161g);
        g.getShowChatErrorLiveData().mo5928b(this.f97162h);
        g.getChatUpdateLiveData().mo5928b(this.f97163i);
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$c */
    static final class C37880c<T> implements AbstractC1178x<C37874d> {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListActivity f97164a;

        C37880c(HiddenChatListActivity hiddenChatListActivity) {
            this.f97164a = hiddenChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(C37874d dVar) {
            HiddenChatListAdapter b = this.f97164a.mo138783b();
            Intrinsics.checkExpressionValueIsNotNull(dVar, "it");
            b.mo138799b(dVar);
        }
    }

    /* renamed from: a */
    public static Resources m149071a(HiddenChatListActivity hiddenChatListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(hiddenChatListActivity);
        }
        return hiddenChatListActivity.mo138784c();
    }

    /* renamed from: c */
    public static AssetManager m149074c(HiddenChatListActivity hiddenChatListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(hiddenChatListActivity);
        }
        return hiddenChatListActivity.mo138787e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$f */
    static final class C37883f<T> implements AbstractC1178x<Pair<? extends C37874d, ? extends ErrorResult>> {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListActivity f97165a;

        C37883f(HiddenChatListActivity hiddenChatListActivity) {
            this.f97165a = hiddenChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(Pair<? extends C37874d, ? extends ErrorResult> pair) {
            String displayMsg = ((ErrorResult) pair.getSecond()).getDisplayMsg();
            if (displayMsg == null) {
                displayMsg = UIHelper.getString(R.string.Lark_Legacy_NetworkErrorRetry);
            }
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "toastText");
            UDToast.show(this.f97165a, displayMsg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListActivity$g */
    static final class C37884g<T> implements AbstractC1178x<C37874d> {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListActivity f97166a;

        C37884g(HiddenChatListActivity hiddenChatListActivity) {
            this.f97166a = hiddenChatListActivity;
        }

        /* renamed from: a */
        public final void onChanged(C37874d dVar) {
            HiddenChatListAdapter b = this.f97166a.mo138783b();
            Intrinsics.checkExpressionValueIsNotNull(dVar, "it");
            b.mo138794a(dVar);
            UDToast.show(this.f97166a, (int) R.string.Project_MV_GroupIsShown);
            if (this.f97166a.mo138783b().getItemCount() < 1) {
                this.f97166a.finish();
            }
        }
    }

    /* renamed from: b */
    public static void m149073b(HiddenChatListActivity hiddenChatListActivity) {
        hiddenChatListActivity.mo138786d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            HiddenChatListActivity hiddenChatListActivity2 = hiddenChatListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    hiddenChatListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.activity_hidden_chat_list);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            str = extras.getString("intent_chat_list_key", "");
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165397w(this.TAG, "chat list key is empty");
            finish();
            return;
        }
        List<C37874d> a = LargeDataHolder.f97028a.mo138613a(str);
        mo138783b().mo138797a(a);
        RecyclerView f = m149075f();
        Intrinsics.checkExpressionValueIsNotNull(f, "recyclerView");
        f.setAdapter(m149077h());
        RecyclerView f2 = m149075f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "recyclerView");
        f2.setLayoutManager(new LinearLayoutManager(this));
        mo138779a().mo80804a(m149075f());
        C37266b.m146757a(m149075f());
        HiddenChatListViewModel g = m149076g();
        g.getShowChatSuccessLiveData().mo5925a(this.f97161g);
        g.getShowChatErrorLiveData().mo5925a(this.f97162h);
        g.getChatUpdateLiveData().mo5925a(this.f97163i);
        g.setup(a);
    }

    @Override // com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListAdapter.Dependency
    /* renamed from: a */
    public void mo138782a(C37874d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chat");
        AbstractC38037a b = C37268c.m146766b();
        Intrinsics.checkExpressionValueIsNotNull(b, "FeedContext.getDependency()");
        b.mo139154A().mo139236a(this, dVar.mo138742b(), dVar.mo138747d(), false, "feed", "feed", null);
    }

    /* renamed from: a */
    public static void m149072a(HiddenChatListActivity hiddenChatListActivity, Context context) {
        hiddenChatListActivity.mo138780a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(hiddenChatListActivity);
        }
    }

    /* renamed from: a */
    public static Context m149070a(HiddenChatListActivity hiddenChatListActivity, Configuration configuration) {
        Context a = hiddenChatListActivity.mo138778a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListAdapter.Dependency
    /* renamed from: a */
    public void mo138781a(RecyclerView.ViewHolder viewHolder, C37874d dVar) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, "chat");
        mo138779a().mo80808a(viewHolder, 1);
        m149076g().setChatVisible(dVar);
    }
}
