package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChatOptionInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MGetChatsResponse extends Message<MGetChatsResponse, C17801a> {
    public static final ProtoAdapter<MGetChatsResponse> ADAPTER = new C17802b();
    private static final long serialVersionUID = 0;
    public final Map<String, ChatOptionInfo> chat_option_info;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetChatsResponse$a */
    public static final class C17801a extends Message.Builder<MGetChatsResponse, C17801a> {

        /* renamed from: a */
        public C14928Entity f44844a;

        /* renamed from: b */
        public Map<String, ChatOptionInfo> f44845b = Internal.newMutableMap();

        /* renamed from: a */
        public MGetChatsResponse build() {
            C14928Entity entity = this.f44844a;
            if (entity != null) {
                return new MGetChatsResponse(entity, this.f44845b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.MGetChatsResponse$b */
    private static final class C17802b extends ProtoAdapter<MGetChatsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ChatOptionInfo>> f44846a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatOptionInfo.ADAPTER);

        C17802b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetChatsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetChatsResponse mGetChatsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, mGetChatsResponse.entity) + this.f44846a.encodedSizeWithTag(2, mGetChatsResponse.chat_option_info) + mGetChatsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetChatsResponse decode(ProtoReader protoReader) throws IOException {
            C17801a aVar = new C17801a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44844a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44845b.putAll(this.f44846a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetChatsResponse mGetChatsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, mGetChatsResponse.entity);
            this.f44846a.encodeWithTag(protoWriter, 2, mGetChatsResponse.chat_option_info);
            protoWriter.writeBytes(mGetChatsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17801a newBuilder() {
        C17801a aVar = new C17801a();
        aVar.f44844a = this.entity;
        aVar.f44845b = Internal.copyOf("chat_option_info", this.chat_option_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "MGetChatsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.chat_option_info.isEmpty()) {
            sb.append(", chat_option_info=");
            sb.append(this.chat_option_info);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetChatsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetChatsResponse(C14928Entity entity2, Map<String, ChatOptionInfo> map) {
        this(entity2, map, ByteString.EMPTY);
    }

    public MGetChatsResponse(C14928Entity entity2, Map<String, ChatOptionInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.chat_option_info = Internal.immutableCopyOf("chat_option_info", map);
    }
}
