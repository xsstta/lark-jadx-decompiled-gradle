package com.ss.android.lark.team.common.piece;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.piece.TitleBarPiece;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 52\u00020\u0001:\u000256B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0014J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\tH\u0014J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020'H\u0016J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H\u0004J\b\u0010,\u001a\u00020'H\u0016J\u0010\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020\tH\u0002J\b\u0010/\u001a\u00020'H\u0014J\u001e\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u00182\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u00103\u001a\u00020'H\u0004J\u0010\u00104\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\tH\u0004R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u00067"}, d2 = {"Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece;", "Lcom/ss/android/lark/team/common/piece/TitleBarPiece;", "titleResId", "", "(I)V", "action", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "checkNameCallback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "createButtonInterceptorList", "", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$CreateButtonEnableInterceptor;", "getCreateButtonInterceptorList", "()Ljava/util/List;", "isCreating", "isNameDuplicated", "loadingDialog", "Lcom/ss/android/lark/utils/ViewUtils$ActionLoadingDialog;", "nameInputFocusObserver", "Landroidx/lifecycle/Observer;", "getNameInputFocusObserver", "()Landroidx/lifecycle/Observer;", "nameObserver", "", "getNameObserver", "getActionList", "", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "context", "Landroid/content/Context;", "getLeftClickListener", "Landroid/view/View$OnClickListener;", "getLoadingDialogText", "getName", "handleBackPressed", "hasInput", "onBackPressed", "onClickCreateButton", "", "onCreate", "onCreateFailed", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onDestroy", "onInputFocusChanged", "focused", "onNameDuplicated", "startCheckName", "name", "callback", "updateCreateButtonStatus", "updateCreationStatus", "Companion", "CreateButtonEnableInterceptor", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class CreateItemTitlePiece extends TitleBarPiece {

    /* renamed from: g */
    public static final Companion f136692g = new Companion(null);

    /* renamed from: a */
    public boolean f136693a;

    /* renamed from: b */
    public boolean f136694b;

    /* renamed from: i */
    private IActionTitlebar.TextAction f136695i;

    /* renamed from: j */
    private ViewUtils.C57751a f136696j;

    /* renamed from: k */
    private final List<CreateButtonEnableInterceptor> f136697k = new ArrayList();

    /* renamed from: l */
    private final AbstractC1178x<String> f136698l = new C55375h(this);

    /* renamed from: m */
    private final AbstractC1178x<Boolean> f136699m = new C55374g(this);

    /* renamed from: n */
    private UIGetDataCallback<Boolean> f136700n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$CreateButtonEnableInterceptor;", "", "canClick", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$b */
    public interface CreateButtonEnableInterceptor {
        /* renamed from: a */
        boolean mo188988a();
    }

    /* renamed from: a */
    public abstract void mo188975a(String str, UIGetDataCallback<Boolean> uIGetDataCallback);

    /* renamed from: f */
    public abstract void mo188983f();

    /* renamed from: j */
    public String mo188987j() {
        return "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<CreateButtonEnableInterceptor> mo188972a() {
        return this.f136697k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AbstractC1178x<String> mo188978b() {
        return this.f136698l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final AbstractC1178x<Boolean> mo188981d() {
        return this.f136699m;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/team/common/piece/CreateItemTitlePiece$onCreate$1", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$CreateButtonEnableInterceptor;", "canClick", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$i */
    public static final class C55376i implements CreateButtonEnableInterceptor {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136710a;

        @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece.CreateButtonEnableInterceptor
        /* renamed from: a */
        public boolean mo188988a() {
            return !this.f136710a.f136693a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55376i(CreateItemTitlePiece createItemTitlePiece) {
            this.f136710a = createItemTitlePiece;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: A */
    public boolean mo177178A() {
        return mo188980c(mo177180C());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo188985h() {
        if (mo188984g().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onDestroy() {
        ViewUtils.C57751a aVar = this.f136696j;
        if (aVar != null) {
            aVar.mo196042e();
        }
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/team/common/piece/CreateItemTitlePiece$onCreate$2", "Lcom/ss/android/lark/team/common/piece/CreateItemTitlePiece$CreateButtonEnableInterceptor;", "canClick", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$j */
    public static final class C55377j implements CreateButtonEnableInterceptor {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136711a;

        @Override // com.ss.android.lark.team.common.piece.CreateItemTitlePiece.CreateButtonEnableInterceptor
        /* renamed from: a */
        public boolean mo188988a() {
            if (!this.f136711a.f136694b && this.f136711a.mo188984g().length() > 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55377j(CreateItemTitlePiece createItemTitlePiece) {
            this.f136711a = createItemTitlePiece;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo188986i() {
        IPieceExport aVar;
        this.f136694b = true;
        PieceContext r = mo177204r();
        if (r != null) {
            aVar = r.mo177222a(TeamNameInputExport.class);
        } else {
            aVar = null;
        }
        TeamNameInputExport hVar = (TeamNameInputExport) aVar;
        if (hVar != null) {
            hVar.bm_();
        }
    }

    /* renamed from: e */
    public final void mo188982e() {
        boolean z;
        Iterator<CreateButtonEnableInterceptor> it = this.f136697k.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().mo188988a()) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        View viewByAction = mo189052k().getViewByAction(this.f136695i);
        if (viewByAction != null) {
            viewByAction.setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo188984g() {
        IPieceExport aVar;
        LiveData<String> a;
        String b;
        PieceContext r = mo177204r();
        if (r != null) {
            aVar = r.mo177222a(TeamNameInputExport.class);
        } else {
            aVar = null;
        }
        TeamNameInputExport hVar = (TeamNameInputExport) aVar;
        if (hVar == null || (a = hVar.mo189033a()) == null || (b = a.mo5927b()) == null) {
            return "";
        }
        return b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$k */
    static final class C55378k extends Lambda implements Function0<Unit> {
        final /* synthetic */ ErrorResult $err;
        final /* synthetic */ int $titleResId;
        final /* synthetic */ CreateItemTitlePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55378k(CreateItemTitlePiece createItemTitlePiece, ErrorResult errorResult, int i) {
            super(0);
            this.this$0 = createItemTitlePiece;
            this.$err = errorResult;
            this.$titleResId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            String str;
            boolean z = false;
            this.this$0.mo188976a(false);
            String displayMsg = this.$err.getDisplayMsg();
            if (displayMsg == null || displayMsg.length() == 0) {
                z = true;
            }
            if (z) {
                str = C51468a.m199493c(R.string.Lark_Legacy_NetworkErrorRetry, this.this$0.mo177180C());
            } else {
                str = this.$err.getDisplayMsg();
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "err.displayMsg!!");
            }
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.this$0.mo177180C()).title(this.$titleResId)).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_DialogOk, DialogInterface$OnClickListenerC553791.f136712a)).show();
        }
    }

    @Override // com.ss.android.lark.piece.core.LifecycleOwnerPiece, com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        IPieceExport aVar;
        super.onCreate();
        this.f136697k.add(new C55376i(this));
        this.f136697k.add(new C55377j(this));
        PieceContext r = mo177204r();
        if (r != null) {
            aVar = r.mo177222a(TeamNameInputExport.class);
        } else {
            aVar = null;
        }
        TeamNameInputExport hVar = (TeamNameInputExport) aVar;
        if (hVar != null) {
            CreateItemTitlePiece createItemTitlePiece = this;
            hVar.mo189033a().mo5923a(createItemTitlePiece, this.f136698l);
            hVar.mo189035b().mo5923a(createItemTitlePiece, this.f136699m);
        }
        mo188982e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/common/piece/CreateItemTitlePiece$getActionList$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$c */
    public static final class C55370c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136701a;

        /* renamed from: b */
        final /* synthetic */ Context f136702b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f136701a.mo188983f();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55370c(CreateItemTitlePiece createItemTitlePiece, Context context, String str, int i, int i2) {
            super(str, i, i2);
            this.f136701a = createItemTitlePiece;
            this.f136702b = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$d */
    static final class View$OnClickListenerC55371d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136703a;

        /* renamed from: b */
        final /* synthetic */ Context f136704b;

        View$OnClickListenerC55371d(CreateItemTitlePiece createItemTitlePiece, Context context) {
            this.f136703a = createItemTitlePiece;
            this.f136704b = context;
        }

        public final void onClick(View view) {
            this.f136703a.mo188980c(this.f136704b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$h */
    static final class C55375h<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136709a;

        C55375h(CreateItemTitlePiece createItemTitlePiece) {
            this.f136709a = createItemTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            this.f136709a.mo188982e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/team/common/piece/CreateItemTitlePiece$onInputFocusChanged$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$l */
    public static final class C55380l implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136713a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55380l(CreateItemTitlePiece createItemTitlePiece) {
            this.f136713a = createItemTitlePiece;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                this.f136713a.mo188986i();
            }
            this.f136713a.mo188982e();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165379d("CreateItemTitlePiece", "check name error: " + errorResult.getDebugMsg());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$g */
    static final class C55374g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136708a;

        C55374g(CreateItemTitlePiece createItemTitlePiece) {
            this.f136708a = createItemTitlePiece;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                this.f136708a.mo188979b(bool.booleanValue());
            }
        }
    }

    @Override // com.ss.android.lark.team.common.piece.TitleBarPiece
    /* renamed from: b */
    public View.OnClickListener mo188977b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new View$OnClickListenerC55371d(this, context);
    }

    public CreateItemTitlePiece(int i) {
        super(i, TitleBarPiece.LeftIconType.CLOSE);
    }

    @Override // com.ss.android.lark.team.common.piece.TitleBarPiece
    /* renamed from: a */
    public List<IActionTitlebar.Action> mo188973a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C55370c cVar = new C55370c(this, context, C51468a.m199493c(R.string.Project_MV_CreateButton, context), R.color.create_team_action, 16);
        this.f136695i = cVar;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        return CollectionsKt.listOf(cVar);
    }

    /* renamed from: b */
    public final void mo188979b(boolean z) {
        UIGetDataCallback<Boolean> uIGetDataCallback = this.f136700n;
        if (uIGetDataCallback != null) {
            uIGetDataCallback.cancel();
        }
        boolean z2 = false;
        if (z) {
            this.f136694b = false;
            mo188982e();
            return;
        }
        String g = mo188984g();
        if (g.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            UIGetDataCallback<Boolean> wrapAndAddGetDataCallback = mo177209w().wrapAndAddGetDataCallback(new C55380l(this));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "this");
            mo188975a(g, wrapAndAddGetDataCallback);
            this.f136700n = wrapAndAddGetDataCallback;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo188980c(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (!(context instanceof Activity)) {
            return false;
        }
        if (mo188985h()) {
            ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).message(R.string.Project_MV_QuitCreatTeam_PopupWindow)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Project_MV_Close_Button, new DialogInterface$OnClickListenerC55372e(this, context))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Project_MV_CancelButton, DialogInterface$OnClickListenerC55373f.f136707a)).show();
            return true;
        }
        mo189051d(context);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo188976a(boolean z) {
        this.f136693a = z;
        mo188982e();
        if (z) {
            if (this.f136696j == null) {
                this.f136696j = ViewUtils.m224143a(mo177180C(), mo188987j());
            }
            ViewUtils.C57751a aVar = this.f136696j;
            if (aVar != null) {
                aVar.mo196039b();
                return;
            }
            return;
        }
        ViewUtils.C57751a aVar2 = this.f136696j;
        if (aVar2 != null) {
            aVar2.mo196042e();
        }
        this.f136696j = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$e */
    public static final class DialogInterface$OnClickListenerC55372e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateItemTitlePiece f136705a;

        /* renamed from: b */
        final /* synthetic */ Context f136706b;

        DialogInterface$OnClickListenerC55372e(CreateItemTitlePiece createItemTitlePiece, Context context) {
            this.f136705a = createItemTitlePiece;
            this.f136706b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f136705a.mo189051d(this.f136706b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.common.piece.CreateItemTitlePiece$f */
    public static final class DialogInterface$OnClickListenerC55373f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC55373f f136707a = new DialogInterface$OnClickListenerC55373f();

        DialogInterface$OnClickListenerC55373f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo188974a(int i, ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        Log.m165384e("CreateItemTitlePiece", "onCreateFailed titleResId:" + C51468a.m199493c(i, mo177180C()), errorResult);
        mo177197b(new C55378k(this, errorResult, i));
    }
}
