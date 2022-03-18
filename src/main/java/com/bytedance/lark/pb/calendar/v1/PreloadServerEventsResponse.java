package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PreloadServerEventsResponse extends Message<PreloadServerEventsResponse, C15910a> {
    public static final ProtoAdapter<PreloadServerEventsResponse> ADAPTER = new C15911b();
    public static final Boolean DEFAULT_IS_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_success;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PreloadServerEventsResponse$b */
    private static final class C15911b extends ProtoAdapter<PreloadServerEventsResponse> {
        C15911b() {
            super(FieldEncoding.LENGTH_DELIMITED, PreloadServerEventsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PreloadServerEventsResponse preloadServerEventsResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, preloadServerEventsResponse.is_success) + preloadServerEventsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PreloadServerEventsResponse decode(ProtoReader protoReader) throws IOException {
            C15910a aVar = new C15910a();
            aVar.f41870a = false;
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
                    aVar.f41870a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PreloadServerEventsResponse preloadServerEventsResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, preloadServerEventsResponse.is_success);
            protoWriter.writeBytes(preloadServerEventsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PreloadServerEventsResponse$a */
    public static final class C15910a extends Message.Builder<PreloadServerEventsResponse, C15910a> {

        /* renamed from: a */
        public Boolean f41870a;

        /* renamed from: a */
        public PreloadServerEventsResponse build() {
            Boolean bool = this.f41870a;
            if (bool != null) {
                return new PreloadServerEventsResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_success");
        }
    }

    @Override // com.squareup.wire.Message
    public C15910a newBuilder() {
        C15910a aVar = new C15910a();
        aVar.f41870a = this.is_success;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PreloadServerEventsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_success=");
        sb.append(this.is_success);
        StringBuilder replace = sb.replace(0, 2, "PreloadServerEventsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PreloadServerEventsResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public PreloadServerEventsResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_success = bool;
    }
}
