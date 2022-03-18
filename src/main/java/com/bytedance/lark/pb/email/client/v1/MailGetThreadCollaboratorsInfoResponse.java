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

public final class MailGetThreadCollaboratorsInfoResponse extends Message<MailGetThreadCollaboratorsInfoResponse, C16798a> {
    public static final ProtoAdapter<MailGetThreadCollaboratorsInfoResponse> ADAPTER = new C16799b();
    private static final long serialVersionUID = 0;
    public final String threadId;
    public final List<UserInfo> users;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse$b */
    private static final class C16799b extends ProtoAdapter<MailGetThreadCollaboratorsInfoResponse> {
        C16799b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetThreadCollaboratorsInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) {
            int i;
            if (mailGetThreadCollaboratorsInfoResponse.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetThreadCollaboratorsInfoResponse.threadId);
            } else {
                i = 0;
            }
            return i + UserInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, mailGetThreadCollaboratorsInfoResponse.users) + mailGetThreadCollaboratorsInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetThreadCollaboratorsInfoResponse decode(ProtoReader protoReader) throws IOException {
            C16798a aVar = new C16798a();
            aVar.f43261a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43261a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43262b.add(UserInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetThreadCollaboratorsInfoResponse mailGetThreadCollaboratorsInfoResponse) throws IOException {
            if (mailGetThreadCollaboratorsInfoResponse.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetThreadCollaboratorsInfoResponse.threadId);
            }
            UserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailGetThreadCollaboratorsInfoResponse.users);
            protoWriter.writeBytes(mailGetThreadCollaboratorsInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoResponse$a */
    public static final class C16798a extends Message.Builder<MailGetThreadCollaboratorsInfoResponse, C16798a> {

        /* renamed from: a */
        public String f43261a;

        /* renamed from: b */
        public List<UserInfo> f43262b = Internal.newMutableList();

        /* renamed from: a */
        public MailGetThreadCollaboratorsInfoResponse build() {
            return new MailGetThreadCollaboratorsInfoResponse(this.f43261a, this.f43262b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16798a newBuilder() {
        C16798a aVar = new C16798a();
        aVar.f43261a = this.threadId;
        aVar.f43262b = Internal.copyOf("users", this.users);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetThreadCollaboratorsInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetThreadCollaboratorsInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetThreadCollaboratorsInfoResponse(String str, List<UserInfo> list) {
        this(str, list, ByteString.EMPTY);
    }

    public MailGetThreadCollaboratorsInfoResponse(String str, List<UserInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
        this.users = Internal.immutableCopyOf("users", list);
    }
}
