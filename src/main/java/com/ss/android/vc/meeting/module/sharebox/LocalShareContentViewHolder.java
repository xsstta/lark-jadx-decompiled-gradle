package com.ss.android.vc.meeting.module.sharebox;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.common.FollowConfig;
import com.ss.android.vc.meeting.module.follow.share.IShareContentDialog;
import com.ss.android.vc.meeting.module.follow.share.NewShareFilePupop;
import com.ss.android.vc.meeting.module.follow.share.desktop.C61832d;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.p3151p.C62623f;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.service.C63634c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0014J\b\u0010\u0014\u001a\u00020\bH\u0014J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0014J\b\u0010\u0017\u001a\u00020\bH\u0014J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentViewHolder;", "Lcom/ss/android/vc/meeting/module/follow/share/desktop/ShareContentViewHolder;", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "(Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;)V", "getLocalSharePrepareView", "()Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "checkAudioPermissionAndStartUssReceive", "", "createView", "Landroid/view/View;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "context", "Landroid/content/Context;", "dialogInterface", "Lcom/ss/android/vc/meeting/module/follow/share/IShareContentDialog;", "init", "initAutoConnect", "initBackView", "initFollowItem", "initShareFileArea", "initSharePageView", "initShareScreenItem", "setFollowEnable", "enable", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.sharebox.h */
public final class LocalShareContentViewHolder extends ShareContentViewHolder {

    /* renamed from: n */
    public static final Companion f158844n = new Companion(null);

    /* renamed from: o */
    private final ILocalSharePrepareContract.IView f158845o;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.h$c */
    public static final class View$OnClickListenerC63026c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC63026c f158847a = new View$OnClickListenerC63026c();

