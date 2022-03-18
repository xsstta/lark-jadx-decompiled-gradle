package com.ss.android.lark.pb.videoconference.v1;

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

public final class VCTabMeetingChangeInfo extends Message<VCTabMeetingChangeInfo, C51198a> {
    public static final ProtoAdapter<VCTabMeetingChangeInfo> ADAPTER = new C51199b();
    public static final ChangeType DEFAULT_CHANGE_TYPE = ChangeType.PARTICIPANT;
    private static final long serialVersionUID = 0;
    public final ChangeType change_type;
    public final VCTabHistoryCommonInfo meeting_info;
    public final List<VCParticipantAbbrInfo> participant_changes;

    public enum ChangeType implements WireEnum {
        PARTICIPANT(0),
        MEETING(1);
        
        public static final ProtoAdapter<ChangeType> ADAPTER = ProtoAdapter.newEnumAdapter(ChangeType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChangeType fromValue(int i) {
            if (i == 0) {
                return PARTICIPANT;
            }
            if (i != 1) {
                return null;
            }
            return MEETING;
        }

        private ChangeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingChangeInfo$b */
    private static final class C51199b extends ProtoAdapter<VCTabMeetingChangeInfo> {
        C51199b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMeetingChangeInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMeetingChangeInfo vCTabMeetingChangeInfo) {
            int i;
            int i2 = 0;
            if (vCTabMeetingChangeInfo.change_type != null) {
                i = ChangeType.ADAPTER.encodedSizeWithTag(1, vCTabMeetingChangeInfo.change_type);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + VCParticipantAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, vCTabMeetingChangeInfo.participant_changes);
            if (vCTabMeetingChangeInfo.meeting_info != null) {
                i2 = VCTabHistoryCommonInfo.ADAPTER.encodedSizeWithTag(3, vCTabMeetingChangeInfo.meeting_info);
            }
            return encodedSizeWithTag + i2 + vCTabMeetingChangeInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMeetingChangeInfo decode(ProtoReader protoReader) throws IOException {
            C51198a aVar = new C51198a();
            aVar.f127448a = ChangeType.PARTICIPANT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f127448a = ChangeType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f127449b.add(VCParticipantAbbrInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127450c = VCTabHistoryCommonInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabMeetingChangeInfo vCTabMeetingChangeInfo) throws IOException {
            if (vCTabMeetingChangeInfo.change_type != null) {
                ChangeType.ADAPTER.encodeWithTag(protoWriter, 1, vCTabMeetingChangeInfo.change_type);
            }
            VCParticipantAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, vCTabMeetingChangeInfo.participant_changes);
            if (vCTabMeetingChangeInfo.meeting_info != null) {
                VCTabHistoryCommonInfo.ADAPTER.encodeWithTag(protoWriter, 3, vCTabMeetingChangeInfo.meeting_info);
            }
            protoWriter.writeBytes(vCTabMeetingChangeInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingChangeInfo$a */
    public static final class C51198a extends Message.Builder<VCTabMeetingChangeInfo, C51198a> {

        /* renamed from: a */
        public ChangeType f127448a;

        /* renamed from: b */
        public List<VCParticipantAbbrInfo> f127449b = Internal.newMutableList();

        /* renamed from: c */
        public VCTabHistoryCommonInfo f127450c;

        /* renamed from: a */
        public VCTabMeetingChangeInfo build() {
            return new VCTabMeetingChangeInfo(this.f127448a, this.f127449b, this.f127450c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51198a newBuilder() {
        C51198a aVar = new C51198a();
        aVar.f127448a = this.change_type;
        aVar.f127449b = Internal.copyOf("participant_changes", this.participant_changes);
        aVar.f127450c = this.meeting_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabMeetingChangeInfo");
        StringBuilder sb = new StringBuilder();
        if (this.change_type != null) {
            sb.append(", change_type=");
            sb.append(this.change_type);
        }
        if (!this.participant_changes.isEmpty()) {
            sb.append(", participant_changes=");
            sb.append(this.participant_changes);
        }
        if (this.meeting_info != null) {
            sb.append(", meeting_info=");
            sb.append(this.meeting_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabMeetingChangeInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMeetingChangeInfo(ChangeType changeType, List<VCParticipantAbbrInfo> list, VCTabHistoryCommonInfo vCTabHistoryCommonInfo) {
        this(changeType, list, vCTabHistoryCommonInfo, ByteString.EMPTY);
    }

    public VCTabMeetingChangeInfo(ChangeType changeType, List<VCParticipantAbbrInfo> list, VCTabHistoryCommonInfo vCTabHistoryCommonInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.change_type = changeType;
        this.participant_changes = Internal.immutableCopyOf("participant_changes", list);
        this.meeting_info = vCTabHistoryCommonInfo;
    }
}
