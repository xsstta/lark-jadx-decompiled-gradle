package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUGLocalRuleResponse extends Message<GetUGLocalRuleResponse, C19771a> {
    public static final ProtoAdapter<GetUGLocalRuleResponse> ADAPTER = new C19772b();
    private static final long serialVersionUID = 0;
    public final LocalRule local_rule;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGLocalRuleResponse$b */
    private static final class C19772b extends ProtoAdapter<GetUGLocalRuleResponse> {
        C19772b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUGLocalRuleResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUGLocalRuleResponse getUGLocalRuleResponse) {
            int i;
            if (getUGLocalRuleResponse.local_rule != null) {
                i = LocalRule.ADAPTER.encodedSizeWithTag(1, getUGLocalRuleResponse.local_rule);
            } else {
                i = 0;
            }
            return i + getUGLocalRuleResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUGLocalRuleResponse decode(ProtoReader protoReader) throws IOException {
            C19771a aVar = new C19771a();
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
                    aVar.f48233a = LocalRule.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUGLocalRuleResponse getUGLocalRuleResponse) throws IOException {
            if (getUGLocalRuleResponse.local_rule != null) {
                LocalRule.ADAPTER.encodeWithTag(protoWriter, 1, getUGLocalRuleResponse.local_rule);
            }
            protoWriter.writeBytes(getUGLocalRuleResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.GetUGLocalRuleResponse$a */
    public static final class C19771a extends Message.Builder<GetUGLocalRuleResponse, C19771a> {

        /* renamed from: a */
        public LocalRule f48233a;

        /* renamed from: a */
        public GetUGLocalRuleResponse build() {
            return new GetUGLocalRuleResponse(this.f48233a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19771a newBuilder() {
        C19771a aVar = new C19771a();
        aVar.f48233a = this.local_rule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "GetUGLocalRuleResponse");
        StringBuilder sb = new StringBuilder();
        if (this.local_rule != null) {
            sb.append(", local_rule=");
            sb.append(this.local_rule);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUGLocalRuleResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUGLocalRuleResponse(LocalRule localRule) {
        this(localRule, ByteString.EMPTY);
    }

    public GetUGLocalRuleResponse(LocalRule localRule, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_rule = localRule;
    }
}
