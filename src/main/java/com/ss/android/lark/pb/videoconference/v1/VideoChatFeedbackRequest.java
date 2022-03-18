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

public final class VideoChatFeedbackRequest extends Message<VideoChatFeedbackRequest, C51232a> {
    public static final ProtoAdapter<VideoChatFeedbackRequest> ADAPTER = new C51233b();
    public static final Network DEFAULT_NETWORK = Network.OTHER;
    public static final Quality DEFAULT_QUALITY = Quality.UNKOWN;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String lark_version;
    public final Network network;
    public final String other_reason;
    public final Quality quality;
    public final List<String> reason_subkeys;
    public final String sdk_version;
    public final List<String> share_screen_reason_subkeys;

    public enum Network implements WireEnum {
        OTHER(0),
        DATA4G(1),
        WIFI(2),
        LAN(3);
        
        public static final ProtoAdapter<Network> ADAPTER = ProtoAdapter.newEnumAdapter(Network.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Network fromValue(int i) {
            if (i == 0) {
                return OTHER;
            }
            if (i == 1) {
                return DATA4G;
            }
            if (i == 2) {
                return WIFI;
            }
            if (i != 3) {
                return null;
            }
            return LAN;
        }

        private Network(int i) {
            this.value = i;
        }
    }

    public enum Quality implements WireEnum {
        UNKOWN(0),
        GOOD(1),
        BAD(2);
        
