package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailDeleteFolderResponse extends Message<MailDeleteFolderResponse, C16686a> {
    public static final ProtoAdapter<MailDeleteFolderResponse> ADAPTER = new C16687b();
    private static final long serialVersionUID = 0;
    public final String session_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteFolderResponse$b */
    private static final class C16687b extends ProtoAdapter<MailDeleteFolderResponse> {
        C16687b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteFolderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteFolderResponse mailDeleteFolderResponse) {
            int i;
            if (mailDeleteFolderResponse.session_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailDeleteFolderResponse.session_id);
            } else {
                i = 0;
            }
            return i + mailDeleteFolderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteFolderResponse decode(ProtoReader protoReader) throws IOException {
            C16686a aVar = new C16686a();
            aVar.f43158a = "";
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
                    aVar.f43158a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailDeleteFolderResponse mailDeleteFolderResponse) throws IOException {
            if (mailDeleteFolderResponse.session_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailDeleteFolderResponse.session_id);
            }
            protoWriter.writeBytes(mailDeleteFolderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteFolderResponse$a */
    public static final class C16686a extends Message.Builder<MailDeleteFolderResponse, C16686a> {

        /* renamed from: a */
        public String f43158a;

        /* renamed from: a */
        public MailDeleteFolderResponse build() {
            return new MailDeleteFolderResponse(this.f43158a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16686a newBuilder() {
        C16686a aVar = new C16686a();
        aVar.f43158a = this.session_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteFolderResponse");
        StringBuilder sb = new StringBuilder();
        if (this.session_id != null) {
            sb.append(", session_id=");
            sb.append(this.session_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailDeleteFolderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteFolderResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailDeleteFolderResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.session_id = str;
    }
}
