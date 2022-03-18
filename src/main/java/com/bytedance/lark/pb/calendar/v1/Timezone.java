package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Timezone extends Message<Timezone, C16082a> {
    public static final ProtoAdapter<Timezone> ADAPTER = new C16083b();
    public static final Integer DEFAULT_TIMEZONE_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final String timezone_id;
    public final String timezone_name;
    public final Integer timezone_offset;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Timezone$b */
    private static final class C16083b extends ProtoAdapter<Timezone> {
        C16083b() {
            super(FieldEncoding.LENGTH_DELIMITED, Timezone.class);
        }

        /* renamed from: a */
        public int encodedSize(Timezone timezone) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, timezone.timezone_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, timezone.timezone_name) + ProtoAdapter.INT32.encodedSizeWithTag(3, timezone.timezone_offset) + timezone.unknownFields().size();
        }

        /* renamed from: a */
        public Timezone decode(ProtoReader protoReader) throws IOException {
            C16082a aVar = new C16082a();
            aVar.f42167a = "";
            aVar.f42168b = "";
            aVar.f42169c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42167a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42168b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42169c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Timezone timezone) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, timezone.timezone_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, timezone.timezone_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, timezone.timezone_offset);
            protoWriter.writeBytes(timezone.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16082a newBuilder() {
        C16082a aVar = new C16082a();
        aVar.f42167a = this.timezone_id;
        aVar.f42168b = this.timezone_name;
        aVar.f42169c = this.timezone_offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.Timezone$a */
    public static final class C16082a extends Message.Builder<Timezone, C16082a> {

        /* renamed from: a */
        public String f42167a;

        /* renamed from: b */
        public String f42168b;

        /* renamed from: c */
        public Integer f42169c;

        /* renamed from: a */
        public Timezone build() {
            String str;
            Integer num;
            String str2 = this.f42167a;
            if (str2 != null && (str = this.f42168b) != null && (num = this.f42169c) != null) {
                return new Timezone(str2, str, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "timezone_id", this.f42168b, "timezone_name", this.f42169c, "timezone_offset");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "Timezone");
        StringBuilder sb = new StringBuilder();
        sb.append(", timezone_id=");
        sb.append(this.timezone_id);
        sb.append(", timezone_name=");
        sb.append(this.timezone_name);
        sb.append(", timezone_offset=");
        sb.append(this.timezone_offset);
        StringBuilder replace = sb.replace(0, 2, "Timezone{");
        replace.append('}');
        return replace.toString();
    }

    public Timezone(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public Timezone(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timezone_id = str;
        this.timezone_name = str2;
        this.timezone_offset = num;
    }
}
