package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateOpenAppBadgeNodeResponse extends Message<UpdateOpenAppBadgeNodeResponse, C18717a> {
    public static final ProtoAdapter<UpdateOpenAppBadgeNodeResponse> ADAPTER = new C18718b();
    public static final BadgeNodeActionCode DEFAULT_CODE = BadgeNodeActionCode.UNKNOWN_BADGE_CODE;
    private static final long serialVersionUID = 0;
    public final BadgeNodeActionCode code;
    public final String msg;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse$b */
    private static final class C18718b extends ProtoAdapter<UpdateOpenAppBadgeNodeResponse> {
        C18718b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateOpenAppBadgeNodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateOpenAppBadgeNodeResponse updateOpenAppBadgeNodeResponse) {
            int i;
            int encodedSizeWithTag = BadgeNodeActionCode.ADAPTER.encodedSizeWithTag(1, updateOpenAppBadgeNodeResponse.code);
            if (updateOpenAppBadgeNodeResponse.msg != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, updateOpenAppBadgeNodeResponse.msg);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + updateOpenAppBadgeNodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateOpenAppBadgeNodeResponse decode(ProtoReader protoReader) throws IOException {
            C18717a aVar = new C18717a();
            aVar.f46265a = BadgeNodeActionCode.UNKNOWN_BADGE_CODE;
            aVar.f46266b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46265a = BadgeNodeActionCode.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46266b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateOpenAppBadgeNodeResponse updateOpenAppBadgeNodeResponse) throws IOException {
            BadgeNodeActionCode.ADAPTER.encodeWithTag(protoWriter, 1, updateOpenAppBadgeNodeResponse.code);
            if (updateOpenAppBadgeNodeResponse.msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateOpenAppBadgeNodeResponse.msg);
            }
            protoWriter.writeBytes(updateOpenAppBadgeNodeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeResponse$a */
    public static final class C18717a extends Message.Builder<UpdateOpenAppBadgeNodeResponse, C18717a> {

        /* renamed from: a */
        public BadgeNodeActionCode f46265a;

        /* renamed from: b */
        public String f46266b;

        /* renamed from: a */
        public UpdateOpenAppBadgeNodeResponse build() {
            BadgeNodeActionCode badgeNodeActionCode = this.f46265a;
            if (badgeNodeActionCode != null) {
                return new UpdateOpenAppBadgeNodeResponse(badgeNodeActionCode, this.f46266b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(badgeNodeActionCode, "code");
        }
    }

    @Override // com.squareup.wire.Message
    public C18717a newBuilder() {
        C18717a aVar = new C18717a();
        aVar.f46265a = this.code;
        aVar.f46266b = this.msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "UpdateOpenAppBadgeNodeResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", code=");
        sb.append(this.code);
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateOpenAppBadgeNodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateOpenAppBadgeNodeResponse(BadgeNodeActionCode badgeNodeActionCode, String str) {
        this(badgeNodeActionCode, str, ByteString.EMPTY);
    }

    public UpdateOpenAppBadgeNodeResponse(BadgeNodeActionCode badgeNodeActionCode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = badgeNodeActionCode;
        this.msg = str;
    }
}
