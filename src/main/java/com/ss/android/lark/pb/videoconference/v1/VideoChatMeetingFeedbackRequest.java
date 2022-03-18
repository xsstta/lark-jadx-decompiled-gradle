package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class VideoChatMeetingFeedbackRequest extends Message<VideoChatMeetingFeedbackRequest, C51266a> {
    public static final ProtoAdapter<VideoChatMeetingFeedbackRequest> ADAPTER = new C51267b();
    public static final NetworkType DEFAULT_NETWORK = NetworkType.OTHER;
    public static final VideoChatMeetingQuality DEFAULT_QUALITY = VideoChatMeetingQuality.UNKOWN;
    private static final long serialVersionUID = 0;
    public final AudioVideoFeedback audio_video_feedback;
    public final String lark_version;
    public final String meeting_id;
    public final NetworkType network;
    public final String other_reason;
    public final VideoChatMeetingQuality quality;
    public final String sdk_version;
    public final ShareScreenFeedback share_screen_feedback;

    public enum NetworkType implements WireEnum {
        OTHER(0),
        G3(1),
        G4(2),
        G5(3),
        WIFI(4),
        LAN(5);
        
        public static final ProtoAdapter<NetworkType> ADAPTER = ProtoAdapter.newEnumAdapter(NetworkType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static NetworkType fromValue(int i) {
            if (i == 0) {
                return OTHER;
            }
            if (i == 1) {
                return G3;
            }
            if (i == 2) {
                return G4;
            }
            if (i == 3) {
                return G5;
            }
            if (i == 4) {
                return WIFI;
            }
            if (i != 5) {
                return null;
            }
            return LAN;
        }

        private NetworkType(int i) {
            this.value = i;
        }
    }

    public enum VideoChatMeetingQuality implements WireEnum {
        UNKOWN(0),
        GOOD(1),
        BAD(2);
        
        public static final ProtoAdapter<VideoChatMeetingQuality> ADAPTER = ProtoAdapter.newEnumAdapter(VideoChatMeetingQuality.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static VideoChatMeetingQuality fromValue(int i) {
            if (i == 0) {
                return UNKOWN;
            }
            if (i == 1) {
                return GOOD;
            }
            if (i != 2) {
                return null;
            }
            return BAD;
        }

        private VideoChatMeetingQuality(int i) {
            this.value = i;
        }
    }

    public static final class AudioVideoFeedback extends Message<AudioVideoFeedback, C51262a> {
        public static final ProtoAdapter<AudioVideoFeedback> ADAPTER = new C51263b();
        private static final long serialVersionUID = 0;
        public final String audio_video_other_reason;
        public final List<String> audio_video_sub_reasons;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest$AudioVideoFeedback$b */
        private static final class C51263b extends ProtoAdapter<AudioVideoFeedback> {
            C51263b() {
                super(FieldEncoding.LENGTH_DELIMITED, AudioVideoFeedback.class);
            }

            /* renamed from: a */
            public int encodedSize(AudioVideoFeedback audioVideoFeedback) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, audioVideoFeedback.audio_video_sub_reasons);
                if (audioVideoFeedback.audio_video_other_reason != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, audioVideoFeedback.audio_video_other_reason);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + audioVideoFeedback.unknownFields().size();
            }

            /* renamed from: a */
            public AudioVideoFeedback decode(ProtoReader protoReader) throws IOException {
                C51262a aVar = new C51262a();
                aVar.f127652b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127651a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127652b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AudioVideoFeedback audioVideoFeedback) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, audioVideoFeedback.audio_video_sub_reasons);
                if (audioVideoFeedback.audio_video_other_reason != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, audioVideoFeedback.audio_video_other_reason);
                }
                protoWriter.writeBytes(audioVideoFeedback.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest$AudioVideoFeedback$a */
        public static final class C51262a extends Message.Builder<AudioVideoFeedback, C51262a> {

            /* renamed from: a */
            public List<String> f127651a = Internal.newMutableList();

            /* renamed from: b */
            public String f127652b;

            /* renamed from: a */
            public AudioVideoFeedback build() {
                return new AudioVideoFeedback(this.f127651a, this.f127652b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51262a newBuilder() {
            C51262a aVar = new C51262a();
            aVar.f127651a = Internal.copyOf("audio_video_sub_reasons", this.audio_video_sub_reasons);
            aVar.f127652b = this.audio_video_other_reason;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "AudioVideoFeedback");
            StringBuilder sb = new StringBuilder();
            if (!this.audio_video_sub_reasons.isEmpty()) {
                sb.append(", audio_video_sub_reasons=");
                sb.append(this.audio_video_sub_reasons);
            }
            if (this.audio_video_other_reason != null) {
                sb.append(", audio_video_other_reason=");
                sb.append(this.audio_video_other_reason);
            }
            StringBuilder replace = sb.replace(0, 2, "AudioVideoFeedback{");
            replace.append('}');
            return replace.toString();
        }

        public AudioVideoFeedback(List<String> list, String str) {
            this(list, str, ByteString.EMPTY);
        }

        public AudioVideoFeedback(List<String> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.audio_video_sub_reasons = Internal.immutableCopyOf("audio_video_sub_reasons", list);
            this.audio_video_other_reason = str;
        }
    }

    public static final class ShareScreenFeedback extends Message<ShareScreenFeedback, C51264a> {
        public static final ProtoAdapter<ShareScreenFeedback> ADAPTER = new C51265b();
        private static final long serialVersionUID = 0;
        public final String share_screen_other_reason;
        public final List<String> share_screen_sub_reasons;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest$ShareScreenFeedback$b */
        private static final class C51265b extends ProtoAdapter<ShareScreenFeedback> {
            C51265b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareScreenFeedback.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareScreenFeedback shareScreenFeedback) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, shareScreenFeedback.share_screen_sub_reasons);
                if (shareScreenFeedback.share_screen_other_reason != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, shareScreenFeedback.share_screen_other_reason);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + shareScreenFeedback.unknownFields().size();
            }

            /* renamed from: a */
            public ShareScreenFeedback decode(ProtoReader protoReader) throws IOException {
                C51264a aVar = new C51264a();
                aVar.f127654b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127653a.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127654b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareScreenFeedback shareScreenFeedback) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, shareScreenFeedback.share_screen_sub_reasons);
                if (shareScreenFeedback.share_screen_other_reason != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareScreenFeedback.share_screen_other_reason);
                }
                protoWriter.writeBytes(shareScreenFeedback.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest$ShareScreenFeedback$a */
        public static final class C51264a extends Message.Builder<ShareScreenFeedback, C51264a> {

            /* renamed from: a */
            public List<String> f127653a = Internal.newMutableList();

            /* renamed from: b */
            public String f127654b;

            /* renamed from: a */
            public ShareScreenFeedback build() {
                return new ShareScreenFeedback(this.f127653a, this.f127654b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51264a newBuilder() {
            C51264a aVar = new C51264a();
            aVar.f127653a = Internal.copyOf("share_screen_sub_reasons", this.share_screen_sub_reasons);
            aVar.f127654b = this.share_screen_other_reason;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ShareScreenFeedback");
            StringBuilder sb = new StringBuilder();
            if (!this.share_screen_sub_reasons.isEmpty()) {
                sb.append(", share_screen_sub_reasons=");
                sb.append(this.share_screen_sub_reasons);
            }
            if (this.share_screen_other_reason != null) {
                sb.append(", share_screen_other_reason=");
                sb.append(this.share_screen_other_reason);
            }
            StringBuilder replace = sb.replace(0, 2, "ShareScreenFeedback{");
            replace.append('}');
            return replace.toString();
        }

        public ShareScreenFeedback(List<String> list, String str) {
            this(list, str, ByteString.EMPTY);
        }

        public ShareScreenFeedback(List<String> list, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.share_screen_sub_reasons = Internal.immutableCopyOf("share_screen_sub_reasons", list);
            this.share_screen_other_reason = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest$b */
    private static final class C51267b extends ProtoAdapter<VideoChatMeetingFeedbackRequest> {
        C51267b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatMeetingFeedbackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatMeetingFeedbackRequest videoChatMeetingFeedbackRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatMeetingFeedbackRequest.meeting_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoChatMeetingFeedbackRequest.sdk_version);
            int i5 = 0;
            if (videoChatMeetingFeedbackRequest.network != null) {
                i = NetworkType.ADAPTER.encodedSizeWithTag(3, videoChatMeetingFeedbackRequest.network);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + VideoChatMeetingQuality.ADAPTER.encodedSizeWithTag(4, videoChatMeetingFeedbackRequest.quality);
            if (videoChatMeetingFeedbackRequest.audio_video_feedback != null) {
                i2 = AudioVideoFeedback.ADAPTER.encodedSizeWithTag(5, videoChatMeetingFeedbackRequest.audio_video_feedback);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag2 + i2;
            if (videoChatMeetingFeedbackRequest.share_screen_feedback != null) {
                i3 = ShareScreenFeedback.ADAPTER.encodedSizeWithTag(6, videoChatMeetingFeedbackRequest.share_screen_feedback);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (videoChatMeetingFeedbackRequest.other_reason != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, videoChatMeetingFeedbackRequest.other_reason);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (videoChatMeetingFeedbackRequest.lark_version != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, videoChatMeetingFeedbackRequest.lark_version);
            }
            return i8 + i5 + videoChatMeetingFeedbackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatMeetingFeedbackRequest decode(ProtoReader protoReader) throws IOException {
            C51266a aVar = new C51266a();
            aVar.f127655a = "";
            aVar.f127656b = "";
            aVar.f127657c = NetworkType.OTHER;
            aVar.f127658d = VideoChatMeetingQuality.UNKOWN;
            aVar.f127661g = "";
            aVar.f127662h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127655a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127656b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f127657c = NetworkType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f127658d = VideoChatMeetingQuality.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f127659e = AudioVideoFeedback.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127660f = ShareScreenFeedback.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127661g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127662h = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VideoChatMeetingFeedbackRequest videoChatMeetingFeedbackRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatMeetingFeedbackRequest.meeting_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoChatMeetingFeedbackRequest.sdk_version);
            if (videoChatMeetingFeedbackRequest.network != null) {
                NetworkType.ADAPTER.encodeWithTag(protoWriter, 3, videoChatMeetingFeedbackRequest.network);
            }
            VideoChatMeetingQuality.ADAPTER.encodeWithTag(protoWriter, 4, videoChatMeetingFeedbackRequest.quality);
            if (videoChatMeetingFeedbackRequest.audio_video_feedback != null) {
                AudioVideoFeedback.ADAPTER.encodeWithTag(protoWriter, 5, videoChatMeetingFeedbackRequest.audio_video_feedback);
            }
            if (videoChatMeetingFeedbackRequest.share_screen_feedback != null) {
                ShareScreenFeedback.ADAPTER.encodeWithTag(protoWriter, 6, videoChatMeetingFeedbackRequest.share_screen_feedback);
            }
            if (videoChatMeetingFeedbackRequest.other_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoChatMeetingFeedbackRequest.other_reason);
            }
            if (videoChatMeetingFeedbackRequest.lark_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, videoChatMeetingFeedbackRequest.lark_version);
            }
            protoWriter.writeBytes(videoChatMeetingFeedbackRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51266a newBuilder() {
        C51266a aVar = new C51266a();
        aVar.f127655a = this.meeting_id;
        aVar.f127656b = this.sdk_version;
        aVar.f127657c = this.network;
        aVar.f127658d = this.quality;
        aVar.f127659e = this.audio_video_feedback;
        aVar.f127660f = this.share_screen_feedback;
        aVar.f127661g = this.other_reason;
        aVar.f127662h = this.lark_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatMeetingFeedbackRequest$a */
    public static final class C51266a extends Message.Builder<VideoChatMeetingFeedbackRequest, C51266a> {

        /* renamed from: a */
        public String f127655a;

        /* renamed from: b */
        public String f127656b;

        /* renamed from: c */
        public NetworkType f127657c;

        /* renamed from: d */
        public VideoChatMeetingQuality f127658d;

        /* renamed from: e */
        public AudioVideoFeedback f127659e;

        /* renamed from: f */
        public ShareScreenFeedback f127660f;

        /* renamed from: g */
        public String f127661g;

        /* renamed from: h */
        public String f127662h;

        /* renamed from: a */
        public VideoChatMeetingFeedbackRequest build() {
            String str;
            VideoChatMeetingQuality videoChatMeetingQuality;
            String str2 = this.f127655a;
            if (str2 != null && (str = this.f127656b) != null && (videoChatMeetingQuality = this.f127658d) != null) {
                return new VideoChatMeetingFeedbackRequest(str2, str, this.f127657c, videoChatMeetingQuality, this.f127659e, this.f127660f, this.f127661g, this.f127662h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "meeting_id", this.f127656b, "sdk_version", this.f127658d, "quality");
        }

        /* renamed from: a */
        public C51266a mo176752a(AudioVideoFeedback audioVideoFeedback) {
            this.f127659e = audioVideoFeedback;
            return this;
        }

        /* renamed from: b */
        public C51266a mo176758b(String str) {
            this.f127656b = str;
            return this;
        }

        /* renamed from: c */
        public C51266a mo176759c(String str) {
            this.f127661g = str;
            return this;
        }

        /* renamed from: d */
        public C51266a mo176760d(String str) {
            this.f127662h = str;
            return this;
        }

        /* renamed from: a */
        public C51266a mo176753a(NetworkType networkType) {
            this.f127657c = networkType;
            return this;
        }

        /* renamed from: a */
        public C51266a mo176754a(ShareScreenFeedback shareScreenFeedback) {
            this.f127660f = shareScreenFeedback;
            return this;
        }

        /* renamed from: a */
        public C51266a mo176755a(VideoChatMeetingQuality videoChatMeetingQuality) {
            this.f127658d = videoChatMeetingQuality;
            return this;
        }

        /* renamed from: a */
        public C51266a mo176756a(String str) {
            this.f127655a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatMeetingFeedbackRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", sdk_version=");
        sb.append(this.sdk_version);
        if (this.network != null) {
            sb.append(", network=");
            sb.append(this.network);
        }
        sb.append(", quality=");
        sb.append(this.quality);
        if (this.audio_video_feedback != null) {
            sb.append(", audio_video_feedback=");
            sb.append(this.audio_video_feedback);
        }
        if (this.share_screen_feedback != null) {
            sb.append(", share_screen_feedback=");
            sb.append(this.share_screen_feedback);
        }
        if (this.other_reason != null) {
            sb.append(", other_reason=");
            sb.append(this.other_reason);
        }
        if (this.lark_version != null) {
            sb.append(", lark_version=");
            sb.append(this.lark_version);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatMeetingFeedbackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatMeetingFeedbackRequest(String str, String str2, NetworkType networkType, VideoChatMeetingQuality videoChatMeetingQuality, AudioVideoFeedback audioVideoFeedback, ShareScreenFeedback shareScreenFeedback, String str3, String str4) {
        this(str, str2, networkType, videoChatMeetingQuality, audioVideoFeedback, shareScreenFeedback, str3, str4, ByteString.EMPTY);
    }

    public VideoChatMeetingFeedbackRequest(String str, String str2, NetworkType networkType, VideoChatMeetingQuality videoChatMeetingQuality, AudioVideoFeedback audioVideoFeedback, ShareScreenFeedback shareScreenFeedback, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.sdk_version = str2;
        this.network = networkType;
        this.quality = videoChatMeetingQuality;
        this.audio_video_feedback = audioVideoFeedback;
        this.share_screen_feedback = shareScreenFeedback;
        this.other_reason = str3;
        this.lark_version = str4;
    }
}
