package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
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

public final class CalendarEventInstance extends Message<CalendarEventInstance, C15534a> {
    public static final ProtoAdapter<CalendarEventInstance> ADAPTER = new C15535b();
    public static final Calendar.AccessRole DEFAULT_CAL_ACCESS_ROLE = Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
    public static final Integer DEFAULT_CAL_BACKGROUND_COLOR = -1;
    public static final Integer DEFAULT_CAL_FOREGROUND_COLOR = -1;
    public static final CalendarEvent.Category DEFAULT_CATEGORY = CalendarEvent.Category.DEFAULT_CATEGORY;
    public static final Integer DEFAULT_COLOR = -1;
    public static final CalendarDirtyType DEFAULT_DIRTY_TYPE = CalendarDirtyType.NONE_DIRTY_TYPE;
    public static final CalendarEvent.DisplayType DEFAULT_DISPLAY_TYPE = CalendarEvent.DisplayType.INVISIBLE;
    public static final Integer DEFAULT_END_DAY = 0;
    public static final Integer DEFAULT_END_MINUTE = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final CalendarEvent.Type DEFAULT_EVENT_TYPE = CalendarEvent.Type.DEFAULT_TYPE;
    public static final Boolean DEFAULT_HAS_ATTENDEE = false;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_EDITABLE = false;
    public static final Boolean DEFAULT_IS_FREE = false;
    public static final Boolean DEFAULT_IS_SUBSCRIBER = true;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final CalendarEventAttendee.Status DEFAULT_SELF_ATTENDEE_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    public static final CalendarEvent.Source DEFAULT_SOURCE = CalendarEvent.Source.UNKNOWN_SOURCE;
    public static final Integer DEFAULT_START_DAY = 0;
    public static final Integer DEFAULT_START_MINUTE = 0;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final CalendarEvent.Status DEFAULT_STATUS = CalendarEvent.Status.TENTATIVE;
    public static final Integer DEFAULT_VERSION = 0;
    public static final CalendarEvent.Visibility DEFAULT_VISIBILITY = CalendarEvent.Visibility.DEFAULT;
    private static final long serialVersionUID = 0;
    public final Calendar.AccessRole cal_access_role;
    public final Integer cal_background_color;
    public final MappingColor cal_color;
    public final Integer cal_foreground_color;
    public final String calendar_id;
    public final CalendarEvent.Category category;
    public final Integer color;
    public final EventCreator creator;
    public final CalendarDirtyType dirty_type;
    public final CalendarEvent.DisplayType display_type;
    public final Integer end_day;
    public final Integer end_minute;
    public final Long end_time;
    public final String end_timezone;
    public final MappingColor event_color;
    public final String event_id;
    public final String event_server_id;
    public final CalendarEvent.Type event_type;
    public final Boolean has_attendee;
    public final String id;
    public final String importance_score;
    public final Boolean is_all_day;
    public final Boolean is_cross_tenant;
    public final Boolean is_editable;
    public final Boolean is_free;
    public final Boolean is_subscriber;
    public final String key;
    public final CalendarLocation location;
    public final List<String> meeting_rooms;
    public final String organizer_id;
    public final EventCreator original_event_creator;
    public final Long original_time;
    public final CalendarEventAttendee.Status self_attendee_status;
    public final CalendarEvent.Source source;
    public final Integer start_day;
    public final Integer start_minute;
    public final Long start_time;
    public final String start_timezone;
    public final CalendarEvent.Status status;
    public final String summary;
    public final Integer version;
    public final String video_meeting_unique_id;
    public final CalendarEvent.Visibility visibility;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventInstance$a */
    public static final class C15534a extends Message.Builder<CalendarEventInstance, C15534a> {

        /* renamed from: A */
        public CalendarEvent.Visibility f41152A;

        /* renamed from: B */
        public Boolean f41153B;

        /* renamed from: C */
        public List<String> f41154C = Internal.newMutableList();

        /* renamed from: D */
        public CalendarEvent.DisplayType f41155D;

        /* renamed from: E */
        public CalendarEvent.Source f41156E;

        /* renamed from: F */
        public MappingColor f41157F;

        /* renamed from: G */
        public MappingColor f41158G;

        /* renamed from: H */
        public EventCreator f41159H;

        /* renamed from: I */
        public CalendarEvent.Type f41160I;

        /* renamed from: J */
        public EventCreator f41161J;

