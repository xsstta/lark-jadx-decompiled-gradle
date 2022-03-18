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

public final class RecallGroupMessageRequest extends Message<RecallGroupMessageRequest, C17991a> {
    public static final ProtoAdapter<RecallGroupMessageRequest> ADAPTER = new C17992b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.im.v1.RecallGroupMessageRequest$b */
    private static final class C17992b extends ProtoAdapter<RecallGroupMessageRequest> {
        C17992b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecallGroupMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RecallGroupMessageRequest recallGroupMessageRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recallGroupMessageRequest.id) + recallGroupMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RecallGroupMessageRequest decode(ProtoReader protoReader) throws IOException {
            C17991a aVar = new C17991a();
            aVar.f45088a = "";
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
                    aVar.f45088a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecallGroupMessageRequest recallGroupMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallGroupMessageRequest.id);
            protoWriter.writeBytes(recallGroupMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.RecallGroupMessageRequest$a */
    public static final class C17991a extends Message.Builder<RecallGroupMessageRequest, C17991a> {

        /* renamed from: a */
        public String f45088a;

        /* renamed from: a */
        public RecallGroupMessageRequest build() {
            String str = this.f45088a;
            if (str != null) {
                return new RecallGroupMessageRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        /* renamed from: a */
        public C17991a mo62514a(String str) {
            this.f45088a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17991a newBuilder() {
        C17991a aVar = new C17991a();
        aVar.f45088a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "RecallGroupMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "RecallGroupMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RecallGroupMessageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public RecallGroupMessageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
