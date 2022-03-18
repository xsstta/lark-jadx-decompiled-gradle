package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetWaterMarkConfigResponse extends Message<GetWaterMarkConfigResponse, C18735a> {
    public static final ProtoAdapter<GetWaterMarkConfigResponse> ADAPTER = new C18736b();
    public static final Boolean DEFAULT_HIDDEN_ENABLED = false;
    public static final Boolean DEFAULT_OBVIOUS_ENABLED = false;
    private static final long serialVersionUID = 0;
    public final String content;
    public final Boolean hidden_enabled;
    public final Boolean obvious_enabled;

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetWaterMarkConfigResponse$b */
    private static final class C18736b extends ProtoAdapter<GetWaterMarkConfigResponse> {
        C18736b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetWaterMarkConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetWaterMarkConfigResponse getWaterMarkConfigResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getWaterMarkConfigResponse.obvious_enabled) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getWaterMarkConfigResponse.hidden_enabled);
            if (getWaterMarkConfigResponse.content != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getWaterMarkConfigResponse.content);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getWaterMarkConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetWaterMarkConfigResponse decode(ProtoReader protoReader) throws IOException {
            C18735a aVar = new C18735a();
            aVar.f46280a = false;
            aVar.f46281b = false;
            aVar.f46282c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46280a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46281b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46282c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetWaterMarkConfigResponse getWaterMarkConfigResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getWaterMarkConfigResponse.obvious_enabled);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getWaterMarkConfigResponse.hidden_enabled);
            if (getWaterMarkConfigResponse.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getWaterMarkConfigResponse.content);
            }
            protoWriter.writeBytes(getWaterMarkConfigResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18735a newBuilder() {
        C18735a aVar = new C18735a();
        aVar.f46280a = this.obvious_enabled;
        aVar.f46281b = this.hidden_enabled;
        aVar.f46282c = this.content;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetWaterMarkConfigResponse$a */
    public static final class C18735a extends Message.Builder<GetWaterMarkConfigResponse, C18735a> {

        /* renamed from: a */
        public Boolean f46280a;

        /* renamed from: b */
        public Boolean f46281b;

        /* renamed from: c */
        public String f46282c;

        /* renamed from: a */
        public GetWaterMarkConfigResponse build() {
            Boolean bool;
            Boolean bool2 = this.f46280a;
            if (bool2 != null && (bool = this.f46281b) != null) {
                return new GetWaterMarkConfigResponse(bool2, bool, this.f46282c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool2, "obvious_enabled", this.f46281b, "hidden_enabled");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "GetWaterMarkConfigResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", obvious_enabled=");
        sb.append(this.obvious_enabled);
        sb.append(", hidden_enabled=");
        sb.append(this.hidden_enabled);
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "GetWaterMarkConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetWaterMarkConfigResponse(Boolean bool, Boolean bool2, String str) {
        this(bool, bool2, str, ByteString.EMPTY);
    }

    public GetWaterMarkConfigResponse(Boolean bool, Boolean bool2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.obvious_enabled = bool;
        this.hidden_enabled = bool2;
        this.content = str;
    }
}
