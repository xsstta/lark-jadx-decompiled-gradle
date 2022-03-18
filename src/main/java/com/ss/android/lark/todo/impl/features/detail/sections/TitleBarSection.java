package com.ss.android.lark.todo.impl.features.detail.sections;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.section.utils.ImageWithActions;
import com.larksuite.framework.section.utils.TextWithActions;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.helper.time.ReminderHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.p2905b.C57810a;
import com.ss.android.lark.widget.p2932c.C58339d;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u000205H\u0016J\b\u0010:\u001a\u000205H\u0002J:\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0002J\b\u0010F\u001a\u000205H\u0002J\u0010\u0010G\u001a\u0002052\u0006\u0010H\u001a\u000207H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u00060\u0012R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u000bR\u001b\u0010\u0019\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u000bR\u001f\u0010\u001c\u001a\u00060\u0012R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001d\u0010\u0014R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010'R\u001f\u0010)\u001a\u00060\u0012R\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b*\u0010\u0014R\u001b\u0010,\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b-\u0010\"R\u001b\u0010/\u001a\u0002008FX\u0002¢\u0006\f\n\u0004\b3\u0010\r\u001a\u0004\b1\u00102¨\u0006J"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "blueCreate", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "getBlueCreate", "()Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "blueCreate$delegate", "Lkotlin/Lazy;", "blueCreateSend", "getBlueCreateSend", "blueCreateSend$delegate", "createAction", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$ActionUnit;", "getCreateAction", "()Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$ActionUnit;", "createAction$delegate", "greyCreate", "getGreyCreate", "greyCreate$delegate", "greyCreateSend", "getGreyCreateSend", "greyCreateSend$delegate", "moreAction", "getMoreAction", "moreAction$delegate", "moreIcon", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "getMoreIcon", "()Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "moreIcon$delegate", "reportEnable", "", "getReportEnable", "()Z", "reportEnable$delegate", "shareAction", "getShareAction", "shareAction$delegate", "shareIcon", "getShareIcon", "shareIcon$delegate", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getTitleBar", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "titleBar$delegate", "handleMoreAction", "", "actions", "", "initViewAction", "initViewObserver", "showDeleteDialog", "showListMenu", "context", "Landroid/content/Context;", "items", "", "Lcom/ss/android/lark/widget/menu/MenuUtils$DialogItem;", "showCancel", "title", "", "cancelListener", "Landroid/view/View$OnClickListener;", "showQuitDialog", "showRemoveRemindDialog", "actionContract", "ActionUnit", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m */
public final class TitleBarSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public final View f140046a;

    /* renamed from: b */
    private final Lazy f140047b = LazyKt.lazy(new C56691x(this));

    /* renamed from: c */
    private final Lazy f140048c = LazyKt.lazy(new C56671d(this));

    /* renamed from: d */
    private final Lazy f140049d = LazyKt.lazy(new C56684q(this));

    /* renamed from: e */
    private final Lazy f140050e = LazyKt.lazy(new C56681n(this));

    /* renamed from: f */
    private final Lazy f140051f = LazyKt.lazy(C56683p.INSTANCE);

    /* renamed from: g */
    private final Lazy f140052g = LazyKt.lazy(new C56669b(this));

    /* renamed from: h */
    private final Lazy f140053h = LazyKt.lazy(new C56670c(this));

    /* renamed from: i */
    private final Lazy f140054i = LazyKt.lazy(C56672e.INSTANCE);

    /* renamed from: j */
    private final Lazy f140055j = LazyKt.lazy(C56673f.INSTANCE);

    /* renamed from: k */
    private final Lazy f140056k = LazyKt.lazy(new C56682o(this));

    /* renamed from: l */
    private final Lazy f140057l = LazyKt.lazy(new C56685r(this));

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$u */
    public static final class View$OnClickListenerC56688u implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC56688u f140065a = new View$OnClickListenerC56688u();

        View$OnClickListenerC56688u() {
        }

        public final void onClick(View view) {
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: j */
    public final CommonTitleBar mo192672j() {
        return (CommonTitleBar) this.f140047b.getValue();
    }

    /* renamed from: k */
    public final ActionUnit mo192673k() {
        return (ActionUnit) this.f140048c.getValue();
    }

    /* renamed from: l */
    public final ActionUnit mo192674l() {
        return (ActionUnit) this.f140049d.getValue();
    }

    /* renamed from: m */
    public final ActionUnit mo192675m() {
        return (ActionUnit) this.f140050e.getValue();
    }

    /* renamed from: n */
    public final boolean mo192676n() {
        return ((Boolean) this.f140051f.getValue()).booleanValue();
    }

    /* renamed from: o */
    public final IActionTitlebar.TextAction mo192677o() {
        return (IActionTitlebar.TextAction) this.f140052g.getValue();
    }

    /* renamed from: p */
    public final IActionTitlebar.TextAction mo192678p() {
        return (IActionTitlebar.TextAction) this.f140053h.getValue();
    }

    /* renamed from: q */
    public final IActionTitlebar.TextAction mo192679q() {
        return (IActionTitlebar.TextAction) this.f140054i.getValue();
    }

    /* renamed from: r */
    public final IActionTitlebar.TextAction mo192680r() {
        return (IActionTitlebar.TextAction) this.f140055j.getValue();
    }

    /* renamed from: s */
    public final IActionTitlebar.C57573a mo192681s() {
        return (IActionTitlebar.C57573a) this.f140056k.getValue();
    }

    /* renamed from: t */
    public final IActionTitlebar.C57573a mo192682t() {
        return (IActionTitlebar.C57573a) this.f140057l.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$ActionUnit;", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$d */
    static final class C56671d extends Lambda implements Function0<ActionUnit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56671d(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActionUnit invoke() {
            return new ActionUnit(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$ActionUnit;", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$n */
    static final class C56681n extends Lambda implements Function0<ActionUnit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56681n(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActionUnit invoke() {
            return new ActionUnit(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$ActionUnit;", "Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$q */
    static final class C56684q extends Lambda implements Function0<ActionUnit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56684q(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActionUnit invoke() {
            return new ActionUnit(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$t */
    public static final class C56687t implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ TitleBarSection f140064a;

        C56687t(TitleBarSection mVar) {
            this.f140064a = mVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f140064a.mo92107d().mo92064a(3200);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMenuItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$v */
    public static final class C56689v implements C58339d.AbstractC58343b {

        /* renamed from: a */
        final /* synthetic */ TitleBarSection f140066a;

        C56689v(TitleBarSection mVar) {
            this.f140066a = mVar;
        }

        @Override // com.ss.android.lark.widget.p2932c.C58339d.AbstractC58343b
        public final void onMenuItemClick() {
            this.f140066a.mo92107d().mo92064a(102);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ui/CommonTitleBar;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$x */
    static final class C56691x extends Lambda implements Function0<CommonTitleBar> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56691x(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CommonTitleBar invoke() {
            return (CommonTitleBar) this.this$0.f140046a.findViewById(R.id.title_bar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$ActionUnit;", "", "actionPosition", "", "(Lcom/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection;I)V", "lastVisibleAction", "Lcom/ss/android/lark/ui/IActionTitlebar$Action;", "checkShow", "", "show", "", "action", "hideAction", "showAction", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$a */
    public final class ActionUnit {

        /* renamed from: b */
        private IActionTitlebar.Action f140059b;

        /* renamed from: c */
        private final int f140060c;

        /* renamed from: a */
        public final void mo192685a() {
            IActionTitlebar.Action action = this.f140059b;
            if (action != null) {
                TitleBarSection.this.mo192672j().removeAction(action);
                this.f140059b = null;
            }
        }

        /* renamed from: a */
        public final void mo192686a(IActionTitlebar.Action action) {
            Intrinsics.checkParameterIsNotNull(action, "action");
            mo192685a();
            TitleBarSection.this.mo192672j().addAction(action, this.f140060c);
            this.f140059b = action;
        }

        public ActionUnit(int i) {
            this.f140060c = i;
        }

        /* renamed from: a */
        public final void mo192687a(boolean z, IActionTitlebar.Action action) {
            Intrinsics.checkParameterIsNotNull(action, "action");
            if (z) {
                mo192686a(action);
            } else {
                mo192685a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$e */
    static final class C56672e extends Lambda implements Function0<IActionTitlebar.TextAction> {
        public static final C56672e INSTANCE = new C56672e();

        C56672e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IActionTitlebar.TextAction invoke() {
            return new IActionTitlebar.TextAction(UIHelper.getString(R.string.Todo_Task_CreateButton), R.color.text_disable, 16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$f */
    static final class C56673f extends Lambda implements Function0<IActionTitlebar.TextAction> {
        public static final C56673f INSTANCE = new C56673f();

        C56673f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IActionTitlebar.TextAction invoke() {
            return new IActionTitlebar.TextAction(UIHelper.getString(R.string.Todo_Task_CreateAndSendButton), R.color.text_disable, 16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$p */
    static final class C56683p extends Lambda implements Function0<Boolean> {
        public static final C56683p INSTANCE = new C56683p();

        C56683p() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return TodoDependencyHolder.f139242a.mo191731b().mo191931d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/utils/TextWithActions;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$b */
    static final class C56669b extends Lambda implements Function0<TextWithActions> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56669b(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextWithActions invoke() {
            String string = UIHelper.getString(R.string.Todo_Task_CreateButton);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Todo_Task_CreateButton)");
            return new TextWithActions(string, R.color.primary_pri_500, 16, this.this$0.mo92107d(), 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/utils/TextWithActions;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$c */
    static final class C56670c extends Lambda implements Function0<TextWithActions> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56670c(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextWithActions invoke() {
            String string = UIHelper.getString(R.string.Todo_Task_CreateAndSendButton);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Task_CreateAndSendButton)");
            return new TextWithActions(string, R.color.primary_pri_500, 16, this.this$0.mo92107d(), 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/utils/ImageWithActions;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$o */
    static final class C56682o extends Lambda implements Function0<ImageWithActions> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56682o(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageWithActions invoke() {
            return new ImageWithActions(UDIconUtils.getIconDrawable(this.this$0.mo92106c(), (int) R.drawable.ud_icon_more_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n1)), this.this$0.mo92107d(), 103);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/section/utils/ImageWithActions;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$r */
    static final class C56685r extends Lambda implements Function0<ImageWithActions> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56685r(TitleBarSection mVar) {
            super(0);
            this.this$0 = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ImageWithActions invoke() {
            return new ImageWithActions(UDIconUtils.getIconDrawable(this.this$0.mo92106c(), (int) R.drawable.ud_icon_share_outlined, ResUtil.f139261a.mo191775a(R.color.icon_n1)), this.this$0.mo92107d(), 104);
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getCreateIconState(), new C56675h(this));
        mo92103a(qVar.getShareIconShow(), new C56676i(this));
        mo92103a(qVar.getMoreIconShow(), new C56677j(this));
        mo92103a(qVar.getLeftIconState(), new C56678k(this));
        mo92103a(qVar.getMoreIconState(), new C56679l(this));
        mo92103a(qVar.getShowRemoveReminderDialog(), new C56680m(this));
    }

    /* renamed from: v */
    public final void mo192684v() {
        ArrayList arrayList = new ArrayList();
        C58339d.C58341a aVar = new C58339d.C58341a(2, mo92108e().getString(R.string.Todo_Task_LeaveTaskConfirmationButton), new C56689v(this));
        aVar.mo197568a(R.color.function_danger_500);
        arrayList.add(aVar);
        String string = mo92108e().getString(R.string.Todo_Task_LeaveTaskConfirmation);
        Intrinsics.checkExpressionValueIsNotNull(string, "getResources().getString…sk_LeaveTaskConfirmation)");
        m220502a(mo92106c(), arrayList, true, string, View$OnClickListenerC56688u.f140065a);
    }

    /* renamed from: u */
    public final void mo192683u() {
        ArrayList arrayList = new ArrayList();
        C58339d.C58341a aVar = new C58339d.C58341a(2, UIHelper.getString(R.string.Todo_Task_DeleteTaskButton), new C56687t(this));
        aVar.mo197568a(R.color.function_danger_500);
        arrayList.add(aVar);
        List<AssigneeBean> b = ((ITodoDetailViewDataStore) mo92096a()).getAssignees().mo5927b();
        String str = "";
        if (b != null && !b.isEmpty() && (b.size() != 1 || !Intrinsics.areEqual(b.get(0).mo192757a(), TodoDependencyHolder.f139242a.mo191730a().loginDependency().mo145411a()))) {
            String string = UIHelper.getString(R.string.Todo_Task_DeleteTaskDialogContent);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_DeleteTaskDialogContent)");
            str = string;
        }
        m220502a(mo92106c(), arrayList, true, str, new View$OnClickListenerC56686s(this));
        mo92107d().mo92064a(3202);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$l */
    static final class C56679l extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56679l(TitleBarSection mVar) {
            super(1);
            this.this$0 = mVar;
        }

        public final void invoke(int i) {
            this.this$0.mo192670b(i);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V", "com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$m */
    static final class C56680m extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56680m(TitleBarSection mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num);
            return Unit.INSTANCE;
        }

        public final void invoke(Integer num) {
            TitleBarSection mVar = this.this$0;
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            mVar.mo192671c(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$h */
    static final class C56675h extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56675h(TitleBarSection mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (i == -1) {
                this.this$0.mo192673k().mo192685a();
            } else if (i == 0) {
                this.this$0.mo192673k().mo192686a(this.this$0.mo192679q());
            } else if (i == 1) {
                this.this$0.mo192673k().mo192686a(this.this$0.mo192677o());
            } else if (i == 2) {
                this.this$0.mo192673k().mo192686a(this.this$0.mo192680r());
            } else if (i == 3) {
                this.this$0.mo192673k().mo192686a(this.this$0.mo192678p());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$i */
    static final class C56676i extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56676i(TitleBarSection mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192674l().mo192687a(z, this.this$0.mo192682t());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$j */
    static final class C56677j extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56677j(TitleBarSection mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192675m().mo192687a(z, this.this$0.mo192681s());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$k */
    static final class C56678k extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ TitleBarSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56678k(TitleBarSection mVar) {
            super(1);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            if (i == 0) {
                this.this$0.mo192672j().setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
                this.this$0.mo192672j().setLeftImageDrawable(null);
            } else if (i == 1) {
                this.this$0.mo192672j().setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
                this.this$0.mo192672j().setLeftText("");
            } else if (i == 2) {
                this.this$0.mo192672j().setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
                this.this$0.mo192672j().setLeftText("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$s */
    public static final class View$OnClickListenerC56686s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleBarSection f140063a;

        View$OnClickListenerC56686s(TitleBarSection mVar) {
            this.f140063a = mVar;
        }

        public final void onClick(View view) {
            this.f140063a.mo92107d().mo92064a(3201);
        }
    }

    /* renamed from: c */
    public final void mo192671c(int i) {
        ReminderHelper.f139700a.mo192310a(mo92106c(), new DialogInterface$OnClickListenerC56690w(this, i));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/sections/TitleBarSection$handleMoreAction$builder$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$g */
    public static final class C56674g implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleBarSection f140061a;

        /* renamed from: b */
        final /* synthetic */ int f140062b;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                this.f140061a.mo92107d().mo92064a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                this.f140061a.mo92107d().mo92064a(TTVideoEngine.PLAYER_OPTION_USE_AJ_MEDIACODEC);
            } else if (i != 1 || !this.f140061a.mo192676n()) {
                int i2 = this.f140062b;
                if (i2 == 1) {
                    this.f140061a.mo192683u();
                } else if (i2 == 2) {
                    this.f140061a.mo192684v();
                }
            } else {
                this.f140061a.mo92107d().mo92064a(TTVideoEngine.PLAYER_OPTION_ENABEL_HARDWARE_DECODE_AUDIO);
            }
        }

        C56674g(TitleBarSection mVar, int i) {
            this.f140061a = mVar;
            this.f140062b = i;
        }
    }

    /* renamed from: b */
    public final void mo192670b(int i) {
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Todo_Task_ViewChangelogButton);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Task_ViewChangelogButton)");
        arrayList.add(string);
        String str = null;
        if (mo192676n()) {
            String string2 = UIHelper.getString(R.string.Todo_Report_Report);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Todo_Report_Report)");
            arrayList.add(string2);
        }
        if (i == 1) {
            str = UIHelper.getString(R.string.Todo_Task_DeleteTaskButton);
        } else if (i == 2) {
            str = UIHelper.getString(R.string.Todo_Task_LeaveTaskConfirmationButton);
        }
        if (str != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(ResUtil.f139261a.mo191775a(R.color.function_danger_500)), 0, str.length(), 33);
            arrayList.add(spannableString);
        }
        UDActionPanelBuilder aVar = (UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(mo92106c()).mo90870a(arrayList)).mo90869a(new C56674g(this, i));
        aVar.addActionButton(R.id.ud_dialog_btn_cancel, ResUtil.f139261a.mo191781c(R.string.Todo_Common_Cancel), (DialogInterface.OnClickListener) null);
        aVar.show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.m$w */
    public static final class DialogInterface$OnClickListenerC56690w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TitleBarSection f140067a;

        /* renamed from: b */
        final /* synthetic */ int f140068b;

        DialogInterface$OnClickListenerC56690w(TitleBarSection mVar, int i) {
            this.f140067a = mVar;
            this.f140068b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f140067a.mo92107d().mo92064a(this.f140068b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleBarSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140046a = view;
    }

    /* renamed from: a */
    private final void m220502a(Context context, List<? extends C58339d.C58341a> list, boolean z, String str, View.OnClickListener onClickListener) {
        C58339d.C58344c a = new C58339d.C58344c(context, list, str).mo197578a(z).mo197577a(onClickListener);
        Intrinsics.checkExpressionValueIsNotNull(a, "MenuUtils.ListDialogCont…          cancelListener)");
        C57810a.m224336a(context, a.mo197576a());
    }
}
