package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAddFolderResponse extends Message<MailAddFolderResponse, C16630a> {
    public static final ProtoAdapter<MailAddFolderResponse> ADAPTER = new C16631b();
    private static final long serialVersionUID = 0;
    public final Label folder;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddFolderResponse$b */
    private static final class C16631b extends ProtoAdapter<MailAddFolderResponse> {
        C16631b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAddFolderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAddFolderResponse mailAddFolderResponse) {
            int i;
            if (mailAddFolderResponse.folder != null) {
                i = Label.ADAPTER.encodedSizeWithTag(1, mailAddFolderResponse.folder);
            } else {
                i = 0;
            }
            return i + mailAddFolderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailAddFolderResponse decode(ProtoReader protoReader) throws IOException {
            C16630a aVar = new C16630a();
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
                    aVar.f43066a = Label.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAddFolderResponse mailAddFolderResponse) throws IOException {
            if (mailAddFolderResponse.folder != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 1, mailAddFolderResponse.folder);
            }
            protoWriter.writeBytes(mailAddFolderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddFolderResponse$a */
    public static final class C16630a extends Message.Builder<MailAddFolderResponse, C16630a> {

        /* renamed from: a */
        public Label f43066a;

        /* renamed from: a */
        public MailAddFolderResponse build() {
            return new MailAddFolderResponse(this.f43066a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16630a newBuilder() {
        C16630a aVar = new C16630a();
        aVar.f43066a = this.folder;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAddFolderResponse");
        StringBuilder sb = new StringBuilder();
        if (this.folder != null) {
            sb.append(", folder=");
            sb.append(this.folder);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAddFolderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailAddFolderResponse(Label label) {
        this(label, ByteString.EMPTY);
    }

    public MailAddFolderResponse(Label label, ByteString byteString) {
        super(ADAPTER, byteString);
        this.folder = label;
    }
}
