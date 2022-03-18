package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.TopicGroup;
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

public final class GetRecommendationsByUserResponse extends Message<GetRecommendationsByUserResponse, C17672a> {
    public static final ProtoAdapter<GetRecommendationsByUserResponse> ADAPTER = new C17673b();
    public static final Boolean DEFAULT_REFRESHED = false;
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final String next_cursor;
    public final List<RecommendationItem> recommendation_items;
    public final Boolean refreshed;

    public enum RecommendationType implements WireEnum {
        UNKNOWN_RECOMMENDATION_TYPE(0),
        THREAD(1),
        GROUPS(2),
        QUASI_THREAD(10);
        
        public static final ProtoAdapter<RecommendationType> ADAPTER = ProtoAdapter.newEnumAdapter(RecommendationType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecommendationType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_RECOMMENDATION_TYPE;
            }
            if (i == 1) {
                return THREAD;
            }
            if (i == 2) {
                return GROUPS;
            }
            if (i != 10) {
                return null;
            }
            return QUASI_THREAD;
        }

        private RecommendationType(int i) {
            this.value = i;
        }
    }

    public static final class RecommendationItem extends Message<RecommendationItem, C17670a> {
        public static final ProtoAdapter<RecommendationItem> ADAPTER = new C17671b();
        public static final TopicGroup.Type DEFAULT_FROM_GROUP_TYPE = TopicGroup.Type.UNKNOWN_TYPE;
        public static final Boolean DEFAULT_HAS_MORE_RECOMMENDED_TOPIC_GROUPS = false;
        public static final RecommendationType DEFAULT_RECOMMENDATION_TYPE = RecommendationType.UNKNOWN_RECOMMENDATION_TYPE;
        private static final long serialVersionUID = 0;
        public final TopicGroup.Type from_group_type;
        public final Boolean has_more_recommended_topic_groups;
        public final String impression_id;
        public final String item_id;
        public final RecommendationType recommendation_type;
        public final List<RecommendedGroupItem> topic_groups;

        /* renamed from: com.bytedance.lark.pb.im.v1.GetRecommendationsByUserResponse$RecommendationItem$b */
        private static final class C17671b extends ProtoAdapter<RecommendationItem> {
            C17671b() {
                super(FieldEncoding.LENGTH_DELIMITED, RecommendationItem.class);
            }

            /* renamed from: a */
            public int encodedSize(RecommendationItem recommendationItem) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (recommendationItem.item_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, recommendationItem.item_id);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + RecommendationType.ADAPTER.encodedSizeWithTag(2, recommendationItem.recommendation_type);
                if (recommendationItem.impression_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, recommendationItem.impression_id);
                } else {
                    i2 = 0;
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + i2 + RecommendedGroupItem.ADAPTER.asRepeated().encodedSizeWithTag(4, recommendationItem.topic_groups);
                if (recommendationItem.has_more_recommended_topic_groups != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, recommendationItem.has_more_recommended_topic_groups);
                } else {
                    i3 = 0;
                }
                int i5 = encodedSizeWithTag2 + i3;
                if (recommendationItem.from_group_type != null) {
                    i4 = TopicGroup.Type.ADAPTER.encodedSizeWithTag(6, recommendationItem.from_group_type);
                }
                return i5 + i4 + recommendationItem.unknownFields().size();
            }

            /* renamed from: a */
            public RecommendationItem decode(ProtoReader protoReader) throws IOException {
                C17670a aVar = new C17670a();
                aVar.f44676a = "";
                aVar.f44677b = RecommendationType.UNKNOWN_RECOMMENDATION_TYPE;
                aVar.f44678c = "";
                aVar.f44680e = false;
                aVar.f44681f = TopicGroup.Type.UNKNOWN_TYPE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f44676a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                try {
                                    aVar.f44677b = RecommendationType.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 3:
                                aVar.f44678c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f44679d.add(RecommendedGroupItem.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                aVar.f44680e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                try {
                                    aVar.f44681f = TopicGroup.Type.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
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
            public void encode(ProtoWriter protoWriter, RecommendationItem recommendationItem) throws IOException {
                if (recommendationItem.item_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendationItem.item_id);
                }
                RecommendationType.ADAPTER.encodeWithTag(protoWriter, 2, recommendationItem.recommendation_type);
                if (recommendationItem.impression_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recommendationItem.impression_id);
                }
                RecommendedGroupItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, recommendationItem.topic_groups);
                if (recommendationItem.has_more_recommended_topic_groups != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, recommendationItem.has_more_recommended_topic_groups);
                }
                if (recommendationItem.from_group_type != null) {
                    TopicGroup.Type.ADAPTER.encodeWithTag(protoWriter, 6, recommendationItem.from_group_type);
                }
                protoWriter.writeBytes(recommendationItem.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.GetRecommendationsByUserResponse$RecommendationItem$a */
        public static final class C17670a extends Message.Builder<RecommendationItem, C17670a> {

            /* renamed from: a */
            public String f44676a;

            /* renamed from: b */
            public RecommendationType f44677b;

            /* renamed from: c */
            public String f44678c;

            /* renamed from: d */
            public List<RecommendedGroupItem> f44679d = Internal.newMutableList();

            /* renamed from: e */
            public Boolean f44680e;

            /* renamed from: f */
            public TopicGroup.Type f44681f;

            /* renamed from: a */
            public RecommendationItem build() {
                RecommendationType recommendationType = this.f44677b;
                if (recommendationType != null) {
                    return new RecommendationItem(this.f44676a, recommendationType, this.f44678c, this.f44679d, this.f44680e, this.f44681f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(recommendationType, "recommendation_type");
            }
        }

        @Override // com.squareup.wire.Message
        public C17670a newBuilder() {
            C17670a aVar = new C17670a();
            aVar.f44676a = this.item_id;
            aVar.f44677b = this.recommendation_type;
            aVar.f44678c = this.impression_id;
            aVar.f44679d = Internal.copyOf("topic_groups", this.topic_groups);
            aVar.f44680e = this.has_more_recommended_topic_groups;
            aVar.f44681f = this.from_group_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "RecommendationItem");
            StringBuilder sb = new StringBuilder();
            if (this.item_id != null) {
                sb.append(", item_id=");
                sb.append(this.item_id);
            }
            sb.append(", recommendation_type=");
            sb.append(this.recommendation_type);
            if (this.impression_id != null) {
                sb.append(", impression_id=");
                sb.append(this.impression_id);
            }
            if (!this.topic_groups.isEmpty()) {
                sb.append(", topic_groups=");
                sb.append(this.topic_groups);
            }
            if (this.has_more_recommended_topic_groups != null) {
                sb.append(", has_more_recommended_topic_groups=");
                sb.append(this.has_more_recommended_topic_groups);
            }
            if (this.from_group_type != null) {
                sb.append(", from_group_type=");
                sb.append(this.from_group_type);
            }
            StringBuilder replace = sb.replace(0, 2, "RecommendationItem{");
            replace.append('}');
            return replace.toString();
        }

        public RecommendationItem(String str, RecommendationType recommendationType, String str2, List<RecommendedGroupItem> list, Boolean bool, TopicGroup.Type type) {
            this(str, recommendationType, str2, list, bool, type, ByteString.EMPTY);
        }

        public RecommendationItem(String str, RecommendationType recommendationType, String str2, List<RecommendedGroupItem> list, Boolean bool, TopicGroup.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.item_id = str;
            this.recommendation_type = recommendationType;
            this.impression_id = str2;
            this.topic_groups = Internal.immutableCopyOf("topic_groups", list);
            this.has_more_recommended_topic_groups = bool;
            this.from_group_type = type;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRecommendationsByUserResponse$b */
    private static final class C17673b extends ProtoAdapter<GetRecommendationsByUserResponse> {
        C17673b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecommendationsByUserResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecommendationsByUserResponse getRecommendationsByUserResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = RecommendationItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getRecommendationsByUserResponse.recommendation_items);
            int i3 = 0;
            if (getRecommendationsByUserResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, getRecommendationsByUserResponse.entity);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getRecommendationsByUserResponse.next_cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getRecommendationsByUserResponse.next_cursor);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getRecommendationsByUserResponse.refreshed != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getRecommendationsByUserResponse.refreshed);
            }
            return i5 + i3 + getRecommendationsByUserResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecommendationsByUserResponse decode(ProtoReader protoReader) throws IOException {
            C17672a aVar = new C17672a();
            aVar.f44684c = "";
            aVar.f44685d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44682a.add(RecommendationItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44683b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44684c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44685d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecommendationsByUserResponse getRecommendationsByUserResponse) throws IOException {
            RecommendationItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRecommendationsByUserResponse.recommendation_items);
            if (getRecommendationsByUserResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getRecommendationsByUserResponse.entity);
            }
            if (getRecommendationsByUserResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getRecommendationsByUserResponse.next_cursor);
            }
            if (getRecommendationsByUserResponse.refreshed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getRecommendationsByUserResponse.refreshed);
            }
            protoWriter.writeBytes(getRecommendationsByUserResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetRecommendationsByUserResponse$a */
    public static final class C17672a extends Message.Builder<GetRecommendationsByUserResponse, C17672a> {

        /* renamed from: a */
        public List<RecommendationItem> f44682a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f44683b;

        /* renamed from: c */
        public String f44684c;

        /* renamed from: d */
        public Boolean f44685d;

        /* renamed from: a */
        public GetRecommendationsByUserResponse build() {
            return new GetRecommendationsByUserResponse(this.f44682a, this.f44683b, this.f44684c, this.f44685d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17672a newBuilder() {
        C17672a aVar = new C17672a();
        aVar.f44682a = Internal.copyOf("recommendation_items", this.recommendation_items);
        aVar.f44683b = this.entity;
        aVar.f44684c = this.next_cursor;
        aVar.f44685d = this.refreshed;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetRecommendationsByUserResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.recommendation_items.isEmpty()) {
            sb.append(", recommendation_items=");
            sb.append(this.recommendation_items);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.refreshed != null) {
            sb.append(", refreshed=");
            sb.append(this.refreshed);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRecommendationsByUserResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecommendationsByUserResponse(List<RecommendationItem> list, C14928Entity entity2, String str, Boolean bool) {
        this(list, entity2, str, bool, ByteString.EMPTY);
    }

    public GetRecommendationsByUserResponse(List<RecommendationItem> list, C14928Entity entity2, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recommendation_items = Internal.immutableCopyOf("recommendation_items", list);
        this.entity = entity2;
        this.next_cursor = str;
        this.refreshed = bool;
    }
}
