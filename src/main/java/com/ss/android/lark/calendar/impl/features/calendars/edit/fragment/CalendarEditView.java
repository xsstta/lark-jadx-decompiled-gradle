package com.ss.android.lark.calendar.impl.features.calendars.edit.fragment;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditInfo;
import com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.features.common.widget.ToastLoadingView;
import com.ss.android.lark.calendar.impl.features.common.widget.input.TitledTextInput;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32500a;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.an;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0003H\u0002J\u0012\u0010:\u001a\u00020\u00042\b\u0010;\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020'H\u0002J\u0010\u0010?\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"J\u0018\u0010@\u001a\u00020\u00042\u0010\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010C\u0018\u00010BJ\u0015\u0010D\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020\u00042\b\u0010H\u001a\u0004\u0018\u00010IR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0010*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0010*\u0004\u0018\u00010\u00190\u0019X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0010*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0010*\u0004\u0018\u00010\u001f0\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0010*\u0004\u0018\u00010)0)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n \u0010*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0010*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n \u0010*\u0004\u0018\u00010\u00190\u0019X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\n \u0010*\u0004\u0018\u00010202X\u0004¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n \u0010*\u0004\u0018\u00010404X\u0004¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006J"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/fragment/CalendarEditView;", "Landroid/view/View$OnClickListener;", "Lkotlin/Function1;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/input/TitledTextInput;", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "avatarSize", "", "blockTouch", "Landroid/view/View;", "kotlin.jvm.PlatformType", "calColor", "Landroid/widget/TextView;", "calColorDot", "calCover", "Landroid/widget/ImageView;", "calDesc", "calNote", "calNoteGroup", "Landroidx/constraintlayout/widget/Group;", "calSave", "calShareSettings", "calSummary", "calendarColor", "context", "Landroid/content/Context;", "coverSize", "editInfo", "Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditInfo;", "fragmentContainerId", "getFragmentContainerId", "()I", "isNewCreate", "", "loadingView", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView;", "notEditableClickListener", "selectCalCover", "selfAvatar", "selfGroup", "selfName", "selfRole", "shareSettingsGroup", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "toastLoading", "Lcom/ss/android/lark/calendar/impl/features/common/widget/ToastLoadingView;", "view", "getView", "()Landroid/view/View;", "invoke", "it", "onClick", "v", "setEditable", "titledTextInput", "editable", "updateCalendar", "updatePageStatus", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "updateSaveStatus", "canSave", "(Ljava/lang/Boolean;)V", "updateSelfMember", "self", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.b */
public final class CalendarEditView implements View.OnClickListener, Function1<TitledTextInput, Unit> {

    /* renamed from: A */
    private int f75793A;

    /* renamed from: B */
    private CalendarEditInfo f75794B;

    /* renamed from: C */
    private final ActionDispatcher f75795C;

    /* renamed from: a */
    public final Context f75796a;

    /* renamed from: b */
    private final View f75797b;

    /* renamed from: c */
    private final int f75798c = R.id.cal_edit_fragment_container;

    /* renamed from: d */
    private final CommonTitleBar f75799d;

    /* renamed from: e */
    private final TextView f75800e;

    /* renamed from: f */
    private final int f75801f;

    /* renamed from: g */
    private final ImageView f75802g;

    /* renamed from: h */
    private final ImageView f75803h;

    /* renamed from: i */
    private final TitledTextInput f75804i;

    /* renamed from: j */
    private final Group f75805j;

    /* renamed from: k */
    private final TitledTextInput f75806k;

    /* renamed from: l */
    private final TitledTextInput f75807l;

    /* renamed from: m */
    private final TextView f75808m;

    /* renamed from: n */
    private final View f75809n;

    /* renamed from: o */
    private final int f75810o;

    /* renamed from: p */
    private final Group f75811p;

    /* renamed from: q */
    private final ImageView f75812q;

    /* renamed from: r */
    private final TextView f75813r;

    /* renamed from: s */
    private final TextView f75814s;

    /* renamed from: t */
    private final TextView f75815t;

    /* renamed from: u */
    private final View f75816u;

    /* renamed from: v */
    private final View f75817v;

    /* renamed from: w */
    private final ToastLoadingView f75818w;

    /* renamed from: x */
    private final CalendarLoadingView f75819x;

    /* renamed from: y */
    private final View.OnClickListener f75820y;

    /* renamed from: z */
    private boolean f75821z;

    /* renamed from: a */
    public final View mo109366a() {
        return this.f75797b;
    }

    /* renamed from: b */
    public final int mo109372b() {
        return this.f75798c;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(TitledTextInput titledTextInput) {
        mo109369a(titledTextInput);
        return Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.b$a */
    static final class View$OnClickListenerC30278a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarEditView f75823a;

        View$OnClickListenerC30278a(CalendarEditView bVar) {
            this.f75823a = bVar;
        }

        public final void onClick(View view) {
            Context context = this.f75823a.f75796a;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDToast.show(context, (int) R.string.Calendar_Manage_NoPermissionMakeChange, (int) R.drawable.ud_icon_more_close_outlined);
        }
    }

    /* renamed from: a */
    public final void mo109371a(Boolean bool) {
        int i;
        Log.m165389i("CalendarEditFragment", "updateSaveStatus: " + bool);
        TextView textView = this.f75800e;
        Context context = this.f75796a;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            i = R.color.ud_B500;
        } else {
            i = R.color.text_disable;
        }
        textView.setTextColor(UDColorUtils.getColor(context, i));
    }

