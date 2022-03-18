package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class InactiveParent extends Message<InactiveParent, C16318a> {
    public static final ProtoAdapter<InactiveParent> ADAPTER = new C16319b();
    private static final long serialVersionUID = 0;
    public final String id;
    public final ParentDisplayNames names;

    /* renamed from: com.bytedance.lark.pb.contact.v1.InactiveParent$b */
    private static final class C16319b extends ProtoAdapter<InactiveParent> {
        C16319b() {
            super(FieldEncoding.LENGTH_DELIMITED, InactiveParent.class);
        }

        /* renamed from: a */
        public int encodedSize(InactiveParent inactiveParent) {
            int i;
            int i2 = 0;
            if (inactiveParent.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, inactiveParent.id);
            } else {
                i = 0;
            }
            if (inactiveParent.names != null) {
                i2 = ParentDisplayNames.ADAPTER.encodedSizeWithTag(2, inactiveParent.names);
            }
            return i + i2 + inactiveParent.unknownFields().size();
        }

        /* renamed from: a */
        public InactiveParent decode(ProtoReader protoReader) throws IOException {
            C16318a aVar = new C16318a();
            aVar.f42563a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42563a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42564b = ParentDisplayNames.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InactiveParent inactiveParent) throws IOException {
            if (inactiveParent.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inactiveParent.id);
            }
            if (inactiveParent.names != null) {
                ParentDisplayNames.ADAPTER.encodeWithTag(protoWriter, 2, inactiveParent.names);
            }
            protoWriter.writeBytes(inactiveParent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.InactiveParent$a */
    public static final class C16318a extends Message.Builder<InactiveParent, C16318a> {

        /* renamed from: a */
        public String f42563a;

        /* renamed from: b */
        public ParentDisplayNames f42564b;

        /* renamed from: a */
        public InactiveParent build() {
            return new InactiveParent(this.f42563a, this.f42564b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16318a newBuilder() {
        C16318a aVar = new C16318a();
        aVar.f42563a = this.id;
        aVar.f42564b = this.names;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "InactiveParent");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.names != null) {
            sb.append(", names=");
            sb.append(this.names);
        }
        StringBuilder replace = sb.replace(0, 2, "InactiveParent{");
        replace.append('}');
        return replace.toString();
    }

    public InactiveParent(String str, ParentDisplayNames parentDisplayNames) {
        this(str, parentDisplayNames, ByteString.EMPTY);
    }

    public InactiveParent(String str, ParentDisplayNames parentDisplayNames, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.names = parentDisplayNames;
    }
}
