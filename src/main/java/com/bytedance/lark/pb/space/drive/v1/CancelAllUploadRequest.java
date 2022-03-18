package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CancelAllUploadRequest extends Message<CancelAllUploadRequest, C19309a> {
    public static final ProtoAdapter<CancelAllUploadRequest> ADAPTER = new C19310b();
    public static final UploadScene DEFAULT_SCENE = UploadScene.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final UploadScene scene;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllUploadRequest$b */
    private static final class C19310b extends ProtoAdapter<CancelAllUploadRequest> {
        C19310b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelAllUploadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelAllUploadRequest cancelAllUploadRequest) {
            int i;
            if (cancelAllUploadRequest.scene != null) {
                i = UploadScene.ADAPTER.encodedSizeWithTag(1, cancelAllUploadRequest.scene);
            } else {
                i = 0;
            }
            return i + cancelAllUploadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelAllUploadRequest decode(ProtoReader protoReader) throws IOException {
            C19309a aVar = new C19309a();
            aVar.f47504a = UploadScene.UNKNOWN;
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
                    try {
                        aVar.f47504a = UploadScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelAllUploadRequest cancelAllUploadRequest) throws IOException {
            if (cancelAllUploadRequest.scene != null) {
                UploadScene.ADAPTER.encodeWithTag(protoWriter, 1, cancelAllUploadRequest.scene);
            }
            protoWriter.writeBytes(cancelAllUploadRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllUploadRequest$a */
    public static final class C19309a extends Message.Builder<CancelAllUploadRequest, C19309a> {

        /* renamed from: a */
        public UploadScene f47504a;

        /* renamed from: a */
        public CancelAllUploadRequest build() {
            return new CancelAllUploadRequest(this.f47504a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19309a newBuilder() {
        C19309a aVar = new C19309a();
        aVar.f47504a = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelAllUploadRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "CancelAllUploadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelAllUploadRequest(UploadScene uploadScene) {
        this(uploadScene, ByteString.EMPTY);
    }

    public CancelAllUploadRequest(UploadScene uploadScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = uploadScene;
    }
}
