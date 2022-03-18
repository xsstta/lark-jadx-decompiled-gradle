(function() {
    console.log("try fetchID");
    if(!window.Device) {
        return;
    }

    var CUSTOM_PROTOCOL_ID_SCHEME = 'signin';

    window.Device.getDevice(function(captchaId) {
        if(!captchaId) {
            captchaId = "";
        }

        getMessageIFrame().src = CUSTOM_PROTOCOL_ID_SCHEME + "://secure?captchaid=" + captchaId;
    });
}(this));