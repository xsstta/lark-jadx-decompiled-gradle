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

public final class VCTabMeetingUserSpecInfo extends Message<VCTabMeetingUserSpecInfo, C51202a> {
    public static final ProtoAdapter<VCTabMeetingUserSpecInfo> ADAPTER = new C51203b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final List<FollowAbbrInfo> follow_info;
    public final List<HistoryInfo> history_info;
    public final String manage_url_param;
    public final VCTabDetailRecordInfo record_info;
    public final MeetingSourceAppLinkInfo source_applink;
    public final VCTabStatisticsInfo statistics_info;
    public final Integer version;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingUserSpecInfo$b */
    private static final class C51203b extends ProtoAdapter<VCTabMeetingUserSpecInfo> {
        C51203b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMeetingUserSpecInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = HistoryInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, vCTabMeetingUserSpecInfo.history_info);
            int i5 = 0;
            if (vCTabMeetingUserSpecInfo.record_info != null) {
                i = VCTabDetailRecordInfo.ADAPTER.encodedSizeWithTag(2, vCTabMeetingUserSpecInfo.record_info);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (vCTabMeetingUserSpecInfo.version != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, vCTabMeetingUserSpecInfo.version);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i6 + i2 + FollowAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, vCTabMeetingUserSpecInfo.follow_info);
            if (vCTabMeetingUserSpecInfo.statistics_info != null) {
                i3 = VCTabStatisticsInfo.ADAPTER.encodedSizeWithTag(5, vCTabMeetingUserSpecInfo.statistics_info);
            } else {
                i3 = 0;
            }
            int i7 = encodedSizeWithTag2 + i3;
            if (vCTabMeetingUserSpecInfo.source_applink != null) {
                i4 = MeetingSourceAppLinkInfo.ADAPTER.encodedSizeWithTag(6, vCTabMeetingUserSpecInfo.source_applink);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (vCTabMeetingUserSpecInfo.manage_url_param != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, vCTabMeetingUserSpecInfo.manage_url_param);
            }
            return i8 + i5 + vCTabMeetingUserSpecInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMeetingUserSpecInfo decode(ProtoReader protoReader) throws IOException {
            C51202a aVar = new C51202a();
            aVar.f127454c = 0;
            aVar.f127458g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127452a.add(HistoryInfo.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f127453b = VCTabDetailRecordInfo.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127454c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127455d.add(FollowAbbrInfo.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127456e = VCTabStatisticsInfo.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127457f = MeetingSourceAppLinkInfo.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127458g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo) throws IOException {
            HistoryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, vCTabMeetingUserSpecInfo.history_info);
            if (vCTabMeetingUserSpecInfo.record_info != null) {
                VCTabDetailRecordInfo.ADAPTER.encodeWithTag(protoWriter, 2, vCTabMeetingUserSpecInfo.record_info);
            }
            if (vCTabMeetingUserSpecInfo.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, vCTabMeetingUserSpecInfo.version);
            }
            FollowAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, vCTabMeetingUserSpecInfo.follow_info);
            if (vCTabMeetingUserSpecInfo.statistics_info != null) {
                VCTabStatisticsInfo.ADAPTER.encodeWithTag(protoWriter, 5, vCTabMeetingUserSpecInfo.statistics_info);
            }
            if (vCTabMeetingUserSpecInfo.source_applink != null) {
                MeetingSourceAppLinkInfo.ADAPTER.encodeWithTag(protoWriter, 6, vCTabMeetingUserSpecInfo.source_applink);
            }
            if (vCTabMeetingUserSpecInfo.manage_url_param != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, vCTabMeetingUserSpecInfo.manage_url_param);
            }
            protoWriter.writeBytes(vCTabMeetingUserSpecInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingUserSpecInfo$a */
    public static final class C51202a extends Message.Builder<VCTabMeetingUserSpecInfo, C51202a> {

        /* renamed from: a */
        public List<HistoryInfo> f127452a = Internal.newMutableList();

        /* renamed from: b */
        public VCTabDetailRecordInfo f127453b;

        /* renamed from: c */
        public Integer f127454c;

        /* renamed from: d */
        public List<FollowAbbrInfo> f127455d = Internal.newMutableList();

        /* renamed from: e */
        public VCTabStatisticsInfo f127456e;

        /* renamed from: f */
        public MeetingSourceAppLinkInfo f127457f;

        /* renamed from: g */
        public String f127458g;

        /* renamed from: a */
        public VCTabMeetingUserSpecInfo build() {
            return new VCTabMeetingUserSpecInfo(this.f127452a, this.f127453b, this.f127454c, this.f127455d, this.f127456e, this.f127457f, this.f127458g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51202a newBuilder() {
        C51202a aVar = new C51202a();
        aVar.f127452a = Internal.copyOf("history_info", this.history_info);
        aVar.f127453b = this.record_info;
        aVar.f127454c = this.version;
        aVar.f127455d = Internal.copyOf("follow_info", this.follow_info);
        aVar.f127456e = this.statistics_info;
        aVar.f127457f = this.source_applink;
        aVar.f127458g = this.manage_url_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabMeetingUserSpecInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.history_info.isEmpty()) {
            sb.append(", history_info=");
            sb.append(this.history_info);
        }
        if (this.record_info != null) {
            sb.append(", record_info=");
            sb.append(this.record_info);
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
        if (this.source_applink != null) {
            sb.append(", source_applink=");
            sb.append(this.source_applink);
        }
        if (this.manage_url_param != null) {
            sb.append(", manage_url_param=");
            sb.append(this.manage_url_param);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabMeetingUserSpecInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMeetingUserSpecInfo(List<HistoryInfo> list, VCTabDetailRecordInfo vCTabDetailRecordInfo, Integer num, List<FollowAbbrInfo> list2, VCTabStatisticsInfo vCTabStatisticsInfo, MeetingSourceAppLinkInfo meetingSourceAppLinkInfo, String str) {
        this(list, vCTabDetailRecordInfo, num, list2, vCTabStatisticsInfo, meetingSourceAppLinkInfo, str, ByteString.EMPTY);
    }

    public VCTabMeetingUserSpecInfo(List<HistoryInfo> list, VCTabDetailRecordInfo vCTabDetailRecordInfo, Integer num, List<FollowAbbrInfo> list2, VCTabStatisticsInfo vCTabStatisticsInfo, MeetingSourceAppLinkInfo meetingSourceAppLinkInfo, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_info = Internal.immutableCopyOf("history_info", list);
        this.record_info = vCTabDetailRecordInfo;
        this.version = num;
        this.follow_info = Internal.immutableCopyOf("follow_info", list2);
        this.statistics_info = vCTabStatisticsInfo;
        this.source_applink = meetingSourceAppLinkInfo;
        this.manage_url_param = str;
    }
}
