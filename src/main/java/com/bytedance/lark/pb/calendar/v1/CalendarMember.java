package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CalendarMember extends Message<CalendarMember, C15546a> {
    public static final ProtoAdapter<CalendarMember> ADAPTER = new C15547b();
    public static final Calendar.AccessRole DEFAULT_ACCESS_ROLE = Calendar.AccessRole.READER;
    public static final Integer DEFAULT_CHAT_MEMBER_COUNT = 0;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final CalendarMemberType DEFAULT_MEMBER_TYPE = CalendarMemberType.INDIVIDUAL;
    public static final Calendar.Status DEFAULT_STATUS = Calendar.Status.DEFAULT;
    private static final long serialVersionUID = 0;
    public final Calendar.AccessRole access_role;
    public final ImageSet avatar;
    public final String avatar_key;
    public final String avatar_path;
    public final String calendar_id;
    public final String chat_id;
    public final Integer chat_member_count;
    public final String id;
    public final Boolean is_cross_tenant;
    public final String localized_name;
    public final CalendarMemberType member_type;
    public final String name;
    public final Calendar.Status status;
    public final String tenant_id;
    public final String user_id;

    public enum CalendarMemberType implements WireEnum {
        INDIVIDUAL(1),
        GROUP(2);
        
        public static final ProtoAdapter<CalendarMemberType> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarMemberType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarMemberType fromValue(int i) {
            if (i == 1) {
                return INDIVIDUAL;
            }
            if (i != 2) {
                return null;
            }
            return GROUP;
        }

        private CalendarMemberType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMember$b */
    private static final class C15547b extends ProtoAdapter<CalendarMember> {
        C15547b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarMember.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarMember calendarMember) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarMember.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, calendarMember.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, calendarMember.user_id);
            int i12 = 0;
            if (calendarMember.access_role != null) {
                i = Calendar.AccessRole.ADAPTER.encodedSizeWithTag(4, calendarMember.access_role);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (calendarMember.status != null) {
                i2 = Calendar.Status.ADAPTER.encodedSizeWithTag(5, calendarMember.status);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (calendarMember.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarMember.name);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (calendarMember.avatar != null) {
                i4 = ImageSet.ADAPTER.encodedSizeWithTag(7, calendarMember.avatar);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (calendarMember.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, calendarMember.avatar_key);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (calendarMember.localized_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, calendarMember.localized_name);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (calendarMember.member_type != null) {
                i7 = CalendarMemberType.ADAPTER.encodedSizeWithTag(10, calendarMember.member_type);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (calendarMember.chat_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, calendarMember.chat_id);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (calendarMember.chat_member_count != null) {
                i9 = ProtoAdapter.INT32.encodedSizeWithTag(12, calendarMember.chat_member_count);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (calendarMember.avatar_path != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(13, calendarMember.avatar_path);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (calendarMember.tenant_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(14, calendarMember.tenant_id);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (calendarMember.is_cross_tenant != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(15, calendarMember.is_cross_tenant);
            }
            return i23 + i12 + calendarMember.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarMember decode(ProtoReader protoReader) throws IOException {
            C15546a aVar = new C15546a();
            aVar.f41213a = "";
            aVar.f41214b = "";
            aVar.f41215c = "";
            aVar.f41216d = Calendar.AccessRole.READER;
            aVar.f41217e = Calendar.Status.DEFAULT;
            aVar.f41218f = "";
            aVar.f41220h = "";
            aVar.f41221i = "";
            aVar.f41222j = CalendarMemberType.INDIVIDUAL;
            aVar.f41223k = "";
            aVar.f41224l = 0;
            aVar.f41225m = "";
            aVar.f41226n = "";
            aVar.f41227o = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41213a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41214b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41215c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f41216d = Calendar.AccessRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f41217e = Calendar.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f41218f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41219g = ImageSet.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41220h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41221i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            try {
                                aVar.f41222j = CalendarMemberType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 11:
                            aVar.f41223k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41224l = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41225m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41226n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41227o = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarMember calendarMember) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarMember.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarMember.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarMember.user_id);
            if (calendarMember.access_role != null) {
                Calendar.AccessRole.ADAPTER.encodeWithTag(protoWriter, 4, calendarMember.access_role);
            }
            if (calendarMember.status != null) {
                Calendar.Status.ADAPTER.encodeWithTag(protoWriter, 5, calendarMember.status);
            }
            if (calendarMember.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarMember.name);
            }
            if (calendarMember.avatar != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 7, calendarMember.avatar);
            }
            if (calendarMember.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, calendarMember.avatar_key);
            }
            if (calendarMember.localized_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, calendarMember.localized_name);
            }
            if (calendarMember.member_type != null) {
                CalendarMemberType.ADAPTER.encodeWithTag(protoWriter, 10, calendarMember.member_type);
            }
            if (calendarMember.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, calendarMember.chat_id);
            }
            if (calendarMember.chat_member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, calendarMember.chat_member_count);
            }
            if (calendarMember.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, calendarMember.avatar_path);
            }
            if (calendarMember.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, calendarMember.tenant_id);
            }
            if (calendarMember.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, calendarMember.is_cross_tenant);
            }
            protoWriter.writeBytes(calendarMember.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarMember$a */
    public static final class C15546a extends Message.Builder<CalendarMember, C15546a> {

        /* renamed from: a */
        public String f41213a;

        /* renamed from: b */
        public String f41214b;

        /* renamed from: c */
        public String f41215c;

        /* renamed from: d */
        public Calendar.AccessRole f41216d;

        /* renamed from: e */
        public Calendar.Status f41217e;

        /* renamed from: f */
        public String f41218f;

        /* renamed from: g */
        public ImageSet f41219g;

        /* renamed from: h */
        public String f41220h;

        /* renamed from: i */
        public String f41221i;

        /* renamed from: j */
        public CalendarMemberType f41222j;

        /* renamed from: k */
        public String f41223k;

        /* renamed from: l */
        public Integer f41224l;

        /* renamed from: m */
        public String f41225m;

        /* renamed from: n */
        public String f41226n;

        /* renamed from: o */
        public Boolean f41227o;

        /* renamed from: a */
        public CalendarMember build() {
            String str;
            String str2;
            String str3 = this.f41213a;
            if (str3 != null && (str = this.f41214b) != null && (str2 = this.f41215c) != null) {
                return new CalendarMember(str3, str, str2, this.f41216d, this.f41217e, this.f41218f, this.f41219g, this.f41220h, this.f41221i, this.f41222j, this.f41223k, this.f41224l, this.f41225m, this.f41226n, this.f41227o, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f41214b, "calendar_id", this.f41215c, "user_id");
        }

        /* renamed from: a */
        public C15546a mo56388a(Calendar.AccessRole accessRole) {
            this.f41216d = accessRole;
            return this;
        }

        /* renamed from: b */
        public C15546a mo56394b(String str) {
            this.f41214b = str;
            return this;
        }

        /* renamed from: c */
        public C15546a mo56395c(String str) {
            this.f41215c = str;
            return this;
        }

        /* renamed from: d */
        public C15546a mo56396d(String str) {
            this.f41218f = str;
            return this;
        }

        /* renamed from: e */
        public C15546a mo56397e(String str) {
            this.f41220h = str;
            return this;
        }

        /* renamed from: f */
        public C15546a mo56398f(String str) {
            this.f41221i = str;
            return this;
        }

        /* renamed from: g */
        public C15546a mo56399g(String str) {
            this.f41223k = str;
            return this;
        }

        /* renamed from: h */
        public C15546a mo56400h(String str) {
            this.f41226n = str;
            return this;
        }

        /* renamed from: a */
        public C15546a mo56389a(Calendar.Status status) {
            this.f41217e = status;
            return this;
        }

        /* renamed from: a */
        public C15546a mo56390a(CalendarMemberType calendarMemberType) {
            this.f41222j = calendarMemberType;
            return this;
        }

        /* renamed from: a */
        public C15546a mo56391a(Integer num) {
            this.f41224l = num;
            return this;
        }

        /* renamed from: a */
        public C15546a mo56392a(String str) {
            this.f41213a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15546a newBuilder() {
        C15546a aVar = new C15546a();
        aVar.f41213a = this.id;
        aVar.f41214b = this.calendar_id;
        aVar.f41215c = this.user_id;
        aVar.f41216d = this.access_role;
        aVar.f41217e = this.status;
        aVar.f41218f = this.name;
        aVar.f41219g = this.avatar;
        aVar.f41220h = this.avatar_key;
        aVar.f41221i = this.localized_name;
        aVar.f41222j = this.member_type;
        aVar.f41223k = this.chat_id;
        aVar.f41224l = this.chat_member_count;
        aVar.f41225m = this.avatar_path;
        aVar.f41226n = this.tenant_id;
        aVar.f41227o = this.is_cross_tenant;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarMember");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", user_id=");
        sb.append(this.user_id);
        if (this.access_role != null) {
            sb.append(", access_role=");
            sb.append(this.access_role);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.localized_name != null) {
            sb.append(", localized_name=");
            sb.append(this.localized_name);
        }
        if (this.member_type != null) {
            sb.append(", member_type=");
            sb.append(this.member_type);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.chat_member_count != null) {
            sb.append(", chat_member_count=");
            sb.append(this.chat_member_count);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarMember{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarMember(String str, String str2, String str3, Calendar.AccessRole accessRole, Calendar.Status status2, String str4, ImageSet imageSet, String str5, String str6, CalendarMemberType calendarMemberType, String str7, Integer num, String str8, String str9, Boolean bool) {
        this(str, str2, str3, accessRole, status2, str4, imageSet, str5, str6, calendarMemberType, str7, num, str8, str9, bool, ByteString.EMPTY);
    }

    public CalendarMember(String str, String str2, String str3, Calendar.AccessRole accessRole, Calendar.Status status2, String str4, ImageSet imageSet, String str5, String str6, CalendarMemberType calendarMemberType, String str7, Integer num, String str8, String str9, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.calendar_id = str2;
        this.user_id = str3;
        this.access_role = accessRole;
        this.status = status2;
        this.name = str4;
        this.avatar = imageSet;
        this.avatar_key = str5;
        this.localized_name = str6;
        this.member_type = calendarMemberType;
        this.chat_id = str7;
        this.chat_member_count = num;
        this.avatar_path = str8;
        this.tenant_id = str9;
        this.is_cross_tenant = bool;
    }
}
