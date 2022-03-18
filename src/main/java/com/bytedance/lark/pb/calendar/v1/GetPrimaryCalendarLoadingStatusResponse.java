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

public final class GetPrimaryCalendarLoadingStatusResponse extends Message<GetPrimaryCalendarLoadingStatusResponse, C15756a> {
    public static final ProtoAdapter<GetPrimaryCalendarLoadingStatusResponse> ADAPTER = new C15757b();
    public static final Boolean DEFAULT_IS_LOADING = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_loading;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetPrimaryCalendarLoadingStatusResponse$b */
    private static final class C15757b extends ProtoAdapter<GetPrimaryCalendarLoadingStatusResponse> {
        C15757b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPrimaryCalendarLoadingStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPrimaryCalendarLoadingStatusResponse getPrimaryCalendarLoadingStatusResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getPrimaryCalendarLoadingStatusResponse.is_loading) + getPrimaryCalendarLoadingStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetPrimaryCalendarLoadingStatusResponse decode(ProtoReader protoReader) throws IOException {
            C15756a aVar = new C15756a();
            aVar.f41524a = false;
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
                    aVar.f41524a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPrimaryCalendarLoadingStatusResponse getPrimaryCalendarLoadingStatusResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getPrimaryCalendarLoadingStatusResponse.is_loading);
            protoWriter.writeBytes(getPrimaryCalendarLoadingStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetPrimaryCalendarLoadingStatusResponse$a */
    public static final class C15756a extends Message.Builder<GetPrimaryCalendarLoadingStatusResponse, C15756a> {

        /* renamed from: a */
        public Boolean f41524a;

        /* renamed from: a */
        public GetPrimaryCalendarLoadingStatusResponse build() {
            Boolean bool = this.f41524a;
            if (bool != null) {
                return new GetPrimaryCalendarLoadingStatusResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_loading");
        }
    }

    @Override // com.squareup.wire.Message
    public C15756a newBuilder() {
        C15756a aVar = new C15756a();
        aVar.f41524a = this.is_loading;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetPrimaryCalendarLoadingStatusResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_loading=");
        sb.append(this.is_loading);
        StringBuilder replace = sb.replace(0, 2, "GetPrimaryCalendarLoadingStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetPrimaryCalendarLoadingStatusResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetPrimaryCalendarLoadingStatusResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_loading = bool;
    }
}
