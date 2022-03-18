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

public final class GetTopicGroupTabBadgeResponse extends Message<GetTopicGroupTabBadgeResponse, C17715a> {
    public static final ProtoAdapter<GetTopicGroupTabBadgeResponse> ADAPTER = new C17716b();
    public static final Boolean DEFAULT_HAS_NEW_CONTENT = false;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean has_new_content;
    public final Long update_time;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupTabBadgeResponse$b */
    private static final class C17716b extends ProtoAdapter<GetTopicGroupTabBadgeResponse> {
        C17716b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTopicGroupTabBadgeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTopicGroupTabBadgeResponse getTopicGroupTabBadgeResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getTopicGroupTabBadgeResponse.has_new_content) + ProtoAdapter.INT64.encodedSizeWithTag(2, getTopicGroupTabBadgeResponse.update_time) + getTopicGroupTabBadgeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTopicGroupTabBadgeResponse decode(ProtoReader protoReader) throws IOException {
            C17715a aVar = new C17715a();
            aVar.f44744a = false;
            aVar.f44745b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44744a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44745b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTopicGroupTabBadgeResponse getTopicGroupTabBadgeResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getTopicGroupTabBadgeResponse.has_new_content);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getTopicGroupTabBadgeResponse.update_time);
            protoWriter.writeBytes(getTopicGroupTabBadgeResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17715a newBuilder() {
        C17715a aVar = new C17715a();
        aVar.f44744a = this.has_new_content;
        aVar.f44745b = this.update_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupTabBadgeResponse$a */
    public static final class C17715a extends Message.Builder<GetTopicGroupTabBadgeResponse, C17715a> {

        /* renamed from: a */
        public Boolean f44744a;

        /* renamed from: b */
        public Long f44745b;

        /* renamed from: a */
        public GetTopicGroupTabBadgeResponse build() {
            Long l;
            Boolean bool = this.f44744a;
            if (bool != null && (l = this.f44745b) != null) {
                return new GetTopicGroupTabBadgeResponse(bool, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_new_content", this.f44745b, "update_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTopicGroupTabBadgeResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", has_new_content=");
        sb.append(this.has_new_content);
        sb.append(", update_time=");
        sb.append(this.update_time);
        StringBuilder replace = sb.replace(0, 2, "GetTopicGroupTabBadgeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTopicGroupTabBadgeResponse(Boolean bool, Long l) {
        this(bool, l, ByteString.EMPTY);
    }

    public GetTopicGroupTabBadgeResponse(Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_new_content = bool;
        this.update_time = l;
    }
}
