package com.ss.android.vesdk;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.vesdk.VESurfaceCallback;
import com.ss.android.vesdk.bean.C63956a;
import com.ss.android.vesdk.bean.C63958b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class VEImage {

    /* renamed from: a */
    public FristLayerSwapCallback f161295a;

    /* renamed from: b */
    public TEImageInterface f161296b;

    /* renamed from: c */
    private SurfaceView f161297c;

    /* renamed from: d */
    private VESurfaceCallback.SurfaceListener f161298d;

    /* renamed from: e */
    private VESurfaceCallback f161299e;

    /* renamed from: f */
    private final List<Runnable> f161300f;

    /* renamed from: g */
    private float f161301g;

    /* renamed from: h */
    private float f161302h;

    public enum VERenderType {
        NORMAL,
        PBO,
        PBO_TWO,
        EGLIMAGE
    }

    /* renamed from: com.ss.android.vesdk.VEImage$a */
    public interface FristLayerSwapCallback {
        /* renamed from: a */
        void mo220809a();
    }

    /* renamed from: com.ss.android.vesdk.VEImage$b */
    public interface OnLayerAddListener {
        /* renamed from: a */
        void mo203637a();
    }

    public VEImage() {
        this(null, null, null, 7, null);
    }

    public enum ContrastState {
        Original(0),
        Last(1),
        Custom(2),
        ForceOriginal(3);
        
        private final int scale;

        public final int getScale() {
            return this.scale;
        }

        protected ContrastState(int i) {
            this.scale = i;
        }
    }

    /* renamed from: a */
    public final List<Runnable> mo220772a() {
        return this.f161300f;
    }

    /* renamed from: b */
    public final float mo220785b() {
        return this.f161301g;
    }

    /* renamed from: c */
    public final float mo220791c() {
        return this.f161302h;
    }

    /* renamed from: a */
    public final void mo220773a(int i, int i2, boolean z) {
        this.f161296b = TEImageInterface.createVEImage(i, i2, z);
        VEConfigCenter.m250617a().mo220633b();
    }

    /* renamed from: a */
    public final void mo220775a(Surface surface, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(surface, "surface");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.initPreviewSurface(surface);
        }
        this.f161301g = (float) i;
        this.f161302h = (float) i2;
    }

    /* renamed from: a */
    public final void mo220774a(Surface surface) {
        Intrinsics.checkParameterIsNotNull(surface, "surface");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.destorySurface(surface);
        }
    }

    /* renamed from: a */
    public final void mo220780a(String str, int i, OnLayerAddListener bVar) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        Intrinsics.checkParameterIsNotNull(bVar, "addNewLayer");
        if (this.f161299e.mo220972a() != VESurfaceCallback.SurfaceState.Changed) {
            this.f161300f.add(new RunnableC63851c(this, str, i, bVar));
            return;
        }
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.addNewLayer(str, i, false);
        }
        bVar.mo203637a();
        mo220798f();
        m250737a(this, this.f161295a, false, 2, (Object) null);
    }

    /* renamed from: a */
    public final int mo220768a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.saveCurrentImage(str, z, z2);
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo220776a(FristLayerSwapCallback aVar, boolean z) {
        if (this.f161299e.mo220972a() != VESurfaceCallback.SurfaceState.Changed) {
            this.f161300f.add(new RunnableC63852d(this, z, aVar));
            return;
        }
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.renderLayerQueue(z);
        }
        if (aVar != null) {
            aVar.mo220809a();
        }
    }

    /* renamed from: a */
    public final void mo220781a(String str, String str2, int i, float f, float f2, float f3, float f4, float f5, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "command");
        Intrinsics.checkParameterIsNotNull(str2, "path");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.processGestureEvent(str, str2, i, f, f2, f3, f4, f5, i2);
        }
    }

    /* renamed from: a */
    public final void mo220779a(String str, float f, float f2, float f3, float f4) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            float f5 = this.f161302h;
            tEImageInterface.cutoutImage(str, f, f2, f5 - f3, f5 - f4);
        }
    }

    /* renamed from: a */
    public final C63956a mo220770a(boolean z, boolean z2) {
        C63956a aVar = null;
        TEImageInterface tEImageInterface = this.f161296b;
        String queryLayerParams = tEImageInterface != null ? tEImageInterface.queryLayerParams(z, z2) : null;
        if (queryLayerParams != null) {
            aVar = new C63956a();
            for (String str : StringsKt.split$default((CharSequence) queryLayerParams, new String[]{";"}, false, 0, 6, (Object) null)) {
                List split$default = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual((String) split$default.get(1), "nan")) {
                    return null;
                }
                String str2 = (String) split$default.get(0);
                switch (str2.hashCode()) {
                    case -1221029593:
                        if (str2.equals("height")) {
                            aVar.f161506h = Float.parseFloat((String) split$default.get(1));
                        } else {
                            continue;
                        }
                    case -400605432:
                        if (!str2.equals("pointld")) {
                            continue;
                        }
                        break;
                    case -400605415:
                        if (!str2.equals("pointlu")) {
                            continue;
                        }
                        break;
                    case -400605246:
                        if (!str2.equals("pointrd")) {
                            continue;
                        }
                        break;
                    case -400605229:
                        if (!str2.equals("pointru")) {
                            continue;
                        }
                        break;
                    case -41955764:
                        if (str2.equals("layerId")) {
                            aVar.f161508j = (String) split$default.get(1);
                        } else {
                            continue;
                        }
                    case -40300674:
                        if (str2.equals("rotation")) {
                            aVar.f161507i = Float.parseFloat((String) split$default.get(1));
                        } else {
                            continue;
                        }
                    case 113126854:
                        if (str2.equals("width")) {
                            aVar.f161505g = Float.parseFloat((String) split$default.get(1));
                        } else {
                            continue;
                        }
                    case 747804969:
                        if (!str2.equals("position")) {
                            continue;
                        }
                        break;
                    case 1910893003:
                        if (!str2.equals("scaleXY")) {
                            continue;
                        }
                        break;
                }
                List split$default2 = StringsKt.split$default((CharSequence) split$default.get(1), new String[]{","}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual((String) split$default2.get(0), "nan") || Intrinsics.areEqual((String) split$default2.get(1), "nan")) {
                    return null;
                }
                C63956a.C63957a aVar2 = new C63956a.C63957a();
                aVar2.f161509a = Float.parseFloat((String) split$default2.get(0));
                aVar2.f161510b = Float.parseFloat((String) split$default2.get(1));
                String str3 = (String) split$default.get(0);
                switch (str3.hashCode()) {
                    case -400605432:
                        if (str3.equals("pointld")) {
                            aVar.f161500b = aVar2;
                            break;
                        } else {
                            continue;
                        }
                    case -400605415:
                        if (str3.equals("pointlu")) {
                            aVar.f161499a = aVar2;
                            break;
                        } else {
                            continue;
                        }
                    case -400605246:
                        if (str3.equals("pointrd")) {
                            aVar.f161501c = aVar2;
                            break;
                        } else {
                            continue;
                        }
                    case -400605229:
                        if (str3.equals("pointru")) {
                            aVar.f161502d = aVar2;
                            break;
                        } else {
                            continue;
                        }
                    case 747804969:
                        if (str3.equals("position")) {
                            aVar.f161503e = aVar2;
                            break;
                        } else {
                            continue;
                        }
                    case 1910893003:
                        if (str3.equals("scaleXY")) {
                            aVar.f161504f = aVar2;
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final C63958b mo220771a(int i) {
        C63958b bVar = null;
        TEImageInterface tEImageInterface = this.f161296b;
        String stickerBrushState = tEImageInterface != null ? tEImageInterface.getStickerBrushState(i) : null;
        if (stickerBrushState != null) {
            bVar = new C63958b();
            for (String str : StringsKt.split$default((CharSequence) stickerBrushState, new String[]{";"}, false, 0, 6, (Object) null)) {
                List split$default = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual((String) split$default.get(1), "nan")) {
                    return null;
                }
                String str2 = (String) split$default.get(0);
                int hashCode = str2.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != -783976821) {
                        if (hashCode == -630788519 && str2.equals("strokeSize")) {
                            bVar.f161513c = Float.parseFloat((String) split$default.get(1));
                        }
                    } else if (str2.equals("undoCount")) {
                        bVar.f161511a = Float.parseFloat((String) split$default.get(1));
                    }
                } else if (str2.equals("height")) {
                    bVar.f161512b = Float.parseFloat((String) split$default.get(1));
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo220777a(String str, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.translate(str, f, f2);
        }
    }

    /* renamed from: a */
    public final void mo220778a(String str, float f, float f2, float f3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.rotate(str, f, f2, f3);
        }
    }

    /* renamed from: a */
    public final int mo220769a(String str, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.addInfoSticker(str, strArr);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo220766a(int i, int i2) {
        if (i < 0) {
            return -100;
        }
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.setInfoStickerLayer(i, i2);
        }
        return -1;
    }

    /* renamed from: a */
    public final float[] mo220784a(int i, boolean z) {
        TEImageInterface tEImageInterface;
        if (i >= 0 && (tEImageInterface = this.f161296b) != null) {
            return tEImageInterface.getInfoStickerBoundingBox(i, z);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo220767a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cachePath");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.addBrushSticker(str);
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo220783a(boolean z, int i) {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.undoRedoStickerBrush(z, i);
        }
    }

    /* renamed from: d */
    public final void mo220795d() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.enableUndoRedo();
        }
    }

    /* renamed from: f */
    public final void mo220798f() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.confrimOriginalLayerParams();
        }
    }

    /* renamed from: g */
    public final void mo220799g() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.executeConfirmParams();
        }
    }

    /* renamed from: h */
    public final void mo220800h() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.executeConfirmRender();
        }
    }

    /* renamed from: j */
    public final void mo220802j() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.doRenderEffect();
        }
    }

    /* renamed from: k */
    public final void mo220803k() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.clearEffect();
        }
    }

    /* renamed from: l */
    public final void mo220804l() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.endStickerBrush();
        }
    }

    /* renamed from: m */
    public final void mo220805m() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.saveFinishLoadLayerInfo();
        }
    }

    /* renamed from: n */
    public final void mo220806n() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.saveCurrentLayerInfoToTemp();
        }
    }

    /* renamed from: o */
    public final void mo220807o() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.applyCurrentLayerInfoFromTemp();
        }
    }

    /* renamed from: i */
    public final int[] mo220801i() {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.getOutputSize();
        }
        return null;
    }

    /* renamed from: com.ss.android.vesdk.VEImage$d */
    public static final class RunnableC63852d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEImage f161307a;

        /* renamed from: b */
        final /* synthetic */ boolean f161308b;

        /* renamed from: c */
        final /* synthetic */ FristLayerSwapCallback f161309c;

        RunnableC63852d(VEImage vEImage, boolean z, FristLayerSwapCallback aVar) {
            this.f161307a = vEImage;
            this.f161308b = z;
            this.f161309c = aVar;
        }

        public final void run() {
            TEImageInterface tEImageInterface = this.f161307a.f161296b;
            if (tEImageInterface != null) {
                tEImageInterface.renderLayerQueue(this.f161308b);
            }
            FristLayerSwapCallback aVar = this.f161309c;
            if (aVar != null) {
                aVar.mo220809a();
            }
        }
    }

    /* renamed from: com.ss.android.vesdk.VEImage$c */
    public static final class RunnableC63851c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEImage f161303a;

        /* renamed from: b */
        final /* synthetic */ String f161304b;

        /* renamed from: c */
        final /* synthetic */ int f161305c;

        /* renamed from: d */
        final /* synthetic */ OnLayerAddListener f161306d;

        RunnableC63851c(VEImage vEImage, String str, int i, OnLayerAddListener bVar) {
            this.f161303a = vEImage;
            this.f161304b = str;
            this.f161305c = i;
            this.f161306d = bVar;
        }

        public final void run() {
            TEImageInterface tEImageInterface = this.f161303a.f161296b;
            if (tEImageInterface != null) {
                tEImageInterface.addNewLayer(this.f161304b, this.f161305c, false);
            }
            this.f161306d.mo203637a();
            this.f161303a.mo220798f();
            VEImage vEImage = this.f161303a;
            VEImage.m250737a(vEImage, vEImage.f161295a, false, 2, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo220797e() {
        SurfaceHolder holder;
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.destoryVEImage();
        }
        SurfaceView surfaceView = this.f161297c;
        if (!(surfaceView == null || (holder = surfaceView.getHolder()) == null)) {
            holder.removeCallback(this.f161299e);
        }
        this.f161297c = null;
        this.f161296b = null;
    }

    /* renamed from: a */
    public final void mo220782a(boolean z) {
        TEImageInterface.enableOpenGL3(z);
    }

    /* renamed from: b */
    public final void mo220788b(int i) {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.removeInfoSticker(i);
        }
    }

    /* renamed from: c */
    public final void mo220793c(int i) {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.beginStickerBrush(i);
        }
    }

    /* renamed from: c */
    public final void mo220794c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "brushParams");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.setStickerBrushParams(str);
        }
    }

    /* renamed from: d */
    public final void mo220796d(int i) {
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.clearStickerBrush(i);
        }
    }

    /* renamed from: b */
    public final void mo220789b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "resourcePath");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.setStickerBrushResource(str);
        }
    }

    /* renamed from: b */
    public final int mo220786b(int i, float f) {
        if (i < 0) {
            return -100;
        }
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.setInfoStickerRotation(i, f);
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo220764a(int i, float f) {
        synchronized (this) {
            if (i < 0) {
                return -100;
            }
            return mo220765a(i, f, f);
        }
    }

    /* renamed from: b */
    public final int mo220787b(int i, float f, float f2) {
        if (i < 0) {
            return -100;
        }
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.setInfoStickerPosition(i, f, f2);
        }
        return -1;
    }

    public VEImage(SurfaceView surfaceView, VESurfaceCallback.SurfaceListener aVar, Handler handler) {
        SurfaceHolder holder;
        this.f161297c = surfaceView;
        this.f161298d = aVar;
        this.f161299e = new VESurfaceCallback(this, aVar, handler);
        this.f161300f = new ArrayList();
        SurfaceView surfaceView2 = this.f161297c;
        if (surfaceView2 != null && (holder = surfaceView2.getHolder()) != null) {
            holder.addCallback(this.f161299e);
        }
    }

    /* renamed from: a */
    public final int mo220765a(int i, float f, float f2) {
        if (i < 0) {
            return -100;
        }
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            return tEImageInterface.setInfoStickerScale(i, f, f2);
        }
        return -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VEImage(SurfaceView surfaceView, VESurfaceCallback.SurfaceListener aVar, Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : surfaceView, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : handler);
    }

    /* renamed from: a */
    public static /* synthetic */ int m250734a(VEImage vEImage, String str, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = null;
        }
        return vEImage.mo220769a(str, strArr);
    }

    /* renamed from: a */
    public static /* synthetic */ C63956a m250735a(VEImage vEImage, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return vEImage.mo220770a(z, z2);
    }

    /* renamed from: c */
    public final Integer mo220792c(String str, float f, float f2, float f3, float f4) {
        Intrinsics.checkParameterIsNotNull(str, "path");
        return Integer.valueOf(mo220769a(str, new String[]{String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(0)}));
    }

    /* renamed from: b */
    public final void mo220790b(String str, float f, float f2, float f3, float f4) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        TEImageInterface tEImageInterface = this.f161296b;
        if (tEImageInterface != null) {
            tEImageInterface.scale(str, f, f2, f3, f4);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m250737a(VEImage vEImage, FristLayerSwapCallback aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        vEImage.mo220776a(aVar, z);
    }

    /* renamed from: a */
    public static /* synthetic */ float[] m250738a(VEImage vEImage, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return vEImage.mo220784a(i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ int m250733a(VEImage vEImage, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return vEImage.mo220768a(str, z, z2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m250736a(VEImage vEImage, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        vEImage.mo220773a(i, i2, z);
    }
}
