package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UniversalUserSetting extends Message<UniversalUserSetting, C15418a> {
    public static final ProtoAdapter<UniversalUserSetting> ADAPTER = new C15419b();
    public static final Boolean DEFAULT_BOOL_VALUE = false;
    public static final Long DEFAULT_INT_VALUE = 0L;
    public static final Boolean DEFAULT_IS_DEFAULT = false;
    private static final long serialVersionUID = 0;
    public final Boolean bool_value;
    public final Long int_value;
    public final Boolean is_default;
    public final String key;
    public final String str_value;

    /* renamed from: com.bytedance.lark.pb.basic.v1.UniversalUserSetting$b */
    private static final class C15419b extends ProtoAdapter<UniversalUserSetting> {
        C15419b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalUserSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalUserSetting universalUserSetting) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, universalUserSetting.key);
            int i4 = 0;
            if (universalUserSetting.is_default != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, universalUserSetting.is_default);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (universalUserSetting.int_value != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, universalUserSetting.int_value);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (universalUserSetting.str_value != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, universalUserSetting.str_value);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (universalUserSetting.bool_value != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, universalUserSetting.bool_value);
            }
            return i7 + i4 + universalUserSetting.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalUserSetting decode(ProtoReader protoReader) throws IOException {
            C15418a aVar = new C15418a();
            aVar.f40798a = "";
            aVar.f40799b = false;
            aVar.mo55922a((Long) 0L);
            aVar.mo55925b("");
            aVar.mo55921a((Boolean) false);
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40798a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40799b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.mo55922a(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.mo55925b(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo55921a(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalUserSetting universalUserSetting) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, universalUserSetting.key);
            if (universalUserSetting.is_default != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, universalUserSetting.is_default);
            }
            if (universalUserSetting.int_value != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, universalUserSetting.int_value);
            }
            if (universalUserSetting.str_value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, universalUserSetting.str_value);
            }
            if (universalUserSetting.bool_value != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, universalUserSetting.bool_value);
            }
            protoWriter.writeBytes(universalUserSetting.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.UniversalUserSetting$a */
    public static final class C15418a extends Message.Builder<UniversalUserSetting, C15418a> {

        /* renamed from: a */
        public String f40798a;

        /* renamed from: b */
        public Boolean f40799b;

        /* renamed from: c */
        public Long f40800c;

        /* renamed from: d */
        public String f40801d;

        /* renamed from: e */
        public Boolean f40802e;

        /* renamed from: a */
        public UniversalUserSetting build() {
            String str = this.f40798a;
            if (str != null) {
                return new UniversalUserSetting(str, this.f40799b, this.f40800c, this.f40801d, this.f40802e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }

        /* renamed from: a */
        public C15418a mo55923a(String str) {
            this.f40798a = str;
            return this;
        }

        /* renamed from: a */
        public C15418a mo55921a(Boolean bool) {
            this.f40802e = bool;
            this.f40800c = null;
            this.f40801d = null;
            return this;
        }

        /* renamed from: b */
        public C15418a mo55925b(String str) {
            this.f40801d = str;
            this.f40800c = null;
            this.f40802e = null;
            return this;
        }

        /* renamed from: a */
        public C15418a mo55922a(Long l) {
            this.f40800c = l;
            this.f40801d = null;
            this.f40802e = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15418a newBuilder() {
        C15418a aVar = new C15418a();
        aVar.f40798a = this.key;
        aVar.f40799b = this.is_default;
        aVar.f40800c = this.int_value;
        aVar.f40801d = this.str_value;
        aVar.f40802e = this.bool_value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "UniversalUserSetting");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (this.is_default != null) {
            sb.append(", is_default=");
            sb.append(this.is_default);
        }
        if (this.int_value != null) {
            sb.append(", int_value=");
            sb.append(this.int_value);
        }
        if (this.str_value != null) {
            sb.append(", str_value=");
            sb.append(this.str_value);
        }
        if (this.bool_value != null) {
            sb.append(", bool_value=");
            sb.append(this.bool_value);
        }
        StringBuilder replace = sb.replace(0, 2, "UniversalUserSetting{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalUserSetting(String str, Boolean bool, Long l, String str2, Boolean bool2) {
        this(str, bool, l, str2, bool2, ByteString.EMPTY);
    }

    public UniversalUserSetting(String str, Boolean bool, Long l, String str2, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(l, str2, bool2) <= 1) {
            this.key = str;
            this.is_default = bool;
            this.int_value = l;
            this.str_value = str2;
            this.bool_value = bool2;
            return;
        }
        throw new IllegalArgumentException("at most one of int_value, str_value, bool_value may be non-null");
    }
}
