package com.bytedance.lark.pb.calendar.v1;

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

public final class GetAllMeetingRoomsAndLevelsResponse extends Message<GetAllMeetingRoomsAndLevelsResponse, C15638a> {
    public static final ProtoAdapter<GetAllMeetingRoomsAndLevelsResponse> ADAPTER = new C15639b();
    private static final long serialVersionUID = 0;
    public final Map<String, LevelRelatedInfo> level_info;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllMeetingRoomsAndLevelsResponse$a */
    public static final class C15638a extends Message.Builder<GetAllMeetingRoomsAndLevelsResponse, C15638a> {

        /* renamed from: a */
        public Map<String, LevelRelatedInfo> f41401a = Internal.newMutableMap();

        /* renamed from: a */
        public GetAllMeetingRoomsAndLevelsResponse build() {
            return new GetAllMeetingRoomsAndLevelsResponse(this.f41401a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllMeetingRoomsAndLevelsResponse$b */
    private static final class C15639b extends ProtoAdapter<GetAllMeetingRoomsAndLevelsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, LevelRelatedInfo>> f41402a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LevelRelatedInfo.ADAPTER);

        C15639b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllMeetingRoomsAndLevelsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllMeetingRoomsAndLevelsResponse getAllMeetingRoomsAndLevelsResponse) {
            return this.f41402a.encodedSizeWithTag(1, getAllMeetingRoomsAndLevelsResponse.level_info) + getAllMeetingRoomsAndLevelsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllMeetingRoomsAndLevelsResponse decode(ProtoReader protoReader) throws IOException {
            C15638a aVar = new C15638a();
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
                    aVar.f41401a.putAll(this.f41402a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllMeetingRoomsAndLevelsResponse getAllMeetingRoomsAndLevelsResponse) throws IOException {
            this.f41402a.encodeWithTag(protoWriter, 1, getAllMeetingRoomsAndLevelsResponse.level_info);
            protoWriter.writeBytes(getAllMeetingRoomsAndLevelsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15638a newBuilder() {
        C15638a aVar = new C15638a();
        aVar.f41401a = Internal.copyOf("level_info", this.level_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAllMeetingRoomsAndLevelsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.level_info.isEmpty()) {
            sb.append(", level_info=");
            sb.append(this.level_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAllMeetingRoomsAndLevelsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllMeetingRoomsAndLevelsResponse(Map<String, LevelRelatedInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public GetAllMeetingRoomsAndLevelsResponse(Map<String, LevelRelatedInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.level_info = Internal.immutableCopyOf("level_info", map);
    }
}
