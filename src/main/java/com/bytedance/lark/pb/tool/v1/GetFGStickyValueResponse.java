package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetFGStickyValueResponse extends Message<GetFGStickyValueResponse, C19709a> {
    public static final ProtoAdapter<GetFGStickyValueResponse> ADAPTER = new C19710b();
    public static final Boolean DEFAULT_ENABLE = false;
    private static final long serialVersionUID = 0;
    public final Boolean enable;

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetFGStickyValueResponse$b */
    private static final class C19710b extends ProtoAdapter<GetFGStickyValueResponse> {
        C19710b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFGStickyValueResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFGStickyValueResponse getFGStickyValueResponse) {
            int i;
            if (getFGStickyValueResponse.enable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getFGStickyValueResponse.enable);
            } else {
                i = 0;
            }
            return i + getFGStickyValueResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetFGStickyValueResponse decode(ProtoReader protoReader) throws IOException {
            C19709a aVar = new C19709a();
            aVar.f48169a = false;
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
                    aVar.f48169a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFGStickyValueResponse getFGStickyValueResponse) throws IOException {
            if (getFGStickyValueResponse.enable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getFGStickyValueResponse.enable);
            }
            protoWriter.writeBytes(getFGStickyValueResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetFGStickyValueResponse$a */
    public static final class C19709a extends Message.Builder<GetFGStickyValueResponse, C19709a> {

        /* renamed from: a */
        public Boolean f48169a;

        /* renamed from: a */
        public GetFGStickyValueResponse build() {
            return new GetFGStickyValueResponse(this.f48169a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19709a newBuilder() {
        C19709a aVar = new C19709a();
        aVar.f48169a = this.enable;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "GetFGStickyValueResponse");
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFGStickyValueResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetFGStickyValueResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetFGStickyValueResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
    }
}
