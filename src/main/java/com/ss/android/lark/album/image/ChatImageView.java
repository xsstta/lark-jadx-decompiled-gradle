package com.ss.android.lark.album.image;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.album.image.AbstractC28689e;
import com.ss.android.lark.album.image.ChatImageAdapter;
import com.ss.android.lark.album.image.decoration.C28686a;
import com.ss.android.lark.album.image.decoration.C28687b;
import com.ss.android.lark.album.image.decoration.StickyHeadContainer;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import java.util.ArrayList;
import java.util.List;

public class ChatImageView implements AbstractC28689e.AbstractC28691b {

    /* renamed from: a */
    public AbstractC28689e.AbstractC28691b.AbstractC28692a f72128a;

    /* renamed from: b */
    public ChatImageAdapter f72129b;

    /* renamed from: c */
    private Context f72130c;

    /* renamed from: d */
    private AbstractC28671a f72131d;

    /* renamed from: e */
    private ChatImageAdapter.AbstractC28662b f72132e;
    RecyclerView mContentRV;
    View mContentWrapper;
    ViewGroup mEmptyHolder;
    ImageView mEmptyMarkIV;
    TextView mEmptyMarkTV;
    View mLoadingView;
    LKUIPtrClassicFrameLayout mPtrFrame;
    StickyHeadContainer stickyHeadContainer;
    TextView tvStickyContent;

