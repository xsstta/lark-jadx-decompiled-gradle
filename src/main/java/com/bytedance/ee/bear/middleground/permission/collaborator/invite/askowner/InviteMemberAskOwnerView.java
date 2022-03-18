package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9707d;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermDialog;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModelHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J \u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)2\u0006\u0010*\u001a\u00020\u000bH\u0014J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000bH\u0004J\u0010\u00100\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000bH\u0004J\u0010\u00101\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000bH\u0004J\b\u00102\u001a\u00020$H\u0002J\u0012\u00103\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207H\u0016J \u00108\u001a\u00020$2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000b0'j\b\u0012\u0004\u0012\u00020\u000b`)H\u0016R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IView;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;Lcom/bytedance/ee/bear/share/export/UserInfo;)V", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "getAdapter", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "setAdapter", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;)V", "getContext", "()Landroid/content/Context;", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/IInviteMemberAskOwnerContract$IView$IViewDelegate;", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale$delegate", "Lkotlin/Lazy;", "permissionDialog", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermDialog;", "position", "", "create", "", "destroy", "getEditPermModelList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lkotlin/collections/ArrayList;", "userInfo", "getNotes", "", "initListeners", "initView", "onClickRemovePermission", "onClickSetCanEdit", "onClickSetCanRead", "setTips", "setViewDelegate", "viewDelegate", "showLoading", "show", "", "showUsers", "users", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f */
public class InviteMemberAskOwnerView implements IInviteMemberAskOwnerContract.IView {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26168a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(InviteMemberAskOwnerView.class), "locale", "getLocale()Ljava/util/Locale;"))};

    /* renamed from: h */
    public static final Companion f26169h = new Companion(null);

    /* renamed from: b */
    public IInviteMemberAskOwnerContract.IView.IViewDelegate f26170b;

    /* renamed from: c */
    protected C9638a f26171c;

    /* renamed from: d */
    public EditPermDialog f26172d;

    /* renamed from: e */
    public int f26173e;

    /* renamed from: f */
    public final DocPermSetInfo f26174f;

    /* renamed from: g */
    public final UserInfo f26175g;

    /* renamed from: i */
    private final C11824c f26176i;

    /* renamed from: j */
    private final Lazy f26177j = LazyKt.lazy(C9704i.INSTANCE);

    /* renamed from: k */
    private final Context f26178k;

    /* renamed from: l */
    private final C10917c f26179l;

    /* renamed from: m */
    private final View f26180m;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$e */
    public static final class View$OnTouchListenerC9700e implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC9700e f26187a = new View$OnTouchListenerC9700e();

        View$OnTouchListenerC9700e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: c */
    private final Locale m40156c() {
        Lazy lazy = this.f26177j;
        KProperty kProperty = f26168a[0];
        return (Locale) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Context mo37034b() {
        return this.f26178k;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$i */
    static final class C9704i extends Lambda implements Function0<Locale> {
        public static final C9704i INSTANCE = new C9704i();

        C9704i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Locale invoke() {
            return C4484g.m18494b().mo17253d();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C13479a.m54764b("InviteMemberAskOwnerView", "create()...");
        m40157d();
        m40158e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("InviteMemberAskOwnerView", "destroy()...");
        this.f26176i.mo45303c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IView
    /* renamed from: a */
    public String mo37018a() {
        String obj;
        SpaceEditText spaceEditText = (SpaceEditText) this.f26180m.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        Editable text = spaceEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* renamed from: e */
    private final void m40158e() {
        this.f26180m.setOnTouchListener(View$OnTouchListenerC9700e.f26187a);
        ((ImageView) this.f26180m.findViewById(R.id.titleBackIcon)).setOnClickListener(new C9701f(this));
        ((TextView) this.f26180m.findViewById(R.id.askOwnerTv)).setOnClickListener(new C9702g(this));
    }

    /* renamed from: d */
    private final void m40157d() {
        C9707d dVar = new C9707d(m40156c(), ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
        this.f26171c = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        dVar.mo36858a((C9638a.AbstractC9639a) new C9703h(this));
        RecyclerView recyclerView = (RecyclerView) this.f26180m.findViewById(R.id.usersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.usersRv");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this.f26178k));
        RecyclerView recyclerView2 = (RecyclerView) this.f26180m.findViewById(R.id.usersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.usersRv");
        C9638a aVar = this.f26171c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView2.setAdapter(aVar);
        String a = C10539a.m43639a(this.f26178k, R.string.Doc_Permission_AskOwner_placeholder, "owner_name", this.f26175g.getDisplayName(m40156c()));
        SpaceEditText spaceEditText = (SpaceEditText) this.f26180m.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        spaceEditText.setHint(a);
    }

    /* renamed from: f */
    private final void m40159f() {
        boolean z;
        String str;
        String str2;
        boolean z2;
        String displayName = this.f26175g.getDisplayName(m40156c());
        if (displayName == null) {
            displayName = "";
        }
        if (displayName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13479a.m54775e("InviteMemberAskOwnerView", "owner name is empty, hide banner");
            UDNotice uDNotice = (UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice, "rootView.bannerTipsLayout");
            uDNotice.setVisibility(8);
            return;
        }
        UDNotice uDNotice2 = (UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout);
        Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "rootView.bannerTipsLayout");
        uDNotice2.setVisibility(0);
        Object obj = null;
        String b = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(this.f26178k, this.f26174f.mo38825b());
        HashMap hashMap = new HashMap();
        hashMap.put("name", '@' + displayName);
        Intrinsics.checkExpressionValueIsNotNull(b, "docType");
        hashMap.put("doc_type", b);
        C9638a aVar = this.f26171c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        List b2 = aVar.mo70673b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "adapter.data");
        Iterator a = CollectionsKt.asSequence(b2).mo4717a();
        while (true) {
            if (!a.hasNext()) {
                break;
            }
            Object next = a.next();
            UserInfo userInfo = (UserInfo) next;
            Intrinsics.checkExpressionValueIsNotNull(userInfo, "it");
            if (userInfo.getOwnerType() == 18) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                obj = next;
                break;
            }
        }
        if (obj != null) {
            ((UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout)).setType(UDNotice.Type.WARNING);
            ((UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout)).setIcon(R.drawable.ud_icon_warning_hollow_filled);
            int b3 = this.f26174f.mo38825b();
            C8275a aVar2 = C8275a.f22379l;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.MINUTES");
            if (b3 == aVar2.mo32555b()) {
                str2 = this.f26178k.getString(R.string.CreationMobile_Common_MinutesBot);
            } else {
                str2 = this.f26178k.getString(R.string.CreatinoMobile_Minutes_bot_DocsAssist);
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "if (permSetInfo.getType(…e_Minutes_bot_DocsAssist)");
            hashMap.put("bot", str2);
            str = C10539a.m43640a(this.f26178k, R.string.CreatinoMobile_Minutes_share_depart_dialog, hashMap);
        } else {
            ((UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout)).setType(UDNotice.Type.INFO);
            ((UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout)).setIcon(R.drawable.ud_icon_info_hollow_filled);
            str = C10539a.m43640a(this.f26178k, R.string.Doc_Permission_AskOwnerToShare_AddVariable, hashMap);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "tipsText");
        String str3 = str;
        ((UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout)).setText(str3);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, "@", 0, false, 6, (Object) null);
        ((UDNotice) this.f26180m.findViewById(R.id.bannerTipsLayout)).mo91029a(indexOf$default, indexOf$default + 1 + displayName.length(), new View$OnClickListenerC9705j(this));
    }

    /* renamed from: a */
    public void setViewDelegate(IInviteMemberAskOwnerContract.IView.IViewDelegate aVar) {
        this.f26170b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$b */
    public static final class View$OnClickListenerC9697b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26181a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26182b;

        View$OnClickListenerC9697b(InviteMemberAskOwnerView fVar, UserInfo userInfo) {
            this.f26181a = fVar;
            this.f26182b = userInfo;
        }

        public final void onClick(View view) {
            this.f26181a.mo37035b(this.f26182b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$c */
    public static final class View$OnClickListenerC9698c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26183a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26184b;

        View$OnClickListenerC9698c(InviteMemberAskOwnerView fVar, UserInfo userInfo) {
            this.f26183a = fVar;
            this.f26184b = userInfo;
        }

        public final void onClick(View view) {
            this.f26183a.mo37033a(this.f26184b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$d */
    public static final class View$OnClickListenerC9699d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26185a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26186b;

        View$OnClickListenerC9699d(InviteMemberAskOwnerView fVar, UserInfo userInfo) {
            this.f26185a = fVar;
            this.f26186b = userInfo;
        }

        public final void onClick(View view) {
            this.f26185a.mo37036c(this.f26186b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerView$initListeners$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$f */
    public static final class C9701f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26188a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9701f(InviteMemberAskOwnerView fVar) {
            this.f26188a = fVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IInviteMemberAskOwnerContract.IView.IViewDelegate aVar = this.f26188a.f26170b;
            if (aVar != null) {
                aVar.mo37021a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/InviteMemberAskOwnerView$initListeners$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$g */
    public static final class C9702g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26189a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9702g(InviteMemberAskOwnerView fVar) {
            this.f26189a = fVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IInviteMemberAskOwnerContract.IView.IViewDelegate aVar = this.f26189a.f26170b;
            if (aVar != null) {
                aVar.mo37023b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IView
    /* renamed from: a */
    public void mo37020a(boolean z) {
        if (z) {
            this.f26176i.mo45304d();
        } else {
            this.f26176i.mo45303c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$j */
    public static final class View$OnClickListenerC9705j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26191a;

        View$OnClickListenerC9705j(InviteMemberAskOwnerView fVar) {
            this.f26191a = fVar;
        }

        public final void onClick(View view) {
            ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22257a(this.f26191a.f26175g.getId(), "");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37033a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("InviteMemberAskOwnerView", "onClickSetCanEdit()...position = " + this.f26173e);
        PermissionAnalyticV2.m39642b(userInfo, 4);
        userInfo.setPermission(4);
        C9638a aVar = this.f26171c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.notifyItemChanged(this.f26173e);
        EditPermDialog bVar = this.f26172d;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37035b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("InviteMemberAskOwnerView", "onClickSetCanRead()...position = " + this.f26173e);
        PermissionAnalyticV2.m39642b(userInfo, 1);
        userInfo.setPermission(1);
        C9638a aVar = this.f26171c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.notifyItemChanged(this.f26173e);
        EditPermDialog bVar = this.f26172d;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public ArrayList<EditPermItemModel> mo37037d(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        boolean c = DocUserPermission.Companion.mo38037c(userInfo.getPermission());
        return new EditPermItemModelHelper(this.f26178k).mo38517a(!c, true, new View$OnClickListenerC9697b(this, userInfo)).mo38521b(c, true, new View$OnClickListenerC9698c(this, userInfo)).mo38515a(new View$OnClickListenerC9699d(this, userInfo)).mo38519a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.IInviteMemberAskOwnerContract.IView
    /* renamed from: a */
    public void mo37019a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "users");
        C9638a aVar = this.f26171c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo70690f(arrayList);
        m40159f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37036c(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("InviteMemberAskOwnerView", "onClickRemovePermission()...position = " + this.f26173e);
        PermissionAnalyticV2.m39642b(userInfo, 0);
        IInviteMemberAskOwnerContract.IView.IViewDelegate aVar = this.f26170b;
        if (aVar != null) {
            aVar.mo37022a(this.f26173e, userInfo);
        }
        C9638a aVar2 = this.f26171c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar2.notifyItemRemoved(this.f26173e);
        EditPermDialog bVar = this.f26172d;
        if (bVar != null) {
            bVar.mo38493a();
        }
        m40159f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "position", "", "onItemPermissionClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.f$h */
    public static final class C9703h implements C9638a.AbstractC9639a {

        /* renamed from: a */
        final /* synthetic */ InviteMemberAskOwnerView f26190a;

        C9703h(InviteMemberAskOwnerView fVar) {
            this.f26190a = fVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a.AbstractC9639a
        /* renamed from: a */
        public final void mo36860a(UserInfo userInfo, int i) {
            InviteMemberAskOwnerView fVar = this.f26190a;
            fVar.f26173e = i;
            if (fVar.f26172d == null) {
                fVar.f26172d = new EditPermDialog(fVar.mo37034b());
            }
            EditPermDialog bVar = fVar.f26172d;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(userInfo, "userInfo");
                bVar.mo38494a(userInfo, fVar.f26174f.mo38827c(), fVar.f26174f.mo38825b(), fVar.mo37037d(userInfo));
            }
            Intrinsics.checkExpressionValueIsNotNull(userInfo, "userInfo");
            PermissionAnalyticV2.m39675f(userInfo);
        }
    }

    public InviteMemberAskOwnerView(Context context, C10917c cVar, View view, DocPermSetInfo docPermSetInfo, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(userInfo, "ownerInfo");
        this.f26178k = context;
        this.f26179l = cVar;
        this.f26180m = view;
        this.f26174f = docPermSetInfo;
        this.f26175g = userInfo;
        this.f26176i = new C11824c(context);
    }
}
