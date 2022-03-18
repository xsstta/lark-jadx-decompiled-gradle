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
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class MultiCalendarSearchResponse extends Message<MultiCalendarSearchResponse, C15884a> {
    public static final ProtoAdapter<MultiCalendarSearchResponse> ADAPTER = new C15885b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> calendar_chatter_map;
    public final Map<String, Chatter> chatter_map;
    public final List<MultiCalendarSearchContent> contents;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchResponse$a */
    public static final class C15884a extends Message.Builder<MultiCalendarSearchResponse, C15884a> {

        /* renamed from: a */
        public List<MultiCalendarSearchContent> f41748a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, String> f41749b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, Chatter> f41750c = Internal.newMutableMap();

        /* renamed from: a */
        public MultiCalendarSearchResponse build() {
            return new MultiCalendarSearchResponse(this.f41748a, this.f41749b, this.f41750c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchResponse$b */
    private static final class C15885b extends ProtoAdapter<MultiCalendarSearchResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f41751a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Chatter>> f41752b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Chatter.ADAPTER);

        C15885b() {
            super(FieldEncoding.LENGTH_DELIMITED, MultiCalendarSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MultiCalendarSearchResponse multiCalendarSearchResponse) {
            return MultiCalendarSearchContent.ADAPTER.asRepeated().encodedSizeWithTag(1, multiCalendarSearchResponse.contents) + this.f41751a.encodedSizeWithTag(2, multiCalendarSearchResponse.calendar_chatter_map) + this.f41752b.encodedSizeWithTag(3, multiCalendarSearchResponse.chatter_map) + multiCalendarSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MultiCalendarSearchResponse decode(ProtoReader protoReader) throws IOException {
            C15884a aVar = new C15884a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41748a.add(MultiCalendarSearchContent.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41749b.putAll(this.f41751a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41750c.putAll(this.f41752b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MultiCalendarSearchResponse multiCalendarSearchResponse) throws IOException {
            MultiCalendarSearchContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, multiCalendarSearchResponse.contents);
            this.f41751a.encodeWithTag(protoWriter, 2, multiCalendarSearchResponse.calendar_chatter_map);
            this.f41752b.encodeWithTag(protoWriter, 3, multiCalendarSearchResponse.chatter_map);
            protoWriter.writeBytes(multiCalendarSearchResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15884a newBuilder() {
        C15884a aVar = new C15884a();
        aVar.f41748a = Internal.copyOf("contents", this.contents);
        aVar.f41749b = Internal.copyOf("calendar_chatter_map", this.calendar_chatter_map);
        aVar.f41750c = Internal.copyOf("chatter_map", this.chatter_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MultiCalendarSearchResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.contents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.contents);
        }
        if (!this.calendar_chatter_map.isEmpty()) {
            sb.append(", calendar_chatter_map=");
            sb.append(this.calendar_chatter_map);
        }
        if (!this.chatter_map.isEmpty()) {
            sb.append(", chatter_map=");
            sb.append(this.chatter_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MultiCalendarSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MultiCalendarSearchResponse(List<MultiCalendarSearchContent> list, Map<String, String> map, Map<String, Chatter> map2) {
        this(list, map, map2, ByteString.EMPTY);
    }

    public MultiCalendarSearchResponse(List<MultiCalendarSearchContent> list, Map<String, String> map, Map<String, Chatter> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contents = Internal.immutableCopyOf("contents", list);
        this.calendar_chatter_map = Internal.immutableCopyOf("calendar_chatter_map", map);
        this.chatter_map = Internal.immutableCopyOf("chatter_map", map2);
    }
}
