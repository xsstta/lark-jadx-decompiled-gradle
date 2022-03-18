package com.ss.android.lark.team.picker.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.LifecycleOwnerPiece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.constants.PickerUseCategory;
import com.ss.android.lark.search.widget.constants.PickerUsePage;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.team.picker.TeamPickerViewModel;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0003\u0006\t\u000e\b&\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020\u001dH&J\u0018\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0013H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001d0.2\u0006\u0010)\u001a\u00020\u0013H&J\b\u0010/\u001a\u00020(H\u0016J\b\u00100\u001a\u00020&H\u0016J\b\u00101\u001a\u00020&H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00063"}, d2 = {"Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece;", "Lcom/ss/android/lark/piece/core/LifecycleOwnerPiece;", "()V", "chatPicker", "Lcom/ss/android/lark/search/widget/ChatterPicker;", "onBusinessConsumeItem", "com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$onBusinessConsumeItem$1", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece$onBusinessConsumeItem$1;", "onPickerParamsLoader", "com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$onPickerParamsLoader$1", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece$onPickerParamsLoader$1;", "pickerCenterView", "Landroid/view/View;", "pickerViewDependency", "com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$pickerViewDependency$1", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece$pickerViewDependency$1;", "selectedItemsObserver", "Landroidx/lifecycle/Observer;", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "viewModel", "Lcom/ss/android/lark/team/picker/TeamPickerViewModel;", "getViewModel", "()Lcom/ss/android/lark/team/picker/TeamPickerViewModel;", "setViewModel", "(Lcom/ss/android/lark/team/picker/TeamPickerViewModel;)V", "getChatterPickerParamsBuilder", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;", "getPickerCenterCustomTextResId", "", "getPickerCenterCustomView", "getSearchHintResId", "getView", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "initChatPicker", "", "interceptClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isSupportDepartment", "isSupportMultiple", "isSupportSearchChatter", "isUnsupportedGroupType", "Lkotlin/Pair;", "onBackPressed", "onCreate", "onDestroy", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseTeamPickerPiece extends LifecycleOwnerPiece<BaseTeamPickerPiece> {

    /* renamed from: g */
    public static final Companion f137286g = new Companion(null);

    /* renamed from: a */
    private TeamPickerViewModel f137287a;

    /* renamed from: b */
    public View f137288b;

    /* renamed from: h */
    private ChatterPicker f137289h;

    /* renamed from: i */
    private final AbstractC1178x<List<SearchBaseInfo>> f137290i = new C55656f(this);

    /* renamed from: j */
    private final C55655e f137291j = new C55655e(this);

    /* renamed from: k */
    private final C55654d f137292k = new C55654d(this);

    /* renamed from: l */
    private final C55653c f137293l = new C55653c(this);

    /* renamed from: a */
    public abstract Pair<Boolean, Integer> mo189639a(SearchBaseInfo searchBaseInfo);

    /* renamed from: a */
    public boolean mo189661a(Context context, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return false;
    }

    /* renamed from: b */
    public abstract int mo189636b();

    public abstract int bp_();

    /* renamed from: d */
    public abstract ChatterPickerParams.Builder mo189641d();

    /* renamed from: f */
    public boolean mo189663f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo189664g() {
        return true;
    }

    /* renamed from: h */
    public boolean mo189665h() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final TeamPickerViewModel mo189662e() {
        return this.f137287a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$pickerViewDependency$1", "Lcom/ss/android/lark/search/widget/BasePicker$IViewDependency;", "getActivity", "Landroid/app/Activity;", "getFragmentManager", "Landroidx/fragment/app/FragmentManager;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerPiece$e */
    public static final class C55655e implements BasePicker.IViewDependency {

        /* renamed from: a */
        final /* synthetic */ BaseTeamPickerPiece f137297a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: c */
        public FragmentManager mo110057c() {
            return this.f137297a.mo177211y();
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
        /* renamed from: b */
        public Activity mo110056b() {
            Context C = this.f137297a.mo177180C();
            if (!(C instanceof Activity)) {
                C = null;
            }
            return (Activity) C;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55655e(BaseTeamPickerPiece baseTeamPickerPiece) {
            this.f137297a = baseTeamPickerPiece;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$onPickerParamsLoader$1", "Lcom/ss/android/lark/search/widget/BasePicker$OnPickerParamsLoader;", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "onLoadPickerParams", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerPiece$d */
    public static final class C55654d implements BasePicker.OnPickerParamsLoader<ChatterPickerParams> {

        /* renamed from: a */
        final /* synthetic */ BaseTeamPickerPiece f137296a;

        /* renamed from: a */
        public ChatterPickerParams onLoadPickerParams() {
            return this.f137296a.mo189641d().mo183675g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55654d(BaseTeamPickerPiece baseTeamPickerPiece) {
            this.f137296a = baseTeamPickerPiece;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: A */
    public boolean mo177178A() {
        ChatterPicker chatterPicker = this.f137289h;
        if (chatterPicker != null && chatterPicker.mo183501f()) {
            mo177212z();
        }
        return true;
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        ChatterPicker chatterPicker = this.f137289h;
        if (chatterPicker != null) {
            chatterPicker.mo183601l();
        }
        super.onDestroy();
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        TeamPickerViewModel bVar = (TeamPickerViewModel) mo177183a(TeamPickerViewModel.class);
        this.f137287a = bVar;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.getSelectedItems().mo5923a(this, this.f137290i);
        m215626i();
    }

    /* renamed from: i */
    private final void m215626i() {
        List<SearchBaseInfo> preSelectedList;
        ChatterPicker chatterPicker;
        ChatterPicker chatterPicker2 = this.f137289h;
        if (chatterPicker2 != null) {
            if (chatterPicker2 == null) {
                Intrinsics.throwNpe();
            }
            ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) chatterPicker2.mo183563a(PickerUsePage.UNKNOWN)).mo183562a(PickerUseCategory.UNKNOWN)).mo183558a(m215627j())).mo183570b(mo189636b())).mo183604p(mo189663f())).mo183561a(this.f137292k)).mo183559a(new C55652b(this))).mo183492b(false)).mo183496d(false)).mo183480a(false)).mo183494c(true)).mo183518n(false)).mo183498e(mo189664g())).mo183560a(this.f137291j)).mo183565a(this.f137293l)).mo183624t(false)).mo183513i(true).mo183512h(!mo189665h()).mo183515k(true).mo183483a();
            TeamPickerViewModel bVar = this.f137287a;
            if (bVar != null && (preSelectedList = bVar.getPreSelectedList()) != null && (chatterPicker = this.f137289h) != null) {
                chatterPicker.mo183577d(preSelectedList);
            }
        }
    }

    /* renamed from: j */
    private final View m215627j() {
        FrameLayout frameLayout = new FrameLayout(mo177180C());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, C57582a.m223600a(40)));
        frameLayout.setBackgroundColor(C57582a.m223616d(frameLayout.getContext(), R.color.bg_base));
        TextView textView = new TextView(frameLayout.getContext());
        int bp_ = bp_();
        Context context = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setText(C51468a.m199493c(bp_, context));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        layoutParams.setMarginStart(C57582a.m223600a(16));
        layoutParams.bottomMargin = C57582a.m223600a(3);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(14.0f);
        textView.setTextColor(C57582a.m223616d(textView.getContext(), R.color.text_placeholder));
        frameLayout.addView(textView);
        View view = new View(frameLayout.getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, C57582a.m223601a(view.getContext(), 0.5f)));
        view.setBackgroundColor(C57582a.m223616d(view.getContext(), R.color.line_divider_default));
        frameLayout.addView(view);
        FrameLayout frameLayout2 = frameLayout;
        this.f137288b = frameLayout2;
        if (frameLayout2 == null) {
            Intrinsics.throwNpe();
        }
        return frameLayout2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$initChatPicker$1", "Lcom/ss/android/lark/search/widget/BasePicker$IOnPickNotify;", "onChanged", "", "ids", "", "", "infoList", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onSelected", "id", "info", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerPiece$b */
    public static final class C55652b extends BasePicker.IOnPickNotify {

        /* renamed from: a */
        final /* synthetic */ BaseTeamPickerPiece f137294a;

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55652b(BaseTeamPickerPiece baseTeamPickerPiece) {
            this.f137294a = baseTeamPickerPiece;
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            Intrinsics.checkParameterIsNotNull(list, "ids");
            Intrinsics.checkParameterIsNotNull(list2, "infoList");
            TeamPickerViewModel e = this.f137294a.mo189662e();
            if (e != null) {
                e.updateListChanged(list, list2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/team/picker/base/BaseTeamPickerPiece$onBusinessConsumeItem$1", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$IOnBusinessConsumeItem;", "onBusinessBindItemCheckBox", "Lcom/ss/android/lark/searchcommon/view/SearchResultView$CheckBoxBindStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBusinessConsumeItemClick", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerPiece$c */
    public static final class C55653c implements SearchResultView.IOnBusinessConsumeItem {

        /* renamed from: a */
        final /* synthetic */ BaseTeamPickerPiece f137295a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55653c(BaseTeamPickerPiece baseTeamPickerPiece) {
            this.f137295a = baseTeamPickerPiece;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: a */
        public SearchResultView.CheckBoxBindStatus mo110048a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Log.m165379d("BaseTeamPickerPiece", "onBusinessBindItemCheckBox: " + searchBaseInfo.getId());
            TeamPickerViewModel e = this.f137295a.mo189662e();
            if (e != null) {
                String id = searchBaseInfo.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
                if (e.isPreSelected(id)) {
                    return new SearchResultView.CheckBoxBindStatus(true, true, false);
                }
            }
            if ((searchBaseInfo instanceof SearchChatterInfo) && ((SearchChatterInfo) searchBaseInfo).isInChat()) {
                return new SearchResultView.CheckBoxBindStatus(true, true, false);
            }
            if (this.f137295a.mo189639a(searchBaseInfo).getFirst().booleanValue()) {
                return new SearchResultView.CheckBoxBindStatus(true, false, false);
            }
            return new SearchResultView.CheckBoxBindStatus(false, false, true);
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
        /* renamed from: b */
        public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            TeamPickerViewModel e = this.f137295a.mo189662e();
            if (e != null) {
                String id = searchBaseInfo.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
                if (e.isPreSelected(id)) {
                    return true;
                }
            }
            Log.m165379d("BaseTeamPickerPiece", "onBusinessConsumeItemClick: " + searchBaseInfo.getId());
            if (this.f137295a.mo189639a(searchBaseInfo).getFirst().booleanValue()) {
                Context context = this.f137295a.mo177205s().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "contentView.context");
                UDToast.makeToast(context, this.f137295a.mo189639a(searchBaseInfo).getSecond().intValue()).show();
                return true;
            }
            BaseTeamPickerPiece baseTeamPickerPiece = this.f137295a;
            Context context2 = baseTeamPickerPiece.mo177205s().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "contentView.context");
            return baseTeamPickerPiece.mo189661a(context2, searchBaseInfo);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "t", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.base.BaseTeamPickerPiece$f */
    static final class C55656f<T> implements AbstractC1178x<List<? extends SearchBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ BaseTeamPickerPiece f137298a;

        C55656f(BaseTeamPickerPiece baseTeamPickerPiece) {
            this.f137298a = baseTeamPickerPiece;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends SearchBaseInfo> list) {
            boolean z;
            View view = this.f137298a.f137288b;
            if (view != null) {
                List<? extends SearchBaseInfo> list2 = list;
                int i = 0;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        ChatterPicker chatterPicker = new ChatterPicker(context);
        this.f137289h = chatterPicker;
        if (chatterPicker == null) {
            Intrinsics.throwNpe();
        }
        return chatterPicker;
    }
}
