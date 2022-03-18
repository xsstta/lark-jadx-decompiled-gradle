package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SendPhoneQueryQuotaApplyRequest extends Message<SendPhoneQueryQuotaApplyRequest, C16372a> {
    public static final ProtoAdapter<SendPhoneQueryQuotaApplyRequest> ADAPTER = new C16373b();
    public static final Integer DEFAULT_TODAY_QUERY_TIMES = 0;
    private static final long serialVersionUID = 0;
    public final Integer today_query_times;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendPhoneQueryQuotaApplyRequest$b */
    private static final class C16373b extends ProtoAdapter<SendPhoneQueryQuotaApplyRequest> {
        C16373b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendPhoneQueryQuotaApplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendPhoneQueryQuotaApplyRequest sendPhoneQueryQuotaApplyRequest) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, sendPhoneQueryQuotaApplyRequest.today_query_times) + sendPhoneQueryQuotaApplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendPhoneQueryQuotaApplyRequest decode(ProtoReader protoReader) throws IOException {
            C16372a aVar = new C16372a();
            aVar.f42631a = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42631a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendPhoneQueryQuotaApplyRequest sendPhoneQueryQuotaApplyRequest) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, sendPhoneQueryQuotaApplyRequest.today_query_times);
            protoWriter.writeBytes(sendPhoneQueryQuotaApplyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SendPhoneQueryQuotaApplyRequest$a */
    public static final class C16372a extends Message.Builder<SendPhoneQueryQuotaApplyRequest, C16372a> {

        /* renamed from: a */
        public Integer f42631a;

        /* renamed from: a */
        public SendPhoneQueryQuotaApplyRequest build() {
            Integer num = this.f42631a;
            if (num != null) {
                return new SendPhoneQueryQuotaApplyRequest(num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "today_query_times");
        }

        /* renamed from: a */
        public C16372a mo58482a(Integer num) {
            this.f42631a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16372a newBuilder() {
        C16372a aVar = new C16372a();
        aVar.f42631a = this.today_query_times;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SendPhoneQueryQuotaApplyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", today_query_times=");
        sb.append(this.today_query_times);
        StringBuilder replace = sb.replace(0, 2, "SendPhoneQueryQuotaApplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendPhoneQueryQuotaApplyRequest(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public SendPhoneQueryQuotaApplyRequest(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.today_query_times = num;
    }
}
