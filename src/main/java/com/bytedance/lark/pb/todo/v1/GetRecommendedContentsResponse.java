package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetRecommendedContentsResponse extends Message<GetRecommendedContentsResponse, C19529a> {
    public static final ProtoAdapter<GetRecommendedContentsResponse> ADAPTER = new C19530b();
    private static final long serialVersionUID = 0;
    public final Map<String, Chat> chats;
    public final Map<String, Chatter> chatters;
    public final List<RecommendContent> recommend_contents;

    public static final class RecommendContent extends Message<RecommendContent, C19527a> {
        public static final ProtoAdapter<RecommendContent> ADAPTER = new C19528b();
        public static final Type DEFAULT_CONTENT_TYPE = Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final Type content_type;
        public final String department;
        public final String id;

        public enum Type implements WireEnum {
            UNKNOWN(0),
            CHATTER(1),
            CHAT(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return CHATTER;
                }
                if (i != 2) {
                    return null;
                }
                return CHAT;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse$RecommendContent$b */
        private static final class C19528b extends ProtoAdapter<RecommendContent> {
            C19528b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecommendContent.class);
            }

            /* renamed from: a */
            public int encodedSize(RecommendContent recommendContent) {
                int i;
                int i2;
                int i3 = 0;
                if (recommendContent.id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, recommendContent.id);
                } else {
                    i = 0;
                }
                if (recommendContent.content_type != null) {
                    i2 = Type.ADAPTER.encodedSizeWithTag(2, recommendContent.content_type);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (recommendContent.department != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, recommendContent.department);
                }
                return i4 + i3 + recommendContent.unknownFields().size();
            }

            /* renamed from: a */
            public RecommendContent decode(ProtoReader protoReader) throws IOException {
                C19527a aVar = new C19527a();
                aVar.f47881a = "";
                aVar.f47882b = Type.UNKNOWN;
                aVar.f47883c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47881a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            aVar.f47882b = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47883c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RecommendContent recommendContent) throws IOException {
                if (recommendContent.id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendContent.id);
                }
                if (recommendContent.content_type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 2, recommendContent.content_type);
                }
                if (recommendContent.department != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recommendContent.department);
                }
                protoWriter.writeBytes(recommendContent.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse$RecommendContent$a */
        public static final class C19527a extends Message.Builder<RecommendContent, C19527a> {

            /* renamed from: a */
            public String f47881a;

            /* renamed from: b */
            public Type f47882b;

            /* renamed from: c */
            public String f47883c;

            /* renamed from: a */
            public RecommendContent build() {
                return new RecommendContent(this.f47881a, this.f47882b, this.f47883c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19527a newBuilder() {
            C19527a aVar = new C19527a();
            aVar.f47881a = this.id;
            aVar.f47882b = this.content_type;
            aVar.f47883c = this.department;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "RecommendContent");
            StringBuilder sb = new StringBuilder();
            if (this.id != null) {
                sb.append(", id=");
                sb.append(this.id);
            }
            if (this.content_type != null) {
                sb.append(", content_type=");
                sb.append(this.content_type);
            }
            if (this.department != null) {
                sb.append(", department=");
                sb.append(this.department);
            }
            StringBuilder replace = sb.replace(0, 2, "RecommendContent{");
            replace.append('}');
            return replace.toString();
        }

        public RecommendContent(String str, Type type, String str2) {
            this(str, type, str2, ByteString.EMPTY);
        }

        public RecommendContent(String str, Type type, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.content_type = type;
            this.department = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse$a */
    public static final class C19529a extends Message.Builder<GetRecommendedContentsResponse, C19529a> {

        /* renamed from: a */
        public List<RecommendContent> f47884a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, Chat> f47885b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, Chatter> f47886c = Internal.newMutableMap();

        /* renamed from: a */
        public GetRecommendedContentsResponse build() {
            return new GetRecommendedContentsResponse(this.f47884a, this.f47885b, this.f47886c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse$b */
    private static final class C19530b extends ProtoAdapter<GetRecommendedContentsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Chat>> f47887a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chat.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Chatter>> f47888b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        C19530b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecommendedContentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecommendedContentsResponse getRecommendedContentsResponse) {
            return RecommendContent.ADAPTER.asRepeated().encodedSizeWithTag(1, getRecommendedContentsResponse.recommend_contents) + this.f47887a.encodedSizeWithTag(2, getRecommendedContentsResponse.chats) + this.f47888b.encodedSizeWithTag(3, getRecommendedContentsResponse.chatters) + getRecommendedContentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecommendedContentsResponse decode(ProtoReader protoReader) throws IOException {
            C19529a aVar = new C19529a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47884a.add(RecommendContent.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f47885b.putAll(this.f47887a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47886c.putAll(this.f47888b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecommendedContentsResponse getRecommendedContentsResponse) throws IOException {
            RecommendContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRecommendedContentsResponse.recommend_contents);
            this.f47887a.encodeWithTag(protoWriter, 2, getRecommendedContentsResponse.chats);
            this.f47888b.encodeWithTag(protoWriter, 3, getRecommendedContentsResponse.chatters);
            protoWriter.writeBytes(getRecommendedContentsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19529a newBuilder() {
        C19529a aVar = new C19529a();
        aVar.f47884a = Internal.copyOf("recommend_contents", this.recommend_contents);
        aVar.f47885b = Internal.copyOf("chats", this.chats);
        aVar.f47886c = Internal.copyOf("chatters", this.chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetRecommendedContentsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.recommend_contents.isEmpty()) {
            sb.append(", recommend_contents=");
            sb.append(this.recommend_contents);
        }
        if (!this.chats.isEmpty()) {
            sb.append(", chats=");
            sb.append(this.chats);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRecommendedContentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecommendedContentsResponse(List<RecommendContent> list, Map<String, Chat> map, Map<String, Chatter> map2) {
        this(list, map, map2, ByteString.EMPTY);
    }

    public GetRecommendedContentsResponse(List<RecommendContent> list, Map<String, Chat> map, Map<String, Chatter> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recommend_contents = Internal.immutableCopyOf("recommend_contents", list);
        this.chats = Internal.immutableCopyOf("chats", map);
        this.chatters = Internal.immutableCopyOf("chatters", map2);
    }
}
