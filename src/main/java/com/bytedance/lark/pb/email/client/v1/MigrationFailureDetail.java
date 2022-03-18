package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MigrationFailureDetail extends Message<MigrationFailureDetail, C16972a> {
    public static final ProtoAdapter<MigrationFailureDetail> ADAPTER = new C16973b();
    public static final Long DEFAULT_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final String subject;
    public final Long timestamp;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail$b */
    private static final class C16973b extends ProtoAdapter<MigrationFailureDetail> {
        C16973b() {
            super(FieldEncoding.LENGTH_DELIMITED, MigrationFailureDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(MigrationFailureDetail migrationFailureDetail) {
            int i;
            int i2 = 0;
            if (migrationFailureDetail.subject != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, migrationFailureDetail.subject);
            } else {
                i = 0;
            }
            if (migrationFailureDetail.timestamp != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, migrationFailureDetail.timestamp);
            }
            return i + i2 + migrationFailureDetail.unknownFields().size();
        }

        /* renamed from: a */
        public MigrationFailureDetail decode(ProtoReader protoReader) throws IOException {
            C16972a aVar = new C16972a();
            aVar.f43532a = "";
            aVar.f43533b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43532a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43533b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MigrationFailureDetail migrationFailureDetail) throws IOException {
            if (migrationFailureDetail.subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, migrationFailureDetail.subject);
            }
            if (migrationFailureDetail.timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, migrationFailureDetail.timestamp);
            }
            protoWriter.writeBytes(migrationFailureDetail.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail$a */
    public static final class C16972a extends Message.Builder<MigrationFailureDetail, C16972a> {

        /* renamed from: a */
        public String f43532a;

        /* renamed from: b */
        public Long f43533b;

        /* renamed from: a */
        public MigrationFailureDetail build() {
            return new MigrationFailureDetail(this.f43532a, this.f43533b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16972a newBuilder() {
        C16972a aVar = new C16972a();
        aVar.f43532a = this.subject;
        aVar.f43533b = this.timestamp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MigrationFailureDetail");
        StringBuilder sb = new StringBuilder();
        if (this.subject != null) {
            sb.append(", subject=");
            sb.append(this.subject);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "MigrationFailureDetail{");
        replace.append('}');
        return replace.toString();
    }

    public MigrationFailureDetail(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public MigrationFailureDetail(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.subject = str;
        this.timestamp = l;
    }
}
