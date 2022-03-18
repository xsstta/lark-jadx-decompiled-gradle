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

public final class GetNutStoreFilePreviewUrlResponse extends Message<GetNutStoreFilePreviewUrlResponse, C18248a> {
    public static final ProtoAdapter<GetNutStoreFilePreviewUrlResponse> ADAPTER = new C18249b();
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    private static final long serialVersionUID = 0;
    public final String source_id;
    public final Message.SourceType source_type;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetNutStoreFilePreviewUrlResponse$b */
    private static final class C18249b extends ProtoAdapter<GetNutStoreFilePreviewUrlResponse> {
        C18249b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNutStoreFilePreviewUrlResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNutStoreFilePreviewUrlResponse getNutStoreFilePreviewUrlResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getNutStoreFilePreviewUrlResponse.url);
            int i2 = 0;
            if (getNutStoreFilePreviewUrlResponse.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getNutStoreFilePreviewUrlResponse.source_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getNutStoreFilePreviewUrlResponse.source_type != null) {
                i2 = Message.SourceType.ADAPTER.encodedSizeWithTag(3, getNutStoreFilePreviewUrlResponse.source_type);
            }
            return i3 + i2 + getNutStoreFilePreviewUrlResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNutStoreFilePreviewUrlResponse decode(ProtoReader protoReader) throws IOException {
            C18248a aVar = new C18248a();
            aVar.f45499a = "";
            aVar.f45500b = "";
            aVar.f45501c = Message.SourceType.TYPE_FROM_UNKONWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45499a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45500b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45501c = Message.SourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNutStoreFilePreviewUrlResponse getNutStoreFilePreviewUrlResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNutStoreFilePreviewUrlResponse.url);
            if (getNutStoreFilePreviewUrlResponse.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getNutStoreFilePreviewUrlResponse.source_id);
            }
            if (getNutStoreFilePreviewUrlResponse.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 3, getNutStoreFilePreviewUrlResponse.source_type);
            }
            protoWriter.writeBytes(getNutStoreFilePreviewUrlResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18248a newBuilder() {
        C18248a aVar = new C18248a();
        aVar.f45499a = this.url;
        aVar.f45500b = this.source_id;
        aVar.f45501c = this.source_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetNutStoreFilePreviewUrlResponse$a */
    public static final class C18248a extends Message.Builder<GetNutStoreFilePreviewUrlResponse, C18248a> {

        /* renamed from: a */
        public String f45499a;

        /* renamed from: b */
        public String f45500b;

        /* renamed from: c */
        public Message.SourceType f45501c;

        /* renamed from: a */
        public GetNutStoreFilePreviewUrlResponse build() {
            String str = this.f45499a;
            if (str != null) {
                return new GetNutStoreFilePreviewUrlResponse(str, this.f45500b, this.f45501c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "url");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetNutStoreFilePreviewUrlResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNutStoreFilePreviewUrlResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNutStoreFilePreviewUrlResponse(String str, String str2, Message.SourceType sourceType) {
        this(str, str2, sourceType, ByteString.EMPTY);
    }

    public GetNutStoreFilePreviewUrlResponse(String str, String str2, Message.SourceType sourceType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.source_id = str2;
        this.source_type = sourceType;
    }
}
