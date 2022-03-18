package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetPhoneQueryDailyQuotaResponse extends Message<GetPhoneQueryDailyQuotaResponse, C16262a> {
    public static final ProtoAdapter<GetPhoneQueryDailyQuotaResponse> ADAPTER = new C16263b();
    public static final Integer DEFAULT_DAILY_QUOTA = 10;
    public static final Integer DEFAULT_MAX_LIMIT = 160;
    private static final long serialVersionUID = 0;
    public final Integer daily_quota;
    public final Integer max_limit;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPhoneQueryDailyQuotaResponse$b */
    private static final class C16263b extends ProtoAdapter<GetPhoneQueryDailyQuotaResponse> {
        C16263b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPhoneQueryDailyQuotaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPhoneQueryDailyQuotaResponse getPhoneQueryDailyQuotaResponse) {
            int i;
            int i2 = 0;
            if (getPhoneQueryDailyQuotaResponse.daily_quota != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getPhoneQueryDailyQuotaResponse.daily_quota);
            } else {
                i = 0;
            }
            if (getPhoneQueryDailyQuotaResponse.max_limit != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getPhoneQueryDailyQuotaResponse.max_limit);
            }
            return i + i2 + getPhoneQueryDailyQuotaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPhoneQueryDailyQuotaResponse decode(ProtoReader protoReader) throws IOException {
            C16262a aVar = new C16262a();
            aVar.f42462a = 10;
            aVar.f42463b = 160;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42462a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42463b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPhoneQueryDailyQuotaResponse getPhoneQueryDailyQuotaResponse) throws IOException {
            if (getPhoneQueryDailyQuotaResponse.daily_quota != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getPhoneQueryDailyQuotaResponse.daily_quota);
            }
            if (getPhoneQueryDailyQuotaResponse.max_limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getPhoneQueryDailyQuotaResponse.max_limit);
            }
            protoWriter.writeBytes(getPhoneQueryDailyQuotaResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetPhoneQueryDailyQuotaResponse$a */
    public static final class C16262a extends Message.Builder<GetPhoneQueryDailyQuotaResponse, C16262a> {

        /* renamed from: a */
        public Integer f42462a;

        /* renamed from: b */
        public Integer f42463b;

        /* renamed from: a */
        public GetPhoneQueryDailyQuotaResponse build() {
            return new GetPhoneQueryDailyQuotaResponse(this.f42462a, this.f42463b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16262a newBuilder() {
        C16262a aVar = new C16262a();
        aVar.f42462a = this.daily_quota;
        aVar.f42463b = this.max_limit;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetPhoneQueryDailyQuotaResponse");
        StringBuilder sb = new StringBuilder();
        if (this.daily_quota != null) {
            sb.append(", daily_quota=");
            sb.append(this.daily_quota);
        }
        if (this.max_limit != null) {
            sb.append(", max_limit=");
            sb.append(this.max_limit);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPhoneQueryDailyQuotaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPhoneQueryDailyQuotaResponse(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetPhoneQueryDailyQuotaResponse(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.daily_quota = num;
        this.max_limit = num2;
    }
}
