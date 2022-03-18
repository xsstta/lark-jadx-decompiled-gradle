package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AddChatChatterApply;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetAddChatChatterApplyResponse extends Message<GetAddChatChatterApplyResponse, C17464a> {
    public static final ProtoAdapter<GetAddChatChatterApplyResponse> ADAPTER = new C17465b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<AddChatChatterApply> applies;
    public final C14928Entity entity;
    public final Boolean has_more;
    public final String next_cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAddChatChatterApplyResponse$b */
    private static final class C17465b extends ProtoAdapter<GetAddChatChatterApplyResponse> {
        C17465b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAddChatChatterApplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAddChatChatterApplyResponse getAddChatChatterApplyResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = AddChatChatterApply.ADAPTER.asRepeated().encodedSizeWithTag(1, getAddChatChatterApplyResponse.applies);
            int i3 = 0;
            if (getAddChatChatterApplyResponse.next_cursor != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getAddChatChatterApplyResponse.next_cursor);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getAddChatChatterApplyResponse.entity != null) {
                i2 = C14928Entity.ADAPTER.encodedSizeWithTag(3, getAddChatChatterApplyResponse.entity);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getAddChatChatterApplyResponse.has_more != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getAddChatChatterApplyResponse.has_more);
            }
            return i5 + i3 + getAddChatChatterApplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAddChatChatterApplyResponse decode(ProtoReader protoReader) throws IOException {
            C17464a aVar = new C17464a();
            aVar.f44356b = "";
            aVar.f44358d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44355a.add(AddChatChatterApply.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44356b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f44357c = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44358d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAddChatChatterApplyResponse getAddChatChatterApplyResponse) throws IOException {
            AddChatChatterApply.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAddChatChatterApplyResponse.applies);
            if (getAddChatChatterApplyResponse.next_cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getAddChatChatterApplyResponse.next_cursor);
            }
            if (getAddChatChatterApplyResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 3, getAddChatChatterApplyResponse.entity);
            }
            if (getAddChatChatterApplyResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getAddChatChatterApplyResponse.has_more);
            }
            protoWriter.writeBytes(getAddChatChatterApplyResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAddChatChatterApplyResponse$a */
    public static final class C17464a extends Message.Builder<GetAddChatChatterApplyResponse, C17464a> {

        /* renamed from: a */
        public List<AddChatChatterApply> f44355a = Internal.newMutableList();

        /* renamed from: b */
        public String f44356b;

        /* renamed from: c */
        public C14928Entity f44357c;

        /* renamed from: d */
        public Boolean f44358d;

        /* renamed from: a */
        public GetAddChatChatterApplyResponse build() {
            return new GetAddChatChatterApplyResponse(this.f44355a, this.f44356b, this.f44357c, this.f44358d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17464a newBuilder() {
        C17464a aVar = new C17464a();
        aVar.f44355a = Internal.copyOf("applies", this.applies);
        aVar.f44356b = this.next_cursor;
        aVar.f44357c = this.entity;
        aVar.f44358d = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAddChatChatterApplyResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.applies.isEmpty()) {
            sb.append(", applies=");
            sb.append(this.applies);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAddChatChatterApplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAddChatChatterApplyResponse(List<AddChatChatterApply> list, String str, C14928Entity entity2, Boolean bool) {
        this(list, str, entity2, bool, ByteString.EMPTY);
    }

    public GetAddChatChatterApplyResponse(List<AddChatChatterApply> list, String str, C14928Entity entity2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.applies = Internal.immutableCopyOf("applies", list);
        this.next_cursor = str;
        this.entity = entity2;
        this.has_more = bool;
    }
}
