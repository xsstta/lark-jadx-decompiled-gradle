package com.ss.android.lark.pb.team;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CheckNameAvailabilityRequest extends Message<CheckNameAvailabilityRequest, C50062a> {
    public static final ProtoAdapter<CheckNameAvailabilityRequest> ADAPTER = new C50063b();
    private static final long serialVersionUID = 0;
    public final CheckType mcheck_type;
    public final String mname;
    public final String mteam_id;

    public enum CheckType implements WireEnum {
        UNKNOWN(0),
        CHAT(1),
        TEAM(2);
        
        public static final ProtoAdapter<CheckType> ADAPTER = ProtoAdapter.newEnumAdapter(CheckType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CheckType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CHAT;
            }
            if (i != 2) {
                return null;
            }
            return TEAM;
        }

        private CheckType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.team.CheckNameAvailabilityRequest$b */
    private static final class C50063b extends ProtoAdapter<CheckNameAvailabilityRequest> {
        C50063b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckNameAvailabilityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, checkNameAvailabilityRequest.mname);
            int i2 = 0;
            if (checkNameAvailabilityRequest.mteam_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, checkNameAvailabilityRequest.mteam_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (checkNameAvailabilityRequest.mcheck_type != null) {
                i2 = CheckType.ADAPTER.encodedSizeWithTag(3, checkNameAvailabilityRequest.mcheck_type);
            }
            return i3 + i2 + checkNameAvailabilityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckNameAvailabilityRequest decode(ProtoReader protoReader) throws IOException {
            C50062a aVar = new C50062a();
            aVar.f125188a = "";
            aVar.f125189b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125188a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125189b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125190c = CheckType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckNameAvailabilityRequest checkNameAvailabilityRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkNameAvailabilityRequest.mname);
            if (checkNameAvailabilityRequest.mteam_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, checkNameAvailabilityRequest.mteam_id);
            }
            if (checkNameAvailabilityRequest.mcheck_type != null) {
                CheckType.ADAPTER.encodeWithTag(protoWriter, 3, checkNameAvailabilityRequest.mcheck_type);
            }
            protoWriter.writeBytes(checkNameAvailabilityRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50062a newBuilder() {
        C50062a aVar = new C50062a();
        aVar.f125188a = this.mname;
        aVar.f125189b = this.mteam_id;
        aVar.f125190c = this.mcheck_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.team.CheckNameAvailabilityRequest$a */
    public static final class C50062a extends Message.Builder<CheckNameAvailabilityRequest, C50062a> {

        /* renamed from: a */
        public String f125188a;

        /* renamed from: b */
        public String f125189b;

        /* renamed from: c */
        public CheckType f125190c;

        /* renamed from: a */
        public CheckNameAvailabilityRequest build() {
            String str = this.f125188a;
            if (str != null) {
                return new CheckNameAvailabilityRequest(str, this.f125189b, this.f125190c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mname");
        }

        /* renamed from: a */
        public C50062a mo173928a(CheckType checkType) {
            this.f125190c = checkType;
            return this;
        }

        /* renamed from: b */
        public C50062a mo173931b(String str) {
            this.f125189b = str;
            return this;
        }

        /* renamed from: a */
        public C50062a mo173929a(String str) {
            this.f125188a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.mname);
        if (this.mteam_id != null) {
            sb.append(", team_id=");
            sb.append(this.mteam_id);
        }
        if (this.mcheck_type != null) {
            sb.append(", check_type=");
            sb.append(this.mcheck_type);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckNameAvailabilityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckNameAvailabilityRequest(String str, String str2, CheckType checkType) {
        this(str, str2, checkType, ByteString.EMPTY);
    }

    public CheckNameAvailabilityRequest(String str, String str2, CheckType checkType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mname = str;
        this.mteam_id = str2;
        this.mcheck_type = checkType;
    }
}
