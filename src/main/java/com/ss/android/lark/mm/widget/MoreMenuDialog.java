package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.p2289a.AbstractC45860a;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.module.detail.baseinfo.MediaType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import com.ss.android.lark.mm.module.detail.menu.MmDetailMenuFactory;
import com.ss.android.lark.mm.module.detail.menu.MmMenu;
import com.ss.android.lark.mm.module.detail.menu.MmMenuType;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.p2290c.C45865a;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\tH\u0016J\u001a\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/widget/MoreMenuDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "url", "", "dependency", "Lcom/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$IMenuDependency;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/detail/menu/MmDetailMenuFactory$IMenuDependency;)V", "exitTranslate", "Lkotlin/Function0;", "", "getExitTranslate", "()Lkotlin/jvm/functions/Function0;", "setExitTranslate", "(Lkotlin/jvm/functions/Function0;)V", "renameCallback", "Lcom/ss/android/lark/mm/base/repo/IMmDataCallback;", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "startTranslate", "getStartTranslate", "setStartTranslate", "getUrl", "()Ljava/lang/String;", "initRecyclerView", "initTitle", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "MoreAdapter", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.f */
public final class MoreMenuDialog extends BaseDialog {

    /* renamed from: c */
    public final MmDetailMenuFactory.IMenuDependency f118861c;

    /* renamed from: d */
    private Function0<Unit> f118862d;

    /* renamed from: e */
    private Function0<Unit> f118863e;

    /* renamed from: f */
    private final AbstractC45860a<MinutesSummaryData> f118864f = new C47153d(this);

    /* renamed from: g */
    private final String f118865g;

