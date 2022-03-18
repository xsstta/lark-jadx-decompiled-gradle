package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ViewUserSetting extends Message<ViewUserSetting, C51316a> {
    public static final ProtoAdapter<ViewUserSetting> ADAPTER = new C51317b();
    public static final Boolean DEFAULT_IF_DIRECT_TO_PEOPLE_AFTER_INTERVIEW = true;
    private static final long serialVersionUID = 0;
    public final Audio audio;
    public final GoogleToken google_token;
    public final Boolean if_direct_to_people_after_interview;
    public final MagicShare magic_share;
    public final MeetingAdvanced meeting_advanced;
    public final MeetingGeneral meeting_general;
    public final MeetingHost meeting_host;
    public final Video video;

    public static final class MeetingAdvanced extends Message<MeetingAdvanced, C51308a> {
        public static final ProtoAdapter<MeetingAdvanced> ADAPTER = new C51309b();
        private static final long serialVersionUID = 0;
        public final Interpretation interpretation;
        public final Subtitle subtitle;

        public static final class Interpretation extends Message<Interpretation, C51304a> {
            public static final ProtoAdapter<Interpretation> ADAPTER = new C51305b();
            public static final Boolean DEFAULT_CAN_OPEN_INTERPRETATION = false;
            private static final long serialVersionUID = 0;
            public final Boolean can_open_interpretation;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingAdvanced$Interpretation$b */
            private static final class C51305b extends ProtoAdapter<Interpretation> {
                C51305b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Interpretation.class);
                }

                /* renamed from: a */
                public int encodedSize(Interpretation interpretation) {
                    int i;
                    if (interpretation.can_open_interpretation != null) {
                        i = ProtoAdapter.BOOL.encodedSizeWithTag(1, interpretation.can_open_interpretation);
                    } else {
                        i = 0;
                    }
                    return i + interpretation.unknownFields().size();
                }

                /* renamed from: a */
                public Interpretation decode(ProtoReader protoReader) throws IOException {
                    C51304a aVar = new C51304a();
                    aVar.f127785a = false;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag != 1) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f127785a = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Interpretation interpretation) throws IOException {
                    if (interpretation.can_open_interpretation != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, interpretation.can_open_interpretation);
                    }
                    protoWriter.writeBytes(interpretation.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingAdvanced$Interpretation$a */
            public static final class C51304a extends Message.Builder<Interpretation, C51304a> {

                /* renamed from: a */
                public Boolean f127785a;

                /* renamed from: a */
                public Interpretation build() {
                    return new Interpretation(this.f127785a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C51304a newBuilder() {
                C51304a aVar = new C51304a();
                aVar.f127785a = this.can_open_interpretation;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "Interpretation");
                StringBuilder sb = new StringBuilder();
                if (this.can_open_interpretation != null) {
                    sb.append(", can_open_interpretation=");
                    sb.append(this.can_open_interpretation);
                }
                StringBuilder replace = sb.replace(0, 2, "Interpretation{");
                replace.append('}');
                return replace.toString();
            }

            public Interpretation(Boolean bool) {
                this(bool, ByteString.EMPTY);
            }

            public Interpretation(Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                this.can_open_interpretation = bool;
            }
        }

        public static final class Subtitle extends Message<Subtitle, C51306a> {
            public static final ProtoAdapter<Subtitle> ADAPTER = new C51307b();
            public static final Boolean DEFAULT_TURN_ON_SUBTITLE_WHEN_JOIN = false;
            private static final long serialVersionUID = 0;
            public final Boolean turn_on_subtitle_when_join;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingAdvanced$Subtitle$b */
            private static final class C51307b extends ProtoAdapter<Subtitle> {
                C51307b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Subtitle.class);
                }

                /* renamed from: a */
                public int encodedSize(Subtitle subtitle) {
                    int i;
                    if (subtitle.turn_on_subtitle_when_join != null) {
                        i = ProtoAdapter.BOOL.encodedSizeWithTag(1, subtitle.turn_on_subtitle_when_join);
                    } else {
                        i = 0;
                    }
                    return i + subtitle.unknownFields().size();
                }

                /* renamed from: a */
                public Subtitle decode(ProtoReader protoReader) throws IOException {
                    C51306a aVar = new C51306a();
                    aVar.f127786a = false;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag != 1) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f127786a = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Subtitle subtitle) throws IOException {
                    if (subtitle.turn_on_subtitle_when_join != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, subtitle.turn_on_subtitle_when_join);
                    }
                    protoWriter.writeBytes(subtitle.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingAdvanced$Subtitle$a */
            public static final class C51306a extends Message.Builder<Subtitle, C51306a> {

                /* renamed from: a */
                public Boolean f127786a;

                /* renamed from: a */
                public Subtitle build() {
                    return new Subtitle(this.f127786a, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C51306a newBuilder() {
                C51306a aVar = new C51306a();
                aVar.f127786a = this.turn_on_subtitle_when_join;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "Subtitle");
                StringBuilder sb = new StringBuilder();
                if (this.turn_on_subtitle_when_join != null) {
                    sb.append(", turn_on_subtitle_when_join=");
                    sb.append(this.turn_on_subtitle_when_join);
                }
                StringBuilder replace = sb.replace(0, 2, "Subtitle{");
                replace.append('}');
                return replace.toString();
            }

            public Subtitle(Boolean bool) {
                this(bool, ByteString.EMPTY);
            }

            public Subtitle(Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                this.turn_on_subtitle_when_join = bool;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingAdvanced$b */
        private static final class C51309b extends ProtoAdapter<MeetingAdvanced> {
            C51309b() {
                super(FieldEncoding.LENGTH_DELIMITED, MeetingAdvanced.class);
            }

            /* renamed from: a */
            public int encodedSize(MeetingAdvanced meetingAdvanced) {
                int i;
                int i2 = 0;
                if (meetingAdvanced.subtitle != null) {
                    i = Subtitle.ADAPTER.encodedSizeWithTag(1, meetingAdvanced.subtitle);
                } else {
                    i = 0;
                }
                if (meetingAdvanced.interpretation != null) {
                    i2 = Interpretation.ADAPTER.encodedSizeWithTag(2, meetingAdvanced.interpretation);
                }
                return i + i2 + meetingAdvanced.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingAdvanced decode(ProtoReader protoReader) throws IOException {
                C51308a aVar = new C51308a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127787a = Subtitle.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127788b = Interpretation.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MeetingAdvanced meetingAdvanced) throws IOException {
                if (meetingAdvanced.subtitle != null) {
                    Subtitle.ADAPTER.encodeWithTag(protoWriter, 1, meetingAdvanced.subtitle);
                }
                if (meetingAdvanced.interpretation != null) {
                    Interpretation.ADAPTER.encodeWithTag(protoWriter, 2, meetingAdvanced.interpretation);
                }
                protoWriter.writeBytes(meetingAdvanced.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingAdvanced$a */
        public static final class C51308a extends Message.Builder<MeetingAdvanced, C51308a> {

            /* renamed from: a */
            public Subtitle f127787a;

            /* renamed from: b */
            public Interpretation f127788b;

            /* renamed from: a */
            public MeetingAdvanced build() {
                return new MeetingAdvanced(this.f127787a, this.f127788b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51308a newBuilder() {
            C51308a aVar = new C51308a();
            aVar.f127787a = this.subtitle;
            aVar.f127788b = this.interpretation;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MeetingAdvanced");
            StringBuilder sb = new StringBuilder();
            if (this.subtitle != null) {
                sb.append(", subtitle=");
                sb.append(this.subtitle);
            }
            if (this.interpretation != null) {
                sb.append(", interpretation=");
                sb.append(this.interpretation);
            }
            StringBuilder replace = sb.replace(0, 2, "MeetingAdvanced{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingAdvanced(Subtitle subtitle2, Interpretation interpretation2) {
            this(subtitle2, interpretation2, ByteString.EMPTY);
        }

        public MeetingAdvanced(Subtitle subtitle2, Interpretation interpretation2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.subtitle = subtitle2;
            this.interpretation = interpretation2;
        }
    }

    public static final class Audio extends Message<Audio, C51298a> {
        public static final ProtoAdapter<Audio> ADAPTER = new C51299b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$Audio$b */
        private static final class C51299b extends ProtoAdapter<Audio> {
            C51299b() {
                super(FieldEncoding.LENGTH_DELIMITED, Audio.class);
            }

            /* renamed from: a */
            public int encodedSize(Audio audio) {
                return audio.unknownFields().size();
            }

            /* renamed from: a */
            public Audio decode(ProtoReader protoReader) throws IOException {
                C51298a aVar = new C51298a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Audio audio) throws IOException {
                protoWriter.writeBytes(audio.unknownFields());
            }
        }

        public Audio() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$Audio$a */
        public static final class C51298a extends Message.Builder<Audio, C51298a> {
            /* renamed from: a */
            public Audio build() {
                return new Audio(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51298a newBuilder() {
            C51298a aVar = new C51298a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Audio");
            StringBuilder replace = new StringBuilder().replace(0, 2, "Audio{");
            replace.append('}');
            return replace.toString();
        }

        public Audio(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class GoogleToken extends Message<GoogleToken, C51300a> {
        public static final ProtoAdapter<GoogleToken> ADAPTER = new C51301b();
        public static final Boolean DEFAULT_BIND = false;
        public static final Boolean DEFAULT_BOUND_BEFORE = false;
        private static final long serialVersionUID = 0;
        public final Boolean bind;
        public final Boolean bound_before;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$GoogleToken$b */
        private static final class C51301b extends ProtoAdapter<GoogleToken> {
            C51301b() {
                super(FieldEncoding.LENGTH_DELIMITED, GoogleToken.class);
            }

            /* renamed from: a */
            public int encodedSize(GoogleToken googleToken) {
                int i;
                int i2 = 0;
                if (googleToken.bind != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, googleToken.bind);
                } else {
                    i = 0;
                }
                if (googleToken.bound_before != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, googleToken.bound_before);
                }
                return i + i2 + googleToken.unknownFields().size();
            }

            /* renamed from: a */
            public GoogleToken decode(ProtoReader protoReader) throws IOException {
                C51300a aVar = new C51300a();
                aVar.f127782a = false;
                aVar.f127783b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127782a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127783b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, GoogleToken googleToken) throws IOException {
                if (googleToken.bind != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, googleToken.bind);
                }
                if (googleToken.bound_before != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, googleToken.bound_before);
                }
                protoWriter.writeBytes(googleToken.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$GoogleToken$a */
        public static final class C51300a extends Message.Builder<GoogleToken, C51300a> {

            /* renamed from: a */
            public Boolean f127782a;

            /* renamed from: b */
            public Boolean f127783b;

            /* renamed from: a */
            public GoogleToken build() {
                return new GoogleToken(this.f127782a, this.f127783b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51300a newBuilder() {
            C51300a aVar = new C51300a();
            aVar.f127782a = this.bind;
            aVar.f127783b = this.bound_before;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "GoogleToken");
            StringBuilder sb = new StringBuilder();
            if (this.bind != null) {
                sb.append(", bind=");
                sb.append(this.bind);
            }
            if (this.bound_before != null) {
                sb.append(", bound_before=");
                sb.append(this.bound_before);
            }
            StringBuilder replace = sb.replace(0, 2, "GoogleToken{");
            replace.append('}');
            return replace.toString();
        }

        public GoogleToken(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public GoogleToken(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.bind = bool;
            this.bound_before = bool2;
        }
    }

    public static final class MagicShare extends Message<MagicShare, C51302a> {
        public static final ProtoAdapter<MagicShare> ADAPTER = new C51303b();
        public static final Boolean DEFAULT_ALLOW_OPEN = true;
        private static final long serialVersionUID = 0;
        public final Boolean allow_open;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MagicShare$b */
        private static final class C51303b extends ProtoAdapter<MagicShare> {
            C51303b() {
                super(FieldEncoding.LENGTH_DELIMITED, MagicShare.class);
            }

            /* renamed from: a */
            public int encodedSize(MagicShare magicShare) {
                int i;
                if (magicShare.allow_open != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, magicShare.allow_open);
                } else {
                    i = 0;
                }
                return i + magicShare.unknownFields().size();
            }

            /* renamed from: a */
            public MagicShare decode(ProtoReader protoReader) throws IOException {
                C51302a aVar = new C51302a();
                aVar.f127784a = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127784a = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MagicShare magicShare) throws IOException {
                if (magicShare.allow_open != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, magicShare.allow_open);
                }
                protoWriter.writeBytes(magicShare.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MagicShare$a */
        public static final class C51302a extends Message.Builder<MagicShare, C51302a> {

            /* renamed from: a */
            public Boolean f127784a;

            /* renamed from: a */
            public MagicShare build() {
                return new MagicShare(this.f127784a, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C51302a mo176853a(Boolean bool) {
                this.f127784a = bool;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C51302a newBuilder() {
            C51302a aVar = new C51302a();
            aVar.f127784a = this.allow_open;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MagicShare");
            StringBuilder sb = new StringBuilder();
            if (this.allow_open != null) {
                sb.append(", allow_open=");
                sb.append(this.allow_open);
            }
            StringBuilder replace = sb.replace(0, 2, "MagicShare{");
            replace.append('}');
            return replace.toString();
        }

        public MagicShare(Boolean bool) {
            this(bool, ByteString.EMPTY);
        }

        public MagicShare(Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.allow_open = bool;
        }
    }

    public static final class MeetingGeneral extends Message<MeetingGeneral, C51310a> {
        public static final ProtoAdapter<MeetingGeneral> ADAPTER = new C51311b();
        public static final Boolean DEFAULT_CALENDAR_MEETING_START_NOTIFY = true;
        public static final Boolean DEFAULT_PLAY_ENTER_EXIT_CHIMES = true;
        private static final long serialVersionUID = 0;
        public final Boolean calendar_meeting_start_notify;
        public final Boolean play_enter_exit_chimes;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingGeneral$b */
        private static final class C51311b extends ProtoAdapter<MeetingGeneral> {
            C51311b() {
                super(FieldEncoding.LENGTH_DELIMITED, MeetingGeneral.class);
            }

            /* renamed from: a */
            public int encodedSize(MeetingGeneral meetingGeneral) {
                int i;
                int i2 = 0;
                if (meetingGeneral.play_enter_exit_chimes != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, meetingGeneral.play_enter_exit_chimes);
                } else {
                    i = 0;
                }
                if (meetingGeneral.calendar_meeting_start_notify != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, meetingGeneral.calendar_meeting_start_notify);
                }
                return i + i2 + meetingGeneral.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingGeneral decode(ProtoReader protoReader) throws IOException {
                C51310a aVar = new C51310a();
                aVar.f127789a = true;
                aVar.f127790b = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127789a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127790b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MeetingGeneral meetingGeneral) throws IOException {
                if (meetingGeneral.play_enter_exit_chimes != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, meetingGeneral.play_enter_exit_chimes);
                }
                if (meetingGeneral.calendar_meeting_start_notify != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, meetingGeneral.calendar_meeting_start_notify);
                }
                protoWriter.writeBytes(meetingGeneral.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingGeneral$a */
        public static final class C51310a extends Message.Builder<MeetingGeneral, C51310a> {

            /* renamed from: a */
            public Boolean f127789a;

            /* renamed from: b */
            public Boolean f127790b;

            /* renamed from: a */
            public MeetingGeneral build() {
                return new MeetingGeneral(this.f127789a, this.f127790b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51310a newBuilder() {
            C51310a aVar = new C51310a();
            aVar.f127789a = this.play_enter_exit_chimes;
            aVar.f127790b = this.calendar_meeting_start_notify;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MeetingGeneral");
            StringBuilder sb = new StringBuilder();
            if (this.play_enter_exit_chimes != null) {
                sb.append(", play_enter_exit_chimes=");
                sb.append(this.play_enter_exit_chimes);
            }
            if (this.calendar_meeting_start_notify != null) {
                sb.append(", calendar_meeting_start_notify=");
                sb.append(this.calendar_meeting_start_notify);
            }
            StringBuilder replace = sb.replace(0, 2, "MeetingGeneral{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingGeneral(Boolean bool, Boolean bool2) {
            this(bool, bool2, ByteString.EMPTY);
        }

        public MeetingGeneral(Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.play_enter_exit_chimes = bool;
            this.calendar_meeting_start_notify = bool2;
        }
    }

    public static final class MeetingHost extends Message<MeetingHost, C51312a> {
        public static final ProtoAdapter<MeetingHost> ADAPTER = new C51313b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingHost$b */
        private static final class C51313b extends ProtoAdapter<MeetingHost> {
            C51313b() {
                super(FieldEncoding.LENGTH_DELIMITED, MeetingHost.class);
            }

            /* renamed from: a */
            public int encodedSize(MeetingHost meetingHost) {
                return meetingHost.unknownFields().size();
            }

            /* renamed from: a */
            public MeetingHost decode(ProtoReader protoReader) throws IOException {
                C51312a aVar = new C51312a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MeetingHost meetingHost) throws IOException {
                protoWriter.writeBytes(meetingHost.unknownFields());
            }
        }

        public MeetingHost() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$MeetingHost$a */
        public static final class C51312a extends Message.Builder<MeetingHost, C51312a> {
            /* renamed from: a */
            public MeetingHost build() {
                return new MeetingHost(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51312a newBuilder() {
            C51312a aVar = new C51312a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "MeetingHost");
            StringBuilder replace = new StringBuilder().replace(0, 2, "MeetingHost{");
            replace.append('}');
            return replace.toString();
        }

        public MeetingHost(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class Video extends Message<Video, C51314a> {
        public static final ProtoAdapter<Video> ADAPTER = new C51315b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$Video$b */
        private static final class C51315b extends ProtoAdapter<Video> {
            C51315b() {
                super(FieldEncoding.LENGTH_DELIMITED, Video.class);
            }

            /* renamed from: a */
            public int encodedSize(Video video) {
                return video.unknownFields().size();
            }

            /* renamed from: a */
            public Video decode(ProtoReader protoReader) throws IOException {
                C51314a aVar = new C51314a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Video video) throws IOException {
                protoWriter.writeBytes(video.unknownFields());
            }
        }

        public Video() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$Video$a */
        public static final class C51314a extends Message.Builder<Video, C51314a> {
            /* renamed from: a */
            public Video build() {
                return new Video(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51314a newBuilder() {
            C51314a aVar = new C51314a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Video");
            StringBuilder replace = new StringBuilder().replace(0, 2, "Video{");
            replace.append('}');
            return replace.toString();
        }

        public Video(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$b */
    private static final class C51317b extends ProtoAdapter<ViewUserSetting> {
        C51317b() {
            super(FieldEncoding.LENGTH_DELIMITED, ViewUserSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ViewUserSetting viewUserSetting) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (viewUserSetting.audio != null) {
                i = Audio.ADAPTER.encodedSizeWithTag(1, viewUserSetting.audio);
            } else {
                i = 0;
            }
            if (viewUserSetting.video != null) {
                i2 = Video.ADAPTER.encodedSizeWithTag(2, viewUserSetting.video);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (viewUserSetting.meeting_general != null) {
                i3 = MeetingGeneral.ADAPTER.encodedSizeWithTag(3, viewUserSetting.meeting_general);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (viewUserSetting.meeting_host != null) {
                i4 = MeetingHost.ADAPTER.encodedSizeWithTag(4, viewUserSetting.meeting_host);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (viewUserSetting.meeting_advanced != null) {
                i5 = MeetingAdvanced.ADAPTER.encodedSizeWithTag(5, viewUserSetting.meeting_advanced);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (viewUserSetting.google_token != null) {
                i6 = GoogleToken.ADAPTER.encodedSizeWithTag(6, viewUserSetting.google_token);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (viewUserSetting.magic_share != null) {
                i7 = MagicShare.ADAPTER.encodedSizeWithTag(7, viewUserSetting.magic_share);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (viewUserSetting.if_direct_to_people_after_interview != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, viewUserSetting.if_direct_to_people_after_interview);
            }
            return i14 + i8 + viewUserSetting.unknownFields().size();
        }

        /* renamed from: a */
        public ViewUserSetting decode(ProtoReader protoReader) throws IOException {
            C51316a aVar = new C51316a();
            aVar.f127798h = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127791a = Audio.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127792b = Video.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127793c = MeetingGeneral.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127794d = MeetingHost.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127795e = MeetingAdvanced.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127796f = GoogleToken.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127797g = MagicShare.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127798h = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ViewUserSetting viewUserSetting) throws IOException {
            if (viewUserSetting.audio != null) {
                Audio.ADAPTER.encodeWithTag(protoWriter, 1, viewUserSetting.audio);
            }
            if (viewUserSetting.video != null) {
                Video.ADAPTER.encodeWithTag(protoWriter, 2, viewUserSetting.video);
            }
            if (viewUserSetting.meeting_general != null) {
                MeetingGeneral.ADAPTER.encodeWithTag(protoWriter, 3, viewUserSetting.meeting_general);
            }
            if (viewUserSetting.meeting_host != null) {
                MeetingHost.ADAPTER.encodeWithTag(protoWriter, 4, viewUserSetting.meeting_host);
            }
            if (viewUserSetting.meeting_advanced != null) {
                MeetingAdvanced.ADAPTER.encodeWithTag(protoWriter, 5, viewUserSetting.meeting_advanced);
            }
            if (viewUserSetting.google_token != null) {
                GoogleToken.ADAPTER.encodeWithTag(protoWriter, 6, viewUserSetting.google_token);
            }
            if (viewUserSetting.magic_share != null) {
                MagicShare.ADAPTER.encodeWithTag(protoWriter, 7, viewUserSetting.magic_share);
            }
            if (viewUserSetting.if_direct_to_people_after_interview != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, viewUserSetting.if_direct_to_people_after_interview);
            }
            protoWriter.writeBytes(viewUserSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewUserSetting$a */
    public static final class C51316a extends Message.Builder<ViewUserSetting, C51316a> {

        /* renamed from: a */
        public Audio f127791a;

        /* renamed from: b */
        public Video f127792b;

        /* renamed from: c */
        public MeetingGeneral f127793c;

        /* renamed from: d */
        public MeetingHost f127794d;

        /* renamed from: e */
        public MeetingAdvanced f127795e;

        /* renamed from: f */
        public GoogleToken f127796f;

        /* renamed from: g */
        public MagicShare f127797g;

        /* renamed from: h */
        public Boolean f127798h;

        /* renamed from: a */
        public ViewUserSetting build() {
            return new ViewUserSetting(this.f127791a, this.f127792b, this.f127793c, this.f127794d, this.f127795e, this.f127796f, this.f127797g, this.f127798h, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51316a mo176882a(MagicShare magicShare) {
            this.f127797g = magicShare;
            return this;
        }

        /* renamed from: a */
        public C51316a mo176883a(MeetingAdvanced meetingAdvanced) {
            this.f127795e = meetingAdvanced;
            return this;
        }

        /* renamed from: a */
        public C51316a mo176884a(MeetingGeneral meetingGeneral) {
            this.f127793c = meetingGeneral;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51316a newBuilder() {
        C51316a aVar = new C51316a();
        aVar.f127791a = this.audio;
        aVar.f127792b = this.video;
        aVar.f127793c = this.meeting_general;
        aVar.f127794d = this.meeting_host;
        aVar.f127795e = this.meeting_advanced;
        aVar.f127796f = this.google_token;
        aVar.f127797g = this.magic_share;
        aVar.f127798h = this.if_direct_to_people_after_interview;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ViewUserSetting");
        StringBuilder sb = new StringBuilder();
        if (this.audio != null) {
            sb.append(", audio=");
            sb.append(this.audio);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.meeting_general != null) {
            sb.append(", meeting_general=");
            sb.append(this.meeting_general);
        }
        if (this.meeting_host != null) {
            sb.append(", meeting_host=");
            sb.append(this.meeting_host);
        }
        if (this.meeting_advanced != null) {
            sb.append(", meeting_advanced=");
            sb.append(this.meeting_advanced);
        }
        if (this.google_token != null) {
            sb.append(", google_token=");
            sb.append(this.google_token);
        }
        if (this.magic_share != null) {
            sb.append(", magic_share=");
            sb.append(this.magic_share);
        }
        if (this.if_direct_to_people_after_interview != null) {
            sb.append(", if_direct_to_people_after_interview=");
            sb.append(this.if_direct_to_people_after_interview);
        }
        StringBuilder replace = sb.replace(0, 2, "ViewUserSetting{");
        replace.append('}');
        return replace.toString();
    }

    public ViewUserSetting(Audio audio2, Video video2, MeetingGeneral meetingGeneral, MeetingHost meetingHost, MeetingAdvanced meetingAdvanced, GoogleToken googleToken, MagicShare magicShare, Boolean bool) {
        this(audio2, video2, meetingGeneral, meetingHost, meetingAdvanced, googleToken, magicShare, bool, ByteString.EMPTY);
    }

    public ViewUserSetting(Audio audio2, Video video2, MeetingGeneral meetingGeneral, MeetingHost meetingHost, MeetingAdvanced meetingAdvanced, GoogleToken googleToken, MagicShare magicShare, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.audio = audio2;
        this.video = video2;
        this.meeting_general = meetingGeneral;
        this.meeting_host = meetingHost;
        this.meeting_advanced = meetingAdvanced;
        this.google_token = googleToken;
        this.magic_share = magicShare;
        this.if_direct_to_people_after_interview = bool;
    }
}
