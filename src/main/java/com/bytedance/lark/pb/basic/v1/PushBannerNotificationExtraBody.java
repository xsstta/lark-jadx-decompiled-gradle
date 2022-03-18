package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushBannerNotificationExtraBody extends Message<PushBannerNotificationExtraBody, C15129a> {
    public static final ProtoAdapter<PushBannerNotificationExtraBody> ADAPTER = new C15130b();
    private static final long serialVersionUID = 0;
    public final String content;
    public final String extra;
    public final String subtitle;
    public final String title;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushBannerNotificationExtraBody$b */
    private static final class C15130b extends ProtoAdapter<PushBannerNotificationExtraBody> {
        C15130b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushBannerNotificationExtraBody.class);
        }

        /* renamed from: a */
        public int encodedSize(PushBannerNotificationExtraBody pushBannerNotificationExtraBody) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushBannerNotificationExtraBody.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushBannerNotificationExtraBody.title);
            } else {
                i = 0;
            }
            if (pushBannerNotificationExtraBody.subtitle != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushBannerNotificationExtraBody.subtitle);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pushBannerNotificationExtraBody.content != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushBannerNotificationExtraBody.content);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pushBannerNotificationExtraBody.extra != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushBannerNotificationExtraBody.extra);
            }
            return i6 + i4 + pushBannerNotificationExtraBody.unknownFields().size();
        }

        /* renamed from: a */
        public PushBannerNotificationExtraBody decode(ProtoReader protoReader) throws IOException {
            C15129a aVar = new C15129a();
            aVar.f40105a = "";
            aVar.f40106b = "";
            aVar.f40107c = "";
            aVar.f40108d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40105a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40106b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40107c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40108d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushBannerNotificationExtraBody pushBannerNotificationExtraBody) throws IOException {
            if (pushBannerNotificationExtraBody.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushBannerNotificationExtraBody.title);
            }
            if (pushBannerNotificationExtraBody.subtitle != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushBannerNotificationExtraBody.subtitle);
            }
            if (pushBannerNotificationExtraBody.content != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushBannerNotificationExtraBody.content);
            }
            if (pushBannerNotificationExtraBody.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushBannerNotificationExtraBody.extra);
            }
            protoWriter.writeBytes(pushBannerNotificationExtraBody.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PushBannerNotificationExtraBody$a */
    public static final class C15129a extends Message.Builder<PushBannerNotificationExtraBody, C15129a> {

        /* renamed from: a */
        public String f40105a;

        /* renamed from: b */
        public String f40106b;

        /* renamed from: c */
        public String f40107c;

        /* renamed from: d */
        public String f40108d;

        /* renamed from: a */
        public PushBannerNotificationExtraBody build() {
            return new PushBannerNotificationExtraBody(this.f40105a, this.f40106b, this.f40107c, this.f40108d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15129a newBuilder() {
        C15129a aVar = new C15129a();
        aVar.f40105a = this.title;
        aVar.f40106b = this.subtitle;
        aVar.f40107c = this.content;
        aVar.f40108d = this.extra;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PushBannerNotificationExtraBody");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "PushBannerNotificationExtraBody{");
        replace.append('}');
        return replace.toString();
    }

    public PushBannerNotificationExtraBody(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public PushBannerNotificationExtraBody(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.subtitle = str2;
        this.content = str3;
        this.extra = str4;
    }
}
