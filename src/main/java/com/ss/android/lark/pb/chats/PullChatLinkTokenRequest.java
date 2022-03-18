package com.ss.android.lark.pb.chats;

import com.google.protobuf.server.FieldOptions;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class PullChatLinkTokenRequest extends Message<PullChatLinkTokenRequest, C49588a> {
    public static final ProtoAdapter<PullChatLinkTokenRequest> ADAPTER = new C49589b();
    public static final Integer DEFAULT_EXPIRED_DAY = 7;
    public static final Boolean DEFAULT_IS_UNLIMITED = false;
    public static final FieldOptions FIELD_OPTIONS_MCHAT_ID = new FieldOptions.C23155a().mo80350a("split,type=channel").build();
    private static final long serialVersionUID = 0;
    public final String mapp_name;
    public final String mchat_id;
    public final Integer mexpired_day;
    public final Boolean mis_unlimited;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatLinkTokenRequest$b */
    private static final class C49589b extends ProtoAdapter<PullChatLinkTokenRequest> {
        C49589b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatLinkTokenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatLinkTokenRequest pullChatLinkTokenRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pullChatLinkTokenRequest.mchat_id);
            int i3 = 0;
            if (pullChatLinkTokenRequest.mexpired_day != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pullChatLinkTokenRequest.mexpired_day);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (pullChatLinkTokenRequest.mapp_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullChatLinkTokenRequest.mapp_name);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (pullChatLinkTokenRequest.mis_unlimited != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, pullChatLinkTokenRequest.mis_unlimited);
            }
            return i5 + i3 + pullChatLinkTokenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatLinkTokenRequest decode(ProtoReader protoReader) throws IOException {
            C49588a aVar = new C49588a();
            aVar.f124204a = "";
            aVar.f124205b = 7;
            aVar.f124206c = "";
            aVar.f124207d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124204a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124205b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124206c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124207d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatLinkTokenRequest pullChatLinkTokenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullChatLinkTokenRequest.mchat_id);
            if (pullChatLinkTokenRequest.mexpired_day != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pullChatLinkTokenRequest.mexpired_day);
            }
            if (pullChatLinkTokenRequest.mapp_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullChatLinkTokenRequest.mapp_name);
            }
            if (pullChatLinkTokenRequest.mis_unlimited != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, pullChatLinkTokenRequest.mis_unlimited);
            }
            protoWriter.writeBytes(pullChatLinkTokenRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49588a newBuilder() {
        C49588a aVar = new C49588a();
        aVar.f124204a = this.mchat_id;
        aVar.f124205b = this.mexpired_day;
        aVar.f124206c = this.mapp_name;
        aVar.f124207d = this.mis_unlimited;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatLinkTokenRequest$a */
    public static final class C49588a extends Message.Builder<PullChatLinkTokenRequest, C49588a> {

        /* renamed from: a */
        public String f124204a;

        /* renamed from: b */
        public Integer f124205b;

        /* renamed from: c */
        public String f124206c;

        /* renamed from: d */
        public Boolean f124207d;

        /* renamed from: a */
        public PullChatLinkTokenRequest build() {
            String str = this.f124204a;
            if (str != null) {
                return new PullChatLinkTokenRequest(str, this.f124205b, this.f124206c, this.f124207d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mchat_id");
        }

        /* renamed from: a */
        public C49588a mo172896a(Boolean bool) {
            this.f124207d = bool;
            return this;
        }

        /* renamed from: b */
        public C49588a mo172900b(String str) {
            this.f124206c = str;
            return this;
        }

        /* renamed from: a */
        public C49588a mo172897a(Integer num) {
            this.f124205b = num;
            return this;
        }

        /* renamed from: a */
        public C49588a mo172898a(String str) {
            this.f124204a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.mchat_id);
        if (this.mexpired_day != null) {
            sb.append(", expired_day=");
            sb.append(this.mexpired_day);
        }
        if (this.mapp_name != null) {
            sb.append(", app_name=");
            sb.append(this.mapp_name);
        }
        if (this.mis_unlimited != null) {
            sb.append(", is_unlimited=");
            sb.append(this.mis_unlimited);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatLinkTokenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatLinkTokenRequest(String str, Integer num, String str2, Boolean bool) {
        this(str, num, str2, bool, ByteString.EMPTY);
    }

    public PullChatLinkTokenRequest(String str, Integer num, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.mexpired_day = num;
        this.mapp_name = str2;
        this.mis_unlimited = bool;
    }
}
