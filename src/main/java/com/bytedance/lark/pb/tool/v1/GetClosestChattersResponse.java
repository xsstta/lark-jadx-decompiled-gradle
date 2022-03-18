package com.bytedance.lark.pb.tool.v1;

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

public final class GetClosestChattersResponse extends Message<GetClosestChattersResponse, C19705a> {
    public static final ProtoAdapter<GetClosestChattersResponse> ADAPTER = new C19706b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final List<ChatterMeta> chatters;
    public final Boolean has_more;
    public final Integer total;

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetClosestChattersResponse$b */
    private static final class C19706b extends ProtoAdapter<GetClosestChattersResponse> {
        C19706b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetClosestChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetClosestChattersResponse getClosestChattersResponse) {
            int i;
            int encodedSizeWithTag = ChatterMeta.ADAPTER.asRepeated().encodedSizeWithTag(1, getClosestChattersResponse.chatters);
            int i2 = 0;
            if (getClosestChattersResponse.total != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getClosestChattersResponse.total);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getClosestChattersResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getClosestChattersResponse.has_more);
            }
            return i3 + i2 + getClosestChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetClosestChattersResponse decode(ProtoReader protoReader) throws IOException {
            C19705a aVar = new C19705a();
            aVar.f48166b = 0;
            aVar.f48167c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48165a.add(ChatterMeta.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f48166b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48167c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetClosestChattersResponse getClosestChattersResponse) throws IOException {
            ChatterMeta.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getClosestChattersResponse.chatters);
            if (getClosestChattersResponse.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getClosestChattersResponse.total);
            }
            if (getClosestChattersResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getClosestChattersResponse.has_more);
            }
            protoWriter.writeBytes(getClosestChattersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.GetClosestChattersResponse$a */
    public static final class C19705a extends Message.Builder<GetClosestChattersResponse, C19705a> {

        /* renamed from: a */
        public List<ChatterMeta> f48165a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f48166b;

        /* renamed from: c */
        public Boolean f48167c;

        /* renamed from: a */
        public GetClosestChattersResponse build() {
            return new GetClosestChattersResponse(this.f48165a, this.f48166b, this.f48167c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19705a newBuilder() {
        C19705a aVar = new C19705a();
        aVar.f48165a = Internal.copyOf("chatters", this.chatters);
        aVar.f48166b = this.total;
        aVar.f48167c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "GetClosestChattersResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetClosestChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetClosestChattersResponse(List<ChatterMeta> list, Integer num, Boolean bool) {
        this(list, num, bool, ByteString.EMPTY);
    }

    public GetClosestChattersResponse(List<ChatterMeta> list, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatters = Internal.immutableCopyOf("chatters", list);
        this.total = num;
        this.has_more = bool;
    }
}
