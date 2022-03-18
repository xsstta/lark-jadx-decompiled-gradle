package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PushMessageReactions extends Message<PushMessageReactions, C17917a> {
    public static final ProtoAdapter<PushMessageReactions> ADAPTER = new C17918b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;
    public final Map<String, Reactions> msg_id2reactions;

    public static final class Reactions extends Message<Reactions, C17915a> {
        public static final ProtoAdapter<Reactions> ADAPTER = new C17916b();
        private static final long serialVersionUID = 0;
        public final List<Reaction> reactions;

        public static final class Reaction extends Message<Reaction, C17913a> {
            public static final ProtoAdapter<Reaction> ADAPTER = new C17914b();
            public static final Integer DEFAULT_CHATTER_COUNT = 0;
            private static final long serialVersionUID = 0;
            public final Integer chatter_count;
            public final List<String> chatter_ids;
            public final String type;

            /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReactions$Reactions$Reaction$b */
            private static final class C17914b extends ProtoAdapter<Reaction> {
                C17914b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Reaction.class);
                }

                /* renamed from: a */
                public int encodedSize(Reaction reaction) {
                    int i;
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, reaction.type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, reaction.chatter_ids);
                    if (reaction.chatter_count != null) {
                        i = ProtoAdapter.INT32.encodedSizeWithTag(3, reaction.chatter_count);
                    } else {
                        i = 0;
                    }
                    return encodedSizeWithTag + i + reaction.unknownFields().size();
                }

                /* renamed from: a */
                public Reaction decode(ProtoReader protoReader) throws IOException {
                    C17913a aVar = new C17913a();
                    aVar.f44996a = "";
                    aVar.f44998c = 0;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f44996a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f44997b.add(ProtoAdapter.STRING.decode(protoReader));
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f44998c = ProtoAdapter.INT32.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Reaction reaction) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reaction.type);
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, reaction.chatter_ids);
                    if (reaction.chatter_count != null) {
                        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, reaction.chatter_count);
                    }
                    protoWriter.writeBytes(reaction.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C17913a newBuilder() {
                C17913a aVar = new C17913a();
                aVar.f44996a = this.type;
                aVar.f44997b = Internal.copyOf("chatter_ids", this.chatter_ids);
                aVar.f44998c = this.chatter_count;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReactions$Reactions$Reaction$a */
            public static final class C17913a extends Message.Builder<Reaction, C17913a> {

                /* renamed from: a */
                public String f44996a;

                /* renamed from: b */
                public List<String> f44997b = Internal.newMutableList();

                /* renamed from: c */
                public Integer f44998c;

                /* renamed from: a */
                public Reaction build() {
                    String str = this.f44996a;
                    if (str != null) {
                        return new Reaction(str, this.f44997b, this.f44998c, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str, ShareHitPoint.f121869d);
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("im", "Reaction");
                StringBuilder sb = new StringBuilder();
                sb.append(", type=");
                sb.append(this.type);
                if (!this.chatter_ids.isEmpty()) {
                    sb.append(", chatter_ids=");
                    sb.append(this.chatter_ids);
                }
                if (this.chatter_count != null) {
                    sb.append(", chatter_count=");
                    sb.append(this.chatter_count);
                }
                StringBuilder replace = sb.replace(0, 2, "Reaction{");
                replace.append('}');
                return replace.toString();
            }

            public Reaction(String str, List<String> list, Integer num) {
                this(str, list, num, ByteString.EMPTY);
            }

            public Reaction(String str, List<String> list, Integer num, ByteString byteString) {
                super(ADAPTER, byteString);
                this.type = str;
                this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
                this.chatter_count = num;
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReactions$Reactions$b */
        private static final class C17916b extends ProtoAdapter<Reactions> {
            C17916b() {
                super(FieldEncoding.LENGTH_DELIMITED, Reactions.class);
            }

            /* renamed from: a */
            public int encodedSize(Reactions reactions) {
                return Reaction.ADAPTER.asRepeated().encodedSizeWithTag(1, reactions.reactions) + reactions.unknownFields().size();
            }

            /* renamed from: a */
            public Reactions decode(ProtoReader protoReader) throws IOException {
                C17915a aVar = new C17915a();
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
                        aVar.f44999a.add(Reaction.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Reactions reactions) throws IOException {
                Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reactions.reactions);
                protoWriter.writeBytes(reactions.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReactions$Reactions$a */
        public static final class C17915a extends Message.Builder<Reactions, C17915a> {

            /* renamed from: a */
            public List<Reaction> f44999a = Internal.newMutableList();

            /* renamed from: a */
            public Reactions build() {
                return new Reactions(this.f44999a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17915a newBuilder() {
            C17915a aVar = new C17915a();
            aVar.f44999a = Internal.copyOf("reactions", this.reactions);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "Reactions");
            StringBuilder sb = new StringBuilder();
            if (!this.reactions.isEmpty()) {
                sb.append(", reactions=");
                sb.append(this.reactions);
            }
            StringBuilder replace = sb.replace(0, 2, "Reactions{");
            replace.append('}');
            return replace.toString();
        }

        public Reactions(List<Reaction> list) {
            this(list, ByteString.EMPTY);
        }

        public Reactions(List<Reaction> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.reactions = Internal.immutableCopyOf("reactions", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReactions$b */
    private static final class C17918b extends ProtoAdapter<PushMessageReactions> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Reactions>> f45003a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Reactions.ADAPTER);

        C17918b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMessageReactions.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMessageReactions pushMessageReactions) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, pushMessageReactions.chat_id) + this.f45003a.encodedSizeWithTag(2, pushMessageReactions.msg_id2reactions) + C14928Entity.ADAPTER.encodedSizeWithTag(3, pushMessageReactions.entity) + pushMessageReactions.unknownFields().size();
        }

        /* renamed from: a */
        public PushMessageReactions decode(ProtoReader protoReader) throws IOException {
            C17917a aVar = new C17917a();
            aVar.f45000a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45000a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45001b.putAll(this.f45003a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45002c = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMessageReactions pushMessageReactions) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushMessageReactions.chat_id);
            this.f45003a.encodeWithTag(protoWriter, 2, pushMessageReactions.msg_id2reactions);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, pushMessageReactions.entity);
            protoWriter.writeBytes(pushMessageReactions.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17917a newBuilder() {
        C17917a aVar = new C17917a();
        aVar.f45000a = this.chat_id;
        aVar.f45001b = Internal.copyOf("msg_id2reactions", this.msg_id2reactions);
        aVar.f45002c = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessageReactions$a */
    public static final class C17917a extends Message.Builder<PushMessageReactions, C17917a> {

        /* renamed from: a */
        public String f45000a;

        /* renamed from: b */
        public Map<String, Reactions> f45001b = Internal.newMutableMap();

        /* renamed from: c */
        public C14928Entity f45002c;

        /* renamed from: a */
        public PushMessageReactions build() {
            C14928Entity entity;
            String str = this.f45000a;
            if (str != null && (entity = this.f45002c) != null) {
                return new PushMessageReactions(str, this.f45001b, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f45002c, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushMessageReactions");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (!this.msg_id2reactions.isEmpty()) {
            sb.append(", msg_id2reactions=");
            sb.append(this.msg_id2reactions);
        }
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "PushMessageReactions{");
        replace.append('}');
        return replace.toString();
    }

    public PushMessageReactions(String str, Map<String, Reactions> map, C14928Entity entity2) {
        this(str, map, entity2, ByteString.EMPTY);
    }

    public PushMessageReactions(String str, Map<String, Reactions> map, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.msg_id2reactions = Internal.immutableCopyOf("msg_id2reactions", map);
        this.entity = entity2;
    }
}
