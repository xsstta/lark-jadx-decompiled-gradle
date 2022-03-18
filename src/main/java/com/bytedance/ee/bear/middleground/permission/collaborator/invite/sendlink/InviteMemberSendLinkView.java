package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00122\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IView;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "rootView", "Landroid/view/View;", ShareHitPoint.f121869d, "", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Landroid/view/View;I)V", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/IInviteMemberSendLinkContract$IView$IViewDelegate;", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "create", "", "destroy", "getNotes", "", "initListeners", "initView", "setTips", "setViewDelegate", "viewDelegate", "showLoading", "show", "", "showUsers", "users", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g */
public final class InviteMemberSendLinkView implements IInviteMemberSendLinkContract.IView {

    /* renamed from: c */
    public static final Companion f26232c = new Companion(null);

    /* renamed from: a */
    public IInviteMemberSendLinkContract.IView.IViewDelegate f26233a;

    /* renamed from: b */
    public C9638a f26234b;

    /* renamed from: d */
    private final C11824c f26235d;

    /* renamed from: e */
    private final Context f26236e;

    /* renamed from: f */
    private final C10917c f26237f;

    /* renamed from: g */
    private final View f26238g;

    /* renamed from: h */
    private final int f26239h;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g$b */
    public static final class View$OnTouchListenerC9721b implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC9721b f26240a = new View$OnTouchListenerC9721b();

        View$OnTouchListenerC9721b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("InviteMemberSendLinkView", "create()...");
        m40243c();
        m40244d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("InviteMemberSendLinkView", "destroy()...");
        this.f26235d.mo45303c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView
    /* renamed from: a */
    public String mo37112a() {
        String obj;
        SpaceEditText spaceEditText = (SpaceEditText) this.f26238g.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        Editable text = spaceEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* renamed from: c */
    private final void m40243c() {
        Locale d = C4484g.m18494b().mo17253d();
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        Intrinsics.checkExpressionValueIsNotNull(d, "locale");
        Intrinsics.checkExpressionValueIsNotNull(f, "account");
        InviteMemberSendLinkAdapter bVar = new InviteMemberSendLinkAdapter(d, f);
        this.f26234b = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        bVar.mo36858a((C9638a.AbstractC9639a) new C9725f(this));
        RecyclerView recyclerView = (RecyclerView) this.f26238g.findViewById(R.id.usersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.usersRv");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this.f26236e));
        RecyclerView recyclerView2 = (RecyclerView) this.f26238g.findViewById(R.id.usersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.usersRv");
        C9638a aVar = this.f26234b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(aVar);
    }

    /* renamed from: d */
    private final void m40244d() {
        this.f26238g.setOnTouchListener(View$OnTouchListenerC9721b.f26240a);
        ((ImageView) this.f26238g.findViewById(R.id.titleBackIcon)).setOnClickListener(new C9722c(this));
        ((TextView) this.f26238g.findViewById(R.id.sendLinkTv)).setOnClickListener(new C9723d(this));
        ((TextView) this.f26238g.findViewById(R.id.askOwnerTv)).setOnClickListener(new C9724e(this));
    }

    /* renamed from: b */
    public final void mo37131b() {
        boolean z;
        Object obj;
        String str;
        String str2;
        boolean z2;
        C9638a aVar = this.f26234b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        List b = aVar.mo70673b();
        Intrinsics.checkExpressionValueIsNotNull(b, "adapter.data");
        Iterator a = CollectionsKt.asSequence(b).mo4717a();
        while (true) {
            z = true;
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            UserInfo userInfo = (UserInfo) obj;
            Intrinsics.checkExpressionValueIsNotNull(userInfo, "it");
            if (userInfo.getOwnerType() == 18) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (obj == null) {
            z = false;
        }
        String b2 = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(this.f26236e, this.f26239h);
        HashMap hashMap = new HashMap();
        Intrinsics.checkExpressionValueIsNotNull(b2, "typeName");
        hashMap.put("doc_type", b2);
        if (z) {
            int i = this.f26239h;
            C8275a aVar2 = C8275a.f22379l;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.MINUTES");
            if (i == aVar2.mo32555b()) {
                str2 = this.f26236e.getString(R.string.CreationMobile_Common_MinutesBot);
            } else {
                str2 = this.f26236e.getString(R.string.CreatinoMobile_Minutes_bot_DocsAssist);
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "if (type == DocumentType…e_Minutes_bot_DocsAssist)");
            hashMap.put("bot", str2);
            str = C10539a.m43640a(this.f26236e, R.string.Doc_Permission_SendLinkWithDepTips_AddVariable, hashMap);
        } else {
            str = C10539a.m43640a(this.f26236e, R.string.Doc_Permission_SendLinkTips_AddVariable, hashMap);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "tips");
        ((UDNotice) this.f26238g.findViewById(R.id.bannerTipsLayout)).setText(str);
    }

    /* renamed from: a */
    public void setViewDelegate(IInviteMemberSendLinkContract.IView.IViewDelegate aVar) {
        this.f26233a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkView$initListeners$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g$c */
    public static final class C9722c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InviteMemberSendLinkView f26241a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9722c(InviteMemberSendLinkView gVar) {
            this.f26241a = gVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IInviteMemberSendLinkContract.IView.IViewDelegate aVar = this.f26241a.f26233a;
            if (aVar != null) {
                aVar.mo37115a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkView$initListeners$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g$d */
    public static final class C9723d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InviteMemberSendLinkView f26242a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9723d(InviteMemberSendLinkView gVar) {
            this.f26242a = gVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IInviteMemberSendLinkContract.IView.IViewDelegate aVar = this.f26242a.f26233a;
            if (aVar != null) {
                aVar.mo37117b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkView$initListeners$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g$e */
    public static final class C9724e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InviteMemberSendLinkView f26243a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9724e(InviteMemberSendLinkView gVar) {
            this.f26243a = gVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IInviteMemberSendLinkContract.IView.IViewDelegate aVar = this.f26243a.f26233a;
            if (aVar != null) {
                aVar.mo37118c();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C9638a m40242a(InviteMemberSendLinkView gVar) {
        C9638a aVar = gVar.f26234b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView
    /* renamed from: a */
    public void mo37113a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "users");
        C9638a aVar = this.f26234b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo70690f(arrayList);
        mo37131b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.IInviteMemberSendLinkContract.IView
    /* renamed from: a */
    public void mo37114a(boolean z) {
        if (z) {
            this.f26235d.mo45304d();
        } else {
            this.f26235d.mo45303c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "position", "", "onItemPermissionClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.g$f */
    public static final class C9725f implements C9638a.AbstractC9639a {

        /* renamed from: a */
        final /* synthetic */ InviteMemberSendLinkView f26244a;

        C9725f(InviteMemberSendLinkView gVar) {
            this.f26244a = gVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a.AbstractC9639a
        /* renamed from: a */
        public final void mo36860a(UserInfo userInfo, int i) {
            InviteMemberSendLinkView gVar = this.f26244a;
            InviteMemberSendLinkView.m40242a(gVar).notifyItemRemoved(i);
            IInviteMemberSendLinkContract.IView.IViewDelegate aVar = gVar.f26233a;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(userInfo, "userInfo");
                aVar.mo37116a(i, userInfo);
            }
            gVar.mo37131b();
        }
    }

    public InviteMemberSendLinkView(Context context, C10917c cVar, View view, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f26236e = context;
        this.f26237f = cVar;
        this.f26238g = view;
        this.f26239h = i;
        this.f26235d = new C11824c(context);
    }
}