    /* renamed from: a */
    public void mo109369a(TitledTextInput titledTextInput) {
        Intrinsics.checkParameterIsNotNull(titledTextInput, "it");
        if (Intrinsics.areEqual(titledTextInput, this.f75804i)) {
            CalendarEditViewModel.Companion.mo109338a(this.f75795C, titledTextInput.getText());
        } else if (Intrinsics.areEqual(titledTextInput, this.f75806k)) {
            CalendarEditViewModel.Companion.mo109340b(this.f75795C, titledTextInput.getText());
        } else if (Intrinsics.areEqual(titledTextInput, this.f75807l)) {
            CalendarEditViewModel.Companion.mo109341c(this.f75795C, titledTextInput.getText());
        }
    }

    /* renamed from: a */
    public final void mo109367a(CalendarMemberInfo eVar) {
        boolean z;
        String str;
        String str2;
        Log.m165389i("CalendarEditFragment", "updateSelfMember: " + eVar);
        Group group = this.f75811p;
        Intrinsics.checkExpressionValueIsNotNull(group, "selfGroup");
        int i = 0;
        if (eVar != null) {
            String a = eVar.mo109205a();
            boolean z2 = true;
            if (a == null || a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String b = eVar.mo109206b();
                if (!(b == null || b.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    if (eVar.mo109207c() != null) {
                        ImageView imageView = this.f75812q;
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "selfAvatar");
                        IRequestCreator with = ImageLoader.with(imageView.getContext());
                        String c = eVar.mo109207c();
                        String a2 = eVar.mo109205a();
                        int i2 = this.f75810o;
                        with.load(AvatarImage.Builder.obtain(c, a2, i2, i2).build()).into(this.f75812q);
                    }
                    TextView textView = this.f75813r;
                    Intrinsics.checkExpressionValueIsNotNull(textView, "selfName");
                    textView.setText(eVar.mo109206b());
                    TextView textView2 = this.f75814s;
                    Intrinsics.checkExpressionValueIsNotNull(textView2, "selfRole");
                    if (eVar.mo109209e()) {
                        str = C32634ae.m125182b(R.string.Calendar_Share_Owner);
                    } else {
                        Calendar.AccessRole d = eVar.mo109208d();
                        if (d != null) {
                            str2 = C30237a.m112289a(d);
                        } else {
                            str2 = null;
                        }
                        str = str2;
                    }
                    textView2.setText(str);
                    group.setVisibility(i);
                }
            }
        }
        i = 8;
        group.setVisibility(i);
    }

