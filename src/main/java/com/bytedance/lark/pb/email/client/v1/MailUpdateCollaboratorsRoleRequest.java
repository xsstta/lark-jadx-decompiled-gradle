package com.bytedance.lark.pb.email.client.v1;

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

public final class MailUpdateCollaboratorsRoleRequest extends Message<MailUpdateCollaboratorsRoleRequest, C16938a> {
    public static final ProtoAdapter<MailUpdateCollaboratorsRoleRequest> ADAPTER = new C16939b();
    private static final long serialVersionUID = 0;
    public final String threadId;
    public final List<UserPayload> users;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleRequest$b */
    private static final class C16939b extends ProtoAdapter<MailUpdateCollaboratorsRoleRequest> {
        C16939b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateCollaboratorsRoleRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateCollaboratorsRoleRequest mailUpdateCollaboratorsRoleRequest) {
            int i;
            if (mailUpdateCollaboratorsRoleRequest.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateCollaboratorsRoleRequest.threadId);
            } else {
                i = 0;
            }
            return i + UserPayload.ADAPTER.asRepeated().encodedSizeWithTag(2, mailUpdateCollaboratorsRoleRequest.users) + mailUpdateCollaboratorsRoleRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateCollaboratorsRoleRequest decode(ProtoReader protoReader) throws IOException {
            C16938a aVar = new C16938a();
            aVar.f43428a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43428a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43429b.add(UserPayload.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateCollaboratorsRoleRequest mailUpdateCollaboratorsRoleRequest) throws IOException {
            if (mailUpdateCollaboratorsRoleRequest.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateCollaboratorsRoleRequest.threadId);
            }
            UserPayload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailUpdateCollaboratorsRoleRequest.users);
            protoWriter.writeBytes(mailUpdateCollaboratorsRoleRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleRequest$a */
    public static final class C16938a extends Message.Builder<MailUpdateCollaboratorsRoleRequest, C16938a> {

        /* renamed from: a */
        public String f43428a;

        /* renamed from: b */
        public List<UserPayload> f43429b = Internal.newMutableList();

        /* renamed from: a */
        public MailUpdateCollaboratorsRoleRequest build() {
            return new MailUpdateCollaboratorsRoleRequest(this.f43428a, this.f43429b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16938a mo59849a(String str) {
            this.f43428a = str;
            return this;
        }

        /* renamed from: a */
        public C16938a mo59850a(List<UserPayload> list) {
            Internal.checkElementsNotNull(list);
            this.f43429b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16938a newBuilder() {
        C16938a aVar = new C16938a();
        aVar.f43428a = this.threadId;
        aVar.f43429b = Internal.copyOf("users", this.users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateCollaboratorsRoleRequest");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateCollaboratorsRoleRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateCollaboratorsRoleRequest(String str, List<UserPayload> list) {
        this(str, list, ByteString.EMPTY);
    }

    public MailUpdateCollaboratorsRoleRequest(String str, List<UserPayload> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
        this.users = Internal.immutableCopyOf("users", list);
    }
}
