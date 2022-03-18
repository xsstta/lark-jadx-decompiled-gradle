package com.ss.android.lark.share.impl.systemshare.mvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.impl.systemshare.C54764c;
import com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a;
import com.ss.android.lark.share.impl.systemshare.mvp.C54783c;
import com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView;
import com.ss.android.lark.share.impl.systemshare.widget.AdaptiveMaxHeightScrollView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import java.util.List;

public class ShareContentView implements AbstractC54774a.AbstractC54776b {

    /* renamed from: a */
    public AbstractC54774a.AbstractC54776b.AbstractC54777a f135245a;

    /* renamed from: b */
    public C54764c f135246b;

    /* renamed from: c */
    public Context f135247c;

    /* renamed from: d */
    private AbstractC54773a f135248d;
    public AdaptiveMaxHeightScrollView mAdaptiveMaxHeightScrollView;
    View mRootView;
    public GridView mShareImageGV;
    public ImageView mShareImageIV;
    public LinkEmojiTextView mShareTextTV;
    public LinearLayout mShareToChat;
    public LinearLayout mShareToMyself;
    public LinearLayout mShareToTouTiaoQuan;
    public CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView$a */
    public interface AbstractC54773a {
        /* renamed from: a */
        void mo186920a();

        /* renamed from: a */
        void mo186921a(ShareContentView shareContentView);
    }

    /* renamed from: e */
    private void m212501e() {
        m212502f();
        m212503g();
    }

    /* renamed from: d */
    public void mo186935d() {
        AbstractC54773a aVar = this.f135248d;
        if (aVar != null) {
            aVar.mo186920a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f135248d = null;
        this.f135245a = null;
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b
    /* renamed from: b */
    public void mo186933b() {
        LKUIToast.showLoading(this.f135247c, (int) R.string.Lark_Message_SystemShareLoading);
        Log.m165389i("ShareContentActivity", "Dialog has been launched");
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b
    /* renamed from: c */
    public void mo186934c() {
        LKUIToast.cancelLoading();
        Log.m165389i("ShareContentActivity", "dialog is hide");
    }

    /* renamed from: f */
    private void m212502f() {
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.View$OnClickListenerC547681 */

            public void onClick(View view) {
                ShareContentView.this.mo186935d();
            }
        });
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b
    /* renamed from: a */
    public void mo186930a() {
        mo186934c();
        Context context = this.f135247c;
        LKUIToast.show(context, context.getResources().getString(R.string.Lark_Legacy_ShareFailed));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC54773a aVar = this.f135248d;
        if (aVar != null) {
            aVar.mo186921a(this);
        }
        this.f135247c = this.mTitleBar.getContext();
        m212501e();
    }

    /* renamed from: g */
    private void m212503g() {
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.ViewTreeObserver$OnGlobalLayoutListenerC547692 */

            public void onGlobalLayout() {
                ShareContentView.this.f135246b = new C54764c(ShareContentView.this.f135247c, ShareContentView.this.mRootView.getWidth());
                ShareContentView.this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.mShareTextTV.setUrlTextColor(this.f135247c.getResources().getColor(R.color.text_placeholder));
        this.mShareTextTV.setShowUrlUnderLine(false);
        this.mShareTextTV.getPaint().setFakeBoldText(true);
        this.mShareToMyself.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.View$OnClickListenerC547703 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m212510a() {
                ShareContentView.this.mo186935d();
            }

            public void onClick(View view) {
                if (ShareContentView.this.f135245a != null) {
                    ShareContentView.this.f135245a.mo186945a(new C54783c.AbstractC54789d() {
                        /* class com.ss.android.lark.share.impl.systemshare.mvp.$$Lambda$ShareContentView$3$SColnnsTjT6T3rhrpnGytEXBTqE */

                        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54789d
                        public final void onFinish() {
                            ShareContentView.View$OnClickListenerC547703.lambda$SColnnsTjT6T3rhrpnGytEXBTqE(ShareContentView.View$OnClickListenerC547703.this);
                        }
                    });
                }
            }
        });
        this.mShareToChat.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.View$OnClickListenerC547714 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m212511a() {
                ShareContentView.this.mo186935d();
            }

            public void onClick(View view) {
                if (ShareContentView.this.f135245a != null) {
                    ShareContentView.this.f135245a.mo186946b(new C54783c.AbstractC54789d() {
                        /* class com.ss.android.lark.share.impl.systemshare.mvp.$$Lambda$ShareContentView$4$zIyXdtBIS5v1Ey5xr1uSSdpwwE8 */

                        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54789d
                        public final void onFinish() {
                            ShareContentView.View$OnClickListenerC547714.lambda$zIyXdtBIS5v1Ey5xr1uSSdpwwE8(ShareContentView.View$OnClickListenerC547714.this);
                        }
                    });
                }
            }
        });
        this.mShareToTouTiaoQuan.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.share.impl.systemshare.mvp.ShareContentView.View$OnClickListenerC547725 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m212512a() {
                ShareContentView.this.mo186935d();
            }

            public void onClick(View view) {
                if (ShareContentView.this.f135245a != null) {
                    ShareContentView.this.f135245a.mo186947c(new C54783c.AbstractC54789d() {
                        /* class com.ss.android.lark.share.impl.systemshare.mvp.$$Lambda$ShareContentView$5$L22ynaSRPqGNvfJXxgWA1Arzgiw */

                        @Override // com.ss.android.lark.share.impl.systemshare.mvp.C54783c.AbstractC54789d
                        public final void onFinish() {
                            ShareContentView.View$OnClickListenerC547725.lambda$L22ynaSRPqGNvfJXxgWA1Arzgiw(ShareContentView.View$OnClickListenerC547725.this);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54774a.AbstractC54776b.AbstractC54777a aVar) {
        this.f135245a = aVar;
    }

    public ShareContentView(AbstractC54773a aVar) {
        this.f135248d = aVar;
    }

    @Override // com.ss.android.lark.share.impl.systemshare.mvp.AbstractC54774a.AbstractC54776b
    /* renamed from: a */
    public void mo186931a(CommonShareData commonShareData) {
        C54764c cVar;
        String content = commonShareData.getContent();
        List<String> images = commonShareData.getImages();
        List<String> files = commonShareData.getFiles();
        if (!TextUtils.isEmpty(content)) {
            this.mAdaptiveMaxHeightScrollView.setVisibility(0);
            this.mAdaptiveMaxHeightScrollView.setHorizontalFadingEdgeEnabled(false);
            this.mShareTextTV.setVisibility(0);
            this.mShareTextTV.mo198363a((RecogniseSpansResult) null, content, false);
        }
        if (!CollectionUtils.isEmpty(images) && CollectionUtils.isEmpty(files)) {
            int size = images.size();
            if (size == 1) {
                this.mShareImageIV.setVisibility(0);
                ImageLoader.with(this.f135247c).load(images.get(0)).placeholder(R.drawable.ud_icon_nopicture_filled).error(R.drawable.ud_icon_loadfail_filled).into(this.mShareImageIV);
            } else if (size <= 9 && (cVar = this.f135246b) != null) {
                cVar.mo186924a(images);
                this.mShareImageGV.setVisibility(0);
                this.mShareImageGV.setAdapter((ListAdapter) this.f135246b);
            }
        }
    }
}
