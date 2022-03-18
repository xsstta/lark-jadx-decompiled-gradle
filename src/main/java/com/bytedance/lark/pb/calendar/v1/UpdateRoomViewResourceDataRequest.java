package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateRoomViewResourceDataRequest extends Message<UpdateRoomViewResourceDataRequest, C16098a> {
    public static final ProtoAdapter<UpdateRoomViewResourceDataRequest> ADAPTER = new C16099b();
    private static final long serialVersionUID = 0;
    public final RoomViewFilterConfigs room_view_filter_configs;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataRequest$b */
    private static final class C16099b extends ProtoAdapter<UpdateRoomViewResourceDataRequest> {
        C16099b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateRoomViewResourceDataRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateRoomViewResourceDataRequest updateRoomViewResourceDataRequest) {
            int i;
            if (updateRoomViewResourceDataRequest.room_view_filter_configs != null) {
                i = RoomViewFilterConfigs.ADAPTER.encodedSizeWithTag(1, updateRoomViewResourceDataRequest.room_view_filter_configs);
            } else {
                i = 0;
            }
            return i + updateRoomViewResourceDataRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateRoomViewResourceDataRequest decode(ProtoReader protoReader) throws IOException {
            C16098a aVar = new C16098a();
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
                    aVar.f42182a = RoomViewFilterConfigs.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateRoomViewResourceDataRequest updateRoomViewResourceDataRequest) throws IOException {
            if (updateRoomViewResourceDataRequest.room_view_filter_configs != null) {
                RoomViewFilterConfigs.ADAPTER.encodeWithTag(protoWriter, 1, updateRoomViewResourceDataRequest.room_view_filter_configs);
            }
            protoWriter.writeBytes(updateRoomViewResourceDataRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataRequest$a */
    public static final class C16098a extends Message.Builder<UpdateRoomViewResourceDataRequest, C16098a> {

        /* renamed from: a */
        public RoomViewFilterConfigs f42182a;

        /* renamed from: a */
        public UpdateRoomViewResourceDataRequest build() {
            return new UpdateRoomViewResourceDataRequest(this.f42182a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16098a mo57840a(RoomViewFilterConfigs roomViewFilterConfigs) {
            this.f42182a = roomViewFilterConfigs;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16098a newBuilder() {
        C16098a aVar = new C16098a();
        aVar.f42182a = this.room_view_filter_configs;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpdateRoomViewResourceDataRequest");
        StringBuilder sb = new StringBuilder();
        if (this.room_view_filter_configs != null) {
            sb.append(", room_view_filter_configs=");
            sb.append(this.room_view_filter_configs);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateRoomViewResourceDataRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateRoomViewResourceDataRequest(RoomViewFilterConfigs roomViewFilterConfigs) {
        this(roomViewFilterConfigs, ByteString.EMPTY);
    }

    public UpdateRoomViewResourceDataRequest(RoomViewFilterConfigs roomViewFilterConfigs, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_view_filter_configs = roomViewFilterConfigs;
    }
}
