package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AddChatChatterApply;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateAddChatChatterApplyRequest extends Message<CreateAddChatChatterApplyRequest, C17332a> {
    public static final ProtoAdapter<CreateAddChatChatterApplyRequest> ADAPTER = new C17333b();
    public static final AddChatChatterApply.Ways DEFAULT_WAY = AddChatChatterApply.Ways.UNKNOWN_WAY;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final List<String> chatter_ids;
    public final String inviter_id;
    public final String join_token;
    public final String reason;
    public final AddChatChatterApply.Ways way;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateAddChatChatterApplyRequest$b */
    private static final class C17333b extends ProtoAdapter<CreateAddChatChatterApplyRequest> {
        C17333b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateAddChatChatterApplyRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateAddChatChatterApplyRequest createAddChatChatterApplyRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createAddChatChatterApplyRequest.chat_id) + AddChatChatterApply.Ways.ADAPTER.encodedSizeWithTag(2, createAddChatChatterApplyRequest.way);
            int i3 = 0;
            if (createAddChatChatterApplyRequest.reason != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, createAddChatChatterApplyRequest.reason);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, createAddChatChatterApplyRequest.chatter_ids);
            if (createAddChatChatterApplyRequest.inviter_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, createAddChatChatterApplyRequest.inviter_id);
            } else {
                i2 = 0;
            }
            int i4 = encodedSizeWithTag2 + i2;
            if (createAddChatChatterApplyRequest.join_token != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, createAddChatChatterApplyRequest.join_token);
            }
            return i4 + i3 + createAddChatChatterApplyRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateAddChatChatterApplyRequest decode(ProtoReader protoReader) throws IOException {
            C17332a aVar = new C17332a();
            aVar.f44184a = "";
            aVar.f44185b = AddChatChatterApply.Ways.UNKNOWN_WAY;
            aVar.f44186c = "";
            aVar.f44188e = "";
            aVar.f44189f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f44184a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f44185b = AddChatChatterApply.Ways.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f44186c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f44187d.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            aVar.f44188e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f44189f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CreateAddChatChatterApplyRequest createAddChatChatterApplyRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createAddChatChatterApplyRequest.chat_id);
            AddChatChatterApply.Ways.ADAPTER.encodeWithTag(protoWriter, 2, createAddChatChatterApplyRequest.way);
            if (createAddChatChatterApplyRequest.reason != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createAddChatChatterApplyRequest.reason);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, createAddChatChatterApplyRequest.chatter_ids);
            if (createAddChatChatterApplyRequest.inviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, createAddChatChatterApplyRequest.inviter_id);
            }
            if (createAddChatChatterApplyRequest.join_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createAddChatChatterApplyRequest.join_token);
            }
            protoWriter.writeBytes(createAddChatChatterApplyRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateAddChatChatterApplyRequest$a */
    public static final class C17332a extends Message.Builder<CreateAddChatChatterApplyRequest, C17332a> {

        /* renamed from: a */
        public String f44184a;

        /* renamed from: b */
        public AddChatChatterApply.Ways f44185b;

        /* renamed from: c */
        public String f44186c;

        /* renamed from: d */
        public List<String> f44187d = Internal.newMutableList();

        /* renamed from: e */
        public String f44188e;

        /* renamed from: f */
        public String f44189f;

        /* renamed from: a */
        public CreateAddChatChatterApplyRequest build() {
            AddChatChatterApply.Ways ways;
            String str = this.f44184a;
            if (str != null && (ways = this.f44185b) != null) {
                return new CreateAddChatChatterApplyRequest(str, ways, this.f44186c, this.f44187d, this.f44188e, this.f44189f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44185b, "way");
        }

        /* renamed from: a */
        public C17332a mo60851a(AddChatChatterApply.Ways ways) {
            this.f44185b = ways;
            return this;
        }

        /* renamed from: b */
        public C17332a mo60855b(String str) {
            this.f44186c = str;
            return this;
        }

        /* renamed from: c */
        public C17332a mo60856c(String str) {
            this.f44188e = str;
            return this;
        }

        /* renamed from: d */
        public C17332a mo60857d(String str) {
            this.f44189f = str;
            return this;
        }

        /* renamed from: a */
        public C17332a mo60852a(String str) {
            this.f44184a = str;
            return this;
        }

        /* renamed from: a */
        public C17332a mo60853a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f44187d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17332a newBuilder() {
        C17332a aVar = new C17332a();
        aVar.f44184a = this.chat_id;
        aVar.f44185b = this.way;
        aVar.f44186c = this.reason;
        aVar.f44187d = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f44188e = this.inviter_id;
        aVar.f44189f = this.join_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateAddChatChatterApplyRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", way=");
        sb.append(this.way);
        if (this.reason != null) {
            sb.append(", reason=");
            sb.append(this.reason);
        }
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.inviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.inviter_id);
        }
        if (this.join_token != null) {
            sb.append(", join_token=");
            sb.append(this.join_token);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateAddChatChatterApplyRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateAddChatChatterApplyRequest(String str, AddChatChatterApply.Ways ways, String str2, List<String> list, String str3, String str4) {
        this(str, ways, str2, list, str3, str4, ByteString.EMPTY);
    }

    public CreateAddChatChatterApplyRequest(String str, AddChatChatterApply.Ways ways, String str2, List<String> list, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.way = ways;
        this.reason = str2;
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.inviter_id = str3;
        this.join_token = str4;
    }
}
