package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class GetUnreadAtMessagesRequest extends Message<GetUnreadAtMessagesRequest, C17743a> {
    public static final ProtoAdapter<GetUnreadAtMessagesRequest> ADAPTER = new C17744b();
    public static final Boolean DEFAULT_IGNORE_BADGED = true;
    public static final Boolean DEFAULT_NEED_RESPONSE = true;
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;
    public final Boolean ignore_badged;
    public final Boolean need_response;
    public final List<Query> queries;

    public static final class Query extends Message<Query, C17741a> {
        public static final ProtoAdapter<Query> ADAPTER = new C17742b();
        public static final AtType DEFAULT_AT_TYPE = AtType.Default;
        public static final Long DEFAULT_CHAT_ID = 0L;
        public static final Long DEFAULT_THREAD_ID = 0L;
        private static final long serialVersionUID = 0;
        public final AtType at_type;
        public final Long chat_id;
        public final Long thread_id;

        public enum AtType implements WireEnum {
            Default(0),
            All(1),
            Me(2);
            
            public static final ProtoAdapter<AtType> ADAPTER = ProtoAdapter.newEnumAdapter(AtType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static AtType fromValue(int i) {
                if (i == 0) {
                    return Default;
                }
                if (i == 1) {
                    return All;
                }
                if (i != 2) {
                    return null;
                }
                return Me;
            }

            private AtType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest$Query$b */
        private static final class C17742b extends ProtoAdapter<Query> {
            C17742b() {
                super(FieldEncoding.LENGTH_DELIMITED, Query.class);
            }

            /* renamed from: a */
            public int encodedSize(Query query) {
                int i;
                int i2;
                int i3 = 0;
                if (query.chat_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, query.chat_id);
                } else {
                    i = 0;
                }
                if (query.thread_id != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, query.thread_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (query.at_type != null) {
                    i3 = AtType.ADAPTER.encodedSizeWithTag(3, query.at_type);
                }
                return i4 + i3 + query.unknownFields().size();
            }

            /* renamed from: a */
            public Query decode(ProtoReader protoReader) throws IOException {
                C17741a aVar = new C17741a();
                aVar.f44788a = 0L;
                aVar.f44789b = 0L;
                aVar.f44790c = AtType.Default;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f44788a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f44789b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f44790c = AtType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Query query) throws IOException {
                if (query.chat_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, query.chat_id);
                }
                if (query.thread_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, query.thread_id);
                }
                if (query.at_type != null) {
                    AtType.ADAPTER.encodeWithTag(protoWriter, 3, query.at_type);
                }
                protoWriter.writeBytes(query.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest$Query$a */
        public static final class C17741a extends Message.Builder<Query, C17741a> {

            /* renamed from: a */
            public Long f44788a;

            /* renamed from: b */
            public Long f44789b;

            /* renamed from: c */
            public AtType f44790c;

            /* renamed from: a */
            public Query build() {
                return new Query(this.f44788a, this.f44789b, this.f44790c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17741a mo61924a(AtType atType) {
                this.f44790c = atType;
                return this;
            }

            /* renamed from: b */
            public C17741a mo61927b(Long l) {
                this.f44789b = l;
                return this;
            }

            /* renamed from: a */
            public C17741a mo61925a(Long l) {
                this.f44788a = l;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C17741a newBuilder() {
            C17741a aVar = new C17741a();
            aVar.f44788a = this.chat_id;
            aVar.f44789b = this.thread_id;
            aVar.f44790c = this.at_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "Query");
            StringBuilder sb = new StringBuilder();
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            if (this.at_type != null) {
                sb.append(", at_type=");
                sb.append(this.at_type);
            }
            StringBuilder replace = sb.replace(0, 2, "Query{");
            replace.append('}');
            return replace.toString();
        }

        public Query(Long l, Long l2, AtType atType) {
            this(l, l2, atType, ByteString.EMPTY);
        }

        public Query(Long l, Long l2, AtType atType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = l;
            this.thread_id = l2;
            this.at_type = atType;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest$b */
    private static final class C17744b extends ProtoAdapter<GetUnreadAtMessagesRequest> {
        C17744b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUnreadAtMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUnreadAtMessagesRequest getUnreadAtMessagesRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUnreadAtMessagesRequest.chat_ids);
            int i2 = 0;
            if (getUnreadAtMessagesRequest.ignore_badged != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getUnreadAtMessagesRequest.ignore_badged);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getUnreadAtMessagesRequest.need_response != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getUnreadAtMessagesRequest.need_response);
            }
            return i3 + i2 + Query.ADAPTER.asRepeated().encodedSizeWithTag(4, getUnreadAtMessagesRequest.queries) + getUnreadAtMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUnreadAtMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C17743a aVar = new C17743a();
            aVar.f44792b = true;
            aVar.f44793c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44791a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44792b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44793c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44794d.add(Query.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUnreadAtMessagesRequest getUnreadAtMessagesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUnreadAtMessagesRequest.chat_ids);
            if (getUnreadAtMessagesRequest.ignore_badged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUnreadAtMessagesRequest.ignore_badged);
            }
            if (getUnreadAtMessagesRequest.need_response != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getUnreadAtMessagesRequest.need_response);
            }
            Query.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getUnreadAtMessagesRequest.queries);
            protoWriter.writeBytes(getUnreadAtMessagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesRequest$a */
    public static final class C17743a extends Message.Builder<GetUnreadAtMessagesRequest, C17743a> {

        /* renamed from: a */
        public List<String> f44791a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f44792b;

        /* renamed from: c */
        public Boolean f44793c;

        /* renamed from: d */
        public List<Query> f44794d = Internal.newMutableList();

        /* renamed from: a */
        public GetUnreadAtMessagesRequest build() {
            return new GetUnreadAtMessagesRequest(this.f44791a, this.f44792b, this.f44793c, this.f44794d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17743a mo61931a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44791a = list;
            return this;
        }

        /* renamed from: b */
        public C17743a mo61933b(List<Query> list) {
            Internal.checkElementsNotNull(list);
            this.f44794d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17743a newBuilder() {
        C17743a aVar = new C17743a();
        aVar.f44791a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f44792b = this.ignore_badged;
        aVar.f44793c = this.need_response;
        aVar.f44794d = Internal.copyOf("queries", this.queries);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUnreadAtMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.ignore_badged != null) {
            sb.append(", ignore_badged=");
            sb.append(this.ignore_badged);
        }
        if (this.need_response != null) {
            sb.append(", need_response=");
            sb.append(this.need_response);
        }
        if (!this.queries.isEmpty()) {
            sb.append(", queries=");
            sb.append(this.queries);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUnreadAtMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUnreadAtMessagesRequest(List<String> list, Boolean bool, Boolean bool2, List<Query> list2) {
        this(list, bool, bool2, list2, ByteString.EMPTY);
    }

    public GetUnreadAtMessagesRequest(List<String> list, Boolean bool, Boolean bool2, List<Query> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.ignore_badged = bool;
        this.need_response = bool2;
        this.queries = Internal.immutableCopyOf("queries", list2);
    }
}
