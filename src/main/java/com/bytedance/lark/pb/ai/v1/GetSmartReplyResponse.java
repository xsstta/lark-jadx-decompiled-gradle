package com.bytedance.lark.pb.ai.v1;

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

public final class GetSmartReplyResponse extends Message<GetSmartReplyResponse, C14627a> {
    public static final ProtoAdapter<GetSmartReplyResponse> ADAPTER = new C14628b();
    public static final Integer DEFAULT_VID = 0;
    private static final long serialVersionUID = 0;
    public final String impr_id;
    public final List<SmartReplyItem> smart_replies;
    public final Integer vid;

    /* renamed from: com.bytedance.lark.pb.ai.v1.GetSmartReplyResponse$b */
    private static final class C14628b extends ProtoAdapter<GetSmartReplyResponse> {
        C14628b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSmartReplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSmartReplyResponse getSmartReplyResponse) {
            int i;
            int encodedSizeWithTag = SmartReplyItem.ADAPTER.asRepeated().encodedSizeWithTag(1, getSmartReplyResponse.smart_replies);
            int i2 = 0;
            if (getSmartReplyResponse.vid != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, getSmartReplyResponse.vid);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getSmartReplyResponse.impr_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getSmartReplyResponse.impr_id);
            }
            return i3 + i2 + getSmartReplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetSmartReplyResponse decode(ProtoReader protoReader) throws IOException {
            C14627a aVar = new C14627a();
            aVar.f38716b = 0;
            aVar.f38717c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38715a.add(SmartReplyItem.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f38716b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38717c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSmartReplyResponse getSmartReplyResponse) throws IOException {
            SmartReplyItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getSmartReplyResponse.smart_replies);
            if (getSmartReplyResponse.vid != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getSmartReplyResponse.vid);
            }
            if (getSmartReplyResponse.impr_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getSmartReplyResponse.impr_id);
            }
            protoWriter.writeBytes(getSmartReplyResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.GetSmartReplyResponse$a */
    public static final class C14627a extends Message.Builder<GetSmartReplyResponse, C14627a> {

        /* renamed from: a */
        public List<SmartReplyItem> f38715a = Internal.newMutableList();

        /* renamed from: b */
        public Integer f38716b;

        /* renamed from: c */
        public String f38717c;

        /* renamed from: a */
        public GetSmartReplyResponse build() {
            return new GetSmartReplyResponse(this.f38715a, this.f38716b, this.f38717c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14627a newBuilder() {
        C14627a aVar = new C14627a();
        aVar.f38715a = Internal.copyOf("smart_replies", this.smart_replies);
        aVar.f38716b = this.vid;
        aVar.f38717c = this.impr_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "GetSmartReplyResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.smart_replies.isEmpty()) {
            sb.append(", smart_replies=");
            sb.append(this.smart_replies);
        }
        if (this.vid != null) {
            sb.append(", vid=");
            sb.append(this.vid);
        }
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetSmartReplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetSmartReplyResponse(List<SmartReplyItem> list, Integer num, String str) {
        this(list, num, str, ByteString.EMPTY);
    }

    public GetSmartReplyResponse(List<SmartReplyItem> list, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.smart_replies = Internal.immutableCopyOf("smart_replies", list);
        this.vid = num;
        this.impr_id = str;
    }
}
