package com.bytedance.lark.pb.settings.v1;

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

public final class GetNavigationAppInfoBatchRequest extends Message<GetNavigationAppInfoBatchRequest, C19143a> {
    public static final ProtoAdapter<GetNavigationAppInfoBatchRequest> ADAPTER = new C19144b();
    public static final Boolean DEFAULT_NEED_SERVER_ALL_APP_INFO = false;
    private static final long serialVersionUID = 0;
    public final Boolean need_server_all_app_info;
    public final List<GetNavigationAppInfoRequest> requests;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoBatchRequest$b */
    private static final class C19144b extends ProtoAdapter<GetNavigationAppInfoBatchRequest> {
        C19144b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNavigationAppInfoBatchRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNavigationAppInfoBatchRequest getNavigationAppInfoBatchRequest) {
            int i;
            int encodedSizeWithTag = GetNavigationAppInfoRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, getNavigationAppInfoBatchRequest.requests);
            if (getNavigationAppInfoBatchRequest.need_server_all_app_info != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getNavigationAppInfoBatchRequest.need_server_all_app_info);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getNavigationAppInfoBatchRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNavigationAppInfoBatchRequest decode(ProtoReader protoReader) throws IOException {
            C19143a aVar = new C19143a();
            aVar.f47283b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47282a.add(GetNavigationAppInfoRequest.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47283b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNavigationAppInfoBatchRequest getNavigationAppInfoBatchRequest) throws IOException {
            GetNavigationAppInfoRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getNavigationAppInfoBatchRequest.requests);
            if (getNavigationAppInfoBatchRequest.need_server_all_app_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getNavigationAppInfoBatchRequest.need_server_all_app_info);
            }
            protoWriter.writeBytes(getNavigationAppInfoBatchRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoBatchRequest$a */
    public static final class C19143a extends Message.Builder<GetNavigationAppInfoBatchRequest, C19143a> {

        /* renamed from: a */
        public List<GetNavigationAppInfoRequest> f47282a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f47283b;

        /* renamed from: a */
        public GetNavigationAppInfoBatchRequest build() {
            return new GetNavigationAppInfoBatchRequest(this.f47282a, this.f47283b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19143a mo65432a(List<GetNavigationAppInfoRequest> list) {
            Internal.checkElementsNotNull(list);
            this.f47282a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19143a newBuilder() {
        C19143a aVar = new C19143a();
        aVar.f47282a = Internal.copyOf("requests", this.requests);
        aVar.f47283b = this.need_server_all_app_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetNavigationAppInfoBatchRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.requests.isEmpty()) {
            sb.append(", requests=");
            sb.append(this.requests);
        }
        if (this.need_server_all_app_info != null) {
            sb.append(", need_server_all_app_info=");
            sb.append(this.need_server_all_app_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNavigationAppInfoBatchRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNavigationAppInfoBatchRequest(List<GetNavigationAppInfoRequest> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetNavigationAppInfoBatchRequest(List<GetNavigationAppInfoRequest> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.requests = Internal.immutableCopyOf("requests", list);
        this.need_server_all_app_info = bool;
    }
}
