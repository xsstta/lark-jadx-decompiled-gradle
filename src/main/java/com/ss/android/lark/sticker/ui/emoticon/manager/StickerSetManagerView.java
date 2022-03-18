package com.ss.android.lark.sticker.ui.emoticon.manager;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55136c;
import com.ss.android.lark.sticker.ui.emoticon.manager.C55157a;
import com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter;
import com.ss.android.lark.sticker.ui.p2716a.AbstractC55085b;
import com.ss.android.lark.sticker.ui.statistics.StickerHitPoint;
import com.ss.android.lark.sticker.utils.C55243a;
import com.ss.android.lark.sticker.utils.ViewUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import java.util.List;

public class StickerSetManagerView implements StickerSetManagerAdapter.AbstractC55150c, C55157a.AbstractC55159b {

    /* renamed from: a */
    public Activity f136183a;

    /* renamed from: b */
    public AbstractC55156a f136184b;

    /* renamed from: c */
    public C55157a.AbstractC55159b.AbstractC55160a f136185c;

    /* renamed from: d */
    public StickerSetManagerAdapter f136186d;

    /* renamed from: e */
    public boolean f136187e;

    /* renamed from: f */
    private ItemTouchHelper f136188f;
    @BindView(7531)
    RelativeLayout mLayoutCustomAddedSticker;
    @BindView(7526)
    View mRecvBottomLine;
    @BindView(7527)
    View mRecvTopLine;
    @BindView(7532)
    View mRootView;
    @BindView(7529)
    RecyclerView mRvStickerSet;
    @BindView(7543)
    CommonTitleBar mTitleBar;
    @BindView(7535)
    TextView mTvStickerSetTitle;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView$a */
    public interface AbstractC55156a {
        /* renamed from: a */
        void mo188110a();

        /* renamed from: a */
        void mo188111a(StickerSetManagerView stickerSetManagerView);

        /* renamed from: b */
        void mo188112b();
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b
    /* renamed from: a */
    public void mo188100a() {
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b
    /* renamed from: c */
    public void mo188105c() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b
    /* renamed from: b */
    public void mo188104b() {
        this.f136185c.mo188116a();
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b
    /* renamed from: d */
    public void mo188106d() {
        this.f136185c.mo188116a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f136184b.mo188111a(this);
        m214018e();
    }

    /* renamed from: g */
    private void m214020g() {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C55161b(this.f136186d));
        this.f136188f = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.mRvStickerSet);
    }

