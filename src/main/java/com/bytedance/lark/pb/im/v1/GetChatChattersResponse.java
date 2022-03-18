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

public final class GetChatChattersResponse extends Message<GetChatChattersResponse, C17510a> {
    public static final ProtoAdapter<GetChatChattersResponse> ADAPTER = new C17511b();
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Boolean DEFAULT_SHOW_SEARCH = false;
    private static final long serialVersionUID = 0;
    public final Map<String, String> chatter_id2department_name;
    public final List<String> chatter_ids;
    public final String cursor;
    public final C14928Entity entity;
    public final List<LetterMap> letter_maps;
    public final Integer member_count;
    public final Map<String, String> nicknames;
    public final Map<String, Long> ordered_weight;
    public final Boolean show_search;
    public final Map<String, ChatChatterTagInfo> tag_infos;

    public static final class LetterMap extends Message<LetterMap, C17508a> {
        public static final ProtoAdapter<LetterMap> ADAPTER = new C17509b();
        private static final long serialVersionUID = 0;
        public final List<String> chatter_ids;
        public final String letter;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersResponse$LetterMap$b */
        private static final class C17509b extends ProtoAdapter<LetterMap> {
            C17509b() {
                super(FieldEncoding.LENGTH_DELIMITED, LetterMap.class);
            }

