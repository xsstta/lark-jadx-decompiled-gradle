package com.ss.android.lark.team.picker.add_member;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.team.entity.PutTeamMemberResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.picker.TeamPickerViewModel;
import com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/picker/add_member/AddMemberPickerTitlePiece;", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerTitlePiece;", "()V", "action", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "selectCountObserver", "Landroidx/lifecycle/Observer;", "Lkotlin/Triple;", "", "selectedItemsObserver", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "viewModel", "Lcom/ss/android/lark/team/picker/TeamPickerViewModel;", "addTeamMember", "", "list", "Lcom/ss/android/lark/team/entity/PickEntities;", "getAction", "context", "Landroid/content/Context;", "getTitleResId", "onAddFailed", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onCreate", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddMemberPickerTitlePiece extends BaseTeamPickerTitlePiece {

    /* renamed from: g */
    public static final Companion f137274g = new Companion(null);

    /* renamed from: a */
    public TeamPickerViewModel f137275a;

    /* renamed from: b */
    public IActionTitlebar.Action f137276b;

    /* renamed from: i */
    private final AbstractC1178x<List<SearchBaseInfo>> f137277i = new C55651f(this);

    /* renamed from: j */
    private final AbstractC1178x<Triple<Integer, Integer, Integer>> f137278j = new C55650e(this);

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece
    /* renamed from: a */
    public int mo189638a() {
        return R.string.Project_MV_TeamMembersAdd;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/picker/add_member/AddMemberPickerTitlePiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        TeamPickerViewModel bVar = (TeamPickerViewModel) mo177183a(TeamPickerViewModel.class);
        bVar.setup();
        AddMemberPickerTitlePiece addMemberPickerTitlePiece = this;
        bVar.getSelectedItems().mo5923a(addMemberPickerTitlePiece, this.f137277i);
        bVar.getSelectedCount().mo5923a(addMemberPickerTitlePiece, this.f137278j);
        this.f137275a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/picker/add_member/AddMemberPickerTitlePiece$getAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$c */
    public static final class C55648c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ AddMemberPickerTitlePiece f137281a;

        /* renamed from: b */
        final /* synthetic */ Context f137282b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            TeamPickerViewModel bVar = this.f137281a.f137275a;
            if (bVar != null) {
                KeyboardUtils.hideKeyboard(this.f137281a.mo177180C());
                this.f137281a.mo189644a(bVar.getSelectedPickEntities());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55648c(AddMemberPickerTitlePiece addMemberPickerTitlePiece, Context context, String str, int i, int i2) {
            super(str, i, i2);
            this.f137281a = addMemberPickerTitlePiece;
            this.f137282b = context;
        }
    }

    @Override // com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece
    /* renamed from: a */
    public IActionTitlebar.Action mo189642a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C55648c cVar = new C55648c(this, context, C51468a.m199493c(R.string.Project_MV_ButtonsAddHere, context), R.color.create_team_action, 16);
        this.f137276b = cVar;
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/picker/add_member/AddMemberPickerTitlePiece$addTeamMember$1$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PutTeamMemberResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$b */
    public static final class C55647b implements IGetDataCallback<PutTeamMemberResponse> {

        /* renamed from: a */
        final /* synthetic */ AddMemberPickerTitlePiece f137279a;

        /* renamed from: b */
        final /* synthetic */ List f137280b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("AddMemberPickerTitlePiece", "addTeamMember err", errorResult);
            View viewByAction = this.f137279a.mo189669b().getViewByAction(this.f137279a.f137276b);
            if (viewByAction != null) {
                viewByAction.setEnabled(true);
            }
            AddMemberPickerTitlePiece addMemberPickerTitlePiece = this.f137279a;
            addMemberPickerTitlePiece.mo189643a(addMemberPickerTitlePiece.mo177180C(), errorResult);
        }

        /* renamed from: a */
        public void onSuccess(PutTeamMemberResponse putTeamMemberResponse) {
            Team team;
            Log.m165389i("AddMemberPickerTitlePiece", "addTeamMember success");
            UDToast.show(this.f137279a.mo177180C(), (int) R.string.Project_MV_AddedSuccessfully);
            View viewByAction = this.f137279a.mo189669b().getViewByAction(this.f137279a.f137276b);
            if (viewByAction != null) {
                viewByAction.setEnabled(true);
            }
            if (!(putTeamMemberResponse == null || (team = putTeamMemberResponse.getTeam()) == null)) {
                Intent intent = new Intent();
                intent.putExtra("result_team", team);
                this.f137279a.mo177185a(-1, intent);
            }
            this.f137279a.mo177212z();
        }

        C55647b(AddMemberPickerTitlePiece addMemberPickerTitlePiece, List list) {
            this.f137279a = addMemberPickerTitlePiece;
            this.f137280b = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "t", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$f */
    static final class C55651f<T> implements AbstractC1178x<List<? extends SearchBaseInfo>> {

        /* renamed from: a */
        final /* synthetic */ AddMemberPickerTitlePiece f137285a;

        C55651f(AddMemberPickerTitlePiece addMemberPickerTitlePiece) {
            this.f137285a = addMemberPickerTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(List<? extends SearchBaseInfo> list) {
            View viewByAction;
            boolean z;
            CommonTitleBar b = this.f137285a.mo189669b();
            if (b != null && (viewByAction = b.getViewByAction(this.f137285a.f137276b)) != null) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189644a(java.util.List<? extends com.ss.android.lark.team.entity.PickEntities> r6) {
        /*
            r5 = this;
            com.ss.android.lark.piece.a.c r0 = r5.mo177203q()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x0056
            com.ss.android.lark.ui.CommonTitleBar r1 = r5.mo189669b()
            com.ss.android.lark.ui.IActionTitlebar$Action r2 = r5.f137276b
            android.view.View r1 = r1.getViewByAction(r2)
            if (r1 == 0) goto L_0x0030
            r2 = 0
            r1.setEnabled(r2)
        L_0x0030:
            com.larksuite.framework.callback.CallbackManager r1 = r5.mo177209w()
            com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$b r2 = new com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$b
            r2.<init>(r5, r6)
            com.larksuite.framework.callback.IGetDataCallback r2 = (com.larksuite.framework.callback.IGetDataCallback) r2
            com.larksuite.framework.callback.UIGetDataCallback r1 = r1.wrapAndAddGetDataCallback(r2)
            java.lang.String r2 = "AddMemberPickerTitlePiece"
            java.lang.String r3 = "addTeamMember"
            com.ss.android.lark.log.Log.m165389i(r2, r3)
            com.ss.android.lark.team.d.b r2 = com.ss.android.lark.team.service.TeamService.f136826a
            long r3 = r0.getId()
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            com.larksuite.framework.callback.IGetDataCallback r1 = (com.larksuite.framework.callback.IGetDataCallback) r1
            r2.mo189078b(r3, r6, r1)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece.mo189644a(java.util.List):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "countList", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$e */
    static final class C55650e<T> implements AbstractC1178x<Triple<? extends Integer, ? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ AddMemberPickerTitlePiece f137284a;

        C55650e(AddMemberPickerTitlePiece addMemberPickerTitlePiece) {
            this.f137284a = addMemberPickerTitlePiece;
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
            CommonTitleBar b = this.f137284a.mo189669b();
            StringBuilder sb = new StringBuilder();
            Context context = b.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            sb.append(C51468a.m199493c(R.string.Project_MV_TeamMembersAdd, context));
            sb.append(str4);
            b.setTitle(sb.toString());
            if (str4.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            b.setSubTitleVisible(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece$d */
    public static final class DialogInterface$OnClickListenerC55649d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55649d f137283a = new DialogInterface$OnClickListenerC55649d();

        DialogInterface$OnClickListenerC55649d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo189643a(Context context, ErrorResult errorResult) {
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg == null) {
            displayMsg = C57582a.m223604a(context, (int) R.string.Lark_Legacy_NetworkErrorRetry);
        }
        Intrinsics.checkExpressionValueIsNotNull(displayMsg, "message");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Project_MV_CannotAddTeamMembersNow)).message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC55649d.f137283a)).show();
    }
}
