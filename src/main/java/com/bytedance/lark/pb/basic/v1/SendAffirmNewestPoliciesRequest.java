package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendAffirmNewestPoliciesRequest extends Message<SendAffirmNewestPoliciesRequest, C15251a> {
    public static final ProtoAdapter<SendAffirmNewestPoliciesRequest> ADAPTER = new C15252b();
    private static final long serialVersionUID = 0;
    public final String version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendAffirmNewestPoliciesRequest$b */
    private static final class C15252b extends ProtoAdapter<SendAffirmNewestPoliciesRequest> {
        C15252b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendAffirmNewestPoliciesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendAffirmNewestPoliciesRequest sendAffirmNewestPoliciesRequest) {
            int i;
            if (sendAffirmNewestPoliciesRequest.version != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendAffirmNewestPoliciesRequest.version);
            } else {
                i = 0;
            }
            return i + sendAffirmNewestPoliciesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendAffirmNewestPoliciesRequest decode(ProtoReader protoReader) throws IOException {
            C15251a aVar = new C15251a();
            aVar.f40430a = "";
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
                    aVar.f40430a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendAffirmNewestPoliciesRequest sendAffirmNewestPoliciesRequest) throws IOException {
            if (sendAffirmNewestPoliciesRequest.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendAffirmNewestPoliciesRequest.version);
            }
            protoWriter.writeBytes(sendAffirmNewestPoliciesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SendAffirmNewestPoliciesRequest$a */
    public static final class C15251a extends Message.Builder<SendAffirmNewestPoliciesRequest, C15251a> {

        /* renamed from: a */
        public String f40430a;

        /* renamed from: a */
        public SendAffirmNewestPoliciesRequest build() {
            return new SendAffirmNewestPoliciesRequest(this.f40430a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15251a mo55521a(String str) {
            this.f40430a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15251a newBuilder() {
        C15251a aVar = new C15251a();
        aVar.f40430a = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SendAffirmNewestPoliciesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "SendAffirmNewestPoliciesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendAffirmNewestPoliciesRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SendAffirmNewestPoliciesRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = str;
    }
}
