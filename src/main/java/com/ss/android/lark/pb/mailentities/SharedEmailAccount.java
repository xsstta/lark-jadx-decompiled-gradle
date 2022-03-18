package com.ss.android.lark.pb.mailentities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SharedEmailAccount extends Message<SharedEmailAccount, C49825a> {
    public static final ProtoAdapter<SharedEmailAccount> ADAPTER = new C49826b();
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String maccess_token;
    public final String memail_address;
    public final String memail_name;
    public final Long muser_id;

    /* renamed from: com.ss.android.lark.pb.mailentities.SharedEmailAccount$b */
    private static final class C49826b extends ProtoAdapter<SharedEmailAccount> {
        C49826b() {
            super(FieldEncoding.LENGTH_DELIMITED, SharedEmailAccount.class);
        }

        /* renamed from: a */
        public int encodedSize(SharedEmailAccount sharedEmailAccount) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (sharedEmailAccount.muser_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, sharedEmailAccount.muser_id);
            } else {
                i = 0;
            }
            if (sharedEmailAccount.memail_address != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sharedEmailAccount.memail_address);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (sharedEmailAccount.memail_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sharedEmailAccount.memail_name);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (sharedEmailAccount.maccess_token != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, sharedEmailAccount.maccess_token);
            }
            return i6 + i4 + sharedEmailAccount.unknownFields().size();
        }

        /* renamed from: a */
        public SharedEmailAccount decode(ProtoReader protoReader) throws IOException {
            C49825a aVar = new C49825a();
            aVar.f124773a = 0L;
            aVar.f124774b = "";
            aVar.f124775c = "";
            aVar.f124776d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124773a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124774b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124775c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124776d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SharedEmailAccount sharedEmailAccount) throws IOException {
            if (sharedEmailAccount.muser_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sharedEmailAccount.muser_id);
            }
            if (sharedEmailAccount.memail_address != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sharedEmailAccount.memail_address);
            }
            if (sharedEmailAccount.memail_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sharedEmailAccount.memail_name);
            }
            if (sharedEmailAccount.maccess_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sharedEmailAccount.maccess_token);
            }
            protoWriter.writeBytes(sharedEmailAccount.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mailentities.SharedEmailAccount$a */
    public static final class C49825a extends Message.Builder<SharedEmailAccount, C49825a> {

        /* renamed from: a */
        public Long f124773a;

        /* renamed from: b */
        public String f124774b;

        /* renamed from: c */
        public String f124775c;

        /* renamed from: d */
        public String f124776d;

        /* renamed from: a */
        public SharedEmailAccount build() {
            return new SharedEmailAccount(this.f124773a, this.f124774b, this.f124775c, this.f124776d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49825a mo173402a(Long l) {
            this.f124773a = l;
            return this;
        }

        /* renamed from: b */
        public C49825a mo173405b(String str) {
            this.f124775c = str;
            return this;
        }

        /* renamed from: c */
        public C49825a mo173406c(String str) {
            this.f124776d = str;
            return this;
        }

        /* renamed from: a */
        public C49825a mo173403a(String str) {
            this.f124774b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49825a newBuilder() {
        C49825a aVar = new C49825a();
        aVar.f124773a = this.muser_id;
        aVar.f124774b = this.memail_address;
        aVar.f124775c = this.memail_name;
        aVar.f124776d = this.maccess_token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.muser_id != null) {
            sb.append(", user_id=");
            sb.append(this.muser_id);
        }
        if (this.memail_address != null) {
            sb.append(", email_address=");
            sb.append(this.memail_address);
        }
        if (this.memail_name != null) {
            sb.append(", email_name=");
            sb.append(this.memail_name);
        }
        if (this.maccess_token != null) {
            sb.append(", access_token=");
            sb.append(this.maccess_token);
        }
        StringBuilder replace = sb.replace(0, 2, "SharedEmailAccount{");
        replace.append('}');
        return replace.toString();
    }

    public SharedEmailAccount(Long l, String str, String str2, String str3) {
        this(l, str, str2, str3, ByteString.EMPTY);
    }

    public SharedEmailAccount(Long l, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = l;
        this.memail_address = str;
        this.memail_name = str2;
        this.maccess_token = str3;
    }
}
