package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.medialib.C59385c;
import com.ss.android.ttve.common.AbstractC60184c;
import com.ss.android.ttve.common.TETrackIndexManager;
import com.ss.android.ttve.editorInfo.C60192a;
import com.ss.android.ttve.mediacodec.TEAvcEncoder;
import com.ss.android.ttve.monitor.C60217b;
import com.ss.android.ttve.monitor.C60223e;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.ttve.monitor.C60230i;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.p3030a.C60177a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.keyvaluepair.C64030a;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.p3191e.AbstractC63980a;
import com.ss.android.vesdk.p3191e.AbstractC63981b;
import com.ss.android.vesdk.p3191e.AbstractC63982c;
import com.ss.android.vesdk.p3191e.AbstractC63983d;
import com.ss.android.vesdk.p3191e.AbstractC63984e;
import com.ss.android.vesdk.p3191e.AbstractC63985f;
import com.ss.android.vesdk.runtime.C64061c;
import com.ss.android.vesdk.runtime.VEPublishSettingManager;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.utils.C64078a;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class VEEditor implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: T */
    private static volatile boolean f161136T = true;

    /* renamed from: W */
    private static Map<String, Pair<Long, String>> f161137W = new HashMap();

    /* renamed from: X */
    private static final Object f161138X = new Object();

    /* renamed from: Y */
    private static volatile boolean f161139Y = false;

    /* renamed from: Z */
    private static int f161140Z = 0;

    /* renamed from: A */
    public boolean f161141A = false;

    /* renamed from: B */
    public boolean f161142B = false;

    /* renamed from: C */
    public RunnableC63845a f161143C = null;

    /* renamed from: D */
    public VEListener.AbstractC63873p f161144D = null;

    /* renamed from: E */
    public VEListener.AbstractC63876s f161145E = null;

    /* renamed from: F */
    public VEListener.AbstractC63876s f161146F = null;

    /* renamed from: G */
    public float f161147G = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: H */
    private AbstractC63983d f161148H;

    /* renamed from: I */
    private AbstractC63985f f161149I;

    /* renamed from: J */
    private AbstractC63981b f161150J;

    /* renamed from: K */
    private AbstractC63982c f161151K;

    /* renamed from: L */
    private AbstractC63984e f161152L;

    /* renamed from: M */
    private AbstractC63980a f161153M;

    /* renamed from: N */
    private C64061c f161154N;

    /* renamed from: O */
    private VESize f161155O = new VESize(-1, -1);

    /* renamed from: P */
    private String f161156P = "mp4";

    /* renamed from: Q */
    private TETrackIndexManager f161157Q = new TETrackIndexManager();

    /* renamed from: R */
    private C60177a f161158R = new C60177a();

    /* renamed from: S */
    private boolean f161159S = true;

    /* renamed from: U */
    private VERecordData f161160U = null;

    /* renamed from: V */
    private final String f161161V = "/concatShootVideo";

    /* renamed from: a */
    public HandlerC63848d f161162a = new HandlerC63848d(Looper.getMainLooper());
    private boolean aA = true;
    private boolean aB = false;
    private Bitmap aC = null;
    private float aD = BitmapDescriptorFactory.HUE_RED;
    private float aE = 1.0f;
    private float aF = 1.0f;
    private int aG = -1;
    private int aH = -1;
    private int aI = -16777216;
    private int aJ = -16777216;
    private final TextureView.SurfaceTextureListener aK = new TextureView.SurfaceTextureListener() {
        /* class com.ss.android.vesdk.VEEditor.TextureView$SurfaceTextureListenerC638405 */

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VEEditor.this.mo220690a();
            if (VEEditor.this.f161179r == null) {
                return true;
            }
            VEEditor.this.f161179r.release();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            VEEditor.this.f161176o = i;
            VEEditor.this.f161177p = i2;
            VEEditor.this.mo220712i();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VEEditor.this.f161178q == surfaceTexture) {
                VEEditor vEEditor = VEEditor.this;
                vEEditor.mo220693a(vEEditor.f161179r);
            } else {
                VEEditor.this.f161179r = new Surface(surfaceTexture);
                VEEditor vEEditor2 = VEEditor.this;
                vEEditor2.mo220693a(vEEditor2.f161179r);
            }
            VEEditor.this.f161178q = surfaceTexture;
        }
    };
    private SurfaceHolder.Callback2 aL = new SurfaceHolder.Callback2() {
        /* class com.ss.android.vesdk.VEEditor.SurfaceHolder$Callback2C638416 */

        public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            C63929ab.m250976b("VEEditor", "surfaceRedrawNeeded...");
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            VEEditor.this.mo220693a(surfaceHolder.getSurface());
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (VEEditor.this.f161175n.get()) {
                C63929ab.m250978c("VEEditor", "surfaceDestroyed, is destroying, just return");
            } else {
                VEEditor.this.mo220690a();
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C63929ab.m250976b("VEEditor", String.format(Locale.US, "surfaceChanged: pixel format [%d], size [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
            VEEditor.this.mo220692a(i2, i3);
        }
    };
    private NativeCallbacks.AbstractC60242h aM = new NativeCallbacks.AbstractC60242h() {
        /* class com.ss.android.vesdk.VEEditor.C638427 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60242h
        /* renamed from: a */
        public int mo205740a(int i, double d) {
            return 0;
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60242h
        /* renamed from: c */
        public int mo205743c(int i) {
            return 0;
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60242h
        /* renamed from: a */
        public int mo205739a(int i) {
            C63929ab.m250976b("VEEditor", "onOpenGLCreate: ret = " + i);
            return 0;
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60242h
        /* renamed from: b */
        public int mo205741b(int i) {
            C63929ab.m250976b("VEEditor", "onOpenGLDestroy: ret = " + i);
            return 0;
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60242h
        /* renamed from: b */
        public int mo205742b(int i, double d) {
            long j;
            long j2;
            C63929ab.m250981e("VEEditor", "onOpenGLDrawing: tex = " + i + " timeStamp = " + d);
            if (!VEEditor.this.f161141A) {
                VEEditor.this.f161141A = true;
                long currentTimeMillis = System.currentTimeMillis();
                if (VEEditor.this.f161187z > 0) {
                    j = VEEditor.this.f161187z;
                } else {
                    j = currentTimeMillis;
                }
                if (VEEditor.this.f161185x > 0) {
                    j2 = VEEditor.this.f161185x;
                } else {
                    j2 = VEEditor.this.f161184w;
                }
                if (j2 == 0 || j2 < VEEditor.this.f161183v) {
                    C63929ab.m250980d("VEEditor", "onOpenGLDrawAfter time report error, mlFirstPlayTimeMS = " + VEEditor.this.f161185x + ", mlFirstSeekTimeMS = " + VEEditor.this.f161184w + ", mlInitTimeMS = " + VEEditor.this.f161183v);
                    j2 = VEEditor.this.f161183v;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time_init", j2 - VEEditor.this.f161183v);
                    jSONObject.put("time_seek", j - j2);
                    jSONObject.put("time_waiting_surface", currentTimeMillis - j);
                    jSONObject.put("time_total", currentTimeMillis - VEEditor.this.f161183v);
                    jSONObject.put("usage_type", VEEditor.this.f161173l);
                    C60217b.m234045a("vesdk_event_editor_first_frame_draw", jSONObject, "performance");
                    C63929ab.m250974a("VEEditor", "first frame draw cost:" + jSONObject.toString());
                } catch (JSONException e) {
                    C63929ab.m250980d("VEEditor", "report first frame json err " + e);
                }
                C60229h.m234090a(1, "te_edit_first_frame_time", currentTimeMillis - VEEditor.this.f161183v);
                if (VEEditor.this.f161165d != null) {
                    VEEditor.this.f161165d.mo220854a();
                }
            }
            VEEditor.this.f161180s++;
            if (VEEditor.this.f161180s == 30) {
                VEEditor.this.f161181t = System.currentTimeMillis();
                if (VEEditor.this.f161182u != VEEditor.this.f161181t) {
                    float f = 30000.0f / ((float) (VEEditor.this.f161181t - VEEditor.this.f161182u));
                    if (VERuntimeConfig.f161376a) {
                        C63929ab.m250974a("VEEditor", "Render FPS = " + f);
                    }
                    VEEditor vEEditor = VEEditor.this;
                    vEEditor.f161182u = vEEditor.f161181t;
                    VEEditor.this.f161180s = 0;
                }
            }
            return 0;
        }
    };
    private NativeCallbacks.AbstractC60237c aN = new NativeCallbacks.AbstractC60237c() {
        /* class com.ss.android.vesdk.VEEditor.C638438 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60237c
        /* renamed from: a */
        public int mo205730a(byte[] bArr, int i, int i2, boolean z) {
            if (bArr == null || i < 0 || i2 <= 0) {
                return -1;
            }
            if (VEEditor.this.f161144D == null) {
                return -2;
            }
            VEEditor.this.f161144D.mo220852a(bArr, i, i2, z);
            return 0;
        }
    };
    private NativeCallbacks.AbstractC60238d aO = new NativeCallbacks.AbstractC60238d() {
        /* class com.ss.android.vesdk.VEEditor.C638449 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60238d
        /* renamed from: a */
        public int mo205731a(byte[] bArr, int i, int i2, int i3, float f) {
            if (VEEditor.this.f161145E == null) {
                return -100;
            }
            if (bArr != null || VEEditor.this.f161162a == null) {
                return VEEditor.this.f161145E.mo220855a(bArr, i, i2, i3, f);
            }
            Message message = new Message();
            message.what = 4117;
            VEEditor.this.f161162a.sendMessage(message);
            return 0;
        }
    };
    private NativeCallbacks.AbstractC60238d aP = new NativeCallbacks.AbstractC60238d() {
        /* class com.ss.android.vesdk.VEEditor.AnonymousClass10 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60238d
        /* renamed from: a */
        public int mo205731a(byte[] bArr, int i, int i2, int i3, float f) {
            if (VEEditor.this.f161146F == null) {
                return -100;
            }
            if (bArr == null) {
                return -1;
            }
            return VEEditor.this.f161146F.mo220855a(bArr, i, i2, i3, f);
        }
    };
    private NativeCallbacks.AbstractC60241g aQ = new NativeCallbacks.AbstractC60241g() {
        /* class com.ss.android.vesdk.VEEditor.AnonymousClass11 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60241g
        /* renamed from: a */
        public int mo205735a() {
            if (VEEditor.this.f161169h == null) {
                return -100;
            }
            return VEEditor.this.f161169h.mo220860a();
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60241g
        /* renamed from: a */
        public int mo205736a(float f) {
            if (VEEditor.this.f161169h == null) {
                return -100;
            }
            return VEEditor.this.f161169h.mo220861a(f);
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60241g
        /* renamed from: a */
        public int mo205738a(int i, int i2, float f) {
            if (VEEditor.this.f161169h == null) {
                return -100;
            }
            return VEEditor.this.f161169h.mo220863a(i, i2, f, "init model error");
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60241g
        /* renamed from: a */
        public int mo205737a(int i, float f, float f2, boolean z) {
            if (VEEditor.this.f161169h == null) {
                return -100;
            }
            return VEEditor.this.f161169h.mo220862a(i, f, f2, z);
        }
    };
    private NativeCallbacks.AbstractC60239e aR = new NativeCallbacks.AbstractC60239e() {
        /* class com.ss.android.vesdk.VEEditor.C638342 */

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60239e
        /* renamed from: a */
        public void mo205732a(final int i, final int i2, final int i3) {
            if (VEEditor.this.f161168g != null && VEEditor.this.f161162a != null) {
                VEEditor.this.f161162a.post(new Runnable() {
                    /* class com.ss.android.vesdk.VEEditor.C638342.RunnableC638351 */

                    public void run() {
                        if (VEEditor.this.f161168g != null) {
                            VEEditor.this.f161168g.mo220856a(i, i2, i3);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.AbstractC60239e
        /* renamed from: a */
        public void mo205733a(final int i, final int i2, final String str) {
            if (VEEditor.this.f161168g != null && VEEditor.this.f161162a != null) {
                VEEditor.this.f161162a.post(new Runnable() {
                    /* class com.ss.android.vesdk.VEEditor.C638342.RunnableC638362 */

                    public void run() {
                        if (VEEditor.this.f161168g != null) {
                            if (str != null) {
                                VEEditor.this.f161174m.put(Integer.valueOf(i), str);
                            }
                            VEEditor.this.f161168g.mo220857a(i, i2, str);
                        }
                    }
                });
            }
        }
    };
    private String aS;
    private double aT;
    private double aU;
    private double aV;
    private double aW;
    private int aa = -1;
    private AbstractC60184c ab = new AbstractC60184c() {
        /* class com.ss.android.vesdk.VEEditor.C638331 */

        /* renamed from: a */
        public static Thread m250698a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        @Override // com.ss.android.ttve.common.AbstractC60184c
        /* renamed from: a */
        public void mo205522a(int i, int i2, float f, String str) {
            if (i == 4101) {
                if (VEEditor.this.f161186y > 0) {
                    System.currentTimeMillis();
                    long j = VEEditor.this.f161186y;
                }
                if (VEEditor.this.f161163b != null && VEEditor.this.f161162a != null) {
                    C63929ab.m250978c("VEEditor", "mSeekListener TE_INFO_SEEK_DONE");
                    VEEditor.this.f161162a.sendEmptyMessage(4101);
                } else if (VEEditor.this.f161171j != null) {
                    C63929ab.m250978c("VEEditor", "TECommonCallback TE_INFO_SEEK_DONE");
                    VEEditor.this.f161171j.mo196111a(i, i2, f, str);
                }
            } else if (i != 4103) {
                if (i != 4105) {
                    if (i != 4129) {
                        if (i != 4157) {
                            if (i != 4133) {
                                if (i == 4134) {
                                    VEEditor.this.f161147G = f;
                                } else if (i != 4144) {
                                    if (i != 4145) {
                                        if (i != 4160) {
                                            if (i != 4161) {
                                                if (VEEditor.this.f161171j != null) {
                                                    C63929ab.m250974a("VEEditor", "TECommonCallback type:" + i);
                                                    VEEditor.this.f161171j.mo196111a(i, i2, f, str);
                                                }
                                            } else if (VEEditor.this.f161142B && VEEditor.this.f161143C != null) {
                                                VEEditor.this.f161143C.mo220734b(i2);
                                            }
                                        } else if (VEEditor.this.f161142B && VEEditor.this.f161143C != null) {
                                            VEEditor.this.f161143C.mo220730a(i2);
                                        }
                                    } else if (VEEditor.this.f161167f != null) {
                                        VEEditor.this.f161167f.mo220846a(i2);
                                    } else if (VEEditor.this.f161171j != null) {
                                        C63929ab.m250974a("VEEditor", "TECommonCallback type:" + i);
                                        VEEditor.this.f161171j.mo196111a(i, i2, f, str);
                                    }
                                } else if (VEEditor.this.f161167f != null) {
                                    VEEditor.this.f161167f.mo220845a();
                                } else if (VEEditor.this.f161171j != null) {
                                    C63929ab.m250974a("VEEditor", "TECommonCallback type:" + i);
                                    VEEditor.this.f161171j.mo196111a(i, i2, f, str);
                                }
                            } else if (VEEditor.this.f161166e != null && VEEditor.this.f161162a != null) {
                                Message message = new Message();
                                message.what = 4133;
                                message.arg1 = i2;
                                message.arg2 = (int) f;
                                VEEditor.this.f161162a.sendMessage(message);
                            }
                        } else if (VEEditor.this.f161170i != null && VEEditor.this.f161162a != null) {
                            Message message2 = new Message();
                            message2.what = 4157;
                            message2.arg1 = i2;
                            message2.arg2 = (int) f;
                            VEEditor.this.f161162a.sendMessage(message2);
                        }
                    } else if (VEEditor.this.f161187z == 0) {
                        VEEditor.this.f161187z = System.currentTimeMillis();
                        C63929ab.m250974a("VEEditor", "TECommonCallback TE_INFO_FIRST_FRAME_WITHOUT_SURFACE");
                    }
                } else if (VEEditor.this.f161164c != null && VEEditor.this.f161162a != null) {
                    Message message3 = new Message();
                    message3.what = i;
                    message3.obj = Float.valueOf(f);
                    VEEditor.this.f161162a.sendMessage(message3);
                } else if (VEEditor.this.f161171j != null) {
                    VEEditor.this.f161171j.mo196111a(i, i2, f, str);
                }
            } else if (VEEditor.this.f161142B) {
                VEEditor.this.f161143C.mo220731a(VEEditor.this.f161171j);
                m250698a(new Thread(VEEditor.this.f161143C)).start();
                VEEditor.this.f161142B = false;
            } else {
                VEEditor.this.mo220691a(i2);
                if (VEEditor.this.f161164c != null && VEEditor.this.f161162a != null) {
                    C63929ab.m250978c("VEEditor", "mCompileListener TE_INFO_COMPILE_DONE");
                    Message message4 = new Message();
                    message4.what = 4103;
                    message4.arg1 = i2;
                    message4.obj = str;
                    VEEditor.this.f161162a.sendMessage(message4);
                } else if (VEEditor.this.f161171j != null) {
                    C63929ab.m250978c("VEEditor", "TECommonCallback TE_INFO_COMPILE_DONE");
                    VEEditor.this.f161171j.mo196111a(i, i2, f, str);
                }
            }
        }
    };
    private AbstractC60184c ac = new AbstractC60184c() {
        /* class com.ss.android.vesdk.VEEditor.C638384 */

        @Override // com.ss.android.ttve.common.AbstractC60184c
        /* renamed from: a */
        public void mo205522a(final int i, final int i2, final float f, final String str) {
            VEEditor.this.mo220700b();
            if (VEEditor.this.f161172k != null) {
                VEEditor.this.f161172k.mo196111a(i, i2, f, str);
            }
            if (VEEditor.this.f161164c != null && VEEditor.this.f161162a != null) {
                VEEditor.this.f161162a.post(new Runnable() {
                    /* class com.ss.android.vesdk.VEEditor.C638384.RunnableC638391 */

                    public void run() {
                        if (VEEditor.this.f161164c != null) {
                            VEEditor.this.f161164c.mo220849a(i, i2, f, str);
                        }
                    }
                });
            }
        }
    };
    private int ad = 0;
    private int ae = 0;
    private Boolean af = false;
    private int ag = 0;
    private TEInterface ah;

    /* renamed from: ai  reason: collision with root package name */
    private SurfaceView f175463ai;
    private TextureView aj;
    private int ak = 0;
    private int al = 0;
    private int am = 0;
    private int an = -1;
    private VIDEO_RATIO ao;
    private VIDEO_GRAVITY ap = VIDEO_GRAVITY.ALIGN_PARENT_BOTTOM;
    private VIDEO_SCALETYPE aq = VIDEO_SCALETYPE.CENTER;
    private boolean ar = false;
    private boolean as = false;
    private boolean at = false;
    private int au = -1;
    private String av = null;
    private long aw = 0;
    private boolean ax = false;
    private C60230i ay = new C60230i();
    private boolean az = false;

    /* renamed from: b */
    public volatile VEListener.AbstractC63872o f161163b = null;

    /* renamed from: c */
    public volatile VEListener.AbstractC63870m f161164c = null;

    /* renamed from: d */
    public volatile VEListener.AbstractC63875r f161165d = null;

    /* renamed from: e */
    public volatile VEListener.AbstractC63857ad f161166e = null;

    /* renamed from: f */
    public volatile VEListener.AbstractC63869l f161167f = null;

    /* renamed from: g */
    public volatile VEListener.AbstractC63877t f161168g = null;

    /* renamed from: h */
    public volatile VEListener.AbstractC63880w f161169h = null;

    /* renamed from: i */
    public volatile VEListener.AbstractC63861d f161170i = null;

    /* renamed from: j */
    public AbstractC64045p f161171j = null;

    /* renamed from: k */
    public AbstractC64045p f161172k = null;

    /* renamed from: l */
    public String f161173l = "unknown";

    /* renamed from: m */
    public Map<Integer, String> f161174m = new HashMap();

    /* renamed from: n */
    public AtomicBoolean f161175n = new AtomicBoolean(false);

    /* renamed from: o */
    public int f161176o = 0;

    /* renamed from: p */
    public int f161177p = 0;

    /* renamed from: q */
    public SurfaceTexture f161178q;

    /* renamed from: r */
    public Surface f161179r;

    /* renamed from: s */
    public int f161180s = 0;

    /* renamed from: t */
    public long f161181t = 0;

    /* renamed from: u */
    public long f161182u = 0;

    /* renamed from: v */
    public long f161183v = 0;

    /* renamed from: w */
    public long f161184w = 0;

    /* renamed from: x */
    public long f161185x = 0;

    /* renamed from: y */
    public long f161186y = 0;

    /* renamed from: z */
    public long f161187z = 0;

    public enum PREVIEW_SCALE_MODE {
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_FIT_FULL
    }

    public enum SCALE_MODE {
        SCALE_MODE_CENTER_INSIDE,
        SCALE_MODE_CENTER_CROP,
        SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE,
        SCALE_MODE_FIT_START_WITH_2DENGINE,
        SCALE_MODE_FIT_END_WITH_2DENGINE,
        SCALE_MODE_CANVAS
    }

    public enum TIME_MODE {
        EDITOR_NORMAl_MODE,
        EDITOR_SLOMO_MODE
    }

    public enum VIDEO_GRAVITY {
        ALIGN_PARENT_LEFT,
        ALIGN_PARENT_TOP,
        ALIGN_PARENT_RIGHT,
        ALIGN_PARENT_BOTTOM,
        CENTER_IN_PARENT,
        CENTER_HORIZONTAL,
        CENTER_VERTICAL
    }

    public enum VIDEO_RATIO {
        VIDEO_OUT_RATIO_1_1,
        VIDEO_OUT_RATIO_4_3,
        VIDEO_OUT_RATIO_3_4,
        VIDEO_OUT_RATIO_16_9,
        VIDEO_OUT_RATIO_9_16,
        VIDEO_OUT_RATIO_ORIGINAL
    }

    public enum VIDEO_SCALETYPE {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public enum Video_Rotation {
        VideoRotation_0,
        VideoRotation_90,
        VideoRotation_180,
        VideoRotation_270
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$b */
    public interface AbstractC63846b {
        /* renamed from: a */
        BefTextLayoutResult mo220743a(String str, BefTextLayout befTextLayout);
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$c */
    public interface AbstractC63847c {
        /* renamed from: a */
        void mo220744a(String[] strArr);
    }

    public enum GET_FRAMES_FLAGS {
        GET_FRAMES_MODE_NORMAL(1),
        GET_FRAMES_MODE_NOEFFECT(2),
        GET_FRAMES_MODE_ORIGINAL(4),
        GET_FRAMES_MODE_NORMAL_SCORE(9),
        GET_FRAMES_MODE_NOEFFECT_SCORE(10),
        GET_FRAMES_MODE_ORIGINAL_SCORE(12);
        
        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        private GET_FRAMES_FLAGS(int i) {
            this.mValue = i;
        }
    }

    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateIn can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateOut can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_UpdateInOut can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Forward can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Clear can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Accurate can be incorrect */
    /* JADX WARN: Init of enum EDITOR_SEEK_FLAG_LAST_Accurate_Clear can be incorrect */
    public enum SEEK_MODE {
        EDITOR_SEEK_FLAG_OnGoing(0),
        EDITOR_SEEK_FLAG_LastSeek(1),
        EDITOR_SEEK_FLAG_ToIframe(2),
        EDITOR_SEEK_FLAG_LAST_UpdateIn(r1.getValue() | 4),
        EDITOR_SEEK_FLAG_LAST_UpdateOut(r1.getValue() | 8),
        EDITOR_SEEK_FLAG_LAST_UpdateInOut(r1.getValue() | 16),
        EDITOR_SEEK_FLAG_Forward(SmActions.ACTION_ONTHECALL_EXIT),
        EDITOR_SEEK_FLAG_LAST_Forward(r12.getValue() | r1.getValue()),
        EDITOR_SEEK_FLAG_LAST_Clear(r1.getValue() | DynamicModule.f58006b),
        EDITOR_SEEK_FLAG_LAST_Accurate(r1.getValue() | 640),
        EDITOR_SEEK_FLAG_LAST_Accurate_Clear(r1.getValue() | 896),
        EDITOR_REFRESH_MODE(1024),
        EDITOR_SEEK_FLAG_LAST_Without_EffectAndSticker(24577),
        EDITOR_REFRESH_MODE_FOECE(4194304);
        
        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        private SEEK_MODE(int i) {
            this.mValue = i;
        }
    }

    public enum SET_RANGE_MODE {
        EDITOR_TIMERANGE_FLAG_BEFORE_SPEED(0),
        EDITOR_TIMERANGE_FLAG_AFTER_SPEED(1);
        
        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        private SET_RANGE_MODE(int i) {
            this.mValue = i;
        }
    }

    public enum VEState {
        ANY(65535),
        ERROR(0),
        NOTHING(1048576),
        IDLE(1),
        INITIALIZED(2),
        PREPARED(4),
        STARTED(8),
        PAUSED(16),
        SEEKING(32),
        STOPPED(64),
        COMPLETED(SmActions.ACTION_ONTHECALL_EXIT);
        
        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        public static VEState valueOf(int i) {
            if (i == 0) {
                return ERROR;
            }
            if (i == 1) {
                return IDLE;
            }
            if (i == 2) {
                return INITIALIZED;
            }
            if (i == 4) {
                return PREPARED;
            }
            if (i == 8) {
                return STARTED;
            }
            if (i == 16) {
                return PAUSED;
            }
            if (i == 32) {
                return SEEKING;
            }
            if (i == 64) {
                return STOPPED;
            }
            if (i == 128) {
                return COMPLETED;
            }
            if (i == 65535) {
                return ANY;
            }
            if (i != 1048576) {
                return null;
            }
            return NOTHING;
        }

        private VEState(int i) {
            this.mValue = i;
        }
    }

    /* renamed from: h */
    public static void m250668h() {
        TEVideoUtils.nativeCancelCompileProbe();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public TEInterface mo220704c() {
        return this.ah;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo220713j() {
        return this.an;
    }

    /* renamed from: a */
    public void mo220693a(Surface surface) {
        Rect rect;
        C63929ab.m250978c("VEEditor", "surfaceCreated...");
        this.aA = false;
        if (this.az && this.aC != null) {
            Canvas lockCanvas = surface.lockCanvas(null);
            int width = lockCanvas.getWidth();
            int height = lockCanvas.getHeight();
            int width2 = this.aC.getWidth();
            int height2 = this.aC.getHeight();
            C63929ab.m250974a("VEEditor", "width " + width + " height " + height + " image width " + width2 + " image height " + height2);
            float f = (float) width;
            float f2 = (float) height;
            float f3 = ((float) width2) / ((float) height2);
            if (f3 > f / f2) {
                int i = (height - ((int) (f / f3))) / 2;
                rect = new Rect(0, i, width, height - i);
            } else {
                int i2 = (width - ((int) (f2 * f3))) / 2;
                rect = new Rect(i2, 0, width - i2, height);
            }
            lockCanvas.drawBitmap(this.aC, (Rect) null, rect, (Paint) null);
            surface.unlockCanvasAndPost(lockCanvas);
            if (this.aB) {
                Bitmap bitmap = this.aC;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.aC.recycle();
                    this.aC = null;
                }
                this.aB = false;
            }
        }
        this.ah.setPreviewSurface(surface);
    }

    /* renamed from: a */
    public void mo220692a(int i, int i2) {
        C63929ab.m250974a("VEEditor", "onSurfaceChanged... " + i + ", " + i2);
        this.f161176o = i;
        this.f161177p = i2;
        mo220712i();
        if (i != 0 && i2 != 0) {
            this.ah.setSurfaceSize(i, i2);
        }
    }

    /* renamed from: a */
    public void mo220691a(int i) {
        int i2 = i;
        if (i2 == 1 || i2 == 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.aw;
            C63929ab.m250978c("VEEditor", "compile cost:" + currentTimeMillis);
            C60229h.m234095a("te_composition_time", currentTimeMillis);
            C60229h.m234090a(1, "te_composition_time", currentTimeMillis);
            if (C59385c.m230538a(this.av)) {
                int[] iArr = new int[10];
                if (TEVideoUtils.getVideoFileInfo(this.av, iArr) != null) {
                    long length = new File(this.av).length();
                    C60229h.m234095a("te_composition_page_mode", (long) this.aG);
                    double d = (((double) length) / 1024.0d) / 1024.0d;
                    C60229h.m234094a("te_composition_file_size", d);
                    C60229h.m234094a("te_composition_file_duration", (double) iArr[3]);
                    C60229h.m234094a("te_composition_bit_rate", (double) iArr[6]);
                    C60229h.m234094a("te_composition_fps", (double) iArr[7]);
                    C60229h.m234096a("te_composition_resolution", "" + iArr[0] + "x" + iArr[1]);
                    C60229h.m234090a(1, "te_composition_page_mode", (long) this.aG);
                    C60229h.m234091a(1, "te_composition_resolution", "" + iArr[0] + "x" + iArr[1]);
                    C60229h.m234089a(1, "te_composition_fps", (double) iArr[7]);
                    C60229h.m234089a(1, "te_composition_bit_rate", (double) iArr[6]);
                    C60229h.m234089a(1, "te_composition_file_duration", (double) iArr[3]);
                    C60229h.m234089a(1, "te_composition_file_size", d);
                    int d2 = this.ay.mo205714d();
                    if (d2 != 0) {
                        C60229h.m234090a(1, "te_composition_time_filter_type", (long) d2);
                    }
                    C60192a.m233969a("te_composition_file_duration", (long) iArr[3]);
                    C60192a.m233969a("te_composition_video_frame_rate", (long) iArr[7]);
                }
            }
            boolean b = this.ay.mo205712b();
            long j = 0;
            C60229h.m234090a(1, "te_composition_effect_add", b ? 0 : 1);
            if (!b) {
                C60229h.m234091a(1, "te_composition_effect_json", this.ay.mo205710a(0));
            }
            boolean c = this.ay.mo205713c();
            if (!c) {
                j = 1;
            }
            C60229h.m234090a(1, "te_composition_info_sticker_add", j);
            if (!c) {
                C60229h.m234091a(1, "te_composition_info_sticker_json", this.ay.mo205710a(1));
            }
            this.ay.mo205711a();
            C60229h.m234088a(C60229h.f150340b);
            C60229h.m234091a(1, "iesve_veeditor_composition_finish_file", this.f161156P);
            C60229h.m234091a(1, "iesve_veeditor_composition_finish_result", "succ");
            C60229h.m234091a(1, "iesve_veeditor_composition_finish_reason", "");
            Map<String, String> e = C60229h.m234111e(1);
            JSONObject jSONObject = new JSONObject();
            try {
                C60229h.m234099a(e, jSONObject);
                jSONObject.put("usage_type", this.f161173l);
                if (i2 == 1 || i2 == 2) {
                    i2 = 0;
                }
                jSONObject.put("resultCode", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            C60217b.m234045a("vesdk_event_editor_compile_finish", jSONObject, "performance");
            C60217b.m234045a("vesdk_event_editor_compile_finish", jSONObject, "behavior");
            C60229h.m234107b(1);
        }
    }

    /* renamed from: a */
    public boolean mo220696a(VEVideoEncodeSettings vEVideoEncodeSettings) throws VEException {
        synchronized (this) {
            if (!this.ar) {
                throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
            } else if (this.ah.getNativeHandler() == 0) {
                return false;
            } else {
                VEPublishSettingManager.m251376a().mo221766a(this.ah.genEditorStatus());
                VEPublishSettingManager.m251376a().mo221767a(vEVideoEncodeSettings, VERuntime.m251382a().mo221789g());
                return VEPublishSettingManager.m251376a().mo221768b();
            }
        }
    }

    /* renamed from: a */
    public boolean mo220697a(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings) throws VEException {
        this.f161164c = null;
        boolean a = m250662a(str, str2, vEVideoEncodeSettings, VEAudioEncodeSettings.f161028a);
        if (!a) {
            C63929ab.m250980d("VEEditor", "_compile failed");
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean[] mo220698a(String[] strArr) {
        boolean[] zArr;
        synchronized (this) {
            int length = strArr.length;
            zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (str != null && !str.isEmpty()) {
                    zArr[i] = true;
                }
            }
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo220695a(int[] iArr) {
        if (this.f161148H.mo221151a()) {
            for (int i : iArr) {
                this.f161148H.mo221150a(i);
            }
        }
    }

    /* renamed from: e */
    public Bitmap mo220709e() {
        C63929ab.m250974a("VEEditor", "getCurrDisplayImage...");
        return mo220699b(-1);
    }

    /* renamed from: l */
    private void m250670l() {
        String b = C64078a.m251463b(Build.MODEL.toLowerCase());
        C63929ab.m250978c("VEEditor", "addCopyright... ");
        this.ah.addMetaData("copyright", b);
    }

    /* renamed from: k */
    private void m250669k() {
        this.f161148H = new C63931ac(this);
        this.f161149I = new al(this);
        this.f161150J = new C64032m(this);
        this.f161151K = new C64068s(this);
        this.f161152L = new ak(this);
        this.f161153M = new C64031l(this);
    }

    /* renamed from: a */
    public void mo220690a() {
        if (this.f161175n.get()) {
            C63929ab.m250978c("VEEditor", "no need to releasePreviewSurface, is destroying, just return");
            return;
        }
        synchronized (this) {
            if (this.f161175n.get()) {
                C63929ab.m250978c("VEEditor", "no need to releasePreviewSurface, just lock return");
                return;
            }
            C63929ab.m250978c("VEEditor", "surfaceDestroyed...");
            this.ah.releasePreviewSurface();
        }
    }

    /* renamed from: d */
    public VESize mo220706d() {
        VESize vESize = new VESize(this.f161155O.width, this.f161155O.height);
        C63929ab.m250974a("VEEditor", "getVideoResolution... width:" + vESize.width + ", height:" + vESize.height);
        return vESize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.VEEditor$3 */
    public static /* synthetic */ class C638373 {

        /* renamed from: a */
        static final /* synthetic */ int[] f161200a;

        /* renamed from: b */
        static final /* synthetic */ int[] f161201b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.C638373.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo220712i() {
        float f = ((float) this.f161155O.width) / ((float) this.f161155O.height);
        int i = this.f161176o;
        int i2 = this.f161177p;
        if (f > ((float) i) / ((float) i2)) {
            this.ad = i;
            this.ae = (int) (((float) i) / (((float) this.f161155O.width) / ((float) this.f161155O.height)));
        } else {
            this.ae = i2;
            this.ad = (int) (((float) i2) / (((float) this.f161155O.height) / ((float) this.f161155O.width)));
        }
        C63929ab.m250974a("VEEditor", "updateInitDisplaySize... mInitDisplayWidth:" + this.ad + ", mInitDisplayHeight:" + this.ae);
    }

    /* renamed from: f */
    public int mo220710f() {
        int prepareEngine;
        synchronized (this) {
            C63929ab.m250978c("VEEditor", "prepare...");
            mo220707d(this.aJ);
            this.ah.setEnableRemuxVideo(false);
            this.ah.setUsrRotate(0);
            this.ah.enableReEncodeOpt(false);
            int i = this.aH;
            if (i == 1) {
                VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("ve_editor_firstframe_delay");
                if (!(a == null || a.mo220637a() == null || !(a.mo220637a() instanceof Integer))) {
                    this.ah.setEditorFirstFrameDelay(((Integer) a.mo220637a()).intValue());
                }
            } else if (i == 2) {
                VEConfigCenter.C63827a a2 = VEConfigCenter.m250617a().mo220631a("ve_record_editor_firstframe_delay");
                if (!(a2 == null || a2.mo220637a() == null || !(a2.mo220637a() instanceof Integer))) {
                    this.ah.setEditorFirstFrameDelay(((Integer) a2.mo220637a()).intValue());
                }
            } else {
                this.ah.setEditorFirstFrameDelay(0);
            }
            prepareEngine = this.ah.prepareEngine(0);
            if (prepareEngine != 0) {
                C63929ab.m250980d("VEEditor", "prepare() prepareEngine failed: result: " + prepareEngine);
                mo220700b();
            }
            int[] initResolution = this.ah.getInitResolution();
            this.f161155O.width = initResolution[0];
            this.f161155O.height = initResolution[1];
            if (this.f161176o > 0 && this.f161177p > 0) {
                mo220712i();
            }
            mo220705c(this.aI);
        }
        return prepareEngine;
    }

    /* renamed from: g */
    public void mo220711g() {
        this.f161175n.set(true);
        C63929ab.m250978c("VEEditor", "destroy... set destroying true");
        synchronized (this) {
            this.ar = false;
            C63929ab.m250978c("VEEditor", "onDestroy... ");
            m250668h();
            if (this.ah.getNativeHandler() != 0) {
                this.ah.stop();
                if (this.aG == 1) {
                    C60229h.m234107b(3);
                }
                SurfaceView surfaceView = this.f175463ai;
                if (surfaceView != null) {
                    surfaceView.getHolder().removeCallback(this.aL);
                } else {
                    TextureView textureView = this.aj;
                    if (textureView != null && textureView.getSurfaceTextureListener() == this.aK) {
                        this.aj.setSurfaceTextureListener(null);
                    }
                }
                this.f175463ai = null;
                this.aj = null;
                this.f161178q = null;
                TEInterface tEInterface = this.ah;
                if (tEInterface != null) {
                    tEInterface.setOpenGLListeners(null);
                    this.ah.setInfoListener(null);
                    this.ah.setErrorListener(null);
                    this.ah.destroyEngine();
                }
                this.f161154N = null;
                Bitmap bitmap = this.aC;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.aC.recycle();
                    this.aC = null;
                }
                this.f161175n.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vesdk.VEEditor$a */
    public class RunnableC63845a implements Runnable {

        /* renamed from: a */
        String f161213a;

        /* renamed from: b */
        String f161214b;

        /* renamed from: c */
        String f161215c;

        /* renamed from: d */
        AbstractC64045p f161216d;

        /* renamed from: e */
        boolean f161217e;

        /* renamed from: g */
        private String f161219g;

        /* renamed from: h */
        private int f161220h = 50;

        /* renamed from: i */
        private int f161221i = 50;

        /* renamed from: j */
        private int f161222j = 100;

        /* renamed from: k */
        private int f161223k = 100;

        /* renamed from: l */
        private boolean f161224l;

        /* renamed from: m */
        private int f161225m;

        /* renamed from: n */
        private int f161226n;

        /* renamed from: o */
        private int f161227o = -1;

        public void run() {
            String str;
            String str2;
            if (TextUtils.isEmpty(this.f161214b) || TextUtils.isEmpty(this.f161215c) || this.f161217e) {
                AbstractC64045p pVar = this.f161216d;
                if (pVar != null) {
                    pVar.mo196111a(4103, -205, BitmapDescriptorFactory.HUE_RED, "File is empty or running");
                    return;
                }
                return;
            }
            this.f161217e = true;
            if (this.f161224l) {
                str = String.format(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -y -i %s -vf palettegen=reserve_transparent=on %s", Integer.valueOf(this.f161225m), Integer.valueOf(this.f161226n), this.f161214b, this.f161213a);
            } else {
                str = String.format("ffmpeg -y -i %s -vf palettegen %s", this.f161214b, this.f161213a);
            }
            int executeFFmpegCommand = TEVideoUtils.executeFFmpegCommand(str, null);
            if (executeFFmpegCommand != 0) {
                this.f161217e = false;
                AbstractC64045p pVar2 = this.f161216d;
                if (pVar2 != null) {
                    pVar2.mo196111a(4103, executeFFmpegCommand, BitmapDescriptorFactory.HUE_RED, "ffmpeg gen palette");
                    return;
                }
                return;
            }
            if (this.f161224l) {
                str2 = String.format(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -r %d -y -i %s -i %s -lavfi paletteuse %s", Integer.valueOf(this.f161225m), Integer.valueOf(this.f161226n), Integer.valueOf(this.f161227o), this.f161214b, this.f161213a, this.f161215c);
            } else if (this.f161219g != null) {
                str2 = String.format(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [2:v]scale=w=%d:h=%d[o0];[0:v][o0]overlay=x=%d-w/2:y=%d-h/2[o1];[o1][1:v]paletteuse -f gif %s", this.f161214b, this.f161213a, this.f161219g, Integer.valueOf(this.f161220h), Integer.valueOf(this.f161221i), Integer.valueOf(this.f161222j), Integer.valueOf(this.f161223k), this.f161215c);
            } else {
                str2 = String.format(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", this.f161214b, this.f161213a, this.f161215c);
            }
            int executeFFmpegCommand2 = TEVideoUtils.executeFFmpegCommand(str2, null);
            AbstractC64045p pVar3 = this.f161216d;
            if (pVar3 != null) {
                pVar3.mo196111a(4103, executeFFmpegCommand2, BitmapDescriptorFactory.HUE_RED, "ffmepg convert to gif");
            }
            if (this.f161224l && new File(this.f161214b).delete()) {
                C63929ab.m250974a("VEEditor", "clear raw data:" + this.f161214b);
            }
            this.f161217e = false;
        }

        /* renamed from: a */
        public void mo220730a(int i) {
            this.f161225m = i;
        }

        /* renamed from: b */
        public void mo220734b(int i) {
            this.f161226n = i;
        }

        /* renamed from: c */
        public void mo220736c(int i) {
            this.f161227o = i;
        }

        /* renamed from: d */
        public void mo220738d(int i) {
            this.f161220h = i;
        }

        /* renamed from: e */
        public void mo220739e(int i) {
            this.f161221i = i;
        }

        /* renamed from: f */
        public void mo220740f(int i) {
            this.f161222j = i;
        }

        /* renamed from: g */
        public void mo220741g(int i) {
            this.f161223k = i;
        }

        /* renamed from: a */
        public void mo220731a(AbstractC64045p pVar) {
            this.f161216d = pVar;
        }

        /* renamed from: b */
        public void mo220735b(String str) {
            this.f161214b = str;
        }

        /* renamed from: a */
        public void mo220732a(String str) {
            this.f161219g = str;
        }

        RunnableC63845a() {
        }

        /* renamed from: a */
        public void mo220733a(boolean z) {
            this.f161224l = z;
        }

        /* renamed from: c */
        public void mo220737c(String str) {
            this.f161215c = str;
            if (TextUtils.isEmpty(str)) {
                this.f161213a = null;
                return;
            }
            this.f161213a = new File(this.f161215c).getParent() + File.separatorChar + "palette.png";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo220700b() {
        long j;
        boolean b = this.ay.mo205712b();
        long j2 = 0;
        if (b) {
            j = 0;
        } else {
            j = 1;
        }
        C60229h.m234090a(1, "te_composition_effect_add", j);
        if (!b) {
            C60229h.m234091a(1, "te_composition_effect_json", this.ay.mo205710a(0));
        }
        boolean c = this.ay.mo205713c();
        if (!c) {
            j2 = 1;
        }
        C60229h.m234090a(1, "te_composition_info_sticker_add", j2);
        if (!c) {
            C60229h.m234091a(1, "te_composition_info_sticker_json", this.ay.mo205710a(1));
        }
        this.ay.mo205711a();
        C60229h.m234091a(1, "iesve_veeditor_composition_finish_file", this.f161156P);
        C60229h.m234091a(1, "iesve_veeditor_composition_finish_result", "fail");
        C60229h.m234091a(1, "iesve_veeditor_composition_finish_reason", "");
        C60229h.m234107b(1);
    }

    /* renamed from: a */
    public int mo220687a(SCALE_MODE scale_mode) {
        return mo220688a(scale_mode, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: c */
    public int mo220703c(boolean z) {
        return this.ah.enableEffectAmazing(z);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C63929ab.m250981e("VEEditor", "onFrameAvailable...");
    }

    /* renamed from: a */
    public void mo220694a(AbstractC64045p pVar) {
        this.f161172k = pVar;
        C63929ab.m250974a("VEEditor", "setOnErrorListener...");
    }

    /* renamed from: b */
    public void mo220701b(AbstractC64045p pVar) {
        C63929ab.m250974a("VEEditor", "setOnInfoListener...");
        this.f161171j = pVar;
    }

    /* renamed from: d */
    public void mo220708d(boolean z) {
        C63929ab.m250974a("VEEditor", "setLoopPlay");
        this.ah.setLooping(z);
    }

    /* renamed from: a */
    public static int m250660a(boolean z) {
        C63929ab.m250974a("VEEditor", "setEnableEffectTransition: " + z);
        return TEInterface.setEnableEffectTransition(z);
    }

    /* renamed from: b */
    public static int m250664b(boolean z) {
        C63929ab.m250974a("VEEditor", "setEnableEffectCanvas: " + z);
        return TEInterface.setEnableEffectCanvas(z);
    }

    /* renamed from: c */
    public void mo220705c(int i) {
        C63929ab.m250974a("VEEditor", "setBackgroundColor... color:" + i);
        this.aI = i;
        this.ah.setBackGroundColor(i);
    }

    /* renamed from: d */
    public void mo220707d(int i) {
        C63929ab.m250974a("VEEditor", "setVideoBackgroudColor... color:" + i);
        this.aJ = i;
        this.ah.setVideoBackGroundColor(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo220702b(String[] strArr) {
        String[] strArr2;
        synchronized (this) {
            int length = strArr.length;
            this.ak = 0;
            this.al = 0;
            strArr2 = new String[length];
            for (int i = 0; i < length; i++) {
                String a = m250661a(strArr[i]);
                if (a == null || a.isEmpty()) {
                    strArr2[i] = "";
                } else {
                    strArr2[i] = a;
                }
            }
        }
        return strArr2;
    }

    /* renamed from: b */
    private String m250665b(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String addFileInfoCache = this.ah.addFileInfoCache(str);
            if (addFileInfoCache != null) {
                if (!addFileInfoCache.equals("")) {
                    long lastModified = new File(str).lastModified();
                    if (lastModified == 0) {
                        return "";
                    }
                    f161137W.put(str, new Pair<>(Long.valueOf(lastModified), addFileInfoCache));
                    return addFileInfoCache;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.vesdk.VEEditor$d */
    private class HandlerC63848d extends Handler {
        public void handleMessage(Message message) {
            String str;
            int i = message.what;
            if (i != 4101) {
                if (i != 4103) {
                    if (i != 4105) {
                        if (i != 4117) {
                            if (i != 4133) {
                                if (i == 4157 && VEEditor.this.f161170i != null) {
                                    VEEditor.this.f161170i.mo220836a(message.arg1, message.arg2);
                                }
                            } else if (VEEditor.this.f161166e != null) {
                                VEEditor.this.f161166e.mo220832a(message.arg1, message.arg2);
                            }
                        } else if (VEEditor.this.f161145E != null) {
                            VEEditor.this.f161145E.mo220855a(null, -1, -1, -1, BitmapDescriptorFactory.HUE_RED);
                            VEEditor.this.f161145E = null;
                        }
                    } else if (VEEditor.this.f161164c != null) {
                        VEEditor.this.f161164c.mo220848a(((Float) message.obj).floatValue());
                    }
                } else if (VEEditor.this.f161164c != null) {
                    if (message.arg1 < 0) {
                        VEListener.AbstractC63870m mVar = VEEditor.this.f161164c;
                        int i2 = message.arg1;
                        int i3 = message.arg1;
                        if (message.obj == null) {
                            str = "";
                        } else {
                            str = message.obj.toString();
                        }
                        mVar.mo220849a(i2, i3, BitmapDescriptorFactory.HUE_RED, str);
                    } else {
                        VEEditor.this.f161164c.mo220847a();
                    }
                    VEEditor.this.f161164c = null;
                }
            } else if (VEEditor.this.f161163b != null) {
                VEEditor.this.f161163b.mo220851a(0);
                VEEditor.this.f161163b = null;
            }
        }

        public HandlerC63848d(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: e */
    public static int m250667e(int i) {
        C63929ab.m250974a("VEEditor", "setOptConfig... " + i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("config", i);
            C60217b.m234045a("vesdk_event_editor_opt_config", jSONObject, "performance");
        } catch (JSONException e) {
            C63929ab.m250980d("VEEditor", "report optConfig json err " + e);
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("crossplat_glbase_fbo", (Object) false)).booleanValue()) {
            i |= 2097152;
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("use_byte264", (Object) false)).booleanValue()) {
            i |= 33554432;
        }
        boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("optimize srv_um crash", (Object) false)).booleanValue();
        if (booleanValue) {
            i |= 1073741824;
        }
        C63929ab.m250980d("VEEditor", "enableColorspace: " + booleanValue);
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("color_space", (Object) false)).booleanValue()) {
            i |= 536870912;
        }
        if (((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_render_encode_resolution_align4", (Object) false)).booleanValue() && Build.VERSION.SDK_INT >= 24) {
            C63929ab.m250974a("VEEditor", "enableRenderEncodeAlign4: true");
            i |= 16777216;
            TEAvcEncoder.setEncodeResolutionAlign(4);
        }
        VERuntimeConfig.m250893a(i);
        return TEInterface.setEnableOpt(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r0 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        com.ss.android.vesdk.C63929ab.m250980d("VEEditor", "getDisplayImage failed " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r6.isRecycled() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r6.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo220699b(int r6) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.mo220699b(int):android.graphics.Bitmap");
    }

    public VEEditor(String str) throws VEException {
        if (!TextUtils.isEmpty(str)) {
            C63929ab.m250974a("VEEditor", "VEEditor offscreen");
            this.ah = TEInterface.createEngine();
            this.f161154N = new C64061c(str);
            this.ah.setOpenGLListeners(this.aM);
            this.ah.setInfoListener(this.ab);
            this.ah.setErrorListener(this.ac);
            C60223e.m234073a("iesve_veeditor_offscreen", 1, (C64030a) null);
            mo220703c(false);
            m250669k();
            return;
        }
        throw new VEException(-100, "workspace is: " + str);
    }

    /* renamed from: a */
    private String m250661a(String str) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                C63929ab.m250974a("VEEditor", "file info cache miss: " + str);
                this.al = this.al + 1;
                return "";
            }
            Pair<Long, String> pair = f161137W.get(str);
            if (pair == null) {
                C63929ab.m250974a("VEEditor", "file info cache miss: " + str);
                this.al = this.al + 1;
                String b = m250665b(str);
                if (!b.equals("")) {
                    return b;
                }
                C63929ab.m250980d("VEEditor", "add file info cache for " + str + " failed");
                return "";
            }
            long lastModified = new File(str).lastModified();
            if (lastModified == 0) {
                f161137W.remove(str);
                C63929ab.m250974a("VEEditor", "file info cache miss: " + str);
                this.al = this.al + 1;
                return "";
            } else if (lastModified > ((Long) pair.first).longValue()) {
                f161137W.remove(str);
                String b2 = m250665b(str);
                if (b2.equals("")) {
                    C63929ab.m250974a("VEEditor", "file info cache miss: " + str);
                    return "";
                }
                C63929ab.m250974a("VEEditor", "update file info cache for " + str);
                this.al = this.al + 1;
                return b2;
            } else {
                C63929ab.m250974a("VEEditor", "file info cache hit: " + str);
                this.ak = this.ak + 1;
                return (String) pair.second;
            }
        }
    }

    /* renamed from: b */
    private boolean m250666b(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C64061c cVar;
        if (this.f161160U == null || (cVar = this.f161154N) == null) {
            C63929ab.m250980d("VEEditor", "concatShootVideo mRecordData or mResManager is empty ");
            return false;
        }
        String a = cVar.mo221801a();
        if (a.isEmpty()) {
            C63929ab.m250980d("VEEditor", "workSpace is empty ");
            return false;
        }
        String str = a + "/concatShootVideo" + System.currentTimeMillis();
        C63929ab.m250976b("VEEditor", "concatVideoPath = " + str);
        List<VERecordData.VERecordSegmentData> b = this.f161160U.mo220911b();
        if (b != null && b.size() > 1) {
            C63929ab.m250976b("VEEditor", "listRecordSegmentData size() = " + b.size());
            String[] strArr = new String[b.size()];
            long[] jArr = new long[b.size()];
            for (int i = 0; i < b.size(); i++) {
                VERecordData.VERecordSegmentData vERecordSegmentData = b.get(i);
                strArr[i] = vERecordSegmentData.f161353a;
                jArr[i] = vERecordSegmentData.f161355c;
            }
            if (mo220696a(vEVideoEncodeSettings) && vEVideoEncodeSettings.isEnableRemuxVideoForShoot() && this.f161160U.mo220910a()) {
                if (!C64046q.m251366a(strArr)) {
                    C63929ab.m250980d("VEEditor", "isCodecsValid false ");
                    this.aa = 1025;
                    return false;
                }
                boolean a2 = m250663a(str, strArr, jArr);
                C63929ab.m250980d("VEEditor", "_concatShootVideo ret = " + a2);
                if (a2 && C64047r.m251370a(str)) {
                    this.ah.stop();
                    if (this.ah.updateTrackClips(0, 0, new String[]{str}) != 0) {
                        C63929ab.m250980d("VEEditor", "updateTrackClips failed, ret = " + a2);
                        return false;
                    }
                    this.ah.createTimeline();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m250663a(String str, String[] strArr, long[] jArr) {
        boolean z;
        synchronized (this) {
            if (!this.ar) {
                throw new VEException(-105, "Make sure the initialization is successful before coding!!!");
            } else if (this.ah.getNativeHandler() == 0) {
                return false;
            } else {
                VEConfigCenter.C63827a a = VEConfigCenter.m250617a().mo220631a("video_duration_opt");
                if (a == null || a.mo220637a() == null || !(a.mo220637a() instanceof Boolean)) {
                    z = false;
                } else {
                    z = ((Boolean) a.mo220637a()).booleanValue();
                }
                int concatShootVideo = this.ah.concatShootVideo(str, strArr, jArr, z);
                if (concatShootVideo == 0) {
                    return true;
                }
                C63929ab.m250980d("VEEditor", "concatShootVideo failed = ret: " + concatShootVideo);
                return false;
            }
        }
    }

    /* renamed from: a */
    public int mo220688a(SCALE_MODE scale_mode, float f, float f2) {
        C63929ab.m250978c("VEEditor", "setScaleMode... mode:" + scale_mode + ", x = " + f + ", y = " + f2);
        switch (C638373.f161200a[scale_mode.ordinal()]) {
            case 1:
                this.ah.setResizer(2, f, f2);
                return 0;
            case 2:
                this.ah.setResizer(1, f, f2);
                return 0;
            case 3:
                this.ah.setResizer(3, f, f2);
                return 0;
            case 4:
                this.ah.setResizer(4, f, f2);
                return 0;
            case 5:
                this.ah.setResizer(5, f, f2);
                return 0;
            case 6:
                this.ah.setResizer(6, f, f2);
                return 0;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int mo220689a(String[] strArr, String[] strArr2, String[] strArr3, VIDEO_RATIO video_ratio) throws VEException {
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            C60229h.m234110d(1);
            C60229h.m234109c(1);
            this.f161182u = System.currentTimeMillis();
            this.f161183v = System.currentTimeMillis();
            C63929ab.m250974a("VEEditor", "init...");
            if (this.f161154N == null) {
                C63929ab.m250980d("VEEditor", "init mResManager is null");
                return -112;
            }
            boolean booleanValue = ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_file_info_cache", (Object) false)).booleanValue();
            TEInterface.enableFileInfoCache(booleanValue);
            long j = 0;
            if (booleanValue) {
                C63929ab.m250974a("VEEditor", "enable file info cache");
                String[] b = mo220702b(strArr);
                boolean[] a = mo220698a(b);
                long currentTimeMillis = System.currentTimeMillis() - this.f161182u;
                i = this.ah.initVideoEditor(this.f161154N.mo221801a(), strArr, strArr3, strArr2, null, video_ratio.ordinal(), a, b);
                j = currentTimeMillis;
            } else {
                C63929ab.m250974a("VEEditor", "disable file info cache");
                i = this.ah.initVideoEditor(this.f161154N.mo221801a(), strArr, strArr3, strArr2, null, video_ratio.ordinal());
            }
            JSONObject jSONObject = new JSONObject();
            if (strArr != null) {
                try {
                    str = Arrays.toString(strArr);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                str = "";
            }
            jSONObject.put("videoFilePaths", str);
            if (strArr3 != null) {
                str2 = Arrays.toString(strArr3);
            } else {
                str2 = "";
            }
            jSONObject.put("audioFilePaths", str2);
            jSONObject.put("vTrimIn", "");
            jSONObject.put("vTrimOut", "");
            jSONObject.put("aTrimIn", "");
            jSONObject.put("aTrimOut", "");
            jSONObject.put("videoSpeed", "");
            jSONObject.put("audioSpeed", "");
            jSONObject.put("rotate", "");
            if (video_ratio != null) {
                str3 = video_ratio.name();
            } else {
                str3 = "";
            }
            jSONObject.put("videoOutRes", str3);
            jSONObject.put("cacheCheckTime", "" + j);
            jSONObject.put("createSceneTime", "" + (System.currentTimeMillis() - this.f161183v));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i2 = this.ak;
            sb.append(((double) i2) / ((double) (this.al + i2)));
            jSONObject.put("hitRate", sb.toString());
            jSONObject.put("resultCode", i);
            C60217b.m234045a("vesdk_event_editor_init_video", jSONObject, "behavior");
            C63929ab.m250976b("VEEditor", "file info cache json: " + jSONObject.toString());
            if (i != 0) {
                C63929ab.m250980d("VEEditor", "initVideoEditor failed, ret = " + i);
                mo220700b();
                this.ar = false;
                return i;
            }
            this.ar = true;
            this.f161154N.f161758d = false;
            this.ao = video_ratio;
            this.f161154N.f161756b = strArr3;
            this.f161154N.f161755a = strArr;
            this.f161154N.f161757c = strArr2;
            this.f161151K.mo221427a(-1);
            if (strArr3 == null || strArr3.length == 0) {
                z = false;
            } else {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.af = valueOf;
            if (valueOf.booleanValue()) {
                this.f161154N.f161760f = 1;
            } else {
                this.f161154N.f161760f = 0;
            }
            this.f161154N.f161759e = 0;
            this.ag = 0;
            return this.f161151K.mo221426a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04fe A[Catch:{ JSONException -> 0x051e }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0503 A[Catch:{ JSONException -> 0x051e }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x050c A[Catch:{ JSONException -> 0x051e }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0511 A[Catch:{ JSONException -> 0x051e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m250662a(java.lang.String r17, java.lang.String r18, com.ss.android.vesdk.VEVideoEncodeSettings r19, com.ss.android.vesdk.VEAudioEncodeSettings r20) throws com.ss.android.vesdk.VEException {
        /*
        // Method dump skipped, instructions count: 1331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEEditor.m250662a(java.lang.String, java.lang.String, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings):boolean");
    }
}
