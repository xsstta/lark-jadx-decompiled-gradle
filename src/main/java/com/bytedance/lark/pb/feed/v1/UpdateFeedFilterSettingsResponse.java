package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateFeedFilterSettingsResponse extends Message<UpdateFeedFilterSettingsResponse, C17244a> {
    public static final ProtoAdapter<UpdateFeedFilterSettingsResponse> ADAPTER = new C17245b();
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final Long version;

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsResponse$b */
    private static final class C17245b extends ProtoAdapter<UpdateFeedFilterSettingsResponse> {
        C17245b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateFeedFilterSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateFeedFilterSettingsResponse updateFeedFilterSettingsResponse) {
            int i;
            if (updateFeedFilterSettingsResponse.version != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, updateFeedFilterSettingsResponse.version);
            } else {
                i = 0;
            }
            return i + updateFeedFilterSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateFeedFilterSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C17244a aVar = new C17244a();
            aVar.f44071a = 0L;
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
                    aVar.f44071a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateFeedFilterSettingsResponse updateFeedFilterSettingsResponse) throws IOException {
            if (updateFeedFilterSettingsResponse.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateFeedFilterSettingsResponse.version);
            }
            protoWriter.writeBytes(updateFeedFilterSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsResponse$a */
    public static final class C17244a extends Message.Builder<UpdateFeedFilterSettingsResponse, C17244a> {

        /* renamed from: a */
        public Long f44071a;

        /* renamed from: a */
        public UpdateFeedFilterSettingsResponse build() {
            return new UpdateFeedFilterSettingsResponse(this.f44071a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17244a newBuilder() {
        C17244a aVar = new C17244a();
        aVar.f44071a = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "UpdateFeedFilterSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateFeedFilterSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateFeedFilterSettingsResponse(Long l) {
        this(l, ByteString.EMPTY);
    }

    public UpdateFeedFilterSettingsResponse(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = l;
    }
}
