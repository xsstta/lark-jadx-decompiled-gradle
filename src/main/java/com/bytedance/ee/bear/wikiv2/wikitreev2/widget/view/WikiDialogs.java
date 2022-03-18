package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.DialogC0259b;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectPanelDialog;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12478g;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u0003123B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ \u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J*\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ.\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016H\u0007J\u001a\u0010\"\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J \u0010#\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014J2\u0010%\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(2\b\u0010\u001b\u001a\u0004\u0018\u00010)J\u0018\u0010*\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J \u0010+\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016J \u0010.\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014J\u0016\u0010/\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(J\u0016\u00100\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs;", "", "()V", "delConfirmDialog", "Landroidx/appcompat/app/AppCompatDialog;", "delForbidDialog", "loadingDialog", "Lcom/bytedance/ee/bear/bizwidget/LoadingDialog;", "moreDialog", "Lcom/bytedance/ee/bear/widgets/ActionSheet;", "movConfirmDialog", "wikiCreateSelectPanelDialog", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog;", "dismissAll", "", "dismissLoading", "showClickableToast", "context", "Landroid/content/Context;", "resId", "", "listener", "Landroid/view/View$OnClickListener;", "showCreateTypeSelector", "Landroidx/fragment/app/FragmentActivity;", "target", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/UITreeNode;", "delegate", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectPanelDialog$ViewDelegate;", "canCreate", "", "showDelConfirmDialog", "isShortcut", "cancelListener", "showDelForbidDialog", "showFailureToast", "duration", "showItemMoreDialog", "isFavorite", "wikiPerm", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikNodePerm;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$ItemMoreViewDelegate;", "showLoading", "showMovConfirmDialog", "confirm", "cancel", "showSuccessToast", "updateCreateTypeSelector", "updateItemMoreDialog", "Companion", "ItemMoreId", "ItemMoreViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c */
public final class WikiDialogs {

    /* renamed from: a */
    public static final Companion f33642a = new Companion(null);

    /* renamed from: b */
    private C4878c f33643b;

    /* renamed from: c */
    private DialogC0259b f33644c;

    /* renamed from: d */
    private DialogC0259b f33645d;

    /* renamed from: e */
    private DialogC0259b f33646e;

    /* renamed from: f */
    private C11811a f33647f;

    /* renamed from: g */
    private WikiCreateSelectPanelDialog f33648g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$ItemMoreViewDelegate;", "", "onDel", "", "onDismiss", "onFavorite", "switchOn", "", "onMov", "onShortcutTo", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$b */
    public interface ItemMoreViewDelegate {
        /* renamed from: a */
        void mo47747a();

        /* renamed from: a */
        void mo47748a(boolean z);

        /* renamed from: b */
        void mo47749b();

        /* renamed from: c */
        void mo47750c();

        /* renamed from: d */
        void mo47751d();
    }

