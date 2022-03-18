package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Location extends Message<Location, C15037a> {
    public static final ProtoAdapter<Location> ADAPTER = new C15038b();
    private static final long serialVersionUID = 0;
    public final String description;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.basic.v1.Location$b */
    private static final class C15038b extends ProtoAdapter<Location> {
        C15038b() {
            super(FieldEncoding.LENGTH_DELIMITED, Location.class);
        }

        /* renamed from: a */
        public int encodedSize(Location location) {
            int i;
            int i2 = 0;
            if (location.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, location.name);
            } else {
                i = 0;
            }
            if (location.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, location.description);
            }
            return i + i2 + location.unknownFields().size();
        }

        /* renamed from: a */
        public Location decode(ProtoReader protoReader) throws IOException {
            C15037a aVar = new C15037a();
            aVar.f39784a = "";
            aVar.f39785b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39784a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39785b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Location location) throws IOException {
            if (location.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, location.name);
            }
            if (location.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, location.description);
            }
            protoWriter.writeBytes(location.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Location$a */
    public static final class C15037a extends Message.Builder<Location, C15037a> {

        /* renamed from: a */
        public String f39784a;

        /* renamed from: b */
        public String f39785b;

        /* renamed from: a */
        public Location build() {
            return new Location(this.f39784a, this.f39785b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15037a mo54944a(String str) {
            this.f39784a = str;
            return this;
        }

        /* renamed from: b */
        public C15037a mo54946b(String str) {
            this.f39785b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15037a newBuilder() {
        C15037a aVar = new C15037a();
        aVar.f39784a = this.name;
        aVar.f39785b = this.description;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Location");
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
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
        this.name = str;
        this.description = str2;
    }
}
