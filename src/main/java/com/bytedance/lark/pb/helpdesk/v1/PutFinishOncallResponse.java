package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PutFinishOncallResponse extends Message<PutFinishOncallResponse, C17278a> {
    public static final ProtoAdapter<PutFinishOncallResponse> ADAPTER = new C17279b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PutFinishOncallResponse$b */
    private static final class C17279b extends ProtoAdapter<PutFinishOncallResponse> {
        C17279b() {
            super(FieldEncoding.LENGTH_DELIMITED, PutFinishOncallResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PutFinishOncallResponse putFinishOncallResponse) {
            return putFinishOncallResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PutFinishOncallResponse decode(ProtoReader protoReader) throws IOException {
            C17278a aVar = new C17278a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PutFinishOncallResponse putFinishOncallResponse) throws IOException {
            protoWriter.writeBytes(putFinishOncallResponse.unknownFields());
        }
    }

    public PutFinishOncallResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PutFinishOncallResponse$a */
    public static final class C17278a extends Message.Builder<PutFinishOncallResponse, C17278a> {
        /* renamed from: a */
        public PutFinishOncallResponse build() {
            return new PutFinishOncallResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17278a newBuilder() {
        C17278a aVar = new C17278a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "PutFinishOncallResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PutFinishOncallResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PutFinishOncallResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
