package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33234e;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33143g;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.utils.C34347m;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36501o;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threadwindow.view.message.C56210c;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.DonutProgress;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class MediaMessageCell extends AbstractC33290a<MediaContentVO, MediaMessageViewHolder> {

    /* renamed from: a */
    private final AbstractC33302l f85662a;

    /* renamed from: b */
    private final int f85663b;

    /* renamed from: c */
    private final int f85664c;

    /* renamed from: e */
    private final int f85665e;

    /* renamed from: g */
    private final float f85666g;

    /* renamed from: h */
    private final float f85667h;

    /* renamed from: i */
    private final boolean f85668i;

    /* renamed from: j */
    private final AbstractC36509x f85669j;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.media_content_item;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return MediaContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<MediaMessageViewHolder> mo122650b() {
        return MediaMessageViewHolder.class;
    }

    public class MediaMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MediaMessageViewHolder f85679a;

        @Override // butterknife.Unbinder
        public void unbind() {
            MediaMessageViewHolder mediaMessageViewHolder = this.f85679a;
            if (mediaMessageViewHolder != null) {
                this.f85679a = null;
                mediaMessageViewHolder.mImageView = null;
                mediaMessageViewHolder.mProgressBar = null;
                mediaMessageViewHolder.mPlay = null;
                mediaMessageViewHolder.mContinueUpload = null;
                mediaMessageViewHolder.mDuration = null;
                mediaMessageViewHolder.mContentView = null;
                mediaMessageViewHolder.mCoverForeground = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MediaMessageViewHolder_ViewBinding(MediaMessageViewHolder mediaMessageViewHolder, View view) {
            this.f85679a = mediaMessageViewHolder;
            mediaMessageViewHolder.mImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.media_cover, "field 'mImageView'", ImageView.class);
            mediaMessageViewHolder.mProgressBar = (DonutProgress) Utils.findRequiredViewAsType(view, R.id.media_upload_progress, "field 'mProgressBar'", DonutProgress.class);
            mediaMessageViewHolder.mPlay = (ImageView) Utils.findRequiredViewAsType(view, R.id.media_media_play, "field 'mPlay'", ImageView.class);
            mediaMessageViewHolder.mContinueUpload = (ImageView) Utils.findRequiredViewAsType(view, R.id.media_continue_upload, "field 'mContinueUpload'", ImageView.class);
            mediaMessageViewHolder.mDuration = (TextView) Utils.findRequiredViewAsType(view, R.id.media_duration, "field 'mDuration'", TextView.class);
            mediaMessageViewHolder.mContentView = (LKUIRoundableLayout) Utils.findRequiredViewAsType(view, R.id.media_content, "field 'mContentView'", LKUIRoundableLayout.class);
            mediaMessageViewHolder.mCoverForeground = Utils.findRequiredView(view, R.id.media_cover_foreground, "field 'mCoverForeground'");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell$4 */
    public static /* synthetic */ class C332724 {

        /* renamed from: a */
        static final /* synthetic */ int[] f85678a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.chat.entity.message.SendStatus[] r0 = com.ss.android.lark.chat.entity.message.SendStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.C332724.f85678a = r0
                com.ss.android.lark.chat.entity.message.SendStatus r1 = com.ss.android.lark.chat.entity.message.SendStatus.SENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.C332724.f85678a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.SendStatus r1 = com.ss.android.lark.chat.entity.message.SendStatus.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.C332724.f85678a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.message.SendStatus r1 = com.ss.android.lark.chat.entity.message.SendStatus.FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.C332724.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo122708e() {
        if (DesktopUtil.m144307b()) {
            return UIHelper.dp2px(360.0f);
        }
        if (this.f85789d.mo122559w()) {
            return (int) (((double) DeviceUtils.getScreenHeight(this.f85789d.mo122543g())) * 0.6d);
        }
        return (int) (((double) UIHelper.getWindowWidth(mo122719d())) * 0.6d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo122709f() {
        if (DesktopUtil.m144301a(mo122719d())) {
            return UIHelper.dp2px(360.0f);
        }
        return (int) (((double) UIHelper.getWindowWidth(mo122719d())) * 0.6d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128719a(View view) {
        LKUIToast.show(mo122719d(), (int) R.string.Lark_Legacy_VideoMessagePreviewInvalid);
    }

    /* renamed from: a */
    private void m128720a(MediaMessageViewHolder mediaMessageViewHolder) {
        mediaMessageViewHolder.mPlay.setVisibility(0);
        mediaMessageViewHolder.mContinueUpload.setVisibility(8);
        mediaMessageViewHolder.mProgressBar.setVisibility(8);
        mediaMessageViewHolder.mPlay.setImageResource(R.drawable.video_invalid);
        $$Lambda$MediaMessageCell$NfdIk0cLLJfw3OrarmGL8AFTSSs r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MediaMessageCell$NfdIk0cLLJfw3OrarmGL8AFTSSs */

            public final void onClick(View view) {
                MediaMessageCell.this.m128719a((MediaMessageCell) view);
            }
        };
        mediaMessageViewHolder.mImageView.setOnClickListener(r0);
        mediaMessageViewHolder.mPlay.setOnClickListener(r0);
    }

    public static class MediaMessageViewHolder extends AbstractC59010e {
        @BindView(8160)
        public LKUIRoundableLayout mContentView;
        @BindView(8161)
        public ImageView mContinueUpload;
        @BindView(8163)
        public View mCoverForeground;
        @BindView(8164)
        public TextView mDuration;
        @BindView(8162)
        public ImageView mImageView;
        @BindView(8165)
        public ImageView mPlay;
        @BindView(8167)
        public DonutProgress mProgressBar;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.mProgressBar.setShowText(false);
            this.mProgressBar.setFinishedStrokeColor(UIHelper.getColor(R.color.ud_B500));
            this.mProgressBar.setUnfinishedStrokeColor(C25653b.m91894a(view.getContext(), R.color.lkui_N00, 0.5f));
            float dp2px = (float) UIHelper.dp2px(2.0f);
            this.mProgressBar.setFinishedStrokeWidth(dp2px);
            this.mProgressBar.setUnfinishedStrokeWidth(dp2px);
            this.mProgressBar.setAttributeResourceId(R.drawable.video_ctrl_close);
            this.mProgressBar.setInnerBackgroundColor(C25653b.m91894a(view.getContext(), R.color.lkui_N900, 0.5f));
            this.mProgressBar.setMax(100);
        }
    }

    public MediaMessageCell(AbstractC33342d dVar, AbstractC33302l lVar) {
        this(dVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128721a(AbsMessageVO aVar, View view) {
        AbstractC33302l lVar = this.f85662a;
        if (lVar != null) {
            lVar.mo122774p(aVar.mo121696d());
        }
    }

    /* renamed from: c */
    private void m128723c(final MediaMessageViewHolder mediaMessageViewHolder, final AbsMessageVO<MediaContentVO> aVar) {
        C332691 r0 = new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.C332691 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MediaMessageCell.this.mo122683c(mediaMessageViewHolder, aVar);
            }
        };
        mediaMessageViewHolder.mImageView.setOnClickListener(r0);
        mediaMessageViewHolder.mPlay.setOnClickListener(r0);
        View$OnLongClickListenerC332702 r02 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.View$OnLongClickListenerC332702 */

            public boolean onLongClick(View view) {
                return MediaMessageCell.this.mo122755b((AbstractC59010e) mediaMessageViewHolder, (Object) aVar);
            }
        };
        mediaMessageViewHolder.mImageView.setOnLongClickListener(r02);
        mediaMessageViewHolder.mPlay.setOnLongClickListener(r02);
        mediaMessageViewHolder.mImageView.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell.View$OnGenericMotionListenerC332713 */

            public boolean onGenericMotion(View view, MotionEvent motionEvent) {
                if (motionEvent.getButtonState() != 2) {
                    return false;
                }
                if ((MediaMessageCell.this.f85789d instanceof C33234e) || (MediaMessageCell.this.f85789d instanceof C56210c) || (MediaMessageCell.this.f85789d instanceof C55934b)) {
                    return C33143g.m128106a(MediaMessageCell.this.mo122719d(), view, motionEvent.getRawX(), motionEvent.getRawY(), (AbsMessageVO<MediaContentVO>) aVar);
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    private int[] m128722a(Image image, Image image2) {
        int width = image2.getWidth();
        int height = image2.getHeight();
        int i = this.f85664c;
        int i2 = this.f85665e;
        int i3 = this.f85663b;
        return ImageUtils.m224135a(width, height, i, i2, i3, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo122683c(MediaMessageViewHolder mediaMessageViewHolder, AbsMessageVO<MediaContentVO> aVar) {
        C34347m.m133190a(this.f85789d.mo122543g(), mediaMessageViewHolder.mImageView, aVar, false, this.f85662a);
        if (this.f85789d.mo122560x() && (this.f85789d instanceof C55934b)) {
            C55934b bVar = (C55934b) this.f85789d;
            ThreadTopicHitPointNew.f135908b.mo187753a(bVar.mo122550n(), bVar.mo190684a(), "msg", "none", ThreadTopicHitPointNew.f135908b.mo187748a(aVar, "media", (String) null, (String) null));
        } else if (!this.f85789d.mo122559w()) {
            ChatHitPointNew.f135660c.mo187384a(this.f85789d.mo122550n(), "media", ChatHitPointNew.f135660c.mo187391b("media"), ChatHitPointNew.f135660c.mo187378a(aVar, (String) null, (String) null));
        }
    }

    /* renamed from: e */
    private void m128725e(MediaMessageViewHolder mediaMessageViewHolder, AbsMessageVO<MediaContentVO> aVar) {
        MediaContentVO g = aVar.mo121699g();
        mediaMessageViewHolder.mPlay.setVisibility(8);
        mediaMessageViewHolder.mContinueUpload.setVisibility(8);
        mediaMessageViewHolder.mProgressBar.setVisibility(8);
        mediaMessageViewHolder.mCoverForeground.setVisibility(8);
        int i = 0;
        if (g.mo121872o() || g.mo121873p() != Message.FileDeletedStatus.NORMAL) {
            m128720a(mediaMessageViewHolder);
            if (g.mo121873p() == Message.FileDeletedStatus.UNRECOVERABLE || g.mo121873p() == Message.FileDeletedStatus.RECOVERABLE) {
                AbstractC36501o s = C29990c.m110930b().mo134591s();
                String a = aVar.mo121681a();
                String m = g.mo121870m();
                if (g.mo121871n() != null) {
                    i = g.mo121871n().getNumber();
                }
                s.mo134679a(a, m, i, null);
                return;
            }
            return;
        }
        mediaMessageViewHolder.mPlay.setImageResource(R.drawable.media_play);
        if (C332724.f85678a[aVar.mo121656B().ordinal()] != 1) {
            mediaMessageViewHolder.mPlay.setVisibility(0);
        } else {
            mediaMessageViewHolder.mCoverForeground.setVisibility(0);
            mediaMessageViewHolder.mProgressBar.setVisibility(0);
            mediaMessageViewHolder.mProgressBar.setProgress((float) g.mo121865h());
        }
        mediaMessageViewHolder.mProgressBar.setOnClickListener(new View.OnClickListener(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$MediaMessageCell$PxuB76026y0hQiEzn8w0PbFk5gE */
            public final /* synthetic */ AbsMessageVO f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                MediaMessageCell.this.m128721a((MediaMessageCell) this.f$1, (AbsMessageVO) view);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(MediaMessageViewHolder mediaMessageViewHolder, AbsMessageVO<MediaContentVO> aVar) {
        super.mo122648a((AbstractC59010e) mediaMessageViewHolder, (AbsMessageVO) aVar);
        m128724d(mediaMessageViewHolder, aVar);
        m128723c(mediaMessageViewHolder, aVar);
        m128725e(mediaMessageViewHolder, aVar);
    }

    /* renamed from: d */
    private void m128724d(MediaMessageViewHolder mediaMessageViewHolder, AbsMessageVO<MediaContentVO> aVar) {
        boolean z;
        Scene scene;
        MediaContentVO g = aVar.mo121699g();
        ImageSet f = g.mo121863f();
        Image b = C34336c.m133132b(g.mo121863f());
        if (b == null || f == null) {
            C34336c.m133126a(mo122719d(), mediaMessageViewHolder.mImageView);
        } else {
            Image origin = f.getOrigin();
            int[] a = m128722a(b, origin);
            int i = a[0];
            int i2 = a[1];
            mediaMessageViewHolder.mContentView.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
            Drawable drawable = null;
            Object tag = mediaMessageViewHolder.mImageView.getTag(R.id.chat_window_image_cid);
            if (!DesktopUtil.m144301a((Context) this.f85789d.mo122543g()) || !(tag instanceof String) || !TextUtils.equals((String) tag, aVar.mo121696d())) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (aVar.mo121695c()) {
                    drawable = mediaMessageViewHolder.mImageView.getDrawable();
                }
                if (drawable == null) {
                    drawable = C34336c.m133131b(mo122719d(), i, i2, 0);
                }
                GradientDrawable a2 = C34336c.m133121a(mo122719d(), i, i2, 0);
                if (this.f85789d.mo122546j()) {
                    scene = Scene.SecretChat;
                } else if (this.f85789d.mo122558v()) {
                    scene = Scene.Thread;
                } else {
                    scene = Scene.Chat;
                }
                C34336c.m133127a(mo122719d(), mediaMessageViewHolder.mImageView, b, new LoadParams().mo105413a(i).mo105422b(i2).mo105414a(drawable).mo105423b(a2).mo105416a(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(scene).mo105398a(ListenerParams.FromType.MEDIA).mo105401a(false).mo105405b(false).mo105395a(i).mo105403b(i2).mo105404b(b.getKey()).mo105406c(TextUtils.equals(b.getKey(), origin.getKey())).mo105402a()));
                mediaMessageViewHolder.mImageView.setTag(R.id.chat_window_image_cid, aVar.mo121696d());
            }
        }
        if (this.f85668i) {
            mediaMessageViewHolder.mContentView.setRadius(this.f85666g);
            mediaMessageViewHolder.mContentView.setBorderWidth(this.f85667h);
        } else if (!TextUtils.isEmpty(aVar.mo121700h()) || aVar.ah()) {
            mediaMessageViewHolder.mContentView.setRadius(4.0f);
            mediaMessageViewHolder.mContentView.setBorderWidth(BitmapDescriptorFactory.HUE_RED);
        } else {
            float[] a3 = MessageCellUtils.m133195a(aVar);
            mediaMessageViewHolder.mContentView.mo89662a(a3[0], a3[1], a3[2], a3[3]);
            mediaMessageViewHolder.mContentView.setBorderWidth(0.5f);
        }
        mediaMessageViewHolder.mDuration.setText(C26279i.m95149a((int) g.mo121864g()));
    }

    public MediaMessageCell(AbstractC33342d dVar, float f, float f2, boolean z, AbstractC33302l lVar) {
        super(dVar);
        this.f85669j = C29990c.m110930b().mo134597y();
        this.f85662a = lVar;
        this.f85663b = UIUtils.dp2px(mo122719d(), 120.0f);
        this.f85664c = mo122709f();
        this.f85665e = mo122708e();
        this.f85666g = f;
        this.f85667h = f2;
        this.f85668i = z;
    }
}
