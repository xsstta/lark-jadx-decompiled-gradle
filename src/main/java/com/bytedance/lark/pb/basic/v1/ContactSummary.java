package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ContactSummary extends Message<ContactSummary, C14834a> {
    public static final ProtoAdapter<ContactSummary> ADAPTER = new C14835b();
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String avatar_path;
    public final String department_name;
    public final String tenant_name;
    public final String user_en_name;
    public final String user_id;
    public final String user_name;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ContactSummary$b */
    private static final class C14835b extends ProtoAdapter<ContactSummary> {
        C14835b() {
            super(FieldEncoding.LENGTH_DELIMITED, ContactSummary.class);
        }

        /* renamed from: a */
        public int encodedSize(ContactSummary contactSummary) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (contactSummary.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, contactSummary.user_id);
            } else {
                i = 0;
            }
            if (contactSummary.user_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, contactSummary.user_name);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (contactSummary.user_en_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, contactSummary.user_en_name);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (contactSummary.department_name != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, contactSummary.department_name);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (contactSummary.avatar_key != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, contactSummary.avatar_key);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (contactSummary.tenant_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, contactSummary.tenant_name);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (contactSummary.avatar_path != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, contactSummary.avatar_path);
            }
            return i12 + i7 + contactSummary.unknownFields().size();
        }

        /* renamed from: a */
        public ContactSummary decode(ProtoReader protoReader) throws IOException {
            C14834a aVar = new C14834a();
            aVar.f39180a = "";
            aVar.f39181b = "";
            aVar.f39182c = "";
            aVar.f39183d = "";
            aVar.f39184e = "";
            aVar.f39185f = "";
            aVar.f39186g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39180a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39181b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39182c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39183d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39184e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39185f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39186g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ContactSummary contactSummary) throws IOException {
            if (contactSummary.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, contactSummary.user_id);
            }
            if (contactSummary.user_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, contactSummary.user_name);
            }
            if (contactSummary.user_en_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, contactSummary.user_en_name);
            }
            if (contactSummary.department_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, contactSummary.department_name);
            }
            if (contactSummary.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, contactSummary.avatar_key);
            }
            if (contactSummary.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, contactSummary.tenant_name);
            }
            if (contactSummary.avatar_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, contactSummary.avatar_path);
            }
            protoWriter.writeBytes(contactSummary.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ContactSummary$a */
    public static final class C14834a extends Message.Builder<ContactSummary, C14834a> {

        /* renamed from: a */
        public String f39180a;

        /* renamed from: b */
        public String f39181b;

        /* renamed from: c */
        public String f39182c;

        /* renamed from: d */
        public String f39183d;

        /* renamed from: e */
        public String f39184e;

        /* renamed from: f */
        public String f39185f;

        /* renamed from: g */
        public String f39186g;

        /* renamed from: a */
        public ContactSummary build() {
            return new ContactSummary(this.f39180a, this.f39181b, this.f39182c, this.f39183d, this.f39184e, this.f39185f, this.f39186g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14834a newBuilder() {
        C14834a aVar = new C14834a();
        aVar.f39180a = this.user_id;
        aVar.f39181b = this.user_name;
        aVar.f39182c = this.user_en_name;
        aVar.f39183d = this.department_name;
        aVar.f39184e = this.avatar_key;
        aVar.f39185f = this.tenant_name;
        aVar.f39186g = this.avatar_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ContactSummary");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.user_name != null) {
            sb.append(", user_name=");
            sb.append(this.user_name);
        }
        if (this.user_en_name != null) {
            sb.append(", user_en_name=");
            sb.append(this.user_en_name);
        }
        if (this.department_name != null) {
            sb.append(", department_name=");
            sb.append(this.department_name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        if (this.avatar_path != null) {
            sb.append(", avatar_path=");
            sb.append(this.avatar_path);
        }
        StringBuilder replace = sb.replace(0, 2, "ContactSummary{");
        replace.append('}');
        return replace.toString();
    }

    public ContactSummary(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, ByteString.EMPTY);
    }

    public ContactSummary(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.user_name = str2;
        this.user_en_name = str3;
        this.department_name = str4;
        this.avatar_key = str5;
        this.tenant_name = str6;
        this.avatar_path = str7;
    }
}
