package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Area extends Message<Area, C18568a> {
    public static final ProtoAdapter<Area> ADAPTER = new C18569b();
    public static final Long DEFAULT_PRIORITY = 0L;
    private static final long serialVersionUID = 0;
    public final String key;
    public final Long priority;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Area$b */
    private static final class C18569b extends ProtoAdapter<Area> {
        C18569b() {
            super(FieldEncoding.LENGTH_DELIMITED, Area.class);
        }

        /* renamed from: a */
        public int encodedSize(Area area) {
            int i;
            int i2 = 0;
            if (area.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, area.key);
            } else {
                i = 0;
            }
            if (area.priority != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, area.priority);
            }
            return i + i2 + area.unknownFields().size();
        }

        /* renamed from: a */
        public Area decode(ProtoReader protoReader) throws IOException {
            C18568a aVar = new C18568a();
            aVar.f46065a = "";
            aVar.f46066b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46065a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46066b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Area area) throws IOException {
            if (area.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, area.key);
            }
            if (area.priority != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, area.priority);
            }
            protoWriter.writeBytes(area.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.Area$a */
    public static final class C18568a extends Message.Builder<Area, C18568a> {

        /* renamed from: a */
        public String f46065a;

        /* renamed from: b */
        public Long f46066b;

        /* renamed from: a */
        public Area build() {
            return new Area(this.f46065a, this.f46066b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18568a newBuilder() {
        C18568a aVar = new C18568a();
        aVar.f46065a = this.key;
        aVar.f46066b = this.priority;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "Area");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        StringBuilder replace = sb.replace(0, 2, "Area{");
        replace.append('}');
        return replace.toString();
    }

    public Area(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public Area(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.priority = l;
    }
}
