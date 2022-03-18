package com.ss.android.lark.threadwindow.view.message;

import android.app.Dialog;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a;
import com.ss.android.lark.chat.core.view.PostChatView;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.MsgBubbleUtil;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.post.PostChatView2;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IAbbreviationClickListener;
import com.ss.android.lark.widget.light.listener.IAtSpanClickListener;
import com.ss.android.lark.widget.light.listener.IImageSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMediaSpanClickListener;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener;
import com.ss.android.lark.widget.light.listener.IUrlSpanClickListener;
import com.ss.android.lark.widget.light.listener.ImageClickInfo;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.select.C59119d;
import com.ss.android.lark.widget.select.SelectedTextInfo;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import com.ss.android.lark.widget.span.MediaInfo;

public class ThreadWindowPostCell2 extends AbstractC33290a<ContentVO<?>, PostMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC56194a f139029a;

    /* renamed from: b */
    public final IBrowserDependency f139030b = C29990c.m110930b().mo134593u();

    /* renamed from: c */
    public final AbstractC36474h.AbstractC36489o f139031c = C29990c.m110930b().mo134525X();

    /* renamed from: e */
    private C33240h.AbstractC33243b f139032e;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2$a */
    public interface AbstractC56194a {

        /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC56194a aVar, View view, AbsMessageVO aVar2) {
            }
        }

        /* renamed from: a */
        void mo190444a(View view, AbsMessageVO aVar);

        /* renamed from: a */
        void mo190445a(View view, AbsMessageVO aVar, Image image, boolean z);

        /* renamed from: a */
        void mo190446a(View view, AbsMessageVO aVar, RichTextElement.MediaProperty mediaProperty);

        /* renamed from: a */
        void mo190448a(View view, String str, String str2);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.thread_window_light_item_post2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<PostMessageViewHolder> mo122650b() {
        return PostMessageViewHolder.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final PostMessageViewHolder postMessageViewHolder, final AbsMessageVO<ContentVO<?>> aVar) {
        super.mo122648a((AbstractC59010e) postMessageViewHolder, (AbsMessageVO) aVar);
        boolean z = !C34350p.m133216a(aVar);
        boolean z2 = !z || ((aVar.mo121699g() instanceof BaseTextContentVO) && ((BaseTextContentVO) aVar.mo121699g()).mo121929x() == 3);
        m219081a(this.f85789d.mo122543g(), postMessageViewHolder, z2, z, m219090b(aVar));
        if (z2) {
            if (!m219090b(aVar)) {
                m219086a(postMessageViewHolder, aVar, postMessageViewHolder.mPostView, false);
            } else {
                m219086a(postMessageViewHolder, aVar, postMessageViewHolder.f139063c, false);
                m219082a(postMessageViewHolder.f139064d);
                m219088b(postMessageViewHolder, aVar);
            }
        }
        if (z) {
            TranslatableContentVO y = aVar.mo121699g() instanceof TranslatableContentVO ? ((TranslatableContentVO) aVar.mo121699g()).mo121930y() : null;
            if (y != null) {
                m219084a(postMessageViewHolder.mTranslatePostView, (ContentVO) y, (AbsMessageVO) aVar, postMessageViewHolder, true);
                m219085a(postMessageViewHolder.mTranslatePostView, (ContentVO) y, (AbsMessageVO) aVar, true);
                postMessageViewHolder.mTranslatePostView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.View$OnClickListenerC561841 */

                    public void onClick(View view) {
                        ThreadWindowPostCell2.this.mo122683c(postMessageViewHolder, aVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190689a(PostChatView2 postChatView2, AbsMessageVO aVar) {
        ContentVO g = aVar.mo121699g();
        if (g instanceof BaseTextContentVO) {
            BaseTextContentVO baseTextContentVO = (BaseTextContentVO) g;
            postChatView2.setEnableEllipsize(baseTextContentVO.mo121786e());
            postChatView2.setMaxHeightFactor(baseTextContentVO.mo121787f());
        }
    }

    /* renamed from: a */
    public void mo191541a(PostChatView2 postChatView2, PostMessageViewHolder postMessageViewHolder, AbsMessageVO<ContentVO<?>> aVar, boolean z) {
        if (aVar.mo121699g() instanceof BaseTextContentVO) {
            BaseTextContentVO baseTextContentVO = (BaseTextContentVO) aVar.mo121699g();
            C59119d a = new C59119d.C59121a(postChatView2.getContentView()).mo200875a(C57582a.m223616d(mo122719d(), R.color.primary_pri_500)).mo200874a((float) UIHelper.dp2px(15.0f)).mo200876a();
            a.mo200866a(new C59119d.AbstractC59123c(baseTextContentVO, z, a, postMessageViewHolder, aVar) {
                /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$ThreadWindowPostCell2$i55D7PT4ROWSukc9nV8u1aYUREM */
                public final /* synthetic */ BaseTextContentVO f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ C59119d f$3;
                public final /* synthetic */ ThreadWindowPostCell2.PostMessageViewHolder f$4;
                public final /* synthetic */ AbsMessageVO f$5;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                @Override // com.ss.android.lark.widget.select.C59119d.AbstractC59123c
                public final void onTextSelected(SelectedTextInfo aVar) {
                    ThreadWindowPostCell2.this.m219083a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, aVar);
                }
            });
            a.mo200864a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return PostContentVO.class;
    }

    /* renamed from: f */
    public boolean mo191542f() {
        return !DesktopUtil.m144301a((Context) this.f85789d.mo122543g());
    }

    public class PostMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private PostMessageViewHolder f139065a;

        @Override // butterknife.Unbinder
        public void unbind() {
            PostMessageViewHolder postMessageViewHolder = this.f139065a;
            if (postMessageViewHolder != null) {
                this.f139065a = null;
                postMessageViewHolder.mPostContainer = null;
                postMessageViewHolder.mPostView = null;
                postMessageViewHolder.mAnnouncementContentViewStub = null;
                postMessageViewHolder.mTranslatePostView = null;
                postMessageViewHolder.mPostDivider = null;
                postMessageViewHolder.mDividerGroup = null;
                postMessageViewHolder.mRoot = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public PostMessageViewHolder_ViewBinding(PostMessageViewHolder postMessageViewHolder, View view) {
            this.f139065a = postMessageViewHolder;
            postMessageViewHolder.mPostContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.chat_post_container, "field 'mPostContainer'", FrameLayout.class);
            postMessageViewHolder.mPostView = (PostChatView2) Utils.findRequiredViewAsType(view, R.id.chat_post, "field 'mPostView'", PostChatView2.class);
            postMessageViewHolder.mAnnouncementContentViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.announcement_content, "field 'mAnnouncementContentViewStub'", ViewStub.class);
            postMessageViewHolder.mTranslatePostView = (PostChatView2) Utils.findRequiredViewAsType(view, R.id.translate_post, "field 'mTranslatePostView'", PostChatView2.class);
            postMessageViewHolder.mPostDivider = Utils.findRequiredView(view, R.id.translate_divider, "field 'mPostDivider'");
            postMessageViewHolder.mDividerGroup = (Group) Utils.findRequiredViewAsType(view, R.id.divider_group, "field 'mDividerGroup'", Group.class);
            postMessageViewHolder.mRoot = Utils.findRequiredView(view, R.id.root, "field 'mRoot'");
        }
    }

    public static class PostMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public View f139061a;

        /* renamed from: b */
        public LKUIRoundLinearLayout f139062b;

        /* renamed from: c */
        public PostChatView2 f139063c;

        /* renamed from: d */
        public TextView f139064d;
        @BindView(7185)
        public ViewStub mAnnouncementContentViewStub;
        @BindView(7594)
        public Group mDividerGroup;
        @BindView(7391)
        public FrameLayout mPostContainer;
        @BindView(9065)
        public View mPostDivider;
        @BindView(7389)
        public PostChatView2 mPostView;
        @BindView(8596)
        public View mRoot;
        @BindView(9074)
        public PostChatView2 mTranslatePostView;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
        }

        /* renamed from: a */
        public void mo191546a(Context context, boolean z, boolean z2, boolean z3) {
            int i;
            int i2;
            FrameLayout frameLayout = this.mPostContainer;
            int i3 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
            if (z) {
                if (!z3) {
                    this.mPostView.setVisibility(0);
                    View view = this.f139061a;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    if (this.f139061a == null) {
                        View inflate = this.mAnnouncementContentViewStub.inflate();
                        this.f139061a = inflate;
                        this.f139063c = (PostChatView2) inflate.findViewById(R.id.chat_post_announcement);
                        this.f139064d = (TextView) this.f139061a.findViewById(R.id.tv_group_announcement_detail);
                        this.f139062b = (LKUIRoundLinearLayout) this.f139061a.findViewById(R.id.bubble_announcement);
                    }
                    this.mPostView.setVisibility(8);
                    this.f139061a.setVisibility(0);
                    this.f139063c.setTextSize((int) LKUIDisplayManager.m91864a(context, (int) 17.0f));
                    this.f139062b.setRadius(10.0f);
                }
            }
            PostChatView2 postChatView2 = this.mTranslatePostView;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            postChatView2.setVisibility(i2);
            Group group = this.mDividerGroup;
            if (!z || !z2) {
                i3 = 8;
            }
            group.setVisibility(i3);
            int i4 = (int) 17.0f;
            this.mPostView.setTextSize((int) LKUIDisplayManager.m91864a(context, i4));
            this.mTranslatePostView.setTextSize((int) LKUIDisplayManager.m91864a(context, i4));
        }
    }

    /* renamed from: a */
    private void m219082a(TextView textView) {
        textView.setVisibility(8);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.View$OnClickListenerC561895 */

            public void onClick(View view) {
                String str;
                if (ThreadWindowPostCell2.this.f85789d.mo122550n() != null) {
                    str = ThreadWindowPostCell2.this.f85789d.mo122550n().getChatAnnouncement().getAnnounceUrl();
                } else {
                    str = "";
                }
                ThreadWindowPostCell2.this.f139030b.mo134330a(ThreadWindowPostCell2.this.mo122719d(), str);
            }
        });
    }

    /* renamed from: b */
    private boolean m219090b(AbsMessageVO<ContentVO<?>> aVar) {
        return C35247g.m137635b(aVar.mo121699g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo191539a(AbsMessageVO<ContentVO<?>> aVar) {
        if (!this.f85789d.mo122560x() || !(this.f85789d instanceof C55934b)) {
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "@someone", ChatHitPointNew.f135660c.mo187391b("@someone"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
            return;
        }
        C55934b bVar = (C55934b) this.f85789d;
        ThreadTopicHitPointNew.f135908b.mo187753a(bVar.mo122550n(), bVar.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(aVar, "@someone", (String) null, (String) null));
    }

    public ThreadWindowPostCell2(AbstractC33342d dVar, AbstractC56194a aVar) {
        super(dVar);
        this.f139029a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m219089b(C59119d dVar, BaseTextContentVO baseTextContentVO) {
        dVar.mo200867b();
        this.f85789d.mo122534a((int[]) null);
        baseTextContentVO.mo121777a("");
        baseTextContentVO.mo121783b(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m219087a(C59119d dVar, BaseTextContentVO baseTextContentVO) {
        UICallbackExecutor.post(new Runnable(dVar, baseTextContentVO) {
            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$ThreadWindowPostCell2$j92KCTEFsSVH2M2Z4mo5QSCHn2c */
            public final /* synthetic */ C59119d f$1;
            public final /* synthetic */ BaseTextContentVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ThreadWindowPostCell2.this.m219089b((ThreadWindowPostCell2) this.f$1, (C59119d) this.f$2);
            }
        });
    }

    /* renamed from: b */
    private void m219088b(PostMessageViewHolder postMessageViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        BubbleStyle a = BubbleStyle.m131964a((int) ActivityIdentificationData.WALKING, postMessageViewHolder.f139063c.getTitleDivisionView(), new int[]{C57582a.m223601a((Context) this.f85789d.mo122543g(), 12.0f), C57582a.m223601a((Context) this.f85789d.mo122543g(), 8.0f), C57582a.m223601a((Context) this.f85789d.mo122543g(), 12.0f), C57582a.m223601a((Context) this.f85789d.mo122543g(), 8.0f)});
        MsgBubbleUtil.m133102a(postMessageViewHolder.f139062b, a.mo126148c(), a.mo126151e(), 0, a.mo126150d());
        int[] b = a.mo126147b();
        postMessageViewHolder.f139062b.setPadding(b[0], b[1], b[2], b[3]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo191540a(com.ss.android.lark.chat.vo.AbsMessageVO<com.ss.android.lark.chat.export.vo.ContentVO<?>> r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.mo191540a(com.ss.android.lark.chat.e.a, java.lang.String):void");
    }

    /* renamed from: a */
    private void m219086a(final PostMessageViewHolder postMessageViewHolder, final AbsMessageVO<ContentVO<?>> aVar, PostChatView2 postChatView2, boolean z) {
        m219084a(postChatView2, aVar.mo121699g(), aVar, postMessageViewHolder, z);
        m219085a(postChatView2, (ContentVO) aVar.mo121699g(), (AbsMessageVO) aVar, false);
        postChatView2.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561906 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowPostCell2.this.mo122683c(postMessageViewHolder, aVar);
            }
        });
    }

    /* renamed from: a */
    private void m219085a(PostChatView2 postChatView2, ContentVO aVar, AbsMessageVO aVar2, boolean z) {
        String str;
        String str2;
        mo190689a(postChatView2, aVar2);
        postChatView2.setShowMoreViewBg(R.drawable.post_show_more_self_normal);
        if (this.f85789d.mo122550n() != null) {
            str = this.f85789d.mo122550n().getChatAnnouncement().getAnnounceUrl();
        } else {
            str = "";
        }
        if (aVar2.mo121713u()) {
            postChatView2.mo127190a("", TextLayoutProcessor.m128386a(UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled), TextLayoutProcessor.m128387a().mo122479g(true).mo122483i(z), this.f85789d.mo122543g()), aVar2.ai(), aVar2.mo121692b(), aVar2.mo121681a(), aVar2.mo121700h(), false, "", this.f85789d.mo122549m(), this.f85789d.mo122546j());
        } else if (aVar instanceof TextContentVO) {
            Layout j = ((TextContentVO) aVar).mo121790j();
            if (j == null) {
                j = TextLayoutProcessor.m128384a(aVar2, TextLayoutProcessor.m128387a().mo122463a(18).mo122483i(z), this.f85789d.mo122543g());
            }
            postChatView2.mo127190a("", j, aVar2.ai(), aVar2.mo121692b(), aVar2.mo121681a(), aVar2.mo121700h(), false, "", this.f85789d.mo122549m(), this.f85789d.mo122546j());
        } else if (aVar instanceof PostContentVO) {
            PostContentVO iVar = (PostContentVO) aVar;
            Layout j2 = iVar.mo121790j();
            if (j2 == null) {
                j2 = TextLayoutProcessor.m128384a(aVar2, TextLayoutProcessor.m128387a().mo122463a(18).mo122483i(z), this.f85789d.mo122543g());
                iVar.mo121775a(j2);
            }
            String a = iVar.mo121877a(C29990c.m110930b().mo134528a());
            boolean ai2 = aVar2.ai();
            String b = aVar2.mo121692b();
            String a2 = aVar2.mo121681a();
            String h = aVar2.mo121700h();
            boolean n = iVar.mo121882n();
            if (iVar.mo121882n()) {
                str2 = str;
            } else {
                str2 = "";
            }
            postChatView2.mo127190a(a, j2, ai2, b, a2, h, n, str2, this.f85789d.mo122549m(), this.f85789d.mo122546j());
            if (iVar.mo121882n()) {
                postChatView2.setTitleDivisionViewVisible(4);
            } else {
                postChatView2.setTitleDivisionViewVisible(8);
            }
        } else {
            postChatView2.mo127190a("", TextLayoutProcessor.m128386a(UIHelper.getString(R.string.Lark_Legacy_SaveBoxListUnknown), TextLayoutProcessor.m128387a().mo122479g(true).mo122483i(z), this.f85789d.mo122543g()), aVar2.ai(), aVar2.mo121692b(), aVar2.mo121681a(), aVar2.mo121700h(), false, "", this.f85789d.mo122549m(), this.f85789d.mo122546j());
        }
    }

    /* renamed from: a */
    private void m219081a(Context context, PostMessageViewHolder postMessageViewHolder, boolean z, boolean z2, boolean z3) {
        postMessageViewHolder.mo191546a(context, z, z2, z3);
    }

    /* renamed from: a */
    private void m219084a(final PostChatView2 postChatView2, final ContentVO aVar, final AbsMessageVO aVar2, final PostMessageViewHolder postMessageViewHolder, final boolean z) {
        postChatView2.setPhoneSpanClickListener(new IPhoneSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561917 */

            @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
            /* renamed from: b */
            public void mo122867b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.light.listener.IPhoneSpanClickListener
            /* renamed from: a */
            public void mo122866a(View view, String str) {
                ThreadWindowPostCell2.this.f139031c.mo134641a((Context) ThreadWindowPostCell2.this.f85789d.mo122543g(), str);
            }
        });
        postChatView2.setUrlSpanClickListener(new IUrlSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561928 */

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public boolean b_(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IUrlSpanClickListener
            public void a_(View view, String str) {
                ThreadWindowPostCell2.this.mo191540a(aVar2, str);
                ThreadWindowPostCell2.this.f139030b.mo134333b(ThreadWindowPostCell2.this.f85789d.mo122543g(), str, 2);
            }
        });
        postChatView2.setAtSpanClickListener(new IAtSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561939 */

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: b */
            public boolean mo122871b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IAtSpanClickListener
            /* renamed from: a */
            public void mo122870a(View view, String str, String str2) {
                ThreadWindowPostCell2.this.mo191539a(aVar2);
                ThreadWindowPostCell2.this.f139029a.mo190448a(view, str2, aVar2.mo121692b());
            }
        });
        postChatView2.setMentionSpanClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                C29990c.m110930b().mo134548a(ThreadWindowPostCell2.this.mo122719d(), str3);
            }
        });
        postChatView2.setImageClickListener(new IImageSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.light.listener.IImageSpanClickListener
            /* renamed from: a */
            public void mo122874a(View view, ImageClickInfo kVar) {
                ContentVO aVar = aVar;
                if (aVar instanceof BaseTextContentVO) {
                    Image a = C59031e.m229175a(((BaseTextContentVO) aVar).mo121772a(), kVar.mo198118b(), kVar.mo198115a());
                    if (a == null) {
                        Log.m165383e("ThreadWindowPostCell2", "Can't find select image, token:" + kVar.mo198118b() + ", url:" + kVar.mo198115a());
                        return;
                    }
                    ThreadWindowPostCell2.this.f139029a.mo190445a(view, aVar2, a, z);
                }
            }
        });
        postChatView2.setVideoClickListener(new IMediaSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AnonymousClass12 */

            @Override // com.ss.android.lark.widget.light.listener.IMediaSpanClickListener
            /* renamed from: a */
            public void mo122875a(View view, MediaInfo mediaInfo) {
                ThreadWindowPostCell2.this.f139029a.mo190446a(view, aVar2, C59031e.m229177a(((BaseTextContentVO) aVar2.mo121699g()).mo121772a(), mediaInfo));
            }
        });
        postChatView2.setAbbreviationsClickListener(new IAbbreviationClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561852 */

            @Override // com.ss.android.lark.widget.light.listener.IAbbreviationClickListener
            public void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                C29990c.m110930b().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, ThreadWindowPostCell2.this.f85789d.mo122544h(), new AbstractC28533c() {
                    /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561852.C561861 */

                    @Override // com.ss.android.lark.ai.AbstractC28533c
                    /* renamed from: a */
                    public void mo101579a(Dialog dialog) {
                        WindowDialogManager.f91123a.mo129819a(dialog);
                    }

                    @Override // com.ss.android.lark.ai.AbstractC28533c
                    /* renamed from: a */
                    public void mo101580a(PopupWindow popupWindow) {
                        WindowDialogManager.f91123a.mo129820a(popupWindow);
                    }
                }, abbreviationInfo.messageId);
            }
        });
        if (this.f139029a instanceof C33377a.AbstractC33380a) {
            postChatView2.setIntentionClickListener(new C33377a(mo122719d(), (C33377a.AbstractC33380a) this.f139029a, this.f85789d));
        }
        postChatView2.setOnLongTextClickListener(new PostChatView.AbstractC33970a() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.C561873 */

            @Override // com.ss.android.lark.chat.core.view.PostChatView.AbstractC33970a
            public void onClick(View view) {
                ThreadWindowPostCell2.this.f139029a.mo190444a(view, aVar2);
            }
        });
        postChatView2.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.View$OnLongClickListenerC561884 */

            public boolean onLongClick(View view) {
                if (ThreadWindowPostCell2.this.mo191542f()) {
                    ThreadWindowPostCell2.this.mo191541a(postChatView2, postMessageViewHolder, aVar2, z);
                    return true;
                }
                ThreadWindowPostCell2.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar2);
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m219083a(BaseTextContentVO baseTextContentVO, boolean z, C59119d dVar, PostMessageViewHolder postMessageViewHolder, AbsMessageVO aVar, SelectedTextInfo aVar2) {
        baseTextContentVO.mo121777a(aVar2.mo200855a());
        baseTextContentVO.mo121783b(z);
        this.f85789d.mo122534a(new int[]{aVar2.mo200856b(), aVar2.mo200857c(), aVar2.mo200858d()});
        this.f139032e = new C33240h.AbstractC33243b(dVar, baseTextContentVO) {
            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$ThreadWindowPostCell2$fPNtvzi18BWrbH2u0XUDQlnR5mY */
            public final /* synthetic */ C59119d f$1;
            public final /* synthetic */ BaseTextContentVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.C33240h.AbstractC33243b
            public final void hideSelection() {
                ThreadWindowPostCell2.this.m219087a((ThreadWindowPostCell2) this.f$1, (C59119d) this.f$2);
            }
        };
        C33240h.m128531a().mo122573a(this.f139032e);
        C33240h.m128531a().mo122574a(aVar2.mo200859e());
        mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
    }
}
