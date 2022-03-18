package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ComputeDoneCardsResponse extends Message<ComputeDoneCardsResponse, C17102a> {
    public static final ProtoAdapter<ComputeDoneCardsResponse> ADAPTER = new C17103b();
    public static final Boolean DEFAULT_HAS_UNREAD_DOT = false;
    public static final Integer DEFAULT_UNREAD_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Boolean has_unread_dot;
    public final Integer unread_count;

    /* renamed from: com.bytedance.lark.pb.feed.v1.ComputeDoneCardsResponse$b */
    private static final class C17103b extends ProtoAdapter<ComputeDoneCardsResponse> {
        C17103b() {
            super(FieldEncoding.LENGTH_DELIMITED, ComputeDoneCardsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ComputeDoneCardsResponse computeDoneCardsResponse) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, computeDoneCardsResponse.unread_count) + ProtoAdapter.BOOL.encodedSizeWithTag(2, computeDoneCardsResponse.has_unread_dot) + computeDoneCardsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ComputeDoneCardsResponse decode(ProtoReader protoReader) throws IOException {
            C17102a aVar = new C17102a();
            aVar.f43835a = 0;
            aVar.f43836b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43835a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43836b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ComputeDoneCardsResponse computeDoneCardsResponse) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, computeDoneCardsResponse.unread_count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, computeDoneCardsResponse.has_unread_dot);
            protoWriter.writeBytes(computeDoneCardsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17102a newBuilder() {
        C17102a aVar = new C17102a();
        aVar.f43835a = this.unread_count;
        aVar.f43836b = this.has_unread_dot;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.ComputeDoneCardsResponse$a */
    public static final class C17102a extends Message.Builder<ComputeDoneCardsResponse, C17102a> {

        /* renamed from: a */
        public Integer f43835a;

        /* renamed from: b */
        public Boolean f43836b;

        /* renamed from: a */
        public ComputeDoneCardsResponse build() {
            Boolean bool;
            Integer num = this.f43835a;
            if (num != null && (bool = this.f43836b) != null) {
                return new ComputeDoneCardsResponse(num, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(num, "unread_count", this.f43836b, "has_unread_dot");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "ComputeDoneCardsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", unread_count=");
        sb.append(this.unread_count);
        sb.append(", has_unread_dot=");
        sb.append(this.has_unread_dot);
        StringBuilder replace = sb.replace(0, 2, "ComputeDoneCardsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ComputeDoneCardsResponse(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public ComputeDoneCardsResponse(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unread_count = num;
        this.has_unread_dot = bool;
    }
}
