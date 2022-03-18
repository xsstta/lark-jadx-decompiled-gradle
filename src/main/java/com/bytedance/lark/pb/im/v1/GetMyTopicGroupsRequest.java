package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMyTopicGroupsRequest extends Message<GetMyTopicGroupsRequest, C17649a> {
    public static final ProtoAdapter<GetMyTopicGroupsRequest> ADAPTER = new C17650b();
    public static final Integer DEFAULT_COUNT = 20;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final String cursor;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsRequest$b */
    private static final class C17650b extends ProtoAdapter<GetMyTopicGroupsRequest> {
        C17650b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMyTopicGroupsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMyTopicGroupsRequest getMyTopicGroupsRequest) {
            int i;
            int i2 = 0;
            if (getMyTopicGroupsRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getMyTopicGroupsRequest.count);
            } else {
                i = 0;
            }
            if (getMyTopicGroupsRequest.cursor != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getMyTopicGroupsRequest.cursor);
            }
            return i + i2 + getMyTopicGroupsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMyTopicGroupsRequest decode(ProtoReader protoReader) throws IOException {
            C17649a aVar = new C17649a();
            aVar.f44659a = 20;
            aVar.f44660b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44659a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44660b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMyTopicGroupsRequest getMyTopicGroupsRequest) throws IOException {
            if (getMyTopicGroupsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getMyTopicGroupsRequest.count);
            }
            if (getMyTopicGroupsRequest.cursor != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getMyTopicGroupsRequest.cursor);
            }
            protoWriter.writeBytes(getMyTopicGroupsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMyTopicGroupsRequest$a */
    public static final class C17649a extends Message.Builder<GetMyTopicGroupsRequest, C17649a> {

        /* renamed from: a */
        public Integer f44659a;

        /* renamed from: b */
        public String f44660b;

        /* renamed from: a */
        public GetMyTopicGroupsRequest build() {
            return new GetMyTopicGroupsRequest(this.f44659a, this.f44660b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17649a newBuilder() {
        C17649a aVar = new C17649a();
        aVar.f44659a = this.count;
        aVar.f44660b = this.cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMyTopicGroupsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMyTopicGroupsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMyTopicGroupsRequest(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public GetMyTopicGroupsRequest(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
        this.cursor = str;
    }
}
