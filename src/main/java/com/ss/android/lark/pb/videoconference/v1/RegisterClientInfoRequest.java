package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.Participant;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class RegisterClientInfoRequest extends Message<RegisterClientInfoRequest, C50962a> {
    public static final ProtoAdapter<RegisterClientInfoRequest> ADAPTER = new C50963b();
    public static final SourceType DEFAULT_SOURCE_TYPE = SourceType.UNKNOWN;
    public static final Participant.Status DEFAULT_STATUS = Participant.Status.UNKNOWN;
    public static final Boolean DEFAULT_SYNC_RESPONSE = false;
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final List<String> meeting_ids;
    public final SourceType source_type;
    public final Participant.Status status;
    public final Boolean sync_response;

    public enum SourceType implements WireEnum {
        UNKNOWN(0),
        LONG_CONNECTION_LOSS(1),
        CRASHED_STARTUP(2),
        KILLED_STARTUP(3),
        DUAL_CHANNEL_POLL(4);
        
        public static final ProtoAdapter<SourceType> ADAPTER = ProtoAdapter.newEnumAdapter(SourceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SourceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LONG_CONNECTION_LOSS;
            }
            if (i == 2) {
                return CRASHED_STARTUP;
            }
            if (i == 3) {
                return KILLED_STARTUP;
            }
            if (i != 4) {
                return null;
            }
            return DUAL_CHANNEL_POLL;
        }

        private SourceType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoRequest$b */
    private static final class C50963b extends ProtoAdapter<RegisterClientInfoRequest> {
        C50963b() {
            super(FieldEncoding.LENGTH_DELIMITED, RegisterClientInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RegisterClientInfoRequest registerClientInfoRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (registerClientInfoRequest.status != null) {
                i = Participant.Status.ADAPTER.encodedSizeWithTag(1, registerClientInfoRequest.status);
            } else {
                i = 0;
            }
            if (registerClientInfoRequest.sync_response != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, registerClientInfoRequest.sync_response);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (registerClientInfoRequest.meeting_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, registerClientInfoRequest.meeting_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (registerClientInfoRequest.source_type != null) {
                i4 = SourceType.ADAPTER.encodedSizeWithTag(4, registerClientInfoRequest.source_type);
            }
            return i6 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, registerClientInfoRequest.meeting_ids) + registerClientInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RegisterClientInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50962a aVar = new C50962a();
            aVar.f126986a = Participant.Status.UNKNOWN;
            aVar.f126987b = false;
            aVar.f126988c = "";
            aVar.f126989d = SourceType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126986a = Participant.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126987b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126988c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f126989d = SourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126990e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RegisterClientInfoRequest registerClientInfoRequest) throws IOException {
            if (registerClientInfoRequest.status != null) {
                Participant.Status.ADAPTER.encodeWithTag(protoWriter, 1, registerClientInfoRequest.status);
            }
            if (registerClientInfoRequest.sync_response != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, registerClientInfoRequest.sync_response);
            }
            if (registerClientInfoRequest.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, registerClientInfoRequest.meeting_id);
            }
            if (registerClientInfoRequest.source_type != null) {
                SourceType.ADAPTER.encodeWithTag(protoWriter, 4, registerClientInfoRequest.source_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, registerClientInfoRequest.meeting_ids);
            protoWriter.writeBytes(registerClientInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoRequest$a */
    public static final class C50962a extends Message.Builder<RegisterClientInfoRequest, C50962a> {

        /* renamed from: a */
        public Participant.Status f126986a;

        /* renamed from: b */
        public Boolean f126987b;

        /* renamed from: c */
        public String f126988c;

        /* renamed from: d */
        public SourceType f126989d;

        /* renamed from: e */
        public List<String> f126990e = Internal.newMutableList();

        /* renamed from: a */
        public RegisterClientInfoRequest build() {
            return new RegisterClientInfoRequest(this.f126986a, this.f126987b, this.f126988c, this.f126989d, this.f126990e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50962a mo176009a(Participant.Status status) {
            this.f126986a = status;
            return this;
        }

        /* renamed from: a */
        public C50962a mo176010a(SourceType sourceType) {
            this.f126989d = sourceType;
            return this;
        }

        /* renamed from: a */
        public C50962a mo176011a(Boolean bool) {
            this.f126987b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50962a newBuilder() {
        C50962a aVar = new C50962a();
        aVar.f126986a = this.status;
        aVar.f126987b = this.sync_response;
        aVar.f126988c = this.meeting_id;
        aVar.f126989d = this.source_type;
        aVar.f126990e = Internal.copyOf("meeting_ids", this.meeting_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RegisterClientInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.sync_response != null) {
            sb.append(", sync_response=");
            sb.append(this.sync_response);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (!this.meeting_ids.isEmpty()) {
            sb.append(", meeting_ids=");
            sb.append(this.meeting_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "RegisterClientInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RegisterClientInfoRequest(Participant.Status status2, Boolean bool, String str, SourceType sourceType, List<String> list) {
        this(status2, bool, str, sourceType, list, ByteString.EMPTY);
    }

    public RegisterClientInfoRequest(Participant.Status status2, Boolean bool, String str, SourceType sourceType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = status2;
        this.sync_response = bool;
        this.meeting_id = str;
        this.source_type = sourceType;
        this.meeting_ids = Internal.immutableCopyOf("meeting_ids", list);
    }
}
