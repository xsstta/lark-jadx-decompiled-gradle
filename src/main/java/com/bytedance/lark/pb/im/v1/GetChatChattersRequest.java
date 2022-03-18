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
import okio.ByteString;

public final class GetChatChattersRequest extends Message<GetChatChattersRequest, C17506a> {
    public static final ProtoAdapter<GetChatChattersRequest> ADAPTER = new C17507b();
    public static final Condition DEFAULT_CONDITION = Condition.NoLimit;
    public static final Boolean DEFAULT_IS_FROM_SERVER = true;
    public static final Boolean DEFAULT_IS_FULL_DATA = false;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Scene DEFAULT_SCENE = Scene.CHAT_MEMBER;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Condition condition;
    public final String cursor;
    public final String filter;
    public final Boolean is_from_server;
    public final Boolean is_full_data;
    public final Integer limit;
    public final Integer offset;
    public final Scene scene;

    public enum Condition implements WireEnum {
        Unknown(0),
        NoLimit(1),
        NonDepartment(2);
        
        public static final ProtoAdapter<Condition> ADAPTER = ProtoAdapter.newEnumAdapter(Condition.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Condition fromValue(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return NoLimit;
            }
            if (i != 2) {
                return null;
            }
            return NonDepartment;
        }

        private Condition(int i) {
            this.value = i;
        }
    }

    public enum Scene implements WireEnum {
        CHAT_MEMBER(1),
        URGENT(2),
        AT(3);
        
