package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SendMessageRequest extends Message<SendMessageRequest, C18023a> {
    public static final ProtoAdapter<SendMessageRequest> ADAPTER = new C18024b();
    public static final Long DEFAULT_FILE_HANDLE = 0L;
    private static final long serialVersionUID = 0;
    public final String cid;
    public final Long file_handle;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendMessageRequest$b */
    private static final class C18024b extends ProtoAdapter<SendMessageRequest> {
        C18024b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendMessageRequest sendMessageRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, sendMessageRequest.cid);
            if (sendMessageRequest.file_handle != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, sendMessageRequest.file_handle);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + sendMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendMessageRequest decode(ProtoReader protoReader) throws IOException {
            C18023a aVar = new C18023a();
            aVar.f45134a = "";
            aVar.f45135b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45134a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45135b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendMessageRequest sendMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendMessageRequest.cid);
            if (sendMessageRequest.file_handle != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, sendMessageRequest.file_handle);
            }
            protoWriter.writeBytes(sendMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendMessageRequest$a */
    public static final class C18023a extends Message.Builder<SendMessageRequest, C18023a> {

        /* renamed from: a */
        public String f45134a;

        /* renamed from: b */
        public Long f45135b;

        /* renamed from: a */
        public SendMessageRequest build() {
            String str = this.f45134a;
            if (str != null) {
                return new SendMessageRequest(str, this.f45135b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cid");
        }

        /* renamed from: a */
        public C18023a mo62599a(Long l) {
            this.f45135b = l;
            return this;
        }

        /* renamed from: a */
        public C18023a mo62600a(String str) {
            this.f45134a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18023a newBuilder() {
        C18023a aVar = new C18023a();
        aVar.f45134a = this.cid;
        aVar.f45135b = this.file_handle;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", cid=");
        sb.append(this.cid);
        if (this.file_handle != null) {
            sb.append(", file_handle=");
            sb.append(this.file_handle);
        }
        StringBuilder replace = sb.replace(0, 2, "SendMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendMessageRequest(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public SendMessageRequest(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cid = str;
        this.file_handle = l;
    }
}
