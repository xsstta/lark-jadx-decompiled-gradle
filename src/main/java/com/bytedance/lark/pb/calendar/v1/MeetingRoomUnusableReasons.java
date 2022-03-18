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
import okio.ByteString;

public final class MeetingRoomUnusableReasons extends Message<MeetingRoomUnusableReasons, C15878a> {
    public static final ProtoAdapter<MeetingRoomUnusableReasons> ADAPTER = new C15879b();
    private static final long serialVersionUID = 0;
    public final List<UnusableReason> unusable_reasons;

    public enum UnusableReason implements WireEnum {
        UNKNOWN(0),
        OVER_MAX_DURATION(1),
        OVER_MAX_UNTIL_TIME(2),
        NOT_IN_USABLE_TIME(3),
        DURING_REQUISITION(4),
        PAST_TIME(5),
        CANT_RESERVE_OVER_TIME(101),
        UPGRADE_FOR_APPROVAL(102),
        OVER_RESERVE_TIME_APPROVE(103);
        
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
            if (i == 5) {
                return PAST_TIME;
            }
            switch (i) {
                case 101:
                    return CANT_RESERVE_OVER_TIME;
                case 102:
                    return UPGRADE_FOR_APPROVAL;
                case 103:
                    return OVER_RESERVE_TIME_APPROVE;
                default:
                    return null;
            }
        }

        private UnusableReason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomUnusableReasons$b */
    private static final class C15879b extends ProtoAdapter<MeetingRoomUnusableReasons> {
        C15879b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingRoomUnusableReasons.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingRoomUnusableReasons meetingRoomUnusableReasons) {
            return UnusableReason.ADAPTER.asRepeated().encodedSizeWithTag(1, meetingRoomUnusableReasons.unusable_reasons) + meetingRoomUnusableReasons.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingRoomUnusableReasons decode(ProtoReader protoReader) throws IOException {
            C15878a aVar = new C15878a();
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
                        aVar.f41729a.add(UnusableReason.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingRoomUnusableReasons meetingRoomUnusableReasons) throws IOException {
            UnusableReason.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, meetingRoomUnusableReasons.unusable_reasons);
            protoWriter.writeBytes(meetingRoomUnusableReasons.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomUnusableReasons$a */
    public static final class C15878a extends Message.Builder<MeetingRoomUnusableReasons, C15878a> {

        /* renamed from: a */
        public List<UnusableReason> f41729a = Internal.newMutableList();

        /* renamed from: a */
        public MeetingRoomUnusableReasons build() {
            return new MeetingRoomUnusableReasons(this.f41729a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15878a newBuilder() {
        C15878a aVar = new C15878a();
        aVar.f41729a = Internal.copyOf("unusable_reasons", this.unusable_reasons);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingRoomUnusableReasons");
        StringBuilder sb = new StringBuilder();
        if (!this.unusable_reasons.isEmpty()) {
            sb.append(", unusable_reasons=");
            sb.append(this.unusable_reasons);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingRoomUnusableReasons{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingRoomUnusableReasons(List<UnusableReason> list) {
        this(list, ByteString.EMPTY);
    }

    public MeetingRoomUnusableReasons(List<UnusableReason> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unusable_reasons = Internal.immutableCopyOf("unusable_reasons", list);
    }
}
