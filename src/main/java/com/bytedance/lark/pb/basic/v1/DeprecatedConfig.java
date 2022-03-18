package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeprecatedConfig extends Message<DeprecatedConfig, C14862a> {
    public static final ProtoAdapter<DeprecatedConfig> ADAPTER = new C14863b();
    public static final Boolean DEFAULT_ENABLE_VERBOSE_DBG_INFO = false;
    public static final Boolean DEFAULT_USE_DEPRECATED_PUSH_MSG = true;
    public static final Boolean DEFAULT_USE_DEPRECATED_USER_LST = true;
    private static final long serialVersionUID = 0;
    public final Boolean enable_verbose_dbg_info;
    public final Boolean use_deprecated_push_msg;
    public final Boolean use_deprecated_user_lst;

    /* renamed from: com.bytedance.lark.pb.basic.v1.DeprecatedConfig$b */
    private static final class C14863b extends ProtoAdapter<DeprecatedConfig> {
        C14863b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeprecatedConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(DeprecatedConfig deprecatedConfig) {
            int i;
            int i2;
            int i3 = 0;
            if (deprecatedConfig.use_deprecated_push_msg != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, deprecatedConfig.use_deprecated_push_msg);
            } else {
                i = 0;
            }
            if (deprecatedConfig.use_deprecated_user_lst != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, deprecatedConfig.use_deprecated_user_lst);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (deprecatedConfig.enable_verbose_dbg_info != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, deprecatedConfig.enable_verbose_dbg_info);
            }
            return i4 + i3 + deprecatedConfig.unknownFields().size();
        }

        /* renamed from: a */
        public DeprecatedConfig decode(ProtoReader protoReader) throws IOException {
            C14862a aVar = new C14862a();
            aVar.f39300a = true;
            aVar.f39301b = true;
            aVar.f39302c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39300a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f39301b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39302c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeprecatedConfig deprecatedConfig) throws IOException {
            if (deprecatedConfig.use_deprecated_push_msg != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, deprecatedConfig.use_deprecated_push_msg);
            }
            if (deprecatedConfig.use_deprecated_user_lst != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, deprecatedConfig.use_deprecated_user_lst);
            }
            if (deprecatedConfig.enable_verbose_dbg_info != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, deprecatedConfig.enable_verbose_dbg_info);
            }
            protoWriter.writeBytes(deprecatedConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.DeprecatedConfig$a */
    public static final class C14862a extends Message.Builder<DeprecatedConfig, C14862a> {

        /* renamed from: a */
        public Boolean f39300a;

        /* renamed from: b */
        public Boolean f39301b;

        /* renamed from: c */
        public Boolean f39302c;

        /* renamed from: a */
        public DeprecatedConfig build() {
            return new DeprecatedConfig(this.f39300a, this.f39301b, this.f39302c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C14862a mo54505a(Boolean bool) {
            this.f39301b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C14862a newBuilder() {
        C14862a aVar = new C14862a();
        aVar.f39300a = this.use_deprecated_push_msg;
        aVar.f39301b = this.use_deprecated_user_lst;
        aVar.f39302c = this.enable_verbose_dbg_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "DeprecatedConfig");
        StringBuilder sb = new StringBuilder();
        if (this.use_deprecated_push_msg != null) {
            sb.append(", use_deprecated_push_msg=");
            sb.append(this.use_deprecated_push_msg);
        }
        if (this.use_deprecated_user_lst != null) {
            sb.append(", use_deprecated_user_lst=");
            sb.append(this.use_deprecated_user_lst);
        }
        if (this.enable_verbose_dbg_info != null) {
            sb.append(", enable_verbose_dbg_info=");
            sb.append(this.enable_verbose_dbg_info);
        }
        StringBuilder replace = sb.replace(0, 2, "DeprecatedConfig{");
        replace.append('}');
        return replace.toString();
    }

    public DeprecatedConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public DeprecatedConfig(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.use_deprecated_push_msg = bool;
        this.use_deprecated_user_lst = bool2;
        this.enable_verbose_dbg_info = bool3;
    }
}