    /* renamed from: com.ss.android.lark.album.image.ChatImageView$a */
    public interface AbstractC28671a {
        /* renamed from: a */
        void mo101987a(ChatImageView chatImageView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f72131d = null;
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: d */
    public ArrayList<String> mo101981d() {
        return this.f72129b.mo101957a();
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: e */
    public void mo101982e() {
        this.f72129b.mo101963c();
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: f */
    public List<ChatImageViewData> mo101983f() {
        return this.f72129b.mo101962b();
    }

    /* renamed from: g */
    private void m105100g() {
        m105101h();
        m105102i();
        m105103j();
    }

    /* renamed from: j */
    private void m105103j() {
        DesktopUtil.m144299a(this.mEmptyMarkTV);
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: b */
    public void mo101978b() {
        this.mContentWrapper.setVisibility(8);
        this.mLoadingView.setVisibility(0);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f72131d.mo101987a(this);
        m105100g();
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: c */
    public void mo101980c() {
        this.mLoadingView.setVisibility(8);
        this.mContentWrapper.setVisibility(0);
        if (this.mPtrFrame.isRefreshing()) {
            this.mPtrFrame.refreshComplete();
        }
    }

    /* renamed from: i */
    private void m105102i() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f72130c);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.album.image.ChatImageView.C286705 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                ChatImageView.this.f72128a.mo102036a();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                boolean checkCanDoLoadMore = super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2);
                if (!ChatImageView.this.f72128a.mo102038b() || !checkCanDoLoadMore) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public void mo101974a() {
        this.mContentRV.setVisibility(8);
        this.mEmptyMarkTV.setText(UIHelper.getString(R.string.Lark_Legacy_PullEmptyResult));
        this.mEmptyMarkIV.setImageResource(R.drawable.illustration_placeholder_common_no_picture);
        this.mEmptyMarkIV.setVisibility(0);
        this.mEmptyMarkTV.setVisibility(0);
        this.mEmptyHolder.setVisibility(0);
        C57582a.m223615c(this.mEmptyHolder);
    }

    /* renamed from: h */
    private void m105101h() {
        this.mContentRV.setPadding(0, 0, UIHelper.dp2px(-4.0f), 0);
        this.mContentRV.setLayoutManager(new GridLayoutManager(this.f72130c, 4, 1, false));
        ((SimpleItemAnimator) this.mContentRV.getItemAnimator()).setSupportsChangeAnimations(false);
        ChatImageAdapter chatImageAdapter = new ChatImageAdapter(this.f72130c);
        this.f72129b = chatImageAdapter;
        chatImageAdapter.setHasStableIds(true);
        this.f72129b.mo101959a(this.f72132e);
        this.mContentRV.setAdapter(this.f72129b);
        this.f72129b.mo101958a(new ChatImageAdapter.AbstractC28661a() {
            /* class com.ss.android.lark.album.image.ChatImageView.C286661 */

            @Override // com.ss.android.lark.album.image.ChatImageAdapter.AbstractC28661a
            /* renamed from: a */
            public void mo101968a(View view, ImageSet imageSet) {
                ChatImageView.this.f72128a.mo102037a(view, imageSet);
            }
        });
        C59252a.m230151a(this.f72130c, this.mPtrFrame, this.mContentRV, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.album.image.ChatImageView.C286672 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return ChatImageView.this.f72129b.getItemCount() - 15;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (ChatImageView.this.f72128a == null || !ChatImageView.this.f72128a.mo102038b()) {
                    return false;
                }
                return true;
            }
        });
        C28687b bVar = new C28687b(this.stickyHeadContainer, 0);
        bVar.mo102055a(new AbstractC28693f() {
            /* class com.ss.android.lark.album.image.ChatImageView.C286683 */

            @Override // com.ss.android.lark.album.image.AbstractC28693f
            /* renamed from: a */
            public void mo101984a() {
                Log.m165379d("ChatImageView", "onInVisible");
                ChatImageView.this.stickyHeadContainer.mo102042a();
                ChatImageView.this.stickyHeadContainer.setVisibility(4);
            }

            @Override // com.ss.android.lark.album.image.AbstractC28693f
            /* renamed from: a */
            public void mo101985a(int i) {
                Log.m165379d("ChatImageView", "onScrollable : " + i);
                ChatImageView.this.stickyHeadContainer.mo102043a(i);
                ChatImageView.this.stickyHeadContainer.setVisibility(0);
            }
        });
        this.stickyHeadContainer.setDataCallback(new StickyHeadContainer.AbstractC28685a() {
            /* class com.ss.android.lark.album.image.ChatImageView.C286694 */

            @Override // com.ss.android.lark.album.image.decoration.StickyHeadContainer.AbstractC28685a
            /* renamed from: a */
            public void mo101986a(int i) {
                List items = ChatImageView.this.f72129b.getItems();
                if (items.size() > i) {
                    Log.m165379d("ChatImageView", "tvStickyContent :" + ((ChatImageViewData) items.get(i)).getLabelText());
                    ChatImageView.this.tvStickyContent.setText(((ChatImageViewData) items.get(i)).getLabelText());
                }
            }
        });
        this.mContentRV.addItemDecoration(bVar);
        this.mContentRV.addItemDecoration(new C28686a(UIHelper.dp2px(4.0f)));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC28689e.AbstractC28691b.AbstractC28692a aVar) {
        this.f72128a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m105099a(View view) {
        this.f72128a.mo102039c();
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: b */
    public void mo101979b(boolean z) {
        this.f72129b.mo101961a(z);
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: a */
    public void mo101977a(boolean z) {
        String string = UIHelper.getString(R.string.Lark_Legacy_SearchFailedTip);
        String string2 = UIHelper.getString(R.string.Lark_Legacy_ImageDownloadFailedRetry);
        if (z) {
            this.mContentRV.setVisibility(0);
            return;
        }
        this.mContentRV.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + string2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.lkui_B500)), string.length(), string.length() + string2.length(), 17);
        this.mEmptyMarkTV.setText(spannableStringBuilder);
        this.mEmptyMarkIV.setImageResource(R.drawable.illustration_placeholder_common_load_failed);
        this.mEmptyMarkTV.setVisibility(0);
        this.mEmptyMarkIV.setVisibility(0);
        this.mEmptyHolder.setVisibility(0);
        C57582a.m223615c(this.mEmptyHolder);
        this.mEmptyMarkTV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.album.image.$$Lambda$ChatImageView$wZJSAocnBIGzVOTKNo7vKtjPaks */

            public final void onClick(View view) {
                ChatImageView.lambda$wZJSAocnBIGzVOTKNo7vKtjPaks(ChatImageView.this, view);
            }
        });
    }

    @Override // com.ss.android.lark.album.image.AbstractC28689e.AbstractC28691b
    /* renamed from: a */
    public void mo101976a(List<ChatImageViewData> list, boolean z) {
        if (!CollectionUtils.isEmpty(list)) {
            if (z) {
                this.f72129b.addAll(list);
            } else {
                this.f72129b.resetAll(list);
            }
            this.mContentRV.setVisibility(0);
            this.mEmptyMarkIV.setVisibility(8);
            this.mEmptyMarkTV.setVisibility(8);
            this.mEmptyHolder.setVisibility(8);
        } else if (!z) {
            this.f72129b.clear();
            mo101974a();
        }
    }

    public ChatImageView(Context context, AbstractC28671a aVar, ChatImageAdapter.AbstractC28662b bVar) {
        this.f72130c = context;
        this.f72131d = aVar;
        this.f72132e = bVar;
    }
}