    /* renamed from: h */
    private HashMap f118866h;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f118866h == null) {
            this.f118866h = new HashMap();
        }
        View view = (View) this.f118866h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118866h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f118866h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* renamed from: g */
    public final Function0<Unit> mo165771g() {
        return this.f118862d;
    }

    /* renamed from: h */
    public final Function0<Unit> mo165772h() {
        return this.f118863e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/widget/MoreMenuDialog$MoreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "items", "", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "menuList", "", "MoreViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.f$a */
    public static final class MoreAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        private final List<MmMenu> f118867a = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f118867a.size();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/widget/MoreMenuDialog$MoreAdapter$MoreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/widget/MmMenuView;", "(Lcom/ss/android/lark/mm/widget/MmMenuView;)V", "menuView", "bindData", "", "menu", "Lcom/ss/android/lark/mm/module/detail/menu/MmMenu;", "isLastPosition", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.widget.f$a$a */
        public static final class MoreViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            private MmMenuView f118868a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public MoreViewHolder(MmMenuView mmMenuView) {
                super(mmMenuView);
                Intrinsics.checkParameterIsNotNull(mmMenuView, "view");
                this.f118868a = mmMenuView;
            }

            /* renamed from: a */
            public final void mo165774a(MmMenu cVar, boolean z) {
                Intrinsics.checkParameterIsNotNull(cVar, "menu");
                this.f118868a.mo165617a(cVar, z, "detail_menu");
            }
        }

        /* renamed from: a */
        public final void mo165773a(List<MmMenu> list) {
            Intrinsics.checkParameterIsNotNull(list, "menuList");
            this.f118867a.clear();
            this.f118867a.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            return new MoreViewHolder(new MmMenuView(context));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            if (viewHolder instanceof MoreViewHolder) {
                MoreViewHolder aVar = (MoreViewHolder) viewHolder;
                MmMenu cVar = this.f118867a.get(i);
                boolean z = true;
                if (i != getItemCount() - 1) {
                    z = false;
                }
                aVar.mo165774a(cVar, z);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C45861b.m181700a().f115693d.mo161178b(this.f118864f);
    }

    /* renamed from: i */
    private final void m186799i() {
        boolean z;
        int i;
        String str;
        Resources resources;
        MmBaseInfo d = this.f118861c.mo161959d();
        boolean z2 = true;
        if (MediaType.Companion.mo161472a(d.getMediaType()) == MediaType.Video) {
            z = true;
        } else {
            z = false;
        }
        Avatar avatar = (Avatar) mo142944a(R.id.ivIcon);
        if (z) {
            i = R.drawable.mm_ic_list_video;
        } else {
            i = R.drawable.mm_ic_list_audio;
        }
        avatar.setImageResource(i);
        String videoCover = d.getVideoCover();
        if (videoCover != null) {
            C45853e.m181660b((Avatar) mo142944a(R.id.ivIcon), videoCover);
        }
        BoldTextView boldTextView = (BoldTextView) mo142944a(R.id.tvTopic);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTopic");
        String topic = d.getTopic();
        if (topic == null) {
            topic = "";
        }
        boldTextView.setText(topic);
        C45861b.m181700a().f115693d.mo161174a((AbstractC45860a) this.f118864f);
        MmBaseInfo.OwnerInfo ownerInfo = d.getOwnerInfo();
        Intrinsics.checkExpressionValueIsNotNull(ownerInfo, "baseInfo.ownerInfo");
        String userName = ownerInfo.getUserName();
        String str2 = userName;
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            BoldTextView boldTextView2 = (BoldTextView) mo142944a(R.id.tvSubtitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvSubtitle");
            boldTextView2.setVisibility(8);
        } else {
            BoldTextView boldTextView3 = (BoldTextView) mo142944a(R.id.tvSubtitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvSubtitle");
            boldTextView3.setVisibility(0);
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.MMWeb_G_OwnerColon);
            }
            BoldTextView boldTextView4 = (BoldTextView) mo142944a(R.id.tvSubtitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvSubtitle");
            boldTextView4.setText(str + userName);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo142944a(R.id.actionClose);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "actionClose");
        C47110e.m186573a(appCompatImageView, new C47152c(this));
    }

    /* renamed from: j */
    private final void m186800j() {
        RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.panelView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "panelView");
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo142944a(R.id.panelView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "panelView");
        recyclerView2.setAdapter(new MoreAdapter());
        ArrayList arrayList = new ArrayList();
        arrayList.add(MmDetailMenuFactory.f116169a.mo161949a(MmMenuType.MoreDetails, this, this.f118865g, this.f118861c));
        if (this.f118861c.mo161963h()) {
            arrayList.add(MmDetailMenuFactory.f116169a.mo161949a(MmMenuType.Comment, this, this.f118865g, this.f118861c));
        }
        if (this.f118861c.mo161959d().isCanModify()) {
            arrayList.add(MmDetailMenuFactory.f116169a.mo161949a(MmMenuType.RENAME, this, this.f118865g, this.f118861c));
        }
        if (this.f118861c.mo161959d().getReviewStatus() == ReviewStatus.Passed.getValue() && (C45865a.m181718a() || this.f118861c.mo161959d().isAllowShare())) {
            arrayList.add(MmDetailMenuFactory.f116169a.mo161949a(MmMenuType.Share, this, this.f118865g, this.f118861c));
        }
        arrayList.add(MmDetailMenuFactory.f116169a.mo161949a(MmMenuType.Translate, this, this.f118865g, this.f118861c));
        if (this.f118861c.mo161959d().isCanModify() && C45865a.m181721d()) {
            arrayList.add(MmDetailMenuFactory.f116169a.mo161949a(MmMenuType.EditSpeaker, this, this.f118865g, this.f118861c));
        }
        if (this.f118861c.mo161959d().isOwner()) {
            SettingGroupLayout settingGroupLayout = (SettingGroupLayout) mo142944a(R.id.deleteMenu);
            Intrinsics.checkExpressionValueIsNotNull(settingGroupLayout, "deleteMenu");
            settingGroupLayout.setVisibility(0);
            ((SettingGroupLayout) mo142944a(R.id.deleteMenu)).setItemBackgroundColor(R.color.mm_bg_setting_group_item);
            SettingGroupLayout settingGroupLayout2 = (SettingGroupLayout) mo142944a(R.id.deleteMenu);
            Intrinsics.checkExpressionValueIsNotNull(settingGroupLayout2, "deleteMenu");
            C47110e.m186573a(settingGroupLayout2, new C47151b(this));
        }
        RecyclerView recyclerView3 = (RecyclerView) mo142944a(R.id.panelView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "panelView");
        RecyclerView.Adapter adapter = recyclerView3.getAdapter();
        if (adapter != null) {
            ((MoreAdapter) adapter).mo165773a(arrayList);
            RecyclerView recyclerView4 = (RecyclerView) mo142944a(R.id.panelView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "panelView");
            SettingGroupHelper.m88814a(recyclerView4, false, R.color.mm_bg_setting_group_item);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.widget.MoreMenuDialog.MoreAdapter");
    }

    /* renamed from: a */
    public final void mo165769a(Function0<Unit> function0) {
        this.f118862d = function0;
    }

    /* renamed from: b */
    public final void mo165770b(Function0<Unit> function0) {
        this.f118863e = function0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.f$b */
    public static final class C47151b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MoreMenuDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47151b(MoreMenuDialog fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            Context context = this.this$0.getContext();
            if (context != null) {
                C47083e.m186423a(context, "vc_minutes_detail_more_click", C47086i.m186432a().mo165422d("delete").mo165423e("vc_minutes_delete_view").mo165421c());
                MmDetailMenuFactory aVar = MmDetailMenuFactory.f116169a;
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                MoreMenuDialog fVar = this.this$0;
                aVar.mo161950a(context, fVar, fVar.f118861c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.f$c */
    public static final class C47152c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MoreMenuDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47152c(MoreMenuDialog fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.f$d */
    static final class C47153d<T> implements AbstractC45860a<MinutesSummaryData> {

        /* renamed from: a */
        final /* synthetic */ MoreMenuDialog f118869a;

        C47153d(MoreMenuDialog fVar) {
            this.f118869a = fVar;
        }

        /* renamed from: a */
        public final void mo161173a(final MinutesSummaryData minutesSummaryData) {
            C45859k.m181686a(new Runnable(this) {
                /* class com.ss.android.lark.mm.widget.MoreMenuDialog.C47153d.RunnableC471541 */

                /* renamed from: a */
                final /* synthetic */ C47153d f118870a;

                {
                    this.f118870a = r1;
                }

                public final void run() {
                    if (((BoldTextView) this.f118870a.f118869a.mo142944a(R.id.tvTopic)) != null) {
                        BoldTextView boldTextView = (BoldTextView) this.f118870a.f118869a.mo142944a(R.id.tvTopic);
                        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTopic");
                        boldTextView.setText(minutesSummaryData.getTopic());
                    }
                }
            }, 100);
        }
    }

    public MoreMenuDialog(String str, MmDetailMenuFactory.IMenuDependency aVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f118865g = str;
        this.f118861c = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m186799i();
        m186800j();
        C47083e.m186423a(requireContext(), "vc_minutes_detail_more_view", C47086i.m186432a().mo165421c());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_dialog_more, viewGroup, false);
    }
}
