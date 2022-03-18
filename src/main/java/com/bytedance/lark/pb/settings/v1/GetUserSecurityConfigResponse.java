package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserSecurityConfigResponse extends Message<GetUserSecurityConfigResponse, C19165a> {
    public static final ProtoAdapter<GetUserSecurityConfigResponse> ADAPTER = new C19166b();
    public static final Boolean DEFAULT_HAS_WATER_MARK = false;
    private static final long serialVersionUID = 0;
    public final Boolean has_water_mark;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSecurityConfigResponse$b */
    private static final class C19166b extends ProtoAdapter<GetUserSecurityConfigResponse> {
        C19166b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserSecurityConfigResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserSecurityConfigResponse getUserSecurityConfigResponse) {
            int i;
            if (getUserSecurityConfigResponse.has_water_mark != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getUserSecurityConfigResponse.has_water_mark);
            } else {
                i = 0;
            }
            return i + getUserSecurityConfigResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserSecurityConfigResponse decode(ProtoReader protoReader) throws IOException {
            C19165a aVar = new C19165a();
            aVar.f47303a = false;
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
                    aVar.f47303a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserSecurityConfigResponse getUserSecurityConfigResponse) throws IOException {
            if (getUserSecurityConfigResponse.has_water_mark != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getUserSecurityConfigResponse.has_water_mark);
            }
            protoWriter.writeBytes(getUserSecurityConfigResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetUserSecurityConfigResponse$a */
    public static final class C19165a extends Message.Builder<GetUserSecurityConfigResponse, C19165a> {

        /* renamed from: a */
        public Boolean f47303a;

        /* renamed from: a */
        public GetUserSecurityConfigResponse build() {
            return new GetUserSecurityConfigResponse(this.f47303a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19165a newBuilder() {
        C19165a aVar = new C19165a();
        aVar.f47303a = this.has_water_mark;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetUserSecurityConfigResponse");
        StringBuilder sb = new StringBuilder();
        if (this.has_water_mark != null) {
            sb.append(", has_water_mark=");
            sb.append(this.has_water_mark);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserSecurityConfigResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserSecurityConfigResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetUserSecurityConfigResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_water_mark = bool;
    }
}
