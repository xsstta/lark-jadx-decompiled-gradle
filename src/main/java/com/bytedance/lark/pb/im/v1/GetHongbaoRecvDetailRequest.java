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

public final class GetHongbaoRecvDetailRequest extends Message<GetHongbaoRecvDetailRequest, Builder> {
    public static final ProtoAdapter<GetHongbaoRecvDetailRequest> ADAPTER = new C17596a();
    public static final Integer DEFAULT_COUNT = 20;
    public static final HongbaoType DEFAULT_HONGBAO_TYPE = HongbaoType.NORMAL;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;
    public final HongbaoType hongbao_type;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHongbaoRecvDetailRequest$a */
    private static final class C17596a extends ProtoAdapter<GetHongbaoRecvDetailRequest> {
        C17596a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHongbaoRecvDetailRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHongbaoRecvDetailRequest getHongbaoRecvDetailRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getHongbaoRecvDetailRequest.id);
            int i3 = 0;
            if (getHongbaoRecvDetailRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getHongbaoRecvDetailRequest.cursor);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getHongbaoRecvDetailRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getHongbaoRecvDetailRequest.count);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getHongbaoRecvDetailRequest.hongbao_type != null) {
                i3 = HongbaoType.ADAPTER.encodedSizeWithTag(4, getHongbaoRecvDetailRequest.hongbao_type);
            }
            return i5 + i3 + getHongbaoRecvDetailRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHongbaoRecvDetailRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.id = "";
            builder.cursor = "";
            builder.count = 20;
            builder.hongbao_type = HongbaoType.NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    builder.cursor = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    builder.count = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
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
        public void encode(ProtoWriter protoWriter, GetHongbaoRecvDetailRequest getHongbaoRecvDetailRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getHongbaoRecvDetailRequest.id);
            if (getHongbaoRecvDetailRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getHongbaoRecvDetailRequest.cursor);
            }
            if (getHongbaoRecvDetailRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getHongbaoRecvDetailRequest.count);
            }
            if (getHongbaoRecvDetailRequest.hongbao_type != null) {
                HongbaoType.ADAPTER.encodeWithTag(protoWriter, 4, getHongbaoRecvDetailRequest.hongbao_type);
            }
            protoWriter.writeBytes(getHongbaoRecvDetailRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.cursor = this.cursor;
        builder.count = this.count;
        builder.hongbao_type = this.hongbao_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<GetHongbaoRecvDetailRequest, Builder> {
        public Integer count;
        public String cursor;
        public HongbaoType hongbao_type;
        public String id;

        @Override // com.squareup.wire.Message.Builder
        public GetHongbaoRecvDetailRequest build() {
            String str = this.id;
            if (str != null) {
                return new GetHongbaoRecvDetailRequest(str, this.cursor, this.count, this.hongbao_type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        public Builder count(Integer num) {
            this.count = num;
            return this;
        }

        public Builder cursor(String str) {
            this.cursor = str;
            return this;
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
    public String toString() {
        C1911a.m8540a("im", "GetHongbaoRecvDetailRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.hongbao_type != null) {
            sb.append(", hongbao_type=");
            sb.append(this.hongbao_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetHongbaoRecvDetailRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHongbaoRecvDetailRequest(String str, String str2, Integer num, HongbaoType hongbaoType) {
        this(str, str2, num, hongbaoType, ByteString.EMPTY);
    }

    public GetHongbaoRecvDetailRequest(String str, String str2, Integer num, HongbaoType hongbaoType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.cursor = str2;
        this.count = num;
        this.hongbao_type = hongbaoType;
    }
}
