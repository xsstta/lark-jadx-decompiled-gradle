package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DisplayTransferChatScrollCheckRequest extends Message<DisplayTransferChatScrollCheckRequest, C15598a> {
    public static final ProtoAdapter<DisplayTransferChatScrollCheckRequest> ADAPTER = new C15599b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DisplayTransferChatScrollCheckRequest$b */
    private static final class C15599b extends ProtoAdapter<DisplayTransferChatScrollCheckRequest> {
        C15599b() {
            super(FieldEncoding.LENGTH_DELIMITED, DisplayTransferChatScrollCheckRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DisplayTransferChatScrollCheckRequest displayTransferChatScrollCheckRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, displayTransferChatScrollCheckRequest.chat_id) + displayTransferChatScrollCheckRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DisplayTransferChatScrollCheckRequest decode(ProtoReader protoReader) throws IOException {
            C15598a aVar = new C15598a();
            aVar.f41329a = "";
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
                    aVar.f41329a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DisplayTransferChatScrollCheckRequest displayTransferChatScrollCheckRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, displayTransferChatScrollCheckRequest.chat_id);
            protoWriter.writeBytes(displayTransferChatScrollCheckRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DisplayTransferChatScrollCheckRequest$a */
    public static final class C15598a extends Message.Builder<DisplayTransferChatScrollCheckRequest, C15598a> {

        /* renamed from: a */
        public String f41329a;

        /* renamed from: a */
        public DisplayTransferChatScrollCheckRequest build() {
            String str = this.f41329a;
            if (str != null) {
                return new DisplayTransferChatScrollCheckRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C15598a mo56565a(String str) {
            this.f41329a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15598a newBuilder() {
        C15598a aVar = new C15598a();
        aVar.f41329a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DisplayTransferChatScrollCheckRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "DisplayTransferChatScrollCheckRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DisplayTransferChatScrollCheckRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DisplayTransferChatScrollCheckRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
