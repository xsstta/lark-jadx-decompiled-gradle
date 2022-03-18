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

public final class MGetServerEventsRequest extends Message<MGetServerEventsRequest, C15848a> {
    public static final ProtoAdapter<MGetServerEventsRequest> ADAPTER = new C15849b();
    public static final Boolean DEFAULT_IS_FORCE_UPDATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_force_updated;
    public final Map<String, String> refid_calendar_map;
    public final List<String> ser_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsRequest$a */
    public static final class C15848a extends Message.Builder<MGetServerEventsRequest, C15848a> {

        /* renamed from: a */
        public List<String> f41660a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f41661b;

        /* renamed from: c */
        public Map<String, String> f41662c = Internal.newMutableMap();

        /* renamed from: a */
        public MGetServerEventsRequest build() {
            return new MGetServerEventsRequest(this.f41660a, this.f41661b, this.f41662c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15848a mo57196a(Boolean bool) {
            this.f41661b = bool;
            return this;
        }

        /* renamed from: a */
        public C15848a mo57197a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41660a = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsRequest$b */
    private static final class C15849b extends ProtoAdapter<MGetServerEventsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f41663a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C15849b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerEventsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerEventsRequest mGetServerEventsRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetServerEventsRequest.ser_ids);
            if (mGetServerEventsRequest.is_force_updated != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, mGetServerEventsRequest.is_force_updated);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f41663a.encodedSizeWithTag(3, mGetServerEventsRequest.refid_calendar_map) + mGetServerEventsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerEventsRequest decode(ProtoReader protoReader) throws IOException {
            C15848a aVar = new C15848a();
            aVar.f41661b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41660a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41661b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41662c.putAll(this.f41663a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerEventsRequest mGetServerEventsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetServerEventsRequest.ser_ids);
            if (mGetServerEventsRequest.is_force_updated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, mGetServerEventsRequest.is_force_updated);
            }
            this.f41663a.encodeWithTag(protoWriter, 3, mGetServerEventsRequest.refid_calendar_map);
            protoWriter.writeBytes(mGetServerEventsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15848a newBuilder() {
        C15848a aVar = new C15848a();
        aVar.f41660a = Internal.copyOf("ser_ids", this.ser_ids);
        aVar.f41661b = this.is_force_updated;
        aVar.f41662c = Internal.copyOf("refid_calendar_map", this.refid_calendar_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetServerEventsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ser_ids.isEmpty()) {
            sb.append(", ser_ids=");
            sb.append(this.ser_ids);
        }
        if (this.is_force_updated != null) {
            sb.append(", is_force_updated=");
            sb.append(this.is_force_updated);
        }
        if (!this.refid_calendar_map.isEmpty()) {
            sb.append(", refid_calendar_map=");
            sb.append(this.refid_calendar_map);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerEventsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerEventsRequest(List<String> list, Boolean bool, Map<String, String> map) {
        this(list, bool, map, ByteString.EMPTY);
    }

    public MGetServerEventsRequest(List<String> list, Boolean bool, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ser_ids = Internal.immutableCopyOf("ser_ids", list);
        this.is_force_updated = bool;
        this.refid_calendar_map = Internal.immutableCopyOf("refid_calendar_map", map);
    }
}
