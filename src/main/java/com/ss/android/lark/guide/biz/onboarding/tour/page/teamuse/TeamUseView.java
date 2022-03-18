package com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.ITeamUseContract;
import com.ss.android.lark.ui.CommonTitleBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/TeamUseView;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "joinTeam", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "upgradeTeam", "viewDelegate", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamuse/ITeamUseContract$ITeamUseView$IDelegate;", "bindViews", "", "create", "destroy", "init", "setViewDelegate", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.d */
public final class TeamUseView implements ITeamUseContract.ITeamUseView {

    /* renamed from: a */
    public View f99295a;

    /* renamed from: b */
    public ITeamUseContract.ITeamUseView.IDelegate f99296b;

    /* renamed from: c */
    private CommonTitleBar f99297c;

    /* renamed from: d */
    private View f99298d;

    /* renamed from: e */
    private final View f99299e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m152446a();
        m152447b();
    }

    /* renamed from: a */
    private final void m152446a() {
        this.f99297c = (CommonTitleBar) this.f99299e.findViewById(R.id.title_bar);
        this.f99298d = (CardView) this.f99299e.findViewById(R.id.upgrade_team);
        this.f99295a = (CardView) this.f99299e.findViewById(R.id.join_team);
    }

    /* renamed from: b */
    private final void m152447b() {
        CommonTitleBar commonTitleBar = this.f99297c;
        if (commonTitleBar != null) {
            commonTitleBar.setMainTitleTextStyle(1);
        }
        View view = this.f99298d;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC38625a(this));
        }
        View view2 = this.f99295a;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC38626b(this));
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ITeamUseContract.ITeamUseView.IDelegate aVar) {
        this.f99296b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.d$a */
    public static final class View$OnClickListenerC38625a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamUseView f99300a;

        View$OnClickListenerC38625a(TeamUseView dVar) {
            this.f99300a = dVar;
        }

        public final void onClick(View view) {
            ITeamUseContract.ITeamUseView.IDelegate aVar = this.f99300a.f99296b;
            if (aVar != null) {
                aVar.mo141509a();
            }
        }
    }

    public TeamUseView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f99299e = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamuse.d$b */
    public static final class View$OnClickListenerC38626b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamUseView f99301a;

        View$OnClickListenerC38626b(TeamUseView dVar) {
            this.f99301a = dVar;
        }

        public final void onClick(View view) {
            Context context;
            ITeamUseContract.ITeamUseView.IDelegate aVar = this.f99301a.f99296b;
            if (aVar != null) {
                View view2 = this.f99301a.f99295a;
                if (view2 != null) {
                    context = view2.getContext();
                } else {
                    context = null;
                }
                aVar.mo141510a(context);
            }
        }
    }
}
