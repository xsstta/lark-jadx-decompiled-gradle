package com.ss.android.vc.meeting.module.follow.share;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.CreateDocEntityRequest;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63772u;
import com.ss.android.vc.statistics.event2.MeetingShareWindowEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0014J\u001c\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0014J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u0010#\u001a\u00020\u001aR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/share/NewShareFilePupop;", "Lcom/ss/android/vc/meeting/utils/popup/VCBasePopup;", "activity", "Landroid/app/Activity;", "anchor", "Landroid/view/View;", "meeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "sharePanelSource", "Lcom/ss/android/vc/meeting/module/follow/share/desktop/ShareContentViewHolder$SharePanelSource;", "localSharePrepareView", "Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;", "dialogInterface", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Landroid/app/Activity;Landroid/view/View;Lcom/ss/android/vc/meeting/framework/meeting/Meeting;Lcom/ss/android/vc/meeting/module/follow/share/desktop/ShareContentViewHolder$SharePanelSource;Lcom/ss/android/vc/meeting/module/sharebox/ILocalSharePrepareContract$IView;Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "contentWithNoShadow", "mContext", "Landroid/content/Context;", "mDocxBetaTag", "mNewBitableView", "mNewDocView", "mNewDocxView", "mNewMindNoteView", "mNewSheetView", "rootView", "dismiss", "", "initAction", "initAttributes", "initViews", "view", "popup", "sendNewFileRequest", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/request/CreateDocEntityRequest$CreateDocType;", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.follow.share.f */
public final class NewShareFilePupop extends AbstractC63524a<NewShareFilePupop> {

    /* renamed from: d */
    public static final Companion f155257d = new Companion(null);

    /* renamed from: A */
    private AbstractC61222a f155258A;

    /* renamed from: a */
    public C61303k f155259a;

    /* renamed from: b */
    public ShareContentViewHolder.SharePanelSource f155260b;

    /* renamed from: c */
    public ILocalSharePrepareContract.IView f155261c;

    /* renamed from: p */
    private Context f155262p;

    /* renamed from: q */
    private View f155263q;

    /* renamed from: r */
    private View f155264r;

    /* renamed from: s */
    private View f155265s;

    /* renamed from: t */
    private View f155266t;

    /* renamed from: u */
    private View f155267u;

    /* renamed from: v */
    private View f155268v;

    /* renamed from: w */
    private View f155269w;

    /* renamed from: x */
    private View f155270x;

    /* renamed from: y */
    private Activity f155271y;

