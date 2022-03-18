package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
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

public final class TopicGroup extends Message<TopicGroup, C15344a> {
    public static final ProtoAdapter<TopicGroup> ADAPTER = new C15345b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN_TYPE;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Type type;
    public final UserSetting user_setting;

    public enum Type implements WireEnum {
        UNKNOWN_TYPE(0),
        NORMAL(1),
        DEFAULT(2),
        PUBLIC(3);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_TYPE;
            }
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return DEFAULT;
            }
            if (i != 3) {
                return null;
            }
            return PUBLIC;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class UserSetting extends Message<UserSetting, C15342a> {
        public static final ProtoAdapter<UserSetting> ADAPTER = new C15343b();
        public static final Boolean DEFAULT_IS_FAVORITE = false;
        public static final TopicGroupRole DEFAULT_TOPIC_GROUP_ROLE = TopicGroupRole.UNKNOWN_ROLE;
        public static final Long DEFAULT_UPDATE_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Boolean is_favorite;
        public final TopicGroupRole topic_group_role;
        public final Long update_time;

        /* renamed from: com.bytedance.lark.pb.basic.v1.TopicGroup$UserSetting$b */
        private static final class C15343b extends ProtoAdapter<UserSetting> {
            C15343b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserSetting.class);
            }

            /* renamed from: a */
            public int encodedSize(UserSetting userSetting) {
                int i;
                int i2;
                int i3 = 0;
                if (userSetting.is_favorite != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, userSetting.is_favorite);
                } else {
                    i = 0;
                }
                if (userSetting.update_time != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, userSetting.update_time);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (userSetting.topic_group_role != null) {
                    i3 = TopicGroupRole.ADAPTER.encodedSizeWithTag(3, userSetting.topic_group_role);
                }
                return i4 + i3 + userSetting.unknownFields().size();
            }

            /* renamed from: a */
            public UserSetting decode(ProtoReader protoReader) throws IOException {
                C15342a aVar = new C15342a();
                aVar.f40646a = false;
                aVar.f40647b = 0L;
                aVar.f40648c = TopicGroupRole.UNKNOWN_ROLE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f40646a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f40647b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f40648c = TopicGroupRole.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserSetting userSetting) throws IOException {
                if (userSetting.is_favorite != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, userSetting.is_favorite);
                }
                if (userSetting.update_time != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, userSetting.update_time);
                }
                if (userSetting.topic_group_role != null) {
                    TopicGroupRole.ADAPTER.encodeWithTag(protoWriter, 3, userSetting.topic_group_role);
                }
                protoWriter.writeBytes(userSetting.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.TopicGroup$UserSetting$a */
        public static final class C15342a extends Message.Builder<UserSetting, C15342a> {

            /* renamed from: a */
            public Boolean f40646a;

            /* renamed from: b */
            public Long f40647b;

            /* renamed from: c */
            public TopicGroupRole f40648c;

            /* renamed from: a */
            public UserSetting build() {
                return new UserSetting(this.f40646a, this.f40647b, this.f40648c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15342a newBuilder() {
            C15342a aVar = new C15342a();
            aVar.f40646a = this.is_favorite;
            aVar.f40647b = this.update_time;
            aVar.f40648c = this.topic_group_role;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "UserSetting");
            StringBuilder sb = new StringBuilder();
            if (this.is_favorite != null) {
                sb.append(", is_favorite=");
                sb.append(this.is_favorite);
            }
            if (this.update_time != null) {
                sb.append(", update_time=");
                sb.append(this.update_time);
            }
            if (this.topic_group_role != null) {
                sb.append(", topic_group_role=");
                sb.append(this.topic_group_role);
            }
            StringBuilder replace = sb.replace(0, 2, "UserSetting{");
            replace.append('}');
            return replace.toString();
        }

        public UserSetting(Boolean bool, Long l, TopicGroupRole topicGroupRole) {
            this(bool, l, topicGroupRole, ByteString.EMPTY);
        }

        public UserSetting(Boolean bool, Long l, TopicGroupRole topicGroupRole, ByteString byteString) {
            super(ADAPTER, byteString);
            this.is_favorite = bool;
            this.update_time = l;
            this.topic_group_role = topicGroupRole;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TopicGroup$b */
    private static final class C15345b extends ProtoAdapter<TopicGroup> {
        C15345b() {
            super(FieldEncoding.LENGTH_DELIMITED, TopicGroup.class);
        }

        /* renamed from: a */
        public int encodedSize(TopicGroup topicGroup) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, topicGroup.id) + Type.ADAPTER.encodedSizeWithTag(2, topicGroup.type);
            if (topicGroup.user_setting != null) {
                i = UserSetting.ADAPTER.encodedSizeWithTag(3, topicGroup.user_setting);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + topicGroup.unknownFields().size();
        }

        /* renamed from: a */
        public TopicGroup decode(ProtoReader protoReader) throws IOException {
            C15344a aVar = new C15344a();
            aVar.f40649a = "";
            aVar.f40650b = Type.UNKNOWN_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40649a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f40650b = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40651c = UserSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TopicGroup topicGroup) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, topicGroup.id);
            Type.ADAPTER.encodeWithTag(protoWriter, 2, topicGroup.type);
            if (topicGroup.user_setting != null) {
                UserSetting.ADAPTER.encodeWithTag(protoWriter, 3, topicGroup.user_setting);
            }
            protoWriter.writeBytes(topicGroup.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15344a newBuilder() {
        C15344a aVar = new C15344a();
        aVar.f40649a = this.id;
        aVar.f40650b = this.type;
        aVar.f40651c = this.user_setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TopicGroup$a */
    public static final class C15344a extends Message.Builder<TopicGroup, C15344a> {

        /* renamed from: a */
        public String f40649a;

        /* renamed from: b */
        public Type f40650b;

        /* renamed from: c */
        public UserSetting f40651c;

        /* renamed from: a */
        public TopicGroup build() {
            Type type;
            String str = this.f40649a;
            if (str != null && (type = this.f40650b) != null) {
                return new TopicGroup(str, type, this.f40651c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f40650b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TopicGroup");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        if (this.user_setting != null) {
            sb.append(", user_setting=");
            sb.append(this.user_setting);
        }
        StringBuilder replace = sb.replace(0, 2, "TopicGroup{");
        replace.append('}');
        return replace.toString();
    }

    public TopicGroup(String str, Type type2, UserSetting userSetting) {
        this(str, type2, userSetting, ByteString.EMPTY);
    }

    public TopicGroup(String str, Type type2, UserSetting userSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
        this.user_setting = userSetting;
    }
}
