package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetBotsResponse extends Message<GetBotsResponse, C16186a> {
    public static final ProtoAdapter<GetBotsResponse> ADAPTER = new C16187b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<Chatter> bots;
    public final Boolean has_more;

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetBotsResponse$b */
    private static final class C16187b extends ProtoAdapter<GetBotsResponse> {
        C16187b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBotsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBotsResponse getBotsResponse) {
            int i;
            if (getBotsResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getBotsResponse.has_more);
            } else {
                i = 0;
            }
            return i + Chatter.ADAPTER.asRepeated().encodedSizeWithTag(2, getBotsResponse.bots) + getBotsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetBotsResponse decode(ProtoReader protoReader) throws IOException {
            C16186a aVar = new C16186a();
            aVar.f42344a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42344a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42345b.add(Chatter.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBotsResponse getBotsResponse) throws IOException {
            if (getBotsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getBotsResponse.has_more);
            }
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getBotsResponse.bots);
            protoWriter.writeBytes(getBotsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.GetBotsResponse$a */
    public static final class C16186a extends Message.Builder<GetBotsResponse, C16186a> {

        /* renamed from: a */
        public Boolean f42344a;

        /* renamed from: b */
        public List<Chatter> f42345b = Internal.newMutableList();

        /* renamed from: a */
        public GetBotsResponse build() {
            return new GetBotsResponse(this.f42344a, this.f42345b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16186a newBuilder() {
        C16186a aVar = new C16186a();
        aVar.f42344a = this.has_more;
        aVar.f42345b = Internal.copyOf("bots", this.bots);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetBotsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (!this.bots.isEmpty()) {
            sb.append(", bots=");
            sb.append(this.bots);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBotsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetBotsResponse(Boolean bool, List<Chatter> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public GetBotsResponse(Boolean bool, List<Chatter> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.has_more = bool;
        this.bots = Internal.immutableCopyOf("bots", list);
    }
}
