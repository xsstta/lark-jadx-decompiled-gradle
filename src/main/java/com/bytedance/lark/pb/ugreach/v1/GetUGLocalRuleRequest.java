package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUGLocalRuleRequest extends Message<GetUGLocalRuleRequest, C19769a> {
    public static final ProtoAdapter<GetUGLocalRuleRequest> ADAPTER = new C19770b();
    private static final long serialVersionUID = 0;
    public final String scenario_id;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGLocalRuleRequest$b */
    private static final class C19770b extends ProtoAdapter<GetUGLocalRuleRequest> {
        C19770b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGLocalRuleRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGLocalRuleRequest getUGLocalRuleRequest) {
            int i;
            if (getUGLocalRuleRequest.scenario_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getUGLocalRuleRequest.scenario_id);
            } else {
                i = 0;
            }
            return i + getUGLocalRuleRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGLocalRuleRequest decode(ProtoReader protoReader) throws IOException {
            C19769a aVar = new C19769a();
            aVar.f48232a = "";
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
                    aVar.f48232a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGLocalRuleRequest getUGLocalRuleRequest) throws IOException {
            if (getUGLocalRuleRequest.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getUGLocalRuleRequest.scenario_id);
            }
            protoWriter.writeBytes(getUGLocalRuleRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGLocalRuleRequest$a */
    public static final class C19769a extends Message.Builder<GetUGLocalRuleRequest, C19769a> {

        /* renamed from: a */
        public String f48232a;

        /* renamed from: a */
        public GetUGLocalRuleRequest build() {
            return new GetUGLocalRuleRequest(this.f48232a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19769a mo66950a(String str) {
            this.f48232a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19769a newBuilder() {
        C19769a aVar = new C19769a();
        aVar.f48232a = this.scenario_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGLocalRuleRequest");
        StringBuilder sb = new StringBuilder();
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGLocalRuleRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGLocalRuleRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetUGLocalRuleRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scenario_id = str;
    }
}