    /* renamed from: a */
    public final void mo47800a(Context context, boolean z, View.OnClickListener onClickListener) {
        m52183a(this, context, z, onClickListener, null, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo47801a(Context context, boolean z, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        mo47804b();
        if (context != null) {
            DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.CreationMobile_Wiki_MoveToTrash_Toast).mo89248g(z ? R.string.CreationMobile_Wiki_Shortcuts_DeleteShortcuts_Tooltip : R.string.CreationMobile_Wiki_Permission_RemovePage_Title).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Doc_Wiki_Cancel).mo89267a(new DialogInterface$OnClickListenerC12566d(onClickListener2)).mo89271d(R.color.text_title)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.CreationMobile_Wiki_Permission_Remove_Toast).mo89267a(new DialogInterface$OnClickListenerC12567e(onClickListener)).mo89271d(R.color.function_danger_500)).mo89233b();
            this.f33644c = b;
            if (b != null) {
                b.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo47803a(C12478g gVar, WikNodePerm wikNodePerm) {
        Intrinsics.checkParameterIsNotNull(gVar, "target");
        Intrinsics.checkParameterIsNotNull(wikNodePerm, "wikiPerm");
        C11811a aVar = this.f33647f;
        if (aVar == null) {
            return;
        }
        if (!aVar.mo45233e() || !TextUtils.equals(aVar.f31802c, gVar.f33440b)) {
            C13479a.m54772d("WikiDialogs", "updateItemMoreDialog, dialog dismiss, return. ");
            return;
        }
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("favorite", Boolean.valueOf(wikNodePerm.can_star)), TuplesKt.to("shortcut", Boolean.valueOf(wikNodePerm.can_add_shortcut)), TuplesKt.to("move", Boolean.valueOf(wikNodePerm.can_move)), TuplesKt.to("delete", Boolean.valueOf(wikNodePerm.can_delete)));
        List<C11816b> f = aVar.mo45234f();
        Intrinsics.checkExpressionValueIsNotNull(f, "actionSheetItemInfoList");
        int i = 0;
        for (T t : f) {
            Intrinsics.checkExpressionValueIsNotNull(t, "item");
            Boolean bool = (Boolean) mutableMapOf.get(t.mo45249j());
            t.mo45240a(bool != null ? bool.booleanValue() : false);
            aVar.mo45222a(i, (C11816b) t);
            i++;
        }
        int a = aVar.mo45211a("favorite");
        if (!(a == -1 || wikNodePerm.can_star)) {
            aVar.mo45228b(a);
        }
    }

