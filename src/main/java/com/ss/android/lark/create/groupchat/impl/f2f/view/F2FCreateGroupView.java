package com.ss.android.lark.create.groupchat.impl.f2f.view;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.ApplicantInfo;
import com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract;
import com.ss.android.lark.create.groupchat.impl.f2f.animation.SceneController;
import com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberDisplayView;
import com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView;
import com.ss.android.lark.create.groupchat.impl.statistics.F2FCreateGroupHitPoint;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 d2\u00020\u0001:\u0001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020EH\u0016J\u0012\u0010G\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020EH\u0016J\b\u0010K\u001a\u00020EH\u0016J\b\u0010L\u001a\u00020EH\u0016J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020EH\u0002J\b\u0010R\u001a\u00020EH\u0003J\u0016\u0010S\u001a\u00020E2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0016J\u0010\u0010W\u001a\u00020E2\u0006\u0010X\u001a\u00020IH\u0016J\b\u0010Y\u001a\u00020EH\u0002J\b\u0010Z\u001a\u00020EH\u0016J\b\u0010[\u001a\u00020EH\u0002J\b\u0010\\\u001a\u00020EH\u0002J\b\u0010]\u001a\u00020EH\u0002J\u0012\u0010^\u001a\u00020E2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010_\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010IH\u0002J\b\u0010`\u001a\u00020EH\u0002J\u0010\u0010a\u001a\u00020E2\u0006\u0010b\u001a\u00020cH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u001a\u00100\u001a\u000201X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000207X.¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000209X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020?X.¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX.¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FCreateGroupView;", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView;", "viewDependency", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDependency;", "(Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDependency;)V", "applicantsAdapter", "Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter;", "getApplicantsAdapter$im_create_group_chat_release", "()Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter;", "setApplicantsAdapter$im_create_group_chat_release", "(Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FApplicantsAdapter;)V", "applicantsDescHeader", "Landroid/widget/TextView;", "getApplicantsDescHeader$im_create_group_chat_release", "()Landroid/widget/TextView;", "setApplicantsDescHeader$im_create_group_chat_release", "(Landroid/widget/TextView;)V", "applicantsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getApplicantsRV$im_create_group_chat_release", "()Landroidx/recyclerview/widget/RecyclerView;", "setApplicantsRV$im_create_group_chat_release", "(Landroidx/recyclerview/widget/RecyclerView;)V", "applicantsView", "Landroid/view/View;", "getApplicantsView$im_create_group_chat_release", "()Landroid/view/View;", "setApplicantsView$im_create_group_chat_release", "(Landroid/view/View;)V", "chatDependency", "Lcom/ss/android/lark/create/groupchat/dependency/ICreateGroupChatModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "confirmButton", "Landroid/widget/Button;", "getConfirmButton$im_create_group_chat_release", "()Landroid/widget/Button;", "setConfirmButton$im_create_group_chat_release", "(Landroid/widget/Button;)V", "errorMessageView", "getErrorMessageView$im_create_group_chat_release", "setErrorMessageView$im_create_group_chat_release", "handler", "Landroid/os/Handler;", "inputMode", "", "messageTipsView", "getMessageTipsView$im_create_group_chat_release", "setMessageTipsView$im_create_group_chat_release", "numberDisplayView", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView;", "getNumberDisplayView$im_create_group_chat_release", "()Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView;", "setNumberDisplayView$im_create_group_chat_release", "(Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView;)V", "numberInputView", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView;", "rootView", "Landroid/view/ViewGroup;", "getRootView$im_create_group_chat_release", "()Landroid/view/ViewGroup;", "setRootView$im_create_group_chat_release", "(Landroid/view/ViewGroup;)V", "sceneController", "Lcom/ss/android/lark/create/groupchat/impl/f2f/animation/SceneController;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "viewDelegate", "Lcom/ss/android/lark/create/groupchat/impl/f2f/IF2FCreateGroupContract$IView$ViewDelegate;", "bindView", "", "create", "defaultError", "errorMsg", "", "destroy", "errGroupReachMemberLimit", "errMatchCodeTooSimple", "getContext", "Landroid/content/Context;", "getOriginTextSpan", "Landroid/text/SpannableStringBuilder;", "hideErrorTips", "initView", "onUpdateApplicants", "list", "", "Lcom/ss/android/lark/create/groupchat/dto/ApplicantInfo;", "openGroupChat", "chaId", "releaseLoadingState", "requestFinish", "resizeFooterContainer", "scheduleShowLoading", "sendHitPoint", "setViewDelegate", "showDefaultErrorDialog", "switchToDetailPage", "updateTips", "count", "", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b */
public final class F2FCreateGroupView implements IF2FCreateGroupContract.IView {

    /* renamed from: l */
    public static final Companion f93638l = new Companion(null);

    /* renamed from: a */
    public IF2FCreateGroupContract.IView.ViewDelegate f93639a;

    /* renamed from: b */
    public F2FApplicantsAdapter f93640b;

    /* renamed from: c */
    public ViewGroup f93641c;

    /* renamed from: d */
    public NumberDisplayView f93642d;

    /* renamed from: e */
    public View f93643e;

    /* renamed from: f */
    public TextView f93644f;

    /* renamed from: g */
    public TextView f93645g;

    /* renamed from: h */
    public RecyclerView f93646h;

    /* renamed from: i */
    public TextView f93647i;

    /* renamed from: j */
    public Button f93648j;

    /* renamed from: k */
    public final IF2FCreateGroupContract.IView.ViewDependency f93649k;

    /* renamed from: m */
    private final AbstractC36248c.AbstractC36252d f93650m;

    /* renamed from: n */
    private final Handler f93651n = new Handler(Looper.getMainLooper());

    /* renamed from: o */
    private boolean f93652o = true;

    /* renamed from: p */
    private SceneController f93653p;

    /* renamed from: q */
    private NumberInputView f93654q;

    /* renamed from: r */
    private CommonTitleBar f93655r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/view/F2FCreateGroupView$Companion;", "", "()V", "KEY_APP_NAME", "", "LOADING_DELAY", "", "URI_PACKAGE", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$f */
    public static final class RunnableC36305f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupView f93660a;

        RunnableC36305f(F2FCreateGroupView bVar) {
            this.f93660a = bVar;
        }

        public final void run() {
            this.f93660a.mo133936n();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView
    /* renamed from: c */
    public void mo133925c() {
        this.f93649k.mo133849d();
    }

    /* renamed from: o */
    public final Context mo133937o() {
        return this.f93649k.mo133848c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/view/F2FCreateGroupView$bindView$2", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberInputView$NumberClickListener;", "onBack", "", "onNumber", "value", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$c */
    public static final class C36302c implements NumberInputView.NumberClickListener {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupView f93657a;

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView.NumberClickListener
        /* renamed from: a */
        public void mo133941a() {
            this.f93657a.mo133938p();
            this.f93657a.mo133928f().mo133952b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36302c(F2FCreateGroupView bVar) {
            this.f93657a = bVar;
        }

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberInputView.NumberClickListener
        /* renamed from: a */
        public void mo133942a(int i) {
            this.f93657a.mo133938p();
            this.f93657a.mo133928f().mo133950a(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$g */
    public static final class RunnableC36306g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupView f93661a;

        RunnableC36306g(F2FCreateGroupView bVar) {
            this.f93661a = bVar;
        }

        public final void run() {
            LKUIToast.showLoading(this.f93661a.mo133937o(), (int) R.string.Lark_Legacy_Loading);
        }
    }

    /* renamed from: u */
    private final void m142928u() {
        SceneController aVar = this.f93653p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sceneController");
        }
        aVar.mo133875a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m142926s();
        m142925r();
        this.f93653p = new SceneController(this);
    }

    /* renamed from: d */
    public final F2FApplicantsAdapter mo133926d() {
        F2FApplicantsAdapter aVar = this.f93640b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicantsAdapter");
        }
        return aVar;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m142929v();
        this.f93639a = null;
    }

    /* renamed from: e */
    public final ViewGroup mo133927e() {
        ViewGroup viewGroup = this.f93641c;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return viewGroup;
    }

    /* renamed from: f */
    public final NumberDisplayView mo133928f() {
        NumberDisplayView numberDisplayView = this.f93642d;
        if (numberDisplayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberDisplayView");
        }
        return numberDisplayView;
    }

    /* renamed from: g */
    public final View mo133929g() {
        View view = this.f93643e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicantsView");
        }
        return view;
    }

    /* renamed from: h */
    public final TextView mo133930h() {
        TextView textView = this.f93644f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTipsView");
        }
        return textView;
    }

    /* renamed from: i */
    public final TextView mo133931i() {
        TextView textView = this.f93645g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        return textView;
    }

    /* renamed from: j */
    public final RecyclerView mo133932j() {
        RecyclerView recyclerView = this.f93646h;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicantsRV");
        }
        return recyclerView;
    }

    /* renamed from: k */
    public final TextView mo133933k() {
        TextView textView = this.f93647i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicantsDescHeader");
        }
        return textView;
    }

    /* renamed from: l */
    public final Button mo133934l() {
        Button button = this.f93648j;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmButton");
        }
        return button;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/create/groupchat/impl/f2f/view/F2FCreateGroupView$bindView$1", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView$NumberFilledListener;", "onNumberFilled", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$b */
    public static final class C36301b implements NumberDisplayView.NumberFilledListener {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupView f93656a;

        @Override // com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberDisplayView.NumberFilledListener
        /* renamed from: a */
        public void mo133940a() {
            this.f93656a.mo133939q();
            IF2FCreateGroupContract.IView.ViewDelegate aVar = this.f93656a.f93639a;
            if (aVar != null) {
                aVar.mo133899a(this.f93656a.mo133928f().getCodeString());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36301b(F2FCreateGroupView bVar) {
            this.f93656a = bVar;
        }
    }

    /* renamed from: t */
    private final SpannableStringBuilder m142927t() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = mo133937o().getString(R.string.Lark_NearbyGroup_ContactReminder);
        Intrinsics.checkExpressionValueIsNotNull(string, "getContext().getString(R…rbyGroup_ContactReminder)");
        spannableStringBuilder.append((CharSequence) string);
        return spannableStringBuilder;
    }

    /* renamed from: v */
    private final void m142929v() {
        if (this.f93642d != null) {
            LKUIToast.cancelLoading();
            NumberInputView numberInputView = this.f93654q;
            if (numberInputView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("numberInputView");
            }
            numberInputView.mo133958a(true);
            this.f93651n.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: m */
    public final void mo133935m() {
        int e = this.f93649k.mo133850e();
        if (e == 1) {
            F2FCreateGroupHitPoint.f93888a.mo134206d();
        } else if (e == 2) {
            F2FCreateGroupHitPoint.f93888a.mo134204b();
        }
    }

    /* renamed from: p */
    public final void mo133938p() {
        TextView textView = this.f93645g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView.setText("");
        TextView textView2 = this.f93645g;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView2.setVisibility(4);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView
    /* renamed from: a */
    public void mo133920a() {
        m142929v();
        TextView textView = this.f93645g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView.setText(R.string.Lark_NearbyGroup_ErrorReachLimit);
        TextView textView2 = this.f93645g;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView2.setVisibility(0);
        NumberDisplayView numberDisplayView = this.f93642d;
        if (numberDisplayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberDisplayView");
        }
        NumberDisplayView.m142954a(numberDisplayView, false, 1, null);
    }

    /* renamed from: q */
    public final void mo133939q() {
        this.f93651n.removeCallbacksAndMessages(null);
        NumberInputView numberInputView = this.f93654q;
        if (numberInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberInputView");
        }
        numberInputView.mo133958a(false);
        this.f93651n.postDelayed(new RunnableC36306g(this), 300);
    }

    /* renamed from: r */
    private final void m142925r() {
        NumberDisplayView numberDisplayView = this.f93642d;
        if (numberDisplayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberDisplayView");
        }
        numberDisplayView.mo133948a(new C36301b(this));
        NumberInputView numberInputView = this.f93654q;
        if (numberInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberInputView");
        }
        numberInputView.mo133957a(new C36302c(this));
        CommonTitleBar commonTitleBar = this.f93655r;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC36303d(this));
        CommonTitleBar commonTitleBar2 = this.f93655r;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar2.setTitle(R.string.Lark_NearbyGroup_Title);
        TextView textView = this.f93644f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageTipsView");
        }
        textView.setText(R.string.Lark_NearbyGroup_Instruction);
        TextView textView2 = this.f93645g;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView2.setVisibility(4);
        Button button = this.f93648j;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmButton");
        }
        button.setOnClickListener(new View$OnClickListenerC36304e(this));
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView
    /* renamed from: b */
    public void mo133924b() {
        m142929v();
        TextView textView = this.f93645g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView.setText(R.string.Lark_NearbyGroup_ErrorTooSimple);
        TextView textView2 = this.f93645g;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMessageView");
        }
        textView2.setVisibility(0);
        NumberDisplayView numberDisplayView = this.f93642d;
        if (numberDisplayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberDisplayView");
        }
        NumberDisplayView.m142954a(numberDisplayView, false, 1, null);
    }

    /* renamed from: n */
    public final void mo133936n() {
        ViewGroup viewGroup = this.f93641c;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById = viewGroup.findViewById(R.id.footer_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "footerContainer");
        int width = findViewById.getWidth();
        ViewGroup viewGroup2 = this.f93641c;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        float height = ((float) viewGroup2.getHeight()) * 0.45f;
        if (((float) width) > height) {
            width = (int) height;
        }
        findViewById.getLayoutParams().height = width;
        NumberInputView numberInputView = this.f93654q;
        if (numberInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberInputView");
        }
        numberInputView.mo133960a();
    }

    /* renamed from: s */
    private final void m142926s() {
        ViewGroup b = this.f93649k.mo133847b();
        if (b != null) {
            this.f93641c = b;
            if (b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById = b.findViewById(R.id.title_bar);
            if (findViewById != null) {
                this.f93655r = (CommonTitleBar) findViewById;
                ViewGroup viewGroup = this.f93641c;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                View findViewById2 = viewGroup.findViewById(R.id.number_display_view);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.number_display_view)");
                this.f93642d = (NumberDisplayView) findViewById2;
                ViewGroup viewGroup2 = this.f93641c;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                View findViewById3 = viewGroup2.findViewById(R.id.number_input_view);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.number_input_view)");
                this.f93654q = (NumberInputView) findViewById3;
                ViewGroup viewGroup3 = this.f93641c;
                if (viewGroup3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                View findViewById4 = viewGroup3.findViewById(R.id.tv_error_tips);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.tv_error_tips)");
                this.f93645g = (TextView) findViewById4;
                ViewGroup viewGroup4 = this.f93641c;
                if (viewGroup4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                View findViewById5 = viewGroup4.findViewById(R.id.tv_tips);
                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.tv_tips)");
                this.f93644f = (TextView) findViewById5;
                View inflate = LayoutInflater.from(mo133937o()).inflate(R.layout.face2face_grid_layout, (ViewGroup) null, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(getC…grid_layout, null, false)");
                this.f93643e = inflate;
                if (inflate == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicantsView");
                }
                View findViewById6 = inflate.findViewById(R.id.confirm_button);
                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "applicantsView.findViewById(R.id.confirm_button)");
                this.f93648j = (Button) findViewById6;
                View view = this.f93643e;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicantsView");
                }
                View findViewById7 = view.findViewById(R.id.applicants_grid);
                Intrinsics.checkExpressionValueIsNotNull(findViewById7, "applicantsView.findViewById(R.id.applicants_grid)");
                this.f93646h = (RecyclerView) findViewById7;
                View view2 = this.f93643e;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicantsView");
                }
                View findViewById8 = view2.findViewById(R.id.desc_header);
                Intrinsics.checkExpressionValueIsNotNull(findViewById8, "applicantsView.findViewById(R.id.desc_header)");
                this.f93647i = (TextView) findViewById8;
                RecyclerView recyclerView = this.f93646h;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicantsRV");
                }
                this.f93640b = new F2FApplicantsAdapter(recyclerView);
                RecyclerView recyclerView2 = this.f93646h;
                if (recyclerView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicantsRV");
                }
                F2FApplicantsAdapter aVar = this.f93640b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicantsAdapter");
                }
                recyclerView2.setAdapter(aVar);
                NumberInputView numberInputView = this.f93654q;
                if (numberInputView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("numberInputView");
                }
                numberInputView.post(new RunnableC36305f(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ui.CommonTitleBar");
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public void setViewDelegate(IF2FCreateGroupContract.IView.ViewDelegate aVar) {
        this.f93639a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$d */
    public static final class View$OnClickListenerC36303d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupView f93658a;

        View$OnClickListenerC36303d(F2FCreateGroupView bVar) {
            this.f93658a = bVar;
        }

        public final void onClick(View view) {
            this.f93658a.f93649k.mo133849d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$e */
    public static final class View$OnClickListenerC36304e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ F2FCreateGroupView f93659a;

        View$OnClickListenerC36304e(F2FCreateGroupView bVar) {
            this.f93659a = bVar;
        }

        public final void onClick(View view) {
            this.f93659a.mo133939q();
            IF2FCreateGroupContract.IView.ViewDelegate aVar = this.f93659a.f93639a;
            if (aVar != null) {
                aVar.mo133904d();
            }
            this.f93659a.mo133935m();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView
    /* renamed from: a */
    public void mo133922a(String str) {
        m142929v();
        m142924b(str);
        NumberDisplayView numberDisplayView = this.f93642d;
        if (numberDisplayView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberDisplayView");
        }
        NumberDisplayView.m142954a(numberDisplayView, false, 1, null);
    }

    public F2FCreateGroupView(IF2FCreateGroupContract.IView.ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f93649k = bVar;
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        this.f93650m = dependency.getChatDependency();
    }

    /* renamed from: b */
    private final void m142924b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = mo133937o().getString(R.string.Lark_Legacy_ErrorMessageTip);
        }
        new C25639g(mo133937o()).mo89242c(str).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, DialogInterface$OnClickListenerC36307h.f93662a).mo89239c();
    }

    /* renamed from: a */
    private final void m142923a(int i) {
        if (!this.f93652o) {
            SpannableStringBuilder t = m142927t();
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(i);
            sb.append(')');
            String sb2 = sb.toString();
            int length = t.length();
            t.append((CharSequence) sb2);
            t.setSpan(new StyleSpan(1), 0, t.length(), 17);
            t.setSpan(new ForegroundColorSpan(ContextCompat.getColor(mo133937o(), R.color.text_placeholder)), length, t.length(), 17);
            TextView textView = this.f93647i;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicantsDescHeader");
            }
            textView.setText(t);
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.f2f.IF2FCreateGroupContract.IView
    /* renamed from: a */
    public void mo133923a(List<ApplicantInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (this.f93652o) {
            this.f93652o = false;
            m142929v();
            m142928u();
            NumberInputView numberInputView = this.f93654q;
            if (numberInputView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("numberInputView");
            }
            numberInputView.mo133958a(false);
        }
        F2FApplicantsAdapter aVar = this.f93640b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicantsAdapter");
        }
        aVar.mo133909a(list);
        F2FApplicantsAdapter aVar2 = this.f93640b;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicantsAdapter");
        }
        m142923a(aVar2.mo133905a());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.c.b$h */
    public static final class DialogInterface$OnClickListenerC36307h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC36307h f93662a = new DialogInterface$OnClickListenerC36307h();

        DialogInterface$OnClickListenerC36307h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }
}
