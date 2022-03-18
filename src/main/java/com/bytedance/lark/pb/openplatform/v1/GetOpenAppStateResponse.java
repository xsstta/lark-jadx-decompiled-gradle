package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.OpenApp;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetOpenAppStateResponse extends Message<GetOpenAppStateResponse, C18667a> {
    public static final ProtoAdapter<GetOpenAppStateResponse> ADAPTER = new C18668b();
    private static final long serialVersionUID = 0;
    public final OpenApp open_app;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse$b */
    private static final class C18668b extends ProtoAdapter<GetOpenAppStateResponse> {
        C18668b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetOpenAppStateResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetOpenAppStateResponse getOpenAppStateResponse) {
            int i;
            if (getOpenAppStateResponse.open_app != null) {
                i = OpenApp.ADAPTER.encodedSizeWithTag(1, getOpenAppStateResponse.open_app);
            } else {
                i = 0;
            }
            return i + getOpenAppStateResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetOpenAppStateResponse decode(ProtoReader protoReader) throws IOException {
            C18667a aVar = new C18667a();
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
                    aVar.f46196a = OpenApp.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetOpenAppStateResponse getOpenAppStateResponse) throws IOException {
            if (getOpenAppStateResponse.open_app != null) {
                OpenApp.ADAPTER.encodeWithTag(protoWriter, 1, getOpenAppStateResponse.open_app);
            }
            protoWriter.writeBytes(getOpenAppStateResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse$a */
    public static final class C18667a extends Message.Builder<GetOpenAppStateResponse, C18667a> {

        /* renamed from: a */
        public OpenApp f46196a;

        /* renamed from: a */
        public GetOpenAppStateResponse build() {
            return new GetOpenAppStateResponse(this.f46196a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18667a newBuilder() {
        C18667a aVar = new C18667a();
        aVar.f46196a = this.open_app;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetOpenAppStateResponse");
        StringBuilder sb = new StringBuilder();
        if (this.open_app != null) {
            sb.append(", open_app=");
            sb.append(this.open_app);
        }
        StringBuilder replace = sb.replace(0, 2, "GetOpenAppStateResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetOpenAppStateResponse(OpenApp openApp) {
        this(openApp, ByteString.EMPTY);
    }

    public GetOpenAppStateResponse(OpenApp openApp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.open_app = openApp;
    }
}
