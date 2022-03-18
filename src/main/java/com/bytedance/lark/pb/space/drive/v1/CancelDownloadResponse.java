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

public final class CancelDownloadResponse extends Message<CancelDownloadResponse, C19315a> {
    public static final ProtoAdapter<CancelDownloadResponse> ADAPTER = new C19316b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelDownloadResponse$b */
    private static final class C19316b extends ProtoAdapter<CancelDownloadResponse> {
        C19316b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelDownloadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelDownloadResponse cancelDownloadResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, cancelDownloadResponse.result) + cancelDownloadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CancelDownloadResponse decode(ProtoReader protoReader) throws IOException {
            C19315a aVar = new C19315a();
            aVar.f47508a = 0;
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
                    aVar.f47508a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelDownloadResponse cancelDownloadResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, cancelDownloadResponse.result);
            protoWriter.writeBytes(cancelDownloadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelDownloadResponse$a */
    public static final class C19315a extends Message.Builder<CancelDownloadResponse, C19315a> {

        /* renamed from: a */
        public Integer f47508a;

        /* renamed from: a */
        public CancelDownloadResponse build() {
            Integer num = this.f47508a;
            if (num != null) {
                return new CancelDownloadResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19315a newBuilder() {
        C19315a aVar = new C19315a();
        aVar.f47508a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelDownloadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "CancelDownloadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CancelDownloadResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public CancelDownloadResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
