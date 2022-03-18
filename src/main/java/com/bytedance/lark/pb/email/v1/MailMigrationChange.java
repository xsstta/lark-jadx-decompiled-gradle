package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailMigrationChange extends Message<MailMigrationChange, C17024a> {
    public static final ProtoAdapter<MailMigrationChange> ADAPTER = new C17025b();
    public static final Integer DEFAULT_PROGRESS_PCT = 0;
    public static final Integer DEFAULT_STAGE = 0;
    private static final long serialVersionUID = 0;
    public final Integer progress_pct;
    public final Integer stage;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailMigrationChange$b */
    private static final class C17025b extends ProtoAdapter<MailMigrationChange> {
        C17025b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMigrationChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMigrationChange mailMigrationChange) {
            int i;
            int i2 = 0;
            if (mailMigrationChange.stage != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, mailMigrationChange.stage);
            } else {
                i = 0;
            }
            if (mailMigrationChange.progress_pct != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, mailMigrationChange.progress_pct);
            }
            return i + i2 + mailMigrationChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailMigrationChange decode(ProtoReader protoReader) throws IOException {
            C17024a aVar = new C17024a();
            aVar.f43671a = 0;
            aVar.f43672b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43671a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43672b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMigrationChange mailMigrationChange) throws IOException {
            if (mailMigrationChange.stage != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mailMigrationChange.stage);
            }
            if (mailMigrationChange.progress_pct != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mailMigrationChange.progress_pct);
            }
            protoWriter.writeBytes(mailMigrationChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailMigrationChange$a */
    public static final class C17024a extends Message.Builder<MailMigrationChange, C17024a> {

        /* renamed from: a */
        public Integer f43671a;

        /* renamed from: b */
        public Integer f43672b;

        /* renamed from: a */
        public MailMigrationChange build() {
            return new MailMigrationChange(this.f43671a, this.f43672b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17024a newBuilder() {
        C17024a aVar = new C17024a();
        aVar.f43671a = this.stage;
        aVar.f43672b = this.progress_pct;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMigrationChange");
        StringBuilder sb = new StringBuilder();
        if (this.stage != null) {
            sb.append(", stage=");
            sb.append(this.stage);
        }
        if (this.progress_pct != null) {
            sb.append(", progress_pct=");
            sb.append(this.progress_pct);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMigrationChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailMigrationChange(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public MailMigrationChange(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stage = num;
        this.progress_pct = num2;
    }
}
