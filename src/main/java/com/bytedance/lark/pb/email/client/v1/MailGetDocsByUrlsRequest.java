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

public final class MailGetDocsByUrlsRequest extends Message<MailGetDocsByUrlsRequest, C16708a> {
    public static final ProtoAdapter<MailGetDocsByUrlsRequest> ADAPTER = new C16709b();
    private static final long serialVersionUID = 0;
    public final List<String> urls;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsRequest$b */
    private static final class C16709b extends ProtoAdapter<MailGetDocsByUrlsRequest> {
        C16709b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetDocsByUrlsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetDocsByUrlsRequest mailGetDocsByUrlsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailGetDocsByUrlsRequest.urls) + mailGetDocsByUrlsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetDocsByUrlsRequest decode(ProtoReader protoReader) throws IOException {
            C16708a aVar = new C16708a();
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
                    aVar.f43171a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetDocsByUrlsRequest mailGetDocsByUrlsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailGetDocsByUrlsRequest.urls);
            protoWriter.writeBytes(mailGetDocsByUrlsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetDocsByUrlsRequest$a */
    public static final class C16708a extends Message.Builder<MailGetDocsByUrlsRequest, C16708a> {

        /* renamed from: a */
        public List<String> f43171a = Internal.newMutableList();

        /* renamed from: a */
        public MailGetDocsByUrlsRequest build() {
            return new MailGetDocsByUrlsRequest(this.f43171a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16708a mo59338a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43171a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16708a newBuilder() {
        C16708a aVar = new C16708a();
        aVar.f43171a = Internal.copyOf("urls", this.urls);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetDocsByUrlsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.urls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.urls);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetDocsByUrlsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetDocsByUrlsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MailGetDocsByUrlsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urls = Internal.immutableCopyOf("urls", list);
    }
}
