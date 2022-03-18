package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetVCTabHistoryListResponse extends Message<GetVCTabHistoryListResponse, C50695a> {
    public static final ProtoAdapter<GetVCTabHistoryListResponse> ADAPTER = new C50696b();
    public static final Integer DEFAULT_DOWN_VERSION = 0;
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final Integer down_version;
    public final Boolean has_more;
    public final List<VCTabListItem> items;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListResponse$b */
    private static final class C50696b extends ProtoAdapter<GetVCTabHistoryListResponse> {
        C50696b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCTabHistoryListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCTabHistoryListResponse getVCTabHistoryListResponse) {
            int i;
            int encodedSizeWithTag = VCTabListItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getVCTabHistoryListResponse.items);
            int i2 = 0;
            if (getVCTabHistoryListResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getVCTabHistoryListResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getVCTabHistoryListResponse.down_version != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, getVCTabHistoryListResponse.down_version);
            }
            return i3 + i2 + getVCTabHistoryListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCTabHistoryListResponse decode(ProtoReader protoReader) throws IOException {
            C50695a aVar = new C50695a();
            aVar.f126427b = false;
            aVar.f126428c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126426a.add(VCTabListItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f126427b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126428c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCTabHistoryListResponse getVCTabHistoryListResponse) throws IOException {
            VCTabListItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getVCTabHistoryListResponse.items);
            if (getVCTabHistoryListResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getVCTabHistoryListResponse.has_more);
            }
            if (getVCTabHistoryListResponse.down_version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getVCTabHistoryListResponse.down_version);
            }
            protoWriter.writeBytes(getVCTabHistoryListResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabHistoryListResponse$a */
    public static final class C50695a extends Message.Builder<GetVCTabHistoryListResponse, C50695a> {

        /* renamed from: a */
        public List<VCTabListItem> f126426a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f126427b;

        /* renamed from: c */
        public Integer f126428c;

        /* renamed from: a */
        public GetVCTabHistoryListResponse build() {
            return new GetVCTabHistoryListResponse(this.f126426a, this.f126427b, this.f126428c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50695a newBuilder() {
        C50695a aVar = new C50695a();
        aVar.f126426a = Internal.copyOf("items", this.items);
        aVar.f126427b = this.has_more;
        aVar.f126428c = this.down_version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVCTabHistoryListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.items.isEmpty()) {
            sb.append(", items=");
            sb.append(this.items);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.down_version != null) {
            sb.append(", down_version=");
            sb.append(this.down_version);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCTabHistoryListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCTabHistoryListResponse(List<VCTabListItem> list, Boolean bool, Integer num) {
        this(list, bool, num, ByteString.EMPTY);
    }

    public GetVCTabHistoryListResponse(List<VCTabListItem> list, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = Internal.immutableCopyOf("items", list);
        this.has_more = bool;
        this.down_version = num;
    }
}
