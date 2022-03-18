package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetChatterDescriptionsRequest extends Message<GetChatterDescriptionsRequest, C16188a> {
    public static final ProtoAdapter<GetChatterDescriptionsRequest> ADAPTER = new C16189b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer offset;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsRequest$b */
    private static final class C16189b extends ProtoAdapter<GetChatterDescriptionsRequest> {
        C16189b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatterDescriptionsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatterDescriptionsRequest getChatterDescriptionsRequest) {
            int i;
            int i2 = 0;
            if (getChatterDescriptionsRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getChatterDescriptionsRequest.count);
            } else {
                i = 0;
            }
            if (getChatterDescriptionsRequest.offset != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getChatterDescriptionsRequest.offset);
            }
            return i + i2 + getChatterDescriptionsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatterDescriptionsRequest decode(ProtoReader protoReader) throws IOException {
            C16188a aVar = new C16188a();
            aVar.f42346a = 20;
            aVar.f42347b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42346a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42347b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatterDescriptionsRequest getChatterDescriptionsRequest) throws IOException {
            if (getChatterDescriptionsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getChatterDescriptionsRequest.count);
            }
            if (getChatterDescriptionsRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatterDescriptionsRequest.offset);
            }
            protoWriter.writeBytes(getChatterDescriptionsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetChatterDescriptionsRequest$a */
    public static final class C16188a extends Message.Builder<GetChatterDescriptionsRequest, C16188a> {

        /* renamed from: a */
        public Integer f42346a;

        /* renamed from: b */
        public Integer f42347b;

        /* renamed from: a */
        public GetChatterDescriptionsRequest build() {
            return new GetChatterDescriptionsRequest(this.f42346a, this.f42347b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16188a mo58053a(Integer num) {
            this.f42346a = num;
            return this;
        }

        /* renamed from: b */
        public C16188a mo58055b(Integer num) {
            this.f42347b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16188a newBuilder() {
        C16188a aVar = new C16188a();
        aVar.f42346a = this.count;
        aVar.f42347b = this.offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetChatterDescriptionsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatterDescriptionsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatterDescriptionsRequest(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetChatterDescriptionsRequest(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
        this.offset = num2;
    }
}
