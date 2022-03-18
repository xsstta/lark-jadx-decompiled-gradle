package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckEnterprisePhoneQuotaResponse extends Message<CheckEnterprisePhoneQuotaResponse, C50284a> {
    public static final ProtoAdapter<CheckEnterprisePhoneQuotaResponse> ADAPTER = new C50285b();
    public static final Integer DEFAULT_AVAILABLE_ENTERPRISE_PHONE_AMOUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer mavailable_enterprise_phone_amount;
    public final String mdate;
    public final String mdepartment_name;

    /* renamed from: com.ss.android.lark.pb.videochat.CheckEnterprisePhoneQuotaResponse$b */
    private static final class C50285b extends ProtoAdapter<CheckEnterprisePhoneQuotaResponse> {
        C50285b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckEnterprisePhoneQuotaResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckEnterprisePhoneQuotaResponse checkEnterprisePhoneQuotaResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (checkEnterprisePhoneQuotaResponse.mdate != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, checkEnterprisePhoneQuotaResponse.mdate);
            } else {
                i = 0;
            }
            if (checkEnterprisePhoneQuotaResponse.mavailable_enterprise_phone_amount != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, checkEnterprisePhoneQuotaResponse.mavailable_enterprise_phone_amount);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (checkEnterprisePhoneQuotaResponse.mdepartment_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, checkEnterprisePhoneQuotaResponse.mdepartment_name);
            }
            return i4 + i3 + checkEnterprisePhoneQuotaResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckEnterprisePhoneQuotaResponse decode(ProtoReader protoReader) throws IOException {
            C50284a aVar = new C50284a();
            aVar.f125645a = "";
            aVar.f125646b = 0;
            aVar.f125647c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125645a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125646b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125647c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckEnterprisePhoneQuotaResponse checkEnterprisePhoneQuotaResponse) throws IOException {
            if (checkEnterprisePhoneQuotaResponse.mdate != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkEnterprisePhoneQuotaResponse.mdate);
            }
            if (checkEnterprisePhoneQuotaResponse.mavailable_enterprise_phone_amount != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, checkEnterprisePhoneQuotaResponse.mavailable_enterprise_phone_amount);
            }
            if (checkEnterprisePhoneQuotaResponse.mdepartment_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, checkEnterprisePhoneQuotaResponse.mdepartment_name);
            }
            protoWriter.writeBytes(checkEnterprisePhoneQuotaResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.CheckEnterprisePhoneQuotaResponse$a */
    public static final class C50284a extends Message.Builder<CheckEnterprisePhoneQuotaResponse, C50284a> {

        /* renamed from: a */
        public String f125645a;

        /* renamed from: b */
        public Integer f125646b;

        /* renamed from: c */
        public String f125647c;

        /* renamed from: a */
        public CheckEnterprisePhoneQuotaResponse build() {
            return new CheckEnterprisePhoneQuotaResponse(this.f125645a, this.f125646b, this.f125647c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50284a newBuilder() {
        C50284a aVar = new C50284a();
        aVar.f125645a = this.mdate;
        aVar.f125646b = this.mavailable_enterprise_phone_amount;
        aVar.f125647c = this.mdepartment_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mdate != null) {
            sb.append(", date=");
            sb.append(this.mdate);
        }
        if (this.mavailable_enterprise_phone_amount != null) {
            sb.append(", available_enterprise_phone_amount=");
            sb.append(this.mavailable_enterprise_phone_amount);
        }
        if (this.mdepartment_name != null) {
            sb.append(", department_name=");
            sb.append(this.mdepartment_name);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckEnterprisePhoneQuotaResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckEnterprisePhoneQuotaResponse(String str, Integer num, String str2) {
        this(str, num, str2, ByteString.EMPTY);
    }

    public CheckEnterprisePhoneQuotaResponse(String str, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdate = str;
        this.mavailable_enterprise_phone_amount = num;
        this.mdepartment_name = str2;
    }
}
