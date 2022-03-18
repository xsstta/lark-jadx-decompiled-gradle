package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushAppsNeedUpdateRequest extends Message<PushAppsNeedUpdateRequest, C18689a> {
    public static final ProtoAdapter<PushAppsNeedUpdateRequest> ADAPTER = new C18690b();
    private static final long serialVersionUID = 0;
    public final String timestamp;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushAppsNeedUpdateRequest$b */
    private static final class C18690b extends ProtoAdapter<PushAppsNeedUpdateRequest> {
        C18690b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAppsNeedUpdateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAppsNeedUpdateRequest pushAppsNeedUpdateRequest) {
            int i;
            if (pushAppsNeedUpdateRequest.timestamp != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushAppsNeedUpdateRequest.timestamp);
            } else {
                i = 0;
            }
            return i + pushAppsNeedUpdateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushAppsNeedUpdateRequest decode(ProtoReader protoReader) throws IOException {
            C18689a aVar = new C18689a();
            aVar.f46228a = "";
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
                    aVar.f46228a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAppsNeedUpdateRequest pushAppsNeedUpdateRequest) throws IOException {
            if (pushAppsNeedUpdateRequest.timestamp != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushAppsNeedUpdateRequest.timestamp);
            }
            protoWriter.writeBytes(pushAppsNeedUpdateRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushAppsNeedUpdateRequest$a */
    public static final class C18689a extends Message.Builder<PushAppsNeedUpdateRequest, C18689a> {

        /* renamed from: a */
        public String f46228a;

        /* renamed from: a */
        public PushAppsNeedUpdateRequest build() {
            return new PushAppsNeedUpdateRequest(this.f46228a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18689a newBuilder() {
        C18689a aVar = new C18689a();
        aVar.f46228a = this.timestamp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PushAppsNeedUpdateRequest");
        StringBuilder sb = new StringBuilder();
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "PushAppsNeedUpdateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushAppsNeedUpdateRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public PushAppsNeedUpdateRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timestamp = str;
    }
}
