package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FeedFilter extends Message<FeedFilter, C17128a> {
    public static final ProtoAdapter<FeedFilter> ADAPTER = new C17129b();
    public static final Type DEFAULT_FILTER_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Type filter_type;

    public enum ExtType implements WireEnum {
        SHORTCUTS(100),
        BOX(101);
        
        public static final ProtoAdapter<ExtType> ADAPTER = ProtoAdapter.newEnumAdapter(ExtType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ExtType fromValue(int i) {
            if (i == 100) {
                return SHORTCUTS;
            }
            if (i != 101) {
                return null;
            }
            return BOX;
        }

        private ExtType(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        INBOX(1),
        AT_ME(2),
        UNREAD(3),
        DELAYED(4),
        DOC(5),
        P2P_CHAT(6),
        GROUP_CHAT(7),
        BOT(8),
        HELP_DESK(9),
        TOPIC_GROUP(10),
        DONE(11),
        CRYPTO_CHAT(12),
        MESSAGE(13),
        MUTE(14),
        GROUP(15),
        TEAM(16);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return INBOX;
                case 2:
                    return AT_ME;
                case 3:
                    return UNREAD;
                case 4:
                    return DELAYED;
                case 5:
                    return DOC;
                case 6:
                    return P2P_CHAT;
                case 7:
                    return GROUP_CHAT;
                case 8:
                    return BOT;
                case 9:
                    return HELP_DESK;
                case 10:
                    return TOPIC_GROUP;
                case 11:
                    return DONE;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    return CRYPTO_CHAT;
                case 13:
                    return MESSAGE;
                case 14:
                    return MUTE;
                case 15:
                    return GROUP;
                case 16:
                    return TEAM;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class List extends Message<List, C17126a> {
        public static final ProtoAdapter<List> ADAPTER = new C17127b();
        private static final long serialVersionUID = 0;
        public final java.util.List<Integer> types;

        /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilter$List$b */
        private static final class C17127b extends ProtoAdapter<List> {
            C17127b() {
                super(FieldEncoding.LENGTH_DELIMITED, List.class);
            }

            /* renamed from: a */
            public int encodedSize(List list) {
                return ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, list.types) + list.unknownFields().size();
            }

            /* renamed from: a */
            public List decode(ProtoReader protoReader) throws IOException {
                C17126a aVar = new C17126a();
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
                        aVar.f43875a.add(ProtoAdapter.INT32.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, List list) throws IOException {
                ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 1, list.types);
                protoWriter.writeBytes(list.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilter$List$a */
        public static final class C17126a extends Message.Builder<List, C17126a> {

            /* renamed from: a */
            public java.util.List<Integer> f43875a = Internal.newMutableList();

            /* renamed from: a */
            public List build() {
                return new List(this.f43875a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17126a newBuilder() {
            C17126a aVar = new C17126a();
            aVar.f43875a = Internal.copyOf("types", this.types);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "List");
            StringBuilder sb = new StringBuilder();
            if (!this.types.isEmpty()) {
                sb.append(", types=");
                sb.append(this.types);
            }
            StringBuilder replace = sb.replace(0, 2, "List{");
            replace.append('}');
            return replace.toString();
        }

        public List(java.util.List<Integer> list) {
            this(list, ByteString.EMPTY);
        }

        public List(java.util.List<Integer> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.types = Internal.immutableCopyOf("types", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilter$b */
    private static final class C17129b extends ProtoAdapter<FeedFilter> {
        C17129b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedFilter.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedFilter feedFilter) {
            int i;
            if (feedFilter.filter_type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, feedFilter.filter_type);
            } else {
                i = 0;
            }
            return i + feedFilter.unknownFields().size();
        }

        /* renamed from: a */
        public FeedFilter decode(ProtoReader protoReader) throws IOException {
            C17128a aVar = new C17128a();
            aVar.f43876a = Type.UNKNOWN;
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
                    try {
                        aVar.f43876a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedFilter feedFilter) throws IOException {
            if (feedFilter.filter_type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, feedFilter.filter_type);
            }
            protoWriter.writeBytes(feedFilter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.FeedFilter$a */
    public static final class C17128a extends Message.Builder<FeedFilter, C17128a> {

        /* renamed from: a */
        public Type f43876a;

        /* renamed from: a */
        public FeedFilter build() {
            return new FeedFilter(this.f43876a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17128a mo60364a(Type type) {
            this.f43876a = type;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17128a newBuilder() {
        C17128a aVar = new C17128a();
        aVar.f43876a = this.filter_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "FeedFilter");
        StringBuilder sb = new StringBuilder();
        if (this.filter_type != null) {
            sb.append(", filter_type=");
            sb.append(this.filter_type);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedFilter{");
        replace.append('}');
        return replace.toString();
    }

    public FeedFilter(Type type) {
        this(type, ByteString.EMPTY);
    }

    public FeedFilter(Type type, ByteString byteString) {
        super(ADAPTER, byteString);
        this.filter_type = type;
    }
}
