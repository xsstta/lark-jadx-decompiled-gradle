package com.ss.android.lark.mm.module.player.core.layer.p2315f;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.collection.WeakHandler;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2315f.AbstractC46642a;
import com.ss.android.lark.mm.module.player.core.layer.p2316g.C46647a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.f.b */
public class C46644b extends AbstractC46619b implements AbstractC46642a.AbstractC46643a {

    /* renamed from: c */
    private C46646c f117356c;

    /* renamed from: d */
    private WeakHandler f117357d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: f */
    private ArrayList<Integer> f117358f = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2315f.C46644b.C466451 */

        {
            add(101);
            add(Integer.valueOf((int) ActivityIdentificationData.WALKING));
            add(Integer.valueOf((int) SmEvents.EVENT_NR));
            add(Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR));
            add(Integer.valueOf((int) SmEvents.EVENT_NT));
            add(Integer.valueOf((int) SmEvents.EVENT_NO));
            add(Integer.valueOf((int) SmEvents.EVENT_RE));
            add(100);
            add(Integer.valueOf((int) SmEvents.EVENT_RS));
            add(104);
        }
    };

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117301d;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117358f;
    }

    /* renamed from: a */
    public void mo163853a(float f) {
        C46646c cVar = this.f117356c;
        if (cVar != null) {
            cVar.mo163856a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: a */
    public void mo163781a(boolean z) {
        C46646c cVar = this.f117356c;
        if (cVar != null) {
            cVar.mo163857a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo163854c(boolean z) {
        if (!z) {
            this.f117356c.mo163858b();
        } else {
            this.f117356c.mo163855a();
        }
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 2001) {
            mo163854c(true);
        }
    }

    public C46644b(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        C45855f.m181663b("MmLoadingLayer", "handleVideoEvent " + C46647a.m184513a(gVar.mo221968b()));
        int b = gVar.mo221968b();
        if (b != 100) {
            if (b != 107) {
                if (!(b == 113 || b == 116)) {
                    switch (b) {
                        case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                            WeakHandler weakHandler = this.f117357d;
                            if (weakHandler != null) {
                                weakHandler.removeMessages(2001);
                                break;
                            }
                            break;
                    }
                }
                mo163854c(false);
            }
            mo163854c(true);
        } else {
            WeakHandler weakHandler2 = this.f117357d;
            if (weakHandler2 != null) {
                weakHandler2.sendEmptyMessageDelayed(2001, 600);
            }
        }
        return super.mo163782a(gVar);
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f117356c == null) {
            C46646c cVar = new C46646c(context);
            this.f117356c = cVar;
            cVar.setCallback(this);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        return Collections.singletonList(new Pair(mo163803a(context, this.f117356c, layoutParams2), layoutParams));
    }
}
