package com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelContentViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelContentModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MultiLevelMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceDisplayStatus;
import com.ss.android.lark.calendar.impl.p1436a.C30067a;
import com.ss.android.lark.calendar.impl.utils.an;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001cH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/AppendMultiLevelViewControl;", "", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "resourceAppendViewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelViewModel;", "resourceAppendFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "(Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelViewModel;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;)V", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "getResourceAppendFragment", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "getResourceAppendViewModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelViewModel;", "setResourceAppendViewModel", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/MultiLevelViewModel;)V", "initListener", "", "initLiveData", "initView", "refreshMultiResource", "displayData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$MultiLevelDisplayStatus;", "refreshSearchView", "searchResultDisplayStatus", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$SearchResultDisplayStatus;", "updateSelectAllContainer", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a */
public final class AppendMultiLevelViewControl {

    /* renamed from: a */
    private final C30067a f81879a;

    /* renamed from: b */
    private MultiLevelViewModel f81880b;

    /* renamed from: c */
    private final ResourceAppendFragment f81881c;

    /* renamed from: a */
    public final C30067a mo116920a() {
        return this.f81879a;
    }

    /* renamed from: b */
    public final MultiLevelViewModel mo116924b() {
        return this.f81880b;
    }

    /* renamed from: c */
    public final ResourceAppendFragment mo116925c() {
        return this.f81881c;
    }

    /* renamed from: d */
    private final void m121864d() {
        MultiLevelView multiLevelView = this.f81879a.f74921m;
        Intrinsics.checkExpressionValueIsNotNull(multiLevelView, "binding.multiLevelView");
        an.m125213a((View) multiLevelView, true);
    }

    /* renamed from: e */
    private final void m121865e() {
        this.f81880b.getResourceDisplayStatus().mo5923a(this.f81881c.getViewLifecycleOwner(), new C32011f(this));
        this.f81880b.getCachePbMultiLevelData().mo5923a(this.f81881c, new C32012g(this));
    }

