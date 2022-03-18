package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FeedbackRecentAppRequest extends Message<FeedbackRecentAppRequest, C18647a> {
    public static final ProtoAdapter<FeedbackRecentAppRequest> ADAPTER = new C18648b();
    public static final AppType DEFAULT_APP_TYPE = AppType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final AppType app_type;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.FeedbackRecentAppRequest$b */
    private static final class C18648b extends ProtoAdapter<FeedbackRecentAppRequest> {
        C18648b() {
            super(FieldEncoding.LENGTH_DELIMITED, FeedbackRecentAppRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(FeedbackRecentAppRequest feedbackRecentAppRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, feedbackRecentAppRequest.app_id);
            if (feedbackRecentAppRequest.app_type != null) {
                i = AppType.ADAPTER.encodedSizeWithTag(2, feedbackRecentAppRequest.app_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + feedbackRecentAppRequest.unknownFields().size();
        }

        /* renamed from: a */
        public FeedbackRecentAppRequest decode(ProtoReader protoReader) throws IOException {
            C18647a aVar = new C18647a();
            aVar.f46171a = "";
            aVar.f46172b = AppType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46171a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46172b = AppType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FeedbackRecentAppRequest feedbackRecentAppRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feedbackRecentAppRequest.app_id);
            if (feedbackRecentAppRequest.app_type != null) {
                AppType.ADAPTER.encodeWithTag(protoWriter, 2, feedbackRecentAppRequest.app_type);
            }
            protoWriter.writeBytes(feedbackRecentAppRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.FeedbackRecentAppRequest$a */
    public static final class C18647a extends Message.Builder<FeedbackRecentAppRequest, C18647a> {

        /* renamed from: a */
        public String f46171a;

        /* renamed from: b */
        public AppType f46172b;

        /* renamed from: a */
        public FeedbackRecentAppRequest build() {
            String str = this.f46171a;
            if (str != null) {
                return new FeedbackRecentAppRequest(str, this.f46172b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "app_id");
        }

        /* renamed from: a */
        public C18647a mo64209a(AppType appType) {
            this.f46172b = appType;
            return this;
        }

        /* renamed from: a */
        public C18647a mo64210a(String str) {
            this.f46171a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18647a newBuilder() {
        C18647a aVar = new C18647a();
        aVar.f46171a = this.app_id;
        aVar.f46172b = this.app_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "FeedbackRecentAppRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        if (this.app_type != null) {
            sb.append(", app_type=");
            sb.append(this.app_type);
        }
        StringBuilder replace = sb.replace(0, 2, "FeedbackRecentAppRequest{");
        replace.append('}');
        return replace.toString();
    }

    public FeedbackRecentAppRequest(String str, AppType appType) {
        this(str, appType, ByteString.EMPTY);
    }

    public FeedbackRecentAppRequest(String str, AppType appType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.app_type = appType;
    }
}
