package com.ss.android.lark.pb.videochat;

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

public final class GetReservationResponse extends Message<GetReservationResponse, C50344a> {
    public static final ProtoAdapter<GetReservationResponse> ADAPTER = new C50345b();
    private static final long serialVersionUID = 0;
    public final String mid;
    public final String mmeeting_no;
    public final MeetingPreConfig mmeeting_pre_config;
    public final String mreserver;
    public final ReserverType mreserver_type;
    public final String murl;

    public enum ReserverType implements WireEnum {
        RESERVER_TYPE_UNKNOWN(0),
        RESERVER_TYPE_LARK_USER(1),
        RESERVER_TYPE_APP(2);
        
        public static final ProtoAdapter<ReserverType> ADAPTER = ProtoAdapter.newEnumAdapter(ReserverType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ReserverType fromValue(int i) {
            if (i == 0) {
                return RESERVER_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return RESERVER_TYPE_LARK_USER;
            }
            if (i != 2) {
                return null;
            }
            return RESERVER_TYPE_APP;
        }

        private ReserverType(int i) {
            this.value = i;
        }
    }

    public static final class User extends Message<User, C50342a> {
        public static final ProtoAdapter<User> ADAPTER = new C50343b();
        private static final long serialVersionUID = 0;
        public final PstnSipUserInfo mpstn_sip_user_info;
        public final String muser_id;
        public final ParticipantType muser_type;

        public static final class Avatar extends Message<Avatar, C50338a> {
            public static final ProtoAdapter<Avatar> ADAPTER = new C50339b();
            private static final long serialVersionUID = 0;
            public final String mFsUnit;
            public final String mkey;

            /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$User$Avatar$b */
            private static final class C50339b extends ProtoAdapter<Avatar> {
                C50339b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Avatar.class);
                }

                /* renamed from: a */
                public int encodedSize(Avatar avatar) {
                    int i;
                    int i2 = 0;
                    if (avatar.mkey != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, avatar.mkey);
                    } else {
                        i = 0;
                    }
                    if (avatar.mFsUnit != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, avatar.mFsUnit);
                    }
                    return i + i2 + avatar.unknownFields().size();
                }

