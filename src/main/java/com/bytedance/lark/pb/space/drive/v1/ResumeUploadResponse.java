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

public final class ResumeUploadResponse extends Message<ResumeUploadResponse, C19389a> {
    public static final ProtoAdapter<ResumeUploadResponse> ADAPTER = new C19390b();
    public static final Integer DEFAULT_RESULT = 0;
    private static final long serialVersionUID = 0;
    public final Integer result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeUploadResponse$b */
    private static final class C19390b extends ProtoAdapter<ResumeUploadResponse> {
        C19390b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResumeUploadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ResumeUploadResponse resumeUploadResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, resumeUploadResponse.result) + resumeUploadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ResumeUploadResponse decode(ProtoReader protoReader) throws IOException {
            C19389a aVar = new C19389a();
            aVar.f47684a = 0;
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
                    aVar.f47684a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResumeUploadResponse resumeUploadResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, resumeUploadResponse.result);
            protoWriter.writeBytes(resumeUploadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeUploadResponse$a */
    public static final class C19389a extends Message.Builder<ResumeUploadResponse, C19389a> {

        /* renamed from: a */
        public Integer f47684a;

        /* renamed from: a */
        public ResumeUploadResponse build() {
            Integer num = this.f47684a;
            if (num != null) {
                return new ResumeUploadResponse(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19389a newBuilder() {
        C19389a aVar = new C19389a();
        aVar.f47684a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "ResumeUploadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "ResumeUploadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ResumeUploadResponse(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public ResumeUploadResponse(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = num;
    }
}