        /* renamed from: K */
        public CalendarDirtyType f41162K;

        /* renamed from: L */
        public Integer f41163L;

        /* renamed from: M */
        public Boolean f41164M;

        /* renamed from: N */
        public String f41165N;

        /* renamed from: O */
        public String f41166O;

        /* renamed from: P */
        public Boolean f41167P;

        /* renamed from: Q */
        public CalendarEvent.Category f41168Q;

        /* renamed from: a */
        public String f41169a;

        /* renamed from: b */
        public String f41170b;

        /* renamed from: c */
        public String f41171c;

        /* renamed from: d */
        public String f41172d;

        /* renamed from: e */
        public Long f41173e;

        /* renamed from: f */
        public String f41174f;

        /* renamed from: g */
        public Long f41175g;

        /* renamed from: h */
        public String f41176h;

        /* renamed from: i */
        public Integer f41177i;

        /* renamed from: j */
        public Integer f41178j;

        /* renamed from: k */
        public Integer f41179k;

        /* renamed from: l */
        public Integer f41180l;

        /* renamed from: m */
        public String f41181m;

        /* renamed from: n */
        public Long f41182n;

        /* renamed from: o */
        public Integer f41183o;

        /* renamed from: p */
        public Integer f41184p;

        /* renamed from: q */
        public Integer f41185q;

        /* renamed from: r */
        public String f41186r;

        /* renamed from: s */
        public Boolean f41187s;

        /* renamed from: t */
        public CalendarEvent.Status f41188t;

        /* renamed from: u */
        public CalendarEventAttendee.Status f41189u;

        /* renamed from: v */
        public Boolean f41190v;

        /* renamed from: w */
        public Calendar.AccessRole f41191w;

        /* renamed from: x */
        public String f41192x;

        /* renamed from: y */
        public Boolean f41193y;

        /* renamed from: z */
        public CalendarLocation f41194z;

        /* renamed from: a */
        public C15534a mo56336a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41154C = list;
            return this;
        }

