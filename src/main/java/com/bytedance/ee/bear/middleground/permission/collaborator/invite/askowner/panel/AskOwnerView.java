package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.IAskOwnerContract;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0010H\u0002J\u0012\u0010'\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010(\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "dialog", "Landroid/app/Dialog;", "ownerName", "", "ownerId", "invitedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "from", "", "token", ShareHitPoint.f121869d, "module", "subType", "isWiki", "", "(Landroid/content/Context;Landroid/view/View;Landroid/app/Dialog;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "currentApplyPerm", "fromChat", "viewDelegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/IAskOwnerContract$IView$IViewDelegate;", "create", "", "destroy", "getColor", "isSelected", "getNotes", "getSelectedPermission", "initTips", "initView", "reportActionSheetClick", "selectPerm", "setViewDelegate", "showActionSheet", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e */
public final class AskOwnerView implements IAskOwnerContract.IView {

    /* renamed from: a */
    public IAskOwnerContract.IView.IViewDelegate f26114a;

    /* renamed from: b */
    public int f26115b = 1;

    /* renamed from: c */
    public final Dialog f26116c;

    /* renamed from: d */
    public final String f26117d;

    /* renamed from: e */
    private final boolean f26118e;

    /* renamed from: f */
    private final Context f26119f;

    /* renamed from: g */
    private final View f26120g;

    /* renamed from: h */
    private final String f26121h;

    /* renamed from: i */
    private final ArrayList<UserInfo> f26122i;

    /* renamed from: j */
    private final int f26123j;

    /* renamed from: k */
    private final String f26124k;

    /* renamed from: l */
    private final int f26125l;

    /* renamed from: m */
    private final String f26126m;

    /* renamed from: n */
    private final String f26127n;

