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

public final class ResumeUploadRequest extends Message<ResumeUploadRequest, C19387a> {
    public static final ProtoAdapter<ResumeUploadRequest> ADAPTER = new C19388b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeUploadRequest$b */
    private static final class C19388b extends ProtoAdapter<ResumeUploadRequest> {
        C19388b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResumeUploadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ResumeUploadRequest resumeUploadRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, resumeUploadRequest.key) + resumeUploadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ResumeUploadRequest decode(ProtoReader protoReader) throws IOException {
            C19387a aVar = new C19387a();
            aVar.f47683a = "";
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
                    aVar.f47683a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResumeUploadRequest resumeUploadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resumeUploadRequest.key);
            protoWriter.writeBytes(resumeUploadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeUploadRequest$a */
    public static final class C19387a extends Message.Builder<ResumeUploadRequest, C19387a> {

        /* renamed from: a */
        public String f47683a;

        /* renamed from: a */
        public ResumeUploadRequest build() {
            String str = this.f47683a;
            if (str != null) {
                return new ResumeUploadRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C19387a mo66031a(String str) {
            this.f47683a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19387a newBuilder() {
        C19387a aVar = new C19387a();
        aVar.f47683a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "ResumeUploadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "ResumeUploadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ResumeUploadRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public ResumeUploadRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
