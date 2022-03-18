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

public final class MailDeleteMultiDraftsRequest extends Message<MailDeleteMultiDraftsRequest, C16698a> {
    public static final ProtoAdapter<MailDeleteMultiDraftsRequest> ADAPTER = new C16699b();
    private static final long serialVersionUID = 0;
    public final String from_label;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftsRequest$b */
    private static final class C16699b extends ProtoAdapter<MailDeleteMultiDraftsRequest> {
        C16699b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailDeleteMultiDraftsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailDeleteMultiDraftsRequest mailDeleteMultiDraftsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailDeleteMultiDraftsRequest.thread_ids);
            if (mailDeleteMultiDraftsRequest.from_label != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailDeleteMultiDraftsRequest.from_label);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + mailDeleteMultiDraftsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailDeleteMultiDraftsRequest decode(ProtoReader protoReader) throws IOException {
            C16698a aVar = new C16698a();
            aVar.f43164b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43163a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43164b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailDeleteMultiDraftsRequest mailDeleteMultiDraftsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailDeleteMultiDraftsRequest.thread_ids);
            if (mailDeleteMultiDraftsRequest.from_label != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailDeleteMultiDraftsRequest.from_label);
            }
            protoWriter.writeBytes(mailDeleteMultiDraftsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailDeleteMultiDraftsRequest$a */
    public static final class C16698a extends Message.Builder<MailDeleteMultiDraftsRequest, C16698a> {

        /* renamed from: a */
        public List<String> f43163a = Internal.newMutableList();

        /* renamed from: b */
        public String f43164b;

        /* renamed from: a */
        public MailDeleteMultiDraftsRequest build() {
            return new MailDeleteMultiDraftsRequest(this.f43163a, this.f43164b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16698a mo59314a(String str) {
            this.f43164b = str;
            return this;
        }

        /* renamed from: a */
        public C16698a mo59315a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43163a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16698a newBuilder() {
        C16698a aVar = new C16698a();
        aVar.f43163a = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f43164b = this.from_label;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailDeleteMultiDraftsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (this.from_label != null) {
            sb.append(", from_label=");
            sb.append(this.from_label);
        }
        StringBuilder replace = sb.replace(0, 2, "MailDeleteMultiDraftsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailDeleteMultiDraftsRequest(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public MailDeleteMultiDraftsRequest(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.from_label = str;
    }
}
