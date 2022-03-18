package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailMoveToFolderResponse extends Message<MailMoveToFolderResponse, C16830a> {
    public static final ProtoAdapter<MailMoveToFolderResponse> ADAPTER = new C16831b();
    private static final long serialVersionUID = 0;
    public final String uuid;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse$b */
    private static final class C16831b extends ProtoAdapter<MailMoveToFolderResponse> {
        C16831b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMoveToFolderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMoveToFolderResponse mailMoveToFolderResponse) {
            int i;
            if (mailMoveToFolderResponse.uuid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailMoveToFolderResponse.uuid);
            } else {
                i = 0;
            }
            return i + mailMoveToFolderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailMoveToFolderResponse decode(ProtoReader protoReader) throws IOException {
            C16830a aVar = new C16830a();
            aVar.f43299a = "";
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
                    aVar.f43299a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMoveToFolderResponse mailMoveToFolderResponse) throws IOException {
            if (mailMoveToFolderResponse.uuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailMoveToFolderResponse.uuid);
            }
            protoWriter.writeBytes(mailMoveToFolderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveToFolderResponse$a */
    public static final class C16830a extends Message.Builder<MailMoveToFolderResponse, C16830a> {

        /* renamed from: a */
        public String f43299a;

        /* renamed from: a */
        public MailMoveToFolderResponse build() {
            return new MailMoveToFolderResponse(this.f43299a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16830a newBuilder() {
        C16830a aVar = new C16830a();
        aVar.f43299a = this.uuid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMoveToFolderResponse");
        StringBuilder sb = new StringBuilder();
        if (this.uuid != null) {
            sb.append(", uuid=");
            sb.append(this.uuid);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMoveToFolderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailMoveToFolderResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailMoveToFolderResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uuid = str;
    }
}