        public static final ProtoAdapter<Scene> ADAPTER = ProtoAdapter.newEnumAdapter(Scene.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Scene fromValue(int i) {
            if (i == 1) {
                return CHAT_MEMBER;
            }
            if (i == 2) {
                return URGENT;
            }
            if (i != 3) {
                return null;
            }
            return AT;
        }

        private Scene(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersRequest$b */
    private static final class C17507b extends ProtoAdapter<GetChatChattersRequest> {
        C17507b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatChattersRequest getChatChattersRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getChatChattersRequest.chat_id);
            int i8 = 0;
            if (getChatChattersRequest.is_from_server != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getChatChattersRequest.is_from_server);
            } else {
                i = 0;
            }
            int i9 = encodedSizeWithTag + i;
            if (getChatChattersRequest.scene != null) {
                i2 = Scene.ADAPTER.encodedSizeWithTag(3, getChatChattersRequest.scene);
            } else {
                i2 = 0;
            }
            int i10 = i9 + i2;
            if (getChatChattersRequest.filter != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getChatChattersRequest.filter);
            } else {
                i3 = 0;
            }
            int i11 = i10 + i3;
            if (getChatChattersRequest.cursor != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, getChatChattersRequest.cursor);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (getChatChattersRequest.limit != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, getChatChattersRequest.limit);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (getChatChattersRequest.is_full_data != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, getChatChattersRequest.is_full_data);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (getChatChattersRequest.condition != null) {
                i7 = Condition.ADAPTER.encodedSizeWithTag(8, getChatChattersRequest.condition);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (getChatChattersRequest.offset != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(9, getChatChattersRequest.offset);
            }
            return i15 + i8 + getChatChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatChattersRequest decode(ProtoReader protoReader) throws IOException {
            C17506a aVar = new C17506a();
            aVar.f44412a = "";
            aVar.f44413b = true;
            aVar.f44414c = Scene.CHAT_MEMBER;
            aVar.f44415d = "";
            aVar.f44416e = "";
            aVar.f44417f = 0;
            aVar.f44418g = false;
            aVar.f44419h = Condition.NoLimit;
            aVar.f44420i = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44412a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44413b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f44414c = Scene.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f44415d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f44416e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44417f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44418g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f44419h = Condition.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 9:
                            aVar.f44420i = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetChatChattersRequest getChatChattersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatChattersRequest.chat_id);
            if (getChatChattersRequest.is_from_server != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getChatChattersRequest.is_from_server);
            }
            if (getChatChattersRequest.scene != null) {
                Scene.ADAPTER.encodeWithTag(protoWriter, 3, getChatChattersRequest.scene);
            }
            if (getChatChattersRequest.filter != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getChatChattersRequest.filter);
            }
            if (getChatChattersRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getChatChattersRequest.cursor);
            }
            if (getChatChattersRequest.limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, getChatChattersRequest.limit);
            }
            if (getChatChattersRequest.is_full_data != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getChatChattersRequest.is_full_data);
            }
            if (getChatChattersRequest.condition != null) {
                Condition.ADAPTER.encodeWithTag(protoWriter, 8, getChatChattersRequest.condition);
            }
            if (getChatChattersRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, getChatChattersRequest.offset);
            }
            protoWriter.writeBytes(getChatChattersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersRequest$a */
    public static final class C17506a extends Message.Builder<GetChatChattersRequest, C17506a> {

        /* renamed from: a */
        public String f44412a;

        /* renamed from: b */
        public Boolean f44413b;

        /* renamed from: c */
        public Scene f44414c;

        /* renamed from: d */
        public String f44415d;

        /* renamed from: e */
        public String f44416e;

        /* renamed from: f */
        public Integer f44417f;

        /* renamed from: g */
        public Boolean f44418g;

        /* renamed from: h */
        public Condition f44419h;

        /* renamed from: i */
        public Integer f44420i;

        /* renamed from: a */
        public GetChatChattersRequest build() {
            String str = this.f44412a;
            if (str != null) {
                return new GetChatChattersRequest(str, this.f44413b, this.f44414c, this.f44415d, this.f44416e, this.f44417f, this.f44418g, this.f44419h, this.f44420i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17506a mo61326a(Condition condition) {
            this.f44419h = condition;
            return this;
        }

        /* renamed from: b */
        public C17506a mo61331b(Boolean bool) {
            this.f44418g = bool;
            return this;
        }

        /* renamed from: c */
        public C17506a mo61334c(String str) {
            this.f44416e = str;
            return this;
        }

        /* renamed from: a */
        public C17506a mo61327a(Boolean bool) {
            this.f44413b = bool;
            return this;
        }

        /* renamed from: b */
        public C17506a mo61332b(Integer num) {
            this.f44420i = num;
            return this;
        }

        /* renamed from: a */
        public C17506a mo61328a(Integer num) {
            this.f44417f = num;
            return this;
        }

        /* renamed from: b */
        public C17506a mo61333b(String str) {
            this.f44415d = str;
            return this;
        }

        /* renamed from: a */
        public C17506a mo61329a(String str) {
            this.f44412a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17506a newBuilder() {
        C17506a aVar = new C17506a();
        aVar.f44412a = this.chat_id;
        aVar.f44413b = this.is_from_server;
        aVar.f44414c = this.scene;
        aVar.f44415d = this.filter;
        aVar.f44416e = this.cursor;
        aVar.f44417f = this.limit;
        aVar.f44418g = this.is_full_data;
        aVar.f44419h = this.condition;
        aVar.f44420i = this.offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatChattersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.is_from_server != null) {
            sb.append(", is_from_server=");
            sb.append(this.is_from_server);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.is_full_data != null) {
            sb.append(", is_full_data=");
            sb.append(this.is_full_data);
        }
        if (this.condition != null) {
            sb.append(", condition=");
            sb.append(this.condition);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatChattersRequest(String str, Boolean bool, Scene scene2, String str2, String str3, Integer num, Boolean bool2, Condition condition2, Integer num2) {
        this(str, bool, scene2, str2, str3, num, bool2, condition2, num2, ByteString.EMPTY);
    }

    public GetChatChattersRequest(String str, Boolean bool, Scene scene2, String str2, String str3, Integer num, Boolean bool2, Condition condition2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.is_from_server = bool;
        this.scene = scene2;
        this.filter = str2;
        this.cursor = str3;
        this.limit = num;
        this.is_full_data = bool2;
        this.condition = condition2;
        this.offset = num2;
    }
}
