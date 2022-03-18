package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class OncallTag extends Message<OncallTag, C17266a> {
    public static final ProtoAdapter<OncallTag> ADAPTER = new C17267b();
    private static final long serialVersionUID = 0;
    public final String id;
    public final String name;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.OncallTag$b */
    private static final class C17267b extends ProtoAdapter<OncallTag> {
        C17267b() {
            super(FieldEncoding.LENGTH_DELIMITED, OncallTag.class);
        }

        /* renamed from: a */
        public int encodedSize(OncallTag oncallTag) {
            int i;
            int i2 = 0;
            if (oncallTag.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, oncallTag.id);
            } else {
                i = 0;
            }
            if (oncallTag.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, oncallTag.name);
            }
            return i + i2 + oncallTag.unknownFields().size();
        }

        /* renamed from: a */
        public OncallTag decode(ProtoReader protoReader) throws IOException {
            C17266a aVar = new C17266a();
            aVar.f44097a = "";
            aVar.f44098b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44097a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44098b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, OncallTag oncallTag) throws IOException {
            if (oncallTag.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oncallTag.id);
            }
            if (oncallTag.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, oncallTag.name);
            }
            protoWriter.writeBytes(oncallTag.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.OncallTag$a */
    public static final class C17266a extends Message.Builder<OncallTag, C17266a> {

        /* renamed from: a */
        public String f44097a;

        /* renamed from: b */
        public String f44098b;

        /* renamed from: a */
        public OncallTag build() {
            return new OncallTag(this.f44097a, this.f44098b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17266a newBuilder() {
        C17266a aVar = new C17266a();
        aVar.f44097a = this.id;
        aVar.f44098b = this.name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "OncallTag");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        StringBuilder replace = sb.replace(0, 2, "OncallTag{");
        replace.append('}');
        return replace.toString();
    }

    public OncallTag(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public OncallTag(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
    }
}