        /* renamed from: a */
        public CalendarEventInstance build() {
            String str;
            String str2;
            String str3;
            Long l;
            String str4;
            Long l2;
            String str5;
            String str6;
            Long l3;
            Boolean bool;
            String str7;
            String str8 = this.f41169a;
            if (str8 != null && (str = this.f41170b) != null && (str2 = this.f41171c) != null && (str3 = this.f41172d) != null && (l = this.f41173e) != null && (str4 = this.f41174f) != null && (l2 = this.f41175g) != null && (str5 = this.f41176h) != null && (str6 = this.f41181m) != null && (l3 = this.f41182n) != null && (bool = this.f41187s) != null && (str7 = this.f41192x) != null) {
                return new CalendarEventInstance(str8, str, str2, str3, l, str4, l2, str5, this.f41177i, this.f41178j, this.f41179k, this.f41180l, str6, l3, this.f41183o, this.f41184p, this.f41185q, this.f41186r, bool, this.f41188t, this.f41189u, this.f41190v, this.f41191w, str7, this.f41193y, this.f41194z, this.f41152A, this.f41153B, this.f41154C, this.f41155D, this.f41156E, this.f41157F, this.f41158G, this.f41159H, this.f41160I, this.f41161J, this.f41162K, this.f41163L, this.f41164M, this.f41165N, this.f41166O, this.f41167P, this.f41168Q, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str8, "id", this.f41170b, "event_id", this.f41171c, "calendar_id", this.f41172d, "organizer_id", this.f41173e, "start_time", this.f41174f, "start_timezone", this.f41175g, "end_time", this.f41176h, "end_timezone", this.f41181m, "key", this.f41182n, "original_time", this.f41187s, "is_all_day", this.f41192x, "event_server_id");
        }

        /* renamed from: a */
        public C15534a mo56326a(Calendar.AccessRole accessRole) {
            this.f41191w = accessRole;
            return this;
        }

        /* renamed from: b */
        public C15534a mo56338b(Boolean bool) {
            this.f41190v = bool;
            return this;
        }

        /* renamed from: c */
        public C15534a mo56342c(Boolean bool) {
            this.f41193y = bool;
            return this;
        }

        /* renamed from: d */
        public C15534a mo56346d(Boolean bool) {
            this.f41153B = bool;
            return this;
        }

        /* renamed from: e */
        public C15534a mo56349e(Integer num) {
            this.f41183o = num;
            return this;
        }

        /* renamed from: f */
        public C15534a mo56351f(String str) {
            this.f41176h = str;
            return this;
        }

        /* renamed from: g */
        public C15534a mo56352g(String str) {
            this.f41181m = str;
            return this;
        }

        /* renamed from: h */
        public C15534a mo56353h(String str) {
            this.f41186r = str;
            return this;
        }

        /* renamed from: i */
        public C15534a mo56354i(String str) {
            this.f41192x = str;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56327a(CalendarEvent.DisplayType displayType) {
            this.f41155D = displayType;
            return this;
        }

        /* renamed from: b */
        public C15534a mo56339b(Integer num) {
            this.f41178j = num;
            return this;
        }

        /* renamed from: c */
        public C15534a mo56343c(Integer num) {
            this.f41179k = num;
            return this;
        }

        /* renamed from: d */
        public C15534a mo56347d(Integer num) {
            this.f41180l = num;
            return this;
        }

        /* renamed from: e */
        public C15534a mo56350e(String str) {
            this.f41174f = str;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56328a(CalendarEvent.Status status) {
            this.f41188t = status;
            return this;
        }

        /* renamed from: b */
        public C15534a mo56340b(Long l) {
            this.f41175g = l;
            return this;
        }

        /* renamed from: c */
        public C15534a mo56344c(Long l) {
            this.f41182n = l;
            return this;
        }

        /* renamed from: d */
        public C15534a mo56348d(String str) {
            this.f41172d = str;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56329a(CalendarEvent.Visibility visibility) {
            this.f41152A = visibility;
            return this;
        }

        /* renamed from: b */
        public C15534a mo56341b(String str) {
            this.f41170b = str;
            return this;
        }

        /* renamed from: c */
        public C15534a mo56345c(String str) {
            this.f41171c = str;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56330a(CalendarEventAttendee.Status status) {
            this.f41189u = status;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56331a(CalendarLocation calendarLocation) {
            this.f41194z = calendarLocation;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56332a(Boolean bool) {
            this.f41187s = bool;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56333a(Integer num) {
            this.f41177i = num;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56334a(Long l) {
            this.f41173e = l;
            return this;
        }

        /* renamed from: a */
        public C15534a mo56335a(String str) {
            this.f41169a = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventInstance$b */
    private static final class C15535b extends ProtoAdapter<CalendarEventInstance> {
        C15535b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventInstance.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventInstance calendarEventInstance) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEventInstance.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, calendarEventInstance.event_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, calendarEventInstance.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, calendarEventInstance.organizer_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, calendarEventInstance.start_time) + ProtoAdapter.STRING.encodedSizeWithTag(6, calendarEventInstance.start_timezone) + ProtoAdapter.INT64.encodedSizeWithTag(7, calendarEventInstance.end_time) + ProtoAdapter.STRING.encodedSizeWithTag(8, calendarEventInstance.end_timezone);
            int i30 = 0;
            if (calendarEventInstance.start_day != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(9, calendarEventInstance.start_day);
            } else {
                i = 0;
            }
            int i31 = encodedSizeWithTag + i;
            if (calendarEventInstance.end_day != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(10, calendarEventInstance.end_day);
            } else {
                i2 = 0;
            }
            int i32 = i31 + i2;
            if (calendarEventInstance.start_minute != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(11, calendarEventInstance.start_minute);
            } else {
                i3 = 0;
            }
            int i33 = i32 + i3;
            if (calendarEventInstance.end_minute != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(12, calendarEventInstance.end_minute);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i33 + i4 + ProtoAdapter.STRING.encodedSizeWithTag(13, calendarEventInstance.key) + ProtoAdapter.INT64.encodedSizeWithTag(14, calendarEventInstance.original_time);
            if (calendarEventInstance.color != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(15, calendarEventInstance.color);
            } else {
                i5 = 0;
            }
            int i34 = encodedSizeWithTag2 + i5;
            if (calendarEventInstance.cal_foreground_color != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(16, calendarEventInstance.cal_foreground_color);
            } else {
                i6 = 0;
            }
            int i35 = i34 + i6;
            if (calendarEventInstance.cal_background_color != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(17, calendarEventInstance.cal_background_color);
            } else {
                i7 = 0;
            }
            int i36 = i35 + i7;
            if (calendarEventInstance.summary != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(18, calendarEventInstance.summary);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag3 = i36 + i8 + ProtoAdapter.BOOL.encodedSizeWithTag(19, calendarEventInstance.is_all_day);
            if (calendarEventInstance.status != null) {
                i9 = CalendarEvent.Status.ADAPTER.encodedSizeWithTag(20, calendarEventInstance.status);
            } else {
                i9 = 0;
            }
            int i37 = encodedSizeWithTag3 + i9;
            if (calendarEventInstance.self_attendee_status != null) {
                i10 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(21, calendarEventInstance.self_attendee_status);
            } else {
                i10 = 0;
            }
            int i38 = i37 + i10;
            if (calendarEventInstance.is_free != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(22, calendarEventInstance.is_free);
            } else {
                i11 = 0;
            }
            int i39 = i38 + i11;
            if (calendarEventInstance.cal_access_role != null) {
                i12 = Calendar.AccessRole.ADAPTER.encodedSizeWithTag(23, calendarEventInstance.cal_access_role);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag4 = i39 + i12 + ProtoAdapter.STRING.encodedSizeWithTag(24, calendarEventInstance.event_server_id);
            if (calendarEventInstance.is_editable != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(25, calendarEventInstance.is_editable);
            } else {
                i13 = 0;
            }
            int i40 = encodedSizeWithTag4 + i13;
            if (calendarEventInstance.location != null) {
                i14 = CalendarLocation.ADAPTER.encodedSizeWithTag(26, calendarEventInstance.location);
            } else {
                i14 = 0;
            }
            int i41 = i40 + i14;
            if (calendarEventInstance.visibility != null) {
                i15 = CalendarEvent.Visibility.ADAPTER.encodedSizeWithTag(27, calendarEventInstance.visibility);
            } else {
                i15 = 0;
            }
            int i42 = i41 + i15;
            if (calendarEventInstance.is_subscriber != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(28, calendarEventInstance.is_subscriber);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag5 = i42 + i16 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(29, calendarEventInstance.meeting_rooms);
            if (calendarEventInstance.display_type != null) {
                i17 = CalendarEvent.DisplayType.ADAPTER.encodedSizeWithTag(30, calendarEventInstance.display_type);
            } else {
                i17 = 0;
            }
            int i43 = encodedSizeWithTag5 + i17;
            if (calendarEventInstance.source != null) {
                i18 = CalendarEvent.Source.ADAPTER.encodedSizeWithTag(31, calendarEventInstance.source);
            } else {
                i18 = 0;
            }
            int i44 = i43 + i18;
            if (calendarEventInstance.event_color != null) {
                i19 = MappingColor.ADAPTER.encodedSizeWithTag(32, calendarEventInstance.event_color);
            } else {
                i19 = 0;
            }
            int i45 = i44 + i19;
            if (calendarEventInstance.cal_color != null) {
                i20 = MappingColor.ADAPTER.encodedSizeWithTag(33, calendarEventInstance.cal_color);
            } else {
                i20 = 0;
            }
            int i46 = i45 + i20;
            if (calendarEventInstance.creator != null) {
                i21 = EventCreator.ADAPTER.encodedSizeWithTag(34, calendarEventInstance.creator);
            } else {
                i21 = 0;
            }
            int i47 = i46 + i21;
            if (calendarEventInstance.event_type != null) {
                i22 = CalendarEvent.Type.ADAPTER.encodedSizeWithTag(35, calendarEventInstance.event_type);
            } else {
                i22 = 0;
            }
            int i48 = i47 + i22;
            if (calendarEventInstance.original_event_creator != null) {
                i23 = EventCreator.ADAPTER.encodedSizeWithTag(36, calendarEventInstance.original_event_creator);
            } else {
                i23 = 0;
            }
            int i49 = i48 + i23;
            if (calendarEventInstance.dirty_type != null) {
                i24 = CalendarDirtyType.ADAPTER.encodedSizeWithTag(37, calendarEventInstance.dirty_type);
            } else {
                i24 = 0;
            }
            int i50 = i49 + i24;
            if (calendarEventInstance.version != null) {
                i25 = ProtoAdapter.INT32.encodedSizeWithTag(38, calendarEventInstance.version);
            } else {
                i25 = 0;
            }
            int i51 = i50 + i25;
            if (calendarEventInstance.has_attendee != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(39, calendarEventInstance.has_attendee);
            } else {
                i26 = 0;
            }
            int i52 = i51 + i26;
            if (calendarEventInstance.importance_score != null) {
                i27 = ProtoAdapter.STRING.encodedSizeWithTag(40, calendarEventInstance.importance_score);
            } else {
                i27 = 0;
            }
            int i53 = i52 + i27;
            if (calendarEventInstance.video_meeting_unique_id != null) {
                i28 = ProtoAdapter.STRING.encodedSizeWithTag(41, calendarEventInstance.video_meeting_unique_id);
            } else {
                i28 = 0;
            }
            int i54 = i53 + i28;
            if (calendarEventInstance.is_cross_tenant != null) {
                i29 = ProtoAdapter.BOOL.encodedSizeWithTag(42, calendarEventInstance.is_cross_tenant);
            } else {
                i29 = 0;
            }
            int i55 = i54 + i29;
            if (calendarEventInstance.category != null) {
                i30 = CalendarEvent.Category.ADAPTER.encodedSizeWithTag(43, calendarEventInstance.category);
            }
            return i55 + i30 + calendarEventInstance.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventInstance decode(ProtoReader protoReader) throws IOException {
            C15534a aVar = new C15534a();
            aVar.f41169a = "";
            aVar.f41170b = "";
            aVar.f41171c = "";
            aVar.f41172d = "";
            aVar.f41173e = 0L;
            aVar.f41174f = "";
            aVar.f41175g = 0L;
            aVar.f41176h = "";
            aVar.f41177i = 0;
            aVar.f41178j = 0;
            aVar.f41179k = 0;
            aVar.f41180l = 0;
            aVar.f41181m = "";
            aVar.f41182n = 0L;
            aVar.f41183o = -1;
            aVar.f41184p = -1;
            aVar.f41185q = -1;
            aVar.f41186r = "";
            aVar.f41187s = false;
            aVar.f41188t = CalendarEvent.Status.TENTATIVE;
            aVar.f41189u = CalendarEventAttendee.Status.NEEDS_ACTION;
            aVar.f41190v = false;
            aVar.f41191w = Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
            aVar.f41192x = "";
            aVar.f41193y = false;
            aVar.f41152A = CalendarEvent.Visibility.DEFAULT;
            aVar.f41153B = true;
            aVar.f41155D = CalendarEvent.DisplayType.INVISIBLE;
            aVar.f41156E = CalendarEvent.Source.UNKNOWN_SOURCE;
            aVar.f41160I = CalendarEvent.Type.DEFAULT_TYPE;
            aVar.f41162K = CalendarDirtyType.NONE_DIRTY_TYPE;
            aVar.f41163L = 0;
            aVar.f41164M = false;
            aVar.f41165N = "";
            aVar.f41166O = "";
            aVar.f41167P = false;
            aVar.f41168Q = CalendarEvent.Category.DEFAULT_CATEGORY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41169a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41170b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41171c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41172d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41173e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41174f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41175g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41176h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41177i = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41178j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41179k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41180l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41181m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41182n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41183o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f41184p = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 17:
                            aVar.f41185q = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 18:
                            aVar.f41186r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f41187s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            try {
                                aVar.f41188t = CalendarEvent.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 21:
                            try {
                                aVar.f41189u = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 22:
                            aVar.f41190v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            try {
                                aVar.f41191w = Calendar.AccessRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 24:
                            aVar.f41192x = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f41193y = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            aVar.f41194z = CalendarLocation.ADAPTER.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            try {
                                aVar.f41152A = CalendarEvent.Visibility.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f41153B = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            aVar.f41154C.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 30:
                            try {
                                aVar.f41155D = CalendarEvent.DisplayType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            try {
                                aVar.f41156E = CalendarEvent.Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case 32:
                            aVar.f41157F = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 33:
                            aVar.f41158G = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 34:
                            aVar.f41159H = EventCreator.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            try {
                                aVar.f41160I = CalendarEvent.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
                                break;
                            }
                        case 36:
                            aVar.f41161J = EventCreator.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            try {
                                aVar.f41162K = CalendarDirtyType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e8.value));
                                break;
                            }
                        case 38:
                            aVar.f41163L = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 39:
                            aVar.f41164M = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            aVar.f41165N = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 41:
                            aVar.f41166O = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 42:
                            aVar.f41167P = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 43:
                            try {
                                aVar.f41168Q = CalendarEvent.Category.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e9.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, CalendarEventInstance calendarEventInstance) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEventInstance.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarEventInstance.event_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarEventInstance.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendarEventInstance.organizer_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, calendarEventInstance.start_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarEventInstance.start_timezone);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, calendarEventInstance.end_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, calendarEventInstance.end_timezone);
            if (calendarEventInstance.start_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, calendarEventInstance.start_day);
            }
            if (calendarEventInstance.end_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, calendarEventInstance.end_day);
            }
            if (calendarEventInstance.start_minute != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, calendarEventInstance.start_minute);
            }
            if (calendarEventInstance.end_minute != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, calendarEventInstance.end_minute);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, calendarEventInstance.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, calendarEventInstance.original_time);
            if (calendarEventInstance.color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, calendarEventInstance.color);
            }
            if (calendarEventInstance.cal_foreground_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, calendarEventInstance.cal_foreground_color);
            }
            if (calendarEventInstance.cal_background_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 17, calendarEventInstance.cal_background_color);
            }
            if (calendarEventInstance.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, calendarEventInstance.summary);
            }
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, calendarEventInstance.is_all_day);
            if (calendarEventInstance.status != null) {
                CalendarEvent.Status.ADAPTER.encodeWithTag(protoWriter, 20, calendarEventInstance.status);
            }
            if (calendarEventInstance.self_attendee_status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 21, calendarEventInstance.self_attendee_status);
            }
            if (calendarEventInstance.is_free != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, calendarEventInstance.is_free);
            }
            if (calendarEventInstance.cal_access_role != null) {
                Calendar.AccessRole.ADAPTER.encodeWithTag(protoWriter, 23, calendarEventInstance.cal_access_role);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, calendarEventInstance.event_server_id);
            if (calendarEventInstance.is_editable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 25, calendarEventInstance.is_editable);
            }
            if (calendarEventInstance.location != null) {
                CalendarLocation.ADAPTER.encodeWithTag(protoWriter, 26, calendarEventInstance.location);
            }
            if (calendarEventInstance.visibility != null) {
                CalendarEvent.Visibility.ADAPTER.encodeWithTag(protoWriter, 27, calendarEventInstance.visibility);
            }
            if (calendarEventInstance.is_subscriber != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 28, calendarEventInstance.is_subscriber);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 29, calendarEventInstance.meeting_rooms);
            if (calendarEventInstance.display_type != null) {
                CalendarEvent.DisplayType.ADAPTER.encodeWithTag(protoWriter, 30, calendarEventInstance.display_type);
            }
            if (calendarEventInstance.source != null) {
                CalendarEvent.Source.ADAPTER.encodeWithTag(protoWriter, 31, calendarEventInstance.source);
            }
            if (calendarEventInstance.event_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 32, calendarEventInstance.event_color);
            }
            if (calendarEventInstance.cal_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 33, calendarEventInstance.cal_color);
            }
            if (calendarEventInstance.creator != null) {
                EventCreator.ADAPTER.encodeWithTag(protoWriter, 34, calendarEventInstance.creator);
            }
            if (calendarEventInstance.event_type != null) {
                CalendarEvent.Type.ADAPTER.encodeWithTag(protoWriter, 35, calendarEventInstance.event_type);
            }
            if (calendarEventInstance.original_event_creator != null) {
                EventCreator.ADAPTER.encodeWithTag(protoWriter, 36, calendarEventInstance.original_event_creator);
            }
            if (calendarEventInstance.dirty_type != null) {
                CalendarDirtyType.ADAPTER.encodeWithTag(protoWriter, 37, calendarEventInstance.dirty_type);
            }
            if (calendarEventInstance.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 38, calendarEventInstance.version);
            }
            if (calendarEventInstance.has_attendee != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 39, calendarEventInstance.has_attendee);
            }
            if (calendarEventInstance.importance_score != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, calendarEventInstance.importance_score);
            }
            if (calendarEventInstance.video_meeting_unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 41, calendarEventInstance.video_meeting_unique_id);
            }
            if (calendarEventInstance.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 42, calendarEventInstance.is_cross_tenant);
            }
            if (calendarEventInstance.category != null) {
                CalendarEvent.Category.ADAPTER.encodeWithTag(protoWriter, 43, calendarEventInstance.category);
            }
            protoWriter.writeBytes(calendarEventInstance.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15534a newBuilder() {
        C15534a aVar = new C15534a();
        aVar.f41169a = this.id;
        aVar.f41170b = this.event_id;
        aVar.f41171c = this.calendar_id;
        aVar.f41172d = this.organizer_id;
        aVar.f41173e = this.start_time;
        aVar.f41174f = this.start_timezone;
        aVar.f41175g = this.end_time;
        aVar.f41176h = this.end_timezone;
        aVar.f41177i = this.start_day;
        aVar.f41178j = this.end_day;
        aVar.f41179k = this.start_minute;
        aVar.f41180l = this.end_minute;
        aVar.f41181m = this.key;
        aVar.f41182n = this.original_time;
        aVar.f41183o = this.color;
        aVar.f41184p = this.cal_foreground_color;
        aVar.f41185q = this.cal_background_color;
        aVar.f41186r = this.summary;
        aVar.f41187s = this.is_all_day;
        aVar.f41188t = this.status;
        aVar.f41189u = this.self_attendee_status;
        aVar.f41190v = this.is_free;
        aVar.f41191w = this.cal_access_role;
        aVar.f41192x = this.event_server_id;
        aVar.f41193y = this.is_editable;
        aVar.f41194z = this.location;
        aVar.f41152A = this.visibility;
        aVar.f41153B = this.is_subscriber;
        aVar.f41154C = Internal.copyOf("meeting_rooms", this.meeting_rooms);
        aVar.f41155D = this.display_type;
        aVar.f41156E = this.source;
        aVar.f41157F = this.event_color;
        aVar.f41158G = this.cal_color;
        aVar.f41159H = this.creator;
        aVar.f41160I = this.event_type;
        aVar.f41161J = this.original_event_creator;
        aVar.f41162K = this.dirty_type;
        aVar.f41163L = this.version;
        aVar.f41164M = this.has_attendee;
        aVar.f41165N = this.importance_score;
        aVar.f41166O = this.video_meeting_unique_id;
        aVar.f41167P = this.is_cross_tenant;
        aVar.f41168Q = this.category;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventInstance");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", event_id=");
        sb.append(this.event_id);
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", organizer_id=");
        sb.append(this.organizer_id);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", start_timezone=");
        sb.append(this.start_timezone);
        sb.append(", end_time=");
        sb.append(this.end_time);
        sb.append(", end_timezone=");
        sb.append(this.end_timezone);
        if (this.start_day != null) {
            sb.append(", start_day=");
            sb.append(this.start_day);
        }
        if (this.end_day != null) {
            sb.append(", end_day=");
            sb.append(this.end_day);
        }
        if (this.start_minute != null) {
            sb.append(", start_minute=");
            sb.append(this.start_minute);
        }
        if (this.end_minute != null) {
            sb.append(", end_minute=");
            sb.append(this.end_minute);
        }
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.cal_foreground_color != null) {
            sb.append(", cal_foreground_color=");
            sb.append(this.cal_foreground_color);
        }
        if (this.cal_background_color != null) {
            sb.append(", cal_background_color=");
            sb.append(this.cal_background_color);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        sb.append(", is_all_day=");
        sb.append(this.is_all_day);
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.self_attendee_status != null) {
            sb.append(", self_attendee_status=");
            sb.append(this.self_attendee_status);
        }
        if (this.is_free != null) {
            sb.append(", is_free=");
            sb.append(this.is_free);
        }
        if (this.cal_access_role != null) {
            sb.append(", cal_access_role=");
            sb.append(this.cal_access_role);
        }
        sb.append(", event_server_id=");
        sb.append(this.event_server_id);
        if (this.is_editable != null) {
            sb.append(", is_editable=");
            sb.append(this.is_editable);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.visibility != null) {
            sb.append(", visibility=");
            sb.append(this.visibility);
        }
        if (this.is_subscriber != null) {
            sb.append(", is_subscriber=");
            sb.append(this.is_subscriber);
        }
        if (!this.meeting_rooms.isEmpty()) {
            sb.append(", meeting_rooms=");
            sb.append(this.meeting_rooms);
        }
        if (this.display_type != null) {
            sb.append(", display_type=");
            sb.append(this.display_type);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.event_color != null) {
            sb.append(", event_color=");
            sb.append(this.event_color);
        }
        if (this.cal_color != null) {
            sb.append(", cal_color=");
            sb.append(this.cal_color);
        }
        if (this.creator != null) {
            sb.append(", creator=");
            sb.append(this.creator);
        }
        if (this.event_type != null) {
            sb.append(", event_type=");
            sb.append(this.event_type);
        }
        if (this.original_event_creator != null) {
            sb.append(", original_event_creator=");
            sb.append(this.original_event_creator);
        }
        if (this.dirty_type != null) {
            sb.append(", dirty_type=");
            sb.append(this.dirty_type);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.has_attendee != null) {
            sb.append(", has_attendee=");
            sb.append(this.has_attendee);
        }
        if (this.importance_score != null) {
            sb.append(", importance_score=");
            sb.append(this.importance_score);
        }
        if (this.video_meeting_unique_id != null) {
            sb.append(", video_meeting_unique_id=");
            sb.append(this.video_meeting_unique_id);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEventInstance{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventInstance(String str, String str2, String str3, String str4, Long l, String str5, Long l2, String str6, Integer num, Integer num2, Integer num3, Integer num4, String str7, Long l3, Integer num5, Integer num6, Integer num7, String str8, Boolean bool, CalendarEvent.Status status2, CalendarEventAttendee.Status status3, Boolean bool2, Calendar.AccessRole accessRole, String str9, Boolean bool3, CalendarLocation calendarLocation, CalendarEvent.Visibility visibility2, Boolean bool4, List<String> list, CalendarEvent.DisplayType displayType, CalendarEvent.Source source2, MappingColor mappingColor, MappingColor mappingColor2, EventCreator eventCreator, CalendarEvent.Type type, EventCreator eventCreator2, CalendarDirtyType calendarDirtyType, Integer num8, Boolean bool5, String str10, String str11, Boolean bool6, CalendarEvent.Category category2) {
        this(str, str2, str3, str4, l, str5, l2, str6, num, num2, num3, num4, str7, l3, num5, num6, num7, str8, bool, status2, status3, bool2, accessRole, str9, bool3, calendarLocation, visibility2, bool4, list, displayType, source2, mappingColor, mappingColor2, eventCreator, type, eventCreator2, calendarDirtyType, num8, bool5, str10, str11, bool6, category2, ByteString.EMPTY);
    }

    public CalendarEventInstance(String str, String str2, String str3, String str4, Long l, String str5, Long l2, String str6, Integer num, Integer num2, Integer num3, Integer num4, String str7, Long l3, Integer num5, Integer num6, Integer num7, String str8, Boolean bool, CalendarEvent.Status status2, CalendarEventAttendee.Status status3, Boolean bool2, Calendar.AccessRole accessRole, String str9, Boolean bool3, CalendarLocation calendarLocation, CalendarEvent.Visibility visibility2, Boolean bool4, List<String> list, CalendarEvent.DisplayType displayType, CalendarEvent.Source source2, MappingColor mappingColor, MappingColor mappingColor2, EventCreator eventCreator, CalendarEvent.Type type, EventCreator eventCreator2, CalendarDirtyType calendarDirtyType, Integer num8, Boolean bool5, String str10, String str11, Boolean bool6, CalendarEvent.Category category2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.event_id = str2;
        this.calendar_id = str3;
        this.organizer_id = str4;
        this.start_time = l;
        this.start_timezone = str5;
        this.end_time = l2;
        this.end_timezone = str6;
        this.start_day = num;
        this.end_day = num2;
        this.start_minute = num3;
        this.end_minute = num4;
        this.key = str7;
        this.original_time = l3;
        this.color = num5;
        this.cal_foreground_color = num6;
        this.cal_background_color = num7;
        this.summary = str8;
        this.is_all_day = bool;
        this.status = status2;
        this.self_attendee_status = status3;
        this.is_free = bool2;
        this.cal_access_role = accessRole;
        this.event_server_id = str9;
        this.is_editable = bool3;
        this.location = calendarLocation;
        this.visibility = visibility2;
        this.is_subscriber = bool4;
        this.meeting_rooms = Internal.immutableCopyOf("meeting_rooms", list);
        this.display_type = displayType;
        this.source = source2;
        this.event_color = mappingColor;
        this.cal_color = mappingColor2;
        this.creator = eventCreator;
        this.event_type = type;
        this.original_event_creator = eventCreator2;
        this.dirty_type = calendarDirtyType;
        this.version = num8;
        this.has_attendee = bool5;
        this.importance_score = str10;
        this.video_meeting_unique_id = str11;
        this.is_cross_tenant = bool6;
        this.category = category2;
    }
}
