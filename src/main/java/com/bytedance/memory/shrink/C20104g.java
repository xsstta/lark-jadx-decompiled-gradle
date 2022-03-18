package com.bytedance.memory.shrink;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: com.bytedance.memory.shrink.g */
public class C20104g extends C20103f {

    /* renamed from: b */
    public final OutputStream f49080b;

    /* renamed from: c */
    public int f49081c;

    /* renamed from: d */
    public final ByteArrayOutputStream f49082d = new ByteArrayOutputStream();

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68203a(int i, int i2, C20101d[] dVarArr, int i3, long j) {
    }

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68205a(C20101d dVar, C20101d dVar2, C20101d dVar3, C20101d dVar4, int i, int i2, int i3, long j) {
    }

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68201a() {
        try {
            this.f49080b.flush();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.memory.shrink.g$a */
    public class C20105a extends C20100c {

        /* renamed from: c */
        private final int f49084c;

        /* renamed from: d */
        private final int f49085d;

        /* renamed from: e */
        private final long f49086e;

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68182a() {
            try {
                C20104g.this.f49080b.write(this.f49084c);
                C20104g.this.f49080b.write(C20104g.this.f49082d.toByteArray());
                C20104g.this.f49082d.reset();
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68185a(C20101d dVar, int i) {
            try {
                C20104g.this.f49082d.write(4);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: b */
        public void mo68191b(C20101d dVar, int i) {
            try {
                C20104g.this.f49082d.write(6);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: b */
        public void mo68190b(int i, C20101d dVar) {
            try {
                C20104g.this.f49082d.write(i);
                C20104g.this.f49082d.write(dVar.mo68195a());
                if (i == 1) {
                    C20106h.m73411b(C20104g.this.f49082d, (long) C20104g.this.f49081c);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68183a(int i, C20101d dVar) {
            try {
                C20104g.this.f49082d.write(254);
                C20106h.m73410b((OutputStream) C20104g.this.f49082d, i);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: c */
        public void mo68193c(C20101d dVar, int i, int i2) {
            try {
                C20104g.this.f49082d.write(8);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: d */
        public void mo68194d(C20101d dVar, int i, int i2) {
            try {
                C20104g.this.f49082d.write(142);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: b */
        public void mo68192b(C20101d dVar, int i, int i2) {
            try {
                C20104g.this.f49082d.write(3);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68186a(C20101d dVar, int i, int i2) {
            try {
                C20104g.this.f49082d.write(2);
                C20104g.this.f49082d.write(dVar.mo68195a());
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        C20105a(int i, int i2, long j) {
            super(null);
            this.f49084c = i;
            this.f49085d = i2;
            this.f49086e = j;
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68189a(C20101d dVar, int i, C20101d dVar2, byte[] bArr) {
            try {
                C20104g.this.f49082d.write(33);
                C20104g.this.f49082d.write(dVar.mo68195a());
                C20104g.this.f49082d.write(dVar2.mo68195a());
                C20106h.m73410b((OutputStream) C20104g.this.f49082d, bArr.length);
                C20104g.this.f49082d.write(bArr);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68187a(C20101d dVar, int i, int i2, C20101d dVar2, byte[] bArr) {
            try {
                C20104g.this.f49082d.write(34);
                C20104g.this.f49082d.write(dVar.mo68195a());
                C20106h.m73410b((OutputStream) C20104g.this.f49082d, i2);
                C20104g.this.f49082d.write(dVar2.mo68195a());
                C20104g.this.f49082d.write(bArr, 0, i2 * C20104g.this.f49081c);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68184a(int i, C20101d dVar, int i2, int i3, int i4, byte[] bArr) {
            try {
                C20104g.this.f49082d.write(i);
                C20104g.this.f49082d.write(dVar.mo68195a());
                C20106h.m73410b((OutputStream) C20104g.this.f49082d, i3);
                C20104g.this.f49082d.write(i4);
                BaseType type = BaseType.getType(i4);
                if (type != BaseType.CHAR && type != BaseType.BYTE) {
                    C20106h.m73411b(C20104g.this.f49082d, (long) (i3 * BaseType.getType(i4).getSize(C20104g.this.f49081c)));
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }

        @Override // com.bytedance.memory.shrink.C20100c
        /* renamed from: a */
        public void mo68188a(C20101d dVar, int i, C20101d dVar2, C20101d dVar3, int i2, C20099b[] bVarArr, C20099b[] bVarArr2) {
            try {
                C20104g.this.f49082d.write(32);
                C20104g.this.f49082d.write(dVar.mo68195a());
                C20104g.this.f49082d.write(dVar2.mo68195a());
                C20104g.this.f49082d.write(dVar3.mo68195a());
                C20106h.m73411b(C20104g.this.f49082d, (long) (C20104g.this.f49081c << 1));
                C20106h.m73403a((OutputStream) C20104g.this.f49082d, i2);
                C20106h.m73403a((OutputStream) C20104g.this.f49082d, 0);
                C20106h.m73403a((OutputStream) C20104g.this.f49082d, bVarArr.length);
                for (C20099b bVar : bVarArr) {
                    C20106h.m73405a((OutputStream) C20104g.this.f49082d, bVar.f49073b);
                    C20104g.this.f49082d.write(bVar.f49072a);
                    C20106h.m73406a(C20104g.this.f49082d, bVar.f49074c);
                }
                C20106h.m73403a((OutputStream) C20104g.this.f49082d, bVarArr2.length);
                for (C20099b bVar2 : bVarArr2) {
                    C20106h.m73405a((OutputStream) C20104g.this.f49082d, bVar2.f49073b);
                    C20104g.this.f49082d.write(bVar2.f49072a);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    public C20104g(OutputStream outputStream) {
        super(null);
        this.f49080b = outputStream;
    }

    /* renamed from: b */
    public C20105a mo68200a(int i, int i2, long j) {
        try {
            return new C20105a(i, i2, j);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68207a(String str, int i, long j) {
        try {
            this.f49081c = i;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68202a(int i, int i2, long j, byte[] bArr) {
        if (i == 44) {
            try {
                this.f49080b.write(i);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
    }

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68206a(C20101d dVar, String str, int i, long j) {
        try {
            this.f49080b.write(1);
            C20106h.m73403a(this.f49080b, (int) j);
            this.f49080b.write(dVar.mo68195a());
            C20106h.m73407a(this.f49080b, str);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // com.bytedance.memory.shrink.C20103f
    /* renamed from: a */
    public void mo68204a(int i, C20101d dVar, int i2, C20101d dVar2, int i3, long j) {
        try {
            this.f49080b.write(2);
            this.f49080b.write(dVar.mo68195a());
            this.f49080b.write(dVar2.mo68195a());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
