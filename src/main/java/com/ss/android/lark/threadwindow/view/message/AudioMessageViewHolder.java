package com.ss.android.lark.threadwindow.view.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class AudioMessageViewHolder extends AbstractC59010e {

    /* renamed from: a */
    public View f138955a;

    /* renamed from: b */
    public TextView f138956b;

    /* renamed from: c */
    public View f138957c;

    /* renamed from: d */
    public TextView f138958d;
    @BindView(7232)
    public View mAudioView;
    @BindView(7634)
    public TextView mEditedTv;
    @BindView(8418)
    public PlayControlBar mPlayControlBar;
    @BindView(8506)
    public TextView mRecognizedFlag;
    @BindView(8507)
    public TextView mRecognizedTv;
    @BindView(8963)
    public ViewStub mTranslateStub;
    @BindView(9214)
    public ImageView mUnreadTipsIv;

    /* renamed from: a */
    public AbstractC58321a mo191508a() {
        return this.mPlayControlBar;
    }

    /* renamed from: b */
    public View mo191516b() {
        return this.mPlayControlBar;
    }

    /* renamed from: a */
    public void mo191515a(boolean z) {
        this.mRecognizedFlag.setVisibility(z ? 0 : 8);
    }

    /* renamed from: a */
    public void mo191509a(int i) {
        this.mAudioView.setMinimumWidth(i);
    }

    /* renamed from: b */
    public void mo191517b(int i) {
        this.mPlayControlBar.setDurationTvColor(i);
    }

    /* renamed from: e */
    public void mo191522e(boolean z) {
        this.mPlayControlBar.setDisabled(z);
    }

    /* renamed from: b */
    public void mo191518b(Drawable drawable) {
        this.mAudioView.setBackground(drawable);
    }

    /* renamed from: c */
    public void mo191520c(boolean z) {
        int i;
        ImageView imageView = this.mUnreadTipsIv;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public void mo191511a(Drawable drawable) {
        this.mPlayControlBar.setPlayBtnDrawable(drawable);
    }

    /* renamed from: b */
    public void mo191519b(boolean z) {
        int i;
        TextView textView = this.mRecognizedTv;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    private void m219003a(Context context) {
        int c = LKUIDisplayManager.m91881c(context, 12);
        C25649b.m91857a(this.mEditedTv, LarkFont.HEADLINE);
        C25649b.m91857a(this.mRecognizedTv, LarkFont.TITLE4);
        C25649b.m91857a(this.mRecognizedFlag, LarkFont.CAPTION0);
        Drawable drawable = UIUtils.getDrawable(context, R.drawable.ic_svg_chat_audio_message_text_flag_gray);
        drawable.setBounds(0, 0, c, c);
        this.mRecognizedFlag.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: d */
    public void mo191521d(boolean z) {
        if (z) {
            if (this.f138955a == null) {
                View inflate = this.mTranslateStub.inflate();
                this.f138955a = inflate;
                this.f138956b = (TextView) inflate.findViewById(R.id.translate_content);
                this.f138957c = this.f138955a.findViewById(R.id.translate_divider);
                this.f138958d = (TextView) this.f138955a.findViewById(R.id.translate_label);
                if (!DesktopUtil.m144307b()) {
                    C25649b.m91857a(this.f138958d, LarkFont.CAPTION0);
                    C25649b.m91857a(this.f138956b, LarkFont.TITLE4);
                }
            }
            this.f138955a.setVisibility(0);
            return;
        }
        View view = this.f138955a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo191512a(View.OnClickListener onClickListener) {
        this.mAudioView.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo191513a(View.OnLongClickListener onLongClickListener) {
        this.mAudioView.setOnLongClickListener(onLongClickListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
    /* renamed from: a */
    public void mo122652a(View view) {
        ButterKnife.bind(this, view);
        this.mRecognizedFlag.setText(R.string.Lark_Chat_AudioConvertToTextSuccess);
        m219003a(view.getContext());
    }

    /* renamed from: a */
    public void mo191514a(Runnable runnable) {
        this.mAudioView.post(runnable);
    }

    /* renamed from: a */
    public TextView mo191507a(boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = 8;
        if (!z) {
            this.mEditedTv.setVisibility(8);
            this.mRecognizedTv.setVisibility(8);
            this.mRecognizedFlag.setVisibility(8);
        } else {
            TextView textView = this.mEditedTv;
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.mRecognizedTv;
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            TextView textView3 = this.mRecognizedFlag;
            if (!z2) {
                i3 = 0;
            }
            textView3.setVisibility(i3);
        }
        if (z2) {
            return this.mEditedTv;
        }
        return this.mRecognizedTv;
    }

    /* renamed from: a */
    public void mo191510a(int i, int i2, int i3, int i4) {
        this.mAudioView.setPadding(i, i2, i3, i4);
    }
}
