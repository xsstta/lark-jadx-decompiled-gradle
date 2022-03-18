package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteQuasiMessageResponse extends Message<DeleteQuasiMessageResponse, C17422a> {
    public static final ProtoAdapter<DeleteQuasiMessageResponse> ADAPTER = new C17423b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteQuasiMessageResponse$b */
    private static final class C17423b extends ProtoAdapter<DeleteQuasiMessageResponse> {
        C17423b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteQuasiMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteQuasiMessageResponse deleteQuasiMessageResponse) {
            return deleteQuasiMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteQuasiMessageResponse decode(ProtoReader protoReader) throws IOException {
            C17422a aVar = new C17422a();
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
        public void encode(ProtoWriter protoWriter, DeleteQuasiMessageResponse deleteQuasiMessageResponse) throws IOException {
            protoWriter.writeBytes(deleteQuasiMessageResponse.unknownFields());
        }
    }

    public DeleteQuasiMessageResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DeleteQuasiMessageResponse$a */
    public static final class C17422a extends Message.Builder<DeleteQuasiMessageResponse, C17422a> {
        /* renamed from: a */
        public DeleteQuasiMessageResponse build() {
            return new DeleteQuasiMessageResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17422a newBuilder() {
        C17422a aVar = new C17422a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DeleteQuasiMessageResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteQuasiMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteQuasiMessageResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
