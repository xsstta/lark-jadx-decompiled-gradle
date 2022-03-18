package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CheckChattersInChatRequest extends Message<CheckChattersInChatRequest, C17322a> {
    public static final ProtoAdapter<CheckChattersInChatRequest> ADAPTER = new C17323b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckChattersInChatRequest$b */
    private static final class C17323b extends ProtoAdapter<CheckChattersInChatRequest> {
        C17323b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckChattersInChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckChattersInChatRequest checkChattersInChatRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, checkChattersInChatRequest.chat_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, checkChattersInChatRequest.chatter_ids) + checkChattersInChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckChattersInChatRequest decode(ProtoReader protoReader) throws IOException {
            C17322a aVar = new C17322a();
            aVar.f44174a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44174a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44175b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckChattersInChatRequest checkChattersInChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkChattersInChatRequest.chat_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, checkChattersInChatRequest.chatter_ids);
            protoWriter.writeBytes(checkChattersInChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckChattersInChatRequest$a */
    public static final class C17322a extends Message.Builder<CheckChattersInChatRequest, C17322a> {

        /* renamed from: a */
        public String f44174a;

        /* renamed from: b */
        public List<String> f44175b = Internal.newMutableList();

        /* renamed from: a */
        public CheckChattersInChatRequest build() {
            String str = this.f44174a;
            if (str != null) {
                return new CheckChattersInChatRequest(str, this.f44175b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17322a mo60828a(String str) {
            this.f44174a = str;
            return this;
        }

        /* renamed from: a */
        public C17322a mo60829a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44175b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17322a newBuilder() {
        C17322a aVar = new C17322a();
        aVar.f44174a = this.chat_id;
        aVar.f44175b = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CheckChattersInChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckChattersInChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckChattersInChatRequest(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public CheckChattersInChatRequest(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
    }
}
