package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class JoinMeetingRequest extends Message<JoinMeetingRequest, C50837a> {
    public static final ProtoAdapter<JoinMeetingRequest> ADAPTER = new C50838b();
    public static final JoinType DEFAULT_JOIN_TYPE = JoinType.CREATE_VC_VIA_ROOM_DEVICE;
    private static final long serialVersionUID = 0;
    public final AdditionalBehavior additional_behavior;
    public final CreationMetaData creation_meta_data;
    public final Handle handle;
    public final Invitee invitee;
    public final JoinType join_type;
    public final SelfParticipantInfo self_participant_info;

    public enum JoinType implements WireEnum {
        CREATE_VC_VIA_ROOM_DEVICE(0),
        CREATE_VC(1),
        CREATE_VC_VIA_DOCS(7),
        JOIN_VC_VIA_MEETING_ID(2),
        JOIN_VC_VIA_GROUP_ID(3),
        JOIN_VC_VIA_UNIQUE_ID(4),
        JOIN_VC_VIA_MEETING_NUMBER(5),
        JOIN_CHAT_ROOM(8),
        JOIN_VC_CREATE_ONLY(9),
        JOIN_VC_VIA_RESERVE_ID(10);
        
        public static final ProtoAdapter<JoinType> ADAPTER = ProtoAdapter.newEnumAdapter(JoinType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JoinType fromValue(int i) {
            switch (i) {
                case 0:
                    return CREATE_VC_VIA_ROOM_DEVICE;
                case 1:
                    return CREATE_VC;
                case 2:
                    return JOIN_VC_VIA_MEETING_ID;
                case 3:
                    return JOIN_VC_VIA_GROUP_ID;
                case 4:
                    return JOIN_VC_VIA_UNIQUE_ID;
                case 5:
                    return JOIN_VC_VIA_MEETING_NUMBER;
                case 6:
                default:
                    return null;
                case 7:
                    return CREATE_VC_VIA_DOCS;
                case 8:
                    return JOIN_CHAT_ROOM;
                case 9:
                    return JOIN_VC_CREATE_ONLY;
                case 10:
                    return JOIN_VC_VIA_RESERVE_ID;
            }
        }

        private JoinType(int i) {
            this.value = i;
        }
    }

    public static final class AdditionalBehavior extends Message<AdditionalBehavior, C50827a> {
        public static final ProtoAdapter<AdditionalBehavior> ADAPTER = new C50828b();
        public static final Boolean DEFAULT_AUTO_RECREATE_IF_MEETING_ENDED = false;
        public static final Boolean DEFAULT_FORCE = false;
        public static final Boolean DEFAULT_SHARE = false;
        public static final Boolean DEFAULT_START_FOLLOW_IMMEDIATELY = false;
        private static final long serialVersionUID = 0;
        public final Boolean auto_recreate_if_meeting_ended;
        public final Boolean force;
        public final Boolean share;
        public final Boolean start_follow_immediately;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$AdditionalBehavior$b */
        private static final class C50828b extends ProtoAdapter<AdditionalBehavior> {
            C50828b() {
                super(FieldEncoding.LENGTH_DELIMITED, AdditionalBehavior.class);
            }

            /* renamed from: a */
            public int encodedSize(AdditionalBehavior additionalBehavior) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (additionalBehavior.auto_recreate_if_meeting_ended != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, additionalBehavior.auto_recreate_if_meeting_ended);
                } else {
                    i = 0;
                }
                if (additionalBehavior.force != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, additionalBehavior.force);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (additionalBehavior.share != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, additionalBehavior.share);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (additionalBehavior.start_follow_immediately != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, additionalBehavior.start_follow_immediately);
                }
                return i6 + i4 + additionalBehavior.unknownFields().size();
            }

            /* renamed from: a */
            public AdditionalBehavior decode(ProtoReader protoReader) throws IOException {
                C50827a aVar = new C50827a();
                aVar.f126700a = false;
                aVar.f126701b = false;
                aVar.f126702c = false;
                aVar.f126703d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126700a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126701b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126702c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126703d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AdditionalBehavior additionalBehavior) throws IOException {
                if (additionalBehavior.auto_recreate_if_meeting_ended != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, additionalBehavior.auto_recreate_if_meeting_ended);
                }
                if (additionalBehavior.force != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, additionalBehavior.force);
                }
                if (additionalBehavior.share != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, additionalBehavior.share);
                }
                if (additionalBehavior.start_follow_immediately != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, additionalBehavior.start_follow_immediately);
                }
                protoWriter.writeBytes(additionalBehavior.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$AdditionalBehavior$a */
        public static final class C50827a extends Message.Builder<AdditionalBehavior, C50827a> {

            /* renamed from: a */
            public Boolean f126700a;

            /* renamed from: b */
            public Boolean f126701b;

            /* renamed from: c */
            public Boolean f126702c;

            /* renamed from: d */
            public Boolean f126703d;

            /* renamed from: a */
            public AdditionalBehavior build() {
                return new AdditionalBehavior(this.f126700a, this.f126701b, this.f126702c, this.f126703d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50827a newBuilder() {
            C50827a aVar = new C50827a();
            aVar.f126700a = this.auto_recreate_if_meeting_ended;
            aVar.f126701b = this.force;
            aVar.f126702c = this.share;
            aVar.f126703d = this.start_follow_immediately;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "AdditionalBehavior");
            StringBuilder sb = new StringBuilder();
            if (this.auto_recreate_if_meeting_ended != null) {
                sb.append(", auto_recreate_if_meeting_ended=");
                sb.append(this.auto_recreate_if_meeting_ended);
            }
            if (this.force != null) {
                sb.append(", force=");
                sb.append(this.force);
            }
            if (this.share != null) {
                sb.append(", share=");
                sb.append(this.share);
            }
            if (this.start_follow_immediately != null) {
                sb.append(", start_follow_immediately=");
                sb.append(this.start_follow_immediately);
            }
            StringBuilder replace = sb.replace(0, 2, "AdditionalBehavior{");
            replace.append('}');
            return replace.toString();
        }

        public AdditionalBehavior(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this(bool, bool2, bool3, bool4, ByteString.EMPTY);
        }

        public AdditionalBehavior(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
            super(ADAPTER, byteString);
            this.auto_recreate_if_meeting_ended = bool;
            this.force = bool2;
            this.share = bool3;
            this.start_follow_immediately = bool4;
        }
    }

    public static final class CreationMetaData extends Message<CreationMetaData, C50829a> {
        public static final ProtoAdapter<CreationMetaData> ADAPTER = new C50830b();
        public static final Boolean DEFAULT_SHOULD_FOLLOW_IMMEDIATELY = false;
        public static final VideoChatInfo.Type DEFAULT_TYPE = VideoChatInfo.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final ActionTime action_time;
        public final String follow_url;
        public final String login_token;
        public final VideoChatSettings meeting_settings;
        public final Boolean should_follow_immediately;
        public final String topic;
        public final VideoChatInfo.Type type;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$CreationMetaData$b */
        private static final class C50830b extends ProtoAdapter<CreationMetaData> {
            C50830b() {
                super(FieldEncoding.LENGTH_DELIMITED, CreationMetaData.class);
            }

            /* renamed from: a */
            public int encodedSize(CreationMetaData creationMetaData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (creationMetaData.type != null) {
                    i = VideoChatInfo.Type.ADAPTER.encodedSizeWithTag(1, creationMetaData.type);
                } else {
                    i = 0;
                }
                if (creationMetaData.topic != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, creationMetaData.topic);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (creationMetaData.action_time != null) {
                    i3 = ActionTime.ADAPTER.encodedSizeWithTag(3, creationMetaData.action_time);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (creationMetaData.meeting_settings != null) {
                    i4 = VideoChatSettings.ADAPTER.encodedSizeWithTag(4, creationMetaData.meeting_settings);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (creationMetaData.follow_url != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, creationMetaData.follow_url);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (creationMetaData.login_token != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, creationMetaData.login_token);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (creationMetaData.should_follow_immediately != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, creationMetaData.should_follow_immediately);
                }
                return i12 + i7 + creationMetaData.unknownFields().size();
            }

            /* renamed from: a */
            public CreationMetaData decode(ProtoReader protoReader) throws IOException {
                C50829a aVar = new C50829a();
                aVar.f126704a = VideoChatInfo.Type.UNKNOWN;
                aVar.f126705b = "";
                aVar.f126708e = "";
                aVar.f126709f = "";
                aVar.f126710g = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f126704a = VideoChatInfo.Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f126705b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126706c = ActionTime.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126707d = VideoChatSettings.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126708e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126709f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126710g = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, CreationMetaData creationMetaData) throws IOException {
                if (creationMetaData.type != null) {
                    VideoChatInfo.Type.ADAPTER.encodeWithTag(protoWriter, 1, creationMetaData.type);
                }
                if (creationMetaData.topic != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, creationMetaData.topic);
                }
                if (creationMetaData.action_time != null) {
                    ActionTime.ADAPTER.encodeWithTag(protoWriter, 3, creationMetaData.action_time);
                }
                if (creationMetaData.meeting_settings != null) {
                    VideoChatSettings.ADAPTER.encodeWithTag(protoWriter, 4, creationMetaData.meeting_settings);
                }
                if (creationMetaData.follow_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, creationMetaData.follow_url);
                }
                if (creationMetaData.login_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, creationMetaData.login_token);
                }
                if (creationMetaData.should_follow_immediately != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, creationMetaData.should_follow_immediately);
                }
                protoWriter.writeBytes(creationMetaData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$CreationMetaData$a */
        public static final class C50829a extends Message.Builder<CreationMetaData, C50829a> {

            /* renamed from: a */
            public VideoChatInfo.Type f126704a;

            /* renamed from: b */
            public String f126705b;

            /* renamed from: c */
            public ActionTime f126706c;

            /* renamed from: d */
            public VideoChatSettings f126707d;

            /* renamed from: e */
            public String f126708e;

            /* renamed from: f */
            public String f126709f;

            /* renamed from: g */
            public Boolean f126710g;

            /* renamed from: a */
            public CreationMetaData build() {
                return new CreationMetaData(this.f126704a, this.f126705b, this.f126706c, this.f126707d, this.f126708e, this.f126709f, this.f126710g, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50829a newBuilder() {
            C50829a aVar = new C50829a();
            aVar.f126704a = this.type;
            aVar.f126705b = this.topic;
            aVar.f126706c = this.action_time;
            aVar.f126707d = this.meeting_settings;
            aVar.f126708e = this.follow_url;
            aVar.f126709f = this.login_token;
            aVar.f126710g = this.should_follow_immediately;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "CreationMetaData");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.topic != null) {
                sb.append(", topic=");
                sb.append(this.topic);
            }
            if (this.action_time != null) {
                sb.append(", action_time=");
                sb.append(this.action_time);
            }
            if (this.meeting_settings != null) {
                sb.append(", meeting_settings=");
                sb.append(this.meeting_settings);
            }
            if (this.follow_url != null) {
                sb.append(", follow_url=");
                sb.append(this.follow_url);
            }
            if (this.login_token != null) {
                sb.append(", login_token=");
                sb.append(this.login_token);
            }
            if (this.should_follow_immediately != null) {
                sb.append(", should_follow_immediately=");
                sb.append(this.should_follow_immediately);
            }
            StringBuilder replace = sb.replace(0, 2, "CreationMetaData{");
            replace.append('}');
            return replace.toString();
        }

        public CreationMetaData(VideoChatInfo.Type type2, String str, ActionTime actionTime, VideoChatSettings videoChatSettings, String str2, String str3, Boolean bool) {
            this(type2, str, actionTime, videoChatSettings, str2, str3, bool, ByteString.EMPTY);
        }

        public CreationMetaData(VideoChatInfo.Type type2, String str, ActionTime actionTime, VideoChatSettings videoChatSettings, String str2, String str3, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.topic = str;
            this.action_time = actionTime;
            this.meeting_settings = videoChatSettings;
            this.follow_url = str2;
            this.login_token = str3;
            this.should_follow_immediately = bool;
        }
    }

    public static final class Handle extends Message<Handle, C50831a> {
        public static final ProtoAdapter<Handle> ADAPTER = new C50832b();
        public static final VideoChatInfo.MeetingSource DEFAULT_SOURCE = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
        private static final long serialVersionUID = 0;
        public final String docs_url;
        public final String group_id;
        public final String meeting_id;
        public final String meeting_no;
        public final String share_code;
        public final VideoChatInfo.MeetingSource source;
        public final String unique_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$Handle$b */
        private static final class C50832b extends ProtoAdapter<Handle> {
            C50832b() {
                super(FieldEncoding.LENGTH_DELIMITED, Handle.class);
            }

            /* renamed from: a */
            public int encodedSize(Handle handle) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (handle.meeting_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, handle.meeting_id);
                } else {
                    i = 0;
                }
                if (handle.meeting_no != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, handle.meeting_no);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (handle.group_id != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, handle.group_id);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (handle.unique_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, handle.unique_id);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (handle.source != null) {
                    i5 = VideoChatInfo.MeetingSource.ADAPTER.encodedSizeWithTag(5, handle.source);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (handle.share_code != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, handle.share_code);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (handle.docs_url != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, handle.docs_url);
                }
                return i12 + i7 + handle.unknownFields().size();
            }

            /* renamed from: a */
            public Handle decode(ProtoReader protoReader) throws IOException {
                C50831a aVar = new C50831a();
                aVar.f126711a = "";
                aVar.f126712b = "";
                aVar.f126713c = "";
                aVar.f126714d = "";
                aVar.f126715e = VideoChatInfo.MeetingSource.VC_UNKNOWN_SOURCE_TYPE;
                aVar.f126716f = "";
                aVar.f126717g = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f126711a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f126712b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126713c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126714d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    aVar.f126715e = VideoChatInfo.MeetingSource.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 6:
                                aVar.f126716f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126717g = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Handle handle) throws IOException {
                if (handle.meeting_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, handle.meeting_id);
                }
                if (handle.meeting_no != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, handle.meeting_no);
                }
                if (handle.group_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, handle.group_id);
                }
                if (handle.unique_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, handle.unique_id);
                }
                if (handle.source != null) {
                    VideoChatInfo.MeetingSource.ADAPTER.encodeWithTag(protoWriter, 5, handle.source);
                }
                if (handle.share_code != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, handle.share_code);
                }
                if (handle.docs_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, handle.docs_url);
                }
                protoWriter.writeBytes(handle.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$Handle$a */
        public static final class C50831a extends Message.Builder<Handle, C50831a> {

            /* renamed from: a */
            public String f126711a;

            /* renamed from: b */
            public String f126712b;

            /* renamed from: c */
            public String f126713c;

            /* renamed from: d */
            public String f126714d;

            /* renamed from: e */
            public VideoChatInfo.MeetingSource f126715e;

            /* renamed from: f */
            public String f126716f;

            /* renamed from: g */
            public String f126717g;

            /* renamed from: a */
            public Handle build() {
                return new Handle(this.f126711a, this.f126712b, this.f126713c, this.f126714d, this.f126715e, this.f126716f, this.f126717g, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50831a newBuilder() {
            C50831a aVar = new C50831a();
            aVar.f126711a = this.meeting_id;
            aVar.f126712b = this.meeting_no;
            aVar.f126713c = this.group_id;
            aVar.f126714d = this.unique_id;
            aVar.f126715e = this.source;
            aVar.f126716f = this.share_code;
            aVar.f126717g = this.docs_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Handle");
            StringBuilder sb = new StringBuilder();
            if (this.meeting_id != null) {
                sb.append(", meeting_id=");
                sb.append(this.meeting_id);
            }
            if (this.meeting_no != null) {
                sb.append(", meeting_no=");
                sb.append(this.meeting_no);
            }
            if (this.group_id != null) {
                sb.append(", group_id=");
                sb.append(this.group_id);
            }
            if (this.unique_id != null) {
                sb.append(", unique_id=");
                sb.append(this.unique_id);
            }
            if (this.source != null) {
                sb.append(", source=");
                sb.append(this.source);
            }
            if (this.share_code != null) {
                sb.append(", share_code=");
                sb.append(this.share_code);
            }
            if (this.docs_url != null) {
                sb.append(", docs_url=");
                sb.append(this.docs_url);
            }
            StringBuilder replace = sb.replace(0, 2, "Handle{");
            replace.append('}');
            return replace.toString();
        }

        public Handle(String str, String str2, String str3, String str4, VideoChatInfo.MeetingSource meetingSource, String str5, String str6) {
            this(str, str2, str3, str4, meetingSource, str5, str6, ByteString.EMPTY);
        }

        public Handle(String str, String str2, String str3, String str4, VideoChatInfo.MeetingSource meetingSource, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.meeting_id = str;
            this.meeting_no = str2;
            this.group_id = str3;
            this.unique_id = str4;
            this.source = meetingSource;
            this.share_code = str5;
            this.docs_url = str6;
        }
    }

    public static final class Invitee extends Message<Invitee, C50833a> {
        public static final ProtoAdapter<Invitee> ADAPTER = new C50834b();
        private static final long serialVersionUID = 0;
        public final List<String> invitee_room_ids;
        public final List<String> invitee_user_ids;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$Invitee$b */
        private static final class C50834b extends ProtoAdapter<Invitee> {
            C50834b() {
                super(FieldEncoding.LENGTH_DELIMITED, Invitee.class);
            }

            /* renamed from: a */
            public int encodedSize(Invitee invitee) {
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, invitee.invitee_user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, invitee.invitee_room_ids) + invitee.unknownFields().size();
            }

            /* renamed from: a */
            public Invitee decode(ProtoReader protoReader) throws IOException {
                C50833a aVar = new C50833a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126718a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126719b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Invitee invitee) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, invitee.invitee_user_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, invitee.invitee_room_ids);
                protoWriter.writeBytes(invitee.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$Invitee$a */
        public static final class C50833a extends Message.Builder<Invitee, C50833a> {

            /* renamed from: a */
            public List<String> f126718a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f126719b = Internal.newMutableList();

            /* renamed from: a */
            public Invitee build() {
                return new Invitee(this.f126718a, this.f126719b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50833a newBuilder() {
            C50833a aVar = new C50833a();
            aVar.f126718a = Internal.copyOf("invitee_user_ids", this.invitee_user_ids);
            aVar.f126719b = Internal.copyOf("invitee_room_ids", this.invitee_room_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Invitee");
            StringBuilder sb = new StringBuilder();
            if (!this.invitee_user_ids.isEmpty()) {
                sb.append(", invitee_user_ids=");
                sb.append(this.invitee_user_ids);
            }
            if (!this.invitee_room_ids.isEmpty()) {
                sb.append(", invitee_room_ids=");
                sb.append(this.invitee_room_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "Invitee{");
            replace.append('}');
            return replace.toString();
        }

        public Invitee(List<String> list, List<String> list2) {
            this(list, list2, ByteString.EMPTY);
        }

        public Invitee(List<String> list, List<String> list2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.invitee_user_ids = Internal.immutableCopyOf("invitee_user_ids", list);
            this.invitee_room_ids = Internal.immutableCopyOf("invitee_room_ids", list2);
        }
    }

    public static final class SelfParticipantInfo extends Message<SelfParticipantInfo, C50835a> {
        public static final ProtoAdapter<SelfParticipantInfo> ADAPTER = new C50836b();
        public static final ParticipantType DEFAULT_PARTICIPANT_TYPE = ParticipantType.UNKNOW;
        private static final long serialVersionUID = 0;
        public final ParticipantSettings participant_settings;
        public final ParticipantType participant_type;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$SelfParticipantInfo$b */
        private static final class C50836b extends ProtoAdapter<SelfParticipantInfo> {
            C50836b() {
                super(FieldEncoding.LENGTH_DELIMITED, SelfParticipantInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(SelfParticipantInfo selfParticipantInfo) {
                int i;
                int encodedSizeWithTag = ParticipantType.ADAPTER.encodedSizeWithTag(1, selfParticipantInfo.participant_type);
                if (selfParticipantInfo.participant_settings != null) {
                    i = ParticipantSettings.ADAPTER.encodedSizeWithTag(2, selfParticipantInfo.participant_settings);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + selfParticipantInfo.unknownFields().size();
            }

            /* renamed from: a */
            public SelfParticipantInfo decode(ProtoReader protoReader) throws IOException {
                C50835a aVar = new C50835a();
                aVar.f126720a = ParticipantType.UNKNOW;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126720a = ParticipantType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126721b = ParticipantSettings.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SelfParticipantInfo selfParticipantInfo) throws IOException {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 1, selfParticipantInfo.participant_type);
                if (selfParticipantInfo.participant_settings != null) {
                    ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 2, selfParticipantInfo.participant_settings);
                }
                protoWriter.writeBytes(selfParticipantInfo.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$SelfParticipantInfo$a */
        public static final class C50835a extends Message.Builder<SelfParticipantInfo, C50835a> {

            /* renamed from: a */
            public ParticipantType f126720a;

            /* renamed from: b */
            public ParticipantSettings f126721b;

            /* renamed from: a */
            public SelfParticipantInfo build() {
                ParticipantType participantType = this.f126720a;
                if (participantType != null) {
                    return new SelfParticipantInfo(participantType, this.f126721b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(participantType, "participant_type");
            }
        }

        @Override // com.squareup.wire.Message
        public C50835a newBuilder() {
            C50835a aVar = new C50835a();
            aVar.f126720a = this.participant_type;
            aVar.f126721b = this.participant_settings;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SelfParticipantInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", participant_type=");
            sb.append(this.participant_type);
            if (this.participant_settings != null) {
                sb.append(", participant_settings=");
                sb.append(this.participant_settings);
            }
            StringBuilder replace = sb.replace(0, 2, "SelfParticipantInfo{");
            replace.append('}');
            return replace.toString();
        }

        public SelfParticipantInfo(ParticipantType participantType, ParticipantSettings participantSettings) {
            this(participantType, participantSettings, ByteString.EMPTY);
        }

        public SelfParticipantInfo(ParticipantType participantType, ParticipantSettings participantSettings, ByteString byteString) {
            super(ADAPTER, byteString);
            this.participant_type = participantType;
            this.participant_settings = participantSettings;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$b */
    private static final class C50838b extends ProtoAdapter<JoinMeetingRequest> {
        C50838b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinMeetingRequest joinMeetingRequest) {
            int i;
            int encodedSizeWithTag = JoinType.ADAPTER.encodedSizeWithTag(1, joinMeetingRequest.join_type) + Invitee.ADAPTER.encodedSizeWithTag(2, joinMeetingRequest.invitee) + Handle.ADAPTER.encodedSizeWithTag(3, joinMeetingRequest.handle) + SelfParticipantInfo.ADAPTER.encodedSizeWithTag(4, joinMeetingRequest.self_participant_info);
            int i2 = 0;
            if (joinMeetingRequest.creation_meta_data != null) {
                i = CreationMetaData.ADAPTER.encodedSizeWithTag(5, joinMeetingRequest.creation_meta_data);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (joinMeetingRequest.additional_behavior != null) {
                i2 = AdditionalBehavior.ADAPTER.encodedSizeWithTag(6, joinMeetingRequest.additional_behavior);
            }
            return i3 + i2 + joinMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public JoinMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C50837a aVar = new C50837a();
            aVar.f126722a = JoinType.CREATE_VC_VIA_ROOM_DEVICE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f126722a = JoinType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f126723b = Invitee.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126724c = Handle.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126725d = SelfParticipantInfo.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126726e = CreationMetaData.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126727f = AdditionalBehavior.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, JoinMeetingRequest joinMeetingRequest) throws IOException {
            JoinType.ADAPTER.encodeWithTag(protoWriter, 1, joinMeetingRequest.join_type);
            Invitee.ADAPTER.encodeWithTag(protoWriter, 2, joinMeetingRequest.invitee);
            Handle.ADAPTER.encodeWithTag(protoWriter, 3, joinMeetingRequest.handle);
            SelfParticipantInfo.ADAPTER.encodeWithTag(protoWriter, 4, joinMeetingRequest.self_participant_info);
            if (joinMeetingRequest.creation_meta_data != null) {
                CreationMetaData.ADAPTER.encodeWithTag(protoWriter, 5, joinMeetingRequest.creation_meta_data);
            }
            if (joinMeetingRequest.additional_behavior != null) {
                AdditionalBehavior.ADAPTER.encodeWithTag(protoWriter, 6, joinMeetingRequest.additional_behavior);
            }
            protoWriter.writeBytes(joinMeetingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50837a newBuilder() {
        C50837a aVar = new C50837a();
        aVar.f126722a = this.join_type;
        aVar.f126723b = this.invitee;
        aVar.f126724c = this.handle;
        aVar.f126725d = this.self_participant_info;
        aVar.f126726e = this.creation_meta_data;
        aVar.f126727f = this.additional_behavior;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingRequest$a */
    public static final class C50837a extends Message.Builder<JoinMeetingRequest, C50837a> {

        /* renamed from: a */
        public JoinType f126722a;

        /* renamed from: b */
        public Invitee f126723b;

        /* renamed from: c */
        public Handle f126724c;

        /* renamed from: d */
        public SelfParticipantInfo f126725d;

        /* renamed from: e */
        public CreationMetaData f126726e;

        /* renamed from: f */
        public AdditionalBehavior f126727f;

        /* renamed from: a */
        public JoinMeetingRequest build() {
            Invitee invitee;
            Handle handle;
            SelfParticipantInfo selfParticipantInfo;
            JoinType joinType = this.f126722a;
            if (joinType != null && (invitee = this.f126723b) != null && (handle = this.f126724c) != null && (selfParticipantInfo = this.f126725d) != null) {
                return new JoinMeetingRequest(joinType, invitee, handle, selfParticipantInfo, this.f126726e, this.f126727f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(joinType, "join_type", this.f126723b, "invitee", this.f126724c, "handle", this.f126725d, "self_participant_info");
        }

        /* renamed from: a */
        public C50837a mo175709a(CreationMetaData creationMetaData) {
            this.f126726e = creationMetaData;
            return this;
        }

        /* renamed from: a */
        public C50837a mo175710a(Handle handle) {
            this.f126724c = handle;
            return this;
        }

        /* renamed from: a */
        public C50837a mo175711a(Invitee invitee) {
            this.f126723b = invitee;
            return this;
        }

        /* renamed from: a */
        public C50837a mo175712a(JoinType joinType) {
            this.f126722a = joinType;
            return this;
        }

        /* renamed from: a */
        public C50837a mo175713a(SelfParticipantInfo selfParticipantInfo) {
            this.f126725d = selfParticipantInfo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinMeetingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", join_type=");
        sb.append(this.join_type);
        sb.append(", invitee=");
        sb.append(this.invitee);
        sb.append(", handle=");
        sb.append(this.handle);
        sb.append(", self_participant_info=");
        sb.append(this.self_participant_info);
        if (this.creation_meta_data != null) {
            sb.append(", creation_meta_data=");
            sb.append(this.creation_meta_data);
        }
        if (this.additional_behavior != null) {
            sb.append(", additional_behavior=");
            sb.append(this.additional_behavior);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public JoinMeetingRequest(JoinType joinType, Invitee invitee2, Handle handle2, SelfParticipantInfo selfParticipantInfo, CreationMetaData creationMetaData, AdditionalBehavior additionalBehavior) {
        this(joinType, invitee2, handle2, selfParticipantInfo, creationMetaData, additionalBehavior, ByteString.EMPTY);
    }

    public JoinMeetingRequest(JoinType joinType, Invitee invitee2, Handle handle2, SelfParticipantInfo selfParticipantInfo, CreationMetaData creationMetaData, AdditionalBehavior additionalBehavior, ByteString byteString) {
        super(ADAPTER, byteString);
        this.join_type = joinType;
        this.invitee = invitee2;
        this.handle = handle2;
        this.self_participant_info = selfParticipantInfo;
        this.creation_meta_data = creationMetaData;
        this.additional_behavior = additionalBehavior;
    }
}
