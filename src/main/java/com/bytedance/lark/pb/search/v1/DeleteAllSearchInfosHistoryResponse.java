package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteAllSearchInfosHistoryResponse extends Message<DeleteAllSearchInfosHistoryResponse, C18821a> {
    public static final ProtoAdapter<DeleteAllSearchInfosHistoryResponse> ADAPTER = new C18822b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.search.v1.DeleteAllSearchInfosHistoryResponse$b */
    private static final class C18822b extends ProtoAdapter<DeleteAllSearchInfosHistoryResponse> {
        C18822b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteAllSearchInfosHistoryResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteAllSearchInfosHistoryResponse deleteAllSearchInfosHistoryResponse) {
            return deleteAllSearchInfosHistoryResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteAllSearchInfosHistoryResponse decode(ProtoReader protoReader) throws IOException {
            C18821a aVar = new C18821a();
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
        public void encode(ProtoWriter protoWriter, DeleteAllSearchInfosHistoryResponse deleteAllSearchInfosHistoryResponse) throws IOException {
            protoWriter.writeBytes(deleteAllSearchInfosHistoryResponse.unknownFields());
        }
    }

    public DeleteAllSearchInfosHistoryResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.DeleteAllSearchInfosHistoryResponse$a */
    public static final class C18821a extends Message.Builder<DeleteAllSearchInfosHistoryResponse, C18821a> {
        /* renamed from: a */
        public DeleteAllSearchInfosHistoryResponse build() {
            return new DeleteAllSearchInfosHistoryResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18821a newBuilder() {
        C18821a aVar = new C18821a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "DeleteAllSearchInfosHistoryResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteAllSearchInfosHistoryResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteAllSearchInfosHistoryResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
