package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CalendarResource extends Message<CalendarResource, C15556a> {
    public static final ProtoAdapter<CalendarResource> ADAPTER = new C15557b();
    public static final Integer DEFAULT_CAPACITY = 0;
    public static final Boolean DEFAULT_IS_DISABLED = false;
    public static final Status DEFAULT_STATUS = Status.FREE;
    public static final Type DEFAULT_TYPE = Type.OTHER;
    public static final Integer DEFAULT_WEIGHT = 0;
    private static final long serialVersionUID = 0;
    public final String building_id;
    public final String calendar_id;
    public final Integer capacity;
    public final String category;
    public final String description;
    public final List<MeetingRoomEquipment> equipments;
    public final String floor_name;
    public final String id;
    public final Boolean is_disabled;
    public final String name;
    public final CalendarSchemaCollection resource_schema;
    public final SchemaExtraData schema_extra_data;
    public final Status status;
    public final String tenant_id;
    public final Type type;
    public final Integer weight;

    public enum Status implements WireEnum {
        FREE(1),
        BUSY(2);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            if (i == 1) {
                return FREE;
            }
            if (i != 2) {
                return null;
            }
            return BUSY;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        MEETING_ROOM(1),
        OTHER(2);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 1) {
                return MEETING_ROOM;
            }
            if (i != 2) {
                return null;
            }
            return OTHER;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarResource$b */
    private static final class C15557b extends ProtoAdapter<CalendarResource> {
        C15557b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarResource.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarResource calendarResource) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarResource.id);
            int i14 = 0;
            if (calendarResource.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarResource.calendar_id);
            } else {
                i = 0;
            }
            int i15 = encodedSizeWithTag + i;
            if (calendarResource.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, calendarResource.name);
            } else {
                i2 = 0;
            }
            int i16 = i15 + i2;
            if (calendarResource.type != null) {
                i3 = Type.ADAPTER.encodedSizeWithTag(4, calendarResource.type);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (calendarResource.status != null) {
                i4 = Status.ADAPTER.encodedSizeWithTag(5, calendarResource.status);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (calendarResource.building_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, calendarResource.building_id);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (calendarResource.description != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, calendarResource.description);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (calendarResource.capacity != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(8, calendarResource.capacity);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (calendarResource.floor_name != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, calendarResource.floor_name);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (calendarResource.category != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, calendarResource.category);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (calendarResource.weight != null) {
                i10 = ProtoAdapter.INT32.encodedSizeWithTag(11, calendarResource.weight);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (calendarResource.tenant_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, calendarResource.tenant_id);
            } else {
                i11 = 0;
            }
            int i25 = i24 + i11;
            if (calendarResource.is_disabled != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(13, calendarResource.is_disabled);
            } else {
                i12 = 0;
            }
            int i26 = i25 + i12;
            if (calendarResource.resource_schema != null) {
                i13 = CalendarSchemaCollection.ADAPTER.encodedSizeWithTag(14, calendarResource.resource_schema);
            } else {
                i13 = 0;
            }
            int i27 = i26 + i13;
            if (calendarResource.schema_extra_data != null) {
                i14 = SchemaExtraData.ADAPTER.encodedSizeWithTag(15, calendarResource.schema_extra_data);
            }
            return i27 + i14 + MeetingRoomEquipment.ADAPTER.asRepeated().encodedSizeWithTag(16, calendarResource.equipments) + calendarResource.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarResource decode(ProtoReader protoReader) throws IOException {
            C15556a aVar = new C15556a();
            aVar.f41239a = "";
            aVar.f41240b = "";
            aVar.f41241c = "";
            aVar.f41242d = Type.OTHER;
            aVar.f41243e = Status.FREE;
            aVar.f41244f = "";
            aVar.f41245g = "";
            aVar.f41246h = 0;
            aVar.f41247i = "";
            aVar.f41248j = "";
            aVar.f41249k = 0;
            aVar.f41250l = "";
            aVar.f41251m = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41239a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41240b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41241c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f41242d = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            try {
                                aVar.f41243e = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 6:
                            aVar.f41244f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f41245g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f41246h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41247i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f41248j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f41249k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f41250l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f41251m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f41252n = CalendarSchemaCollection.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            aVar.f41253o = SchemaExtraData.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f41254p.add(MeetingRoomEquipment.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, CalendarResource calendarResource) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarResource.id);
            if (calendarResource.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarResource.calendar_id);
            }
            if (calendarResource.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarResource.name);
            }
            if (calendarResource.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 4, calendarResource.type);
            }
            if (calendarResource.status != null) {
                Status.ADAPTER.encodeWithTag(protoWriter, 5, calendarResource.status);
            }
            if (calendarResource.building_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, calendarResource.building_id);
            }
            if (calendarResource.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, calendarResource.description);
            }
            if (calendarResource.capacity != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, calendarResource.capacity);
            }
            if (calendarResource.floor_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, calendarResource.floor_name);
            }
            if (calendarResource.category != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, calendarResource.category);
            }
            if (calendarResource.weight != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, calendarResource.weight);
            }
            if (calendarResource.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, calendarResource.tenant_id);
            }
            if (calendarResource.is_disabled != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, calendarResource.is_disabled);
            }
            if (calendarResource.resource_schema != null) {
                CalendarSchemaCollection.ADAPTER.encodeWithTag(protoWriter, 14, calendarResource.resource_schema);
            }
            if (calendarResource.schema_extra_data != null) {
                SchemaExtraData.ADAPTER.encodeWithTag(protoWriter, 15, calendarResource.schema_extra_data);
            }
            MeetingRoomEquipment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, calendarResource.equipments);
            protoWriter.writeBytes(calendarResource.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarResource$a */
    public static final class C15556a extends Message.Builder<CalendarResource, C15556a> {

        /* renamed from: a */
        public String f41239a;

        /* renamed from: b */
        public String f41240b;

        /* renamed from: c */
        public String f41241c;

        /* renamed from: d */
        public Type f41242d;

        /* renamed from: e */
        public Status f41243e;

        /* renamed from: f */
        public String f41244f;

        /* renamed from: g */
        public String f41245g;

        /* renamed from: h */
        public Integer f41246h;

        /* renamed from: i */
        public String f41247i;

        /* renamed from: j */
        public String f41248j;

        /* renamed from: k */
        public Integer f41249k;

        /* renamed from: l */
        public String f41250l;

        /* renamed from: m */
        public Boolean f41251m;

        /* renamed from: n */
        public CalendarSchemaCollection f41252n;

        /* renamed from: o */
        public SchemaExtraData f41253o;

        /* renamed from: p */
        public List<MeetingRoomEquipment> f41254p = Internal.newMutableList();

        /* renamed from: a */
        public CalendarResource build() {
            String str = this.f41239a;
            if (str != null) {
                return new CalendarResource(str, this.f41240b, this.f41241c, this.f41242d, this.f41243e, this.f41244f, this.f41245g, this.f41246h, this.f41247i, this.f41248j, this.f41249k, this.f41250l, this.f41251m, this.f41252n, this.f41253o, this.f41254p, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        /* renamed from: a */
        public C15556a mo56431a(SchemaExtraData schemaExtraData) {
            this.f41253o = schemaExtraData;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15556a newBuilder() {
        C15556a aVar = new C15556a();
        aVar.f41239a = this.id;
        aVar.f41240b = this.calendar_id;
        aVar.f41241c = this.name;
        aVar.f41242d = this.type;
        aVar.f41243e = this.status;
        aVar.f41244f = this.building_id;
        aVar.f41245g = this.description;
        aVar.f41246h = this.capacity;
        aVar.f41247i = this.floor_name;
        aVar.f41248j = this.category;
        aVar.f41249k = this.weight;
        aVar.f41250l = this.tenant_id;
        aVar.f41251m = this.is_disabled;
        aVar.f41252n = this.resource_schema;
        aVar.f41253o = this.schema_extra_data;
        aVar.f41254p = Internal.copyOf("equipments", this.equipments);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarResource");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.building_id != null) {
            sb.append(", building_id=");
            sb.append(this.building_id);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.capacity != null) {
            sb.append(", capacity=");
            sb.append(this.capacity);
        }
        if (this.floor_name != null) {
            sb.append(", floor_name=");
            sb.append(this.floor_name);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        if (this.weight != null) {
            sb.append(", weight=");
            sb.append(this.weight);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.is_disabled != null) {
            sb.append(", is_disabled=");
            sb.append(this.is_disabled);
        }
        if (this.resource_schema != null) {
            sb.append(", resource_schema=");
            sb.append(this.resource_schema);
        }
        if (this.schema_extra_data != null) {
            sb.append(", schema_extra_data=");
            sb.append(this.schema_extra_data);
        }
        if (!this.equipments.isEmpty()) {
            sb.append(", equipments=");
            sb.append(this.equipments);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarResource{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarResource(String str, String str2, String str3, Type type2, Status status2, String str4, String str5, Integer num, String str6, String str7, Integer num2, String str8, Boolean bool, CalendarSchemaCollection calendarSchemaCollection, SchemaExtraData schemaExtraData, List<MeetingRoomEquipment> list) {
        this(str, str2, str3, type2, status2, str4, str5, num, str6, str7, num2, str8, bool, calendarSchemaCollection, schemaExtraData, list, ByteString.EMPTY);
    }

    public CalendarResource(String str, String str2, String str3, Type type2, Status status2, String str4, String str5, Integer num, String str6, String str7, Integer num2, String str8, Boolean bool, CalendarSchemaCollection calendarSchemaCollection, SchemaExtraData schemaExtraData, List<MeetingRoomEquipment> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.calendar_id = str2;
        this.name = str3;
        this.type = type2;
        this.status = status2;
        this.building_id = str4;
        this.description = str5;
        this.capacity = num;
        this.floor_name = str6;
        this.category = str7;
        this.weight = num2;
        this.tenant_id = str8;
        this.is_disabled = bool;
        this.resource_schema = calendarSchemaCollection;
        this.schema_extra_data = schemaExtraData;
        this.equipments = Internal.immutableCopyOf("equipments", list);
    }
}
