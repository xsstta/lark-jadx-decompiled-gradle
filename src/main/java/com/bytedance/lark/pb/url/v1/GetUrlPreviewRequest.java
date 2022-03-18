package com.bytedance.lark.pb.url.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUrlPreviewRequest extends Message<GetUrlPreviewRequest, C19811a> {
    public static final ProtoAdapter<GetUrlPreviewRequest> ADAPTER = new C19812b();
    public static final UrlPreviewSourceType DEFAULT_SOURCE_TYPE = UrlPreviewSourceType.CHAT_ANNOUNCEMENT;
    private static final long serialVersionUID = 0;
    public final String source_id;
    public final String source_text_md5;
    public final UrlPreviewSourceType source_type;

    /* renamed from: com.bytedance.lark.pb.url.v1.GetUrlPreviewRequest$b */
    private static final class C19812b extends ProtoAdapter<GetUrlPreviewRequest> {
        C19812b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrlPreviewRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrlPreviewRequest getUrlPreviewRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getUrlPreviewRequest.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUrlPreviewRequest.source_id);
            } else {
                i = 0;
            }
            if (getUrlPreviewRequest.source_type != null) {
                i2 = UrlPreviewSourceType.ADAPTER.encodedSizeWithTag(2, getUrlPreviewRequest.source_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getUrlPreviewRequest.source_text_md5 != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getUrlPreviewRequest.source_text_md5);
            }
            return i4 + i3 + getUrlPreviewRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrlPreviewRequest decode(ProtoReader protoReader) throws IOException {
            C19811a aVar = new C19811a();
            aVar.f48295a = "";
            aVar.f48296b = UrlPreviewSourceType.CHAT_ANNOUNCEMENT;
            aVar.f48297c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48295a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f48296b = UrlPreviewSourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48297c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrlPreviewRequest getUrlPreviewRequest) throws IOException {
            if (getUrlPreviewRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUrlPreviewRequest.source_id);
            }
            if (getUrlPreviewRequest.source_type != null) {
                UrlPreviewSourceType.ADAPTER.encodeWithTag(protoWriter, 2, getUrlPreviewRequest.source_type);
            }
            if (getUrlPreviewRequest.source_text_md5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getUrlPreviewRequest.source_text_md5);
            }
            protoWriter.writeBytes(getUrlPreviewRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.GetUrlPreviewRequest$a */
    public static final class C19811a extends Message.Builder<GetUrlPreviewRequest, C19811a> {

        /* renamed from: a */
        public String f48295a;

        /* renamed from: b */
        public UrlPreviewSourceType f48296b;

        /* renamed from: c */
        public String f48297c;

        /* renamed from: a */
        public GetUrlPreviewRequest build() {
            return new GetUrlPreviewRequest(this.f48295a, this.f48296b, this.f48297c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19811a newBuilder() {
        C19811a aVar = new C19811a();
        aVar.f48295a = this.source_id;
        aVar.f48296b = this.source_type;
        aVar.f48297c = this.source_text_md5;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "GetUrlPreviewRequest");
        StringBuilder sb = new StringBuilder();
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_text_md5 != null) {
            sb.append(", source_text_md5=");
            sb.append(this.source_text_md5);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUrlPreviewRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrlPreviewRequest(String str, UrlPreviewSourceType urlPreviewSourceType, String str2) {
        this(str, urlPreviewSourceType, str2, ByteString.EMPTY);
    }

    public GetUrlPreviewRequest(String str, UrlPreviewSourceType urlPreviewSourceType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.source_type = urlPreviewSourceType;
        this.source_text_md5 = str2;
    }
}
