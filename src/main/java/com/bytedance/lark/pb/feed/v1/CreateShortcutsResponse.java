package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateShortcutsResponse extends Message<CreateShortcutsResponse, C17106a> {
    public static final ProtoAdapter<CreateShortcutsResponse> ADAPTER = new C17107b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.CreateShortcutsResponse$b */
    private static final class C17107b extends ProtoAdapter<CreateShortcutsResponse> {
        C17107b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateShortcutsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateShortcutsResponse createShortcutsResponse) {
            return createShortcutsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateShortcutsResponse decode(ProtoReader protoReader) throws IOException {
            C17106a aVar = new C17106a();
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
        public void encode(ProtoWriter protoWriter, CreateShortcutsResponse createShortcutsResponse) throws IOException {
            protoWriter.writeBytes(createShortcutsResponse.unknownFields());
        }
    }

    public CreateShortcutsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.CreateShortcutsResponse$a */
    public static final class C17106a extends Message.Builder<CreateShortcutsResponse, C17106a> {
        /* renamed from: a */
        public CreateShortcutsResponse build() {
            return new CreateShortcutsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17106a newBuilder() {
        C17106a aVar = new C17106a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "CreateShortcutsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "CreateShortcutsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateShortcutsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
