package com.ss.android.lark.guide.biz.onboarding.tour.page.member;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.onboarding.res.IResGetter;
import com.ss.android.lark.guide.biz.onboarding.res.ResGetterFactory;
import com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addMemberBtn", "Landroid/widget/TextView;", "authEmailCheckBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "authEmailContent", "authEmailItem", "Landroid/view/View;", "contentView", "resGetter", "Lcom/ss/android/lark/guide/biz/onboarding/res/IResGetter;", "skipBtn", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "viewDelegate", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/IAddTeamMemberContract$IAddTeamMemberView$IDelegate;", "create", "", "destroy", "findViews", "getString", "", "resId", "", "init", "initListeners", "initViews", "setAuthCheckbox", "isChecked", "", "setViewDelegate", "showTrustedMail", "show", "mailDomain", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.c */
public final class AddTeamMemberView extends FrameLayout implements IAddTeamMemberContract.IAddTeamMemberView {

    /* renamed from: b */
    public static final Companion f99261b = new Companion(null);

    /* renamed from: a */
    public IAddTeamMemberContract.IAddTeamMemberView.IDelegate f99262a;

    /* renamed from: c */
    private CommonTitleBar f99263c;

    /* renamed from: d */
    private TextView f99264d;

    /* renamed from: e */
    private View f99265e;

    /* renamed from: f */
    private UDCheckBox f99266f;

    /* renamed from: g */
    private TextView f99267g;

    /* renamed from: h */
    private TextView f99268h;

    /* renamed from: i */
    private TextView f99269i;

    /* renamed from: j */
    private final IResGetter f99270j;

    /* renamed from: k */
    private HashMap f99271k;

    /* renamed from: a */
    public View mo141474a(int i) {
        if (this.f99271k == null) {
            this.f99271k = new HashMap();
        }
        View view = (View) this.f99271k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f99271k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberView$Companion;", "", "()V", "TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m152387a();
        IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar = this.f99262a;
        if (aVar != null) {
            aVar.mo141463a(this);
        }
    }

    /* renamed from: a */
    private final void m152387a() {
        View.inflate(getContext(), R.layout.guide_new_onboarding_add_team_member, this);
        m152389b();
        m152390c();
        m152391d();
    }

    /* renamed from: b */
    private final void m152389b() {
        this.f99263c = (CommonTitleBar) mo141474a(R.id.guide_add_team_member_title);
        this.f99264d = (TextView) mo141474a(R.id.guide_add_team_member_content);
        this.f99265e = (LinearLayout) mo141474a(R.id.guide_add_team_member_auth_email);
        this.f99266f = (UDCheckBox) mo141474a(R.id.guide_add_team_member_auth_email_check);
        this.f99267g = (TextView) mo141474a(R.id.guide_add_team_member_auth_email_content);
        this.f99268h = (TextView) mo141474a(R.id.guide_add_team_member_add_btn);
        this.f99269i = (TextView) mo141474a(R.id.guide_add_team_member_skip_btn);
    }

