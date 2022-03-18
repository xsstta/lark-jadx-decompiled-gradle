package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.Scene;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LocalIntegrationSearchRequest extends Message<LocalIntegrationSearchRequest, C18837a> {
    public static final ProtoAdapter<LocalIntegrationSearchRequest> ADAPTER = new C18838b();
    public static final Integer DEFAULT_BEGIN = 0;
    public static final Integer DEFAULT_END = 10;
    public static final Scene.Type DEFAULT_SCENE_TYPE = Scene.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer begin;
    public final Integer end;
    public final FilterParam filter_param;
    public final String query;
    public final Scene.Type scene_type;

    public static final class FilterParam extends Message<FilterParam, C18835a> {
        public static final ProtoAdapter<FilterParam> ADAPTER = new C18836b();
        public static final Integer DEFAULT_COUNT = 10;
        public static final Long DEFAULT_LAST_CREATE_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_END_TIME = 0L;
        public static final Long DEFAULT_MESSAGE_START_TIME = 0L;
        public static final Boolean DEFAULT_NEED_SEARCH_OUTER_TENANT = false;
        public static final Boolean DEFAULT_REVERSE = false;
        private static final long serialVersionUID = 0;
        public final ChatFilterParam chat_filter_param;
        public final List<String> chat_ids;
        public final Integer count;
        public final Long last_create_time;
        public final String last_message_id;
        public final List<String> message_creator_ids;
        public final Long message_end_time;
        public final Long message_start_time;
        public final Boolean need_search_outer_tenant;
        public final Boolean reverse;

        /* renamed from: com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest$FilterParam$b */
        private static final class C18836b extends ProtoAdapter<FilterParam> {
            C18836b() {
                super(FieldEncoding.LENGTH_DELIMITED, FilterParam.class);
            }

            /* renamed from: a */
            public int encodedSize(FilterParam filterParam) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, filterParam.chat_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, filterParam.message_creator_ids);
                int i8 = 0;
                if (filterParam.message_start_time != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(4, filterParam.message_start_time);
                } else {
                    i = 0;
                }
                int i9 = encodedSizeWithTag + i;
                if (filterParam.message_end_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(5, filterParam.message_end_time);
                } else {
                    i2 = 0;
                }
                int i10 = i9 + i2;
                if (filterParam.need_search_outer_tenant != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, filterParam.need_search_outer_tenant);
                } else {
                    i3 = 0;
                }
                int i11 = i10 + i3;
                if (filterParam.last_create_time != null) {
                    i4 = ProtoAdapter.INT64.encodedSizeWithTag(7, filterParam.last_create_time);
                } else {
                    i4 = 0;
                }
                int i12 = i11 + i4;
                if (filterParam.last_message_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, filterParam.last_message_id);
                } else {
                    i5 = 0;
                }
                int i13 = i12 + i5;
                if (filterParam.count != null) {
                    i6 = ProtoAdapter.INT32.encodedSizeWithTag(9, filterParam.count);
                } else {
                    i6 = 0;
                }
                int i14 = i13 + i6;
                if (filterParam.reverse != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(10, filterParam.reverse);
                } else {
                    i7 = 0;
                }
                int i15 = i14 + i7;
                if (filterParam.chat_filter_param != null) {
                    i8 = ChatFilterParam.ADAPTER.encodedSizeWithTag(11, filterParam.chat_filter_param);
                }
                return i15 + i8 + filterParam.unknownFields().size();
            }

            /* renamed from: a */
            public FilterParam decode(ProtoReader protoReader) throws IOException {
                C18835a aVar = new C18835a();
                aVar.f46483c = 0L;
                aVar.f46484d = 0L;
                aVar.f46485e = false;
                aVar.f46486f = 0L;
                aVar.f46487g = "";
                aVar.f46488h = 10;
                aVar.f46489i = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f46481a.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 2:
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            case 3:
                                aVar.f46482b.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 4:
                                aVar.f46483c = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 5:
                                aVar.f46484d = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 6:
                                aVar.f46485e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f46486f = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 8:
                                aVar.f46487g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 9:
                                aVar.f46488h = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 10:
                                aVar.f46489i = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 11:
                                aVar.f46490j = ChatFilterParam.ADAPTER.decode(protoReader);
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FilterParam filterParam) throws IOException {
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, filterParam.chat_ids);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, filterParam.message_creator_ids);
                if (filterParam.message_start_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, filterParam.message_start_time);
                }
                if (filterParam.message_end_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, filterParam.message_end_time);
                }
                if (filterParam.need_search_outer_tenant != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, filterParam.need_search_outer_tenant);
                }
                if (filterParam.last_create_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, filterParam.last_create_time);
                }
                if (filterParam.last_message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, filterParam.last_message_id);
                }
                if (filterParam.count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, filterParam.count);
                }
                if (filterParam.reverse != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, filterParam.reverse);
                }
                if (filterParam.chat_filter_param != null) {
                    ChatFilterParam.ADAPTER.encodeWithTag(protoWriter, 11, filterParam.chat_filter_param);
                }
                protoWriter.writeBytes(filterParam.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest$FilterParam$a */
        public static final class C18835a extends Message.Builder<FilterParam, C18835a> {

            /* renamed from: a */
            public List<String> f46481a = Internal.newMutableList();

            /* renamed from: b */
            public List<String> f46482b = Internal.newMutableList();

            /* renamed from: c */
            public Long f46483c;

            /* renamed from: d */
            public Long f46484d;

            /* renamed from: e */
            public Boolean f46485e;

            /* renamed from: f */
            public Long f46486f;

            /* renamed from: g */
            public String f46487g;

            /* renamed from: h */
            public Integer f46488h;

            /* renamed from: i */
            public Boolean f46489i;

            /* renamed from: j */
            public ChatFilterParam f46490j;

            /* renamed from: a */
            public FilterParam build() {
                return new FilterParam(this.f46481a, this.f46482b, this.f46483c, this.f46484d, this.f46485e, this.f46486f, this.f46487g, this.f46488h, this.f46489i, this.f46490j, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C18835a mo64675a(ChatFilterParam chatFilterParam) {
                this.f46490j = chatFilterParam;
                return this;
            }

            /* renamed from: a */
            public C18835a mo64676a(List<String> list) {
                Internal.checkElementsNotNull(list);
                this.f46481a = list;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C18835a newBuilder() {
            C18835a aVar = new C18835a();
            aVar.f46481a = Internal.copyOf("chat_ids", this.chat_ids);
            aVar.f46482b = Internal.copyOf("message_creator_ids", this.message_creator_ids);
            aVar.f46483c = this.message_start_time;
            aVar.f46484d = this.message_end_time;
            aVar.f46485e = this.need_search_outer_tenant;
            aVar.f46486f = this.last_create_time;
            aVar.f46487g = this.last_message_id;
            aVar.f46488h = this.count;
            aVar.f46489i = this.reverse;
            aVar.f46490j = this.chat_filter_param;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "FilterParam");
            StringBuilder sb = new StringBuilder();
            if (!this.chat_ids.isEmpty()) {
                sb.append(", chat_ids=");
                sb.append(this.chat_ids);
            }
            if (!this.message_creator_ids.isEmpty()) {
                sb.append(", message_creator_ids=");
                sb.append(this.message_creator_ids);
            }
            if (this.message_start_time != null) {
                sb.append(", message_start_time=");
                sb.append(this.message_start_time);
            }
            if (this.message_end_time != null) {
                sb.append(", message_end_time=");
                sb.append(this.message_end_time);
            }
            if (this.need_search_outer_tenant != null) {
                sb.append(", need_search_outer_tenant=");
                sb.append(this.need_search_outer_tenant);
            }
            if (this.last_create_time != null) {
                sb.append(", last_create_time=");
                sb.append(this.last_create_time);
            }
            if (this.last_message_id != null) {
                sb.append(", last_message_id=");
                sb.append(this.last_message_id);
            }
            if (this.count != null) {
                sb.append(", count=");
                sb.append(this.count);
            }
            if (this.reverse != null) {
                sb.append(", reverse=");
                sb.append(this.reverse);
            }
            if (this.chat_filter_param != null) {
                sb.append(", chat_filter_param=");
                sb.append(this.chat_filter_param);
            }
            StringBuilder replace = sb.replace(0, 2, "FilterParam{");
            replace.append('}');
            return replace.toString();
        }

        public FilterParam(List<String> list, List<String> list2, Long l, Long l2, Boolean bool, Long l3, String str, Integer num, Boolean bool2, ChatFilterParam chatFilterParam) {
            this(list, list2, l, l2, bool, l3, str, num, bool2, chatFilterParam, ByteString.EMPTY);
        }

        public FilterParam(List<String> list, List<String> list2, Long l, Long l2, Boolean bool, Long l3, String str, Integer num, Boolean bool2, ChatFilterParam chatFilterParam, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
            this.message_creator_ids = Internal.immutableCopyOf("message_creator_ids", list2);
            this.message_start_time = l;
            this.message_end_time = l2;
            this.need_search_outer_tenant = bool;
            this.last_create_time = l3;
            this.last_message_id = str;
            this.count = num;
            this.reverse = bool2;
            this.chat_filter_param = chatFilterParam;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest$b */
    private static final class C18838b extends ProtoAdapter<LocalIntegrationSearchRequest> {
        C18838b() {
            super(FieldEncoding.LENGTH_DELIMITED, LocalIntegrationSearchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(LocalIntegrationSearchRequest localIntegrationSearchRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, localIntegrationSearchRequest.query) + Scene.Type.ADAPTER.encodedSizeWithTag(2, localIntegrationSearchRequest.scene_type);
            int i3 = 0;
            if (localIntegrationSearchRequest.begin != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(3, localIntegrationSearchRequest.begin);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (localIntegrationSearchRequest.end != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, localIntegrationSearchRequest.end);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (localIntegrationSearchRequest.filter_param != null) {
                i3 = FilterParam.ADAPTER.encodedSizeWithTag(5, localIntegrationSearchRequest.filter_param);
            }
            return i5 + i3 + localIntegrationSearchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public LocalIntegrationSearchRequest decode(ProtoReader protoReader) throws IOException {
            C18837a aVar = new C18837a();
            aVar.f46491a = "";
            aVar.f46492b = Scene.Type.UNKNOWN;
            aVar.f46493c = 0;
            aVar.f46494d = 10;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46491a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46492b = Scene.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f46493c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46494d = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46495e = FilterParam.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LocalIntegrationSearchRequest localIntegrationSearchRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localIntegrationSearchRequest.query);
            Scene.Type.ADAPTER.encodeWithTag(protoWriter, 2, localIntegrationSearchRequest.scene_type);
            if (localIntegrationSearchRequest.begin != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, localIntegrationSearchRequest.begin);
            }
            if (localIntegrationSearchRequest.end != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, localIntegrationSearchRequest.end);
            }
            if (localIntegrationSearchRequest.filter_param != null) {
                FilterParam.ADAPTER.encodeWithTag(protoWriter, 5, localIntegrationSearchRequest.filter_param);
            }
            protoWriter.writeBytes(localIntegrationSearchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest$a */
    public static final class C18837a extends Message.Builder<LocalIntegrationSearchRequest, C18837a> {

        /* renamed from: a */
        public String f46491a;

        /* renamed from: b */
        public Scene.Type f46492b;

        /* renamed from: c */
        public Integer f46493c;

        /* renamed from: d */
        public Integer f46494d;

        /* renamed from: e */
        public FilterParam f46495e;

        /* renamed from: a */
        public LocalIntegrationSearchRequest build() {
            Scene.Type type;
            String str = this.f46491a;
            if (str != null && (type = this.f46492b) != null) {
                return new LocalIntegrationSearchRequest(str, type, this.f46493c, this.f46494d, this.f46495e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY, this.f46492b, "scene_type");
        }

        /* renamed from: a */
        public C18837a mo64681a(FilterParam filterParam) {
            this.f46495e = filterParam;
            return this;
        }

        /* renamed from: b */
        public C18837a mo64686b(Integer num) {
            this.f46494d = num;
            return this;
        }

        /* renamed from: a */
        public C18837a mo64682a(Scene.Type type) {
            this.f46492b = type;
            return this;
        }

        /* renamed from: a */
        public C18837a mo64683a(Integer num) {
            this.f46493c = num;
            return this;
        }

        /* renamed from: a */
        public C18837a mo64684a(String str) {
            this.f46491a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18837a newBuilder() {
        C18837a aVar = new C18837a();
        aVar.f46491a = this.query;
        aVar.f46492b = this.scene_type;
        aVar.f46493c = this.begin;
        aVar.f46494d = this.end;
        aVar.f46495e = this.filter_param;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "LocalIntegrationSearchRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", scene_type=");
        sb.append(this.scene_type);
        if (this.begin != null) {
            sb.append(", begin=");
            sb.append(this.begin);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        if (this.filter_param != null) {
            sb.append(", filter_param=");
            sb.append(this.filter_param);
        }
        StringBuilder replace = sb.replace(0, 2, "LocalIntegrationSearchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public LocalIntegrationSearchRequest(String str, Scene.Type type, Integer num, Integer num2, FilterParam filterParam) {
        this(str, type, num, num2, filterParam, ByteString.EMPTY);
    }

    public LocalIntegrationSearchRequest(String str, Scene.Type type, Integer num, Integer num2, FilterParam filterParam, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.scene_type = type;
        this.begin = num;
        this.end = num2;
        this.filter_param = filterParam;
    }
}
