package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailGetMigrationDetailsResponse extends Message<MailGetMigrationDetailsResponse, C16748a> {
    public static final ProtoAdapter<MailGetMigrationDetailsResponse> ADAPTER = new C16749b();
    public static final Integer DEFAULT_PROGRESS_PCT = 0;
    public static final Integer DEFAULT_STAGE = 0;
    private static final long serialVersionUID = 0;
    public final List<MigrationFailureDetail> failureDetails;
    public final Integer progress_pct;
    public final Integer stage;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsResponse$b */
    private static final class C16749b extends ProtoAdapter<MailGetMigrationDetailsResponse> {
        C16749b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMigrationDetailsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMigrationDetailsResponse mailGetMigrationDetailsResponse) {
            int i;
            int i2 = 0;
            if (mailGetMigrationDetailsResponse.stage != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, mailGetMigrationDetailsResponse.stage);
            } else {
                i = 0;
            }
            if (mailGetMigrationDetailsResponse.progress_pct != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, mailGetMigrationDetailsResponse.progress_pct);
            }
            return i + i2 + MigrationFailureDetail.ADAPTER.asRepeated().encodedSizeWithTag(3, mailGetMigrationDetailsResponse.failureDetails) + mailGetMigrationDetailsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMigrationDetailsResponse decode(ProtoReader protoReader) throws IOException {
            C16748a aVar = new C16748a();
            aVar.f43219a = 0;
            aVar.f43220b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43219a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43220b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43221c.add(MigrationFailureDetail.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMigrationDetailsResponse mailGetMigrationDetailsResponse) throws IOException {
            if (mailGetMigrationDetailsResponse.stage != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mailGetMigrationDetailsResponse.stage);
            }
            if (mailGetMigrationDetailsResponse.progress_pct != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mailGetMigrationDetailsResponse.progress_pct);
            }
            MigrationFailureDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mailGetMigrationDetailsResponse.failureDetails);
            protoWriter.writeBytes(mailGetMigrationDetailsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMigrationDetailsResponse$a */
    public static final class C16748a extends Message.Builder<MailGetMigrationDetailsResponse, C16748a> {

        /* renamed from: a */
        public Integer f43219a;

        /* renamed from: b */
        public Integer f43220b;

        /* renamed from: c */
        public List<MigrationFailureDetail> f43221c = Internal.newMutableList();

        /* renamed from: a */
        public MailGetMigrationDetailsResponse build() {
            return new MailGetMigrationDetailsResponse(this.f43219a, this.f43220b, this.f43221c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16748a newBuilder() {
        C16748a aVar = new C16748a();
        aVar.f43219a = this.stage;
        aVar.f43220b = this.progress_pct;
        aVar.f43221c = Internal.copyOf("failureDetails", this.failureDetails);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMigrationDetailsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.stage != null) {
            sb.append(", stage=");
            sb.append(this.stage);
        }
        if (this.progress_pct != null) {
            sb.append(", progress_pct=");
            sb.append(this.progress_pct);
        }
        if (!this.failureDetails.isEmpty()) {
            sb.append(", failureDetails=");
            sb.append(this.failureDetails);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMigrationDetailsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMigrationDetailsResponse(Integer num, Integer num2, List<MigrationFailureDetail> list) {
        this(num, num2, list, ByteString.EMPTY);
    }

    public MailGetMigrationDetailsResponse(Integer num, Integer num2, List<MigrationFailureDetail> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stage = num;
        this.progress_pct = num2;
        this.failureDetails = Internal.immutableCopyOf("failureDetails", list);
    }
}
