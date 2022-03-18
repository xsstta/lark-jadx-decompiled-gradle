package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetKeyValueRequest extends Message<GetKeyValueRequest, C18384a> {
    public static final ProtoAdapter<GetKeyValueRequest> ADAPTER = new C18385b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetKeyValueRequest$b */
    private static final class C18385b extends ProtoAdapter<GetKeyValueRequest> {
        C18385b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetKeyValueRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetKeyValueRequest getKeyValueRequest) {
            int i;
            if (getKeyValueRequest.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getKeyValueRequest.key);
            } else {
                i = 0;
            }
            return i + getKeyValueRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetKeyValueRequest decode(ProtoReader protoReader) throws IOException {
            C18384a aVar = new C18384a();
            aVar.f45766a = "";
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
                    aVar.f45766a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetKeyValueRequest getKeyValueRequest) throws IOException {
            if (getKeyValueRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getKeyValueRequest.key);
            }
            protoWriter.writeBytes(getKeyValueRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetKeyValueRequest$a */
    public static final class C18384a extends Message.Builder<GetKeyValueRequest, C18384a> {

        /* renamed from: a */
        public String f45766a;

        /* renamed from: a */
        public GetKeyValueRequest build() {
            return new GetKeyValueRequest(this.f45766a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18384a mo63583a(String str) {
            this.f45766a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18384a newBuilder() {
        C18384a aVar = new C18384a();
        aVar.f45766a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetKeyValueRequest");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        StringBuilder replace = sb.replace(0, 2, "GetKeyValueRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetKeyValueRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetKeyValueRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
