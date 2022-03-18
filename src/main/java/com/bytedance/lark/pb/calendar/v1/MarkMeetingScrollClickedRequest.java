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

public final class MarkMeetingScrollClickedRequest extends Message<MarkMeetingScrollClickedRequest, C15860a> {
    public static final ProtoAdapter<MarkMeetingScrollClickedRequest> ADAPTER = new C15861b();
    public static final ScrollType DEFAULT_SCROLL_TYPE = ScrollType.EVENT_INFO;
    private static final long serialVersionUID = 0;
    public final String meeting_id;
    public final ScrollType scroll_type;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MarkMeetingScrollClickedRequest$b */
    private static final class C15861b extends ProtoAdapter<MarkMeetingScrollClickedRequest> {
        C15861b() {
            super(FieldEncoding.LENGTH_DELIMITED, MarkMeetingScrollClickedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MarkMeetingScrollClickedRequest markMeetingScrollClickedRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, markMeetingScrollClickedRequest.meeting_id);
            if (markMeetingScrollClickedRequest.scroll_type != null) {
                i = ScrollType.ADAPTER.encodedSizeWithTag(2, markMeetingScrollClickedRequest.scroll_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + markMeetingScrollClickedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MarkMeetingScrollClickedRequest decode(ProtoReader protoReader) throws IOException {
            C15860a aVar = new C15860a();
            aVar.f41682a = "";
            aVar.f41683b = ScrollType.EVENT_INFO;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41682a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41683b = ScrollType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MarkMeetingScrollClickedRequest markMeetingScrollClickedRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMeetingScrollClickedRequest.meeting_id);
            if (markMeetingScrollClickedRequest.scroll_type != null) {
                ScrollType.ADAPTER.encodeWithTag(protoWriter, 2, markMeetingScrollClickedRequest.scroll_type);
            }
            protoWriter.writeBytes(markMeetingScrollClickedRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MarkMeetingScrollClickedRequest$a */
    public static final class C15860a extends Message.Builder<MarkMeetingScrollClickedRequest, C15860a> {

        /* renamed from: a */
        public String f41682a;

        /* renamed from: b */
        public ScrollType f41683b;

        /* renamed from: a */
        public MarkMeetingScrollClickedRequest build() {
            String str = this.f41682a;
            if (str != null) {
                return new MarkMeetingScrollClickedRequest(str, this.f41683b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id");
        }

        /* renamed from: a */
        public C15860a mo57231a(ScrollType scrollType) {
            this.f41683b = scrollType;
            return this;
        }

        /* renamed from: a */
        public C15860a mo57232a(String str) {
            this.f41682a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15860a newBuilder() {
        C15860a aVar = new C15860a();
        aVar.f41682a = this.meeting_id;
        aVar.f41683b = this.scroll_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MarkMeetingScrollClickedRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        if (this.scroll_type != null) {
            sb.append(", scroll_type=");
            sb.append(this.scroll_type);
        }
        StringBuilder replace = sb.replace(0, 2, "MarkMeetingScrollClickedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MarkMeetingScrollClickedRequest(String str, ScrollType scrollType) {
        this(str, scrollType, ByteString.EMPTY);
    }

    public MarkMeetingScrollClickedRequest(String str, ScrollType scrollType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.scroll_type = scrollType;
    }
}
