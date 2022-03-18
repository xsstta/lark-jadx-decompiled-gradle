package com.ss.android.lark.keyboard.plugin.tool.face.p2084a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.d */
public class C40931d extends RecyclerView.Adapter<C40940e> {

    /* renamed from: a */
    public List<Sticker> f104036a = new ArrayList();

    /* renamed from: b */
    public EmojiPreviewPopWindow f104037b;

    /* renamed from: c */
    public SparseBooleanArray f104038c = new SparseBooleanArray();

    /* renamed from: d */
    Handler f104039d = new Handler() {
        /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.HandlerC409321 */

        public void handleMessage(Message message) {
            int i = message.getData().getInt("key_sticker_index");
            C40931d.this.f104038c.put(i, true);
            C40931d.this.mo147581a((View) message.obj, i);
        }
    };

    /* renamed from: e */
    public AbstractC40938c f104040e;

    /* renamed from: f */
    public AbstractC40936a f104041f;

    /* renamed from: g */
    private Context f104042g;

    /* renamed from: h */
    private AbstractC40937b f104043h;

    /* renamed from: i */
    private AbstractC40939d f104044i;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.d$a */
    public interface AbstractC40936a {
        void onSelectedFace(C40964l lVar);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.d$b */
    public interface AbstractC40937b {
        void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.d$c */
    public interface AbstractC40938c {
        C40964l getLocalStickerFileInfo(String str, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.d$d */
    public interface AbstractC40939d {
        void onGlideLoad(String str);
    }

    /* renamed from: a */
    public void onBindViewHolder(final C40940e eVar, int i) {
        final Sticker a = m162087a(i);
        if (a == null) {
            Log.m165383e("StickerPageAdapter", "onBindViewHolder called. sticker is null.");
            return;
        }
        eVar.f104054b.setText(a.getDesc());
        Context context = this.f104042g;
        int dp2px = UIUtils.dp2px(context, DesktopUtil.m144301a(context) ? (float) DesktopUtil.m144293a(50) : 50.0f);
        if (this.f104043h != null) {
            Log.m165379d("StickerPage", "onBindViewHolder " + a.getThumbnailImageKey());
            AbstractC40939d dVar = this.f104044i;
            if (dVar != null) {
                dVar.onGlideLoad(a.getThumbnailImageKey());
            }
            this.f104043h.loadSticker(this.f104042g, true, dp2px, dp2px, a.getThumbnailImageKey(), eVar.f104053a, -2, R.drawable.kb_ic_icon_sticker_item_default, a.getStickerSetId());
        } else {
            Log.m165383e("StickerPageAdapter", "onBindViewHolder called. GlideStickerLoader is null.");
        }
        eVar.f104053a.setOnTouchListener(new View.OnTouchListener(eVar) {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$d$SBtg7MxpKWXVLKvFnm26ZpY_Uus */
            public final /* synthetic */ C40931d.C40940e f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C40931d.lambda$SBtg7MxpKWXVLKvFnm26ZpY_Uus(C40931d.this, this.f$1, view, motionEvent);
            }
        });
        eVar.f104053a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.C409332 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C57865c.m224574a(new C57865c.AbstractC57873d(a) {
                    /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$d$2$4oz8gRF8be4aSai_tDiOCARbfs */
                    public final /* synthetic */ Sticker f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C40931d.C409332.m270669lambda$4oz8gRF8be4aSai_tDiOCARbfs(C40931d.C409332.this, this.f$1);
                    }
                }, new C57865c.AbstractC57871b() {
                    /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$d$2$OYOj1Oeh9r0nsS4VOgaYf71nSw */

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                    public final void consume(Object obj) {
                        C40931d.C409332.m270670lambda$OYOj1Oeh9r0nsS4VOgaYf71nSw(C40931d.C409332.this, (C40964l) obj);
                    }
                });
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m162103a(C40964l lVar) {
                if (C40931d.this.f104041f == null) {
                    Log.m165383e("StickerPageAdapter", "onBindViewHolder called. mStickerSelectedListener is null.");
                } else {
                    C40931d.this.f104041f.onSelectedFace(lVar);
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ C40964l m162102a(Sticker sticker) {
                if (C40931d.this.f104040e == null) {
                    Log.m165383e("StickerPageAdapter", "onBindViewHolder called. mLocalStickerFileInfoProvider is null.");
                    return null;
                }
                C40964l localStickerFileInfo = C40931d.this.f104040e.getLocalStickerFileInfo(sticker.getOriginImageKey(), sticker.getOriginImageWidth(), sticker.getOriginImageHeight());
                if (localStickerFileInfo == null) {
                    Log.m165383e("StickerPageAdapter", "onBindViewHolder called. fileInfo is null.");
                    return null;
                }
                localStickerFileInfo.mo147623b(sticker.getStickerId());
                localStickerFileInfo.mo147621a(sticker.getStickerSetId());
                return localStickerFileInfo;
            }
        });
        if (DesktopUtil.m144301a(this.f104042g)) {
            eVar.f104053a.setOnHoverListener(new View.OnHoverListener() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.View$OnHoverListenerC409343 */

                public boolean onHover(final View view, MotionEvent motionEvent) {
                    final int layoutPosition = eVar.getLayoutPosition();
                    if (layoutPosition <= -1 || layoutPosition >= C40931d.this.f104036a.size()) {
                        return true;
                    }
                    int action = motionEvent.getAction();
                    if (action == 9) {
                        C40931d.this.f104038c.put(layoutPosition, true);
                        UICallbackExecutor.executeDelayed(new Runnable() {
                            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.View$OnHoverListenerC409343.RunnableC409351 */

                            public void run() {
                                if (C40931d.this.f104038c.get(layoutPosition)) {
                                    C40931d.this.mo147581a(view, layoutPosition);
                                }
                            }
                        }, 500);
                    } else if (action == 10 && C40931d.this.f104038c.get(layoutPosition)) {
                        C40931d.this.f104037b.dismiss();
                        C40931d.this.f104038c.put(layoutPosition, false);
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo147587a(List<Sticker> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f104036a.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo147580a() {
        this.f104043h = null;
        this.f104040e = null;
        this.f104041f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104036a.size();
    }

    /* renamed from: b */
    private static int m162090b() {
        if (DesktopUtil.m144307b()) {
            return 56;
        }
        return 50;
    }

    /* renamed from: c */
    private static int m162092c() {
        if (DesktopUtil.m144307b()) {
            return 5;
        }
        return 3;
    }

    /* renamed from: a */
    public void mo147585a(AbstractC40939d dVar) {
        this.f104044i = dVar;
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.d$e */
    public static class C40940e extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f104053a;

        /* renamed from: b */
        public TextView f104054b;

        public C40940e(View view) {
            super(view);
            this.f104053a = (ImageView) view.findViewById(R.id.display_image);
            this.f104054b = (TextView) view.findViewById(R.id.itemText);
        }
    }

    /* renamed from: a */
    private Sticker m162087a(int i) {
        if (i >= this.f104036a.size() || i < 0) {
            return null;
        }
        return this.f104036a.get(i);
    }

    /* renamed from: b */
    private int m162091b(int i) {
        if (DesktopUtil.m144307b()) {
            return 1;
        }
        int b = i % C40941e.m162111b();
        if (b == 0) {
            return 0;
        }
        if (b == m162092c()) {
            return 2;
        }
        return 1;
    }

    public C40931d(Context context) {
        this.f104042g = context;
        EmojiPreviewPopWindow emojiPreviewPopWindow = new EmojiPreviewPopWindow(this.f104042g, true);
        this.f104037b = emojiPreviewPopWindow;
        emojiPreviewPopWindow.mo199780a(new EmojiPreviewPopWindow.AbstractC58928a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$d$ZIcglgnm0RZlHS8pY9Zti4sbRGg */

            @Override // com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow.AbstractC58928a
            public final void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
                C40931d.lambda$ZIcglgnm0RZlHS8pY9Zti4sbRGg(C40931d.this, context, z, i, i2, str, imageView, i3, i4, str2);
            }
        });
    }

    /* renamed from: a */
    private View m162086a(Context context) {
        int dp2px = UIUtils.dp2px(context, (float) m162090b());
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        if (DesktopUtil.m144307b()) {
            int dp2px2 = UIUtils.dp2px(context, 4.0f);
            marginLayoutParams.setMargins(dp2px2, UIUtils.dp2px(context, 12.0f), dp2px2, UIUtils.dp2px(context, 4.0f));
        }
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, UIUtils.dp2px(context, 12.0f), 0, 0);
        linearLayout.setLayoutParams(marginLayoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(dp2px, dp2px);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.display_image);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        imageView.setImageDrawable(UIUtils.getDrawable(context, R.drawable.kb_ic_icon_sticker_item_default));
        layoutParams2.gravity = 17;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        frameLayout.addView(imageView);
        View view = new View(context);
        view.setBackgroundColor(context.getResources().getColor(R.color.fill_img_mask));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout, layoutParams);
        TextView textView = new TextView(context);
        textView.setId(R.id.itemText);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        if (DesktopUtil.m144307b()) {
            textView.setTextSize(10.0f);
        } else {
            int dp2px3 = UIUtils.dp2px(context, 10.0f);
            layoutParams3.setMargins(dp2px3, UIUtils.dp2px(context, 4.0f), dp2px3, 0);
        }
        layoutParams3.gravity = 17;
        textView.setGravity(17);
        textView.setTextColor(UIUtils.getColor(context, R.color.text_caption));
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(12.0f);
        linearLayout.addView(textView, layoutParams3);
        return linearLayout;
    }

    /* renamed from: a */
    public void mo147582a(AbstractC40936a aVar) {
        if (this.f104041f == null) {
            this.f104041f = aVar;
        }
    }

    /* renamed from: a */
    public void mo147583a(AbstractC40937b bVar) {
        if (this.f104043h == null) {
            this.f104043h = bVar;
        }
    }

    /* renamed from: a */
    public void mo147584a(AbstractC40938c cVar) {
        if (this.f104040e == null) {
            this.f104040e = cVar;
        }
    }

    /* renamed from: a */
    public C40940e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C40940e(m162086a(viewGroup.getContext()));
    }

