package com.ss.android.lark.keyboard.plugin.tool.face.p2084a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.a */
public class C40914a extends RecyclerView.Adapter<C40922d> {

    /* renamed from: a */
    public List<Sticker> f103998a = new ArrayList();

    /* renamed from: b */
    public SparseBooleanArray f103999b = new SparseBooleanArray();

    /* renamed from: c */
    public AbstractC40921c f104000c;

    /* renamed from: d */
    public AbstractC40919a f104001d;

    /* renamed from: e */
    private Context f104002e;

    /* renamed from: f */
    private EmojiPreviewPopWindow f104003f;

    /* renamed from: g */
    private Handler f104004g = new Handler() {
        /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.HandlerC409151 */

        public void handleMessage(Message message) {
            int i = message.getData().getInt("key_sticker_index");
            C40914a.this.f103999b.put(i, true);
            C40914a.this.mo147559a((View) message.obj, i);
        }
    };

    /* renamed from: h */
    private AbstractC40920b f104005h;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.a$a */
    public interface AbstractC40919a {
        /* renamed from: a */
        void mo147566a();

        /* renamed from: a */
        void mo147567a(C40964l lVar);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.a$b */
    public interface AbstractC40920b {
        void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.a$c */
    public interface AbstractC40921c {
        C40964l getLocalStickerFileInfo(String str, int i, int i2);
    }

