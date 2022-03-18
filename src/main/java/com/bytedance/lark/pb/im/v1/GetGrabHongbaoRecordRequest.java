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

public final class GetGrabHongbaoRecordRequest extends Message<GetGrabHongbaoRecordRequest, Builder> {
    public static final ProtoAdapter<GetGrabHongbaoRecordRequest> ADAPTER = new C17586a();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Integer DEFAULT_YEAR = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;
    public final Integer year;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetGrabHongbaoRecordRequest$a */
    private static final class C17586a extends ProtoAdapter<GetGrabHongbaoRecordRequest> {
        C17586a() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGrabHongbaoRecordRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetGrabHongbaoRecordRequest getGrabHongbaoRecordRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, getGrabHongbaoRecordRequest.year);
            int i2 = 0;
            if (getGrabHongbaoRecordRequest.cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getGrabHongbaoRecordRequest.cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getGrabHongbaoRecordRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getGrabHongbaoRecordRequest.count);
            }
            return i3 + i2 + getGrabHongbaoRecordRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetGrabHongbaoRecordRequest decode(ProtoReader protoReader) throws IOException {
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
        public void encode(ProtoWriter protoWriter, GetGrabHongbaoRecordRequest getGrabHongbaoRecordRequest) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getGrabHongbaoRecordRequest.year);
            if (getGrabHongbaoRecordRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getGrabHongbaoRecordRequest.cursor);
            }
            if (getGrabHongbaoRecordRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getGrabHongbaoRecordRequest.count);
            }
            protoWriter.writeBytes(getGrabHongbaoRecordRequest.unknownFields());
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

    public static final class Builder extends Message.Builder<GetGrabHongbaoRecordRequest, Builder> {
        public Integer count;
        public String cursor;
        public Integer year;

        @Override // com.squareup.wire.Message.Builder
        public GetGrabHongbaoRecordRequest build() {
            Integer num = this.year;
            if (num != null) {
                return new GetGrabHongbaoRecordRequest(num, this.cursor, this.count, super.buildUnknownFields());
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
        C1911a.m8540a("im", "GetGrabHongbaoRecordRequest");
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
        StringBuilder replace = sb.replace(0, 2, "GetGrabHongbaoRecordRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetGrabHongbaoRecordRequest(Integer num, String str, Integer num2) {
        this(num, str, num2, ByteString.EMPTY);
    }

    public GetGrabHongbaoRecordRequest(Integer num, String str, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.year = num;
        this.cursor = str;
        this.count = num2;
    }
}
