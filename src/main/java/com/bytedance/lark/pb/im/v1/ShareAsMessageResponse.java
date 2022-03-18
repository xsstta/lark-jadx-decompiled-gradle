package com.bytedance.lark.pb.im.v1;

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

public final class ShareAsMessageResponse extends Message<ShareAsMessageResponse, C18065a> {
    public static final ProtoAdapter<ShareAsMessageResponse> ADAPTER = new C18066b();
    private static final long serialVersionUID = 0;
    public final List<RespInfo> resp_info;

    public static final class RespInfo extends Message<RespInfo, C18063a> {
        public static final ProtoAdapter<RespInfo> ADAPTER = new C18064b();
        private static final long serialVersionUID = 0;
        public final String message_id;
        public final ShareTarget share_target;
        public final String thread_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareAsMessageResponse$RespInfo$b */
        private static final class C18064b extends ProtoAdapter<RespInfo> {
            C18064b() {
                super(FieldEncoding.LENGTH_DELIMITED, RespInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(RespInfo respInfo) {
                int i;
                int encodedSizeWithTag = ShareTarget.ADAPTER.encodedSizeWithTag(1, respInfo.share_target) + ProtoAdapter.STRING.encodedSizeWithTag(2, respInfo.message_id);
                if (respInfo.thread_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, respInfo.thread_id);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + respInfo.unknownFields().size();
            }

            /* renamed from: a */
            public RespInfo decode(ProtoReader protoReader) throws IOException {
                C18063a aVar = new C18063a();
                aVar.f45189b = "";
                aVar.f45190c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45188a = ShareTarget.ADAPTER.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f45189b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45190c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, RespInfo respInfo) throws IOException {
                ShareTarget.ADAPTER.encodeWithTag(protoWriter, 1, respInfo.share_target);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, respInfo.message_id);
                if (respInfo.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, respInfo.thread_id);
                }
                protoWriter.writeBytes(respInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18063a newBuilder() {
            C18063a aVar = new C18063a();
            aVar.f45188a = this.share_target;
            aVar.f45189b = this.message_id;
            aVar.f45190c = this.thread_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareAsMessageResponse$RespInfo$a */
        public static final class C18063a extends Message.Builder<RespInfo, C18063a> {

            /* renamed from: a */
            public ShareTarget f45188a;

            /* renamed from: b */
            public String f45189b;

            /* renamed from: c */
            public String f45190c;

            /* renamed from: a */
            public RespInfo build() {
                String str;
                ShareTarget shareTarget = this.f45188a;
                if (shareTarget != null && (str = this.f45189b) != null) {
                    return new RespInfo(shareTarget, str, this.f45190c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(shareTarget, "share_target", this.f45189b, "message_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "RespInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", share_target=");
            sb.append(this.share_target);
            sb.append(", message_id=");
            sb.append(this.message_id);
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            StringBuilder replace = sb.replace(0, 2, "RespInfo{");
            replace.append('}');
            return replace.toString();
        }

        public RespInfo(ShareTarget shareTarget, String str, String str2) {
            this(shareTarget, str, str2, ByteString.EMPTY);
        }

        public RespInfo(ShareTarget shareTarget, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.share_target = shareTarget;
            this.message_id = str;
            this.thread_id = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAsMessageResponse$b */
    private static final class C18066b extends ProtoAdapter<ShareAsMessageResponse> {
        C18066b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAsMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAsMessageResponse shareAsMessageResponse) {
            return RespInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, shareAsMessageResponse.resp_info) + shareAsMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAsMessageResponse decode(ProtoReader protoReader) throws IOException {
            C18065a aVar = new C18065a();
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
                    aVar.f45191a.add(RespInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAsMessageResponse shareAsMessageResponse) throws IOException {
            RespInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shareAsMessageResponse.resp_info);
            protoWriter.writeBytes(shareAsMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareAsMessageResponse$a */
    public static final class C18065a extends Message.Builder<ShareAsMessageResponse, C18065a> {

        /* renamed from: a */
        public List<RespInfo> f45191a = Internal.newMutableList();

        /* renamed from: a */
        public ShareAsMessageResponse build() {
            return new ShareAsMessageResponse(this.f45191a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18065a newBuilder() {
        C18065a aVar = new C18065a();
        aVar.f45191a = Internal.copyOf("resp_info", this.resp_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareAsMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.resp_info.isEmpty()) {
            sb.append(", resp_info=");
            sb.append(this.resp_info);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareAsMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAsMessageResponse(List<RespInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public ShareAsMessageResponse(List<RespInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resp_info = Internal.immutableCopyOf("resp_info", list);
    }
}