    /* renamed from: f */
    private final void m121866f() {
        this.f81879a.f74921m.mo116916a(new C32009d(this), new C32008c(this), new C32010e(this), new C32007b(this));
        this.f81879a.f74921m.setBreadCrumbsListener(new C32006a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/AppendMultiLevelViewControl$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "onItemClick", "", "item", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$a */
    public static final class C32006a implements LevelBreadcrumbsView.IBreadcrumbsListener {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81882a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32006a(AppendMultiLevelViewControl aVar) {
            this.f81882a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView.IBreadcrumbsListener
        /* renamed from: a */
        public void mo112234a(MultiLevelNode bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            this.f81882a.mo116924b().onBreadcrumbItemClicked(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/AppendMultiLevelViewControl$initListener$itemClickListener$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "onItemClicked", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$b */
    public static final class C32007b implements ResourceDisplayAdapter.IBaseActionListener {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81883a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32007b(AppendMultiLevelViewControl aVar) {
            this.f81883a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter.IBaseActionListener
        /* renamed from: a */
        public void mo116707a(BaseModel baseModel) {
            Intrinsics.checkParameterIsNotNull(baseModel, "model");
            if (baseModel instanceof LoadMoreModel) {
                this.f81883a.mo116924b().onSearchLoadMoreClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/AppendMultiLevelViewControl$initListener$levelContentListener$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelContentViewHolder$IActionListener;", "onArrowClick", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelContentModel;", "onMultipleSelectClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$c */
    public static final class C32008c implements MultiLevelContentViewHolder.IActionListener {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81884a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32008c(AppendMultiLevelViewControl aVar) {
            this.f81884a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelContentViewHolder.IActionListener
        /* renamed from: b */
        public void mo116741b(MultiLevelContentModel fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "clickBuildingModel");
            this.f81884a.mo116924b().onMultiLevelContentClicked(fVar.mo116802b());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelContentViewHolder.IActionListener
        /* renamed from: a */
        public void mo116740a(MultiLevelContentModel fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "clickBuildingModel");
            FrameLayout a = this.f81884a.mo116920a().mo108413a();
            Intrinsics.checkExpressionValueIsNotNull(a, "binding.root");
            KeyboardUtils.hideKeyboard(a.getContext());
            this.f81884a.mo116924b().onMultiLevelArrowClicked(fVar.mo116802b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/AppendMultiLevelViewControl$initListener$roomListener$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MultiLevelMeetingRoomViewHolder$IActionListener;", "onItemClick", "", "roomModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MultiLevelMeetingRoomModel;", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$d */
    public static final class C32009d implements MultiLevelMeetingRoomViewHolder.IActionListener {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81885a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32009d(AppendMultiLevelViewControl aVar) {
            this.f81885a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelMeetingRoomViewHolder.IActionListener
        /* renamed from: a */
        public void mo116749a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            this.f81885a.mo116925c().mo116911a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MultiLevelMeetingRoomViewHolder.IActionListener
        /* renamed from: a */
        public void mo116748a(MultiLevelMeetingRoomModel gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "roomModel");
            KeyboardUtils.hideKeyboard(this.f81885a.mo116925c().getContext());
            this.f81885a.mo116924b().onMultiMeetingRoomClicked(gVar.mo116811g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/multilevel/AppendMultiLevelViewControl$initListener$searchMeetingRoomAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "onClickInfoIcon", "", "resourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "onSelectMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$e */
    public static final class C32010e implements MeetingRoomViewHolder.IActionListener {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81886a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32010e(AppendMultiLevelViewControl aVar) {
            this.f81886a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder.IActionListener
        /* renamed from: a */
        public void mo116705a(MeetingRoomModel meetingRoomModel) {
            Intrinsics.checkParameterIsNotNull(meetingRoomModel, "resourceData");
            this.f81886a.mo116924b().onSearchResourceClicked(meetingRoomModel);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder.IActionListener
        /* renamed from: b */
        public void mo116706b(MeetingRoomModel meetingRoomModel) {
            Intrinsics.checkParameterIsNotNull(meetingRoomModel, "resourceData");
            ResourceAppendFragment c = this.f81886a.mo116925c();
            String str = meetingRoomModel.mo116770g().mo116888b().calendar_id;
            if (str == null) {
                str = "";
            }
            c.mo116911a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$h */
    public static final class View$OnClickListenerC32013h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81889a;

        /* renamed from: b */
        final /* synthetic */ IBuildingContract.SelectState f81890b;

        View$OnClickListenerC32013h(AppendMultiLevelViewControl aVar, IBuildingContract.SelectState selectState) {
            this.f81889a = aVar;
            this.f81890b = selectState;
        }

        public final void onClick(View view) {
            this.f81889a.mo116924b().onSelectAllClicked(this.f81890b);
        }
    }

    /* renamed from: a */
    public final void mo116921a(ResourceDisplayStatus.MultiLevelDisplayStatus dVar) {
        this.f81879a.f74921m.mo116917a(dVar.mo116899a(), dVar.mo116900b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$g */
    public static final class C32012g<T> implements AbstractC1178x<Map<String, ? extends LevelRelatedInfo>> {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81888a;

        C32012g(AppendMultiLevelViewControl aVar) {
            this.f81888a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Map<String, LevelRelatedInfo> map) {
            ResourceAppendFragment.IBuildingFragmentAction b = this.f81888a.mo116925c().mo116913b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(map, "it");
                b.mo114354a(map);
            }
        }
    }

    /* renamed from: a */
    public final void mo116922a(ResourceDisplayStatus.SearchResultDisplayStatus eVar) {
        this.f81879a.f74921m.mo116918a(eVar.mo116904b());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.a$f */
    public static final class C32011f<T> implements AbstractC1178x<ResourceDisplayStatus> {

        /* renamed from: a */
        final /* synthetic */ AppendMultiLevelViewControl f81887a;

        C32011f(AppendMultiLevelViewControl aVar) {
            this.f81887a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ResourceDisplayStatus dVar) {
            if (dVar instanceof ResourceDisplayStatus.MultiLevelDisplayStatus) {
                this.f81887a.mo116921a((ResourceDisplayStatus.MultiLevelDisplayStatus) dVar);
            } else if (dVar instanceof ResourceDisplayStatus.SearchResultDisplayStatus) {
                this.f81887a.mo116922a((ResourceDisplayStatus.SearchResultDisplayStatus) dVar);
            }
            AppendMultiLevelViewControl aVar = this.f81887a;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "it");
            aVar.mo116923a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo116923a(ResourceDisplayStatus dVar) {
        RelativeLayout relativeLayout = this.f81879a.f74927s;
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "binding.selectAllContainer");
        boolean z = dVar instanceof ResourceDisplayStatus.MultiLevelDisplayStatus;
        an.m125213a(relativeLayout, z);
        if (z) {
            IBuildingContract.SelectState d = ((ResourceDisplayStatus.MultiLevelDisplayStatus) dVar).mo116902d();
            this.f81879a.f74927s.setOnClickListener(new View$OnClickListenerC32013h(this, d));
            this.f81879a.f74926r.mo115963a(d);
        }
    }

    public AppendMultiLevelViewControl(C30067a aVar, MultiLevelViewModel bVar, ResourceAppendFragment eVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "binding");
        Intrinsics.checkParameterIsNotNull(bVar, "resourceAppendViewModel");
        Intrinsics.checkParameterIsNotNull(eVar, "resourceAppendFragment");
        this.f81879a = aVar;
        this.f81880b = bVar;
        this.f81881c = eVar;
        m121864d();
        m121866f();
        m121865e();
    }
}
