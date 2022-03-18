package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MeetingRoomEquipment extends Message<MeetingRoomEquipment, C15870a> {
    public static final ProtoAdapter<MeetingRoomEquipment> ADAPTER = new C15871b();
    private static final long serialVersionUID = 0;
    public final String default_name;
    public final String equipment_type;
    public final String i18n_name;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment$b */
    private static final class C15871b extends ProtoAdapter<MeetingRoomEquipment> {
        C15871b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingRoomEquipment.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingRoomEquipment meetingRoomEquipment) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (meetingRoomEquipment.i18n_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingRoomEquipment.i18n_name);
            } else {
                i = 0;
            }
            if (meetingRoomEquipment.equipment_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, meetingRoomEquipment.equipment_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (meetingRoomEquipment.default_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, meetingRoomEquipment.default_name);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (meetingRoomEquipment.id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, meetingRoomEquipment.id);
            }
            return i6 + i4 + meetingRoomEquipment.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingRoomEquipment decode(ProtoReader protoReader) throws IOException {
            C15870a aVar = new C15870a();
            aVar.f41698a = "";
            aVar.f41699b = "";
            aVar.f41700c = "";
            aVar.f41701d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41698a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41699b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41700c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41701d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingRoomEquipment meetingRoomEquipment) throws IOException {
            if (meetingRoomEquipment.i18n_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingRoomEquipment.i18n_name);
            }
            if (meetingRoomEquipment.equipment_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, meetingRoomEquipment.equipment_type);
            }
            if (meetingRoomEquipment.default_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, meetingRoomEquipment.default_name);
            }
            if (meetingRoomEquipment.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, meetingRoomEquipment.id);
            }
            protoWriter.writeBytes(meetingRoomEquipment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment$a */
    public static final class C15870a extends Message.Builder<MeetingRoomEquipment, C15870a> {

        /* renamed from: a */
        public String f41698a;

        /* renamed from: b */
        public String f41699b;

        /* renamed from: c */
        public String f41700c;

        /* renamed from: d */
        public String f41701d;

        /* renamed from: a */
        public MeetingRoomEquipment build() {
            return new MeetingRoomEquipment(this.f41698a, this.f41699b, this.f41700c, this.f41701d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15870a newBuilder() {
        C15870a aVar = new C15870a();
        aVar.f41698a = this.i18n_name;
        aVar.f41699b = this.equipment_type;
        aVar.f41700c = this.default_name;
        aVar.f41701d = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingRoomEquipment");
        StringBuilder sb = new StringBuilder();
        if (this.i18n_name != null) {
            sb.append(", i18n_name=");
            sb.append(this.i18n_name);
        }
        if (this.equipment_type != null) {
            sb.append(", equipment_type=");
            sb.append(this.equipment_type);
        }
        if (this.default_name != null) {
            sb.append(", default_name=");
            sb.append(this.default_name);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingRoomEquipment{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingRoomEquipment(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public MeetingRoomEquipment(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_name = str;
        this.equipment_type = str2;
        this.default_name = str3;
        this.id = str4;
    }
}
