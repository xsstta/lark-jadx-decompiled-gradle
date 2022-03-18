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

public final class MailMultiThreadDeletePermanentlyRequest extends Message<MailMultiThreadDeletePermanentlyRequest, C16832a> {
    public static final ProtoAdapter<MailMultiThreadDeletePermanentlyRequest> ADAPTER = new C16833b();
    private static final long serialVersionUID = 0;
    public final String label_id;
    public final List<String> thread_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyRequest$b */
    private static final class C16833b extends ProtoAdapter<MailMultiThreadDeletePermanentlyRequest> {
        C16833b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMultiThreadDeletePermanentlyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMultiThreadDeletePermanentlyRequest mailMultiThreadDeletePermanentlyRequest) {
            int i;
            if (mailMultiThreadDeletePermanentlyRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailMultiThreadDeletePermanentlyRequest.label_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailMultiThreadDeletePermanentlyRequest.thread_ids) + mailMultiThreadDeletePermanentlyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailMultiThreadDeletePermanentlyRequest decode(ProtoReader protoReader) throws IOException {
            C16832a aVar = new C16832a();
            aVar.f43300a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43300a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43301b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMultiThreadDeletePermanentlyRequest mailMultiThreadDeletePermanentlyRequest) throws IOException {
            if (mailMultiThreadDeletePermanentlyRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailMultiThreadDeletePermanentlyRequest.label_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailMultiThreadDeletePermanentlyRequest.thread_ids);
            protoWriter.writeBytes(mailMultiThreadDeletePermanentlyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMultiThreadDeletePermanentlyRequest$a */
    public static final class C16832a extends Message.Builder<MailMultiThreadDeletePermanentlyRequest, C16832a> {

        /* renamed from: a */
        public String f43300a;

        /* renamed from: b */
        public List<String> f43301b = Internal.newMutableList();

        /* renamed from: a */
        public MailMultiThreadDeletePermanentlyRequest build() {
            return new MailMultiThreadDeletePermanentlyRequest(this.f43300a, this.f43301b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16832a mo59610a(String str) {
            this.f43300a = str;
            return this;
        }

        /* renamed from: a */
        public C16832a mo59611a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43301b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16832a newBuilder() {
        C16832a aVar = new C16832a();
        aVar.f43300a = this.label_id;
        aVar.f43301b = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMultiThreadDeletePermanentlyRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMultiThreadDeletePermanentlyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailMultiThreadDeletePermanentlyRequest(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public MailMultiThreadDeletePermanentlyRequest(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
    }
}
