package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateCollaboratorsRoleResponse extends Message<MailUpdateCollaboratorsRoleResponse, C16940a> {
    public static final ProtoAdapter<MailUpdateCollaboratorsRoleResponse> ADAPTER = new C16941b();
    private static final long serialVersionUID = 0;
    public final String threadId;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleResponse$b */
    private static final class C16941b extends ProtoAdapter<MailUpdateCollaboratorsRoleResponse> {
        C16941b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateCollaboratorsRoleResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateCollaboratorsRoleResponse mailUpdateCollaboratorsRoleResponse) {
            int i;
            if (mailUpdateCollaboratorsRoleResponse.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateCollaboratorsRoleResponse.threadId);
            } else {
                i = 0;
            }
            return i + mailUpdateCollaboratorsRoleResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateCollaboratorsRoleResponse decode(ProtoReader protoReader) throws IOException {
            C16940a aVar = new C16940a();
            aVar.f43430a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43430a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateCollaboratorsRoleResponse mailUpdateCollaboratorsRoleResponse) throws IOException {
            if (mailUpdateCollaboratorsRoleResponse.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateCollaboratorsRoleResponse.threadId);
            }
            protoWriter.writeBytes(mailUpdateCollaboratorsRoleResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateCollaboratorsRoleResponse$a */
    public static final class C16940a extends Message.Builder<MailUpdateCollaboratorsRoleResponse, C16940a> {

        /* renamed from: a */
        public String f43430a;

        /* renamed from: a */
        public MailUpdateCollaboratorsRoleResponse build() {
            return new MailUpdateCollaboratorsRoleResponse(this.f43430a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16940a newBuilder() {
        C16940a aVar = new C16940a();
        aVar.f43430a = this.threadId;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateCollaboratorsRoleResponse");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateCollaboratorsRoleResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateCollaboratorsRoleResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailUpdateCollaboratorsRoleResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
    }
}
