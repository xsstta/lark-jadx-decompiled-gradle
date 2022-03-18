package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendMessageResponse extends Message<SendMessageResponse, C18025a> {
    public static final ProtoAdapter<SendMessageResponse> ADAPTER = new C18026b();
    public static final Long DEFAULT_NET_COST = 0L;
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final Long net_cost;
    public final Trace trace;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendMessageResponse$b */
    private static final class C18026b extends ProtoAdapter<SendMessageResponse> {
        C18026b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendMessageResponse sendMessageResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (sendMessageResponse.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendMessageResponse.message_id);
            } else {
                i = 0;
            }
            if (sendMessageResponse.net_cost != null) {
                i2 = ProtoAdapter.UINT64.encodedSizeWithTag(2, sendMessageResponse.net_cost);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (sendMessageResponse.trace != null) {
                i3 = Trace.ADAPTER.encodedSizeWithTag(3, sendMessageResponse.trace);
            }
            return i4 + i3 + sendMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendMessageResponse decode(ProtoReader protoReader) throws IOException {
            C18025a aVar = new C18025a();
            aVar.f45136a = "";
            aVar.f45137b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45136a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45137b = ProtoAdapter.UINT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45138c = Trace.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendMessageResponse sendMessageResponse) throws IOException {
            if (sendMessageResponse.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendMessageResponse.message_id);
            }
            if (sendMessageResponse.net_cost != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, sendMessageResponse.net_cost);
            }
            if (sendMessageResponse.trace != null) {
                Trace.ADAPTER.encodeWithTag(protoWriter, 3, sendMessageResponse.trace);
            }
            protoWriter.writeBytes(sendMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendMessageResponse$a */
    public static final class C18025a extends Message.Builder<SendMessageResponse, C18025a> {

        /* renamed from: a */
        public String f45136a;

        /* renamed from: b */
        public Long f45137b;

        /* renamed from: c */
        public Trace f45138c;

        /* renamed from: a */
        public SendMessageResponse build() {
            return new SendMessageResponse(this.f45136a, this.f45137b, this.f45138c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18025a newBuilder() {
        C18025a aVar = new C18025a();
        aVar.f45136a = this.message_id;
        aVar.f45137b = this.net_cost;
        aVar.f45138c = this.trace;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.net_cost != null) {
            sb.append(", net_cost=");
            sb.append(this.net_cost);
        }
        if (this.trace != null) {
            sb.append(", trace=");
            sb.append(this.trace);
        }
        StringBuilder replace = sb.replace(0, 2, "SendMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendMessageResponse(String str, Long l, Trace trace2) {
        this(str, l, trace2, ByteString.EMPTY);
    }

    public SendMessageResponse(String str, Long l, Trace trace2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.net_cost = l;
        this.trace = trace2;
    }
}
