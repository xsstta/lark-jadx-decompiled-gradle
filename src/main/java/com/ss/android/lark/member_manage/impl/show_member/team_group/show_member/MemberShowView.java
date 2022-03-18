package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.base.C45033a;
import com.ss.android.lark.member_manage.impl.base.adapter.C45044d;
import com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.show_member.team_group.IBaseFragment;
import com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.LoadingView;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;
import com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0002MNB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0014H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u001eH\u0016J \u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001eH\u0016J\b\u0010-\u001a\u00020\u0019H\u0002J\b\u0010.\u001a\u00020\u0019H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0019H\u0002J\b\u00101\u001a\u00020\u0019H\u0002J\u0016\u00102\u001a\u00020\u00192\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001e04H\u0016J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0016H\u0016J\u0012\u00107\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u0010H\u0016J$\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u000e2\b\b\u0003\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u001bH\u0016J\b\u0010@\u001a\u00020\u0019H\u0002J\u0010\u0010A\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u001bH\u0002J\u0010\u0010B\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010C\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u001eH\u0002J\b\u0010E\u001a\u00020\u0019H\u0016J\u001e\u0010F\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u001e2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H04H\u0016J\u0010\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020\u001eH\u0016J-\u0010K\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H04H\u0002¢\u0006\u0002\u0010LR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView;", "mContext", "Landroid/content/Context;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mRootView", "Landroid/view/View;", "mDependency", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$ViewDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;Landroid/view/View;Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$ViewDependency;)V", "mContentAdapter", "Lcom/ss/android/lark/member_manage/impl/base/adapter/GroupMemberManageAdapter;", "mCurrentType", "", "mDelegate", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView$IMemberShowContractDelegate;", "mHeadersDecor", "Lcom/larksuite/framework/ui/stickyheader/StickyRecyclerHeadersDecoration;", "mIsShowQuickSideBar", "", "mItemClickListener", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "mSearchAdapter", "addMemberPage", "", "selectBeansResult", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "changeItemSelectedStatus", "itemId", "", "isSelected", "changeSelectableStatus", "isSelectable", "closeSearch", "create", "destroy", "endMemberLoaderMore", "getFirstPageFail", ApiHandler.API_CALLBACK_ERRMSG, "goToProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatId", "chatName", "hideLoading", "initContentRecyclerView", "initListeners", "initMemberPtr", "initSearchRecyclerView", "removeItems", "itemIds", "", "setItemClickListener", "listener", "setViewDelegate", "viewDelegate", "showEmptyPage", "visibility", "imgId", "text", "", "showFirstPageData", "result", "showLoading", "showMembersImpl", "showQuickSideBar", "showSearchEmpty", "key", "showSearchFail", "showSearchResult", "items", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "startAppProfileByBotId", BottomDialog.f17198f, "updateItem", "(Ljava/lang/String;ZLjava/util/List;)Ljava/lang/Integer;", "Companion", "ViewDependency", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e */
public final class MemberShowView implements IMemberShowContract.IMemberShowContractView {

    /* renamed from: f */
    public static final Companion f114562f = new Companion(null);

    /* renamed from: a */
    public final C45044d f114563a;

    /* renamed from: b */
    public IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate f114564b;

    /* renamed from: c */
    public IBaseFragment.ItemClickListener f114565c;

    /* renamed from: d */
    public final Context f114566d;

    /* renamed from: e */
    public final View f114567e;

    /* renamed from: g */
    private final C45044d f114568g;

    /* renamed from: h */
    private int f114569h = 2;

    /* renamed from: i */
    private C26198f f114570i;

    /* renamed from: j */
    private boolean f114571j = true;

    /* renamed from: k */
    private final Chat f114572k;

