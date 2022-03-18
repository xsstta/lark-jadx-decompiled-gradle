package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetHomeSchoolChatClassRequest extends Message<GetHomeSchoolChatClassRequest, C17589a> {
    public static final ProtoAdapter<GetHomeSchoolChatClassRequest> ADAPTER = new C17590b();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Integer offset;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHomeSchoolChatClassRequest$b */
    private static final class C17590b extends ProtoAdapter<GetHomeSchoolChatClassRequest> {
        C17590b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetHomeSchoolChatClassRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetHomeSchoolChatClassRequest getHomeSchoolChatClassRequest) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getHomeSchoolChatClassRequest.count) + ProtoAdapter.INT32.encodedSizeWithTag(2, getHomeSchoolChatClassRequest.offset) + getHomeSchoolChatClassRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetHomeSchoolChatClassRequest decode(ProtoReader protoReader) throws IOException {
            C17589a aVar = new C17589a();
            aVar.f44560a = 0;
            aVar.f44561b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44560a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44561b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetHomeSchoolChatClassRequest getHomeSchoolChatClassRequest) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getHomeSchoolChatClassRequest.count);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getHomeSchoolChatClassRequest.offset);
            protoWriter.writeBytes(getHomeSchoolChatClassRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17589a newBuilder() {
        C17589a aVar = new C17589a();
        aVar.f44560a = this.count;
        aVar.f44561b = this.offset;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetHomeSchoolChatClassRequest$a */
    public static final class C17589a extends Message.Builder<GetHomeSchoolChatClassRequest, C17589a> {

        /* renamed from: a */
        public Integer f44560a;

        /* renamed from: b */
        public Integer f44561b;

        /* renamed from: a */
        public GetHomeSchoolChatClassRequest build() {
            Integer num;
            Integer num2 = this.f44560a;
            if (num2 != null && (num = this.f44561b) != null) {
                return new GetHomeSchoolChatClassRequest(num2, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num2, "count", this.f44561b, "offset");
        }

        /* renamed from: a */
        public C17589a mo61544a(Integer num) {
            this.f44560a = num;
            return this;
        }

        /* renamed from: b */
        public C17589a mo61546b(Integer num) {
            this.f44561b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetHomeSchoolChatClassRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", offset=");
        sb.append(this.offset);
        StringBuilder replace = sb.replace(0, 2, "GetHomeSchoolChatClassRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetHomeSchoolChatClassRequest(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public GetHomeSchoolChatClassRequest(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
        this.offset = num2;
    }
}
