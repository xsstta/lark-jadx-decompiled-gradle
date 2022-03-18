package com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.p2614a.C53493a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.p2614a.C53494b;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.search.impl.hitpoint.loading.SearchLoadingLog;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultFooter;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import com.tonicartos.superslim.LayoutManager;
import java.util.ArrayList;
import java.util.List;

public class ChatInsideSearchImageView implements AbstractC53514c.AbstractC53516b {

    /* renamed from: a */
    public AbstractC53514c.AbstractC53516b.AbstractC53517a f132166a;

    /* renamed from: b */
    public ChatInsideSearchImageAdapter f132167b;

    /* renamed from: c */
    private Context f132168c;

    /* renamed from: d */
    private AbstractC53501a f132169d;

    /* renamed from: e */
    private ChatInsideSearchImageAdapter.AbstractC53490b f132170e;

    /* renamed from: f */
    private boolean f132171f;
    RecyclerView mContentRV;
    View mContentWrapper;
    ViewGroup mEmptyHolder;
    ImageView mEmptyMarkIV;
    TextView mEmptyMarkTV;
    View mLoadingView;
    LKUIPtrClassicFrameLayout mPtrFrame;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView$a */
    public interface AbstractC53501a {
        /* renamed from: a */
        void mo182636a(ChatInsideSearchImageView chatInsideSearchImageView);

        /* renamed from: a */
        void mo182637a(String str, int i);

        /* renamed from: b */
        void mo182638b(String str, int i);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f132169d = null;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: g */
    public boolean mo182658g() {
        return this.f132171f;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: d */
    public ArrayList<String> mo182655d() {
        return this.f132167b.mo182615a();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: e */
    public void mo182656e() {
        this.f132167b.mo182621c();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: f */
    public List<ChatInsideSearchImageViewData> mo182657f() {
        return this.f132167b.mo182620b();
    }

    /* renamed from: h */
    private void m207183h() {
        m207184i();
        m207185j();
        m207186k();
    }

    /* renamed from: k */
    private void m207186k() {
        DesktopUtil.m144299a(this.mEmptyMarkTV);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: b */
    public void mo182651b() {
        this.mContentWrapper.setVisibility(8);
        this.mLoadingView.setVisibility(0);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f132169d.mo182636a(this);
        m207183h();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: c */
    public void mo182654c() {
        this.mLoadingView.setVisibility(8);
        this.mContentWrapper.setVisibility(0);
        if (this.mPtrFrame.isRefreshing()) {
            this.mPtrFrame.refreshComplete();
        }
    }

    /* renamed from: j */
    private void m207185j() {
        SearchLoadingLog.f131887a.mo182030b();
        LKUIPtrDefaultFooter lKUIPtrDefaultFooter = new LKUIPtrDefaultFooter(this.f132168c);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(lKUIPtrDefaultFooter);
        this.mPtrFrame.addPtrUIHandler(lKUIPtrDefaultFooter);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView.C535003 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                SearchLoadingLog.f131887a.mo182031c();
                ChatInsideSearchImageView.this.f132166a.mo182681a();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                boolean checkCanDoLoadMore = super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2);
                if (!ChatInsideSearchImageView.this.f132166a.mo182684b() || !checkCanDoLoadMore) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public void mo182646a() {
        this.mContentRV.setVisibility(8);
        this.mEmptyMarkTV.setText(UIHelper.getString(R.string.Lark_Legacy_PullEmptyResult));
        this.mEmptyMarkIV.setImageResource(R.drawable.illustration_placeholder_common_no_picture);
        this.mEmptyMarkIV.setVisibility(0);
        this.mEmptyMarkTV.setVisibility(0);
        this.mEmptyHolder.setVisibility(0);
        C57582a.m223615c(this.mEmptyHolder);
    }

    /* renamed from: i */
    private void m207184i() {
        if (this.f132171f) {
            this.mContentRV.setPadding(0, 0, UIHelper.dp2px(-4.0f), 0);
        }
        this.mContentRV.setLayoutManager(new LayoutManager(this.f132168c));
        ((SimpleItemAnimator) this.mContentRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mContentRV.addItemDecoration(new C53493a(UIHelper.dp2px(4.0f)));
        this.mContentRV.addItemDecoration(new C53494b(UIHelper.dp2px(4.0f)));
        ChatInsideSearchImageAdapter chatInsideSearchImageAdapter = new ChatInsideSearchImageAdapter(this.f132168c, this.f132171f);
        this.f132167b = chatInsideSearchImageAdapter;
        chatInsideSearchImageAdapter.setHasStableIds(true);
        this.f132167b.mo182617a(this.f132170e);
        this.mContentRV.setAdapter(this.f132167b);
        this.f132167b.mo182616a(new ChatInsideSearchImageAdapter.AbstractC53489a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView.C534981 */

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter.AbstractC53489a
            /* renamed from: a */
            public void mo182627a(View view, ImageSet imageSet) {
                ChatInsideSearchImageView.this.f132166a.mo182682a(view, imageSet);
            }

            @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.ChatInsideSearchImageAdapter.AbstractC53489a
            /* renamed from: a */
            public void mo182628a(View view, ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
                if (chatInsideSearchImageViewData == null) {
                    Log.m165383e("LarkSearch.Search.ChatInsideSearchImage", "jump to chat fail : data is empty");
                } else {
                    ChatInsideSearchImageView.this.f132166a.mo182683a(chatInsideSearchImageViewData.getChatId(), chatInsideSearchImageViewData.getMessageId(), chatInsideSearchImageViewData.isThread());
                }
            }
        });
        C59252a.m230151a(this.f132168c, this.mPtrFrame, this.mContentRV, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.ChatInsideSearchImageView.C534992 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return ChatInsideSearchImageView.this.f132167b.getItemCount() - 15;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (ChatInsideSearchImageView.this.f132166a == null || !ChatInsideSearchImageView.this.f132166a.mo182684b()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC53514c.AbstractC53516b.AbstractC53517a aVar) {
        this.f132166a = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207182a(View view) {
        this.f132166a.mo182685c();
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: b */
    public void mo182653b(boolean z) {
        this.f132167b.mo182619a(z);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: a */
    public void mo182650a(boolean z) {
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
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.$$Lambda$ChatInsideSearchImageView$rCf5MRm5O0h5rb6vtKUbQPfeA */

            public final void onClick(View view) {
                ChatInsideSearchImageView.m270950lambda$rCf5MRm5O0h5rb6vtKUbQPfeA(ChatInsideSearchImageView.this, view);
            }
        });
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: b */
    public void mo182652b(String str, int i) {
        this.f132169d.mo182637a(str, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: a */
    public void mo182648a(String str, int i) {
        this.f132169d.mo182638b(str, i);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.AbstractC53514c.AbstractC53516b
    /* renamed from: a */
    public void mo182649a(List<ChatInsideSearchImageViewData> list, boolean z) {
        if (!CollectionUtils.isEmpty(list)) {
            if (z) {
                this.f132167b.addAll(list);
            } else {
                this.f132167b.resetAll(list);
            }
            this.mContentRV.setVisibility(0);
            this.mEmptyMarkIV.setVisibility(8);
            this.mEmptyMarkTV.setVisibility(8);
            this.mEmptyHolder.setVisibility(8);
        } else if (!z) {
            this.f132167b.clear();
            mo182646a();
        }
    }

    public ChatInsideSearchImageView(Context context, AbstractC53501a aVar, ChatInsideSearchImageAdapter.AbstractC53490b bVar, boolean z) {
        this.f132168c = context;
        this.f132169d = aVar;
        this.f132170e = bVar;
        this.f132171f = z;
    }
}
