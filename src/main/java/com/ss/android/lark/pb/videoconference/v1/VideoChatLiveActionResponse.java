package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class VideoChatLiveActionResponse extends Message<VideoChatLiveActionResponse, C51252a> {
    public static final ProtoAdapter<VideoChatLiveActionResponse> ADAPTER = new C51253b();
    public static final Boolean DEFAULT_NEED_VERIFICATION = false;
    private static final long serialVersionUID = 0;
    public final Map<String, String> error_set;
    public final Boolean need_verification;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionResponse$a */
    public static final class C51252a extends Message.Builder<VideoChatLiveActionResponse, C51252a> {

        /* renamed from: a */
        public Map<String, String> f127641a = Internal.newMutableMap();

        /* renamed from: b */
        public Boolean f127642b;

        /* renamed from: a */
        public VideoChatLiveActionResponse build() {
            return new VideoChatLiveActionResponse(this.f127641a, this.f127642b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatLiveActionResponse$b */
    private static final class C51253b extends ProtoAdapter<VideoChatLiveActionResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f127643a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C51253b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatLiveActionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatLiveActionResponse videoChatLiveActionResponse) {
            int i;
            int encodedSizeWithTag = this.f127643a.encodedSizeWithTag(1, videoChatLiveActionResponse.error_set);
            if (videoChatLiveActionResponse.need_verification != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, videoChatLiveActionResponse.need_verification);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + videoChatLiveActionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatLiveActionResponse decode(ProtoReader protoReader) throws IOException {
            C51252a aVar = new C51252a();
            aVar.f127642b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127641a.putAll(this.f127643a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127642b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatLiveActionResponse videoChatLiveActionResponse) throws IOException {
            this.f127643a.encodeWithTag(protoWriter, 1, videoChatLiveActionResponse.error_set);
            if (videoChatLiveActionResponse.need_verification != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, videoChatLiveActionResponse.need_verification);
            }
            protoWriter.writeBytes(videoChatLiveActionResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51252a newBuilder() {
        C51252a aVar = new C51252a();
        aVar.f127641a = Internal.copyOf("error_set", this.error_set);
        aVar.f127642b = this.need_verification;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatLiveActionResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.error_set.isEmpty()) {
            sb.append(", error_set=");
            sb.append(this.error_set);
        }
        if (this.need_verification != null) {
            sb.append(", need_verification=");
            sb.append(this.need_verification);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatLiveActionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatLiveActionResponse(Map<String, String> map, Boolean bool) {
        this(map, bool, ByteString.EMPTY);
    }

    public VideoChatLiveActionResponse(Map<String, String> map, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.error_set = Internal.immutableCopyOf("error_set", map);
        this.need_verification = bool;
    }
}
