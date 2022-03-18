package com.ss.android.lark.sticker.ui.emoticon.preview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.sticker.p2714a.AbstractC55002d;
import com.ss.android.lark.sticker.p2714a.C54998c;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55136c;
import com.ss.android.lark.sticker.ui.emoticon.preview.C55182a;
import com.ss.android.lark.sticker.ui.p2716a.AbstractC55084a;
import com.ss.android.lark.sticker.ui.statistics.StickerHitPoint;
import com.ss.android.lark.sticker.utils.ViewUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import pl.droidsonroids.gif.GifImageView;

public class StickerPreviewView implements C55182a.AbstractC55184b {

    /* renamed from: a */
    public Activity f136215a;

    /* renamed from: b */
    public AbstractC55181a f136216b;

    /* renamed from: c */
    public C55182a.AbstractC55184b.AbstractC55185a f136217c;

    /* renamed from: d */
    public StickerSet f136218d;

    /* renamed from: e */
    public Message f136219e;

    /* renamed from: f */
    private AbstractC55002d f136220f;
    @BindView(7519)
    GifImageView mIvContent;
    @BindView(7520)
    SelectableRoundedImageView mIvCover;
    @BindView(7530)
    RelativeLayout mLayoutBottom;
    @BindView(7528)
    ProgressBar mPbDownloadProgress;
    @BindView(7544)
    CommonTitleBar mTitleBar;
    @BindView(7546)
    TextView mTvAdd;
    @BindView(7536)
    TextView mTvDesc;
    @BindView(7538)
    TextView mTvStickerDesc;
    @BindView(7539)
    TextView mTvTitle;
    @BindView(7542)
    View mViewLine;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView$a */
    public interface AbstractC55181a {
        /* renamed from: a */
        void mo188150a();

        /* renamed from: a */
        void mo188151a(StickerPreviewView stickerPreviewView);
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b
    /* renamed from: c */
    public void mo188143c() {
        this.f136218d.setPerm(StickerSet.Perm.OWN);
        this.f136217c.mo188155b(this.f136218d);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f136216b.mo188151a(this);
        m214091g();
        m214092h();
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b
    /* renamed from: d */
    public void mo188144d() {
        mo188137a(R.string.Lark_Chat_StickerPackAdd, R.color.lkui_N00, true, R.drawable.sticker_set_add_bg_detail);
    }

    /* renamed from: h */
    private void m214092h() {
        this.mLayoutBottom.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.View$OnClickListenerC551783 */

            public void onClick(View view) {
                if (StickerPreviewView.this.f136218d != null) {
                    C55136c.m213981a(StickerPreviewView.this.f136215a, StickerPreviewView.this.f136218d);
                }
            }
        });
        this.mTvAdd.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.View$OnClickListenerC551794 */

