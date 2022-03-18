package com.ss.android.lark.pb.users;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckUserPhoneNumberResponse extends Message<CheckUserPhoneNumberResponse, C50262a> {
    public static final ProtoAdapter<CheckUserPhoneNumberResponse> ADAPTER = new C50263b();
    public static final Long DEFAULT_LEADER_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_TODAY_CALL_COUNT = 0L;
    private static final long serialVersionUID = 0;
    public final String mannouncement;
    public final Long mleader_id;
    public final String mphone_number;
    public final Integer mstatus;
    public final Long mtoday_call_count;

    /* renamed from: com.ss.android.lark.pb.users.CheckUserPhoneNumberResponse$b */
    private static final class C50263b extends ProtoAdapter<CheckUserPhoneNumberResponse> {
        C50263b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckUserPhoneNumberResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckUserPhoneNumberResponse checkUserPhoneNumberResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (checkUserPhoneNumberResponse.mstatus != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, checkUserPhoneNumberResponse.mstatus);
            } else {
                i = 0;
            }
            if (checkUserPhoneNumberResponse.mphone_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, checkUserPhoneNumberResponse.mphone_number);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (checkUserPhoneNumberResponse.mannouncement != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, checkUserPhoneNumberResponse.mannouncement);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (checkUserPhoneNumberResponse.mleader_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, checkUserPhoneNumberResponse.mleader_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (checkUserPhoneNumberResponse.mtoday_call_count != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, checkUserPhoneNumberResponse.mtoday_call_count);
            }
            return i8 + i5 + checkUserPhoneNumberResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckUserPhoneNumberResponse decode(ProtoReader protoReader) throws IOException {
            C50262a aVar = new C50262a();
            aVar.f125608a = 0;
            aVar.f125609b = "";
            aVar.f125610c = "";
            aVar.f125611d = 0L;
            aVar.f125612e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125608a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125609b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125610c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125611d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125612e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckUserPhoneNumberResponse checkUserPhoneNumberResponse) throws IOException {
            if (checkUserPhoneNumberResponse.mstatus != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, checkUserPhoneNumberResponse.mstatus);
            }
            if (checkUserPhoneNumberResponse.mphone_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, checkUserPhoneNumberResponse.mphone_number);
            }
            if (checkUserPhoneNumberResponse.mannouncement != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, checkUserPhoneNumberResponse.mannouncement);
            }
            if (checkUserPhoneNumberResponse.mleader_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, checkUserPhoneNumberResponse.mleader_id);
            }
            if (checkUserPhoneNumberResponse.mtoday_call_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, checkUserPhoneNumberResponse.mtoday_call_count);
            }
            protoWriter.writeBytes(checkUserPhoneNumberResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.users.CheckUserPhoneNumberResponse$a */
    public static final class C50262a extends Message.Builder<CheckUserPhoneNumberResponse, C50262a> {

        /* renamed from: a */
        public Integer f125608a;

        /* renamed from: b */
        public String f125609b;

        /* renamed from: c */
        public String f125610c;

        /* renamed from: d */
        public Long f125611d;

        /* renamed from: e */
        public Long f125612e;

        /* renamed from: a */
        public CheckUserPhoneNumberResponse build() {
            return new CheckUserPhoneNumberResponse(this.f125608a, this.f125609b, this.f125610c, this.f125611d, this.f125612e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50262a newBuilder() {
        C50262a aVar = new C50262a();
        aVar.f125608a = this.mstatus;
        aVar.f125609b = this.mphone_number;
        aVar.f125610c = this.mannouncement;
        aVar.f125611d = this.mleader_id;
        aVar.f125612e = this.mtoday_call_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mphone_number != null) {
            sb.append(", phone_number=");
            sb.append(this.mphone_number);
        }
        if (this.mannouncement != null) {
            sb.append(", announcement=");
            sb.append(this.mannouncement);
        }
        if (this.mleader_id != null) {
            sb.append(", leader_id=");
            sb.append(this.mleader_id);
        }
        if (this.mtoday_call_count != null) {
            sb.append(", today_call_count=");
            sb.append(this.mtoday_call_count);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckUserPhoneNumberResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckUserPhoneNumberResponse(Integer num, String str, String str2, Long l, Long l2) {
        this(num, str, str2, l, l2, ByteString.EMPTY);
    }

    public CheckUserPhoneNumberResponse(Integer num, String str, String str2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mstatus = num;
        this.mphone_number = str;
        this.mannouncement = str2;
        this.mleader_id = l;
        this.mtoday_call_count = l2;
    }
}
