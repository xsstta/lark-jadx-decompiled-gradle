package com.ss.android.lark.pb.team;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CheckNameAvailabilityResponse extends Message<CheckNameAvailabilityResponse, C50064a> {
    public static final ProtoAdapter<CheckNameAvailabilityResponse> ADAPTER = new C50065b();
    public static final Boolean DEFAULT_AVAILABLE = false;
    private static final long serialVersionUID = 0;
    public final Boolean mavailable;
    public final InvalidType minvalid_type;

    public enum InvalidType implements WireEnum {
        UNKNOWN(0),
        EXIST(1);
        
        public static final ProtoAdapter<InvalidType> ADAPTER = ProtoAdapter.newEnumAdapter(InvalidType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InvalidType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return EXIST;
        }

        private InvalidType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.CheckNameAvailabilityResponse$b */
    private static final class C50065b extends ProtoAdapter<CheckNameAvailabilityResponse> {
        C50065b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckNameAvailabilityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckNameAvailabilityResponse checkNameAvailabilityResponse) {
            int i;
            int i2 = 0;
            if (checkNameAvailabilityResponse.mavailable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, checkNameAvailabilityResponse.mavailable);
            } else {
                i = 0;
            }
            if (checkNameAvailabilityResponse.minvalid_type != null) {
                i2 = InvalidType.ADAPTER.encodedSizeWithTag(2, checkNameAvailabilityResponse.minvalid_type);
            }
            return i + i2 + checkNameAvailabilityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CheckNameAvailabilityResponse decode(ProtoReader protoReader) throws IOException {
            C50064a aVar = new C50064a();
            aVar.f125191a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125191a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125192b = InvalidType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckNameAvailabilityResponse checkNameAvailabilityResponse) throws IOException {
            if (checkNameAvailabilityResponse.mavailable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkNameAvailabilityResponse.mavailable);
            }
            if (checkNameAvailabilityResponse.minvalid_type != null) {
                InvalidType.ADAPTER.encodeWithTag(protoWriter, 2, checkNameAvailabilityResponse.minvalid_type);
            }
            protoWriter.writeBytes(checkNameAvailabilityResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.CheckNameAvailabilityResponse$a */
    public static final class C50064a extends Message.Builder<CheckNameAvailabilityResponse, C50064a> {

        /* renamed from: a */
        public Boolean f125191a;

        /* renamed from: b */
        public InvalidType f125192b;

        /* renamed from: a */
        public CheckNameAvailabilityResponse build() {
            return new CheckNameAvailabilityResponse(this.f125191a, this.f125192b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50064a newBuilder() {
        C50064a aVar = new C50064a();
        aVar.f125191a = this.mavailable;
        aVar.f125192b = this.minvalid_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mavailable != null) {
            sb.append(", available=");
            sb.append(this.mavailable);
        }
        if (this.minvalid_type != null) {
            sb.append(", invalid_type=");
            sb.append(this.minvalid_type);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckNameAvailabilityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CheckNameAvailabilityResponse(Boolean bool, InvalidType invalidType) {
        this(bool, invalidType, ByteString.EMPTY);
    }

    public CheckNameAvailabilityResponse(Boolean bool, InvalidType invalidType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mavailable = bool;
        this.minvalid_type = invalidType;
    }
}
