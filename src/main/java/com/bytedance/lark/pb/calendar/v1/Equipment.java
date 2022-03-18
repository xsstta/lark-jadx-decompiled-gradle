package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Equipment extends Message<Equipment, C15604a> {
    public static final ProtoAdapter<Equipment> ADAPTER = new C15605b();
    public static final MessageOptions MESSAGE_OPTIONS = new MessageOptions.C23078a().mo80177a(true).build();
    private static final long serialVersionUID = 0;
    public final String equipment_type;
    public final String i18n_name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Equipment$b */
    private static final class C15605b extends ProtoAdapter<Equipment> {
        C15605b() {
            super(FieldEncoding.LENGTH_DELIMITED, Equipment.class);
        }

        /* renamed from: a */
        public int encodedSize(Equipment equipment) {
            int i;
            int i2 = 0;
            if (equipment.i18n_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, equipment.i18n_name);
            } else {
                i = 0;
            }
            if (equipment.equipment_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, equipment.equipment_type);
            }
            return i + i2 + equipment.unknownFields().size();
        }

        /* renamed from: a */
        public Equipment decode(ProtoReader protoReader) throws IOException {
            C15604a aVar = new C15604a();
            aVar.f41335a = "";
            aVar.f41336b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41335a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41336b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Equipment equipment) throws IOException {
            if (equipment.i18n_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, equipment.i18n_name);
            }
            if (equipment.equipment_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, equipment.equipment_type);
            }
            protoWriter.writeBytes(equipment.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Equipment$a */
    public static final class C15604a extends Message.Builder<Equipment, C15604a> {

        /* renamed from: a */
        public String f41335a;

        /* renamed from: b */
        public String f41336b;

        /* renamed from: a */
        public Equipment build() {
            return new Equipment(this.f41335a, this.f41336b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15604a newBuilder() {
        C15604a aVar = new C15604a();
        aVar.f41335a = this.i18n_name;
        aVar.f41336b = this.equipment_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "Equipment");
        StringBuilder sb = new StringBuilder();
        if (this.i18n_name != null) {
            sb.append(", i18n_name=");
            sb.append(this.i18n_name);
        }
        if (this.equipment_type != null) {
            sb.append(", equipment_type=");
            sb.append(this.equipment_type);
        }
        StringBuilder replace = sb.replace(0, 2, "Equipment{");
        replace.append('}');
        return replace.toString();
    }

    public Equipment(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Equipment(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.i18n_name = str;
        this.equipment_type = str2;
    }
}
