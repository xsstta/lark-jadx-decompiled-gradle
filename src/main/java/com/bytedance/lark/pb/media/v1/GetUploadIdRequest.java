package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUploadIdRequest extends Message<GetUploadIdRequest, C18266a> {
    public static final ProtoAdapter<GetUploadIdRequest> ADAPTER = new C18267b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String file_type;
    public final String language;
    public final String path;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetUploadIdRequest$b */
    private static final class C18267b extends ProtoAdapter<GetUploadIdRequest> {
        C18267b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUploadIdRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUploadIdRequest getUploadIdRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getUploadIdRequest.chat_id);
            int i3 = 0;
            if (getUploadIdRequest.file_type != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getUploadIdRequest.file_type);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getUploadIdRequest.path != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getUploadIdRequest.path);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getUploadIdRequest.language != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getUploadIdRequest.language);
            }
            return i5 + i3 + getUploadIdRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUploadIdRequest decode(ProtoReader protoReader) throws IOException {
            C18266a aVar = new C18266a();
            aVar.f45514a = "";
            aVar.f45515b = "";
            aVar.f45516c = "";
            aVar.f45517d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45514a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45515b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45516c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45517d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUploadIdRequest getUploadIdRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUploadIdRequest.chat_id);
            if (getUploadIdRequest.file_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getUploadIdRequest.file_type);
            }
            if (getUploadIdRequest.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getUploadIdRequest.path);
            }
            if (getUploadIdRequest.language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getUploadIdRequest.language);
            }
            protoWriter.writeBytes(getUploadIdRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18266a newBuilder() {
        C18266a aVar = new C18266a();
        aVar.f45514a = this.chat_id;
        aVar.f45515b = this.file_type;
        aVar.f45516c = this.path;
        aVar.f45517d = this.language;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetUploadIdRequest$a */
    public static final class C18266a extends Message.Builder<GetUploadIdRequest, C18266a> {

        /* renamed from: a */
        public String f45514a;

        /* renamed from: b */
        public String f45515b;

        /* renamed from: c */
        public String f45516c;

        /* renamed from: d */
        public String f45517d;

        /* renamed from: a */
        public GetUploadIdRequest build() {
            String str = this.f45514a;
            if (str != null) {
                return new GetUploadIdRequest(str, this.f45515b, this.f45516c, this.f45517d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C18266a mo63276a(String str) {
            this.f45514a = str;
            return this;
        }

        /* renamed from: b */
        public C18266a mo63278b(String str) {
            this.f45515b = str;
            return this;
        }

        /* renamed from: c */
        public C18266a mo63279c(String str) {
            this.f45516c = str;
            return this;
        }

        /* renamed from: d */
        public C18266a mo63280d(String str) {
            this.f45517d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetUploadIdRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.file_type != null) {
            sb.append(", file_type=");
            sb.append(this.file_type);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUploadIdRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUploadIdRequest(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public GetUploadIdRequest(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.file_type = str2;
        this.path = str3;
        this.language = str4;
    }
}
