package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetChatApplicationsResponse extends Message<GetChatApplicationsResponse, C17492a> {
    public static final ProtoAdapter<GetChatApplicationsResponse> ADAPTER = new C17493b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    public final List<ChatApplication> applications;
    public final C14928Entity entity;
    public final Boolean has_more;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationsResponse$b */
    private static final class C17493b extends ProtoAdapter<GetChatApplicationsResponse> {
        C17493b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatApplicationsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatApplicationsResponse getChatApplicationsResponse) {
            int i;
            int i2 = 0;
            if (getChatApplicationsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getChatApplicationsResponse.entity);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ChatApplication.ADAPTER.asRepeated().encodedSizeWithTag(2, getChatApplicationsResponse.applications);
            if (getChatApplicationsResponse.has_more != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getChatApplicationsResponse.has_more);
            }
            return encodedSizeWithTag + i2 + getChatApplicationsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatApplicationsResponse decode(ProtoReader protoReader) throws IOException {
            C17492a aVar = new C17492a();
            aVar.f44402c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44400a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44401b.add(ChatApplication.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44402c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatApplicationsResponse getChatApplicationsResponse) throws IOException {
            if (getChatApplicationsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getChatApplicationsResponse.entity);
            }
            ChatApplication.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getChatApplicationsResponse.applications);
            if (getChatApplicationsResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getChatApplicationsResponse.has_more);
            }
            protoWriter.writeBytes(getChatApplicationsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatApplicationsResponse$a */
    public static final class C17492a extends Message.Builder<GetChatApplicationsResponse, C17492a> {

        /* renamed from: a */
        public C14928Entity f44400a;

        /* renamed from: b */
        public List<ChatApplication> f44401b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f44402c;

        /* renamed from: a */
        public GetChatApplicationsResponse build() {
            return new GetChatApplicationsResponse(this.f44400a, this.f44401b, this.f44402c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17492a newBuilder() {
        C17492a aVar = new C17492a();
        aVar.f44400a = this.entity;
        aVar.f44401b = Internal.copyOf("applications", this.applications);
        aVar.f44402c = this.has_more;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatApplicationsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.applications.isEmpty()) {
            sb.append(", applications=");
            sb.append(this.applications);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChatApplicationsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatApplicationsResponse(C14928Entity entity2, List<ChatApplication> list, Boolean bool) {
        this(entity2, list, bool, ByteString.EMPTY);
    }

    public GetChatApplicationsResponse(C14928Entity entity2, List<ChatApplication> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.applications = Internal.immutableCopyOf("applications", list);
        this.has_more = bool;
    }
}
