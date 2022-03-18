package com.ss.android.lark.widget.popwindow;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import pl.droidsonroids.gif.GifImageView;

public class EmojiPreviewPopWindow extends BasePopupWindow {

    /* renamed from: a */
    private Context f145898a;

    /* renamed from: b */
    private View f145899b;

    /* renamed from: c */
    private View f145900c;

    /* renamed from: d */
    private ImageView f145901d;

    /* renamed from: e */
    private TextView f145902e;

    /* renamed from: f */
    private AbstractC58928a f145903f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    /* renamed from: com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow$a */
    public interface AbstractC58928a {
        void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2);
    }

    /* renamed from: com.ss.android.lark.widget.popwindow.EmojiPreviewPopWindow$b */
    public static class C58929b {

        /* renamed from: a */
        private View f145904a;

        /* renamed from: b */
        private String f145905b;

        /* renamed from: c */
        private String f145906c;

        /* renamed from: d */
        private int f145907d;

        /* renamed from: e */
        private String f145908e;

        /* renamed from: c */
        public View mo199787c() {
            return this.f145904a;
        }

        /* renamed from: d */
        public String mo199788d() {
            return this.f145905b;
        }

        /* renamed from: e */
        public String mo199789e() {
            return this.f145906c;
        }

        /* renamed from: f */
        public String mo199790f() {
            return this.f145908e;
        }

        /* renamed from: a */
        public boolean mo199784a() {
            if (this.f145907d == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo199786b() {
            if (this.f145907d == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo199782a(int i) {
            this.f145907d = i;
        }

        /* renamed from: b */
        public void mo199785b(String str) {
            this.f145908e = str;
        }

        /* renamed from: a */
        public void mo199783a(String str) {
            this.f145906c = str;
        }

        public C58929b(View view, String str) {
            this.f145904a = view;
            this.f145905b = str;
        }
    }

    /* renamed from: a */
    public void mo99354a() {
        this.f145898a = null;
        this.f145899b = null;
        this.f145901d = null;
        this.f145903f = null;
    }

    /* renamed from: a */
    public void mo199780a(AbstractC58928a aVar) {
        this.f145903f = aVar;
    }

    /* renamed from: a */
    public void mo199781a(C58929b bVar) {
        View c;
        if (bVar != null && (c = bVar.mo199787c()) != null) {
            String f = bVar.mo199790f();
            if (TextUtils.isEmpty(f)) {
                this.f145902e.setVisibility(8);
            } else {
                this.f145902e.setVisibility(0);
                this.f145902e.setText(f);
            }
            if (bVar.mo199784a()) {
                this.f145900c.setBackgroundResource(R.drawable.left_emoji_preview_bg);
                this.f145899b.setPadding(this.f145898a.getResources().getDimensionPixelSize(R.dimen.dp_7), 0, 0, 0);
            } else if (bVar.mo199786b()) {
                this.f145900c.setBackgroundResource(R.drawable.right_emoji_preview_bg);
                this.f145899b.setPadding(0, 0, this.f145898a.getResources().getDimensionPixelSize(R.dimen.dp_7), 0);
            } else {
                this.f145900c.setBackgroundResource(R.drawable.center_emoji_preview_bg);
                this.f145899b.setPadding(0, 0, 0, 0);
            }
            this.f145900c.setBackgroundTintList(ColorStateList.valueOf(this.f145898a.getResources().getColor(R.color.bg_float)));
            mo199779a(c, bVar.mo199788d(), bVar.mo199789e());
        }
    }

    public EmojiPreviewPopWindow(Context context, boolean z) {
        super(context);
        this.f145898a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.kb_emoji_layout_preview, (ViewGroup) null);
        this.f145899b = inflate;
        this.f145900c = inflate.findViewById(R.id.preview_bg_ll);
        ImageView imageView = (ImageView) this.f145899b.findViewById(R.id.preview_iv_normal);
        GifImageView gifImageView = (GifImageView) this.f145899b.findViewById(R.id.preview_iv);
        Log.m165389i("EmojiPreviewPopWindow", "remove gifImageView enable = " + z);
        if (z) {
            this.f145901d = imageView;
            gifImageView.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            this.f145901d = gifImageView;
            gifImageView.setVisibility(0);
            imageView.setVisibility(8);
        }
        this.f145902e = (TextView) this.f145899b.findViewById(R.id.content_tv);
        setContentView(this.f145899b);
        setWidth(-2);
        setHeight(-2);
        this.f145899b.setFocusable(true);
        this.f145899b.setFocusableInTouchMode(true);
        setInputMethodMode(1);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        if (DesktopUtil.m144301a(this.f145898a)) {
            setClippingEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo199779a(View view, String str, String str2) {
        int i;
        if (view != null) {
            int[] iArr = new int[2];
            if (!DesktopUtil.m144301a(this.f145898a)) {
                view.getLocationOnScreen(iArr);
            } else {
                view.getLocationInWindow(iArr);
            }
            boolean a = DesktopUtil.m144301a(this.f145898a);
            int i2 = SmEvents.EVENT_NO;
            if (a) {
                i = DesktopUtil.m144293a((int) SmEvents.EVENT_NO);
            } else {
                i = SmEvents.EVENT_NO;
            }
            if (DesktopUtil.m144301a(this.f145898a)) {
                i2 = DesktopUtil.m144293a((int) SmEvents.EVENT_NO);
            }
            AbstractC58928a aVar = this.f145903f;
            Context context = this.f145898a;
            aVar.loadSticker(context, true, UIUtils.dp2px(context, (float) i), UIUtils.dp2px(this.f145898a, (float) i2), str, this.f145901d, R.drawable.kb_emoji_load_holder, R.drawable.common_failed_chat_picture, str2);
            this.f145899b.measure(0, 0);
            if (DesktopUtil.m144301a(this.f145898a) && iArr[1] < 0) {
                iArr[1] = 0;
            }
            showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (this.f145899b.getMeasuredWidth() / 2), (iArr[1] - this.f145899b.getMeasuredHeight()) + UIUtils.dp2px(this.f145898a, 4.0f));
        }
    }
}
