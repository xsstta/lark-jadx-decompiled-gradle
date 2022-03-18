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

public final class MailDeleteLargeFileRequest extends Message<MailDeleteLargeFileRequest, C16692a> {
    public static final ProtoAdapter<MailDeleteLargeFileRequest> ADAPTER = new C16693b();
    private static final long serialVersionUID = 0;
    public final List<String> tokens;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileRequest$b */
    private static final class C16693b extends ProtoAdapter<MailDeleteLargeFileRequest> {
        C16693b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteLargeFileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteLargeFileRequest mailDeleteLargeFileRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailDeleteLargeFileRequest.tokens) + mailDeleteLargeFileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteLargeFileRequest decode(ProtoReader protoReader) throws IOException {
            C16692a aVar = new C16692a();
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
                    aVar.f43160a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailDeleteLargeFileRequest mailDeleteLargeFileRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailDeleteLargeFileRequest.tokens);
            protoWriter.writeBytes(mailDeleteLargeFileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileRequest$a */
    public static final class C16692a extends Message.Builder<MailDeleteLargeFileRequest, C16692a> {

        /* renamed from: a */
        public List<String> f43160a = Internal.newMutableList();

        /* renamed from: a */
        public MailDeleteLargeFileRequest build() {
            return new MailDeleteLargeFileRequest(this.f43160a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16692a mo59301a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43160a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16692a newBuilder() {
        C16692a aVar = new C16692a();
        aVar.f43160a = Internal.copyOf("tokens", this.tokens);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteLargeFileRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.tokens.isEmpty()) {
            sb.append(", tokens=");
            sb.append(this.tokens);
        }
        StringBuilder replace = sb.replace(0, 2, "MailDeleteLargeFileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteLargeFileRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MailDeleteLargeFileRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tokens = Internal.immutableCopyOf("tokens", list);
    }
}
