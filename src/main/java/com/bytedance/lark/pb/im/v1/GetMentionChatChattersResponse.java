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
import java.util.Map;
import okio.ByteString;

public final class GetMentionChatChattersResponse extends Message<GetMentionChatChattersResponse, C17607a> {
    public static final ProtoAdapter<GetMentionChatChattersResponse> ADAPTER = new C17608b();
    public static final Boolean DEFAULT_SHOW_SEARCH = false;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<String> in_chat_chatter_ids;
    public final List<String> out_chat_chatter_ids;
    public final Boolean show_search;
    public final List<String> wanted_mention_ids;
    public final Map<String, String> wanted_mention_tags;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMentionChatChattersResponse$a */
    public static final class C17607a extends Message.Builder<GetMentionChatChattersResponse, C17607a> {

        /* renamed from: a */
        public C14928Entity f44595a;

        /* renamed from: b */
        public List<String> f44596b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f44597c = Internal.newMutableList();

        /* renamed from: d */
        public List<String> f44598d = Internal.newMutableList();

        /* renamed from: e */
        public Boolean f44599e;

        /* renamed from: f */
        public Map<String, String> f44600f = Internal.newMutableMap();

        /* renamed from: a */
        public GetMentionChatChattersResponse build() {
            return new GetMentionChatChattersResponse(this.f44595a, this.f44596b, this.f44597c, this.f44598d, this.f44599e, this.f44600f, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMentionChatChattersResponse$b */
    private static final class C17608b extends ProtoAdapter<GetMentionChatChattersResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f44601a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C17608b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMentionChatChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMentionChatChattersResponse getMentionChatChattersResponse) {
            int i;
            int i2 = 0;
            if (getMentionChatChattersResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getMentionChatChattersResponse.entity);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getMentionChatChattersResponse.wanted_mention_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getMentionChatChattersResponse.in_chat_chatter_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, getMentionChatChattersResponse.out_chat_chatter_ids);
            if (getMentionChatChattersResponse.show_search != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getMentionChatChattersResponse.show_search);
            }
            return encodedSizeWithTag + i2 + this.f44601a.encodedSizeWithTag(6, getMentionChatChattersResponse.wanted_mention_tags) + getMentionChatChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMentionChatChattersResponse decode(ProtoReader protoReader) throws IOException {
            C17607a aVar = new C17607a();
            aVar.f44599e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44595a = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44596b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f44597c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f44598d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f44599e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44600f.putAll(this.f44601a.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMentionChatChattersResponse getMentionChatChattersResponse) throws IOException {
            if (getMentionChatChattersResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getMentionChatChattersResponse.entity);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getMentionChatChattersResponse.wanted_mention_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getMentionChatChattersResponse.in_chat_chatter_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, getMentionChatChattersResponse.out_chat_chatter_ids);
            if (getMentionChatChattersResponse.show_search != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getMentionChatChattersResponse.show_search);
            }
            this.f44601a.encodeWithTag(protoWriter, 6, getMentionChatChattersResponse.wanted_mention_tags);
            protoWriter.writeBytes(getMentionChatChattersResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17607a newBuilder() {
        C17607a aVar = new C17607a();
        aVar.f44595a = this.entity;
        aVar.f44596b = Internal.copyOf("wanted_mention_ids", this.wanted_mention_ids);
        aVar.f44597c = Internal.copyOf("in_chat_chatter_ids", this.in_chat_chatter_ids);
        aVar.f44598d = Internal.copyOf("out_chat_chatter_ids", this.out_chat_chatter_ids);
        aVar.f44599e = this.show_search;
        aVar.f44600f = Internal.copyOf("wanted_mention_tags", this.wanted_mention_tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMentionChatChattersResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.wanted_mention_ids.isEmpty()) {
            sb.append(", wanted_mention_ids=");
            sb.append(this.wanted_mention_ids);
        }
        if (!this.in_chat_chatter_ids.isEmpty()) {
            sb.append(", in_chat_chatter_ids=");
            sb.append(this.in_chat_chatter_ids);
        }
        if (!this.out_chat_chatter_ids.isEmpty()) {
            sb.append(", out_chat_chatter_ids=");
            sb.append(this.out_chat_chatter_ids);
        }
        if (this.show_search != null) {
            sb.append(", show_search=");
            sb.append(this.show_search);
        }
        if (!this.wanted_mention_tags.isEmpty()) {
            sb.append(", wanted_mention_tags=");
            sb.append(this.wanted_mention_tags);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMentionChatChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMentionChatChattersResponse(C14928Entity entity2, List<String> list, List<String> list2, List<String> list3, Boolean bool, Map<String, String> map) {
        this(entity2, list, list2, list3, bool, map, ByteString.EMPTY);
    }

    public GetMentionChatChattersResponse(C14928Entity entity2, List<String> list, List<String> list2, List<String> list3, Boolean bool, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.wanted_mention_ids = Internal.immutableCopyOf("wanted_mention_ids", list);
        this.in_chat_chatter_ids = Internal.immutableCopyOf("in_chat_chatter_ids", list2);
        this.out_chat_chatter_ids = Internal.immutableCopyOf("out_chat_chatter_ids", list3);
        this.show_search = bool;
        this.wanted_mention_tags = Internal.immutableCopyOf("wanted_mention_tags", map);
    }
}
