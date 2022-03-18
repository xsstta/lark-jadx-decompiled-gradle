package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetChattersByCalendarIdsResponse extends Message<GetChattersByCalendarIdsResponse, C15686a> {
    public static final ProtoAdapter<GetChattersByCalendarIdsResponse> ADAPTER = new C15687b();
    private static final long serialVersionUID = 0;
    public final Map<String, Chatter> chatters;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChattersByCalendarIdsResponse$a */
    public static final class C15686a extends Message.Builder<GetChattersByCalendarIdsResponse, C15686a> {

        /* renamed from: a */
        public Map<String, Chatter> f41447a = Internal.newMutableMap();

        /* renamed from: a */
        public GetChattersByCalendarIdsResponse build() {
            return new GetChattersByCalendarIdsResponse(this.f41447a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChattersByCalendarIdsResponse$b */
    private static final class C15687b extends ProtoAdapter<GetChattersByCalendarIdsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Chatter>> f41448a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        C15687b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChattersByCalendarIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChattersByCalendarIdsResponse getChattersByCalendarIdsResponse) {
            return this.f41448a.encodedSizeWithTag(1, getChattersByCalendarIdsResponse.chatters) + getChattersByCalendarIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChattersByCalendarIdsResponse decode(ProtoReader protoReader) throws IOException {
            C15686a aVar = new C15686a();
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
                    aVar.f41447a.putAll(this.f41448a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChattersByCalendarIdsResponse getChattersByCalendarIdsResponse) throws IOException {
            this.f41448a.encodeWithTag(protoWriter, 1, getChattersByCalendarIdsResponse.chatters);
            protoWriter.writeBytes(getChattersByCalendarIdsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15686a newBuilder() {
        C15686a aVar = new C15686a();
        aVar.f41447a = Internal.copyOf("chatters", this.chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetChattersByCalendarIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChattersByCalendarIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChattersByCalendarIdsResponse(Map<String, Chatter> map) {
        this(map, ByteString.EMPTY);
    }

    public GetChattersByCalendarIdsResponse(Map<String, Chatter> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatters = Internal.immutableCopyOf("chatters", map);
    }
}
