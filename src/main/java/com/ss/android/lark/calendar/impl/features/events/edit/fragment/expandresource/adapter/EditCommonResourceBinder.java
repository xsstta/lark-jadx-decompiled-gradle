package com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32060a;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32066d;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002JB\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J*\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder;", "", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "bindResource", "", "chosenMeetingRooms", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "meetingRoomData", "resourceBinderListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "hasApprovalRequest", "", "judgeIfShowRemoveApprovalMeetingRoomDialog", "eventTime", "", "showRemoveApprovalMeetingRoomDialog", "deleteIcon", "Landroid/widget/ImageView;", "updateMeetingRoomScheduleBt", "canEdit", "editScheduleTv", "Landroid/widget/TextView;", "editFormTipTv", "meetingNameContainer", "Landroid/widget/LinearLayout;", "needShowDisableFrom", "updateMeetingRoomText", "meetingRoomTextView", "resourceName", "", "unusableReasons", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "EditCommonResourceListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.a */
public final class EditCommonResourceBinder {

    /* renamed from: a */
    private final View f80461a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "", "getInstanceEndTime", "", "getUnusableMeetingRoom", "", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "isEditable", "", "isExternalEvent", "needShowDisableFrom", "onMeetingRoomDeleteClicked", "", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onMeetingRoomItemClicked", "calendarId", "onMtRoomScheduleClicked", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.a$a */
    public interface EditCommonResourceListener {
        /* renamed from: a */
        void mo114787a(CalendarEventAttendee calendarEventAttendee);

        /* renamed from: a */
        void mo114788a(String str);

        /* renamed from: a */
        void mo114789a(String str, SchemaExtraData.ResourceCustomization resourceCustomization);

        /* renamed from: a */
        boolean mo114790a();

        /* renamed from: b */
        Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo114791b();

        /* renamed from: c */
        boolean mo114792c();

        /* renamed from: d */
        boolean mo114793d();

        /* renamed from: e */
        long mo114794e();
    }

