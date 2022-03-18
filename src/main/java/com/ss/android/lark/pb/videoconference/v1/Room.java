package com.ss.android.lark.pb.videoconference.v1;

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

public final class Room extends Message<Room, C50988a> {
    public static final ProtoAdapter<Room> ADAPTER = new C50989b();
    public static final Integer DEFAULT_CAPACITY = 0;
    public static final Boolean DEFAULT_IS_UNBIND = false;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String avatar_path;
    public final String background_url;
    public final Integer capacity;
    public final List<String> controller_id_list;
    public final String full_name_participant;
    public final String full_name_site;
    public final Boolean is_unbind;
    public final Location location;
    public final String meeting_number;
    public final String name;
    public final String primary_name_participant;
    public final String primary_name_site;
    public final String room_id;
    public final String secondary_name;
    public final String tenant_id;

    public static final class Location extends Message<Location, C50986a> {
        public static final ProtoAdapter<Location> ADAPTER = new C50987b();
        private static final long serialVersionUID = 0;
        public final String building_name;
        public final String floor_name;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.Room$Location$b */
        private static final class C50987b extends ProtoAdapter<Location> {
            C50987b() {
                super(FieldEncoding.LENGTH_DELIMITED, Location.class);
            }

            /* renamed from: a */
            public int encodedSize(Location location) {
                int i;
                int i2 = 0;
                if (location.floor_name != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, location.floor_name);
                } else {
                    i = 0;
                }
                if (location.building_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, location.building_name);
                }
                return i + i2 + location.unknownFields().size();
            }

