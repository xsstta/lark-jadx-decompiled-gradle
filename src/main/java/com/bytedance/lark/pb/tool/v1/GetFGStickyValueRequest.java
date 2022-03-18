package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetFGStickyValueRequest extends Message<GetFGStickyValueRequest, C19707a> {
    public static final ProtoAdapter<GetFGStickyValueRequest> ADAPTER = new C19708b();
    private static final long serialVersionUID = 0;
    public final String fg_key;

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetFGStickyValueRequest$b */
    private static final class C19708b extends ProtoAdapter<GetFGStickyValueRequest> {
        C19708b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFGStickyValueRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFGStickyValueRequest getFGStickyValueRequest) {
            int i;
            if (getFGStickyValueRequest.fg_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getFGStickyValueRequest.fg_key);
            } else {
                i = 0;
            }
            return i + getFGStickyValueRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetFGStickyValueRequest decode(ProtoReader protoReader) throws IOException {
            C19707a aVar = new C19707a();
            aVar.f48168a = "";
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
                    aVar.f48168a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFGStickyValueRequest getFGStickyValueRequest) throws IOException {
            if (getFGStickyValueRequest.fg_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getFGStickyValueRequest.fg_key);
            }
            protoWriter.writeBytes(getFGStickyValueRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetFGStickyValueRequest$a */
    public static final class C19707a extends Message.Builder<GetFGStickyValueRequest, C19707a> {

        /* renamed from: a */
        public String f48168a;

        /* renamed from: a */
        public GetFGStickyValueRequest build() {
            return new GetFGStickyValueRequest(this.f48168a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19707a newBuilder() {
        C19707a aVar = new C19707a();
        aVar.f48168a = this.fg_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "GetFGStickyValueRequest");
        StringBuilder sb = new StringBuilder();
        if (this.fg_key != null) {
            sb.append(", fg_key=");
            sb.append(this.fg_key);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFGStickyValueRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetFGStickyValueRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetFGStickyValueRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fg_key = str;
    }
}
