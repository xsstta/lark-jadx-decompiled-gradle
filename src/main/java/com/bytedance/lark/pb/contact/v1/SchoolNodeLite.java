package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SchoolNodeLite extends Message<SchoolNodeLite, C16360a> {
    public static final ProtoAdapter<SchoolNodeLite> ADAPTER = new C16361b();
    private static final long serialVersionUID = 0;
    public final String id;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SchoolNodeLite$b */
    private static final class C16361b extends ProtoAdapter<SchoolNodeLite> {
        C16361b() {
            super(FieldEncoding.LENGTH_DELIMITED, SchoolNodeLite.class);
        }

        /* renamed from: a */
        public int encodedSize(SchoolNodeLite schoolNodeLite) {
            int i;
            int i2 = 0;
            if (schoolNodeLite.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, schoolNodeLite.id);
            } else {
                i = 0;
            }
            if (schoolNodeLite.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, schoolNodeLite.name);
            }
            return i + i2 + schoolNodeLite.unknownFields().size();
        }

        /* renamed from: a */
        public SchoolNodeLite decode(ProtoReader protoReader) throws IOException {
            C16360a aVar = new C16360a();
            aVar.f42620a = "";
            aVar.f42621b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42620a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42621b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SchoolNodeLite schoolNodeLite) throws IOException {
            if (schoolNodeLite.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, schoolNodeLite.id);
            }
            if (schoolNodeLite.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, schoolNodeLite.name);
            }
            protoWriter.writeBytes(schoolNodeLite.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SchoolNodeLite$a */
    public static final class C16360a extends Message.Builder<SchoolNodeLite, C16360a> {

        /* renamed from: a */
        public String f42620a;

        /* renamed from: b */
        public String f42621b;

        /* renamed from: a */
        public SchoolNodeLite build() {
            return new SchoolNodeLite(this.f42620a, this.f42621b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16360a newBuilder() {
        C16360a aVar = new C16360a();
        aVar.f42620a = this.id;
        aVar.f42621b = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SchoolNodeLite");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "SchoolNodeLite{");
        replace.append('}');
        return replace.toString();
    }

    public SchoolNodeLite(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public SchoolNodeLite(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
    }
}
