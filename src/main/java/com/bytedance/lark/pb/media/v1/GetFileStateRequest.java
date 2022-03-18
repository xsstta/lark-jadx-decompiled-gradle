package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetFileStateRequest extends Message<GetFileStateRequest, C18238a> {
    public static final ProtoAdapter<GetFileStateRequest> ADAPTER = new C18239b();
    public static final DownloadFileScene DEFAULT_SCENE = DownloadFileScene.CHAT;
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final DownloadFileScene scene;
    public final String source_id;
    public final Message.SourceType source_type;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileStateRequest$b */
    private static final class C18239b extends ProtoAdapter<GetFileStateRequest> {
        C18239b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFileStateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFileStateRequest getFileStateRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getFileStateRequest.message_id);
            int i3 = 0;
            if (getFileStateRequest.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getFileStateRequest.source_id);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getFileStateRequest.source_type != null) {
                i2 = Message.SourceType.ADAPTER.encodedSizeWithTag(3, getFileStateRequest.source_type);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getFileStateRequest.scene != null) {
                i3 = DownloadFileScene.ADAPTER.encodedSizeWithTag(4, getFileStateRequest.scene);
            }
            return i5 + i3 + getFileStateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFileStateRequest decode(ProtoReader protoReader) throws IOException {
            C18238a aVar = new C18238a();
            aVar.f45485a = "";
            aVar.f45486b = "";
            aVar.f45487c = Message.SourceType.TYPE_FROM_UNKONWN;
            aVar.f45488d = DownloadFileScene.CHAT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45485a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45486b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f45487c = Message.SourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45488d = DownloadFileScene.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFileStateRequest getFileStateRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getFileStateRequest.message_id);
            if (getFileStateRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getFileStateRequest.source_id);
            }
            if (getFileStateRequest.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 3, getFileStateRequest.source_type);
            }
            if (getFileStateRequest.scene != null) {
                DownloadFileScene.ADAPTER.encodeWithTag(protoWriter, 4, getFileStateRequest.scene);
            }
            protoWriter.writeBytes(getFileStateRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18238a newBuilder() {
        C18238a aVar = new C18238a();
        aVar.f45485a = this.message_id;
        aVar.f45486b = this.source_id;
        aVar.f45487c = this.source_type;
        aVar.f45488d = this.scene;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetFileStateRequest$a */
    public static final class C18238a extends Message.Builder<GetFileStateRequest, C18238a> {

        /* renamed from: a */
        public String f45485a;

        /* renamed from: b */
        public String f45486b;

        /* renamed from: c */
        public Message.SourceType f45487c;

        /* renamed from: d */
        public DownloadFileScene f45488d;

        /* renamed from: a */
        public GetFileStateRequest build() {
            String str = this.f45485a;
            if (str != null) {
                return new GetFileStateRequest(str, this.f45486b, this.f45487c, this.f45488d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C18238a mo63202a(Message.SourceType sourceType) {
            this.f45487c = sourceType;
            return this;
        }

        /* renamed from: b */
        public C18238a mo63206b(String str) {
            this.f45486b = str;
            return this;
        }

        /* renamed from: a */
        public C18238a mo63203a(DownloadFileScene downloadFileScene) {
            this.f45488d = downloadFileScene;
            return this;
        }

        /* renamed from: a */
        public C18238a mo63204a(String str) {
            this.f45485a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetFileStateRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFileStateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFileStateRequest(String str, String str2, Message.SourceType sourceType, DownloadFileScene downloadFileScene) {
        this(str, str2, sourceType, downloadFileScene, ByteString.EMPTY);
    }

    public GetFileStateRequest(String str, String str2, Message.SourceType sourceType, DownloadFileScene downloadFileScene, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.source_id = str2;
        this.source_type = sourceType;
        this.scene = downloadFileScene;
    }
}
