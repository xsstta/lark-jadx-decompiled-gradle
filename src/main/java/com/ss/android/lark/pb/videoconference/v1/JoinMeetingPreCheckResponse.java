package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class JoinMeetingPreCheckResponse extends Message<JoinMeetingPreCheckResponse, C50825a> {
    public static final ProtoAdapter<JoinMeetingPreCheckResponse> ADAPTER = new C50826b();
    public static final JoinMeetingCheckType DEFAULT_CHECK_TYPE = JoinMeetingCheckType.UNKNOEN;
    public static final VideoChatInfo.VendorType DEFAULT_VENDOR_TYPE = VideoChatInfo.VendorType.UNKNOWN_VENDOR_TYPE;
    private static final long serialVersionUID = 0;
    public final AssociatedVideoChatInfo associated_vc_info;
    public final JoinMeetingCheckType check_type;
    public final VideoChatInfo.VendorType vendor_type;

    public enum JoinMeetingCheckType implements WireEnum {
        UNKNOEN(0),
        SUCCESS(1),
        MEETING_ENDED(2),
        PARTICIPANT_LIMIT_EXCEED(3),
        MEETING_LOCKED(4),
        MEETING_NUMBER_INVALID(5),
        VOIP_BUSY(6),
        VERSION_LOW(7),
        DEVICE_IN_MEETING(8),
        DEVICE_RINGING(9),
        CHAT_POST_NO_PERMISSION(10),
        TENANT_IN_BLACKLIST(11),
        CALENDAR_OUT_OF_DATE(12),
        INTERVIEW_NO_PERMISSION(13),
        INTERVIEW_OUT_OF_DATE(14),
        COLLABORATION_BLOCKED(16),
        COLLABORATION_NO_RIGHTS(17),
        COLLABORATION_BE_BLOCKED(18),
        RESERVATION_OUT_OF_DATE(19);
        
        public static final ProtoAdapter<JoinMeetingCheckType> ADAPTER = ProtoAdapter.newEnumAdapter(JoinMeetingCheckType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JoinMeetingCheckType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOEN;
                case 1:
                    return SUCCESS;
                case 2:
                    return MEETING_ENDED;
                case 3:
                    return PARTICIPANT_LIMIT_EXCEED;
                case 4:
                    return MEETING_LOCKED;
                case 5:
                    return MEETING_NUMBER_INVALID;
                case 6:
                    return VOIP_BUSY;
                case 7:
                    return VERSION_LOW;
                case 8:
                    return DEVICE_IN_MEETING;
                case 9:
                    return DEVICE_RINGING;
                case 10:
                    return CHAT_POST_NO_PERMISSION;
                case 11:
                    return TENANT_IN_BLACKLIST;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CALENDAR_OUT_OF_DATE;
                case 13:
                    return INTERVIEW_NO_PERMISSION;
                case 14:
                    return INTERVIEW_OUT_OF_DATE;
                case 15:
                default:
                    return null;
                case 16:
                    return COLLABORATION_BLOCKED;
                case 17:
                    return COLLABORATION_NO_RIGHTS;
                case 18:
                    return COLLABORATION_BE_BLOCKED;
                case 19:
                    return RESERVATION_OUT_OF_DATE;
            }
        }

        private JoinMeetingCheckType(int i) {
            this.value = i;
        }
    }

    public static final class AssociatedVideoChatInfo extends Message<AssociatedVideoChatInfo, C50823a> {
        public static final ProtoAdapter<AssociatedVideoChatInfo> ADAPTER = new C50824b();
        private static final long serialVersionUID = 0;
        public final String unique_id;
        public final List<VideoChatInfo> vc_infos;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckResponse$AssociatedVideoChatInfo$b */
        private static final class C50824b extends ProtoAdapter<AssociatedVideoChatInfo> {
            C50824b() {
                super(FieldEncoding.LENGTH_DELIMITED, AssociatedVideoChatInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(AssociatedVideoChatInfo associatedVideoChatInfo) {
                int i;
                int encodedSizeWithTag = VideoChatInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, associatedVideoChatInfo.vc_infos);
                if (associatedVideoChatInfo.unique_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, associatedVideoChatInfo.unique_id);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + associatedVideoChatInfo.unknownFields().size();
            }

            /* renamed from: a */
            public AssociatedVideoChatInfo decode(ProtoReader protoReader) throws IOException {
                C50823a aVar = new C50823a();
                aVar.f126696b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126695a.add(VideoChatInfo.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126696b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AssociatedVideoChatInfo associatedVideoChatInfo) throws IOException {
                VideoChatInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, associatedVideoChatInfo.vc_infos);
                if (associatedVideoChatInfo.unique_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, associatedVideoChatInfo.unique_id);
                }
                protoWriter.writeBytes(associatedVideoChatInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckResponse$AssociatedVideoChatInfo$a */
        public static final class C50823a extends Message.Builder<AssociatedVideoChatInfo, C50823a> {

            /* renamed from: a */
            public List<VideoChatInfo> f126695a = Internal.newMutableList();

            /* renamed from: b */
            public String f126696b;

            /* renamed from: a */
            public AssociatedVideoChatInfo build() {
                return new AssociatedVideoChatInfo(this.f126695a, this.f126696b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50823a newBuilder() {
            C50823a aVar = new C50823a();
            aVar.f126695a = Internal.copyOf("vc_infos", this.vc_infos);
            aVar.f126696b = this.unique_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "AssociatedVideoChatInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.vc_infos.isEmpty()) {
                sb.append(", vc_infos=");
                sb.append(this.vc_infos);
            }
            if (this.unique_id != null) {
                sb.append(", unique_id=");
                sb.append(this.unique_id);
            }
            StringBuilder replace = sb.replace(0, 2, "AssociatedVideoChatInfo{");
            replace.append('}');
            return replace.toString();
        }

        public AssociatedVideoChatInfo(List<VideoChatInfo> list, String str) {
            this(list, str, ByteString.EMPTY);
        }

        public AssociatedVideoChatInfo(List<VideoChatInfo> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.vc_infos = Internal.immutableCopyOf("vc_infos", list);
            this.unique_id = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckResponse$b */
    private static final class C50826b extends ProtoAdapter<JoinMeetingPreCheckResponse> {
        C50826b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinMeetingPreCheckResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinMeetingPreCheckResponse joinMeetingPreCheckResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (joinMeetingPreCheckResponse.check_type != null) {
                i = JoinMeetingCheckType.ADAPTER.encodedSizeWithTag(1, joinMeetingPreCheckResponse.check_type);
            } else {
                i = 0;
            }
            if (joinMeetingPreCheckResponse.associated_vc_info != null) {
                i2 = AssociatedVideoChatInfo.ADAPTER.encodedSizeWithTag(2, joinMeetingPreCheckResponse.associated_vc_info);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (joinMeetingPreCheckResponse.vendor_type != null) {
                i3 = VideoChatInfo.VendorType.ADAPTER.encodedSizeWithTag(3, joinMeetingPreCheckResponse.vendor_type);
            }
            return i4 + i3 + joinMeetingPreCheckResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JoinMeetingPreCheckResponse decode(ProtoReader protoReader) throws IOException {
            C50825a aVar = new C50825a();
            aVar.f126697a = JoinMeetingCheckType.UNKNOEN;
            aVar.f126699c = VideoChatInfo.VendorType.UNKNOWN_VENDOR_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126697a = JoinMeetingCheckType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126698b = AssociatedVideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126699c = VideoChatInfo.VendorType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinMeetingPreCheckResponse joinMeetingPreCheckResponse) throws IOException {
            if (joinMeetingPreCheckResponse.check_type != null) {
                JoinMeetingCheckType.ADAPTER.encodeWithTag(protoWriter, 1, joinMeetingPreCheckResponse.check_type);
            }
            if (joinMeetingPreCheckResponse.associated_vc_info != null) {
                AssociatedVideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 2, joinMeetingPreCheckResponse.associated_vc_info);
            }
            if (joinMeetingPreCheckResponse.vendor_type != null) {
                VideoChatInfo.VendorType.ADAPTER.encodeWithTag(protoWriter, 3, joinMeetingPreCheckResponse.vendor_type);
            }
            protoWriter.writeBytes(joinMeetingPreCheckResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingPreCheckResponse$a */
    public static final class C50825a extends Message.Builder<JoinMeetingPreCheckResponse, C50825a> {

        /* renamed from: a */
        public JoinMeetingCheckType f126697a;

        /* renamed from: b */
        public AssociatedVideoChatInfo f126698b;

        /* renamed from: c */
        public VideoChatInfo.VendorType f126699c;

        /* renamed from: a */
        public JoinMeetingPreCheckResponse build() {
            return new JoinMeetingPreCheckResponse(this.f126697a, this.f126698b, this.f126699c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50825a newBuilder() {
        C50825a aVar = new C50825a();
        aVar.f126697a = this.check_type;
        aVar.f126698b = this.associated_vc_info;
        aVar.f126699c = this.vendor_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinMeetingPreCheckResponse");
        StringBuilder sb = new StringBuilder();
        if (this.check_type != null) {
            sb.append(", check_type=");
            sb.append(this.check_type);
        }
        if (this.associated_vc_info != null) {
            sb.append(", associated_vc_info=");
            sb.append(this.associated_vc_info);
        }
        if (this.vendor_type != null) {
            sb.append(", vendor_type=");
            sb.append(this.vendor_type);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinMeetingPreCheckResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JoinMeetingPreCheckResponse(JoinMeetingCheckType joinMeetingCheckType, AssociatedVideoChatInfo associatedVideoChatInfo, VideoChatInfo.VendorType vendorType) {
        this(joinMeetingCheckType, associatedVideoChatInfo, vendorType, ByteString.EMPTY);
    }

    public JoinMeetingPreCheckResponse(JoinMeetingCheckType joinMeetingCheckType, AssociatedVideoChatInfo associatedVideoChatInfo, VideoChatInfo.VendorType vendorType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.check_type = joinMeetingCheckType;
        this.associated_vc_info = associatedVideoChatInfo;
        this.vendor_type = vendorType;
    }
}
