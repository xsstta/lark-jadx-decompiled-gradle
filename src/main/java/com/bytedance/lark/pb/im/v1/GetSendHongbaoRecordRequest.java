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

public final class GetSendHongbaoRecordRequest extends Message<GetSendHongbaoRecordRequest, Builder> {
    public static final ProtoAdapter<GetSendHongbaoRecordRequest> ADAPTER = new C17678a();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Integer DEFAULT_YEAR = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;
    public final Integer year;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetSendHongbaoRecordRequest$a */
    private static final class C17678a extends ProtoAdapter<GetSendHongbaoRecordRequest> {
        C17678a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSendHongbaoRecordRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSendHongbaoRecordRequest getSendHongbaoRecordRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, getSendHongbaoRecordRequest.year);
            int i2 = 0;
            if (getSendHongbaoRecordRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getSendHongbaoRecordRequest.cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getSendHongbaoRecordRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getSendHongbaoRecordRequest.count);
            }
            return i3 + i2 + getSendHongbaoRecordRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSendHongbaoRecordRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.year = 0;
            builder.cursor = "";
            builder.count = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.year = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    builder.cursor = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.count = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSendHongbaoRecordRequest getSendHongbaoRecordRequest) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getSendHongbaoRecordRequest.year);
            if (getSendHongbaoRecordRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSendHongbaoRecordRequest.cursor);
            }
            if (getSendHongbaoRecordRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getSendHongbaoRecordRequest.count);
            }
            protoWriter.writeBytes(getSendHongbaoRecordRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.year = this.year;
        builder.cursor = this.cursor;
        builder.count = this.count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<GetSendHongbaoRecordRequest, Builder> {
        public Integer count;
        public String cursor;
        public Integer year;

        @Override // com.squareup.wire.Message.Builder
        public GetSendHongbaoRecordRequest build() {
            Integer num = this.year;
            if (num != null) {
                return new GetSendHongbaoRecordRequest(num, this.cursor, this.count, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "year");
        }

        public Builder count(Integer num) {
            this.count = num;
            return this;
        }

        public Builder cursor(String str) {
            this.cursor = str;
            return this;
        }

        public Builder year(Integer num) {
            this.year = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetSendHongbaoRecordRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", year=");
        sb.append(this.year);
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSendHongbaoRecordRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSendHongbaoRecordRequest(Integer num, String str, Integer num2) {
        this(num, str, num2, ByteString.EMPTY);
    }

    public GetSendHongbaoRecordRequest(Integer num, String str, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.year = num;
        this.cursor = str;
        this.count = num2;
    }
}
