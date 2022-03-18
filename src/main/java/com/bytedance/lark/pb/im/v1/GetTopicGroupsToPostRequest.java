package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTopicGroupsToPostRequest extends Message<GetTopicGroupsToPostRequest, C17721a> {
    public static final ProtoAdapter<GetTopicGroupsToPostRequest> ADAPTER = new C17722b();
    public static final Integer DEFAULT_COUNT = 20;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostRequest$b */
    private static final class C17722b extends ProtoAdapter<GetTopicGroupsToPostRequest> {
        C17722b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTopicGroupsToPostRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTopicGroupsToPostRequest getTopicGroupsToPostRequest) {
            int i;
            int i2 = 0;
            if (getTopicGroupsToPostRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getTopicGroupsToPostRequest.count);
            } else {
                i = 0;
            }
            if (getTopicGroupsToPostRequest.cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getTopicGroupsToPostRequest.cursor);
            }
            return i + i2 + getTopicGroupsToPostRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTopicGroupsToPostRequest decode(ProtoReader protoReader) throws IOException {
            C17721a aVar = new C17721a();
            aVar.f44753a = 20;
            aVar.f44754b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44753a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44754b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTopicGroupsToPostRequest getTopicGroupsToPostRequest) throws IOException {
            if (getTopicGroupsToPostRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getTopicGroupsToPostRequest.count);
            }
            if (getTopicGroupsToPostRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getTopicGroupsToPostRequest.cursor);
            }
            protoWriter.writeBytes(getTopicGroupsToPostRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsToPostRequest$a */
    public static final class C17721a extends Message.Builder<GetTopicGroupsToPostRequest, C17721a> {

        /* renamed from: a */
        public Integer f44753a;

        /* renamed from: b */
        public String f44754b;

        /* renamed from: a */
        public GetTopicGroupsToPostRequest build() {
            return new GetTopicGroupsToPostRequest(this.f44753a, this.f44754b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17721a mo61877a(Integer num) {
            this.f44753a = num;
            return this;
        }

        /* renamed from: a */
        public C17721a mo61878a(String str) {
            this.f44754b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17721a newBuilder() {
        C17721a aVar = new C17721a();
        aVar.f44753a = this.count;
        aVar.f44754b = this.cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTopicGroupsToPostRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTopicGroupsToPostRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTopicGroupsToPostRequest(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public GetTopicGroupsToPostRequest(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
        this.cursor = str;
    }
}
