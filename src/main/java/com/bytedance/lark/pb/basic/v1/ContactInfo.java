package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ContactInfo extends Message<ContactInfo, C14832a> {
    public static final ProtoAdapter<ContactInfo> ADAPTER = new C14833b();
    public static final ContactOperation DEFAULT_OP = ContactOperation.OPERATION_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final ContactOperation op;
    public final UserInfo user_info;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ContactInfo$b */
    private static final class C14833b extends ProtoAdapter<ContactInfo> {
        C14833b() {
            super(FieldEncoding.LENGTH_DELIMITED, ContactInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ContactInfo contactInfo) {
            int i;
            int encodedSizeWithTag = UserInfo.ADAPTER.encodedSizeWithTag(1, contactInfo.user_info);
            if (contactInfo.op != null) {
                i = ContactOperation.ADAPTER.encodedSizeWithTag(2, contactInfo.op);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + contactInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ContactInfo decode(ProtoReader protoReader) throws IOException {
            C14832a aVar = new C14832a();
            aVar.f39179b = ContactOperation.OPERATION_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39178a = UserInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f39179b = ContactOperation.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ContactInfo contactInfo) throws IOException {
            UserInfo.ADAPTER.encodeWithTag(protoWriter, 1, contactInfo.user_info);
            if (contactInfo.op != null) {
                ContactOperation.ADAPTER.encodeWithTag(protoWriter, 2, contactInfo.op);
            }
            protoWriter.writeBytes(contactInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ContactInfo$a */
    public static final class C14832a extends Message.Builder<ContactInfo, C14832a> {

        /* renamed from: a */
        public UserInfo f39178a;

        /* renamed from: b */
        public ContactOperation f39179b;

        /* renamed from: a */
        public ContactInfo build() {
            UserInfo userInfo = this.f39178a;
            if (userInfo != null) {
                return new ContactInfo(userInfo, this.f39179b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userInfo, "user_info");
        }
    }

    @Override // com.squareup.wire.Message
    public C14832a newBuilder() {
        C14832a aVar = new C14832a();
        aVar.f39178a = this.user_info;
        aVar.f39179b = this.op;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ContactInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_info=");
        sb.append(this.user_info);
        if (this.op != null) {
            sb.append(", op=");
            sb.append(this.op);
        }
        StringBuilder replace = sb.replace(0, 2, "ContactInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ContactInfo(UserInfo userInfo, ContactOperation contactOperation) {
        this(userInfo, contactOperation, ByteString.EMPTY);
    }

    public ContactInfo(UserInfo userInfo, ContactOperation contactOperation, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_info = userInfo;
        this.op = contactOperation;
    }
}
