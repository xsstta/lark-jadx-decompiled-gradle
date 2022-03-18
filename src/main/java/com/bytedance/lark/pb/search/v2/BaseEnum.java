package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class BaseEnum extends Message<BaseEnum, C18967a> {
    public static final ProtoAdapter<BaseEnum> ADAPTER = new C18968b();
    private static final long serialVersionUID = 0;

    public enum LocalAbility implements WireEnum {
        CHATTER(1),
        CHAT(2),
        CHATTER_AND_CHAT(3),
        MESSAGE(4);
        
        public static final ProtoAdapter<LocalAbility> ADAPTER = ProtoAdapter.newEnumAdapter(LocalAbility.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LocalAbility fromValue(int i) {
            if (i == 1) {
                return CHATTER;
            }
            if (i == 2) {
                return CHAT;
            }
            if (i == 3) {
                return CHATTER_AND_CHAT;
            }
            if (i != 4) {
                return null;
            }
            return MESSAGE;
        }

        private LocalAbility(int i) {
            this.value = i;
        }
    }

    public enum MergePolicy implements WireEnum {
        LOCAL_ONLY(1),
        SERVER_ONLY(2),
        COMBINE_LOCAL_AND_SERVER(3);
        
        public static final ProtoAdapter<MergePolicy> ADAPTER = ProtoAdapter.newEnumAdapter(MergePolicy.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MergePolicy fromValue(int i) {
            if (i == 1) {
                return LOCAL_ONLY;
            }
            if (i == 2) {
                return SERVER_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return COMBINE_LOCAL_AND_SERVER;
        }

        private MergePolicy(int i) {
            this.value = i;
        }
    }

    public enum QueryInputState implements WireEnum {
        EXPAND(1),
        SHRINK(2),
        COMPOSE(4);
        
        public static final ProtoAdapter<QueryInputState> ADAPTER = ProtoAdapter.newEnumAdapter(QueryInputState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QueryInputState fromValue(int i) {
            if (i == 1) {
                return EXPAND;
            }
            if (i == 2) {
                return SHRINK;
            }
            if (i != 4) {
                return null;
            }
            return COMPOSE;
        }

        private QueryInputState(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.BaseEnum$b */
    private static final class C18968b extends ProtoAdapter<BaseEnum> {
        C18968b() {
            super(FieldEncoding.LENGTH_DELIMITED, BaseEnum.class);
        }

        /* renamed from: a */
        public int encodedSize(BaseEnum baseEnum) {
            return baseEnum.unknownFields().size();
        }

        /* renamed from: a */
        public BaseEnum decode(ProtoReader protoReader) throws IOException {
            C18967a aVar = new C18967a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BaseEnum baseEnum) throws IOException {
            protoWriter.writeBytes(baseEnum.unknownFields());
        }
    }

    public BaseEnum() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.BaseEnum$a */
    public static final class C18967a extends Message.Builder<BaseEnum, C18967a> {
        /* renamed from: a */
        public BaseEnum build() {
            return new BaseEnum(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18967a newBuilder() {
        C18967a aVar = new C18967a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "BaseEnum");
        StringBuilder replace = new StringBuilder().replace(0, 2, "BaseEnum{");
        replace.append('}');
        return replace.toString();
    }

    public BaseEnum(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
