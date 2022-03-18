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

public final class VCTabMeetingBaseInfo extends Message<VCTabMeetingBaseInfo, C51196a> {
    public static final ProtoAdapter<VCTabMeetingBaseInfo> ADAPTER = new C51197b();
    public static final Integer DEFAULT_DOWN_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Integer down_version;
    public final VCTabHistoryCommonInfo meeting_info;
    public final List<VCParticipantAbbrInfo> participants;
    public final ByteviewUser sponsor_user;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingBaseInfo$b */
    private static final class C51197b extends ProtoAdapter<VCTabMeetingBaseInfo> {
        C51197b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMeetingBaseInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMeetingBaseInfo vCTabMeetingBaseInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (vCTabMeetingBaseInfo.meeting_info != null) {
                i = VCTabHistoryCommonInfo.ADAPTER.encodedSizeWithTag(1, vCTabMeetingBaseInfo.meeting_info);
            } else {
                i = 0;
            }
            if (vCTabMeetingBaseInfo.sponsor_user != null) {
                i2 = ByteviewUser.ADAPTER.encodedSizeWithTag(2, vCTabMeetingBaseInfo.sponsor_user);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + VCParticipantAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, vCTabMeetingBaseInfo.participants);
            if (vCTabMeetingBaseInfo.down_version != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, vCTabMeetingBaseInfo.down_version);
            }
            return encodedSizeWithTag + i3 + vCTabMeetingBaseInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMeetingBaseInfo decode(ProtoReader protoReader) throws IOException {
            C51196a aVar = new C51196a();
            aVar.f127447d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127444a = VCTabHistoryCommonInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127445b = ByteviewUser.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127446c.add(VCParticipantAbbrInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127447d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabMeetingBaseInfo vCTabMeetingBaseInfo) throws IOException {
            if (vCTabMeetingBaseInfo.meeting_info != null) {
                VCTabHistoryCommonInfo.ADAPTER.encodeWithTag(protoWriter, 1, vCTabMeetingBaseInfo.meeting_info);
            }
            if (vCTabMeetingBaseInfo.sponsor_user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, vCTabMeetingBaseInfo.sponsor_user);
            }
            VCParticipantAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, vCTabMeetingBaseInfo.participants);
            if (vCTabMeetingBaseInfo.down_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, vCTabMeetingBaseInfo.down_version);
            }
            protoWriter.writeBytes(vCTabMeetingBaseInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingBaseInfo$a */
    public static final class C51196a extends Message.Builder<VCTabMeetingBaseInfo, C51196a> {

        /* renamed from: a */
        public VCTabHistoryCommonInfo f127444a;

        /* renamed from: b */
        public ByteviewUser f127445b;

        /* renamed from: c */
        public List<VCParticipantAbbrInfo> f127446c = Internal.newMutableList();

        /* renamed from: d */
        public Integer f127447d;

        /* renamed from: a */
        public VCTabMeetingBaseInfo build() {
            return new VCTabMeetingBaseInfo(this.f127444a, this.f127445b, this.f127446c, this.f127447d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51196a newBuilder() {
        C51196a aVar = new C51196a();
        aVar.f127444a = this.meeting_info;
        aVar.f127445b = this.sponsor_user;
        aVar.f127446c = Internal.copyOf("participants", this.participants);
        aVar.f127447d = this.down_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabMeetingBaseInfo");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_info != null) {
            sb.append(", meeting_info=");
            sb.append(this.meeting_info);
        }
        if (this.sponsor_user != null) {
            sb.append(", sponsor_user=");
            sb.append(this.sponsor_user);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.down_version != null) {
            sb.append(", down_version=");
            sb.append(this.down_version);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabMeetingBaseInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMeetingBaseInfo(VCTabHistoryCommonInfo vCTabHistoryCommonInfo, ByteviewUser byteviewUser, List<VCParticipantAbbrInfo> list, Integer num) {
        this(vCTabHistoryCommonInfo, byteviewUser, list, num, ByteString.EMPTY);
    }

    public VCTabMeetingBaseInfo(VCTabHistoryCommonInfo vCTabHistoryCommonInfo, ByteviewUser byteviewUser, List<VCParticipantAbbrInfo> list, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_info = vCTabHistoryCommonInfo;
        this.sponsor_user = byteviewUser;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.down_version = num;
    }
}
