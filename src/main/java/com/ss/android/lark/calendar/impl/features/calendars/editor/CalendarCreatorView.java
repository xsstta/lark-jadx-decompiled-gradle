package com.ss.android.lark.calendar.impl.features.calendars.editor;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarMemberAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogBuilder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32500a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u0001:\u0001gB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00100\u001a\u00020\u0006H\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\b\u00102\u001a\u00020\u0017H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020.H\u0016J\b\u00106\u001a\u00020.H\u0002J\b\u00107\u001a\u00020.H\u0002J\b\u00108\u001a\u00020.H\u0002J\b\u00109\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020.H\u0002J\b\u0010;\u001a\u00020.H\u0003J\u0006\u0010<\u001a\u00020.J\b\u0010=\u001a\u00020.H\u0002J\b\u0010>\u001a\u00020.H\u0002J\b\u0010?\u001a\u00020.H\u0002J\b\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020.H\u0002J\b\u0010B\u001a\u00020.H\u0002J\b\u0010C\u001a\u00020.H\u0002J\b\u0010D\u001a\u00020.H\u0002J\b\u0010E\u001a\u00020.H\u0002J\u0006\u0010F\u001a\u00020.J\b\u0010G\u001a\u00020.H\u0016J\b\u0010H\u001a\u00020.H\u0016J\u0010\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020\u0006H\u0016J\b\u0010K\u001a\u00020.H\u0016J\b\u0010L\u001a\u00020.H\u0016J\b\u0010M\u001a\u00020.H\u0016J\b\u0010N\u001a\u00020.H\u0016J\b\u0010O\u001a\u00020.H\u0016J\u0010\u0010P\u001a\u00020.2\u0006\u0010Q\u001a\u00020\u0006H\u0016J\u0010\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020\u001cH\u0016J\u0010\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020+H\u0016J\b\u0010V\u001a\u00020.H\u0002J\b\u0010W\u001a\u00020.H\u0016J\b\u0010X\u001a\u00020.H\u0016J\b\u0010Y\u001a\u00020.H\u0002J\b\u0010Z\u001a\u00020.H\u0016J\b\u0010[\u001a\u00020.H\u0002J\u0010\u0010\\\u001a\u00020.2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020.2\u0006\u0010]\u001a\u00020^H\u0016J\u0016\u0010`\u001a\u00020.2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020c0bH\u0016J\u0010\u0010d\u001a\u00020.2\u0006\u0010e\u001a\u00020\u0006H\u0002J\u0010\u0010f\u001a\u00020.2\u0006\u0010]\u001a\u00020^H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020%X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView;", "viewRoot", "Landroid/view/View;", "(Landroid/view/View;)V", "hasGetCalendarDataFromServer", "", "isCalendarResignedEnabled", "isEditable", "isEditable$annotations", "()V", "()Z", "setEditable", "(Z)V", "isNewCreate", "setNewCreate", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter;", "getMAdapter", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter;", "setMAdapter", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter;)V", "mContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getMContext", "()Landroid/content/Context;", "mOriginAlias", "", "getMOriginAlias", "()Ljava/lang/String;", "setMOriginAlias", "(Ljava/lang/String;)V", "mOriginName", "getMOriginName", "setMOriginName", "mSaveView", "Landroid/widget/TextView;", "getMSaveView", "()Landroid/widget/TextView;", "setMSaveView", "(Landroid/widget/TextView;)V", "mViewDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;", "checkIfChangeName", "create", "", "destroy", "frameLayoutIsVisible", "getCalendarSummary", "getContext", "getFrameLayoutId", "", "hideKeyBoard", "initAddMemberLabelVisibility", "initAliasContainerVisibility", "initContainerValue", "initDeleteBt", "initDescriptionContainer", "initEditable", "initListener", "initNameTextVisibility", "initNewCreate", "initRecycleViewValue", "initTitleBar", "initUnSubscribeBt", "initView", "initViewContainerVisibility", "initViewValue", "initVisibilityContainer", "onBackPressed", "onDeleteFailed", "onDeleteSuccess", "onGetManagerCalendar", "getFromServer", "onSaveFailed", "onSaveNotCompliance", "onSaveSuccess", "onUnSubscribeFailed", "onUnSubscribeSuccess", "setSaveBtClickable", "isClickable", "setSummary", "calendarSummary", "setViewDelegate", "viewDelegate", "showDeleteDialog", "showErrMessage", "showNeedSummaryDialog", "showResignedDialog", "showUnSaveChangeDialog", "showUnSubscribeDialog", "updateColorContainer", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "updateDescriptionContainer", "updateMemberRecycleView", "calendarMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "updateSaveBtnColor", "isDeepColor", "updateVisibilityContainer", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d */
public final class CalendarCreatorView implements ICalendarCreatorContract.ICalendarCreatorView {

    /* renamed from: g */
    public static final Companion f75936g = new Companion(null);

    /* renamed from: a */
    public ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate f75937a;

    /* renamed from: b */
    public CalendarMemberAdapter f75938b;

    /* renamed from: c */
    public TextView f75939c;

    /* renamed from: d */
    public final boolean f75940d = C30022a.f74883b.mo112710r();

    /* renamed from: e */
    public boolean f75941e;

    /* renamed from: f */
    public final View f75942f;

    /* renamed from: h */
    private final Context f75943h;

    /* renamed from: i */
    private String f75944i = "";

    /* renamed from: j */
    private String f75945j = "";

    /* renamed from: k */
    private boolean f75946k;

    /* renamed from: l */
    private boolean f75947l;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$Companion;", "", "()V", "CALENDAR_ALIAS_MAX_LENGTH", "", "CALENDAR_DESCRIPTION_MAX_LENGTH", "CALENDAR_SUMMARY_MAX_LENGTH", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m112694I();
    }

    /* renamed from: y */
    private final void m112700y() {
        m112693H();
        m112695J();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: e */
    public void mo109546e() {
        KeyboardUtils.hideKeyboard(this.f75943h);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: l */
    public void mo109553l() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Toast_Deleted));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: m */
    public void mo109554m() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Common_DeleteFailedTip));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: n */
    public void mo109555n() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Toast_Removed));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: o */
    public void mo109556o() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Toast_FailedToRemoveCalendar));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: q */
    public void mo109558q() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Toast_FailedToSave));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: r */
    public void mo109559r() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Toast_CalendarSensitiveContent));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: s */
    public void mo109560s() {
        Context context = this.f75943h;
        LKUIToast.show(context, C57582a.m223604a(context, (int) R.string.Calendar_Common_FailedtoLoad2));
    }

    /* renamed from: t */
    public final void mo109561t() {
        mo109546e();
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo109510a();
    }

    /* renamed from: w */
    private final void m112698w() {
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        this.f75947l = Intrinsics.areEqual(aVar.mo109522k(), "new_calendar_type");
    }

    /* renamed from: x */
    private final void m112699x() {
        m112686A();
        m112687B();
        m112688C();
        m112689D();
        m112690E();
        m112692G();
        m112691F();
    }

    /* renamed from: a */
    public final TextView mo109533a() {
        TextView textView = this.f75939c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveView");
        }
        return textView;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: i */
    public String mo109550i() {
        EditText editText = (EditText) this.f75942f.findViewById(R.id.calendarSummaryEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "viewRoot.calendarSummaryEditText");
        return editText.getText().toString();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: j */
    public int mo109551j() {
        FrameLayout frameLayout = (FrameLayout) this.f75942f.findViewById(R.id.creatorFragment);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.creatorFragment");
        return frameLayout.getId();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: k */
    public boolean mo109552k() {
        FrameLayout frameLayout = (FrameLayout) this.f75942f.findViewById(R.id.creatorFragment);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.creatorFragment");
        if (frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "")
    /* renamed from: v */
    private final void m112697v() {
        boolean z;
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (!Intrinsics.areEqual(aVar.mo109522k(), "new_calendar_type")) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar2 = this.f75937a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            if (aVar2.mo109520i().getSelfAccessRole() != Calendar.AccessRole.OWNER) {
                z = false;
                this.f75946k = z;
            }
        }
        z = true;
        this.f75946k = z;
    }

    /* renamed from: f */
    public final void mo109547f() {
        ((RelativeLayout) this.f75942f.findViewById(R.id.mColorContainer)).setOnClickListener(new View$OnClickListenerC30325f(this));
        ((EditText) this.f75942f.findViewById(R.id.calendarSummaryEditText)).addTextChangedListener(new C30326g(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: g */
    public void mo109548g() {
        Context context = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Setting_CannotSave)).message(R.string.Calendar_Setting_AddCalendarTitlePopWindow)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, (DialogInterface.OnClickListener) null)).messageTextColor(R.color.text_caption)).messageTextSize(14)).show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: p */
    public void mo109557p() {
        LKUIToast.show(C32634ae.m125179a(), C32634ae.m125182b(R.string.Calendar_Toast_Saved));
        CalendarHitPoint.m124128c(((TextView) this.f75942f.findViewById(R.id.descriptionTv)).length());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m112687B() {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorView.m112687B():void");
    }

    /* renamed from: D */
    private final void m112689D() {
        Boolean bool;
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        boolean z = true;
        if (!this.f75947l) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            Calendar.CalendarAuthInfo calendarAuthInfo = aVar.mo109520i().getCalendarAuthInfo();
            if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
                bool = null;
            } else {
                bool = calendarEditAuthInfo.is_discription_editable;
            }
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                z = false;
            }
        }
        ((RelativeLayout) this.f75942f.findViewById(R.id.descriptionContainer)).setOnClickListener(new View$OnClickListenerC30324e(this, z));
    }

    /* renamed from: G */
    private final void m112692G() {
        Boolean bool;
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        Calendar.CalendarAuthInfo calendarAuthInfo = aVar.mo109520i().getCalendarAuthInfo();
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            bool = null;
        } else {
            bool = calendarEditAuthInfo.is_deletable;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f75942f.findViewById(R.id.deleteContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "viewRoot.deleteContainer");
            relativeLayout.setVisibility(0);
            ((RelativeLayout) this.f75942f.findViewById(R.id.deleteContainer)).setOnClickListener(new View$OnClickListenerC30323d(this));
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f75942f.findViewById(R.id.deleteContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "viewRoot.deleteContainer");
        relativeLayout2.setVisibility(8);
    }

    /* renamed from: J */
    private final void m112695J() {
        CalendarMemberAdapter fVar = this.f75938b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        fVar.mo109583a(aVar.mo109521j());
        CalendarMemberAdapter fVar2 = this.f75938b;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar2 = this.f75937a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        fVar2.mo109582a(aVar2.mo109522k());
        CalendarMemberAdapter fVar3 = this.f75938b;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar3 = this.f75937a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        fVar3.mo109581a(aVar3.mo109520i());
        CalendarMemberAdapter fVar4 = this.f75938b;
        if (fVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fVar4.notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void mo109542c() {
        Context context = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_SubscribeCalendar_OwnerUnsubscribePopUpWindowTitle)).message(R.string.Calendar_Setting_OwnerUnsubscribePopUpWindow)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC30336q(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    /* renamed from: d */
    public final void mo109545d() {
        Context context = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Setting_DeleteConfirmTitle)).titleLineCount(2)).message(R.string.Calendar_Setting_DeleteCalendarPopUpWindow)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC30333n(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: h */
    public void mo109549h() {
        Context context = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Edit_UnSaveTip)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC30335p(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: u */
    public boolean mo109562u() {
        String str = this.f75944i;
        EditText editText = (EditText) this.f75942f.findViewById(R.id.calendarSummaryEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "viewRoot.calendarSummaryEditText");
        if (!(!Intrinsics.areEqual(str, editText.getText().toString()))) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f75942f.findViewById(R.id.aliasContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "viewRoot.aliasContainer");
            if (relativeLayout.getVisibility() != 0) {
                return false;
            }
            String str2 = this.f75945j;
            EditText editText2 = (EditText) this.f75942f.findViewById(R.id.aliasEt);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "viewRoot.aliasEt");
            if (!Intrinsics.areEqual(str2, editText2.getText().toString())) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$initContainerValue$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC30322c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75949a;

        public void onGlobalLayout() {
            TextView textView = (TextView) this.f75949a.f75942f.findViewById(R.id.descriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "viewRoot.descriptionTv");
            ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
            Intrinsics.checkExpressionValueIsNotNull(viewTreeObserver, "viewRoot.descriptionTv.viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                TextView textView2 = (TextView) this.f75949a.f75942f.findViewById(R.id.descriptionTv);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "viewRoot.descriptionTv");
                textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                TextView textView3 = (TextView) this.f75949a.f75942f.findViewById(R.id.descriptionTv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "viewRoot.descriptionTv");
                if (textView3.getLayout() != null) {
                    TextView textView4 = (TextView) this.f75949a.f75942f.findViewById(R.id.descriptionTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView4, "viewRoot.descriptionTv");
                    Layout layout = textView4.getLayout();
                    TextView textView5 = (TextView) this.f75949a.f75942f.findViewById(R.id.descriptionTv);
                    Intrinsics.checkExpressionValueIsNotNull(textView5, "viewRoot.descriptionTv");
                    if (layout.getEllipsisCount(textView5.getLineCount() - 1) <= 0) {
                        ImageView imageView = (ImageView) this.f75949a.f75942f.findViewById(R.id.descriptionArrow);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "viewRoot.descriptionArrow");
                        imageView.setVisibility(8);
                        ((RelativeLayout) this.f75949a.f75942f.findViewById(R.id.descriptionContainer)).setOnClickListener(null);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC30322c(CalendarCreatorView dVar) {
            this.f75949a = dVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m112686A() {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorView.m112686A():void");
    }

    /* renamed from: C */
    private final void m112688C() {
        Boolean bool;
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        boolean z = true;
        if (!this.f75947l) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            Calendar.CalendarAuthInfo calendarAuthInfo = aVar.mo109520i().getCalendarAuthInfo();
            if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
                bool = null;
            } else {
                bool = calendarEditAuthInfo.is_visibility_editable;
            }
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                z = false;
            }
        }
        if (z) {
            ImageView imageView = (ImageView) this.f75942f.findViewById(R.id.visibilityArrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "viewRoot.visibilityArrow");
            imageView.setVisibility(0);
            ((TextView) this.f75942f.findViewById(R.id.visibilityTextView)).setTextColor(C32634ae.m125178a(R.color.text_title));
            ((RelativeLayout) this.f75942f.findViewById(R.id.visibilityContainer)).setOnClickListener(new View$OnClickListenerC30332m(this));
            return;
        }
        ImageView imageView2 = (ImageView) this.f75942f.findViewById(R.id.visibilityArrow);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "viewRoot.visibilityArrow");
        imageView2.setVisibility(8);
        ((TextView) this.f75942f.findViewById(R.id.visibilityTextView)).setTextColor(C32634ae.m125178a(R.color.text_disable));
        ((RelativeLayout) this.f75942f.findViewById(R.id.visibilityContainer)).setOnClickListener(null);
    }

    /* renamed from: E */
    private final void m112690E() {
        Boolean bool;
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        boolean z = true;
        if (!this.f75947l) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            Calendar.CalendarAuthInfo calendarAuthInfo = aVar.mo109520i().getCalendarAuthInfo();
            if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
                bool = null;
            } else {
                bool = calendarEditAuthInfo.is_member_editable;
            }
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                z = false;
            }
        }
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f75942f.findViewById(R.id.addMemberContainer);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "viewRoot.addMemberContainer");
            constraintLayout.setVisibility(0);
            ((ConstraintLayout) this.f75942f.findViewById(R.id.addMemberContainer)).setOnClickListener(new View$OnClickListenerC30321b(this));
            RelativeLayout relativeLayout = (RelativeLayout) this.f75942f.findViewById(R.id.sharingMemberContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "viewRoot.sharingMemberContainer");
            relativeLayout.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f75942f.findViewById(R.id.addMemberContainer);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "viewRoot.addMemberContainer");
        constraintLayout2.setVisibility(8);
        ((ConstraintLayout) this.f75942f.findViewById(R.id.addMemberContainer)).setOnClickListener(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f75942f.findViewById(R.id.sharingMemberContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "viewRoot.sharingMemberContainer");
        relativeLayout2.setVisibility(0);
    }

    /* renamed from: F */
    private final void m112691F() {
        Boolean bool;
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        Calendar.CalendarAuthInfo calendarAuthInfo = aVar.mo109520i().getCalendarAuthInfo();
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            bool = null;
        } else {
            bool = calendarEditAuthInfo.is_unsubscribable;
        }
        boolean areEqual = Intrinsics.areEqual((Object) bool, (Object) true);
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar2 = this.f75937a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (!Intrinsics.areEqual(aVar2.mo109522k(), "new_calendar_type")) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar3 = this.f75937a;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            if (!aVar3.mo109520i().isRealPrimary()) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f75942f.findViewById(R.id.unsubscribeContainer);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "viewRoot.unsubscribeContainer");
                relativeLayout.setVisibility(0);
                ((RelativeLayout) this.f75942f.findViewById(R.id.unsubscribeContainer)).setOnClickListener(new View$OnClickListenerC30329j(this, areEqual));
                View findViewById = this.f75942f.findViewById(R.id.bottomDivider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "viewRoot.bottomDivider");
                findViewById.setVisibility(0);
                return;
            }
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f75942f.findViewById(R.id.unsubscribeContainer);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "viewRoot.unsubscribeContainer");
        relativeLayout2.setVisibility(8);
        View findViewById2 = this.f75942f.findViewById(R.id.bottomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "viewRoot.bottomDivider");
        findViewById2.setVisibility(8);
    }

    /* renamed from: I */
    private final void m112694I() {
        m112701z();
        mo109547f();
        RecyclerView recyclerView = (RecyclerView) this.f75942f.findViewById(R.id.calendarMembers);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "viewRoot.calendarMembers");
        recyclerView.setLayoutManager(new CalendarCreatorView$initView$1(this, this.f75943h, 1, false));
        NestedScrollView nestedScrollView = (NestedScrollView) this.f75942f.findViewById(R.id.scrollView);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollView, "viewRoot.scrollView");
        nestedScrollView.setFocusable(true);
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.f75942f.findViewById(R.id.scrollView);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollView2, "viewRoot.scrollView");
        nestedScrollView2.setFocusableInTouchMode(true);
        NestedScrollView nestedScrollView3 = (NestedScrollView) this.f75942f.findViewById(R.id.scrollView);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollView3, "viewRoot.scrollView");
        nestedScrollView3.setDescendantFocusability(131072);
        ((NestedScrollView) this.f75942f.findViewById(R.id.scrollView)).setOnTouchListener(new View$OnTouchListenerC30330k(this));
        CalendarMemberAdapter fVar = new CalendarMemberAdapter();
        this.f75938b = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fVar.mo109580a(new C30331l(this));
        RecyclerView recyclerView2 = (RecyclerView) this.f75942f.findViewById(R.id.calendarMembers);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "viewRoot.calendarMembers");
        CalendarMemberAdapter fVar2 = this.f75938b;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(fVar2);
    }

    /* renamed from: z */
    private final void m112701z() {
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (Intrinsics.areEqual(aVar.mo109522k(), "new_calendar_type")) {
            ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).setTitle(R.string.Calendar_Setting_NewCalendar);
        } else {
            ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).setTitle(R.string.Calendar_Setting_CalendarSetting);
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar);
        commonTitleBar.setLeftImageDrawable(null);
        commonTitleBar.setLeftText(R.string.Calendar_Common_Cancel);
        ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).setMainTitleSize(17.0f);
        View addAction = ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).addAction(new C30327h(this, C32634ae.m125182b(R.string.Calendar_Common_Save), R.color.primary_pri_500));
        if (addAction != null) {
            this.f75939c = (TextView) addAction;
            ((CommonTitleBar) this.f75942f.findViewById(R.id.creatorTitleBar)).setLeftClickListener(new C30328i(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: b */
    public final void mo109539b() {
        ArrayList arrayList = new ArrayList();
        SpanMenuItem.Builder aVar = new SpanMenuItem.Builder();
        Context context = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        String string = context.getResources().getString(R.string.Calendar_Detail_UnsubscribeResignedPersonCalendar);
        Intrinsics.checkExpressionValueIsNotNull(string, "mContext.resources.getSt…beResignedPersonCalendar)");
        arrayList.add(aVar.mo115312b(string).mo115324i());
        SpanMenuItem.Builder a = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.THIS_EVENT);
        Context context2 = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        String string2 = context2.getResources().getString(R.string.Calendar_Detail_UnsubscribeCalendar);
        Intrinsics.checkExpressionValueIsNotNull(string2, "mContext.resources.getSt…tail_UnsubscribeCalendar)");
        arrayList.add(a.mo115309a(string2).mo115324i());
        SpanMenuItem.Builder a2 = new SpanMenuItem.Builder().mo115308a(CalendarEvent.Span.FUTURE_EVENTS);
        Context context3 = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context3, "mContext");
        String string3 = context3.getResources().getString(R.string.Calendar_Detail_DeleteCalendar);
        Intrinsics.checkExpressionValueIsNotNull(string3, "mContext.resources.getSt…ar_Detail_DeleteCalendar)");
        arrayList.add(a2.mo115309a(string3).mo115318d(true).mo115324i());
        Context context4 = this.f75943h;
        Intrinsics.checkExpressionValueIsNotNull(context4, "mContext");
        ((SpanListDialogBuilder) new SpanListDialogBuilder(context4).mo116008a(arrayList).mo116007a(new C30334o(this)).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m112693H() {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorView.m112693H():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$initListener$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$g */
    public static final class C30326g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75954a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30326g(CalendarCreatorView dVar) {
            this.f75954a = dVar;
        }

        public void afterTextChanged(Editable editable) {
            boolean z = true;
            if (Intrinsics.areEqual(CalendarCreatorView.m112696a(this.f75954a).mo109522k(), "new_calendar_type")) {
                this.f75954a.mo109544c(!TextUtils.isEmpty(String.valueOf(editable)));
            } else if (Intrinsics.areEqual(CalendarCreatorView.m112696a(this.f75954a).mo109522k(), "manager_calendar_type")) {
                CalendarCreatorView dVar = this.f75954a;
                if (TextUtils.isEmpty(String.valueOf(editable)) || !this.f75954a.f75941e) {
                    z = false;
                }
                dVar.mo109544c(z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$initTitleBar$3", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$i */
    public static final class C30328i extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75956a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30328i(CalendarCreatorView dVar) {
            this.f75956a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            CalendarHitPoint.m124143j("back");
            this.f75956a.mo109561t();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$initView$3", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarMemberAdapter$Delegate;", "onClickMemberItem", "", "calendarMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$l */
    public static final class C30331l implements CalendarMemberAdapter.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75960a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30331l(CalendarCreatorView dVar) {
            this.f75960a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarMemberAdapter.Delegate
        /* renamed from: a */
        public void mo109573a(CalendarMember calendarMember) {
            Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
            FrameLayout frameLayout = (FrameLayout) this.f75960a.f75942f.findViewById(R.id.creatorFragment);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.creatorFragment");
            frameLayout.setVisibility(0);
            CalendarCreatorView.m112696a(this.f75960a).mo109511a(calendarMember);
            CalendarHitPoint.m124105G();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$showResignedDialog$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "onItemClick", "", "span", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Span;", "isChecked", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$o */
    public static final class C30334o implements SpanListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75963a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30334o(CalendarCreatorView dVar) {
            this.f75963a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController.OnItemClickListener
        /* renamed from: a */
        public void mo109576a(CalendarEvent.Span span, boolean z) {
            if (span != null) {
                int i = C30337e.f75966a[span.ordinal()];
                if (i == 1) {
                    this.f75963a.mo109542c();
                } else if (i == 2) {
                    this.f75963a.mo109545d();
                }
            }
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f75937a = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate m112696a(CalendarCreatorView dVar) {
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = dVar.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: b */
    public void mo109541b(boolean z) {
        TextView textView = this.f75939c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveView");
        }
        textView.setClickable(z);
        mo109544c(z);
    }

    public CalendarCreatorView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "viewRoot");
        this.f75942f = view;
        this.f75943h = view.getContext();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$b */
    public static final class View$OnClickListenerC30321b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75948a;

        View$OnClickListenerC30321b(CalendarCreatorView dVar) {
            this.f75948a = dVar;
        }

        public final void onClick(View view) {
            if (this.f75948a.mo109533a().isClickable()) {
                this.f75948a.mo109546e();
                ((NestedScrollView) this.f75948a.f75942f.findViewById(R.id.scrollView)).requestFocus();
                CalendarCreatorView.m112696a(this.f75948a).mo109517f();
                CalendarHitPoint.m124143j("member");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$d */
    public static final class View$OnClickListenerC30323d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75950a;

        View$OnClickListenerC30323d(CalendarCreatorView dVar) {
            this.f75950a = dVar;
        }

        public final void onClick(View view) {
            this.f75950a.mo109546e();
            ((NestedScrollView) this.f75950a.f75942f.findViewById(R.id.scrollView)).requestFocus();
            this.f75950a.mo109545d();
            CalendarHitPoint.m124145k("remove");
            CalendarSettingHitPoint.m124369a(CalendarCreatorView.m112696a(this.f75950a).mo109520i().getServerId(), "delete_calendar");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$e */
    public static final class View$OnClickListenerC30324e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75951a;

        /* renamed from: b */
        final /* synthetic */ boolean f75952b;

        View$OnClickListenerC30324e(CalendarCreatorView dVar, boolean z) {
            this.f75951a = dVar;
            this.f75952b = z;
        }

        public final void onClick(View view) {
            FrameLayout frameLayout = (FrameLayout) this.f75951a.f75942f.findViewById(R.id.creatorFragment);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.creatorFragment");
            frameLayout.setVisibility(0);
            CalendarCreatorView.m112696a(this.f75951a).mo109512a(this.f75952b);
            CalendarHitPoint.m124143j("description");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$f */
    public static final class View$OnClickListenerC30325f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75953a;

        View$OnClickListenerC30325f(CalendarCreatorView dVar) {
            this.f75953a = dVar;
        }

        public final void onClick(View view) {
            this.f75953a.mo109546e();
            ((NestedScrollView) this.f75953a.f75942f.findViewById(R.id.scrollView)).requestFocus();
            FrameLayout frameLayout = (FrameLayout) this.f75953a.f75942f.findViewById(R.id.creatorFragment);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.creatorFragment");
            frameLayout.setVisibility(0);
            CalendarCreatorView.m112696a(this.f75953a).mo109518g();
            CalendarHitPoint.m124143j("color");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: a */
    public void mo109535a(com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        GradientDrawable a = ao.m125221a(calendar.getBackgroundColor(), 0, 0);
        ImageView imageView = (ImageView) this.f75942f.findViewById(R.id.ivEventColor);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "viewRoot.ivEventColor");
        imageView.setBackground(a);
    }

    /* renamed from: c */
    public final void mo109544c(boolean z) {
        if (z) {
            TextView textView = this.f75939c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSaveView");
            }
            textView.setTextColor(C57582a.m223616d(this.f75943h, R.color.primary_pri_500));
            return;
        }
        TextView textView2 = this.f75939c;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSaveView");
        }
        textView2.setTextColor(C25633a.m91708b(UIHelper.getColor(R.color.primary_pri_500), 0.5f));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$j */
    public static final class View$OnClickListenerC30329j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75957a;

        /* renamed from: b */
        final /* synthetic */ boolean f75958b;

        View$OnClickListenerC30329j(CalendarCreatorView dVar, boolean z) {
            this.f75957a = dVar;
            this.f75958b = z;
        }

        public final void onClick(View view) {
            boolean z;
            this.f75957a.mo109546e();
            ((NestedScrollView) this.f75957a.f75942f.findViewById(R.id.scrollView)).requestFocus();
            boolean isResignedCalendar = CalendarCreatorView.m112696a(this.f75957a).mo109520i().isResignedCalendar();
            if (CalendarCreatorView.m112696a(this.f75957a).mo109520i().getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                z = true;
            } else {
                z = false;
            }
            if (isResignedCalendar && this.f75958b && this.f75957a.f75940d) {
                this.f75957a.mo109539b();
            } else if (!this.f75958b || !z) {
                CalendarCreatorView.m112696a(this.f75957a).mo109514c();
            } else {
                this.f75957a.mo109542c();
            }
            CalendarHitPoint.m124145k("unsubscribe");
            CalendarSettingHitPoint.m124369a(CalendarCreatorView.m112696a(this.f75957a).mo109520i().getServerId(), "unsubscribe");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$m */
    public static final class View$OnClickListenerC30332m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75961a;

        View$OnClickListenerC30332m(CalendarCreatorView dVar) {
            this.f75961a = dVar;
        }

        public final void onClick(View view) {
            this.f75961a.mo109546e();
            ((NestedScrollView) this.f75961a.f75942f.findViewById(R.id.scrollView)).requestFocus();
            FrameLayout frameLayout = (FrameLayout) this.f75961a.f75942f.findViewById(R.id.creatorFragment);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.creatorFragment");
            frameLayout.setVisibility(0);
            CalendarCreatorView.m112696a(this.f75961a).mo109519h();
            CalendarHitPoint.m124143j("permission");
            C32500a.m124324a("edit_public_scale", null, 2, null);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: a */
    public void mo109536a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarSummary");
        ((EditText) this.f75942f.findViewById(R.id.calendarSummaryEditText)).setText(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: b */
    public void mo109540b(com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        if (calendar.isPublic() && calendar.getDefaultAccessRole() == Calendar.AccessRole.FREE_BUSY_READER) {
            ((TextView) this.f75942f.findViewById(R.id.visibilityTextView)).setText(R.string.Calendar_Setting_ShowOnlyFreeBusy);
        } else if (!calendar.isPublic() || !(calendar.getDefaultAccessRole() == Calendar.AccessRole.READER || calendar.getDefaultAccessRole() == Calendar.AccessRole.WRITER || calendar.getDefaultAccessRole() == Calendar.AccessRole.OWNER)) {
            ((TextView) this.f75942f.findViewById(R.id.visibilityTextView)).setText(R.string.Calendar_Edit_Private);
        } else {
            ((TextView) this.f75942f.findViewById(R.id.visibilityTextView)).setText(R.string.Calendar_Edit_Public);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorView$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$h */
    public static final class C30327h extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75955a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f75955a.mo109546e();
            CalendarSettingHitPoint.m124369a(CalendarCreatorView.m112696a(this.f75955a).mo109520i().getServerId(), "save");
            com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar i = CalendarCreatorView.m112696a(this.f75955a).mo109520i();
            EditText editText = (EditText) this.f75955a.f75942f.findViewById(R.id.calendarSummaryEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "viewRoot.calendarSummaryEditText");
            i.setSummary(editText.getText().toString());
            com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar i2 = CalendarCreatorView.m112696a(this.f75955a).mo109520i();
            EditText editText2 = (EditText) this.f75955a.f75942f.findViewById(R.id.aliasEt);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "viewRoot.aliasEt");
            i2.setNote(editText2.getText().toString());
            CalendarCreatorView.m112696a(this.f75955a).mo109513b();
            CalendarHitPoint.m124143j("save");
            GeneralHitPoint.m124219a(CalendarCreatorView.m112696a(this.f75955a).mo109521j(), CalendarCreatorView.m112696a(this.f75955a).mo109522k());
            String description = CalendarCreatorView.m112696a(this.f75955a).mo109520i().getDescription();
            if (description == null || description.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C32500a.m124323a("save", Boolean.valueOf(!z));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30327h(CalendarCreatorView dVar, String str, int i) {
            super(str, i);
            this.f75955a = dVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: a */
    public void mo109537a(List<CalendarMember> list) {
        Intrinsics.checkParameterIsNotNull(list, "calendarMembers");
        CalendarMemberAdapter fVar = this.f75938b;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fVar.mo109583a(list);
        CalendarMemberAdapter fVar2 = this.f75938b;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fVar2.notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: c */
    public void mo109543c(com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar calendar) {
        Boolean bool;
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        if (TextUtils.isEmpty(calendar.getDescription())) {
            TextView textView = (TextView) this.f75942f.findViewById(R.id.descriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "viewRoot.descriptionTv");
            textView.setText(C32634ae.m125182b(R.string.Calendar_Setting_NoCalendarDescription));
            ((TextView) this.f75942f.findViewById(R.id.descriptionTv)).setTextColor(C32634ae.m125178a(R.color.text_placeholder));
            return;
        }
        TextView textView2 = (TextView) this.f75942f.findViewById(R.id.descriptionTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "viewRoot.descriptionTv");
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75937a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        textView2.setText(aVar.mo109520i().getDescription());
        boolean z = true;
        if (!this.f75947l) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar2 = this.f75937a;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            Calendar.CalendarAuthInfo calendarAuthInfo = aVar2.mo109520i().getCalendarAuthInfo();
            if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
                bool = null;
            } else {
                bool = calendarEditAuthInfo.is_discription_editable;
            }
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                z = false;
            }
        }
        if (z) {
            ((TextView) this.f75942f.findViewById(R.id.descriptionTv)).setTextColor(C32634ae.m125178a(R.color.text_title));
        } else {
            ((TextView) this.f75942f.findViewById(R.id.descriptionTv)).setTextColor(C32634ae.m125178a(R.color.text_disable));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView
    /* renamed from: a */
    public void mo109538a(boolean z) {
        this.f75941e = z;
        m112698w();
        m112697v();
        m112699x();
        m112700y();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$k */
    public static final class View$OnTouchListenerC30330k implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75959a;

        View$OnTouchListenerC30330k(CalendarCreatorView dVar) {
            this.f75959a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            view.requestFocus();
            this.f75959a.mo109546e();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$n */
    public static final class DialogInterface$OnClickListenerC30333n implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75962a;

        DialogInterface$OnClickListenerC30333n(CalendarCreatorView dVar) {
            this.f75962a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CalendarCreatorView.m112696a(this.f75962a).mo109515d();
            GeneralHitPoint.m124242e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$p */
    static final class DialogInterface$OnClickListenerC30335p implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75964a;

        DialogInterface$OnClickListenerC30335p(CalendarCreatorView dVar) {
            this.f75964a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CalendarCreatorView.m112696a(this.f75964a).mo109516e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.d$q */
    public static final class DialogInterface$OnClickListenerC30336q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorView f75965a;

        DialogInterface$OnClickListenerC30336q(CalendarCreatorView dVar) {
            this.f75965a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CalendarCreatorView.m112696a(this.f75965a).mo109514c();
        }
    }
}
