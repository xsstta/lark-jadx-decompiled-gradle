package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatResourcesRequest extends Message<GetChatResourcesRequest, C18224a> {
    public static final ProtoAdapter<GetChatResourcesRequest> ADAPTER = new C18225b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final Direction DEFAULT_DIRECTION = Direction.BEFORE;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final Direction direction;
    public final String message_id;
    public final List<ChatResourceType> resource_types;

    public enum Direction implements WireEnum {
        BEFORE(1),
        AFTER(2),
        BIDIRECT(3);
        
        public static final ProtoAdapter<Direction> ADAPTER = ProtoAdapter.newEnumAdapter(Direction.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Direction fromValue(int i) {
            if (i == 1) {
                return BEFORE;
            }
            if (i == 2) {
                return AFTER;
            }
            if (i != 3) {
                return null;
            }
            return BIDIRECT;
        }

        private Direction(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesRequest$b */
    private static final class C18225b extends ProtoAdapter<GetChatResourcesRequest> {
        C18225b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatResourcesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatResourcesRequest getChatResourcesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatResourcesRequest.chat_id);
            int i2 = 0;
            if (getChatResourcesRequest.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getChatResourcesRequest.message_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatResourcesRequest.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getChatResourcesRequest.count);
            }
            return i3 + i2 + Direction.ADAPTER.encodedSizeWithTag(4, getChatResourcesRequest.direction) + ChatResourceType.ADAPTER.asRepeated().encodedSizeWithTag(5, getChatResourcesRequest.resource_types) + getChatResourcesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatResourcesRequest decode(ProtoReader protoReader) throws IOException {
            C18224a aVar = new C18224a();
            aVar.f45460a = "";
            aVar.f45461b = "";
            aVar.f45462c = 10;
            aVar.f45463d = Direction.BEFORE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45460a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45461b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45462c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f45463d = Direction.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f45464e.add(ChatResourceType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatResourcesRequest getChatResourcesRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatResourcesRequest.chat_id);
            if (getChatResourcesRequest.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getChatResourcesRequest.message_id);
            }
            if (getChatResourcesRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getChatResourcesRequest.count);
            }
            Direction.ADAPTER.encodeWithTag(protoWriter, 4, getChatResourcesRequest.direction);
            ChatResourceType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, getChatResourcesRequest.resource_types);
            protoWriter.writeBytes(getChatResourcesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetChatResourcesRequest$a */
    public static final class C18224a extends Message.Builder<GetChatResourcesRequest, C18224a> {

        /* renamed from: a */
        public String f45460a;

        /* renamed from: b */
        public String f45461b;

        /* renamed from: c */
        public Integer f45462c;

        /* renamed from: d */
        public Direction f45463d;

        /* renamed from: e */
        public List<ChatResourceType> f45464e = Internal.newMutableList();

        /* renamed from: a */
        public GetChatResourcesRequest build() {
            Direction direction;
            String str = this.f45460a;
            if (str != null && (direction = this.f45463d) != null) {
                return new GetChatResourcesRequest(str, this.f45461b, this.f45462c, direction, this.f45464e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f45463d, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        }

        /* renamed from: a */
        public C18224a mo63168a(Direction direction) {
            this.f45463d = direction;
            return this;
        }

        /* renamed from: b */
        public C18224a mo63173b(String str) {
            this.f45461b = str;
            return this;
        }

        /* renamed from: a */
        public C18224a mo63169a(Integer num) {
            this.f45462c = num;
            return this;
        }

        /* renamed from: a */
        public C18224a mo63170a(String str) {
            this.f45460a = str;
            return this;
        }

        /* renamed from: a */
        public C18224a mo63171a(List<ChatResourceType> list) {
            Internal.checkElementsNotNull(list);
            this.f45464e = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18224a newBuilder() {
        C18224a aVar = new C18224a();
        aVar.f45460a = this.chat_id;
        aVar.f45461b = this.message_id;
        aVar.f45462c = this.count;
        aVar.f45463d = this.direction;
        aVar.f45464e = Internal.copyOf("resource_types", this.resource_types);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetChatResourcesRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        sb.append(", direction=");
        sb.append(this.direction);
        if (!this.resource_types.isEmpty()) {
            sb.append(", resource_types=");
            sb.append(this.resource_types);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatResourcesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatResourcesRequest(String str, String str2, Integer num, Direction direction2, List<ChatResourceType> list) {
        this(str, str2, num, direction2, list, ByteString.EMPTY);
    }

    public GetChatResourcesRequest(String str, String str2, Integer num, Direction direction2, List<ChatResourceType> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.message_id = str2;
        this.count = num;
        this.direction = direction2;
        this.resource_types = Internal.immutableCopyOf("resource_types", list);
    }
}
