package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomApprovalHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001e0\u0010H\u0002J\u0016\u0010\u001f\u001a\u00020\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001eH\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001bJ\b\u0010%\u001a\u00020\u0017H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\nH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog$MeetingRoomApprovalDelegate;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog$MeetingRoomApprovalDelegate;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog$MeetingRoomApprovalDelegate;", "mIsFromView", "", "getMIsFromView$calendar_impl_release", "()Z", "setMIsFromView$calendar_impl_release", "(Z)V", "mMeetingRoomApprovalList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getMMeetingRoomApprovalList$calendar_impl_release", "()Ljava/util/List;", "setMMeetingRoomApprovalList$calendar_impl_release", "(Ljava/util/List;)V", "createMeetingRoomView", "", "formatMeetingRoomView", "Landroid/view/View;", "meetingRoomName", "", "meetingRoomData", "getConditionGroupApprovalList", "", "getSameConditionResourceName", "meetingRoomList", "initListener", "initView", "show", "reason", "showKeyBoard", "updateApprovalReason", "updateTitle", "isFromView", "Companion", "MeetingRoomApprovalDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a */
public final class MeetingRoomApprovalDialog extends BaseDialog {

    /* renamed from: a */
    public static final Companion f81388a = new Companion(null);

    /* renamed from: b */
    private List<? extends CalendarEventAttendee> f81389b = new ArrayList();

    /* renamed from: c */
    private boolean f81390c;

    /* renamed from: d */
    private final MeetingRoomApprovalDelegate f81391d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog$MeetingRoomApprovalDelegate;", "", "onCancelClick", "", "reason", "", "onConfirmClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$b */
    public interface MeetingRoomApprovalDelegate {
        /* renamed from: a */
        void mo116441a(String str);

        /* renamed from: b */
        void mo116442b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog$Companion;", "", "()V", "MEETING_ROOM_LIMIT", "", "MEETING_ROOM_MARGIN_START", "", "MEETING_ROOM_MARGIN_TOP", "MEETING_ROOM_MAX_LINE", "MEETING_ROOM_TEXT_SIZE", "MEETING_ROOM_USE_DESCRIPTION_MINI_HEIGHT", "ONE_HOUR_SECOND", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final MeetingRoomApprovalDelegate mo116440c() {
        return this.f81391d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/widget/MeetingRoomApprovalDialog$initListener$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$e */
    public static final class C31892e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomApprovalDialog f81394a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$e$a */
        static final class RunnableC31893a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C31892e f81395a;

            RunnableC31893a(C31892e eVar) {
                this.f81395a = eVar;
            }

            public final void run() {
                ((TextView) this.f81395a.f81394a.findViewById(R.id.tv_save)).setTextColor(C32634ae.m125178a(R.color.primary_pri_200));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$e$b */
        static final class RunnableC31894b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C31892e f81396a;

            RunnableC31894b(C31892e eVar) {
                this.f81396a = eVar;
            }

            public final void run() {
                ((TextView) this.f81396a.f81394a.findViewById(R.id.tv_save)).setTextColor(C32634ae.m125178a(R.color.primary_pri_500));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31892e(MeetingRoomApprovalDialog aVar) {
            this.f81394a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                ((TextView) this.f81394a.findViewById(R.id.tv_save)).post(new RunnableC31893a(this));
                TextView textView = (TextView) this.f81394a.findViewById(R.id.tv_save);
                Intrinsics.checkExpressionValueIsNotNull(textView, "tv_save");
                textView.setClickable(false);
                return;
            }
            ((TextView) this.f81394a.findViewById(R.id.tv_save)).post(new RunnableC31894b(this));
            TextView textView2 = (TextView) this.f81394a.findViewById(R.id.tv_save);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_save");
            textView2.setClickable(true);
        }
    }

    /* renamed from: g */
    private final void m121330g() {
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
        ((EditText) findViewById(R.id.meeting_room_use_description_container)).requestFocus();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$f */
    public static final class RunnableC31895f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomApprovalDialog f81397a;

        RunnableC31895f(MeetingRoomApprovalDialog aVar) {
            this.f81397a = aVar;
        }

        public final void run() {
            int i;
            TextView textView = (TextView) this.f81397a.findViewById(R.id.tv_title);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tv_title");
            TextView textView2 = (TextView) this.f81397a.findViewById(R.id.tv_title);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_title");
            if (textView2.getLineCount() <= 1) {
                i = 17;
            } else {
                i = 8388611;
            }
            textView.setGravity(i);
        }
    }

