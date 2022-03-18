package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2266d;
import com.bumptech.glide.load.C2267e;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.bitmap.C2416aa;
import com.bumptech.glide.load.resource.bitmap.C2432i;
import com.bumptech.glide.load.resource.bitmap.C2433j;
import com.bumptech.glide.load.resource.bitmap.C2439m;
import com.bumptech.glide.load.resource.bitmap.C2441o;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.p093d.C2468c;
import com.bumptech.glide.load.resource.p093d.C2472f;
import com.bumptech.glide.load.resource.p093d.C2479i;
import com.bumptech.glide.p082c.C2119c;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.util.C2557b;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.Map;

/* renamed from: com.bumptech.glide.request.a */
public abstract class AbstractC2510a<T extends AbstractC2510a<T>> implements Cloneable {

    /* renamed from: a */
    private int f8142a;

    /* renamed from: b */
    private float f8143b = 1.0f;

    /* renamed from: c */
    private AbstractC2354j f8144c = AbstractC2354j.f7815e;

    /* renamed from: d */
    private Priority f8145d = Priority.NORMAL;

    /* renamed from: e */
    private Drawable f8146e;

    /* renamed from: f */
    private int f8147f;

    /* renamed from: g */
    private Drawable f8148g;

    /* renamed from: h */
    private int f8149h;

    /* renamed from: i */
    private boolean f8150i = true;

    /* renamed from: j */
    private int f8151j = -1;

    /* renamed from: k */
    private int f8152k = -1;

    /* renamed from: l */
    private AbstractC2265c f8153l = C2119c.m9172a();

    /* renamed from: m */
    private boolean f8154m;

    /* renamed from: n */
    private boolean f8155n = true;

    /* renamed from: o */
    private Drawable f8156o;

    /* renamed from: p */
    private int f8157p;

    /* renamed from: q */
    private C2390f f8158q = new C2390f();

    /* renamed from: r */
    private Map<Class<?>, AbstractC2393i<?>> f8159r = new C2557b();

    /* renamed from: s */
    private Class<?> f8160s = Object.class;

    /* renamed from: t */
    private boolean f8161t;

    /* renamed from: u */
    private Resources.Theme f8162u;

    /* renamed from: v */
    private boolean f8163v;

    /* renamed from: w */
    private boolean f8164w;

    /* renamed from: x */
    private boolean f8165x;

    /* renamed from: y */
    private boolean f8166y = true;

    /* renamed from: z */
    private boolean f8167z;

