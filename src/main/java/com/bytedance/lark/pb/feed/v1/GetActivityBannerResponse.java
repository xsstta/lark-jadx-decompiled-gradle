package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetActivityBannerResponse extends Message<GetActivityBannerResponse, C17142a> {
    public static final ProtoAdapter<GetActivityBannerResponse> ADAPTER = new C17143b();
    public static final Boolean DEFAULT_ACTIVITY_SUMMARY = false;
    private static final long serialVersionUID = 0;
    public final Boolean activity_summary;
    public final String activity_summary_url;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetActivityBannerResponse$b */
    private static final class C17143b extends ProtoAdapter<GetActivityBannerResponse> {
        C17143b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetActivityBannerResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetActivityBannerResponse getActivityBannerResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, getActivityBannerResponse.activity_summary);
            if (getActivityBannerResponse.activity_summary_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getActivityBannerResponse.activity_summary_url);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getActivityBannerResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetActivityBannerResponse decode(ProtoReader protoReader) throws IOException {
            C17142a aVar = new C17142a();
            aVar.f43887a = false;
            aVar.f43888b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43887a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43888b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetActivityBannerResponse getActivityBannerResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getActivityBannerResponse.activity_summary);
            if (getActivityBannerResponse.activity_summary_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getActivityBannerResponse.activity_summary_url);
            }
            protoWriter.writeBytes(getActivityBannerResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetActivityBannerResponse$a */
    public static final class C17142a extends Message.Builder<GetActivityBannerResponse, C17142a> {

        /* renamed from: a */
        public Boolean f43887a;

        /* renamed from: b */
        public String f43888b;

        /* renamed from: a */
        public GetActivityBannerResponse build() {
            Boolean bool = this.f43887a;
            if (bool != null) {
                return new GetActivityBannerResponse(bool, this.f43888b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "activity_summary");
        }
    }

    @Override // com.squareup.wire.Message
    public C17142a newBuilder() {
        C17142a aVar = new C17142a();
        aVar.f43887a = this.activity_summary;
        aVar.f43888b = this.activity_summary_url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetActivityBannerResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", activity_summary=");
        sb.append(this.activity_summary);
        if (this.activity_summary_url != null) {
            sb.append(", activity_summary_url=");
            sb.append(this.activity_summary_url);
        }
        StringBuilder replace = sb.replace(0, 2, "GetActivityBannerResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetActivityBannerResponse(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public GetActivityBannerResponse(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.activity_summary = bool;
        this.activity_summary_url = str;
    }
}
