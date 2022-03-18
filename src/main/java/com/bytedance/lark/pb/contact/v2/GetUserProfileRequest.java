package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ContactSource;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserProfileRequest extends Message<GetUserProfileRequest, C16488a> {
    public static final ProtoAdapter<GetUserProfileRequest> ADAPTER = new C16489b();
    public static final Boolean DEFAULT_IS_SUPPORT_ONE_WAY_RELATION = false;
    public static final Scene DEFAULT_SCENE = Scene.UNKNOWN;
    public static final ContactSource DEFAULT_SOURCE = ContactSource.UNKNOWN_SOURCE;
    public static final SyncDataStrategy DEFAULT_SYNC_DATA_STRATEGY = SyncDataStrategy.LOCAL;
    public static final Boolean DEFAULT_USE_NEW_LAYOUT = false;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String contact_token;
    public final Boolean is_support_one_way_relation;
    public final Scene scene;
    public final ContactSource source;
    public final SyncDataStrategy sync_data_strategy;
    public final Boolean use_new_layout;
    public final String user_id;

    public enum Scene implements WireEnum {
        UNKNOWN(0),
        BY_USER_ID(1),
        BY_CONTACT_TOKEN(2),
        IN_CHAT(100);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return BY_USER_ID;
            }
            if (i == 2) {
                return BY_CONTACT_TOKEN;
            }
            if (i != 100) {
                return null;
            }
            return IN_CHAT;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileRequest$b */
    private static final class C16489b extends ProtoAdapter<GetUserProfileRequest> {
        C16489b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserProfileRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserProfileRequest getUserProfileRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = Scene.ADAPTER.encodedSizeWithTag(1, getUserProfileRequest.scene) + SyncDataStrategy.ADAPTER.encodedSizeWithTag(2, getUserProfileRequest.sync_data_strategy);
            int i6 = 0;
            if (getUserProfileRequest.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getUserProfileRequest.user_id);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (getUserProfileRequest.contact_token != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, getUserProfileRequest.contact_token);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (getUserProfileRequest.chat_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, getUserProfileRequest.chat_id);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (getUserProfileRequest.source != null) {
                i4 = ContactSource.ADAPTER.encodedSizeWithTag(6, getUserProfileRequest.source);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (getUserProfileRequest.is_support_one_way_relation != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(100, getUserProfileRequest.is_support_one_way_relation);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (getUserProfileRequest.use_new_layout != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(101, getUserProfileRequest.use_new_layout);
            }
            return i11 + i6 + getUserProfileRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserProfileRequest decode(ProtoReader protoReader) throws IOException {
            C16488a aVar = new C16488a();
            aVar.f42794a = Scene.UNKNOWN;
            aVar.f42795b = SyncDataStrategy.LOCAL;
            aVar.f42796c = "";
            aVar.f42797d = "";
            aVar.f42798e = "";
            aVar.f42799f = ContactSource.UNKNOWN_SOURCE;
            aVar.f42800g = false;
            aVar.f42801h = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 100) {
                    aVar.f42800g = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 101) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f42794a = Scene.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f42795b = SyncDataStrategy.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f42796c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f42797d = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f42798e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            try {
                                aVar.f42799f = ContactSource.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f42801h = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserProfileRequest getUserProfileRequest) throws IOException {
            Scene.ADAPTER.encodeWithTag(protoWriter, 1, getUserProfileRequest.scene);
            SyncDataStrategy.ADAPTER.encodeWithTag(protoWriter, 2, getUserProfileRequest.sync_data_strategy);
            if (getUserProfileRequest.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getUserProfileRequest.user_id);
            }
            if (getUserProfileRequest.contact_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getUserProfileRequest.contact_token);
            }
            if (getUserProfileRequest.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getUserProfileRequest.chat_id);
            }
            if (getUserProfileRequest.source != null) {
                ContactSource.ADAPTER.encodeWithTag(protoWriter, 6, getUserProfileRequest.source);
            }
            if (getUserProfileRequest.is_support_one_way_relation != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 100, getUserProfileRequest.is_support_one_way_relation);
            }
            if (getUserProfileRequest.use_new_layout != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 101, getUserProfileRequest.use_new_layout);
            }
            protoWriter.writeBytes(getUserProfileRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetUserProfileRequest$a */
    public static final class C16488a extends Message.Builder<GetUserProfileRequest, C16488a> {

        /* renamed from: a */
        public Scene f42794a;

        /* renamed from: b */
        public SyncDataStrategy f42795b;

        /* renamed from: c */
        public String f42796c;

        /* renamed from: d */
        public String f42797d;

        /* renamed from: e */
        public String f42798e;

        /* renamed from: f */
        public ContactSource f42799f;

        /* renamed from: g */
        public Boolean f42800g;

        /* renamed from: h */
        public Boolean f42801h;

        /* renamed from: a */
        public GetUserProfileRequest build() {
            SyncDataStrategy syncDataStrategy;
            Scene scene = this.f42794a;
            if (scene != null && (syncDataStrategy = this.f42795b) != null) {
                return new GetUserProfileRequest(scene, syncDataStrategy, this.f42796c, this.f42797d, this.f42798e, this.f42799f, this.f42800g, this.f42801h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(scene, "scene", this.f42795b, "sync_data_strategy");
        }

        /* renamed from: a */
        public C16488a mo58767a(SyncDataStrategy syncDataStrategy) {
            this.f42795b = syncDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C16488a mo58768a(Scene scene) {
            this.f42794a = scene;
            return this;
        }

        /* renamed from: a */
        public C16488a mo58769a(Boolean bool) {
            this.f42800g = bool;
            return this;
        }

        /* renamed from: a */
        public C16488a mo58770a(String str) {
            this.f42796c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16488a newBuilder() {
        C16488a aVar = new C16488a();
        aVar.f42794a = this.scene;
        aVar.f42795b = this.sync_data_strategy;
        aVar.f42796c = this.user_id;
        aVar.f42797d = this.contact_token;
        aVar.f42798e = this.chat_id;
        aVar.f42799f = this.source;
        aVar.f42800g = this.is_support_one_way_relation;
        aVar.f42801h = this.use_new_layout;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetUserProfileRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", scene=");
        sb.append(this.scene);
        sb.append(", sync_data_strategy=");
        sb.append(this.sync_data_strategy);
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.contact_token != null) {
            sb.append(", contact_token=");
            sb.append(this.contact_token);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.is_support_one_way_relation != null) {
            sb.append(", is_support_one_way_relation=");
            sb.append(this.is_support_one_way_relation);
        }
        if (this.use_new_layout != null) {
            sb.append(", use_new_layout=");
            sb.append(this.use_new_layout);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserProfileRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserProfileRequest(Scene scene2, SyncDataStrategy syncDataStrategy, String str, String str2, String str3, ContactSource contactSource, Boolean bool, Boolean bool2) {
        this(scene2, syncDataStrategy, str, str2, str3, contactSource, bool, bool2, ByteString.EMPTY);
    }

    public GetUserProfileRequest(Scene scene2, SyncDataStrategy syncDataStrategy, String str, String str2, String str3, ContactSource contactSource, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = scene2;
        this.sync_data_strategy = syncDataStrategy;
        this.user_id = str;
        this.contact_token = str2;
        this.chat_id = str3;
        this.source = contactSource;
        this.is_support_one_way_relation = bool;
        this.use_new_layout = bool2;
    }
}
