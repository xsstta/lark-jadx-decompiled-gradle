package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CancelAllResponse extends Message<CancelAllResponse, C19307a> {
    public static final ProtoAdapter<CancelAllResponse> ADAPTER = new C19308b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllResponse$b */
    private static final class C19308b extends ProtoAdapter<CancelAllResponse> {
        C19308b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelAllResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelAllResponse cancelAllResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, cancelAllResponse.result) + cancelAllResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelAllResponse decode(ProtoReader protoReader) throws IOException {
            C19307a aVar = new C19307a();
            aVar.f47503a = 0;
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
                    aVar.f47503a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelAllResponse cancelAllResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, cancelAllResponse.result);
            protoWriter.writeBytes(cancelAllResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllResponse$a */
    public static final class C19307a extends Message.Builder<CancelAllResponse, C19307a> {

        /* renamed from: a */
        public Integer f47503a;

        /* renamed from: a */
        public CancelAllResponse build() {
            Integer num = this.f47503a;
            if (num != null) {
                return new CancelAllResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19307a newBuilder() {
        C19307a aVar = new C19307a();
        aVar.f47503a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelAllResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "CancelAllResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelAllResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public CancelAllResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
