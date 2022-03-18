 console.log("try inspect _dispatchNativeEvent");
 if(!LkWebViewJavascriptBridge){
   document.addEventListener('LkWebViewJavascriptBridgeReady', _dispatchNativeEvent(), false);
 }else{
   _dispatchNativeEvent();
 }

 function _dispatchNativeEvent(){
   console.log('inspect _dispatchNativeEvent success');
   LkWebViewJavascriptBridge._dispatchNativeEvent = function(resp){
   console.log(resp);
     if(resp.func){
       var evt = document.createEvent('Events');
       evt.initEvent(resp.func,false,true);
       if(typeof resp.param === 'object'){
         for(var k in resp.param){
           evt[k] = param[k];
         }
       }
       var prevent = !document.dispatchEvent(evt);
       if(resp.clientId && resp.func == "back"){
            LkWebViewJavascriptBridge.callHandler("h5ExtEvent",{
                clientId: resp.clientId,
                prevent: prevent
            },{});
       }
     }
   }
}