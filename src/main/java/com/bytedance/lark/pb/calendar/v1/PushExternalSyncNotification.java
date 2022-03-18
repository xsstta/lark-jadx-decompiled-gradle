package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class PushExternalSyncNotification extends Message<PushExternalSyncNotification, C15956a> {
    public static final ProtoAdapter<PushExternalSyncNotification> ADAPTER = new C15957b();
    public static final ExternalType DEFAULT_EXTERNAL_TYPE = ExternalType.EXTERNAL_EXCHANGE;
    private static final long serialVersionUID = 0;
    public final String external_account_email;
    public final ExternalType external_type;

    public enum ExternalType implements WireEnum {
        EXTERNAL_EXCHANGE(1),
        EXTERNAL_GOOGLE(2);
        
        public static final ProtoAdapter<ExternalType> ADAPTER = ProtoAdapter.newEnumAdapter(ExternalType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ExternalType fromValue(int i) {
            if (i == 1) {
                return EXTERNAL_EXCHANGE;
            }
            if (i != 2) {
                return null;
            }
            return EXTERNAL_GOOGLE;
        }

        private ExternalType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushExternalSyncNotification$b */
    private static final class C15957b extends ProtoAdapter<PushExternalSyncNotification> {
        C15957b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushExternalSyncNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushExternalSyncNotification pushExternalSyncNotification) {
            int i;
            int i2 = 0;
            if (pushExternalSyncNotification.external_type != null) {
                i = ExternalType.ADAPTER.encodedSizeWithTag(1, pushExternalSyncNotification.external_type);
            } else {
                i = 0;
            }
            if (pushExternalSyncNotification.external_account_email != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushExternalSyncNotification.external_account_email);
            }
            return i + i2 + pushExternalSyncNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushExternalSyncNotification decode(ProtoReader protoReader) throws IOException {
            C15956a aVar = new C15956a();
            aVar.f41954a = ExternalType.EXTERNAL_EXCHANGE;
            aVar.f41955b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f41954a = ExternalType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41955b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushExternalSyncNotification pushExternalSyncNotification) throws IOException {
            if (pushExternalSyncNotification.external_type != null) {
                ExternalType.ADAPTER.encodeWithTag(protoWriter, 1, pushExternalSyncNotification.external_type);
            }
            if (pushExternalSyncNotification.external_account_email != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushExternalSyncNotification.external_account_email);
            }
            protoWriter.writeBytes(pushExternalSyncNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PushExternalSyncNotification$a */
    public static final class C15956a extends Message.Builder<PushExternalSyncNotification, C15956a> {

        /* renamed from: a */
        public ExternalType f41954a;

        /* renamed from: b */
        public String f41955b;

        /* renamed from: a */
        public PushExternalSyncNotification build() {
            return new PushExternalSyncNotification(this.f41954a, this.f41955b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15956a newBuilder() {
        C15956a aVar = new C15956a();
        aVar.f41954a = this.external_type;
        aVar.f41955b = this.external_account_email;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PushExternalSyncNotification");
        StringBuilder sb = new StringBuilder();
        if (this.external_type != null) {
            sb.append(", external_type=");
            sb.append(this.external_type);
        }
        if (this.external_account_email != null) {
            sb.append(", external_account_email=");
            sb.append(this.external_account_email);
        }
        StringBuilder replace = sb.replace(0, 2, "PushExternalSyncNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushExternalSyncNotification(ExternalType externalType, String str) {
        this(externalType, str, ByteString.EMPTY);
    }

    public PushExternalSyncNotification(ExternalType externalType, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.external_type = externalType;
        this.external_account_email = str;
    }
}
