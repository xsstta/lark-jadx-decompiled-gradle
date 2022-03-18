package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class PreloadServerEventsRequest extends Message<PreloadServerEventsRequest, C15908a> {
    public static final ProtoAdapter<PreloadServerEventsRequest> ADAPTER = new C15909b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> refid_calendar_map;
    public final List<String> ser_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PreloadServerEventsRequest$a */
    public static final class C15908a extends Message.Builder<PreloadServerEventsRequest, C15908a> {

        /* renamed from: a */
        public List<String> f41867a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, String> f41868b = Internal.newMutableMap();

        /* renamed from: a */
        public PreloadServerEventsRequest build() {
            return new PreloadServerEventsRequest(this.f41867a, this.f41868b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15908a mo57354a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41867a = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PreloadServerEventsRequest$b */
    private static final class C15909b extends ProtoAdapter<PreloadServerEventsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f41869a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15909b() {
            super(FieldEncoding.LENGTH_DELIMITED, PreloadServerEventsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PreloadServerEventsRequest preloadServerEventsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, preloadServerEventsRequest.ser_ids) + this.f41869a.encodedSizeWithTag(2, preloadServerEventsRequest.refid_calendar_map) + preloadServerEventsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PreloadServerEventsRequest decode(ProtoReader protoReader) throws IOException {
            C15908a aVar = new C15908a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41867a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41868b.putAll(this.f41869a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PreloadServerEventsRequest preloadServerEventsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, preloadServerEventsRequest.ser_ids);
            this.f41869a.encodeWithTag(protoWriter, 2, preloadServerEventsRequest.refid_calendar_map);
            protoWriter.writeBytes(preloadServerEventsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15908a newBuilder() {
        C15908a aVar = new C15908a();
        aVar.f41867a = Internal.copyOf("ser_ids", this.ser_ids);
        aVar.f41868b = Internal.copyOf("refid_calendar_map", this.refid_calendar_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PreloadServerEventsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ser_ids.isEmpty()) {
            sb.append(", ser_ids=");
            sb.append(this.ser_ids);
        }
        if (!this.refid_calendar_map.isEmpty()) {
            sb.append(", refid_calendar_map=");
            sb.append(this.refid_calendar_map);
        }
        StringBuilder replace = sb.replace(0, 2, "PreloadServerEventsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PreloadServerEventsRequest(List<String> list, Map<String, String> map) {
        this(list, map, ByteString.EMPTY);
    }

    public PreloadServerEventsRequest(List<String> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ser_ids = Internal.immutableCopyOf("ser_ids", list);
        this.refid_calendar_map = Internal.immutableCopyOf("refid_calendar_map", map);
    }
}
