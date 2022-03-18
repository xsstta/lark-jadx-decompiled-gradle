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

public final class ResumeAllUploadResponse extends Message<ResumeAllUploadResponse, C19385a> {
    public static final ProtoAdapter<ResumeAllUploadResponse> ADAPTER = new C19386b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeAllUploadResponse$b */
    private static final class C19386b extends ProtoAdapter<ResumeAllUploadResponse> {
        C19386b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResumeAllUploadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ResumeAllUploadResponse resumeAllUploadResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, resumeAllUploadResponse.result) + resumeAllUploadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ResumeAllUploadResponse decode(ProtoReader protoReader) throws IOException {
            C19385a aVar = new C19385a();
            aVar.f47682a = 0;
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
                    aVar.f47682a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResumeAllUploadResponse resumeAllUploadResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, resumeAllUploadResponse.result);
            protoWriter.writeBytes(resumeAllUploadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeAllUploadResponse$a */
    public static final class C19385a extends Message.Builder<ResumeAllUploadResponse, C19385a> {

        /* renamed from: a */
        public Integer f47682a;

        /* renamed from: a */
        public ResumeAllUploadResponse build() {
            Integer num = this.f47682a;
            if (num != null) {
                return new ResumeAllUploadResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19385a newBuilder() {
        C19385a aVar = new C19385a();
        aVar.f47682a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "ResumeAllUploadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "ResumeAllUploadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ResumeAllUploadResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public ResumeAllUploadResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
