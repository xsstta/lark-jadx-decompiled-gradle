package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateShortcutsResponse extends Message<UpdateShortcutsResponse, C17248a> {
    public static final ProtoAdapter<UpdateShortcutsResponse> ADAPTER = new C17249b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateShortcutsResponse$b */
    private static final class C17249b extends ProtoAdapter<UpdateShortcutsResponse> {
        C17249b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateShortcutsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateShortcutsResponse updateShortcutsResponse) {
            return updateShortcutsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateShortcutsResponse decode(ProtoReader protoReader) throws IOException {
            C17248a aVar = new C17248a();
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
        public void encode(ProtoWriter protoWriter, UpdateShortcutsResponse updateShortcutsResponse) throws IOException {
            protoWriter.writeBytes(updateShortcutsResponse.unknownFields());
        }
    }

    public UpdateShortcutsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateShortcutsResponse$a */
    public static final class C17248a extends Message.Builder<UpdateShortcutsResponse, C17248a> {
        /* renamed from: a */
        public UpdateShortcutsResponse build() {
            return new UpdateShortcutsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17248a newBuilder() {
        C17248a aVar = new C17248a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "UpdateShortcutsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "UpdateShortcutsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateShortcutsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