    /* renamed from: a */
    public void mo147581a(View view, int i) {
        Sticker a = m162087a(i);
        if (a != null) {
            EmojiPreviewPopWindow.C58929b bVar = new EmojiPreviewPopWindow.C58929b(view, a.getOriginImageKey());
            bVar.mo199785b(a.getDesc());
            bVar.mo199782a(m162091b(i));
            bVar.mo199783a(a.getStickerSetId());
            this.f104037b.mo199781a(bVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m162089a(C40940e eVar, View view, MotionEvent motionEvent) {
        int layoutPosition = eVar.getLayoutPosition();
        if (layoutPosition <= -1 || layoutPosition >= this.f104036a.size()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f104038c.put(layoutPosition, false);
            Message message = new Message();
            message.what = 1;
            Bundle bundle = new Bundle();
            bundle.putInt("key_sticker_index", layoutPosition);
            message.setData(bundle);
            message.obj = eVar.f104053a;
            this.f104039d.sendMessageDelayed(message, 500);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            this.f104039d.removeMessages(1);
            if (!this.f104038c.get(layoutPosition)) {
                return false;
            }
            this.f104037b.dismiss();
            this.f104038c.put(layoutPosition, false);
            return true;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162088a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        AbstractC40937b bVar = this.f104043h;
        if (bVar == null) {
            Log.m165383e("StickerPageAdapter", "EmojiPreviewPopWindow setStickerLoader called. but GlideStickerLoader is null.");
        } else {
            bVar.loadSticker(context, z, i, i2, str, imageView, -2, i4, str2);
        }
    }
}