    /* renamed from: e */
    private final void m121328e() {
        setContentView(R.layout.meeting_room_approval);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        TextView textView = (TextView) findViewById(R.id.tv_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_title");
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "tv_title.paint");
        paint.setFakeBoldText(true);
        ((TextView) findViewById(R.id.tv_title)).post(new RunnableC31895f(this));
    }

    /* renamed from: f */
    private final void m121329f() {
        ((TextView) findViewById(R.id.tv_continue_edit)).setOnClickListener(new View$OnClickListenerC31890c(this));
        ((TextView) findViewById(R.id.tv_save)).setOnClickListener(new View$OnClickListenerC31891d(this));
        ((EditText) findViewById(R.id.meeting_room_use_description_container)).addTextChangedListener(new C31892e(this));
    }

    /* renamed from: d */
    private final List<List<CalendarEventAttendee>> m121327d() {
        Long l;
        SchemaExtraData.ApprovalTrigger a;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CalendarEventAttendee calendarEventAttendee : this.f81389b) {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
            if (schemaExtraData == null || (a = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData)) == null) {
                l = null;
            } else {
                l = a.duration_trigger;
            }
            if (l == null) {
                arrayList.add(CollectionsKt.mutableListOf(calendarEventAttendee));
            } else {
                List list = (List) linkedHashMap.get(l);
                if (list != null) {
                    list.add(calendarEventAttendee);
                } else {
                    List mutableListOf = CollectionsKt.mutableListOf(calendarEventAttendee);
                    linkedHashMap.put(l, mutableListOf);
                    arrayList.add(mutableListOf);
                }
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    /* renamed from: b */
    public final void mo116439b() {
        for (CalendarEventAttendee calendarEventAttendee : this.f81389b) {
            if (calendarEventAttendee.isResource() && SchemaHelper.f83746a.mo120312a(calendarEventAttendee.getSchemaCollection())) {
                if (calendarEventAttendee.getSchemaExtraData() == null) {
                    calendarEventAttendee.setSchemaExtraData(new com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData());
                }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
                if (schemaExtraData != null) {
                    List<SchemaExtraData.BizData> bizDataList = schemaExtraData.getBizDataList();
                    SchemaExtraData.BizData bizData = new SchemaExtraData.BizData();
                    bizData.setType(SchemaExtraData.Type.APPROVAL_REQUEST);
                    EditText editText = (EditText) findViewById(R.id.meeting_room_use_description_container);
                    Intrinsics.checkExpressionValueIsNotNull(editText, "meeting_room_use_description_container");
                    bizData.setReason(editText.getText().toString());
                    bizDataList.add(bizData);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo116435a() {
        for (List<CalendarEventAttendee> list : m121327d()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.meeting_room_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "meeting_room_container");
            if (linearLayout.getChildCount() + 1 == 3) {
                String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Plural_MeetingRoom, "number", String.valueOf(this.f81389b.size()));
                Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…ovalList.size.toString())");
                ((LinearLayout) findViewById(R.id.meeting_room_container)).addView(m121324a(a, null));
                return;
            }
            ((LinearLayout) findViewById(R.id.meeting_room_container)).addView(m121324a(m121325b(list), list.get(0)));
            LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.meeting_room_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "meeting_room_container");
            linearLayout2.setVisibility(0);
        }
        m121326b(this.f81390c);
    }

    /* renamed from: a */
    public final void mo116438a(boolean z) {
        this.f81390c = z;
    }

    /* renamed from: a */
    public final void mo116437a(List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f81389b = list;
    }

    /* renamed from: b */
    private final String m121325b(List<CalendarEventAttendee> list) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append("\n");
            }
            sb.append(t.getLocalizedDisplayName());
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "sameConditionResourceName.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final void mo116436a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reason");
        m121330g();
        ((EditText) findViewById(R.id.meeting_room_use_description_container)).setText(str);
        ((EditText) findViewById(R.id.meeting_room_use_description_container)).setSelection(str.length());
        show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$c */
    public static final class View$OnClickListenerC31890c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomApprovalDialog f81392a;

        View$OnClickListenerC31890c(MeetingRoomApprovalDialog aVar) {
            this.f81392a = aVar;
        }

