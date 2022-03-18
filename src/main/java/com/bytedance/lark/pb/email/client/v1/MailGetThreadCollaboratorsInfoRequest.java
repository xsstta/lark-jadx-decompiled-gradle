package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetThreadCollaboratorsInfoRequest extends Message<MailGetThreadCollaboratorsInfoRequest, C16796a> {
    public static final ProtoAdapter<MailGetThreadCollaboratorsInfoRequest> ADAPTER = new C16797b();
    private static final long serialVersionUID = 0;
    public final String threadId;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoRequest$b */
    private static final class C16797b extends ProtoAdapter<MailGetThreadCollaboratorsInfoRequest> {
        C16797b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetThreadCollaboratorsInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetThreadCollaboratorsInfoRequest mailGetThreadCollaboratorsInfoRequest) {
            int i;
            if (mailGetThreadCollaboratorsInfoRequest.threadId != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetThreadCollaboratorsInfoRequest.threadId);
            } else {
                i = 0;
            }
            return i + mailGetThreadCollaboratorsInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetThreadCollaboratorsInfoRequest decode(ProtoReader protoReader) throws IOException {
            C16796a aVar = new C16796a();
            aVar.f43260a = "";
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
                    aVar.f43260a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetThreadCollaboratorsInfoRequest mailGetThreadCollaboratorsInfoRequest) throws IOException {
            if (mailGetThreadCollaboratorsInfoRequest.threadId != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetThreadCollaboratorsInfoRequest.threadId);
            }
            protoWriter.writeBytes(mailGetThreadCollaboratorsInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadCollaboratorsInfoRequest$a */
    public static final class C16796a extends Message.Builder<MailGetThreadCollaboratorsInfoRequest, C16796a> {

        /* renamed from: a */
        public String f43260a;

        /* renamed from: a */
        public MailGetThreadCollaboratorsInfoRequest build() {
            return new MailGetThreadCollaboratorsInfoRequest(this.f43260a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16796a mo59534a(String str) {
            this.f43260a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16796a newBuilder() {
        C16796a aVar = new C16796a();
        aVar.f43260a = this.threadId;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetThreadCollaboratorsInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.threadId != null) {
            sb.append(", threadId=");
            sb.append(this.threadId);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetThreadCollaboratorsInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetThreadCollaboratorsInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetThreadCollaboratorsInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.threadId = str;
    }
}
