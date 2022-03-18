package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatQRCodeInfoRequest extends Message<GetChatQRCodeInfoRequest, C17542a> {
    public static final ProtoAdapter<GetChatQRCodeInfoRequest> ADAPTER = new C17543b();
    public static final PlatformType DEFAULT_PLATFORM_TYPE = PlatformType.PlatformIPhone;
    private static final long serialVersionUID = 0;
    public final PlatformType platform_type;
    public final String token;

    public enum PlatformType implements WireEnum {
        PlatformIPhone(1),
        PlatformAndroid(2),
        PlatformWebAdmin(3),
        PlatformWebOther(4),
        PlatformWindows(5),
        PlatformMac(6),
        PlatformPassport(7),
        PlatformIpad(8);
        
        public static final ProtoAdapter<PlatformType> ADAPTER = ProtoAdapter.newEnumAdapter(PlatformType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PlatformType fromValue(int i) {
            switch (i) {
                case 1:
                    return PlatformIPhone;
                case 2:
                    return PlatformAndroid;
                case 3:
                    return PlatformWebAdmin;
                case 4:
                    return PlatformWebOther;
                case 5:
                    return PlatformWindows;
                case 6:
                    return PlatformMac;
                case 7:
                    return PlatformPassport;
                case 8:
                    return PlatformIpad;
                default:
                    return null;
            }
        }

        private PlatformType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeInfoRequest$b */
    private static final class C17543b extends ProtoAdapter<GetChatQRCodeInfoRequest> {
        C17543b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatQRCodeInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatQRCodeInfoRequest getChatQRCodeInfoRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatQRCodeInfoRequest.token);
            if (getChatQRCodeInfoRequest.platform_type != null) {
                i = PlatformType.ADAPTER.encodedSizeWithTag(2, getChatQRCodeInfoRequest.platform_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getChatQRCodeInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatQRCodeInfoRequest decode(ProtoReader protoReader) throws IOException {
            C17542a aVar = new C17542a();
            aVar.f44496a = "";
            aVar.f44497b = PlatformType.PlatformIPhone;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44496a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44497b = PlatformType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatQRCodeInfoRequest getChatQRCodeInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatQRCodeInfoRequest.token);
            if (getChatQRCodeInfoRequest.platform_type != null) {
                PlatformType.ADAPTER.encodeWithTag(protoWriter, 2, getChatQRCodeInfoRequest.platform_type);
            }
            protoWriter.writeBytes(getChatQRCodeInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatQRCodeInfoRequest$a */
    public static final class C17542a extends Message.Builder<GetChatQRCodeInfoRequest, C17542a> {

        /* renamed from: a */
        public String f44496a;

        /* renamed from: b */
        public PlatformType f44497b;

        /* renamed from: a */
        public GetChatQRCodeInfoRequest build() {
            String str = this.f44496a;
            if (str != null) {
                return new GetChatQRCodeInfoRequest(str, this.f44497b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "token");
        }

        /* renamed from: a */
        public C17542a mo61428a(String str) {
            this.f44496a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17542a newBuilder() {
        C17542a aVar = new C17542a();
        aVar.f44496a = this.token;
        aVar.f44497b = this.platform_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatQRCodeInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        if (this.platform_type != null) {
            sb.append(", platform_type=");
            sb.append(this.platform_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatQRCodeInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatQRCodeInfoRequest(String str, PlatformType platformType) {
        this(str, platformType, ByteString.EMPTY);
    }

    public GetChatQRCodeInfoRequest(String str, PlatformType platformType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.platform_type = platformType;
    }
}
