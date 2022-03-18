package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class AckUrgentRequest extends Message<AckUrgentRequest, C17280a> {
    public static final ProtoAdapter<AckUrgentRequest> ADAPTER = new C17281b();
    private static final long serialVersionUID = 0;
    public final String urgent_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.AckUrgentRequest$b */
    private static final class C17281b extends ProtoAdapter<AckUrgentRequest> {
        C17281b() {
            super(FieldEncoding.LENGTH_DELIMITED, AckUrgentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AckUrgentRequest ackUrgentRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, ackUrgentRequest.urgent_id) + ackUrgentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AckUrgentRequest decode(ProtoReader protoReader) throws IOException {
            C17280a aVar = new C17280a();
            aVar.f44107a = "";
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
                    aVar.f44107a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AckUrgentRequest ackUrgentRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ackUrgentRequest.urgent_id);
            protoWriter.writeBytes(ackUrgentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.AckUrgentRequest$a */
    public static final class C17280a extends Message.Builder<AckUrgentRequest, C17280a> {

        /* renamed from: a */
        public String f44107a;

        /* renamed from: a */
        public AckUrgentRequest build() {
            String str = this.f44107a;
            if (str != null) {
                return new AckUrgentRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "urgent_id");
        }

        /* renamed from: a */
        public C17280a mo60722a(String str) {
            this.f44107a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17280a newBuilder() {
        C17280a aVar = new C17280a();
        aVar.f44107a = this.urgent_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "AckUrgentRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", urgent_id=");
        sb.append(this.urgent_id);
        StringBuilder replace = sb.replace(0, 2, "AckUrgentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AckUrgentRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public AckUrgentRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urgent_id = str;
    }
}
