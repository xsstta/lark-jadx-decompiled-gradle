package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetHongbaoInfoRequest extends Message<GetHongbaoInfoRequest, Builder> {
    public static final ProtoAdapter<GetHongbaoInfoRequest> ADAPTER = new C17593a();
    public static final HongbaoType DEFAULT_HONGBAO_TYPE = HongbaoType.NORMAL;
    private static final long serialVersionUID = 0;
    public final HongbaoType hongbao_type;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHongbaoInfoRequest$a */
    private static final class C17593a extends ProtoAdapter<GetHongbaoInfoRequest> {
        C17593a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHongbaoInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHongbaoInfoRequest getHongbaoInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getHongbaoInfoRequest.id);
            if (getHongbaoInfoRequest.hongbao_type != null) {
                i = HongbaoType.ADAPTER.encodedSizeWithTag(2, getHongbaoInfoRequest.hongbao_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getHongbaoInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHongbaoInfoRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.id = "";
            builder.hongbao_type = HongbaoType.NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.hongbao_type = HongbaoType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHongbaoInfoRequest getHongbaoInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getHongbaoInfoRequest.id);
            if (getHongbaoInfoRequest.hongbao_type != null) {
                HongbaoType.ADAPTER.encodeWithTag(protoWriter, 2, getHongbaoInfoRequest.hongbao_type);
            }
            protoWriter.writeBytes(getHongbaoInfoRequest.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetHongbaoInfoRequest, Builder> {
        public HongbaoType hongbao_type;
        public String id;

        @Override // com.squareup.wire.Message.Builder
        public GetHongbaoInfoRequest build() {
            String str = this.id;
            if (str != null) {
                return new GetHongbaoInfoRequest(str, this.hongbao_type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        public Builder hongbao_type(HongbaoType hongbaoType) {
            this.hongbao_type = hongbaoType;
            return this;
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.hongbao_type = this.hongbao_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetHongbaoInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.hongbao_type != null) {
            sb.append(", hongbao_type=");
            sb.append(this.hongbao_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHongbaoInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHongbaoInfoRequest(String str, HongbaoType hongbaoType) {
        this(str, hongbaoType, ByteString.EMPTY);
    }

    public GetHongbaoInfoRequest(String str, HongbaoType hongbaoType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.hongbao_type = hongbaoType;
    }
}
