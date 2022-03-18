package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.p2714a.AbstractC55002d;
import com.ss.android.lark.sticker.p2714a.C54998c;
import com.ss.android.lark.sticker.p2714a.C55004f;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55130a;
import com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter;
import com.ss.android.lark.sticker.ui.p2716a.AbstractC55084a;
import com.ss.android.lark.sticker.ui.statistics.StickerHitPoint;
import com.ss.android.lark.sticker.utils.ViewUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;

public class StickerSetDetailView implements C55130a.AbstractC55132b {

    /* renamed from: a */
    public Activity f136138a;

    /* renamed from: b */
    public AbstractC55129a f136139b;

    /* renamed from: c */
    public C55130a.AbstractC55132b.AbstractC55133a f136140c;

    /* renamed from: d */
    public StickerSet f136141d;

    /* renamed from: e */
    LKUIStatus f136142e;

    /* renamed from: f */
    private StickerSetDetailAdapter f136143f;

    /* renamed from: g */
    private AbstractC55002d f136144g;
    @BindView(7518)
    ImageView mIvBg;
    @BindView(7508)
    ImageView mIvError;
    @BindView(7510)
    FrameLayout mLoadingLayout;
    @BindView(7528)
    ProgressBar mPbDownload;
    @BindView(7533)
    RecyclerView mRcvStickerSet;
    @BindView(7541)
    CommonTitleBar mTitleBar;
    @BindView(7536)
    TextView mTvDesc;
    @BindView(7509)
    TextView mTvError;
    @BindView(7537)
    LKUIButton mTvStatus;
    @BindView(7539)
    TextView mTvTitle;
    @BindView(7534)
    View mViewContent;
    @BindView(7524)
    LinearLayout mViewEmpty;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView$a */
    public interface AbstractC55129a {
        /* renamed from: a */
        void mo188064a();

        /* renamed from: a */
        void mo188065a(StickerSetDetailView stickerSetDetailView);
    }

