package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateCalendarVisibilityResponse extends Message<UpdateCalendarVisibilityResponse, C16094a> {
    public static final ProtoAdapter<UpdateCalendarVisibilityResponse> ADAPTER = new C16095b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final Boolean success;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateCalendarVisibilityResponse$b */
    private static final class C16095b extends ProtoAdapter<UpdateCalendarVisibilityResponse> {
        C16095b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateCalendarVisibilityResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateCalendarVisibilityResponse updateCalendarVisibilityResponse) {
            int i;
            if (updateCalendarVisibilityResponse.success != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, updateCalendarVisibilityResponse.success);
            } else {
                i = 0;
            }
            return i + updateCalendarVisibilityResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateCalendarVisibilityResponse decode(ProtoReader protoReader) throws IOException {
            C16094a aVar = new C16094a();
            aVar.f42179a = false;
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
                    aVar.f42179a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateCalendarVisibilityResponse updateCalendarVisibilityResponse) throws IOException {
            if (updateCalendarVisibilityResponse.success != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, updateCalendarVisibilityResponse.success);
            }
            protoWriter.writeBytes(updateCalendarVisibilityResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpdateCalendarVisibilityResponse$a */
    public static final class C16094a extends Message.Builder<UpdateCalendarVisibilityResponse, C16094a> {

        /* renamed from: a */
        public Boolean f42179a;

        /* renamed from: a */
        public UpdateCalendarVisibilityResponse build() {
            return new UpdateCalendarVisibilityResponse(this.f42179a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16094a newBuilder() {
        C16094a aVar = new C16094a();
        aVar.f42179a = this.success;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpdateCalendarVisibilityResponse");
        StringBuilder sb = new StringBuilder();
        if (this.success != null) {
            sb.append(", success=");
            sb.append(this.success);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateCalendarVisibilityResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateCalendarVisibilityResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public UpdateCalendarVisibilityResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
    }
}
