package com.ss.android.videoshop.context;

import android.os.Handler;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.api.stub.C64112d;
import com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d;
import com.ss.android.videoshop.controller.C64151f;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.widget.TextureVideoView;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.videoshop.context.a */
public class C64138a {

    /* renamed from: a */
    public static String f161968a = "VideoPrepareManager";

    /* renamed from: b */
    private Map<C64116b, AbstractView$OnLayoutChangeListenerC64144d> f161969b = new HashMap();

    /* renamed from: c */
    private Map<C64116b, TextureVideoView> f161970c = new HashMap();

    /* renamed from: d */
    private Queue<C64116b> f161971d = new LinkedList();

    /* renamed from: e */
    private C64151f f161972e = new C64151f();

    /* renamed from: f */
    private AbstractC64095d f161973f = new C64112d();

    /* renamed from: g */
    private VideoContext f161974g;

    /* renamed from: h */
    private int f161975h = 2;

    /* renamed from: i */
    private Handler f161976i = new Handler();

    C64138a() {
    }

    /* renamed from: a */
    public void mo222100a() {
        try {
            String str = f161968a;
            C64159a.m252083b(str, "releaseAllPreparedVideoControllers context:" + this.f161974g.mo222006a().getClass().getSimpleName() + " size:" + this.f161971d.size());
        } catch (Exception unused) {
        }
        this.f161971d.clear();
        for (Map.Entry<C64116b, TextureVideoView> entry : this.f161970c.entrySet()) {
            TextureVideoView value = entry.getValue();
            if (value != null) {
                value.setSurfaceTextureListener(null);
            }
            UIUtils.detachFromParent(value);
        }
        this.f161970c.clear();
        for (Map.Entry<C64116b, AbstractView$OnLayoutChangeListenerC64144d> entry2 : this.f161969b.entrySet()) {
            entry2.getValue().mo222163c();
        }
        this.f161969b.clear();
    }

    /* renamed from: a */
    public void mo222101a(VideoContext videoContext) {
        this.f161974g = videoContext;
    }

    /* renamed from: a */
    public AbstractView$OnLayoutChangeListenerC64144d mo222099a(C64116b bVar) {
        if (bVar != null) {
            String str = f161968a;
            C64159a.m252080a(str, "retrieveVideoController vid:" + bVar.mo221934b() + " title:" + bVar.mo221952l());
        }
        this.f161971d.remove(bVar);
        return this.f161969b.remove(bVar);
    }

    /* renamed from: b */
    public TextureVideoView mo222102b(C64116b bVar) {
        if (bVar != null) {
            String str = f161968a;
            C64159a.m252080a(str, "retrieveTextureVideoView vid:" + bVar.mo221934b() + " title:" + bVar.mo221952l());
        }
        this.f161971d.remove(bVar);
        return this.f161970c.remove(bVar);
    }

    /* renamed from: c */
    public void mo222103c(C64116b bVar) {
        if (bVar != null) {
            final TextureVideoView b = mo222102b(bVar);
            if (b != null) {
                b.setSurfaceTextureListener(null);
            }
            this.f161976i.post(new Runnable() {
                /* class com.ss.android.videoshop.context.C64138a.RunnableC641391 */

                public void run() {
                    UIUtils.detachFromParent(b);
                }
            });
            AbstractView$OnLayoutChangeListenerC64144d a = mo222099a(bVar);
            this.f161971d.remove(bVar);
            if (a != null) {
                try {
                    String str = f161968a;
                    C64159a.m252083b(str, "releasePreparedVideoController vid:" + bVar.mo221934b() + " title:" + bVar.mo221952l() + " size:" + this.f161971d.size() + " context:" + this.f161974g.mo222006a().getClass().getSimpleName());
                } catch (Exception unused) {
                }
                a.mo222163c();
            }
        }
    }
}
