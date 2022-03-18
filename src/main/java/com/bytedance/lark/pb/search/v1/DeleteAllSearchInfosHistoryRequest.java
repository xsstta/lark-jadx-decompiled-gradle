package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteAllSearchInfosHistoryRequest extends Message<DeleteAllSearchInfosHistoryRequest, C18819a> {
    public static final ProtoAdapter<DeleteAllSearchInfosHistoryRequest> ADAPTER = new C18820b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.search.v1.DeleteAllSearchInfosHistoryRequest$b */
    private static final class C18820b extends ProtoAdapter<DeleteAllSearchInfosHistoryRequest> {
        C18820b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteAllSearchInfosHistoryRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteAllSearchInfosHistoryRequest deleteAllSearchInfosHistoryRequest) {
            return deleteAllSearchInfosHistoryRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteAllSearchInfosHistoryRequest decode(ProtoReader protoReader) throws IOException {
            C18819a aVar = new C18819a();
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
        public void encode(ProtoWriter protoWriter, DeleteAllSearchInfosHistoryRequest deleteAllSearchInfosHistoryRequest) throws IOException {
            protoWriter.writeBytes(deleteAllSearchInfosHistoryRequest.unknownFields());
        }
    }

    public DeleteAllSearchInfosHistoryRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.DeleteAllSearchInfosHistoryRequest$a */
    public static final class C18819a extends Message.Builder<DeleteAllSearchInfosHistoryRequest, C18819a> {
        /* renamed from: a */
        public DeleteAllSearchInfosHistoryRequest build() {
            return new DeleteAllSearchInfosHistoryRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18819a newBuilder() {
        C18819a aVar = new C18819a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "DeleteAllSearchInfosHistoryRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteAllSearchInfosHistoryRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteAllSearchInfosHistoryRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