    /* renamed from: a */
    private static boolean mo10400a(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: b */
    private T mo10404b() {
        return this;
    }

    /* renamed from: A */
    public final Drawable mo11109A() {
        return this.f8156o;
    }

    /* renamed from: B */
    public final Resources.Theme mo11110B() {
        return this.f8162u;
    }

    /* renamed from: C */
    public final boolean mo11111C() {
        return this.f8150i;
    }

    /* renamed from: D */
    public final AbstractC2265c mo11112D() {
        return this.f8153l;
    }

    /* renamed from: F */
    public final Priority mo11114F() {
        return this.f8145d;
    }

    /* renamed from: G */
    public final int mo11115G() {
        return this.f8152k;
    }

    /* renamed from: I */
    public final int mo11117I() {
        return this.f8151j;
    }

    /* renamed from: J */
    public final float mo11118J() {
        return this.f8143b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo11119K() {
        return this.f8166y;
    }

    /* renamed from: L */
    public final boolean mo11120L() {
        return this.f8164w;
    }

    /* renamed from: M */
    public final boolean mo11121M() {
        return this.f8167z;
    }

    /* renamed from: N */
    public final boolean mo11122N() {
        return this.f8165x;
    }

    /* renamed from: e */
    public final boolean mo11146e() {
        return this.f8155n;
    }

    /* renamed from: q */
    public final Map<Class<?>, AbstractC2393i<?>> mo11160q() {
        return this.f8159r;
    }

    /* renamed from: r */
    public final boolean mo11161r() {
        return this.f8154m;
    }

    /* renamed from: s */
    public final C2390f mo11162s() {
        return this.f8158q;
    }

    /* renamed from: t */
    public final Class<?> mo11163t() {
        return this.f8160s;
    }

    /* renamed from: u */
    public final AbstractC2354j mo11164u() {
        return this.f8144c;
    }

    /* renamed from: v */
    public final Drawable mo11165v() {
        return this.f8146e;
    }

    /* renamed from: w */
    public final int mo11166w() {
        return this.f8147f;
    }

    /* renamed from: x */
    public final int mo11167x() {
        return this.f8149h;
    }

    /* renamed from: y */
    public final Drawable mo11168y() {
        return this.f8148g;
    }

    /* renamed from: z */
    public final int mo11169z() {
        return this.f8157p;
    }

    /* renamed from: a */
    public T mo11136a(boolean z) {
        if (this.f8163v) {
            return (T) clone().mo11136a(z);
        }
        this.f8167z = z;
        this.f8142a |= 1048576;
        return mo10386a();
    }

    /* renamed from: a */
    public T mo11129a(AbstractC2354j jVar) {
        if (this.f8163v) {
            return (T) clone().mo11129a(jVar);
        }
        this.f8144c = (AbstractC2354j) C2567j.m10894a(jVar);
        this.f8142a |= 4;
        return mo10386a();
    }

    /* renamed from: a */
    public T mo11134a(Class<?> cls) {
        if (this.f8163v) {
            return (T) clone().mo11134a(cls);
        }
        this.f8160s = (Class) C2567j.m10894a(cls);
        this.f8142a |= 4096;
        return mo10386a();
    }

    /* renamed from: a */
    public T mo11132a(DownsampleStrategy downsampleStrategy) {
        return mo11128a((C2267e<Y>) DownsampleStrategy.f7959h, C2567j.m10894a(downsampleStrategy));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final T mo11133a(DownsampleStrategy downsampleStrategy, AbstractC2393i<Bitmap> iVar) {
        if (this.f8163v) {
            return (T) clone().mo11133a(downsampleStrategy, iVar);
        }
        mo11132a(downsampleStrategy);
        return mo11131a(iVar, false);
    }

    /* renamed from: a */
    public T mo11130a(AbstractC2393i<Bitmap> iVar) {
        return mo11131a(iVar, true);
    }

    /* renamed from: a */
    public T mo11137a(AbstractC2393i<Bitmap>... iVarArr) {
        if (iVarArr.length > 1) {
            return mo11131a((AbstractC2393i<Bitmap>) new C2266d(iVarArr), true);
        }
        if (iVarArr.length == 1) {
            return mo11130a(iVarArr[0]);
        }
        return mo10386a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bumptech.glide.load.i<android.graphics.Bitmap> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public T mo11131a(AbstractC2393i<Bitmap> iVar, boolean z) {
        if (this.f8163v) {
            return (T) clone().mo11131a(iVar, z);
        }
        C2439m mVar = new C2439m(iVar, z);
        mo11135a(Bitmap.class, iVar, z);
        mo11135a(Drawable.class, mVar, z);
        mo11135a(BitmapDrawable.class, (AbstractC2393i<Y>) mVar.mo10955a(), z);
        mo11135a(C2468c.class, new C2472f(iVar), z);
        return mo10386a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <Y> T mo11135a(Class<Y> cls, AbstractC2393i<Y> iVar, boolean z) {
        if (this.f8163v) {
            return (T) clone().mo11135a(cls, iVar, z);
        }
        C2567j.m10894a(cls);
        C2567j.m10894a(iVar);
        this.f8159r.put(cls, iVar);
        int i = this.f8142a | 2048;
        this.f8142a = i;
        this.f8155n = true;
        int i2 = i | 65536;
        this.f8142a = i2;
        this.f8166y = false;
        if (z) {
            this.f8142a = i2 | 131072;
            this.f8154m = true;
        }
        return mo10386a();
    }

    /* renamed from: E */
    public final boolean mo11113E() {
        return mo102585d(8);
    }

    /* renamed from: f */
    public final boolean mo11148f() {
        return mo102585d(2048);
    }

    /* renamed from: o */
    public T mo11158o() {
        this.f8161t = true;
        return mo10404b();
    }

    /* renamed from: H */
    public final boolean mo11116H() {
        return C2568k.m10911a(this.f8152k, this.f8151j);
    }

    /* renamed from: g */
    public T mo11149g() {
        return mo11133a(DownsampleStrategy.f7956e, new C2432i());
    }

    /* renamed from: h */
    public T mo11150h() {
        return mo11141b(DownsampleStrategy.f7956e, new C2432i());
    }

    /* renamed from: i */
    public T mo11152i() {
        return m10585d(DownsampleStrategy.f7954c, new C2441o());
    }

    /* renamed from: j */
    public T mo11153j() {
        return m10584c(DownsampleStrategy.f7954c, new C2441o());
    }

    /* renamed from: k */
    public T mo11154k() {
        return m10585d(DownsampleStrategy.f7955d, new C2433j());
    }

    /* renamed from: l */
    public T mo11155l() {
        return m10584c(DownsampleStrategy.f7955d, new C2433j());
    }

    /* renamed from: n */
    public T mo11157n() {
        return mo11128a((C2267e) ((C2267e<Y>) C2479i.f8091b), (Object) true);
    }

    /* renamed from: a */
    private T mo10386a() {
        if (!this.f8161t) {
            return mo10404b();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: p */
    public T mo11159p() {
        if (!this.f8161t || this.f8163v) {
            this.f8163v = true;
            return mo11158o();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: d */
    public T clone() {
        try {
            T t = (T) ((AbstractC2510a) super.clone());
            C2390f fVar = new C2390f();
            t.f8158q = fVar;
            fVar.mo10901a(this.f8158q);
            C2557b bVar = new C2557b();
            t.f8159r = bVar;
            bVar.putAll(this.f8159r);
            t.f8161t = false;
            t.f8163v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    public T mo11156m() {
        if (this.f8163v) {
            return (T) clone().mo11156m();
        }
        this.f8159r.clear();
        int i = this.f8142a & -2049;
        this.f8142a = i;
        this.f8154m = false;
        int i2 = i & -131073;
        this.f8142a = i2;
        this.f8155n = false;
        this.f8142a = i2 | 65536;
        this.f8166y = true;
        return mo10386a();
    }

    public int hashCode() {
        return C2568k.m10904a(this.f8162u, C2568k.m10904a(this.f8153l, C2568k.m10904a(this.f8160s, C2568k.m10904a(this.f8159r, C2568k.m10904a(this.f8158q, C2568k.m10904a(this.f8145d, C2568k.m10904a(this.f8144c, C2568k.m10905a(this.f8165x, C2568k.m10905a(this.f8164w, C2568k.m10905a(this.f8155n, C2568k.m10905a(this.f8154m, C2568k.m10914b(this.f8152k, C2568k.m10914b(this.f8151j, C2568k.m10905a(this.f8150i, C2568k.m10904a(this.f8156o, C2568k.m10914b(this.f8157p, C2568k.m10904a(this.f8148g, C2568k.m10914b(this.f8149h, C2568k.m10904a(this.f8146e, C2568k.m10914b(this.f8147f, C2568k.m10899a(this.f8143b)))))))))))))))))))));
    }

    /* renamed from: d */
    private boolean mo102585d(int i) {
        return mo10400a(this.f8142a, i);
    }

    /* renamed from: a */
    public T mo11123a(int i) {
        if (this.f8163v) {
            return (T) clone().mo11123a(i);
        }
        this.f8149h = i;
        int i2 = this.f8142a | SmActions.ACTION_ONTHECALL_EXIT;
        this.f8142a = i2;
        this.f8148g = null;
        this.f8142a = i2 & -65;
        return mo10386a();
    }

    /* renamed from: b */
    public T mo11138b(float f) {
        if (this.f8163v) {
            return (T) clone().mo11138b(f);
        }
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f8143b = f;
        this.f8142a |= 2;
        return mo10386a();
    }

    /* renamed from: c */
    public T mo11143c(int i) {
        if (this.f8163v) {
            return (T) clone().mo11143c(i);
        }
        this.f8147f = i;
        int i2 = this.f8142a | 32;
        this.f8142a = i2;
        this.f8146e = null;
        this.f8142a = i2 & -17;
        return mo10386a();
    }

    /* renamed from: a */
    public T mo11124a(long j) {
        return mo11128a((C2267e<Y>) C2416aa.f7963a, Long.valueOf(j));
    }

    /* renamed from: b */
    public T mo11139b(int i) {
        if (this.f8163v) {
            return (T) clone().mo11139b(i);
        }
        this.f8157p = i;
        int i2 = this.f8142a | 16384;
        this.f8142a = i2;
        this.f8156o = null;
        this.f8142a = i2 & -8193;
        return mo10386a();
    }

    /* renamed from: c */
    public T mo11145c(boolean z) {
        if (this.f8163v) {
            return (T) clone().mo11145c(true);
        }
        this.f8150i = !z;
        this.f8142a |= DynamicModule.f58006b;
        return mo10386a();
    }

    /* renamed from: a */
    public T mo11125a(Drawable drawable) {
        if (this.f8163v) {
            return (T) clone().mo11125a(drawable);
        }
        this.f8148g = drawable;
        int i = this.f8142a | 64;
        this.f8142a = i;
        this.f8149h = 0;
        this.f8142a = i & -129;
        return mo10386a();
    }

    /* renamed from: b */
    public T mo11140b(Drawable drawable) {
        if (this.f8163v) {
            return (T) clone().mo11140b(drawable);
        }
        this.f8146e = drawable;
        int i = this.f8142a | 16;
        this.f8142a = i;
        this.f8147f = 0;
        this.f8142a = i & -33;
        return mo10386a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2510a)) {
            return false;
        }
        AbstractC2510a aVar = (AbstractC2510a) obj;
        if (Float.compare(aVar.f8143b, this.f8143b) == 0 && this.f8147f == aVar.f8147f && C2568k.m10912a(this.f8146e, aVar.f8146e) && this.f8149h == aVar.f8149h && C2568k.m10912a(this.f8148g, aVar.f8148g) && this.f8157p == aVar.f8157p && C2568k.m10912a(this.f8156o, aVar.f8156o) && this.f8150i == aVar.f8150i && this.f8151j == aVar.f8151j && this.f8152k == aVar.f8152k && this.f8154m == aVar.f8154m && this.f8155n == aVar.f8155n && this.f8164w == aVar.f8164w && this.f8165x == aVar.f8165x && this.f8144c.equals(aVar.f8144c) && this.f8145d == aVar.f8145d && this.f8158q.equals(aVar.f8158q) && this.f8159r.equals(aVar.f8159r) && this.f8160s.equals(aVar.f8160s) && C2568k.m10912a(this.f8153l, aVar.f8153l) && C2568k.m10912a(this.f8162u, aVar.f8162u)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public T mo11126a(Priority priority) {
        if (this.f8163v) {
            return (T) clone().mo11126a(priority);
        }
        this.f8145d = (Priority) C2567j.m10894a(priority);
        this.f8142a |= 8;
        return mo10386a();
    }

    /* renamed from: b */
    public T mo10403b(AbstractC2510a<?> aVar) {
        if (this.f8163v) {
            return (T) clone().mo10403b(aVar);
        }
        if (mo10400a(aVar.f8142a, 2)) {
            this.f8143b = aVar.f8143b;
        }
        if (mo10400a(aVar.f8142a, 262144)) {
            this.f8164w = aVar.f8164w;
        }
        if (mo10400a(aVar.f8142a, 1048576)) {
            this.f8167z = aVar.f8167z;
        }
        if (mo10400a(aVar.f8142a, 4)) {
            this.f8144c = aVar.f8144c;
        }
        if (mo10400a(aVar.f8142a, 8)) {
            this.f8145d = aVar.f8145d;
        }
        if (mo10400a(aVar.f8142a, 16)) {
            this.f8146e = aVar.f8146e;
            this.f8147f = 0;
            this.f8142a &= -33;
        }
        if (mo10400a(aVar.f8142a, 32)) {
            this.f8147f = aVar.f8147f;
            this.f8146e = null;
            this.f8142a &= -17;
        }
        if (mo10400a(aVar.f8142a, 64)) {
            this.f8148g = aVar.f8148g;
            this.f8149h = 0;
            this.f8142a &= -129;
        }
        if (mo10400a(aVar.f8142a, (int) SmActions.ACTION_ONTHECALL_EXIT)) {
            this.f8149h = aVar.f8149h;
            this.f8148g = null;
            this.f8142a &= -65;
        }
        if (mo10400a(aVar.f8142a, (int) DynamicModule.f58006b)) {
            this.f8150i = aVar.f8150i;
        }
        if (mo10400a(aVar.f8142a, (int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID)) {
            this.f8152k = aVar.f8152k;
            this.f8151j = aVar.f8151j;
        }
        if (mo10400a(aVar.f8142a, 1024)) {
            this.f8153l = aVar.f8153l;
        }
        if (mo10400a(aVar.f8142a, 4096)) {
            this.f8160s = aVar.f8160s;
        }
        if (mo10400a(aVar.f8142a, 8192)) {
            this.f8156o = aVar.f8156o;
            this.f8157p = 0;
            this.f8142a &= -16385;
        }
        if (mo10400a(aVar.f8142a, 16384)) {
            this.f8157p = aVar.f8157p;
            this.f8156o = null;
            this.f8142a &= -8193;
        }
        if (mo10400a(aVar.f8142a, 32768)) {
            this.f8162u = aVar.f8162u;
        }
        if (mo10400a(aVar.f8142a, 65536)) {
            this.f8155n = aVar.f8155n;
        }
        if (mo10400a(aVar.f8142a, 131072)) {
            this.f8154m = aVar.f8154m;
        }
        if (mo10400a(aVar.f8142a, 2048)) {
            this.f8159r.putAll(aVar.f8159r);
            this.f8166y = aVar.f8166y;
        }
        if (mo10400a(aVar.f8142a, 524288)) {
            this.f8165x = aVar.f8165x;
        }
        if (!this.f8155n) {
            this.f8159r.clear();
            int i = this.f8142a & -2049;
            this.f8142a = i;
            this.f8154m = false;
            this.f8142a = i & -131073;
            this.f8166y = true;
        }
        this.f8142a |= aVar.f8142a;
        this.f8158q.mo10901a(aVar.f8158q);
        return mo10386a();
    }

    /* renamed from: a */
    public T mo11127a(AbstractC2265c cVar) {
        if (this.f8163v) {
            return (T) clone().mo11127a(cVar);
        }
        this.f8153l = (AbstractC2265c) C2567j.m10894a(cVar);
        this.f8142a |= 1024;
        return mo10386a();
    }

    /* renamed from: b */
    public T mo11142b(boolean z) {
        if (this.f8163v) {
            return (T) clone().mo11142b(z);
        }
        this.f8165x = z;
        this.f8142a |= 524288;
        return mo10386a();
    }

    /* renamed from: c */
    private T m10584c(DownsampleStrategy downsampleStrategy, AbstractC2393i<Bitmap> iVar) {
        return m10581a(downsampleStrategy, iVar, true);
    }

    /* renamed from: d */
    private T m10585d(DownsampleStrategy downsampleStrategy, AbstractC2393i<Bitmap> iVar) {
        return m10581a(downsampleStrategy, iVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final T mo11141b(DownsampleStrategy downsampleStrategy, AbstractC2393i<Bitmap> iVar) {
        if (this.f8163v) {
            return (T) clone().mo11141b(downsampleStrategy, iVar);
        }
        mo11132a(downsampleStrategy);
        return mo11130a(iVar);
    }

    /* renamed from: c */
    public T mo11144c(int i, int i2) {
        if (this.f8163v) {
            return (T) clone().mo11144c(i, i2);
        }
        this.f8152k = i;
        this.f8151j = i2;
        this.f8142a |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
        return mo10386a();
    }

    /* renamed from: a */
    public <Y> T mo11128a(C2267e<Y> eVar, Y y) {
        if (this.f8163v) {
            return (T) clone().mo11128a(eVar, y);
        }
        C2567j.m10894a(eVar);
        C2567j.m10894a((Object) y);
        this.f8158q.mo10899a(eVar, y);
        return mo10386a();
    }

    /* renamed from: a */
    private T m10581a(DownsampleStrategy downsampleStrategy, AbstractC2393i<Bitmap> iVar, boolean z) {
        T t;
        if (z) {
            t = mo11141b(downsampleStrategy, iVar);
        } else {
            t = mo11133a(downsampleStrategy, iVar);
        }
        t.f8166y = true;
        return t;
    }
}