        public static final ProtoAdapter<Quality> ADAPTER = ProtoAdapter.newEnumAdapter(Quality.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Quality fromValue(int i) {
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

        private Quality(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFeedbackRequest$b */
    private static final class C51233b extends ProtoAdapter<VideoChatFeedbackRequest> {
        C51233b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatFeedbackRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatFeedbackRequest videoChatFeedbackRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatFeedbackRequest.id) + Quality.ADAPTER.encodedSizeWithTag(2, videoChatFeedbackRequest.quality);
            int i3 = 0;
            if (videoChatFeedbackRequest.network != null) {
                i = Network.ADAPTER.encodedSizeWithTag(3, videoChatFeedbackRequest.network);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, videoChatFeedbackRequest.reason_subkeys);
            if (videoChatFeedbackRequest.other_reason != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatFeedbackRequest.other_reason);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i2 + ProtoAdapter.STRING.encodedSizeWithTag(6, videoChatFeedbackRequest.sdk_version);
            if (videoChatFeedbackRequest.lark_version != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, videoChatFeedbackRequest.lark_version);
            }
            return encodedSizeWithTag3 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, videoChatFeedbackRequest.share_screen_reason_subkeys) + videoChatFeedbackRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatFeedbackRequest decode(ProtoReader protoReader) throws IOException {
            C51232a aVar = new C51232a();
            aVar.f127530a = "";
            aVar.f127531b = Quality.UNKOWN;
            aVar.f127532c = Network.OTHER;
            aVar.f127534e = "";
            aVar.f127535f = "";
            aVar.f127536g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127530a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f127531b = Quality.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f127532c = Network.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f127533d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f127534e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127535f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127536g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127537h.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, VideoChatFeedbackRequest videoChatFeedbackRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatFeedbackRequest.id);
            Quality.ADAPTER.encodeWithTag(protoWriter, 2, videoChatFeedbackRequest.quality);
            if (videoChatFeedbackRequest.network != null) {
                Network.ADAPTER.encodeWithTag(protoWriter, 3, videoChatFeedbackRequest.network);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, videoChatFeedbackRequest.reason_subkeys);
            if (videoChatFeedbackRequest.other_reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatFeedbackRequest.other_reason);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, videoChatFeedbackRequest.sdk_version);
            if (videoChatFeedbackRequest.lark_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, videoChatFeedbackRequest.lark_version);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, videoChatFeedbackRequest.share_screen_reason_subkeys);
            protoWriter.writeBytes(videoChatFeedbackRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51232a newBuilder() {
        C51232a aVar = new C51232a();
        aVar.f127530a = this.id;
        aVar.f127531b = this.quality;
        aVar.f127532c = this.network;
        aVar.f127533d = Internal.copyOf("reason_subkeys", this.reason_subkeys);
        aVar.f127534e = this.other_reason;
        aVar.f127535f = this.sdk_version;
        aVar.f127536g = this.lark_version;
        aVar.f127537h = Internal.copyOf("share_screen_reason_subkeys", this.share_screen_reason_subkeys);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatFeedbackRequest$a */
    public static final class C51232a extends Message.Builder<VideoChatFeedbackRequest, C51232a> {

        /* renamed from: a */
        public String f127530a;

        /* renamed from: b */
        public Quality f127531b;

        /* renamed from: c */
        public Network f127532c;

        /* renamed from: d */
        public List<String> f127533d = Internal.newMutableList();

        /* renamed from: e */
        public String f127534e;

        /* renamed from: f */
        public String f127535f;

        /* renamed from: g */
        public String f127536g;

        /* renamed from: h */
        public List<String> f127537h = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatFeedbackRequest build() {
            Quality quality;
            String str;
            String str2 = this.f127530a;
            if (str2 != null && (quality = this.f127531b) != null && (str = this.f127535f) != null) {
                return new VideoChatFeedbackRequest(str2, quality, this.f127532c, this.f127533d, this.f127534e, str, this.f127536g, this.f127537h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f127531b, "quality", this.f127535f, "sdk_version");
        }

        /* renamed from: a */
        public C51232a mo176663a(Network network) {
            this.f127532c = network;
            return this;
        }

        /* renamed from: b */
        public C51232a mo176668b(String str) {
            this.f127534e = str;
            return this;
        }

        /* renamed from: c */
        public C51232a mo176670c(String str) {
            this.f127535f = str;
            return this;
        }

        /* renamed from: d */
        public C51232a mo176671d(String str) {
            this.f127536g = str;
            return this;
        }

        /* renamed from: a */
        public C51232a mo176664a(Quality quality) {
            this.f127531b = quality;
            return this;
        }

        /* renamed from: b */
        public C51232a mo176669b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127537h = list;
            return this;
        }

        /* renamed from: a */
        public C51232a mo176665a(String str) {
            this.f127530a = str;
            return this;
        }

        /* renamed from: a */
        public C51232a mo176666a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127533d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatFeedbackRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", quality=");
        sb.append(this.quality);
        if (this.network != null) {
            sb.append(", network=");
            sb.append(this.network);
        }
        if (!this.reason_subkeys.isEmpty()) {
            sb.append(", reason_subkeys=");
            sb.append(this.reason_subkeys);
        }
        if (this.other_reason != null) {
            sb.append(", other_reason=");
            sb.append(this.other_reason);
        }
        sb.append(", sdk_version=");
        sb.append(this.sdk_version);
        if (this.lark_version != null) {
            sb.append(", lark_version=");
            sb.append(this.lark_version);
        }
        if (!this.share_screen_reason_subkeys.isEmpty()) {
            sb.append(", share_screen_reason_subkeys=");
            sb.append(this.share_screen_reason_subkeys);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatFeedbackRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatFeedbackRequest(String str, Quality quality2, Network network2, List<String> list, String str2, String str3, String str4, List<String> list2) {
        this(str, quality2, network2, list, str2, str3, str4, list2, ByteString.EMPTY);
    }

    public VideoChatFeedbackRequest(String str, Quality quality2, Network network2, List<String> list, String str2, String str3, String str4, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.quality = quality2;
        this.network = network2;
        this.reason_subkeys = Internal.immutableCopyOf("reason_subkeys", list);
        this.other_reason = str2;
        this.sdk_version = str3;
        this.lark_version = str4;
        this.share_screen_reason_subkeys = Internal.immutableCopyOf("share_screen_reason_subkeys", list2);
    }
}