            public void onClick(View view) {
                if (StickerPreviewView.this.f136218d == null || StickerPreviewView.this.f136218d.isAdded()) {
                    return;
                }
                if (!StickerPreviewView.this.f136218d.isHasPaid()) {
                    LKUIToast.show(StickerPreviewView.this.f136215a, (int) R.string.Lark_Chat_StickerPackBuyToast);
                    return;
                }
                StickerPreviewView.this.f136217c.mo188154a(StickerPreviewView.this.f136218d);
                StickerHitPoint.f136296a.mo188232a("3", StickerPreviewView.this.f136218d.getStickerSetId(), StickerPreviewView.this.f136218d.getStickers().size());
            }
        });
        this.f136220f = new AbstractC55002d() {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.C551805 */

            @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
            /* renamed from: b */
            public void mo187827b(String str) {
                StickerPreviewView.this.mo188146f();
                StickerPreviewView.this.mo188137a(R.string.Lark_Chat_StickerPackAdded, R.color.text_placeholder, false, R.drawable.sticker_set_added_bg);
            }

            @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
            /* renamed from: a */
            public void mo187825a(String str) {
                StickerPreviewView.this.mPbDownloadProgress.setMax(100);
                StickerPreviewView.this.mPbDownloadProgress.setProgress(100);
                StickerPreviewView.this.mo188146f();
                StickerPreviewView.this.mo188137a(R.string.Lark_Chat_StickerPackAdded, R.color.text_placeholder, false, R.drawable.sticker_set_added_bg);
            }

            @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
            /* renamed from: a */
            public void mo187826a(String str, int i, long j, long j2) {
                StickerPreviewView.this.mo188145e();
                StickerPreviewView.this.mPbDownloadProgress.setMax((int) j2);
                StickerPreviewView.this.mPbDownloadProgress.setProgress((int) j);
            }
        };
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b
    /* renamed from: a */
    public void mo188136a() {
        this.mTitleBar.setRightVisible(false);
        ViewUtils.m214260a(8, this.mViewLine, this.mLayoutBottom);
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b
    /* renamed from: b */
    public void mo188142b() {
        this.mTitleBar.setRightVisible(false);
        ViewUtils.m214260a(8, this.mViewLine, this.mLayoutBottom);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        if (this.f136220f != null && this.f136218d != null) {
            C54998c.m213641a().mo187824b(this.f136218d.getStickerSetId(), this.f136220f);
            this.f136220f = null;
        }
    }

    /* renamed from: e */
    public void mo188145e() {
        ViewUtils.m214260a(0, this.mPbDownloadProgress);
        ViewUtils.m214260a(8, this.mTvAdd);
    }

    /* renamed from: f */
    public void mo188146f() {
        ViewUtils.m214260a(0, this.mTvAdd);
        ViewUtils.m214260a(8, this.mPbDownloadProgress);
    }

    /* renamed from: g */
    private void m214091g() {
        if (DesktopUtil.m144301a((Context) this.f136215a)) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        } else {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
        }
        this.mTitleBar.addAction(new AbstractC55084a(R.drawable.ic_icon_sticker_set_share) {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.C551761 */

            @Override // com.ss.android.lark.sticker.ui.p2716a.AbstractC55084a
            /* renamed from: a */
            public void mo187989a(View view) {
                if (StickerPreviewView.this.f136218d != null && StickerPreviewView.this.f136219e != null) {
                    C54996a.m213619a().mo144099c().mo144110a(StickerPreviewView.this.f136215a, StickerPreviewView.this.f136219e, "quick_click", "image_view");
                    StickerHitPoint.f136296a.mo188234b("2");
                }
            }
        });
        this.mTitleBar.setRightVisible(false);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.StickerPreviewView.View$OnClickListenerC551772 */

            public void onClick(View view) {
                StickerPreviewView.this.f136216b.mo188150a();
            }
        });
        ViewUtils.m214260a(8, this.mIvContent, this.mViewLine, this.mLayoutBottom);
    }

    /* renamed from: a */
    public void setViewDelegate(C55182a.AbstractC55184b.AbstractC55185a aVar) {
        this.f136217c = aVar;
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b
    /* renamed from: a */
    public void mo188139a(StickerSetInfo stickerSetInfo) {
        this.f136219e = stickerSetInfo.getMessage();
        mo188141a(stickerSetInfo.getImageKey(), stickerSetInfo.getStickerSetId());
        this.mTvStickerDesc.setText(stickerSetInfo.getStickerDesc());
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b
    /* renamed from: a */
    public void mo188138a(StickerSet stickerSet) {
        if (stickerSet != null) {
            this.mTitleBar.setRightVisible(true);
            this.f136218d = stickerSet;
            C54998c.m213641a().mo187821a(this.f136218d.getStickerSetId(), this.f136220f);
            ViewUtils.m214260a(0, this.mIvContent, this.mViewLine, this.mLayoutBottom, this.mTvAdd);
            ViewUtils.m214260a(8, this.mPbDownloadProgress);
            C55004f.m213654a().mo187830a(this.f136215a, true, this.mIvCover.getMeasuredWidth(), this.mIvCover.getMeasuredHeight(), this.f136218d.getPreviewKey(), this.mIvCover, R.drawable.sticker_ic_icon_sticker_item_default, R.drawable.sticker_ic_icon_sticker_item_default, this.f136218d.getStickerSetId());
            this.mTvTitle.setText(this.f136218d.getTitle());
            this.mTvDesc.setText(this.f136218d.getDescription());
            if (this.f136218d.isAdded()) {
                mo188137a(R.string.Lark_Chat_StickerPackAdded, R.color.text_placeholder, false, R.drawable.sticker_set_added_bg);
            } else if (!this.f136218d.isHasPaid()) {
                mo188137a(R.string.Lark_Chat_StickerPackBuy, R.color.lkui_N00, true, R.drawable.sticker_set_add_bg_detail);
            } else {
                mo188137a(R.string.Lark_Chat_StickerPackAdd, R.color.lkui_N00, true, R.drawable.sticker_set_add_bg_detail);
            }
        }
    }

    public StickerPreviewView(Activity activity, AbstractC55181a aVar) {
        this.f136215a = activity;
        this.f136216b = aVar;
    }

    /* renamed from: a */
    public void mo188141a(String str, String str2) {
        ViewUtils.m214260a(0, this.mIvContent);
        ViewUtils.m214260a(8, this.mViewLine, this.mLayoutBottom);
        C55004f.m213654a().mo187830a(this.f136215a, true, this.mIvContent.getMeasuredWidth(), this.mIvContent.getMeasuredHeight(), str, this.mIvContent, R.drawable.sticker_ic_icon_sticker_item_default, R.drawable.sticker_ic_icon_sticker_item_default, str2);
    }

    /* renamed from: a */
    public void mo188137a(int i, int i2, boolean z, int i3) {
        this.mTvAdd.setText(i);
        this.mTvAdd.setTextColor(UIUtils.getColor(this.f136215a, i2));
        this.mTvAdd.setEnabled(z);
        this.mTvAdd.setBackgroundResource(i3);
    }
}
