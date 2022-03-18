package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetBlockUserListRequest extends Message<GetBlockUserListRequest, C16440a> {
    public static final ProtoAdapter<GetBlockUserListRequest> ADAPTER = new C16441b();
    private static final long serialVersionUID = 0;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserListRequest$b */
    private static final class C16441b extends ProtoAdapter<GetBlockUserListRequest> {
        C16441b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBlockUserListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBlockUserListRequest getBlockUserListRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getBlockUserListRequest.cursor) + getBlockUserListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBlockUserListRequest decode(ProtoReader protoReader) throws IOException {
            C16440a aVar = new C16440a();
            aVar.f42740a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42740a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBlockUserListRequest getBlockUserListRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getBlockUserListRequest.cursor);
            protoWriter.writeBytes(getBlockUserListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetBlockUserListRequest$a */
    public static final class C16440a extends Message.Builder<GetBlockUserListRequest, C16440a> {

        /* renamed from: a */
        public String f42740a;

        /* renamed from: a */
        public GetBlockUserListRequest build() {
            String str = this.f42740a;
            if (str != null) {
                return new GetBlockUserListRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "cursor");
        }

        /* renamed from: a */
        public C16440a mo58657a(String str) {
            this.f42740a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16440a newBuilder() {
        C16440a aVar = new C16440a();
        aVar.f42740a = this.cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetBlockUserListRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", cursor=");
        sb.append(this.cursor);
        StringBuilder replace = sb.replace(0, 2, "GetBlockUserListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBlockUserListRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetBlockUserListRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = str;
    }
}