    /* renamed from: l */
    private final ViewDependency f114573l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$ViewDependency;", "", "goToUserProfile", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatId", "", "chatName", "startAppProfileByBotId", BottomDialog.f17198f, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo159888a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo159889a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$Companion;", "", "()V", "MIN_PRE_LOAD_DISTANCE_THRESHOLD", "", "PRE_LOAD_THRESHOLD", "TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159902a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "itemIds");
        mo159907c();
        if (!CollectionUtils.isEmpty(list)) {
            ArrayList arrayList = new ArrayList();
            List<C45084c> a = this.f114563a.mo159348a();
            Intrinsics.checkExpressionValueIsNotNull(a, "mContentAdapter.items");
            int i = 0;
            for (T t : a) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                Intrinsics.checkExpressionValueIsNotNull(t2, "selectBean");
                if (!list.contains(t2.mo159513h())) {
                    arrayList.add(t2);
                }
                i = i2;
            }
            ArrayList arrayList2 = arrayList;
            this.f114563a.mo159354a(arrayList2);
            if (CollectionUtils.isEmpty(arrayList2)) {
                String string = UIUtils.getString(this.f114566d, R.string.Lark_Group_OutsideDepartmentMemberEmpty);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(mConte…ideDepartmentMemberEmpty)");
                m179668a(0, R.drawable.icon_no_content, string);
            }
            m179670c(new SelectBeansResult(false, arrayList, new HashMap(), this.f114571j));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159903a(boolean z) {
        int i = z ? 1 : 2;
        this.f114569h = i;
        this.f114563a.mo159358c(i);
        this.f114568g.mo159358c(this.f114569h);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159896a() {
        ((LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout)).refreshComplete();
    }

    /* renamed from: d */
    private final void m179672d() {
        LoadingView loadingView = (LoadingView) this.f114567e.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mLoadingView");
        loadingView.setVisibility(0);
        LoadingView.m226086a((LoadingView) this.f114567e.findViewById(R.id.mLoadingView), 0, 1, null);
    }

    /* renamed from: e */
    private final void m179674e() {
        ((LoadingView) this.f114567e.findViewById(R.id.mLoadingView)).mo197486a();
        LoadingView loadingView = (LoadingView) this.f114567e.findViewById(R.id.mLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(loadingView, "mRootView.mLoadingView");
        loadingView.setVisibility(8);
    }

    /* renamed from: g */
    private final void m179676g() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f114566d, 1, false);
        RecyclerView recyclerView = (RecyclerView) this.f114567e.findViewById(R.id.searchContactResultView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.searchContactResultView");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) this.f114567e.findViewById(R.id.searchContactResultView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.searchContactResultView");
        recyclerView2.setAdapter(this.f114568g);
    }

    /* renamed from: f */
    private final void m179675f() {
        RecyclerView recyclerView = (RecyclerView) this.f114567e.findViewById(R.id.contactView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.contactView");
        recyclerView.setAdapter(this.f114563a);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f114566d, 1, false);
        RecyclerView recyclerView2 = (RecyclerView) this.f114567e.findViewById(R.id.contactView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.contactView");
        recyclerView2.setLayoutManager(linearLayoutManager);
        this.f114570i = new C26198f(this.f114563a);
        RecyclerView recyclerView3 = (RecyclerView) this.f114567e.findViewById(R.id.contactView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "mRootView.contactView");
        if (recyclerView3.getItemDecorationCount() > 0) {
            ((RecyclerView) this.f114567e.findViewById(R.id.contactView)).removeItemDecorationAt(0);
        }
        RecyclerView recyclerView4 = (RecyclerView) this.f114567e.findViewById(R.id.contactView);
        C26198f fVar = this.f114570i;
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        recyclerView4.addItemDecoration(fVar);
    }

    /* renamed from: h */
    private final void m179677h() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f114566d);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        ((LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout)).setFooterView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout2.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout)).disableWhenHorizontalMove(true);
        ((LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout)).setPtrHandler(new C45267g(this));
    }

    /* renamed from: i */
    private final void m179678i() {
        ((QuickSideBarView) this.f114567e.findViewById(R.id.quickSideBarView)).setOnQuickSideBarTouchListener(new C45265e(this));
        C45264d dVar = new C45264d(this);
        C45266f fVar = new C45266f(this);
        C45264d dVar2 = dVar;
        this.f114563a.mo159351a(dVar2);
        this.f114568g.mo159351a(dVar2);
        this.f114563a.mo159352a(fVar);
        this.f114568g.mo159352a(fVar);
        ((RecyclerView) this.f114567e.findViewById(R.id.contactView)).addOnScrollListener(new C45263c(this));
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: b */
    public void mo159904b() {
        this.f114568g.mo159357b();
        View findViewById = this.f114567e.findViewById(R.id.loadFail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadFail");
        findViewById.setVisibility(0);
        m179669a(this, 8, 0, null, 6, null);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.searchPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.searchPtrLayout");
        lKUIPtrClassicFrameLayout.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout2.setVisibility(8);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: c */
    public void mo159907c() {
        this.f114568g.mo159357b();
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.searchPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.searchPtrLayout");
        lKUIPtrClassicFrameLayout.setVisibility(8);
        View findViewById = this.f114567e.findViewById(R.id.loadFail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadFail");
        findViewById.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout2.setVisibility(0);
        if (CollectionUtils.isEmpty(this.f114563a.mo159348a())) {
            String string = UIUtils.getString(this.f114566d, R.string.Lark_Group_OutsideDepartmentMemberEmpty);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(mConte…ideDepartmentMemberEmpty)");
            m179668a(0, R.drawable.icon_no_content, string);
            return;
        }
        m179669a(this, 8, 0, null, 6, null);
    }

    /* renamed from: a */
    public void setViewDelegate(IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate aVar) {
        this.f114564b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$initListeners$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$c */
    public static final class C45263c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MemberShowView f114574a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45263c(MemberShowView eVar) {
            this.f114574a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                KeyboardUtils.hideKeyboard(this.f114574a.f114566d);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate aVar;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            RecyclerView recyclerView2 = (RecyclerView) this.f114574a.f114567e.findViewById(R.id.contactView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.contactView");
            RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (i2 > 8 && (aVar = this.f114574a.f114564b) != null && aVar.mo159909a() && linearLayoutManager.findLastVisibleItemPosition() + 1 == this.f114574a.f114563a.getItemCount() - 3) {
                    ((LKUIPtrClassicFrameLayout) this.f114574a.f114567e.findViewById(R.id.loadMoreLayout)).autoLoadMore();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$initListeners$onChatterSelectChangeListener$1", "Lcom/ss/android/lark/member_manage/impl/base/adapter/IFuncBinder$OnSelectChangeListener;", "onMultiItemSelected", "", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onMultiItemUnSelected", "onSinglePick", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$d */
    public static final class C45264d implements IFuncBinder.AbstractC45039b {

        /* renamed from: a */
        final /* synthetic */ MemberShowView f114575a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45264d(MemberShowView eVar) {
            this.f114575a = eVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45039b
        /* renamed from: a */
        public void mo159334a(C45084c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "item");
            IBaseFragment.ItemClickListener itemClickListener = this.f114575a.f114565c;
            if (itemClickListener != null) {
                itemClickListener.onItemClick(cVar);
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45039b
        /* renamed from: b */
        public void mo159335b(C45084c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "item");
            IBaseFragment.ItemClickListener itemClickListener = this.f114575a.f114565c;
            if (itemClickListener != null) {
                itemClickListener.onItemClick(cVar);
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45039b
        /* renamed from: c */
        public void mo159336c(C45084c cVar) {
            if (cVar != null) {
                KeyboardUtils.hideKeyboard(this.f114575a.f114566d);
                IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate aVar = this.f114575a.f114564b;
                if (aVar != null) {
                    String h = cVar.mo159513h();
                    Intrinsics.checkExpressionValueIsNotNull(h, "item.id");
                    aVar.mo159908a(h);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$initListeners$onQuickSideBarTouchListener$1", "Lcom/ss/android/lark/widget/quick_sidebar/listener/OnQuickSideBarTouchListener;", "onLetterChanged", "", "letter", "", "position", "", "y", "", "onLetterTouching", "touching", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$e */
    public static final class C45265e implements AbstractC58955a {

        /* renamed from: a */
        final /* synthetic */ MemberShowView f114576a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45265e(MemberShowView eVar) {
            this.f114576a = eVar;
        }

        @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
        /* renamed from: a */
        public void mo131379a(boolean z) {
            int i;
            QuickSideBarTipsView quickSideBarTipsView = (QuickSideBarTipsView) this.f114576a.f114567e.findViewById(R.id.quickSideBarTipsView);
            Intrinsics.checkExpressionValueIsNotNull(quickSideBarTipsView, "mRootView.quickSideBarTipsView");
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            quickSideBarTipsView.setVisibility(i);
        }

        @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
        /* renamed from: a */
        public void mo131378a(String str, int i, float f) {
            Intrinsics.checkParameterIsNotNull(str, "letter");
            ((QuickSideBarTipsView) this.f114576a.f114567e.findViewById(R.id.quickSideBarTipsView)).mo200024a(str, i, f - ((float) UIUtils.dp2px(this.f114576a.f114566d, 40.0f)));
            if (C45033a.m178595a().containsKey(str)) {
                RecyclerView recyclerView = (RecyclerView) this.f114576a.f114567e.findViewById(R.id.contactView);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.contactView");
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    Integer num = C45033a.m178595a().get(str);
                    if (num == null) {
                        Intrinsics.throwNpe();
                    }
                    linearLayoutManager.scrollToPositionWithOffset(num.intValue(), 0);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "kotlin.jvm.PlatformType", "onUnSelectedItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$f */
    public static final class C45266f implements IFuncBinder.AbstractC45040c {

        /* renamed from: a */
        final /* synthetic */ MemberShowView f114577a;

        C45266f(MemberShowView eVar) {
            this.f114577a = eVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.adapter.IFuncBinder.AbstractC45040c
        /* renamed from: a */
        public final void mo159337a(C45084c cVar) {
            KeyboardUtils.hideKeyboard(this.f114577a.f114566d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/member_manage/impl/show_member/team_group/show_member/MemberShowView$initMemberPtr$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "onLoadMoreBegin", "", "onRefreshBegin", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.e$g */
    public static final class C45267g extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ MemberShowView f114578a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45267g(MemberShowView eVar) {
            this.f114578a = eVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate aVar = this.f114578a.f114564b;
            if (aVar != null) {
                aVar.mo159910b();
            }
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "content");
            IMemberShowContract.IMemberShowContractView.IMemberShowContractDelegate aVar = this.f114578a.f114564b;
            if (aVar != null) {
                z = aVar.mo159909a();
            } else {
                z = false;
            }
            if (!z || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo159923a(IBaseFragment.ItemClickListener itemClickListener) {
        Intrinsics.checkParameterIsNotNull(itemClickListener, "listener");
        this.f114565c = itemClickListener;
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: b */
    public void mo159906b(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        this.f114573l.mo159889a(str);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: b */
    public void mo159905b(SelectBeansResult dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "selectBeansResult");
        List<C45084c> b = dVar.mo159516b();
        List<C45084c> a = this.f114563a.mo159348a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mContentAdapter.items");
        b.addAll(0, a);
        m179673d(dVar);
        ((LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout)).refreshComplete();
    }

    /* renamed from: c */
    private final void m179670c(SelectBeansResult dVar) {
        if (dVar.mo159518d()) {
            List<String> a = C45033a.m178594a(dVar.mo159516b());
            QuickSideBarView quickSideBarView = (QuickSideBarView) this.f114567e.findViewById(R.id.quickSideBarView);
            Intrinsics.checkExpressionValueIsNotNull(quickSideBarView, "mRootView.quickSideBarView");
            quickSideBarView.setLetters(a);
            QuickSideBarView quickSideBarView2 = (QuickSideBarView) this.f114567e.findViewById(R.id.quickSideBarView);
            Intrinsics.checkExpressionValueIsNotNull(quickSideBarView2, "mRootView.quickSideBarView");
            quickSideBarView2.setVisibility(0);
            View findViewById = this.f114567e.findViewById(R.id.quickSideBarViewCover);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.quickSideBarViewCover");
            findViewById.setVisibility(8);
            QuickSideBarTipsView quickSideBarTipsView = (QuickSideBarTipsView) this.f114567e.findViewById(R.id.quickSideBarTipsView);
            Intrinsics.checkExpressionValueIsNotNull(quickSideBarTipsView, "mRootView.quickSideBarTipsView");
            quickSideBarTipsView.setVisibility(8);
        } else if (this.f114570i != null && CollectionUtils.isNotEmpty(dVar.mo159516b())) {
            RecyclerView recyclerView = (RecyclerView) this.f114567e.findViewById(R.id.contactView);
            C26198f fVar = this.f114570i;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            recyclerView.removeItemDecoration(fVar);
        }
    }

    /* renamed from: d */
    private final void m179673d(SelectBeansResult dVar) {
        View findViewById = this.f114567e.findViewById(R.id.loadFail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadFail");
        findViewById.setVisibility(8);
        if (CollectionUtils.isEmpty(dVar.mo159516b())) {
            String string = UIUtils.getString(this.f114566d, R.string.Lark_Group_OutsideDepartmentMemberEmpty);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(mConte…ideDepartmentMemberEmpty)");
            m179668a(0, R.drawable.icon_no_content, string);
            return;
        }
        m179669a(this, 8, 0, null, 6, null);
        m179670c(dVar);
        this.f114563a.mo159354a(dVar.mo159516b());
    }

    /* renamed from: c */
    private final void m179671c(String str) {
        View findViewById = this.f114567e.findViewById(R.id.loadFail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadFail");
        findViewById.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.searchPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.searchPtrLayout");
        lKUIPtrClassicFrameLayout.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout2.setVisibility(8);
        this.f114568g.mo159357b();
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Noresult, "search_key", str);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "text");
        String str2 = mustacheFormat;
        CharSequence a = C57782ag.m224238a(str2, StringsKt.indexOf$default((CharSequence) str2, "'", 0, false, 6, (Object) null), StringsKt.lastIndexOf$default((CharSequence) str2, "'", 0, false, 6, (Object) null), str, UIHelper.getColor(R.color.function_info_500));
        Intrinsics.checkExpressionValueIsNotNull(a, "TextUtil.highColorFirst(…color.function_info_500))");
        m179668a(0, R.drawable.empty_search, a);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159898a(SelectBeansResult dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "result");
        m179674e();
        this.f114571j = dVar.mo159518d();
        m179673d(dVar);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159899a(String str) {
        Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
        if (CollectionUtils.isNotEmpty(this.f114563a.mo159348a())) {
            Log.m165389i("MemberShowView", "local data show :" + str);
            return;
        }
        m179674e();
        View findViewById = this.f114567e.findViewById(R.id.loadFail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadFail");
        findViewById.setVisibility(0);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.searchPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.searchPtrLayout");
        lKUIPtrClassicFrameLayout2.setVisibility(0);
        m179669a(this, 8, 0, null, 6, null);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159900a(String str, List<? extends C45084c> list) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(list, "items");
        List<? extends C45084c> list2 = list;
        if (CollectionUtils.isEmpty(list2)) {
            m179671c(str);
            return;
        }
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.loadMoreLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "mRootView.loadMoreLayout");
        lKUIPtrClassicFrameLayout.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f114567e.findViewById(R.id.searchPtrLayout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "mRootView.searchPtrLayout");
        lKUIPtrClassicFrameLayout2.setVisibility(0);
        View findViewById = this.f114567e.findViewById(R.id.loadFail);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadFail");
        findViewById.setVisibility(8);
        m179669a(this, 8, 0, null, 6, null);
        this.f114568g.mo159354a(list2);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159901a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "itemId");
        List<C45084c> a = this.f114563a.mo159348a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mContentAdapter.items");
        Integer a2 = m179667a(str, z, a);
        if (a2 != null) {
            this.f114563a.notifyItemChanged(a2.intValue());
        }
        List<C45084c> a3 = this.f114568g.mo159348a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "mSearchAdapter.items");
        Integer a4 = m179667a(str, z, a3);
        if (a4 != null) {
            this.f114568g.notifyItemChanged(a4.intValue());
        }
    }

    /* renamed from: a */
    private final Integer m179667a(String str, boolean z, List<? extends C45084c> list) {
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (TextUtils.equals(str, t2.mo159513h())) {
                t2.mo159503b(z);
                return Integer.valueOf(i);
            }
            i = i2;
        }
        return null;
    }

    /* renamed from: a */
    private final void m179668a(int i, int i2, CharSequence charSequence) {
        View findViewById = this.f114567e.findViewById(R.id.loadEmpty);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.loadEmpty");
        findViewById.setVisibility(i);
        ((ImageView) this.f114567e.findViewById(R.id.loadEmpty).findViewById(R.id.imageIv)).setImageResource(i2);
        View findViewById2 = this.f114567e.findViewById(R.id.loadEmpty).findViewById(R.id.text_empty_tip);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.loadEmpty.find…iew>(R.id.text_empty_tip)");
        ((TextView) findViewById2).setText(charSequence);
    }

    @Override // com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.IMemberShowContract.IMemberShowContractView
    /* renamed from: a */
    public void mo159897a(Chatter chatter, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "chatName");
        this.f114573l.mo159888a(chatter, str, str2);
    }

    public MemberShowView(Context context, Chat chat, View view, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f114566d = context;
        this.f114572k = chat;
        this.f114567e = view;
        this.f114573l = bVar;
        this.f114563a = new C45044d(context, 2, chat);
        this.f114568g = new C45044d(context, 2, chat);
        m179675f();
        m179676g();
        m179677h();
        m179678i();
        m179672d();
    }

    /* renamed from: a */
    static /* synthetic */ void m179669a(MemberShowView eVar, int i, int i2, CharSequence charSequence, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = R.drawable.empty_search;
        }
        if ((i3 & 4) != 0) {
        }
        eVar.m179668a(i, i2, charSequence);
    }
}
