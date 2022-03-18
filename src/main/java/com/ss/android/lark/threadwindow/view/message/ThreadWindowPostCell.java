package com.ss.android.lark.threadwindow.view.message;

import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.ai.AbstractC28533c;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g;
import com.ss.android.lark.chat.core.view.PostChatView;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34330a;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.utils.MsgBubbleUtil;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34439b;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.light.listener.IMentionSpanClickListener;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import java.util.ArrayList;
import java.util.List;

public class ThreadWindowPostCell extends AbstractC33290a<ContentVO<?>, PostMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC56183a f138981a;

    /* renamed from: b */
    public final IBrowserDependency f138982b = C29990c.m110930b().mo134593u();

    /* renamed from: c */
    public final AbstractC36474h.AbstractC36489o f138983c = C29990c.m110930b().mo134525X();

    /* renamed from: e */
    public final AbstractC36473g f138984e = C29990c.m110930b().mo134594v();

    /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell$a */
    public interface AbstractC56183a {
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
        return R.layout.thread_window_item_post;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<PostMessageViewHolder> mo122650b() {
        return PostMessageViewHolder.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return PostContentVO.class;
    }

    public class PostMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private PostMessageViewHolder f139028a;

        @Override // butterknife.Unbinder
        public void unbind() {
            PostMessageViewHolder postMessageViewHolder = this.f139028a;
            if (postMessageViewHolder != null) {
                this.f139028a = null;
                postMessageViewHolder.mPostContainer = null;
                postMessageViewHolder.mPostView = null;
                postMessageViewHolder.mAnnouncementContentViewStub = null;
                postMessageViewHolder.mTranslatePostView = null;
                postMessageViewHolder.mPostDivider = null;
                postMessageViewHolder.mDividerGroup = null;
                postMessageViewHolder.mRoot = null;
                postMessageViewHolder.mTranslateLabel = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public PostMessageViewHolder_ViewBinding(PostMessageViewHolder postMessageViewHolder, View view) {
            this.f139028a = postMessageViewHolder;
            postMessageViewHolder.mPostContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.chat_post_container, "field 'mPostContainer'", FrameLayout.class);
            postMessageViewHolder.mPostView = (PostChatView) Utils.findRequiredViewAsType(view, R.id.chat_post, "field 'mPostView'", PostChatView.class);
            postMessageViewHolder.mAnnouncementContentViewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.announcement_content, "field 'mAnnouncementContentViewStub'", ViewStub.class);
            postMessageViewHolder.mTranslatePostView = (PostChatView) Utils.findRequiredViewAsType(view, R.id.translate_post, "field 'mTranslatePostView'", PostChatView.class);
            postMessageViewHolder.mPostDivider = Utils.findRequiredView(view, R.id.translate_divider, "field 'mPostDivider'");
            postMessageViewHolder.mDividerGroup = (Group) Utils.findRequiredViewAsType(view, R.id.divider_group, "field 'mDividerGroup'", Group.class);
            postMessageViewHolder.mRoot = Utils.findRequiredView(view, R.id.root, "field 'mRoot'");
            postMessageViewHolder.mTranslateLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.translate_label, "field 'mTranslateLabel'", TextView.class);
        }
    }

    public static class PostMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public View f139024a;

        /* renamed from: b */
        public LKUIRoundLinearLayout f139025b;

        /* renamed from: c */
        public PostChatView f139026c;

        /* renamed from: d */
        public TextView f139027d;
        @BindView(7185)
        public ViewStub mAnnouncementContentViewStub;
        @BindView(7594)
        public Group mDividerGroup;
        @BindView(7391)
        public FrameLayout mPostContainer;
        @BindView(9065)
        public View mPostDivider;
        @BindView(7389)
        public PostChatView mPostView;
        @BindView(8596)
        public View mRoot;
        @BindView(9068)
        public TextView mTranslateLabel;
        @BindView(9074)
        public PostChatView mTranslatePostView;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
        }

        /* renamed from: a */
        private void m219075a(Context context, PostChatView postChatView) {
            postChatView.setTitleTextSize((int) LKUIDisplayManager.m91864a(context, 17));
            postChatView.setTextEmojiSize(LKUIDisplayManager.m91881c(context, 20));
            postChatView.setShowMoreTextSize(LKUIDisplayManager.m91881c(context, 14));
            postChatView.setTextSize((float) LKUIDisplayManager.m91881c(context, 17));
        }

        /* renamed from: a */
        public void mo191538a(Context context, boolean z, boolean z2, boolean z3) {
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
                    View view = this.f139024a;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    if (this.f139024a == null) {
                        View inflate = this.mAnnouncementContentViewStub.inflate();
                        this.f139024a = inflate;
                        this.f139026c = (PostChatView) inflate.findViewById(R.id.chat_post_announcement);
                        TextView textView = (TextView) this.f139024a.findViewById(R.id.tv_group_announcement_detail);
                        this.f139027d = textView;
                        C25649b.m91856a(textView, 14);
                        this.f139025b = (LKUIRoundLinearLayout) this.f139024a.findViewById(R.id.bubble_announcement);
                    }
                    this.mPostView.setVisibility(8);
                    this.f139024a.setVisibility(0);
                    m219075a(context, this.f139026c);
                    this.f139025b.setRadius(10.0f);
                }
            }
            PostChatView postChatView = this.mTranslatePostView;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            postChatView.setVisibility(i2);
            Group group = this.mDividerGroup;
            if (!z || !z2) {
                i3 = 8;
            }
            group.setVisibility(i3);
            m219075a(context, this.mPostView);
            m219075a(context, this.mTranslatePostView);
            C25649b.m91856a(this.mTranslateLabel, 12);
        }
    }

    /* renamed from: a */
    private void m219044a(TextView textView) {
        textView.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.View$OnClickListenerC561829 */

            public void onClick(View view) {
                String str;
                if (ThreadWindowPostCell.this.f85789d.mo122550n() != null) {
                    str = ThreadWindowPostCell.this.f85789d.mo122550n().getChatAnnouncement().getAnnounceUrl();
                } else {
                    str = "";
                }
                ThreadWindowPostCell.this.f138982b.mo134330a(ThreadWindowPostCell.this.mo122719d(), str);
            }
        });
    }

    /* renamed from: a */
    private boolean m219049a(AbsMessageVO<ContentVO<?>> aVar) {
        return C35247g.m137635b(aVar.mo121699g());
    }

    /* renamed from: a */
    private void m219048a(RichText richText) {
        int i;
        if (!(richText == null || C59035h.m229210a(richText))) {
            for (RichTextElement richTextElement : richText.getElements().getDictionary().values()) {
                if (richTextElement != null && richTextElement.getTag() == RichTextElement.RichTextTag.IMG && (richTextElement.getProperty() instanceof RichTextElement.ImageProperty)) {
                    RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) richTextElement.getProperty();
                    int screenWidth = DeviceUtils.getScreenWidth(this.f85789d.mo122543g()) - UIHelper.dp2px(32.0f);
                    if (imageProperty.getOriginWidth() != 0) {
                        i = (imageProperty.getOriginHeight() * screenWidth) / imageProperty.getOriginWidth();
                    } else {
                        i = imageProperty.getOriginHeight();
                        Log.m165382e("announce image origin width == 0");
                    }
                    imageProperty.setOriginWidth(screenWidth);
                    imageProperty.setOriginHeight(i);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo190687a(PostChatView postChatView) {
        postChatView.setEnableEllipsize(true);
        postChatView.setMaxHeightFactor(0.9d);
    }

    public ThreadWindowPostCell(AbstractC33342d dVar, AbstractC56183a aVar) {
        super(dVar);
        this.f138981a = aVar;
    }

    /* renamed from: b */
    private void m219050b(PostMessageViewHolder postMessageViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        int i;
        if (aVar.mo121695c()) {
            i = 3;
        } else {
            i = 4;
        }
        BubbleStyle a = BubbleStyle.m131964a(i, postMessageViewHolder.f139026c.getTitleDivisionView(), new int[]{C57582a.m223601a((Context) this.f85789d.mo122543g(), 12.0f), C57582a.m223601a((Context) this.f85789d.mo122543g(), 8.0f), C57582a.m223601a((Context) this.f85789d.mo122543g(), 12.0f), C57582a.m223601a((Context) this.f85789d.mo122543g(), 8.0f)});
        MsgBubbleUtil.m133102a(postMessageViewHolder.f139025b, a.mo126148c(), a.mo126151e(), 0, a.mo126150d());
        int[] b = a.mo126147b();
        postMessageViewHolder.f139025b.setPadding(b[0], b[1], b[2], b[3]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final PostMessageViewHolder postMessageViewHolder, final AbsMessageVO<ContentVO<?>> aVar) {
        boolean z;
        boolean z2;
        TranslatableContentVO oVar;
        super.mo122648a((AbstractC59010e) postMessageViewHolder, (AbsMessageVO) aVar);
        boolean z3 = !C34350p.m133216a(aVar);
        if (!(aVar.mo121699g() instanceof BaseTextContentVO) || ((BaseTextContentVO) aVar.mo121699g()).mo121929x() != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z3 || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        m219043a(this.f85789d.mo122543g(), postMessageViewHolder, z2, z3, m219049a(aVar));
        if (z2) {
            if (!m219049a(aVar)) {
                m219047a(postMessageViewHolder, aVar, postMessageViewHolder.mPostView);
            } else {
                m219047a(postMessageViewHolder, aVar, postMessageViewHolder.f139026c);
                m219044a(postMessageViewHolder.f139027d);
                m219050b(postMessageViewHolder, aVar);
            }
        }
        if (z3) {
            if (aVar.mo121699g() instanceof TranslatableContentVO) {
                oVar = ((TranslatableContentVO) aVar.mo121699g()).mo121930y();
            } else {
                oVar = null;
            }
            if (oVar != null) {
                Content z4 = oVar.mo126168z();
                m219045a(postMessageViewHolder.mTranslatePostView, (AbsMessageVO) aVar, postMessageViewHolder, true);
                m219046a(postMessageViewHolder.mTranslatePostView, z4, (AbsMessageVO) aVar, true);
                postMessageViewHolder.mTranslatePostView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.View$OnClickListenerC561731 */

                    public void onClick(View view) {
                        ThreadWindowPostCell.this.mo122683c(postMessageViewHolder, aVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m219047a(final PostMessageViewHolder postMessageViewHolder, final AbsMessageVO<ContentVO<?>> aVar, PostChatView postChatView) {
        m219045a(postChatView, (AbsMessageVO) aVar, postMessageViewHolder, false);
        m219046a(postChatView, aVar.mo121699g().mo126168z(), (AbsMessageVO) aVar, false);
        postChatView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowPostCell.this.mo122683c(postMessageViewHolder, aVar);
            }
        });
    }

    /* renamed from: a */
    private void m219045a(PostChatView postChatView, final AbsMessageVO aVar, final PostMessageViewHolder postMessageViewHolder, final boolean z) {
        postChatView.setPhoneStringClickListener(new LinkEmojiTextView.AbstractC58524i() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: b */
            public void mo122809b(View view, String str) {
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58524i
            /* renamed from: a */
            public void mo122808a(View view, String str) {
                ThreadWindowPostCell.this.f138983c.mo134641a((Context) ThreadWindowPostCell.this.f85789d.mo122543g(), str);
            }
        });
        postChatView.setUrlStringClickListener(new LinkEmojiTextView.AbstractC58525j() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass12 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: b */
            public boolean mo122807b(View view, String str) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58525j
            /* renamed from: a */
            public void mo122806a(View view, String str) {
                ThreadWindowPostCell.this.f138982b.mo134333b(ThreadWindowPostCell.this.f85789d.mo122543g(), str, 2);
                ThreadWindowPostCell.this.f138984e.mo134496a(str);
            }
        });
        postChatView.setAtStringClickListener(new LinkEmojiTextView.AbstractC58521f() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass13 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: b */
            public boolean mo117507b(View view, String str, String str2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
            /* renamed from: c */
            public void mo120297c(View view, String str, String str2) {
                ThreadWindowPostCell.this.f138981a.mo190448a(view, str2, aVar.mo121692b());
            }
        });
        postChatView.setMentionStringClickListener(new IMentionSpanClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass14 */

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public boolean mo122873a(View view, String str, String str2, boolean z) {
                return false;
            }

            @Override // com.ss.android.lark.widget.light.listener.IMentionSpanClickListener
            /* renamed from: a */
            public void mo122872a(View view, String str, String str2, boolean z, String str3) {
                C29990c.m110930b().mo134548a(ThreadWindowPostCell.this.mo122719d(), str3);
            }
        });
        postChatView.setPostImageListener(new RichTextView.AbstractC59024b() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass15 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59024b
            /* renamed from: a */
            public boolean mo136820a(View view) {
                ThreadWindowPostCell.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
                return true;
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59024b
            /* renamed from: a */
            public void mo136819a(Image image, View view) {
                ThreadWindowPostCell.this.f138981a.mo190445a(view, aVar, image, z);
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59024b
            /* renamed from: a */
            public boolean mo136821a(Image image, View view, MotionEvent motionEvent) {
                return C33143g.m128109a(ThreadWindowPostCell.this.mo122719d(), view, motionEvent.getRawX(), motionEvent.getRawY(), C33143g.m128103a(image));
            }
        });
        postChatView.setPostVideoListener(new RichTextView.AbstractC59026d() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59026d
            /* renamed from: a */
            public void mo136822a(View view, RichTextElement.MediaProperty mediaProperty) {
                ThreadWindowPostCell.this.f138981a.mo190446a(view, aVar, mediaProperty);
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59026d
            /* renamed from: b */
            public boolean mo136824b(View view, RichTextElement.MediaProperty mediaProperty) {
                ThreadWindowPostCell.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
                return true;
            }

            @Override // com.ss.android.lark.widget.richtext.RichTextView.AbstractC59026d
            /* renamed from: a */
            public boolean mo136823a(View view, RichTextElement.MediaProperty mediaProperty, MotionEvent motionEvent) {
                return C33143g.m128108a(ThreadWindowPostCell.this.mo122719d(), view, motionEvent.getRawX(), motionEvent.getRawY(), mediaProperty, aVar);
            }
        });
        C561742 r7 = new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.C561742 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowPostCell.this.mo122683c(postMessageViewHolder, aVar);
            }
        };
        postChatView.f87564a.setOnClickListener(r7);
        postChatView.f87564a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.View$OnLongClickListenerC561753 */

            public boolean onLongClick(View view) {
                ThreadWindowPostCell.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
                return true;
            }
        });
        postChatView.getContentView().setOnClickListener(r7);
        postChatView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.View$OnLongClickListenerC561764 */

            public boolean onLongClick(View view) {
                return ThreadWindowPostCell.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
            }
        });
        postChatView.getContentView().setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.View$OnLongClickListenerC561775 */

            public boolean onLongClick(View view) {
                ThreadWindowPostCell.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
                return true;
            }
        });
        postChatView.setAbbreviationsClockListener(new LinkEmojiTextView.AbstractC58520e() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.C561786 */

            @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58520e
            /* renamed from: a */
            public void mo136825a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                C29990c.m110930b().mo134527Z().mo134616a(abbreviationInfo.text, null, abbreviationInfo.id, f, f2, view, ThreadWindowPostCell.this.f85789d.mo122544h(), new AbstractC28533c() {
                    /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.C561786.C561791 */

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
        if (this.f138981a instanceof C33377a.AbstractC33380a) {
            postChatView.setIntentionClickListener(new C33377a(mo122719d(), (C33377a.AbstractC33380a) this.f138981a, this.f85789d));
        }
        postChatView.setOnLongTextClickListener(new PostChatView.AbstractC33970a() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.C561807 */

            @Override // com.ss.android.lark.chat.core.view.PostChatView.AbstractC33970a
            public void onClick(View view) {
                ThreadWindowPostCell.this.mo122683c(postMessageViewHolder, aVar);
            }
        });
        postChatView.f87568e.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell.View$OnLongClickListenerC561818 */

            public boolean onLongClick(View view) {
                return ThreadWindowPostCell.this.mo122755b((AbstractC59010e) postMessageViewHolder, (Object) aVar);
            }
        });
    }

    /* renamed from: a */
    private void m219046a(PostChatView postChatView, Content content, AbsMessageVO aVar, boolean z) {
        boolean z2;
        int i;
        mo190687a(postChatView);
        if (!m219049a(aVar)) {
            postChatView.getContentView().setImageBorderColor(UIUtils.getColor(this.f85789d.mo122543g(), R.color.line_border_component));
            postChatView.getContentView().setImageBoarderRadius((float) UIUtils.dp2px(this.f85789d.mo122543g(), 4.0f));
            postChatView.getContentView().setImageBorderWidth((float) UIUtils.dp2px(this.f85789d.mo122543g(), 0.5f));
        }
        int i2 = 0;
        C34330a.m133107a(postChatView.getContentView(), false);
        postChatView.getContentView().setShowVideo(true);
        postChatView.setShowMoreViewBg(R.drawable.post_show_more_self_normal);
        if (!aVar.mo121695c() || this.f85789d.mo122541e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (aVar.mo121713u()) {
            RichText b = C59029c.m229161b(UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled));
            postChatView.getContentView().setTextColor(C57582a.m223616d(mo122719d(), R.color.text_placeholder));
            postChatView.mo124088a("", b, "", "", new ArrayList(), new ArrayList(), false, false, z2);
        } else if (aVar.mo121699g() instanceof TextContentVO) {
            TextContentVO mVar = (TextContentVO) aVar.mo121699g();
            List<String> c = mVar.mo121784c();
            List<String> d = mVar.mo121785d();
            postChatView.getContentView().setTextColor(C57582a.m223616d(mo122719d(), R.color.text_title));
            postChatView.mo124088a("", ((TextContent) content).getRichText(), "", "", c, d, false, false, z2);
        } else if (aVar.mo121699g() instanceof PostContentVO) {
            PostContentVO iVar = (PostContentVO) aVar.mo121699g();
            List<String> c2 = iVar.mo121784c();
            List<String> d2 = iVar.mo121785d();
            PostContent postContent = (PostContent) content;
            String titleWithFilter = postContent.getTitleWithFilter(this.f85789d.mo122543g());
            RichText richText = postContent.getRichText();
            if (m219049a(aVar)) {
                m219048a(richText);
                postChatView.getContentView().setImageMode(3);
            } else {
                postChatView.getContentView().setImageMode(0);
            }
            C34439b.m133587a(postChatView.getContentView());
            postChatView.getContentView().setTextColor(C57582a.m223616d(mo122719d(), R.color.text_title));
            postChatView.mo124088a(titleWithFilter, richText, "", "", c2, d2, false, false, z2);
            if (DesktopUtil.m144301a(mo122719d())) {
                postChatView.setTitleDivisionViewVisible(8);
            } else {
                postChatView.setTitleDivisionViewVisible(4);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) postChatView.getTitleDivisionView().getLayoutParams();
            if (m219049a(aVar)) {
                i = 0;
            } else {
                i = UIHelper.dp2px(4.0f);
            }
            marginLayoutParams.bottomMargin = i;
            if (m219049a(aVar)) {
                i2 = UIHelper.dp2px(8.0f);
            }
            marginLayoutParams.topMargin = i2;
            postChatView.getTitleDivisionView().setLayoutParams(marginLayoutParams);
        } else {
            RichText b2 = C59029c.m229161b(UIHelper.getString(R.string.Lark_Legacy_SaveBoxListUnknown));
            postChatView.getContentView().setTextColor(C57582a.m223616d(mo122719d(), R.color.text_placeholder));
            postChatView.mo124088a("", b2, "", "", new ArrayList(), new ArrayList(), false, false, z2);
        }
    }

    /* renamed from: a */
    private void m219043a(Context context, PostMessageViewHolder postMessageViewHolder, boolean z, boolean z2, boolean z3) {
        postMessageViewHolder.mo191538a(context, z, z2, z3);
    }
}
