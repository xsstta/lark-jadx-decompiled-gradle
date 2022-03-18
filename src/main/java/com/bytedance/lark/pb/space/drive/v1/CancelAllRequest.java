package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CancelAllRequest extends Message<CancelAllRequest, C19305a> {
    public static final ProtoAdapter<CancelAllRequest> ADAPTER = new C19306b();
    public static final UploadScene DEFAULT_SCENE = UploadScene.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final UploadScene scene;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllRequest$b */
    private static final class C19306b extends ProtoAdapter<CancelAllRequest> {
        C19306b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelAllRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelAllRequest cancelAllRequest) {
            int i;
            if (cancelAllRequest.scene != null) {
                i = UploadScene.ADAPTER.encodedSizeWithTag(1, cancelAllRequest.scene);
            } else {
                i = 0;
            }
            return i + cancelAllRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelAllRequest decode(ProtoReader protoReader) throws IOException {
            C19305a aVar = new C19305a();
            aVar.f47502a = UploadScene.UNKNOWN;
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
                        aVar.f47502a = UploadScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelAllRequest cancelAllRequest) throws IOException {
            if (cancelAllRequest.scene != null) {
                UploadScene.ADAPTER.encodeWithTag(protoWriter, 1, cancelAllRequest.scene);
            }
            protoWriter.writeBytes(cancelAllRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.CancelAllRequest$a */
    public static final class C19305a extends Message.Builder<CancelAllRequest, C19305a> {

        /* renamed from: a */
        public UploadScene f47502a;

        /* renamed from: a */
        public CancelAllRequest build() {
            return new CancelAllRequest(this.f47502a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19305a newBuilder() {
        C19305a aVar = new C19305a();
        aVar.f47502a = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CancelAllRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "CancelAllRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelAllRequest(UploadScene uploadScene) {
        this(uploadScene, ByteString.EMPTY);
    }

    public CancelAllRequest(UploadScene uploadScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = uploadScene;
    }
}
