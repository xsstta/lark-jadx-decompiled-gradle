package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllCalendarsRequest extends Message<GetAllCalendarsRequest, C15632a> {
    public static final ProtoAdapter<GetAllCalendarsRequest> ADAPTER = new C15633b();
    public static final Calendar.VisibilityProperty DEFAULT_VIEW = Calendar.VisibilityProperty.NORMAL_VIEW;
    private static final long serialVersionUID = 0;
    public final Calendar.VisibilityProperty view;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllCalendarsRequest$b */
    private static final class C15633b extends ProtoAdapter<GetAllCalendarsRequest> {
        C15633b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllCalendarsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllCalendarsRequest getAllCalendarsRequest) {
            int i;
            if (getAllCalendarsRequest.view != null) {
                i = Calendar.VisibilityProperty.ADAPTER.encodedSizeWithTag(1, getAllCalendarsRequest.view);
            } else {
                i = 0;
            }
            return i + getAllCalendarsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllCalendarsRequest decode(ProtoReader protoReader) throws IOException {
            C15632a aVar = new C15632a();
            aVar.f41393a = Calendar.VisibilityProperty.NORMAL_VIEW;
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
                    try {
                        aVar.f41393a = Calendar.VisibilityProperty.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllCalendarsRequest getAllCalendarsRequest) throws IOException {
            if (getAllCalendarsRequest.view != null) {
                Calendar.VisibilityProperty.ADAPTER.encodeWithTag(protoWriter, 1, getAllCalendarsRequest.view);
            }
            protoWriter.writeBytes(getAllCalendarsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllCalendarsRequest$a */
    public static final class C15632a extends Message.Builder<GetAllCalendarsRequest, C15632a> {

        /* renamed from: a */
        public Calendar.VisibilityProperty f41393a;

        /* renamed from: a */
        public GetAllCalendarsRequest build() {
            return new GetAllCalendarsRequest(this.f41393a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15632a newBuilder() {
        C15632a aVar = new C15632a();
        aVar.f41393a = this.view;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAllCalendarsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.view != null) {
            sb.append(", view=");
            sb.append(this.view);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAllCalendarsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllCalendarsRequest(Calendar.VisibilityProperty visibilityProperty) {
        this(visibilityProperty, ByteString.EMPTY);
    }

    public GetAllCalendarsRequest(Calendar.VisibilityProperty visibilityProperty, ByteString byteString) {
        super(ADAPTER, byteString);
        this.view = visibilityProperty;
    }
}
