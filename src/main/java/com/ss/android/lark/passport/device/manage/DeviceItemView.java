package com.ss.android.lark.passport.device.manage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.utils.UIHelper;

public class DeviceItemView extends RelativeLayout {

    /* renamed from: a */
    public Pair<DevicesStatus.DeviceStatus, Devices.Device> f122941a;

    /* renamed from: b */
    public AbstractC48954a f122942b;

    /* renamed from: c */
    private ImageView f122943c;

    /* renamed from: d */
    private TextView f122944d;

    /* renamed from: e */
    private TextView f122945e;

    /* renamed from: f */
    private TextView f122946f;

    /* renamed from: g */
    private TextView f122947g;

    /* renamed from: h */
    private TextView f122948h;

    /* renamed from: i */
    private String f122949i;

    /* renamed from: j */
    private String f122950j;

    /* renamed from: k */
    private String f122951k;

    /* renamed from: l */
    private final View.OnClickListener f122952l = new View.OnClickListener() {
        /* class com.ss.android.lark.passport.device.manage.DeviceItemView.View$OnClickListenerC489531 */

        public void onClick(View view) {
            if (DeviceItemView.this.f122942b != null) {
                AbstractC48954a aVar = DeviceItemView.this.f122942b;
                DeviceItemView deviceItemView = DeviceItemView.this;
                aVar.mo170965a(deviceItemView, (Devices.Device) deviceItemView.f122941a.second);
            }
        }
    };

    /* renamed from: com.ss.android.lark.passport.device.manage.DeviceItemView$a */
    public interface AbstractC48954a {
        /* renamed from: a */
        void mo170965a(View view, Devices.Device device);
    }

    public void setOnActionListener(AbstractC48954a aVar) {
        this.f122942b = aVar;
    }

    public DeviceItemView(Context context) {
        super(context);
        m192838a(context);
    }

    /* renamed from: a */
    private void m192838a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.device_item, (ViewGroup) this, true);
        this.f122943c = (ImageView) inflate.findViewById(R.id.device_image);
        this.f122944d = (TextView) inflate.findViewById(R.id.device_name);
        this.f122945e = (TextView) inflate.findViewById(R.id.device_system_name);
        this.f122946f = (TextView) inflate.findViewById(R.id.last_login_time);
        this.f122947g = (TextView) inflate.findViewById(R.id.self);
        TextView textView = (TextView) inflate.findViewById(R.id.offline);
        this.f122948h = textView;
        textView.setOnClickListener(this.f122952l);
        this.f122950j = UIUtils.getString(context, R.string.Lark_Legacy_DeviceOnline);
        this.f122951k = UIUtils.getString(context, R.string.Lark_Legacy_DeviceOffline);
        DesktopUtil.m144299a(this.f122944d);
        DesktopUtil.m144299a(this.f122945e);
        if (DesktopUtil.m144301a(getContext())) {
            this.f122948h.setTextSize(12.0f);
            this.f122947g.setTextSize(13.0f);
        }
    }

    public DeviceItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m192838a(context);
    }

    /* renamed from: a */
    public void mo170962a(Pair<DevicesStatus.DeviceStatus, Devices.Device> pair, int i) {
        this.f122941a = pair;
        if (pair != null) {
            Devices.Device device = (Devices.Device) pair.second;
            if (device.getTerminalType() == 1) {
                this.f122943c.setImageResource(R.drawable.device_pc_icon);
            } else if (device.getTerminalType() == 2) {
                this.f122943c.setImageResource(R.drawable.device_web_icon);
            } else {
                this.f122943c.setImageResource(R.drawable.device_phone_icon);
            }
            String deviceName = device.getDeviceName();
            if (TextUtils.isEmpty(deviceName)) {
                if (TextUtils.isEmpty(this.f122949i)) {
                    this.f122949i = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_OldDevice);
                }
                deviceName = this.f122949i;
            }
            this.f122944d.setText(deviceName);
            this.f122945e.setText(UIUtils.getString(getContext(), R.string.Lark_NewSettings_DeviceManagementOS) + device.getDeviceOs());
            String string = UIUtils.getString(getContext(), R.string.Lark_NewSettings_DeviceManagementLastLoginTime);
            if (device.getLoginTime() > 0) {
                string = string + C26279i.m95151a(device.getLoginTime(), "yyyy/MM/dd HH:mm:ss");
            }
            this.f122946f.setText(string);
            if (device.getIsCurrentDevice()) {
                this.f122947g.setVisibility(0);
                this.f122948h.setVisibility(8);
                return;
            }
            this.f122947g.setVisibility(8);
            this.f122948h.setVisibility(0);
        }
    }

    public DeviceItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m192838a(context);
    }
}
