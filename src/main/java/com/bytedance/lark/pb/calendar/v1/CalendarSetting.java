package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.SkinSetting;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CalendarSetting extends Message<CalendarSetting, C15564a> {
    public static final ProtoAdapter<CalendarSetting> ADAPTER = new C15565b();
    public static final AlternateCalendar DEFAULT_ALTERNATE_CALENDAR = AlternateCalendar.NONE_CALENDAR;
    public static final Boolean DEFAULT_BIND_GOOGLE_CALENDAR = false;
    public static final Integer DEFAULT_DEFAULT_ALL_DAY_REMINDER = -480;
    public static final Integer DEFAULT_DEFAULT_EVENT_DURATION_V2 = 60;
    public static final Integer DEFAULT_DEFAULT_NONE_ALL_DAY_REMINDER = 5;
    public static final Boolean DEFAULT_ENABLE_SYSTEM_TIMEZONE = true;
    public static final Boolean DEFAULT_HAS_USABLE_EMAIL_TO_INVITE_EMAIL_ATTENDEE = false;
    public static final Boolean DEFAULT_HIDE_BINDING_GOOGLE_CALENDAR = false;
    public static final Boolean DEFAULT_NOTIFY_WHEN_GUESTS_DECLINE = false;
    public static final Boolean DEFAULT_REMIND_ACCEPT_ONLY = false;
    public static final Boolean DEFAULT_SHOW_OTHER_TIMEZONE = false;
    public static final Boolean DEFAULT_SHOW_PAST_EVENTS_MASK = true;
    public static final Boolean DEFAULT_SHOW_PAST_EVENTS_MASK_ANDROID = true;
    public static final Boolean DEFAULT_SHOW_PAST_EVENTS_MASK_IOS = true;
    public static final Boolean DEFAULT_SHOW_PAST_EVENTS_MASK_PC = true;
    public static final Boolean DEFAULT_SHOW_REJECTED_SCHEDULE = true;
    public static final Boolean DEFAULT_SHOW_TODAY_VIEW = true;
    public static final SkinSetting.SkinType DEFAULT_SKIN_TYPE = SkinSetting.SkinType.LIGHT;
    public static final SkinSetting.SkinType DEFAULT_SKIN_TYPE_ANDROID = SkinSetting.SkinType.LIGHT;
    public static final SkinSetting.SkinType DEFAULT_SKIN_TYPE_IOS = SkinSetting.SkinType.LIGHT;
    public static final SkinSetting.SkinType DEFAULT_SKIN_TYPE_PC = SkinSetting.SkinType.LIGHT;
    public static final Boolean DEFAULT_SUMMER_TIME_ALERT = true;
    public static final Boolean DEFAULT_USE_SYSTEM_TIMEZONE_IN_MOBILE_NORMAL_VIEW = true;
    public static final DayOfWeek DEFAULT_WEEK_START_DAY = DayOfWeek.SUNDAY;
    private static final long serialVersionUID = 0;
    public final AlternateCalendar alternate_calendar;
    public final Boolean bind_google_calendar;
    public final CalendarSettingConfig calendar_setting_config;
    public final Integer default_all_day_reminder;
    public final Integer default_event_duration_v2;
    public final Integer default_none_all_day_reminder;
    public final String email_attendee_invitation_email;
    public final Boolean enable_system_timezone;
    public final String google_calendar_email;
    public final Boolean has_usable_email_to_invite_email_attendee;
    public final Boolean hide_binding_google_calendar;
    public final String mobile_normal_view_timezone;
    public final Boolean notify_when_guests_decline;
    public final List<String> other_timezones;
    public final Boolean remind_accept_only;
    public final Boolean show_other_timezone;
    public final Boolean show_past_events_mask;
    public final Boolean show_past_events_mask_android;
    public final Boolean show_past_events_mask_ios;
    public final Boolean show_past_events_mask_pc;
    public final Boolean show_rejected_schedule;
    public final Boolean show_today_view;
    public final SkinSetting.SkinType skin_type;
    public final SkinSetting.SkinType skin_type_android;
    public final SkinSetting.SkinType skin_type_ios;
    public final SkinSetting.SkinType skin_type_pc;
    public final Boolean summer_time_alert;
    public final String timezone;
    public final Boolean use_system_timezone_in_mobile_normal_view;
    public final DayOfWeek week_start_day;
    public final WorkHourSetting work_hour_setting;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSetting$b */
    private static final class C15565b extends ProtoAdapter<CalendarSetting> {
        C15565b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarSetting calendarSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30 = 0;
            if (calendarSetting.default_event_duration_v2 != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, calendarSetting.default_event_duration_v2);
            } else {
                i = 0;
            }
            if (calendarSetting.show_rejected_schedule != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, calendarSetting.show_rejected_schedule);
            } else {
                i2 = 0;
            }
            int i31 = i + i2;
            if (calendarSetting.default_all_day_reminder != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, calendarSetting.default_all_day_reminder);
            } else {
                i3 = 0;
            }
            int i32 = i31 + i3;
            if (calendarSetting.default_none_all_day_reminder != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, calendarSetting.default_none_all_day_reminder);
            } else {
                i4 = 0;
            }
            int i33 = i32 + i4;
            if (calendarSetting.bind_google_calendar != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, calendarSetting.bind_google_calendar);
            } else {
                i5 = 0;
            }
            int i34 = i33 + i5;
            if (calendarSetting.remind_accept_only != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, calendarSetting.remind_accept_only);
            } else {
                i6 = 0;
            }
            int i35 = i34 + i6;
            if (calendarSetting.notify_when_guests_decline != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, calendarSetting.notify_when_guests_decline);
            } else {
                i7 = 0;
            }
            int i36 = i35 + i7;
            if (calendarSetting.show_past_events_mask != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, calendarSetting.show_past_events_mask);
            } else {
                i8 = 0;
            }
            int i37 = i36 + i8;
            if (calendarSetting.skin_type != null) {
                i9 = SkinSetting.SkinType.ADAPTER.encodedSizeWithTag(9, calendarSetting.skin_type);
            } else {
                i9 = 0;
            }
            int i38 = i37 + i9;
            if (calendarSetting.timezone != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(10, calendarSetting.timezone);
            } else {
                i10 = 0;
            }
            int i39 = i38 + i10;
            if (calendarSetting.show_past_events_mask_pc != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(11, calendarSetting.show_past_events_mask_pc);
            } else {
                i11 = 0;
            }
            int i40 = i39 + i11;
            if (calendarSetting.skin_type_pc != null) {
                i12 = SkinSetting.SkinType.ADAPTER.encodedSizeWithTag(12, calendarSetting.skin_type_pc);
            } else {
                i12 = 0;
            }
            int i41 = i40 + i12;
            if (calendarSetting.show_past_events_mask_android != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(13, calendarSetting.show_past_events_mask_android);
            } else {
                i13 = 0;
            }
            int i42 = i41 + i13;
            if (calendarSetting.skin_type_android != null) {
                i14 = SkinSetting.SkinType.ADAPTER.encodedSizeWithTag(14, calendarSetting.skin_type_android);
            } else {
                i14 = 0;
            }
            int i43 = i42 + i14;
            if (calendarSetting.show_past_events_mask_ios != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(15, calendarSetting.show_past_events_mask_ios);
            } else {
                i15 = 0;
            }
            int i44 = i43 + i15;
            if (calendarSetting.skin_type_ios != null) {
                i16 = SkinSetting.SkinType.ADAPTER.encodedSizeWithTag(16, calendarSetting.skin_type_ios);
            } else {
                i16 = 0;
            }
            int i45 = i44 + i16;
            if (calendarSetting.week_start_day != null) {
                i17 = DayOfWeek.ADAPTER.encodedSizeWithTag(17, calendarSetting.week_start_day);
            } else {
                i17 = 0;
            }
            int i46 = i45 + i17;
            if (calendarSetting.google_calendar_email != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(18, calendarSetting.google_calendar_email);
            } else {
                i18 = 0;
            }
            int i47 = i46 + i18;
            if (calendarSetting.show_other_timezone != null) {
                i19 = ProtoAdapter.BOOL.encodedSizeWithTag(19, calendarSetting.show_other_timezone);
            } else {
                i19 = 0;
            }
            int encodedSizeWithTag = i47 + i19 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(20, calendarSetting.other_timezones);
            if (calendarSetting.hide_binding_google_calendar != null) {
                i20 = ProtoAdapter.BOOL.encodedSizeWithTag(21, calendarSetting.hide_binding_google_calendar);
            } else {
                i20 = 0;
            }
            int i48 = encodedSizeWithTag + i20;
            if (calendarSetting.summer_time_alert != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(22, calendarSetting.summer_time_alert);
            } else {
                i21 = 0;
            }
            int i49 = i48 + i21;
            if (calendarSetting.enable_system_timezone != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(23, calendarSetting.enable_system_timezone);
            } else {
                i22 = 0;
            }
            int i50 = i49 + i22;
            if (calendarSetting.work_hour_setting != null) {
                i23 = WorkHourSetting.ADAPTER.encodedSizeWithTag(24, calendarSetting.work_hour_setting);
            } else {
                i23 = 0;
            }
            int i51 = i50 + i23;
            if (calendarSetting.show_today_view != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(25, calendarSetting.show_today_view);
            } else {
                i24 = 0;
            }
            int i52 = i51 + i24;
            if (calendarSetting.email_attendee_invitation_email != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(26, calendarSetting.email_attendee_invitation_email);
            } else {
                i25 = 0;
            }
            int i53 = i52 + i25;
            if (calendarSetting.has_usable_email_to_invite_email_attendee != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(27, calendarSetting.has_usable_email_to_invite_email_attendee);
            } else {
                i26 = 0;
            }
            int i54 = i53 + i26;
            if (calendarSetting.mobile_normal_view_timezone != null) {
                i27 = ProtoAdapter.STRING.encodedSizeWithTag(28, calendarSetting.mobile_normal_view_timezone);
            } else {
                i27 = 0;
            }
            int i55 = i54 + i27;
            if (calendarSetting.alternate_calendar != null) {
                i28 = AlternateCalendar.ADAPTER.encodedSizeWithTag(29, calendarSetting.alternate_calendar);
            } else {
                i28 = 0;
            }
            int i56 = i55 + i28;
            if (calendarSetting.calendar_setting_config != null) {
                i29 = CalendarSettingConfig.ADAPTER.encodedSizeWithTag(30, calendarSetting.calendar_setting_config);
            } else {
                i29 = 0;
            }
            int i57 = i56 + i29;
            if (calendarSetting.use_system_timezone_in_mobile_normal_view != null) {
                i30 = ProtoAdapter.BOOL.encodedSizeWithTag(31, calendarSetting.use_system_timezone_in_mobile_normal_view);
            }
            return i57 + i30 + calendarSetting.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarSetting decode(ProtoReader protoReader) throws IOException {
            C15564a aVar = new C15564a();
            aVar.f41272a = 60;
            aVar.f41273b = true;
            aVar.f41274c = -480;
            aVar.f41275d = 5;
            aVar.f41276e = false;
            aVar.f41277f = false;
            aVar.f41278g = false;
            aVar.f41279h = true;
            aVar.f41280i = SkinSetting.SkinType.LIGHT;
            aVar.f41281j = "";
            aVar.f41282k = true;
            aVar.f41283l = SkinSetting.SkinType.LIGHT;
            aVar.f41284m = true;
            aVar.f41285n = SkinSetting.SkinType.LIGHT;
            aVar.f41286o = true;
            aVar.f41287p = SkinSetting.SkinType.LIGHT;
            aVar.f41288q = DayOfWeek.SUNDAY;
            aVar.f41289r = "";
            aVar.f41290s = false;
            aVar.f41292u = false;
            aVar.f41293v = true;
            aVar.f41294w = true;
            aVar.f41296y = true;
            aVar.f41297z = "";
            aVar.f41267A = false;
            aVar.f41268B = "";
            aVar.f41269C = AlternateCalendar.NONE_CALENDAR;
            aVar.f41271E = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41272a = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41273b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41274c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41275d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41276e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41277f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41278g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41279h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f41280i = SkinSetting.SkinType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f41281j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41282k = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f41283l = SkinSetting.SkinType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 13:
                            aVar.f41284m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f41285n = SkinSetting.SkinType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 15:
                            aVar.f41286o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            try {
                                aVar.f41287p = SkinSetting.SkinType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 17:
                            try {
                                aVar.f41288q = DayOfWeek.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 18:
                            aVar.f41289r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f41290s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f41291t.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 21:
                            aVar.f41292u = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            aVar.f41293v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f41294w = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 24:
                            aVar.f41295x = WorkHourSetting.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f41296y = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            aVar.f41297z = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f41267A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f41268B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            try {
                                aVar.f41269C = AlternateCalendar.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 30:
                            aVar.f41270D = CalendarSettingConfig.ADAPTER.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f41271E = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarSetting calendarSetting) throws IOException {
            if (calendarSetting.default_event_duration_v2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, calendarSetting.default_event_duration_v2);
            }
            if (calendarSetting.show_rejected_schedule != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, calendarSetting.show_rejected_schedule);
            }
            if (calendarSetting.default_all_day_reminder != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, calendarSetting.default_all_day_reminder);
            }
            if (calendarSetting.default_none_all_day_reminder != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, calendarSetting.default_none_all_day_reminder);
            }
            if (calendarSetting.bind_google_calendar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, calendarSetting.bind_google_calendar);
            }
            if (calendarSetting.remind_accept_only != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, calendarSetting.remind_accept_only);
            }
            if (calendarSetting.notify_when_guests_decline != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, calendarSetting.notify_when_guests_decline);
            }
            if (calendarSetting.show_past_events_mask != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, calendarSetting.show_past_events_mask);
            }
            if (calendarSetting.skin_type != null) {
                SkinSetting.SkinType.ADAPTER.encodeWithTag(protoWriter, 9, calendarSetting.skin_type);
            }
            if (calendarSetting.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, calendarSetting.timezone);
            }
            if (calendarSetting.show_past_events_mask_pc != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, calendarSetting.show_past_events_mask_pc);
            }
            if (calendarSetting.skin_type_pc != null) {
                SkinSetting.SkinType.ADAPTER.encodeWithTag(protoWriter, 12, calendarSetting.skin_type_pc);
            }
            if (calendarSetting.show_past_events_mask_android != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, calendarSetting.show_past_events_mask_android);
            }
            if (calendarSetting.skin_type_android != null) {
                SkinSetting.SkinType.ADAPTER.encodeWithTag(protoWriter, 14, calendarSetting.skin_type_android);
            }
            if (calendarSetting.show_past_events_mask_ios != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, calendarSetting.show_past_events_mask_ios);
            }
            if (calendarSetting.skin_type_ios != null) {
                SkinSetting.SkinType.ADAPTER.encodeWithTag(protoWriter, 16, calendarSetting.skin_type_ios);
            }
            if (calendarSetting.week_start_day != null) {
                DayOfWeek.ADAPTER.encodeWithTag(protoWriter, 17, calendarSetting.week_start_day);
            }
            if (calendarSetting.google_calendar_email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, calendarSetting.google_calendar_email);
            }
            if (calendarSetting.show_other_timezone != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, calendarSetting.show_other_timezone);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 20, calendarSetting.other_timezones);
            if (calendarSetting.hide_binding_google_calendar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 21, calendarSetting.hide_binding_google_calendar);
            }
            if (calendarSetting.summer_time_alert != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, calendarSetting.summer_time_alert);
            }
            if (calendarSetting.enable_system_timezone != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, calendarSetting.enable_system_timezone);
            }
            if (calendarSetting.work_hour_setting != null) {
                WorkHourSetting.ADAPTER.encodeWithTag(protoWriter, 24, calendarSetting.work_hour_setting);
            }
            if (calendarSetting.show_today_view != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, calendarSetting.show_today_view);
            }
            if (calendarSetting.email_attendee_invitation_email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 26, calendarSetting.email_attendee_invitation_email);
            }
            if (calendarSetting.has_usable_email_to_invite_email_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, calendarSetting.has_usable_email_to_invite_email_attendee);
            }
            if (calendarSetting.mobile_normal_view_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, calendarSetting.mobile_normal_view_timezone);
            }
            if (calendarSetting.alternate_calendar != null) {
                AlternateCalendar.ADAPTER.encodeWithTag(protoWriter, 29, calendarSetting.alternate_calendar);
            }
            if (calendarSetting.calendar_setting_config != null) {
                CalendarSettingConfig.ADAPTER.encodeWithTag(protoWriter, 30, calendarSetting.calendar_setting_config);
            }
            if (calendarSetting.use_system_timezone_in_mobile_normal_view != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, calendarSetting.use_system_timezone_in_mobile_normal_view);
            }
            protoWriter.writeBytes(calendarSetting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15564a newBuilder() {
        C15564a aVar = new C15564a();
        aVar.f41272a = this.default_event_duration_v2;
        aVar.f41273b = this.show_rejected_schedule;
        aVar.f41274c = this.default_all_day_reminder;
        aVar.f41275d = this.default_none_all_day_reminder;
        aVar.f41276e = this.bind_google_calendar;
        aVar.f41277f = this.remind_accept_only;
        aVar.f41278g = this.notify_when_guests_decline;
        aVar.f41279h = this.show_past_events_mask;
        aVar.f41280i = this.skin_type;
        aVar.f41281j = this.timezone;
        aVar.f41282k = this.show_past_events_mask_pc;
        aVar.f41283l = this.skin_type_pc;
        aVar.f41284m = this.show_past_events_mask_android;
        aVar.f41285n = this.skin_type_android;
        aVar.f41286o = this.show_past_events_mask_ios;
        aVar.f41287p = this.skin_type_ios;
        aVar.f41288q = this.week_start_day;
        aVar.f41289r = this.google_calendar_email;
        aVar.f41290s = this.show_other_timezone;
        aVar.f41291t = Internal.copyOf("other_timezones", this.other_timezones);
        aVar.f41292u = this.hide_binding_google_calendar;
        aVar.f41293v = this.summer_time_alert;
        aVar.f41294w = this.enable_system_timezone;
        aVar.f41295x = this.work_hour_setting;
        aVar.f41296y = this.show_today_view;
        aVar.f41297z = this.email_attendee_invitation_email;
        aVar.f41267A = this.has_usable_email_to_invite_email_attendee;
        aVar.f41268B = this.mobile_normal_view_timezone;
        aVar.f41269C = this.alternate_calendar;
        aVar.f41270D = this.calendar_setting_config;
        aVar.f41271E = this.use_system_timezone_in_mobile_normal_view;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSetting$a */
    public static final class C15564a extends Message.Builder<CalendarSetting, C15564a> {

        /* renamed from: A */
        public Boolean f41267A;

        /* renamed from: B */
        public String f41268B;

        /* renamed from: C */
        public AlternateCalendar f41269C;

        /* renamed from: D */
        public CalendarSettingConfig f41270D;

        /* renamed from: E */
        public Boolean f41271E;

        /* renamed from: a */
        public Integer f41272a;

        /* renamed from: b */
        public Boolean f41273b;

        /* renamed from: c */
        public Integer f41274c;

        /* renamed from: d */
        public Integer f41275d;

        /* renamed from: e */
        public Boolean f41276e;

        /* renamed from: f */
        public Boolean f41277f;

        /* renamed from: g */
        public Boolean f41278g;

        /* renamed from: h */
        public Boolean f41279h;

        /* renamed from: i */
        public SkinSetting.SkinType f41280i;

        /* renamed from: j */
        public String f41281j;

        /* renamed from: k */
        public Boolean f41282k;

        /* renamed from: l */
        public SkinSetting.SkinType f41283l;

        /* renamed from: m */
        public Boolean f41284m;

        /* renamed from: n */
        public SkinSetting.SkinType f41285n;

        /* renamed from: o */
        public Boolean f41286o;

        /* renamed from: p */
        public SkinSetting.SkinType f41287p;

        /* renamed from: q */
        public DayOfWeek f41288q;

        /* renamed from: r */
        public String f41289r;

        /* renamed from: s */
        public Boolean f41290s;

        /* renamed from: t */
        public List<String> f41291t = Internal.newMutableList();

        /* renamed from: u */
        public Boolean f41292u;

        /* renamed from: v */
        public Boolean f41293v;

        /* renamed from: w */
        public Boolean f41294w;

        /* renamed from: x */
        public WorkHourSetting f41295x;

        /* renamed from: y */
        public Boolean f41296y;

        /* renamed from: z */
        public String f41297z;

        /* renamed from: a */
        public CalendarSetting build() {
            return new CalendarSetting(this.f41272a, this.f41273b, this.f41274c, this.f41275d, this.f41276e, this.f41277f, this.f41278g, this.f41279h, this.f41280i, this.f41281j, this.f41282k, this.f41283l, this.f41284m, this.f41285n, this.f41286o, this.f41287p, this.f41288q, this.f41289r, this.f41290s, this.f41291t, this.f41292u, this.f41293v, this.f41294w, this.f41295x, this.f41296y, this.f41297z, this.f41267A, this.f41268B, this.f41269C, this.f41270D, this.f41271E, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15564a mo56459a(AlternateCalendar alternateCalendar) {
            this.f41269C = alternateCalendar;
            return this;
        }

        /* renamed from: b */
        public C15564a mo56467b(SkinSetting.SkinType skinType) {
            this.f41285n = skinType;
            return this;
        }

        /* renamed from: c */
        public C15564a mo56471c(SkinSetting.SkinType skinType) {
            this.f41287p = skinType;
            return this;
        }

        /* renamed from: d */
        public C15564a mo56474d(Boolean bool) {
            this.f41278g = bool;
            return this;
        }

        /* renamed from: e */
        public C15564a mo56475e(Boolean bool) {
            this.f41282k = bool;
            return this;
        }

        /* renamed from: f */
        public C15564a mo56476f(Boolean bool) {
            this.f41284m = bool;
            return this;
        }

        /* renamed from: g */
        public C15564a mo56477g(Boolean bool) {
            this.f41286o = bool;
            return this;
        }

        /* renamed from: h */
        public C15564a mo56478h(Boolean bool) {
            this.f41290s = bool;
            return this;
        }

        /* renamed from: i */
        public C15564a mo56479i(Boolean bool) {
            this.f41271E = bool;
            return this;
        }

        /* renamed from: a */
        public C15564a mo56460a(DayOfWeek dayOfWeek) {
            this.f41288q = dayOfWeek;
            return this;
        }

        /* renamed from: b */
        public C15564a mo56468b(Boolean bool) {
            this.f41276e = bool;
            return this;
        }

        /* renamed from: c */
        public C15564a mo56472c(Boolean bool) {
            this.f41277f = bool;
            return this;
        }

        /* renamed from: a */
        public C15564a mo56461a(SkinSetting.SkinType skinType) {
            this.f41283l = skinType;
            return this;
        }

        /* renamed from: b */
        public C15564a mo56469b(Integer num) {
            this.f41274c = num;
            return this;
        }

        /* renamed from: c */
        public C15564a mo56473c(Integer num) {
            this.f41275d = num;
            return this;
        }

        /* renamed from: a */
        public C15564a mo56462a(WorkHourSetting workHourSetting) {
            this.f41295x = workHourSetting;
            return this;
        }

        /* renamed from: b */
        public C15564a mo56470b(String str) {
            this.f41268B = str;
            return this;
        }

        /* renamed from: a */
        public C15564a mo56463a(Boolean bool) {
            this.f41273b = bool;
            return this;
        }

        /* renamed from: a */
        public C15564a mo56464a(Integer num) {
            this.f41272a = num;
            return this;
        }

        /* renamed from: a */
        public C15564a mo56465a(String str) {
            this.f41289r = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarSetting");
        StringBuilder sb = new StringBuilder();
        if (this.default_event_duration_v2 != null) {
            sb.append(", default_event_duration_v2=");
            sb.append(this.default_event_duration_v2);
        }
        if (this.show_rejected_schedule != null) {
            sb.append(", show_rejected_schedule=");
            sb.append(this.show_rejected_schedule);
        }
        if (this.default_all_day_reminder != null) {
            sb.append(", default_all_day_reminder=");
            sb.append(this.default_all_day_reminder);
        }
        if (this.default_none_all_day_reminder != null) {
            sb.append(", default_none_all_day_reminder=");
            sb.append(this.default_none_all_day_reminder);
        }
        if (this.bind_google_calendar != null) {
            sb.append(", bind_google_calendar=");
            sb.append(this.bind_google_calendar);
        }
        if (this.remind_accept_only != null) {
            sb.append(", remind_accept_only=");
            sb.append(this.remind_accept_only);
        }
        if (this.notify_when_guests_decline != null) {
            sb.append(", notify_when_guests_decline=");
            sb.append(this.notify_when_guests_decline);
        }
        if (this.show_past_events_mask != null) {
            sb.append(", show_past_events_mask=");
            sb.append(this.show_past_events_mask);
        }
        if (this.skin_type != null) {
            sb.append(", skin_type=");
            sb.append(this.skin_type);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.show_past_events_mask_pc != null) {
            sb.append(", show_past_events_mask_pc=");
            sb.append(this.show_past_events_mask_pc);
        }
        if (this.skin_type_pc != null) {
            sb.append(", skin_type_pc=");
            sb.append(this.skin_type_pc);
        }
        if (this.show_past_events_mask_android != null) {
            sb.append(", show_past_events_mask_android=");
            sb.append(this.show_past_events_mask_android);
        }
        if (this.skin_type_android != null) {
            sb.append(", skin_type_android=");
            sb.append(this.skin_type_android);
        }
        if (this.show_past_events_mask_ios != null) {
            sb.append(", show_past_events_mask_ios=");
            sb.append(this.show_past_events_mask_ios);
        }
        if (this.skin_type_ios != null) {
            sb.append(", skin_type_ios=");
            sb.append(this.skin_type_ios);
        }
        if (this.week_start_day != null) {
            sb.append(", week_start_day=");
            sb.append(this.week_start_day);
        }
        if (this.google_calendar_email != null) {
            sb.append(", google_calendar_email=");
            sb.append(this.google_calendar_email);
        }
        if (this.show_other_timezone != null) {
            sb.append(", show_other_timezone=");
            sb.append(this.show_other_timezone);
        }
        if (!this.other_timezones.isEmpty()) {
            sb.append(", other_timezones=");
            sb.append(this.other_timezones);
        }
        if (this.hide_binding_google_calendar != null) {
            sb.append(", hide_binding_google_calendar=");
            sb.append(this.hide_binding_google_calendar);
        }
        if (this.summer_time_alert != null) {
            sb.append(", summer_time_alert=");
            sb.append(this.summer_time_alert);
        }
        if (this.enable_system_timezone != null) {
            sb.append(", enable_system_timezone=");
            sb.append(this.enable_system_timezone);
        }
        if (this.work_hour_setting != null) {
            sb.append(", work_hour_setting=");
            sb.append(this.work_hour_setting);
        }
        if (this.show_today_view != null) {
            sb.append(", show_today_view=");
            sb.append(this.show_today_view);
        }
        if (this.email_attendee_invitation_email != null) {
            sb.append(", email_attendee_invitation_email=");
            sb.append(this.email_attendee_invitation_email);
        }
        if (this.has_usable_email_to_invite_email_attendee != null) {
            sb.append(", has_usable_email_to_invite_email_attendee=");
            sb.append(this.has_usable_email_to_invite_email_attendee);
        }
        if (this.mobile_normal_view_timezone != null) {
            sb.append(", mobile_normal_view_timezone=");
            sb.append(this.mobile_normal_view_timezone);
        }
        if (this.alternate_calendar != null) {
            sb.append(", alternate_calendar=");
            sb.append(this.alternate_calendar);
        }
        if (this.calendar_setting_config != null) {
            sb.append(", calendar_setting_config=");
            sb.append(this.calendar_setting_config);
        }
        if (this.use_system_timezone_in_mobile_normal_view != null) {
            sb.append(", use_system_timezone_in_mobile_normal_view=");
            sb.append(this.use_system_timezone_in_mobile_normal_view);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarSetting{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarSetting(Integer num, Boolean bool, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, SkinSetting.SkinType skinType, String str, Boolean bool6, SkinSetting.SkinType skinType2, Boolean bool7, SkinSetting.SkinType skinType3, Boolean bool8, SkinSetting.SkinType skinType4, DayOfWeek dayOfWeek, String str2, Boolean bool9, List<String> list, Boolean bool10, Boolean bool11, Boolean bool12, WorkHourSetting workHourSetting, Boolean bool13, String str3, Boolean bool14, String str4, AlternateCalendar alternateCalendar, CalendarSettingConfig calendarSettingConfig, Boolean bool15) {
        this(num, bool, num2, num3, bool2, bool3, bool4, bool5, skinType, str, bool6, skinType2, bool7, skinType3, bool8, skinType4, dayOfWeek, str2, bool9, list, bool10, bool11, bool12, workHourSetting, bool13, str3, bool14, str4, alternateCalendar, calendarSettingConfig, bool15, ByteString.EMPTY);
    }

    public CalendarSetting(Integer num, Boolean bool, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, SkinSetting.SkinType skinType, String str, Boolean bool6, SkinSetting.SkinType skinType2, Boolean bool7, SkinSetting.SkinType skinType3, Boolean bool8, SkinSetting.SkinType skinType4, DayOfWeek dayOfWeek, String str2, Boolean bool9, List<String> list, Boolean bool10, Boolean bool11, Boolean bool12, WorkHourSetting workHourSetting, Boolean bool13, String str3, Boolean bool14, String str4, AlternateCalendar alternateCalendar, CalendarSettingConfig calendarSettingConfig, Boolean bool15, ByteString byteString) {
        super(ADAPTER, byteString);
        this.default_event_duration_v2 = num;
        this.show_rejected_schedule = bool;
        this.default_all_day_reminder = num2;
        this.default_none_all_day_reminder = num3;
        this.bind_google_calendar = bool2;
        this.remind_accept_only = bool3;
        this.notify_when_guests_decline = bool4;
        this.show_past_events_mask = bool5;
        this.skin_type = skinType;
        this.timezone = str;
        this.show_past_events_mask_pc = bool6;
        this.skin_type_pc = skinType2;
        this.show_past_events_mask_android = bool7;
        this.skin_type_android = skinType3;
        this.show_past_events_mask_ios = bool8;
        this.skin_type_ios = skinType4;
        this.week_start_day = dayOfWeek;
        this.google_calendar_email = str2;
        this.show_other_timezone = bool9;
        this.other_timezones = Internal.immutableCopyOf("other_timezones", list);
        this.hide_binding_google_calendar = bool10;
        this.summer_time_alert = bool11;
        this.enable_system_timezone = bool12;
        this.work_hour_setting = workHourSetting;
        this.show_today_view = bool13;
        this.email_attendee_invitation_email = str3;
        this.has_usable_email_to_invite_email_attendee = bool14;
        this.mobile_normal_view_timezone = str4;
        this.alternate_calendar = alternateCalendar;
        this.calendar_setting_config = calendarSettingConfig;
        this.use_system_timezone_in_mobile_normal_view = bool15;
    }
}
