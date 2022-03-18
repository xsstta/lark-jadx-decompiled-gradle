package com.ss.android.lark.team.page;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2737f.C55443e;
import com.ss.android.lark.team.page.edit.ITeamEditDelegate;
import com.ss.android.lark.team.page.edit.TeamDescEditDelegate;
import com.ss.android.lark.team.page.edit.TeamNameEditDelegate;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconEditText;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiconTextView;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ,2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001,B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0014J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/team/page/TeamNameEditActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/team/entity/PatchTeamResponse;", "()V", "countText", "Landroid/widget/TextView;", "editAction", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "editGroup", "Landroidx/constraintlayout/widget/Group;", "editText", "Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconEditText;", "editType", "", "isUpdating", "", "saveAction", "staticText", "Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiconTextView;", "team", "Lcom/ss/android/lark/team/entity/Team;", "teamEditDelegate", "Lcom/ss/android/lark/team/page/edit/ITeamEditDelegate;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "checkEditMode", "", "fieldValue", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onPause", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setSaveActionEnabled", "enabled", "switchEditMode", "updateTeamField", "updateTextCount", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamNameEditActivity extends BaseFragmentActivity implements IGetDataCallback<PatchTeamResponse> {

    /* renamed from: b */
    public static final Companion f136913b = new Companion(null);

    /* renamed from: a */
    public EmojiconEditText f136914a;

    /* renamed from: c */
    private Team f136915c;

    /* renamed from: d */
    private CommonTitleBar f136916d;

    /* renamed from: e */
    private TextView f136917e;

    /* renamed from: f */
    private EmojiconTextView f136918f;

    /* renamed from: g */
    private Group f136919g;

    /* renamed from: h */
    private boolean f136920h;

    /* renamed from: i */
    private IActionTitlebar.TextAction f136921i;

    /* renamed from: j */
    private IActionTitlebar.TextAction f136922j;

    /* renamed from: k */
    private ITeamEditDelegate f136923k;

    /* renamed from: l */
    private int f136924l;

    /* renamed from: a */
    public Context mo189246a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo189248a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215165a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215163a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo189253d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo189254e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo189255f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m215170d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215168b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215169c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/page/TeamNameEditActivity$Companion;", "", "()V", "LOG_TAG", "", "TITLE_ACTION_TEXT_SIZE", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        KeyboardUtils.hideKeyboard(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$g */
    public static final class RunnableC55464g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TeamNameEditActivity f136931a;

        RunnableC55464g(TeamNameEditActivity teamNameEditActivity) {
            this.f136931a = teamNameEditActivity;
        }

        public final void run() {
            if (!this.f136931a.isDestroyed()) {
                TeamNameEditActivity.m215164a(this.f136931a).requestFocus();
            }
        }
    }

    /* renamed from: b */
    public final void mo189250b() {
        String str;
        boolean z;
        EmojiconEditText emojiconEditText = this.f136914a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        }
        Editable text = emojiconEditText.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String valueOf = String.valueOf(length);
        ITeamEditDelegate aVar = this.f136923k;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("teamEditDelegate");
        }
        int b = aVar.mo189266b();
        spannableStringBuilder.append((CharSequence) valueOf).append((CharSequence) "/").append((CharSequence) String.valueOf(b));
        boolean z2 = true;
        if (length > b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.function_danger_500)), 0, valueOf.length(), 17);
        }
        TextView textView = this.f136917e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("countText");
        }
        textView.setText(spannableStringBuilder);
        if (z) {
            m215167a(false);
        } else if (str != null) {
            String str2 = str;
            String obj = StringsKt.trim((CharSequence) str2).toString();
            ITeamEditDelegate aVar2 = this.f136923k;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("teamEditDelegate");
            }
            Team team = this.f136915c;
            if (team == null) {
                Intrinsics.throwUninitializedPropertyAccessException("team");
            }
            boolean z3 = !Intrinsics.areEqual(obj, aVar2.mo189264a(team));
            ITeamEditDelegate aVar3 = this.f136923k;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("teamEditDelegate");
            }
            if (aVar3.mo189267c()) {
                m215167a(z3);
                return;
            }
            if (!z3 || !(!StringsKt.isBlank(str2))) {
                z2 = false;
            }
            m215167a(z2);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189251c() {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.TeamNameEditActivity.mo189251c():void");
    }

    /* renamed from: a */
    public final void mo189247a() {
        CommonTitleBar commonTitleBar = this.f136916d;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.removeAllActions();
        this.f136922j = new C55463f(this, C51468a.m199493c(R.string.Project_MV_SaveButton, this), R.color.create_team_action, 16);
        CommonTitleBar commonTitleBar2 = this.f136916d;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.addAction(this.f136922j);
        EmojiconTextView emojiconTextView = this.f136918f;
        if (emojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticText");
        }
        emojiconTextView.setVisibility(8);
        Group group = this.f136919g;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editGroup");
        }
        group.setVisibility(0);
        EmojiconEditText emojiconEditText = this.f136914a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        }
        emojiconEditText.setFocusable(true);
        EmojiconEditText emojiconEditText2 = this.f136914a;
        if (emojiconEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        }
        emojiconEditText2.postDelayed(new RunnableC55464g(this), 500);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/TeamNameEditActivity$checkEditMode$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$b */
    public static final class C55459b extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ TeamNameEditActivity f136925a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f136925a.mo189247a();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55459b(TeamNameEditActivity teamNameEditActivity, String str, int i, int i2) {
            super(str, i, i2);
            this.f136925a = teamNameEditActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/page/TeamNameEditActivity$onCreate$3$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$c */
    public static final class C55460c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TeamNameEditActivity f136926a;

        /* renamed from: b */
        final /* synthetic */ String f136927b;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            this.f136926a.mo189250b();
        }

        C55460c(TeamNameEditActivity teamNameEditActivity, String str) {
            this.f136926a = teamNameEditActivity;
            this.f136927b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/TeamNameEditActivity$switchEditMode$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$f */
    public static final class C55463f extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ TeamNameEditActivity f136930a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f136930a.mo189251c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55463f(TeamNameEditActivity teamNameEditActivity, String str, int i, int i2) {
            super(str, i, i2);
            this.f136930a = teamNameEditActivity;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EmojiconEditText m215164a(TeamNameEditActivity teamNameEditActivity) {
        EmojiconEditText emojiconEditText = teamNameEditActivity.f136914a;
        if (emojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        }
        return emojiconEditText;
    }

    /* renamed from: b */
    public static Resources m215168b(TeamNameEditActivity teamNameEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamNameEditActivity);
        }
        return teamNameEditActivity.mo189253d();
    }

    /* renamed from: d */
    public static AssetManager m215170d(TeamNameEditActivity teamNameEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamNameEditActivity);
        }
        return teamNameEditActivity.mo189255f();
    }

    /* renamed from: c */
    public static void m215169c(TeamNameEditActivity teamNameEditActivity) {
        teamNameEditActivity.mo189254e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamNameEditActivity teamNameEditActivity2 = teamNameEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamNameEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m215166a(String str) {
        Team team = this.f136915c;
        if (team == null) {
            Intrinsics.throwUninitializedPropertyAccessException("team");
        }
        if (C55443e.m215116a(team)) {
            if (StringsKt.isBlank(str)) {
                mo189247a();
                return;
            }
            C55459b bVar = new C55459b(this, C51468a.m199493c(R.string.Lark_Legacy_Edit, this), R.color.text_title, 16);
            CommonTitleBar commonTitleBar = this.f136916d;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar.addAction(bVar);
            this.f136921i = bVar;
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        StringBuilder sb = new StringBuilder();
        sb.append("edit error, type:");
        sb.append(this.f136924l);
        sb.append(", team id:");
        Team team = this.f136915c;
        if (team == null) {
            Intrinsics.throwUninitializedPropertyAccessException("team");
        }
        sb.append(team.getId());
        Log.m165384e("TeamNameEditActivity", sb.toString(), errorResult);
        this.f136920h = false;
        String displayMsg = errorResult.getDisplayMsg();
        if (displayMsg != null) {
            UDDialogBuilder eVar = new UDDialogBuilder(this);
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "it");
            ((UDDialogBuilder) ((UDDialogBuilder) eVar.message(displayMsg)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_T_OkGotIt, DialogInterface$OnClickListenerC55462e.f136929a)).show();
        }
    }

    /* renamed from: a */
    private final void m215167a(boolean z) {
        IActionTitlebar.TextAction textAction = this.f136922j;
        if (textAction != null) {
            CommonTitleBar commonTitleBar = this.f136916d;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            View viewByAction = commonTitleBar.getViewByAction(textAction);
            if (viewByAction != null) {
                viewByAction.setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        int i;
        TeamNameEditDelegate cVar;
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Team team = null;
        if (intent == null || (extras = intent.getExtras()) == null) {
            serializable = null;
        } else {
            serializable = extras.getSerializable("intent_team");
        }
        if (serializable instanceof Team) {
            team = serializable;
        }
        Team team2 = team;
        if (team2 != null) {
            this.f136915c = team2;
            Intent intent2 = getIntent();
            boolean z = false;
            if (intent2 != null) {
                i = intent2.getIntExtra("intent_edit_type", 0);
            } else {
                i = 0;
            }
            this.f136924l = i;
            Log.m165389i("TeamNameEditActivity", "edit type:" + i);
            if (i == 1) {
                cVar = new TeamNameEditDelegate();
            } else if (i != 2) {
                finish();
                return;
            } else {
                cVar = new TeamDescEditDelegate();
            }
            this.f136923k = cVar;
            setContentView(R.layout.activity_team_name_edit);
            View findViewById = findViewById(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.title_bar)");
            this.f136916d = (CommonTitleBar) findViewById;
            View findViewById2 = findViewById(R.id.input);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.input)");
            this.f136914a = (EmojiconEditText) findViewById2;
            View findViewById3 = findViewById(R.id.text_count);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.text_count)");
            this.f136917e = (TextView) findViewById3;
            View findViewById4 = findViewById(R.id.text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.text)");
            this.f136918f = (EmojiconTextView) findViewById4;
            View findViewById5 = findViewById(R.id.input_group);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.input_group)");
            this.f136919g = (Group) findViewById5;
            ITeamEditDelegate aVar = this.f136923k;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("teamEditDelegate");
            }
            Team team3 = this.f136915c;
            if (team3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("team");
            }
            String a = aVar.mo189264a(team3);
            if (a == null) {
                a = "";
            }
            CommonTitleBar commonTitleBar = this.f136916d;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
            ITeamEditDelegate aVar2 = this.f136923k;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("teamEditDelegate");
            }
            commonTitleBar.setTitle(aVar2.mo189263a());
            EmojiconTextView emojiconTextView = this.f136918f;
            if (emojiconTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticText");
            }
            String str = a;
            emojiconTextView.setText(str);
            EmojiconEditText emojiconEditText = this.f136914a;
            if (emojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editText");
            }
            emojiconEditText.clearFocus();
            emojiconEditText.setText(str);
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                emojiconEditText.setSelection(a.length());
            }
            emojiconEditText.addTextChangedListener(new C55460c(this, a));
            emojiconEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC55461d(emojiconEditText));
            mo189250b();
            m215166a(a);
            return;
        }
        Log.m165397w("TeamNameEditActivity", "team null");
        finish();
    }

    /* renamed from: a */
    public void onSuccess(PatchTeamResponse patchTeamResponse) {
        Team team;
        StringBuilder sb = new StringBuilder();
        sb.append("edit success, type:");
        sb.append(this.f136924l);
        sb.append(", team id:");
        Team team2 = this.f136915c;
        if (team2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("team");
        }
        sb.append(team2.getId());
        Log.m165389i("TeamNameEditActivity", sb.toString());
        this.f136920h = false;
        if (!(patchTeamResponse == null || (team = patchTeamResponse.getTeam()) == null)) {
            Intent intent = new Intent();
            intent.putExtra("result_team", team);
            setResult(-1, intent);
        }
        KeyboardUtils.hideKeyboard(this);
        finish();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$e */
    public static final class DialogInterface$OnClickListenerC55462e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55462e f136929a = new DialogInterface$OnClickListenerC55462e();

        DialogInterface$OnClickListenerC55462e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamNameEditActivity$d */
    static final class View$OnFocusChangeListenerC55461d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ EmojiconEditText f136928a;

        View$OnFocusChangeListenerC55461d(EmojiconEditText emojiconEditText) {
            this.f136928a = emojiconEditText;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                KeyboardUtils.hideKeyboard(this.f136928a.getContext(), this.f136928a);
            } else {
                KeyboardUtils.showKeyboard(this.f136928a);
            }
        }
    }

    /* renamed from: a */
    public static void m215165a(TeamNameEditActivity teamNameEditActivity, Context context) {
        teamNameEditActivity.mo189248a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamNameEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m215163a(TeamNameEditActivity teamNameEditActivity, Configuration configuration) {
        Context a = teamNameEditActivity.mo189246a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