    /* renamed from: a */
    public void mo147564a(final List<Sticker> list) {
        if (!CollectionUtils.isEmpty(list)) {
            m162024b();
            C1374g.m6297a(new C1374g.AbstractC1376a() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.C409162 */

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: b */
                public int mo7382b() {
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: a */
                public int mo7380a() {
                    return C40914a.this.f103998a.size();
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: a */
                public boolean mo7381a(int i, int i2) {
                    return C40914a.this.f103998a.get(i).isItemSame((Sticker) list.get(i2));
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: b */
                public boolean mo7383b(int i, int i2) {
                    return C40914a.this.f103998a.get(i).isContentSame((Sticker) list.get(i2));
                }
            }).mo7412a(this);
            this.f103998a.clear();
            this.f103998a.addAll(list);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C40922d dVar, int i) {
        final Sticker a = m162019a(i);
        if (a == null) {
            Log.m165383e("FaceNewAdapter", "onBindViewHolder called. sticker is null.");
            return;
        }
        dVar.f104014c.setVisibility(8);
        if (a.getImageSet() != null) {
            int dp2px = UIUtils.dp2px(this.f104002e, (float) m162027d());
            AbstractC40920b bVar = this.f104005h;
            if (bVar != null) {
                bVar.loadSticker(this.f104002e, true, dp2px, dp2px, a.getImageKey(), dVar.f104012a, -2, R.drawable.kb_emoji_load_holder);
            } else {
                Log.m165383e("FaceNewAdapter", "onBindViewHolder called. GlideStickerLoader is null.");
            }
            dVar.f104012a.setOnTouchListener(new View.OnTouchListener(dVar) {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$a$0J98laH1pKINtjohGy0uItI84c */
                public final /* synthetic */ C40914a.C40922d f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C40914a.m270664lambda$0J98laH1pKINtjohGy0uItI84c(C40914a.this, this.f$1, view, motionEvent);
                }
            });
            dVar.f104012a.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.C409184 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    C57865c.m224574a(new C57865c.AbstractC57873d(a) {
                        /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$a$4$zPrJhVDzRzij0_EJs231mFiusIs */
                        public final /* synthetic */ Sticker f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                        public final Object produce() {
                            return C40914a.C409184.lambda$zPrJhVDzRzij0_EJs231mFiusIs(C40914a.C409184.this, this.f$1);
                        }
                    }, new C57865c.AbstractC57871b() {
                        /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$a$4$fSOMHijcDCf768g5wbuGlMBlQ */

                        @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                        public final void consume(Object obj) {
                            C40914a.C409184.m270666lambda$fSOMHijcDCf768g5wbuGlMBlQ(C40914a.C409184.this, (C40964l) obj);
                        }
                    });
                }

                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m162041a(C40964l lVar) {
                    if (C40914a.this.f104001d == null) {
                        Log.m165383e("FaceNewAdapter", "onBindViewHolder called. mFaceSelectedListener is null.");
                    } else {
                        C40914a.this.f104001d.mo147567a(lVar);
                    }
                }

                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ C40964l m162040a(Sticker sticker) {
                    if (C40914a.this.f104000c == null) {
                        Log.m165383e("FaceNewAdapter", "onBindViewHolder called. mLocalStickerFileInfoProvider is null.");
                        return null;
                    }
                    C40964l localStickerFileInfo = C40914a.this.f104000c.getLocalStickerFileInfo(sticker.getOriginImageKey(), sticker.getOriginImageWidth(), sticker.getOriginImageHeight());
                    if (localStickerFileInfo == null) {
                        Log.m165383e("FaceNewAdapter", "onBindViewHolder called. fileInfo is null.");
                        return null;
                    }
                    localStickerFileInfo.mo147621a(sticker.getStickerSetId());
                    localStickerFileInfo.mo147623b(sticker.getStickerId());
                    return localStickerFileInfo;
                }
            });
            if (DesktopUtil.m144301a(this.f104002e)) {
                dVar.f104012a.setOnHoverListener(new View.OnHoverListener(dVar) {
                    /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$a$I6nmqX1uxCUTm63uQLLpur2TdR0 */
                    public final /* synthetic */ C40914a.C40922d f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final boolean onHover(View view, MotionEvent motionEvent) {
                        return C40914a.lambda$I6nmqX1uxCUTm63uQLLpur2TdR0(C40914a.this, this.f$1, view, motionEvent);
                    }
                });
            }
        } else if ("-1".equals(a.getStickerId())) {
            dVar.f104012a.setImageDrawable(null);
            dVar.f104014c.setVisibility(0);
        } else {
            ImageLoader.clear(dVar.f104012a);
            dVar.f104012a.setImageDrawable(UIHelper.getDrawable(R.drawable.ic_icon_empty_sticker_add));
            dVar.f104014c.setVisibility(8);
            dVar.f104012a.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.C409173 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (C40914a.this.f104001d != null) {
                        C40914a.this.f104001d.mo147566a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo147562a(AbstractC40921c cVar) {
        if (this.f104000c == null) {
            this.f104000c = cVar;
        }
    }

    /* renamed from: a */
    public void mo147558a() {
        this.f104001d = null;
        this.f104005h = null;
        this.f104000c = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f103998a.size();
    }

    /* renamed from: c */
    private static int m162026c() {
        if (DesktopUtil.m144307b()) {
            return 5;
        }
        return 3;
    }

    /* renamed from: d */
    private static int m162027d() {
        if (DesktopUtil.m144307b()) {
            return 56;
        }
        return 74;
    }

    /* renamed from: b */
    private void m162024b() {
        if (this.f104003f != null) {
            Log.m165389i("FaceNewAdapter", "newEmojiPreviewPopWindow called. destroy");
            this.f104003f.dismiss();
            this.f104003f.mo99354a();
            this.f104003f = null;
        }
        EmojiPreviewPopWindow emojiPreviewPopWindow = new EmojiPreviewPopWindow(this.f104002e, true);
        this.f104003f = emojiPreviewPopWindow;
        emojiPreviewPopWindow.mo199780a(new EmojiPreviewPopWindow.AbstractC58928a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$a$23sLsqHf9kDrfDqJR0TPzumIDs */

            @Override // com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow.AbstractC58928a
            public final void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
                C40914a.m270665lambda$23sLsqHf9kDrfDqJR0TPzumIDs(C40914a.this, context, z, i, i2, str, imageView, i3, i4, str2);
            }
        });
    }

    public C40914a(Context context) {
        this.f104002e = context;
    }

    /* renamed from: a */
    private Sticker m162019a(int i) {
        if (i >= this.f103998a.size() || i < 0) {
            return null;
        }
        return this.f103998a.get(i);
    }

