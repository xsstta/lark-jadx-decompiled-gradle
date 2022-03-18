package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DisableChatSharedRequest extends Message<DisableChatSharedRequest, C17446a> {
    public static final ProtoAdapter<DisableChatSharedRequest> ADAPTER = new C17447b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.DisableChatSharedRequest$b */
    private static final class C17447b extends ProtoAdapter<DisableChatSharedRequest> {
        C17447b() {
            super(FieldEncoding.LENGTH_DELIMITED, DisableChatSharedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DisableChatSharedRequest disableChatSharedRequest) {
            int i;
            if (disableChatSharedRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, disableChatSharedRequest.message_id);
            } else {
                i = 0;
            }
            return i + disableChatSharedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DisableChatSharedRequest decode(ProtoReader protoReader) throws IOException {
            C17446a aVar = new C17446a();
            aVar.f44337a = "";
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
                    aVar.f44337a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DisableChatSharedRequest disableChatSharedRequest) throws IOException {
            if (disableChatSharedRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, disableChatSharedRequest.message_id);
            }
            protoWriter.writeBytes(disableChatSharedRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.DisableChatSharedRequest$a */
    public static final class C17446a extends Message.Builder<DisableChatSharedRequest, C17446a> {

        /* renamed from: a */
        public String f44337a;

        /* renamed from: a */
        public DisableChatSharedRequest build() {
            return new DisableChatSharedRequest(this.f44337a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17446a mo61175a(String str) {
            this.f44337a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17446a newBuilder() {
        C17446a aVar = new C17446a();
        aVar.f44337a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "DisableChatSharedRequest");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "DisableChatSharedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DisableChatSharedRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DisableChatSharedRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
