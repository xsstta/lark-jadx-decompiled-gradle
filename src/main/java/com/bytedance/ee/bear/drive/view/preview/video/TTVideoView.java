package com.bytedance.ee.bear.drive.view.preview.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.app.DialogC0259b;
import com.bytedance.ee.bear.drive.view.preview.video.VideoView;
import com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.C7513b;
import com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.C7514c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7557g;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import org.koin.java.KoinJavaComponent;

public class TTVideoView extends VideoView {

    /* renamed from: a */
    public LinkedHashMap<String, String> f20173a = new LinkedHashMap<>();

    /* renamed from: o */
    private C7513b f20174o;

    /* renamed from: p */
    private C11811a f20175p;

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C7513b mo29204g() {
        final C7513b bVar = new C7513b(getContext(), this.f20217j);
        bVar.mo29345a(mo29264k());
        bVar.mo29344a(new ArrayList(this.f20173a.keySet()), new C7514c.AbstractC7516a() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.TTVideoView.C74801 */

            @Override // com.bytedance.ee.bear.drive.view.preview.video.videopopupwindow.C7514c.AbstractC7516a
            /* renamed from: a */
            public void mo29207a(String str, String str2) {
                if (!TextUtils.equals(TTVideoView.this.f20217j, str)) {
                    TTVideoView.this.f20211d.setResolution(str2);
                    TTVideoView tTVideoView = TTVideoView.this;
                    tTVideoView.mo29201a(tTVideoView.f20173a.get(str));
                    TTVideoView.this.f20217j = str;
                    if (bVar.mo29342a() != null) {
                        bVar.mo29342a().dismiss();
                    }
                }
            }
        });
        if (bVar.mo29342a() != null) {
            bVar.mo29342a().setOnDismissListener(new PopupWindow.OnDismissListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.video.TTVideoView.C74812 */

                public void onDismiss() {
                    TTVideoView.this.setWindowAlpha(1.0f);
                }
            });
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7513b bVar = this.f20174o;
        if (bVar != null && bVar.mo29346b()) {
            C13479a.m54764b("DRIVE_VideoPlayer", "activity is destroyed, popup window still alive, dismiss popup window");
            this.f20174o.mo29342a().dismiss();
        }
        C11811a aVar = this.f20175p;
        if (aVar != null && aVar.mo45233e()) {
            C13479a.m54764b("DRIVE_VideoPlayer", "activity is destroyed, action sheet still alive, dismiss action sheet");
            this.f20175p.mo45232d();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoView, com.bytedance.ee.bear.drive.view.preview.video.AbstractC7494a
    /* renamed from: a */
    public void mo29199a() {
        C13479a.m54764b("DRIVE_VideoPlayer", "tt video play");
        if (this.f20220m != null) {
            this.f20220m.liveInnerReportMsg().mo28018a(C7557g.m30300a(11));
        }
        if (this.f20212e == null) {
            C13479a.m54758a("DRIVE_VideoPlayer", "uri is null, stop play video");
        } else {
            this.f20216i.mo29289a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11811a mo29203f() {
        C11811a a = C11811a.m48976a(getContext());
        ArrayList<String> arrayList = new ArrayList(this.f20173a.keySet());
        Collections.reverse(arrayList);
        for (String str : arrayList) {
            String b = m29904b(str);
            $$Lambda$TTVideoView$PFvUrtCSKbVlACrhCJD1aTZ1j4 r4 = new View.OnClickListener(str, b) {
                /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$TTVideoView$PFvUrtCSKbVlACrhCJD1aTZ1j4 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    TTVideoView.m269489lambda$PFvUrtCSKbVlACrhCJD1aTZ1j4(TTVideoView.this, this.f$1, this.f$2, view);
                }
            };
            if (TextUtils.equals(this.f20217j, str)) {
                Resources resources = getContext().getResources();
                Drawable drawable = resources.getDrawable(R.drawable.drive_video_checkmark);
                drawable.setTint(resources.getColor(R.color.primary_pri_500));
                a.mo45219a(C11816b.m49006a().mo45254a((CharSequence) b).mo45258b(true).mo45251a(getContext().getResources().getColor(R.color.primary_pri_500)).mo45253a(r4).mo45252a(drawable).mo45257a());
            } else {
                a.mo45221a(b, r4);
            }
        }
        a.mo45213a();
        return a;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoView
    /* renamed from: a */
    public void mo29200a(VideoView.C7493b bVar) {
        super.mo29200a(bVar);
    }

    public TTVideoView(Context context) {
        super(context);
    }

    /* renamed from: b */
    private String m29904b(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            return str;
        }
        C13479a.m54764b("DRIVE_VideoPlayer", "get resolution");
        String[] split = str.split("_");
        if (split != null) {
            return split[split.length - 1];
        }
        return str;
    }

    public void setWindowAlpha(float f) {
        if ((getContext() instanceof Activity) && C13726a.m55674a(getContext())) {
            WindowManager.LayoutParams attributes = ((Activity) getContext()).getWindow().getAttributes();
            attributes.alpha = f;
            ((Activity) getContext()).getWindow().setAttributes(attributes);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29902a(View view) {
        C13479a.m54764b("DRIVE_VideoPlayer", "video view Resolution click, mCurrentPlayMode=" + this.f20209b);
        if (this.f20209b == 0) {
            C11811a f = mo29203f();
            this.f20175p = f;
            DialogC0259b b = f.mo45224b();
            this.f20175p.mo45231c();
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40652b(b);
            return;
        }
        C7513b g = mo29204g();
        this.f20174o = g;
        g.mo29343a(this);
        setWindowAlpha(0.5f);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.view.preview.video.VideoView
    /* renamed from: b */
    public void mo29202b(VideoView.C7493b bVar) {
        boolean z;
        this.f20173a.clear();
        this.f20173a.putAll(bVar.f20243d);
        VideoPlayerControllerView videoPlayerControllerView = this.f20211d;
        if (this.f20173a.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        videoPlayerControllerView.setResolutionVisible(z);
        C13479a.m54764b("DRIVE_VideoPlayer", "preViewUrls.size() " + this.f20173a.size());
        if (this.f20173a.size() > 1) {
            this.f20218k = this.f20173a.keySet().iterator().next();
            this.f20217j = this.f20173a.keySet().iterator().next();
            this.f20211d.setResolution(m29904b(this.f20217j));
        }
        this.f20211d.setResolutionClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.video.$$Lambda$TTVideoView$k5HKb2JWris1n_2864V12ARLAbs */

            public final void onClick(View view) {
                TTVideoView.lambda$k5HKb2JWris1n_2864V12ARLAbs(TTVideoView.this, view);
            }
        });
    }

    /* renamed from: a */
    public void mo29201a(String str) {
        if (str == null || this.f20216i == null) {
            C13479a.m54764b("DRIVE_VideoPlayer", "uri == null switchVideoResolution failed");
            return;
        }
        C13479a.m54764b("DRIVE_VideoPlayer", "switchVideoResolution... ");
        long g = this.f20216i.mo29304g();
        this.f20216i.mo29299b("");
        this.f20216i.mo29293a(Uri.parse(str));
        this.f20216i.mo29291a((int) g);
        this.f20216i.mo29289a();
    }

    public TTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TTVideoView(Context context, C10917c cVar) {
        super(context, cVar);
    }

    public TTVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29903a(String str, String str2, View view) {
        if (!TextUtils.equals(this.f20217j, str)) {
            this.f20220m.liveInnerReportMsg().mo28018a(C7557g.m30300a(28));
            this.f20211d.setResolution(str2);
            mo29201a(this.f20173a.get(str));
            this.f20217j = str;
        }
    }
}
