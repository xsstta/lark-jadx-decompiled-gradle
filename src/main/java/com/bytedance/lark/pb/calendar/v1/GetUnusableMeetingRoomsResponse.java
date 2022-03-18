package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetUnusableMeetingRoomsResponse extends Message<GetUnusableMeetingRoomsResponse, C15802a> {
    public static final ProtoAdapter<GetUnusableMeetingRoomsResponse> ADAPTER = new C15803b();
    private static final long serialVersionUID = 0;
    public final Map<String, UnusableReasons> unusable_reasons;

    public enum UnusableReason implements WireEnum {
        UNKNOWN(0),
        OVER_MAX_DURATION(1),
        OVER_MAX_UNTIL_TIME(2),
        NOT_IN_USABLE_TIME(3),
        DURING_REQUISITION(4),
        RECURRENT_EVENT_DURATION_TRIGGERS_APPROVAL(6);
        
        public static final ProtoAdapter<UnusableReason> ADAPTER = ProtoAdapter.newEnumAdapter(UnusableReason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static UnusableReason fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return OVER_MAX_DURATION;
            }
            if (i == 2) {
                return OVER_MAX_UNTIL_TIME;
            }
            if (i == 3) {
                return NOT_IN_USABLE_TIME;
            }
            if (i == 4) {
                return DURING_REQUISITION;
            }
            if (i != 6) {
                return null;
            }
            return RECURRENT_EVENT_DURATION_TRIGGERS_APPROVAL;
        }

        private UnusableReason(int i) {
            this.value = i;
        }
    }

    public static final class UnusableReasons extends Message<UnusableReasons, C15800a> {
        public static final ProtoAdapter<UnusableReasons> ADAPTER = new C15801b();
        private static final long serialVersionUID = 0;
        public final List<UnusableReason> unusable_reasons;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse$UnusableReasons$b */
        private static final class C15801b extends ProtoAdapter<UnusableReasons> {
            C15801b() {
                super(FieldEncoding.LENGTH_DELIMITED, UnusableReasons.class);
            }

            /* renamed from: a */
            public int encodedSize(UnusableReasons unusableReasons) {
                return UnusableReason.ADAPTER.asRepeated().encodedSizeWithTag(1, unusableReasons.unusable_reasons) + unusableReasons.unknownFields().size();
            }

            /* renamed from: a */
            public UnusableReasons decode(ProtoReader protoReader) throws IOException {
                C15800a aVar = new C15800a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f41581a.add(UnusableReason.ADAPTER.decode(protoReader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UnusableReasons unusableReasons) throws IOException {
                UnusableReason.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, unusableReasons.unusable_reasons);
                protoWriter.writeBytes(unusableReasons.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse$UnusableReasons$a */
        public static final class C15800a extends Message.Builder<UnusableReasons, C15800a> {

            /* renamed from: a */
            public List<UnusableReason> f41581a = Internal.newMutableList();

            /* renamed from: a */
            public UnusableReasons build() {
                return new UnusableReasons(this.f41581a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15800a newBuilder() {
            C15800a aVar = new C15800a();
            aVar.f41581a = Internal.copyOf("unusable_reasons", this.unusable_reasons);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "UnusableReasons");
            StringBuilder sb = new StringBuilder();
            if (!this.unusable_reasons.isEmpty()) {
                sb.append(", unusable_reasons=");
                sb.append(this.unusable_reasons);
            }
            StringBuilder replace = sb.replace(0, 2, "UnusableReasons{");
            replace.append('}');
            return replace.toString();
        }

        public UnusableReasons(List<UnusableReason> list) {
            this(list, ByteString.EMPTY);
        }

        public UnusableReasons(List<UnusableReason> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.unusable_reasons = Internal.immutableCopyOf("unusable_reasons", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse$a */
    public static final class C15802a extends Message.Builder<GetUnusableMeetingRoomsResponse, C15802a> {

        /* renamed from: a */
        public Map<String, UnusableReasons> f41582a = Internal.newMutableMap();

        /* renamed from: a */
        public GetUnusableMeetingRoomsResponse build() {
            return new GetUnusableMeetingRoomsResponse(this.f41582a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse$b */
    private static final class C15803b extends ProtoAdapter<GetUnusableMeetingRoomsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UnusableReasons>> f41583a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UnusableReasons.ADAPTER);

        C15803b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUnusableMeetingRoomsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUnusableMeetingRoomsResponse getUnusableMeetingRoomsResponse) {
            return this.f41583a.encodedSizeWithTag(1, getUnusableMeetingRoomsResponse.unusable_reasons) + getUnusableMeetingRoomsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUnusableMeetingRoomsResponse decode(ProtoReader protoReader) throws IOException {
            C15802a aVar = new C15802a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41582a.putAll(this.f41583a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUnusableMeetingRoomsResponse getUnusableMeetingRoomsResponse) throws IOException {
            this.f41583a.encodeWithTag(protoWriter, 1, getUnusableMeetingRoomsResponse.unusable_reasons);
            protoWriter.writeBytes(getUnusableMeetingRoomsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15802a newBuilder() {
        C15802a aVar = new C15802a();
        aVar.f41582a = Internal.copyOf("unusable_reasons", this.unusable_reasons);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetUnusableMeetingRoomsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.unusable_reasons.isEmpty()) {
            sb.append(", unusable_reasons=");
            sb.append(this.unusable_reasons);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUnusableMeetingRoomsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUnusableMeetingRoomsResponse(Map<String, UnusableReasons> map) {
        this(map, ByteString.EMPTY);
    }

    public GetUnusableMeetingRoomsResponse(Map<String, UnusableReasons> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unusable_reasons = Internal.immutableCopyOf("unusable_reasons", map);
    }
}
