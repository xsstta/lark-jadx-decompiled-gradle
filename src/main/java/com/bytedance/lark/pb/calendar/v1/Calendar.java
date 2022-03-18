package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Calendar extends Message<Calendar, C15508a> {
    public static final ProtoAdapter<Calendar> ADAPTER = new C15509b();
    public static final Integer DEFAULT_BACKGROUND_COLOR = -1;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final AccessRole DEFAULT_DEFAULT_ACCESS_ROLE = AccessRole.FREE_BUSY_READER;
    public static final CalendarDirtyType DEFAULT_DIRTY_TYPE = CalendarDirtyType.NONE_DIRTY_TYPE;
    public static final Boolean DEFAULT_EXTERNAL_PASSWORD_INVALID = false;
    public static final Integer DEFAULT_FOREGROUND_COLOR = -1;
    public static final Boolean DEFAULT_IS_ACTIVE = false;
    public static final Boolean DEFAULT_IS_ALL_STAFF = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Boolean DEFAULT_IS_DEFAULT = false;
    public static final Boolean DEFAULT_IS_DISABLED = false;
    public static final Boolean DEFAULT_IS_LOADING = false;
    public static final Boolean DEFAULT_IS_PRIMARY = false;
    public static final Boolean DEFAULT_IS_PUBLIC = false;
    public static final Boolean DEFAULT_IS_SUBSCRIBER = false;
    public static final Boolean DEFAULT_IS_SYNCED = true;
    public static final Boolean DEFAULT_IS_VISIBLE = true;
    public static final OfficialType DEFAULT_OFFICIAL_TYPE = OfficialType.NOT_OFFICIAL;
    public static final Integer DEFAULT_RESOURCE_CAPACITY = 0;
    public static final AccessRole DEFAULT_SELF_ACCESS_ROLE = AccessRole.FREE_BUSY_READER;
    public static final Status DEFAULT_SELF_STATUS = Status.DEFAULT;
    public static final Source DEFAULT_SOURCE = Source.NORMAL;
    public static final Type DEFAULT_TYPE = Type.PRIMARY;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final Integer DEFAULT_VISIBILITY_PROPERTY = 0;
    public static final Integer DEFAULT_WEIGHT = 0;
    private static final long serialVersionUID = 0;
    public final CalendarAuthInfo auth_info;
    public final Integer background_color;
    public final MappingColor cal_color;
    public final CalendarSchemaCollection calendar_event_schema;
    public final String calendar_owner_id;
    public final CalendarSchemaCollection calendar_schema;
    public final String calendar_tenant_id;
    public final CalendarCoverImageSet cover_image_set;
    public final Long create_time;
    public final AccessRole default_access_role;
    public final List<CalendarEventReminder> default_reminders;
    public final String default_timezone;
    public final String description;
    public final CalendarDirtyType dirty_type;
    public final String email;
    public final String external_account_email;
    public final Boolean external_password_invalid;
    public final Integer foreground_color;
    public final String id;
    public final Boolean is_active;
    public final Boolean is_all_staff;
    public final Boolean is_cross_tenant;
    public final Boolean is_default;
    public final Boolean is_disabled;
    public final Boolean is_loading;
    public final Boolean is_primary;
    public final Boolean is_public;
    public final Boolean is_subscriber;
    public final Boolean is_synced;
    public final Boolean is_visible;
    public final String localized_summary;
    public final String note;
    public final OfficialType official_type;
    public final CalendarMember owner;
    public final Integer resource_capacity;
    public final SchemaExtraData schema_extra_data;
    public final AccessRole self_access_role;
    public final Status self_status;
    public final String server_id;
    public final CalendarShareInfo share_info;
    public final CalendarShareOptions share_options;
    public final Source source;
    public final String successor_chatter_id;
    public final String summary;
    public final String timezone;
    public final Type type;
    public final Long update_time;
    public final String user_id;
    public final Integer visibility_property;
    public final Integer weight;
    public final WorkHourSetting work_hour_setting;

    public enum AccessRole implements WireEnum {
        UNKNOWN_ACCESS_ROLE(0),
        FREE_BUSY_READER(1),
        READER(2),
        WRITER(3),
        OWNER(4);
        
        public static final ProtoAdapter<AccessRole> ADAPTER = ProtoAdapter.newEnumAdapter(AccessRole.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AccessRole fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_ACCESS_ROLE;
            }
            if (i == 1) {
                return FREE_BUSY_READER;
            }
            if (i == 2) {
                return READER;
            }
            if (i == 3) {
                return WRITER;
            }
            if (i != 4) {
                return null;
            }
            return OWNER;
        }

        private AccessRole(int i) {
            this.value = i;
        }
    }

    public enum OfficialType implements WireEnum {
        NOT_OFFICIAL(0),
        BYTEDANCE(1);
        
        public static final ProtoAdapter<OfficialType> ADAPTER = ProtoAdapter.newEnumAdapter(OfficialType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static OfficialType fromValue(int i) {
            if (i == 0) {
                return NOT_OFFICIAL;
            }
            if (i != 1) {
                return null;
            }
            return BYTEDANCE;
        }

        private OfficialType(int i) {
            this.value = i;
        }
    }

    public enum ShareOption implements WireEnum {
        UNKNOWN_SHARE_OPT(0),
        SHARE_OPT_PRIVATE(5),
        SHARE_OPT_FREE_BUSY_READER(10),
        SHARE_OPT_READER(15),
        SHARE_OPT_WRITER(20),
        SHARE_OPT_OWNER(25);
        
        public static final ProtoAdapter<ShareOption> ADAPTER = ProtoAdapter.newEnumAdapter(ShareOption.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareOption fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SHARE_OPT;
            }
            if (i == 5) {
                return SHARE_OPT_PRIVATE;
            }
            if (i == 10) {
                return SHARE_OPT_FREE_BUSY_READER;
            }
            if (i == 15) {
                return SHARE_OPT_READER;
            }
            if (i == 20) {
                return SHARE_OPT_WRITER;
            }
            if (i != 25) {
                return null;
            }
            return SHARE_OPT_OWNER;
        }

        private ShareOption(int i) {
            this.value = i;
        }
    }

    public enum Source implements WireEnum {
        NORMAL(1),
        MEETING_ROOM_VIEW(2),
        NORMAL_AND_MEETING_ROOM_VIEW(3);
        
        public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Source fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return MEETING_ROOM_VIEW;
            }
            if (i != 3) {
                return null;
            }
            return NORMAL_AND_MEETING_ROOM_VIEW;
        }

        private Source(int i) {
            this.value = i;
        }
    }

    public enum Status implements WireEnum {
        DEFAULT(1),
        ACCEPTED(2),
        DECLINED(3),
        INVITED(4),
        REMOVED(5);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return ACCEPTED;
            }
            if (i == 3) {
                return DECLINED;
            }
            if (i == 4) {
                return INVITED;
            }
            if (i != 5) {
                return null;
            }
            return REMOVED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        PRIMARY(1),
        OTHER(2),
        GOOGLE(3),
        RESOURCES(4),
        GOOGLE_RESOURCE(5),
        EXCHANGE(8),
        ACTIVITY(9);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return PRIMARY;
            }
            if (i == 2) {
                return OTHER;
            }
            if (i == 3) {
                return GOOGLE;
            }
            if (i == 4) {
                return RESOURCES;
            }
            if (i == 5) {
                return GOOGLE_RESOURCE;
            }
            if (i == 8) {
                return EXCHANGE;
            }
            if (i != 9) {
                return null;
            }
            return ACTIVITY;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public enum VisibilityProperty implements WireEnum {
        NONE_VIEW(0),
        NORMAL_VIEW(1),
        MEETING_VIEW(2),
        TODAY_FEED_VIEW(4);
        
        public static final ProtoAdapter<VisibilityProperty> ADAPTER = ProtoAdapter.newEnumAdapter(VisibilityProperty.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static VisibilityProperty fromValue(int i) {
            if (i == 0) {
                return NONE_VIEW;
            }
            if (i == 1) {
                return NORMAL_VIEW;
            }
            if (i == 2) {
                return MEETING_VIEW;
            }
            if (i != 4) {
                return null;
            }
            return TODAY_FEED_VIEW;
        }

        private VisibilityProperty(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$a */
    public static final class C15508a extends Message.Builder<Calendar, C15508a> {

        /* renamed from: A */
        public String f40974A;

        /* renamed from: B */
        public String f40975B;

        /* renamed from: C */
        public CalendarMember f40976C;

        /* renamed from: D */
        public Integer f40977D;

        /* renamed from: E */
        public Boolean f40978E;

        /* renamed from: F */
        public Boolean f40979F;

        /* renamed from: G */
        public Boolean f40980G;

        /* renamed from: H */
        public String f40981H;

        /* renamed from: I */
        public WorkHourSetting f40982I;

        /* renamed from: J */
        public Boolean f40983J;

        /* renamed from: K */
        public Integer f40984K;

        /* renamed from: L */
        public String f40985L;

        /* renamed from: M */
        public CalendarSchemaCollection f40986M;

        /* renamed from: N */
        public CalendarSchemaCollection f40987N;

        /* renamed from: O */
        public SchemaExtraData f40988O;

        /* renamed from: P */
        public CalendarAuthInfo f40989P;

        /* renamed from: Q */
        public String f40990Q;

        /* renamed from: R */
        public Boolean f40991R;

        /* renamed from: S */
        public CalendarShareOptions f40992S;

        /* renamed from: T */
        public CalendarShareInfo f40993T;

        /* renamed from: U */
        public Boolean f40994U;

        /* renamed from: V */
        public CalendarCoverImageSet f40995V;

        /* renamed from: W */
        public String f40996W;

        /* renamed from: X */
        public String f40997X;

        /* renamed from: Y */
        public OfficialType f40998Y;

        /* renamed from: a */
        public String f40999a;

        /* renamed from: b */
        public String f41000b;

        /* renamed from: c */
        public String f41001c;

        /* renamed from: d */
        public String f41002d;

        /* renamed from: e */
        public String f41003e;

        /* renamed from: f */
        public String f41004f;

        /* renamed from: g */
        public Type f41005g;

        /* renamed from: h */
        public String f41006h;

        /* renamed from: i */
        public AccessRole f41007i;

        /* renamed from: j */
        public CalendarDirtyType f41008j;

        /* renamed from: k */
        public Integer f41009k;

        /* renamed from: l */
        public Integer f41010l;

        /* renamed from: m */
        public Integer f41011m;

        /* renamed from: n */
        public Boolean f41012n;

        /* renamed from: o */
        public Boolean f41013o;

        /* renamed from: p */
        public Boolean f41014p;

        /* renamed from: q */
        public Boolean f41015q;

        /* renamed from: r */
        public Boolean f41016r;

        /* renamed from: s */
        public Boolean f41017s;

        /* renamed from: t */
        public List<CalendarEventReminder> f41018t = Internal.newMutableList();

        /* renamed from: u */
        public Long f41019u;

        /* renamed from: v */
        public Long f41020v;

        /* renamed from: w */
        public AccessRole f41021w;

        /* renamed from: x */
        public Status f41022x;

        /* renamed from: y */
        public MappingColor f41023y;

        /* renamed from: z */
        public Source f41024z;

        /* renamed from: a */
        public C15508a mo56141a(String str) {
            this.f40999a = str;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56139a(Integer num) {
            this.f41009k = num;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56142a(List<CalendarEventReminder> list) {
            Internal.checkElementsNotNull(list);
            this.f41018t = list;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56140a(Long l) {
            this.f41019u = l;
            return this;
        }

        /* renamed from: a */
        public Calendar build() {
            String str;
            String str2;
            String str3 = this.f40999a;
            if (str3 != null && (str = this.f41000b) != null && (str2 = this.f41002d) != null) {
                return new Calendar(str3, str, this.f41001c, str2, this.f41003e, this.f41004f, this.f41005g, this.f41006h, this.f41007i, this.f41008j, this.f41009k, this.f41010l, this.f41011m, this.f41012n, this.f41013o, this.f41014p, this.f41015q, this.f41016r, this.f41017s, this.f41018t, this.f41019u, this.f41020v, this.f41021w, this.f41022x, this.f41023y, this.f41024z, this.f40974A, this.f40975B, this.f40976C, this.f40977D, this.f40978E, this.f40979F, this.f40980G, this.f40981H, this.f40982I, this.f40983J, this.f40984K, this.f40985L, this.f40986M, this.f40987N, this.f40988O, this.f40989P, this.f40990Q, this.f40991R, this.f40992S, this.f40993T, this.f40994U, this.f40995V, this.f40996W, this.f40997X, this.f40998Y, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f41000b, "server_id", this.f41002d, "user_id");
        }

        /* renamed from: a */
        public C15508a mo56129a(AccessRole accessRole) {
            this.f41007i = accessRole;
            return this;
        }

        /* renamed from: b */
        public C15508a mo56144b(AccessRole accessRole) {
            this.f41021w = accessRole;
            return this;
        }

        /* renamed from: c */
        public C15508a mo56149c(Boolean bool) {
            this.f41014p = bool;
            return this;
        }

        /* renamed from: d */
        public C15508a mo56152d(Boolean bool) {
            this.f41015q = bool;
            return this;
        }

        /* renamed from: e */
        public C15508a mo56155e(Boolean bool) {
            this.f41016r = bool;
            return this;
        }

        /* renamed from: f */
        public C15508a mo56157f(Boolean bool) {
            this.f41017s = bool;
            return this;
        }

        /* renamed from: g */
        public C15508a mo56159g(Boolean bool) {
            this.f40978E = bool;
            return this;
        }

        /* renamed from: h */
        public C15508a mo56161h(Boolean bool) {
            this.f40983J = bool;
            return this;
        }

        /* renamed from: i */
        public C15508a mo56163i(Boolean bool) {
            this.f40994U = bool;
            return this;
        }

        /* renamed from: j */
        public C15508a mo56165j(String str) {
            this.f40981H = str;
            return this;
        }

        /* renamed from: k */
        public C15508a mo56166k(String str) {
            this.f40990Q = str;
            return this;
        }

        /* renamed from: l */
        public C15508a mo56167l(String str) {
            this.f40996W = str;
            return this;
        }

        /* renamed from: m */
        public C15508a mo56168m(String str) {
            this.f40997X = str;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56130a(CalendarAuthInfo calendarAuthInfo) {
            this.f40989P = calendarAuthInfo;
            return this;
        }

        /* renamed from: b */
        public C15508a mo56145b(Boolean bool) {
            this.f41013o = bool;
            return this;
        }

        /* renamed from: c */
        public C15508a mo56150c(Integer num) {
            this.f41011m = num;
            return this;
        }

        /* renamed from: d */
        public C15508a mo56153d(Integer num) {
            this.f40977D = num;
            return this;
        }

        /* renamed from: e */
        public C15508a mo56156e(String str) {
            this.f41003e = str;
            return this;
        }

        /* renamed from: f */
        public C15508a mo56158f(String str) {
            this.f41004f = str;
            return this;
        }

        /* renamed from: g */
        public C15508a mo56160g(String str) {
            this.f41006h = str;
            return this;
        }

        /* renamed from: h */
        public C15508a mo56162h(String str) {
            this.f40974A = str;
            return this;
        }

        /* renamed from: i */
        public C15508a mo56164i(String str) {
            this.f40975B = str;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56131a(CalendarShareInfo calendarShareInfo) {
            this.f40993T = calendarShareInfo;
            return this;
        }

        /* renamed from: b */
        public C15508a mo56146b(Integer num) {
            this.f41010l = num;
            return this;
        }

        /* renamed from: c */
        public C15508a mo56151c(String str) {
            this.f41001c = str;
            return this;
        }

        /* renamed from: d */
        public C15508a mo56154d(String str) {
            this.f41002d = str;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56132a(CalendarShareOptions calendarShareOptions) {
            this.f40992S = calendarShareOptions;
            return this;
        }

        /* renamed from: b */
        public C15508a mo56147b(Long l) {
            this.f41020v = l;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56133a(Status status) {
            this.f41022x = status;
            return this;
        }

        /* renamed from: b */
        public C15508a mo56148b(String str) {
            this.f41000b = str;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56134a(Type type) {
            this.f41005g = type;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56135a(CalendarDirtyType calendarDirtyType) {
            this.f41008j = calendarDirtyType;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56136a(CalendarMember calendarMember) {
            this.f40976C = calendarMember;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56137a(WorkHourSetting workHourSetting) {
            this.f40982I = workHourSetting;
            return this;
        }

        /* renamed from: a */
        public C15508a mo56138a(Boolean bool) {
            this.f41012n = bool;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$b */
    private static final class C15509b extends ProtoAdapter<Calendar> {
        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Calendar calendar) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendar.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendar.server_id);
            if (calendar.email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendar.email);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, calendar.user_id);
            if (calendar.summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, calendar.summary);
            }
            if (calendar.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendar.description);
            }
            if (calendar.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 7, calendar.type);
            }
            if (calendar.default_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, calendar.default_timezone);
            }
            if (calendar.default_access_role != null) {
                AccessRole.ADAPTER.encodeWithTag(protoWriter, 9, calendar.default_access_role);
            }
            if (calendar.dirty_type != null) {
                CalendarDirtyType.ADAPTER.encodeWithTag(protoWriter, 10, calendar.dirty_type);
            }
            if (calendar.foreground_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, calendar.foreground_color);
            }
            if (calendar.background_color != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, calendar.background_color);
            }
            if (calendar.weight != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 13, calendar.weight);
            }
            if (calendar.is_default != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, calendar.is_default);
            }
            if (calendar.is_synced != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, calendar.is_synced);
            }
            if (calendar.is_visible != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, calendar.is_visible);
            }
            if (calendar.is_primary != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, calendar.is_primary);
            }
            if (calendar.is_public != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, calendar.is_public);
            }
            if (calendar.is_subscriber != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, calendar.is_subscriber);
            }
            CalendarEventReminder.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, calendar.default_reminders);
            if (calendar.create_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 21, calendar.create_time);
            }
            if (calendar.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 22, calendar.update_time);
            }
            if (calendar.self_access_role != null) {
                AccessRole.ADAPTER.encodeWithTag(protoWriter, 23, calendar.self_access_role);
            }
            if (calendar.self_status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 24, calendar.self_status);
            }
            if (calendar.cal_color != null) {
                MappingColor.ADAPTER.encodeWithTag(protoWriter, 25, calendar.cal_color);
            }
            if (calendar.source != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 26, calendar.source);
            }
            if (calendar.localized_summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 27, calendar.localized_summary);
            }
            if (calendar.note != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 28, calendar.note);
            }
            if (calendar.owner != null) {
                CalendarMember.ADAPTER.encodeWithTag(protoWriter, 29, calendar.owner);
            }
            if (calendar.resource_capacity != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 30, calendar.resource_capacity);
            }
            if (calendar.is_all_staff != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 31, calendar.is_all_staff);
            }
            if (calendar.is_active != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 32, calendar.is_active);
            }
            if (calendar.is_disabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 33, calendar.is_disabled);
            }
            if (calendar.external_account_email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 34, calendar.external_account_email);
            }
            if (calendar.work_hour_setting != null) {
                WorkHourSetting.ADAPTER.encodeWithTag(protoWriter, 35, calendar.work_hour_setting);
            }
            if (calendar.is_loading != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 36, calendar.is_loading);
            }
            if (calendar.visibility_property != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 37, calendar.visibility_property);
            }
            if (calendar.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 38, calendar.timezone);
            }
            if (calendar.calendar_event_schema != null) {
                CalendarSchemaCollection.ADAPTER.encodeWithTag(protoWriter, 39, calendar.calendar_event_schema);
            }
            if (calendar.calendar_schema != null) {
                CalendarSchemaCollection.ADAPTER.encodeWithTag(protoWriter, 40, calendar.calendar_schema);
            }
            if (calendar.schema_extra_data != null) {
                SchemaExtraData.ADAPTER.encodeWithTag(protoWriter, 41, calendar.schema_extra_data);
            }
            if (calendar.auth_info != null) {
                CalendarAuthInfo.ADAPTER.encodeWithTag(protoWriter, 42, calendar.auth_info);
            }
            if (calendar.successor_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 43, calendar.successor_chatter_id);
            }
            if (calendar.external_password_invalid != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 44, calendar.external_password_invalid);
            }
            if (calendar.share_options != null) {
                CalendarShareOptions.ADAPTER.encodeWithTag(protoWriter, 45, calendar.share_options);
            }
            if (calendar.share_info != null) {
                CalendarShareInfo.ADAPTER.encodeWithTag(protoWriter, 46, calendar.share_info);
            }
            if (calendar.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 47, calendar.is_cross_tenant);
            }
            if (calendar.cover_image_set != null) {
                CalendarCoverImageSet.ADAPTER.encodeWithTag(protoWriter, 48, calendar.cover_image_set);
            }
            if (calendar.calendar_owner_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 49, calendar.calendar_owner_id);
            }
            if (calendar.calendar_tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 50, calendar.calendar_tenant_id);
            }
            if (calendar.official_type != null) {
                OfficialType.ADAPTER.encodeWithTag(protoWriter, 51, calendar.official_type);
            }
            protoWriter.writeBytes(calendar.unknownFields());
        }

        C15509b() {
            super(FieldEncoding.LENGTH_DELIMITED, Calendar.class);
        }

        /* renamed from: a */
        public int encodedSize(Calendar calendar) {
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
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            int i38;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendar.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, calendar.server_id);
            int i47 = 0;
            if (calendar.email != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, calendar.email);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(4, calendar.user_id);
            if (calendar.summary != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, calendar.summary);
            } else {
                i2 = 0;
            }
            int i48 = encodedSizeWithTag2 + i2;
            if (calendar.description != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendar.description);
            } else {
                i3 = 0;
            }
            int i49 = i48 + i3;
            if (calendar.type != null) {
                i4 = Type.ADAPTER.encodedSizeWithTag(7, calendar.type);
            } else {
                i4 = 0;
            }
            int i50 = i49 + i4;
            if (calendar.default_timezone != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, calendar.default_timezone);
            } else {
                i5 = 0;
            }
            int i51 = i50 + i5;
            if (calendar.default_access_role != null) {
                i6 = AccessRole.ADAPTER.encodedSizeWithTag(9, calendar.default_access_role);
            } else {
                i6 = 0;
            }
            int i52 = i51 + i6;
            if (calendar.dirty_type != null) {
                i7 = CalendarDirtyType.ADAPTER.encodedSizeWithTag(10, calendar.dirty_type);
            } else {
                i7 = 0;
            }
            int i53 = i52 + i7;
            if (calendar.foreground_color != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(11, calendar.foreground_color);
            } else {
                i8 = 0;
            }
            int i54 = i53 + i8;
            if (calendar.background_color != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(12, calendar.background_color);
            } else {
                i9 = 0;
            }
            int i55 = i54 + i9;
            if (calendar.weight != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(13, calendar.weight);
            } else {
                i10 = 0;
            }
            int i56 = i55 + i10;
            if (calendar.is_default != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(14, calendar.is_default);
            } else {
                i11 = 0;
            }
            int i57 = i56 + i11;
            if (calendar.is_synced != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(15, calendar.is_synced);
            } else {
                i12 = 0;
            }
            int i58 = i57 + i12;
            if (calendar.is_visible != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(16, calendar.is_visible);
            } else {
                i13 = 0;
            }
            int i59 = i58 + i13;
            if (calendar.is_primary != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(17, calendar.is_primary);
            } else {
                i14 = 0;
            }
            int i60 = i59 + i14;
            if (calendar.is_public != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(18, calendar.is_public);
            } else {
                i15 = 0;
            }
            int i61 = i60 + i15;
            if (calendar.is_subscriber != null) {
                i16 = ProtoAdapter.BOOL.encodedSizeWithTag(19, calendar.is_subscriber);
            } else {
                i16 = 0;
            }
            int encodedSizeWithTag3 = i61 + i16 + CalendarEventReminder.ADAPTER.asRepeated().encodedSizeWithTag(20, calendar.default_reminders);
            if (calendar.create_time != null) {
                i17 = ProtoAdapter.INT64.encodedSizeWithTag(21, calendar.create_time);
            } else {
                i17 = 0;
            }
            int i62 = encodedSizeWithTag3 + i17;
            if (calendar.update_time != null) {
                i18 = ProtoAdapter.INT64.encodedSizeWithTag(22, calendar.update_time);
            } else {
                i18 = 0;
            }
            int i63 = i62 + i18;
            if (calendar.self_access_role != null) {
                i19 = AccessRole.ADAPTER.encodedSizeWithTag(23, calendar.self_access_role);
            } else {
                i19 = 0;
            }
            int i64 = i63 + i19;
            if (calendar.self_status != null) {
                i20 = Status.ADAPTER.encodedSizeWithTag(24, calendar.self_status);
            } else {
                i20 = 0;
            }
            int i65 = i64 + i20;
            if (calendar.cal_color != null) {
                i21 = MappingColor.ADAPTER.encodedSizeWithTag(25, calendar.cal_color);
            } else {
                i21 = 0;
            }
            int i66 = i65 + i21;
            if (calendar.source != null) {
                i22 = Source.ADAPTER.encodedSizeWithTag(26, calendar.source);
            } else {
                i22 = 0;
            }
            int i67 = i66 + i22;
            if (calendar.localized_summary != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(27, calendar.localized_summary);
            } else {
                i23 = 0;
            }
            int i68 = i67 + i23;
            if (calendar.note != null) {
                i24 = ProtoAdapter.STRING.encodedSizeWithTag(28, calendar.note);
            } else {
                i24 = 0;
            }
            int i69 = i68 + i24;
            if (calendar.owner != null) {
                i25 = CalendarMember.ADAPTER.encodedSizeWithTag(29, calendar.owner);
            } else {
                i25 = 0;
            }
            int i70 = i69 + i25;
            if (calendar.resource_capacity != null) {
                i26 = ProtoAdapter.INT32.encodedSizeWithTag(30, calendar.resource_capacity);
            } else {
                i26 = 0;
            }
            int i71 = i70 + i26;
            if (calendar.is_all_staff != null) {
                i27 = ProtoAdapter.BOOL.encodedSizeWithTag(31, calendar.is_all_staff);
            } else {
                i27 = 0;
            }
            int i72 = i71 + i27;
            if (calendar.is_active != null) {
                i28 = ProtoAdapter.BOOL.encodedSizeWithTag(32, calendar.is_active);
            } else {
                i28 = 0;
            }
            int i73 = i72 + i28;
            if (calendar.is_disabled != null) {
                i29 = ProtoAdapter.BOOL.encodedSizeWithTag(33, calendar.is_disabled);
            } else {
                i29 = 0;
            }
            int i74 = i73 + i29;
            if (calendar.external_account_email != null) {
                i30 = ProtoAdapter.STRING.encodedSizeWithTag(34, calendar.external_account_email);
            } else {
                i30 = 0;
            }
            int i75 = i74 + i30;
            if (calendar.work_hour_setting != null) {
                i31 = WorkHourSetting.ADAPTER.encodedSizeWithTag(35, calendar.work_hour_setting);
            } else {
                i31 = 0;
            }
            int i76 = i75 + i31;
            if (calendar.is_loading != null) {
                i32 = ProtoAdapter.BOOL.encodedSizeWithTag(36, calendar.is_loading);
            } else {
                i32 = 0;
            }
            int i77 = i76 + i32;
            if (calendar.visibility_property != null) {
                i33 = ProtoAdapter.INT32.encodedSizeWithTag(37, calendar.visibility_property);
            } else {
                i33 = 0;
            }
            int i78 = i77 + i33;
            if (calendar.timezone != null) {
                i34 = ProtoAdapter.STRING.encodedSizeWithTag(38, calendar.timezone);
            } else {
                i34 = 0;
            }
            int i79 = i78 + i34;
            if (calendar.calendar_event_schema != null) {
                i35 = CalendarSchemaCollection.ADAPTER.encodedSizeWithTag(39, calendar.calendar_event_schema);
            } else {
                i35 = 0;
            }
            int i80 = i79 + i35;
            if (calendar.calendar_schema != null) {
                i36 = CalendarSchemaCollection.ADAPTER.encodedSizeWithTag(40, calendar.calendar_schema);
            } else {
                i36 = 0;
            }
            int i81 = i80 + i36;
            if (calendar.schema_extra_data != null) {
                i37 = SchemaExtraData.ADAPTER.encodedSizeWithTag(41, calendar.schema_extra_data);
            } else {
                i37 = 0;
            }
            int i82 = i81 + i37;
            if (calendar.auth_info != null) {
                i38 = CalendarAuthInfo.ADAPTER.encodedSizeWithTag(42, calendar.auth_info);
            } else {
                i38 = 0;
            }
            int i83 = i82 + i38;
            if (calendar.successor_chatter_id != null) {
                i39 = ProtoAdapter.STRING.encodedSizeWithTag(43, calendar.successor_chatter_id);
            } else {
                i39 = 0;
            }
            int i84 = i83 + i39;
            if (calendar.external_password_invalid != null) {
                i40 = ProtoAdapter.BOOL.encodedSizeWithTag(44, calendar.external_password_invalid);
            } else {
                i40 = 0;
            }
            int i85 = i84 + i40;
            if (calendar.share_options != null) {
                i41 = CalendarShareOptions.ADAPTER.encodedSizeWithTag(45, calendar.share_options);
            } else {
                i41 = 0;
            }
            int i86 = i85 + i41;
            if (calendar.share_info != null) {
                i42 = CalendarShareInfo.ADAPTER.encodedSizeWithTag(46, calendar.share_info);
            } else {
                i42 = 0;
            }
            int i87 = i86 + i42;
            if (calendar.is_cross_tenant != null) {
                i43 = ProtoAdapter.BOOL.encodedSizeWithTag(47, calendar.is_cross_tenant);
            } else {
                i43 = 0;
            }
            int i88 = i87 + i43;
            if (calendar.cover_image_set != null) {
                i44 = CalendarCoverImageSet.ADAPTER.encodedSizeWithTag(48, calendar.cover_image_set);
            } else {
                i44 = 0;
            }
            int i89 = i88 + i44;
            if (calendar.calendar_owner_id != null) {
                i45 = ProtoAdapter.STRING.encodedSizeWithTag(49, calendar.calendar_owner_id);
            } else {
                i45 = 0;
            }
            int i90 = i89 + i45;
            if (calendar.calendar_tenant_id != null) {
                i46 = ProtoAdapter.STRING.encodedSizeWithTag(50, calendar.calendar_tenant_id);
            } else {
                i46 = 0;
            }
            int i91 = i90 + i46;
            if (calendar.official_type != null) {
                i47 = OfficialType.ADAPTER.encodedSizeWithTag(51, calendar.official_type);
            }
            return i91 + i47 + calendar.unknownFields().size();
        }

        /* renamed from: a */
        public Calendar decode(ProtoReader protoReader) throws IOException {
            C15508a aVar = new C15508a();
            aVar.f40999a = "";
            aVar.f41000b = "";
            aVar.f41001c = "";
            aVar.f41002d = "";
            aVar.f41003e = "";
            aVar.f41004f = "";
            aVar.f41005g = Type.PRIMARY;
            aVar.f41006h = "UTC";
            aVar.f41007i = AccessRole.FREE_BUSY_READER;
            aVar.f41008j = CalendarDirtyType.NONE_DIRTY_TYPE;
            aVar.f41009k = -1;
            aVar.f41010l = -1;
            aVar.f41011m = 0;
            aVar.f41012n = false;
            aVar.f41013o = true;
            aVar.f41014p = true;
            aVar.f41015q = false;
            aVar.f41016r = false;
            aVar.f41017s = false;
            aVar.f41019u = 0L;
            aVar.f41020v = 0L;
            aVar.f41021w = AccessRole.FREE_BUSY_READER;
            aVar.f41022x = Status.DEFAULT;
            aVar.f41024z = Source.NORMAL;
            aVar.f40974A = "";
            aVar.f40975B = "";
            aVar.f40977D = 0;
            aVar.f40978E = false;
            aVar.f40979F = false;
            aVar.f40980G = false;
            aVar.f40981H = "";
            aVar.f40983J = false;
            aVar.f40984K = 0;
            aVar.f40985L = "";
            aVar.f40990Q = "";
            aVar.f40991R = false;
            aVar.f40994U = false;
            aVar.f40996W = "";
            aVar.f40997X = "";
            aVar.f40998Y = OfficialType.NOT_OFFICIAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40999a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41000b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41001c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41002d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41003e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41004f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f41005g = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 8:
                            aVar.f41006h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f41007i = AccessRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 10:
                            try {
                                aVar.f41008j = CalendarDirtyType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 11:
                            aVar.f41009k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41010l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41011m = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41012n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41013o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f41014p = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 17:
                            aVar.f41015q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f41016r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f41017s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            aVar.f41018t.add(CalendarEventReminder.ADAPTER.decode(protoReader));
                            break;
                        case 21:
                            aVar.f41019u = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 22:
                            aVar.f41020v = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 23:
                            try {
                                aVar.f41021w = AccessRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 24:
                            try {
                                aVar.f41022x = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f41023y = MappingColor.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            try {
                                aVar.f41024z = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f40974A = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            aVar.f40975B = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            aVar.f40976C = CalendarMember.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            aVar.f40977D = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            aVar.f40978E = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 32:
                            aVar.f40979F = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 33:
                            aVar.f40980G = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 34:
                            aVar.f40981H = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 35:
                            aVar.f40982I = WorkHourSetting.ADAPTER.decode(protoReader);
                            break;
                        case 36:
                            aVar.f40983J = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 37:
                            aVar.f40984K = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 38:
                            aVar.f40985L = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 39:
                            aVar.f40986M = CalendarSchemaCollection.ADAPTER.decode(protoReader);
                            break;
                        case 40:
                            aVar.f40987N = CalendarSchemaCollection.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            aVar.f40988O = SchemaExtraData.ADAPTER.decode(protoReader);
                            break;
                        case 42:
                            aVar.f40989P = CalendarAuthInfo.ADAPTER.decode(protoReader);
                            break;
                        case 43:
                            aVar.f40990Q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 44:
                            aVar.f40991R = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 45:
                            aVar.f40992S = CalendarShareOptions.ADAPTER.decode(protoReader);
                            break;
                        case 46:
                            aVar.f40993T = CalendarShareInfo.ADAPTER.decode(protoReader);
                            break;
                        case 47:
                            aVar.f40994U = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 48:
                            aVar.f40995V = CalendarCoverImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 49:
                            aVar.f40996W = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                            aVar.f40997X = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 51:
                            try {
                                aVar.f40998Y = OfficialType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e7.value));
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
    }

    public static final class CalendarAuthInfo extends Message<CalendarAuthInfo, C15500a> {
        public static final ProtoAdapter<CalendarAuthInfo> ADAPTER = new C15501b();
        private static final long serialVersionUID = 0;
        public final CalendarEditAuthInfo edit_auth_info;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarAuthInfo$b */
        private static final class C15501b extends ProtoAdapter<CalendarAuthInfo> {
            C15501b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarAuthInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarAuthInfo calendarAuthInfo) {
                int i;
                if (calendarAuthInfo.edit_auth_info != null) {
                    i = CalendarEditAuthInfo.ADAPTER.encodedSizeWithTag(1, calendarAuthInfo.edit_auth_info);
                } else {
                    i = 0;
                }
                return i + calendarAuthInfo.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarAuthInfo decode(ProtoReader protoReader) throws IOException {
                C15500a aVar = new C15500a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40959a = CalendarEditAuthInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CalendarAuthInfo calendarAuthInfo) throws IOException {
                if (calendarAuthInfo.edit_auth_info != null) {
                    CalendarEditAuthInfo.ADAPTER.encodeWithTag(protoWriter, 1, calendarAuthInfo.edit_auth_info);
                }
                protoWriter.writeBytes(calendarAuthInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarAuthInfo$a */
        public static final class C15500a extends Message.Builder<CalendarAuthInfo, C15500a> {

            /* renamed from: a */
            public CalendarEditAuthInfo f40959a;

            /* renamed from: a */
            public CalendarAuthInfo build() {
                return new CalendarAuthInfo(this.f40959a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15500a newBuilder() {
            C15500a aVar = new C15500a();
            aVar.f40959a = this.edit_auth_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CalendarAuthInfo");
            StringBuilder sb = new StringBuilder();
            if (this.edit_auth_info != null) {
                sb.append(", edit_auth_info=");
                sb.append(this.edit_auth_info);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarAuthInfo{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarAuthInfo(CalendarEditAuthInfo calendarEditAuthInfo) {
            this(calendarEditAuthInfo, ByteString.EMPTY);
        }

        public CalendarAuthInfo(CalendarEditAuthInfo calendarEditAuthInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.edit_auth_info = calendarEditAuthInfo;
        }
    }

    public static final class CalendarEditAuthInfo extends Message<CalendarEditAuthInfo, C15502a> {
        public static final ProtoAdapter<CalendarEditAuthInfo> ADAPTER = new C15503b();
        public static final Boolean DEFAULT_IS_COLOR_EDITABLE = false;
        public static final Boolean DEFAULT_IS_COVER_IMAGE_EDITABLE = false;
        public static final Boolean DEFAULT_IS_DELETABLE = false;
        public static final Boolean DEFAULT_IS_DISCRIPTION_EDITABLE = false;
        public static final Boolean DEFAULT_IS_MEMBER_EDITABLE = false;
        public static final Boolean DEFAULT_IS_NOTE_EDITABLE = false;
        public static final Boolean DEFAULT_IS_SUMMARY_EDITABLE = false;
        public static final Boolean DEFAULT_IS_UNSUBSCRIBABLE = false;
        public static final Boolean DEFAULT_IS_VISIBILITY_EDITABLE = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_color_editable;
        public final Boolean is_cover_image_editable;
        public final Boolean is_deletable;
        public final Boolean is_discription_editable;
        public final Boolean is_member_editable;
        public final Boolean is_note_editable;
        public final Boolean is_summary_editable;
        public final Boolean is_unsubscribable;
        public final Boolean is_visibility_editable;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarEditAuthInfo$b */
        private static final class C15503b extends ProtoAdapter<CalendarEditAuthInfo> {
            C15503b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarEditAuthInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarEditAuthInfo calendarEditAuthInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9 = 0;
                if (calendarEditAuthInfo.is_summary_editable != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, calendarEditAuthInfo.is_summary_editable);
                } else {
                    i = 0;
                }
                if (calendarEditAuthInfo.is_note_editable != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, calendarEditAuthInfo.is_note_editable);
                } else {
                    i2 = 0;
                }
                int i10 = i + i2;
                if (calendarEditAuthInfo.is_visibility_editable != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, calendarEditAuthInfo.is_visibility_editable);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (calendarEditAuthInfo.is_color_editable != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, calendarEditAuthInfo.is_color_editable);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (calendarEditAuthInfo.is_discription_editable != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, calendarEditAuthInfo.is_discription_editable);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (calendarEditAuthInfo.is_member_editable != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, calendarEditAuthInfo.is_member_editable);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (calendarEditAuthInfo.is_unsubscribable != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, calendarEditAuthInfo.is_unsubscribable);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (calendarEditAuthInfo.is_deletable != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, calendarEditAuthInfo.is_deletable);
                } else {
                    i8 = 0;
                }
                int i16 = i15 + i8;
                if (calendarEditAuthInfo.is_cover_image_editable != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, calendarEditAuthInfo.is_cover_image_editable);
                }
                return i16 + i9 + calendarEditAuthInfo.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarEditAuthInfo decode(ProtoReader protoReader) throws IOException {
                C15502a aVar = new C15502a();
                aVar.f40960a = false;
                aVar.f40961b = false;
                aVar.f40962c = false;
                aVar.f40963d = false;
                aVar.f40964e = false;
                aVar.f40965f = false;
                aVar.f40966g = false;
                aVar.f40967h = false;
                aVar.f40968i = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f40960a = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 2:
                                aVar.f40961b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f40962c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f40963d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f40964e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f40965f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f40966g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                aVar.f40967h = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 9:
                                aVar.f40968i = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, CalendarEditAuthInfo calendarEditAuthInfo) throws IOException {
                if (calendarEditAuthInfo.is_summary_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, calendarEditAuthInfo.is_summary_editable);
                }
                if (calendarEditAuthInfo.is_note_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, calendarEditAuthInfo.is_note_editable);
                }
                if (calendarEditAuthInfo.is_visibility_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, calendarEditAuthInfo.is_visibility_editable);
                }
                if (calendarEditAuthInfo.is_color_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, calendarEditAuthInfo.is_color_editable);
                }
                if (calendarEditAuthInfo.is_discription_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, calendarEditAuthInfo.is_discription_editable);
                }
                if (calendarEditAuthInfo.is_member_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, calendarEditAuthInfo.is_member_editable);
                }
                if (calendarEditAuthInfo.is_unsubscribable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, calendarEditAuthInfo.is_unsubscribable);
                }
                if (calendarEditAuthInfo.is_deletable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, calendarEditAuthInfo.is_deletable);
                }
                if (calendarEditAuthInfo.is_cover_image_editable != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, calendarEditAuthInfo.is_cover_image_editable);
                }
                protoWriter.writeBytes(calendarEditAuthInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarEditAuthInfo$a */
        public static final class C15502a extends Message.Builder<CalendarEditAuthInfo, C15502a> {

            /* renamed from: a */
            public Boolean f40960a;

            /* renamed from: b */
            public Boolean f40961b;

            /* renamed from: c */
            public Boolean f40962c;

            /* renamed from: d */
            public Boolean f40963d;

            /* renamed from: e */
            public Boolean f40964e;

            /* renamed from: f */
            public Boolean f40965f;

            /* renamed from: g */
            public Boolean f40966g;

            /* renamed from: h */
            public Boolean f40967h;

            /* renamed from: i */
            public Boolean f40968i;

            /* renamed from: a */
            public CalendarEditAuthInfo build() {
                return new CalendarEditAuthInfo(this.f40960a, this.f40961b, this.f40962c, this.f40963d, this.f40964e, this.f40965f, this.f40966g, this.f40967h, this.f40968i, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15502a newBuilder() {
            C15502a aVar = new C15502a();
            aVar.f40960a = this.is_summary_editable;
            aVar.f40961b = this.is_note_editable;
            aVar.f40962c = this.is_visibility_editable;
            aVar.f40963d = this.is_color_editable;
            aVar.f40964e = this.is_discription_editable;
            aVar.f40965f = this.is_member_editable;
            aVar.f40966g = this.is_unsubscribable;
            aVar.f40967h = this.is_deletable;
            aVar.f40968i = this.is_cover_image_editable;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CalendarEditAuthInfo");
            StringBuilder sb = new StringBuilder();
            if (this.is_summary_editable != null) {
                sb.append(", is_summary_editable=");
                sb.append(this.is_summary_editable);
            }
            if (this.is_note_editable != null) {
                sb.append(", is_note_editable=");
                sb.append(this.is_note_editable);
            }
            if (this.is_visibility_editable != null) {
                sb.append(", is_visibility_editable=");
                sb.append(this.is_visibility_editable);
            }
            if (this.is_color_editable != null) {
                sb.append(", is_color_editable=");
                sb.append(this.is_color_editable);
            }
            if (this.is_discription_editable != null) {
                sb.append(", is_discription_editable=");
                sb.append(this.is_discription_editable);
            }
            if (this.is_member_editable != null) {
                sb.append(", is_member_editable=");
                sb.append(this.is_member_editable);
            }
            if (this.is_unsubscribable != null) {
                sb.append(", is_unsubscribable=");
                sb.append(this.is_unsubscribable);
            }
            if (this.is_deletable != null) {
                sb.append(", is_deletable=");
                sb.append(this.is_deletable);
            }
            if (this.is_cover_image_editable != null) {
                sb.append(", is_cover_image_editable=");
                sb.append(this.is_cover_image_editable);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarEditAuthInfo{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarEditAuthInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
            this(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, ByteString.EMPTY);
        }

        public CalendarEditAuthInfo(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_summary_editable = bool;
            this.is_note_editable = bool2;
            this.is_visibility_editable = bool3;
            this.is_color_editable = bool4;
            this.is_discription_editable = bool5;
            this.is_member_editable = bool6;
            this.is_unsubscribable = bool7;
            this.is_deletable = bool8;
            this.is_cover_image_editable = bool9;
        }
    }

    public static final class CalendarShareInfo extends Message<CalendarShareInfo, C15504a> {
        public static final ProtoAdapter<CalendarShareInfo> ADAPTER = new C15505b();
        public static final Integer DEFAULT_SUBSCRIBER_NUM = 0;
        private static final long serialVersionUID = 0;
        public final String share_url;
        public final Integer subscriber_num;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarShareInfo$b */
        private static final class C15505b extends ProtoAdapter<CalendarShareInfo> {
            C15505b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarShareInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarShareInfo calendarShareInfo) {
                int i;
                int i2 = 0;
                if (calendarShareInfo.share_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarShareInfo.share_url);
                } else {
                    i = 0;
                }
                if (calendarShareInfo.subscriber_num != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, calendarShareInfo.subscriber_num);
                }
                return i + i2 + calendarShareInfo.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarShareInfo decode(ProtoReader protoReader) throws IOException {
                C15504a aVar = new C15504a();
                aVar.f40969a = "";
                aVar.f40970b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40969a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f40970b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CalendarShareInfo calendarShareInfo) throws IOException {
                if (calendarShareInfo.share_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarShareInfo.share_url);
                }
                if (calendarShareInfo.subscriber_num != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, calendarShareInfo.subscriber_num);
                }
                protoWriter.writeBytes(calendarShareInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarShareInfo$a */
        public static final class C15504a extends Message.Builder<CalendarShareInfo, C15504a> {

            /* renamed from: a */
            public String f40969a;

            /* renamed from: b */
            public Integer f40970b;

            /* renamed from: a */
            public CalendarShareInfo build() {
                return new CalendarShareInfo(this.f40969a, this.f40970b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15504a newBuilder() {
            C15504a aVar = new C15504a();
            aVar.f40969a = this.share_url;
            aVar.f40970b = this.subscriber_num;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CalendarShareInfo");
            StringBuilder sb = new StringBuilder();
            if (this.share_url != null) {
                sb.append(", share_url=");
                sb.append(this.share_url);
            }
            if (this.subscriber_num != null) {
                sb.append(", subscriber_num=");
                sb.append(this.subscriber_num);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarShareInfo{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarShareInfo(String str, Integer num) {
            this(str, num, ByteString.EMPTY);
        }

        public CalendarShareInfo(String str, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.share_url = str;
            this.subscriber_num = num;
        }
    }

    public static final class CalendarShareOptions extends Message<CalendarShareOptions, C15506a> {
        public static final ProtoAdapter<CalendarShareOptions> ADAPTER = new C15507b();
        public static final ShareOption DEFAULT_CROSS_DEFAULT_SHARE_OPTION = ShareOption.UNKNOWN_SHARE_OPT;
        public static final ShareOption DEFAULT_CROSS_TOP_SHARE_OPTION = ShareOption.UNKNOWN_SHARE_OPT;
        public static final ShareOption DEFAULT_DEFAULT_SHARE_OPTION = ShareOption.UNKNOWN_SHARE_OPT;
        private static final long serialVersionUID = 0;
        public final ShareOption cross_default_share_option;
        public final ShareOption cross_top_share_option;
        public final ShareOption default_share_option;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarShareOptions$b */
        private static final class C15507b extends ProtoAdapter<CalendarShareOptions> {
            C15507b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarShareOptions.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarShareOptions calendarShareOptions) {
                int i;
                int i2;
                int i3 = 0;
                if (calendarShareOptions.default_share_option != null) {
                    i = ShareOption.ADAPTER.encodedSizeWithTag(1, calendarShareOptions.default_share_option);
                } else {
                    i = 0;
                }
                if (calendarShareOptions.cross_default_share_option != null) {
                    i2 = ShareOption.ADAPTER.encodedSizeWithTag(2, calendarShareOptions.cross_default_share_option);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (calendarShareOptions.cross_top_share_option != null) {
                    i3 = ShareOption.ADAPTER.encodedSizeWithTag(3, calendarShareOptions.cross_top_share_option);
                }
                return i4 + i3 + calendarShareOptions.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarShareOptions decode(ProtoReader protoReader) throws IOException {
                C15506a aVar = new C15506a();
                aVar.f40971a = ShareOption.UNKNOWN_SHARE_OPT;
                aVar.f40972b = ShareOption.UNKNOWN_SHARE_OPT;
                aVar.f40973c = ShareOption.UNKNOWN_SHARE_OPT;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f40971a = ShareOption.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        try {
                            aVar.f40972b = ShareOption.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f40973c = ShareOption.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CalendarShareOptions calendarShareOptions) throws IOException {
                if (calendarShareOptions.default_share_option != null) {
                    ShareOption.ADAPTER.encodeWithTag(protoWriter, 1, calendarShareOptions.default_share_option);
                }
                if (calendarShareOptions.cross_default_share_option != null) {
                    ShareOption.ADAPTER.encodeWithTag(protoWriter, 2, calendarShareOptions.cross_default_share_option);
                }
                if (calendarShareOptions.cross_top_share_option != null) {
                    ShareOption.ADAPTER.encodeWithTag(protoWriter, 3, calendarShareOptions.cross_top_share_option);
                }
                protoWriter.writeBytes(calendarShareOptions.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.Calendar$CalendarShareOptions$a */
        public static final class C15506a extends Message.Builder<CalendarShareOptions, C15506a> {

            /* renamed from: a */
            public ShareOption f40971a;

            /* renamed from: b */
            public ShareOption f40972b;

            /* renamed from: c */
            public ShareOption f40973c;

            /* renamed from: a */
            public CalendarShareOptions build() {
                return new CalendarShareOptions(this.f40971a, this.f40972b, this.f40973c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15506a mo56122a(ShareOption shareOption) {
                this.f40971a = shareOption;
                return this;
            }

            /* renamed from: b */
            public C15506a mo56124b(ShareOption shareOption) {
                this.f40972b = shareOption;
                return this;
            }

            /* renamed from: c */
            public C15506a mo56125c(ShareOption shareOption) {
                this.f40973c = shareOption;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15506a newBuilder() {
            C15506a aVar = new C15506a();
            aVar.f40971a = this.default_share_option;
            aVar.f40972b = this.cross_default_share_option;
            aVar.f40973c = this.cross_top_share_option;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CalendarShareOptions");
            StringBuilder sb = new StringBuilder();
            if (this.default_share_option != null) {
                sb.append(", default_share_option=");
                sb.append(this.default_share_option);
            }
            if (this.cross_default_share_option != null) {
                sb.append(", cross_default_share_option=");
                sb.append(this.cross_default_share_option);
            }
            if (this.cross_top_share_option != null) {
                sb.append(", cross_top_share_option=");
                sb.append(this.cross_top_share_option);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarShareOptions{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarShareOptions(ShareOption shareOption, ShareOption shareOption2, ShareOption shareOption3) {
            this(shareOption, shareOption2, shareOption3, ByteString.EMPTY);
        }

        public CalendarShareOptions(ShareOption shareOption, ShareOption shareOption2, ShareOption shareOption3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.default_share_option = shareOption;
            this.cross_default_share_option = shareOption2;
            this.cross_top_share_option = shareOption3;
        }
    }

    @Override // com.squareup.wire.Message
    public C15508a newBuilder() {
        C15508a aVar = new C15508a();
        aVar.f40999a = this.id;
        aVar.f41000b = this.server_id;
        aVar.f41001c = this.email;
        aVar.f41002d = this.user_id;
        aVar.f41003e = this.summary;
        aVar.f41004f = this.description;
        aVar.f41005g = this.type;
        aVar.f41006h = this.default_timezone;
        aVar.f41007i = this.default_access_role;
        aVar.f41008j = this.dirty_type;
        aVar.f41009k = this.foreground_color;
        aVar.f41010l = this.background_color;
        aVar.f41011m = this.weight;
        aVar.f41012n = this.is_default;
        aVar.f41013o = this.is_synced;
        aVar.f41014p = this.is_visible;
        aVar.f41015q = this.is_primary;
        aVar.f41016r = this.is_public;
        aVar.f41017s = this.is_subscriber;
        aVar.f41018t = Internal.copyOf("default_reminders", this.default_reminders);
        aVar.f41019u = this.create_time;
        aVar.f41020v = this.update_time;
        aVar.f41021w = this.self_access_role;
        aVar.f41022x = this.self_status;
        aVar.f41023y = this.cal_color;
        aVar.f41024z = this.source;
        aVar.f40974A = this.localized_summary;
        aVar.f40975B = this.note;
        aVar.f40976C = this.owner;
        aVar.f40977D = this.resource_capacity;
        aVar.f40978E = this.is_all_staff;
        aVar.f40979F = this.is_active;
        aVar.f40980G = this.is_disabled;
        aVar.f40981H = this.external_account_email;
        aVar.f40982I = this.work_hour_setting;
        aVar.f40983J = this.is_loading;
        aVar.f40984K = this.visibility_property;
        aVar.f40985L = this.timezone;
        aVar.f40986M = this.calendar_event_schema;
        aVar.f40987N = this.calendar_schema;
        aVar.f40988O = this.schema_extra_data;
        aVar.f40989P = this.auth_info;
        aVar.f40990Q = this.successor_chatter_id;
        aVar.f40991R = this.external_password_invalid;
        aVar.f40992S = this.share_options;
        aVar.f40993T = this.share_info;
        aVar.f40994U = this.is_cross_tenant;
        aVar.f40995V = this.cover_image_set;
        aVar.f40996W = this.calendar_owner_id;
        aVar.f40997X = this.calendar_tenant_id;
        aVar.f40998Y = this.official_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "Calendar");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", server_id=");
        sb.append(this.server_id);
        if (this.email != null) {
            sb.append(", email=");
            sb.append(this.email);
        }
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.default_timezone != null) {
            sb.append(", default_timezone=");
            sb.append(this.default_timezone);
        }
        if (this.default_access_role != null) {
            sb.append(", default_access_role=");
            sb.append(this.default_access_role);
        }
        if (this.dirty_type != null) {
            sb.append(", dirty_type=");
            sb.append(this.dirty_type);
        }
        if (this.foreground_color != null) {
            sb.append(", foreground_color=");
            sb.append(this.foreground_color);
        }
        if (this.background_color != null) {
            sb.append(", background_color=");
            sb.append(this.background_color);
        }
        if (this.weight != null) {
            sb.append(", weight=");
            sb.append(this.weight);
        }
        if (this.is_default != null) {
            sb.append(", is_default=");
            sb.append(this.is_default);
        }
        if (this.is_synced != null) {
            sb.append(", is_synced=");
            sb.append(this.is_synced);
        }
        if (this.is_visible != null) {
            sb.append(", is_visible=");
            sb.append(this.is_visible);
        }
        if (this.is_primary != null) {
            sb.append(", is_primary=");
            sb.append(this.is_primary);
        }
        if (this.is_public != null) {
            sb.append(", is_public=");
            sb.append(this.is_public);
        }
        if (this.is_subscriber != null) {
            sb.append(", is_subscriber=");
            sb.append(this.is_subscriber);
        }
        if (!this.default_reminders.isEmpty()) {
            sb.append(", default_reminders=");
            sb.append(this.default_reminders);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.self_access_role != null) {
            sb.append(", self_access_role=");
            sb.append(this.self_access_role);
        }
        if (this.self_status != null) {
            sb.append(", self_status=");
            sb.append(this.self_status);
        }
        if (this.cal_color != null) {
            sb.append(", cal_color=");
            sb.append(this.cal_color);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.localized_summary != null) {
            sb.append(", localized_summary=");
            sb.append(this.localized_summary);
        }
        if (this.note != null) {
            sb.append(", note=");
            sb.append(this.note);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.resource_capacity != null) {
            sb.append(", resource_capacity=");
            sb.append(this.resource_capacity);
        }
        if (this.is_all_staff != null) {
            sb.append(", is_all_staff=");
            sb.append(this.is_all_staff);
        }
        if (this.is_active != null) {
            sb.append(", is_active=");
            sb.append(this.is_active);
        }
        if (this.is_disabled != null) {
            sb.append(", is_disabled=");
            sb.append(this.is_disabled);
        }
        if (this.external_account_email != null) {
            sb.append(", external_account_email=");
            sb.append(this.external_account_email);
        }
        if (this.work_hour_setting != null) {
            sb.append(", work_hour_setting=");
            sb.append(this.work_hour_setting);
        }
        if (this.is_loading != null) {
            sb.append(", is_loading=");
            sb.append(this.is_loading);
        }
        if (this.visibility_property != null) {
            sb.append(", visibility_property=");
            sb.append(this.visibility_property);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.calendar_event_schema != null) {
            sb.append(", calendar_event_schema=");
            sb.append(this.calendar_event_schema);
        }
        if (this.calendar_schema != null) {
            sb.append(", calendar_schema=");
            sb.append(this.calendar_schema);
        }
        if (this.schema_extra_data != null) {
            sb.append(", schema_extra_data=");
            sb.append(this.schema_extra_data);
        }
        if (this.auth_info != null) {
            sb.append(", auth_info=");
            sb.append(this.auth_info);
        }
        if (this.successor_chatter_id != null) {
            sb.append(", successor_chatter_id=");
            sb.append(this.successor_chatter_id);
        }
        if (this.external_password_invalid != null) {
            sb.append(", external_password_invalid=");
            sb.append(this.external_password_invalid);
        }
        if (this.share_options != null) {
            sb.append(", share_options=");
            sb.append(this.share_options);
        }
        if (this.share_info != null) {
            sb.append(", share_info=");
            sb.append(this.share_info);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.cover_image_set != null) {
            sb.append(", cover_image_set=");
            sb.append(this.cover_image_set);
        }
        if (this.calendar_owner_id != null) {
            sb.append(", calendar_owner_id=");
            sb.append(this.calendar_owner_id);
        }
        if (this.calendar_tenant_id != null) {
            sb.append(", calendar_tenant_id=");
            sb.append(this.calendar_tenant_id);
        }
        if (this.official_type != null) {
            sb.append(", official_type=");
            sb.append(this.official_type);
        }
        StringBuilder replace = sb.replace(0, 2, "Calendar{");
        replace.append('}');
        return replace.toString();
    }

    public Calendar(String str, String str2, String str3, String str4, String str5, String str6, Type type2, String str7, AccessRole accessRole, CalendarDirtyType calendarDirtyType, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<CalendarEventReminder> list, Long l, Long l2, AccessRole accessRole2, Status status, MappingColor mappingColor, Source source2, String str8, String str9, CalendarMember calendarMember, Integer num4, Boolean bool7, Boolean bool8, Boolean bool9, String str10, WorkHourSetting workHourSetting, Boolean bool10, Integer num5, String str11, CalendarSchemaCollection calendarSchemaCollection, CalendarSchemaCollection calendarSchemaCollection2, SchemaExtraData schemaExtraData, CalendarAuthInfo calendarAuthInfo, String str12, Boolean bool11, CalendarShareOptions calendarShareOptions, CalendarShareInfo calendarShareInfo, Boolean bool12, CalendarCoverImageSet calendarCoverImageSet, String str13, String str14, OfficialType officialType) {
        this(str, str2, str3, str4, str5, str6, type2, str7, accessRole, calendarDirtyType, num, num2, num3, bool, bool2, bool3, bool4, bool5, bool6, list, l, l2, accessRole2, status, mappingColor, source2, str8, str9, calendarMember, num4, bool7, bool8, bool9, str10, workHourSetting, bool10, num5, str11, calendarSchemaCollection, calendarSchemaCollection2, schemaExtraData, calendarAuthInfo, str12, bool11, calendarShareOptions, calendarShareInfo, bool12, calendarCoverImageSet, str13, str14, officialType, ByteString.EMPTY);
    }

    public Calendar(String str, String str2, String str3, String str4, String str5, String str6, Type type2, String str7, AccessRole accessRole, CalendarDirtyType calendarDirtyType, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<CalendarEventReminder> list, Long l, Long l2, AccessRole accessRole2, Status status, MappingColor mappingColor, Source source2, String str8, String str9, CalendarMember calendarMember, Integer num4, Boolean bool7, Boolean bool8, Boolean bool9, String str10, WorkHourSetting workHourSetting, Boolean bool10, Integer num5, String str11, CalendarSchemaCollection calendarSchemaCollection, CalendarSchemaCollection calendarSchemaCollection2, SchemaExtraData schemaExtraData, CalendarAuthInfo calendarAuthInfo, String str12, Boolean bool11, CalendarShareOptions calendarShareOptions, CalendarShareInfo calendarShareInfo, Boolean bool12, CalendarCoverImageSet calendarCoverImageSet, String str13, String str14, OfficialType officialType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.server_id = str2;
        this.email = str3;
        this.user_id = str4;
        this.summary = str5;
        this.description = str6;
        this.type = type2;
        this.default_timezone = str7;
        this.default_access_role = accessRole;
        this.dirty_type = calendarDirtyType;
        this.foreground_color = num;
        this.background_color = num2;
        this.weight = num3;
        this.is_default = bool;
        this.is_synced = bool2;
        this.is_visible = bool3;
        this.is_primary = bool4;
        this.is_public = bool5;
        this.is_subscriber = bool6;
        this.default_reminders = Internal.immutableCopyOf("default_reminders", list);
        this.create_time = l;
        this.update_time = l2;
        this.self_access_role = accessRole2;
        this.self_status = status;
        this.cal_color = mappingColor;
        this.source = source2;
        this.localized_summary = str8;
        this.note = str9;
        this.owner = calendarMember;
        this.resource_capacity = num4;
        this.is_all_staff = bool7;
        this.is_active = bool8;
        this.is_disabled = bool9;
        this.external_account_email = str10;
        this.work_hour_setting = workHourSetting;
        this.is_loading = bool10;
        this.visibility_property = num5;
        this.timezone = str11;
        this.calendar_event_schema = calendarSchemaCollection;
        this.calendar_schema = calendarSchemaCollection2;
        this.schema_extra_data = schemaExtraData;
        this.auth_info = calendarAuthInfo;
        this.successor_chatter_id = str12;
        this.external_password_invalid = bool11;
        this.share_options = calendarShareOptions;
        this.share_info = calendarShareInfo;
        this.is_cross_tenant = bool12;
        this.cover_image_set = calendarCoverImageSet;
        this.calendar_owner_id = str13;
        this.calendar_tenant_id = str14;
        this.official_type = officialType;
    }
}