    /* renamed from: z */
    private View f155272z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.new_follow_file_layout);
        mo219688a(true);
        mo219695b(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$sendNewFileRequest$1", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "onCreateFail", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onCreateSuccess", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$g */
    public static final class C61846g implements AbstractC61751a.AbstractC61752a {

        /* renamed from: a */
        final /* synthetic */ CreateDocEntityRequest.CreateDocType f155278a;

        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61752a
        /* renamed from: a */
        public void mo213913a() {
            C60700b.m235851b("NewShareFilePupop", "[onCreateSuccess]", "create file success with type:" + this.f155278a);
        }

        C61846g(CreateDocEntityRequest.CreateDocType createDocType) {
            this.f155278a = createDocType;
        }

        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61752a
        /* renamed from: a */
        public void mo213914a(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            C60700b.m235864f("NewShareFilePupop", "[onCreateFail]", "create file fail with type:" + this.f155278a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$sendNewFileRequest$2", "Lcom/ss/android/vc/meeting/module/follow/AbsFollowContentControl$ICreateDocCallback;", "onCreateFail", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onCreateSuccess", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$h */
    public static final class C61847h implements AbstractC61751a.AbstractC61752a {

        /* renamed from: a */
        final /* synthetic */ CreateDocEntityRequest.CreateDocType f155279a;

        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61752a
        /* renamed from: a */
        public void mo213913a() {
            C60700b.m235851b("NewShareFilePupop", "[onCreateSuccess2]", "create file success with type:" + this.f155279a);
        }

        C61847h(CreateDocEntityRequest.CreateDocType createDocType) {
            this.f155279a = createDocType;
        }

        @Override // com.ss.android.vc.meeting.module.follow.AbstractC61751a.AbstractC61752a
        /* renamed from: a */
        public void mo213914a(C63602e eVar) {
            C60700b.m235864f("NewShareFilePupop", "[onCreateFail2]", "create file fail with type:" + this.f155279a);
            if (eVar != null && !eVar.f160600c) {
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", String.valueOf(eVar.mo219899a())));
                }
            }
        }
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        AbstractC61222a aVar;
        C60700b.m235851b("NewShareFilePupop", "[dismiss]", "");
        if ((this.f155262p instanceof Activity) && mo219704l() && UIUtils.isActivityRunning((Activity) this.f155262p)) {
            super.mo211398c();
        }
        if (this.f155260b == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW && (aVar = this.f155258A) != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo211397b() {
        int i;
        int i2;
        int i3;
        C60700b.m235851b("NewShareFilePupop", "[show]", "");
        mo219702j();
        View view = this.f155272z;
        if (view != null) {
            int width = view.getWidth();
            View view2 = this.f155269w;
            if (view2 != null) {
                i = view2.getMeasuredWidth();
            } else {
                i = 0;
            }
            int i4 = width - i;
            View view3 = this.f155263q;
            if (view3 != null) {
                i2 = view3.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            View view4 = this.f155269w;
            if (view4 != null) {
                i3 = view4.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            mo219691a(this.f155272z, i4 - ((i2 - i3) / 2), 0, 8388611);
        }
    }

    /* renamed from: d */
    private final void m241601d() {
        if (C63634c.m249496b("byteview.callmeeting.android.magic_share_new_docs")) {
            View view = this.f155264r;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f155264r;
            if (view2 != null) {
                view2.setOnClickListener(new C61841b(this));
            }
        } else {
            View view3 = this.f155264r;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        if (C63634c.m249496b("byteview.meeting.android.magic_share_docx")) {
            View view4 = this.f155265s;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f155265s;
            if (view5 != null) {
                view5.setOnClickListener(new C61842c(this));
            }
            if (C63634c.m249496b("byteview.meeting.android.magic_share_docx_beta")) {
                View view6 = this.f155268v;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
            } else {
                View view7 = this.f155268v;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
            }
        } else {
            View view8 = this.f155265s;
            if (view8 != null) {
                view8.setVisibility(8);
            }
        }
        if (C63634c.m249496b("byteview.callmeeting.android.magic_share_new_sheets")) {
            View view9 = this.f155266t;
            if (view9 != null) {
                view9.setVisibility(0);
            }
            View view10 = this.f155266t;
            if (view10 != null) {
                view10.setOnClickListener(new C61843d(this));
            }
        } else {
            View view11 = this.f155266t;
            if (view11 != null) {
                view11.setVisibility(8);
            }
        }
        if (C63634c.m249496b("byteview.callmeeting.android.magic_share_new_mindnotes")) {
            View view12 = this.f155267u;
            if (view12 != null) {
                view12.setVisibility(0);
            }
            View view13 = this.f155267u;
            if (view13 != null) {
                view13.setOnClickListener(new C61844e(this));
            }
        } else {
            View view14 = this.f155267u;
            if (view14 != null) {
                view14.setVisibility(8);
            }
        }
        if (C63634c.m249496b("byteview.meeting.android.magic_share_bitable")) {
            View view15 = this.f155270x;
            if (view15 != null) {
                view15.setVisibility(0);
            }
            View view16 = this.f155270x;
            if (view16 != null) {
                view16.setOnClickListener(new C61845f(this));
                return;
            }
            return;
        }
        View view17 = this.f155270x;
        if (view17 == null) {
            Intrinsics.throwNpe();
        }
        view17.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$initAction$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$b */
    public static final class C61841b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NewShareFilePupop f155273a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61841b(NewShareFilePupop fVar) {
            this.f155273a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String n;
            this.f155273a.mo214205a(CreateDocEntityRequest.CreateDocType.DOC);
            MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
            C61303k kVar = this.f155273a.f155259a;
            ShareContentViewHolder.SharePanelSource sharePanelSource = this.f155273a.f155260b;
            if (this.f155273a.f155261c == null) {
                n = null;
            } else {
                ILocalSharePrepareContract.IView bVar = this.f155273a.f155261c;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                n = bVar.mo217810n();
            }
            MeetingShareWindowEvent.Companion.m249898a(aVar, kVar, "new_docs", sharePanelSource, n, null, null, 48, null);
            this.f155273a.mo211398c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$initAction$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$c */
    public static final class C61842c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NewShareFilePupop f155274a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61842c(NewShareFilePupop fVar) {
            this.f155274a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String str;
            ILocalSharePrepareContract.IView bVar;
            this.f155274a.mo214205a(CreateDocEntityRequest.CreateDocType.DOCX);
            MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
            C61303k kVar = this.f155274a.f155259a;
            ShareContentViewHolder.SharePanelSource sharePanelSource = this.f155274a.f155260b;
            if (this.f155274a.f155261c == null || (bVar = this.f155274a.f155261c) == null) {
                str = null;
            } else {
                str = bVar.mo217810n();
            }
            MeetingShareWindowEvent.Companion.m249898a(aVar, kVar, "new_docx", sharePanelSource, str, null, null, 48, null);
            this.f155274a.mo211398c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$initAction$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$d */
    public static final class C61843d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NewShareFilePupop f155275a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61843d(NewShareFilePupop fVar) {
            this.f155275a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String n;
            this.f155275a.mo214205a(CreateDocEntityRequest.CreateDocType.SHEET);
            MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
            C61303k kVar = this.f155275a.f155259a;
            ShareContentViewHolder.SharePanelSource sharePanelSource = this.f155275a.f155260b;
            if (this.f155275a.f155261c == null) {
                n = null;
            } else {
                ILocalSharePrepareContract.IView bVar = this.f155275a.f155261c;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                n = bVar.mo217810n();
            }
            MeetingShareWindowEvent.Companion.m249898a(aVar, kVar, "new_sheets", sharePanelSource, n, null, null, 48, null);
            this.f155275a.mo211398c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$initAction$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$e */
    public static final class C61844e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NewShareFilePupop f155276a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61844e(NewShareFilePupop fVar) {
            this.f155276a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String n;
            this.f155276a.mo214205a(CreateDocEntityRequest.CreateDocType.MINDNOTE);
            MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
            C61303k kVar = this.f155276a.f155259a;
            ShareContentViewHolder.SharePanelSource sharePanelSource = this.f155276a.f155260b;
            if (this.f155276a.f155261c == null) {
                n = null;
            } else {
                ILocalSharePrepareContract.IView bVar = this.f155276a.f155261c;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                n = bVar.mo217810n();
            }
            MeetingShareWindowEvent.Companion.m249898a(aVar, kVar, "new_mindnotes", sharePanelSource, n, null, null, 48, null);
            this.f155276a.mo211398c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/vc/meeting/module/follow/share/NewShareFilePupop$initAction$5", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.f$f */
    public static final class C61845f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ NewShareFilePupop f155277a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61845f(NewShareFilePupop fVar) {
            this.f155277a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            String n;
            this.f155277a.mo214205a(CreateDocEntityRequest.CreateDocType.BITABLE);
            MeetingShareWindowEvent.Companion aVar = MeetingShareWindowEvent.f160861a;
            C61303k kVar = this.f155277a.f155259a;
            ShareContentViewHolder.SharePanelSource sharePanelSource = this.f155277a.f155260b;
            if (this.f155277a.f155261c == null) {
                n = null;
            } else {
                ILocalSharePrepareContract.IView bVar = this.f155277a.f155261c;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                n = bVar.mo217810n();
            }
            MeetingShareWindowEvent.Companion.m249898a(aVar, kVar, "new_bitable", sharePanelSource, n, null, null, 48, null);
            this.f155277a.mo211398c();
        }
    }

    /* renamed from: a */
    public final void mo214205a(CreateDocEntityRequest.CreateDocType createDocType) {
        ILocalSharePrepareContract.IView bVar;
        AbstractC61417a W;
        AbstractC61751a g;
        if (this.f155259a == null && this.f155260b == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            C60700b.m235851b("NewShareFilePupop", "[sendNewFileRequest]", "fail with meeting is null");
            return;
        }
        VideoChat videoChat = null;
        if (this.f155260b == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            C61303k kVar = this.f155259a;
            if (kVar != null) {
                videoChat = kVar.mo212056e();
            }
            C63772u.m250378a(createDocType, videoChat);
        } else {
            C63772u.m250378a(createDocType, null);
        }
        if (this.f155260b == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            C61303k kVar2 = this.f155259a;
            if (kVar2 != null && (W = kVar2.mo212105W()) != null && (g = W.mo212828g()) != null) {
                g.mo213856a(createDocType, new C61846g(createDocType));
            }
        } else if (this.f155260b == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB && (bVar = this.f155261c) != null) {
            bVar.mo217791a(createDocType, new C61847h(createDocType));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, NewShareFilePupop fVar) {
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View k = mo219703k();
        this.f155263q = k;
        View view8 = null;
        if (k != null) {
            view2 = k.findViewById(R.id.new_file_doc);
        } else {
            view2 = null;
        }
        this.f155264r = view2;
        View view9 = this.f155263q;
        if (view9 != null) {
            view3 = view9.findViewById(R.id.new_file_docx);
        } else {
            view3 = null;
        }
        this.f155265s = view3;
        View view10 = this.f155263q;
        if (view10 != null) {
            view4 = view10.findViewById(R.id.docx_beta);
        } else {
            view4 = null;
        }
        this.f155268v = view4;
        View view11 = this.f155263q;
        if (view11 != null) {
            view5 = view11.findViewById(R.id.new_file_sheet);
        } else {
            view5 = null;
        }
        this.f155266t = view5;
        View view12 = this.f155263q;
        if (view12 != null) {
            view6 = view12.findViewById(R.id.new_file_mind_note);
        } else {
            view6 = null;
        }
        this.f155267u = view6;
        View view13 = this.f155263q;
        if (view13 != null) {
            view7 = view13.findViewById(R.id.new_follow_file_view_with_no_shadow);
        } else {
            view7 = null;
        }
        this.f155269w = view7;
        View view14 = this.f155263q;
        if (view14 != null) {
            view8 = view14.findViewById(R.id.new_file_bitable);
        }
        this.f155270x = view8;
        m241601d();
    }

    public NewShareFilePupop(Activity activity, View view, C61303k kVar, ShareContentViewHolder.SharePanelSource sharePanelSource, ILocalSharePrepareContract.IView bVar, AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(sharePanelSource, "sharePanelSource");
        this.f155271y = activity;
        this.f155272z = view;
        this.f155259a = kVar;
        this.f155260b = sharePanelSource;
        this.f155261c = bVar;
        this.f155258A = aVar;
        Activity activity2 = activity;
        this.f155262p = activity2;
        mo219694b((Context) activity2);
    }
}
