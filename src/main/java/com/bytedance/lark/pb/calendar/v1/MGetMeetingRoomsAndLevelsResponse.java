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

public final class MGetMeetingRoomsAndLevelsResponse extends Message<MGetMeetingRoomsAndLevelsResponse, C15842a> {
    public static final ProtoAdapter<MGetMeetingRoomsAndLevelsResponse> ADAPTER = new C15843b();
    private static final long serialVersionUID = 0;
    public final Map<String, LevelRelatedInfo> level_info;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetMeetingRoomsAndLevelsResponse$a */
    public static final class C15842a extends Message.Builder<MGetMeetingRoomsAndLevelsResponse, C15842a> {

        /* renamed from: a */
        public Map<String, LevelRelatedInfo> f41656a = Internal.newMutableMap();

        /* renamed from: a */
        public MGetMeetingRoomsAndLevelsResponse build() {
            return new MGetMeetingRoomsAndLevelsResponse(this.f41656a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetMeetingRoomsAndLevelsResponse$b */
    private static final class C15843b extends ProtoAdapter<MGetMeetingRoomsAndLevelsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, LevelRelatedInfo>> f41657a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LevelRelatedInfo.ADAPTER);

        C15843b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetMeetingRoomsAndLevelsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetMeetingRoomsAndLevelsResponse mGetMeetingRoomsAndLevelsResponse) {
            return this.f41657a.encodedSizeWithTag(1, mGetMeetingRoomsAndLevelsResponse.level_info) + mGetMeetingRoomsAndLevelsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetMeetingRoomsAndLevelsResponse decode(ProtoReader protoReader) throws IOException {
            C15842a aVar = new C15842a();
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
                    aVar.f41656a.putAll(this.f41657a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetMeetingRoomsAndLevelsResponse mGetMeetingRoomsAndLevelsResponse) throws IOException {
            this.f41657a.encodeWithTag(protoWriter, 1, mGetMeetingRoomsAndLevelsResponse.level_info);
            protoWriter.writeBytes(mGetMeetingRoomsAndLevelsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15842a newBuilder() {
        C15842a aVar = new C15842a();
        aVar.f41656a = Internal.copyOf("level_info", this.level_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetMeetingRoomsAndLevelsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.level_info.isEmpty()) {
            sb.append(", level_info=");
            sb.append(this.level_info);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetMeetingRoomsAndLevelsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetMeetingRoomsAndLevelsResponse(Map<String, LevelRelatedInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public MGetMeetingRoomsAndLevelsResponse(Map<String, LevelRelatedInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.level_info = Internal.immutableCopyOf("level_info", map);
    }
}
