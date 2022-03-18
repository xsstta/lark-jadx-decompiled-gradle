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

public final class GetMessageReadStateRequest extends Message<GetMessageReadStateRequest, C17627a> {
    public static final ProtoAdapter<GetMessageReadStateRequest> ADAPTER = new C17628b();
    public static final ListType DEFAULT_LIST_TYPE = ListType.ALL;
    public static final Boolean DEFAULT_NEED_PUSH_MSG = false;
    public static final Boolean DEFAULT_NEED_USERS = false;
    private static final long serialVersionUID = 0;
    public final ListType list_type;
    public final String message_id;
    public final Boolean need_push_msg;
    public final Boolean need_users;
    public final String query;
    public final String read_cursor;
    public final String unread_cursor;

    public enum ListType implements WireEnum {
        ALL(0),
        READ(1),
        UNREAD(2);
        
        public static final ProtoAdapter<ListType> ADAPTER = ProtoAdapter.newEnumAdapter(ListType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ListType fromValue(int i) {
            if (i == 0) {
                return ALL;
            }
            if (i == 1) {
                return READ;
            }
            if (i != 2) {
                return null;
            }
            return UNREAD;
        }

        private ListType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest$b */
    private static final class C17628b extends ProtoAdapter<GetMessageReadStateRequest> {
        C17628b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageReadStateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageReadStateRequest getMessageReadStateRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageReadStateRequest.message_id);
            int i5 = 0;
            if (getMessageReadStateRequest.need_users != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getMessageReadStateRequest.need_users);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (getMessageReadStateRequest.query != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getMessageReadStateRequest.query);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i6 + i2 + ListType.ADAPTER.encodedSizeWithTag(4, getMessageReadStateRequest.list_type);
            if (getMessageReadStateRequest.read_cursor != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, getMessageReadStateRequest.read_cursor);
            } else {
                i3 = 0;
            }
            int i7 = encodedSizeWithTag2 + i3;
            if (getMessageReadStateRequest.unread_cursor != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, getMessageReadStateRequest.unread_cursor);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getMessageReadStateRequest.need_push_msg != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, getMessageReadStateRequest.need_push_msg);
            }
            return i8 + i5 + getMessageReadStateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageReadStateRequest decode(ProtoReader protoReader) throws IOException {
            C17627a aVar = new C17627a();
            aVar.f44624a = "";
            aVar.f44625b = false;
            aVar.f44626c = "";
            aVar.f44627d = ListType.ALL;
            aVar.f44628e = "";
            aVar.f44629f = "";
            aVar.f44630g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44624a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f44625b = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            aVar.f44626c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f44627d = ListType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f44628e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44629f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f44630g = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetMessageReadStateRequest getMessageReadStateRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageReadStateRequest.message_id);
            if (getMessageReadStateRequest.need_users != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getMessageReadStateRequest.need_users);
            }
            if (getMessageReadStateRequest.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getMessageReadStateRequest.query);
            }
            ListType.ADAPTER.encodeWithTag(protoWriter, 4, getMessageReadStateRequest.list_type);
            if (getMessageReadStateRequest.read_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getMessageReadStateRequest.read_cursor);
            }
            if (getMessageReadStateRequest.unread_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getMessageReadStateRequest.unread_cursor);
            }
            if (getMessageReadStateRequest.need_push_msg != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, getMessageReadStateRequest.need_push_msg);
            }
            protoWriter.writeBytes(getMessageReadStateRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageReadStateRequest$a */
    public static final class C17627a extends Message.Builder<GetMessageReadStateRequest, C17627a> {

        /* renamed from: a */
        public String f44624a;

        /* renamed from: b */
        public Boolean f44625b;

        /* renamed from: c */
        public String f44626c;

        /* renamed from: d */
        public ListType f44627d;

        /* renamed from: e */
        public String f44628e;

        /* renamed from: f */
        public String f44629f;

        /* renamed from: g */
        public Boolean f44630g;

        /* renamed from: a */
        public GetMessageReadStateRequest build() {
            ListType listType;
            String str = this.f44624a;
            if (str != null && (listType = this.f44627d) != null) {
                return new GetMessageReadStateRequest(str, this.f44625b, this.f44626c, listType, this.f44628e, this.f44629f, this.f44630g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f44627d, "list_type");
        }

        /* renamed from: a */
        public C17627a mo61644a(ListType listType) {
            this.f44627d = listType;
            return this;
        }

        /* renamed from: b */
        public C17627a mo61648b(Boolean bool) {
            this.f44630g = bool;
            return this;
        }

        /* renamed from: c */
        public C17627a mo61650c(String str) {
            this.f44628e = str;
            return this;
        }

        /* renamed from: d */
        public C17627a mo61651d(String str) {
            this.f44629f = str;
            return this;
        }

        /* renamed from: a */
        public C17627a mo61645a(Boolean bool) {
            this.f44625b = bool;
            return this;
        }

        /* renamed from: b */
        public C17627a mo61649b(String str) {
            this.f44626c = str;
            return this;
        }

        /* renamed from: a */
        public C17627a mo61646a(String str) {
            this.f44624a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17627a newBuilder() {
        C17627a aVar = new C17627a();
        aVar.f44624a = this.message_id;
        aVar.f44625b = this.need_users;
        aVar.f44626c = this.query;
        aVar.f44627d = this.list_type;
        aVar.f44628e = this.read_cursor;
        aVar.f44629f = this.unread_cursor;
        aVar.f44630g = this.need_push_msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageReadStateRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.need_users != null) {
            sb.append(", need_users=");
            sb.append(this.need_users);
        }
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        sb.append(", list_type=");
        sb.append(this.list_type);
        if (this.read_cursor != null) {
            sb.append(", read_cursor=");
            sb.append(this.read_cursor);
        }
        if (this.unread_cursor != null) {
            sb.append(", unread_cursor=");
            sb.append(this.unread_cursor);
        }
        if (this.need_push_msg != null) {
            sb.append(", need_push_msg=");
            sb.append(this.need_push_msg);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageReadStateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageReadStateRequest(String str, Boolean bool, String str2, ListType listType, String str3, String str4, Boolean bool2) {
        this(str, bool, str2, listType, str3, str4, bool2, ByteString.EMPTY);
    }

    public GetMessageReadStateRequest(String str, Boolean bool, String str2, ListType listType, String str3, String str4, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.need_users = bool;
        this.query = str2;
        this.list_type = listType;
        this.read_cursor = str3;
        this.unread_cursor = str4;
        this.need_push_msg = bool2;
    }
}
