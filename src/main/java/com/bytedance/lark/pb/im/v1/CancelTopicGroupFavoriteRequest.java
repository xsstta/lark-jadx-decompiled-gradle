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

public final class CancelTopicGroupFavoriteRequest extends Message<CancelTopicGroupFavoriteRequest, C17304a> {
    public static final ProtoAdapter<CancelTopicGroupFavoriteRequest> ADAPTER = new C17305b();
    private static final long serialVersionUID = 0;
    public final String topic_group_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.CancelTopicGroupFavoriteRequest$b */
    private static final class C17305b extends ProtoAdapter<CancelTopicGroupFavoriteRequest> {
        C17305b() {
            super(FieldEncoding.LENGTH_DELIMITED, CancelTopicGroupFavoriteRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CancelTopicGroupFavoriteRequest cancelTopicGroupFavoriteRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, cancelTopicGroupFavoriteRequest.topic_group_id) + cancelTopicGroupFavoriteRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CancelTopicGroupFavoriteRequest decode(ProtoReader protoReader) throws IOException {
            C17304a aVar = new C17304a();
            aVar.f44148a = "";
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
                    aVar.f44148a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CancelTopicGroupFavoriteRequest cancelTopicGroupFavoriteRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cancelTopicGroupFavoriteRequest.topic_group_id);
            protoWriter.writeBytes(cancelTopicGroupFavoriteRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CancelTopicGroupFavoriteRequest$a */
    public static final class C17304a extends Message.Builder<CancelTopicGroupFavoriteRequest, C17304a> {

        /* renamed from: a */
        public String f44148a;

        /* renamed from: a */
        public CancelTopicGroupFavoriteRequest build() {
            String str = this.f44148a;
            if (str != null) {
                return new CancelTopicGroupFavoriteRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "topic_group_id");
        }

        /* renamed from: a */
        public C17304a mo60791a(String str) {
            this.f44148a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17304a newBuilder() {
        C17304a aVar = new C17304a();
        aVar.f44148a = this.topic_group_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CancelTopicGroupFavoriteRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", topic_group_id=");
        sb.append(this.topic_group_id);
        StringBuilder replace = sb.replace(0, 2, "CancelTopicGroupFavoriteRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CancelTopicGroupFavoriteRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public CancelTopicGroupFavoriteRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.topic_group_id = str;
    }
}