    /* renamed from: h */
    private void m214021h() {
        this.mLayoutCustomAddedSticker.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.View$OnClickListenerC551533 */

            public void onClick(View view) {
                StickerSetManagerView.this.f136184b.mo188112b();
            }
        });
        this.f136186d.mo188086a(new StickerSetManagerAdapter.AbstractC55149b() {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.C551544 */

            @Override // com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.AbstractC55149b
            /* renamed from: a */
            public void mo188097a(StickerSet stickerSet) {
                if (stickerSet != null) {
                    C55136c.m213981a(StickerSetManagerView.this.f136183a, stickerSet);
                }
            }

            @Override // com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.AbstractC55149b
            /* renamed from: b */
            public void mo188098b(StickerSet stickerSet) {
                if (stickerSet != null) {
                    StickerSetManagerView.this.mo188101a(stickerSet);
                }
            }
        });
    }

    /* renamed from: f */
    private void m214019f() {
        this.mTitleBar.addAction(new AbstractC55085b(this.f136183a.getString(R.string.Lark_Chat_StickerPackReorder), R.color.text_title, 16) {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.C551511 */

            @Override // com.ss.android.lark.sticker.ui.p2716a.AbstractC55085b
            /* renamed from: a */
            public void mo187990a(View view) {
                if (!StickerSetManagerView.this.f136187e) {
                    StickerSetManagerView.this.mTitleBar.setRightText(0, StickerSetManagerView.this.f136183a.getString(R.string.Lark_Chat_StickerPackSave), UIUtils.getColor(StickerSetManagerView.this.f136183a, R.color.function_info_500));
                    StickerHitPoint.f136296a.mo188237e();
                } else {
                    StickerSetManagerView.this.f136185c.mo188118a(StickerSetManagerView.this.f136186d.mo188084a());
                    StickerHitPoint.f136296a.mo188238f();
                }
                StickerSetManagerView stickerSetManagerView = StickerSetManagerView.this;
                stickerSetManagerView.f136187e = !stickerSetManagerView.f136187e;
                StickerSetManagerView.this.f136186d.mo188088a(StickerSetManagerView.this.f136187e);
            }
        });
        if (DesktopUtil.m144301a((Context) this.f136183a)) {
            this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_BACK);
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.View$OnClickListenerC551522 */

                public void onClick(View view) {
                    StickerSetManagerView.this.f136184b.mo188110a();
                }
            });
            return;
        }
        this.mTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
    }

    /* renamed from: i */
    private void m214022i() {
        new C25639g(this.f136183a).mo89254m(R.string.Lark_Chat_StickerPackNetworkError).mo89256o(R.color.text_title).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Chat_StickerPackKnow, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: e */
    private void m214018e() {
        m214019f();
        ViewUtils.m214260a(8, this.mTvStickerSetTitle, this.mRvStickerSet, this.mRecvTopLine, this.mRecvBottomLine);
        this.mTitleBar.setRightVisible(false);
        ((SimpleItemAnimator) this.mRvStickerSet.getItemAnimator()).setSupportsChangeAnimations(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f136183a);
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        this.mRvStickerSet.setLayoutManager(linearLayoutManager);
        this.mRvStickerSet.setNestedScrollingEnabled(false);
        StickerSetManagerAdapter stickerSetManagerAdapter = new StickerSetManagerAdapter(this);
        this.f136186d = stickerSetManagerAdapter;
        this.mRvStickerSet.setAdapter(stickerSetManagerAdapter);
        m214020g();
        m214021h();
    }

    /* renamed from: a */
    public void setViewDelegate(C55157a.AbstractC55159b.AbstractC55160a aVar) {
        this.f136185c = aVar;
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerAdapter.AbstractC55150c
    /* renamed from: a */
    public void mo188099a(RecyclerView.ViewHolder viewHolder) {
        if (!C55243a.m214261a(this.f136183a)) {
            m214022i();
        } else {
            this.f136188f.startDrag(viewHolder);
        }
    }

    /* renamed from: a */
    public void mo188101a(final StickerSet stickerSet) {
        new C25639g(this.f136183a).mo89254m(R.string.Lark_Chat_StickerPackDeleteConfirmContent).mo89256o(R.color.text_title).mo89246d(false).mo89247e(false).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Chat_StickerPackCancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_DeleteConfirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.StickerSetManagerView.DialogInterface$OnClickListenerC551555 */

            public void onClick(DialogInterface dialogInterface, int i) {
                StickerSetManagerView.this.f136185c.mo188117a(stickerSet);
                StickerHitPoint.f136296a.mo188231a(stickerSet.getStickerSetId(), StickerSetManagerView.this.f136186d.getItemCount(), stickerSet.getStickers().size());
            }
        }).mo89239c();
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b
    /* renamed from: a */
    public void mo188103a(List<StickerSet> list) {
        if (CollectionUtils.isEmpty(list)) {
            ViewUtils.m214260a(8, this.mTvStickerSetTitle, this.mRvStickerSet, this.mRecvTopLine, this.mRecvBottomLine);
            this.mTitleBar.setRightVisible(false);
            return;
        }
        this.mTitleBar.setRightVisible(true);
        this.mTitleBar.setRightText(0, this.f136183a.getString(R.string.Lark_Chat_StickerPackReorder), UIUtils.getColor(this.f136183a, R.color.text_title));
        this.f136186d.mo188090b(list);
        ViewUtils.m214260a(0, this.mTvStickerSetTitle, this.mRvStickerSet, this.mRecvTopLine, this.mRecvBottomLine);
    }

    public StickerSetManagerView(Activity activity, AbstractC55156a aVar) {
        this.f136183a = activity;
        this.f136184b = aVar;
    }
}