    /* renamed from: b */
    private int m162023b(int i) {
        int g = i % C40923b.m162054g();
        if (g == 0) {
            return 0;
        }
        if (g == m162026c()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.a$d */
    public static class C40922d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f104012a;

        /* renamed from: b */
        public View f104013b;

        /* renamed from: c */
        public ImageView f104014c;

        public C40922d(View view) {
            super(view);
            this.f104012a = (ImageView) view.findViewById(R.id.display_image);
            this.f104013b = view.findViewById(R.id.image_mask);
            this.f104014c = (ImageView) view.findViewById(R.id.loading_image);
        }
    }

    /* renamed from: a */
    private View m162018a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        if (DesktopUtil.m144307b()) {
            int dp2px = UIUtils.dp2px(context, 4.0f);
            int dp2px2 = UIUtils.dp2px(context, 6.0f);
            marginLayoutParams.setMargins(dp2px, dp2px2, dp2px, dp2px2);
        } else {
            int dp2px3 = UIUtils.dp2px(context, 15.0f);
            marginLayoutParams.setMargins(dp2px3, dp2px3, dp2px3, dp2px3);
        }
        int dp2px4 = UIUtils.dp2px(context, (float) m162027d());
        relativeLayout.setGravity(17);
        relativeLayout.setLayoutParams(marginLayoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.display_image);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dp2px4, dp2px4);
        layoutParams.addRule(13, -1);
        imageView.setContentDescription(null);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        relativeLayout.addView(imageView, layoutParams);
        View view = new View(context);
        view.setId(R.id.image_mask);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dp2px4, dp2px4);
        layoutParams2.addRule(13, -1);
        relativeLayout.addView(view, layoutParams2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.loading_image);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(dp2px4, dp2px4);
        layoutParams3.addRule(13, -1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageDrawable(UIUtils.getDrawable(context, R.drawable.kb_emoji_loading_im));
        imageView2.setVisibility(8);
        relativeLayout.addView(imageView2, layoutParams3);
        return relativeLayout;
    }

    /* renamed from: a */
    public void mo147560a(AbstractC40919a aVar) {
        if (this.f104001d == null) {
            this.f104001d = aVar;
        }
    }

    /* renamed from: a */
    public void mo147561a(AbstractC40920b bVar) {
        if (this.f104005h == null) {
            this.f104005h = bVar;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162020a(int i, View view) {
        if (this.f103999b.get(i)) {
            mo147559a(view, i);
        }
    }

    /* renamed from: a */
    public C40922d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C40922d(m162018a(this.f104002e));
    }

    /* renamed from: a */
    public void mo147559a(View view, int i) {
        Sticker a = m162019a(i);
        if (a != null) {
            EmojiPreviewPopWindow.C58929b bVar = new EmojiPreviewPopWindow.C58929b(view, a.getOriginImageKey());
            bVar.mo199785b(a.getDesc());
            bVar.mo199782a(m162023b(i));
            bVar.mo199783a(a.getStickerSetId());
            this.f104003f.mo199781a(bVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m162022a(C40922d dVar, View view, MotionEvent motionEvent) {
        int layoutPosition = dVar.getLayoutPosition();
        if (layoutPosition <= -1 || layoutPosition >= this.f103998a.size()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 9) {
            this.f103999b.put(layoutPosition, true);
            UICallbackExecutor.executeDelayed(new Runnable(layoutPosition, view) {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$a$9LoCsM8tqb8DmIqEdN6Nfo8kzAY */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ View f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C40914a.lambda$9LoCsM8tqb8DmIqEdN6Nfo8kzAY(C40914a.this, this.f$1, this.f$2);
                }
            }, 500);
        } else if (action == 10 && this.f103999b.get(layoutPosition)) {
            this.f104003f.dismiss();
            this.f103999b.put(layoutPosition, false);
        }
        return false;
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ boolean m162025b(C40922d dVar, View view, MotionEvent motionEvent) {
        int layoutPosition = dVar.getLayoutPosition();
        if (layoutPosition <= -1 || layoutPosition >= this.f103998a.size()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f103999b.put(layoutPosition, false);
            Message message = new Message();
            message.what = 1;
            Bundle bundle = new Bundle();
            bundle.putInt("key_sticker_index", layoutPosition);
            message.setData(bundle);
            message.obj = dVar.f104012a;
            this.f104004g.sendMessageDelayed(message, 500);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.f104004g.removeMessages(1);
            if (!this.f103999b.get(layoutPosition)) {
                return false;
            }
            this.f104003f.dismiss();
            this.f103999b.put(layoutPosition, false);
            return true;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162021a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        AbstractC40920b bVar = this.f104005h;
        if (bVar == null) {
            Log.m165383e("FaceNewAdapter", "EmojiPreviewPopWindow setStickerLoader called. but GlideStickerLoader is null.");
        } else {
            bVar.loadSticker(context, z, i, i2, str, imageView, -2, i4);
        }
    }
}
