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

public final class GetNutStoreFilePreviewUrlRequest extends Message<GetNutStoreFilePreviewUrlRequest, C18246a> {
    public static final ProtoAdapter<GetNutStoreFilePreviewUrlRequest> ADAPTER = new C18247b();
    public static final Message.SourceType DEFAULT_SOURCE_TYPE = Message.SourceType.TYPE_FROM_UNKONWN;
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final String source_id;
    public final Message.SourceType source_type;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetNutStoreFilePreviewUrlRequest$b */
    private static final class C18247b extends ProtoAdapter<GetNutStoreFilePreviewUrlRequest> {
        C18247b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNutStoreFilePreviewUrlRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNutStoreFilePreviewUrlRequest getNutStoreFilePreviewUrlRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getNutStoreFilePreviewUrlRequest.message_id);
            int i2 = 0;
            if (getNutStoreFilePreviewUrlRequest.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getNutStoreFilePreviewUrlRequest.source_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getNutStoreFilePreviewUrlRequest.source_type != null) {
                i2 = Message.SourceType.ADAPTER.encodedSizeWithTag(3, getNutStoreFilePreviewUrlRequest.source_type);
            }
            return i3 + i2 + getNutStoreFilePreviewUrlRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNutStoreFilePreviewUrlRequest decode(ProtoReader protoReader) throws IOException {
            C18246a aVar = new C18246a();
            aVar.f45496a = "";
            aVar.f45497b = "";
            aVar.f45498c = Message.SourceType.TYPE_FROM_UNKONWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45496a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45497b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45498c = Message.SourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNutStoreFilePreviewUrlRequest getNutStoreFilePreviewUrlRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNutStoreFilePreviewUrlRequest.message_id);
            if (getNutStoreFilePreviewUrlRequest.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getNutStoreFilePreviewUrlRequest.source_id);
            }
            if (getNutStoreFilePreviewUrlRequest.source_type != null) {
                Message.SourceType.ADAPTER.encodeWithTag(protoWriter, 3, getNutStoreFilePreviewUrlRequest.source_type);
            }
            protoWriter.writeBytes(getNutStoreFilePreviewUrlRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18246a newBuilder() {
        C18246a aVar = new C18246a();
        aVar.f45496a = this.message_id;
        aVar.f45497b = this.source_id;
        aVar.f45498c = this.source_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetNutStoreFilePreviewUrlRequest$a */
    public static final class C18246a extends Message.Builder<GetNutStoreFilePreviewUrlRequest, C18246a> {

        /* renamed from: a */
        public String f45496a;

        /* renamed from: b */
        public String f45497b;

        /* renamed from: c */
        public Message.SourceType f45498c;

        /* renamed from: a */
        public GetNutStoreFilePreviewUrlRequest build() {
            String str = this.f45496a;
            if (str != null) {
                return new GetNutStoreFilePreviewUrlRequest(str, this.f45497b, this.f45498c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id");
        }

        /* renamed from: a */
        public C18246a mo63226a(Message.SourceType sourceType) {
            this.f45498c = sourceType;
            return this;
        }

        /* renamed from: b */
        public C18246a mo63229b(String str) {
            this.f45497b = str;
            return this;
        }

        /* renamed from: a */
        public C18246a mo63227a(String str) {
            this.f45496a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetNutStoreFilePreviewUrlRequest");
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
        StringBuilder replace = sb.replace(0, 2, "GetNutStoreFilePreviewUrlRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNutStoreFilePreviewUrlRequest(String str, String str2, Message.SourceType sourceType) {
        this(str, str2, sourceType, ByteString.EMPTY);
    }

    public GetNutStoreFilePreviewUrlRequest(String str, String str2, Message.SourceType sourceType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.source_id = str2;
        this.source_type = sourceType;
    }
}
