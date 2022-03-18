package com.ss.android.lark.filedetail.impl.open.audio;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.filedetail.impl.open.C38292b;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;
import com.ss.android.lark.filedetail.impl.open.OpenFileParams;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.p2513c.AbstractC52110k;
import com.ss.android.lark.player.p2513c.AbstractC52111l;
import com.ss.android.lark.player.p2513c.C52120q;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.p2932c.C58333b;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.io.File;

public class PlayAudioFragment extends BaseFragment {

    /* renamed from: a */
    public C52120q f98313a;

    /* renamed from: b */
    public boolean f98314b;

    /* renamed from: c */
    public OpenFileInfo f98315c;

    /* renamed from: d */
    private View f98316d;

    /* renamed from: e */
    private boolean f98317e = true;

    /* renamed from: f */
    private ValueAnimator f98318f;

    /* renamed from: g */
    private String f98319g;

    /* renamed from: h */
    private String f98320h;
    @BindView(7764)
    TextView mAudioDuration;
    @BindView(7773)
    ImageView mAudioPanelIv;
    @BindView(7772)
    ImageView mAudioPlayBtn;
    @BindView(9075)
    CommonTitleBar mCommonTitleBar;
    @BindView(7979)
    TextView mCurrentPlayTime;
    @BindView(8120)
    TextView mFileNameTv;
    @BindView(7776)
    SeekBar mSeekBar;