            /* renamed from: a */
            public Location decode(ProtoReader protoReader) throws IOException {
                C50986a aVar = new C50986a();
                aVar.f127016a = "";
                aVar.f127017b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127016a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127017b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Location location) throws IOException {
                if (location.floor_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, location.floor_name);
                }
                if (location.building_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, location.building_name);
                }
                protoWriter.writeBytes(location.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.Room$Location$a */
        public static final class C50986a extends Message.Builder<Location, C50986a> {

            /* renamed from: a */
            public String f127016a;

            /* renamed from: b */
            public String f127017b;

            /* renamed from: a */
            public Location build() {
                return new Location(this.f127016a, this.f127017b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50986a newBuilder() {
            C50986a aVar = new C50986a();
            aVar.f127016a = this.floor_name;
            aVar.f127017b = this.building_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Location");
            StringBuilder sb = new StringBuilder();
            if (this.floor_name != null) {
                sb.append(", floor_name=");
                sb.append(this.floor_name);
            }
            if (this.building_name != null) {
                sb.append(", building_name=");
                sb.append(this.building_name);
            }
            StringBuilder replace = sb.replace(0, 2, "Location{");
            replace.append('}');
            return replace.toString();
        }

        public Location(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public Location(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.floor_name = str;
            this.building_name = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.Room$b */
    private static final class C50989b extends ProtoAdapter<Room> {
        C50989b() {
            super(FieldEncoding.LENGTH_DELIMITED, Room.class);
        }

        /* renamed from: a */
        public int encodedSize(Room room) {
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
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, room.name) + ProtoAdapter.STRING.encodedSizeWithTag(2, room.room_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, room.capacity) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, room.controller_id_list);
            int i12 = 0;
            if (room.background_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, room.background_url);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (room.location != null) {
                i2 = Location.ADAPTER.encodedSizeWithTag(6, room.location);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (room.meeting_number != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, room.meeting_number);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (room.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(8, room.avatar_key);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (room.avatar_path != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(9, room.avatar_path);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (room.tenant_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(12, room.tenant_id);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (room.full_name_participant != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(15, room.full_name_participant);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (room.full_name_site != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(16, room.full_name_site);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (room.primary_name_participant != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(17, room.primary_name_participant);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (room.primary_name_site != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(18, room.primary_name_site);
            } else {
                i10 = 0;
            }
            int i22 = i21 + i10;
            if (room.secondary_name != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(19, room.secondary_name);
            } else {
                i11 = 0;
            }
            int i23 = i22 + i11;
            if (room.is_unbind != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(23, room.is_unbind);
            }
            return i23 + i12 + room.unknownFields().size();
        }

        /* renamed from: a */
        public Room decode(ProtoReader protoReader) throws IOException {
            C50988a aVar = new C50988a();
            aVar.f127018a = "";
            aVar.f127019b = "";
            aVar.f127020c = 0;
            aVar.f127022e = "";
            aVar.f127024g = "";
            aVar.f127025h = "";
            aVar.f127026i = "";
            aVar.f127027j = "";
            aVar.f127028k = "";
            aVar.f127029l = "";
            aVar.f127030m = "";
            aVar.f127031n = "";
            aVar.f127032o = "";
            aVar.f127033p = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 12) {
                    aVar.f127027j = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 23) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127018a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f127019b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f127020c = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f127021d.add(ProtoAdapter.STRING.decode(protoReader));
                            continue;
                        case 5:
                            aVar.f127022e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f127023f = Location.ADAPTER.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f127024g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f127025h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 9:
                            aVar.f127026i = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 15:
                                    aVar.f127028k = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 16:
                                    aVar.f127029l = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 17:
                                    aVar.f127030m = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 18:
                                    aVar.f127031n = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 19:
                                    aVar.f127032o = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f127033p = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Room room) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, room.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, room.room_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, room.capacity);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, room.controller_id_list);
            if (room.background_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, room.background_url);
            }
            if (room.location != null) {
                Location.ADAPTER.encodeWithTag(protoWriter, 6, room.location);
            }
            if (room.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, room.meeting_number);
            }
            if (room.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, room.avatar_key);
            }
            if (room.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, room.avatar_path);
            }
            if (room.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, room.tenant_id);
            }
            if (room.full_name_participant != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, room.full_name_participant);
            }
            if (room.full_name_site != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, room.full_name_site);
            }
            if (room.primary_name_participant != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, room.primary_name_participant);
            }
            if (room.primary_name_site != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, room.primary_name_site);
            }
            if (room.secondary_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, room.secondary_name);
            }
            if (room.is_unbind != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, room.is_unbind);
            }
            protoWriter.writeBytes(room.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.Room$a */
    public static final class C50988a extends Message.Builder<Room, C50988a> {

        /* renamed from: a */
        public String f127018a;

        /* renamed from: b */
        public String f127019b;

        /* renamed from: c */
        public Integer f127020c;

        /* renamed from: d */
        public List<String> f127021d = Internal.newMutableList();

        /* renamed from: e */
        public String f127022e;

        /* renamed from: f */
        public Location f127023f;

        /* renamed from: g */
        public String f127024g;

        /* renamed from: h */
        public String f127025h;

        /* renamed from: i */
        public String f127026i;

        /* renamed from: j */
        public String f127027j;

        /* renamed from: k */
        public String f127028k;

        /* renamed from: l */
        public String f127029l;

        /* renamed from: m */
        public String f127030m;

        /* renamed from: n */
        public String f127031n;

        /* renamed from: o */
        public String f127032o;

        /* renamed from: p */
        public Boolean f127033p;

        /* renamed from: a */
        public Room build() {
            String str;
            Integer num;
            String str2 = this.f127018a;
            if (str2 != null && (str = this.f127019b) != null && (num = this.f127020c) != null) {
                return new Room(str2, str, num, this.f127021d, this.f127022e, this.f127023f, this.f127024g, this.f127025h, this.f127026i, this.f127027j, this.f127028k, this.f127029l, this.f127030m, this.f127031n, this.f127032o, this.f127033p, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "name", this.f127019b, "room_id", this.f127020c, "capacity");
        }
    }

    @Override // com.squareup.wire.Message
    public C50988a newBuilder() {
        C50988a aVar = new C50988a();
        aVar.f127018a = this.name;
        aVar.f127019b = this.room_id;
        aVar.f127020c = this.capacity;
        aVar.f127021d = Internal.copyOf("controller_id_list", this.controller_id_list);
        aVar.f127022e = this.background_url;
        aVar.f127023f = this.location;
        aVar.f127024g = this.meeting_number;
        aVar.f127025h = this.avatar_key;
        aVar.f127026i = this.avatar_path;
        aVar.f127027j = this.tenant_id;
        aVar.f127028k = this.full_name_participant;
        aVar.f127029l = this.full_name_site;
        aVar.f127030m = this.primary_name_participant;
        aVar.f127031n = this.primary_name_site;
        aVar.f127032o = this.secondary_name;
        aVar.f127033p = this.is_unbind;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "Room");
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", room_id=");
        sb.append(this.room_id);
        sb.append(", capacity=");
        sb.append(this.capacity);
        if (!this.controller_id_list.isEmpty()) {
            sb.append(", controller_id_list=");
            sb.append(this.controller_id_list);
        }
        if (this.background_url != null) {
            sb.append(", background_url=");
            sb.append(this.background_url);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.full_name_participant != null) {
            sb.append(", full_name_participant=");
            sb.append(this.full_name_participant);
        }
        if (this.full_name_site != null) {
            sb.append(", full_name_site=");
            sb.append(this.full_name_site);
        }
        if (this.primary_name_participant != null) {
            sb.append(", primary_name_participant=");
            sb.append(this.primary_name_participant);
        }
        if (this.primary_name_site != null) {
            sb.append(", primary_name_site=");
            sb.append(this.primary_name_site);
        }
        if (this.secondary_name != null) {
            sb.append(", secondary_name=");
            sb.append(this.secondary_name);
        }
        if (this.is_unbind != null) {
            sb.append(", is_unbind=");
            sb.append(this.is_unbind);
        }
        StringBuilder replace = sb.replace(0, 2, "Room{");
        replace.append('}');
        return replace.toString();
    }

    public Room(String str, String str2, Integer num, List<String> list, String str3, Location location2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool) {
        this(str, str2, num, list, str3, location2, str4, str5, str6, str7, str8, str9, str10, str11, str12, bool, ByteString.EMPTY);
    }

    public Room(String str, String str2, Integer num, List<String> list, String str3, Location location2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.room_id = str2;
        this.capacity = num;
        this.controller_id_list = Internal.immutableCopyOf("controller_id_list", list);
        this.background_url = str3;
        this.location = location2;
        this.meeting_number = str4;
        this.avatar_key = str5;
        this.avatar_path = str6;
        this.tenant_id = str7;
        this.full_name_participant = str8;
        this.full_name_site = str9;
        this.primary_name_participant = str10;
        this.primary_name_site = str11;
        this.secondary_name = str12;
        this.is_unbind = bool;
    }
}
