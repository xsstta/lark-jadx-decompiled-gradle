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

public final class CancelAllUploadResponse extends Message<CancelAllUploadResponse, C19311a> {
    public static final ProtoAdapter<CancelAllUploadResponse> ADAPTER = new C19312b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllUploadResponse$b */
    private static final class C19312b extends ProtoAdapter<CancelAllUploadResponse> {
        C19312b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelAllUploadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelAllUploadResponse cancelAllUploadResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, cancelAllUploadResponse.result) + cancelAllUploadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelAllUploadResponse decode(ProtoReader protoReader) throws IOException {
            C19311a aVar = new C19311a();
            aVar.f47505a = 0;
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
                    aVar.f47505a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelAllUploadResponse cancelAllUploadResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, cancelAllUploadResponse.result);
            protoWriter.writeBytes(cancelAllUploadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllUploadResponse$a */
    public static final class C19311a extends Message.Builder<CancelAllUploadResponse, C19311a> {

        /* renamed from: a */
        public Integer f47505a;

        /* renamed from: a */
        public CancelAllUploadResponse build() {
            Integer num = this.f47505a;
            if (num != null) {
                return new CancelAllUploadResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19311a newBuilder() {
        C19311a aVar = new C19311a();
        aVar.f47505a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelAllUploadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "CancelAllUploadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelAllUploadResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public CancelAllUploadResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
