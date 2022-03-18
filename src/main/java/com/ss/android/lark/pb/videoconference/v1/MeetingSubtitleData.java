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
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class MeetingSubtitleData extends Message<MeetingSubtitleData, C50873a> {
    public static final ProtoAdapter<MeetingSubtitleData> ADAPTER = new C50874b();
    public static final Boolean DEFAULT_IS_SEG_FINAL = false;
    public static final Long DEFAULT_SEG_ID = 0L;
    public static final Long DEFAULT_SLICE_ID = 0L;
    public static final SoundType DEFAULT_SOUND_TYPE = SoundType.NORMAL;
    public static final SubtitleType DEFAULT_SUBTITLE_TYPE = SubtitleType.UNKNOWN;
    public static final Long DEFAULT_TIMESTAMP = 0L;
    public static final Boolean DEFAULT_TRACK_RECEIVED = false;
    private static final long serialVersionUID = 0;
    public final SubtitleEvent event;
    public final Boolean is_seg_final;
    public final String meeting_id;
    public final Long seg_id;
    public final String seg_id_str;
    public final Long slice_id;
    public final SoundType sound_type;
    public final Subtitle source;
    public final SubtitleType subtitle_type;
    public final Subtitle target;
    public final Long timestamp;
    public final Boolean track_received;

    public static final class SubtitleEvent extends Message<SubtitleEvent, C50871a> {
        public static final ProtoAdapter<SubtitleEvent> ADAPTER = new C50872b();
        public static final Type DEFAULT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final FollowInfo follow_info;
        public final Type type;
        public final ByteviewUser user;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            TURN_SUBTITLE_ON(1),
            START_SHARE_SCREEN(2),
            STOP_SHARE_SCREEN(3),
            START_FOLLOW(4),
            STOP_FOLLOW(5);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return TURN_SUBTITLE_ON;
                }
                if (i == 2) {
                    return START_SHARE_SCREEN;
                }
                if (i == 3) {
                    return STOP_SHARE_SCREEN;
                }
                if (i == 4) {
                    return START_FOLLOW;
                }
                if (i != 5) {
                    return null;
                }
                return STOP_FOLLOW;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public static final class FollowInfo extends Message<FollowInfo, C50869a> {
            public static final ProtoAdapter<FollowInfo> ADAPTER = new C50870b();
            private static final long serialVersionUID = 0;
            public final String doc_title;
            public final String doc_url;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$SubtitleEvent$FollowInfo$b */
            private static final class C50870b extends ProtoAdapter<FollowInfo> {
                C50870b() {
                    super(FieldEncoding.LENGTH_DELIMITED, FollowInfo.class);
                }

                /* renamed from: a */
                public int encodedSize(FollowInfo followInfo) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, followInfo.doc_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, followInfo.doc_title) + followInfo.unknownFields().size();
                }

                /* renamed from: a */
                public FollowInfo decode(ProtoReader protoReader) throws IOException {
                    C50869a aVar = new C50869a();
                    aVar.f126781a = "";
                    aVar.f126782b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f126781a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f126782b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, FollowInfo followInfo) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, followInfo.doc_url);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, followInfo.doc_title);
                    protoWriter.writeBytes(followInfo.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C50869a newBuilder() {
                C50869a aVar = new C50869a();
                aVar.f126781a = this.doc_url;
                aVar.f126782b = this.doc_title;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$SubtitleEvent$FollowInfo$a */
            public static final class C50869a extends Message.Builder<FollowInfo, C50869a> {

                /* renamed from: a */
                public String f126781a;

                /* renamed from: b */
                public String f126782b;

                /* renamed from: a */
                public FollowInfo build() {
                    String str;
                    String str2 = this.f126781a;
                    if (str2 != null && (str = this.f126782b) != null) {
                        return new FollowInfo(str2, str, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str2, "doc_url", this.f126782b, "doc_title");
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "FollowInfo");
                StringBuilder sb = new StringBuilder();
                sb.append(", doc_url=");
                sb.append(this.doc_url);
                sb.append(", doc_title=");
                sb.append(this.doc_title);
                StringBuilder replace = sb.replace(0, 2, "FollowInfo{");
                replace.append('}');
                return replace.toString();
            }

            public FollowInfo(String str, String str2) {
                this(str, str2, ByteString.EMPTY);
            }

            public FollowInfo(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                this.doc_url = str;
                this.doc_title = str2;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$SubtitleEvent$b */
        private static final class C50872b extends ProtoAdapter<SubtitleEvent> {
            C50872b() {
                super(FieldEncoding.LENGTH_DELIMITED, SubtitleEvent.class);
            }

            /* renamed from: a */
            public int encodedSize(SubtitleEvent subtitleEvent) {
                int i;
                int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, subtitleEvent.type) + ByteviewUser.ADAPTER.encodedSizeWithTag(2, subtitleEvent.user);
                if (subtitleEvent.follow_info != null) {
                    i = FollowInfo.ADAPTER.encodedSizeWithTag(3, subtitleEvent.follow_info);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + subtitleEvent.unknownFields().size();
            }

            /* renamed from: a */
            public SubtitleEvent decode(ProtoReader protoReader) throws IOException {
                C50871a aVar = new C50871a();
                aVar.f126783a = Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f126783a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f126784b = ByteviewUser.ADAPTER.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126785c = FollowInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SubtitleEvent subtitleEvent) throws IOException {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, subtitleEvent.type);
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 2, subtitleEvent.user);
                if (subtitleEvent.follow_info != null) {
                    FollowInfo.ADAPTER.encodeWithTag(protoWriter, 3, subtitleEvent.follow_info);
                }
                protoWriter.writeBytes(subtitleEvent.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50871a newBuilder() {
            C50871a aVar = new C50871a();
            aVar.f126783a = this.type;
            aVar.f126784b = this.user;
            aVar.f126785c = this.follow_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$SubtitleEvent$a */
        public static final class C50871a extends Message.Builder<SubtitleEvent, C50871a> {

            /* renamed from: a */
            public Type f126783a;

            /* renamed from: b */
            public ByteviewUser f126784b;

            /* renamed from: c */
            public FollowInfo f126785c;

            /* renamed from: a */
            public SubtitleEvent build() {
                ByteviewUser byteviewUser;
                Type type = this.f126783a;
                if (type != null && (byteviewUser = this.f126784b) != null) {
                    return new SubtitleEvent(type, byteviewUser, this.f126785c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f126784b, "user");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "SubtitleEvent");
            StringBuilder sb = new StringBuilder();
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", user=");
            sb.append(this.user);
            if (this.follow_info != null) {
                sb.append(", follow_info=");
                sb.append(this.follow_info);
            }
            StringBuilder replace = sb.replace(0, 2, "SubtitleEvent{");
            replace.append('}');
            return replace.toString();
        }

        public SubtitleEvent(Type type2, ByteviewUser byteviewUser, FollowInfo followInfo) {
            this(type2, byteviewUser, followInfo, ByteString.EMPTY);
        }

        public SubtitleEvent(Type type2, ByteviewUser byteviewUser, FollowInfo followInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.user = byteviewUser;
            this.follow_info = followInfo;
        }
    }

    public enum SoundType implements WireEnum {
        NORMAL(1),
        NOISE(2);
        
        public static final ProtoAdapter<SoundType> ADAPTER = ProtoAdapter.newEnumAdapter(SoundType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SoundType fromValue(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i != 2) {
                return null;
            }
            return NOISE;
        }

        private SoundType(int i) {
            this.value = i;
        }
    }

    public enum SubtitleType implements WireEnum {
        UNKNOWN(0),
        TRANSLATION(1),
        TRANSCRIPTION(2),
        EVENT(3);
        
        public static final ProtoAdapter<SubtitleType> ADAPTER = ProtoAdapter.newEnumAdapter(SubtitleType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SubtitleType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return TRANSLATION;
            }
            if (i == 2) {
                return TRANSCRIPTION;
            }
            if (i != 3) {
                return null;
            }
            return EVENT;
        }

        private SubtitleType(int i) {
            this.value = i;
        }
    }

    public static final class Subtitle extends Message<Subtitle, C50867a> {
        public static final ProtoAdapter<Subtitle> ADAPTER = new C50868b();
        private static final long serialVersionUID = 0;
        public final String content;
        public final String language;
        public final ByteviewUser speaker;
        public final String speaker_device_id;
        public final String speaker_user_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$Subtitle$b */
        private static final class C50868b extends ProtoAdapter<Subtitle> {
            C50868b() {
                super(FieldEncoding.LENGTH_DELIMITED, Subtitle.class);
            }

            /* renamed from: a */
            public int encodedSize(Subtitle subtitle) {
                int i;
                int i2;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, subtitle.content) + ProtoAdapter.STRING.encodedSizeWithTag(2, subtitle.language);
                int i3 = 0;
                if (subtitle.speaker_user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, subtitle.speaker_user_id);
                } else {
                    i = 0;
                }
                int i4 = encodedSizeWithTag + i;
                if (subtitle.speaker_device_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, subtitle.speaker_device_id);
                } else {
                    i2 = 0;
                }
                int i5 = i4 + i2;
                if (subtitle.speaker != null) {
                    i3 = ByteviewUser.ADAPTER.encodedSizeWithTag(5, subtitle.speaker);
                }
                return i5 + i3 + subtitle.unknownFields().size();
            }

            /* renamed from: a */
            public Subtitle decode(ProtoReader protoReader) throws IOException {
                C50867a aVar = new C50867a();
                aVar.f126776a = "";
                aVar.f126777b = "";
                aVar.f126778c = "";
                aVar.f126779d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126776a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126777b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126778c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f126779d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126780e = ByteviewUser.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Subtitle subtitle) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subtitle.content);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, subtitle.language);
                if (subtitle.speaker_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, subtitle.speaker_user_id);
                }
                if (subtitle.speaker_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, subtitle.speaker_device_id);
                }
                if (subtitle.speaker != null) {
                    ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 5, subtitle.speaker);
                }
                protoWriter.writeBytes(subtitle.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$Subtitle$a */
        public static final class C50867a extends Message.Builder<Subtitle, C50867a> {

            /* renamed from: a */
            public String f126776a;

            /* renamed from: b */
            public String f126777b;

            /* renamed from: c */
            public String f126778c;

            /* renamed from: d */
            public String f126779d;

            /* renamed from: e */
            public ByteviewUser f126780e;

            /* renamed from: a */
            public Subtitle build() {
                String str;
                String str2 = this.f126776a;
                if (str2 != null && (str = this.f126777b) != null) {
                    return new Subtitle(str2, str, this.f126778c, this.f126779d, this.f126780e, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "content", this.f126777b, "language");
            }
        }

        @Override // com.squareup.wire.Message
        public C50867a newBuilder() {
            C50867a aVar = new C50867a();
            aVar.f126776a = this.content;
            aVar.f126777b = this.language;
            aVar.f126778c = this.speaker_user_id;
            aVar.f126779d = this.speaker_device_id;
            aVar.f126780e = this.speaker;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Subtitle");
            StringBuilder sb = new StringBuilder();
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", language=");
            sb.append(this.language);
            if (this.speaker_user_id != null) {
                sb.append(", speaker_user_id=");
                sb.append(this.speaker_user_id);
            }
            if (this.speaker_device_id != null) {
                sb.append(", speaker_device_id=");
                sb.append(this.speaker_device_id);
            }
            if (this.speaker != null) {
                sb.append(", speaker=");
                sb.append(this.speaker);
            }
            StringBuilder replace = sb.replace(0, 2, "Subtitle{");
            replace.append('}');
            return replace.toString();
        }

        public Subtitle(String str, String str2, String str3, String str4, ByteviewUser byteviewUser) {
            this(str, str2, str3, str4, byteviewUser, ByteString.EMPTY);
        }

        public Subtitle(String str, String str2, String str3, String str4, ByteviewUser byteviewUser, ByteString byteString) {
            super(ADAPTER, byteString);
            this.content = str;
            this.language = str2;
            this.speaker_user_id = str3;
            this.speaker_device_id = str4;
            this.speaker = byteviewUser;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$b */
    private static final class C50874b extends ProtoAdapter<MeetingSubtitleData> {
        C50874b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingSubtitleData.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingSubtitleData meetingSubtitleData) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingSubtitleData.meeting_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, meetingSubtitleData.seg_id) + SubtitleType.ADAPTER.encodedSizeWithTag(3, meetingSubtitleData.subtitle_type);
            int i9 = 0;
            if (meetingSubtitleData.source != null) {
                i = Subtitle.ADAPTER.encodedSizeWithTag(4, meetingSubtitleData.source);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (meetingSubtitleData.target != null) {
                i2 = Subtitle.ADAPTER.encodedSizeWithTag(5, meetingSubtitleData.target);
            } else {
                i2 = 0;
            }
            int i11 = i10 + i2;
            if (meetingSubtitleData.timestamp != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(6, meetingSubtitleData.timestamp);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (meetingSubtitleData.slice_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(7, meetingSubtitleData.slice_id);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (meetingSubtitleData.is_seg_final != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(8, meetingSubtitleData.is_seg_final);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (meetingSubtitleData.track_received != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(9, meetingSubtitleData.track_received);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (meetingSubtitleData.event != null) {
                i7 = SubtitleEvent.ADAPTER.encodedSizeWithTag(10, meetingSubtitleData.event);
            } else {
                i7 = 0;
            }
            int i16 = i15 + i7;
            if (meetingSubtitleData.seg_id_str != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(11, meetingSubtitleData.seg_id_str);
            } else {
                i8 = 0;
            }
            int i17 = i16 + i8;
            if (meetingSubtitleData.sound_type != null) {
                i9 = SoundType.ADAPTER.encodedSizeWithTag(12, meetingSubtitleData.sound_type);
            }
            return i17 + i9 + meetingSubtitleData.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingSubtitleData decode(ProtoReader protoReader) throws IOException {
            C50873a aVar = new C50873a();
            aVar.f126786a = "";
            aVar.f126787b = 0L;
            aVar.f126788c = SubtitleType.UNKNOWN;
            aVar.f126791f = 0L;
            aVar.f126792g = 0L;
            aVar.f126793h = false;
            aVar.f126794i = false;
            aVar.f126796k = "";
            aVar.f126797l = SoundType.NORMAL;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126786a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126787b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f126788c = SubtitleType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f126789d = Subtitle.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126790e = Subtitle.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126791f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126792g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126793h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126794i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126795j = SubtitleEvent.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126796k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            try {
                                aVar.f126797l = SoundType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, MeetingSubtitleData meetingSubtitleData) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingSubtitleData.meeting_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, meetingSubtitleData.seg_id);
            SubtitleType.ADAPTER.encodeWithTag(protoWriter, 3, meetingSubtitleData.subtitle_type);
            if (meetingSubtitleData.source != null) {
                Subtitle.ADAPTER.encodeWithTag(protoWriter, 4, meetingSubtitleData.source);
            }
            if (meetingSubtitleData.target != null) {
                Subtitle.ADAPTER.encodeWithTag(protoWriter, 5, meetingSubtitleData.target);
            }
            if (meetingSubtitleData.timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, meetingSubtitleData.timestamp);
            }
            if (meetingSubtitleData.slice_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, meetingSubtitleData.slice_id);
            }
            if (meetingSubtitleData.is_seg_final != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, meetingSubtitleData.is_seg_final);
            }
            if (meetingSubtitleData.track_received != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, meetingSubtitleData.track_received);
            }
            if (meetingSubtitleData.event != null) {
                SubtitleEvent.ADAPTER.encodeWithTag(protoWriter, 10, meetingSubtitleData.event);
            }
            if (meetingSubtitleData.seg_id_str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, meetingSubtitleData.seg_id_str);
            }
            if (meetingSubtitleData.sound_type != null) {
                SoundType.ADAPTER.encodeWithTag(protoWriter, 12, meetingSubtitleData.sound_type);
            }
            protoWriter.writeBytes(meetingSubtitleData.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50873a newBuilder() {
        C50873a aVar = new C50873a();
        aVar.f126786a = this.meeting_id;
        aVar.f126787b = this.seg_id;
        aVar.f126788c = this.subtitle_type;
        aVar.f126789d = this.source;
        aVar.f126790e = this.target;
        aVar.f126791f = this.timestamp;
        aVar.f126792g = this.slice_id;
        aVar.f126793h = this.is_seg_final;
        aVar.f126794i = this.track_received;
        aVar.f126795j = this.event;
        aVar.f126796k = this.seg_id_str;
        aVar.f126797l = this.sound_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MeetingSubtitleData$a */
    public static final class C50873a extends Message.Builder<MeetingSubtitleData, C50873a> {

        /* renamed from: a */
        public String f126786a;

        /* renamed from: b */
        public Long f126787b;

        /* renamed from: c */
        public SubtitleType f126788c;

        /* renamed from: d */
        public Subtitle f126789d;

        /* renamed from: e */
        public Subtitle f126790e;

        /* renamed from: f */
        public Long f126791f;

        /* renamed from: g */
        public Long f126792g;

        /* renamed from: h */
        public Boolean f126793h;

        /* renamed from: i */
        public Boolean f126794i;

        /* renamed from: j */
        public SubtitleEvent f126795j;

        /* renamed from: k */
        public String f126796k;

        /* renamed from: l */
        public SoundType f126797l;

        /* renamed from: a */
        public MeetingSubtitleData build() {
            Long l;
            SubtitleType subtitleType;
            String str = this.f126786a;
            if (str != null && (l = this.f126787b) != null && (subtitleType = this.f126788c) != null) {
                return new MeetingSubtitleData(str, l, subtitleType, this.f126789d, this.f126790e, this.f126791f, this.f126792g, this.f126793h, this.f126794i, this.f126795j, this.f126796k, this.f126797l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id", this.f126787b, "seg_id", this.f126788c, "subtitle_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MeetingSubtitleData");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", seg_id=");
        sb.append(this.seg_id);
        sb.append(", subtitle_type=");
        sb.append(this.subtitle_type);
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.target != null) {
            sb.append(", target=");
            sb.append(this.target);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        if (this.slice_id != null) {
            sb.append(", slice_id=");
            sb.append(this.slice_id);
        }
        if (this.is_seg_final != null) {
            sb.append(", is_seg_final=");
            sb.append(this.is_seg_final);
        }
        if (this.track_received != null) {
            sb.append(", track_received=");
            sb.append(this.track_received);
        }
        if (this.event != null) {
            sb.append(", event=");
            sb.append(this.event);
        }
        if (this.seg_id_str != null) {
            sb.append(", seg_id_str=");
            sb.append(this.seg_id_str);
        }
        if (this.sound_type != null) {
            sb.append(", sound_type=");
            sb.append(this.sound_type);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingSubtitleData{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingSubtitleData(String str, Long l, SubtitleType subtitleType, Subtitle subtitle, Subtitle subtitle2, Long l2, Long l3, Boolean bool, Boolean bool2, SubtitleEvent subtitleEvent, String str2, SoundType soundType) {
        this(str, l, subtitleType, subtitle, subtitle2, l2, l3, bool, bool2, subtitleEvent, str2, soundType, ByteString.EMPTY);
    }

    public MeetingSubtitleData(String str, Long l, SubtitleType subtitleType, Subtitle subtitle, Subtitle subtitle2, Long l2, Long l3, Boolean bool, Boolean bool2, SubtitleEvent subtitleEvent, String str2, SoundType soundType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.seg_id = l;
        this.subtitle_type = subtitleType;
        this.source = subtitle;
        this.target = subtitle2;
        this.timestamp = l2;
        this.slice_id = l3;
        this.is_seg_final = bool;
        this.track_received = bool2;
        this.event = subtitleEvent;
        this.seg_id_str = str2;
        this.sound_type = soundType;
    }
}
