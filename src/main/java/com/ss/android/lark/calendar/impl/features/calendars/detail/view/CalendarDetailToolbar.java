package com.ss.android.lark.calendar.impl.features.calendars.detail.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailInfo;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarDetailHitPoint;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;
import com.ss.android.lark.calendar.impl.utils.an;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "getActionDispatcher", "()Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "setActionDispatcher", "(Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "close", "Landroid/view/View;", "detail", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "edit", "Landroidx/appcompat/widget/AppCompatImageView;", "external", "more", "title", "Landroid/widget/TextView;", "bind", "", "onClick", "v", "showDeleteDialog", "showMore", "updateScrollProgress", "progress", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarDetailToolbar extends ConstraintLayout implements View.OnClickListener {

    /* renamed from: a */
    private ActionDispatcher f75709a;

    /* renamed from: b */
    private final View f75710b;

    /* renamed from: c */
    private final TextView f75711c;

    /* renamed from: d */
    private final View f75712d;

    /* renamed from: e */
    private final AppCompatImageView f75713e;

    /* renamed from: f */
    private final AppCompatImageView f75714f;

    /* renamed from: g */
    private CalendarDetailInfo f75715g;

    public CalendarDetailToolbar(Context context) {
        this(context, null, 0, 6, null);
    }

    public CalendarDetailToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final ActionDispatcher getActionDispatcher() {
        return this.f75709a;
    }

    /* renamed from: a */
    public final void mo109279a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Setting_DeleteConfirmTitle)).titleLineCount(2)).message(R.string.Calendar_Setting_DeleteCalendarPopUpWindow)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC30257a(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    public final void setActionDispatcher(ActionDispatcher aVar) {
        this.f75709a = aVar;
    }

    /* renamed from: a */
    public final void mo109280a(float f) {
        this.f75711c.setAlpha(f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/detail/view/CalendarDetailToolbar$showMore$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarDetailToolbar$b */
    public static final class C30258b implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailToolbar f75717a;

        /* renamed from: b */
        final /* synthetic */ List f75718b;

        /* renamed from: c */
        final /* synthetic */ CalendarDetailInfo f75719c;

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (Intrinsics.areEqual((String) this.f75718b.get(i), "ACTION_DELETE")) {
                CalendarDetailHitPoint.f83361a.mo118750c(this.f75719c.mo109177a(), "delete");
                this.f75717a.mo109279a();
                return;
            }
            ActionDispatcher actionDispatcher = this.f75717a.getActionDispatcher();
            if (actionDispatcher != null) {
                ActionDispatcher.C32507a.m124446a(actionDispatcher, (String) this.f75718b.get(i), null, 2, null);
            }
        }

        C30258b(CalendarDetailToolbar calendarDetailToolbar, List list, CalendarDetailInfo cVar) {
            this.f75717a = calendarDetailToolbar;
            this.f75718b = list;
            this.f75719c = cVar;
        }
    }

    /* renamed from: b */
    private final void m112417b(CalendarDetailInfo cVar) {
        List<? extends CharSequence> listOf = CollectionsKt.listOf(getContext().getString(R.string.Calendar_Common_Delete));
        List listOf2 = CollectionsKt.listOf("ACTION_DELETE");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        String string = getContext().getString(R.string.Calendar_Common_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Calendar_Common_Cancel)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(context).mo90870a(listOf)).mo90869a(new C30258b(this, listOf2, cVar))).addActionButton(R.id.ud_dialog_btn_cancel, string, (DialogInterface.OnClickListener) null)).show();
        CalendarDetailHitPoint.f83361a.mo118745a(cVar.mo109177a());
    }

    public void onClick(View view) {
        CalendarDetailInfo cVar;
        if (Intrinsics.areEqual(view, this.f75710b)) {
            ActionDispatcher aVar = this.f75709a;
            if (aVar != null) {
                ActionDispatcher.C32507a.m124446a(aVar, "ACTION_CLOSE", null, 2, null);
            }
        } else if (Intrinsics.areEqual(view, this.f75714f)) {
            CalendarDetailInfo cVar2 = this.f75715g;
            if (cVar2 == null) {
                return;
            }
            if (cVar2.mo109185i()) {
                CalendarDetailHitPoint.f83361a.mo118746a(cVar2.mo109177a(), "edit");
                ActionDispatcher aVar2 = this.f75709a;
                if (aVar2 != null) {
                    ActionDispatcher.C32507a.m124446a(aVar2, "ACTION_EDIT", null, 2, null);
                    return;
                }
                return;
            }
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Onboarding_PleaseSubscribeFirst);
        } else if (Intrinsics.areEqual(view, this.f75713e) && (cVar = this.f75715g) != null) {
            CalendarDetailHitPoint.f83361a.mo118746a(cVar.mo109177a(), "more");
            m112417b(cVar);
        }
    }

    /* renamed from: a */
    public final void mo109281a(CalendarDetailInfo cVar) {
        String str;
        int i;
        boolean z;
        this.f75715g = cVar;
        TextView textView = this.f75711c;
        if (cVar != null) {
            str = cVar.mo109180d();
        } else {
            str = null;
        }
        textView.setText(str);
        AppCompatImageView appCompatImageView = this.f75714f;
        boolean z2 = true;
        if (cVar == null || !cVar.mo109185i()) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i = UDColorUtils.getColor(context, R.color.icon_disable);
        } else {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i = UDColorUtils.getColor(context2, R.color.static_white);
        }
        appCompatImageView.setImageTintList(ColorStateList.valueOf(i));
        View view = this.f75712d;
        if (cVar == null || !cVar.mo109183g()) {
            z = false;
        } else {
            z = true;
        }
        an.m125213a(view, z);
        AppCompatImageView appCompatImageView2 = this.f75713e;
        if (cVar == null || !cVar.mo109188l()) {
            z2 = false;
        }
        an.m125213a(appCompatImageView2, z2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.view.CalendarDetailToolbar$a */
    public static final class DialogInterface$OnClickListenerC30257a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailToolbar f75716a;

        DialogInterface$OnClickListenerC30257a(CalendarDetailToolbar calendarDetailToolbar) {
            this.f75716a = calendarDetailToolbar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ActionDispatcher actionDispatcher = this.f75716a.getActionDispatcher();
            if (actionDispatcher != null) {
                ActionDispatcher.C32507a.m124446a(actionDispatcher, "ACTION_DELETE", null, 2, null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarDetailToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View.inflate(context, R.layout.calendar_view_calendar_detail_toolbar, this);
        View findViewById = findViewById(R.id.toolbar_close);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.toolbar_close)");
        this.f75710b = findViewById;
        View findViewById2 = findViewById(R.id.toolbar_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.toolbar_title)");
        TextView textView = (TextView) findViewById2;
        this.f75711c = textView;
        View findViewById3 = findViewById(R.id.external_label);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.external_label)");
        this.f75712d = findViewById3;
        View findViewById4 = findViewById(R.id.toolbar_edit);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.toolbar_edit)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById4;
        this.f75714f = appCompatImageView;
        View findViewById5 = findViewById(R.id.toolbar_more);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.toolbar_more)");
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById5;
        this.f75713e = appCompatImageView2;
        CalendarDetailToolbar calendarDetailToolbar = this;
        findViewById.setOnClickListener(calendarDetailToolbar);
        appCompatImageView.setOnClickListener(calendarDetailToolbar);
        appCompatImageView2.setOnClickListener(calendarDetailToolbar);
        textView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        findViewById3.setBackground(new RoundRectDrawable(UDColorUtils.getColor(context, R.color.static_white_20), C32659l.m125335a((Number) 2), 0, 0, 0, false, 60, null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarDetailToolbar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
