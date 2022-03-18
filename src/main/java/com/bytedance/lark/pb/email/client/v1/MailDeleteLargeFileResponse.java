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

public final class MailDeleteLargeFileResponse extends Message<MailDeleteLargeFileResponse, C16694a> {
    public static final ProtoAdapter<MailDeleteLargeFileResponse> ADAPTER = new C16695b();
    private static final long serialVersionUID = 0;
    public final List<String> failed_tokens;
    public final List<String> success_tokens;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileResponse$b */
    private static final class C16695b extends ProtoAdapter<MailDeleteLargeFileResponse> {
        C16695b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteLargeFileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteLargeFileResponse mailDeleteLargeFileResponse) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailDeleteLargeFileResponse.success_tokens) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailDeleteLargeFileResponse.failed_tokens) + mailDeleteLargeFileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteLargeFileResponse decode(ProtoReader protoReader) throws IOException {
            C16694a aVar = new C16694a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43161a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43162b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailDeleteLargeFileResponse mailDeleteLargeFileResponse) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailDeleteLargeFileResponse.success_tokens);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailDeleteLargeFileResponse.failed_tokens);
            protoWriter.writeBytes(mailDeleteLargeFileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteLargeFileResponse$a */
    public static final class C16694a extends Message.Builder<MailDeleteLargeFileResponse, C16694a> {

        /* renamed from: a */
        public List<String> f43161a = Internal.newMutableList();

        /* renamed from: b */
        public List<String> f43162b = Internal.newMutableList();

        /* renamed from: a */
        public MailDeleteLargeFileResponse build() {
            return new MailDeleteLargeFileResponse(this.f43161a, this.f43162b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16694a newBuilder() {
        C16694a aVar = new C16694a();
        aVar.f43161a = Internal.copyOf("success_tokens", this.success_tokens);
        aVar.f43162b = Internal.copyOf("failed_tokens", this.failed_tokens);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteLargeFileResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.success_tokens.isEmpty()) {
            sb.append(", success_tokens=");
            sb.append(this.success_tokens);
        }
        if (!this.failed_tokens.isEmpty()) {
            sb.append(", failed_tokens=");
            sb.append(this.failed_tokens);
        }
        StringBuilder replace = sb.replace(0, 2, "MailDeleteLargeFileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteLargeFileResponse(List<String> list, List<String> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public MailDeleteLargeFileResponse(List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_tokens = Internal.immutableCopyOf("success_tokens", list);
        this.failed_tokens = Internal.immutableCopyOf("failed_tokens", list2);
    }
}
