package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutFinishOncallRequest extends Message<PutFinishOncallRequest, C17276a> {
    public static final ProtoAdapter<PutFinishOncallRequest> ADAPTER = new C17277b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String oncall_id;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PutFinishOncallRequest$b */
    private static final class C17277b extends ProtoAdapter<PutFinishOncallRequest> {
        C17277b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutFinishOncallRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PutFinishOncallRequest putFinishOncallRequest) {
            int i;
            int i2 = 0;
            if (putFinishOncallRequest.oncall_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, putFinishOncallRequest.oncall_id);
            } else {
                i = 0;
            }
            if (putFinishOncallRequest.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, putFinishOncallRequest.chat_id);
            }
            return i + i2 + putFinishOncallRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PutFinishOncallRequest decode(ProtoReader protoReader) throws IOException {
            C17276a aVar = new C17276a();
            aVar.f44105a = "";
            aVar.f44106b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44105a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44106b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutFinishOncallRequest putFinishOncallRequest) throws IOException {
            if (putFinishOncallRequest.oncall_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, putFinishOncallRequest.oncall_id);
            }
            if (putFinishOncallRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, putFinishOncallRequest.chat_id);
            }
            protoWriter.writeBytes(putFinishOncallRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PutFinishOncallRequest$a */
    public static final class C17276a extends Message.Builder<PutFinishOncallRequest, C17276a> {

        /* renamed from: a */
        public String f44105a;

        /* renamed from: b */
        public String f44106b;

        /* renamed from: a */
        public PutFinishOncallRequest build() {
            return new PutFinishOncallRequest(this.f44105a, this.f44106b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17276a newBuilder() {
        C17276a aVar = new C17276a();
        aVar.f44105a = this.oncall_id;
        aVar.f44106b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "PutFinishOncallRequest");
        StringBuilder sb = new StringBuilder();
        if (this.oncall_id != null) {
            sb.append(", oncall_id=");
            sb.append(this.oncall_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PutFinishOncallRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PutFinishOncallRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public PutFinishOncallRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.oncall_id = str;
        this.chat_id = str2;
    }
}
