package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateFolderResponse extends Message<MailUpdateFolderResponse, C16950a> {
    public static final ProtoAdapter<MailUpdateFolderResponse> ADAPTER = new C16951b();
    private static final long serialVersionUID = 0;
    public final Label folder;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateFolderResponse$b */
    private static final class C16951b extends ProtoAdapter<MailUpdateFolderResponse> {
        C16951b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateFolderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateFolderResponse mailUpdateFolderResponse) {
            int i;
            if (mailUpdateFolderResponse.folder != null) {
                i = Label.ADAPTER.encodedSizeWithTag(1, mailUpdateFolderResponse.folder);
            } else {
                i = 0;
            }
            return i + mailUpdateFolderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateFolderResponse decode(ProtoReader protoReader) throws IOException {
            C16950a aVar = new C16950a();
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
                    aVar.f43451a = Label.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateFolderResponse mailUpdateFolderResponse) throws IOException {
            if (mailUpdateFolderResponse.folder != null) {
                Label.ADAPTER.encodeWithTag(protoWriter, 1, mailUpdateFolderResponse.folder);
            }
            protoWriter.writeBytes(mailUpdateFolderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateFolderResponse$a */
    public static final class C16950a extends Message.Builder<MailUpdateFolderResponse, C16950a> {

        /* renamed from: a */
        public Label f43451a;

        /* renamed from: a */
        public MailUpdateFolderResponse build() {
            return new MailUpdateFolderResponse(this.f43451a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16950a newBuilder() {
        C16950a aVar = new C16950a();
        aVar.f43451a = this.folder;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateFolderResponse");
        StringBuilder sb = new StringBuilder();
        if (this.folder != null) {
            sb.append(", folder=");
            sb.append(this.folder);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateFolderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateFolderResponse(Label label) {
        this(label, ByteString.EMPTY);
    }

    public MailUpdateFolderResponse(Label label, ByteString byteString) {
        super(ADAPTER, byteString);
        this.folder = label;
    }
}
