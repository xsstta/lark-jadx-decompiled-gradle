package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetNewestPoliciesResponse extends Message<GetNewestPoliciesResponse, C14983a> {
    public static final ProtoAdapter<GetNewestPoliciesResponse> ADAPTER = new C14984b();
    public static final Boolean DEFAULT_HAS_UPDATED = false;
    public static final Boolean DEFAULT_NEED_SIGN = false;
    private static final long serialVersionUID = 0;
    public final RichText display_content;
    public final Boolean has_updated;
    public final Boolean need_sign;
    public final String privacy;
    public final String terms;
    public final String title;
    public final String version;

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewestPoliciesResponse$b */
    private static final class C14984b extends ProtoAdapter<GetNewestPoliciesResponse> {
        C14984b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNewestPoliciesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNewestPoliciesResponse getNewestPoliciesResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (getNewestPoliciesResponse.need_sign != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, getNewestPoliciesResponse.need_sign);
            } else {
                i = 0;
            }
            if (getNewestPoliciesResponse.version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getNewestPoliciesResponse.version);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (getNewestPoliciesResponse.title != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, getNewestPoliciesResponse.title);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (getNewestPoliciesResponse.display_content != null) {
                i4 = RichText.ADAPTER.encodedSizeWithTag(4, getNewestPoliciesResponse.display_content);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (getNewestPoliciesResponse.has_updated != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, getNewestPoliciesResponse.has_updated);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (getNewestPoliciesResponse.terms != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, getNewestPoliciesResponse.terms);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (getNewestPoliciesResponse.privacy != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, getNewestPoliciesResponse.privacy);
            }
            return i12 + i7 + getNewestPoliciesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNewestPoliciesResponse decode(ProtoReader protoReader) throws IOException {
            C14983a aVar = new C14983a();
            aVar.f39646a = false;
            aVar.f39647b = "";
            aVar.f39648c = "";
            aVar.f39650e = false;
            aVar.f39651f = "";
            aVar.f39652g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f39646a = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            aVar.f39647b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f39648c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f39649d = RichText.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f39650e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f39651f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f39652g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNewestPoliciesResponse getNewestPoliciesResponse) throws IOException {
            if (getNewestPoliciesResponse.need_sign != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getNewestPoliciesResponse.need_sign);
            }
            if (getNewestPoliciesResponse.version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getNewestPoliciesResponse.version);
            }
            if (getNewestPoliciesResponse.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getNewestPoliciesResponse.title);
            }
            if (getNewestPoliciesResponse.display_content != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 4, getNewestPoliciesResponse.display_content);
            }
            if (getNewestPoliciesResponse.has_updated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getNewestPoliciesResponse.has_updated);
            }
            if (getNewestPoliciesResponse.terms != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getNewestPoliciesResponse.terms);
            }
            if (getNewestPoliciesResponse.privacy != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, getNewestPoliciesResponse.privacy);
            }
            protoWriter.writeBytes(getNewestPoliciesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.GetNewestPoliciesResponse$a */
    public static final class C14983a extends Message.Builder<GetNewestPoliciesResponse, C14983a> {

        /* renamed from: a */
        public Boolean f39646a;

        /* renamed from: b */
        public String f39647b;

        /* renamed from: c */
        public String f39648c;

        /* renamed from: d */
        public RichText f39649d;

        /* renamed from: e */
        public Boolean f39650e;

        /* renamed from: f */
        public String f39651f;

        /* renamed from: g */
        public String f39652g;

        /* renamed from: a */
        public GetNewestPoliciesResponse build() {
            return new GetNewestPoliciesResponse(this.f39646a, this.f39647b, this.f39648c, this.f39649d, this.f39650e, this.f39651f, this.f39652g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14983a newBuilder() {
        C14983a aVar = new C14983a();
        aVar.f39646a = this.need_sign;
        aVar.f39647b = this.version;
        aVar.f39648c = this.title;
        aVar.f39649d = this.display_content;
        aVar.f39650e = this.has_updated;
        aVar.f39651f = this.terms;
        aVar.f39652g = this.privacy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "GetNewestPoliciesResponse");
        StringBuilder sb = new StringBuilder();
        if (this.need_sign != null) {
            sb.append(", need_sign=");
            sb.append(this.need_sign);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.display_content != null) {
            sb.append(", display_content=");
            sb.append(this.display_content);
        }
        if (this.has_updated != null) {
            sb.append(", has_updated=");
            sb.append(this.has_updated);
        }
        if (this.terms != null) {
            sb.append(", terms=");
            sb.append(this.terms);
        }
        if (this.privacy != null) {
            sb.append(", privacy=");
            sb.append(this.privacy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNewestPoliciesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNewestPoliciesResponse(Boolean bool, String str, String str2, RichText richText, Boolean bool2, String str3, String str4) {
        this(bool, str, str2, richText, bool2, str3, str4, ByteString.EMPTY);
    }

    public GetNewestPoliciesResponse(Boolean bool, String str, String str2, RichText richText, Boolean bool2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.need_sign = bool;
        this.version = str;
        this.title = str2;
        this.display_content = richText;
        this.has_updated = bool2;
        this.terms = str3;
        this.privacy = str4;
    }
}
