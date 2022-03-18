package com.ss.android.lark.favorite.common.audio;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.utils.C34332b;
import com.ss.android.lark.chatbase.view.C34443a;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.AudioWaveBar;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

/* renamed from: com.ss.android.lark.favorite.common.audio.a */
public class C37099a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: c */
    private static boolean f95345c;

    /* renamed from: a */
    public AudioWaveBar f95346a;

    /* renamed from: b */
    public BasePopupWindow f95347b;

    /* renamed from: d */
    private Context f95348d;

    /* renamed from: e */
    private int f95349e = UIHelper.dp2px(16.0f);

    public C37099a(Context context) {
        this.f95348d = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m146314a(AudioMessageNewHolder audioMessageNewHolder, View view) {
        audioMessageNewHolder.mPlayControlBar.mo136738e();
    }

    /* renamed from: a */
    public void mo136747a(View view, boolean z) {
        if (this.f95346a == null || this.f95347b == null) {
            this.f95346a = new AudioWaveBar(this.f95348d);
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f95346a, -2, -2);
            this.f95347b = basePopupWindow;
            basePopupWindow.setOutsideTouchable(true);
        }
        C34443a.m133604a(this.f95348d, this.f95347b, view, z);
    }

    /* renamed from: a */
    public void mo136723a(final RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        boolean z;
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        final AudioMessageNewHolder audioMessageNewHolder = (AudioMessageNewHolder) itemListCommonHolder.mo136774a();
        final AudioContent audioContent = (AudioContent) favoriteMessageInfo.getSourceMessage().getContent();
        if (audioContent != null) {
            if (audioContent.isNeedHideText() || TextUtils.isEmpty(audioContent.getRecognizedText()) || !f95345c) {
                z = false;
            } else {
                z = true;
            }
            TextView a = audioMessageNewHolder.mo136733a(z, true);
            int a2 = C34443a.m133603a(audioContent.getDuration(), 140, 20);
            if (z) {
                a.setText(audioContent.getRecognizedText());
                a.setVisibility(0);
            } else {
                a.setVisibility(8);
            }
            audioMessageNewHolder.mAudioView.setMinimumWidth(a2);
            audioMessageNewHolder.mUnreadTipsIv.setVisibility(8);
            audioMessageNewHolder.mAudioView.setBackground(C33360a.m129151a());
            if (z) {
                audioMessageNewHolder.mAudioView.setPadding(UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f));
            } else {
                audioMessageNewHolder.mAudioView.setPadding(UIHelper.dp2px(10.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(10.0f), UIHelper.dp2px(8.0f));
            }
            $$Lambda$a$IENJTr3W8SqZ6hDkDYzve9Z8j4w r3 = new View.OnClickListener(favoriteMessageInfo) {
                /* class com.ss.android.lark.favorite.common.audio.$$Lambda$a$IENJTr3W8SqZ6hDkDYzve9Z8j4w */
                public final /* synthetic */ FavoriteMessageInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C37099a.lambda$IENJTr3W8SqZ6hDkDYzve9Z8j4w(ItemListCommonHolder.this, this.f$1, view);
                }
            };
            $$Lambda$a$UesXdX9scvTUUV71mLToYSoMCw r7 = new View.OnLongClickListener(favoriteMessageInfo) {
                /* class com.ss.android.lark.favorite.common.audio.$$Lambda$a$UesXdX9scvTUUV71mLToYSoMCw */
                public final /* synthetic */ FavoriteMessageInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final boolean onLongClick(View view) {
                    return C37099a.m270533lambda$UesXdX9scvTUUV71mLToYSoMCw(ItemListCommonHolder.this, this.f$1, view);
                }
            };
            if (i == 1) {
                itemListCommonHolder.f95392a.setOnClickListener(r3);
                itemListCommonHolder.f95392a.setOnLongClickListener(r7);
                itemListCommonHolder.mContentViewGroup.setOnClickListener(r3);
                itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r7);
                audioMessageNewHolder.mPlayControlBar.setOnLongClickListener(r7);
                a.setOnLongClickListener(r7);
                audioMessageNewHolder.mUnreadTipsIv.setOnLongClickListener(r7);
                audioMessageNewHolder.mAudioView.setOnLongClickListener(r7);
                audioMessageNewHolder.mAudioView.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.favorite.common.audio.$$Lambda$a$3pmjyahT8JfmN59_SPJrIPFwwK4 */

                    public final void onClick(View view) {
                        C37099a.lambda$3pmjyahT8JfmN59_SPJrIPFwwK4(AudioMessageNewHolder.this, view);
                    }
                });
                audioMessageNewHolder.mRootView.setBackgroundResource(R.drawable.chat_bubble_self_bg_selector);
                View view = audioMessageNewHolder.mRootView;
                int i2 = this.f95349e;
                view.setPadding(i2, i2, i2, i2);
            } else if (i == 2) {
                audioMessageNewHolder.mRootView.setBackground(null);
                audioMessageNewHolder.mRootView.setPadding(0, 0, 0, 0);
            }
            audioMessageNewHolder.mPlayControlBar.setDelegate(new PlayControlBar.AbstractC58473a() {
                /* class com.ss.android.lark.favorite.common.audio.C37099a.C371001 */

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: d */
                public void mo122662d() {
                    C36894a.m145605a().mo136204b();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: c */
                public void mo122661c() {
                    if (TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                        audioMessageNewHolder.mPlayControlBar.mo136735b();
                    } else {
                        audioMessageNewHolder.mPlayControlBar.mo136739f();
                    }
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: a */
                public void mo122658a() {
                    if (!TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                        C37099a.this.mo136747a((View) audioMessageNewHolder.mPlayControlBar, true);
                        C34332b.m133111a(audioContent);
                        C37099a.this.f95346a.setWaveBytes(audioContent.getAudioWaveBytes());
                        C37099a.this.f95346a.setDurationText(audioMessageNewHolder.mPlayControlBar.getDurationText());
                    }
                    C36894a.m145605a().mo136204b();
                    MessageHitPoint.m213274a();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: b */
                public void mo122660b() {
                    if (!TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                        C37099a.this.mo136747a((View) audioMessageNewHolder.mPlayControlBar, false);
                    }
                    audioContent.setProgress((int) audioMessageNewHolder.mPlayControlBar.getProgress());
                    if (C36894a.m145605a().mo136202a(audioContent.getLocalFilePath())) {
                        C36894a.m145605a().mo136199a(audioMessageNewHolder.mPlayControlBar.getProgress() / 100.0f);
                        C36894a.m145605a().mo136205c();
                        return;
                    }
                    mo122661c();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: a */
                public void mo122659a(int i) {
                    if (!(C37099a.this.f95347b == null || !C37099a.this.f95347b.isShowing() || C37099a.this.f95346a == null)) {
                        C37099a.this.f95346a.setProgress(i);
                        C37099a.this.f95346a.setDurationText(audioMessageNewHolder.mPlayControlBar.getDurationText());
                    }
                    audioContent.setProgress(i);
                }
            });
            AudioContent audioContent2 = (AudioContent) audioMessageNewHolder.mPlayControlBar.getTag(R.id.audio_play_message_tag);
            if (audioContent2 != null && audioContent2.getKey() != null && audioContent2.getKey().equals(audioContent.getKey()) && TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                audioContent.setLocalFilePath(audioContent2.getLocalFilePath());
                audioContent.setAudioWaveBytes(audioContent2.getAudioWaveBytes());
            }
            audioMessageNewHolder.mPlayControlBar.setTag(R.id.audio_play_message_tag, audioContent);
            C34443a.m133605a((AbstractC58321a) audioMessageNewHolder.mPlayControlBar, (C34443a.AbstractC34447b) new C34443a.AbstractC34447b() {
                /* class com.ss.android.lark.favorite.common.audio.C37099a.C371012 */

                @Override // com.ss.android.lark.chatbase.view.C34443a.AbstractC34447b
                /* renamed from: a */
                public Message mo127180a() {
                    return favoriteMessageInfo.getSourceMessage();
                }

                @Override // com.ss.android.lark.chatbase.view.C34443a.AbstractC34447b
                /* renamed from: c */
                public int mo127184c() {
                    return viewHolder.getAdapterPosition();
                }

                @Override // com.ss.android.lark.chatbase.view.C34443a.AbstractC34447b
                /* renamed from: d */
                public int mo127185d() {
                    return itemListCommonHolder.f95393b.getItemCount();
                }

                @Override // com.ss.android.lark.chatbase.view.C34443a.AbstractC34447b
                /* renamed from: b */
                public boolean mo127183b() {
                    if (favoriteMessageInfo.getSourceChat() == null || !favoriteMessageInfo.getSourceChat().isSuper()) {
                        return false;
                    }
                    return true;
                }

                @Override // com.ss.android.lark.chatbase.view.C34443a.AbstractC34447b
                /* renamed from: a */
                public Message mo127181a(int i) {
                    return ((FavoriteMessageInfo) itemListCommonHolder.f95393b.getItem(i)).getSourceMessage();
                }

                @Override // com.ss.android.lark.chatbase.view.C34443a.AbstractC34447b
                /* renamed from: a */
                public boolean mo127182a(View view) {
                    return C37122d.m146373a(viewHolder.itemView, itemListCommonHolder, favoriteMessageInfo);
                }
            }, false);
        }
    }
}
