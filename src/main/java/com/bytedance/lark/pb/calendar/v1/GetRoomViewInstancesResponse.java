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
import okio.ByteString;

public final class GetRoomViewInstancesResponse extends Message<GetRoomViewInstancesResponse, C15782a> {
    public static final ProtoAdapter<GetRoomViewInstancesResponse> ADAPTER = new C15783b();
    private static final long serialVersionUID = 0;
    public final List<RoomViewInstance> room_view_instances;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesResponse$b */
    private static final class C15783b extends ProtoAdapter<GetRoomViewInstancesResponse> {
        C15783b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRoomViewInstancesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRoomViewInstancesResponse getRoomViewInstancesResponse) {
            return RoomViewInstance.ADAPTER.asRepeated().encodedSizeWithTag(1, getRoomViewInstancesResponse.room_view_instances) + getRoomViewInstancesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetRoomViewInstancesResponse decode(ProtoReader protoReader) throws IOException {
            C15782a aVar = new C15782a();
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
                    aVar.f41557a.add(RoomViewInstance.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRoomViewInstancesResponse getRoomViewInstancesResponse) throws IOException {
            RoomViewInstance.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRoomViewInstancesResponse.room_view_instances);
            protoWriter.writeBytes(getRoomViewInstancesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesResponse$a */
    public static final class C15782a extends Message.Builder<GetRoomViewInstancesResponse, C15782a> {

        /* renamed from: a */
        public List<RoomViewInstance> f41557a = Internal.newMutableList();

        /* renamed from: a */
        public GetRoomViewInstancesResponse build() {
            return new GetRoomViewInstancesResponse(this.f41557a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15782a newBuilder() {
        C15782a aVar = new C15782a();
        aVar.f41557a = Internal.copyOf("room_view_instances", this.room_view_instances);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetRoomViewInstancesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.room_view_instances.isEmpty()) {
            sb.append(", room_view_instances=");
            sb.append(this.room_view_instances);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRoomViewInstancesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetRoomViewInstancesResponse(List<RoomViewInstance> list) {
        this(list, ByteString.EMPTY);
    }

    public GetRoomViewInstancesResponse(List<RoomViewInstance> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_view_instances = Internal.immutableCopyOf("room_view_instances", list);
    }
}