            /* renamed from: a */
            public int encodedSize(LetterMap letterMap) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, letterMap.letter) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, letterMap.chatter_ids) + letterMap.unknownFields().size();
            }

            /* renamed from: a */
            public LetterMap decode(ProtoReader protoReader) throws IOException {
                C17508a aVar = new C17508a();
                aVar.f44421a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44421a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f44422b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, LetterMap letterMap) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, letterMap.letter);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, letterMap.chatter_ids);
                protoWriter.writeBytes(letterMap.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersResponse$LetterMap$a */
        public static final class C17508a extends Message.Builder<LetterMap, C17508a> {

            /* renamed from: a */
            public String f44421a;

            /* renamed from: b */
            public List<String> f44422b = Internal.newMutableList();

            /* renamed from: a */
            public LetterMap build() {
                String str = this.f44421a;
                if (str != null) {
                    return new LetterMap(str, this.f44422b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "letter");
            }
        }

        @Override // com.squareup.wire.Message
        public C17508a newBuilder() {
            C17508a aVar = new C17508a();
            aVar.f44421a = this.letter;
            aVar.f44422b = Internal.copyOf("chatter_ids", this.chatter_ids);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "LetterMap");
            StringBuilder sb = new StringBuilder();
            sb.append(", letter=");
            sb.append(this.letter);
            if (!this.chatter_ids.isEmpty()) {
                sb.append(", chatter_ids=");
                sb.append(this.chatter_ids);
            }
            StringBuilder replace = sb.replace(0, 2, "LetterMap{");
            replace.append('}');
            return replace.toString();
        }

        public LetterMap(String str, List<String> list) {
            this(str, list, ByteString.EMPTY);
        }

        public LetterMap(String str, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.letter = str;
            this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersResponse$a */
    public static final class C17510a extends Message.Builder<GetChatChattersResponse, C17510a> {

        /* renamed from: a */
        public Map<String, Long> f44423a = Internal.newMutableMap();

        /* renamed from: b */
        public C14928Entity f44424b;

        /* renamed from: c */
        public List<LetterMap> f44425c = Internal.newMutableList();

        /* renamed from: d */
        public Map<String, String> f44426d = Internal.newMutableMap();

        /* renamed from: e */
        public Boolean f44427e;

        /* renamed from: f */
        public Integer f44428f;

        /* renamed from: g */
        public String f44429g;

        /* renamed from: h */
        public List<String> f44430h = Internal.newMutableList();

        /* renamed from: i */
        public Map<String, String> f44431i = Internal.newMutableMap();

        /* renamed from: j */
        public Map<String, ChatChatterTagInfo> f44432j = Internal.newMutableMap();

        /* renamed from: a */
        public GetChatChattersResponse build() {
            C14928Entity entity = this.f44424b;
            if (entity != null) {
                return new GetChatChattersResponse(this.f44423a, entity, this.f44425c, this.f44426d, this.f44427e, this.f44428f, this.f44429g, this.f44430h, this.f44431i, this.f44432j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersResponse$b */
    private static final class C17511b extends ProtoAdapter<GetChatChattersResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Long>> f44433a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f44434b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, String>> f44435c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, ChatChatterTagInfo>> f44436d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatChatterTagInfo.ADAPTER);

        C17511b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatChattersResponse getChatChattersResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = this.f44433a.encodedSizeWithTag(1, getChatChattersResponse.ordered_weight) + C14928Entity.ADAPTER.encodedSizeWithTag(2, getChatChattersResponse.entity) + LetterMap.ADAPTER.asRepeated().encodedSizeWithTag(3, getChatChattersResponse.letter_maps) + this.f44434b.encodedSizeWithTag(4, getChatChattersResponse.nicknames);
            int i3 = 0;
            if (getChatChattersResponse.show_search != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(5, getChatChattersResponse.show_search);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getChatChattersResponse.member_count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(6, getChatChattersResponse.member_count);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getChatChattersResponse.cursor != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, getChatChattersResponse.cursor);
            }
            return i5 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, getChatChattersResponse.chatter_ids) + this.f44435c.encodedSizeWithTag(9, getChatChattersResponse.chatter_id2department_name) + this.f44436d.encodedSizeWithTag(10, getChatChattersResponse.tag_infos) + getChatChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatChattersResponse decode(ProtoReader protoReader) throws IOException {
            C17510a aVar = new C17510a();
            aVar.f44427e = false;
            aVar.f44428f = 0;
            aVar.f44429g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44423a.putAll(this.f44433a.decode(protoReader));
                            break;
                        case 2:
                            aVar.f44424b = C14928Entity.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44425c.add(LetterMap.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f44426d.putAll(this.f44434b.decode(protoReader));
                            break;
                        case 5:
                            aVar.f44427e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44428f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44429g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f44430h.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            aVar.f44431i.putAll(this.f44435c.decode(protoReader));
                            break;
                        case 10:
                            aVar.f44432j.putAll(this.f44436d.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, GetChatChattersResponse getChatChattersResponse) throws IOException {
            this.f44433a.encodeWithTag(protoWriter, 1, getChatChattersResponse.ordered_weight);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getChatChattersResponse.entity);
            LetterMap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getChatChattersResponse.letter_maps);
            this.f44434b.encodeWithTag(protoWriter, 4, getChatChattersResponse.nicknames);
            if (getChatChattersResponse.show_search != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getChatChattersResponse.show_search);
            }
            if (getChatChattersResponse.member_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getChatChattersResponse.member_count);
            }
            if (getChatChattersResponse.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getChatChattersResponse.cursor);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, getChatChattersResponse.chatter_ids);
            this.f44435c.encodeWithTag(protoWriter, 9, getChatChattersResponse.chatter_id2department_name);
            this.f44436d.encodeWithTag(protoWriter, 10, getChatChattersResponse.tag_infos);
            protoWriter.writeBytes(getChatChattersResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17510a newBuilder() {
        C17510a aVar = new C17510a();
        aVar.f44423a = Internal.copyOf("ordered_weight", this.ordered_weight);
        aVar.f44424b = this.entity;
        aVar.f44425c = Internal.copyOf("letter_maps", this.letter_maps);
        aVar.f44426d = Internal.copyOf("nicknames", this.nicknames);
        aVar.f44427e = this.show_search;
        aVar.f44428f = this.member_count;
        aVar.f44429g = this.cursor;
        aVar.f44430h = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44431i = Internal.copyOf("chatter_id2department_name", this.chatter_id2department_name);
        aVar.f44432j = Internal.copyOf("tag_infos", this.tag_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatChattersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.ordered_weight.isEmpty()) {
            sb.append(", ordered_weight=");
            sb.append(this.ordered_weight);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.letter_maps.isEmpty()) {
            sb.append(", letter_maps=");
            sb.append(this.letter_maps);
        }
        if (!this.nicknames.isEmpty()) {
            sb.append(", nicknames=");
            sb.append(this.nicknames);
        }
        if (this.show_search != null) {
            sb.append(", show_search=");
            sb.append(this.show_search);
        }
        if (this.member_count != null) {
            sb.append(", member_count=");
            sb.append(this.member_count);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (!this.chatter_id2department_name.isEmpty()) {
            sb.append(", chatter_id2department_name=");
            sb.append(this.chatter_id2department_name);
        }
        if (!this.tag_infos.isEmpty()) {
            sb.append(", tag_infos=");
            sb.append(this.tag_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatChattersResponse(Map<String, Long> map, C14928Entity entity2, List<LetterMap> list, Map<String, String> map2, Boolean bool, Integer num, String str, List<String> list2, Map<String, String> map3, Map<String, ChatChatterTagInfo> map4) {
        this(map, entity2, list, map2, bool, num, str, list2, map3, map4, ByteString.EMPTY);
    }

    public GetChatChattersResponse(Map<String, Long> map, C14928Entity entity2, List<LetterMap> list, Map<String, String> map2, Boolean bool, Integer num, String str, List<String> list2, Map<String, String> map3, Map<String, ChatChatterTagInfo> map4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ordered_weight = Internal.immutableCopyOf("ordered_weight", map);
        this.entity = entity2;
        this.letter_maps = Internal.immutableCopyOf("letter_maps", list);
        this.nicknames = Internal.immutableCopyOf("nicknames", map2);
        this.show_search = bool;
        this.member_count = num;
        this.cursor = str;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list2);
        this.chatter_id2department_name = Internal.immutableCopyOf("chatter_id2department_name", map3);
        this.tag_infos = Internal.immutableCopyOf("tag_infos", map4);
    }
}
