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

public final class CancelUploadResponse extends Message<CancelUploadResponse, C19323a> {
    public static final ProtoAdapter<CancelUploadResponse> ADAPTER = new C19324b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelUploadResponse$b */
    private static final class C19324b extends ProtoAdapter<CancelUploadResponse> {
        C19324b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelUploadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelUploadResponse cancelUploadResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, cancelUploadResponse.result) + cancelUploadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelUploadResponse decode(ProtoReader protoReader) throws IOException {
            C19323a aVar = new C19323a();
            aVar.f47515a = 0;
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
                    aVar.f47515a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelUploadResponse cancelUploadResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, cancelUploadResponse.result);
            protoWriter.writeBytes(cancelUploadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelUploadResponse$a */
    public static final class C19323a extends Message.Builder<CancelUploadResponse, C19323a> {

        /* renamed from: a */
        public Integer f47515a;

        /* renamed from: a */
        public CancelUploadResponse build() {
            Integer num = this.f47515a;
            if (num != null) {
                return new CancelUploadResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19323a newBuilder() {
        C19323a aVar = new C19323a();
        aVar.f47515a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelUploadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "CancelUploadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelUploadResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public CancelUploadResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
