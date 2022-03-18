package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class InactiveParent2 extends Message<InactiveParent2, C16320a> {
    public static final ProtoAdapter<InactiveParent2> ADAPTER = new C16321b();
    private static final long serialVersionUID = 0;
    public final String parent_id;
    public final String parent_name;
    public final String student_name;

    /* renamed from: com.bytedance.lark.pb.contact.v1.InactiveParent2$b */
    private static final class C16321b extends ProtoAdapter<InactiveParent2> {
        C16321b() {
            super(FieldEncoding.LENGTH_DELIMITED, InactiveParent2.class);
        }

        /* renamed from: a */
        public int encodedSize(InactiveParent2 inactiveParent2) {
            int i;
            int i2;
            int i3 = 0;
            if (inactiveParent2.student_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, inactiveParent2.student_name);
            } else {
                i = 0;
            }
            if (inactiveParent2.parent_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, inactiveParent2.parent_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (inactiveParent2.parent_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, inactiveParent2.parent_name);
            }
            return i4 + i3 + inactiveParent2.unknownFields().size();
        }

        /* renamed from: a */
        public InactiveParent2 decode(ProtoReader protoReader) throws IOException {
            C16320a aVar = new C16320a();
            aVar.f42565a = "";
            aVar.f42566b = "";
            aVar.f42567c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42565a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42566b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42567c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InactiveParent2 inactiveParent2) throws IOException {
            if (inactiveParent2.student_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inactiveParent2.student_name);
            }
            if (inactiveParent2.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, inactiveParent2.parent_id);
            }
            if (inactiveParent2.parent_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, inactiveParent2.parent_name);
            }
            protoWriter.writeBytes(inactiveParent2.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.InactiveParent2$a */
    public static final class C16320a extends Message.Builder<InactiveParent2, C16320a> {

        /* renamed from: a */
        public String f42565a;

        /* renamed from: b */
        public String f42566b;

        /* renamed from: c */
        public String f42567c;

        /* renamed from: a */
        public InactiveParent2 build() {
            return new InactiveParent2(this.f42565a, this.f42566b, this.f42567c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16320a newBuilder() {
        C16320a aVar = new C16320a();
        aVar.f42565a = this.student_name;
        aVar.f42566b = this.parent_id;
        aVar.f42567c = this.parent_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "InactiveParent2");
        StringBuilder sb = new StringBuilder();
        if (this.student_name != null) {
            sb.append(", student_name=");
            sb.append(this.student_name);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.parent_name != null) {
            sb.append(", parent_name=");
            sb.append(this.parent_name);
        }
        StringBuilder replace = sb.replace(0, 2, "InactiveParent2{");
        replace.append('}');
        return replace.toString();
    }

    public InactiveParent2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public InactiveParent2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.student_name = str;
        this.parent_id = str2;
        this.parent_name = str3;
    }
}
