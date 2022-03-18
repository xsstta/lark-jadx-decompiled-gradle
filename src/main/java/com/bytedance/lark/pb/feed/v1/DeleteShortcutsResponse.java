package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteShortcutsResponse extends Message<DeleteShortcutsResponse, C17114a> {
    public static final ProtoAdapter<DeleteShortcutsResponse> ADAPTER = new C17115b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.DeleteShortcutsResponse$b */
    private static final class C17115b extends ProtoAdapter<DeleteShortcutsResponse> {
        C17115b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteShortcutsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteShortcutsResponse deleteShortcutsResponse) {
            return deleteShortcutsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteShortcutsResponse decode(ProtoReader protoReader) throws IOException {
            C17114a aVar = new C17114a();
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
        public void encode(ProtoWriter protoWriter, DeleteShortcutsResponse deleteShortcutsResponse) throws IOException {
            protoWriter.writeBytes(deleteShortcutsResponse.unknownFields());
        }
    }

    public DeleteShortcutsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.DeleteShortcutsResponse$a */
    public static final class C17114a extends Message.Builder<DeleteShortcutsResponse, C17114a> {
        /* renamed from: a */
        public DeleteShortcutsResponse build() {
            return new DeleteShortcutsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17114a newBuilder() {
        C17114a aVar = new C17114a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "DeleteShortcutsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteShortcutsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteShortcutsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
