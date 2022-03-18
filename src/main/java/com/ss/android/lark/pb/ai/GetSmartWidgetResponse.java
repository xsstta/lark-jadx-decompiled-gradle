package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetSmartWidgetResponse extends Message<GetSmartWidgetResponse, C49481a> {
    public static final ProtoAdapter<GetSmartWidgetResponse> ADAPTER = new C49482b();
    private static final long serialVersionUID = 0;
    public final List<Action> mactions;
    public final List<Event> mevents;

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartWidgetResponse$b */
    private static final class C49482b extends ProtoAdapter<GetSmartWidgetResponse> {
        C49482b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartWidgetResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartWidgetResponse getSmartWidgetResponse) {
            return Event.ADAPTER.asRepeated().encodedSizeWithTag(1, getSmartWidgetResponse.mevents) + Action.ADAPTER.asRepeated().encodedSizeWithTag(2, getSmartWidgetResponse.mactions) + getSmartWidgetResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartWidgetResponse decode(ProtoReader protoReader) throws IOException {
            C49481a aVar = new C49481a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124076a.add(Event.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124077b.add(Action.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSmartWidgetResponse getSmartWidgetResponse) throws IOException {
            Event.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSmartWidgetResponse.mevents);
            Action.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getSmartWidgetResponse.mactions);
            protoWriter.writeBytes(getSmartWidgetResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetSmartWidgetResponse$a */
    public static final class C49481a extends Message.Builder<GetSmartWidgetResponse, C49481a> {

        /* renamed from: a */
        public List<Event> f124076a = Internal.newMutableList();

        /* renamed from: b */
        public List<Action> f124077b = Internal.newMutableList();

        /* renamed from: a */
        public GetSmartWidgetResponse build() {
            return new GetSmartWidgetResponse(this.f124076a, this.f124077b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49481a newBuilder() {
        C49481a aVar = new C49481a();
        aVar.f124076a = Internal.copyOf("mevents", this.mevents);
        aVar.f124077b = Internal.copyOf("mactions", this.mactions);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mevents.isEmpty()) {
            sb.append(", events=");
            sb.append(this.mevents);
        }
        if (!this.mactions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.mactions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartWidgetResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartWidgetResponse(List<Event> list, List<Action> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public GetSmartWidgetResponse(List<Event> list, List<Action> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mevents = Internal.immutableCopyOf("mevents", list);
        this.mactions = Internal.immutableCopyOf("mactions", list2);
    }
}
