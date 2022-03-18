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

public final class VCTabUserGrootCellPayload extends Message<VCTabUserGrootCellPayload, C51208a> {
    public static final ProtoAdapter<VCTabUserGrootCellPayload> ADAPTER = new C51209b();
    public static final ChangeType DEFAULT_CHANGE_TYPE = ChangeType.MISSED_CALL;
    private static final long serialVersionUID = 0;
    public final ChangeType change_type;
    public final List<VCTabDetailItemChangeEvent> detail_page_events;
    public final VCTabTotalMissedCallInfo missed_call_info;
    public final VCTabStatisticsInfo statistics_info;

    public enum ChangeType implements WireEnum {
        MISSED_CALL(0),
        DETAIL_PAGE(1),
        STATISTICS(2);
        
        public static final ProtoAdapter<ChangeType> ADAPTER = ProtoAdapter.newEnumAdapter(ChangeType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ChangeType fromValue(int i) {
            if (i == 0) {
                return MISSED_CALL;
            }
            if (i == 1) {
                return DETAIL_PAGE;
            }
            if (i != 2) {
                return null;
            }
            return STATISTICS;
        }

        private ChangeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabUserGrootCellPayload$b */
    private static final class C51209b extends ProtoAdapter<VCTabUserGrootCellPayload> {
        C51209b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabUserGrootCellPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabUserGrootCellPayload vCTabUserGrootCellPayload) {
            int i;
            int i2;
            int encodedSizeWithTag = VCTabDetailItemChangeEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, vCTabUserGrootCellPayload.detail_page_events);
            int i3 = 0;
            if (vCTabUserGrootCellPayload.missed_call_info != null) {
                i = VCTabTotalMissedCallInfo.ADAPTER.encodedSizeWithTag(2, vCTabUserGrootCellPayload.missed_call_info);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (vCTabUserGrootCellPayload.change_type != null) {
                i2 = ChangeType.ADAPTER.encodedSizeWithTag(3, vCTabUserGrootCellPayload.change_type);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (vCTabUserGrootCellPayload.statistics_info != null) {
                i3 = VCTabStatisticsInfo.ADAPTER.encodedSizeWithTag(4, vCTabUserGrootCellPayload.statistics_info);
            }
            return i5 + i3 + vCTabUserGrootCellPayload.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabUserGrootCellPayload decode(ProtoReader protoReader) throws IOException {
            C51208a aVar = new C51208a();
            aVar.f127468c = ChangeType.MISSED_CALL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127466a.add(VCTabDetailItemChangeEvent.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f127467b = VCTabTotalMissedCallInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f127468c = ChangeType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127469d = VCTabStatisticsInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabUserGrootCellPayload vCTabUserGrootCellPayload) throws IOException {
            VCTabDetailItemChangeEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vCTabUserGrootCellPayload.detail_page_events);
            if (vCTabUserGrootCellPayload.missed_call_info != null) {
                VCTabTotalMissedCallInfo.ADAPTER.encodeWithTag(protoWriter, 2, vCTabUserGrootCellPayload.missed_call_info);
            }
            if (vCTabUserGrootCellPayload.change_type != null) {
                ChangeType.ADAPTER.encodeWithTag(protoWriter, 3, vCTabUserGrootCellPayload.change_type);
            }
            if (vCTabUserGrootCellPayload.statistics_info != null) {
                VCTabStatisticsInfo.ADAPTER.encodeWithTag(protoWriter, 4, vCTabUserGrootCellPayload.statistics_info);
            }
            protoWriter.writeBytes(vCTabUserGrootCellPayload.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabUserGrootCellPayload$a */
    public static final class C51208a extends Message.Builder<VCTabUserGrootCellPayload, C51208a> {

        /* renamed from: a */
        public List<VCTabDetailItemChangeEvent> f127466a = Internal.newMutableList();

        /* renamed from: b */
        public VCTabTotalMissedCallInfo f127467b;

        /* renamed from: c */
        public ChangeType f127468c;

        /* renamed from: d */
        public VCTabStatisticsInfo f127469d;

        /* renamed from: a */
        public VCTabUserGrootCellPayload build() {
            return new VCTabUserGrootCellPayload(this.f127466a, this.f127467b, this.f127468c, this.f127469d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51208a newBuilder() {
        C51208a aVar = new C51208a();
        aVar.f127466a = Internal.copyOf("detail_page_events", this.detail_page_events);
        aVar.f127467b = this.missed_call_info;
        aVar.f127468c = this.change_type;
        aVar.f127469d = this.statistics_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabUserGrootCellPayload");
        StringBuilder sb = new StringBuilder();
        if (!this.detail_page_events.isEmpty()) {
            sb.append(", detail_page_events=");
            sb.append(this.detail_page_events);
        }
        if (this.missed_call_info != null) {
            sb.append(", missed_call_info=");
            sb.append(this.missed_call_info);
        }
        if (this.change_type != null) {
            sb.append(", change_type=");
            sb.append(this.change_type);
        }
        if (this.statistics_info != null) {
            sb.append(", statistics_info=");
            sb.append(this.statistics_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabUserGrootCellPayload{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabUserGrootCellPayload(List<VCTabDetailItemChangeEvent> list, VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo, ChangeType changeType, VCTabStatisticsInfo vCTabStatisticsInfo) {
        this(list, vCTabTotalMissedCallInfo, changeType, vCTabStatisticsInfo, ByteString.EMPTY);
    }

    public VCTabUserGrootCellPayload(List<VCTabDetailItemChangeEvent> list, VCTabTotalMissedCallInfo vCTabTotalMissedCallInfo, ChangeType changeType, VCTabStatisticsInfo vCTabStatisticsInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.detail_page_events = Internal.immutableCopyOf("detail_page_events", list);
        this.missed_call_info = vCTabTotalMissedCallInfo;
        this.change_type = changeType;
        this.statistics_info = vCTabStatisticsInfo;
    }
}
