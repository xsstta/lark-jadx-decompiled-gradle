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

public final class RegisterClientInfoResponse extends Message<RegisterClientInfoResponse, C50964a> {
    public static final ProtoAdapter<RegisterClientInfoResponse> ADAPTER = new C50965b();
    public static final StatusCode DEFAULT_STATUS = StatusCode.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final VideoChatInfo info;
    public final List<VideoChatInfo> infos;
    public final String meeting_id;
    public final List<VideoChatPrompt> prompts;
    public final StatusCode status;

    public enum StatusCode implements WireEnum {
        UNKNOWN(0),
        ACTIVE(1),
        INACTIVE(2),
        MEETING_END(3),
        OTHER_DEV_ACTIVE(4);
        
        public static final ProtoAdapter<StatusCode> ADAPTER = ProtoAdapter.newEnumAdapter(StatusCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static StatusCode fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i == 2) {
                return INACTIVE;
            }
            if (i == 3) {
                return MEETING_END;
            }
            if (i != 4) {
                return null;
            }
            return OTHER_DEV_ACTIVE;
        }

        private StatusCode(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoResponse$b */
    private static final class C50965b extends ProtoAdapter<RegisterClientInfoResponse> {
        C50965b() {
            super(FieldEncoding.LENGTH_DELIMITED, RegisterClientInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(RegisterClientInfoResponse registerClientInfoResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (registerClientInfoResponse.info != null) {
                i = VideoChatInfo.ADAPTER.encodedSizeWithTag(1, registerClientInfoResponse.info);
            } else {
                i = 0;
            }
            if (registerClientInfoResponse.status != null) {
                i2 = StatusCode.ADAPTER.encodedSizeWithTag(2, registerClientInfoResponse.status);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (registerClientInfoResponse.meeting_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, registerClientInfoResponse.meeting_id);
            }
            return i4 + i3 + VideoChatInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, registerClientInfoResponse.infos) + VideoChatPrompt.ADAPTER.asRepeated().encodedSizeWithTag(5, registerClientInfoResponse.prompts) + registerClientInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public RegisterClientInfoResponse decode(ProtoReader protoReader) throws IOException {
            C50964a aVar = new C50964a();
            aVar.f126992b = StatusCode.UNKNOWN;
            aVar.f126993c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126991a = VideoChatInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126992b = StatusCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f126993c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f126994d.add(VideoChatInfo.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126995e.add(VideoChatPrompt.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RegisterClientInfoResponse registerClientInfoResponse) throws IOException {
            if (registerClientInfoResponse.info != null) {
                VideoChatInfo.ADAPTER.encodeWithTag(protoWriter, 1, registerClientInfoResponse.info);
            }
            if (registerClientInfoResponse.status != null) {
                StatusCode.ADAPTER.encodeWithTag(protoWriter, 2, registerClientInfoResponse.status);
            }
            if (registerClientInfoResponse.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, registerClientInfoResponse.meeting_id);
            }
            VideoChatInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, registerClientInfoResponse.infos);
            VideoChatPrompt.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, registerClientInfoResponse.prompts);
            protoWriter.writeBytes(registerClientInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.RegisterClientInfoResponse$a */
    public static final class C50964a extends Message.Builder<RegisterClientInfoResponse, C50964a> {

        /* renamed from: a */
        public VideoChatInfo f126991a;

        /* renamed from: b */
        public StatusCode f126992b;

        /* renamed from: c */
        public String f126993c;

        /* renamed from: d */
        public List<VideoChatInfo> f126994d = Internal.newMutableList();

        /* renamed from: e */
        public List<VideoChatPrompt> f126995e = Internal.newMutableList();

        /* renamed from: a */
        public RegisterClientInfoResponse build() {
            return new RegisterClientInfoResponse(this.f126991a, this.f126992b, this.f126993c, this.f126994d, this.f126995e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50964a newBuilder() {
        C50964a aVar = new C50964a();
        aVar.f126991a = this.info;
        aVar.f126992b = this.status;
        aVar.f126993c = this.meeting_id;
        aVar.f126994d = Internal.copyOf("infos", this.infos);
        aVar.f126995e = Internal.copyOf("prompts", this.prompts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "RegisterClientInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.info != null) {
            sb.append(", info=");
            sb.append(this.info);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        if (!this.prompts.isEmpty()) {
            sb.append(", prompts=");
            sb.append(this.prompts);
        }
        StringBuilder replace = sb.replace(0, 2, "RegisterClientInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public RegisterClientInfoResponse(VideoChatInfo videoChatInfo, StatusCode statusCode, String str, List<VideoChatInfo> list, List<VideoChatPrompt> list2) {
        this(videoChatInfo, statusCode, str, list, list2, ByteString.EMPTY);
    }

    public RegisterClientInfoResponse(VideoChatInfo videoChatInfo, StatusCode statusCode, String str, List<VideoChatInfo> list, List<VideoChatPrompt> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.info = videoChatInfo;
        this.status = statusCode;
        this.meeting_id = str;
        this.infos = Internal.immutableCopyOf("infos", list);
        this.prompts = Internal.immutableCopyOf("prompts", list2);
    }
}
