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

public final class RecommendedGroupItem extends Message<RecommendedGroupItem, C17999a> {
    public static final ProtoAdapter<RecommendedGroupItem> ADAPTER = new C18000b();
    public static final JoinState DEFAULT_JOIN_STATE = JoinState.UNKNOWN;
    public static final Integer DEFAULT_USER_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final List<String> avatar_urls;
    public final String item_id;
    public final JoinState join_state;
    public final String name;
    public final List<RelatedUser> related_users;
    public final Integer user_count;

    public enum JoinState implements WireEnum {
        UNKNOWN(0),
        NOT_JOINED(1),
        APPLIED(2),
        JOINED(3);
        
        public static final ProtoAdapter<JoinState> ADAPTER = ProtoAdapter.newEnumAdapter(JoinState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static JoinState fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NOT_JOINED;
            }
            if (i == 2) {
                return APPLIED;
            }
            if (i != 3) {
                return null;
            }
            return JOINED;
        }

        private JoinState(int i) {
            this.value = i;
        }
    }

    public static final class RelatedUser extends Message<RelatedUser, C17997a> {
        public static final ProtoAdapter<RelatedUser> ADAPTER = new C17998b();
        private static final long serialVersionUID = 0;
        public final String avatar_key;
        public final String avatar_url;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.RecommendedGroupItem$RelatedUser$b */
        private static final class C17998b extends ProtoAdapter<RelatedUser> {
            C17998b() {
                super(FieldEncoding.LENGTH_DELIMITED, RelatedUser.class);
            }

            /* renamed from: a */
            public int encodedSize(RelatedUser relatedUser) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, relatedUser.user_id);
                int i2 = 0;
                if (relatedUser.avatar_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, relatedUser.avatar_key);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (relatedUser.avatar_url != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, relatedUser.avatar_url);
                }
                return i3 + i2 + relatedUser.unknownFields().size();
            }

            /* renamed from: a */
            public RelatedUser decode(ProtoReader protoReader) throws IOException {
                C17997a aVar = new C17997a();
                aVar.f45092a = "";
                aVar.f45093b = "";
                aVar.f45094c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45092a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45093b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45094c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RelatedUser relatedUser) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, relatedUser.user_id);
                if (relatedUser.avatar_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, relatedUser.avatar_key);
                }
                if (relatedUser.avatar_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, relatedUser.avatar_url);
                }
                protoWriter.writeBytes(relatedUser.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17997a newBuilder() {
            C17997a aVar = new C17997a();
            aVar.f45092a = this.user_id;
            aVar.f45093b = this.avatar_key;
            aVar.f45094c = this.avatar_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.RecommendedGroupItem$RelatedUser$a */
        public static final class C17997a extends Message.Builder<RelatedUser, C17997a> {

            /* renamed from: a */
            public String f45092a;

            /* renamed from: b */
            public String f45093b;

            /* renamed from: c */
            public String f45094c;

            /* renamed from: a */
            public RelatedUser build() {
                String str = this.f45092a;
                if (str != null) {
                    return new RelatedUser(str, this.f45093b, this.f45094c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "user_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "RelatedUser");
            StringBuilder sb = new StringBuilder();
            sb.append(", user_id=");
            sb.append(this.user_id);
            if (this.avatar_key != null) {
                sb.append(", avatar_key=");
                sb.append(this.avatar_key);
            }
            if (this.avatar_url != null) {
                sb.append(", avatar_url=");
                sb.append(this.avatar_url);
            }
            StringBuilder replace = sb.replace(0, 2, "RelatedUser{");
            replace.append('}');
            return replace.toString();
        }

        public RelatedUser(String str, String str2, String str3) {
            this(str, str2, str3, ByteString.EMPTY);
        }

        public RelatedUser(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
            this.avatar_key = str2;
            this.avatar_url = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.RecommendedGroupItem$b */
    private static final class C18000b extends ProtoAdapter<RecommendedGroupItem> {
        C18000b() {
            super(FieldEncoding.LENGTH_DELIMITED, RecommendedGroupItem.class);
        }

        /* renamed from: a */
        public int encodedSize(RecommendedGroupItem recommendedGroupItem) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, recommendedGroupItem.item_id);
            int i4 = 0;
            if (recommendedGroupItem.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, recommendedGroupItem.name);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (recommendedGroupItem.avatar_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, recommendedGroupItem.avatar_key);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i5 + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, recommendedGroupItem.avatar_urls);
            if (recommendedGroupItem.join_state != null) {
                i3 = JoinState.ADAPTER.encodedSizeWithTag(5, recommendedGroupItem.join_state);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i3 + RelatedUser.ADAPTER.asRepeated().encodedSizeWithTag(6, recommendedGroupItem.related_users);
            if (recommendedGroupItem.user_count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(7, recommendedGroupItem.user_count);
            }
            return encodedSizeWithTag3 + i4 + recommendedGroupItem.unknownFields().size();
        }

        /* renamed from: a */
        public RecommendedGroupItem decode(ProtoReader protoReader) throws IOException {
            C17999a aVar = new C17999a();
            aVar.f45095a = "";
            aVar.f45096b = "";
            aVar.f45097c = "";
            aVar.f45099e = JoinState.UNKNOWN;
            aVar.f45101g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45095a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45096b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45097c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45098d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            try {
                                aVar.f45099e = JoinState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f45100f.add(RelatedUser.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f45101g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, RecommendedGroupItem recommendedGroupItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recommendedGroupItem.item_id);
            if (recommendedGroupItem.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, recommendedGroupItem.name);
            }
            if (recommendedGroupItem.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recommendedGroupItem.avatar_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, recommendedGroupItem.avatar_urls);
            if (recommendedGroupItem.join_state != null) {
                JoinState.ADAPTER.encodeWithTag(protoWriter, 5, recommendedGroupItem.join_state);
            }
            RelatedUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, recommendedGroupItem.related_users);
            if (recommendedGroupItem.user_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, recommendedGroupItem.user_count);
            }
            protoWriter.writeBytes(recommendedGroupItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.RecommendedGroupItem$a */
    public static final class C17999a extends Message.Builder<RecommendedGroupItem, C17999a> {

        /* renamed from: a */
        public String f45095a;

        /* renamed from: b */
        public String f45096b;

        /* renamed from: c */
        public String f45097c;

        /* renamed from: d */
        public List<String> f45098d = Internal.newMutableList();

        /* renamed from: e */
        public JoinState f45099e;

        /* renamed from: f */
        public List<RelatedUser> f45100f = Internal.newMutableList();

        /* renamed from: g */
        public Integer f45101g;

        /* renamed from: a */
        public RecommendedGroupItem build() {
            String str = this.f45095a;
            if (str != null) {
                return new RecommendedGroupItem(str, this.f45096b, this.f45097c, this.f45098d, this.f45099e, this.f45100f, this.f45101g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "item_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C17999a newBuilder() {
        C17999a aVar = new C17999a();
        aVar.f45095a = this.item_id;
        aVar.f45096b = this.name;
        aVar.f45097c = this.avatar_key;
        aVar.f45098d = Internal.copyOf("avatar_urls", this.avatar_urls);
        aVar.f45099e = this.join_state;
        aVar.f45100f = Internal.copyOf("related_users", this.related_users);
        aVar.f45101g = this.user_count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "RecommendedGroupItem");
        StringBuilder sb = new StringBuilder();
        sb.append(", item_id=");
        sb.append(this.item_id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.join_state != null) {
            sb.append(", join_state=");
            sb.append(this.join_state);
        }
        if (!this.related_users.isEmpty()) {
            sb.append(", related_users=");
            sb.append(this.related_users);
        }
        if (this.user_count != null) {
            sb.append(", user_count=");
            sb.append(this.user_count);
        }
        StringBuilder replace = sb.replace(0, 2, "RecommendedGroupItem{");
        replace.append('}');
        return replace.toString();
    }

    public RecommendedGroupItem(String str, String str2, String str3, List<String> list, JoinState joinState, List<RelatedUser> list2, Integer num) {
        this(str, str2, str3, list, joinState, list2, num, ByteString.EMPTY);
    }

    public RecommendedGroupItem(String str, String str2, String str3, List<String> list, JoinState joinState, List<RelatedUser> list2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item_id = str;
        this.name = str2;
        this.avatar_key = str3;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.join_state = joinState;
        this.related_users = Internal.immutableCopyOf("related_users", list2);
        this.user_count = num;
    }
}
