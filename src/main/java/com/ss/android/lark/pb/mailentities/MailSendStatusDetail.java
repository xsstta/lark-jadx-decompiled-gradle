package com.ss.android.lark.pb.mailentities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class MailSendStatusDetail extends Message<MailSendStatusDetail, C49823a> {
    public static final ProtoAdapter<MailSendStatusDetail> ADAPTER = new C49824b();
    private static final long serialVersionUID = 0;
    public final DetailStatus mdetail_status;
    public final Timestamp mlast_updated_time;
    public final Address mrecipients;

    public enum DetailStatus implements WireEnum {
        UNKNOWN(0),
        DELIVERING(1),
        RETRY(2),
        DEFERRED(3),
        DELIVERED(4);
        
        public static final ProtoAdapter<DetailStatus> ADAPTER = ProtoAdapter.newEnumAdapter(DetailStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DetailStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DELIVERING;
            }
            if (i == 2) {
                return RETRY;
            }
            if (i == 3) {
                return DEFERRED;
            }
            if (i != 4) {
                return null;
            }
            return DELIVERED;
        }

        private DetailStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.MailSendStatusDetail$b */
    private static final class C49824b extends ProtoAdapter<MailSendStatusDetail> {
        C49824b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSendStatusDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSendStatusDetail mailSendStatusDetail) {
            int i;
            int i2;
            int i3 = 0;
            if (mailSendStatusDetail.mrecipients != null) {
                i = Address.ADAPTER.encodedSizeWithTag(2, mailSendStatusDetail.mrecipients);
            } else {
                i = 0;
            }
            if (mailSendStatusDetail.mlast_updated_time != null) {
                i2 = Timestamp.ADAPTER.encodedSizeWithTag(3, mailSendStatusDetail.mlast_updated_time);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailSendStatusDetail.mdetail_status != null) {
                i3 = DetailStatus.ADAPTER.encodedSizeWithTag(4, mailSendStatusDetail.mdetail_status);
            }
            return i4 + i3 + mailSendStatusDetail.unknownFields().size();
        }

        /* renamed from: a */
        public MailSendStatusDetail decode(ProtoReader protoReader) throws IOException {
            C49823a aVar = new C49823a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f124770a = Address.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124771b = Timestamp.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124772c = DetailStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSendStatusDetail mailSendStatusDetail) throws IOException {
            if (mailSendStatusDetail.mrecipients != null) {
                Address.ADAPTER.encodeWithTag(protoWriter, 2, mailSendStatusDetail.mrecipients);
            }
            if (mailSendStatusDetail.mlast_updated_time != null) {
                Timestamp.ADAPTER.encodeWithTag(protoWriter, 3, mailSendStatusDetail.mlast_updated_time);
            }
            if (mailSendStatusDetail.mdetail_status != null) {
                DetailStatus.ADAPTER.encodeWithTag(protoWriter, 4, mailSendStatusDetail.mdetail_status);
            }
            protoWriter.writeBytes(mailSendStatusDetail.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.MailSendStatusDetail$a */
    public static final class C49823a extends Message.Builder<MailSendStatusDetail, C49823a> {

        /* renamed from: a */
        public Address f124770a;

        /* renamed from: b */
        public Timestamp f124771b;

        /* renamed from: c */
        public DetailStatus f124772c;

        /* renamed from: a */
        public MailSendStatusDetail build() {
            return new MailSendStatusDetail(this.f124770a, this.f124771b, this.f124772c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49823a newBuilder() {
        C49823a aVar = new C49823a();
        aVar.f124770a = this.mrecipients;
        aVar.f124771b = this.mlast_updated_time;
        aVar.f124772c = this.mdetail_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mrecipients != null) {
            sb.append(", recipients=");
            sb.append(this.mrecipients);
        }
        if (this.mlast_updated_time != null) {
            sb.append(", last_updated_time=");
            sb.append(this.mlast_updated_time);
        }
        if (this.mdetail_status != null) {
            sb.append(", detail_status=");
            sb.append(this.mdetail_status);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSendStatusDetail{");
        replace.append('}');
        return replace.toString();
    }

    public MailSendStatusDetail(Address address, Timestamp timestamp, DetailStatus detailStatus) {
        this(address, timestamp, detailStatus, ByteString.EMPTY);
    }

    public MailSendStatusDetail(Address address, Timestamp timestamp, DetailStatus detailStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mrecipients = address;
        this.mlast_updated_time = timestamp;
        this.mdetail_status = detailStatus;
    }
}