        public final void onClick(View view) {
            IBinder iBinder;
            MeetingRoomApprovalDelegate c = this.f81392a.mo116440c();
            EditText editText = (EditText) this.f81392a.findViewById(R.id.meeting_room_use_description_container);
            Intrinsics.checkExpressionValueIsNotNull(editText, "meeting_room_use_description_container");
            c.mo116442b(editText.getText().toString());
            Object systemService = this.f81392a.getContext().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = this.f81392a.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                this.f81392a.dismiss();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.a$d */
    public static final class View$OnClickListenerC31891d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomApprovalDialog f81393a;

        View$OnClickListenerC31891d(MeetingRoomApprovalDialog aVar) {
            this.f81393a = aVar;
        }

        public final void onClick(View view) {
            IBinder iBinder;
            Object systemService = this.f81393a.getContext().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = this.f81393a.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                this.f81393a.dismiss();
                this.f81393a.mo116439b();
                MeetingRoomApprovalDelegate c = this.f81393a.mo116440c();
                EditText editText = (EditText) this.f81393a.findViewById(R.id.meeting_room_use_description_container);
                Intrinsics.checkExpressionValueIsNotNull(editText, "meeting_room_use_description_container");
                c.mo116441a(editText.getText().toString());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: b */
    private final void m121326b(boolean z) {
        T t;
        boolean z2;
        T t2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        Iterator<T> it = this.f81389b.iterator();
        while (true) {
            t = null;
            z2 = false;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            T t3 = t2;
            if (t3.getStatus() != CalendarEventAttendee.Status.ACCEPT || !MeetingRoomApprovalHelper.f79933a.mo114618b(t3.getSchemaExtraData())) {
                z5 = true;
                continue;
            } else {
                z5 = false;
                continue;
            }
            if (z5) {
                break;
            }
        }
        if (t2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Iterator<T> it2 = this.f81389b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            T t4 = next;
            if (t4.getStatus() != CalendarEventAttendee.Status.DECLINE || !MeetingRoomApprovalHelper.f79933a.mo114618b(t4.getSchemaExtraData())) {
                z4 = true;
                continue;
            } else {
                z4 = false;
                continue;
            }
            if (z4) {
                t = next;
                break;
            }
        }
        if (t == null) {
            z2 = true;
        }
        if (z && z3) {
            str = C32634ae.m125182b(R.string.Calendar_Rooms_ReservedChangeTime);
        } else if (z && z2) {
            str = C32634ae.m125180a(R.plurals.Calendar_Rooms_ApplicationRecall, this.f81389b.size());
        } else if (z) {
            str = C32634ae.m125182b(R.string.Calendar_Approval_DragChange);
        } else {
            str = C32634ae.m125182b(R.string.Calendar_Approval_PopUpTitle);
        }
        TextView textView = (TextView) findViewById(R.id.tv_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_title");
        textView.setGravity(8388611);
        TextView textView2 = (TextView) findViewById(R.id.tv_title);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tv_title");
        textView2.setText(str);
        ((TextView) findViewById(R.id.tv_title)).requestLayout();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomApprovalDialog(Context context, MeetingRoomApprovalDelegate bVar) {
        super(context, R.style.MeetingRoomApprovalDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f81391d = bVar;
        m121328e();
        m121329f();
    }

    /* renamed from: a */
    private final View m121324a(String str, CalendarEventAttendee calendarEventAttendee) {
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData;
        SchemaExtraData.ApprovalTrigger a;
        Long l = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.calendar_approval_reosurce_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.resourceNameTv);
        TextView textView2 = (TextView) inflate.findViewById(R.id.resourceTipTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "resourceNameTv");
        textView.setText(str);
        if (!(calendarEventAttendee == null || (schemaExtraData = calendarEventAttendee.getSchemaExtraData()) == null || (a = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData)) == null)) {
            l = a.duration_trigger;
        }
        if (l != null) {
            textView2.setVisibility(0);
            textView2.setText(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_OverReserveTimeApprove, "num", String.valueOf((int) (l.longValue() / ((long) 3600)))));
        } else {
            Intrinsics.checkExpressionValueIsNotNull(textView2, "resourceTipTv");
            textView2.setVisibility(8);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = C57582a.m223601a(getContext(), 20.0f);
        layoutParams.rightMargin = C57582a.m223601a(getContext(), 20.0f);
        layoutParams.topMargin = C57582a.m223601a(getContext(), 12.0f);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "meetingRoomContent");
        inflate.setLayoutParams(layoutParams);
        return inflate;
    }
}
