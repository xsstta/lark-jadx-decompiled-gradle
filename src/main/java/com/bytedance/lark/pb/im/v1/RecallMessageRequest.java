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

public final class RecallMessageRequest extends Message<RecallMessageRequest, C17993a> {
    public static final ProtoAdapter<RecallMessageRequest> ADAPTER = new C17994b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.im.v1.RecallMessageRequest$b */
    private static final class C17994b extends ProtoAdapter<RecallMessageRequest> {
        C17994b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecallMessageRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(RecallMessageRequest recallMessageRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, recallMessageRequest.id) + recallMessageRequest.unknownFields().size();
        }

        /* renamed from: a */
        public RecallMessageRequest decode(ProtoReader protoReader) throws IOException {
            C17993a aVar = new C17993a();
            aVar.f45089a = "";
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
                    aVar.f45089a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RecallMessageRequest recallMessageRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallMessageRequest.id);
            protoWriter.writeBytes(recallMessageRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.RecallMessageRequest$a */
    public static final class C17993a extends Message.Builder<RecallMessageRequest, C17993a> {

        /* renamed from: a */
        public String f45089a;

        /* renamed from: a */
        public RecallMessageRequest build() {
            String str = this.f45089a;
            if (str != null) {
                return new RecallMessageRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        /* renamed from: a */
        public C17993a mo62519a(String str) {
            this.f45089a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17993a newBuilder() {
        C17993a aVar = new C17993a();
        aVar.f45089a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "RecallMessageRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "RecallMessageRequest{");
        replace.append('}');
        return replace.toString();
    }

    public RecallMessageRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public RecallMessageRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
