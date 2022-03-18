package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ResumeAllUploadRequest extends Message<ResumeAllUploadRequest, C19383a> {
    public static final ProtoAdapter<ResumeAllUploadRequest> ADAPTER = new C19384b();
    public static final UploadScene DEFAULT_SCENE = UploadScene.UNKNOWN;
    public static final Boolean DEFAULT_WITH_FAILED = false;
    private static final long serialVersionUID = 0;
    public final UploadScene scene;
    public final Boolean with_failed;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeAllUploadRequest$b */
    private static final class C19384b extends ProtoAdapter<ResumeAllUploadRequest> {
        C19384b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResumeAllUploadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ResumeAllUploadRequest resumeAllUploadRequest) {
            int i;
            int i2 = 0;
            if (resumeAllUploadRequest.with_failed != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, resumeAllUploadRequest.with_failed);
            } else {
                i = 0;
            }
            if (resumeAllUploadRequest.scene != null) {
                i2 = UploadScene.ADAPTER.encodedSizeWithTag(2, resumeAllUploadRequest.scene);
            }
            return i + i2 + resumeAllUploadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ResumeAllUploadRequest decode(ProtoReader protoReader) throws IOException {
            C19383a aVar = new C19383a();
            aVar.f47680a = false;
            aVar.f47681b = UploadScene.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47680a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47681b = UploadScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResumeAllUploadRequest resumeAllUploadRequest) throws IOException {
            if (resumeAllUploadRequest.with_failed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, resumeAllUploadRequest.with_failed);
            }
            if (resumeAllUploadRequest.scene != null) {
                UploadScene.ADAPTER.encodeWithTag(protoWriter, 2, resumeAllUploadRequest.scene);
            }
            protoWriter.writeBytes(resumeAllUploadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.ResumeAllUploadRequest$a */
    public static final class C19383a extends Message.Builder<ResumeAllUploadRequest, C19383a> {

        /* renamed from: a */
        public Boolean f47680a;

        /* renamed from: b */
        public UploadScene f47681b;

        /* renamed from: a */
        public ResumeAllUploadRequest build() {
            return new ResumeAllUploadRequest(this.f47680a, this.f47681b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19383a mo66022a(Boolean bool) {
            this.f47680a = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19383a newBuilder() {
        C19383a aVar = new C19383a();
        aVar.f47680a = this.with_failed;
        aVar.f47681b = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "ResumeAllUploadRequest");
        StringBuilder sb = new StringBuilder();
        if (this.with_failed != null) {
            sb.append(", with_failed=");
            sb.append(this.with_failed);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "ResumeAllUploadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ResumeAllUploadRequest(Boolean bool, UploadScene uploadScene) {
        this(bool, uploadScene, ByteString.EMPTY);
    }

    public ResumeAllUploadRequest(Boolean bool, UploadScene uploadScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.with_failed = bool;
        this.scene = uploadScene;
    }
}
