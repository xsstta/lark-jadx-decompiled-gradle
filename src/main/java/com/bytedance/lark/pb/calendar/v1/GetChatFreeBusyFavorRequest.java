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

public final class GetChatFreeBusyFavorRequest extends Message<GetChatFreeBusyFavorRequest, C15680a> {
    public static final ProtoAdapter<GetChatFreeBusyFavorRequest> ADAPTER = new C15681b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorRequest$b */
    private static final class C15681b extends ProtoAdapter<GetChatFreeBusyFavorRequest> {
        C15681b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatFreeBusyFavorRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatFreeBusyFavorRequest getChatFreeBusyFavorRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatFreeBusyFavorRequest.chat_id) + getChatFreeBusyFavorRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatFreeBusyFavorRequest decode(ProtoReader protoReader) throws IOException {
            C15680a aVar = new C15680a();
            aVar.f41442a = "";
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
                    aVar.f41442a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatFreeBusyFavorRequest getChatFreeBusyFavorRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatFreeBusyFavorRequest.chat_id);
            protoWriter.writeBytes(getChatFreeBusyFavorRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorRequest$a */
    public static final class C15680a extends Message.Builder<GetChatFreeBusyFavorRequest, C15680a> {

        /* renamed from: a */
        public String f41442a;

        /* renamed from: a */
        public GetChatFreeBusyFavorRequest build() {
            String str = this.f41442a;
            if (str != null) {
                return new GetChatFreeBusyFavorRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C15680a mo56771a(String str) {
            this.f41442a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15680a newBuilder() {
        C15680a aVar = new C15680a();
        aVar.f41442a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetChatFreeBusyFavorRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatFreeBusyFavorRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatFreeBusyFavorRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatFreeBusyFavorRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
