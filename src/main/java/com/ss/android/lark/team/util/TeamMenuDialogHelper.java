package com.ss.android.lark.team.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.page.create_chat.CreateTeamChatActivity;
import com.ss.android.lark.team.page.setting.TeamSettingActivity;
import com.ss.android.lark.team.picker.TeamPickerActivity;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/team/util/TeamMenuDialogHelper;", "", "activity", "Landroid/app/Activity;", "team", "Lcom/ss/android/lark/team/entity/Team;", "(Landroid/app/Activity;Lcom/ss/android/lark/team/entity/Team;)V", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "menuItemClickListener", "com/ss/android/lark/team/util/TeamMenuDialogHelper$menuItemClickListener$1", "Lcom/ss/android/lark/team/util/TeamMenuDialogHelper$menuItemClickListener$1;", "menuItemStateChecker", "Lkotlin/Function1;", "", "", "showTeamMenuDialog", "", "toast", "context", "Landroid/content/Context;", "text", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.f.g */
public final class TeamMenuDialogHelper {

    /* renamed from: e */
    public static final Companion f136874e = new Companion(null);

    /* renamed from: a */
    public UDDialog f136875a;

    /* renamed from: b */
    public final Function1<Integer, Boolean> f136876b = new C55445c(this);

    /* renamed from: c */
    public final Activity f136877c;

    /* renamed from: d */
    public final Team f136878d;

    /* renamed from: f */
    private final C55444b f136879f = new C55444b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/team/util/TeamMenuDialogHelper$Companion;", "", "()V", "INDEX_ADD_MEMBER", "", "INDEX_BIND_CHAT", "INDEX_CREATE_CHAT", "INDEX_SETTING", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.f.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo189208a() {
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(this.f136877c);
        String name = this.f136878d.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "team.name");
        this.f136875a = ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.title(name)).mo90870a(CollectionsKt.listOf((Object[]) new String[]{C51468a.m199493c(R.string.Project_T_AddMembersOptions, this.f136877c), C51468a.m199493c(R.string.Project_T_NewGroupOptions, this.f136877c), C51468a.m199493c(R.string.Project_T_AddGroupsOptions, this.f136877c), C51468a.m199493c(R.string.Project_T_SettingsTeam, this.f136877c)}))).mo90868a(new TeamMenuAdapter(this.f136877c, this.f136876b))).mo90869a(this.f136879f)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC55446d.f136881a)).autoDismiss(false)).show();
        TeamHitPoint.m215070a(this.f136878d.getId());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/util/TeamMenuDialogHelper$menuItemClickListener$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.f.g$b */
    public static final class C55444b implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMenuDialogHelper f136880a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55444b(TeamMenuDialogHelper gVar) {
            this.f136880a = gVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Intent intent = new Intent(this.f136880a.f136877c, TeamSettingActivity.class);
                            intent.putExtra("intent_team", this.f136880a.f136878d);
                            this.f136880a.f136877c.startActivity(intent);
                            TeamHitPoint.m215071a(this.f136880a.f136878d.getId(), "team_setting", "feed_team_setting_view");
                            UDDialog uDDialog = this.f136880a.f136875a;
                            if (uDDialog != null) {
                                uDDialog.dismiss();
                            }
                        }
                    } else if (this.f136880a.f136876b.invoke(Integer.valueOf(i)).booleanValue()) {
                        Intent intent2 = new Intent(this.f136880a.f136877c, TeamPickerActivity.class);
                        intent2.putExtra("intent_team", this.f136880a.f136878d);
                        intent2.putExtra("intent_picker_type", 1);
                        this.f136880a.f136877c.startActivity(intent2);
                        TeamHitPoint.m215071a(this.f136880a.f136878d.getId(), "add_chat", "feed_team_add_chat_view");
                        UDDialog uDDialog2 = this.f136880a.f136875a;
                        if (uDDialog2 != null) {
                            uDDialog2.dismiss();
                        }
                    } else {
                        TeamMenuDialogHelper gVar = this.f136880a;
                        gVar.mo189209a(gVar.f136877c, R.string.Project_MV_TeamSettingsOnlyOwner);
                    }
                } else if (this.f136880a.f136876b.invoke(Integer.valueOf(i)).booleanValue()) {
                    Intent intent3 = new Intent(this.f136880a.f136877c, CreateTeamChatActivity.class);
                    intent3.putExtra("intent_team", this.f136880a.f136878d);
                    this.f136880a.f136877c.startActivity(intent3);
                    TeamHitPoint.m215071a(this.f136880a.f136878d.getId(), "create_chat", "feed_team_create_chat_view");
                    UDDialog uDDialog3 = this.f136880a.f136875a;
                    if (uDDialog3 != null) {
                        uDDialog3.dismiss();
                    }
                } else {
                    TeamMenuDialogHelper gVar2 = this.f136880a;
                    gVar2.mo189209a(gVar2.f136877c, R.string.Project_MV_OnlyOwnerCreateNew);
                }
            } else if (this.f136880a.f136876b.invoke(Integer.valueOf(i)).booleanValue()) {
                Intent intent4 = new Intent(this.f136880a.f136877c, TeamPickerActivity.class);
                intent4.putExtra("intent_team", this.f136880a.f136878d);
                intent4.putExtra("intent_picker_type", 3);
                this.f136880a.f136877c.startActivity(intent4);
                TeamHitPoint.m215071a(this.f136880a.f136878d.getId(), "add_user", "feed_team_add_user_view");
                UDDialog uDDialog4 = this.f136880a.f136875a;
                if (uDDialog4 != null) {
                    uDDialog4.dismiss();
                }
            } else {
                TeamMenuDialogHelper gVar3 = this.f136880a;
                gVar3.mo189209a(gVar3.f136877c, R.string.Project_MV_TeamMembersUnableToAdd);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "index", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.f.g$c */
    static final class C55445c extends Lambda implements Function1<Integer, Boolean> {
        final /* synthetic */ TeamMenuDialogHelper this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55445c(TeamMenuDialogHelper gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(invoke(num.intValue()));
        }

        /* JADX WARNING: Removed duplicated region for block: B:2:0x000c A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean invoke(int r5) {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.util.TeamMenuDialogHelper.C55445c.invoke(int):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.f.g$d */
    public static final class DialogInterface$OnClickListenerC55446d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55446d f136881a = new DialogInterface$OnClickListenerC55446d();

        DialogInterface$OnClickListenerC55446d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo189209a(Context context, int i) {
        Context applicationContext;
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            UDToast.show(applicationContext, i);
        }
    }

    public TeamMenuDialogHelper(Activity activity, Team team) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(team, "team");
        this.f136877c = activity;
        this.f136878d = team;
    }
}
