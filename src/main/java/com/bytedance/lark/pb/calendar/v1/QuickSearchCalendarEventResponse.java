package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class QuickSearchCalendarEventResponse extends Message<QuickSearchCalendarEventResponse, C15970a> {
    public static final ProtoAdapter<QuickSearchCalendarEventResponse> ADAPTER = new C15971b();
    private static final long serialVersionUID = 0;
    public final SearchCalendarEventResult result;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.QuickSearchCalendarEventResponse$b */
    private static final class C15971b extends ProtoAdapter<QuickSearchCalendarEventResponse> {
        C15971b() {
            super(FieldEncoding.LENGTH_DELIMITED, QuickSearchCalendarEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(QuickSearchCalendarEventResponse quickSearchCalendarEventResponse) {
            int i;
            if (quickSearchCalendarEventResponse.result != null) {
                i = SearchCalendarEventResult.ADAPTER.encodedSizeWithTag(1, quickSearchCalendarEventResponse.result);
            } else {
                i = 0;
            }
            return i + quickSearchCalendarEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public QuickSearchCalendarEventResponse decode(ProtoReader protoReader) throws IOException {
            C15970a aVar = new C15970a();
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
                    aVar.f41971a = SearchCalendarEventResult.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QuickSearchCalendarEventResponse quickSearchCalendarEventResponse) throws IOException {
            if (quickSearchCalendarEventResponse.result != null) {
                SearchCalendarEventResult.ADAPTER.encodeWithTag(protoWriter, 1, quickSearchCalendarEventResponse.result);
            }
            protoWriter.writeBytes(quickSearchCalendarEventResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.QuickSearchCalendarEventResponse$a */
    public static final class C15970a extends Message.Builder<QuickSearchCalendarEventResponse, C15970a> {

        /* renamed from: a */
        public SearchCalendarEventResult f41971a;

        /* renamed from: a */
        public QuickSearchCalendarEventResponse build() {
            return new QuickSearchCalendarEventResponse(this.f41971a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15970a newBuilder() {
        C15970a aVar = new C15970a();
        aVar.f41971a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "QuickSearchCalendarEventResponse");
        StringBuilder sb = new StringBuilder();
        if (this.result != null) {
            sb.append(", result=");
            sb.append(this.result);
        }
        StringBuilder replace = sb.replace(0, 2, "QuickSearchCalendarEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public QuickSearchCalendarEventResponse(SearchCalendarEventResult searchCalendarEventResult) {
        this(searchCalendarEventResult, ByteString.EMPTY);
    }

    public QuickSearchCalendarEventResponse(SearchCalendarEventResult searchCalendarEventResult, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = searchCalendarEventResult;
    }
}
