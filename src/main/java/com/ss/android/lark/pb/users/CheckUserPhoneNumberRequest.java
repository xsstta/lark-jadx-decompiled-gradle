package com.ss.android.lark.pb.users;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckUserPhoneNumberRequest extends Message<CheckUserPhoneNumberRequest, C50260a> {
    public static final ProtoAdapter<CheckUserPhoneNumberRequest> ADAPTER = new C50261b();
    public static final Long DEFAULT_TARGET_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final Long mtarget_user_id;

    /* renamed from: com.ss.android.lark.pb.users.CheckUserPhoneNumberRequest$b */
    private static final class C50261b extends ProtoAdapter<CheckUserPhoneNumberRequest> {
        C50261b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckUserPhoneNumberRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckUserPhoneNumberRequest checkUserPhoneNumberRequest) {
            int i;
            if (checkUserPhoneNumberRequest.mtarget_user_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, checkUserPhoneNumberRequest.mtarget_user_id);
            } else {
                i = 0;
            }
            return i + checkUserPhoneNumberRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckUserPhoneNumberRequest decode(ProtoReader protoReader) throws IOException {
            C50260a aVar = new C50260a();
            aVar.f125607a = 0L;
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
                    aVar.f125607a = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckUserPhoneNumberRequest checkUserPhoneNumberRequest) throws IOException {
            if (checkUserPhoneNumberRequest.mtarget_user_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, checkUserPhoneNumberRequest.mtarget_user_id);
            }
            protoWriter.writeBytes(checkUserPhoneNumberRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.users.CheckUserPhoneNumberRequest$a */
    public static final class C50260a extends Message.Builder<CheckUserPhoneNumberRequest, C50260a> {

        /* renamed from: a */
        public Long f125607a;

        /* renamed from: a */
        public CheckUserPhoneNumberRequest build() {
            return new CheckUserPhoneNumberRequest(this.f125607a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50260a mo174389a(Long l) {
            this.f125607a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50260a newBuilder() {
        C50260a aVar = new C50260a();
        aVar.f125607a = this.mtarget_user_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtarget_user_id != null) {
            sb.append(", target_user_id=");
            sb.append(this.mtarget_user_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckUserPhoneNumberRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckUserPhoneNumberRequest(Long l) {
        this(l, ByteString.EMPTY);
    }

    public CheckUserPhoneNumberRequest(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtarget_user_id = l;
    }
}
