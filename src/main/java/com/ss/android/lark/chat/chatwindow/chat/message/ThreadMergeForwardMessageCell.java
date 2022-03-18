package com.ss.android.lark.chat.chatwindow.chat.message;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.threaddetail.C55831i;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.C59031e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadMergeForwardMessageCell extends AbstractC33290a<ThreadMergeForwardContentVO, ThreadMergeForwardViewHolder> {

    /* renamed from: b */
    private static final int f85771b = UIHelper.dp2px(64.0f);

    /* renamed from: c */
    private static final int f85772c = UIHelper.dp2px(16.0f);

    /* renamed from: a */
    final OnThreadMergeForwardClickListener f85773a;

    /* renamed from: e */
    private final int f85774e;

    /* renamed from: g */
    private final int f85775g;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.thread_merge_forward_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return ThreadMergeForwardContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class mo122650b() {
        return ThreadMergeForwardViewHolder.class;
    }

    public class ThreadMergeForwardViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadMergeForwardViewHolder f85787a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadMergeForwardViewHolder threadMergeForwardViewHolder = this.f85787a;
            if (threadMergeForwardViewHolder != null) {
                this.f85787a = null;
                threadMergeForwardViewHolder.mRootView = null;
                threadMergeForwardViewHolder.mTitleTV = null;
                threadMergeForwardViewHolder.mContentTV = null;
                threadMergeForwardViewHolder.mContentIV = null;
                threadMergeForwardViewHolder.mFromTV = null;
                threadMergeForwardViewHolder.mFromIV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadMergeForwardViewHolder_ViewBinding(ThreadMergeForwardViewHolder threadMergeForwardViewHolder, View view) {
            this.f85787a = threadMergeForwardViewHolder;
            threadMergeForwardViewHolder.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.root, "field 'mRootView'", ViewGroup.class);
            threadMergeForwardViewHolder.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_title, "field 'mTitleTV'", TextView.class);
            threadMergeForwardViewHolder.mContentTV = (TextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_content, "field 'mContentTV'", TextView.class);
            threadMergeForwardViewHolder.mContentIV = (LKUIRoundedImageView2) Utils.findRequiredViewAsType(view, R.id.merge_forward_image, "field 'mContentIV'", LKUIRoundedImageView2.class);
            threadMergeForwardViewHolder.mFromTV = (TextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_from, "field 'mFromTV'", TextView.class);
            threadMergeForwardViewHolder.mFromIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.merge_forward_from_iv, "field 'mFromIV'", ImageView.class);
        }
    }

    public static class ThreadMergeForwardViewHolder extends AbstractC59010e {
        @BindView(8186)
        public LKUIRoundedImageView2 mContentIV;
        @BindView(8182)
        public TextView mContentTV;
        @BindView(8185)
        public ImageView mFromIV;
        @BindView(8184)
        public TextView mFromTV;
        @BindView(8596)
        public ViewGroup mRootView;
        @BindView(8187)
        public TextView mTitleTV;

        /* renamed from: a */
        private void m128881a() {
            if (!DesktopUtil.m144307b()) {
                C25649b.m91857a(this.mTitleTV, LarkFont.HEADLINE);
                C25649b.m91857a(this.mContentTV, LarkFont.BODY1);
                C25649b.m91853a(this.mContentIV, 64);
                C25649b.m91857a(this.mFromTV, LarkFont.CAPTION0);
                C25649b.m91853a(this.mFromIV, 16);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            m128881a();
        }
    }

    /* renamed from: a */
    public void mo122749a(String str) {
        C35228b.m137564a().mo121114a(mo122719d(), ChatBundle.m109259a().mo105927a(str).mo105929a());
    }

    /* renamed from: b */
    private Image m128867b(ThreadMergeForwardContentVO nVar) {
        List<Message> messages = ((MergeForwardContent) nVar.mo126168z()).getMessages();
        if (CollectionUtils.isEmpty(messages)) {
            return null;
        }
        Message message = messages.get(0);
        if (message.getType() == Message.Type.IMAGE) {
            return ((ImageContent) message.getContent()).getImageSet().getThumbnail();
        }
        if (message.getType() == Message.Type.POST) {
            List<Image> a = C57305aa.m222056a(C59031e.m229179a(((PostContent) message.getContent()).getRichText()));
            if (CollectionUtils.isNotEmpty(a)) {
                return a.get(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo122746a(ThreadMergeForwardContentVO nVar) {
        Thread thread = ((MergeForwardContent) nVar.mo126168z()).getThread();
        Map<String, Object> hashMap = new HashMap<>();
        if (thread != null) {
            hashMap = ChatHitPointNew.f135660c.mo187379a(thread.id);
        }
        ChatHitPointNew.f135660c.mo187388a(nVar.mo121915d(), "topic_card_group", "im_chat_main_view", hashMap);
    }

    public ThreadMergeForwardMessageCell(AbstractC33342d dVar, OnThreadMergeForwardClickListener bVar) {
        this(dVar, 0, 0, bVar);
    }

    /* renamed from: a */
    private void m128866a(AbsMessageVO<ThreadMergeForwardContentVO> aVar, ThreadMergeForwardContentVO nVar) {
        Thread thread = ((MergeForwardContent) nVar.mo126168z()).getThread();
        Map<String, Object> hashMap = new HashMap<>();
        if (thread != null) {
            hashMap = ChatHitPointNew.f135660c.mo187379a(thread.id);
        }
        ChatHitPointNew.f135660c.mo187388a(aVar.mo121692b(), "topic_card_msg", "channel_topic_detail_view", hashMap);
    }

    /* renamed from: a */
    public void mo122748a(Image image, ThreadMergeForwardViewHolder threadMergeForwardViewHolder) {
        List<PhotoItem> a = C58659h.m227513a(Collections.singletonList(new ImageSet(image.getKey(), image, image)));
        if (!CollectionUtils.isEmpty(a)) {
            a.get(0);
            C29990c.m110930b().mo134541a(mo122719d(), a, 0, threadMergeForwardViewHolder.mContentIV, null, true, false, false, false, false, false, null, null, Scene.Thread, 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(ThreadMergeForwardViewHolder threadMergeForwardViewHolder, AbsMessageVO<ThreadMergeForwardContentVO> aVar) {
        ThreadMergeForwardContentVO g = aVar.mo121699g();
        if (!aVar.mo121699g().mo121918f() || ((MergeForwardContent) g.mo126168z()).getThread() == null) {
            OnThreadMergeForwardClickListener bVar = this.f85773a;
            if (bVar != null) {
                bVar.mo123362u(aVar.mo121681a());
            }
        } else {
            C55831i.m216682a(mo122719d(), new C29604ae.C29606a().mo106670b(((MergeForwardContent) g.mo126168z()).getThread().id).mo106667a(true).mo106668a());
        }
        m128866a(aVar, g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final ThreadMergeForwardViewHolder threadMergeForwardViewHolder, final AbsMessageVO<ThreadMergeForwardContentVO> aVar) {
        super.mo122648a((AbstractC59010e) threadMergeForwardViewHolder, (AbsMessageVO) aVar);
        final ThreadMergeForwardContentVO g = aVar.mo121699g();
        threadMergeForwardViewHolder.mTitleTV.setText(g.mo121907a());
        threadMergeForwardViewHolder.mContentTV.setText(g.mo121911b());
        threadMergeForwardViewHolder.mFromTV.setText(g.mo121913c());
        Drawable drawable = null;
        if (!g.mo121918f() || TextUtils.isEmpty(g.mo121917e()) || TextUtils.isEmpty(g.mo121917e())) {
            threadMergeForwardViewHolder.mFromIV.setVisibility(8);
            threadMergeForwardViewHolder.mFromIV.setOnClickListener(null);
            threadMergeForwardViewHolder.mFromTV.setOnClickListener(null);
        } else {
            threadMergeForwardViewHolder.mFromIV.setVisibility(0);
            IRequestCreator with = ImageLoader.with(mo122719d());
            String e = g.mo121917e();
            String d = g.mo121915d();
            int i = f85772c;
            with.load(AvatarImage.Builder.obtain(e, d, i, i).build()).override(i, i).into(threadMergeForwardViewHolder.mFromIV);
            C332861 r1 = new AbstractView$OnClickListenerC52989b() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell.C332861 */

                @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
                /* renamed from: a */
                public void mo122732a(View view) {
                    ThreadMergeForwardMessageCell.this.mo122749a(g.mo121915d());
                    ThreadMergeForwardMessageCell.this.mo122746a(g);
                }
            };
            threadMergeForwardViewHolder.mFromTV.setOnClickListener(r1);
            threadMergeForwardViewHolder.mFromIV.setOnClickListener(r1);
        }
        if (this.f85789d.mo122558v() || this.f85789d.mo122560x()) {
            int color = UIHelper.getColor(R.color.udtoken_message_card_bg_blue);
            int[] iArr = {color, color, color, color};
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
            float dp2px = (float) UIHelper.dp2px(10.0f);
            if (aVar.mo121705m() == 0) {
                fArr[0] = dp2px;
                fArr[1] = dp2px;
                fArr[2] = dp2px;
                fArr[3] = dp2px;
            } else if (MessageCellUtils.m133199b(aVar)) {
                fArr[0] = dp2px;
                fArr[1] = dp2px;
            } else {
                fArr[2] = dp2px;
                fArr[3] = dp2px;
            }
            if (aVar.mo121705m() == 1) {
                if (MessageCellUtils.m133199b(aVar)) {
                    fArr[2] = dp2px;
                    fArr[3] = dp2px;
                } else {
                    fArr[0] = dp2px;
                    fArr[1] = dp2px;
                }
            }
            gradientDrawable.setCornerRadii(fArr);
            threadMergeForwardViewHolder.mTitleTV.setBackground(gradientDrawable);
        }
        ViewGroup viewGroup = threadMergeForwardViewHolder.mRootView;
        int i2 = this.f85775g;
        if (i2 != 0) {
            drawable = UIHelper.getDrawable(i2);
        }
        viewGroup.setBackground(drawable);
        final Image b = m128867b(g);
        if (b == null) {
            threadMergeForwardViewHolder.mContentIV.setVisibility(8);
        } else {
            threadMergeForwardViewHolder.mContentIV.setVisibility(0);
            IRequestCreator dontAnimate = ImageLoader.with(mo122719d()).load(new C38824b(b.getKey())).dontAnimate(false);
            int i3 = f85771b;
            dontAnimate.override(i3, i3).centerCrop().into(threadMergeForwardViewHolder.mContentIV);
            threadMergeForwardViewHolder.mContentIV.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell.C332872 */

                @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
                /* renamed from: a */
                public void mo122732a(View view) {
                    ThreadMergeForwardMessageCell.this.mo122748a(b, threadMergeForwardViewHolder);
                }
            });
        }
        threadMergeForwardViewHolder.mRootView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell.View$OnClickListenerC332883 */

            public void onClick(View view) {
                ThreadMergeForwardMessageCell.this.mo122683c(threadMergeForwardViewHolder, aVar);
            }
        });
        threadMergeForwardViewHolder.mRootView.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell.View$OnLongClickListenerC332894 */

            public boolean onLongClick(View view) {
                return ThreadMergeForwardMessageCell.this.mo122755b((AbstractC59010e) threadMergeForwardViewHolder, (Object) aVar);
            }
        });
    }

    public ThreadMergeForwardMessageCell(AbstractC33342d dVar, int i, int i2, OnThreadMergeForwardClickListener bVar) {
        super(dVar);
        this.f85774e = i;
        this.f85775g = i2;
        this.f85773a = bVar;
    }
}
