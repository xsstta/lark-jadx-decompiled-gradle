package com.google.protobuf;

import com.huawei.hms.android.HwBuildEx;

/* access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.u */
public final class C23197u {

    /* access modifiers changed from: private */
    /* renamed from: com.google.protobuf.u$a */
    public interface AbstractC23199a {
        /* renamed from: a */
        byte mo80461a(int i);

        /* renamed from: a */
        int mo80462a();
    }

    /* renamed from: a */
    static String m83983a(final ByteString byteString) {
        return m83984a(new AbstractC23199a() {
            /* class com.google.protobuf.C23197u.C231981 */

            @Override // com.google.protobuf.C23197u.AbstractC23199a
            /* renamed from: a */
            public int mo80462a() {
                return byteString.size();
            }

            @Override // com.google.protobuf.C23197u.AbstractC23199a
            /* renamed from: a */
            public byte mo80461a(int i) {
                return byteString.byteAt(i);
            }
        });
    }

    /* renamed from: a */
    static String m83985a(String str) {
        return m83983a(ByteString.copyFromUtf8(str));
    }

    /* renamed from: a */
    static String m83984a(AbstractC23199a aVar) {
        StringBuilder sb = new StringBuilder(aVar.mo80462a());
        for (int i = 0; i < aVar.mo80462a(); i++) {
            byte a = aVar.mo80461a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            continue;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
