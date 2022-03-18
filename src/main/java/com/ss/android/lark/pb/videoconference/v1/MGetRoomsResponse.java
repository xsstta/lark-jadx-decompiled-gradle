package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class MGetRoomsResponse extends Message<MGetRoomsResponse, C50853a> {
    public static final ProtoAdapter<MGetRoomsResponse> ADAPTER = new C50854b();
    private static final long serialVersionUID = 0;
    public final Map<String, Room> rooms;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MGetRoomsResponse$a */
    public static final class C50853a extends Message.Builder<MGetRoomsResponse, C50853a> {

        /* renamed from: a */
        public Map<String, Room> f126758a = Internal.newMutableMap();

        /* renamed from: a */
        public MGetRoomsResponse build() {
            return new MGetRoomsResponse(this.f126758a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.MGetRoomsResponse$b */
    private static final class C50854b extends ProtoAdapter<MGetRoomsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Room>> f126759a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Room.ADAPTER);

        C50854b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetRoomsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetRoomsResponse mGetRoomsResponse) {
            return this.f126759a.encodedSizeWithTag(1, mGetRoomsResponse.rooms) + mGetRoomsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetRoomsResponse decode(ProtoReader protoReader) throws IOException {
            C50853a aVar = new C50853a();
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
                    aVar.f126758a.putAll(this.f126759a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetRoomsResponse mGetRoomsResponse) throws IOException {
            this.f126759a.encodeWithTag(protoWriter, 1, mGetRoomsResponse.rooms);
            protoWriter.writeBytes(mGetRoomsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50853a newBuilder() {
        C50853a aVar = new C50853a();
        aVar.f126758a = Internal.copyOf("rooms", this.rooms);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "MGetRoomsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.rooms.isEmpty()) {
            sb.append(", rooms=");
            sb.append(this.rooms);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetRoomsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetRoomsResponse(Map<String, Room> map) {
        this(map, ByteString.EMPTY);
    }

    public MGetRoomsResponse(Map<String, Room> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rooms = Internal.immutableCopyOf("rooms", map);
    }
}
