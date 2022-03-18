package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatPostUsersResponse extends Message<GetChatPostUsersResponse, C17540a> {
    public static final ProtoAdapter<GetChatPostUsersResponse> ADAPTER = new C17541b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<String> user_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPostUsersResponse$b */
    private static final class C17541b extends ProtoAdapter<GetChatPostUsersResponse> {
        C17541b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatPostUsersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatPostUsersResponse getChatPostUsersResponse) {
            int i;
            if (getChatPostUsersResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getChatPostUsersResponse.entity);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getChatPostUsersResponse.user_ids) + getChatPostUsersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatPostUsersResponse decode(ProtoReader protoReader) throws IOException {
            C17540a aVar = new C17540a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44494a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44495b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatPostUsersResponse getChatPostUsersResponse) throws IOException {
            if (getChatPostUsersResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getChatPostUsersResponse.entity);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getChatPostUsersResponse.user_ids);
            protoWriter.writeBytes(getChatPostUsersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPostUsersResponse$a */
    public static final class C17540a extends Message.Builder<GetChatPostUsersResponse, C17540a> {

        /* renamed from: a */
        public C14928Entity f44494a;

        /* renamed from: b */
        public List<String> f44495b = Internal.newMutableList();

        /* renamed from: a */
        public GetChatPostUsersResponse build() {
            return new GetChatPostUsersResponse(this.f44494a, this.f44495b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17540a newBuilder() {
        C17540a aVar = new C17540a();
        aVar.f44494a = this.entity;
        aVar.f44495b = Internal.copyOf("user_ids", this.user_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatPostUsersResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatPostUsersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatPostUsersResponse(C14928Entity entity2, List<String> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public GetChatPostUsersResponse(C14928Entity entity2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.user_ids = Internal.immutableCopyOf("user_ids", list);
    }
}
