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

public final class DeleteUploadResourceResponse extends Message<DeleteUploadResourceResponse, C19335a> {
    public static final ProtoAdapter<DeleteUploadResourceResponse> ADAPTER = new C19336b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteUploadResourceResponse$b */
    private static final class C19336b extends ProtoAdapter<DeleteUploadResourceResponse> {
        C19336b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteUploadResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteUploadResourceResponse deleteUploadResourceResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, deleteUploadResourceResponse.result) + deleteUploadResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteUploadResourceResponse decode(ProtoReader protoReader) throws IOException {
            C19335a aVar = new C19335a();
            aVar.f47528a = 0;
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
                    aVar.f47528a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteUploadResourceResponse deleteUploadResourceResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, deleteUploadResourceResponse.result);
            protoWriter.writeBytes(deleteUploadResourceResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteUploadResourceResponse$a */
    public static final class C19335a extends Message.Builder<DeleteUploadResourceResponse, C19335a> {

        /* renamed from: a */
        public Integer f47528a;

        /* renamed from: a */
        public DeleteUploadResourceResponse build() {
            Integer num = this.f47528a;
            if (num != null) {
                return new DeleteUploadResourceResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19335a newBuilder() {
        C19335a aVar = new C19335a();
        aVar.f47528a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DeleteUploadResourceResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "DeleteUploadResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteUploadResourceResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public DeleteUploadResourceResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
