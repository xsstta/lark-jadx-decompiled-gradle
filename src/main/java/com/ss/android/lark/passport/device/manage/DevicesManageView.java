package com.ss.android.lark.passport.device.manage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.device.manage.DeviceItemView;
import com.ss.android.lark.passport.device.manage.IDevicesManageContract;
import com.ss.android.lark.passport.device.service.impl.C48987c;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.List;

public class DevicesManageView implements IDevicesManageContract.AbstractC48964b {

    /* renamed from: a */
    public AbstractC48961a f122954a;

    /* renamed from: b */
    public IDevicesManageContract.AbstractC48964b.AbstractC48965a f122955b;

    /* renamed from: c */
    private Activity f122956c;

    /* renamed from: d */
    private IDeviceManager f122957d = C48987c.m192916a();

    /* renamed from: e */
    private int f122958e;
    @BindView(5963)
    LinearLayout mDeviceContainer;
    @BindView(5967)
    View mDevicesView;
    @BindView(6397)
    ScrollView mScrollView;
    @BindView(6578)
    CommonTitleBar mTitleBar;
    @BindView(6503)
    TextView mTvSubTitle;

    /* renamed from: com.ss.android.lark.passport.device.manage.DevicesManageView$a */
    public interface AbstractC48961a {
        /* renamed from: a */
        void mo170983a();

        /* renamed from: a */
        void mo170984a(DevicesManageView devicesManageView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f122955b = null;
        this.f122954a = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f122954a.mo170984a(this);
        m192852a();
    }

    /* renamed from: a */
    private void m192852a() {
        this.mDevicesView.setVisibility(8);
        boolean a = DesktopUtil.m144301a((Context) this.f122956c);
        int i = R.drawable.titlebar_back_bg_selector;
        if (a) {
            CommonTitleBar commonTitleBar = this.mTitleBar;
            if (this.f122958e == 1) {
                i = R.drawable.titlebar_close_bg_selector;
            }
            commonTitleBar.setLeftImageResource(i);
        } else {
            this.mTitleBar.setLeftImageResource(R.drawable.titlebar_back_bg_selector);
        }
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.passport.device.manage.DevicesManageView.View$OnClickListenerC489551 */

            public void onClick(View view) {
                DevicesManageView.this.f122954a.mo170983a();
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(IDevicesManageContract.AbstractC48964b.AbstractC48965a aVar) {
        this.f122955b = aVar;
    }

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48964b
    /* renamed from: a */
    public void mo170973a(int i) {
        LKUIToast.show(this.f122956c, i);
    }

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48964b
    /* renamed from: a */
    public void mo170974a(View view) {
        LinearLayout linearLayout = this.mDeviceContainer;
        if (linearLayout != null) {
            linearLayout.removeView(view);
        }
    }

    @Override // com.ss.android.lark.passport.device.manage.IDevicesManageContract.AbstractC48964b
    /* renamed from: a */
    public void mo170977a(List<Devices.Device> list, int i) {
        LinearLayout linearLayout = this.mDeviceContainer;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.mTvSubTitle.setText("");
            if (!CollectionUtils.isEmpty(list)) {
                this.mTvSubTitle.setText(UIHelper.mustacheFormat((int) R.string.Lark_Passport_AccountSecurityCenter_ManageService_ManagePageDesc, "TenantName", list.get(0).tenantName));
                for (Devices.Device device : list) {
                    DeviceItemView deviceItemView = new DeviceItemView(this.f122956c);
                    this.mDeviceContainer.addView(deviceItemView);
                    deviceItemView.mo170962a(Pair.create(this.f122957d.mo171022a(device.getDeviceId()), device), i);
                    deviceItemView.setOnActionListener(new DeviceItemView.AbstractC48954a() {
                        /* class com.ss.android.lark.passport.device.manage.DevicesManageView.C489562 */

                        @Override // com.ss.android.lark.passport.device.manage.DeviceItemView.AbstractC48954a
                        /* renamed from: a */
                        public void mo170965a(View view, Devices.Device device) {
                            DevicesManageView.this.mo170975a(view, device);
                        }
                    });
                    this.mDevicesView.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo170975a(final View view, final Devices.Device device) {
        if (device != null) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Passport_AccountSecurityCenter_ManageService_LogOutPopup, "TenantName", device.tenantName);
            if (DesktopUtil.m144301a((Context) this.f122956c)) {
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f122956c).message(mustacheFormat)).width(440.0f)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.passport.device.manage.DevicesManageView.DialogInterface$OnClickListenerC489584 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90706b(R.string.Lark_Legacy_Offline).mo90710d(R.color.function_danger_500).mo90703a(new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.passport.device.manage.DevicesManageView.DialogInterface$OnClickListenerC489573 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        DevicesManageView.this.f122955b.mo170989a(view, device.getDeviceId());
                    }
                }))).show();
                return;
            }
            View inflate = LayoutInflater.from(this.f122956c).inflate(R.layout.device_offline_dialog_layout, (ViewGroup) null);
            final Dialog a = C58339d.m226190a(this.f122956c, inflate);
            if (a != null) {
                ((TextView) inflate.findViewById(R.id.tips)).setText(mustacheFormat);
                View findViewById = inflate.findViewById(R.id.confirm);
                View findViewById2 = inflate.findViewById(R.id.cancel);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.passport.device.manage.DevicesManageView.View$OnClickListenerC489595 */

                    public void onClick(View view) {
                        DevicesManageView.this.f122955b.mo170989a(view, device.getDeviceId());
                        if (a.isShowing()) {
                            a.dismiss();
                        }
                    }
                });
                findViewById2.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.passport.device.manage.DevicesManageView.View$OnClickListenerC489606 */

                    public void onClick(View view) {
                        if (a.isShowing()) {
                            a.dismiss();
                        }
                    }
                });
            }
        }
    }

    public DevicesManageView(AbstractC48961a aVar, Activity activity, int i) {
        this.f122954a = aVar;
        this.f122956c = activity;
        this.f122958e = i;
    }
}
