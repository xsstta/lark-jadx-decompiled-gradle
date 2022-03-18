package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DisplayTransferChatScrollCheckResponse extends Message<DisplayTransferChatScrollCheckResponse, C15600a> {
    public static final ProtoAdapter<DisplayTransferChatScrollCheckResponse> ADAPTER = new C15601b();
    public static final Boolean DEFAULT_SHOULD_SHOW_SCROLL = false;
    private static final long serialVersionUID = 0;
    public final Boolean should_show_scroll;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DisplayTransferChatScrollCheckResponse$b */
    private static final class C15601b extends ProtoAdapter<DisplayTransferChatScrollCheckResponse> {
        C15601b() {
            super(FieldEncoding.LENGTH_DELIMITED, DisplayTransferChatScrollCheckResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DisplayTransferChatScrollCheckResponse displayTransferChatScrollCheckResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, displayTransferChatScrollCheckResponse.should_show_scroll) + displayTransferChatScrollCheckResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DisplayTransferChatScrollCheckResponse decode(ProtoReader protoReader) throws IOException {
            C15600a aVar = new C15600a();
            aVar.f41330a = false;
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
                    aVar.f41330a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DisplayTransferChatScrollCheckResponse displayTransferChatScrollCheckResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, displayTransferChatScrollCheckResponse.should_show_scroll);
            protoWriter.writeBytes(displayTransferChatScrollCheckResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DisplayTransferChatScrollCheckResponse$a */
    public static final class C15600a extends Message.Builder<DisplayTransferChatScrollCheckResponse, C15600a> {

        /* renamed from: a */
        public Boolean f41330a;

        /* renamed from: a */
        public DisplayTransferChatScrollCheckResponse build() {
            Boolean bool = this.f41330a;
            if (bool != null) {
                return new DisplayTransferChatScrollCheckResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "should_show_scroll");
        }
    }

    @Override // com.squareup.wire.Message
    public C15600a newBuilder() {
        C15600a aVar = new C15600a();
        aVar.f41330a = this.should_show_scroll;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DisplayTransferChatScrollCheckResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", should_show_scroll=");
        sb.append(this.should_show_scroll);
        StringBuilder replace = sb.replace(0, 2, "DisplayTransferChatScrollCheckResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DisplayTransferChatScrollCheckResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public DisplayTransferChatScrollCheckResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.should_show_scroll = bool;
    }
}
