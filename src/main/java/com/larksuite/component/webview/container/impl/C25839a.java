package com.larksuite.component.webview.container.impl;

/* renamed from: com.larksuite.component.webview.container.impl.a */
public class C25839a {

    /* renamed from: a */
    public static String f63928a = "  try {\n            var _lark_currentPlayers = [];\n            let _lark_originPlay = HTMLAudioElement.prototype.play;\n            HTMLAudioElement.prototype.play = function() {\n                if(!_lark_currentPlayers.includes(this)) {\n                    _lark_currentPlayers.push(this);\n                }\n                return _lark_originPlay.call(this);\n            }\n        } catch(e){ }";

    /* renamed from: b */
    public static String f63929b = "  try {\n            for (var i = 0; i < _lark_currentPlayers.length; i++) {\n                (_lark_currentPlayers[i] instanceof HTMLAudioElement)\n                && _lark_currentPlayers[i].pause()\n            }\n        } catch(e){ }";
}
