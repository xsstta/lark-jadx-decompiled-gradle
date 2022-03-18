package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EventVideoMeetingConfig extends Message<EventVideoMeetingConfig, C15622a> {
    public static final ProtoAdapter<EventVideoMeetingConfig> ADAPTER = new C15623b();
    public static final VideoMeeting.VideoMeetingType DEFAULT_VIDEO_MEETING_TYPE = VideoMeeting.VideoMeetingType.UNKNOWN_VIDEO_MEETING_TYPE;
    private static final long serialVersionUID = 0;
    public final GoogleVideoMeetingConfigs google_configs;
    public final String meeting_url;
    public final OtherVideoMeetingConfigs other_configs;
    public final VideoMeeting.VideoMeetingType video_meeting_type;

    public static final class OtherVideoMeetingConfigs extends Message<OtherVideoMeetingConfigs, C15620a> {
        public static final ProtoAdapter<OtherVideoMeetingConfigs> ADAPTER = new C15621b();
        public static final IconType DEFAULT_ICON = IconType.DEFAULT;
        private static final long serialVersionUID = 0;
        public final String customized_description;
        public final IconType icon;

        public enum IconType implements WireEnum {
            DEFAULT(0),
            VIDEO_MEETING(1),
            LIVE(2);
            
            public static final ProtoAdapter<IconType> ADAPTER = ProtoAdapter.newEnumAdapter(IconType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static IconType fromValue(int i) {
                if (i == 0) {
                    return DEFAULT;
                }
                if (i == 1) {
                    return VIDEO_MEETING;
                }
                if (i != 2) {
                    return null;
                }
                return LIVE;
            }

            private IconType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig$OtherVideoMeetingConfigs$b */
        private static final class C15621b extends ProtoAdapter<OtherVideoMeetingConfigs> {
            C15621b() {
                super(FieldEncoding.LENGTH_DELIMITED, OtherVideoMeetingConfigs.class);
            }

            /* renamed from: a */
            public int encodedSize(OtherVideoMeetingConfigs otherVideoMeetingConfigs) {
                int i;
                int i2 = 0;
                if (otherVideoMeetingConfigs.icon != null) {
                    i = IconType.ADAPTER.encodedSizeWithTag(1, otherVideoMeetingConfigs.icon);
                } else {
                    i = 0;
                }
                if (otherVideoMeetingConfigs.customized_description != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, otherVideoMeetingConfigs.customized_description);
                }
                return i + i2 + otherVideoMeetingConfigs.unknownFields().size();
            }

            /* renamed from: a */
            public OtherVideoMeetingConfigs decode(ProtoReader protoReader) throws IOException {
                C15620a aVar = new C15620a();
                aVar.f41374a = IconType.DEFAULT;
                aVar.f41375b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f41374a = IconType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41375b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OtherVideoMeetingConfigs otherVideoMeetingConfigs) throws IOException {
                if (otherVideoMeetingConfigs.icon != null) {
                    IconType.ADAPTER.encodeWithTag(protoWriter, 1, otherVideoMeetingConfigs.icon);
                }
                if (otherVideoMeetingConfigs.customized_description != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, otherVideoMeetingConfigs.customized_description);
                }
                protoWriter.writeBytes(otherVideoMeetingConfigs.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig$OtherVideoMeetingConfigs$a */
        public static final class C15620a extends Message.Builder<OtherVideoMeetingConfigs, C15620a> {

            /* renamed from: a */
            public IconType f41374a;

            /* renamed from: b */
            public String f41375b;

            /* renamed from: a */
            public OtherVideoMeetingConfigs build() {
                return new OtherVideoMeetingConfigs(this.f41374a, this.f41375b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C15620a mo56622a(IconType iconType) {
                this.f41374a = iconType;
                return this;
            }

            /* renamed from: a */
            public C15620a mo56623a(String str) {
                this.f41375b = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C15620a newBuilder() {
            C15620a aVar = new C15620a();
            aVar.f41374a = this.icon;
            aVar.f41375b = this.customized_description;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "OtherVideoMeetingConfigs");
            StringBuilder sb = new StringBuilder();
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.customized_description != null) {
                sb.append(", customized_description=");
                sb.append(this.customized_description);
            }
            StringBuilder replace = sb.replace(0, 2, "OtherVideoMeetingConfigs{");
            replace.append('}');
            return replace.toString();
        }

        public OtherVideoMeetingConfigs(IconType iconType, String str) {
            this(iconType, str, ByteString.EMPTY);
        }

        public OtherVideoMeetingConfigs(IconType iconType, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.icon = iconType;
            this.customized_description = str;
        }
    }

    public static final class GoogleVideoMeetingConfigs extends Message<GoogleVideoMeetingConfigs, C15618a> {
        public static final ProtoAdapter<GoogleVideoMeetingConfigs> ADAPTER = new C15619b();
        private static final long serialVersionUID = 0;
        public final String more_phone_number_url;
        public final String phone_number;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig$GoogleVideoMeetingConfigs$b */
        private static final class C15619b extends ProtoAdapter<GoogleVideoMeetingConfigs> {
            C15619b() {
                super(FieldEncoding.LENGTH_DELIMITED, GoogleVideoMeetingConfigs.class);
            }

            /* renamed from: a */
            public int encodedSize(GoogleVideoMeetingConfigs googleVideoMeetingConfigs) {
                int i;
                int i2 = 0;
                if (googleVideoMeetingConfigs.phone_number != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, googleVideoMeetingConfigs.phone_number);
                } else {
                    i = 0;
                }
                if (googleVideoMeetingConfigs.more_phone_number_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, googleVideoMeetingConfigs.more_phone_number_url);
                }
                return i + i2 + googleVideoMeetingConfigs.unknownFields().size();
            }

            /* renamed from: a */
            public GoogleVideoMeetingConfigs decode(ProtoReader protoReader) throws IOException {
                C15618a aVar = new C15618a();
                aVar.f41372a = "";
                aVar.f41373b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 3) {
                        aVar.f41372a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41373b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, GoogleVideoMeetingConfigs googleVideoMeetingConfigs) throws IOException {
                if (googleVideoMeetingConfigs.phone_number != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, googleVideoMeetingConfigs.phone_number);
                }
                if (googleVideoMeetingConfigs.more_phone_number_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, googleVideoMeetingConfigs.more_phone_number_url);
                }
                protoWriter.writeBytes(googleVideoMeetingConfigs.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig$GoogleVideoMeetingConfigs$a */
        public static final class C15618a extends Message.Builder<GoogleVideoMeetingConfigs, C15618a> {

            /* renamed from: a */
            public String f41372a;

            /* renamed from: b */
            public String f41373b;

            /* renamed from: a */
            public GoogleVideoMeetingConfigs build() {
                return new GoogleVideoMeetingConfigs(this.f41372a, this.f41373b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15618a newBuilder() {
            C15618a aVar = new C15618a();
            aVar.f41372a = this.phone_number;
            aVar.f41373b = this.more_phone_number_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "GoogleVideoMeetingConfigs");
            StringBuilder sb = new StringBuilder();
            if (this.phone_number != null) {
                sb.append(", phone_number=");
                sb.append(this.phone_number);
            }
            if (this.more_phone_number_url != null) {
                sb.append(", more_phone_number_url=");
                sb.append(this.more_phone_number_url);
            }
            StringBuilder replace = sb.replace(0, 2, "GoogleVideoMeetingConfigs{");
            replace.append('}');
            return replace.toString();
        }

        public GoogleVideoMeetingConfigs(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public GoogleVideoMeetingConfigs(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.phone_number = str;
            this.more_phone_number_url = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig$b */
    private static final class C15623b extends ProtoAdapter<EventVideoMeetingConfig> {
        C15623b() {
            super(FieldEncoding.LENGTH_DELIMITED, EventVideoMeetingConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(EventVideoMeetingConfig eventVideoMeetingConfig) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (eventVideoMeetingConfig.video_meeting_type != null) {
                i = VideoMeeting.VideoMeetingType.ADAPTER.encodedSizeWithTag(1, eventVideoMeetingConfig.video_meeting_type);
            } else {
                i = 0;
            }
            if (eventVideoMeetingConfig.meeting_url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, eventVideoMeetingConfig.meeting_url);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (eventVideoMeetingConfig.other_configs != null) {
                i3 = OtherVideoMeetingConfigs.ADAPTER.encodedSizeWithTag(101, eventVideoMeetingConfig.other_configs);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (eventVideoMeetingConfig.google_configs != null) {
                i4 = GoogleVideoMeetingConfigs.ADAPTER.encodedSizeWithTag(102, eventVideoMeetingConfig.google_configs);
            }
            return i6 + i4 + eventVideoMeetingConfig.unknownFields().size();
        }

        /* renamed from: a */
        public EventVideoMeetingConfig decode(ProtoReader protoReader) throws IOException {
            C15622a aVar = new C15622a();
            aVar.f41376a = VideoMeeting.VideoMeetingType.UNKNOWN_VIDEO_MEETING_TYPE;
            aVar.f41377b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f41376a = VideoMeeting.VideoMeetingType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f41377b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 101) {
                    aVar.mo56629a(OtherVideoMeetingConfigs.ADAPTER.decode(protoReader));
                } else if (nextTag != 102) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo56628a(GoogleVideoMeetingConfigs.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EventVideoMeetingConfig eventVideoMeetingConfig) throws IOException {
            if (eventVideoMeetingConfig.video_meeting_type != null) {
                VideoMeeting.VideoMeetingType.ADAPTER.encodeWithTag(protoWriter, 1, eventVideoMeetingConfig.video_meeting_type);
            }
            if (eventVideoMeetingConfig.meeting_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventVideoMeetingConfig.meeting_url);
            }
            if (eventVideoMeetingConfig.other_configs != null) {
                OtherVideoMeetingConfigs.ADAPTER.encodeWithTag(protoWriter, 101, eventVideoMeetingConfig.other_configs);
            }
            if (eventVideoMeetingConfig.google_configs != null) {
                GoogleVideoMeetingConfigs.ADAPTER.encodeWithTag(protoWriter, 102, eventVideoMeetingConfig.google_configs);
            }
            protoWriter.writeBytes(eventVideoMeetingConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig$a */
    public static final class C15622a extends Message.Builder<EventVideoMeetingConfig, C15622a> {

        /* renamed from: a */
        public VideoMeeting.VideoMeetingType f41376a;

        /* renamed from: b */
        public String f41377b;

        /* renamed from: c */
        public OtherVideoMeetingConfigs f41378c;

        /* renamed from: d */
        public GoogleVideoMeetingConfigs f41379d;

        /* renamed from: a */
        public EventVideoMeetingConfig build() {
            return new EventVideoMeetingConfig(this.f41376a, this.f41377b, this.f41378c, this.f41379d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15622a mo56628a(GoogleVideoMeetingConfigs googleVideoMeetingConfigs) {
            this.f41379d = googleVideoMeetingConfigs;
            this.f41378c = null;
            return this;
        }

        /* renamed from: a */
        public C15622a mo56629a(OtherVideoMeetingConfigs otherVideoMeetingConfigs) {
            this.f41378c = otherVideoMeetingConfigs;
            this.f41379d = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15622a newBuilder() {
        C15622a aVar = new C15622a();
        aVar.f41376a = this.video_meeting_type;
        aVar.f41377b = this.meeting_url;
        aVar.f41378c = this.other_configs;
        aVar.f41379d = this.google_configs;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "EventVideoMeetingConfig");
        StringBuilder sb = new StringBuilder();
        if (this.video_meeting_type != null) {
            sb.append(", video_meeting_type=");
            sb.append(this.video_meeting_type);
        }
        if (this.meeting_url != null) {
            sb.append(", meeting_url=");
            sb.append(this.meeting_url);
        }
        if (this.other_configs != null) {
            sb.append(", other_configs=");
            sb.append(this.other_configs);
        }
        if (this.google_configs != null) {
            sb.append(", google_configs=");
            sb.append(this.google_configs);
        }
        StringBuilder replace = sb.replace(0, 2, "EventVideoMeetingConfig{");
        replace.append('}');
        return replace.toString();
    }

    public EventVideoMeetingConfig(VideoMeeting.VideoMeetingType videoMeetingType, String str, OtherVideoMeetingConfigs otherVideoMeetingConfigs, GoogleVideoMeetingConfigs googleVideoMeetingConfigs) {
        this(videoMeetingType, str, otherVideoMeetingConfigs, googleVideoMeetingConfigs, ByteString.EMPTY);
    }

    public EventVideoMeetingConfig(VideoMeeting.VideoMeetingType videoMeetingType, String str, OtherVideoMeetingConfigs otherVideoMeetingConfigs, GoogleVideoMeetingConfigs googleVideoMeetingConfigs, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(otherVideoMeetingConfigs, googleVideoMeetingConfigs) <= 1) {
            this.video_meeting_type = videoMeetingType;
            this.meeting_url = str;
            this.other_configs = otherVideoMeetingConfigs;
            this.google_configs = googleVideoMeetingConfigs;
            return;
        }
        throw new IllegalArgumentException("at most one of other_configs, google_configs may be non-null");
    }
}
