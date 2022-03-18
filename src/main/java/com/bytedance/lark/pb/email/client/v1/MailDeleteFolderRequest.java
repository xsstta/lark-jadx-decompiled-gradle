package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailDeleteFolderRequest extends Message<MailDeleteFolderRequest, C16684a> {
    public static final ProtoAdapter<MailDeleteFolderRequest> ADAPTER = new C16685b();
    private static final long serialVersionUID = 0;
    public final String folder_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteFolderRequest$b */
    private static final class C16685b extends ProtoAdapter<MailDeleteFolderRequest> {
        C16685b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteFolderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteFolderRequest mailDeleteFolderRequest) {
            int i;
            if (mailDeleteFolderRequest.folder_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailDeleteFolderRequest.folder_id);
            } else {
                i = 0;
            }
            return i + mailDeleteFolderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteFolderRequest decode(ProtoReader protoReader) throws IOException {
            C16684a aVar = new C16684a();
            aVar.f43157a = "";
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
                    aVar.f43157a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailDeleteFolderRequest mailDeleteFolderRequest) throws IOException {
            if (mailDeleteFolderRequest.folder_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailDeleteFolderRequest.folder_id);
            }
            protoWriter.writeBytes(mailDeleteFolderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteFolderRequest$a */
    public static final class C16684a extends Message.Builder<MailDeleteFolderRequest, C16684a> {

        /* renamed from: a */
        public String f43157a;

        /* renamed from: a */
        public MailDeleteFolderRequest build() {
            return new MailDeleteFolderRequest(this.f43157a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16684a newBuilder() {
        C16684a aVar = new C16684a();
        aVar.f43157a = this.folder_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteFolderRequest");
        StringBuilder sb = new StringBuilder();
        if (this.folder_id != null) {
            sb.append(", folder_id=");
            sb.append(this.folder_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailDeleteFolderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteFolderRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailDeleteFolderRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.folder_id = str;
    }
}
