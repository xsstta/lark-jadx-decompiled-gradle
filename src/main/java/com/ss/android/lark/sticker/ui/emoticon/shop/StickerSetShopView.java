package com.ss.android.lark.sticker.ui.emoticon.shop;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sticker.p2714a.AbstractC55002d;
import com.ss.android.lark.sticker.p2714a.C54998c;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55136c;
import com.ss.android.lark.sticker.ui.emoticon.manager.C55165d;
import com.ss.android.lark.sticker.ui.emoticon.shop.C55207a;
import com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetProgressInfo;
import com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter;
import com.ss.android.lark.sticker.ui.p2716a.AbstractC55084a;
import com.ss.android.lark.sticker.ui.statistics.StickerHitPoint;
import com.ss.android.lark.sticker.utils.ViewUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class StickerSetShopView implements C55207a.AbstractC55209b {

    /* renamed from: a */
    public Activity f136255a;

    /* renamed from: b */
    public AbstractC55206a f136256b;

    /* renamed from: c */
    public C55207a.AbstractC55209b.AbstractC55210a f136257c;

    /* renamed from: d */
    public StickerSetShopAdapter f136258d;

    /* renamed from: e */
    public boolean f136259e;

    /* renamed from: f */
    private CopyOnWriteArrayList<StickerSetProgressInfo> f136260f;

    /* renamed from: g */
    private Map<String, AbstractC55002d> f136261g = new HashMap();
    @BindView(7501)
    LinearLayout mLayoutEmpty;
    @BindView(7504)
    RecyclerView mRvStickerSet;
    @BindView(7547)
    CommonTitleBar mTitleBar;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView$a */
    public interface AbstractC55206a {
        /* renamed from: a */
        void mo188207a();

        /* renamed from: a */
        void mo188208a(StickerSetShopView stickerSetShopView);
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b
    /* renamed from: b */
    public void mo188204b() {
    }

    /* renamed from: c */
    private void m214159c() {
        m214161d();
        m214162e();
        m214163f();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f136256b.mo188208a(this);
        m214159c();
    }

    /* renamed from: f */
    private void m214163f() {
        this.f136258d.mo188188a(new StickerSetShopAdapter.AbstractC55200b() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.C552044 */

            @Override // com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter.AbstractC55200b
            /* renamed from: b */
            public void mo188197b(StickerSetProgressInfo stickerSetProgressInfo) {
                if (stickerSetProgressInfo != null) {
                    C55136c.m213981a(StickerSetShopView.this.f136255a, stickerSetProgressInfo.getStickerSet());
                }
            }

            @Override // com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopAdapter.AbstractC55200b
            /* renamed from: a */
            public void mo188196a(StickerSetProgressInfo stickerSetProgressInfo) {
                if (stickerSetProgressInfo != null) {
                    if (!stickerSetProgressInfo.isHadPaid()) {
                        LKUIToast.show(StickerSetShopView.this.f136255a, (int) R.string.Lark_Chat_StickerPackBuyToast);
                        return;
                    }
                    StickerSetShopView.this.f136257c.mo188214a(stickerSetProgressInfo.getStickerSet());
                    StickerHitPoint.f136296a.mo188232a("1", stickerSetProgressInfo.getStickerSetId(), stickerSetProgressInfo.getStickerSet().getStickers().size());
                }
            }
        });
        this.mRvStickerSet.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.C552055 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                if (i2 >= StickerSetShopView.this.f136258d.getItemCount() - 12) {
                    StickerSetShopView.this.f136257c.mo188213a();
                }
            }
        });
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b
    /* renamed from: a */
    public void mo188198a() {
        ViewUtils.m214260a(0, this.mLayoutEmpty);
        ViewUtils.m214260a(8, this.mRvStickerSet);
    }

    /* renamed from: d */
    private void m214161d() {
        int i;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.ic_sticker_set_shop_setting_desktop;
        } else {
            i = R.drawable.ic_sticker_set_shop_setting;
        }
        this.mTitleBar.addAction(new AbstractC55084a(i) {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.C552022 */

            @Override // com.ss.android.lark.sticker.ui.p2716a.AbstractC55084a
            /* renamed from: a */
            public void mo187989a(View view) {
                C55165d.m214063a(StickerSetShopView.this.f136255a);
                StickerHitPoint.f136296a.mo188230a("2");
            }
        });
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.View$OnClickListenerC552033 */

            public void onClick(View view) {
                StickerSetShopView.this.f136256b.mo188207a();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Map<String, AbstractC55002d> map = this.f136261g;
        if (map != null) {
            for (Map.Entry<String, AbstractC55002d> entry : map.entrySet()) {
                String key = entry.getKey();
                C54998c.m213641a().mo187824b(key, this.f136261g.get(key));
            }
            this.f136261g.clear();
        }
    }

    /* renamed from: e */
    private void m214162e() {
        this.mLayoutEmpty.setVisibility(8);
        this.mRvStickerSet.setVisibility(0);
        ((SimpleItemAnimator) this.mRvStickerSet.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mRvStickerSet.setLayoutManager(new LinearLayoutManager(this.f136255a));
        StickerSetShopAdapter stickerSetShopAdapter = new StickerSetShopAdapter(this.f136255a);
        this.f136258d = stickerSetShopAdapter;
        this.mRvStickerSet.setAdapter(stickerSetShopAdapter);
        DesktopUtil.m144299a((TextView) this.mLayoutEmpty.findViewById(R.id.sticker_ll_sticker_set_empty_tv));
    }

    /* renamed from: a */
    public void setViewDelegate(C55207a.AbstractC55209b.AbstractC55210a aVar) {
        this.f136257c = aVar;
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b
    /* renamed from: a */
    public void mo188199a(StickerSet stickerSet) {
        this.f136259e = true;
        this.f136257c.mo188215b(stickerSet);
    }

    /* renamed from: c */
    private void m214160c(String str) {
        if (this.f136261g != null) {
            C54998c.m213641a().mo187824b(str, this.f136261g.get(str));
            this.f136261g.remove(str);
        }
    }

    /* renamed from: a */
    public synchronized void mo188201a(String str) {
        if (!CollectionUtils.isEmpty(this.f136260f)) {
            int size = this.f136260f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                StickerSetProgressInfo stickerSetProgressInfo = this.f136260f.get(i);
                if (stickerSetProgressInfo != null && TextUtils.equals(str, stickerSetProgressInfo.getStickerSetId())) {
                    stickerSetProgressInfo.setDownload(StickerSetProgressInfo.Download.DONE);
                    stickerSetProgressInfo.setPerm(StickerSet.Perm.OWN);
                    this.f136258d.mo188186a(i, stickerSetProgressInfo);
                    m214160c(str);
                    break;
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo188205b(String str) {
        if (!CollectionUtils.isEmpty(this.f136260f)) {
            int size = this.f136260f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                StickerSetProgressInfo stickerSetProgressInfo = this.f136260f.get(i);
                if (stickerSetProgressInfo != null && TextUtils.equals(str, stickerSetProgressInfo.getStickerSetId())) {
                    stickerSetProgressInfo.setDownload(StickerSetProgressInfo.Download.LOADING);
                    stickerSetProgressInfo.setDownLoadProgress(100);
                    stickerSetProgressInfo.setTotalSize(100);
                    this.f136258d.mo188186a(i, stickerSetProgressInfo);
                    m214160c(str);
                    stickerSetProgressInfo.setDownload(StickerSetProgressInfo.Download.DONE);
                    stickerSetProgressInfo.setPerm(StickerSet.Perm.OWN);
                    this.f136258d.mo188186a(i, stickerSetProgressInfo);
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b
    /* renamed from: a */
    public void mo188203a(List<StickerSetProgressInfo> list) {
        if (!this.f136259e && list != null) {
            this.f136260f = new CopyOnWriteArrayList<>(list);
            ViewUtils.m214260a(8, this.mLayoutEmpty);
            ViewUtils.m214260a(0, this.mRvStickerSet);
            this.f136258d.mo188189a(list);
            Iterator<StickerSetProgressInfo> it = this.f136260f.iterator();
            while (it.hasNext()) {
                StickerSetProgressInfo next = it.next();
                String stickerSetId = next.getStickerSetId();
                if (!TextUtils.isEmpty(stickerSetId) && !this.f136261g.containsKey(stickerSetId) && next.needRegisterPush()) {
                    C552011 r2 = new AbstractC55002d() {
                        /* class com.ss.android.lark.sticker.ui.emoticon.shop.StickerSetShopView.C552011 */

                        @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
                        /* renamed from: a */
                        public void mo187825a(String str) {
                            StickerSetShopView.this.f136259e = false;
                            StickerSetShopView.this.mo188205b(str);
                        }

                        @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
                        /* renamed from: b */
                        public void mo187827b(String str) {
                            StickerSetShopView.this.f136259e = false;
                            StickerSetShopView.this.mo188201a(str);
                        }

                        @Override // com.ss.android.lark.sticker.p2714a.AbstractC55002d
                        /* renamed from: a */
                        public void mo187826a(String str, int i, long j, long j2) {
                            StickerSetShopView.this.mo188202a(str, j, j2);
                        }
                    };
                    C54998c.m213641a().mo187821a(stickerSetId, r2);
                    this.f136261g.put(next.getStickerSetId(), r2);
                }
            }
        }
    }

    public StickerSetShopView(Activity activity, AbstractC55206a aVar) {
        this.f136255a = activity;
        this.f136256b = aVar;
    }

    /* renamed from: a */
    public synchronized void mo188202a(String str, long j, long j2) {
        if (!CollectionUtils.isEmpty(this.f136260f)) {
            int size = this.f136260f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                StickerSetProgressInfo stickerSetProgressInfo = this.f136260f.get(i);
                if (stickerSetProgressInfo != null && TextUtils.equals(str, stickerSetProgressInfo.getStickerSetId())) {
                    stickerSetProgressInfo.setDownload(StickerSetProgressInfo.Download.LOADING);
                    stickerSetProgressInfo.setDownLoadProgress(j);
                    stickerSetProgressInfo.setTotalSize(j2);
                    this.f136258d.mo188186a(i, stickerSetProgressInfo);
                    break;
                }
                i++;
            }
        }
    }
}
