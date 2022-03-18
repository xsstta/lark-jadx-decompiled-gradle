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

public final class DeleteDownloadRecordResponse extends Message<DeleteDownloadRecordResponse, C19331a> {
    public static final ProtoAdapter<DeleteDownloadRecordResponse> ADAPTER = new C19332b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteDownloadRecordResponse$b */
    private static final class C19332b extends ProtoAdapter<DeleteDownloadRecordResponse> {
        C19332b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteDownloadRecordResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteDownloadRecordResponse deleteDownloadRecordResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, deleteDownloadRecordResponse.result) + deleteDownloadRecordResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteDownloadRecordResponse decode(ProtoReader protoReader) throws IOException {
            C19331a aVar = new C19331a();
            aVar.f47526a = 0;
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
                    aVar.f47526a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteDownloadRecordResponse deleteDownloadRecordResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, deleteDownloadRecordResponse.result);
            protoWriter.writeBytes(deleteDownloadRecordResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DeleteDownloadRecordResponse$a */
    public static final class C19331a extends Message.Builder<DeleteDownloadRecordResponse, C19331a> {

        /* renamed from: a */
        public Integer f47526a;

        /* renamed from: a */
        public DeleteDownloadRecordResponse build() {
            Integer num = this.f47526a;
            if (num != null) {
                return new DeleteDownloadRecordResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19331a newBuilder() {
        C19331a aVar = new C19331a();
        aVar.f47526a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DeleteDownloadRecordResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "DeleteDownloadRecordResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteDownloadRecordResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public DeleteDownloadRecordResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