                /* renamed from: a */
                public Avatar decode(ProtoReader protoReader) throws IOException {
                    C50338a aVar = new C50338a();
                    aVar.f125717a = "";
                    aVar.f125718b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f125717a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f125718b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Avatar avatar) throws IOException {
                    if (avatar.mkey != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, avatar.mkey);
                    }
                    if (avatar.mFsUnit != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, avatar.mFsUnit);
                    }
                    protoWriter.writeBytes(avatar.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$User$Avatar$a */
            public static final class C50338a extends Message.Builder<Avatar, C50338a> {

                /* renamed from: a */
                public String f125717a;

                /* renamed from: b */
                public String f125718b;

                /* renamed from: a */
                public Avatar build() {
                    return new Avatar(this.f125717a, this.f125718b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50338a newBuilder() {
                C50338a aVar = new C50338a();
                aVar.f125717a = this.mkey;
                aVar.f125718b = this.mFsUnit;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.mkey != null) {
                    sb.append(", key=");
                    sb.append(this.mkey);
                }
                if (this.mFsUnit != null) {
                    sb.append(", FsUnit=");
                    sb.append(this.mFsUnit);
                }
                StringBuilder replace = sb.replace(0, 2, "Avatar{");
                replace.append('}');
                return replace.toString();
            }

            public Avatar(String str, String str2) {
                this(str, str2, ByteString.EMPTY);
            }

            public Avatar(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.mkey = str;
                this.mFsUnit = str2;
            }
        }

        public static final class PstnSipUserInfo extends Message<PstnSipUserInfo, C50340a> {
            public static final ProtoAdapter<PstnSipUserInfo> ADAPTER = new C50341b();
            private static final long serialVersionUID = 0;
            public final Avatar mavatar;
            public final String mmain_address;
            public final String mnickname;
            public final String msub_address;

            /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$User$PstnSipUserInfo$b */
            private static final class C50341b extends ProtoAdapter<PstnSipUserInfo> {
                C50341b() {
                    super(FieldEncoding.LENGTH_DELIMITED, PstnSipUserInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(PstnSipUserInfo pstnSipUserInfo) {
                    int i;
                    int i2;
                    int i3;
                    int i4 = 0;
                    if (pstnSipUserInfo.mnickname != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(1, pstnSipUserInfo.mnickname);
                    } else {
                        i = 0;
                    }
                    if (pstnSipUserInfo.mmain_address != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pstnSipUserInfo.mmain_address);
                    } else {
                        i2 = 0;
                    }
                    int i5 = i + i2;
                    if (pstnSipUserInfo.msub_address != null) {
                        i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pstnSipUserInfo.msub_address);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5 + i3;
                    if (pstnSipUserInfo.mavatar != null) {
                        i4 = Avatar.ADAPTER.encodedSizeWithTag(4, pstnSipUserInfo.mavatar);
                    }
                    return i6 + i4 + pstnSipUserInfo.unknownFields().size();
                }

                /* renamed from: a */
                public PstnSipUserInfo decode(ProtoReader protoReader) throws IOException {
                    C50340a aVar = new C50340a();
                    aVar.f125719a = "";
                    aVar.f125720b = "";
                    aVar.f125721c = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f125719a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f125720b = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 3) {
                            aVar.f125721c = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f125722d = Avatar.ADAPTER.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, PstnSipUserInfo pstnSipUserInfo) throws IOException {
                    if (pstnSipUserInfo.mnickname != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pstnSipUserInfo.mnickname);
                    }
                    if (pstnSipUserInfo.mmain_address != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pstnSipUserInfo.mmain_address);
                    }
                    if (pstnSipUserInfo.msub_address != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pstnSipUserInfo.msub_address);
                    }
                    if (pstnSipUserInfo.mavatar != null) {
                        Avatar.ADAPTER.encodeWithTag(protoWriter, 4, pstnSipUserInfo.mavatar);
                    }
                    protoWriter.writeBytes(pstnSipUserInfo.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$User$PstnSipUserInfo$a */
            public static final class C50340a extends Message.Builder<PstnSipUserInfo, C50340a> {

                /* renamed from: a */
                public String f125719a;

                /* renamed from: b */
                public String f125720b;

                /* renamed from: c */
                public String f125721c;

                /* renamed from: d */
                public Avatar f125722d;

                /* renamed from: a */
                public PstnSipUserInfo build() {
                    return new PstnSipUserInfo(this.f125719a, this.f125720b, this.f125721c, this.f125722d, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50340a newBuilder() {
                C50340a aVar = new C50340a();
                aVar.f125719a = this.mnickname;
                aVar.f125720b = this.mmain_address;
                aVar.f125721c = this.msub_address;
                aVar.f125722d = this.mavatar;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.mnickname != null) {
                    sb.append(", nickname=");
                    sb.append(this.mnickname);
                }
                if (this.mmain_address != null) {
                    sb.append(", main_address=");
                    sb.append(this.mmain_address);
                }
                if (this.msub_address != null) {
                    sb.append(", sub_address=");
                    sb.append(this.msub_address);
                }
                if (this.mavatar != null) {
                    sb.append(", avatar=");
                    sb.append(this.mavatar);
                }
                StringBuilder replace = sb.replace(0, 2, "PstnSipUserInfo{");
                replace.append('}');
                return replace.toString();
            }

            public PstnSipUserInfo(String str, String str2, String str3, Avatar avatar) {
                this(str, str2, str3, avatar, ByteString.EMPTY);
            }

            public PstnSipUserInfo(String str, String str2, String str3, Avatar avatar, ByteString byteString) {
                super(ADAPTER, byteString);
                this.mnickname = str;
                this.mmain_address = str2;
                this.msub_address = str3;
                this.mavatar = avatar;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$User$b */
        private static final class C50343b extends ProtoAdapter<User> {
            C50343b() {
                super(FieldEncoding.LENGTH_DELIMITED, User.class);
            }

            /* renamed from: a */
            public int encodedSize(User user) {
                int i;
                int i2;
                int i3 = 0;
                if (user.muser_type != null) {
                    i = ParticipantType.ADAPTER.encodedSizeWithTag(1, user.muser_type);
                } else {
                    i = 0;
                }
                if (user.muser_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, user.muser_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (user.mpstn_sip_user_info != null) {
                    i3 = PstnSipUserInfo.ADAPTER.encodedSizeWithTag(3, user.mpstn_sip_user_info);
                }
                return i4 + i3 + user.unknownFields().size();
            }

            /* renamed from: a */
            public User decode(ProtoReader protoReader) throws IOException {
                C50342a aVar = new C50342a();
                aVar.f125724b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f125723a = ParticipantType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f125724b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125725c = PstnSipUserInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, User user) throws IOException {
                if (user.muser_type != null) {
                    ParticipantType.ADAPTER.encodeWithTag(protoWriter, 1, user.muser_type);
                }
                if (user.muser_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, user.muser_id);
                }
                if (user.mpstn_sip_user_info != null) {
                    PstnSipUserInfo.ADAPTER.encodeWithTag(protoWriter, 3, user.mpstn_sip_user_info);
                }
                protoWriter.writeBytes(user.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$User$a */
        public static final class C50342a extends Message.Builder<User, C50342a> {

            /* renamed from: a */
            public ParticipantType f125723a;

            /* renamed from: b */
            public String f125724b;

            /* renamed from: c */
            public PstnSipUserInfo f125725c;

            /* renamed from: a */
            public User build() {
                return new User(this.f125723a, this.f125724b, this.f125725c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50342a newBuilder() {
            C50342a aVar = new C50342a();
            aVar.f125723a = this.muser_type;
            aVar.f125724b = this.muser_id;
            aVar.f125725c = this.mpstn_sip_user_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.muser_type != null) {
                sb.append(", user_type=");
                sb.append(this.muser_type);
            }
            if (this.muser_id != null) {
                sb.append(", user_id=");
                sb.append(this.muser_id);
            }
            if (this.mpstn_sip_user_info != null) {
                sb.append(", pstn_sip_user_info=");
                sb.append(this.mpstn_sip_user_info);
            }
            StringBuilder replace = sb.replace(0, 2, "User{");
            replace.append('}');
            return replace.toString();
        }

        public User(ParticipantType participantType, String str, PstnSipUserInfo pstnSipUserInfo) {
            this(participantType, str, pstnSipUserInfo, ByteString.EMPTY);
        }

        public User(ParticipantType participantType, String str, PstnSipUserInfo pstnSipUserInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.muser_type = participantType;
            this.muser_id = str;
            this.mpstn_sip_user_info = pstnSipUserInfo;
        }
    }

    public static final class MeetingPreConfig extends Message<MeetingPreConfig, C50336a> {
        public static final ProtoAdapter<MeetingPreConfig> ADAPTER = new C50337b();
        private static final long serialVersionUID = 0;
        public final List<User> mauto_invited_users;
        public final String mtopic;

        /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$MeetingPreConfig$b */
        private static final class C50337b extends ProtoAdapter<MeetingPreConfig> {
            C50337b() {
                super(FieldEncoding.LENGTH_DELIMITED, MeetingPreConfig.class);
            }

            /* renamed from: a */
            public int encodedSize(MeetingPreConfig meetingPreConfig) {
                int i;
                if (meetingPreConfig.mtopic != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingPreConfig.mtopic);
                } else {
                    i = 0;
                }
                return i + User.ADAPTER.asRepeated().encodedSizeWithTag(2, meetingPreConfig.mauto_invited_users) + meetingPreConfig.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingPreConfig decode(ProtoReader protoReader) throws IOException {
                C50336a aVar = new C50336a();
                aVar.f125715a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125715a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125716b.add(User.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MeetingPreConfig meetingPreConfig) throws IOException {
                if (meetingPreConfig.mtopic != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingPreConfig.mtopic);
                }
                User.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, meetingPreConfig.mauto_invited_users);
                protoWriter.writeBytes(meetingPreConfig.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$MeetingPreConfig$a */
        public static final class C50336a extends Message.Builder<MeetingPreConfig, C50336a> {

            /* renamed from: a */
            public String f125715a;

            /* renamed from: b */
            public List<User> f125716b = Internal.newMutableList();

            /* renamed from: a */
            public MeetingPreConfig build() {
                return new MeetingPreConfig(this.f125715a, this.f125716b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50336a newBuilder() {
            C50336a aVar = new C50336a();
            aVar.f125715a = this.mtopic;
            aVar.f125716b = Internal.copyOf("mauto_invited_users", this.mauto_invited_users);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mtopic != null) {
                sb.append(", topic=");
                sb.append(this.mtopic);
            }
            if (!this.mauto_invited_users.isEmpty()) {
                sb.append(", auto_invited_users=");
                sb.append(this.mauto_invited_users);
            }
            StringBuilder replace = sb.replace(0, 2, "MeetingPreConfig{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingPreConfig(String str, List<User> list) {
            this(str, list, ByteString.EMPTY);
        }

        public MeetingPreConfig(String str, List<User> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtopic = str;
            this.mauto_invited_users = Internal.immutableCopyOf("mauto_invited_users", list);
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$b */
    private static final class C50345b extends ProtoAdapter<GetReservationResponse> {
        C50345b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetReservationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetReservationResponse getReservationResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getReservationResponse.mid) + ProtoAdapter.STRING.encodedSizeWithTag(2, getReservationResponse.mreserver) + ReserverType.ADAPTER.encodedSizeWithTag(3, getReservationResponse.mreserver_type);
            int i3 = 0;
            if (getReservationResponse.mmeeting_no != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, getReservationResponse.mmeeting_no);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getReservationResponse.murl != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, getReservationResponse.murl);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getReservationResponse.mmeeting_pre_config != null) {
                i3 = MeetingPreConfig.ADAPTER.encodedSizeWithTag(6, getReservationResponse.mmeeting_pre_config);
            }
            return i5 + i3 + getReservationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetReservationResponse decode(ProtoReader protoReader) throws IOException {
            C50344a aVar = new C50344a();
            aVar.f125726a = "";
            aVar.f125727b = "";
            aVar.f125729d = "";
            aVar.f125730e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125726a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125727b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f125728c = ReserverType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f125729d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125730e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125731f = MeetingPreConfig.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetReservationResponse getReservationResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getReservationResponse.mid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getReservationResponse.mreserver);
            ReserverType.ADAPTER.encodeWithTag(protoWriter, 3, getReservationResponse.mreserver_type);
            if (getReservationResponse.mmeeting_no != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getReservationResponse.mmeeting_no);
            }
            if (getReservationResponse.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getReservationResponse.murl);
            }
            if (getReservationResponse.mmeeting_pre_config != null) {
                MeetingPreConfig.ADAPTER.encodeWithTag(protoWriter, 6, getReservationResponse.mmeeting_pre_config);
            }
            protoWriter.writeBytes(getReservationResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50344a newBuilder() {
        C50344a aVar = new C50344a();
        aVar.f125726a = this.mid;
        aVar.f125727b = this.mreserver;
        aVar.f125728c = this.mreserver_type;
        aVar.f125729d = this.mmeeting_no;
        aVar.f125730e = this.murl;
        aVar.f125731f = this.mmeeting_pre_config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetReservationResponse$a */
    public static final class C50344a extends Message.Builder<GetReservationResponse, C50344a> {

        /* renamed from: a */
        public String f125726a;

        /* renamed from: b */
        public String f125727b;

        /* renamed from: c */
        public ReserverType f125728c;

        /* renamed from: d */
        public String f125729d;

        /* renamed from: e */
        public String f125730e;

        /* renamed from: f */
        public MeetingPreConfig f125731f;

        /* renamed from: a */
        public GetReservationResponse build() {
            String str;
            ReserverType reserverType;
            String str2 = this.f125726a;
            if (str2 != null && (str = this.f125727b) != null && (reserverType = this.f125728c) != null) {
                return new GetReservationResponse(str2, str, reserverType, this.f125729d, this.f125730e, this.f125731f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "mid", this.f125727b, "mreserver", this.f125728c, "mreserver_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", reserver=");
        sb.append(this.mreserver);
        sb.append(", reserver_type=");
        sb.append(this.mreserver_type);
        if (this.mmeeting_no != null) {
            sb.append(", meeting_no=");
            sb.append(this.mmeeting_no);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.mmeeting_pre_config != null) {
            sb.append(", meeting_pre_config=");
            sb.append(this.mmeeting_pre_config);
        }
        StringBuilder replace = sb.replace(0, 2, "GetReservationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetReservationResponse(String str, String str2, ReserverType reserverType, String str3, String str4, MeetingPreConfig meetingPreConfig) {
        this(str, str2, reserverType, str3, str4, meetingPreConfig, ByteString.EMPTY);
    }

    public GetReservationResponse(String str, String str2, ReserverType reserverType, String str3, String str4, MeetingPreConfig meetingPreConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mreserver = str2;
        this.mreserver_type = reserverType;
        this.mmeeting_no = str3;
        this.murl = str4;
        this.mmeeting_pre_config = meetingPreConfig;
    }
}
