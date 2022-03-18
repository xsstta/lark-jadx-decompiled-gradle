package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetSearchInfoHistoryRequest extends Message<SetSearchInfoHistoryRequest, C18929a> {
    public static final ProtoAdapter<SetSearchInfoHistoryRequest> ADAPTER = new C18930b();
    private static final long serialVersionUID = 0;
    public final SearchHistoryInfo history_info;

    /* renamed from: com.bytedance.lark.pb.search.v1.SetSearchInfoHistoryRequest$b */
    private static final class C18930b extends ProtoAdapter<SetSearchInfoHistoryRequest> {
        C18930b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetSearchInfoHistoryRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetSearchInfoHistoryRequest setSearchInfoHistoryRequest) {
            int i;
            if (setSearchInfoHistoryRequest.history_info != null) {
                i = SearchHistoryInfo.ADAPTER.encodedSizeWithTag(1, setSearchInfoHistoryRequest.history_info);
            } else {
                i = 0;
            }
            return i + setSearchInfoHistoryRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetSearchInfoHistoryRequest decode(ProtoReader protoReader) throws IOException {
            C18929a aVar = new C18929a();
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
                    aVar.f46813a = SearchHistoryInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetSearchInfoHistoryRequest setSearchInfoHistoryRequest) throws IOException {
            if (setSearchInfoHistoryRequest.history_info != null) {
                SearchHistoryInfo.ADAPTER.encodeWithTag(protoWriter, 1, setSearchInfoHistoryRequest.history_info);
            }
            protoWriter.writeBytes(setSearchInfoHistoryRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SetSearchInfoHistoryRequest$a */
    public static final class C18929a extends Message.Builder<SetSearchInfoHistoryRequest, C18929a> {

        /* renamed from: a */
        public SearchHistoryInfo f46813a;

        /* renamed from: a */
        public SetSearchInfoHistoryRequest build() {
            return new SetSearchInfoHistoryRequest(this.f46813a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18929a mo64889a(SearchHistoryInfo searchHistoryInfo) {
            this.f46813a = searchHistoryInfo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18929a newBuilder() {
        C18929a aVar = new C18929a();
        aVar.f46813a = this.history_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SetSearchInfoHistoryRequest");
        StringBuilder sb = new StringBuilder();
        if (this.history_info != null) {
            sb.append(", history_info=");
            sb.append(this.history_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SetSearchInfoHistoryRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetSearchInfoHistoryRequest(SearchHistoryInfo searchHistoryInfo) {
        this(searchHistoryInfo, ByteString.EMPTY);
    }

    public SetSearchInfoHistoryRequest(SearchHistoryInfo searchHistoryInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_info = searchHistoryInfo;
    }
}