    /* renamed from: a */
    public final void mo47802a(FragmentActivity fragmentActivity, C12478g gVar, WikiCreateSelectPanelDialog.ViewDelegate bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "target");
        WikiCreateSelectPanelDialog a = WikiCreateSelectPanelDialog.f32986d.mo46869a(fragmentActivity, bVar, z);
        this.f33648g = a;
        if (a != null) {
            a.mo46864a(gVar.f33440b);
        }
    }

    /* renamed from: a */
    public final void mo47793a() {
        C4878c cVar = this.f33643b;
        if (cVar != null && cVar.mo19129a()) {
            cVar.mo19130b();
        }
    }

    /* renamed from: b */
    public final void mo47804b() {
        C11811a aVar = this.f33647f;
        if (aVar != null && aVar.mo45233e()) {
            aVar.mo45232d();
        }
        DialogC0259b bVar = this.f33644c;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
        DialogC0259b bVar2 = this.f33645d;
        if (bVar2 != null && bVar2.isShowing()) {
            bVar2.dismiss();
        }
        DialogC0259b bVar3 = this.f33646e;
        if (bVar3 != null && bVar3.isShowing()) {
            bVar3.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$showItemMoreDialog$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$h */
    public static final class View$OnClickListenerC12570h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikNodePerm f33659a;

        /* renamed from: b */
        final /* synthetic */ Context f33660b;

        /* renamed from: c */
        final /* synthetic */ boolean f33661c;

        /* renamed from: d */
        final /* synthetic */ ItemMoreViewDelegate f33662d;

        /* renamed from: e */
        final /* synthetic */ C12478g f33663e;

        View$OnClickListenerC12570h(WikNodePerm wikNodePerm, Context context, boolean z, ItemMoreViewDelegate bVar, C12478g gVar) {
            this.f33659a = wikNodePerm;
            this.f33660b = context;
            this.f33661c = z;
            this.f33662d = bVar;
            this.f33663e = gVar;
        }

        public final void onClick(View view) {
            ItemMoreViewDelegate bVar = this.f33662d;
            if (bVar != null) {
                bVar.mo47747a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$showItemMoreDialog$1$3"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$i */
    public static final class View$OnClickListenerC12571i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikNodePerm f33664a;

        /* renamed from: b */
        final /* synthetic */ Context f33665b;

        /* renamed from: c */
        final /* synthetic */ boolean f33666c;

        /* renamed from: d */
        final /* synthetic */ ItemMoreViewDelegate f33667d;

        /* renamed from: e */
        final /* synthetic */ C12478g f33668e;

        View$OnClickListenerC12571i(WikNodePerm wikNodePerm, Context context, boolean z, ItemMoreViewDelegate bVar, C12478g gVar) {
            this.f33664a = wikNodePerm;
            this.f33665b = context;
            this.f33666c = z;
            this.f33667d = bVar;
            this.f33668e = gVar;
        }

        public final void onClick(View view) {
            ItemMoreViewDelegate bVar = this.f33667d;
            if (bVar != null) {
                bVar.mo47749b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$showItemMoreDialog$1$4"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$j */
    public static final class View$OnClickListenerC12572j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikNodePerm f33669a;

        /* renamed from: b */
        final /* synthetic */ Context f33670b;

        /* renamed from: c */
        final /* synthetic */ boolean f33671c;

        /* renamed from: d */
        final /* synthetic */ ItemMoreViewDelegate f33672d;

        /* renamed from: e */
        final /* synthetic */ C12478g f33673e;

        View$OnClickListenerC12572j(WikNodePerm wikNodePerm, Context context, boolean z, ItemMoreViewDelegate bVar, C12478g gVar) {
            this.f33669a = wikNodePerm;
            this.f33670b = context;
            this.f33671c = z;
            this.f33672d = bVar;
            this.f33673e = gVar;
        }

        public final void onClick(View view) {
            ItemMoreViewDelegate bVar = this.f33672d;
            if (bVar != null) {
                bVar.mo47750c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$showItemMoreDialog$1$5"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$k */
    public static final class DialogInterface$OnDismissListenerC12573k implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ WikNodePerm f33674a;

        /* renamed from: b */
        final /* synthetic */ Context f33675b;

        /* renamed from: c */
        final /* synthetic */ boolean f33676c;

        /* renamed from: d */
        final /* synthetic */ ItemMoreViewDelegate f33677d;

        /* renamed from: e */
        final /* synthetic */ C12478g f33678e;

        DialogInterface$OnDismissListenerC12573k(WikNodePerm wikNodePerm, Context context, boolean z, ItemMoreViewDelegate bVar, C12478g gVar) {
            this.f33674a = wikNodePerm;
            this.f33675b = context;
            this.f33676c = z;
            this.f33677d = bVar;
            this.f33678e = gVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            ItemMoreViewDelegate bVar = this.f33677d;
            if (bVar != null) {
                bVar.mo47751d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$showItemMoreDialog$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$g */
    public static final class View$OnClickListenerC12569g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikNodePerm f33654a;

        /* renamed from: b */
        final /* synthetic */ Context f33655b;

        /* renamed from: c */
        final /* synthetic */ boolean f33656c;

        /* renamed from: d */
        final /* synthetic */ ItemMoreViewDelegate f33657d;

        /* renamed from: e */
        final /* synthetic */ C12478g f33658e;

        View$OnClickListenerC12569g(WikNodePerm wikNodePerm, Context context, boolean z, ItemMoreViewDelegate bVar, C12478g gVar) {
            this.f33654a = wikNodePerm;
            this.f33655b = context;
            this.f33656c = z;
            this.f33657d = bVar;
            this.f33658e = gVar;
        }

        public final void onClick(View view) {
            ItemMoreViewDelegate bVar = this.f33657d;
            if (bVar != null) {
                bVar.mo47748a(!this.f33656c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs$showClickableToast$1$1", "Lcom/larksuite/component/universe_design/toast/UDToast$OnActionClickListener;", "onActionClick", "", "toast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$c */
    public static final class C12565c implements UDToast.OnActionClickListener {

        /* renamed from: a */
        final /* synthetic */ int f33649a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f33650b;

        @Override // com.larksuite.component.universe_design.toast.UDToast.OnActionClickListener
        public void onActionClick(UDToastImpl dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "toast");
            if (C13737d.m55692a()) {
                this.f33650b.onClick(null);
            }
        }

        C12565c(int i, View.OnClickListener onClickListener) {
            this.f33649a = i;
            this.f33650b = onClickListener;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$e */
    public static final class DialogInterface$OnClickListenerC12567e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f33652a;

        DialogInterface$OnClickListenerC12567e(View.OnClickListener onClickListener) {
            this.f33652a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f33652a.onClick(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$l */
    static final class DialogInterface$OnClickListenerC12574l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f33679a;

        DialogInterface$OnClickListenerC12574l(View.OnClickListener onClickListener) {
            this.f33679a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f33679a.onClick(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$m */
    static final class DialogInterface$OnClickListenerC12575m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f33680a;

        DialogInterface$OnClickListenerC12575m(View.OnClickListener onClickListener) {
            this.f33680a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f33680a.onClick(null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$d */
    public static final class DialogInterface$OnClickListenerC12566d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f33651a;

        DialogInterface$OnClickListenerC12566d(View.OnClickListener onClickListener) {
            this.f33651a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            View.OnClickListener onClickListener = this.f33651a;
            if (onClickListener != null) {
                onClickListener.onClick(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.c$f */
    public static final class DialogInterface$OnClickListenerC12568f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f33653a;

        DialogInterface$OnClickListenerC12568f(View.OnClickListener onClickListener) {
            this.f33653a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            View.OnClickListener onClickListener = this.f33653a;
            if (onClickListener != null) {
                onClickListener.onClick(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo47794a(Context context, int i) {
        if (i != -1) {
            if (this.f33643b == null) {
                this.f33643b = new C4878c(context);
            }
            C4878c cVar = this.f33643b;
            if (cVar != null && !cVar.mo19129a()) {
                cVar.mo19131b(i);
                cVar.mo19132c();
            }
        }
    }

    /* renamed from: b */
    public final void mo47806b(C12478g gVar, WikNodePerm wikNodePerm) {
        Intrinsics.checkParameterIsNotNull(gVar, "target");
        Intrinsics.checkParameterIsNotNull(wikNodePerm, "wikiPerm");
        WikiCreateSelectPanelDialog bVar = this.f33648g;
        if (bVar == null) {
            return;
        }
        if (!bVar.mo46866g() || !TextUtils.equals(bVar.mo46867h(), gVar.f33440b)) {
            C13479a.m54772d("WikiDialogs", "updateCreateTypeSelector, dialog dismiss, return. ");
        } else {
            bVar.mo38116c(wikNodePerm.can_create);
        }
    }

    /* renamed from: a */
    public final void mo47797a(Context context, View.OnClickListener onClickListener) {
        mo47804b();
        if (context != null) {
            DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.CreationMobile_Wiki_CannotDeleteSubpages_Toast).mo89248g(R.string.CreationMobile_Wiki_NoPermissionToDelete_Toast).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Doc_Wiki_Cancel).mo89267a((DialogInterface.OnClickListener) null).mo89271d(R.color.text_title)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Confirm).mo89267a(new DialogInterface$OnClickListenerC12568f(onClickListener)).mo89271d(R.color.function_danger_500)).mo89233b();
            this.f33645d = b;
            if (b != null) {
                b.show();
            }
        }
    }

    /* renamed from: b */
    public final void mo47805b(Context context, int i, int i2) {
        if (context != null && i != -1) {
            Toast.showFailureText(context, context.getResources().getString(i), i2);
        }
    }

    /* renamed from: a */
    public final void mo47795a(Context context, int i, int i2) {
        if (context != null && i != -1) {
            Toast.showSuccessText(context, context.getResources().getString(i), i2);
        }
    }

    /* renamed from: a */
    public final void mo47796a(Context context, int i, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        if (context != null) {
            UDToast.Builder build = UDToast.build(context);
            String string = context.getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "it.getString(resId)");
            build.mo91643a(string).mo91639a(R.string.CreationMobile_Doc_Facade_MakeCopySucceed_open_btn, new C12565c(i, onClickListener)).mo91656k();
        }
    }

    /* renamed from: a */
    public final void mo47798a(Context context, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "confirm");
        Intrinsics.checkParameterIsNotNull(onClickListener2, "cancel");
        mo47804b();
        if (context != null) {
            DialogC25637f b = new C25639g(context).mo89263v(R.color.bg_body).mo89256o(R.color.text_title).mo89253l(8388611).mo89254m(R.string.CreationMobile_Wiki_Permission_OnceRemoved_Placeholder).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89257p(17).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Doc_Wiki_Cancel).mo89267a(new DialogInterface$OnClickListenerC12574l(onClickListener2)).mo89271d(R.color.text_title)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Confirm).mo89267a(new DialogInterface$OnClickListenerC12575m(onClickListener)).mo89271d(R.color.function_danger_500)).mo89233b();
            this.f33644c = b;
            if (b != null) {
                b.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo47799a(Context context, C12478g gVar, boolean z, WikNodePerm wikNodePerm, ItemMoreViewDelegate bVar) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(gVar, "target");
        Intrinsics.checkParameterIsNotNull(wikNodePerm, "wikiPerm");
        mo47804b();
        if (context != null) {
            C11811a a = C11811a.m48976a(context);
            this.f33647f = a;
            if (a != null) {
                if (wikNodePerm.can_star) {
                    C11816b.C11818a a2 = C11816b.m49006a().mo45255a("favorite");
                    if (z) {
                        i2 = R.string.CreationMobile_Wiki_Favorites_RemoveFromFavorites_Tab;
                    } else {
                        i2 = R.string.CreationMobile_Wiki_Favorites_AddToFavorites_Tab;
                    }
                    a.mo45219a(a2.mo45254a(context.getText(i2)).mo45253a(new View$OnClickListenerC12569g(wikNodePerm, context, z, bVar, gVar)).mo45257a());
                }
                a.mo45219a(C11816b.m49006a().mo45255a("shortcut").mo45254a(context.getText(R.string.CreationMobile_Wiki_Shortcuts_CreateShortcutTo_Button)).mo45259c(wikNodePerm.can_add_shortcut).mo45253a(new View$OnClickListenerC12570h(wikNodePerm, context, z, bVar, gVar)).mo45257a());
                a.mo45219a(C11816b.m49006a().mo45255a("move").mo45254a(context.getText(R.string.Doc_Wiki_MoveTo)).mo45259c(wikNodePerm.can_move).mo45253a(new View$OnClickListenerC12571i(wikNodePerm, context, z, bVar, gVar)).mo45257a());
                C11816b.C11818a a3 = C11816b.m49006a().mo45255a("delete");
                if (gVar.mo47511a()) {
                    i = R.string.CreationMobile_Wiki_Shortcuts_DeleteShortcuts_Tooltip;
                } else {
                    i = R.string.CreationMobile_Wiki_Trash_Tab;
                }
                a.mo45219a(a3.mo45254a(context.getText(i)).mo45251a(context.getResources().getColor(R.color.function_danger_500)).mo45259c(wikNodePerm.can_delete).mo45253a(new View$OnClickListenerC12572j(wikNodePerm, context, z, bVar, gVar)).mo45257a());
                a.mo45213a();
                a.mo45217a(new DialogInterface$OnDismissListenerC12573k(wikNodePerm, context, z, bVar, gVar));
                a.f31802c = gVar.f33440b;
                a.mo45231c();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m52183a(WikiDialogs cVar, Context context, boolean z, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i, Object obj) {
        if ((i & 8) != 0) {
            onClickListener2 = null;
        }
        cVar.mo47801a(context, z, onClickListener, onClickListener2);
    }
}
