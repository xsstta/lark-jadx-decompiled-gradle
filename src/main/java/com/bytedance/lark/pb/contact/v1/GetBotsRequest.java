package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetBotsRequest extends Message<GetBotsRequest, C16184a> {
    public static final ProtoAdapter<GetBotsRequest> ADAPTER = new C16185b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer offset;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetBotsRequest$b */
    private static final class C16185b extends ProtoAdapter<GetBotsRequest> {
        C16185b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBotsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBotsRequest getBotsRequest) {
            int i;
            int i2 = 0;
            if (getBotsRequest.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getBotsRequest.offset);
            } else {
                i = 0;
            }
            if (getBotsRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getBotsRequest.count);
            }
            return i + i2 + getBotsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBotsRequest decode(ProtoReader protoReader) throws IOException {
            C16184a aVar = new C16184a();
            aVar.f42342a = 0;
            aVar.f42343b = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42342a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42343b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBotsRequest getBotsRequest) throws IOException {
            if (getBotsRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getBotsRequest.offset);
            }
            if (getBotsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getBotsRequest.count);
            }
            protoWriter.writeBytes(getBotsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetBotsRequest$a */
    public static final class C16184a extends Message.Builder<GetBotsRequest, C16184a> {

        /* renamed from: a */
        public Integer f42342a;

        /* renamed from: b */
        public Integer f42343b;

        /* renamed from: a */
        public GetBotsRequest build() {
            return new GetBotsRequest(this.f42342a, this.f42343b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16184a mo58043a(Integer num) {
            this.f42342a = num;
            return this;
        }

        /* renamed from: b */
        public C16184a mo58045b(Integer num) {
            this.f42343b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16184a newBuilder() {
        C16184a aVar = new C16184a();
        aVar.f42342a = this.offset;
        aVar.f42343b = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetBotsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBotsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBotsRequest(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetBotsRequest(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offset = num;
        this.count = num2;
    }
}