    public void onClick(View view) {
        String str;
        boolean z;
        CalendarEditInfo aVar = this.f75794B;
        if (aVar == null) {
            return;
        }
        if (Intrinsics.areEqual(view, this.f75802g)) {
            ActionDispatcher.C32507a.m124446a(this.f75795C, "ACTION_SELECT_COVER", null, 2, null);
        } else if (Intrinsics.areEqual(view, this.f75808m)) {
            CalendarEditFragment.f75779c.mo109352a(this.f75795C, this.f75793A);
        } else if (Intrinsics.areEqual(view, this.f75815t)) {
            if (aVar.mo109303c()) {
                Context context = this.f75796a;
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                UDToast.show(context, (int) R.string.Calendar_Share_UnableChangePermissionsForAllStaff);
            } else if (aVar.mo109315o()) {
                ActionDispatcher.C32507a.m124446a(this.f75795C, "ACTION_SHOW_SHARE_SETTINGS", null, 2, null);
            } else {
                Context context2 = this.f75796a;
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                UDToast.show(context2, (int) R.string.Calendar_Manage_NoPermissionMakeChange);
            }
        } else if (Intrinsics.areEqual(view, this.f75800e)) {
            if (this.f75821z) {
                CharSequence i = aVar.mo109309i();
                if (i == null || i.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C32500a.m124325a(!z);
            } else {
                String a = aVar.mo109295a();
                String g = aVar.mo109307g();
                CharSequence h = aVar.mo109308h();
                if (h != null) {
                    str = h.toString();
                } else {
                    str = null;
                }
                CalendarSettingHitPoint.m124370a(a, !Intrinsics.areEqual(g, str));
            }
            ActionDispatcher.C32507a.m124446a(this.f75795C, "ACTION_SAVE", null, 2, null);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109370a(com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData<java.lang.String> r12) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditView.mo109370a(com.ss.android.lark.calendar.impl.framework.viewmodel.g):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (r3 != null) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0244  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109368a(com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditInfo r14) {
        /*
        // Method dump skipped, instructions count: 621
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditView.mo109368a(com.ss.android.lark.calendar.impl.features.calendars.edit.a.a):void");
    }

    /* renamed from: a */
    private final void m112486a(TitledTextInput titledTextInput, boolean z) {
        View.OnClickListener onClickListener;
        titledTextInput.mo113337a(z);
        UDEditText editText = titledTextInput.getEditText();
        if (z) {
            onClickListener = null;
        } else {
            onClickListener = this.f75820y;
        }
        editText.setOnClickListener(onClickListener);
    }

    public CalendarEditView(LayoutInflater layoutInflater, ViewGroup viewGroup, ActionDispatcher aVar) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(aVar, "actionDispatcher");
        this.f75795C = aVar;
        View inflate = layoutInflater.inflate(R.layout.calendar_fragment_calendar_create_edit, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…e_edit, container, false)");
        this.f75797b = inflate;
        Context context = inflate.getContext();
        this.f75796a = context;
        CommonTitleBar commonTitleBar = (CommonTitleBar) inflate.findViewById(R.id.title_bar);
        this.f75799d = commonTitleBar;
        TextView textView = (TextView) inflate.findViewById(R.id.cal_save);
        this.f75800e = textView;
        this.f75801f = C32659l.m125335a((Number) 80);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cal_cover);
        this.f75802g = imageView;
        this.f75803h = (ImageView) inflate.findViewById(R.id.select_cal_cover);
        TitledTextInput titledTextInput = (TitledTextInput) inflate.findViewById(R.id.cal_summary);
        this.f75804i = titledTextInput;
        this.f75805j = (Group) inflate.findViewById(R.id.cal_note_group);
        TitledTextInput titledTextInput2 = (TitledTextInput) inflate.findViewById(R.id.cal_note);
        this.f75806k = titledTextInput2;
        TitledTextInput titledTextInput3 = (TitledTextInput) inflate.findViewById(R.id.cal_desc);
        this.f75807l = titledTextInput3;
        TextView textView2 = (TextView) inflate.findViewById(R.id.cal_color);
        this.f75808m = textView2;
        this.f75809n = inflate.findViewById(R.id.cal_color_dot);
        this.f75810o = C32659l.m125335a((Number) 40);
        this.f75811p = (Group) inflate.findViewById(R.id.self_avatar_group);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.cal_self_avatar);
        this.f75812q = imageView2;
        this.f75813r = (TextView) inflate.findViewById(R.id.cal_self_name);
        this.f75814s = (TextView) inflate.findViewById(R.id.cal_self_role);
        TextView textView3 = (TextView) inflate.findViewById(R.id.cal_share_settings);
        this.f75815t = textView3;
        this.f75816u = inflate.findViewById(R.id.share_settings_group);
        this.f75817v = inflate.findViewById(R.id.block_touch);
        this.f75818w = (ToastLoadingView) inflate.findViewById(R.id.toast_loading);
        this.f75819x = (CalendarLoadingView) inflate.findViewById(R.id.calendar_create_loading_view);
        this.f75820y = new View$OnClickListenerC30278a(this);
        View findViewById = inflate.findViewById(R.id.status_bar_space);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById<View>(R.id.status_bar_space)");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = StatusBarUtil.getStatusBarHeight(context);
        }
        Intrinsics.checkExpressionValueIsNotNull(imageView, "calCover");
        an.m125210a(imageView, Integer.valueOf(C32659l.m125335a((Number) 8)));
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "selfAvatar");
        an.m125209a(imageView2);
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        CalendarEditView bVar = this;
        titledTextInput.mo113335a(new SpannableStringBuilder(context.getString(R.string.Calendar_Setting_CalendarTitle)).append(" *", new ForegroundColorSpan(UDColorUtils.getColor(context, R.color.function_danger_500)), 33)).mo113339b(context.getString(R.string.Calendar_Setting_AddCalendarTitle)).mo113334a(100, 90).mo113336a(bVar);
        titledTextInput2.mo113335a(context.getString(R.string.Calendar_Detail_CalendarAlias)).mo113339b(context.getString(R.string.Calendar_NewContacts_EditAlias)).mo113334a(100, 90).mo113336a(bVar);
        titledTextInput3.mo113335a(context.getString(R.string.Calendar_Setting_CalendarDescription)).mo113339b(context.getString(R.string.Calendar_Edit_DescriptionTitle)).mo113334a(250, 240).mo113336a(bVar);
        CalendarEditView bVar2 = this;
        textView.setOnClickListener(bVar2);
        textView2.setOnClickListener(bVar2);
        textView3.setOnClickListener(bVar2);
        commonTitleBar.setLeftImageDrawable(null);
        commonTitleBar.setLeftText(R.string.Calendar_Common_Cancel);
        commonTitleBar.setLeftClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.edit.fragment.CalendarEditView.View$OnClickListenerC302771 */

            /* renamed from: a */
            final /* synthetic */ CalendarEditView f75822a;

            {
                this.f75822a = r1;
            }

            public final void onClick(View view) {
                an.m125214b(this.f75822a.mo109366a());
                Activity activityFromView = UIUtils.getActivityFromView(view);
                if (activityFromView != null) {
                    activityFromView.onBackPressed();
                }
            }
        });
    }
}
