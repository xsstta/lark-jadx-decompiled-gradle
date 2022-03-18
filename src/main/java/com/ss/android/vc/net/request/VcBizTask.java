package com.ss.android.vc.net.request;

import com.bytedance.lark.sdk.AbstractC19831c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.improto.Packet;
import com.ss.android.lark.pb.improto.PayloadType;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.sdk.XAsyncCallbackImpl;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60761j;
import com.ss.android.vc.net.C63534a;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import okio.ByteString;

@XClass
public class VcBizTask<T> {

    /* renamed from: a */
    public Object f160587a;

    /* renamed from: b */
    public Message.Builder f160588b;

    /* renamed from: c */
    public String f160589c;

    /* renamed from: d */
    public volatile boolean f160590d;

    /* renamed from: e */
    public volatile boolean f160591e;

    /* renamed from: f */
    private SdkSender.IParser f160592f;

    @XClass(autoRelease = true, runOnProcess = XProcess.Original)
    public interface onErrorCallback {
        void onError(C63602e eVar);
    }

    /* renamed from: a */
    public VcBizTask mo219888a() {
        this.f160590d = true;
        return this;
    }

    /* renamed from: c */
    public String mo219895c() {
        return this.f160589c;
    }

    /* renamed from: d */
    public VcBizTask mo219896d() {
        return mo219890a(this.f160591e);
    }

    /* renamed from: e */
    private Object m249402e() {
        Object obj = this.f160587a;
        if (obj instanceof Command) {
            return com.bytedance.lark.pb.basic.v1.Command.POST_GATEWAY;
        }
        return obj;
    }

    /* renamed from: b */
    public String mo219894b() {
        Object obj = this.f160587a;
        if (obj != null) {
            return obj.toString();
        }
        return "null";
    }

    /* renamed from: a */
    public VcBizTask mo219889a(AbstractC63598b<T> bVar) {
        return mo219891a(true, bVar);
    }

    /* renamed from: b */
    public VcBizTask mo219893b(AbstractC63598b<T> bVar) {
        return mo219891a(this.f160591e, bVar);
    }

    /* renamed from: a */
    public VcBizTask mo219890a(boolean z) {
        return mo219891a(z, null);
    }

    /* renamed from: a */
    public String mo219892a(ErrorResult errorResult) {
        if (errorResult != null) {
            return errorResult.toString();
        }
        return "null";
    }

    /* renamed from: a */
    public VcBizTask mo219891a(boolean z, final AbstractC63598b<T> bVar) {
        this.f160591e = z;
        this.f160589c = C53234a.m205877a();
        C60871a.m236609a("VcBizTask@", "start " + mo219894b() + " contextId " + this.f160589c);
        XAsyncCallbackImpl xAsyncCallbackImpl = new XAsyncCallbackImpl(m249402e(), this.f160592f, new IGetDataCallback<T>() {
            /* class com.ss.android.vc.net.request.VcBizTask.C635951 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C60871a.m236612c("VcBizTask@", "onError " + VcBizTask.this.mo219894b() + " " + VcBizTask.this.mo219892a(errorResult));
                VcBizTask.processOnError(errorResult, new onErrorCallback() {
                    /* class com.ss.android.vc.net.request.VcBizTask.C635951.C635961 */

                    @Override // com.ss.android.vc.net.request.VcBizTask.onErrorCallback
                    @XMethod
                    public void onError(C63602e eVar) {
                        C60871a.m236612c("VcBizTask@", "onError processOnError " + VcBizTask.this.mo219894b() + " " + VcBizTask.this.mo219892a(eVar.f160599b));
                        if (!VcBizTask.this.f160590d && bVar != null) {
                            if (VcBizTask.this.f160591e) {
                                C60735ab.m236001a(new Runnable(eVar) {
                                    /* class com.ss.android.vc.net.request.$$Lambda$VcBizTask$1$1$hJfIwBAH0mx1AAMMWIyU2LE_ymk */
                                    public final /* synthetic */ C63602e f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void run() {
                                        AbstractC63598b.this.onError(this.f$1);
                                    }
                                });
                            } else {
                                bVar.onError(eVar);
                            }
                        }
                    }
                }, VcBizTask.this.f160587a, VcBizTask.this.f160589c);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(T t) {
                C60871a.m236609a("VcBizTask@", "onSuccess " + VcBizTask.this.mo219894b() + " " + C60761j.m236097a(VcBizTask.this.f160588b));
                if (!VcBizTask.this.f160590d && bVar != null) {
                    if (VcBizTask.this.f160591e) {
                        C60735ab.m236001a(new Runnable(t) {
                            /* class com.ss.android.vc.net.request.$$Lambda$VcBizTask$1$pb_ipvechL9tCOAhDtRrGwHSOE */
                            public final /* synthetic */ Object f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                AbstractC63598b.this.onSuccess(this.f$1);
                            }
                        });
                    } else {
                        bVar.onSuccess(t);
                    }
                }
            }
        }, this.f160589c, false);
        Object obj = this.f160587a;
        if (obj instanceof Command) {
            ByteString of = ByteString.of(this.f160588b.build().encode());
            Packet.C49811a aVar = new Packet.C49811a();
            aVar.mo173371a(this.f160589c);
            aVar.mo173370a(PayloadType.PB2);
            aVar.mo173372a(of);
            aVar.mo173369a((Command) this.f160587a);
            startX(this.f160587a, aVar.build().encode(), this.f160589c, xAsyncCallbackImpl);
        } else {
            startX(obj, this.f160588b.build().encode(), this.f160589c, xAsyncCallbackImpl);
        }
        return this;
    }

    public VcBizTask(Object obj, Message.Builder builder, SdkSender.IParser<T> iParser) {
        this(obj, builder, iParser, false);
    }

    @XMethod(runOnProcess = XProcess.VC)
    public static void processOnError(ErrorResult errorResult, onErrorCallback onerrorcallback, Object obj, String str) {
        C60657a.m235732a().mo208739a(errorResult, onerrorcallback, obj, str);
    }

    public VcBizTask(Object obj, Message.Builder builder, SdkSender.IParser<T> iParser, boolean z) {
        this.f160587a = obj;
        this.f160588b = builder;
        this.f160592f = iParser;
        this.f160591e = z;
    }

    @XMethod(runOnProcess = XProcess.Main)
    private static void startX(Object obj, byte[] bArr, String str, AbstractC19831c cVar) {
        if (obj instanceof Command) {
            C63534a.m248979a(obj, bArr, str, cVar, null, null);
        } else {
            C63534a.m248978a(obj, bArr, str, cVar, null);
        }
    }
}
