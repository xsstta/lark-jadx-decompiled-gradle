package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetBlockUserListResponse extends Message<GetBlockUserListResponse, C16442a> {
    public static final ProtoAdapter<GetBlockUserListResponse> ADAPTER = new C16443b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final String cursor;
    public final Boolean has_more;
    public final List<BlockUser> user_infos;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserListResponse$b */
    private static final class C16443b extends ProtoAdapter<GetBlockUserListResponse> {
        C16443b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockUserListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockUserListResponse getBlockUserListResponse) {
            return BlockUser.ADAPTER.asRepeated().encodedSizeWithTag(1, getBlockUserListResponse.user_infos) + ProtoAdapter.STRING.encodedSizeWithTag(2, getBlockUserListResponse.cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getBlockUserListResponse.has_more) + getBlockUserListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockUserListResponse decode(ProtoReader protoReader) throws IOException {
            C16442a aVar = new C16442a();
            aVar.f42742b = "";
            aVar.f42743c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42741a.add(BlockUser.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f42742b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42743c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockUserListResponse getBlockUserListResponse) throws IOException {
            BlockUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBlockUserListResponse.user_infos);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getBlockUserListResponse.cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getBlockUserListResponse.has_more);
            protoWriter.writeBytes(getBlockUserListResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16442a newBuilder() {
        C16442a aVar = new C16442a();
        aVar.f42741a = Internal.copyOf("user_infos", this.user_infos);
        aVar.f42742b = this.cursor;
        aVar.f42743c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserListResponse$a */
    public static final class C16442a extends Message.Builder<GetBlockUserListResponse, C16442a> {

        /* renamed from: a */
        public List<BlockUser> f42741a = Internal.newMutableList();

        /* renamed from: b */
        public String f42742b;

        /* renamed from: c */
        public Boolean f42743c;

        /* renamed from: a */
        public GetBlockUserListResponse build() {
            Boolean bool;
            String str = this.f42742b;
            if (str != null && (bool = this.f42743c) != null) {
                return new GetBlockUserListResponse(this.f42741a, str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cursor", this.f42743c, "has_more");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetBlockUserListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.user_infos.isEmpty()) {
            sb.append(", user_infos=");
            sb.append(this.user_infos);
        }
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", has_more=");
        sb.append(this.has_more);
        StringBuilder replace = sb.replace(0, 2, "GetBlockUserListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockUserListResponse(List<BlockUser> list, String str, Boolean bool) {
        this(list, str, bool, ByteString.EMPTY);
    }

    public GetBlockUserListResponse(List<BlockUser> list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_infos = Internal.immutableCopyOf("user_infos", list);
        this.cursor = str;
        this.has_more = bool;
    }
}
