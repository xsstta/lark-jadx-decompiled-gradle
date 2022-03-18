package com.ss.android.lark.team.picker.create_team;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.team.entity.PickEntities;
import com.ss.android.lark.team.entity.PutTeamMemberResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.picker.TeamPickerViewModel;
import com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece;
import com.ss.android.lark.team.service.TeamService;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/team/picker/create_team/CreateTeamPickerTitlePiece;", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerTitlePiece;", "()V", "action", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "selectCountObserver", "Landroidx/lifecycle/Observer;", "Lkotlin/Triple;", "", "selectedItemsObserver", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "viewModel", "Lcom/ss/android/lark/team/picker/TeamPickerViewModel;", "addTeamMember", "", "getAction", "context", "Landroid/content/Context;", "getTitleResId", "getView", "Landroid/view/View;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onAddFailed", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onCreate", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamPickerTitlePiece extends BaseTeamPickerTitlePiece {

    /* renamed from: b */
    public static final Companion f137331b = new Companion(null);

    /* renamed from: a */
    public IActionTitlebar.Action f137332a;

    /* renamed from: g */
    private TeamPickerViewModel f137333g;

    /* renamed from: i */
    private final AbstractC1178x<Triple<Integer, Integer, Integer>> f137334i = new C55675f(this);

    /* renamed from: j */
    private final AbstractC1178x<List<SearchBaseInfo>> f137335j = new C55676g(this);

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece
    /* renamed from: a */
    public int mo189638a() {
        return R.string.Project_MV_TeamMembersAdd;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/picker/create_team/CreateTeamPickerTitlePiece$Companion;", "", "()V", "ERROR_CODE_WILL_OVERFLOW_AFTER_ADD_MEMBER", "", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/team/picker/create_team/CreateTeamPickerTitlePiece$addTeamMember$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PutTeamMemberResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$b */
    public static final class C55669b implements IGetDataCallback<PutTeamMemberResponse> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamPickerTitlePiece f137336a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$b$a */
        public static final class C55670a extends Lambda implements Function0<Unit> {
            final /* synthetic */ ErrorResult $err;
            final /* synthetic */ C55669b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55670a(C55669b bVar, ErrorResult errorResult) {
                super(0);
                this.this$0 = bVar;
                this.$err = errorResult;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                View viewByAction = this.this$0.f137336a.mo189669b().getViewByAction(CreateTeamPickerTitlePiece.m215674a(this.this$0.f137336a));
                if (viewByAction != null) {
                    viewByAction.setEnabled(true);
                }
                this.this$0.f137336a.mo189686a(this.$err);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$b$b */
        public static final class C55671b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C55669b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55671b(C55669b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                UDToast.show(this.this$0.f137336a.mo177180C(), (int) R.string.Project_MV_AddedSuccessfully);
                View viewByAction = this.this$0.f137336a.mo189669b().getViewByAction(CreateTeamPickerTitlePiece.m215674a(this.this$0.f137336a));
                if (viewByAction != null) {
                    viewByAction.setEnabled(true);
                }
                this.this$0.f137336a.mo177212z();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55669b(CreateTeamPickerTitlePiece createTeamPickerTitlePiece) {
            this.f137336a = createTeamPickerTitlePiece;
        }

        /* renamed from: a */
        public void onSuccess(PutTeamMemberResponse putTeamMemberResponse) {
            Log.m165389i("CreateTeamPickerTitlePiece", "addTeamMember success");
            this.f137336a.mo177192a(new C55671b(this));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("CreateTeamPickerTitlePiece", "addTeamMember err", errorResult);
            if (errorResult.getErrorCode() == 400004) {
                TeamHitPoint.m215084c();
            }
            this.f137336a.mo177192a(new C55670a(this, errorResult));
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        TeamPickerViewModel bVar = (TeamPickerViewModel) mo177183a(TeamPickerViewModel.class);
        bVar.setup();
        CreateTeamPickerTitlePiece createTeamPickerTitlePiece = this;
        bVar.getSelectedItems().mo5923a(createTeamPickerTitlePiece, this.f137335j);
        bVar.getSelectedCount().mo5923a(createTeamPickerTitlePiece, this.f137334i);
        this.f137333g = bVar;
        CommonTitleBar b = mo189669b();
        IActionTitlebar.Action action = this.f137332a;
        if (action == null) {
            Intrinsics.throwUninitializedPropertyAccessException("action");
        }
        View viewByAction = b.getViewByAction(action);
        if (viewByAction != null) {
            viewByAction.setEnabled(false);
        }
    }

    /* renamed from: d */
    public final void mo189687d() {
        List<PickEntities> selectedPickEntities;
        TeamPickerViewModel bVar;
        Team team;
        TeamPickerViewModel bVar2 = this.f137333g;
        if (bVar2 != null && (selectedPickEntities = bVar2.getSelectedPickEntities()) != null && (bVar = this.f137333g) != null && (team = bVar.getTeam()) != null) {
            CommonTitleBar b = mo189669b();
            IActionTitlebar.Action action = this.f137332a;
            if (action == null) {
                Intrinsics.throwUninitializedPropertyAccessException("action");
            }
            View viewByAction = b.getViewByAction(action);
            if (viewByAction != null) {
                viewByAction.setEnabled(false);
            }
            UIGetDataCallback wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(new C55669b(this));
            Log.m165389i("CreateTeamPickerTitlePiece", "addTeamMember");
            TeamService bVar3 = TeamService.f136826a;
            long id = team.getId();
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
            bVar3.mo189078b(id, selectedPickEntities, wrapAndAddGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/picker/create_team/CreateTeamPickerTitlePiece$getAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$c */
    public static final class C55672c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ CreateTeamPickerTitlePiece f137337a;

        /* renamed from: b */
        final /* synthetic */ Context f137338b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f137337a.mo189687d();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55672c(CreateTeamPickerTitlePiece createTeamPickerTitlePiece, Context context, String str, int i, int i2) {
            super(str, i, i2);
            this.f137337a = createTeamPickerTitlePiece;
            this.f137338b = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/picker/create_team/CreateTeamPickerTitlePiece$getView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$d */
    static final class View$OnClickListenerC55673d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateTeamPickerTitlePiece f137339a;

        View$OnClickListenerC55673d(CreateTeamPickerTitlePiece createTeamPickerTitlePiece) {
            this.f137339a = createTeamPickerTitlePiece;
        }

        public final void onClick(View view) {
            this.f137339a.mo177212z();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IActionTitlebar.Action m215674a(CreateTeamPickerTitlePiece createTeamPickerTitlePiece) {
        IActionTitlebar.Action action = createTeamPickerTitlePiece.f137332a;
        if (action == null) {
            Intrinsics.throwUninitializedPropertyAccessException("action");
        }
        return action;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "t", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$g */
    static final class C55676g<T> implements AbstractC1178x<List<? extends SearchBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamPickerTitlePiece f137342a;

        C55676g(CreateTeamPickerTitlePiece createTeamPickerTitlePiece) {
            this.f137342a = createTeamPickerTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends SearchBaseInfo> list) {
            boolean z;
            View viewByAction = this.f137342a.mo189669b().getViewByAction(CreateTeamPickerTitlePiece.m215674a(this.f137342a));
            if (viewByAction != null) {
                List<? extends SearchBaseInfo> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                viewByAction.setEnabled(!z);
            }
        }
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece
    /* renamed from: a */
    public IActionTitlebar.Action mo189642a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C55672c cVar = new C55672c(this, context, C51468a.m199493c(R.string.Project_MV_ButtonsAddHere, context), R.color.create_team_action, 16);
        this.f137332a = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("action");
        }
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "countList", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$f */
    static final class C55675f<T> implements AbstractC1178x<Triple<? extends Integer, ? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ CreateTeamPickerTitlePiece f137341a;

        C55675f(CreateTeamPickerTitlePiece createTeamPickerTitlePiece) {
            this.f137341a = createTeamPickerTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(Triple<Integer, Integer, Integer> triple) {
            String str;
            String str2;
            String str3;
            boolean z;
            String str4 = "";
            if (triple.getFirst().intValue() > 0) {
                str = UIHelper.getQuantityString(R.plurals.Lark_Groups_MobileSelectedCountMembers, triple.getFirst().intValue());
            } else {
                str = str4;
            }
            if (triple.getSecond().intValue() > 0) {
                str2 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberChatsICU, triple.getSecond().intValue());
            } else {
                str2 = str4;
            }
            if (triple.getThird().intValue() > 0) {
                str3 = UIHelper.getQuantityString(R.plurals.Lark_Legacy_NumberOrganizations, triple.getThird().intValue());
            } else {
                str3 = str4;
            }
            if (triple.getFirst().intValue() > 0 || triple.getSecond().intValue() > 0 || triple.getThird().intValue() > 0) {
                str4 = "\n" + str + str2 + str3;
            }
            this.f137341a.mo189669b().setTitle(C51468a.m199493c(R.string.Project_MV_TeamMembersAdd, this.f137341a.mo177180C()) + str4);
            CommonTitleBar b = this.f137341a.mo189669b();
            if (str4.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            b.setSubTitleVisible(z);
        }
    }

    /* renamed from: a */
    public final void mo189686a(ErrorResult errorResult) {
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C57582a.m223604a(mo177180C(), (int) R.string.Lark_Legacy_NetworkErrorRetry);
        }
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).title(R.string.Project_MV_CannotAddTeamMembersNow)).message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC55674e.f137340a)).show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece$e */
    public static final class DialogInterface$OnClickListenerC55674e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55674e f137340a = new DialogInterface$OnClickListenerC55674e();

        DialogInterface$OnClickListenerC55674e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece, com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) a;
            commonTitleBar.setLeftImageDrawable(null);
            commonTitleBar.setLeftText(R.string.Project_MV_SkipButton);
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC55673d(this));
            return commonTitleBar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ui.CommonTitleBar");
    }
}