    /* renamed from: o */
    private final boolean f26128o;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.IAskOwnerContract.IView
    /* renamed from: c */
    public int mo37002c() {
        return this.f26115b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m40108e();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel.IAskOwnerContract.IView
    /* renamed from: b */
    public String mo37001b() {
        String obj;
        SpaceEditText spaceEditText = (SpaceEditText) this.f26120g.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        Editable text = spaceEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* renamed from: e */
    private final void m40108e() {
        int i;
        TextView textView = (TextView) this.f26120g.findViewById(R.id.title);
        if (this.f26118e) {
            i = R.string.Doc_Permission_AskOwnerShare;
        } else {
            i = R.string.Doc_Permission_AskOwnerPartUserFailed;
        }
        textView.setText(i);
        mo36998a();
        String a = C10539a.m43639a(this.f26119f, R.string.Doc_Permission_AskOwner_placeholder, "owner_name", this.f26121h);
        SpaceEditText spaceEditText = (SpaceEditText) this.f26120g.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        spaceEditText.setHint(a);
        new C10917c(new C10929e());
        Locale d = C4484g.m18494b().mo17253d();
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        Intrinsics.checkExpressionValueIsNotNull(d, "locale");
        UserAdapter gVar = new UserAdapter(d, f);
        gVar.mo70690f(this.f26122i);
        RecyclerView recyclerView = (RecyclerView) this.f26120g.findViewById(R.id.invitedUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.invitedUserList");
        recyclerView.setAdapter(gVar);
        RecyclerView recyclerView2 = (RecyclerView) this.f26120g.findViewById(R.id.invitedUserList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.invitedUserList");
        recyclerView2.setLayoutManager(new LinearLayoutManagerWrapper(this.f26119f));
        ((Button) this.f26120g.findViewById(R.id.sendRequestBtn)).setOnClickListener(new C9689c(this));
    }

    /* renamed from: d */
    public final void mo37003d() {
        boolean z;
        Dialog dialog = this.f26116c;
        if (dialog != null) {
            dialog.hide();
        }
        C11811a a = C11811a.m48976a(this.f26119f);
        C11816b.C11818a a2 = C11816b.m49006a().mo45254a(this.f26119f.getText(R.string.Doc_Facade_ReadPermission)).mo45253a(new View$OnClickListenerC9690d(this));
        boolean z2 = false;
        if (this.f26115b == 1) {
            z = true;
        } else {
            z = false;
        }
        C11811a a3 = a.mo45219a(a2.mo45251a(m40107a(z)).mo45257a());
        C11816b.C11818a a4 = C11816b.m49006a().mo45254a(this.f26119f.getText(R.string.Doc_Facade_EditPermission)).mo45253a(new View$OnClickListenerC9691e(this));
        if (this.f26115b == 4) {
            z2 = true;
        }
        a3.mo45219a(a4.mo45251a(m40107a(z2)).mo45257a()).mo45218a(new View$OnClickListenerC9692f(this)).mo45217a(new DialogInterface$OnDismissListenerC9693g(this)).mo45231c();
        PermissionAnalyticV2.m39614a(this.f26124k, this.f26125l, this.f26127n, this.f26128o, this.f26126m, this.f26118e);
    }

    /* renamed from: a */
    public final void mo36998a() {
        int i;
        String str;
        String str2 = '@' + this.f26121h;
        if (this.f26115b == 1) {
            i = R.string.Doc_Facade_ReadPermission;
        } else {
            i = R.string.Doc_Facade_EditPermission;
        }
        String string = this.f26119f.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(resId)");
        if (this.f26118e) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str2);
            hashMap.put("permission_type", string + ' ');
            str = C10539a.m43640a(this.f26119f, R.string.Doc_Permission_AskOwnerFromIMTips, hashMap);
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", str2);
            hashMap2.put("permission_type", string + ' ');
            String b = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(this.f26119f, this.f26125l);
            Intrinsics.checkExpressionValueIsNotNull(b, "typeName");
            hashMap2.put("doc_type", b);
            str = C10539a.m43640a(this.f26119f, R.string.CreatinoMobile_Minutes_share_external_dialog, hashMap2);
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "tips");
        String str3 = str;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, str2, 0, false, 6, (Object) null);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str3, string, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new C10074o(this.f26119f, new C9687a(this)), indexOf$default, str2.length() + indexOf$default, 33);
        spannableString.setSpan(new C10074o(this.f26119f, new C9688b(this)), indexOf$default2, string.length() + indexOf$default2, 33);
        int length = indexOf$default2 + string.length();
        spannableString.setSpan(new AlignCenterImageSpan(this.f26119f, R.drawable.icon_global_close_small), length, length + 1, 33);
        TextView textView = (TextView) this.f26120g.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.tips");
        textView.setText(spannableString);
        TextView textView2 = (TextView) this.f26120g.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.tips");
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) this.f26120g.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.tips");
        textView3.setHighlightColor(0);
    }

    /* renamed from: a */
    public void setViewDelegate(IAskOwnerContract.IView.IViewDelegate aVar) {
        this.f26114a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$b */
    public static final class C9688b implements C10074o.AbstractView$OnClickListenerC10075a {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26130a;

        C9688b(AskOwnerView eVar) {
            this.f26130a = eVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o.AbstractView$OnClickListenerC10075a
        /* renamed from: a */
        public /* synthetic */ boolean mo36610a(TextPaint textPaint) {
            return C10074o.AbstractView$OnClickListenerC10075a.CC.$default$a(this, textPaint);
        }

        public final void onClick(View view) {
            this.f26130a.mo37003d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/AskOwnerView$initView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$c */
    public static final class C9689c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26131a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9689c(AskOwnerView eVar) {
            this.f26131a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IAskOwnerContract.IView.IViewDelegate aVar = this.f26131a.f26114a;
            if (aVar != null) {
                aVar.mo36994a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$f */
    public static final class View$OnClickListenerC9692f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26134a;

        View$OnClickListenerC9692f(AskOwnerView eVar) {
            this.f26134a = eVar;
        }

        public final void onClick(View view) {
            this.f26134a.mo36999a(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$a */
    public static final class C9687a implements C10074o.AbstractView$OnClickListenerC10075a {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26129a;

        C9687a(AskOwnerView eVar) {
            this.f26129a = eVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10074o.AbstractView$OnClickListenerC10075a
        /* renamed from: a */
        public /* synthetic */ boolean mo36610a(TextPaint textPaint) {
            return C10074o.AbstractView$OnClickListenerC10075a.CC.$default$a(this, textPaint);
        }

        public final void onClick(View view) {
            IAskOwnerContract.IView.IViewDelegate aVar = this.f26129a.f26114a;
            if (aVar != null) {
                aVar.mo36995a(this.f26129a.f26117d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$d */
    public static final class View$OnClickListenerC9690d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26132a;

        View$OnClickListenerC9690d(AskOwnerView eVar) {
            this.f26132a = eVar;
        }

        public final void onClick(View view) {
            this.f26132a.f26115b = 1;
            this.f26132a.mo36998a();
            this.f26132a.mo36999a(1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$e */
    public static final class View$OnClickListenerC9691e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26133a;

        View$OnClickListenerC9691e(AskOwnerView eVar) {
            this.f26133a = eVar;
        }

        public final void onClick(View view) {
            this.f26133a.f26115b = 4;
            this.f26133a.mo36998a();
            this.f26133a.mo36999a(4);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.e$g */
    public static final class DialogInterface$OnDismissListenerC9693g implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ AskOwnerView f26135a;

        DialogInterface$OnDismissListenerC9693g(AskOwnerView eVar) {
            this.f26135a = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Dialog dialog = this.f26135a.f26116c;
            if (dialog != null) {
                dialog.show();
            }
        }
    }

    /* renamed from: a */
    private final int m40107a(boolean z) {
        return z ? this.f26119f.getResources().getColor(R.color.primary_pri_500) : this.f26119f.getResources().getColor(R.color.text_title);
    }

    /* renamed from: a */
    public final void mo36999a(int i) {
        PermissionAnalyticV2.m39611a(this.f26124k, this.f26125l, this.f26127n, this.f26128o, this.f26126m, i, this.f26118e);
    }

    public AskOwnerView(Context context, View view, Dialog dialog, String str, String str2, ArrayList<UserInfo> arrayList, int i, String str3, int i2, String str4, String str5, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "ownerName");
        Intrinsics.checkParameterIsNotNull(str2, "ownerId");
        Intrinsics.checkParameterIsNotNull(arrayList, "invitedUsers");
        Intrinsics.checkParameterIsNotNull(str3, "token");
        Intrinsics.checkParameterIsNotNull(str4, "module");
        Intrinsics.checkParameterIsNotNull(str5, "subType");
        this.f26119f = context;
        this.f26120g = view;
        this.f26116c = dialog;
        this.f26121h = str;
        this.f26117d = str2;
        this.f26122i = arrayList;
        this.f26123j = i;
        this.f26124k = str3;
        this.f26125l = i2;
        this.f26126m = str4;
        this.f26127n = str5;
        this.f26128o = z;
        boolean z2 = true;
        this.f26118e = i != 2 ? false : z2;
    }
}
