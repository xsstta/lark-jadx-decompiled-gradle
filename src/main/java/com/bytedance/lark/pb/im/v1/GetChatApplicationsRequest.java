package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class GetChatApplicationsRequest extends Message<GetChatApplicationsRequest, C17490a> {
    public static final ProtoAdapter<GetChatApplicationsRequest> ADAPTER = new C17491b();
    public static final Integer DEFAULT_COUNT = 10;
    public static final GetType DEFAULT_GET_TYPE = GetType.BEFORE;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.FORCE_SERVER;
    public static final ChatApplication.Type DEFAULT_TYPE = ChatApplication.Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Integer count;
    public final String cursor;
    public final GetType get_type;
    public final SyncDataStrategy sync_data_strategy;
    public final ChatApplication.Type type;

    public enum GetType implements WireEnum {
        BEFORE(1),
        AFTER(2);
        
        public static final ProtoAdapter<GetType> ADAPTER = ProtoAdapter.newEnumAdapter(GetType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static GetType fromValue(int i) {
            if (i == 1) {
                return BEFORE;
            }
            if (i != 2) {
                return null;
            }
            return AFTER;
        }

        private GetType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationsRequest$b */
    private static final class C17491b extends ProtoAdapter<GetChatApplicationsRequest> {
        C17491b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatApplicationsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatApplicationsRequest getChatApplicationsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatApplicationsRequest.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, getChatApplicationsRequest.count) + ChatApplication.Type.ADAPTER.encodedSizeWithTag(3, getChatApplicationsRequest.type) + GetType.ADAPTER.encodedSizeWithTag(4, getChatApplicationsRequest.get_type);
            int i2 = 0;
            if (getChatApplicationsRequest.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, getChatApplicationsRequest.chat_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getChatApplicationsRequest.sync_data_strategy != null) {
                i2 = SyncDataStrategy.ADAPTER.encodedSizeWithTag(6, getChatApplicationsRequest.sync_data_strategy);
            }
            return i3 + i2 + getChatApplicationsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatApplicationsRequest decode(ProtoReader protoReader) throws IOException {
            C17490a aVar = new C17490a();
            aVar.f44394a = "";
            aVar.f44395b = 10;
            aVar.f44396c = ChatApplication.Type.UNKNOWN_TYPE;
            aVar.f44397d = GetType.BEFORE;
            aVar.f44398e = "";
            aVar.f44399f = SyncDataStrategy.FORCE_SERVER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44394a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44395b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f44396c = ChatApplication.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            try {
                                aVar.f44397d = GetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 5:
                            aVar.f44398e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f44399f = SyncDataStrategy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, GetChatApplicationsRequest getChatApplicationsRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatApplicationsRequest.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getChatApplicationsRequest.count);
            ChatApplication.Type.ADAPTER.encodeWithTag(protoWriter, 3, getChatApplicationsRequest.type);
            GetType.ADAPTER.encodeWithTag(protoWriter, 4, getChatApplicationsRequest.get_type);
            if (getChatApplicationsRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getChatApplicationsRequest.chat_id);
            }
            if (getChatApplicationsRequest.sync_data_strategy != null) {
                SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 6, getChatApplicationsRequest.sync_data_strategy);
            }
            protoWriter.writeBytes(getChatApplicationsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17490a newBuilder() {
        C17490a aVar = new C17490a();
        aVar.f44394a = this.cursor;
        aVar.f44395b = this.count;
        aVar.f44396c = this.type;
        aVar.f44397d = this.get_type;
        aVar.f44398e = this.chat_id;
        aVar.f44399f = this.sync_data_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationsRequest$a */
    public static final class C17490a extends Message.Builder<GetChatApplicationsRequest, C17490a> {

        /* renamed from: a */
        public String f44394a;

        /* renamed from: b */
        public Integer f44395b;

        /* renamed from: c */
        public ChatApplication.Type f44396c;

        /* renamed from: d */
        public GetType f44397d;

        /* renamed from: e */
        public String f44398e;

        /* renamed from: f */
        public SyncDataStrategy f44399f;

        /* renamed from: a */
        public GetChatApplicationsRequest build() {
            Integer num;
            ChatApplication.Type type;
            GetType getType;
            String str = this.f44394a;
            if (str != null && (num = this.f44395b) != null && (type = this.f44396c) != null && (getType = this.f44397d) != null) {
                return new GetChatApplicationsRequest(str, num, type, getType, this.f44398e, this.f44399f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cursor", this.f44395b, "count", this.f44396c, ShareHitPoint.f121869d, this.f44397d, "get_type");
        }

        /* renamed from: a */
        public C17490a mo61284a(ChatApplication.Type type) {
            this.f44396c = type;
            return this;
        }

        /* renamed from: b */
        public C17490a mo61289b(String str) {
            this.f44398e = str;
            return this;
        }

        /* renamed from: a */
        public C17490a mo61285a(GetType getType) {
            this.f44397d = getType;
            return this;
        }

        /* renamed from: a */
        public C17490a mo61286a(Integer num) {
            this.f44395b = num;
            return this;
        }

        /* renamed from: a */
        public C17490a mo61287a(String str) {
            this.f44394a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatApplicationsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", get_type=");
        sb.append(this.get_type);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.sync_data_strategy != null) {
            sb.append(", sync_data_strategy=");
            sb.append(this.sync_data_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatApplicationsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatApplicationsRequest(String str, Integer num, ChatApplication.Type type2, GetType getType, String str2, SyncDataStrategy syncDataStrategy) {
        this(str, num, type2, getType, str2, syncDataStrategy, ByteString.EMPTY);
    }

    public GetChatApplicationsRequest(String str, Integer num, ChatApplication.Type type2, GetType getType, String str2, SyncDataStrategy syncDataStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = str;
        this.count = num;
        this.type = type2;
        this.get_type = getType;
        this.chat_id = str2;
        this.sync_data_strategy = syncDataStrategy;
    }
}
