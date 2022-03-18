package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CalendarBuilding extends Message<CalendarBuilding, C15512a> {
    public static final ProtoAdapter<CalendarBuilding> ADAPTER = new C15513b();
    public static final Float DEFAULT_LATITUDE;
    public static final Float DEFAULT_LONGITUDE;
    public static final Integer DEFAULT_WEIGHT = 0;
    private static final long serialVersionUID = 0;
    public final String description;
    public final List<String> floors;
    public final String id;
    public final Float latitude;
    public final Float longitude;
    public final List<CalendarResource> meeting_rooms;
    public final String name;
    public final String pinyin_name;
    public final Integer weight;

    public static final class CalendarBuildingFloors extends Message<CalendarBuildingFloors, C15510a> {
        public static final ProtoAdapter<CalendarBuildingFloors> ADAPTER = new C15511b();
        private static final long serialVersionUID = 0;
        public final List<String> floors;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarBuilding$CalendarBuildingFloors$b */
        private static final class C15511b extends ProtoAdapter<CalendarBuildingFloors> {
            C15511b() {
                super(FieldEncoding.LENGTH_DELIMITED, CalendarBuildingFloors.class);
            }

            /* renamed from: a */
            public int encodedSize(CalendarBuildingFloors calendarBuildingFloors) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, calendarBuildingFloors.floors) + calendarBuildingFloors.unknownFields().size();
            }

            /* renamed from: a */
            public CalendarBuildingFloors decode(ProtoReader protoReader) throws IOException {
                C15510a aVar = new C15510a();
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
                        aVar.f41025a.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CalendarBuildingFloors calendarBuildingFloors) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, calendarBuildingFloors.floors);
                protoWriter.writeBytes(calendarBuildingFloors.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarBuilding$CalendarBuildingFloors$a */
        public static final class C15510a extends Message.Builder<CalendarBuildingFloors, C15510a> {

            /* renamed from: a */
            public List<String> f41025a = Internal.newMutableList();

            /* renamed from: a */
            public CalendarBuildingFloors build() {
                return new CalendarBuildingFloors(this.f41025a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15510a newBuilder() {
            C15510a aVar = new C15510a();
            aVar.f41025a = Internal.copyOf("floors", this.floors);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "CalendarBuildingFloors");
            StringBuilder sb = new StringBuilder();
            if (!this.floors.isEmpty()) {
                sb.append(", floors=");
                sb.append(this.floors);
            }
            StringBuilder replace = sb.replace(0, 2, "CalendarBuildingFloors{");
            replace.append('}');
            return replace.toString();
        }

        public CalendarBuildingFloors(List<String> list) {
            this(list, ByteString.EMPTY);
        }

        public CalendarBuildingFloors(List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.floors = Internal.immutableCopyOf("floors", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarBuilding$b */
    private static final class C15513b extends ProtoAdapter<CalendarBuilding> {
        C15513b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarBuilding.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarBuilding calendarBuilding) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarBuilding.id);
            int i6 = 0;
            if (calendarBuilding.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarBuilding.name);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (calendarBuilding.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, calendarBuilding.description);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (calendarBuilding.latitude != null) {
                i3 = ProtoAdapter.FLOAT.encodedSizeWithTag(4, calendarBuilding.latitude);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (calendarBuilding.longitude != null) {
                i4 = ProtoAdapter.FLOAT.encodedSizeWithTag(5, calendarBuilding.longitude);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i9 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, calendarBuilding.floors) + CalendarResource.ADAPTER.asRepeated().encodedSizeWithTag(7, calendarBuilding.meeting_rooms);
            if (calendarBuilding.weight != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(8, calendarBuilding.weight);
            } else {
                i5 = 0;
            }
            int i10 = encodedSizeWithTag2 + i5;
            if (calendarBuilding.pinyin_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, calendarBuilding.pinyin_name);
            }
            return i10 + i6 + calendarBuilding.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarBuilding decode(ProtoReader protoReader) throws IOException {
            C15512a aVar = new C15512a();
            aVar.f41026a = "";
            aVar.f41027b = "";
            aVar.f41028c = "";
            Float valueOf = Float.valueOf(360.0f);
            aVar.f41029d = valueOf;
            aVar.f41030e = valueOf;
            aVar.f41033h = 0;
            aVar.f41034i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41026a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41027b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41028c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41029d = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41030e = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41031f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f41032g.add(CalendarResource.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.f41033h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f41034i = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CalendarBuilding calendarBuilding) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarBuilding.id);
            if (calendarBuilding.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarBuilding.name);
            }
            if (calendarBuilding.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, calendarBuilding.description);
            }
            if (calendarBuilding.latitude != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, calendarBuilding.latitude);
            }
            if (calendarBuilding.longitude != null) {
                ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, calendarBuilding.longitude);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, calendarBuilding.floors);
            CalendarResource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, calendarBuilding.meeting_rooms);
            if (calendarBuilding.weight != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, calendarBuilding.weight);
            }
            if (calendarBuilding.pinyin_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, calendarBuilding.pinyin_name);
            }
            protoWriter.writeBytes(calendarBuilding.unknownFields());
        }
    }

    static {
        Float valueOf = Float.valueOf(360.0f);
        DEFAULT_LATITUDE = valueOf;
        DEFAULT_LONGITUDE = valueOf;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarBuilding$a */
    public static final class C15512a extends Message.Builder<CalendarBuilding, C15512a> {

        /* renamed from: a */
        public String f41026a;

        /* renamed from: b */
        public String f41027b;

        /* renamed from: c */
        public String f41028c;

        /* renamed from: d */
        public Float f41029d;

        /* renamed from: e */
        public Float f41030e;

        /* renamed from: f */
        public List<String> f41031f = Internal.newMutableList();

        /* renamed from: g */
        public List<CalendarResource> f41032g = Internal.newMutableList();

        /* renamed from: h */
        public Integer f41033h;

        /* renamed from: i */
        public String f41034i;

        /* renamed from: a */
        public CalendarBuilding build() {
            String str = this.f41026a;
            if (str != null) {
                return new CalendarBuilding(str, this.f41027b, this.f41028c, this.f41029d, this.f41030e, this.f41031f, this.f41032g, this.f41033h, this.f41034i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C15512a newBuilder() {
        C15512a aVar = new C15512a();
        aVar.f41026a = this.id;
        aVar.f41027b = this.name;
        aVar.f41028c = this.description;
        aVar.f41029d = this.latitude;
        aVar.f41030e = this.longitude;
        aVar.f41031f = Internal.copyOf("floors", this.floors);
        aVar.f41032g = Internal.copyOf("meeting_rooms", this.meeting_rooms);
        aVar.f41033h = this.weight;
        aVar.f41034i = this.pinyin_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarBuilding");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.latitude != null) {
            sb.append(", latitude=");
            sb.append(this.latitude);
        }
        if (this.longitude != null) {
            sb.append(", longitude=");
            sb.append(this.longitude);
        }
        if (!this.floors.isEmpty()) {
            sb.append(", floors=");
            sb.append(this.floors);
        }
        if (!this.meeting_rooms.isEmpty()) {
            sb.append(", meeting_rooms=");
            sb.append(this.meeting_rooms);
        }
        if (this.weight != null) {
            sb.append(", weight=");
            sb.append(this.weight);
        }
        if (this.pinyin_name != null) {
            sb.append(", pinyin_name=");
            sb.append(this.pinyin_name);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarBuilding{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarBuilding(String str, String str2, String str3, Float f, Float f2, List<String> list, List<CalendarResource> list2, Integer num, String str4) {
        this(str, str2, str3, f, f2, list, list2, num, str4, ByteString.EMPTY);
    }

    public CalendarBuilding(String str, String str2, String str3, Float f, Float f2, List<String> list, List<CalendarResource> list2, Integer num, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.latitude = f;
        this.longitude = f2;
        this.floors = Internal.immutableCopyOf("floors", list);
        this.meeting_rooms = Internal.immutableCopyOf("meeting_rooms", list2);
        this.weight = num;
        this.pinyin_name = str4;
    }
}
