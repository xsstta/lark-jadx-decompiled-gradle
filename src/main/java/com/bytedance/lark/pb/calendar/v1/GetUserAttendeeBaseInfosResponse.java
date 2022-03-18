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

public final class GetUserAttendeeBaseInfosResponse extends Message<GetUserAttendeeBaseInfosResponse, C15806a> {
    public static final ProtoAdapter<GetUserAttendeeBaseInfosResponse> ADAPTER = new C15807b();
    private static final long serialVersionUID = 0;
    public final Map<String, UserAttendeeBaseInfo> user_attendee_base_infos;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUserAttendeeBaseInfosResponse$a */
    public static final class C15806a extends Message.Builder<GetUserAttendeeBaseInfosResponse, C15806a> {

        /* renamed from: a */
        public Map<String, UserAttendeeBaseInfo> f41585a = Internal.newMutableMap();

        /* renamed from: a */
        public GetUserAttendeeBaseInfosResponse build() {
            return new GetUserAttendeeBaseInfosResponse(this.f41585a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUserAttendeeBaseInfosResponse$b */
    private static final class C15807b extends ProtoAdapter<GetUserAttendeeBaseInfosResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UserAttendeeBaseInfo>> f41586a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UserAttendeeBaseInfo.ADAPTER);

        C15807b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserAttendeeBaseInfosResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserAttendeeBaseInfosResponse getUserAttendeeBaseInfosResponse) {
            return this.f41586a.encodedSizeWithTag(1, getUserAttendeeBaseInfosResponse.user_attendee_base_infos) + getUserAttendeeBaseInfosResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserAttendeeBaseInfosResponse decode(ProtoReader protoReader) throws IOException {
            C15806a aVar = new C15806a();
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
                    aVar.f41585a.putAll(this.f41586a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserAttendeeBaseInfosResponse getUserAttendeeBaseInfosResponse) throws IOException {
            this.f41586a.encodeWithTag(protoWriter, 1, getUserAttendeeBaseInfosResponse.user_attendee_base_infos);
            protoWriter.writeBytes(getUserAttendeeBaseInfosResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15806a newBuilder() {
        C15806a aVar = new C15806a();
        aVar.f41585a = Internal.copyOf("user_attendee_base_infos", this.user_attendee_base_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetUserAttendeeBaseInfosResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.user_attendee_base_infos.isEmpty()) {
            sb.append(", user_attendee_base_infos=");
            sb.append(this.user_attendee_base_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserAttendeeBaseInfosResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserAttendeeBaseInfosResponse(Map<String, UserAttendeeBaseInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public GetUserAttendeeBaseInfosResponse(Map<String, UserAttendeeBaseInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_attendee_base_infos = Internal.immutableCopyOf("user_attendee_base_infos", map);
    }
}
