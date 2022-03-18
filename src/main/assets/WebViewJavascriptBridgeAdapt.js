//notation: js file can only use this kind of comments
//since comments will cause error when use in webview.loadurl,
//comments will be remove by java use regexp
(function() {
    console.log("try inject jsbridge");
    if (window.LkWebViewJavascriptBridge) {
        return;
    }

    var messagingIframe;
    var sendMessageQueue = [];
    var receiveMessageQueue = [];
    var messageHandlers = {};

    var CUSTOM_PROTOCOL_SCHEME = 'larkbridge';
    var QUEUE_HAS_MESSAGE = '__QUEUE_MESSAGE__/';

    var responseCallbacks = {};
    var uniqueId = 1;
    var oldUniqueId = 1;
    var callbackMapObj = {};

    if (typeof(window.__JSBRIDGE_ENABLE_DATA_FRAGMENTS__) == "undefined") {
        console.log("default disable __JSBRIDGE_ENABLE_DATA_FRAGMENTS__");
        window.__JSBRIDGE_ENABLE_DATA_FRAGMENTS__ = false;
    } else {
        console.log("__JSBRIDGE_ENABLE_DATA_FRAGMENTS__ is " + window.__JSBRIDGE_ENABLE_DATA_FRAGMENTS__);
    }

    if (!(window.LarkWebViewJavaScriptBridge && window.LarkWebViewJavaScriptBridge.nativeCallBack)) {
        window.LarkWebViewJavaScriptBridge = {
            nativeCallBack:  function(res) {
                if (callbackMapObj[res.callbackID]) {
                    callbackMapObj[res.callbackID](res);
                } else if (res.callbackID.indexOf('cb') !== 0 && !/^\d+$/.test(res.callbackID)) {
                    // 当回调Id的前缀不是cb且不是全数字的情况下，又没有在callbackMapObj内进行注册，这时候可以判断是持续回调
                    window.ttJSBridge.subscribeHandler(res.callbackID, res.data);
                }
            }
        }
    }

    /**
     * 延迟创建iframe 对象
     */
    function getMessageIFrame() {
      if(!messagingIframe ) {
        var iframe = document.createElement('iframe');
        iframe.style.display = 'none';
        messagingIframe = document.documentElement.appendChild(iframe);
      }
      return messagingIframe;
    }

    //set default messageHandler
    function init(messageHandler) {
        if (LkWebViewJavascriptBridge._messageHandler) {
            console.log('LkWebViewJavascriptBridge.init called twice');
            return;
        }
        LkWebViewJavascriptBridge._messageHandler = messageHandler;
        var receivedMessages = receiveMessageQueue;
        receiveMessageQueue = null;
        for (var i = 0; i < receivedMessages.length; i++) {
            _dispatchMessageFromNative(receivedMessages[i]);
        }
    }

    function send(data, responseCallback) {
        _doSend({
            data: data
        }, responseCallback);
    }

    function registerHandler(handlerName, handler) {
        messageHandlers[handlerName] = handler;
    }

    function isFunc(param){
        return Object.prototype.toString.call(param) === "[object Function]";
    }

    /**
        向前兼容四个参数，无callbackConfig;
        向后兼容三个参数，去掉successCallback, isKeep两个参数;
        目前五个参数均有赋值，callbackConfig中包含onSuccess,onFailed两个函数和布尔值keep
    **/
    function callHandler(handlerName, data, successCallback, isKeep, callbackConfig) {
        try {
            var nameString = JSON.stringify(handlerName);
            var dataString = JSON.stringify(data);
            console.log("callHandler name:" + nameString);
        } catch (exception) {
            console.log(exception);
        }

        var callbacks;

        console.log("successCallback: " + successCallback + " isKeep: " + isKeep + " callbackConfig: " + callbackConfig);

        if (typeof(callbackConfig) != "undefined") {
            callbacks = callbackConfig;
            if (typeof callbacks.keep === "undefined") {
              callbacks.keep = !!isKeep;
            }
        } else if (typeof(isKeep) != "undefined") {
            callbacks = {onSuccess: successCallback, keep: isKeep};
        } else if (typeof(successCallback) != "undefined") {
            if (isFunc(successCallback)) {
                callbacks = {onSuccess: successCallback, keep: false};
            } else {
                callbacks = callbackConfig;
            }
        } else {
            callbacks = null;
        }

        if (window.Lark_Bridge && window.Lark_Bridge.invokeNative) {
            console.log('go Lark_Bridge!');
            const isTT = typeof data.__v2__ !== 'undefined' && data.__v2__;
            var callbackId = isTT ? `${data.callbackId}` : 'cb_' + (oldUniqueId++) + '_' + new Date().getTime();
            callbackMapObj[callbackId] = ({callbackType, data}) => {
                console.log('callback', callbackId, callbackType);
                if (isTT) {
                    if (callbackType === 'continued') {
                        window.ttJSBridge.subscribeHandler(callbackId, data);
                    } else {
                        window.ttJSBridge.invokeHandler(callbackId, data);
                    }
                    return;
                }
                try {
                    var respData = data;
                    if (data && typeof data === 'string') {
                        respData = JSON.parse(data); 
                    }
                    if (callbackType === 'cancel'){
                        callbacks.onCancel && callbacks.onCancel(respData);
                    } else if (callbackType === 'failure') {
                        callbacks.onFailed && callbacks.onFailed(respData);
                    } else if (callbackType === 'continued'){
                        if (callbacks.onProgress) {
                            callbacks.onProgress(respData);
                        } else {
                            callbacks.onSuccess && callbacks.onSuccess(respData);
                        }
                    } else {
                        callbacks.onSuccess && callbacks.onSuccess(respData);
                    }
                    if (callbackType === 'continued') {
                        // 进度回调是否删除是Native根据参数控制，不需要处理keep
                        if (respData.state === 0) {
                          // 进度调用结束，删除进度回调
                          delete callbacks.onProgress
                        }
                    } else if (!isKeep) {
                        // onSuccess、onFail后删除所有回调
                        delete callbackMapObj[callbackId];
                    }
                } catch (error) {
                    console.error('json parse error');
                }
            };
            const postData = {
                apiName: handlerName,
                data: Object.assign(data, { isOldJSSDK: true }),
                callbackId: callbackId,
            };
            window.Lark_Bridge.invokeNative(JSON.stringify(postData));
            return;
        }

        _doSend({
            handlerName: handlerName,
            data: data
        }, callbacks);
    }

    function call(handlerName) {
        _doSend2({
            handlerName : handlerName
        });
    }

    //sendMessage add message, 触发native处理 sendMessage
    function _doSend(message, responseCallback) {
        if (responseCallback) {
            var callbackId = 'cb_' + (uniqueId++) + '_' + new Date().getTime();
            responseCallbacks[callbackId] = responseCallback;
            message.callbackId = callbackId;
        }

        sendMessageQueue.push(message);
        getMessageIFrame().src = CUSTOM_PROTOCOL_SCHEME + '://' + QUEUE_HAS_MESSAGE;
        if (message) {
             console.log("doSend", message.handlerName);
        }

    }

    //sendMessage add message, 触发native处理 sendMessage
    function _doSend2(message) {
        sendMessageQueue.push(message);
        getMessageIFrame().src = CUSTOM_PROTOCOL_SCHEME + '://' + QUEUE_HAS_MESSAGE;
        if (message) {
            console.log("doSend2", message.handlerName);
        }

    }

    // 提供给native调用,该函数作用:获取sendMessageQueue返回给native,由于android不能直接获取返回的内容,所以使用url shouldOverrideUrlLoading 的方式返回内容
    function _fetchQueue() {
    console.log("fetchqueue");
        var messageQueueString = JSON.stringify(sendMessageQueue);
        if("[]" != messageQueueString) {
            sendMessageQueue = [];

            var segmentLimit = 2000;
            var encodeMessageQueue = encodeURIComponent(messageQueueString);
            if (encodeMessageQueue.length > segmentLimit && window.__JSBRIDGE_ENABLE_DATA_FRAGMENTS__) {
                var start = 0;
                // error result
                var result = -1;
                while (start < encodeMessageQueue.length) {
                    var isEnd = encodeMessageQueue.length - start <= segmentLimit;
                    var end = isEnd ? encodeMessageQueue.length : start + segmentLimit;

                    result = window._large_msg_bridge.send(CUSTOM_PROTOCOL_SCHEME + '://return/_fetchQueueSegment/'
                        + (isEnd ? 'last_one/' : 'not_last/')
                        + encodeMessageQueue.slice(start, end));

                    // 出现异常走原逻辑
                    if (result == -1) {
                        getMessageIFrame().src = CUSTOM_PROTOCOL_SCHEME + '://return/_fetchQueue/' + encodeMessageQueue;
                        break;
                    }
                    start = end;
                }
            } else {
                //android can't read directly the return data, so we can reload iframe src to communicate with java
                getMessageIFrame().src = CUSTOM_PROTOCOL_SCHEME + '://return/_fetchQueue/' + encodeMessageQueue;
            }
        }
    }

    //提供给native使用,
    function _dispatchMessageFromNative(messageJSON) {
        setTimeout(function() {
            var message = JSON.parse(messageJSON);
            var responseCallback;
            //java call finished, now need to call js callback function
            if (message.responseId) {
                responseCallback = responseCallbacks[message.responseId];
                if (!responseCallback) {
                    return;
                }
                // 转换成json object, 如果转换失败，直接传递原始数据，避免每个业务进行数据转换，限制
                var keep = false;
                var isProgress = false;
                try {
                    var respData = JSON.parse(message.responseData);
                    var data = JSON.parse(respData.data);
                    // 新版本callback增加了onSuccess, onFailed, keep三个参数
                    keep = responseCallback.keep;
                    // respData.state 为数字，表示进度回调状态，0表示结束
                    isProgress = typeof respData.state === "number";
                    if (isProgress) {
                      typeof responseCallback.onProgress === "function" && responseCallback.onProgress(data);
                    } else if (respData.success) {
                       responseCallback.onSuccess(data);
                    } else {
                       responseCallback.onFailed(data);
                    }
                } catch (exception) {
                    typeof responseCallback === "function" && responseCallback(message.responseData);
                    console.log("_dispatchMessageFromNative error", exception);
                    keep = false;
                    isProgress = false;
                }

                if (isProgress) {
                  // 进度回调是否删除是Native根据参数控制，不需要处理keep
                  if (respData.state === 0) {
                    // 进度调用结束，删除进度回调
                    delete responseCallback.onProgress
                  }
                } else if (!keep) {
                    // onSuccess、onFail后删除所有回调
                    delete responseCallbacks[message.responseId];
                }
            } else {
                //直接发送
                if (message.callbackId) {
                    var callbackResponseId = message.callbackId;
                    responseCallback = function(responseData) {
                        _doSend({
                            responseId: callbackResponseId,
                            responseData: responseData
                        });
                    };
                }

                var handler = LkWebViewJavascriptBridge._messageHandler;
                if (message.handlerName) {
                    handler = messageHandlers[message.handlerName];
                }
                //查找指定handler
                try {
                    handler(message.data, responseCallback);
                } catch (exception) {
                    if (typeof console != 'undefined') {
                        console.log("LkWebViewJavascriptBridge: WARNING: javascript handler threw.", exception);
                    }
                }
            }
        });
    }

    //提供给native调用,receiveMessageQueue 在会在页面加载完后赋值为null,所以
    function _handleMessageFromNative(messageJSON) {
        var message = JSON.stringify(messageJSON);
        if (receiveMessageQueue && receiveMessageQueue.length > 0) {
            receiveMessageQueue.push(messageJSON);
        } else {
            _dispatchMessageFromNative(messageJSON);
        }
    }

    var LkWebViewJavascriptBridge = window.LkWebViewJavascriptBridge = {
        init: init,
        send: send,
        call: call,
        registerHandler: registerHandler,
        callHandler: callHandler,
        _fetchQueue: _fetchQueue,
        _handleMessageFromNative: _handleMessageFromNative
    };

    console.log("JsBridge Ready!");
    var readyEvent = document.createEvent('Events');
    readyEvent.initEvent('LkWebViewJavascriptBridgeReady');
    readyEvent.bridge = LkWebViewJavascriptBridge;
    document.dispatchEvent(readyEvent);

})();