        View$OnClickListenerC63026c() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/sharebox/LocalShareContentViewHolder$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: j */
    public final ILocalSharePrepareContract.IView mo217830j() {
        return this.f158845o;
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: a */
    public void mo214174a() {
        mo214175b();
        m246802k();
    }

    /* renamed from: l */
    private final void m246803l() {
        ILocalSharePrepareContract.IView bVar;
        if (this.f155183a != null && C60795b.m236296a(this.f155183a, "android.permission.RECORD_AUDIO") && (bVar = this.f158845o) != null) {
            bVar.mo217805i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: b */
    public void mo214175b() {
        if (FollowConfig.m241446b()) {
            mo214177d();
            mo214178e();
        }
        mo214181h();
        mo214176c();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: e */
    public void mo214178e() {
        this.f155190h = new C61832d(ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB, this.f158845o, this.f155186d, this.f155183a, this.f155184b, this.f155185c);
        C61832d dVar = this.f155190h;
        if (dVar != null) {
            dVar.mo214191b();
        }
    }

    /* renamed from: k */
    private final void m246802k() {
        ILocalSharePrepareContract.IView bVar = this.f158845o;
        boolean z = true;
        if (bVar == null || !bVar.mo217801e()) {
            z = false;
        }
        C60700b.m235851b("LocalShareContentViewHolder@", "[initAutoConnect]", "isAutoConnectOpen " + z);
        if (z) {
            m246803l();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: c */
    public void mo214176c() {
        this.f155189g = (IconFontView) this.f155185c.findViewById(R.id.go_back);
        if (DesktopUtil.m144307b()) {
            this.f155189g.setText(R.string.iconfont_icon_close);
        }
        this.f155189g.setOnClickListener(new View$OnClickListenerC63025b(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: h */
    public void mo214181h() {
        this.f155188f = new C62623f(null, this.f155184b, this.f155185c, ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB, this.f158845o);
        this.f155191i = (LinearLayout) this.f155185c.findViewById(R.id.share_screen_and_new_file_container);
        this.f155193k = this.f155185c.findViewById(R.id.share_content_appbar_layout);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: d */
    public void mo214177d() {
        this.f155192j = this.f155185c.findViewById(R.id.container_search);
        this.f155195m = (ConstraintLayout) this.f155185c.findViewById(R.id.search_bar_highlight);
        this.f155187e = new ShareContentViewHolder.C61828a();
        View view = this.f155187e.f155196a;
        Intrinsics.checkExpressionValueIsNotNull(view, "mFollowViewHolder.mFollowShareItem");
        view.setVisibility(0);
        this.f155187e.f155196a.setOnClickListener(View$OnClickListenerC63026c.f158847a);
        if (!FollowConfig.m241446b() || !C63634c.m249496b("byteview.callmeeting.android.magic_share_new_ccm")) {
            View view2 = this.f155187e.f155197b;
            Intrinsics.checkExpressionValueIsNotNull(view2, "mFollowViewHolder.mNewDocFileItem");
            view2.setVisibility(8);
            return;
        }
        View view3 = this.f155187e.f155197b;
        Intrinsics.checkExpressionValueIsNotNull(view3, "mFollowViewHolder.mNewDocFileItem");
        view3.setVisibility(0);
        this.f155187e.f155197b.setOnClickListener(new View$OnClickListenerC63027d(this));
    }

    public LocalShareContentViewHolder(ILocalSharePrepareContract.IView bVar) {
        this.f158845o = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.h$b */
    public static final class View$OnClickListenerC63025b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareContentViewHolder f158846a;

        View$OnClickListenerC63025b(LocalShareContentViewHolder hVar) {
            this.f158846a = hVar;
        }

        public final void onClick(View view) {
            this.f158846a.f155184b.dismiss();
            if (this.f158846a.f155190h != null) {
                this.f158846a.f155190h.mo214195d();
            }
            Activity activity = this.f158846a.f155183a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.sharebox.h$d */
    public static final class View$OnClickListenerC63027d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LocalShareContentViewHolder f158848a;

        View$OnClickListenerC63027d(LocalShareContentViewHolder hVar) {
            this.f158848a = hVar;
        }

        public final void onClick(View view) {
            ((NewShareFilePupop) new NewShareFilePupop(this.f158848a.f155183a, this.f158848a.f155187e.f155197b, null, ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB, this.f158848a.mo217830j(), this.f158848a.f155184b).mo219699g()).mo211397b();
        }
    }

    /* renamed from: a */
    public final void mo217829a(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout.Behavior behavior;
        if (!z) {
            ConstraintLayout constraintLayout = this.f155195m;
            if (constraintLayout == null || constraintLayout.getVisibility() != 0) {
                View view = this.f155193k;
                AppBarLayout.Behavior behavior2 = null;
                if (view != null) {
                    layoutParams = view.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                    layoutParams = null;
                }
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    behavior = layoutParams2.getBehavior();
                } else {
                    behavior = null;
                }
                if (behavior instanceof AppBarLayout.Behavior) {
                    behavior2 = behavior;
                }
                AppBarLayout.Behavior behavior3 = behavior2;
                if (behavior3 != null) {
                    View view2 = this.f155193k;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "appBarLayout");
                    behavior3.setTopAndBottomOffset(-view2.getTop());
                }
            } else {
                C61832d dVar = this.f155190h;
                if (dVar != null) {
                    dVar.mo214186a(this.f155185c, z);
                }
            }
        }
        this.f155187e.mo214183a(z);
        this.f155190h.mo214192b(z);
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder
    /* renamed from: a */
    public View mo214173a(C61303k kVar, Context context, IShareContentDialog bVar) {
        LinearLayout linearLayout;
        this.f155183a = C60773o.m236124b(context);
        this.f155184b = bVar;
        if (FollowConfig.m241446b()) {
            View inflate = LayoutInflater.from(this.f155183a).inflate(R.layout.dialog_share_content2, (ViewGroup) null);
            if (inflate != null) {
                linearLayout = (LinearLayout) inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        } else {
            View inflate2 = LayoutInflater.from(this.f155183a).inflate(R.layout.dialog_share_content, (ViewGroup) null);
            if (inflate2 != null) {
                linearLayout = (LinearLayout) inflate2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        }
        this.f155185c = linearLayout;
        mo214174a();
        return this.f155185c;
    }
}