    /* renamed from: a */
    public void mo140059a(boolean z) {
        this.f98314b = z;
        if (z) {
            this.f98313a.mo178533a();
            this.f98313a.mo178498c(this.mSeekBar.getProgress());
            this.f98313a.mo178541c(true);
            this.mAudioPlayBtn.setImageDrawable(UDIconUtils.getIconDrawable(this.mContext, (int) R.drawable.audio_stop_icon, UIUtils.getColor(this.mContext, R.color.icon_n1)));
            m150689e();
            m150687c();
            return;
        }
        this.f98313a.mo178502f();
        this.f98317e = true;
        this.f98313a.mo178541c(false);
        m150688d();
        this.mAudioPlayBtn.setImageDrawable(UDIconUtils.getIconDrawable(this.mContext, (int) R.drawable.audio_play_icon, UIUtils.getColor(this.mContext, R.color.icon_n1)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f98313a != null && !this.f98317e) {
            mo140059a(true);
        }
    }

    /* renamed from: c */
    private void m150687c() {
        if (this.f98314b || Build.VERSION.SDK_INT < 19) {
            this.f98318f.start();
        } else {
            this.f98318f.resume();
        }
    }

    /* renamed from: d */
    private void m150688d() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f98318f.pause();
        } else {
            this.f98318f.end();
        }
    }

    /* renamed from: e */
    private void m150689e() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus(null, 3, 1);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C52120q qVar = this.f98313a;
        if (qVar != null) {
            qVar.mo178504h();
            this.f98317e = false;
            this.f98313a.mo178505i();
        }
        ValueAnimator valueAnimator = this.f98318f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f98318f.removeAllUpdateListeners();
        }
        super.onDestroyView();
    }

    /* renamed from: b */
    public void mo140060b() {
        this.f98314b = false;
        this.mAudioPlayBtn.setImageDrawable(UDIconUtils.getIconDrawable(this.mContext, (int) R.drawable.audio_play_icon, UIUtils.getColor(this.mContext, R.color.icon_n1)));
        mo140057a(0, this.mSeekBar.getMax());
        m150688d();
        this.f98313a.mo178541c(false);
        this.f98313a.mo178534a(0);
        this.f98313a.mo178502f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C52120q qVar = this.f98313a;
        if (qVar != null && qVar.mo178499c()) {
            this.f98313a.mo178502f();
            this.f98317e = false;
            this.f98313a.mo178541c(false);
            m150688d();
            this.mAudioPlayBtn.setImageDrawable(UDIconUtils.getIconDrawable(this.mContext, (int) R.drawable.audio_play_icon, UIUtils.getColor(this.mContext, R.color.icon_n1)));
        }
    }

    /* renamed from: a */
    public void mo140056a() {
        ValueAnimator valueAnimator = this.f98318f;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        new C25639g(getContext()).mo89248g(R.string.Lark_Legacy_LarkTip).mo89238b(true).mo89254m(R.string.Lark_Legacy_UnsupportedFormatPleaseTryToUseOtherApp).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_OpenInAnotherAppShorthand, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.$$Lambda$PlayAudioFragment$r2xaaw4x_Tb2YpfNccdfMYgKK78 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                PlayAudioFragment.this.m150683a((PlayAudioFragment) dialogInterface, (DialogInterface) i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelOpen, (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    private boolean m150686a(OpenFileInfo openFileInfo) {
        if (openFileInfo.mFileContent == null) {
            return false;
        }
        return new File(openFileInfo.mFileContent.getFilePath()).exists();
    }

    /* renamed from: a */
    private void m150684a(File file) {
        this.f98313a = new C52120q(getContext());
        DataSource dataSource = new DataSource();
        dataSource.setUri(Uri.fromFile(file));
        this.f98313a.mo178491a(dataSource);
        this.f98313a.mo178537a(new AbstractC52110k() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.C382906 */

            @Override // com.ss.android.lark.player.p2513c.AbstractC52110k
            /* renamed from: a */
            public void mo140067a(int i, Bundle bundle) {
                PlayAudioFragment.this.mo140056a();
            }
        });
        this.f98313a.mo178538a(new AbstractC52111l() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.C382917 */

            @Override // com.ss.android.lark.player.p2513c.AbstractC52111l
            /* renamed from: a */
            public void mo140068a(int i, Bundle bundle) {
                switch (i) {
                    case -99019:
                        PlayAudioFragment.this.mo140057a(bundle.getInt("int_arg1"), bundle.getInt("int_arg2"));
                        return;
                    case -99018:
                        int i2 = bundle.getInt("int_arg3");
                        PlayAudioFragment.this.mo140057a(bundle.getInt("int_arg4"), i2);
                        return;
                    case -99017:
                    default:
                        return;
                    case -99016:
                        PlayAudioFragment.this.f98313a.mo178541c(false);
                        PlayAudioFragment.this.mo140060b();
                        return;
                }
            }
        });
        this.f98313a.mo178533a();
        this.f98313a.mo178504h();
    }

    /* renamed from: a */
    private void m150685a(String str) {
        if (!DesktopUtil.m144301a((Context) getActivity())) {
            this.mCommonTitleBar.setTitle(str);
        }
        this.mCommonTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.titlebar_more_bg_selector) {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.C382851 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                PlayAudioFragment playAudioFragment = PlayAudioFragment.this;
                playAudioFragment.mo140058a(view, playAudioFragment.f98315c);
            }
        });
        this.mCommonTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.View$OnClickListenerC382862 */

            public void onClick(View view) {
                PlayAudioFragment.this.finish();
            }
        });
        this.mFileNameTv.setText(str);
        this.mAudioPlayBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.View$OnClickListenerC382873 */

            public void onClick(View view) {
                PlayAudioFragment playAudioFragment = PlayAudioFragment.this;
                playAudioFragment.mo140059a(!playAudioFragment.f98314b);
            }
        });
        this.mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.C382884 */

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (seekBar.getProgress() == seekBar.getMax()) {
                    PlayAudioFragment.this.mo140060b();
                }
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    PlayAudioFragment.this.f98313a.mo178498c(i);
                    PlayAudioFragment.this.mo140057a(i, seekBar.getMax());
                }
            }
        });
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(2000L);
        this.f98318f = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f98318f.setRepeatCount(-1);
        this.f98318f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.filedetail.impl.open.audio.PlayAudioFragment.C382895 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlayAudioFragment.this.mAudioPanelIv.setRotation(valueAnimator.getAnimatedFraction() * 360.0f);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m150683a(DialogInterface dialogInterface, int i) {
        String str;
        Context context = getContext();
        File file = new File(this.f98319g);
        String str2 = this.f98320h;
        if (this.f98315c.mFileContent == null) {
            str = "";
        } else {
            str = this.f98315c.mFileContent.getKey();
        }
        C38303c.m150712a(context, file, str2, str);
        dialogInterface.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f98315c = new OpenFileInfo();
        if (getActivity() != null) {
            if (arguments == null) {
                finish();
                return;
            }
            OpenFileParams openFileParams = (OpenFileParams) arguments.getSerializable("extra.open.params");
            if (openFileParams == null) {
                finish();
                return;
            }
            this.f98315c.mFileContent = openFileParams.getFileContent();
            this.f98315c.mMessageId = openFileParams.getMessageId();
            this.f98315c.mChatId = openFileParams.getChatId();
            this.f98315c.mJumpPosition = openFileParams.getJumpPosition();
            this.f98315c.mIsSecret = openFileParams.isSecret();
            this.f98315c.mMenuFlag = openFileParams.getMenuFlag();
            this.f98315c.threadId = openFileParams.getThreadId();
            this.f98315c.isFromFolderManage = openFileParams.isFromFolderManager();
            if (!m150686a(this.f98315c)) {
                finish();
                return;
            }
            this.f98319g = this.f98315c.mFileContent.getFilePath();
            this.f98320h = this.f98315c.mFileContent.getMime();
            File file = new File(this.f98319g);
            m150685a(file.getName());
            m150684a(file);
        }
    }

    /* renamed from: a */
    public void mo140057a(int i, int i2) {
        this.mAudioDuration.setText(C26279i.m95149a(i2));
        this.mCurrentPlayTime.setText(C26279i.m95149a(i));
        this.mSeekBar.setMax(i2);
        this.mSeekBar.setProgress(i);
    }

    /* renamed from: a */
    public void mo140058a(View view, OpenFileInfo openFileInfo) {
        if (openFileInfo != null && openFileInfo.mFileContent != null) {
            C38292b bVar = new C38292b(this.mContext, openFileInfo);
            if (!DesktopUtil.m144301a(this.mContext)) {
                C58339d.m226195a(this.mContext, bVar.mo140069a());
            } else if (bVar.mo140069a().size() > 1) {
                C58333b.m226183a(this.mContext, view, bVar.mo140069a().subList(0, bVar.mo140069a().size() - 1));
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_open_audio, viewGroup, false);
        this.f98316d = inflate;
        ButterKnife.bind(this, inflate);
        return this.f98316d;
    }
}
