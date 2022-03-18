package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendLarkCommandPayloadRequest extends Message<SendLarkCommandPayloadRequest, C15257a> {
    public static final ProtoAdapter<SendLarkCommandPayloadRequest> ADAPTER = new C15258b();
    public static final Integer DEFAULT_CMD = 0;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final Integer cmd;
    public final ByteString payload;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendLarkCommandPayloadRequest$b */
    private static final class C15258b extends ProtoAdapter<SendLarkCommandPayloadRequest> {
        C15258b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendLarkCommandPayloadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendLarkCommandPayloadRequest sendLarkCommandPayloadRequest) {
            int i;
            int i2 = 0;
            if (sendLarkCommandPayloadRequest.payload != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, sendLarkCommandPayloadRequest.payload);
            } else {
                i = 0;
            }
            if (sendLarkCommandPayloadRequest.cmd != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, sendLarkCommandPayloadRequest.cmd);
            }
            return i + i2 + sendLarkCommandPayloadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendLarkCommandPayloadRequest decode(ProtoReader protoReader) throws IOException {
            C15257a aVar = new C15257a();
            aVar.f40452a = ByteString.EMPTY;
            aVar.f40453b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40452a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40453b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendLarkCommandPayloadRequest sendLarkCommandPayloadRequest) throws IOException {
            if (sendLarkCommandPayloadRequest.payload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, sendLarkCommandPayloadRequest.payload);
            }
            if (sendLarkCommandPayloadRequest.cmd != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendLarkCommandPayloadRequest.cmd);
            }
            protoWriter.writeBytes(sendLarkCommandPayloadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendLarkCommandPayloadRequest$a */
    public static final class C15257a extends Message.Builder<SendLarkCommandPayloadRequest, C15257a> {

        /* renamed from: a */
        public ByteString f40452a;

        /* renamed from: b */
        public Integer f40453b;

        /* renamed from: a */
        public SendLarkCommandPayloadRequest build() {
            return new SendLarkCommandPayloadRequest(this.f40452a, this.f40453b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15257a mo55541a(Integer num) {
            this.f40453b = num;
            return this;
        }

        /* renamed from: a */
        public C15257a mo55542a(ByteString byteString) {
            this.f40452a = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15257a newBuilder() {
        C15257a aVar = new C15257a();
        aVar.f40452a = this.payload;
        aVar.f40453b = this.cmd;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SendLarkCommandPayloadRequest");
        StringBuilder sb = new StringBuilder();
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        StringBuilder replace = sb.replace(0, 2, "SendLarkCommandPayloadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendLarkCommandPayloadRequest(ByteString byteString, Integer num) {
        this(byteString, num, ByteString.EMPTY);
    }

    public SendLarkCommandPayloadRequest(ByteString byteString, Integer num, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.payload = byteString;
        this.cmd = num;
    }
}
