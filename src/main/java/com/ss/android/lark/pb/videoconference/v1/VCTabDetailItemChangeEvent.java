package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VCTabDetailItemChangeEvent extends Message<VCTabDetailItemChangeEvent, C51184a> {
    public static final ProtoAdapter<VCTabDetailItemChangeEvent> ADAPTER = new C51185b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<FollowAbbrInfo> follow_info;
    public final HistoryInfo history_info;
    public final String meeting_id;
    public final VCTabDetailRecordInfo record_info;
    public final List<HistoryInfo> replace_all_history;
    public final VCTabStatisticsInfo statistics_info;
    public final Integer version;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabDetailItemChangeEvent$b */
    private static final class C51185b extends ProtoAdapter<VCTabDetailItemChangeEvent> {
        C51185b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabDetailItemChangeEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabDetailItemChangeEvent vCTabDetailItemChangeEvent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (vCTabDetailItemChangeEvent.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCTabDetailItemChangeEvent.meeting_id);
            } else {
                i = 0;
            }
            if (vCTabDetailItemChangeEvent.record_info != null) {
                i2 = VCTabDetailRecordInfo.ADAPTER.encodedSizeWithTag(2, vCTabDetailItemChangeEvent.record_info);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (vCTabDetailItemChangeEvent.history_info != null) {
                i3 = HistoryInfo.ADAPTER.encodedSizeWithTag(3, vCTabDetailItemChangeEvent.history_info);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i6 + i3 + HistoryInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, vCTabDetailItemChangeEvent.replace_all_history);
            if (vCTabDetailItemChangeEvent.version != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(5, vCTabDetailItemChangeEvent.version);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i4 + FollowAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, vCTabDetailItemChangeEvent.follow_info);
            if (vCTabDetailItemChangeEvent.statistics_info != null) {
                i5 = VCTabStatisticsInfo.ADAPTER.encodedSizeWithTag(7, vCTabDetailItemChangeEvent.statistics_info);
            }
            return encodedSizeWithTag2 + i5 + vCTabDetailItemChangeEvent.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabDetailItemChangeEvent decode(ProtoReader protoReader) throws IOException {
            C51184a aVar = new C51184a();
            aVar.f127392a = "";
            aVar.f127396e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127392a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127393b = VCTabDetailRecordInfo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127394c = HistoryInfo.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127395d.add(HistoryInfo.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127396e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127397f.add(FollowAbbrInfo.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f127398g = VCTabStatisticsInfo.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabDetailItemChangeEvent vCTabDetailItemChangeEvent) throws IOException {
            if (vCTabDetailItemChangeEvent.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCTabDetailItemChangeEvent.meeting_id);
            }
            if (vCTabDetailItemChangeEvent.record_info != null) {
                VCTabDetailRecordInfo.ADAPTER.encodeWithTag(protoWriter, 2, vCTabDetailItemChangeEvent.record_info);
            }
            if (vCTabDetailItemChangeEvent.history_info != null) {
                HistoryInfo.ADAPTER.encodeWithTag(protoWriter, 3, vCTabDetailItemChangeEvent.history_info);
            }
            HistoryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, vCTabDetailItemChangeEvent.replace_all_history);
            if (vCTabDetailItemChangeEvent.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, vCTabDetailItemChangeEvent.version);
            }
            FollowAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, vCTabDetailItemChangeEvent.follow_info);
            if (vCTabDetailItemChangeEvent.statistics_info != null) {
                VCTabStatisticsInfo.ADAPTER.encodeWithTag(protoWriter, 7, vCTabDetailItemChangeEvent.statistics_info);
            }
            protoWriter.writeBytes(vCTabDetailItemChangeEvent.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabDetailItemChangeEvent$a */
    public static final class C51184a extends Message.Builder<VCTabDetailItemChangeEvent, C51184a> {

        /* renamed from: a */
        public String f127392a;

        /* renamed from: b */
        public VCTabDetailRecordInfo f127393b;

        /* renamed from: c */
        public HistoryInfo f127394c;

        /* renamed from: d */
        public List<HistoryInfo> f127395d = Internal.newMutableList();

        /* renamed from: e */
        public Integer f127396e;

        /* renamed from: f */
        public List<FollowAbbrInfo> f127397f = Internal.newMutableList();

        /* renamed from: g */
        public VCTabStatisticsInfo f127398g;

        /* renamed from: a */
        public VCTabDetailItemChangeEvent build() {
            return new VCTabDetailItemChangeEvent(this.f127392a, this.f127393b, this.f127394c, this.f127395d, this.f127396e, this.f127397f, this.f127398g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51184a newBuilder() {
        C51184a aVar = new C51184a();
        aVar.f127392a = this.meeting_id;
        aVar.f127393b = this.record_info;
        aVar.f127394c = this.history_info;
        aVar.f127395d = Internal.copyOf("replace_all_history", this.replace_all_history);
        aVar.f127396e = this.version;
        aVar.f127397f = Internal.copyOf("follow_info", this.follow_info);
        aVar.f127398g = this.statistics_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabDetailItemChangeEvent");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.record_info != null) {
            sb.append(", record_info=");
            sb.append(this.record_info);
        }
        if (this.history_info != null) {
            sb.append(", history_info=");
            sb.append(this.history_info);
        }
        if (!this.replace_all_history.isEmpty()) {
            sb.append(", replace_all_history=");
            sb.append(this.replace_all_history);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (!this.follow_info.isEmpty()) {
            sb.append(", follow_info=");
            sb.append(this.follow_info);
        }
        if (this.statistics_info != null) {
            sb.append(", statistics_info=");
            sb.append(this.statistics_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabDetailItemChangeEvent{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabDetailItemChangeEvent(String str, VCTabDetailRecordInfo vCTabDetailRecordInfo, HistoryInfo historyInfo, List<HistoryInfo> list, Integer num, List<FollowAbbrInfo> list2, VCTabStatisticsInfo vCTabStatisticsInfo) {
        this(str, vCTabDetailRecordInfo, historyInfo, list, num, list2, vCTabStatisticsInfo, ByteString.EMPTY);
    }

    public VCTabDetailItemChangeEvent(String str, VCTabDetailRecordInfo vCTabDetailRecordInfo, HistoryInfo historyInfo, List<HistoryInfo> list, Integer num, List<FollowAbbrInfo> list2, VCTabStatisticsInfo vCTabStatisticsInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.record_info = vCTabDetailRecordInfo;
        this.history_info = historyInfo;
        this.replace_all_history = Internal.immutableCopyOf("replace_all_history", list);
        this.version = num;
        this.follow_info = Internal.immutableCopyOf("follow_info", list2);
        this.statistics_info = vCTabStatisticsInfo;
    }
}
