package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ClassPathName extends Message<ClassPathName, C16140a> {
    public static final ProtoAdapter<ClassPathName> ADAPTER = new C16141b();
    private static final long serialVersionUID = 0;
    public final String campus_name;
    public final String class_name;
    public final String grade_name;
    public final String period_name;
    public final String tenant_name;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ClassPathName$b */
    private static final class C16141b extends ProtoAdapter<ClassPathName> {
        C16141b() {
            super(FieldEncoding.LENGTH_DELIMITED, ClassPathName.class);
        }

        /* renamed from: a */
        public int encodedSize(ClassPathName classPathName) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (classPathName.tenant_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, classPathName.tenant_name);
            } else {
                i = 0;
            }
            if (classPathName.campus_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, classPathName.campus_name);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (classPathName.period_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, classPathName.period_name);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (classPathName.grade_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, classPathName.grade_name);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (classPathName.class_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, classPathName.class_name);
            }
            return i8 + i5 + classPathName.unknownFields().size();
        }

        /* renamed from: a */
        public ClassPathName decode(ProtoReader protoReader) throws IOException {
            C16140a aVar = new C16140a();
            aVar.f42252a = "";
            aVar.f42253b = "";
            aVar.f42254c = "";
            aVar.f42255d = "";
            aVar.f42256e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42252a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42253b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42254c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42255d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42256e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ClassPathName classPathName) throws IOException {
            if (classPathName.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, classPathName.tenant_name);
            }
            if (classPathName.campus_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, classPathName.campus_name);
            }
            if (classPathName.period_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, classPathName.period_name);
            }
            if (classPathName.grade_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, classPathName.grade_name);
            }
            if (classPathName.class_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, classPathName.class_name);
            }
            protoWriter.writeBytes(classPathName.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ClassPathName$a */
    public static final class C16140a extends Message.Builder<ClassPathName, C16140a> {

        /* renamed from: a */
        public String f42252a;

        /* renamed from: b */
        public String f42253b;

        /* renamed from: c */
        public String f42254c;

        /* renamed from: d */
        public String f42255d;

        /* renamed from: e */
        public String f42256e;

        /* renamed from: a */
        public ClassPathName build() {
            return new ClassPathName(this.f42252a, this.f42253b, this.f42254c, this.f42255d, this.f42256e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16140a newBuilder() {
        C16140a aVar = new C16140a();
        aVar.f42252a = this.tenant_name;
        aVar.f42253b = this.campus_name;
        aVar.f42254c = this.period_name;
        aVar.f42255d = this.grade_name;
        aVar.f42256e = this.class_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ClassPathName");
        StringBuilder sb = new StringBuilder();
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        if (this.campus_name != null) {
            sb.append(", campus_name=");
            sb.append(this.campus_name);
        }
        if (this.period_name != null) {
            sb.append(", period_name=");
            sb.append(this.period_name);
        }
        if (this.grade_name != null) {
            sb.append(", grade_name=");
            sb.append(this.grade_name);
        }
        if (this.class_name != null) {
            sb.append(", class_name=");
            sb.append(this.class_name);
        }
        StringBuilder replace = sb.replace(0, 2, "ClassPathName{");
        replace.append('}');
        return replace.toString();
    }

    public ClassPathName(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, ByteString.EMPTY);
    }

    public ClassPathName(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_name = str;
        this.campus_name = str2;
        this.period_name = str3;
        this.grade_name = str4;
        this.class_name = str5;
    }
}
