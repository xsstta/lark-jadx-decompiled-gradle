package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUGScenarioCacheRequest extends Message<GetUGScenarioCacheRequest, C19779a> {
    public static final ProtoAdapter<GetUGScenarioCacheRequest> ADAPTER = new C19780b();
    private static final long serialVersionUID = 0;
    public final String scenario_id;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioCacheRequest$b */
    private static final class C19780b extends ProtoAdapter<GetUGScenarioCacheRequest> {
        C19780b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGScenarioCacheRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGScenarioCacheRequest getUGScenarioCacheRequest) {
            int i;
            if (getUGScenarioCacheRequest.scenario_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUGScenarioCacheRequest.scenario_id);
            } else {
                i = 0;
            }
            return i + getUGScenarioCacheRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGScenarioCacheRequest decode(ProtoReader protoReader) throws IOException {
            C19779a aVar = new C19779a();
            aVar.f48240a = "";
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
                    aVar.f48240a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGScenarioCacheRequest getUGScenarioCacheRequest) throws IOException {
            if (getUGScenarioCacheRequest.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUGScenarioCacheRequest.scenario_id);
            }
            protoWriter.writeBytes(getUGScenarioCacheRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGScenarioCacheRequest$a */
    public static final class C19779a extends Message.Builder<GetUGScenarioCacheRequest, C19779a> {

        /* renamed from: a */
        public String f48240a;

        /* renamed from: a */
        public GetUGScenarioCacheRequest build() {
            return new GetUGScenarioCacheRequest(this.f48240a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19779a mo66971a(String str) {
            this.f48240a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19779a newBuilder() {
        C19779a aVar = new C19779a();
        aVar.f48240a = this.scenario_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGScenarioCacheRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGScenarioCacheRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGScenarioCacheRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetUGScenarioCacheRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_id = str;
    }
}