    public EditCommonResourceBinder(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f80461a = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.a$c */
    public static final class View$OnClickListenerC31659c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCommonResourceListener f80467a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventAttendee f80468b;

        View$OnClickListenerC31659c(EditCommonResourceListener aVar, CalendarEventAttendee calendarEventAttendee) {
            this.f80467a = aVar;
            this.f80468b = calendarEventAttendee;
        }

        public final void onClick(View view) {
            EditCommonResourceListener aVar = this.f80467a;
            String attendeeCalendarId = this.f80468b.getAttendeeCalendarId();
            if (attendeeCalendarId == null) {
                attendeeCalendarId = "";
            }
            aVar.mo114788a(attendeeCalendarId);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.a$e */
    public static final class View$OnClickListenerC31661e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCommonResourceListener f80471a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventAttendee f80472b;

        /* renamed from: c */
        final /* synthetic */ SchemaExtraData.ResourceCustomization f80473c;

        View$OnClickListenerC31661e(EditCommonResourceListener aVar, CalendarEventAttendee calendarEventAttendee, SchemaExtraData.ResourceCustomization resourceCustomization) {
            this.f80471a = aVar;
            this.f80472b = calendarEventAttendee;
            this.f80473c = resourceCustomization;
        }

        public final void onClick(View view) {
            EditCommonResourceListener aVar = this.f80471a;
            if (aVar != null) {
                String attendeeCalendarId = this.f80472b.getAttendeeCalendarId();
                if (attendeeCalendarId == null) {
                    attendeeCalendarId = "";
                }
                aVar.mo114789a(attendeeCalendarId, this.f80473c);
            }
        }
    }

    /* renamed from: a */
    private final boolean m119730a(CalendarEventAttendee calendarEventAttendee) {
        List<SchemaExtraData.BizData> bizDataList;
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
        if (schemaExtraData == null || (bizDataList = schemaExtraData.getBizDataList()) == null) {
            return false;
        }
        Iterator<T> it = bizDataList.iterator();
        while (it.hasNext()) {
            if (it.next().getType() == SchemaExtraData.Type.APPROVAL_REQUEST) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.a$b */
    public static final class View$OnClickListenerC31658b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditCommonResourceBinder f80462a;

        /* renamed from: b */
        final /* synthetic */ ImageView f80463b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f80464c;

        /* renamed from: d */
        final /* synthetic */ CalendarEventAttendee f80465d;

        /* renamed from: e */
        final /* synthetic */ EditCommonResourceListener f80466e;

        View$OnClickListenerC31658b(EditCommonResourceBinder aVar, ImageView imageView, ArrayList arrayList, CalendarEventAttendee calendarEventAttendee, EditCommonResourceListener aVar2) {
            this.f80462a = aVar;
            this.f80463b = imageView;
            this.f80464c = arrayList;
            this.f80465d = calendarEventAttendee;
            this.f80466e = aVar2;
        }

        public final void onClick(View view) {
            ImageView imageView = this.f80463b;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "deleteIcon");
            if (imageView.getTag() instanceof CalendarEventAttendee) {
                ArrayList arrayList = this.f80464c;
                ImageView imageView2 = this.f80463b;
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "deleteIcon");
                Object tag = imageView2.getTag();
                if (tag == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee");
                } else if (arrayList.contains((CalendarEventAttendee) tag)) {
                    if (this.f80462a.mo115337a(this.f80465d, this.f80466e.mo114794e())) {
                        EditCommonResourceBinder aVar = this.f80462a;
                        CalendarEventAttendee calendarEventAttendee = this.f80465d;
                        ImageView imageView3 = this.f80463b;
                        Intrinsics.checkExpressionValueIsNotNull(imageView3, "deleteIcon");
                        aVar.mo115335a(calendarEventAttendee, imageView3, this.f80466e);
                        return;
                    }
                    EditCommonResourceListener aVar2 = this.f80466e;
                    ImageView imageView4 = this.f80463b;
                    Intrinsics.checkExpressionValueIsNotNull(imageView4, "deleteIcon");
                    Object tag2 = imageView4.getTag();
                    if (tag2 != null) {
                        aVar2.mo114787a((CalendarEventAttendee) tag2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a.a$d */
    public static final class DialogInterface$OnClickListenerC31660d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f80469a;

        /* renamed from: b */
        final /* synthetic */ EditCommonResourceListener f80470b;

        DialogInterface$OnClickListenerC31660d(ImageView imageView, EditCommonResourceListener aVar) {
            this.f80469a = imageView;
            this.f80470b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditCommonResourceListener aVar;
            Object tag = this.f80469a.getTag();
            if (!(tag instanceof CalendarEventAttendee)) {
                tag = null;
            }
            CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) tag;
            if (calendarEventAttendee != null && (aVar = this.f80470b) != null) {
                aVar.mo114787a(calendarEventAttendee);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo115337a(CalendarEventAttendee calendarEventAttendee, long j) {
        if (!SchemaHelper.f83746a.mo120312a(calendarEventAttendee.getSchemaCollection()) || !m119730a(calendarEventAttendee)) {
            return false;
        }
        CalendarDate calendarDate = CalendarDate.getCalendarDate(j * ((long) 1000));
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "CalendarDate.getCalendarDate(eventTime * 1000)");
        if (calendarDate.getTimeInMilliSeconds() <= new CalendarDate().getTimeInMilliSeconds() || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.DECLINE) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo115335a(CalendarEventAttendee calendarEventAttendee, ImageView imageView, EditCommonResourceListener aVar) {
        String str;
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.ACCEPT) {
            str = C32634ae.m125182b(R.string.Calendar_Approval_DeleteSucceed);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…r_Approval_DeleteSucceed)");
        } else {
            str = C32634ae.m125182b(R.string.Calendar_Approval_DeleteInReview);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…_Approval_DeleteInReview)");
        }
        Context context = imageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).message(str)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31660d(imageView, aVar))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageGravity(3)).show();
    }

    /* renamed from: a */
    public final void mo115336a(ArrayList<CalendarEventAttendee> arrayList, CalendarEventAttendee calendarEventAttendee, EditCommonResourceListener aVar) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        GetUnusableMeetingRoomsResponse.UnusableReasons unusableReasons;
        Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRooms");
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoomData");
        Intrinsics.checkParameterIsNotNull(aVar, "resourceBinderListener");
        TextView textView = (TextView) this.f80461a.findViewById(R.id.tv_event_boardroom_name);
        TextView textView2 = (TextView) this.f80461a.findViewById(R.id.tv_disabled_icon);
        TextView textView3 = (TextView) this.f80461a.findViewById(R.id.editMtRoomScheduleTv);
        TextView textView4 = (TextView) this.f80461a.findViewById(R.id.editFormTipTv);
        LinearLayout linearLayout = (LinearLayout) this.f80461a.findViewById(R.id.meetingNameContainer);
        boolean d = aVar.mo114793d();
        boolean a = aVar.mo114790a();
        Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> b = aVar.mo114791b();
        boolean c = aVar.mo114792c();
        if (d || ((!calendarEventAttendee.isEditable() && !calendarEventAttendee.isDeletable()) || !a)) {
            z = false;
        } else {
            z = true;
        }
        if (textView != null) {
            String a2 = C32060a.m121939a(calendarEventAttendee);
            if (a2 == null) {
                a2 = "";
            }
            if (b != null) {
                unusableReasons = b.get(calendarEventAttendee.getAttendeeCalendarId());
            } else {
                unusableReasons = null;
            }
            m119728a(textView, z, a2, unusableReasons);
        }
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvDisabledLabel");
        if (calendarEventAttendee.isDisabled()) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        ImageView imageView = (ImageView) this.f80461a.findViewById(R.id.iv_boardroom_delete_icon);
        ViewGroup viewGroup = (ViewGroup) this.f80461a.findViewById(R.id.ll_delete_container);
        if (z) {
            Intrinsics.checkExpressionValueIsNotNull(imageView, "deleteIcon");
            imageView.setTag(calendarEventAttendee);
            z3 = c;
            i2 = 8;
            z2 = z;
            viewGroup.setOnClickListener(new View$OnClickListenerC31658b(this, imageView, arrayList, calendarEventAttendee, aVar));
        } else {
            z2 = z;
            z3 = c;
            i2 = 8;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "deleteContainer");
            viewGroup.setVisibility(8);
        }
        TextView textView5 = (TextView) this.f80461a.findViewById(R.id.tv_need_approval);
        if (!SchemaHelper.f83746a.mo120314b(calendarEventAttendee.getSchemaCollection()) || textView2.getVisibility() != i2) {
            Intrinsics.checkExpressionValueIsNotNull(textView5, "approval");
            textView5.setVisibility(i2);
        } else {
            Intrinsics.checkExpressionValueIsNotNull(textView5, "approval");
            textView5.setVisibility(0);
        }
        textView.setOnClickListener(new View$OnClickListenerC31659c(aVar, calendarEventAttendee));
        Intrinsics.checkExpressionValueIsNotNull(textView3, "editScheduleTv");
        Intrinsics.checkExpressionValueIsNotNull(textView4, "editFormTipTv");
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "meetingNameContainer");
        m119729a(z2, calendarEventAttendee, textView3, textView4, linearLayout, z3, aVar);
    }

    /* renamed from: a */
    private final void m119728a(TextView textView, boolean z, String str, GetUnusableMeetingRoomsResponse.UnusableReasons unusableReasons) {
        boolean z2;
        List<GetUnusableMeetingRoomsResponse.UnusableReason> list;
        String str2 = str;
        boolean z3 = true;
        if (str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (z) {
                if (unusableReasons != null) {
                    list = unusableReasons.unusable_reasons;
                } else {
                    list = null;
                }
                List<GetUnusableMeetingRoomsResponse.UnusableReason> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z3 = false;
                }
                if (z3) {
                    textView.setText(str2);
                    textView.setTextColor(C32634ae.m125178a(R.color.text_title));
                    return;
                }
            }
            if (!z) {
                textView.setText(str2);
                textView.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
                return;
            }
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            textView.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
        }
    }

    /* renamed from: a */
    private final void m119729a(boolean z, CalendarEventAttendee calendarEventAttendee, TextView textView, TextView textView2, LinearLayout linearLayout, boolean z2, EditCommonResourceListener aVar) {
        String str;
        SchemaExtraData.ResourceCustomization a = C32066d.m121954a(calendarEventAttendee);
        if (!z || a == null) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), UIHelper.dp2px(16.0f));
            textView.setOnClickListener(null);
            return;
        }
        if (!z2 || !MeetingRoomFormHelper.f82028a.mo117088b(a)) {
            textView2.setVisibility(8);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), UIHelper.dp2px(16.0f));
        } else {
            textView2.setVisibility(0);
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        }
        textView.setVisibility(0);
        if (MeetingRoomFormHelper.f82028a.mo117086a(a)) {
            str = C32634ae.m125182b(R.string.Calendar_MeetingRoom_FillInReservationForm);
        } else {
            str = C32634ae.m125182b(R.string.Calendar_MeetingRoom_EditReservationForm);
        }
        textView.setText(str);
        textView.setOnClickListener(new View$OnClickListenerC31661e(aVar, calendarEventAttendee, a));
    }
}
