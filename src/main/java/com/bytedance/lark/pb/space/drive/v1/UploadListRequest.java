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

public final class UploadListRequest extends Message<UploadListRequest, C19401a> {
    public static final ProtoAdapter<UploadListRequest> ADAPTER = new C19402b();
    public static final Boolean DEFAULT_FOR_PROGRESS = false;
    public static final UploadScene DEFAULT_SCENE = UploadScene.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean for_progress;
    public final String mount_node_token;
    public final UploadScene scene;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadListRequest$b */
    private static final class C19402b extends ProtoAdapter<UploadListRequest> {
        C19402b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadListRequest uploadListRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadListRequest.mount_node_token);
            int i2 = 0;
            if (uploadListRequest.for_progress != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, uploadListRequest.for_progress);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (uploadListRequest.scene != null) {
                i2 = UploadScene.ADAPTER.encodedSizeWithTag(3, uploadListRequest.scene);
            }
            return i3 + i2 + uploadListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadListRequest decode(ProtoReader protoReader) throws IOException {
            C19401a aVar = new C19401a();
            aVar.f47701a = "";
            aVar.f47702b = false;
            aVar.f47703c = UploadScene.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47701a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47702b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47703c = UploadScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadListRequest uploadListRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadListRequest.mount_node_token);
            if (uploadListRequest.for_progress != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uploadListRequest.for_progress);
            }
            if (uploadListRequest.scene != null) {
                UploadScene.ADAPTER.encodeWithTag(protoWriter, 3, uploadListRequest.scene);
            }
            protoWriter.writeBytes(uploadListRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19401a newBuilder() {
        C19401a aVar = new C19401a();
        aVar.f47701a = this.mount_node_token;
        aVar.f47702b = this.for_progress;
        aVar.f47703c = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.UploadListRequest$a */
    public static final class C19401a extends Message.Builder<UploadListRequest, C19401a> {

        /* renamed from: a */
        public String f47701a;

        /* renamed from: b */
        public Boolean f47702b;

        /* renamed from: c */
        public UploadScene f47703c;

        /* renamed from: a */
        public UploadListRequest build() {
            String str = this.f47701a;
            if (str != null) {
                return new UploadListRequest(str, this.f47702b, this.f47703c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mount_node_token");
        }

        /* renamed from: a */
        public C19401a mo66063a(UploadScene uploadScene) {
            this.f47703c = uploadScene;
            return this;
        }

        /* renamed from: a */
        public C19401a mo66064a(Boolean bool) {
            this.f47702b = bool;
            return this;
        }

        /* renamed from: a */
        public C19401a mo66065a(String str) {
            this.f47701a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UploadListRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", mount_node_token=");
        sb.append(this.mount_node_token);
        if (this.for_progress != null) {
            sb.append(", for_progress=");
            sb.append(this.for_progress);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadListRequest(String str, Boolean bool, UploadScene uploadScene) {
        this(str, bool, uploadScene, ByteString.EMPTY);
    }

    public UploadListRequest(String str, Boolean bool, UploadScene uploadScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mount_node_token = str;
        this.for_progress = bool;
        this.scene = uploadScene;
    }
}