    /* renamed from: c */
    private final void m152390c() {
        CommonTitleBar commonTitleBar = this.f99263c;
        if (commonTitleBar != null) {
            commonTitleBar.setMainTitleTextStyle(1);
        }
        CommonTitleBar commonTitleBar2 = this.f99263c;
        if (commonTitleBar2 != null) {
            commonTitleBar2.setLeftClickListener(new View$OnClickListenerC38620b(this));
        }
        UDCheckBox uDCheckBox = this.f99266f;
        if (uDCheckBox != null) {
            uDCheckBox.setOnClickListener(new View$OnClickListenerC38621c(this));
        }
        TextView textView = this.f99268h;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC38622d(this));
        }
        TextView textView2 = this.f99269i;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC38623e(this));
        }
    }

    /* renamed from: d */
    private final void m152391d() {
        TextView leftText;
        int i;
        TextView textView;
        CommonTitleBar commonTitleBar = this.f99263c;
        if (commonTitleBar != null) {
            commonTitleBar.setTitle(m152388b(R.string.Lark_Guide_AddTeamMemberGuideTitle));
        }
        TextView textView2 = this.f99268h;
        if (textView2 != null) {
            textView2.setText(m152388b(R.string.Lark_Guide_AddTeamMemberGuideAdd));
        }
        TextView textView3 = this.f99269i;
        if (textView3 != null) {
            textView3.setText(m152388b(R.string.Lark_Guide_AddTeamMemberGuideSkip));
        }
        TextView textView4 = this.f99268h;
        if (textView4 != null) {
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            if (!a.mo141258h()) {
                textView4.setVisibility(8);
            }
        }
        IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar = this.f99262a;
        if (aVar != null) {
            String b = aVar.mo141465b();
            if (!(b == null || (textView = this.f99264d) == null)) {
                textView.setText(UIHelper.mustacheFormat(m152388b(R.string.Lark_Guide_AddTeamMemberGuideContent), "TENANT_NAME", b));
            }
            CommonTitleBar commonTitleBar2 = this.f99263c;
            if (!(commonTitleBar2 == null || (leftText = commonTitleBar2.getLeftText()) == null)) {
                if (aVar.mo141468e()) {
                    i = 0;
                } else {
                    i = 8;
                }
                leftText.setVisibility(i);
            }
        }
        View view = this.f99265e;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void setViewDelegate(IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar) {
        this.f99262a = aVar;
    }

    /* renamed from: b */
    private final String m152388b(int i) {
        return this.f99270j.mo141352a(i);
    }

    public void setAuthCheckbox(boolean z) {
        UDCheckBox uDCheckBox = this.f99266f;
        if (uDCheckBox != null) {
            uDCheckBox.setChecked(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.c$b */
    public static final class View$OnClickListenerC38620b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddTeamMemberView f99272a;

        View$OnClickListenerC38620b(AddTeamMemberView cVar) {
            this.f99272a = cVar;
        }

        public final void onClick(View view) {
            IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar = this.f99272a.f99262a;
            if (aVar != null) {
                aVar.mo141466c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.c$d */
    public static final class View$OnClickListenerC38622d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddTeamMemberView f99274a;

        View$OnClickListenerC38622d(AddTeamMemberView cVar) {
            this.f99274a = cVar;
        }

        public final void onClick(View view) {
            IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar = this.f99274a.f99262a;
            if (aVar != null) {
                aVar.mo141469f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.c$e */
    public static final class View$OnClickListenerC38623e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddTeamMemberView f99275a;

        View$OnClickListenerC38623e(AddTeamMemberView cVar) {
            this.f99275a = cVar;
        }

        public final void onClick(View view) {
            IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar = this.f99275a.f99262a;
            if (aVar != null) {
                aVar.mo141470g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.c$c */
    public static final class View$OnClickListenerC38621c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddTeamMemberView f99273a;

        View$OnClickListenerC38621c(AddTeamMemberView cVar) {
            this.f99273a = cVar;
        }

        public final void onClick(View view) {
            IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar = this.f99273a.f99262a;
            if (aVar == null) {
                return;
            }
            if (view != null) {
                aVar.mo141464a(((UDCheckBox) view).isChecked());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.checkbox.UDCheckBox");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddTeamMemberView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f99270j = ResGetterFactory.f99165a.mo141364a(context);
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract.IAddTeamMemberView
    /* renamed from: a */
    public void mo141475a(boolean z, String str) {
        boolean z2;
        String str2;
        if (z) {
            String str3 = str;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                View view = this.f99265e;
                if (view != null) {
                    view.setVisibility(0);
                }
                UDCheckBox uDCheckBox = this.f99266f;
                if (uDCheckBox != null) {
                    uDCheckBox.setChecked(false);
                }
                TextView textView = this.f99267g;
                if (textView != null) {
                    textView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Guide_AddTeamMemberGuideDomain, "DOMAIN", str));
                }
                OnboardingHitPoint.Companion aVar = OnboardingHitPoint.f99379a;
                IAddTeamMemberContract.IAddTeamMemberView.IDelegate aVar2 = this.f99262a;
                if (aVar2 != null) {
                    str2 = aVar2.mo141467d();
                } else {
                    str2 = null;
                }
                aVar.mo141608b(str2);
                return;
            }
        }
        View view2 = this.f99265e;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        Log.m165389i("AddTeamMemberView", "showTrustedMail, show=" + z + ", mailDomain=" + str);
    }
}
