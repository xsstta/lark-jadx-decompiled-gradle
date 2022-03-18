package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VCTabMeetingAbbrInfo extends Message<VCTabMeetingAbbrInfo, C51194a> {
    public static final ProtoAdapter<VCTabMeetingAbbrInfo> ADAPTER = new C51195b();
    private static final long serialVersionUID = 0;
    public final VCTabMeetingBaseInfo meeting_base_info;
    public final String meeting_id;
    public final VCTabMeetingUserSpecInfo user_spec_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingAbbrInfo$b */
    private static final class C51195b extends ProtoAdapter<VCTabMeetingAbbrInfo> {
        C51195b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCTabMeetingAbbrInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCTabMeetingAbbrInfo vCTabMeetingAbbrInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (vCTabMeetingAbbrInfo.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCTabMeetingAbbrInfo.meeting_id);
            } else {
                i = 0;
            }
            if (vCTabMeetingAbbrInfo.meeting_base_info != null) {
                i2 = VCTabMeetingBaseInfo.ADAPTER.encodedSizeWithTag(2, vCTabMeetingAbbrInfo.meeting_base_info);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (vCTabMeetingAbbrInfo.user_spec_info != null) {
                i3 = VCTabMeetingUserSpecInfo.ADAPTER.encodedSizeWithTag(3, vCTabMeetingAbbrInfo.user_spec_info);
            }
            return i4 + i3 + vCTabMeetingAbbrInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCTabMeetingAbbrInfo decode(ProtoReader protoReader) throws IOException {
            C51194a aVar = new C51194a();
            aVar.f127441a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127441a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127442b = VCTabMeetingBaseInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127443c = VCTabMeetingUserSpecInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCTabMeetingAbbrInfo vCTabMeetingAbbrInfo) throws IOException {
            if (vCTabMeetingAbbrInfo.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCTabMeetingAbbrInfo.meeting_id);
            }
            if (vCTabMeetingAbbrInfo.meeting_base_info != null) {
                VCTabMeetingBaseInfo.ADAPTER.encodeWithTag(protoWriter, 2, vCTabMeetingAbbrInfo.meeting_base_info);
            }
            if (vCTabMeetingAbbrInfo.user_spec_info != null) {
                VCTabMeetingUserSpecInfo.ADAPTER.encodeWithTag(protoWriter, 3, vCTabMeetingAbbrInfo.user_spec_info);
            }
            protoWriter.writeBytes(vCTabMeetingAbbrInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCTabMeetingAbbrInfo$a */
    public static final class C51194a extends Message.Builder<VCTabMeetingAbbrInfo, C51194a> {

        /* renamed from: a */
        public String f127441a;

        /* renamed from: b */
        public VCTabMeetingBaseInfo f127442b;

        /* renamed from: c */
        public VCTabMeetingUserSpecInfo f127443c;

        /* renamed from: a */
        public VCTabMeetingAbbrInfo build() {
            return new VCTabMeetingAbbrInfo(this.f127441a, this.f127442b, this.f127443c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51194a newBuilder() {
        C51194a aVar = new C51194a();
        aVar.f127441a = this.meeting_id;
        aVar.f127442b = this.meeting_base_info;
        aVar.f127443c = this.user_spec_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCTabMeetingAbbrInfo");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.meeting_base_info != null) {
            sb.append(", meeting_base_info=");
            sb.append(this.meeting_base_info);
        }
        if (this.user_spec_info != null) {
            sb.append(", user_spec_info=");
            sb.append(this.user_spec_info);
        }
        StringBuilder replace = sb.replace(0, 2, "VCTabMeetingAbbrInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCTabMeetingAbbrInfo(String str, VCTabMeetingBaseInfo vCTabMeetingBaseInfo, VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo) {
        this(str, vCTabMeetingBaseInfo, vCTabMeetingUserSpecInfo, ByteString.EMPTY);
    }

    public VCTabMeetingAbbrInfo(String str, VCTabMeetingBaseInfo vCTabMeetingBaseInfo, VCTabMeetingUserSpecInfo vCTabMeetingUserSpecInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.meeting_base_info = vCTabMeetingBaseInfo;
        this.user_spec_info = vCTabMeetingUserSpecInfo;
    }
}
