package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class QuickSearchCalendarEventRequest extends Message<QuickSearchCalendarEventRequest, C15968a> {
    public static final ProtoAdapter<QuickSearchCalendarEventRequest> ADAPTER = new C15969b();
    private static final long serialVersionUID = 0;
    public final String query;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.QuickSearchCalendarEventRequest$b */
    private static final class C15969b extends ProtoAdapter<QuickSearchCalendarEventRequest> {
        C15969b() {
            super(FieldEncoding.LENGTH_DELIMITED, QuickSearchCalendarEventRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(QuickSearchCalendarEventRequest quickSearchCalendarEventRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, quickSearchCalendarEventRequest.query) + quickSearchCalendarEventRequest.unknownFields().size();
        }

        /* renamed from: a */
        public QuickSearchCalendarEventRequest decode(ProtoReader protoReader) throws IOException {
            C15968a aVar = new C15968a();
            aVar.f41970a = "";
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
                    aVar.f41970a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QuickSearchCalendarEventRequest quickSearchCalendarEventRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quickSearchCalendarEventRequest.query);
            protoWriter.writeBytes(quickSearchCalendarEventRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.QuickSearchCalendarEventRequest$a */
    public static final class C15968a extends Message.Builder<QuickSearchCalendarEventRequest, C15968a> {

        /* renamed from: a */
        public String f41970a;

        /* renamed from: a */
        public QuickSearchCalendarEventRequest build() {
            String str = this.f41970a;
            if (str != null) {
                return new QuickSearchCalendarEventRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY);
        }

        /* renamed from: a */
        public C15968a mo57502a(String str) {
            this.f41970a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15968a newBuilder() {
        C15968a aVar = new C15968a();
        aVar.f41970a = this.query;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "QuickSearchCalendarEventRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        StringBuilder replace = sb.replace(0, 2, "QuickSearchCalendarEventRequest{");
        replace.append('}');
        return replace.toString();
    }

    public QuickSearchCalendarEventRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public QuickSearchCalendarEventRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
    }
}
