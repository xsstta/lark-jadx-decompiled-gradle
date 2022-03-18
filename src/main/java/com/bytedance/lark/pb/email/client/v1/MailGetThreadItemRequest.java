package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetThreadItemRequest extends Message<MailGetThreadItemRequest, C16800a> {
    public static final ProtoAdapter<MailGetThreadItemRequest> ADAPTER = new C16801b();
    private static final long serialVersionUID = 0;
    public final String label_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadItemRequest$b */
    private static final class C16801b extends ProtoAdapter<MailGetThreadItemRequest> {
        C16801b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetThreadItemRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetThreadItemRequest mailGetThreadItemRequest) {
            int i;
            int i2 = 0;
            if (mailGetThreadItemRequest.label_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetThreadItemRequest.label_id);
            } else {
                i = 0;
            }
            if (mailGetThreadItemRequest.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetThreadItemRequest.thread_id);
            }
            return i + i2 + mailGetThreadItemRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetThreadItemRequest decode(ProtoReader protoReader) throws IOException {
            C16800a aVar = new C16800a();
            aVar.f43263a = "";
            aVar.f43264b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43263a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43264b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetThreadItemRequest mailGetThreadItemRequest) throws IOException {
            if (mailGetThreadItemRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetThreadItemRequest.label_id);
            }
            if (mailGetThreadItemRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetThreadItemRequest.thread_id);
            }
            protoWriter.writeBytes(mailGetThreadItemRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadItemRequest$a */
    public static final class C16800a extends Message.Builder<MailGetThreadItemRequest, C16800a> {

        /* renamed from: a */
        public String f43263a;

        /* renamed from: b */
        public String f43264b;

        /* renamed from: a */
        public MailGetThreadItemRequest build() {
            return new MailGetThreadItemRequest(this.f43263a, this.f43264b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16800a mo59543a(String str) {
            this.f43263a = str;
            return this;
        }

        /* renamed from: b */
        public C16800a mo59545b(String str) {
            this.f43264b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16800a newBuilder() {
        C16800a aVar = new C16800a();
        aVar.f43263a = this.label_id;
        aVar.f43264b = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetThreadItemRequest");
        StringBuilder sb = new StringBuilder();
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetThreadItemRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetThreadItemRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailGetThreadItemRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.label_id = str;
        this.thread_id = str2;
    }
}