    /* renamed from: h */
    private void m213945h() {
        m213947j();
        m213948k();
        m213949l();
        m213950m();
        m213946i();
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: a */
    public void mo188053a() {
        this.f136141d.setPerm(StickerSet.Perm.OWN);
        this.f136140c.mo188068a(this.f136141d);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f136139b.mo188065a(this);
        m213945h();
    }

    /* renamed from: j */
    private void m213947j() {
        this.f136142e = new LKUIStatus.C25680a(this.mLoadingLayout).mo89860b(R.drawable.illustration_empty_negative_load_failed).mo89862c(R.drawable.illustration_empty_negative_load_failed).mo89857a(R.color.bg_body_overlay).mo89859a();
    }

    /* renamed from: m */
    private void m213950m() {
        this.f136144g = new AbstractC55002d() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.C551263 */

            @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
            /* renamed from: b */
            public void mo187827b(String str) {
                StickerSetDetailView.this.mo188061g();
                StickerSetDetailView.this.mTvStatus.setText(R.string.Lark_Chat_StickerPackUse);
            }

            @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
            /* renamed from: a */
            public void mo187825a(String str) {
                StickerSetDetailView.this.mPbDownload.setMax(100);
                StickerSetDetailView.this.mPbDownload.setProgress(100);
                StickerSetDetailView.this.mo188061g();
                StickerSetDetailView.this.mTvStatus.setText(R.string.Lark_Chat_StickerPackUse);
            }

            @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
            /* renamed from: a */
            public void mo187826a(String str, int i, long j, long j2) {
                ViewUtils.m214260a(8, StickerSetDetailView.this.mTvStatus);
                ViewUtils.m214260a(0, StickerSetDetailView.this.mPbDownload);
                StickerSetDetailView.this.mPbDownload.setMax((int) j2);
                StickerSetDetailView.this.mPbDownload.setProgress((int) j);
            }
        };
        this.f136143f.mo188046a(new StickerSetDetailAdapter.AbstractC55123a() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.C551274 */

            @Override // com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailAdapter.AbstractC55123a
            /* renamed from: a */
            public void mo188052a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
                C55004f.m213654a().mo187830a(context, z, i, i2, str, imageView, i3, i4, StickerSetDetailView.this.f136141d.getStickerSetId());
            }
        });
        this.mTvStatus.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.View$OnClickListenerC551285 */

            public void onClick(View view) {
                if (StickerSetDetailView.this.f136141d != null) {
                    if (StickerSetDetailView.this.f136141d.isAdded()) {
                        C54996a.m213619a().mo144099c().mo144111b(StickerSetDetailView.this.f136138a, StickerSetDetailView.this.f136141d.getStickerSetId());
                        StickerHitPoint.f136296a.mo188236d();
                    } else if (!StickerSetDetailView.this.f136141d.isHasPaid()) {
                        LKUIToast.show(StickerSetDetailView.this.f136138a, (int) R.string.Lark_Chat_StickerPackBuyToast);
                    } else {
                        StickerSetDetailView.this.f136140c.mo188069b(StickerSetDetailView.this.f136141d);
                        StickerHitPoint.f136296a.mo188232a("2", StickerSetDetailView.this.f136141d.getStickerSetId(), StickerSetDetailView.this.f136141d.getStickers().size());
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: b */
    public void mo188056b() {
        ViewUtils.m214260a(0, this.mTvStatus);
        this.mTvStatus.setText(R.string.Lark_Chat_StickerPackAdd);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        if (this.f136144g != null && this.f136141d != null) {
            C54998c.m213641a().mo187824b(this.f136141d.getStickerSetId(), this.f136144g);
            this.f136144g = null;
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: f */
    public void mo188060f() {
        this.f136142e.mo89849f();
        ViewUtils.m214260a(8, this.mLoadingLayout);
    }

    /* renamed from: g */
    public void mo188061g() {
        ViewUtils.m214260a(0, this.mTvStatus);
        ViewUtils.m214260a(8, this.mPbDownload);
    }

    /* renamed from: i */
    private void m213946i() {
        if (DesktopUtil.m144307b()) {
            DesktopUtil.m144299a(this.mTvTitle);
            DesktopUtil.m144306b(this.mTvDesc);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mTvDesc.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            this.mTvDesc.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: k */
    private void m213948k() {
        int i;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.ic_icon_sticker_set_share_desktop;
        } else {
            i = R.drawable.ic_icon_sticker_set_share;
        }
        commonTitleBar.addAction(new AbstractC55084a(i) {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.C551241 */

            @Override // com.ss.android.lark.sticker.ui.p2716a.AbstractC55084a
            /* renamed from: a */
            public void mo187989a(View view) {
                if (StickerSetDetailView.this.f136141d != null) {
                    C54996a.m213619a().mo144099c().mo144109a(StickerSetDetailView.this.f136138a, StickerSetDetailView.this.f136141d.getStickerSetId());
                    StickerHitPoint.f136296a.mo188235c();
                }
            }
        });
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.StickerSetDetailView.View$OnClickListenerC551252 */

            public void onClick(View view) {
                StickerSetDetailView.this.f136139b.mo188064a();
            }
        });
        this.mTitleBar.setRightVisible(false);
    }

    /* renamed from: l */
    private void m213949l() {
        this.mRcvStickerSet.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f136138a, 4);
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.mRcvStickerSet.setLayoutManager(gridLayoutManager);
        this.mRcvStickerSet.setNestedScrollingEnabled(false);
        StickerSetDetailAdapter stickerSetDetailAdapter = new StickerSetDetailAdapter(this.f136138a);
        this.f136143f = stickerSetDetailAdapter;
        this.mRcvStickerSet.setAdapter(stickerSetDetailAdapter);
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: c */
    public void mo188057c() {
        ViewUtils.m214260a(0, this.mViewEmpty);
        ViewUtils.m214260a(8, this.mViewContent);
        this.mIvError.setImageResource(R.drawable.ic_sticker_pack_no_permission);
        this.mTvError.setText(C57582a.m223604a((Context) this.f136138a, (int) R.string.Lark_Chat_StickerPackNoPermission));
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: d */
    public void mo188058d() {
        ViewUtils.m214260a(0, this.mViewEmpty);
        ViewUtils.m214260a(8, this.mViewContent);
        this.mTitleBar.setRightVisible(false);
        this.mIvError.setImageResource(R.drawable.illustration_empty_negative_load_failed);
        this.mTvError.setText(C57582a.m223604a((Context) this.f136138a, (int) R.string.Lark_Chat_StickerPackNoStickerPack));
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: e */
    public void mo188059e() {
        ViewUtils.m214260a(0, this.mLoadingLayout);
        ViewUtils.m214260a(8, this.mViewContent, this.mViewEmpty);
        this.f136142e.mo89837a();
    }

    /* renamed from: a */
    public void setViewDelegate(C55130a.AbstractC55132b.AbstractC55133a aVar) {
        this.f136140c = aVar;
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b
    /* renamed from: a */
    public void mo188054a(StickerSet stickerSet) {
        if (stickerSet == null) {
            ViewUtils.m214260a(0, this.mViewEmpty);
            ViewUtils.m214260a(8, this.mViewContent);
            this.mTitleBar.setRightVisible(false);
            return;
        }
        this.f136141d = stickerSet;
        this.mTitleBar.setRightVisible(true);
        ViewUtils.m214260a(0, this.mViewContent, this.mTvStatus);
        ViewUtils.m214260a(8, this.mPbDownload, this.mViewEmpty);
        C54998c.m213641a().mo187821a(stickerSet.getStickerSetId(), this.f136144g);
        this.mTitleBar.setTitle(this.f136141d.getTitle());
        C55004f.m213654a().mo187830a(this.f136138a, true, UIUtils.getWidth(this.mIvBg), UIUtils.getHeight(this.mIvBg), this.f136141d.getPreviewKey(), this.mIvBg, R.drawable.sticker_ic_icon_sticker_item_default, R.drawable.sticker_ic_icon_sticker_item_default, this.f136141d.getStickerSetId());
        this.f136143f.mo188047a(this.f136141d.getStickers());
        this.mTvTitle.setText(this.f136141d.getTitle());
        this.mTvDesc.setText(this.f136141d.getDescription());
        if (stickerSet.isAdded()) {
            this.mTvStatus.setText(R.string.Lark_Chat_StickerPackUse);
        } else if (!stickerSet.isHasPaid()) {
            this.mTvStatus.setText(R.string.Lark_Chat_StickerPackBuy);
        } else {
            this.mTvStatus.setText(R.string.Lark_Chat_StickerPackAdd);
        }
    }

    public StickerSetDetailView(Activity activity, AbstractC55129a aVar) {
        this.f136138a = activity;
        this.f136139b = aVar;
    }
}
