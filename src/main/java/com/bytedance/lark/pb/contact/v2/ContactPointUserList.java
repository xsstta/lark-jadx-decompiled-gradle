package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ContactPointUserList extends Message<ContactPointUserList, C16428a> {
    public static final ProtoAdapter<ContactPointUserList> ADAPTER = new C16429b();
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final List<ContactPointUserInfo> users;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.contact.v2.ContactPointUserList$b */
    private static final class C16429b extends ProtoAdapter<ContactPointUserList> {
        C16429b() {
            super(FieldEncoding.LENGTH_DELIMITED, ContactPointUserList.class);
        }

        /* renamed from: a */
        public int encodedSize(ContactPointUserList contactPointUserList) {
            int i;
            int encodedSizeWithTag = ContactPointUserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, contactPointUserList.users);
            if (contactPointUserList.version != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, contactPointUserList.version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + contactPointUserList.unknownFields().size();
        }

        /* renamed from: a */
        public ContactPointUserList decode(ProtoReader protoReader) throws IOException {
            C16428a aVar = new C16428a();
            aVar.f42728b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42727a.add(ContactPointUserInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42728b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ContactPointUserList contactPointUserList) throws IOException {
            ContactPointUserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, contactPointUserList.users);
            if (contactPointUserList.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, contactPointUserList.version);
            }
            protoWriter.writeBytes(contactPointUserList.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.ContactPointUserList$a */
    public static final class C16428a extends Message.Builder<ContactPointUserList, C16428a> {

        /* renamed from: a */
        public List<ContactPointUserInfo> f42727a = Internal.newMutableList();

        /* renamed from: b */
        public Long f42728b;

        /* renamed from: a */
        public ContactPointUserList build() {
            return new ContactPointUserList(this.f42727a, this.f42728b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16428a newBuilder() {
        C16428a aVar = new C16428a();
        aVar.f42727a = Internal.copyOf("users", this.users);
        aVar.f42728b = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ContactPointUserList");
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "ContactPointUserList{");
        replace.append('}');
        return replace.toString();
    }

    public ContactPointUserList(List<ContactPointUserInfo> list, Long l) {
        this(list, l, ByteString.EMPTY);
    }

    public ContactPointUserList(List<ContactPointUserInfo> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = Internal.immutableCopyOf("users", list);
        this.version = l;
    }
}
